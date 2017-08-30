import nodes.Class;
import nodes.Comment;
import nodes.Name;
import traversal.SyntaxTreeTraverser;

/**
 * Created by dennis on 8/30/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        Class c = new Class();
        Name className = new Name("Main");
        Comment comment = new Comment("asdfkek");
        c.addConnection(className);
        c.addConnection(comment);

        SyntaxTreeTraverser treeTraverser = new SyntaxTreeTraverser(c);
        System.out.println(treeTraverser.generateCode());
    }
}
