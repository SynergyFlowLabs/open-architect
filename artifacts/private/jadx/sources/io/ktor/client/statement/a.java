package io.ktor.client.statement;

import fi.f0;
import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.o0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@o0
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.call.b f295318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f295319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f295320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k1 f295321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final GMTDate f295322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final GMTDate f295323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.h f295324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final v0 f295325h;

    public a(@NotNull io.ktor.client.call.b call, @NotNull f0 responseData) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        this.f295318a = call;
        this.f295319b = responseData.b();
        this.f295320c = responseData.f();
        this.f295321d = responseData.g();
        this.f295322e = responseData.d();
        this.f295323f = responseData.e();
        Object objA = responseData.a();
        io.ktor.utils.io.h hVar = objA instanceof io.ktor.utils.io.h ? (io.ktor.utils.io.h) objA : null;
        this.f295324g = hVar == null ? io.ktor.utils.io.h.f296881a.a() : hVar;
        this.f295325h = responseData.c();
    }

    @Override // io.ktor.http.f1
    @NotNull
    public v0 O() {
        return this.f295325h;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public io.ktor.utils.io.h c() {
        return this.f295324g;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public GMTDate f() {
        return this.f295322e;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f295319b;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public io.ktor.client.call.b h() {
        return this.f295318a;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public GMTDate i() {
        return this.f295323f;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public l1 j() {
        return this.f295320c;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public k1 k() {
        return this.f295321d;
    }
}
