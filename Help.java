/*
Modificate la classe in Help2 per fare in modo d'includere la spiegazione anche dei comandi for, while, do-while, break.
Inoltre, fare in modo che il programma venga eseguito costantemente fino a quando l'utente preme la lettera q.
*/

class Help { 
  public static void main(String args[])  
    throws java.io.IOException { 
    char choice; 
 
    System.out.println("Help on:"); 
    System.out.println("  1. if"); 
    System.out.println("  2. switch"); 
    System.out.print("Choose one: "); 
    choice = (char) System.in.read(); 
 
    System.out.println("\n"); 
  
    switch(choice) { 
      case '1': 
        System.out.println("The if:\n"); 
        System.out.println("if(condition) statement;"); 
        System.out.println("else statement;"); 
        break; 
      case '2': 
        System.out.println("The switch:\n"); 
        System.out.println("switch(expression) {"); 
        System.out.println("  case constant:"); 
        System.out.println("    statement sequence"); 
        System.out.println("    break;"); 
        System.out.println("  // ..."); 
        System.out.println("}"); 
        break; 
      default: 
        System.out.print("Selection not found."); 
    } 
  } 
}
