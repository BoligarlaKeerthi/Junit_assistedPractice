package com.app.junitDemo;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.TYPE, ElementType.METHOD}) // where will annotation be applied- on a method
@Retention(RetentionPolicy.RUNTIME) // when will annotation be triggered
@Tag("dev")  // name of the annotation
@Test  // our annotation is replica of @test annotation

public @interface MetaAnnotation {
	
	// to create an annotation in Junit you will create an Interface

}

