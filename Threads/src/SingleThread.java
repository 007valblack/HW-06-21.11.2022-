public class SingleThread extends Thread{
    static long start = System.currentTimeMillis();

    public SingleThread(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        System.out.println("Массив заполнен");
        System.out.println("Время, затраченное на выполнение программы в однопоточном режиме (мс): " + elapsed);
        for (int a: numbers) {
            System.out.print(a + " ");
        }
    }
}