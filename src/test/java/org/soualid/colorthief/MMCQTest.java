package org.soualid.colorthief;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import junit.framework.TestCase;


public class MMCQTest extends TestCase {

	public void testMMCQ() throws IOException {
		BufferedImage img = ImageIO.read(MMCQTest.class.getResourceAsStream("/photo3.jpg"));
		List<int[]> result = MMCQ.compute(img, 10);
		for (int i=0; i<result.size(); i++) {
			int[] is = result.get(i);
			System.out.println(is[0] + ", " + is[1] + ", " + is[2]);
			/*
			 * output is RGB values: 
			 * 214, 217, 215
			 * 203, 123, 131
			 * ...
			 */
		}
	}
}
