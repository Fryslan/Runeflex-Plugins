import com.runeflex.api.BackgroundPlugin;
import com.runeflex.api.PluginInfo;
import com.runeflex.api.util.Time;

/**
 * @author Tyler Sedlar
 * @since 2/26/2015
 */
@PluginInfo(name = "Test", author = "Tyler Sedlar", version = "1.0.0")
public class Test extends BackgroundPlugin {

    @Override
    public void run() {
        System.out.println("Test");
        Time.sleep(101);
    }
}
