package com.herrho.springtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
class AccountTest {

    @Autowired
    private JacksonTester<Account> tester;

    @Test
    public void serialization() throws IOException {
        var account = new Account("bargeld", BigDecimal.ZERO);
        assertThat(tester.write(account)).isEqualToJson("""
                    {"name":"bargeld",
                    "amount":0}
                """);
    }

}