package androidx.compose.ui.focus;

import androidx.compose.ui.layout.g2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class o0 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.h, c0, k0 {
    public static final int X = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private g0 f37443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private g2.a f37444t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Function1<g, Unit> f37445v = new b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Function1<g, Unit> f37446w = new a();

    static final class a extends kotlin.jvm.internal.l0 implements Function1<g, Unit> {
        a() {
            super(1);
        }

        public final void c(g gVar) {
            if (!androidx.compose.ui.k.f39205h) {
                g2.a aVar = o0.this.f37444t;
                if (aVar != null) {
                    aVar.release();
                }
                o0.this.f37444t = null;
            }
            if (l0.e(o0.this)) {
                return;
            }
            g0 g0VarX9 = o0.this.x9();
            g0.a aVar2 = g0.f37418b;
            if (Intrinsics.areEqual(g0VarX9, aVar2.c())) {
                return;
            }
            if (Intrinsics.areEqual(o0.this.x9(), aVar2.b())) {
                gVar.a();
            } else {
                g0.k(o0.this.x9(), 0, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            c(gVar);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<g, Unit> {
        b() {
            super(1);
        }

        public final void c(g gVar) {
            l0.f(o0.this);
            if (!androidx.compose.ui.k.f39205h) {
                g2.a aVar = o0.this.f37444t;
                if (aVar != null) {
                    aVar.release();
                }
                o0 o0Var = o0.this;
                o0Var.f37444t = l0.c(o0Var);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            c(gVar);
            return Unit.f312394a;
        }
    }

    public o0(@NotNull g0 g0Var) {
        this.f37443s = g0Var;
    }

    @Override // androidx.compose.ui.focus.c0
    public void Z6(@NotNull z zVar) {
        zVar.N(this.f37446w);
        zVar.S(this.f37445v);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        if (!androidx.compose.ui.k.f39205h) {
            g2.a aVar = this.f37444t;
            if (aVar != null) {
                aVar.release();
            }
            this.f37444t = null;
        }
        super.f9();
    }

    @NotNull
    public final g0 x9() {
        return this.f37443s;
    }

    public final void y9(@NotNull g0 g0Var) {
        this.f37443s = g0Var;
    }
}
