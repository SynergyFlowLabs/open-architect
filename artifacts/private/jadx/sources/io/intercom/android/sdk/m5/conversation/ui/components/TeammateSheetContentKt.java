package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTeammateSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeammateSheetContent.kt\nio/intercom/android/sdk/m5/conversation/ui/components/TeammateSheetContentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,78:1\n113#2:79\n87#3:80\n85#3,8:81\n94#3:119\n80#4,6:89\n87#4,3:104\n90#4,2:113\n94#4:118\n391#5,9:95\n400#5,3:115\n4360#6,6:107\n*S KotlinDebug\n*F\n+ 1 TeammateSheetContent.kt\nio/intercom/android/sdk/m5/conversation/ui/components/TeammateSheetContentKt\n*L\n28#1:79\n26#1:80\n26#1:81,8\n26#1:119\n26#1:89,6\n26#1:104,3\n26#1:113,2\n26#1:118\n26#1:95,9\n26#1:115,3\n26#1:107,6\n*E\n"})
public final class TeammateSheetContentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeammateSheetContent(@Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @NotNull final ExpandedTeamPresenceState teamPresenceState, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(755089345);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        final String str2 = (i11 & 2) != 0 ? null : str;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.e.f37317a.u(), c0VarR, 6);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
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
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(teamPresenceState, i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), c0VarR, 56, 0);
        c0VarR.E(-1851009825);
        if (str2 != null && str2.length() != 0) {
            SpecialNoticeKt.SpecialNotice(str2, null, c0VarR, (i10 >> 3) & 14, 2);
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.q2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeammateSheetContentKt.TeammateSheetContent$lambda$1(a0Var2, str2, teamPresenceState, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeammateSheetContent$lambda$1(androidx.compose.ui.a0 a0Var, String str, ExpandedTeamPresenceState teamPresenceState, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        TeammateSheetContent(a0Var, str, teamPresenceState, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeammateSheetContentPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(223292015);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeammateSheetContentKt.INSTANCE.m224getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeammateSheetContentKt.TeammateSheetContentPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeammateSheetContentPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TeammateSheetContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
