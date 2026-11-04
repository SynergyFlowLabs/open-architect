package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class HomeCardScaffoldKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HomeCardScaffold(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String cardTitle, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> content, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1721620037);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(cardTitle) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(content) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var2 = a0Var;
            IntercomCardKt.IntercomCard(a0Var2, null, androidx.compose.runtime.internal.w.e(1218435015, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.HomeCardScaffoldKt.HomeCardScaffold.1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(m0Var, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var2, int i14) {
                    Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                    if ((i14 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarV = d5.v(aVar, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(4), 7, null);
                    String str = cardTitle;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = content;
                    androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarV);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
                    y7.n(c0VarD, a1VarB, aVar2.e());
                    y7.n(c0VarD, b1VarK, aVar2.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar2.f());
                    androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                    q50.t(str, d5.t(d5.v(aVar, 0.0f, androidx.compose.ui.unit.h.r(16), 0.0f, androidx.compose.ui.unit.h.r(6), 5, null), androidx.compose.ui.unit.h.r(20), 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04SemiBold(), c0Var2, 48, 0, 131068);
                    function2.invoke(c0Var2, 0);
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, (i12 & 14) | a5.S0, 2);
            a0Var = a0Var2;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.q1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCardScaffoldKt.HomeCardScaffold$lambda$0(a0Var3, cardTitle, content, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeCardScaffold$lambda$0(androidx.compose.ui.a0 a0Var, String cardTitle, Function2 content, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(cardTitle, "$cardTitle");
        Intrinsics.checkNotNullParameter(content, "$content");
        HomeCardScaffold(a0Var, cardTitle, content, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void HomeCardScaffoldPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1294989986);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeCardScaffoldKt.INSTANCE.m133getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.p1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCardScaffoldKt.HomeCardScaffoldPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeCardScaffoldPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        HomeCardScaffoldPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
