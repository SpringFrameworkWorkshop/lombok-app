package io.spring.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/*
Generates a constructor for all final fields, with parameter order same as field order
Creates an empty constructor.
Creates a constructor for all fields
*/

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LombokExample3 {
    private final String sentence;
    private boolean isValue;
    private String val;
}
