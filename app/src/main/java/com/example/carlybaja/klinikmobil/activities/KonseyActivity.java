package com.example.carlybaja.klinikmobil.activities;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

import com.example.carlybaja.klinikmobil.R;

public class KonseyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsey);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onByenManje(View v){
        displayPopUp(v);
    }

    public void onDanje(View v){
        displayPopUpDanj(v);
    }

    public void onReteAnSante(View v){
        displayPopUpSante(v);
    }

    public void onPaFimen(View v){
        displayPopUpFimen(v);
    }
    //popup bien manje
    private void displayPopUp(View anchorView) {
        PopupWindow popup = new PopupWindow(KonseyActivity.this);
        View layout = getLayoutInflater().inflate(R.layout.popup_content, null);
        popup.setContentView(layout);
// Set content width and height
        popup.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popup.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
// Closes the popup window when touch outside of it - when looses focus
        popup.setOutsideTouchable(true);
        popup.setFocusable(true);
// Show anchored to button
        popup.setBackgroundDrawable(new BitmapDrawable());
        popup.showAsDropDown(anchorView);
    }

    //popup danje
    private void displayPopUpDanj(View anchorView) {
        PopupWindow popup = new PopupWindow(KonseyActivity.this);
        View layout = getLayoutInflater().inflate(R.layout.popup_content_danje, null);
        popup.setContentView(layout);
// Set content width and height
        popup.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popup.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
// Closes the popup window when touch outside of it - when looses focus
        popup.setOutsideTouchable(true);
        popup.setFocusable(true);
// Show anchored to button
        popup.setBackgroundDrawable(new BitmapDrawable());
        popup.showAsDropDown(anchorView);
    }

    //popup sante
    private void displayPopUpSante(View anchorView) {
        PopupWindow popup = new PopupWindow(KonseyActivity.this);
        View layout = getLayoutInflater().inflate(R.layout.popup_sante, null);
        popup.setContentView(layout);
// Set content width and height
        popup.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popup.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
// Closes the popup window when touch outside of it - when looses focus
        popup.setOutsideTouchable(true);
        popup.setFocusable(true);
// Show anchored to button
        popup.setBackgroundDrawable(new BitmapDrawable());
        popup.showAsDropDown(anchorView);
    }

    //popup fimen
    private void displayPopUpFimen(View anchorView) {
        PopupWindow popup = new PopupWindow(KonseyActivity.this);
        View layout = getLayoutInflater().inflate(R.layout.popup_bagay_pouw_pafe, null);
        popup.setContentView(layout);
// Set content width and height
        popup.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popup.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
// Closes the popup window when touch outside of it - when looses focus
        popup.setOutsideTouchable(true);
        popup.setFocusable(true);
// Show anchored to button
        popup.setBackgroundDrawable(new BitmapDrawable());
        popup.showAsDropDown(anchorView, 0, 35);
    }

}
