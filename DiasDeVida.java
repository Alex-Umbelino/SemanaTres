import javax.swing.JOptionPane;
public class DiasDeVida
{
   public static void main(String[] args)
   {
      int idade=Integer.parseInt(JOptionPane.showInputDialog("\nDigite sua idade:"));
      
      int total=idade*365;
      
      JOptionPane.showMessageDialog(null,"Você viveu aproximadamente "+total+" dias");
   }
}