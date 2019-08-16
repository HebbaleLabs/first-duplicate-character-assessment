package com.talfinder.assessment;

import com.talfinder.assessment.FirstNonDuplicateCharacterAssessment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class FirstNonDuplicateCharacterAssessmentTest {
    String text;
    Character expected;

    public FirstNonDuplicateCharacterAssessmentTest(String text, Character expected) {
        this.text = text;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"apple", 'a'},
                {"reed", 'r'},
                {"you are my fault", 'o'},
                {"india", 'n'},
                {"elle", null},
                {"Abba", 'A'},
                {"e$&yh*eh", 'y'},
                {"e45th4e", '5'},
                {"if the input is apple, then the output would be a If the input is racecars, then the output would be e", 'I'},
                {"aromatic", 'r'}});
    }

    @Test
    public void checkForNonDuplicateCharacter() {
        Assert.assertEquals("input:String as " + text + "", expected, FirstNonDuplicateCharacterAssessment.firstNonRepeatingCharacter(text));
    }
}
