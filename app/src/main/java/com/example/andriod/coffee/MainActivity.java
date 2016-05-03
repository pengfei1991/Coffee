package com.example.andriod.coffee;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        quantity=quantity+1;
        display(quantity);
       // displayPrice(quantity * 5);//这里是DISPLAYPRICE  而不是DISPLAY,这个如果没有就能体现order的功能,如果有,价格就会随着数量变化而变化
    }
    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        quantity=quantity-1;
        display(quantity);
        //displayPrice(quantity*5);//这里是DISPLAYPRICE  而不是DISPLAY
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(quantity);//这个可有可无
        displayPrice(quantity*5);//这里是DISPLAYPRICE  而不是DISPLAY
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}



