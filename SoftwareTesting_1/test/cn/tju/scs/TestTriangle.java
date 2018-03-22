package cn.tju.scs;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestTriangle {
	private int a;
	private int b;
	private int c;
	private int expected;
	
	private Triangle triangle;
	
	public TestTriangle(int expected,int a, int b,int c)
	{
		this.expected = expected;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Before
	public void setUp(){
		triangle = new Triangle();
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		Object [][] object = {
				{0,2,2,2},
				{0,5,5,5},
				{0,6,6,6},
				{1,5,2,5},
				{1,2,2,3},
				{1,8,7,7},
				{-1,1,2,3},
				{2,5,6,2},
				{-1,7,6,1},
				{-1,-2,1,4},
				{-1,2,5,-8},
				{2,5,6,7}
		};  
        return Arrays.asList(object);		
	}

	@Test
	public void testGetTriangleKind() {

		assertEquals(this.expected, triangle.getTriangleKind(a, b, c));
	}

}
