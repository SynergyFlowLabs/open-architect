package io.ktor.client.plugins.sse;

import io.ktor.http.d1;
import io.ktor.http.u0;
import io.ktor.http.v0;
import io.ktor.http.w0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@io.ktor.utils.io.o0
public final class i0 extends io.ktor.http.content.w.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f295071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f295072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f295073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f295074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f295075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final fi.y f295076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final v0 f295077i;

    public /* synthetic */ i0(long j10, boolean z10, boolean z11, int i10, CoroutineContext coroutineContext, fi.y yVar, io.ktor.http.content.w wVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, z10, z11, i10, coroutineContext, yVar, wVar);
    }

    @Override // io.ktor.http.content.w.b, io.ktor.http.content.w
    @NotNull
    public v0 c() {
        return this.f295077i;
    }

    @Override // io.ktor.http.content.w.b
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public i0 h(@NotNull io.ktor.http.content.w delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new i0(this.f295071c, this.f295072d, this.f295073e, this.f295074f, this.f295075g, this.f295076h, delegate, null);
    }

    @NotNull
    public final CoroutineContext k() {
        return this.f295075g;
    }

    @NotNull
    public final fi.y l() {
        return this.f295076h;
    }

    public final int m() {
        return this.f295074f;
    }

    public final long n() {
        return this.f295071c;
    }

    public final boolean o() {
        return this.f295072d;
    }

    public final boolean p() {
        return this.f295073e;
    }

    @NotNull
    public String toString() {
        return "SSEClientContent";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i0(long j10, boolean z10, boolean z11, int i10, CoroutineContext callContext, fi.y initialRequest, io.ktor.http.content.w requestBody) {
        super(requestBody);
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        Intrinsics.checkNotNullParameter(initialRequest, "initialRequest");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        this.f295071c = j10;
        this.f295072d = z10;
        this.f295073e = z11;
        this.f295074f = i10;
        this.f295075g = callContext;
        this.f295076h = initialRequest;
        w0 w0Var = new w0(0, 1, null);
        w0Var.j(requestBody.c());
        d1 d1Var = d1.f295782a;
        u0.b(w0Var, d1Var.d(), io.ktor.http.m.h.f296047a.f());
        w0Var.l(d1Var.u(), io.ktor.client.utils.d.f295393g);
        this.f295077i = w0Var.build();
    }
}
