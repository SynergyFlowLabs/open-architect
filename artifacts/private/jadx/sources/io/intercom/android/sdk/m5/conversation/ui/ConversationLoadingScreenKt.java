package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.os;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationLoadingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationLoadingScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationLoadingScreenKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,36:1\n70#2:37\n68#2,8:38\n77#2:76\n80#3,6:46\n87#3,3:61\n90#3,2:70\n94#3:75\n391#4,9:52\n400#4,3:72\n4360#5,6:64\n*S KotlinDebug\n*F\n+ 1 ConversationLoadingScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationLoadingScreenKt\n*L\n17#1:37\n17#1:38,8\n17#1:76\n17#1:46,6\n17#1:61,3\n17#1:70,2\n17#1:75\n17#1:52,9\n17#1:72,3\n17#1:64,6\n*E\n"})
public final class ConversationLoadingScreenKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ConversationLoadingScreen(@Nullable final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1301092108);
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
            androidx.compose.ui.a0 a0VarF = i6.f(a0Var, 0.0f, 1, null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(a0VarF, intercomTheme.getColors(c0VarR, i14).m690getBackground0d7_KjU(), null, 2, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
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
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            os.F(null, intercomTheme.getColors(c0VarR, i14).m685getActionContrastWhite0d7_KjU(), 0.0f, 0L, 0, 0.0f, c0VarR, 0, 61);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationLoadingScreenKt.ConversationLoadingScreen$lambda$1(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationLoadingScreen$lambda$1(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        ConversationLoadingScreen(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ConversationLoadingScreenPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(389316475);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationLoadingScreenKt.INSTANCE.m196getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationLoadingScreenKt.ConversationLoadingScreenPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationLoadingScreenPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ConversationLoadingScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
