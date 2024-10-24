import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //produto alimentício
        ProdutoAlimenticio pa = new ProdutoAlimenticio("salgadinho", 5.50, 10.0, new Date(), "10000kcal");
        System.out.println("Informações do Produto Alimentício:");
        System.out.println(pa.status());
        System.out.println("SQL: " + pa.toInsertSQL());
        System.out.println();

        //produto de vestuário
        ProdutoVestuario pv = new ProdutoVestuario("Camiseta", 10.00, 100.00, "p", "preta", "Algodão");
        System.out.println("Informações do Produto de Vestuário:");
        System.out.println(pv.status());
        System.out.println("SQL: " + pv.toInsertSQL());
    }
}
