package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f125321a;

    public b0(String str) {
        this.f125321a = str;
    }

    private BigDecimal a() {
        return e0.b(this.f125321a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return a();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f125321a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i10 = 2 >> 1;
            return true;
        }
        if (obj instanceof b0) {
            return this.f125321a.equals(((b0) obj).f125321a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f125321a);
    }

    public int hashCode() {
        return this.f125321a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f125321a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f125321a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f125321a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f125321a;
    }
}
