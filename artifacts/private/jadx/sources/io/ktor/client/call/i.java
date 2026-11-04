package io.ktor.client.call;

import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.util.date.GMTDate;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends io.ktor.client.statement.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f294265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final byte[] f294266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f294267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k1 f294268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final GMTDate f294269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final GMTDate f294270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final v0 f294271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f294272h;

    public i(@NotNull g call, @NotNull byte[] body, @NotNull io.ktor.client.statement.c origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f294265a = call;
        this.f294266b = body;
        this.f294267c = origin.j();
        this.f294268d = origin.k();
        this.f294269e = origin.f();
        this.f294270f = origin.i();
        this.f294271g = origin.O();
        this.f294272h = origin.getCoroutineContext();
    }

    public static /* synthetic */ void e() {
    }

    @Override // io.ktor.http.f1
    @NotNull
    public v0 O() {
        return this.f294271g;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public io.ktor.utils.io.h c() {
        return io.ktor.utils.io.c.e(this.f294266b, 0, 0, 6, null);
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public GMTDate f() {
        return this.f294269e;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f294272h;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public GMTDate i() {
        return this.f294270f;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public l1 j() {
        return this.f294267c;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public k1 k() {
        return this.f294268d;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g h() {
        return this.f294265a;
    }
}
