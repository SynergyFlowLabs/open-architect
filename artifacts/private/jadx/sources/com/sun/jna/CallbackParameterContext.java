package com.sun.jna;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class CallbackParameterContext extends FromNativeContext {
    private Object[] args;
    private int index;
    private Method method;

    CallbackParameterContext(Class<?> cls, Method method, Object[] objArr, int i10) {
        super(cls);
        this.method = method;
        this.args = objArr;
        this.index = i10;
    }

    public Object[] getArguments() {
        return this.args;
    }

    public int getIndex() {
        return this.index;
    }

    public Method getMethod() {
        return this.method;
    }
}
