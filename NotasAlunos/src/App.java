import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class App {
    private pilha p = null;  //atributo da classe

    public App() {
        System.out.println("Pilha inicial de Alunos:");
        System.out.println("Insira a quantidade de alunos a serem registrados:");
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de alunos a serem registrados:"));
        p = new pilha(num);

        while (!p.isFull()) {
            JTextField nome = new JTextField();
            JTextField notaM = new JTextField();
            JTextField notaP = new JTextField();
            JTextField notaG = new JTextField();
            JTextField notaH = new JTextField();
            JTextField notaC = new JTextField();
            p.push(new Alunos(nome.getText(),
                            Float.parseFloat(notaM.getText()),
                            Float.parseFloat(notaP.getText()),
                            Float.parseFloat(notaG.getText()),
                            Float.parseFloat(notaH.getText()),
                            Float.parseFloat(notaC.getText())
                        ));
        }

        p.print();
 
    }

    public static void main(String[] args) throws Exception {
        new App();
    }

    public void simular() {
        //para efetuar teste rápidos, criamos uma pilha com dados fixos:
        p = new pilha(15);
        p.push(new Alunos("Mari", 8, 8, 8, 8, 8));
        p.push(new Alunos("Roberto", 6, 3, 7, 8, 10));
        p.push(new Alunos("Clovis", 3, 2, 1, 4, 8));

    }   
}
