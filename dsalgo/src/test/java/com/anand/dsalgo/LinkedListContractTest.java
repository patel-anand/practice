package com.anand.dsalgo;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by anand_patel on 4/19/18.
 */
public class LinkedListContractTest extends ListContractTest {
    protected List<Integer> createList() {
        return new LinkedList<Integer>();
    }
}
