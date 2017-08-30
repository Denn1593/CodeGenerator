package nodes;

import types.ClassNode;
import types.Node;

/**
 * Created by dennis on 8/30/17.
 */
public class Name extends Node implements ClassNode
{
    private String name;

    public Name(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
