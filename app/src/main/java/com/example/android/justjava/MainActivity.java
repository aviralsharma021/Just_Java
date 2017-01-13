/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 */
package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int numberOfCoffee = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage = "total amount debited: " + "$" + numberOfCoffee*5 + "\n Thank You for your patronage!";
        displayMessage(priceMessage);
    }

    /**
     * this method will increase the number of order by one
     */
    public void increment(View View) {
        if(numberOfCoffee<10){
            numberOfCoffee++;
        }
        display(numberOfCoffee);
        displayPrice(numberOfCoffee*5);
    }

    /**
     * this method will decrease the number of order by one
     */
    public void decrement(View View) {
        if(numberOfCoffee>0){
            numberOfCoffee--;
        }
        display(numberOfCoffee);
        displayPrice(numberOfCoffee*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$"+ number);
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}