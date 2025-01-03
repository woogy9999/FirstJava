package com.sist.user;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Commons { // 이미지를 축소하거나 확대할때 사용
	public static Image getImage(ImageIcon icon, int width, int height) {
		
		
		Image img=icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
		return img;
		
	}
}
