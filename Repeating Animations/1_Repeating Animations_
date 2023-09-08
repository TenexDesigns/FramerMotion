YOU CAN REPERAT ANIMATIONS BY USING
    1. Use Reperat
    2. Use array 
    3. use yoyo



1. YOYO


Sure, you can repeat animations in Framer Motion using the yoyo property. The yoyo property tells the animation to reverse its direction after it reaches its end. This can be used to create repeating animations, such as a bouncing ball.

To use the yoyo property, you need to pass an array of values to the x property. The values in the array will be the positions of the element during the animation.
The first value in the array will be the initial position of the element, and the last value in the array will be the final position of the element.



Add the yoyo effect to the animation:
To create a yoyo effect, you can set the yoyo property of the transition prop to Infinity[0].
<motion.div
  animate={{
    x: [0, -20, 20, -20, 0],
  }}
  transition={{
    yoyo: Infinity,
  }}
/>


2. ARRAY

<motion.div
  animate={{
    x: [0, -20, 20, -20, 0],
  }}
/>

For example, the following code will create an animation that bounces a ball between 0 and 20px:

const animation = motion.yoyo(
  {
    x: [0, 20, -20, 20, 0],
    duration: 1000,
  },
);
This animation will start with the ball at position 0px. It will then move to position 20px, then to position -20px, then back to position 20px, and finally back to position 0px. The animation will take 1000 milliseconds to complete.





4. Reperat

You can also use the repeat property to specify the number of times the animation should repeat. The default value for the repeat property is 1. This means that the animation will repeat once. You can set the repeat property to a number greater than 1 to make the animation repeat multiple times.

For example, the following code will create an animation that bounces a ball between 0 and 20px three times:

const animation = motion.yoyo(
  {
    x: [0, 20, -20, 20, 0],
    duration: 1000,
    repeat: 3,
  },
);
This animation will start with the ball at position 0px. It will then move to position 20px, then to position -20px, then back to position 20px, and finally back to position 0px. The animation will repeat this sequence three times. The animation will take 3000 milliseconds to complete.





















