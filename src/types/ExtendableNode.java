package types;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dennis on 8/30/17.
 */
public class ExtendableNode extends Node
{
    List<Node> listOfChildNodes = new ArrayList<>();

    public List<Node> getListOfChildNodes()
    {
        return listOfChildNodes;
    }

    public void connect(Node childNode)
    {
        childNode.setParentNode(this);
        listOfChildNodes.add(childNode);
    }
}
