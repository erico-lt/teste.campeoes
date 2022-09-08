package personagens;


public class Personagens extends Campeoes{
    private String classe;
    private int ad;
    private int ap;
    private int defesa;

    public Personagens(String nome, String posicao, int power, String classe) {
        super(nome, posicao, power);
        this.setClasse(classe);
        
        if(this.classe == "Suporte" || this.classe == "suporte"){
            this.setDefesa(power);
        }else if(this.classe == "Mago" || this.classe  == "mago"){
            this.setAp(power);
        }else{
            this.setAd(power);
        }

        //String classeVeficada = verificarClasse(classe);                  
    }        


    /*private String verificarClasse(String classe){
        return "";
    }*/

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getDefesa(){
        return this.defesa;
    }

    public void setDefesa(int defesa){
        this.defesa = defesa;
    }

    @Override
    public String toString(){

        return super.toString() + "Classe: " + this.getClasse() + 
               "Ad: " + this.getAd() + "Ap: " + this.getAp();
    }   
    

}

