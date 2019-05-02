package homework.num7_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Banking{
    private String path = "resources/accounts.txt";
    private String pathDebug = "resources/accountsDebug.txt";
    private Map<String,Account> accounts = new HashMap<>();
    private String name;
    private String password;
    private BigDecimal money;

    @Override
    public String toString() {
        return "Banking{" +
                "accounts=" + accounts +
                '}';
    }

    public void start() throws IOException {
        FileReader reader = new FileReader(path);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()){
            String[] s = scanner.nextLine().split(" ");
            name = s[0];
            password = s[1];
            money = new BigDecimal(s[2]);
            accounts.put(name,new Account(name,password,money));
        }
        scanner.close();
        reader.close();
    }

    public boolean checkPass(String name, String password) {
        if (accounts.get(name).getPassword().equals(password))
            return true;
        else
            return false;
    }

    public boolean checkName(String name){
        if(accounts.containsKey(name)){
            return true;
        } else return false;
    }

    public boolean checkMoney(String name, BigDecimal money){
        if (accounts.get(name).getMoney().subtract(money).signum()==-1){
            accounts.get(name).getMoney().add(money);
            return false;
        }   else return true;
    }

    public void deposit(String name, BigDecimal money){
        accounts.get(name).setMoney(accounts.get(name).getMoney().add(money));
    }

    public void withdraw(String name, BigDecimal money){
        accounts.get(name).setMoney(accounts.get(name).getMoney().subtract(money));
    }

    public String accInfo(String name){
        return (accounts.get(name).getMoney().toString());
    }

    public void endWork() throws IOException{
        FileWriter writer = new FileWriter(pathDebug);
        String separator = System.getProperty("line.separator");

        for (Map.Entry entry:accounts.entrySet()
             ) {
            writer.write(entry.getValue().toString()+separator);
        }

        writer.flush();
        writer.close();
    }

}
