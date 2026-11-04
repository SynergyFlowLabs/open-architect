package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.c4;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTeamPresenceRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeamPresenceRow.kt\nio/intercom/android/sdk/m5/components/TeamPresenceRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,57:1\n113#2:58\n113#2:96\n99#3:59\n96#3,9:60\n106#3:100\n80#4,6:69\n87#4,3:84\n90#4,2:93\n94#4:99\n391#5,9:75\n400#5:95\n401#5,2:97\n4360#6,6:87\n*S KotlinDebug\n*F\n+ 1 TeamPresenceRow.kt\nio/intercom/android/sdk/m5/components/TeamPresenceRowKt\n*L\n24#1:58\n36#1:96\n22#1:59\n22#1:60,9\n22#1:100\n22#1:69,6\n22#1:84,3\n22#1:93,2\n22#1:99\n22#1:75,9\n22#1:95\n22#1:97,2\n22#1:87,6\n*E\n"})
public final class TeamPresenceRowKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeamPresenceRow(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<AvatarWrapper> avatars, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1370953565);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.a0 a0VarA = c4.a(d5.s(a0Var2, androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), "team_presence_row");
        androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA);
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
        y7.n(c0VarD, a1VarE, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        q50.t(u0.i.d(R.string.intercom_the_team_can_help_if_needed, c0VarR, 0), x5.q(y5.f16577a, androidx.compose.ui.a0.E, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5(), ColorExtensionsKt.toComposeColor$default("#757575", 0.0f, 1, null), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, 0, 0, 131068);
        AvatarGroupKt.m101AvatarGroupJ8mCjc(CollectionsKt.take(avatars, 3), null, androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 392, 10);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.x2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamPresenceRowKt.TeamPresenceRow$lambda$1(a0Var2, avatars, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceRow$lambda$1(androidx.compose.ui.a0 a0Var, List avatars, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        TeamPresenceRow(a0Var, avatars, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void TeamPresenceRowPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1211328616);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceRowKt.INSTANCE.m157getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.y2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamPresenceRowKt.TeamPresenceRowPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceRowPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TeamPresenceRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
