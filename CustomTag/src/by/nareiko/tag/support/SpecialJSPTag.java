package by.nareiko.tag.support;

import by.nareiko.tag.bean.JSPSetBean;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class SpecialJSPTag extends TagSupport {
    private JSPSetBean set;

    public void setSet(JSPSetBean set) {
        this.set = set;
    }

    @Override
    public int doStartTag() throws JspException {
        int size = new Integer(set.getSize());
        String str = "Size <br>" + size + "</br>";
        try{
            JspWriter out = pageContext.getOut();
            out.write(str);
            out.write("<table border =\"1\">");
            for (int i = 0; i < size; i++) {
                out.write("<tr><td>");
                out.write(set.getelement());
                out.write("</tr></td>");
                out.write("</table>");
            }
        } catch (IOException e) {
            throw new JspException(e);
        }
        return SKIP_BODY;
    }
}
