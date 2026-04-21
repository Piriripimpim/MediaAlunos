import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class App {
    private pilha p = null;  //atributo da classe
    private int totalCadastrado;
  
    public App() {
        int opcao;
        System.out.println("Insira a quantidade de alunos a serem registrados:");
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de alunos a serem registrados:"));
        p = new pilha(num);

        do {
            String menu = "--- Nota dos Alunos ---\n"
                    + "Cadastrados: " + totalCadastrado + "/"+ num+ "\n"
                    + "1. Acrescentar novo Aluno\n"
                    + "2. Exibir Alunos\n"
                    + "3. Sair";

            String leitura = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.QUESTION_MESSAGE);
            if (leitura == null) break; 
            opcao = Integer.parseInt(leitura);


            switch (opcao) {
                case 1:
                    adicionarAluno(num);
                    break;
                case 2:
                    exibirAlunos();
                    break;
            }
        } while (opcao != 3);

            
        
    }

    public void adicionarAluno(int num){
        if (totalCadastrado < num) {
            JTextField nomeField= new JTextField();
            JTextField notaMfField = new JTextField();
            JTextField notaPfField = new JTextField();
            JTextField notaGfField = new JTextField();
            JTextField notaHfField = new JTextField();
            JTextField notaCfField = new JTextField();

            Object[] mensagem = {
                "Nome:", nomeField,
                "Nota de Matemática:", notaMfField,
                "Nota de Português:", notaPfField,
                "Nota de Geografia:",notaGfField,
                "Nota de História:", notaHfField,
                "Nota de Ciência:", notaCfField 
            };

            int result = JOptionPane.showConfirmDialog(null, mensagem, 
            "Cadastrar Aluno", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                String nome = nomeField.getText();
                float notaM = Float.parseFloat(notaMfField.getText());
                float notaP = Float.parseFloat(notaPfField.getText());
                float notaG = Float.parseFloat(notaGfField.getText());
                float notaH = Float.parseFloat(notaHfField.getText());
                float notaC = Float.parseFloat(notaCfField.getText());
                
                p.push(new Alunos(nome, notaM, notaP, notaG, notaH, notaC));
                totalCadastrado++;
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Agenda lotada!");
        }
    }

    public void exibirAlunos(){
        //exibir nome, notas, média e resusltado
    }


    public static void main(String[] args) throws Exception {
        new App();
    }

}
