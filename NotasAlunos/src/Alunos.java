public class Alunos {
    private String nome;
    private float notaP, notaM, notaH, notaG, notaC, media;
    private String situacao;

    public Alunos(){}

    public Alunos(String nome, float notaM, float notaP, float notaG, float notaH, float notaC){
        this.nome = nome;
        this.notaM = notaM;
        this.notaP = notaP;
        this.notaG = notaG;
        this.notaH = notaH;
        this.notaC = notaC;
        this.media = media(notaM, notaP, notaG, notaH, notaC);
        situacao(notaM, notaP, notaG, notaH, notaC, this.media);
    }

    public float media(float notaM, float notaP, float notaG, float notaH, float notaC){
        float Cmedia = (notaC + notaG + notaH + notaP + notaM)/5;
        return Cmedia;
    }

    public void situacao(float notaP, float notaM, float notaH, float notaG, float notaC, float media){
        float notas[] = {notaP, notaM, notaH, notaG, notaC};
        float menor = notas[0]; // Supõe que o primeiro é o maior

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i]; 
            }
        }

        if (menor >= 6){
            this.situacao = "Aprovado";
        } else if (media >= 6){
            this.situacao = "Recuperação";
        } else {
            this.situacao = "Reprovado";
        }

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getNotaP() {
        return notaP;
    }
    public void setNotaP(float notaP) {
        this.notaP = notaP;
    }
    public float getNotaM() {
        return notaM;
    }
    public void setNotaM(float notaM) {
        this.notaM = notaM;
    }
    public float getNotaH() {
        return notaH;
    }
    public void setNotaH(float notaH) {
        this.notaH = notaH;
    }
    public float getNotaG() {
        return notaG;
    }
    public void setNotaG(float notaG) {
        this.notaG = notaG;
    }
    public float getNotaC() {
        return notaC;
    }
    public void setNotaC(float notaC) {
        this.notaC = notaC;
    }
    public float getMedia() {
        return media;
    }
    public void setMedia(float media) {
        this.media = media;
    }
    public String getSituação() {
        return situacao;
    }
    public void setSituação(String situação) {
        this.situacao = situação;
    }

   //public String toString() {
   //   return("Nome: " + getNome() + "\n -> Nota Matemática: " + getNotaM()
   //   	    + "\n -> Nota Português: " + getNotaP()
   //        + "\n -> Nota de Ciências: " + getNotaC()
   //        + "\n -> Nota Geografia: " + getNotaG()
   //        + "\n -> Nota História: " + getNotaH() + "\n"
   //        + "\n -> Media: " + getMedia())
   //        + "\n -> Situação: " + getSituação() + "\n";
   //}
   public String toString()  {
       return("Nome: " + getNome() + ", Nota Matemática: " + getNotaM()
       	    + ", Nota Português: " + getNotaP()
            + ", Nota de Ciências: " + getNotaC()
            + ", Nota Geografia: " + getNotaG()
            + ", Nota História: " + getNotaH()
            + ", media" + getMedia())
            + ", Situação: " + getSituação();
   }
}
