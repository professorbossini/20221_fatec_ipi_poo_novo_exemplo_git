import javax.swing.JOptionPane;
public class Soma {
  public static void main(String[] x) {
    //declaração de variáveis
     //float (4 bytes) ou double (8 bytes)
    double op1, op2, res; 
     //entrada de dados
     //classes empacotadoras
     //int: Integer
     //double: Double
     //float: Float
     //char: Character
     op1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));

     op2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo operando"));

    //processamento
    res = op1 + op2;

    //saída
    //JOptionPane.showMessageDialog(null, res);
    // String s = "Resultado: " + res + ".";
    //Resultado: 3.
    // String s = op1 + " + " + op2 + " = " + res;
    // JOptionPane.showMessageDialog(null, s);
    // String s = String.format(
    //     "Resultado: %.2f.",
    //     res
    // );
    //exercício de 2 minutos
    //construa a string a + b = c usando String.format. Cada número deve ter 2 casas decimais
    JOptionPane.showMessageDialog(
        null, 
        String.format(
            "%.2f + %.2f = %.2f.",
            op1, op2, res
        )
    );


  }  
}
