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
import Classes.UsuarioNormal;
import Modelo.Usuarios;
import ModeloDAO.AdministradoresDAOImp;
import ModeloDAO.UsuariosDAOImp;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class UsuariosTestDAO
{
	Usuarios user;
    private UsuariosDAOImp dao= new UsuariosDAOImp();
    
    @Before
	public void init() throws Exception {
    	user = new UsuarioNormal("Kyllder","1111111","1111111","542164","Garanhuns");
		dao.InsereUsuario(user);
	}
    
    @org.junit.Test()
	public void selectTest() throws Exception  {
		ArrayList<Usuarios> users = dao.BuscarUsuarios(user.getCPF());
        assertFalse(users.isEmpty());
	}
    
    
	@org.junit.Test()
	public void insertTest() throws Exception  {
		Usuarios a = new UsuarioNormal("Kyllder 2","222222","222222","542164","Garanhuns");
		dao.InsereUsuario(a);
		ArrayList<Usuarios> users = dao.BuscarUsuarios(a.getCPF());
        assertFalse(users.isEmpty());
        dao.DeletarUsuario(a);        
	}
	

	@org.junit.Test()
	public void deleteTest() throws Exception  {
		Usuarios a = new UsuarioNormal("Kyllder 3","3333333","333333","542164","Garanhuns");
		dao.InsereUsuario(a);
		dao.DeletarUsuario(a);        
		ArrayList<Usuarios> users = dao.BuscarUsuarios(a.getCPF());
        assertTrue(users.isEmpty());
	}

	@org.junit.Test()
	public void updateTest() throws Exception  {
		String telefone = user.getTelefone();
		user.setTelefone("22222222");
		dao.UpdateUsuario(user, user.getCPF());
		ArrayList<Usuarios> users = dao.BuscarUsuarios(user.getCPF());
		
		assertNotEquals(telefone, users.get(0).getTelefone());
	}
	
	@After
	public void after() throws Exception {
        dao.DeletarUsuario(user);    
	}
	
}
