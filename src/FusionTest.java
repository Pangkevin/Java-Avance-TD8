import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;


import org.junit.Test;

public class FusionTest {

	@Test(expected=IllegalArgumentException.class)
	public void testFusionSizes() {
		List<String> l1 = new ArrayList<>();
		List<Integer> l2 = new LinkedList<>();
		l1.add("toto");
		Fusion.fusion(l1,l2);
	}
	
	@Test
	public void testFusionEmpty() {
		List<String> l1 = new ArrayList<>();
		List<Integer> l2 = new LinkedList<>();
		assertEquals(Fusion.fusion(l1,l2), Collections.emptyList());
	}
	
	@Test
	public void testFusion() {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		for(int i=0;i<200;i++) {
			if(i%2==0) {
				l1.add(i);
			}
			else {
				l2.add(i);
			}
			l3.add(i);
		}
		assertEquals(Fusion.fusion(l1,l2), l3);
	}
	
	@Test
	public void testFusion2() {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<200;i++) {
			int a = r.nextInt();
			if(i%2==0) {
				l1.add(a);
			}
			else {
				l2.add(a);
			}
			l3.add(a);
		}
		assertEquals(Fusion.fusion(l1,l2), l3);
	}
	
	@Test
	public void testFusion3() {
		List<Double> l1 = new ArrayList<>();
		List<Double> l2 = new ArrayList<>();
		List<Double> l3 = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<200;i++) {
			double a = r.nextDouble();
			if(i%2==0) {
				l1.add(a);
			}
			else {
				l2.add(a);
			}
			l3.add(a);
		}
		assertEquals(Fusion.fusion(l1,l2), l3);
	}

}

