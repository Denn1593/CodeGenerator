package traversal;

import nodes.Class;
import nodes.Comment;
import nodes.Name;
import types.ExtendableNode;
import types.Node;

/**
 * Created by dennis on 8/30/17.
 */
public class SyntaxTreeTraverser
{
    private Node rootNode;
    private String output = "";

    public SyntaxTreeTraverser(Node rootNode)
    {
        this.rootNode = rootNode;
    }

    public String generateCode()
    {
        traverse(rootNode, 0);

        return output;
    }

    private void traverse(Node currentNode, int indent)
    {
        if(currentNode instanceof ExtendableNode)
        {
            if(currentNode instanceof Class)
            {
                output += "class ";
                indent++;
            }
            for (int i = 0; i < ((ExtendableNode) currentNode).getListOfChildNodes().size(); i++)
            {
                traverse(((ExtendableNode) currentNode).getListOfChildNodes().get(i), indent);
            }
        }
        else
        {
            if (currentNode instanceof Name)
            {
                if (currentNode.getParentNode() instanceof Class)
                {
                    output += ((Name) currentNode).getName() + "\n{\n";
                }
            }
            if (currentNode instanceof Comment)
            {
                addIndentation(indent);
                output += "//" + ((Comment) currentNode).getText();
            }
        }
    }

    private void addIndentation(int indent)
    {
        String indentation = "    ";

        for (int i = 0; i < indent; i++)
        {
            output += indentation;
        }
    }
}
