package ru.melkozerovau.MySecondTestAppSpringBoot.service;

import org.junit.jupiter.api.Test;
import ru.melkozerovau.MySecondTestAppSpringBoot.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnnualBounsServiceImplTestQuarter {

    @Test
    void calculateQuarter() {
        // given
        Positions position = Positions.TL;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        // when
        double result = new AnnualBounsServiceImpl().calculateQuarter(position, salary, bonus, workDays);

        // then
        double expected = 196872.4279835391;
        assertThat(result).isEqualTo(expected);
    }
}