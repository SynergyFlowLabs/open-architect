package com.google.common.cache;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b(emulated = true)
final class s extends b0 implements Serializable, q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f116976j = 7249069246863182397L;

    private void readObject(ObjectInputStream s10) throws ClassNotFoundException, IOException {
        s10.defaultReadObject();
        this.f116736c = 0;
        this.f116734a = null;
        this.f116735b = s10.readLong();
    }

    private void writeObject(ObjectOutputStream s10) throws IOException {
        s10.defaultWriteObject();
        s10.writeLong(sum());
    }

    @Override // com.google.common.cache.q
    public void a() {
        add(1L);
    }

    @Override // com.google.common.cache.q
    public void add(long x10) {
        int length;
        b0.b bVar;
        b0.b[] bVarArr = this.f116734a;
        if (bVarArr == null) {
            long j10 = this.f116735b;
            if (c(j10, j10 + x10)) {
                return;
            }
        }
        int[] iArr = b0.f116728d.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j11 = bVar.f116746h;
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

    @Override // com.google.common.cache.b0
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
        long j10 = this.f116735b;
        b0.b[] bVarArr = this.f116734a;
        this.f116735b = 0L;
        if (bVarArr != null) {
            for (b0.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f116746h;
                    bVar.f116746h = 0L;
                }
            }
        }
        return j10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // com.google.common.cache.q
    public long sum() {
        long j10 = this.f116735b;
        b0.b[] bVarArr = this.f116734a;
        if (bVarArr != null) {
            for (b0.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f116746h;
                }
            }
        }
        return j10;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
