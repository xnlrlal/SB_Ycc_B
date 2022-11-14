package com.youngtvjobs.ycc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.youngtvjobs.ycc.course.PageResolver;

public class PageResolverTest {

	@Test
	public void test() {
		PageResolver pr = new PageResolver(150, 1);
		pr.print();
		System.out.println("pr = " + pr);
		System.out.println();
		
		assertTrue(pr.getBeginPage() == 1);
		assertTrue(pr.getEndPage() == 10);
	}
}