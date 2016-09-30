package upm.IWVG.SwC.Eneas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
   
    private User usuario;
  
    @Before
    public void setUp() {
    setUsuario(new User(608901304, "Eneas", "Macías"));
    }

    @Test
    public void getNumberTest() {
    	  assertEquals(608901304, this.usuario.getNumber());
    }
    @Test
    public void getNameTest() {
    	 assertEquals("Eneas", this.usuario.getName());
    }
    @Test
    public void getFamilyNameTest() {
    	 assertEquals("Macías", this.usuario.getFamilyName());
    }
    
    public void getFullNameTest() {
   	 assertEquals("Eneas Macías", this.usuario.fullName());
   }
   
    

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
}
