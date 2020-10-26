package Agregation;

public class Customer {
    private  int id;
    private static int id_global=0;
    private String secondName;
    private String name;
    private String middleName;
    private int creditCard;
    private int bank;

    public Customer(String secondName, String name, String middleName, int creditCard, int bank) {
        this.id=id_global++;
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
        this.creditCard = creditCard;
        this.bank = bank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Покупатель:\n " +
                "Id: "+ id+'\n'+
                "Фамилия: " + secondName + '\n' +
                "Имя: " + name + '\n' +
                "Отчество: " + middleName + '\n' +
                "Номер кредитной карточки: " + creditCard + '\n'+
                "Номер банковского счета: " + bank;
    }
}
