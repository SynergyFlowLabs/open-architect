package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class qb implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final qb f32217a = new qb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f32218b = 0;

    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/DefaultBasicAlertDialogOverride$BasicAlertDialog$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,513:1\n63#2:514\n1282#3,6:515\n70#4:521\n67#4,9:522\n77#4:561\n79#5,6:531\n86#5,3:546\n89#5,2:555\n93#5:560\n347#6,9:537\n356#6,3:557\n4206#7,6:549\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/DefaultBasicAlertDialogOverride$BasicAlertDialog$1\n*L\n166#1:514\n171#1:515,6\n167#1:521\n167#1:522,9\n167#1:561\n167#1:531,6\n167#1:546,3\n167#1:555,2\n167#1:560\n167#1:537,9\n167#1:557,3\n167#1:549,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n2 f32219a;

        a(n2 n2Var) {
            this.f32219a = n2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.G1(e0Var, str);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 1 << 1;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1163527043, i10, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog.<anonymous> (AlertDialog.kt:165)");
            }
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            final String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.K), c0Var, 0);
            androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.A(this.f32219a.b(), h.y(), 0.0f, h.x(), 0.0f, 10, null);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(strB);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.pb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qb.a.f(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarB2 = a0VarA.B2(androidx.compose.ui.semantics.t.f(aVar2, false, (Function1) objI0, 1, null));
            n2 n2Var = this.f32219a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarB2);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            n2Var.a().invoke(c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    private qb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(qb qbVar, n2 n2Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        qbVar.a(n2Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.m2
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final n2 n2Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1565826668);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(n2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1565826668, i11, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog (AlertDialog.kt:163)");
            }
            androidx.compose.ui.window.b.a(n2Var.c(), n2Var.d(), androidx.compose.runtime.internal.w.e(1163527043, true, new a(n2Var), c0VarR, 54), c0VarR, androidx.media3.exoplayer.a5.S0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ob
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qb.c(this.f31340a, n2Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
