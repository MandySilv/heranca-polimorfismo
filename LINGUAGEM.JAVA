//cria uma classe com variáveis protegidas
public class linguagem{
    protected String nome;
    protected String regioesFaladas;
    protected String ordemDasPalavras;
    protected int numFalantes;
 
 //esse nome é igual a variável nome
 public linguagem(String nome, String regioesFaladas, String ordemDasPalavras, int numFalantes){
     this.nome = nome;
     this.regioesFaladas = regioesFaladas;
     this.ordemDasPalavras = ordemDasPalavras;
     this.numFalantes = numFalantes; 
     
 
 }
 
 public void getInfo(){
     System.out.println( nome + " é o idioma falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + "." );
 }
    //passar valores e informaçoes
    public static void main(String[] args) {
     linguagem ingles = new linguagem("Inglês", " Inglaterra ", "Suj+Verb+Obj", 8.000000 );
     ingles.getInfo();
     Mayan iucateco = new Mayan("iucateco", " América Central ", " verb-obj-suj ", 700000);
     iucateco.getInfo();
     SinoTibetan tibetano = new SinoTibetan( "Tibetano" , 2300000000);
     tibetano.getInfo();
    }
 
 }