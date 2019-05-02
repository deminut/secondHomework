package homework.num7_1;

import java.math.BigDecimal;
import java.util.Objects;

class Account extends Banking{
    private String name;
    private String password;
    private BigDecimal money;

    public Account(String name, String password, BigDecimal money) {
        this.name = name;
        this.password = password;
        this.money = money;
    }

    public String getPassword() {
        return password;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " " + password + " " + money;
    }
}
