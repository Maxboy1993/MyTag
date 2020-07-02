package by.nareiko.tag.support;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

public class JSPTafWithBody extends BodyTagSupport {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int doStartTag() throws JspException {
        try{
            JspWriter out = pageContext.getOut();
            out.write("<table border =\"3\" WIDTH=\"100%\">");
                out.write("<tr><td>");
        } catch (IOException e) {
            throw new JspException(e);
        }
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        try{
            JspWriter out = pageContext.getOut();
            out.write("</tr></td>");
            out.write("</table>");
        } catch (IOException e) {
            throw new JspException(e);
        }
        return SKIP_BODY;
        }

    @Override
    public int doAfterBody() throws JspException {
        if (num > 1){
            num -= 1;
            try{
                JspWriter out = pageContext.getOut();
                out.write("</tr></td><tr><td>");
            } catch (IOException e) {
                throw new JspException(e);
            }
            return EVAL_BODY_AGAIN;
        }else {
            return SKIP_BODY;
        }
    }
}
