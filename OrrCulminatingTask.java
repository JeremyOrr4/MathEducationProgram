/**
 * Jeremy Orr
 * Cuminating Task, this is a math based program that goes over concepts from different levels of math.
 * Started May 11, 2020 
 */

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OrrCulminatingTask 
{
  
  
  public static void main(String[] args) 
  { 
    String Beginner, Average, Expert;
    String userInput;
    
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to a Math Game!");
    
    while (true)
    {
      System.out.println("What level of math are you. Please enter Beginner, Average, or Expert");
      System.out.println("If you want to quit enter quit.");
      userInput = input.nextLine();
      
      
      if (userInput.equalsIgnoreCase("Beginner"))
      {
        Beginner(); 
      }
      
      else if (userInput.equalsIgnoreCase("Average"))
      {
        Average();
      }
      
      else if (userInput.equalsIgnoreCase("Expert"))
      {
        Expert();
      }
      
      else if (userInput.equalsIgnoreCase("Star Wars"))
      {
        StarWars();
      }
      
      else if (userInput.equalsIgnoreCase("Quit"))
      {
        System.out.println("Goodbye.");
        break;
      }
      
      else
      {
        System.out.println("Please enter a choice Beginner, Average or Expert.");
      }
    }
    input.close();
  }
  
  // Easter Egg/String Manipulation
  
  public static void StarWars() // THIS IS MY STRING MANIPULATION
  {
    Scanner input = new Scanner(System.in);
    
    String userName;
    String names = " ";
    int count;
    int spaces = 0;
    
    
    System.out.println("Hi! Welcome to the easter egg!");
    
    while(true)
    {
      System.out.println("How many names will you like to enter? Please don't exceed 10.");
      
      try 
      {
        count = input.nextInt();
        if (count <=10)
        {
          break;
        }
      }
      
      catch (Exception e)
      {
        System.out.println("Not a vaild number");  
      } 
      
      finally
      {
        input.nextLine(); 
      }
    }
    
    if (count > 0)
    { 
      for (int i = 0; i < count; i++)
      {
        System.out.println("Please enter a name with no spaces.");
        userName = input.nextLine();
        
        if (names.equals(" "))
        {
          names = userName + " ";
        }
        
        else
        {
          names = names + userName + " ";
        }
      }
      
      int start = 0;
      int end = names.indexOf(" ");
      
      
      for (int i = 0; i < names.length(); i++)
      {
        
        String sub = names.substring(i, i + 1);
        
        if (sub.compareTo(" ") == 0)
        {
          spaces++; 
        }
      }
      
      if (spaces == count)
      { 
        for (int i = 1; i <= count; i++)
        {
          System.out.println("Welcome Darth " + names.substring(start, end) + "!");
          
          start = end + 1;
          end = names.indexOf(" " , end + 1);
        }
      }
      
      else
      {
        System.out.println("Please no spaces.");
        
      }
    }
    
    else
    {
      System.out.println("See ya"); 
    }
  }
  
  
  // Beginner 
  
  public static void Beginner ()
  {
    Scanner input = new Scanner(System.in);
    
    String playType;
    
    System.out.println("Hi! Welcome to a beginner level math game!");
    while(true)
    {
      System.out.println("What area of math would you like to work on? Please enter Adding, Subtracting or Ratios");
      playType = input.nextLine();
      
      
      if (playType.equalsIgnoreCase("Adding"))
      {
        BegAdding();
        break;
      }
      
      else if (playType.equalsIgnoreCase("Subtracting"))
      {
        BegSubtracting();
        break;
      }
      
      else if (playType.equalsIgnoreCase("Ratios"))
      {
        BegRatios();
        break;
      }
      
      else
      {
        System.out.println("Please enter a subject.");
      }
    }
  }
  
  // Beginner Adding
  
  public static void BegAdding ()
  {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    String playType, subgroup, tutorial;
    int num1, num2, answer;
    int practice;
    
    System.out.println("Hi! Welcome to Adding");
    System.out.println("Would you like a tutorial? Please enter yes or no.");
    tutorial = input.nextLine();
    
    if (tutorial.equalsIgnoreCase("yes"))
    {
      AddTutorial();
    }
    else
    {
      System.out.println("Ok, will now practice adding!");
      System.out.println(" ");     
    }
    
    while (true)
    {
      while(true)
      {
        System.out.println("How many times would you like to practice?");
        
        try 
        {
          practice = input.nextInt();
          break;
        }
        
        catch (Exception e)
        {
          System.out.println("Not a vaild number");  
        } 
        
        finally
        {
          input.nextLine(); 
        }
      }
      
      if (practice >= 0 && practice < 15)
      {
        for (int i = 1; i <= practice; i++)
        {
          System.out.println("You will be given random adding questions. You will have to solve them.");
          
          num1 = random.nextInt(26);
          num2 = random.nextInt(26);
          
          int sum = num1 + num2;
          
          while(true)
          {
            System.out.println("what is " + num1 + " + " + num2 + " =  ?");
            
            try 
            {
              answer = input.nextInt();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }   
            
            finally
            {
              input.nextLine(); 
            }
          } 
          
          
          if (sum == answer)
          {
            System.out.println("You got it right!");
            
          }
          
          else
          {
            System.out.println("You got it wrong. Keep on practicing!");
          }
        }
        break;
      }
      
      else
      {
        System.out.println("Please enter a number above 0 or less then 16");    
      }
    }
  }
  
  
  
  // Beginner subtraction
  
  
  public static void BegSubtracting ()
  {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    String playType, subgroup, tutorial;
    int num1, num2, answer;
    int practice;
    
    System.out.println("Hi! Welcome to Subtraction");
    System.out.println("Would you like a tutorial? Please enter yes or no.");
    tutorial = input.nextLine();
    
    if (tutorial.equalsIgnoreCase("yes"))
    {
      SubTutorial();
    }
    else
    {
      System.out.println("Ok, we will now practice Subtraction!");
      System.out.println(" ");
    }
    while (true)
    {
      while(true)
      {
        System.out.println("How many times would you like to practice?");
        
        try 
        {
          practice = input.nextInt();
          break;
        }
        
        catch (Exception e)
        {
          System.out.println("Not a vaild number");  
        }   
        
        finally
        {
          input.nextLine(); 
        }
      }
      
      if (practice >= 0 && practice < 15)
      {
        for (int i = 1; i <= practice; i++)
        {
          
          System.out.println("You will be given random Subtraction questions. You will have to solve them.");
          
          num1 = random.nextInt(26);
          num2 = random.nextInt(26);
          
          int sub = num1 - num2;
          
          while(true)
          {
            System.out.println("what is " + num1 + " - " + num2 + " =  ?");
            
            try 
            {
              answer = input.nextInt();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }   
            
            finally
            {
              input.nextLine(); 
            }
          }
          
          if (sub == answer)
          {
            System.out.println("You got it right!");
          }
          
          else
          {
            System.out.println("You got it wrong. Keep on practicing!");
          }
        }
        break;
      }
      else
      {
        System.out.println("Please enter a number above 0 or less then 16");    
      }
    }
  }
  
  
  // Beginnner Ratios
  
  
  public static void BegRatios()
  {
    String tutorial;
    int practice;
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    System.out.println("Hi! Welcome to Ratios");
    System.out.println("Would you like a tutorial? PLease enter yes or no.");
    tutorial = input.nextLine();
    
    if (tutorial.equalsIgnoreCase("yes"))
    {
      RatioTutorial();
    }
    else
    {
      System.out.println("Ok, will now practice Ratios!");
      System.out.println(" ");
    }
    
    while (true)
    {
      while(true)
      {
        System.out.println("How many times would you like to practice?");
        
        try 
        {
          practice = input.nextInt();
          break;
        }
        
        catch (Exception e)
        {
          System.out.println("Not a vaild number");  
        }    
        
        finally
        {
          input.nextLine(); 
        }
      }
      
      if (practice >= 0 && practice < 15)
      {
        for (int i = 1; i <= practice; i++)
        {
          System.out.println("You will be comparing raitos. You must solve for x.");
          
          int base, num1 = 50, answer;
          
          base = (random.nextInt(5)+1) * 5;
          
          System.out.println("The ratio is " + base + ":" + "25");          
          
          while(true)
          {
            System.out.println("Using the ratio above, please find x when, x:" + num1);     
            
            try 
            {
              answer = input.nextInt();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }   
            
            finally
            {
              input.nextLine(); 
            }
          } 
          
          if (answer == base * 2)
          {
            System.out.println("You got it right!");
          }
          
          else 
          {
            System.out.println("You got it wrong, Try again!");
          }
        }
        break;
      }
      else
      {
        System.out.println("Please enter a number above 0 or less then 16");    
      }
    }
  }
  
  
  
  public static void AddTutorial ()
  {
    String line;
    
    try 
    {
      FileReader reader = new FileReader("AddingTutorial.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);
      
      while ((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(line);
      }
      reader.close();
    } 
    catch (Exception e) 
    {
      e.printStackTrace(); // Print what went wrong
    }
    
    System.out.println("done");
  }
  
  public static void SubTutorial ()
  {
    String line;
    
    try 
    {
      FileReader reader = new FileReader("SubtractingTutorial.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);
      
      while ((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(line);
      }
      reader.close();
    } 
    catch (Exception e) 
    {
      e.printStackTrace(); // Print what went wrong
    }
    
    System.out.println("done");
  }
  
  public static void RatioTutorial ()
  {
    String line;
    
    try 
    {
      FileReader reader = new FileReader("RatiosTutorial.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);
      
      while ((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(line);
      }
      reader.close();
    } 
    catch (Exception e) 
    {
      e.printStackTrace(); // Print what went wrong
    }
    
    System.out.println("done");
  }
  
  
  //Average code
  
  
  public static void Average()
  {
    Scanner input = new Scanner(System.in);
    
    String playType;
    
    System.out.println("Hi! Welcome to the average level of the math game!");
    while(true)
    {
      System.out.println("What area of math would you like to work on? Please enter Length Of Line, Mid Point");
      playType = input.nextLine();
      
      if (playType.equalsIgnoreCase("Length Of Line"))
      {
        AvLength();
        break;
      }
      
      else if (playType.equalsIgnoreCase("Mid point"))
      {
        AvMid();
        break;
      }
      
      else
      {
        System.out.println("Please enter a subject.");
        System.out.println("Check your spelling!");
      }
    }
  }
  
  
  // Average Length of Line
  
  
  public static void AvLength ()
  {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    String tutorial;
    double dLength, userLength;
    int x, y;
    int x2, y2;
    int practice;
    
    System.out.println("Welcome to finding the length of a line."); 
    System.out.println("Would you like a turotial. Yes or no");
    tutorial = input.nextLine();
    
    if (tutorial.equalsIgnoreCase("Yes"))
    {
      MidLength();
    }
    
    else
    {
      System.out.println("Ok, lets start practicing.");        
    }
    
    while(true)
    {
      while(true)
      {
        System.out.println("How many times would you like to practice?");
        
        try 
        {
          practice = input.nextInt();
          break;
        }
        
        catch (Exception e)
        {
          System.out.println("Not a vaild number");  
        }  
        
        finally
        {
          input.nextLine(); 
        }
      }
      
      if (practice >= 0 && practice < 15)
      {
        
        for (int i = 1; i <= practice; i++)
        {
          x = random.nextInt(31) - 15;  
          y = random.nextInt(31) - 15;
          
          x2 = random.nextInt(31) - 15;  
          y2 = random.nextInt(31) - 15;
          
          while(true)
          {
            System.out.println("Length of points,(" + x + "," + y + ")and (" + x2 + "," + y2 + ")? Please Drop the decimals for final answer!");
            
            try 
            {
              userLength = input.nextDouble();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }   
            
            finally
            {
              input.nextLine(); 
            }
          } 
          
          dLength = (((x2-x)*(x2-x)) + ((y2-y)*(y2-y)));
          dLength = Math.sqrt(dLength);
          
          int length = (int)dLength;
          
          if (length == userLength)
          {
            System.out.println("You got it right!");         
          }
          
          else 
          {
            System.out.println("You got it wrong, remeber to round.");          
          }
        }
        break;
      }
      else
      {
        System.out.println("Please enter a number above 0 or less then 16");    
      }
    }
  }
  
  
  // Average Mid point
  
  
  public static void AvMid ()
  {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    int practice;
    String tutorial;
    
    System.out.println("Welcome to finding the midpoint."); 
    System.out.println("Would you like a turotial. Yes or no");
    tutorial = input.nextLine();
    
    if (tutorial.equalsIgnoreCase("Yes"))
    {
      MidTutorial();
    }
    
    else
    {
      System.out.println("Ok, lets start practicing.");        
    }
    
    double answerX, answerY;
    
    while(true)
    {
      while(true)
      {
        System.out.println("How many times would you like to practice?");
        
        try 
        {
          practice = input.nextInt();
          break;
        }
        
        catch (Exception e)
        {
          System.out.println("Not a vaild number");  
        }  
        
        finally
        {
          input.nextLine(); 
        }
      }
      
      if (practice >= 0 && practice < 15)
      {
        for (int i = 1; i <= practice; i++)
        {
          double xnum1 = random.nextInt(15) + 1;
          double ynum1 = random.nextInt(15) + 1;
          
          double xnum2 = random.nextInt(15) + 1;
          double ynum2 = random.nextInt(15) + 1;
          
          Double midx = (xnum1 + xnum2)/2;
          Double midy = (ynum1 + ynum2)/2;
          
          System.out.println("The first point (" + xnum1 + "," + ynum1 + ")");
          System.out.println("The Second point (" + xnum2 + "," + ynum2 + ")");
          System.out.println(" ");
          
          while(true)
          {
            System.out.println("What is the x component of the mid point?");
            
            try 
            {
              answerX = input.nextDouble();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }   
            
            finally
            {
              input.nextLine(); 
            }
          } 
          
          while(true)
          {
            System.out.println("What is the y component of the mid point?");
            
            try 
            {
              answerY = input.nextDouble();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }   
            
            finally
            {
              input.nextLine(); 
            }
          } 
          
          if (answerX == midx && answerY == midy)
          {
            System.out.println("You got it right.");
          }
          
          else 
          {
            System.out.println("You got it wrong.");    
          }
          
        }
        break;
      }
      else
      {
        System.out.println("Please enter a number above 0 or less then 16");    
      }
    }
  }
  
  // Tutorials
  
  public static void MidLength()
  { 
    String line;
    
    try 
    {
      FileReader reader = new FileReader("LengthOfLineTutorial.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);
      
      while ((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(line);
      }
      reader.close();
    } 
    catch (Exception e) 
    {
      e.printStackTrace(); // Print what went wrong
    }
    
    System.out.println("done");
  }
  
  
  public static void MidTutorial()
  {
    String line;
    
    try 
    {
      FileReader reader = new FileReader("MidPointTutorial.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);
      
      while ((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(line);
      }
      reader.close();
    } 
    catch (Exception e) 
    {
      e.printStackTrace(); // Print what went wrong
    }
    
    System.out.println("done");
  }
  
  
  // End of average
  
  
  public static void Expert ()
  {
    Scanner input = new Scanner(System.in);
    
    String playType;
    
    System.out.println("Hi! Welcome to the Expert level of the math game!");
    while(true)
    {
      System.out.println("What area of math would you like to work on? Please enter Adding vecotors or Dot Product?");
      playType = input.nextLine();
      
      
      if (playType.equalsIgnoreCase("Adding vectors"))
      {
        ExVectors();
        break;
      }
      
      else if (playType.equalsIgnoreCase("Dot Product"))
      {
        ExDotProduct();
        break;
      }
      
      else
      {
        System.out.println("Please enter a subject.");
        System.out.println("Check your spelling!");
      }
      
    }
  }
  
  public static void ExVectors()
  {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    int practice;
    String tutorial;
    int num1, num2;
    int answerX, answerY, answerZ;
    int inputX, inputY, inputZ;
    
    System.out.println("Welcome to adding vecotors.");
    System.out.println("Would you like a tutorial?");    
    tutorial = input.nextLine();
    
    if (tutorial.equalsIgnoreCase("Yes"))
    {
      TutorialAddingVectors ();
    }
    
    else
    {
      System.out.println("Lets begin practicing!");    
    }
    
    int[] vector1 = new int[3];
    int[] vector2 = new int[3];
    
    while (true)
    {
      while(true)
      {
        System.out.println("How many times would you like to practice?");
        
        try 
        {
          practice = input.nextInt();
          break;
        }
        
        catch (Exception e)
        {
          System.out.println("Not a vaild number");  
        }  
        
        finally
        {
          input.nextLine(); 
        }
      }
      
      if (practice >= 0 && practice < 15)
      {
        
        for (int j = 1; j <= practice; j++)
        {
          for (int i = 0; i < vector1.length; i++)
          {
            num1 = random.nextInt(11) -5; 
            num2 = random.nextInt(11) -5; 
            
            vector1 [i] = num1;
            vector2 [i] = num2;  
          }
          
          System.out.println("Your first vector is ");
          
          for(int i = 0; i < vector1.length; i++)
          {
            System.out.print(vector1[i]+" ");     // Using a for loop, you can print the array.
          }
          System.out.println();
          
          
          System.out.println("Your second vector is ");
          
          for(int i = 0; i < vector2.length; i++)
          {
            System.out.print(vector2[i]+" ");     // Using a for loop, you can print the array.
          }
          System.out.println();
          
          answerX = vector1[0] + vector2[0];
          answerY = vector1[1] + vector2[1];
          answerZ = vector1[2] + vector2[2];
          
          System.out.println("Please enter your answer, please type the x,y,z components when prompted!");
          
          while(true)
          {
            System.out.println("What is the x component?");
            
            try 
            {
              inputX = input.nextInt();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }   
            
            finally
            {
              input.nextLine(); 
            }
          }
          
          while(true)
          {
            System.out.println("What is the y component?");
            
            try 
            {
              inputY = input.nextInt();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }  
            
            finally
            {
              input.nextLine(); 
            }
          }
          
          while(true)
          {
            System.out.println("What is the Z component?");
            
            try 
            {
              inputZ = input.nextInt();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }    
            
            finally
            {
              input.nextLine(); 
            }
          }
          
          if (inputX == answerX && inputY == answerY && inputZ == answerZ)
          {
            System.out.println("You got it correct!");
          }
          
          else
          {
            System.out.println("Wrong, please try again."); 
          }
        }
        break;
      }
      else
      {
        System.out.println("Please enter a number above 0 or less then 16");    
      }
    }
  }
  
  
  public static void ExDotProduct()
  {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    int practice;
    String tutorial;
    int num1, num2;
    int answerX, answerY, answerZ, answer,userAnswer;
    int inputX, inputY, inputZ;
    
    System.out.println("Welcome to dot product of vecotors.");
    System.out.println("Would you like a tutorial?");    
    tutorial = input.nextLine();
    
    if (tutorial.equalsIgnoreCase("Yes"))
    {
      TutorialDotProduct();
    }
    
    else
    {
      System.out.println("Lets begin practicing!");    
    }
    
    int[] vector1 = new int[3];
    int[] vector2 = new int[3];
    
    while(true)
    {
      while(true)
      {
        System.out.println("How many times would you like to practice?");
        
        try 
        {
          practice = input.nextInt();
          break;
        }
        
        catch (Exception e)
        {
          System.out.println("Not a vaild number");  
        }    
        
        finally
        {
          input.nextLine(); 
        }
      }
      
      if (practice >= 0 && practice < 15)
      {
        
        for (int j = 1; j <= practice; j++)
        {
          for (int i = 0; i < vector1.length; i++)
          {
            num1 = random.nextInt(11) -5; 
            num2 = random.nextInt(11) -5; 
            
            vector1 [i] = num1;
            vector2 [i] = num2;  
          }
          
          System.out.println("Your first vector is ");
          
          for(int i = 0; i < vector1.length; i++)
          {
            System.out.print(vector1[i]+" ");     
          }
          System.out.println();   
          
          System.out.println("Your second vector is ");
          
          for(int i = 0; i < vector2.length; i++)
          {
            System.out.print(vector2[i]+" ");     
          }
          System.out.println();
          
          answerX = vector1[0] * vector2[0];
          answerY = vector1[1] * vector2[1];
          answerZ = vector1[2] * vector2[2];
          answer = answerX + answerY + answerZ;
          
          while(true)
          {
            System.out.println("Please enter your answer.");
            
            try 
            {
              userAnswer = input.nextInt();
              break;
            }
            
            catch (Exception e)
            {
              System.out.println("Not a vaild number");  
            }    
            
            finally
            {
              input.nextLine(); 
            }
          }
          
          if (userAnswer == answer)
          {
            System.out.println("You got it right!");        
          }
          
          else
          {
            System.out.println("Wrong, please try again."); 
          }
        }
        break;
      }
      else
      {
        System.out.println("Please enter a number above 0 or less then 16");    
      }
    }
  }
  
  // tutorials
  
  public static void TutorialAddingVectors ()
  {
    String line;
    
    try 
    {
      FileReader reader = new FileReader("AddingVectorsTutorial.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);
      
      while ((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(line);
      }
      reader.close();
    } 
    catch (Exception e) 
    {
      e.printStackTrace(); // Print what went wrong
    }
    
    System.out.println("done");
  }
  
  public static void TutorialDotProduct ()
  {
    String line;
    
    try 
    {
      FileReader reader = new FileReader("DotProductTutorial.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);
      
      while ((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(line);
      }
      reader.close();
    } 
    catch (Exception e) 
    {
      e.printStackTrace(); // Print what went wrong
    }
    
    System.out.println("done");
  }
}   

     
     
     
     
     
     
