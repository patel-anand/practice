package com.anand.dsalgo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

/**
 * Created by anand_patel on 4/19/18.
 */
public abstract class ListContractTest {
    private List<Integer> list;

    abstract protected List<Integer> createList();

    @BeforeMethod
    public void setup() {
        list = createList();
    }

    @Test
    public void addToEmptyList() {
        final Integer someValue = new Integer(10);
        assertThat(list.isEmpty()).isTrue();

        list.add(someValue);

        assertThat(list.isEmpty()).isFalse();
        assertThat(list.size()).isOne();
        assertThat(list.get(0)).isSameAs(someValue);
    }

    @Test
    public void containsTest()
    {
        assertThat(list.isEmpty()).isTrue();
        for (int i = 5; i <= 7; i++) {
            list.add(new Integer(i));
        }

        assertThat(list.isEmpty()).isFalse();
        assertThat(list.size()).isEqualTo(3);

        for (int i = 1; i <= 10; i++)
        {
            if (i >= 5 && i <= 7) {
                assertThat(list.contains(new Integer(i))).isTrue();
            }
            else {
                assertThat(list.contains(new Integer(i))).isFalse();
            }
        }
    }
}
