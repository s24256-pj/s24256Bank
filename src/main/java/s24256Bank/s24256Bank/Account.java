package s24256Bank.s24256Bank;

public class Account {

    private int id;
    private double saldo;
    private String name;
    private String surname;

    public Account(int id,String name,String surname,double saldo){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Konto o id: " + id
                + " klienta imię: " + name
                + " nazwisko: " + surname
                + " posiada kwote w wysokości: " + saldo;
    }
}
