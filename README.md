#Leap Simple Example Listener

---

This listener is a simple example of accessing the many values that the Leap Motion API gives access to.
It is a fork from the [Leap Motion github, 'LeapSimple'](https://github.com/leapmotion/leapsimple) java project as an example of setting up a project and using the ```com.leapmotion.leap.Controller``` object.

What differs in the fork is that all Gradle and Android dependencys and functions have been stripped down to a simple listener, easy for somebody who doesn't what they are to understand and read when getting into a Leap Motion Project.

All rights still go to LeapMotion, this is just a modification of the 'sample' they give, modifying it so that I could understand it back when I was starting Java coding.

In order to use this program you must have setup a workspace in your IDE for Leap Motion Projects. Use 'https://developer-archive.leapmotion.com/documentation/java/devguide/Project_Setup.html' as a reference if you need help. The project comes as a set up InteliJ project with the API .jar file inside the /lib/ directory, but you must also have the .jar and .dll files available for your java.libary.path location.

**Please note**: if you are planning on using this you must have the leap motion software installed/calibrated.

The project was built around a Model 'LM-010' Leap Motion Controller, firmware revision '1.7.0', running software version '2.3.1+31549' on a Mac 'OS X 10.11.6' system. Although these constraints in itself will not hinder anybody's usage of this visualisation program, you may have to configure your system with the software version and API version

##How to use ```SampleListner```

```SampleListner``` can easily be instanced and interacted with.

Simply create an instance of the object,

```java
SampleListener listener = new SampleListener();
```

as well as a ```com.leapmotion.leap.Controller``` instance.

```java
Controller controller = new Controller();
```

To 'listen' to a controller object you must add a listner to the object itself. This is done by:

```java
controller.addListener(listener);
```

At the end of the program it is good practice to remove the listener. This doesn't have to happen at the end of the program, just when you are finished using it

```java
controller.removeListener(listener);
```

The program will quit once you press your enter key.

# What content does it display

The program, just like the original, shows just a small part of the information about dimensions, positioning and bone types the sensor of the Leap Motion is seeing.

Example of one 'frame' of data. If you want to see all information you can get from the device look at 
https://developer-archive.leapmotion.com/documentation/java/devguide/Leap_Frames.html#getting-data-from-a-frame
 and 
 https://developer-archive.leapmotion.com/documentation/java/api/Leap_Classes.html

```
Frame id: 430926, timestamp: 16734016377, hands: 1, fingers: 5, tools: 0, gestures 0
  Right hand, id: 21, palm position: (-33.7941, 258.139, 183.404)
  pitch: 64.31458435702497 degrees, roll: -23.40256402115983 degrees, yaw: -29.870302372676683 degrees
  Arm direction: (-0.514401, 0.619814, -0.59264), wrist position: (-14.0572, 216.843, 205.987), elbow position: (115.521, 60.7113, 355.273)
    TYPE_THUMB, id: 210, length: 48.622704mm, width: 18.892523mm
      TYPE_METACARPAL bone, start: (-40.5704, 206.073, 206.413), end: (-40.5704, 206.073, 206.413), direction: (0, 0, 0)
      TYPE_PROXIMAL bone, start: (-40.5704, 206.073, 206.413), end: (-67.2905, 234.206, 180.655), direction: (0.573745, -0.604093, 0.553071)
      TYPE_INTERMEDIATE bone, start: (-67.2905, 234.206, 180.655), end: (-72.9915, 252.61, 155.344), direction: (0.179223, -0.578544, 0.795717)
      TYPE_DISTAL bone, start: (-72.9915, 252.61, 155.344), end: (-74.0343, 264.514, 137.07), direction: (0.0477595, -0.545223, 0.83693)
    TYPE_INDEX, id: 211, length: 54.865295mm, width: 18.046139mm
      TYPE_METACARPAL bone, start: (-32.1359, 224.285, 215.7), end: (-61.1827, 276.631, 182.123), direction: (0.42319, -0.762637, 0.489178)
      TYPE_PROXIMAL bone, start: (-61.1827, 276.631, 182.123), end: (-76.4266, 284.851, 145.976), direction: (0.380313, -0.205096, 0.90183)
      TYPE_INTERMEDIATE bone, start: (-76.4266, 284.851, 145.976), end: (-78.3916, 269.241, 129.822), direction: (0.0871414, 0.692262, 0.716365)
      TYPE_DISTAL bone, start: (-78.3916, 269.241, 129.822), end: (-76.2199, 254.099, 125.339), direction: (-0.136243, 0.949914, 0.28125)
    TYPE_MIDDLE, id: 212, length: 62.514603mm, width: 17.723705mm
      TYPE_METACARPAL bone, start: (-21.9737, 228.676, 212.631), end: (-41.3012, 280.177, 177.831), direction: (0.296931, -0.791202, 0.534632)
      TYPE_PROXIMAL bone, start: (-41.3012, 280.177, 177.831), end: (-60.3354, 289.069, 138.071), direction: (0.423271, -0.197753, 0.884158)
      TYPE_INTERMEDIATE bone, start: (-60.3354, 289.069, 138.071), end: (-66.9614, 269.826, 121.052), direction: (0.249754, 0.725329, 0.641499)
      TYPE_DISTAL bone, start: (-66.9614, 269.826, 121.052), end: (-67.4031, 252.632, 117.654), direction: (0.0251964, 0.980711, 0.193833)
    TYPE_RING, id: 213, length: 60.10946mm, width: 16.865229mm
      TYPE_METACARPAL bone, start: (-11.6108, 230.448, 208.065), end: (-20.4999, 277.404, 174.428), direction: (0.152105, -0.803477, 0.575577)
      TYPE_PROXIMAL bone, start: (-20.4999, 277.404, 174.428), end: (-36.5541, 285.897, 136.909), direction: (0.385136, -0.203743, 0.900088)
      TYPE_INTERMEDIATE bone, start: (-36.5541, 285.897, 136.909), end: (-46.1718, 270.571, 118.454), direction: (0.372131, 0.592984, 0.714065)
      TYPE_DISTAL bone, start: (-46.1718, 270.571, 118.454), end: (-50.3863, 254.881, 112.135), direction: (0.241776, 0.90008, 0.362493)
    TYPE_PINKY, id: 214, length: 47.124702mm, width: 14.981015mm
      TYPE_METACARPAL bone, start: (-1.97991, 226.62, 199.765), end: (-2.37613, 271.06, 168.918), direction: (0.00732406, -0.821479, 0.570192)
      TYPE_PROXIMAL bone, start: (-2.37613, 271.06, 168.918), end: (-18.1927, 270.557, 139.973), direction: (0.479453, 0.0152519, 0.877435)
      TYPE_INTERMEDIATE bone, start: (-18.1927, 270.557, 139.973), end: (-26.1163, 255.362, 133.705), direction: (0.434227, 0.832746, 0.343485)
      TYPE_DISTAL bone, start: (-26.1163, 255.362, 133.705), end: (-29.6839, 239.806, 135.684), direction: (0.221844, 0.967288, -0.123039)

```