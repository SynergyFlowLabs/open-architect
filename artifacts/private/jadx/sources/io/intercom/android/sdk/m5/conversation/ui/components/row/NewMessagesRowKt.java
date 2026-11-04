package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ld;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nNewMessagesRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewMessagesRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/NewMessagesRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,46:1\n113#2:47\n113#2:85\n113#2:86\n99#3:48\n96#3,9:49\n106#3:90\n80#4,6:58\n87#4,3:73\n90#4,2:82\n94#4:89\n391#5,9:64\n400#5:84\n401#5,2:87\n4360#6,6:76\n*S KotlinDebug\n*F\n+ 1 NewMessagesRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/NewMessagesRowKt\n*L\n25#1:47\n29#1:85\n33#1:86\n22#1:48\n22#1:49,9\n22#1:90\n22#1:58,6\n22#1:73,3\n22#1:82,2\n22#1:89\n22#1:64,9\n22#1:84\n22#1:87,2\n22#1:76,6\n*E\n"})
public final class NewMessagesRowKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NewMessagesRow(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1974801002);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = i10 | (c0VarR.D(a0Var2) ? 4 : 2);
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            androidx.compose.ui.a0 a0VarT = d5.t(i6.h(a0Var3, 0.0f, 1, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
            androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
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
            y5 y5Var = y5.f16577a;
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarB = i6.B(aVar2, androidx.compose.ui.unit.h.r(36));
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            ld.h(a0VarB, 0.0f, intercomTheme.getColors(c0VarR, i14).m691getBadge0d7_KjU(), c0VarR, 6, 2);
            q50.t(u0.i.d(R.string.intercom_new, c0VarR, 0), d5.t(aVar2, androidx.compose.ui.unit.h.r(8), 0.0f, 2, null), intercomTheme.getColors(c0VarR, i14).m691getBadge0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 48, 0, 262136);
            c0VarR = c0VarR;
            ld.h(null, 0.0f, intercomTheme.getColors(c0VarR, i14).m691getBadge0d7_KjU(), c0VarR, 0, 3);
            c0VarR.o();
            a0Var2 = a0Var3;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.c1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewMessagesRowKt.NewMessagesRow$lambda$1(a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewMessagesRow$lambda$1(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        NewMessagesRow(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NewMessagesRowPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2081615555);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            NewMessagesRow(null, c0VarR, 0, 1);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.d1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewMessagesRowKt.NewMessagesRowPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewMessagesRowPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        NewMessagesRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
