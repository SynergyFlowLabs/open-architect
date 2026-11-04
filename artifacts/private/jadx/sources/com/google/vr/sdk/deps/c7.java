package com.google.vr.sdk.deps;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile int f127766a = -1;

    public static final <T extends c7> T f(T t10, byte[] bArr) throws b7 {
        return (T) g(t10, bArr, 0, bArr.length);
    }

    public static final <T extends c7> T g(T t10, byte[] bArr, int i10, int i11) throws b7 {
        try {
            t6 t6VarC = t6.c(bArr, i10, i11);
            t10.e(t6VarC);
            t6VarC.d(0);
            return t10;
        } catch (b7 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
        }
    }

    public static final boolean h(c7 c7Var, c7 c7Var2) {
        int iD;
        if (c7Var == c7Var2) {
            return true;
        }
        if (c7Var == null || c7Var2 == null) {
            return false;
        }
        if (c7Var.getClass() != c7Var2.getClass() || c7Var2.d() != (iD = c7Var.d())) {
            return false;
        }
        byte[] bArr = new byte[iD];
        byte[] bArr2 = new byte[iD];
        i(c7Var, bArr, 0, iD);
        i(c7Var2, bArr2, 0, iD);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void i(c7 c7Var, byte[] bArr, int i10, int i11) {
        try {
            u6 u6VarE = u6.e(bArr, i10, i11);
            c7Var.k(u6VarE);
            u6VarE.f();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public static final byte[] j(c7 c7Var) {
        int iD = c7Var.d();
        byte[] bArr = new byte[iD];
        i(c7Var, bArr, 0, iD);
        return bArr;
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c7 l() throws CloneNotSupportedException {
        return (c7) super.clone();
    }

    protected int b() {
        return 0;
    }

    public int c() {
        if (this.f127766a < 0) {
            d();
        }
        return this.f127766a;
    }

    public int d() {
        int iB = b();
        this.f127766a = iB;
        return iB;
    }

    public abstract c7 e(t6 t6Var) throws IOException;

    public void k(u6 u6Var) throws IOException {
    }

    public String toString() {
        return e3.a(this);
    }
}
