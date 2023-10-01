import { useState, useEffect } from 'react';
import { motion } from 'framer-motion';

export default function MyComponent() {
  const boxWidth = 500; // Width of the box
  const boxHeight = 500; // Height of the box
  const svgSize = 100; // Size of the SVG

  // Initial position and direction of the SVG
  const [position, setPosition] = useState({ x: 0, y: 0 });
  const [direction, setDirection] = useState({ x: -1, y: 1 });
 console.log(position,direction)
  // Update the position and direction of the SVG every frame
  useEffect(() => {
    const interval = setInterval(() => {
      let newX = position.x + direction.x;
      let newY = position.y + direction.y;

      // If the SVG hits a wall, reverse its direction
      if (newX < 0 || newX > boxWidth - svgSize) {
        setDirection(prev => ({ ...prev, x: -prev.x }));
      }
      
      if (newY < 0 || newY > boxHeight - svgSize) {
        setDirection(prev => ({ ...prev, y: -prev.y }));
      }

      // Update the position of the SVG
      setPosition(prev => ({ x: prev.x + direction.x, y: prev.y + direction.y }));
    }, 1000 / 60); // 60 frames per second

    return () => clearInterval(interval);
  }, [position, direction]);

  return (
    <div style={{ width: boxWidth, backgroundColor:'green', height: boxHeight, position: 'relative', overflow: 'hidden' }}>
      <motion.svg
        animate={{ x:position.x, y: 500 }}
        transition={{ repeat: Infinity, duration: 2, repeatType: 'reverse', ease: 'linear' }}
        style={{ position: 'absolute', left: position.x, top: position.y , right:position.x, bottom:position.y }}
        height={svgSize}
        width={svgSize}
      >
        <circle cx={svgSize / 2} cy={svgSize / 2} r={svgSize / 2 - 3} stroke="black" strokeWidth="3" fill="red" />
      </motion.svg>
    </div>
  );
}
