package execution;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public interface WebDriverActionSupplier {
    WebDriverActionExecutor get() throws IOException;
}
