package com.google.protobuf.nano;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile int f126209a = -1;

    public static final <T extends j> T f(T t10, byte[] bArr) throws h {
        return (T) g(t10, bArr, 0, bArr.length);
    }

    public static final <T extends j> T g(T t10, byte[] bArr, int i10, int i11) throws h {
        try {
            a aVarI = a.i(bArr, i10, i11);
            t10.e(aVarI);
            aVarI.a(0);
            return t10;
        } catch (h e10) {
            throw e10;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean h(j jVar, j jVar2) {
        int iD;
        if (jVar == jVar2) {
            return true;
        }
        if (jVar != null && jVar2 != null) {
            if (jVar.getClass() == jVar2.getClass() && jVar2.d() == (iD = jVar.d())) {
                byte[] bArr = new byte[iD];
                byte[] bArr2 = new byte[iD];
                i(jVar, bArr, 0, iD);
                i(jVar2, bArr2, 0, iD);
                return Arrays.equals(bArr, bArr2);
            }
            return false;
        }
        return false;
    }

    public static final void i(j jVar, byte[] bArr, int i10, int i11) {
        try {
            b bVarX = b.X(bArr, i10, i11);
            jVar.k(bVarX);
            bVarX.a();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public static final byte[] j(j jVar) {
        int iD = jVar.d();
        byte[] bArr = new byte[iD];
        i(jVar, bArr, 0, iD);
        return bArr;
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j clone() throws CloneNotSupportedException {
        return (j) super.clone();
    }

    protected int b() {
        return 0;
    }

    public int c() {
        if (this.f126209a < 0) {
            d();
        }
        return this.f126209a;
    }

    public int d() {
        int iB = b();
        this.f126209a = iB;
        return iB;
    }

    public abstract j e(a aVar) throws IOException;

    public void k(b bVar) throws IOException {
    }

    public String toString() {
        return k.d(this);
    }
}
