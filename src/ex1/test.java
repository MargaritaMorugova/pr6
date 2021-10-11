package ex1;

        import ex1.pr6;

        import java.util.ArrayList;
        import java.util.List;

public class test {

    public static void insertionSort(pr6[] arr) {
        for(int i = 1; i < arr.length; i++){
            pr6 currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey].getIdNumber() > currElem.getIdNumber()){
                arr[prevKey+1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currElem;
        }
    }

    public static void main(String[] args) {
        pr6 st[] = new pr6[30];
        List<pr6> stu = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            st[i] = new pr6((int) (Math.random() * 100));
            stu.add(new pr6((int) (Math.random() * 100)));
        }

        insertionSort(st);
        System.out.println("Sorted id:");
        for (pr6 i : st) {
            System.out.println(i);
        }
    }
}