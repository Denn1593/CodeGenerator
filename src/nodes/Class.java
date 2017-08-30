package nodes;

import types.ClassNode;
import types.ExtendableNode;
import types.Node;

/**
 * Created by dennis on 8/30/17.
 */
public class Class extends ExtendableNode
{
    public void addConnection(Node childNode)
    {
        if(childNode instanceof ClassNode)
        {
            connect(childNode);
        }
        else
        {
            throw new RuntimeException("Node is not a ClassNode");
        }
    }
}
