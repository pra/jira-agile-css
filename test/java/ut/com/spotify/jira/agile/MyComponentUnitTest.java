package ut.com.spotify.jira.agile;

import org.junit.Test;
import com.spotify.jira.agile.MyPluginComponent;
import com.spotify.jira.agile.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}