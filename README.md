#Java Color Thief
A port to Java of Lokesh Dhakar "Color Thief" for it to be executed server side on a JEE container or in a J2SE app. See http://lokeshdhakar.com/projects/color-thief/ for more informations and usage example of the javascript version.

##How to use
See test case included in ```org.soualid.colorthief.MMCQTest```. 

Basically :

```java
	BufferedImage img = /* read your image here using Image IO */;
	// Then get the 10 most used colors palette (first being the dominant color of the image)
	List<int[]> result = MMCQ.compute(img, 10); 
```

##How to build
This project use Apache Maven.

##Credits and license

###Author
Simon Oualid (simon.oualid@gmail.com)

###Thanks
* Lokesh Dhakar
* Nick Rabinowitz - For creating quantize.js.