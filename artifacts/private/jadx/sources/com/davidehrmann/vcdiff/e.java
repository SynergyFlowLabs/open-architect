package com.davidehrmann.vcdiff;

import com.davidehrmann.vcdiff.engine.j;
import com.davidehrmann.vcdiff.engine.p;
import java.io.OutputStream;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f97802a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f97803b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f97804c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected byte[] f97805d = null;

    protected e() {
    }

    public static e f() {
        return new e();
    }

    public b5.d a(OutputStream outputStream) {
        return new b5.d(outputStream, d());
    }

    public d<OutputStream> b() {
        return new d<>(d());
    }

    public d<Appendable> c() {
        return new d<>(e());
    }

    public synchronized h<OutputStream> d() {
        EnumSet enumSetNoneOf;
        try {
            if (this.f97805d == null) {
                throw new IllegalArgumentException("dictionary not set");
            }
            enumSetNoneOf = EnumSet.noneOf(f.class);
            if (this.f97802a) {
                enumSetNoneOf.add(f.GOOGLE_INTERLEAVED);
            }
            if (this.f97803b) {
                enumSetNoneOf.add(f.GOOGLE_CHECKSUM);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new p(new j(this.f97802a), new com.davidehrmann.vcdiff.engine.c(this.f97805d), enumSetNoneOf, this.f97804c);
    }

    public synchronized h<Appendable> e() {
        try {
            if (this.f97805d == null) {
                throw new IllegalArgumentException("dictionary not set");
            }
            if (this.f97802a) {
                throw new IllegalArgumentException("Interleaved not supported with JSON encoder");
            }
            if (this.f97803b) {
                throw new IllegalArgumentException("Checksum not supported with JSON encoder");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new p(new com.davidehrmann.vcdiff.engine.d(), new com.davidehrmann.vcdiff.engine.c(this.f97805d), EnumSet.noneOf(f.class), this.f97804c);
    }

    public synchronized e g(boolean z10) {
        try {
            this.f97803b = z10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized e h(byte[] bArr) {
        this.f97805d = bArr;
        return this;
    }

    public synchronized e i(boolean z10) {
        try {
            this.f97802a = z10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized e j(boolean z10) {
        try {
            this.f97804c = z10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }
}
