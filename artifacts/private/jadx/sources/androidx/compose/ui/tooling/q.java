package androidx.compose.ui.tooling;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.s2;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nInspectable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Inspectable.android.kt\nandroidx/compose/ui/tooling/InspectableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,77:1\n75#2:78\n*S KotlinDebug\n*F\n+ 1 Inspectable.android.kt\nandroidx/compose/ui/tooling/InspectableKt\n*L\n73#1:78\n*E\n"})
@oj.i(name = "InspectableKt")
public final class q {
    @androidx.compose.runtime.o
    @kotlin.l(message = "This method should not be used in application code and will be removed soon.")
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void c(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1954693855);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(1954693855, i11, -1, "androidx.compose.ui.tooling.InInspectionModeOnly (Inspectable.android.kt:71)");
            }
            if (((Boolean) c0VarR.W(s2.a())).booleanValue()) {
                c0VarR.E(1118280938);
                function2.invoke(c0VarR, Integer.valueOf(i11 & 14));
                c0VarR.A();
            } else {
                c0VarR.E(1118304963);
                c0VarR.A();
            }
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.ui.tooling.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.d(function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        c(function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void e(@NotNull final m mVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1504045604);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(mVar) : c0VarR.k0(mVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(-1504045604, i11, -1, "androidx.compose.ui.tooling.Inspectable (Inspectable.android.kt:53)");
            }
            c0VarR.e0();
            Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type androidx.compose.ui.tooling.CompositionDataRecordImpl");
            Set<androidx.compose.runtime.tooling.f> setA = ((n) mVar).a();
            setA.add(c0VarR.j0());
            a1.f(new n4[]{s2.a().f(Boolean.TRUE), androidx.compose.runtime.tooling.u.c().f(setA)}, function2, c0VarR, (i11 & com.planner5d.library.engine.input.f.b.B) | n4.f36267i);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.ui.tooling.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.f(mVar, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(m mVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        e(mVar, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
