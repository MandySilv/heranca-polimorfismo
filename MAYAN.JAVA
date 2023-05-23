class Mayan extends linguagem  {
    public Mayan(String nome, String regioesFaladas, String ordemDasPalavras, int numFalantes){
        super(nome, regioesFaladas, ordemDasPalavras, numFalantes);
    }
    @Override
    public void getInfo(){
        System.out.println( nome + " é falado por " + numFalantes + " pessoas, principalmente em " + regioesFaladas + ".A linguagem segue a ordem das palavras " + ordemDasPalavras + ". Fato interessante: " + " é uma lingua ergativa. " );

    }
}
//extedender a classe pai através da class filha e ultilizando o @Override para Reescrever informações