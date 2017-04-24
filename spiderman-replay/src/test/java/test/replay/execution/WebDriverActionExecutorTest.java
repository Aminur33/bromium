package test.replay.execution;

import com.hribol.spiderman.replay.execution.WebDriverActionExecutor;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class WebDriverActionExecutorTest {

    @Test
    public void correctlyBuildsConfiguration() throws IOException {
        String pathToDriverExecutable = "file:///somepath";
        String baseURI = "http://tennikafe.com";
        int precision = 500;
        int timeout = 10;

        WebDriverActionExecutor webDriverActionExecutor = new WebDriverActionExecutor()
                .pathToDriverExecutable(pathToDriverExecutable)
                .baseURI(baseURI)
                .measurementsPrecisionInMilliseconds(precision)
                .timeoutInSeconds(timeout);

        assertEquals(pathToDriverExecutable, webDriverActionExecutor.getPathToDriverExecutable());
        assertEquals(baseURI, webDriverActionExecutor.getBaseURI());
        assertEquals(precision, webDriverActionExecutor.getMeasurementsPrecisionMilli());
        assertEquals(timeout, webDriverActionExecutor.getTimeout());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void throwsExceptionIfBaseURIIsNotSet() throws IOException {
        String pathToDriverExecutable = "file:///somepath";
        int precision = 500;
        int timeout = 10;

        WebDriverActionExecutor webDriverActionExecutor = new WebDriverActionExecutor()
                .pathToDriverExecutable(pathToDriverExecutable)
                .measurementsPrecisionInMilliseconds(precision)
                .timeoutInSeconds(timeout);

        expectedException.expect(IOException.class);
        webDriverActionExecutor.getBaseURI();
    }

    @Test
    public void throwsExceptionIfDriverIsNotSet() throws IOException {
        WebDriverActionExecutor webDriverActionExecutor = new WebDriverActionExecutor();
        expectedException.expect(IOException.class);
        webDriverActionExecutor.getPathToDriverExecutable();
    }
}