public class App {
    private pilha p = null;  //atributo da classe

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.simular();
        System.out.println("Pilha inicial de Alunos:");
        System.out.println(app.p.toString());
    }

    public void simular() {
        //para efetuar teste rápidos, criamos uma pilha com dados fixos:
        p = new pilha(15);
        p.push(new Alunos("Mari", 8, 8, 8, 8, 8));
        p.push(new Alunos("roberto", 6, 3, 7, 8, 10));
        p.push(new Alunos("clovis", 3, 2, 1, 4, 8));

    }   
}
