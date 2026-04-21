import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
        String[] colunas = {"Nome", "Matemática", "Português", "Geografia", "História", "Ciência", "Média", "Resultado"};
        Object[][] dados = new Object[totalCadastrado][8];

        
        for (int i = 0; i < totalCadastrado; i++) {
            Alunos a = (Alunos) p.get(i);
            dados[i][0] = a.getNome();
            dados[i][1] = a.getNotaM();
            dados[i][2] = a.getNotaP();
            dados[i][3] = a.getNotaG();
            dados[i][4] = a.getNotaH();
            dados[i][5] = a.getNotaC();
            dados[i][6] = String.format("%.2f",a.getMedia());
            dados[i][7] = a.getSituação();
        }
        //Tabela com os dados.

        JTable tabela = new JTable(dados, colunas);
        //colocar dentro de um JScrollPane para aparecer no cabeçalho
        JScrollPane scroll = new JScrollPane(tabela);
        //Exibir tudo no JOptionPane
        JOptionPane.showMessageDialog(null, scroll, "Lista de Alunos", JOptionPane.PLAIN_MESSAGE);
    }


    public static void main(String[] args) throws Exception {
        new App();
    }

}
