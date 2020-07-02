package by.nareiko.tag.bean;

import java.util.Iterator;
import java.util.Set;

public class JSPSetBean {
    private Iterator iterator;
    private Set set;

    public JSPSetBean(Set set){
        this.set = set;
    }

    public String getSize(){
        iterator = set.iterator();
        return Integer.toString(set.size());
    }

    public String getelement(){
        return iterator.next().toString();
    }
}
