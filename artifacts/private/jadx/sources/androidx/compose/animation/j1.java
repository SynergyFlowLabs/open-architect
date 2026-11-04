package androidx.compose.animation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function0<Boolean> f13544a = a.f13545a;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13545a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.r1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f13546a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Boolean> function0) {
            super(1);
            this.f13546a = function0;
        }

        public final void c(androidx.compose.ui.graphics.r1 r1Var) {
            r1Var.O(this.f13546a.invoke().booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.r1 r1Var) {
            c(r1Var);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull u0 u0Var, @NotNull Function0<Boolean> function0) {
        return a0Var.B2(Intrinsics.areEqual(u0Var.b(), androidx.compose.ui.layout.l.f39405a.a()) ? androidx.compose.ui.graphics.q1.a(androidx.compose.ui.a0.E, new b(function0)) : androidx.compose.ui.a0.E).B2(new SkipToLookaheadElement(u0Var, function0));
    }
}
