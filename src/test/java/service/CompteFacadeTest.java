/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import ma.zsmart.bean.Compte;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author pc&
 */
public class CompteFacadeTest {

    public static List<Compte> comptes = new ArrayList();

    public CompteFacadeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        for (int i = 0; i < 10; i++) {
            comptes.add(new Compte("id" + (i + 1), new Double((i + 1) * 10)));
        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of debiter method, of class CompteFacade.
     */
    @org.junit.Test
    public void testDebiter() {
        System.out.println("debiter");
        Compte compte = new Compte("id2", 200d);
        Double montant = 3d;
        CompteFacade instance = new CompteFacade();
        int expResult = 1;
        int result = instance.debiter(comptes, compte, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of find method, of class CompteFacade.
     */
    @org.junit.Test
    public void testFind() {
        System.out.println("find");
        Compte compte = new Compte("id2", 200d);
        CompteFacade instance = new CompteFacade();
        Compte expResult = new Compte("id2");
        Compte result = instance.find(comptes, compte);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
