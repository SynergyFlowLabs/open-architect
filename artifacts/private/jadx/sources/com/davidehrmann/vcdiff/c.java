package com.davidehrmann.vcdiff;

import com.davidehrmann.vcdiff.engine.o;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f97798a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f97799b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f97800c = true;

    protected c() {
    }

    public static c g() {
        return new c();
    }

    public b5.c a(InputStream inputStream, ByteBuffer byteBuffer) {
        return new b5.c(inputStream, byteBuffer, e());
    }

    public b5.c b(InputStream inputStream, byte[] bArr) {
        return a(inputStream, ByteBuffer.wrap(bArr));
    }

    public b c() {
        return new b(e());
    }

    public b d(g gVar) {
        return new b(f(gVar));
    }

    public g e() {
        return f(new o());
    }

    public synchronized g f(g gVar) {
        try {
            long j10 = this.f97798a;
            if (j10 >= 0) {
                gVar.h(j10);
            }
            int i10 = this.f97799b;
            if (i10 >= 0) {
                gVar.i(i10);
            }
            gVar.g(this.f97800c);
        } catch (Throwable th2) {
            throw th2;
        }
        return gVar;
    }

    public synchronized c h(boolean z10) {
        this.f97800c = z10;
        return this;
    }

    public synchronized c i(long j10) {
        try {
            if (j10 < 0) {
                throw new IllegalArgumentException("maximumTargetFileSize can't be negative");
            }
            this.f97798a = j10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized c j(int i10) {
        try {
            if (i10 < 0) {
                throw new IllegalArgumentException("maximumTargetWindowSize can't be negative");
            }
            this.f97799b = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }
}
