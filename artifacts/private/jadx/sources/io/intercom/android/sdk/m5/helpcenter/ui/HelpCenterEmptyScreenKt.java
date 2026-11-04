package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHelpCenterEmptyScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterEmptyScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterEmptyScreenKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,35:1\n70#2:36\n66#2,10:37\n77#2:78\n80#3,6:47\n87#3,3:62\n90#3,2:71\n94#3:77\n391#4,9:53\n400#4:73\n401#4,2:75\n4360#5,6:65\n75#6:74\n*S KotlinDebug\n*F\n+ 1 HelpCenterEmptyScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterEmptyScreenKt\n*L\n19#1:36\n19#1:37,10\n19#1:78\n19#1:47,6\n19#1:62,3\n19#1:71,2\n19#1:77\n19#1:53,9\n19#1:73\n19#1:75,2\n19#1:65,6\n22#1:74\n*E\n"})
public final class HelpCenterEmptyScreenKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterEmptyScreen(@Nullable final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-123597347);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            int i14 = 0 >> 1;
            androidx.compose.ui.a0 a0VarF = i6.f(a0Var, 0.0f, 1, null);
            String string = ((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())).getString(R.string.intercom_no_articles_to_display);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            EmptyStateKt.EmptyState(string, a0VarF, null, Integer.valueOf(R.drawable.intercom_help_centre_icon), null, c0VarR, 0, 20);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterEmptyScreenKt.HelpCenterEmptyScreen$lambda$1(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterEmptyScreen$lambda$1(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        HelpCenterEmptyScreen(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void InboxEmptyScreenPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1897399468);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterEmptyScreenKt.INSTANCE.m333getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterEmptyScreenKt.InboxEmptyScreenPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxEmptyScreenPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        InboxEmptyScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
