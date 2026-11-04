package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomErrorScreenKt {
    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ErrorScreenWithCTAPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2005095861);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.m143getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.c2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomErrorScreenKt.ErrorScreenWithCTAPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorScreenWithCTAPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ErrorScreenWithCTAPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ErrorScreenWithoutCTAPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(753957761);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.m144getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.a2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomErrorScreenKt.ErrorScreenWithoutCTAPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorScreenWithoutCTAPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ErrorScreenWithoutCTAPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void IntercomErrorScreen(@NotNull final ErrorState state, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        final androidx.compose.ui.a0 a0Var3;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(state, "state");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-45428996);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(state) ? 4 : 2) | i10;
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
                u10.c(i6.f(a0Var3, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(847888321, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var2, int i14) {
                        androidx.compose.ui.a0.a aVar;
                        if ((i14 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e eVarI = aVar2.i();
                        ErrorState errorState = state;
                        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
                        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, aVar3);
                        androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A);
                        } else {
                            c0Var2.l();
                        }
                        androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                        y7.n(c0VarD, a1VarK, aVar4.e());
                        y7.n(c0VarD, b1VarK, aVar4.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar4.f());
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.m(), c0Var2, 48);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, aVar3);
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A2);
                        } else {
                            c0Var2.l();
                        }
                        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                        y7.n(c0VarD2, a1VarB, aVar4.e());
                        y7.n(c0VarD2, b1VarK2, aVar4.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN2, aVar4.f());
                        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                        ni.o(u0.e.c(errorState.getIconId(), c0Var2, 0), null, i6.w(aVar3, androidx.compose.ui.unit.h.r(32)), 0L, c0Var2, 440, 8);
                        float f10 = 16;
                        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                        String strD = u0.i.d(errorState.getMessageResId(), c0Var2, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i15 = IntercomTheme.$stable;
                        q50.t(strD, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i15).getType03(), c0Var2, 0, 0, 131070);
                        androidx.compose.runtime.c0 c0Var3 = c0Var2;
                        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0Var3, 6);
                        Integer additionalMessageResId = errorState.getAdditionalMessageResId();
                        c0Var3.E(1192536998);
                        if (additionalMessageResId == null) {
                            aVar = aVar3;
                        } else {
                            aVar = aVar3;
                            q50.t(u0.i.d(additionalMessageResId.intValue(), c0Var3, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var3, i15).getType04(), c0Var2, 0, 0, 131070);
                            c0Var3 = c0Var2;
                        }
                        c0Var3.A();
                        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var3, 6);
                        c0Var3.E(1192545587);
                        if (errorState instanceof ErrorState.WithCTA) {
                            ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState;
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(u0.i.d(withCTA.getCtaResId(), c0Var3, 0), null, null, withCTA.getOnCtaClick(), c0Var3, 0, 6);
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.o();
                    }
                }, c0VarR, 54), c0VarR, 12582912, okhttp3.internal.ws.g.f334652s);
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.b2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomErrorScreenKt.IntercomErrorScreen$lambda$0(state, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            u10.c(i6.f(a0Var3, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(847888321, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i14) {
                    androidx.compose.ui.a0.a aVar;
                    if ((i14 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e eVarI = aVar2.i();
                    ErrorState errorState = state;
                    androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, aVar3);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK, aVar4.e());
                    y7.n(c0VarD, b1VarK, aVar4.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar4.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.m(), c0Var2, 48);
                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, aVar3);
                    Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A2);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                    y7.n(c0VarD2, a1VarB, aVar4.e());
                    y7.n(c0VarD2, b1VarK2, aVar4.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN2, aVar4.f());
                    androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                    ni.o(u0.e.c(errorState.getIconId(), c0Var2, 0), null, i6.w(aVar3, androidx.compose.ui.unit.h.r(32)), 0L, c0Var2, 440, 8);
                    float f10 = 16;
                    l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                    String strD = u0.i.d(errorState.getMessageResId(), c0Var2, 0);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    q50.t(strD, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i15).getType03(), c0Var2, 0, 0, 131070);
                    androidx.compose.runtime.c0 c0Var3 = c0Var2;
                    l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0Var3, 6);
                    Integer additionalMessageResId = errorState.getAdditionalMessageResId();
                    c0Var3.E(1192536998);
                    if (additionalMessageResId == null) {
                        aVar = aVar3;
                    } else {
                        aVar = aVar3;
                        q50.t(u0.i.d(additionalMessageResId.intValue(), c0Var3, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var3, i15).getType04(), c0Var2, 0, 0, 131070);
                        c0Var3 = c0Var2;
                    }
                    c0Var3.A();
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var3, 6);
                    c0Var3.E(1192545587);
                    if (errorState instanceof ErrorState.WithCTA) {
                        ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState;
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(u0.i.d(withCTA.getCtaResId(), c0Var3, 0), null, null, withCTA.getOnCtaClick(), c0Var3, 0, 6);
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, 12582912, okhttp3.internal.ws.g.f334652s);
        } else {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            u10.c(i6.f(a0Var3, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(847888321, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i14) {
                    androidx.compose.ui.a0.a aVar;
                    if ((i14 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e eVarI = aVar2.i();
                    ErrorState errorState = state;
                    androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, aVar3);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                    y7.n(c0VarD, a1VarK, aVar4.e());
                    y7.n(c0VarD, b1VarK, aVar4.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar4.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.m(), c0Var2, 48);
                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    androidx.compose.runtime.b1 b1VarK2 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, aVar3);
                    Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A2);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                    y7.n(c0VarD2, a1VarB, aVar4.e());
                    y7.n(c0VarD2, b1VarK2, aVar4.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN2, aVar4.f());
                    androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                    ni.o(u0.e.c(errorState.getIconId(), c0Var2, 0), null, i6.w(aVar3, androidx.compose.ui.unit.h.r(32)), 0L, c0Var2, 440, 8);
                    float f10 = 16;
                    l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                    String strD = u0.i.d(errorState.getMessageResId(), c0Var2, 0);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    q50.t(strD, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i15).getType03(), c0Var2, 0, 0, 131070);
                    androidx.compose.runtime.c0 c0Var3 = c0Var2;
                    l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0Var3, 6);
                    Integer additionalMessageResId = errorState.getAdditionalMessageResId();
                    c0Var3.E(1192536998);
                    if (additionalMessageResId == null) {
                        aVar = aVar3;
                    } else {
                        aVar = aVar3;
                        q50.t(u0.i.d(additionalMessageResId.intValue(), c0Var3, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var3, i15).getType04(), c0Var2, 0, 0, 131070);
                        c0Var3 = c0Var2;
                    }
                    c0Var3.A();
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var3, 6);
                    c0Var3.E(1192545587);
                    if (errorState instanceof ErrorState.WithCTA) {
                        ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState;
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(u0.i.d(withCTA.getCtaResId(), c0Var3, 0), null, null, withCTA.getOnCtaClick(), c0Var3, 0, 6);
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, 12582912, okhttp3.internal.ws.g.f334652s);
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.b2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomErrorScreenKt.IntercomErrorScreen$lambda$0(state, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomErrorScreen$lambda$0(ErrorState state, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(state, "$state");
        IntercomErrorScreen(state, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
