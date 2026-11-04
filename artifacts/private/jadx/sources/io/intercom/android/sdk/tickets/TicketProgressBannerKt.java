package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TicketProgressBannerKt {
    /* JADX WARN: Code duplicated, block: B:51:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketProgressBanner(@NotNull final String name, @NotNull final Function0<Unit> onClick, final boolean z10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        boolean z11;
        androidx.compose.ui.a0 a0Var2;
        final androidx.compose.ui.a0 a0Var3;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-108721483);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(name) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.k0(onClick) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 896) == 0) {
                i12 |= c0VarR.G(z11) ? 256 : 128;
            }
        }
        int i13 = i11 & 8;
        if (i13 == 0) {
            if ((i10 & 7168) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            if ((i12 & 5851) == 1170 || !c0VarR.d()) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                int i14 = i12 >> 6;
                androidx.compose.animation.k.j(z11, a0Var2, androidx.compose.animation.b0.o(androidx.compose.animation.core.p.t(1000, 1000, null, 4, null), 0.0f, 2, null), androidx.compose.animation.b0.q(androidx.compose.animation.core.p.t(1000, 0, null, 6, null), 0.0f, 2, null), null, androidx.compose.runtime.internal.w.e(417589981, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(lVar, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i15) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarF = i6.F(i6.h(aVar, 0.0f, 1, null), null, false, 3, null);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i16 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(a0VarF, intercomTheme.getColors(c0Var2, i16).m690getBackground0d7_KjU(), null, 2, null);
                        c0Var2.E(669306758);
                        Object objI0 = c0Var2.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0Var2.Y(objI0);
                        }
                        c0Var2.A();
                        androidx.compose.ui.a0 a0VarF2 = i1.f(a0VarD, (androidx.compose.foundation.interaction.j) objI0, null, false, null, null, onClick, 28, null);
                        String str = name;
                        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0Var2, 0);
                        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarF2);
                        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
                        y7.n(c0VarD, a1VarB, aVar3.e());
                        y7.n(c0VarD, b1VarK, aVar3.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar3.f());
                        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                        float f10 = 12;
                        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                        androidx.compose.ui.a0 a0VarT = d5.t(i6.F(i6.h(aVar, 0.0f, 1, null), null, false, 3, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
                        a1 a1VarE = u5.e(qVar.m(), aVar2.q(), c0Var2, 54);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK2 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarT);
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarE, aVar3.e());
                        y7.n(c0VarD2, b1VarK2, aVar3.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN2, aVar3.f());
                        y5 y5Var = y5.f16577a;
                        ni.o(u0.e.c(R.drawable.intercom_ticket_detail_icon, c0Var2, 0), null, null, intercomTheme.getColors(c0Var2, i16).m685getActionContrastWhite0d7_KjU(), c0Var2, 56, 4);
                        l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0Var2, 6);
                        q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(intercomTheme.getTypography(c0Var2, i16).getType04Point5(), intercomTheme.getColors(c0Var2, i16).m685getActionContrastWhite0d7_KjU(), 0L, v0.f41742b.o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), c0Var2, 0, 24960, 110590);
                        c0Var2.o();
                        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                    }
                }, c0VarR, 54), c0VarR, (i14 & 14) | 200064 | (i14 & com.planner5d.library.engine.input.f.b.B), 16);
            } else {
                c0VarR.u();
            }
            a0Var3 = a0Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TicketProgressBannerKt.TicketProgressBanner$lambda$0(name, onClick, z10, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        if ((i12 & 5851) == 1170) {
            if (i13 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            int i15 = i12 >> 6;
            androidx.compose.animation.k.j(z11, a0Var2, androidx.compose.animation.b0.o(androidx.compose.animation.core.p.t(1000, 1000, null, 4, null), 0.0f, 2, null), androidx.compose.animation.b0.q(androidx.compose.animation.core.p.t(1000, 0, null, 6, null), 0.0f, 2, null), null, androidx.compose.runtime.internal.w.e(417589981, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(lVar, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i16) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarF = i6.F(i6.h(aVar, 0.0f, 1, null), null, false, 3, null);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i17 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(a0VarF, intercomTheme.getColors(c0Var2, i17).m690getBackground0d7_KjU(), null, 2, null);
                    c0Var2.E(669306758);
                    Object objI0 = c0Var2.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var2.Y(objI0);
                    }
                    c0Var2.A();
                    androidx.compose.ui.a0 a0VarF2 = i1.f(a0VarD, (androidx.compose.foundation.interaction.j) objI0, null, false, null, null, onClick, 28, null);
                    String str = name;
                    androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                    androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0Var2, 0);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarF2);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
                    y7.n(c0VarD, a1VarB, aVar3.e());
                    y7.n(c0VarD, b1VarK, aVar3.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar3.f());
                    androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                    float f10 = 12;
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                    androidx.compose.ui.a0 a0VarT = d5.t(i6.F(i6.h(aVar, 0.0f, 1, null), null, false, 3, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
                    a1 a1VarE = u5.e(qVar.m(), aVar2.q(), c0Var2, 54);
                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK2 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarT);
                    Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarE, aVar3.e());
                    y7.n(c0VarD2, b1VarK2, aVar3.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN2, aVar3.f());
                    y5 y5Var = y5.f16577a;
                    ni.o(u0.e.c(R.drawable.intercom_ticket_detail_icon, c0Var2, 0), null, null, intercomTheme.getColors(c0Var2, i17).m685getActionContrastWhite0d7_KjU(), c0Var2, 56, 4);
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0Var2, 6);
                    q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(intercomTheme.getTypography(c0Var2, i17).getType04Point5(), intercomTheme.getColors(c0Var2, i17).m685getActionContrastWhite0d7_KjU(), 0L, v0.f41742b.o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), c0Var2, 0, 24960, 110590);
                    c0Var2.o();
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, (i15 & 14) | 200064 | (i15 & com.planner5d.library.engine.input.f.b.B), 16);
        } else {
            if (i13 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            int i16 = i12 >> 6;
            androidx.compose.animation.k.j(z11, a0Var2, androidx.compose.animation.b0.o(androidx.compose.animation.core.p.t(1000, 1000, null, 4, null), 0.0f, 2, null), androidx.compose.animation.b0.q(androidx.compose.animation.core.p.t(1000, 0, null, 6, null), 0.0f, 2, null), null, androidx.compose.runtime.internal.w.e(417589981, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(lVar, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i17) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarF = i6.F(i6.h(aVar, 0.0f, 1, null), null, false, 3, null);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i18 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(a0VarF, intercomTheme.getColors(c0Var2, i18).m690getBackground0d7_KjU(), null, 2, null);
                    c0Var2.E(669306758);
                    Object objI0 = c0Var2.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var2.Y(objI0);
                    }
                    c0Var2.A();
                    androidx.compose.ui.a0 a0VarF2 = i1.f(a0VarD, (androidx.compose.foundation.interaction.j) objI0, null, false, null, null, onClick, 28, null);
                    String str = name;
                    androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                    androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0Var2, 0);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarF2);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
                    y7.n(c0VarD, a1VarB, aVar3.e());
                    y7.n(c0VarD, b1VarK, aVar3.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar3.f());
                    androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                    float f10 = 12;
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                    androidx.compose.ui.a0 a0VarT = d5.t(i6.F(i6.h(aVar, 0.0f, 1, null), null, false, 3, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
                    a1 a1VarE = u5.e(qVar.m(), aVar2.q(), c0Var2, 54);
                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK2 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, a0VarT);
                    Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarE, aVar3.e());
                    y7.n(c0VarD2, b1VarK2, aVar3.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN2, aVar3.f());
                    y5 y5Var = y5.f16577a;
                    ni.o(u0.e.c(R.drawable.intercom_ticket_detail_icon, c0Var2, 0), null, null, intercomTheme.getColors(c0Var2, i18).m685getActionContrastWhite0d7_KjU(), c0Var2, 56, 4);
                    l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0Var2, 6);
                    q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(intercomTheme.getTypography(c0Var2, i18).getType04Point5(), intercomTheme.getColors(c0Var2, i18).m685getActionContrastWhite0d7_KjU(), 0L, v0.f41742b.o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), c0Var2, 0, 24960, 110590);
                    c0Var2.o();
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, (i16 & 14) | 200064 | (i16 & com.planner5d.library.engine.input.f.b.B), 16);
        }
        a0Var3 = a0Var2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketProgressBannerKt.TicketProgressBanner$lambda$0(name, onClick, z10, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressBanner$lambda$0(String name, Function0 onClick, boolean z10, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        TicketProgressBanner(name, onClick, z10, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketProgressRowLongTextPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-384429412);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 0 >> 7;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressBannerKt.INSTANCE.m535getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketProgressBannerKt.TicketProgressRowLongTextPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressRowLongTextPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TicketProgressRowLongTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketProgressRowPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-433396877);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressBannerKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketProgressBannerKt.TicketProgressRowPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressRowPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TicketProgressRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
