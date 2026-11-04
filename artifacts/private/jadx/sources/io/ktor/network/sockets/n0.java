package io.ktor.network.sockets;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 implements m<n0, p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.network.selector.j f296295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private p0 f296296b;

    public n0(@NotNull io.ktor.network.selector.j selector, @NotNull p0 options) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f296295a = selector;
        this.f296296b = options;
    }

    @Override // io.ktor.network.sockets.m
    public void a(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.f296296b = p0Var;
    }

    @Override // io.ktor.network.sockets.m
    @NotNull
    public p0 b() {
        return this.f296296b;
    }

    @Override // io.ktor.network.sockets.m
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n0 c(@NotNull Function1<? super p0, Unit> function1) {
        return (n0) m.a.a(this, function1);
    }

    @NotNull
    public final z0 e() {
        return new z0(this.f296295a, b().g());
    }

    @NotNull
    public final e1 f() {
        return new e1(this.f296295a, b().g().r());
    }
}
