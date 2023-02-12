import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class StringManipulationTest {

    @Test
    void constructor_shouldVerifyModifierIsPrivate() throws NoSuchMethodException {
        Constructor<StringManipulation> constructor = StringManipulation.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    }

    @Test
    void areRelated_ShouldReturnTrueIfRelatedStrings() {
        assertTrue(StringManipulation.areRelated("presidia", "achille", "achillea"));
        assertTrue(StringManipulation.areRelated("television", "ballyho", "ballyhoo"));
        assertTrue(StringManipulation.areRelated("everybody", "man", "many"));
    }

    @Test
    void areRelated_ShouldReturnFalseIfNotRelatedStrings() {
        assertFalse(StringManipulation.areRelated("faction", "unsatisfaction", "unsatisfactions"));
        assertFalse(StringManipulation.areRelated("paint", "coffee", "rheumatologist"));
    }
}
