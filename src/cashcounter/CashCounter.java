package cashcounter;

public class CashCounter {

    static final int WITHDRAW = 0;
    static final int DEPOSIT = 1;

    private int balance;

    public int getBalance() {
        return balance;
    }

    public CashCounter(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("not enough balance, balance = " + balance);
            return;
        }
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public Person getPerson() {
        int transactionType = (int) (Math.random() * 10) % 2;
        int amount=(int) (Math.random() * 1000) % 100;
        return transactionType == WITHDRAW ? new Person(WITHDRAW, amount) : new Person(DEPOSIT, amount);
    }

    public static void main(String[] args) {
        CashCounter counter = new CashCounter(200);
        MyQueue<Person> queue = new MyQueue<>();
        while (counter.getBalance() > 0) {
            Person person=counter.getPerson();
            queue.enqueue(person);
            if(person.transactionType==WITHDRAW) counter.withdraw(person.amount);
            else counter.deposit(person.amount);
            queue.dequeue();
            System.out.println("balance : " + counter.getBalance());
        }
    }
}
