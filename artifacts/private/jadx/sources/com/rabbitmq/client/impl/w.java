package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
final class w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f265873g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f265874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y0 f265875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f265876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<byte[]> f265877d = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f265878e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f265879f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f265880a;

        static {
            int[] iArr = new int[b.values().length];
            f265880a = iArr;
            try {
                iArr[b.EXPECTING_METHOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f265880a[b.EXPECTING_CONTENT_HEADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f265880a[b.EXPECTING_CONTENT_BODY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum b {
        EXPECTING_METHOD,
        EXPECTING_CONTENT_HEADER,
        EXPECTING_CONTENT_BODY,
        COMPLETE;

        static {
            int i10 = 3 & 0;
        }
    }

    public w(y0 y0Var, j jVar, byte[] bArr) {
        this.f265875b = y0Var;
        this.f265876c = jVar;
        this.f265879f = 0L;
        a(bArr);
        if (y0Var == null) {
            this.f265874a = b.EXPECTING_METHOD;
        } else if (jVar == null) {
            this.f265874a = y0Var.Y() ? b.EXPECTING_CONTENT_HEADER : b.COMPLETE;
        } else {
            this.f265879f = jVar.h() - ((long) this.f265878e);
            k();
        }
    }

    private void a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            this.f265877d.add(bArr);
            this.f265878e += bArr.length;
        }
    }

    private byte[] b() {
        if (this.f265878e == 0) {
            return f265873g;
        }
        if (this.f265877d.size() == 1) {
            return this.f265877d.get(0);
        }
        byte[] bArr = new byte[this.f265878e];
        int length = 0;
        for (byte[] bArr2 : this.f265877d) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        this.f265877d.clear();
        this.f265877d.add(bArr);
        return bArr;
    }

    private void c(s0 s0Var) {
        if (s0Var.f265819a != 3) {
            throw new com.rabbitmq.client.j2(s0Var, 3);
        }
        byte[] bArrG = s0Var.g();
        this.f265879f -= (long) bArrG.length;
        k();
        if (this.f265879f < 0) {
            throw new UnsupportedOperationException("%%%%%% FIXME unimplemented");
        }
        a(bArrG);
    }

    private void d(s0 s0Var) throws IOException {
        if (s0Var.f265819a != 2) {
            throw new com.rabbitmq.client.j2(s0Var, 2);
        }
        j jVarA = k.a(s0Var.e());
        this.f265876c = jVarA;
        this.f265879f = jVarA.h();
        k();
    }

    private void e(s0 s0Var) throws IOException {
        if (s0Var.f265819a != 1) {
            throw new com.rabbitmq.client.j2(s0Var, 1);
        }
        y0 y0VarB = k.b(s0Var.e());
        this.f265875b = y0VarB;
        this.f265874a = y0VarB.Y() ? b.EXPECTING_CONTENT_HEADER : b.COMPLETE;
    }

    private void k() {
        this.f265874a = this.f265879f > 0 ? b.EXPECTING_CONTENT_BODY : b.COMPLETE;
    }

    public synchronized byte[] f() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return b();
    }

    public synchronized j g() {
        return this.f265876c;
    }

    public synchronized y0 h() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f265875b;
    }

    public synchronized boolean i(s0 s0Var) throws IOException {
        try {
            int i10 = a.f265880a[this.f265874a.ordinal()];
            if (i10 == 1) {
                e(s0Var);
            } else if (i10 == 2) {
                d(s0Var);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Bad Command State " + this.f265874a);
                }
                c(s0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j();
    }

    public synchronized boolean j() {
        return this.f265874a == b.COMPLETE;
    }
}
