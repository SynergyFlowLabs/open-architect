package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public class y implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f120372b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AtomicLongArray f120373a;

    public y(int length) {
        this.f120373a = new AtomicLongArray(length);
    }

    private void readObject(ObjectInputStream s10) throws ClassNotFoundException, IOException {
        s10.defaultReadObject();
        int i10 = s10.readInt();
        com.google.common.primitives.k.c cVarE = com.google.common.primitives.k.e();
        for (int i11 = 0; i11 < i10; i11++) {
            cVarE.a(Double.doubleToRawLongBits(s10.readDouble()));
        }
        this.f120373a = new AtomicLongArray(cVarE.f().z());
    }

    private void writeObject(ObjectOutputStream s10) throws IOException {
        s10.defaultWriteObject();
        int iG = g();
        s10.writeInt(iG);
        for (int i10 = 0; i10 < iG; i10++) {
            s10.writeDouble(c(i10));
        }
    }

    @z7.a
    public double a(int i10, double delta) {
        while (true) {
            long j10 = this.f120373a.get(i10);
            double dLongBitsToDouble = Double.longBitsToDouble(j10) + delta;
            int i11 = i10;
            if (this.f120373a.compareAndSet(i11, j10, Double.doubleToRawLongBits(dLongBitsToDouble))) {
                return dLongBitsToDouble;
            }
            i10 = i11;
        }
    }

    public final boolean b(int i10, double expect, double update) {
        return this.f120373a.compareAndSet(i10, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final double c(int i10) {
        return Double.longBitsToDouble(this.f120373a.get(i10));
    }

    @z7.a
    public final double d(int i10, double delta) {
        while (true) {
            long j10 = this.f120373a.get(i10);
            double dLongBitsToDouble = Double.longBitsToDouble(j10);
            int i11 = i10;
            if (this.f120373a.compareAndSet(i11, j10, Double.doubleToRawLongBits(dLongBitsToDouble + delta))) {
                return dLongBitsToDouble;
            }
            i10 = i11;
        }
    }

    public final double e(int i10, double newValue) {
        return Double.longBitsToDouble(this.f120373a.getAndSet(i10, Double.doubleToRawLongBits(newValue)));
    }

    public final void f(int i10, double newValue) {
        this.f120373a.lazySet(i10, Double.doubleToRawLongBits(newValue));
    }

    public final int g() {
        return this.f120373a.length();
    }

    public final void h(int i10, double newValue) {
        this.f120373a.set(i10, Double.doubleToRawLongBits(newValue));
    }

    public final boolean i(int i10, double expect, double update) {
        return this.f120373a.weakCompareAndSet(i10, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public String toString() {
        int iG = g();
        int i10 = iG - 1;
        if (i10 == -1) {
            return okhttp3.v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder(iG * 19);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int i11 = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.f120373a.get(i11)));
            if (i11 == i10) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(' ');
            i11++;
        }
    }

    public y(double[] array) {
        int length = array.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = Double.doubleToRawLongBits(array[i10]);
        }
        this.f120373a = new AtomicLongArray(jArr);
    }
}
