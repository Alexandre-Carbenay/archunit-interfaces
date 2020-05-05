package com.example.usage1;

import com.example.child.ChildInterface;

public class RootMethodUsage {

    private ChildInterface child;

    public RootMethodUsage(ChildInterface child) {
        this.child = child;
    }

    public void callRootMethod() {
        child.someRootMethod();
    }

}
