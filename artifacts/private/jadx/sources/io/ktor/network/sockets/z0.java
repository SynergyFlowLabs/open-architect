package io.ktor.network.sockets;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class z0 implements m<z0, p0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.network.selector.j f296367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private p0.d f296368b;

    public z0(@NotNull io.ktor.network.selector.j selector, @NotNull p0.d options) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f296367a = selector;
        this.f296368b = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(z0 z0Var, i0 i0Var, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i0Var = null;
        }
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.network.sockets.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return z0.m((p0.a) obj2);
                }
            };
        }
        return z0Var.h(i0Var, function1, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object k(z0 z0Var, String str, int i10, Function1 function1, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1() { // from class: io.ktor.network.sockets.y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return z0.l((p0.a) obj2);
                }
            };
        }
        return z0Var.i(str, i10, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(p0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(p0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object q(z0 z0Var, i0 i0Var, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.network.sockets.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return z0.t((p0.e) obj2);
                }
            };
        }
        return z0Var.o(i0Var, function1, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object r(z0 z0Var, String str, int i10, Function1 function1, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = new Function1() { // from class: io.ktor.network.sockets.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return z0.s((p0.e) obj2);
                }
            };
        }
        return z0Var.p(str, i10, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(p0.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(p0.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public final Object h(@Nullable i0 i0Var, @NotNull Function1<? super p0.a, Unit> function1, @NotNull kotlin.coroutines.d<? super f0> dVar) {
        io.ktor.network.selector.j jVar = this.f296367a;
        p0.a aVarK = b().k();
        function1.invoke(aVarK);
        return n.c(jVar, i0Var, aVarK, dVar);
    }

    @Nullable
    public final Object i(@NotNull String str, int i10, @NotNull Function1<? super p0.a, Unit> function1, @NotNull kotlin.coroutines.d<? super f0> dVar) {
        return h(new a0(str, i10), function1, dVar);
    }

    @Override // io.ktor.network.sockets.m
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public z0 c(@NotNull Function1<? super p0.d, Unit> function1) {
        return (z0) m.a.a(this, function1);
    }

    @Nullable
    public final Object o(@NotNull i0 i0Var, @NotNull Function1<? super p0.e, Unit> function1, @NotNull kotlin.coroutines.d<? super h0> dVar) {
        io.ktor.network.selector.j jVar = this.f296367a;
        p0.e eVarQ = b().q();
        function1.invoke(eVarQ);
        return n.d(jVar, i0Var, eVarQ, dVar);
    }

    @Nullable
    public final Object p(@NotNull String str, int i10, @NotNull Function1<? super p0.e, Unit> function1, @NotNull kotlin.coroutines.d<? super h0> dVar) {
        return o(new a0(str, i10), function1, dVar);
    }

    @Override // io.ktor.network.sockets.m
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public p0.d b() {
        return this.f296368b;
    }

    @Override // io.ktor.network.sockets.m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull p0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f296368b = dVar;
    }
}
