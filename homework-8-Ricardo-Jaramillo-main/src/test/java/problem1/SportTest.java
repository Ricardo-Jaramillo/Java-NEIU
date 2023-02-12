package problem1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class SportTest {

    @Test
    void constructorModifierShouldBeProtected() {
        Constructor<?>[] constructor = Sport.class.getDeclaredConstructors();
        assertTrue(Modifier.isProtected(constructor[0].getModifiers()));
    }

}