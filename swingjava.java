import javax.swing.*;

public class swingjava {

    public static void main(String args[]) {
        int n1, n2, mod;
        double raiz1, raiz2;
        String msg = "";
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
        
        mod = n1 % n2;
        
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);
        
        msg = msg + "resto da divisao de " + n1 + " por " + n2 + " = " + mod + "\n";
        msg = msg + "Raiz de " + n1 + " = " + raiz1 + "\n";
        msg = msg + "Raiz de " + n2 + " = " + raiz2 + "\n";
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.exit(0);
        
        
    }
}
