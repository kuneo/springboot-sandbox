package org.kuneo.stex.router;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleRouter extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    from("timer:test?period=10s")
        .process(printDate);
  }

  /** 日時を出力する */
  private Processor printDate = new Processor() {
    @Override
    public void process(Exchange exchange) throws Exception {
      System.out.println(new Date());
    }
  };
}
