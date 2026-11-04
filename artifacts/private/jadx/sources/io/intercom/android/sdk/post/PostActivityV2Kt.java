package io.intercom.android.sdk.post;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.v;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.m;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPostActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostActivityV2.kt\nio/intercom/android/sdk/post/PostActivityV2Kt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,329:1\n113#2:330\n113#2:331\n113#2:403\n113#2:404\n113#2:454\n113#2:455\n99#3,6:332\n99#3:365\n95#3,10:366\n106#3:449\n106#3:453\n99#3,6:456\n106#3:492\n80#4,6:338\n87#4,3:353\n90#4,2:362\n80#4,6:376\n87#4,3:391\n90#4,2:400\n80#4,6:415\n87#4,3:430\n90#4,2:439\n94#4:444\n94#4:448\n94#4:452\n80#4,6:462\n87#4,3:477\n90#4,2:486\n94#4:491\n391#5,9:344\n400#5:364\n391#5,9:382\n400#5:402\n391#5,9:421\n400#5,3:441\n401#5,2:446\n401#5,2:450\n391#5,9:468\n400#5,3:488\n4360#6,6:356\n4360#6,6:394\n4360#6,6:433\n4360#6,6:480\n87#7:405\n84#7,9:406\n94#7:445\n*S KotlinDebug\n*F\n+ 1 PostActivityV2.kt\nio/intercom/android/sdk/post/PostActivityV2Kt\n*L\n287#1:330\n289#1:331\n293#1:403\n294#1:404\n321#1:454\n323#1:455\n283#1:332,6\n292#1:365\n292#1:366,10\n292#1:449\n283#1:453\n317#1:456,6\n317#1:492\n283#1:338,6\n283#1:353,3\n283#1:362,2\n292#1:376,6\n292#1:391,3\n292#1:400,2\n294#1:415,6\n294#1:430,3\n294#1:439,2\n294#1:444\n292#1:448\n283#1:452\n317#1:462,6\n317#1:477,3\n317#1:486,2\n317#1:491\n283#1:344,9\n283#1:364\n292#1:382,9\n292#1:402\n294#1:421,9\n294#1:441,3\n292#1:446,2\n283#1:450,2\n317#1:468,9\n317#1:488,3\n283#1:356,6\n292#1:394,6\n294#1:433,6\n317#1:480,6\n294#1:405\n294#1:406,9\n294#1:445\n*E\n"})
public final class PostActivityV2Kt {
    @o
    @p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomBarContent(@NotNull final a0 modifier, @NotNull final n<? super x5, ? super c0, ? super Integer, Unit> content, @Nullable c0 c0Var, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(content, "content");
        c0 c0VarR = c0Var.R(2049700691);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            a0 a0VarT = d5.t(v.d(i6.i(i6.h(modifier, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), q0.f38131b.a(), null, 2, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
            a1 a1VarE = u5.e(q.f16330a.s(), cVarQ, c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            a0 a0VarN = m.n(c0VarR, a0VarT);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            content.invoke(y5.f16577a, c0VarR, Integer.valueOf((i11 & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.post.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostActivityV2Kt.BottomBarContent$lambda$5(modifier, content, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarContent$lambda$5(a0 modifier, n content, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        Intrinsics.checkNotNullParameter(content, "$content");
        BottomBarContent(modifier, content, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TopBar(final a0 a0Var, final Avatar avatar, final String str, final String str2, final Function0<Unit> function0, c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(131412917);
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        androidx.compose.ui.e.c cVarQ = aVar.q();
        a0 a0VarI = i6.i(i6.h(a0Var, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56));
        q0.a aVar2 = q0.f38131b;
        a0 a0VarT = d5.t(v.d(a0VarI, aVar2.a(), null, 2, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
        q qVar = q.f16330a;
        a1 a1VarE = u5.e(qVar.s(), cVarQ, c0VarR, 54);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = m.n(c0VarR, a0VarT);
        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarE, aVar3.e());
        y7.n(c0VarD, b1VarK, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar3.f());
        y5 y5Var = y5.f16577a;
        androidx.compose.ui.e.c cVarQ2 = aVar.q();
        a0.a aVar4 = a0.E;
        a1 a1VarE2 = u5.e(qVar.w(), cVarQ2, c0VarR, 48);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        a0 a0VarN2 = m.n(c0VarR, aVar4);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A2);
        } else {
            c0VarR.l();
        }
        c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarE2, aVar3.e());
        y7.n(c0VarD2, b1VarK2, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar3.f());
        CircularAvatarComponentKt.m467CircularAvataraMcp0Q(avatar, aVar2.w(), androidx.compose.ui.unit.h.r(32), c0VarR, 440, 0);
        a0 a0VarT2 = d5.t(aVar4, androidx.compose.ui.unit.h.r(8), 0.0f, 2, null);
        a1 a1VarB = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
        int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK3 = c0VarR.k();
        a0 a0VarN3 = m.n(c0VarR, a0VarT2);
        Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A3);
        } else {
            c0VarR.l();
        }
        c0 c0VarD3 = y7.d(c0VarR);
        y7.n(c0VarD3, a1VarB, aVar3.e());
        y7.n(c0VarD3, b1VarK3, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
            c0VarD3.Y(Integer.valueOf(iHashCode3));
            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
        }
        y7.n(c0VarD3, a0VarN3, aVar3.f());
        n0 n0Var = n0.f16227a;
        long jW = aVar2.w();
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        q50.t(str, null, jW, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i11).getType04Point5(), c0VarR, ((i10 >> 6) & 14) | a5.S0, 0, 131066);
        c0 c0Var2 = c0VarR;
        c0Var2.E(-2145849205);
        if (!StringsKt.w3(str2)) {
            q50.t(str2, null, aVar2.w(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i11).getType05(), c0Var2, ((i10 >> 9) & 14) | a5.S0, 0, 131066);
            c0Var2 = c0Var2;
        }
        c0Var2.A();
        c0Var2.o();
        c0Var2.o();
        c0 c0Var3 = c0Var2;
        ni.o(u0.e.c(R.drawable.intercom_ic_close, c0Var2, 0), u0.i.d(io.intercom.android.sdk.R.string.intercom_dismiss, c0Var2, 0), i1.j(aVar4, false, null, null, null, function0, 15, null), aVar2.w(), c0Var3, 3080, 0);
        c0Var3.o();
        s5 s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.post.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostActivityV2Kt.TopBar$lambda$3(a0Var, avatar, str, str2, function0, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBar$lambda$3(a0 modifier, Avatar avatar, String title, String subTitle, Function0 onCloseClick, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        Intrinsics.checkNotNullParameter(avatar, "$avatar");
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(subTitle, "$subTitle");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        TopBar(modifier, avatar, title, subTitle, onCloseClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
