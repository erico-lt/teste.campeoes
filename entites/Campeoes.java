public class Campeoes{
    private String nome;
    private String posicao;
    private int power;

    public Campeoes(String nome, String posicao, int power){
        this.setNome(nome);
        this.setPosicao(posicao);
        this.setPower(power);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPosicao(){
        return this.posicao;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
        this.power = power;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + 
        "\nPosicão: " + this.getPosicao() + 
        "\nPower: " + this.getPower();
    }    
}
