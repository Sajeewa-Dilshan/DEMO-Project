package com.example.demo1.trials.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringStreamOptional {

//    public static void main(String[] args) {
//        List<Optional<String>> listOfOptionals = Arrays.asList(
//                Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));
//        List<String> collect = listOfOptionals.stream().filter(Optional::isPresent)
//                .map(Optional::get).collect(Collectors.toList());
//        System.out.println(collect);
//
//        List<String> collect2= listOfOptionals.stream().filter(Optional::isPresent)
//                .map(Optional::get).collect(Collectors.toList());
//        System.out.println(collect2);
//
//        List<String> stringList= Arrays.asList("fdbg","zfff","zxfvzf");
//
//        final List<String> f = stringList.stream().filter(a ->a.startsWith("f"))
//                .collect(Collectors.toList());
//        System.out.println(f);
//
//    }


    public static void main(String[] args) {

        List<Attribute> attributes=new ArrayList<>();
        attributes.add(new Attribute("dd","ddd"));
        attributes.add(new Attribute("df","dff"));
        attributes.add(new Attribute("dd","ddd"));

        Optional<String> dd = attributes.stream().filter(a -> a.getName().equals("ddy")).map(Attribute::getValue).findAny();


        System.out.println(dd.orElse(null));

    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Attribute{
    String name;
    String value;
}
