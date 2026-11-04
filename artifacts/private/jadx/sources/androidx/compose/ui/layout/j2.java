package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.graphics.r1, Unit> f39383a = a.f39385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f39384b = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.r1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39385a = new a();

        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.graphics.r1 r1Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.r1 r1Var) {
            c(r1Var);
            return Unit.f312394a;
        }
    }

    static {
        int i10 = 7 & 0;
        int i11 = 3 ^ 0;
    }

    @NotNull
    public static final i2.a a(@NotNull androidx.compose.ui.node.u0 u0Var) {
        return new t0(u0Var);
    }

    @NotNull
    public static final i2.a b(@NotNull androidx.compose.ui.node.x1 x1Var) {
        return new c2(x1Var);
    }
}
