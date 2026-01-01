package Day1;

import java.text.NumberFormat;
import java.util.Arrays;

public class FindMinAndMax {
    public static void main(String[] args){
        double[] itemPrice = {12.0, 15.25, 20.50, 10.45, 35.0, 39.99, 25.0};
        
        double minPrice = itemPrice[0];
        double maxPrice = itemPrice[0];
        
        for(double price : itemPrice){
            if(price > maxPrice){
                maxPrice = price;
            }
            if(price < minPrice){
                minPrice = price;
            }
        }
        // Create the formatter
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // Format Minimum and Maximum Price
        String formattedMin = currency.format(minPrice);
        String formattedMax = currency.format(maxPrice);

        // Format all prices in array
        String[] formattedPrices = new String[itemPrice.length];
        for(int i = 0; i <itemPrice.length; i++){
            formattedPrices[i] = currency.format(itemPrice[i]);
        }

        System.out.println("Prices: " + Arrays.toString(formattedPrices));
        System.out.println("Minimum Price: " + formattedMin);
        System.out.println("Maximum Price: " + formattedMax);
    }
}
