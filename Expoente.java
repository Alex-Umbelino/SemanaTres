import javax.swing.JOptionPane;
public class Expoente
{
   public static void main(String[ ] args)
   {
      double base  =Double.parseDouble(JOptionPane.showInputDialog("\nDigite a base:"));
      double show = Math.pow(base,2);
      
      
      
      JOptionPane.showMessageDialog(null,"\n O valor do expoente é " +show);
   }   
   
}