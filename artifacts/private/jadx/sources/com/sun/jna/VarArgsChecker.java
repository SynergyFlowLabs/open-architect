package com.sun.jna;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
abstract class VarArgsChecker {

    private static final class NoVarArgsChecker extends VarArgsChecker {
        private NoVarArgsChecker() {
            super();
        }

        @Override // com.sun.jna.VarArgsChecker
        int fixedArgs(Method method) {
            return 0;
        }

        @Override // com.sun.jna.VarArgsChecker
        boolean isVarArgs(Method method) {
            return false;
        }
    }

    private static final class RealVarArgsChecker extends VarArgsChecker {
        private RealVarArgsChecker() {
            super();
        }

        @Override // com.sun.jna.VarArgsChecker
        int fixedArgs(Method method) {
            if (method.isVarArgs()) {
                return method.getParameterTypes().length - 1;
            }
            return 0;
        }

        @Override // com.sun.jna.VarArgsChecker
        boolean isVarArgs(Method method) {
            return method.isVarArgs();
        }
    }

    static VarArgsChecker create() {
        try {
            return Method.class.getMethod("isVarArgs", null) != null ? new RealVarArgsChecker() : new NoVarArgsChecker();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new NoVarArgsChecker();
        }
    }

    abstract int fixedArgs(Method method);

    abstract boolean isVarArgs(Method method);

    private VarArgsChecker() {
    }
}
