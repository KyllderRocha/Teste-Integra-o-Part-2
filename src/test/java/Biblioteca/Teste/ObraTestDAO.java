package Biblioteca.Teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import Classes.Administradores;
import Classes.Artigo;
import Modelo.Obra;
import ModeloDAO.AdministradoresDAOImp;
import ModeloDAO.ObraDAOImp;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class ObraTestDAO
{
	Obra obra;
    private ObraDAOImp dao= new ObraDAOImp();
    
    @Before
	public void init() throws Exception {
    	obra = new Artigo("Artigo 1", "Assunto 1", "Kyllder", 3, 10);
		dao.InsereObra(obra);
	}
    
    @org.junit.Test()
	public void selectTest() throws Exception  {
		ArrayList<Obra> obras = dao.BuscarObras(obra.getNome());
        assertFalse(obras.isEmpty());
	}
    
    
	@org.junit.Test()
	public void insertTest() throws Exception  {
		Obra o = new Artigo("Artigo 2", "Assunto 2", "Kyllder2", 2, 13);
		dao.InsereObra(o);
		ArrayList<Obra> obras = dao.BuscarObras(o.getNome());
        assertNotEquals(obras.size(), 0);
        dao.DeletarObra(o);        
	}
	

	@org.junit.Test()
	public void deleteTest() throws Exception  {
		Obra o = new Artigo("Artigo 3", "Assunto 3", "Kyllder3", 2, 1322);
		dao.InsereObra(o);
		dao.DeletarObra(o);        
		ArrayList<Obra> obras = dao.BuscarObras(o.getNome());
        assertTrue(obras.isEmpty());
	}

	@org.junit.Test()
	public void updateTest() throws Exception  {
		String assunto = obra.getAssunto();
		obra.setAssunto("Assunto Teste");
		dao.UpdateObra(obra);
		ArrayList<Obra> obras = dao.BuscarObras(obra.getNome());
		assertNotEquals(assunto, obras.get(0).getAssunto());
	}

	@After
	public void after() throws Exception {
        dao.DeletarObra(obra);    
	}
	
}
