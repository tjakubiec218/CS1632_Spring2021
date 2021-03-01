

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class DeathStarTest {

	/*
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: shoot planet with deathStar
	 * PostConditions: Return value of deathStar.shoot(planet) is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 */
	@Test
	public void testGetDamageShootTwice() {
		// TODO: Fill in!
		DeathStar star = new DeathStar();
		Planet p = Mockito.mock(Planet.class);
		Mockito.when(p.getHitPoints()).thenReturn(10);
		Mockito.when(p.toString()).thenReturn("Wimpy planet");
		String ret = star.shoot(p);
		assertEquals("Wimpy planet was hit by the superlaser!", ret);
		Mockito.verify(p).damage(100);
	}
}
