package io.ktor.client.plugins.observer;

import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.util.date.GMTDate;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends io.ktor.client.statement.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.call.b f294930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<io.ktor.utils.io.h> f294931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.statement.c f294932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v0 f294933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f294934e;

    public /* synthetic */ g(io.ktor.client.call.b bVar, Function0 function0, io.ktor.client.statement.c cVar, v0 v0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (Function0<? extends io.ktor.utils.io.h>) function0, cVar, (i10 & 8) != 0 ? cVar.O() : v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.h m(io.ktor.utils.io.h hVar) {
        return hVar;
    }

    @Override // io.ktor.http.f1
    @NotNull
    public v0 O() {
        return this.f294933d;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public io.ktor.utils.io.h c() {
        return this.f294931b.invoke();
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public GMTDate f() {
        return this.f294932c.f();
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f294934e;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public io.ktor.client.call.b h() {
        return this.f294930a;
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public GMTDate i() {
        return this.f294932c.i();
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public l1 j() {
        return this.f294932c.j();
    }

    @Override // io.ktor.client.statement.c
    @NotNull
    public k1 k() {
        return this.f294932c.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull io.ktor.client.call.b call, @NotNull Function0<? extends io.ktor.utils.io.h> block, @NotNull io.ktor.client.statement.c origin, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f294930a = call;
        this.f294931b = block;
        this.f294932c = origin;
        this.f294933d = headers;
        this.f294934e = origin.getCoroutineContext();
    }

    public /* synthetic */ g(io.ktor.client.call.b bVar, io.ktor.utils.io.h hVar, io.ktor.client.statement.c cVar, v0 v0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, hVar, cVar, (i10 & 8) != 0 ? cVar.O() : v0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull io.ktor.client.call.b call, @NotNull final io.ktor.utils.io.h content, @NotNull io.ktor.client.statement.c origin, @NotNull v0 headers) {
        this(call, (Function0<? extends io.ktor.utils.io.h>) new Function0() { // from class: io.ktor.client.plugins.observer.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.m(content);
            }
        }, origin, headers);
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }
}
