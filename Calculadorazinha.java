package calculadorazinha;
import javax.swing.JOptionPane;

public class Calculadorazinha {

    public static void main(String[] args) {
     
      String firstNumber =
      JOptionPane.showInputDialog( "Enter first integer" );
      System.out.println(" Escolha a op. desejada:");
      String mult= "*";
      String div= "/";
      String adi= "+";
      String sub= "-";
      int resp = 0;
      
      String op = 
      JOptionPane.showInputDialog(" Escolha um simbolo da operação desejada" );
      
      String secondNumber =
      JOptionPane.showInputDialog( "Enter second integer" );
           int number2 = Integer.parseInt( secondNumber );
           int number1 = Integer.parseInt( firstNumber );
           if(op.equals("+")){
              resp = number1 + number2;
             }else{
               if(op.equals("-")){
                  resp = number1 - number2;
                  }else{
                   if(op.equals("*")){
                       resp = number1 * number2;
                   }else{
                     if(op.equals("/")){
                        resp = number1 / number2;
                      }else{
                         JOptionPane.showInputDialog(" Opção invalida erro ");
                      }
                   }
                 }
             }
            JOptionPane.showMessageDialog(null, "o resultado é     ="+resp+"  ", "vish kk", JOptionPane.PLAIN_MESSAGE);
               
    }   

}
    