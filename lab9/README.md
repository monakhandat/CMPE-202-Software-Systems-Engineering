# LAB 9 - Java Lambda Design Pattern  
  
# Design Pattern Implemented - Strategy  
  
  In this lab, square and cube of a number is printed on entering the number.  
  ## List of classes-  
  1. StrategyMain- Main function that calls calculation function to calculate square and cube.  
  2. IStrategyPattern- Interface for strategy design pattern with calculation method.  
  3. Square- Class that implements IStrategyPattern with calculaion method to find square of integer.  
  4. Cube- Class that implements IStrategyPattern with calculaion method to find cube of integer.  
  5. StrategyWithLambda- Main function using Lambda expressions that uses IStrategyPattern and not Square and Cube classes.  
  
  ## Comparison of Lambda style and traditional Java implementation  
  Lambda style implementation helps in compact implementation of the same functionality. Using Lambda style, classes Square and Cube are not required- which also saves up space in memory. While this was a project with only four classes, substantial space in memory and computation is saved when implemented on bigger projects i.e., projects with more classes.   
