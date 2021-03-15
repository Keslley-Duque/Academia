
package academia;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno(); // instanciacao (criação) do objeto
        // solicitacão das informações do aplicativo
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno: ", "Academia 1.0", 3);

        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura de " + nome, "Academia 1.0",
                JOptionPane.QUESTION_MESSAGE));

        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o peso de " + nome, "Academia 1.0",
                JOptionPane.QUESTION_MESSAGE));

        // adiconar os metodos de acesso (set) para setar as informações aos atributos
        objAluno.setNome(nome);
        objAluno.setAltura(altura);
        objAluno.setPeso(peso);

        // exibir o resultado para o usuario
        JOptionPane.showMessageDialog(null, objAluno.resultado(), "Academia 1.0", 1);

        System.exit(0);

    }
}
