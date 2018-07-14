package io.spring.lombok;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/*
Check exceptions burden
*/

public class LombokExample7 {

    @SneakyThrows
    public String resourceAsString() {
        try (InputStream is = this.getClass().getResourceAsStream("")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            return br.lines().collect(Collectors.joining("\n"));
        }
    }

}

