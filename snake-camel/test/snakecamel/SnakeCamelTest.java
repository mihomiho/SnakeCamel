package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void test() {

		StringBuilder camelcase = new StringBuilder();
		String expected = "_";
	    String actual = camelcase.substring(5, 1);
	    assertThat(actual,is(expected));
	}

}
