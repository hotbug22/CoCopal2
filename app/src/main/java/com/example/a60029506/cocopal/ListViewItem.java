package com.example.a60029506.cocopal;

import android.widget.Button;

/**
 * Created by 60029506 on 2017-09-22.
 */

public class ListViewItem {
    private String single_item_name ;
    private String single_item_price ;
    private String single_item_quantity ;
    private Button btn_single_item_del;


    public String getSingle_item_name() {
        return single_item_name;
    }

    public void setSingle_item_name(String single_item_name) {
        this.single_item_name = single_item_name;
    }

    public String getSingle_item_price() {
        return single_item_price;
    }

    public void setSingle_item_price(String single_item_price) {
        this.single_item_price = single_item_price;
    }

    public String getSingle_item_quantity() {
        return single_item_quantity;
    }

    public void setSingle_item_quantity(String single_item_quantity) {
        this.single_item_quantity = single_item_quantity;
    }

    public Button getBtn_single_item_del() {
        return btn_single_item_del;
    }

    public void setBtn_single_item_del(Button btn_single_item_del) {
        this.btn_single_item_del = btn_single_item_del;
    }
}
