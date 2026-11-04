package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class bc implements an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bc f26270a = new bc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26271b = 0;

    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/DefaultNavigationBarOverride$NavigationBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,815:1\n99#2,6:816\n106#2:852\n79#3,6:822\n86#3,3:837\n89#3,2:846\n93#3:851\n347#4,9:828\n356#4,3:848\n4206#5,6:840\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/DefaultNavigationBarOverride$NavigationBar$1\n*L\n147#1:816,6\n147#1:852\n147#1:822,6\n147#1:837,3\n147#1:846,2\n147#1:851\n147#1:828,9\n147#1:848,3\n147#1:840,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ bn f26272a;

        a(bn bnVar) {
            this.f26272a = bnVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 5 ^ 1;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1991263321, i10, -1, "androidx.compose.material3.DefaultNavigationBarOverride.NavigationBar.<anonymous> (NavigationBar.kt:146)");
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.selection.b.b(androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.layout.t7.h(androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), this.f26272a.f()), 0.0f, ym.f34785e, 1, null));
            androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(ym.E());
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVarB = this.f26272a.b();
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(fVarG, cVarQ, c0Var, 54);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarB);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            nVarB.invoke(androidx.compose.foundation.layout.y5.f16577a, c0Var, 6);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    private bc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(bc bcVar, bn bnVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        bcVar.a(bnVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.an
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final bn bnVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(882141204);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(bnVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(882141204, i11, -1, "androidx.compose.material3.DefaultNavigationBarOverride.NavigationBar (NavigationBar.kt:139)");
            }
            u10.c(bnVar.d(), null, bnVar.a(), bnVar.c(), bnVar.e(), 0.0f, null, androidx.compose.runtime.internal.w.e(1991263321, true, new a(bnVar), c0VarR, 54), c0VarR, 12582912, 98);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ac
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return bc.c(this.f26034a, bnVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
