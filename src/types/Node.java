package types;

/**
 * Created by dennis on 8/30/17.
 */
public class Node
{
    private Node parentNode;

    void setParentNode(Node parentNode)
    {
        this.parentNode = parentNode;
    }

    public Node getParentNode()
    {
        return parentNode;
    }
}
