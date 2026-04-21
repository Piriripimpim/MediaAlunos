public class pilha implements TAD_pilha {
    private int topo;	//Topo da Pilha
    private int MAX;	//Tamanho da Pilha
    private Object alunos[];	//Elementos da Pilha (objeto genérico)

    //Método construtor que inicializa a Pilha no estado vazia
    public pilha() {
        topo = -1;
        MAX = 30;
        alunos = new Object[MAX];
    }

    //Método construtor que inicializa a Pilha com tamanho máximo desejado
    public pilha(int qtde) {
        topo = -1;
        MAX = qtde;
        alunos = new Object[MAX];
    }

    //Método que verifica se a Pilha está Vazia
    @Override
    public boolean isEmpty() {
        return (topo == -1);
    }

    //Método que verifica se a Pilha está cheia
     @Override
    public boolean isFull() {
        return (topo == MAX - 1);
    }

    //Método para inserir um valor na Pilha
    @Override
    public Object push(Object x) {
        if (!isFull()) {
            alunos[++topo] = x;
            return x;
        } else {
            return null;
        }
    }

    //Método para retornar o topo da Pilha e removê-lo
    @Override
    public Object pop() {
        if (!isEmpty()) {
            return alunos[topo--];
        } else {
            return null;
        }
    }

    //Método que retorna o topo da pilha sem removê-lo
    @Override
    public Object top() {
        if (!isEmpty()) {
            return alunos[topo];
        } else {
            return null;
        }
    }

    //Método para retornar o conteúdo da Pilha
    @Override
    public String toString() {
        if (!isEmpty()) {
            String msg = "";
            for (int i = 0; i <= topo; i++) {
                msg += "\n  " + alunos[i].toString();
                //if(i != topo) msg += ", ";
            }
            return ("P: [ " + msg + "\n]");
            //return String.format("P: [ %s \n]", msg);
        } else {
            return "Pilha Vazia!";
        }
    }

//////////////////////////////////////////////////////

	//Método para exibir o conteúdo da Pilha
	public Object get(int i)
	{
        return alunos[i];
	}
}
