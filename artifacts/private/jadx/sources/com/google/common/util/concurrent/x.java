package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@o0
public class x extends Number implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f120370b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AtomicLong f120371a;

    public x(double initialValue) {
        this.f120371a = new AtomicLong(Double.doubleToRawLongBits(initialValue));
    }

    private void readObject(ObjectInputStream s10) throws ClassNotFoundException, IOException {
        s10.defaultReadObject();
        this.f120371a = new AtomicLong();
        g(s10.readDouble());
    }

    private void writeObject(ObjectOutputStream s10) throws IOException {
        s10.defaultWriteObject();
        s10.writeDouble(c());
    }

    @z7.a
    public final double a(double delta) {
        long j10;
        double dLongBitsToDouble;
        do {
            j10 = this.f120371a.get();
            dLongBitsToDouble = Double.longBitsToDouble(j10) + delta;
        } while (!this.f120371a.compareAndSet(j10, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean b(double expect, double update) {
        return this.f120371a.compareAndSet(Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final double c() {
        return Double.longBitsToDouble(this.f120371a.get());
    }

    @z7.a
    public final double d(double delta) {
        long j10;
        double dLongBitsToDouble;
        do {
            j10 = this.f120371a.get();
            dLongBitsToDouble = Double.longBitsToDouble(j10);
        } while (!this.f120371a.compareAndSet(j10, Double.doubleToRawLongBits(dLongBitsToDouble + delta)));
        return dLongBitsToDouble;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return c();
    }

    public final double e(double newValue) {
        return Double.longBitsToDouble(this.f120371a.getAndSet(Double.doubleToRawLongBits(newValue)));
    }

    public final void f(double newValue) {
        this.f120371a.lazySet(Double.doubleToRawLongBits(newValue));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) c();
    }

    public final void g(double newValue) {
        this.f120371a.set(Double.doubleToRawLongBits(newValue));
    }

    public final boolean h(double expect, double update) {
        return this.f120371a.weakCompareAndSet(Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) c();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) c();
    }

    public String toString() {
        return Double.toString(c());
    }

    public x() {
        this(0.0d);
    }
}
