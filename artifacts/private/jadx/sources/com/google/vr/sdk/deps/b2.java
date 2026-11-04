package com.google.vr.sdk.deps;

import com.google.vr.sdk.deps.b2;
import com.google.vr.sdk.deps.c2;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b2<MessageType extends b2<MessageType, BuilderType>, BuilderType extends c2<MessageType, BuilderType>> implements t4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static boolean f127708b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f127709a = 0;

    private Class<b2<MessageType, BuilderType>> b() {
        return (Class<b2<MessageType, BuilderType>>) getClass();
    }

    private String f(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 62 + String.valueOf(str).length());
        sb2.append("Serializing ");
        sb2.append(name);
        sb2.append(" to a ");
        sb2.append(str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    int d(k5 k5Var) {
        int iC = c();
        if (iC != -1) {
            return iC;
        }
        int iC2 = k5Var.c(this);
        g(iC2);
        return iC2;
    }

    protected final int e() {
        return f5.a().c(this).c(this);
    }

    void g(int i10) {
        throw new UnsupportedOperationException();
    }

    protected final void h(t2 t2Var) throws IOException {
        f5.a().b(b()).f(this, q6.b(t2Var));
    }

    @Override // com.google.vr.sdk.deps.t4
    public k2 u1() {
        try {
            n4 n4VarC = k2.C(w1());
            a(n4VarC.b());
            return n4VarC.a();
        } catch (IOException e10) {
            throw new RuntimeException(f("ByteString"), e10);
        }
    }
}
