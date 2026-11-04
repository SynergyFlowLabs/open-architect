package com.google.gson;

import com.google.gson.internal.j0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l {
    @Deprecated
    public l() {
    }

    public long A() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number B() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short C() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String D() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean F() {
        return this instanceof i;
    }

    public boolean G() {
        return this instanceof n;
    }

    public boolean J() {
        return this instanceof o;
    }

    public boolean K() {
        return this instanceof r;
    }

    public abstract l c();

    public BigDecimal i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public i t() {
        if (F()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            com.google.gson.stream.d dVar = new com.google.gson.stream.d(j0.c(sb2));
            dVar.d0(y.LENIENT);
            j0.b(this, dVar);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @z7.a
    public n u() {
        if (G()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public o v() {
        if (J()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public r w() {
        if (K()) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }
}
