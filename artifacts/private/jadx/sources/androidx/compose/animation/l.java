package androidx.compose.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,862:1\n110#2:863\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n648#1:863\n*E\n"})
public interface l {

    public static final class a {
        @Deprecated
        @NotNull
        public static androidx.compose.ui.a0 a(@NotNull l lVar, @NotNull androidx.compose.ui.a0 a0Var, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull String str) {
            return l.super.d(a0Var, d0Var, f0Var, str);
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n1#1,110:1\n649#2,5:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f13655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f13656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d0 d0Var, f0 f0Var, String str) {
            super(1);
            this.f13655a = d0Var;
            this.f13656b = f0Var;
            this.f13657c = str;
        }

        public final void c(t2 t2Var) {
            t2Var.d("animateEnterExit");
            t2Var.b().c("enter", this.f13655a);
            t2Var.b().c("exit", this.f13656b);
            t2Var.b().c(com.google.firebase.messaging.e.f.f123534d, this.f13657c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f13659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f13660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13661d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d0 d0Var, f0 f0Var, String str) {
            super(3);
            this.f13659b = d0Var;
            this.f13660c = f0Var;
            this.f13661d = str;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1840112047);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1840112047, i10, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:654)");
            }
            androidx.compose.ui.a0 a0VarB2 = a0Var.B2(b0.g(l.this.b(), this.f13659b, this.f13660c, null, this.f13661d, c0Var, 0, 4));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    static /* synthetic */ androidx.compose.ui.a0 c(l lVar, androidx.compose.ui.a0 a0Var, d0 d0Var, f0 f0Var, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if ((i10 & 1) != 0) {
            d0Var = b0.o(null, 0.0f, 3, null);
        }
        if ((i10 & 2) != 0) {
            f0Var = b0.q(null, 0.0f, 3, null);
        }
        if ((i10 & 4) != 0) {
            str = "animateEnterExit";
        }
        return lVar.d(a0Var, d0Var, f0Var, str);
    }

    @NotNull
    l3<z> b();

    @NotNull
    default androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull String str) {
        return androidx.compose.ui.m.f(a0Var, r2.e() ? new b(d0Var, f0Var, str) : r2.b(), new c(d0Var, f0Var, str));
    }
}
