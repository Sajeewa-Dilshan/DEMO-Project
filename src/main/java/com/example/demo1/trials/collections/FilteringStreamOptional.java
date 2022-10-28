package com.example.demo1.trials.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringStreamOptional {

    public static void main(String[] args) {
        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));
        List<String> collect = listOfOptionals.stream().filter(Optional::isPresent)
                .map(Optional::get).collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect2= listOfOptionals.stream().filter(Optional::isPresent)
                .map(Optional::get).collect(Collectors.toList());
        System.out.println(collect2);

        List<String> stringList= Arrays.asList("fdbg","zfff","zxfvzf");

        final List<String> f = stringList.stream().filter(a ->a.startsWith("f"))
                .collect(Collectors.toList());
        System.out.println(f);

    }
}
