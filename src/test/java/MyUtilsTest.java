import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Index;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Before; // importation possible grâce aux dependencies
import org.junit.Test;

import utils.MyUtils;

public class MyUtilsTest {

	private MyUtils utils;

	@Before
	public void before() {
		utils = new MyUtils();
	}

	@Test
	public void testSumTest() { // nom d'une méthode de test, void car ne renvoie rien et pas de paramètres

		List<Integer> list = new ArrayList<>(); // on fait le test de sum, on crée donc une liste ici pour réaliser le
												// test
		list.add(1);
		list.add(3);

		Assert.assertEquals(4, utils.sum(list)); // la valeur attendue est de 4 dans la méthode sum qui prend l'objet
													// list en compte
	}

	@Test
	public void testEmptyToNull() {

		// je fais le test de emptyToNull en créant une string
		String s = "Joe";
		String s1 = "";

		Assert.assertThat(utils.emptyToNull(s1), IsNull.nullValue());
		Assert.assertThat(utils.emptyToNull(s), IsNull.notNullValue());
		// via une autre manière plus simple
		Assert.assertNotNull(utils.emptyToNull(s));

		// via Hamcrest
		Assert.assertThat(s, not(nullValue()));

	}
	
	@Test
	public void TestFilterEvenNumbers() {

		List<Integer> list1 = new ArrayList<>(); // je créé une liste 
		
		list1.add(12);
		list1.add(11);
		
		Assert.assertFalse(utils.filterEvenNumbers(list1).contains(11)); // on tient à ce que la liste ne contienne pas 11; on veut que ce soit "faux"
		Assert.assertTrue(utils.filterEvenNumbers(list1).contains(12));  // on veut que 12 soit "vrai"
	}
	
	
	@Test
	public void TestTransformSquarePlusPointFive() {

		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		
		// Assert.assertTrue(utils.transformSquarePlusPointFive(list2).equals();
		Assertions.assertThat(utils.transformSquarePlusPointFive(list2)).contains(4.5f, Index.atIndex(0)); // on ajoute le f car on souhaite récupérer un float
		// Assertions doit être employé au lieu d'assert afin d'utiliser AssertJ
		// AssertJ permet de chercher une valeur dans une liste à un index donné, ici le premier donc 0
	}
	
	
	
	
}	


