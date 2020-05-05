package com.example.usage2;

import com.example.child.ChildInterface;

public class ChildMethodUsage {

    private ChildInterface child;

    public ChildMethodUsage(ChildInterface child) {
        this.child = child;
    }

    public void callChildMethod() {
        child.someChildMethod();
    }

}
