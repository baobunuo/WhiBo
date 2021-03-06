package rs.fon.whibo.GDT.component.stoppingCriteria;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import rs.fon.whibo.GDT.treeModel.GDTTestUtil;
import rs.fon.whibo.problem.SubproblemParameter;

/**
 * @author s.velickovic@gmail.com
 */
public class TimeTest {
	private GDTTestUtil testUtil = new GDTTestUtil();

	private Time time;

	@Before
	public void setUp() throws Exception {
		List<SubproblemParameter> parameters = new LinkedList<SubproblemParameter>();
		SubproblemParameter subproblemParameter1 = new SubproblemParameter();
		// TODO Object or generics?
		subproblemParameter1.setParametertType(Integer.class);
		subproblemParameter1.setDefaultValue("5");
		subproblemParameter1.setMinValue("1");
		subproblemParameter1.setMaxValue("100000");
		subproblemParameter1.setXenteredValue("5");

		parameters.add(0, subproblemParameter1);

		time = new Time(parameters);

	}

	@Test
	public void testEvaluateStoppingCriteria() throws Exception {
		assertTrue(time.evaluateStoppingCriteria(testUtil.createExampleSet(),
				0, new Date()));
	}
}
