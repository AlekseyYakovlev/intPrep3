import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static List<Integer> find(int maxNumber) {
        List<Integer> sieve = new ArrayList<>();
        List<Integer> found = new ArrayList<>();
        for (int i = 2; i <= maxNumber; i++) sieve.add(i);

        for (int i = 2; i < sieve.size(); i++) {
            Integer num = sieve.remove(0);
            found.add(num);
            for (int i1 = 0; i1 < sieve.size(); i1++) {
                Integer sieveElement = sieve.get(i1);
                if (sieveElement % num == 0) sieve.remove(sieveElement);
            }
        }
        return found;
    }
}
