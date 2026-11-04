package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class n0 {
    @q8.e
    @ij.b("compute")
    @ij.f
    public io.reactivex.j0 a() {
        return io.reactivex.schedulers.b.a();
    }

    @q8.e
    @ij.b("io")
    @ij.f
    public io.reactivex.j0 b() {
        return io.reactivex.schedulers.b.d();
    }

    @q8.e
    @ij.b(io.sentry.protocol.b0.b.f306153h)
    @ij.f
    public io.reactivex.j0 c() {
        return io.reactivex.android.schedulers.a.b();
    }
}
