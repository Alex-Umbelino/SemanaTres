import javax.swing.JOptionPane;
public class Retangulo
{
   public static void main(String[ ] args)
   {
      double base  =Double.parseDouble(JOptionPane.showInputDialog("\nDigite a base:"));
      double altura=Double.parseDouble(JOptionPane.showInputDialog("\nDigite a altura do retangulo:"));
      
      double area=base*altura;
      
      JOptionPane.showMessageDialog(null,"\nA área do retangulo é " +area+" unidades de medida");
   }   
   
}