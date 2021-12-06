package com.java8apress.listing3_5;

import org.junit.jupiter.api.Test;

class Listing35UtilsTest {

    @Test
    void testSortingStrings() {
	Listing35Utils.sortingStrings();
    }

    @Test
    void sortingStringNumbersTest() {
	Listing35Utils listingUtils = new Listing35Utils();
	listingUtils.sortingStringNumbers();
    }

    @Test
    void sortingStringNumbersLambdaTest() {
	Listing35Utils listingUtils = new Listing35Utils();
	listingUtils.sortingStringNumbersLambda();
    }

}
