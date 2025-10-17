package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test
    public void testCase1() {
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        FreelancerService service = new FreelancerService();;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}