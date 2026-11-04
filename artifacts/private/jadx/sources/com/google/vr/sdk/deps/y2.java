package com.google.vr.sdk.deps;

import com.google.vr.sdk.deps.b3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class y2<T extends b3<T>> {
    y2() {
    }

    int a(Map.Entry<?, ?> entry) {
        throw new NoSuchMethodError();
    }

    a3<i3.c> b(Object obj) {
        return ((i3.b) obj).f129435f;
    }

    Object c(x2 x2Var, t4 t4Var, int i10) {
        return x2Var.a(t4Var, i10);
    }

    <UT, UB> UB d(j5 j5Var, Object obj, x2 x2Var, a3<i3.c> a3Var, UB ub2, a6<UT, UB> a6Var) throws IOException {
        v2.i0();
        throw new NoSuchMethodError();
    }

    void e(k2 k2Var, Object obj, x2 x2Var, a3<i3.c> a3Var) throws IOException {
        byte[] bArr;
        t4 t4VarB1 = v2.j0().G1().B1();
        int iV = k2Var.v();
        if (iV == 0) {
            bArr = k3.f129469b;
        } else {
            byte[] bArr2 = new byte[iV];
            k2Var.t(bArr2, 0, 0, iV);
            bArr = bArr2;
        }
        v2 v2VarW = v2.W(ByteBuffer.wrap(bArr), true);
        f5.a().c(t4VarB1).g(t4VarB1, v2VarW, x2Var);
        a3Var.g(null, t4VarB1);
        if (v2VarW.y() != Integer.MAX_VALUE) {
            throw v3.d();
        }
    }

    void f(j5 j5Var, Object obj, x2 x2Var, a3<i3.c> a3Var) throws IOException {
        a3Var.g(null, j5Var.M(v2.j0().getClass(), x2Var));
    }

    void g(q6 q6Var, Map.Entry<?, ?> entry) throws IOException {
        throw new NoSuchMethodError();
    }

    void h(Object obj, a3<i3.c> a3Var) {
        ((i3.b) obj).f129435f = a3Var;
    }

    boolean i(t4 t4Var) {
        return t4Var instanceof i3.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    a3<i3.c> j(Object obj) {
        a3<i3.c> a3VarB = b(obj);
        if (!a3VarB.p()) {
            return a3VarB;
        }
        a3 a3VarClone = a3VarB.clone();
        h(obj, a3VarClone);
        return a3VarClone;
    }

    void k(Object obj) {
        b(obj).o();
    }

    y2(byte b10) {
        this();
    }
}
