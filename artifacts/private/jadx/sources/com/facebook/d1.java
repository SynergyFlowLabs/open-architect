package com.facebook;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Handler f99528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final GraphRequest f99529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f99530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f99531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f99532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f99533f;

    public d1(@Nullable Handler handler, @NotNull GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f99528a = handler;
        this.f99529b = request;
        g0 g0Var = g0.f99617a;
        this.f99530c = g0.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(GraphRequest.b bVar, long j10, long j11) {
        ((GraphRequest.g) bVar).b(j10, j11);
    }

    public final void b(long j10) {
        long j11 = this.f99531d + j10;
        this.f99531d = j11;
        if (j11 < this.f99532e + this.f99530c && j11 < this.f99533f) {
            return;
        }
        f();
    }

    public final void c(long j10) {
        this.f99533f += j10;
    }

    public final long d() {
        return this.f99533f;
    }

    public final long e() {
        return this.f99531d;
    }

    public final void f() {
        if (this.f99531d > this.f99532e) {
            final GraphRequest.b bVarD = this.f99529b.D();
            final long j10 = this.f99533f;
            if (j10 <= 0 || !(bVarD instanceof GraphRequest.g)) {
                return;
            }
            final long j11 = this.f99531d;
            Handler handler = this.f99528a;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable() { // from class: com.facebook.c1
                @Override // java.lang.Runnable
                public final void run() {
                    d1.g(bVarD, j11, j10);
                }
            }))) == null) {
                ((GraphRequest.g) bVarD).b(j11, j10);
            }
            this.f99532e = this.f99531d;
        }
    }
}
