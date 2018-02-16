package com.lambda.inter;

import javax.swing.JOptionPane;

public class AnonymousInnerClassTest
{

	public static void main(String[] args)
	{
		TalkingClockk clock = new TalkingClockk();
		clock.start(1000, true);
		
		JOptionPane.showMessageDialog(null, "Zamkn¹æ program?");
		System.exit(0);
	}
}