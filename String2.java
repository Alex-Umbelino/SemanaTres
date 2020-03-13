import javax.swing.JOptionPane;
public class String2
{
   public static void main(String[] args)
   {
     String string1, string2, string3 ;
     
      string1 = JOptionPane.showInputDialog ("Digite a primeira String:");
      string2 = JOptionPane.showInputDialog ("Digite a segunda String:");
      string3 = JOptionPane.showInputDialog ("Digite a terceira string:");
     
     String somatoria= string1+""+ string2+"" +string3;
     
     int total=somatoria.length();
     
     JOptionPane.showMessageDialog(null, total);
   }
}