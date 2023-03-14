package cashcounter;

public class Person implements Comparable<Person> {

    int transactionType;
    int amount;

    public Person(int transactionType, int amount){
        this.transactionType=transactionType;
        this.amount=amount;
    }

    @Override
    public int compareTo(Person o) {
        return this.amount-o.amount;
    }
}
