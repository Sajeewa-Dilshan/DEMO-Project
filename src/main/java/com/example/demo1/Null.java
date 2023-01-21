package com.example.demo1;

import com.example.demo1.model.nullpointerexceptionmodels.Attribute;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Null {
    String s;

    public static void main(String[] args) {


        Null n = new Null();
        String s = "";
        System.out.println(Objects.isNull(s));

        System.out.println(Arrays.asList(1, 2, 3).contains(1));
        s = null;
        String z = "y";
        System.out.println("Y".equalsIgnoreCase(z));
        System.out.println(Objects.isNull(s));
        Integer i = null;
        String s1 = String.valueOf(i);
        System.out.println(s1);
        s1 = null;
        System.out.println(s1 + System.currentTimeMillis() + "zsfsdf");
//        +gsmAccount.getSubscriberNodeId().toString().substring(gsmAccount.getSubscriberNodeId().toString().length()-2)
        System.out.println("4a".substring("4a".length() - 2));

        Long l = null;

        System.out.println(String.valueOf(l));
        if (Objects.nonNull(String.valueOf(l))) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println(Optional.empty());
        LocalDateTime ldt1 = LocalDateTime.now().minusDays(3);
        LocalDateTime ldt2 = LocalDateTime.now();

        System.out.println(ldt1.until(ldt2, ChronoUnit.DAYS));
        System.out.println(ldt2.isAfter(ldt1));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2022-11-17 15:16:09", dateTimeFormatter);
        System.out.println("fff"+dateTime);
    }



//    public class IsMockEndpointsAndSkipJUnit4Test extends CamelTestSupport {
//        @Override
//        public String isMockEndpointsAndSkip() {
//            return "direct:foo";
//        }
//
//        @Test public void testMockEndpointAndSkip() throws Exception {
//            getMockEndpoint("mock:result").expectedBodiesReceived("Hello World");
//            getMockEndpoint("mock:direct:foo").expectedMessageCount(1);
//            template.sendBody("direct:start", "Hello World");
//            assertMockEndpointsSatisfied();
//            SedaEndpoint seda = context.getEndpoint("seda:foo", SedaEndpoint.class);
//            assertEquals(0, seda.getCurrentQueueSize()); }
//
//        @Override protected RouteBuilder createRouteBuilder() throws Exception {
//            return new RouteBuilder() {
//                @Override public void configure() throws Exception {
//                    from("direct:start").to("direct:foo").to("mock:result");
//                    from("direct:foo").transform(constant("Bye World")).to("seda:foo");
//                }
//            };
//        }
//    }

}
