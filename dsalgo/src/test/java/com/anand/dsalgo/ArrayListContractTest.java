package com.anand.dsalgo;

import java.util.List;

/**
 * Created by anand_patel on 4/19/18.
 */
public class ArrayListContractTest extends ListContractTest {

    protected List<Integer> createList() {
        return new ArrayList<Integer>();
    }
}
