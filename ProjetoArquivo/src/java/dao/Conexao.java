package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author IFSul
 */
public  class Conexao {
    
    private static EntityManagerFactory emf;
    
    private Conexao() {

    }

    public static EntityManagerFactory getConexao() throws Exception {
        if ((emf == null) || (!emf.isOpen())) {
             emf = Persistence.createEntityManagerFactory("ProjetoArquivo_PU");
        }
        return emf;
    }  
    

    public static void closeConexao(){
        if (emf.isOpen()){
           emf.close();
        }
    }
}
