package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f130149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.zxing.common.b f130150b;

    public c(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f130149a = bVar;
    }

    public c a(int i10, int i11, int i12, int i13) {
        return new c(this.f130149a.a(this.f130149a.e().a(i10, i11, i12, i13)));
    }

    public com.google.zxing.common.b b() throws m {
        if (this.f130150b == null) {
            this.f130150b = this.f130149a.b();
        }
        return this.f130150b;
    }

    public com.google.zxing.common.a c(int i10, com.google.zxing.common.a aVar) throws m {
        return this.f130149a.c(i10, aVar);
    }

    public int d() {
        return this.f130149a.d();
    }

    public int e() {
        return this.f130149a.f();
    }

    public boolean f() {
        return this.f130149a.e().g();
    }

    public boolean g() {
        return this.f130149a.e().h();
    }

    public c h() {
        return new c(this.f130149a.a(this.f130149a.e().i()));
    }

    public c i() {
        return new c(this.f130149a.a(this.f130149a.e().j()));
    }

    public String toString() {
        try {
            return b().toString();
        } catch (m unused) {
            return "";
        }
    }
}
