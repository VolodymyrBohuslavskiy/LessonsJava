package Tasks.Atm;

public class Account {

    private String login, password;
    private int id;
    private double sum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return id == account.id && Double.compare(account.sum, sum) == 0 && (login != null ? login.equals(account.login) : account.login == null) && (password != null ? password.equals(account.password) : account.password == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + id;
        temp = Double.doubleToLongBits(sum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    String getLogin() {
        return login;
    }

    String getPassword() {
        return password;
    }

    double getSum() {
        return sum;
    }

    void setSum(double sum) {
        this.sum = sum;
    }

    Account(String login, String password, int id, double sum) {
        this.login = login;
        this.password = password;
        this.id = id;
        this.sum = sum;
    }





}

