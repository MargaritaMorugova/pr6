package ex1;

public class pr6 {
    private int idNumber;

    //конструктор
    public pr6(int idNumber) {
        this.idNumber = idNumber;
    }

    //геттеры и сеттеры
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return idNumber + " ";
    }
}