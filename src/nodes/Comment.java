package nodes;

import types.ClassNode;
import types.Node;

/**
 * Created by dennis on 8/30/17.
 */
public class Comment extends Node implements ClassNode
{
    private String text;

    public Comment(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }
}
