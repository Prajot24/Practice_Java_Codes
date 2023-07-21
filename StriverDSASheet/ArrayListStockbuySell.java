package StriverDSASheet;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStockbuySell {
    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(17);
        prices.add(20);
        prices.add(11);
        prices.add(8);
        prices.add(9);

        System.out.println(prices);

        ArrayList<Integer> aux = new ArrayList<>();
        int max=0, profit=0, maxprofit =0;

        for (int i = prices.size()-1; i >=0 ; i--) {
            if(max<prices.get(i)){
                max=prices.get(i);
                aux.add(max);
            }else{
                aux.add(max);
            }
        }

        System.out.println(aux);
        Collections.reverse(aux);

        for (int i = 0; i <aux.size(); i++) {
            profit=aux.get(i)-prices.get(i);
            if(profit>maxprofit){
                maxprofit = profit;
            }
        }
        System.out.println(maxprofit);
    }
}
