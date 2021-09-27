import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ataque.Brasas;
import ataque.Burbuja;
import ataque.Canto;
import ataque.CañonDeAgua;
import ataque.Fogonazo;
import ataque.LatigoCepa;
import ataque.AtaqueRapido;
import pokemon.Bulbasaur;
import pokemon.Chansey;
import pokemon.Charmander;
import pokemon.Jigglypuff;
import pokemon.Rattata;
import pokemon.Squirtle;


public class AlgomonTests {
/*Leer Test 16, modificar todos los AssertEquals*/
@Test
public void test01SquirtleAtacaConBurbujaYLeQuita20DeVidaACharmander(){
	Squirtle unSquirtle = new Squirtle();
	Charmander unCharmander = new Charmander();
	Burbuja unBurbuja = new Burbuja();
	double HPInicialCharmander = unCharmander.getHP();
	unSquirtle.atacar(unBurbuja, unCharmander);
	assert (unCharmander.getHP() == HPInicialCharmander - 20);
}

@Test
public void test02SquirtleAtacaConBurbujaYLeQuita10DeVidaAChansey(){
	Squirtle unSquirtle = new Squirtle();
	Chansey unChansey = new Chansey();
	Burbuja unBurbuja = new Burbuja();
	double HPInicialChansey = unChansey.getHP();
	unSquirtle.atacar(unBurbuja, unChansey);
	assert (unChansey.getHP() == HPInicialChansey - 10);
}

@Test
public void test03SquirtleAtacaConBurbujaYLeQuita5DeVidaABulbasaur(){  
	Squirtle unSquirtle = new Squirtle();
	Bulbasaur unBulbasaur = new Bulbasaur();
	Burbuja unBurbuja = new Burbuja();
	double HPInicialBulbasaur = unBulbasaur.getHP();
	unSquirtle.atacar(unBurbuja, unBulbasaur);
	assertEquals(unBulbasaur.getHP(), HPInicialBulbasaur - 5, 0.0001D);
}

@Test
public void test04SquirtleAtacaConAtaqueRapidoYLeQuita10DeVidaACharmander(){
	Squirtle unSquirtle = new Squirtle();
	Charmander unCharmander = new Charmander();
	AtaqueRapido unAtaqueRapido = new AtaqueRapido();
	double HPInicialCharmander = unCharmander.getHP();
	unSquirtle.atacar(unAtaqueRapido, unCharmander);
	assert (unCharmander.getHP() == HPInicialCharmander - 10);
}

@Test
public void test05SquirtleAtacaConCañonDeAguaACharmander(){
	Squirtle unSquirtle = new Squirtle();
	Charmander unCharmander = new Charmander();
	CañonDeAgua unCañonDeAgua = new CañonDeAgua();
	double HPInicialCharmander = unCharmander.getHP();
	unSquirtle.atacar(unCañonDeAgua, unCharmander);
	assert (unCharmander.getHP() == HPInicialCharmander - 40);
}
 @Test
public void test06SquirtleAtacaConCañonDeAguaYLeQuita10DeVidaABulbasaur(){
	Squirtle unSquirtle = new Squirtle();
	Bulbasaur unBulbasaur = new Bulbasaur();
	CañonDeAgua unCañonDeAgua = new CañonDeAgua();
	double HPInicialBulbasaur = unBulbasaur.getHP();
	unSquirtle.atacar(unCañonDeAgua, unBulbasaur);
	assertEquals(unBulbasaur.getHP(), HPInicialBulbasaur - 10, 0.0001D);
}
 
 @Test
 public void test07SquirtleAtacaConBurbujaYLeQuita10DeVidaAJigglypuff (){
 	Squirtle unSquirtle = new Squirtle();
 	Jigglypuff  unJigglypuff  = new Jigglypuff ();
 	Burbuja unBurbuja = new Burbuja();
 	double HPInicialJigglypuff  = unJigglypuff.getHP();
 	unSquirtle.atacar(unBurbuja, unJigglypuff );
 	assert (unJigglypuff .getHP() == HPInicialJigglypuff  - 10);
 }
 
 @Test
 public void test08SquirtleAtacaConBurbujaYLeQuita10DeVidaARattata(){
 	Squirtle unSquirtle = new Squirtle();
 	Rattata  unRattata  = new Rattata();
 	Burbuja unBurbuja = new Burbuja();
 	double HPInicialRattata  = unRattata.getHP();
 	unSquirtle.atacar(unBurbuja, unRattata );
 	assert (unRattata .getHP() == HPInicialRattata  - 10);
 }
 
 @Test
 public void test09SquirtleAtacaConCañonDeAguaYLeQuita20DeVidaAChansey(){
 	Squirtle unSquirtle = new Squirtle();
 	Chansey unChansey = new Chansey();
 	CañonDeAgua unCañonDeAgua = new CañonDeAgua();
 	double HPInicialChansey = unChansey.getHP();
 	unSquirtle.atacar(unCañonDeAgua, unChansey);
 	assert (unChansey.getHP() == HPInicialChansey - 20);
 }
 
 @Test
 public void test10SquirtleAtacaConCañonDeAguaYLeQuita20DeVidaAJigglypuff (){
 	Squirtle unSquirtle = new Squirtle();
 	Jigglypuff  unJigglypuff  = new Jigglypuff ();
 	CañonDeAgua unCañonDeAgua = new CañonDeAgua();
 	double HPInicialJigglypuff  = unJigglypuff.getHP();
 	unSquirtle.atacar(unCañonDeAgua, unJigglypuff );
 	assert (unJigglypuff .getHP() == HPInicialJigglypuff  - 20);
 }
 
 @Test
 public void test11SquirtleAtacaCañonDeAguaYLeQuita20DeVidaARattata(){
	 	Squirtle unSquirtle = new Squirtle();
	 	Rattata  unRattata  = new Rattata();
	 	CañonDeAgua unCañonDeAgua = new CañonDeAgua();
	 	double HPInicialRattata  = unRattata.getHP();
	 	unSquirtle.atacar(unCañonDeAgua, unRattata );
	 	assert (unRattata .getHP() == HPInicialRattata  - 20);
	 }

 
 @Test
 public void test12BulbasorAtacaASquirtleConLatigoCepaYLeQuita30DeVida(){
	 Bulbasaur unBulbasaur = new Bulbasaur();
	 Squirtle unSquirtle = new Squirtle();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPSquirtleInicial = unSquirtle.getHP();
	 unBulbasaur.atacar(unLatiagoCepa, unSquirtle);
	 assert (unSquirtle.getHP() == HPSquirtleInicial  - 30);
 }
 
 @Test
 public void test13BulbasorAtacaACharmanderConLatigoCepaYLeQuita7DeVida(){
	 Bulbasaur unBulbasaur = new Bulbasaur();
	 Charmander unCharmander = new Charmander();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPCharmanderInicial = unCharmander.getHP();
	 unBulbasaur.atacar(unLatiagoCepa, unCharmander);
	 assertEquals(unCharmander.getHP(), HPCharmanderInicial  - 7, 0.0001D);
 }
 
 @Test
 public void test14BulbasorAtacaAJigglypuffConLatigoCepaYLeQuita15DeVida(){
	 Bulbasaur unBulbasaur = new Bulbasaur();
	 Jigglypuff unJigglypuff = new Jigglypuff();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPJigglypuffInicial = unJigglypuff.getHP();
	 unBulbasaur.atacar(unLatiagoCepa, unJigglypuff);
	 assert (unJigglypuff.getHP() == HPJigglypuffInicial  - 15);
 }
 
 @Test
 public void test15BulbasorAtacaAChanseyConLatigoCepaYLeQuita15DeVida(){
	 Bulbasaur unBulbasaur = new Bulbasaur();
	 Chansey unChansey = new Chansey();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPChanseyInicial = unChansey.getHP();
	 unBulbasaur.atacar(unLatiagoCepa, unChansey);
	 assert (unChansey.getHP() == HPChanseyInicial  - 15);
 }
 
 @Test
 public void test16BulbasorAtacaARattataConLatigoCepaYLeQuita15DeVida(){
	 /*Miren, los pokemones no estan cargando su HP, todos los tests estan mal,
	  * no tenemos que verificar que baje 15 la vida, sino que la vida sea 155
	  * que es 170 la inicial de Ratata menos 15 que le quito el ataque, y esto no 
	  * esta pasando, ni en este ni en los veintipico de tests...
	  * y Pongan bien los AssertEquals, el primer valor es el que ESPERAMOS, y 
	  * el segundo valor EL RESULTADO DEL TEST*/
	 Bulbasaur unBulbasaur = new Bulbasaur();
	 Rattata unRattata = new Rattata();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPRattataInicial = unRattata.getHP();
	 unBulbasaur.atacar(unLatiagoCepa, unRattata);
	 assertEquals (155, unRattata.getHP(),0.0001D);
 }

 @Test
 public void test17ChanseyAtacaASquirtleConLatigoCepaYLeQuita30DeVida(){
	 Chansey unChansey = new Chansey();
	 Squirtle unSquirtle = new Squirtle();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPSquirtleInicial = unSquirtle.getHP();
	 unChansey.atacar(unLatiagoCepa, unSquirtle);
	 assert (unSquirtle.getHP() == HPSquirtleInicial  - 30);
 }
 
 @Test
 public void test18ChanseyAtacaACharmanderConLatigoCepaYLeQuita7DeVida(){
	 Chansey unChansey = new Chansey();
	 Charmander unCharmander = new Charmander();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPCharmanderInicial = unCharmander.getHP();
	 unChansey.atacar(unLatiagoCepa, unCharmander);
	 assertEquals(unCharmander.getHP(), HPCharmanderInicial  - 7, 0.0001D);
 }
 
 @Test
 public void test19ChanseyAtacaAJigglypuffConLatigoCepaYLeQuita15DeVida(){
	 Chansey unChansey = new Chansey();
	 Jigglypuff unJigglypuff = new Jigglypuff();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPJigglypuffInicial = unJigglypuff.getHP();
	 unChansey.atacar(unLatiagoCepa, unJigglypuff);
	 assert (unJigglypuff.getHP() == HPJigglypuffInicial  - 15);
 }
 
 @Test
 public void test20ChanseyAtacaABulbasaurConLatigoCepaYLeQuita7DeVida(){
	 Chansey unChansey = new Chansey();
	 Bulbasaur unBulbasaur = new Bulbasaur();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPBulbasaurInicial = unBulbasaur.getHP();
	 unChansey.atacar(unLatiagoCepa, unBulbasaur);
	 assertEquals (unBulbasaur.getHP(), HPBulbasaurInicial  - 7, 0.0001D);
 }
 
 @Test
 public void test21ChanseyAtacaARattataConLatigoCepaYLeQuita15DeVida(){
	 Bulbasaur unChansey = new Bulbasaur();
	 Rattata unRattata = new Rattata();
	 LatigoCepa unLatiagoCepa = new LatigoCepa();
	 double HPRattataInicial = unRattata.getHP();
	 unChansey.atacar(unLatiagoCepa, unRattata);
	 assert (unRattata.getHP() == HPRattataInicial  - 15);
 }
 
 @Test
 public void test22CharmanderAtacaABulbasaurConBrasasyLeQuita32DeVidad(){
	 Charmander unCharmander = new Charmander();
	 Bulbasaur unBulbasaur = new Bulbasaur();
	 Brasas brasas = new Brasas();
	 double HPInicialBulbasaur = unBulbasaur.getHP();
	 unCharmander.atacar(brasas, unBulbasaur);
	 assertEquals (unBulbasaur.getHP(), HPInicialBulbasaur  - 32, 0.0001D);
 }
 
 @Test
 public void test23CharmanderAtacaASquirtleConBrasasyLeQuita8DeVidad(){
	 Charmander unCharmander = new Charmander();
	 Squirtle unSquirtle = new Squirtle();
	 Brasas brasas = new Brasas();
	 double HPInicialSquirtle = unSquirtle.getHP();
	 unCharmander.atacar(brasas, unSquirtle);
	 assertEquals (unSquirtle.getHP(), HPInicialSquirtle - 8, 0.0001D);
 }
 
 @Test
 public void test24CharmanderAtacaAJigglypuffConBrasasyLeQuita16DeVidad(){
	 Charmander unCharmander = new Charmander();
	 Jigglypuff unJigglypuff = new Jigglypuff();
	 Brasas brasas = new Brasas();
	 double HPInicialJigglypuff = unJigglypuff.getHP();
	 unCharmander.atacar(brasas, unJigglypuff);
	 assertEquals (unJigglypuff.getHP(), HPInicialJigglypuff - 16, 0.0001D);
 } 
 
 @Test
 public void test25CharmanderAtacaAChanseyConBrasasyLeQuita16DeVidad(){
	 Charmander unCharmander = new Charmander();
	 Chansey unChansey = new Chansey();
	 Brasas brasas = new Brasas();
	 double HPInicialChansey = unChansey.getHP();
	 unCharmander.atacar(brasas, unChansey);
	 assertEquals (unChansey.getHP(), HPInicialChansey - 16, 0.0001D);
 } 
 
 
 @Test
 public void test26CharmanderAtacaARattataConBrasasyLeQuita16DeVidad(){
	 Charmander unCharmander = new Charmander();
	 Rattata unRattata = new Rattata();
	 Brasas brasas = new Brasas();
	 double HPInicialRattata = unRattata.getHP();
	 unCharmander.atacar(brasas, unRattata);
	 assertEquals (unRattata.getHP(), HPInicialRattata - 16, 0.0001D);
 }
 

@Test 
public void test27CharmanderAgotaSuFogonazoYaNoPuedeVolverAUsarlo(){
	 Charmander unCharmander = new Charmander();
	 Rattata unRattata = new Rattata();
	 Fogonazo unFogonazo = new Fogonazo();
	 for (int x = 0; x < 4; x++)
		 unCharmander.atacar(unFogonazo, unRattata);
	//Cuando salimos del for, chamander ya agotñ su ataque
	double HPRattata = unRattata.getHP();
	unCharmander.atacar(unFogonazo, unRattata); //Este ataque no tiene que ejecutarse
	assertEquals (unRattata.getHP(), HPRattata, 0.0001D); //Como el ataque no se ejecutñ, sus puntos de vida tienen que seguir igual
	unCharmander.atacar(unFogonazo, unRattata);
	assertEquals (unRattata.getHP(), HPRattata, 0.0001D);
	unCharmander.atacar(unFogonazo, unRattata);
	assertEquals (unRattata.getHP(),HPRattata, 0.0001D); //Probamos algunas veces mñs para comprobar que el ataque queda inhabilitado permanentemente
	
}


@Test
//Este test hay que modificarlo
public void test28InstanciaDePokemonSeInicializaNoDormidoYNoQuemado(){
	Charmander unCharmander = new Charmander();
	assert (unCharmander.estaInhabilitado() == false );
	assert (unCharmander.sufreDañoPermanente() == false);
}

@Test
public void test29JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDañoProbandoUnTurno (){
	Squirtle unSquirtle = new Squirtle();
	Jigglypuff  unJigglypuff  = new Jigglypuff ();
	Canto canto = new Canto();
	unJigglypuff.atacar(canto, unSquirtle);
	double HPInicialJigglypuff  = unJigglypuff.getHP();
	Burbuja unBurbuja = new Burbuja();
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	assertEquals(HPInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
}

@Test
public void test30JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDañoProbandoDosTurnos (){
	Squirtle unSquirtle = new Squirtle();
	Jigglypuff  unJigglypuff  = new Jigglypuff ();
	Canto canto = new Canto();
	unJigglypuff.atacar(canto, unSquirtle);
	double HPInicialJigglypuff  = unJigglypuff.getHP();
	Burbuja unBurbuja = new Burbuja();
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	assertEquals(HPInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
}

@Test
public void test31JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDañoProbandoTresTurnos (){
	Squirtle unSquirtle = new Squirtle();
	Jigglypuff  unJigglypuff  = new Jigglypuff ();
	Canto canto = new Canto();
	unJigglypuff.atacar(canto, unSquirtle);
	double HPInicialJigglypuff  = unJigglypuff.getHP();
	Burbuja unBurbuja = new Burbuja();
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	assertEquals(HPInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
}

@Test
public void test32JigglypuffAtacaConCantoYDuermeSquirtleQuienLeCausaDañoLuegoDeTresTurnos(){
	Squirtle unSquirtle = new Squirtle();
	Jigglypuff  unJigglypuff  = new Jigglypuff ();
	Canto canto = new Canto();
	unJigglypuff.atacar(canto, unSquirtle);
	double HPInicialJigglypuff  = unJigglypuff.getHP();
	Burbuja unBurbuja = new Burbuja();
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	unSquirtle.atacar(unBurbuja, unJigglypuff );
	assertEquals(120, unJigglypuff.getHP(), 0.0001D);
	/*Este test no va a correr hasta que los pokemons carguen su respectiva HP al inicializarse*/
}

}
