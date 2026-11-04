package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f296877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.b f296878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f296879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f296880e;

    public g0(@NotNull h delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f296877b = delegate;
        this.f296878c = new kotlinx.io.b();
    }

    @o0
    public static /* synthetic */ void d() {
    }

    private final void h() {
        this.f296880e += this.f296879d - this.f296878c.j();
        this.f296879d = this.f296878c.j();
    }

    @NotNull
    public final h a() {
        return this.f296877b;
    }

    @Override // io.ktor.utils.io.h
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public kotlinx.io.b j() {
        h();
        this.f296879d += this.f296878c.la(this.f296877b.j());
        return this.f296878c;
    }

    @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
    public void c(@Nullable Throwable th2) {
        this.f296877b.c(th2);
        this.f296878c.close();
    }

    @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
    @Nullable
    public Throwable e() {
        return this.f296877b.e();
    }

    @Override // io.ktor.utils.io.h
    @Nullable
    public Object f(int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return j().j() < ((long) i10) ? this.f296877b.f(i10, dVar) : kotlin.coroutines.jvm.internal.b.a(true);
    }

    public final long g() {
        h();
        return this.f296880e;
    }

    @Override // io.ktor.utils.io.h
    public boolean k() {
        return this.f296878c.y1() && this.f296877b.k();
    }
}
