package taxation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxAdvisor {
    List<String> ls = new ArrayList<>();

    public static void calculateTaxes(Taxable t) {
        // ???
    }

    public static void calculateBatchTaxes(Taxable[] ta) {
        for (Taxable t : ta) {
            calculateTaxes(t);
        }
//        ta[0] = new Corporation();
    }

    //
//    public static void calculateBatchTaxes(List<Taxable> lt) {

    // Fancy name "co-variance"
    public static void calculateBatchTaxes(List<? extends Taxable> lt) {
        for (Taxable t : lt) {
            calculateTaxes(t);
        }

//        lt.add(new Corporation());
//        lt.add("Hello");
    }

    // Fancy name: "Contra-variance"
    public static void collectSmallClients(List<? super People> lp) {
//        People p = lp.get(0);
        lp.add(new People());
    }

    public static void main(String[] args) {
        int [] ia = {};
        System.out.println("type of ia is " + ia.getClass().getName());

        Corporation[] ca = {};
        System.out.println("type of ca is " + ca.getClass().getName());

        List<Taxable> lt = new ArrayList<>();
        System.out.println("type of lt is " + lt.getClass().getName());

        lt.add(new People());
        lt.add(new Corporation());

        calculateBatchTaxes(lt);

        People[] pa = {null};
        calculateBatchTaxes(pa);

        List<People> smallClients = new ArrayList<>();
//        List<Taxable> lt2 = smallClients;
        calculateBatchTaxes(smallClients);
        collectSmallClients(smallClients);

        lt.add(0, new Corporation());
        collectSmallClients(lt);

//        List<Friend> lf = Arrays.asList();
//        collectSmallClients(lf);

    }
}
