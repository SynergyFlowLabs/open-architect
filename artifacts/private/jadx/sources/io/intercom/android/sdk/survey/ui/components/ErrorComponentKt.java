package io.intercom.android.sdk.survey.ui.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nErrorComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorComponent.kt\nio/intercom/android/sdk/survey/ui/components/ErrorComponentKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,83:1\n70#2:84\n68#2,8:85\n77#2:125\n80#3,6:93\n87#3,3:108\n90#3,2:117\n94#3:124\n391#4,9:99\n400#4:119\n401#4,2:122\n4360#5,6:111\n113#6:120\n113#6:121\n*S KotlinDebug\n*F\n+ 1 ErrorComponent.kt\nio/intercom/android/sdk/survey/ui/components/ErrorComponentKt\n*L\n27#1:84\n27#1:85,8\n27#1:125\n27#1:93,6\n27#1:108,3\n27#1:117,2\n27#1:124\n27#1:99,9\n27#1:119\n27#1:122,2\n27#1:111,6\n38#1:120\n45#1:121\n*E\n"})
public final class ErrorComponentKt {
    @androidx.compose.runtime.o
    @d1.c(name = "Error with CTA")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ErrorStateWithCTA(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1921062712);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            SurveyError(new SurveyState.Error.WithCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, 4, null), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, 1, null), null, c0VarR, 0, 2);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorComponentKt.ErrorStateWithCTA$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorStateWithCTA$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ErrorStateWithCTA(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(name = "Error without CTA")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ErrorStateWithoutCTA(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1056362620);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            SurveyError(new SurveyState.Error.WithoutCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, 4, null), 1, null), null, c0VarR, 0, 2);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorComponentKt.ErrorStateWithoutCTA$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorStateWithoutCTA$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ErrorStateWithoutCTA(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x0185  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SurveyError(@NotNull final SurveyState.Error state, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.e.a aVar;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.foundation.layout.d0 d0Var;
        androidx.compose.ui.a0.a aVar2;
        androidx.compose.runtime.c0 c0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(state, "state");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(805293226);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = i10 | (c0VarR.D(state) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !c0VarR.d()) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                androidx.compose.ui.a0 a0VarF = i6.f(a0Var3, 0.0f, 1, null);
                aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.i(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarF);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                function0A = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK, aVar3.e());
                y7.n(c0VarD, b1VarK, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                String strD = u0.i.d(state.getMessageResId(), c0VarR, 0);
                long jM426getOnBackground0d7_KjU = state.getSurveyUiColors().m426getOnBackground0d7_KjU();
                long jM = androidx.compose.ui.unit.a0.m(36);
                v0 v0VarC = v0.f41742b.c();
                int iA = androidx.compose.ui.text.style.j.f42206b.a();
                aVar2 = androidx.compose.ui.a0.E;
                float f10 = 32;
                androidx.compose.ui.a0 a0Var4 = a0Var3;
                q50.t(strD, d0Var.b(d5.s(aVar2, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10)), aVar.y()), jM426getOnBackground0d7_KjU, null, jM, null, v0VarC, null, 0L, null, androidx.compose.ui.text.style.j.h(iA), 0L, 0, false, 0, 0, null, null, c0VarR, 1597440, 0, 261032);
                c0VarR.E(-803498879);
                if (state instanceof SurveyState.Error.WithCTA) {
                    SurveyState.Error.WithCTA withCTA = (SurveyState.Error.WithCTA) state;
                    SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(d0Var.b(d5.r(aVar2, androidx.compose.ui.unit.h.r(16)), aVar.c()), u0.i.d(R.string.intercom_retry, c0VarR, 0), null, withCTA.getOnClick(), null, withCTA.getSurveyUiColors(), c0VarR, 0, 20);
                }
                c0Var2 = c0VarR;
                c0Var2.A();
                c0Var2.o();
                a0Var2 = a0Var4;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ErrorComponentKt.SurveyError$lambda$1(state, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i12 & 91) == 18) {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.ui.a0 a0VarF2 = i6.f(a0Var3, 0.0f, 1, null);
            aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar.i(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            function0A = aVar4.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK2, aVar4.e());
            y7.n(c0VarD, b1VarK2, aVar4.g());
            function2B = aVar4.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar4.f());
            d0Var = androidx.compose.foundation.layout.d0.f15956a;
            String strD2 = u0.i.d(state.getMessageResId(), c0VarR, 0);
            long jM426getOnBackground0d7_KjU2 = state.getSurveyUiColors().m426getOnBackground0d7_KjU();
            long jM2 = androidx.compose.ui.unit.a0.m(36);
            v0 v0VarC2 = v0.f41742b.c();
            int iA2 = androidx.compose.ui.text.style.j.f42206b.a();
            aVar2 = androidx.compose.ui.a0.E;
            float f11 = 32;
            androidx.compose.ui.a0 a0Var5 = a0Var3;
            q50.t(strD2, d0Var.b(d5.s(aVar2, androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11)), aVar.y()), jM426getOnBackground0d7_KjU2, null, jM2, null, v0VarC2, null, 0L, null, androidx.compose.ui.text.style.j.h(iA2), 0L, 0, false, 0, 0, null, null, c0VarR, 1597440, 0, 261032);
            c0VarR.E(-803498879);
            if (state instanceof SurveyState.Error.WithCTA) {
                SurveyState.Error.WithCTA withCTA2 = (SurveyState.Error.WithCTA) state;
                SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(d0Var.b(d5.r(aVar2, androidx.compose.ui.unit.h.r(16)), aVar.c()), u0.i.d(R.string.intercom_retry, c0VarR, 0), null, withCTA2.getOnClick(), null, withCTA2.getSurveyUiColors(), c0VarR, 0, 20);
            }
            c0Var2 = c0VarR;
            c0Var2.A();
            c0Var2.o();
            a0Var2 = a0Var5;
        } else {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.ui.a0 a0VarF3 = i6.f(a0Var3, 0.0f, 1, null);
            aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar.i(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
            function0A = aVar5.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK3, aVar5.e());
            y7.n(c0VarD, b1VarK3, aVar5.g());
            function2B = aVar5.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar5.f());
            d0Var = androidx.compose.foundation.layout.d0.f15956a;
            String strD3 = u0.i.d(state.getMessageResId(), c0VarR, 0);
            long jM426getOnBackground0d7_KjU3 = state.getSurveyUiColors().m426getOnBackground0d7_KjU();
            long jM3 = androidx.compose.ui.unit.a0.m(36);
            v0 v0VarC3 = v0.f41742b.c();
            int iA3 = androidx.compose.ui.text.style.j.f42206b.a();
            aVar2 = androidx.compose.ui.a0.E;
            float f12 = 32;
            androidx.compose.ui.a0 a0Var6 = a0Var3;
            q50.t(strD3, d0Var.b(d5.s(aVar2, androidx.compose.ui.unit.h.r(f12), androidx.compose.ui.unit.h.r(f12)), aVar.y()), jM426getOnBackground0d7_KjU3, null, jM3, null, v0VarC3, null, 0L, null, androidx.compose.ui.text.style.j.h(iA3), 0L, 0, false, 0, 0, null, null, c0VarR, 1597440, 0, 261032);
            c0VarR.E(-803498879);
            if (state instanceof SurveyState.Error.WithCTA) {
                SurveyState.Error.WithCTA withCTA3 = (SurveyState.Error.WithCTA) state;
                SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(d0Var.b(d5.r(aVar2, androidx.compose.ui.unit.h.r(16)), aVar.c()), u0.i.d(R.string.intercom_retry, c0VarR, 0), null, withCTA3.getOnClick(), null, withCTA3.getSurveyUiColors(), c0VarR, 0, 20);
            }
            c0Var2 = c0VarR;
            c0Var2.A();
            c0Var2.o();
            a0Var2 = a0Var6;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorComponentKt.SurveyError$lambda$1(state, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyError$lambda$1(SurveyState.Error state, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(state, "$state");
        SurveyError(state, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
