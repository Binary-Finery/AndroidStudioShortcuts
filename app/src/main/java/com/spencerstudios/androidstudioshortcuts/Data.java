package com.spencerstudios.androidstudioshortcuts;


public class Data {

    private String shortcut, windows, mac;


    public Data(String shortcut, String windows, String mac) {
        this.shortcut = shortcut;
        this.windows = windows;
        this.mac = mac;
    }

    public String getShortcut(){
        return shortcut;
    }
    public String getWindows(){
       return windows;
    }
    public String getMac(){
        return mac;
    }

}
