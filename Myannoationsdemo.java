package com.app.junitDemo;

import java.lang.annotation.Annotation;

public class Myannoationsdemo implements MetaAnnotation {
	
	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@MetaAnnotation
	public void testannotation()
	{
		System.out.println("This method is executed by my Annotation");
	}
	

}


