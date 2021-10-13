package com.example.demo;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import reactor.core.*;
import reactor.core.publisher.*;
@SpringBootApplication
public class ReactiveSpringApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(ReactiveSpringApplication.class, args);
		Flux<String> namePublisher=Flux.just("Piya","Riya","Siya","Niya") ;
		//namePublisher.subscribe(System.out::println);
		namePublisher.subscribe(new Subscriber<String>() {

			@Override
			public void onSubscribe(Subscription s) {
			s.request(4);	
			System.out.println("on subscibe called..!");
			System.out.println(s);
				
			}

			@Override
			public void onNext(String t) {
			System.out.println(" from on next "+t.toString());
				
			}

			@Override
			public void onError(Throwable t) {
	    System.out.println(t.getMessage());
				
			}

			@Override
			public void onComplete() {
			System.out.println("Completed...!");
				
			}});
		ctx.close();
	}

}
