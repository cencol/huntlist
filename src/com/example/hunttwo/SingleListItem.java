package com.example.hunttwo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
 
public class SingleListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);
         
        TextView txtProduct = (TextView) findViewById(R.id.product_label);
        TextView txtDate = (TextView) findViewById(R.id.ex_date);
         
        Intent i = getIntent();
        String product = i.getStringExtra("product");
        txtProduct.setText(product);
        txtDate.setText("Expired date: 2014/05/22");
    }
}
