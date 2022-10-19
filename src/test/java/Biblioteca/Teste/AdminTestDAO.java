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
import ModeloDAO.AdministradoresDAOImp;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class AdminTestDAO
{
	Administradores admin;
    private AdministradoresDAOImp dao= new AdministradoresDAOImp();
    
    @Before
	public void init() throws Exception {    	
    	admin = new Administradores("Kyllder", "10112546654", "1234345", "6879873641", "Garanhuns", "12345678", "Admin", "Admin");
		dao.InsereAdmin(admin);
	}
    
    @org.junit.Test()
	public void selectTest() throws Exception  {
		ArrayList<Administradores> admins = dao.BuscarAdministradores(admin.getCPF());
        assertFalse(admins.isEmpty());
	}
    
    
	@org.junit.Test()
	public void insertTest() throws Exception  {
		Administradores a = new Administradores("Admin 2", "1111111111", "22222222222", "33333333", "Lajedo", "12345678", "Admin2", "Admin2");
		dao.InsereAdmin(a);
		ArrayList<Administradores> admins = dao.BuscarAdministradores(a.getCPF());
        assertFalse(admins.isEmpty());
        dao.DeletarAdmin(a);        
	}
	

	@org.junit.Test()
	public void deleteTest() throws Exception  {
		Administradores a = new Administradores("Admin 2", "1111111111", "22222222222", "33333333", "Lajedo", "12345678", "Admin2", "Admin2");
		dao.InsereAdmin(a);
		dao.DeletarAdmin(a);        
		ArrayList<Administradores> admins = dao.BuscarAdministradores(a.getCPF());
        assertEquals(admins.size(), 0);
	}

	@org.junit.Test()
	public void updateTest() throws Exception  {
		String telefone = admin.getTelefone();
		admin.setTelefone("22222222");
		dao.UpdateAdmin(admin, admin.getCPF());
		ArrayList<Administradores> admins = dao.BuscarAdministradores(admin.getCPF());
		
		assertNotEquals(telefone, admins.get(0).getTelefone());
	}
	
	private boolean throwException() throws Exception{
        throw new Exception();
    }

	@After
	public void after() throws Exception {
        dao.DeletarAdmin(admin);    
	}
	
}
