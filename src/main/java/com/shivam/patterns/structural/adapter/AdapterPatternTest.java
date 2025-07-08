package com.shivam.patterns.structural.adapter;

import com.shivam.patterns.structural.adapter.impl.AudioPlayer;

public class AdapterPatternTest {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "a.mp3");
        player.play("mp4", "b.mp4");
        player.play("vlc", "c.vlc");
        player.play("avi", "d.avi");
    }
}
