package ru.chugunov.application.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implements counting digits from string
 *
 * @author Andrei Chugunov
 */
@Service
public class DigitCounter implements Counter {

    private static final String REGEXP_DIGIT = "\\d";
    private static Pattern pattern = Pattern.compile(REGEXP_DIGIT);

    @Override
    public int count(String string) {
        if (StringUtils.isEmpty(string)) {
            return 0;
        }
        Matcher matcher = pattern.matcher(string);

        int count = 0;
        while(matcher.find()) {
            count++;
        }
        return count;
    }
}
