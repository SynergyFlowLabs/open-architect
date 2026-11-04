package com.sun.jna;

/* JADX INFO: loaded from: classes13.dex */
public class FunctionResultContext extends FromNativeContext {
    private Object[] args;
    private Function function;

    FunctionResultContext(Class<?> cls, Function function, Object[] objArr) {
        super(cls);
        this.function = function;
        this.args = objArr;
    }

    public Object[] getArguments() {
        return this.args;
    }

    public Function getFunction() {
        return this.function;
    }
}
