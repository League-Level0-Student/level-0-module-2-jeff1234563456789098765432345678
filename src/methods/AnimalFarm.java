package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		String r = JOptionPane.showInputDialog("What animal do you want? cow,duck,dog,cat,llama");
		if (r.equals("cow") ) {

playMoo(); 
		
		}
		if (r.equals("duck") ) {
			playQuack();
			
		}
		if (r.equals("dog") ) {

			playWoof(); 
		}
		if (r.equals("cat") ) {

			playmeow(); 
		}
		if (r.equals("llama") ) {

			playllama(); 
		}
		
		
			
			
					
					
		/* 2. Make it so that the user can keep entering new animals. */
		{
			for (int i = 0; i < 10; i++); 
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playmeow() {
		playNoise(meowFile);
	}
	void playllama() {
		playNoise(llamaFile);
	}

	
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
