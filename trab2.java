public class Aluno{
 private String nome;
    private int id;
    private double media;
    protected double nota1,nota2;
    private String passou;
    public Aluno(String nome, int id, double nota1, double nota2){
    this.nome=nome;
    this.id=id;
    this.nota1=nota1;
    this.nota2=nota2;
    calculamedia();
    }
    private void calculamedia(){
        media = (nota1+nota2)/2;
         System.out.println(media);
    }
    public void passou(){
    if(media > 7.0) {
        this.passou="true";
    } else {
        this.passou="false";
    }   
    }
    }
