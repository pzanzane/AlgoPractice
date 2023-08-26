package com.example.algopractice.findduplicate;

import static org.junit.Assert.*;

import com.google.common.truth.Truth;

import org.junit.Test;

public class FindDuplicateNumberTest {

    @Test
    public void solution_withoutDuplicate_returnZero() {

        // Assign
        int array[] = { 1,2,3,4,5,6 };
        int expected = 0;
        FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();

        // Act
        int result = findDuplicateNumber.solution(array);

        // Assert
        Truth.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void solution_emptyArray_returnZero() {

        // Assign
        int array[] = {  };
        int expected = 0;
        FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();

        // Act
        int result = findDuplicateNumber.solution(array);

        // Assert
        Truth.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void solution_withDuplicate_returnReplacement() {

        // Assign
        int array[] = { 1,2,3,3,5,6 };
        int expected = 4;
        FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();

        // Act
        int result = findDuplicateNumber.solution(array);

        // Assert
        Truth.assertThat(result).isEqualTo(expected);
    }
}