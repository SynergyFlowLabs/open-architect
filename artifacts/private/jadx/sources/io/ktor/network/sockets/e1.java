package io.ktor.network.sockets;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class e1 implements m<e1, p0.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.network.selector.j f296219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private p0.f f296220b;

    public e1(@NotNull io.ktor.network.selector.j selector, @NotNull p0.f options) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f296219a = selector;
        this.f296220b = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object i(e1 e1Var, i0 i0Var, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i0Var = null;
        }
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.network.sockets.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return e1.k((p0.f) obj2);
                }
            };
        }
        return e1Var.g(i0Var, function1, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(e1 e1Var, String str, int i10, Function1 function1, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1() { // from class: io.ktor.network.sockets.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return e1.l((p0.f) obj2);
                }
            };
        }
        return e1Var.h(str, i10, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(p0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(p0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object o(e1 e1Var, i0 i0Var, i0 i0Var2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i0Var2 = null;
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: io.ktor.network.sockets.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return e1.p((p0.f) obj2);
                }
            };
        }
        return e1Var.n(i0Var, i0Var2, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(p0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public final Object g(@Nullable i0 i0Var, @NotNull Function1<? super p0.f, Unit> function1, @NotNull kotlin.coroutines.d<? super g> dVar) {
        io.ktor.network.selector.j jVar = this.f296219a;
        p0.f fVarR = b().r();
        function1.invoke(fVarR);
        return f1.a(jVar, i0Var, fVarR, dVar);
    }

    @Nullable
    public final Object h(@NotNull String str, int i10, @NotNull Function1<? super p0.f, Unit> function1, @NotNull kotlin.coroutines.d<? super g> dVar) {
        return g(new a0(str, i10), function1, dVar);
    }

    @Override // io.ktor.network.sockets.m
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e1 c(@NotNull Function1<? super p0.f, Unit> function1) {
        return (e1) m.a.a(this, function1);
    }

    @Nullable
    public final Object n(@NotNull i0 i0Var, @Nullable i0 i0Var2, @NotNull Function1<? super p0.f, Unit> function1, @NotNull kotlin.coroutines.d<? super o> dVar) {
        io.ktor.network.selector.j jVar = this.f296219a;
        p0.f fVarR = b().r();
        function1.invoke(fVarR);
        return f1.b(jVar, i0Var, i0Var2, fVarR, dVar);
    }

    @Override // io.ktor.network.sockets.m
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public p0.f b() {
        return this.f296220b;
    }

    @Override // io.ktor.network.sockets.m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull p0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f296220b = fVar;
    }
}
