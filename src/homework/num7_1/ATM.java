package homework.num7_1;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class ATM {
    private Banking banking = new Banking();
    private String name;
    private String password;

    public void startATM() throws IOException {
        banking.start();
        System.out.println(banking);
        System.out.println();
        menu();
        banking.endWork();
    }

    private boolean login()  throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Пожалуйста введите имя");
            name = scanner.next();
            if (!banking.checkName(name)) {
                System.out.println("Имя не верно, желаете повторить попытку? Y/N");
                if (!scanner.next().equalsIgnoreCase("Y"))
                    continue;
                else banking.endWork();
            } else {
                System.out.println("Пожалуйста введите свой пароль");
                password = scanner.next();
                if (banking.checkPass(name, password)) {
                    break;
                } else {
                    System.out.println("Введенный пароль неверен, желаете повторить попытку? Y/N");
                    if (!scanner.next().equalsIgnoreCase("Y"))
                        break;
                    else banking.endWork();
                }
            }
        }
        return true;
    }

    public void menu() throws IOException{
    if (login()) {
        boolean end = true;
        while (end) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Обновление...");

            System.out.println("Выберите операцию");
            System.out.println("1. Посмотреть остаток на счете");
            System.out.println("2. Внести деньги");
            System.out.println("3. Снять деньги");
            System.out.println("4. Перевести деньги");
            System.out.println("5. Выход");

            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("Ваш счет составляет " + banking.accInfo(this.name)+"руб");
                    break;
                case "2":
                    System.out.println("Внесение средств на счет...");
                    System.out.println("Введите требуемую сумму...");
                    BigDecimal dec = scanner.nextBigDecimal();
                    banking.deposit(this.name,dec);
                    break;
                case "3":
                    System.out.println("Снятие средств со счета...");
                    System.out.println("Введите требуемую сумму...");
                    BigDecimal with = scanner.nextBigDecimal();
                    if (banking.checkMoney(this.name,with))
                        banking.withdraw(this.name,with);
                    else System.out.println("На счете недостаточно средств");
                    break;
                case "4":
                    System.out.println("Перевод на другой счет...");
                    System.out.println("Введите требуемую сумму...");
                    BigDecimal trans = scanner.nextBigDecimal();
                    if (!banking.checkMoney(this.name,trans)) {
                        System.out.println("На счете недостаточно средств");
                        break;
                    } else {
                        System.out.println("Введите имя акканта, куда следует перевевести средства: ");
                        Scanner scanner1 = new Scanner(System.in);
                        String name2 = scanner1.nextLine();
                        if (!banking.checkName(name2)){
                            System.out.println("Неправильно набрано название аккаунта " + name2);
                            break;
                        } else {
                             banking.deposit(name2,trans);
                             banking.withdraw(this.name,trans);
                            break;
                        }
                    }

                case "5":end=false;
                            break;
            }
        }
    }
    }

}

