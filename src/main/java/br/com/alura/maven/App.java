package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Produto produto = new Produto("Bala juquinha",0.15);
        
        System.out.println("a bala é"+produto.getNome());
        
    }
}
