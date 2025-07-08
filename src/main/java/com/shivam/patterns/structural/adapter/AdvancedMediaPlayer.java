package com.shivam.patterns.structural.adapter;

// Adaptee (Legacy or Third-Party)

public class AdvancedMediaPlayer {
    public void playVlc(String fileName){
        System.out.println("Playing vlc file: " + fileName);
    }

    public void playMp4(String fileName){
        System.out.println("Playing mp4 file: " + fileName);
    }
}
