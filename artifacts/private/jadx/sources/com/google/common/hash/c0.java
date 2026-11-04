package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@k
final class c0 extends k0 implements Serializable, a0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f118753j = 7249069246863182397L;

    private void readObject(ObjectInputStream s10) throws ClassNotFoundException, IOException {
        s10.defaultReadObject();
        this.f118856c = 0;
        this.f118854a = null;
        this.f118855b = s10.readLong();
    }

    private void writeObject(ObjectOutputStream s10) throws IOException {
        s10.defaultWriteObject();
        s10.writeLong(sum());
    }

    @Override // com.google.common.hash.a0
    public void a() {
        add(1L);
    }

    @Override // com.google.common.hash.a0
    public void add(long x10) {
        int length;
        k0.b bVar;
        k0.b[] bVarArr = this.f118854a;
        if (bVarArr == null) {
            long j10 = this.f118855b;
            if (c(j10, j10 + x10)) {
                return;
            }
        }
        int[] iArr = k0.f118848d.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j11 = bVar.f118866h;
            zA = bVar.a(j11, j11 + x10);
            if (zA) {
                return;
            }
        }
        h(x10, iArr, zA);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // com.google.common.hash.k0
    final long e(long v10, long x10) {
        return v10 + x10;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    public void i() {
        add(-1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    public void j() {
        g(0L);
    }

    public long k() {
        long j10 = this.f118855b;
        k0.b[] bVarArr = this.f118854a;
        this.f118855b = 0L;
        if (bVarArr != null) {
            for (k0.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f118866h;
                    bVar.f118866h = 0L;
                }
            }
        }
        return j10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // com.google.common.hash.a0
    public long sum() {
        long j10 = this.f118855b;
        k0.b[] bVarArr = this.f118854a;
        if (bVarArr != null) {
            for (k0.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f118866h;
                }
            }
        }
        return j10;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
