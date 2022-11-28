
public class Main {
    public static void main(String[] args) {
Candidate candidate1 = new Candidate("Tom", "Bob", "Alf", "Ben", "Vin");
Candidate candidate2 = new Candidate("Emma", "Clar", "Kate", "Luis", "Beth");
Candidate candidate3 = new Candidate("Jerry", "Gerry", "Mary", "Cherry", "Winny");
Candidate candidate4 = new Candidate("Eva", "Adam", "Moisey", "Kain", "David");
Candidate candidate5 = new Candidate("Mike", "Jack", "Jam", "Lucky", "Jenis");

        System.out.println("Запуск потоков: ");
        candidate1.start();
        candidate2.start();
        candidate3.start();
        candidate4.start();
        candidate5.start();

        int[] numbers = new int[10000];
        System.out.println("Запуск многопоточного метода");
        MultiThread multiThread = new MultiThread(numbers);
        multiThread.start();
        System.out.println(numbers.toString());

        System.out.println("Запуск однопоточного метода");
        //SingleThread.SingleThread(numbers);
        System.out.println(numbers.toString());

        Incrementer incrementer = new Incrementer();
        incrementer.setNumb(1);
        incrementer.setIncrement(3000);
        System.out.println("Запуск потоков");
        incrementer.start();

    }
}
