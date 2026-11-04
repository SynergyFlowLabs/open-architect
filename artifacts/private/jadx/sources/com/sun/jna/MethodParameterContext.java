package com.sun.jna;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class MethodParameterContext extends FunctionParameterContext {
    private Method method;

    MethodParameterContext(Function function, Object[] objArr, int i10, Method method) {
        super(function, objArr, i10);
        this.method = method;
    }

    public Method getMethod() {
        return this.method;
    }
}
