import javax.swing.JOptionPane;
public class IMC
{
   public static void main(String[] args)
   {
      double peso  =Double.parseDouble(JOptionPane.showInputDialog("\nDigite o seu peso:"));
      double altura=Double.parseDouble(JOptionPane.showInputDialog("\nDigite sua altura:"));
      
      double imc=peso/altura;
      
      JOptionPane.showMessageDialog(null,"Seu IMC é: "+imc);
      
   }
}