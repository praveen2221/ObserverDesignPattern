package com.blz.sdp;

public class Page {
    public void onDataReceived(String data) {
        System.out.println("Data Received in " + getClass().getSimpleName() + " " + data);
    }
}
