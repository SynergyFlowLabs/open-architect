package io.intercom.android.sdk.ui.component;

import androidx.compose.material3.ld;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomDivider.kt\nio/intercom/android/sdk/ui/component/IntercomDividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,17:1\n113#2:18\n*S KotlinDebug\n*F\n+ 1 IntercomDivider.kt\nio/intercom/android/sdk/ui/component/IntercomDividerKt\n*L\n14#1:18\n*E\n"})
public final class IntercomDividerKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void IntercomDivider(@Nullable final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2071363704);
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
            ld.h(a0Var, androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0VarR, 6).m701getDivider0d7_KjU(), c0VarR, (i12 & 14) | 48, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomDividerKt.IntercomDivider$lambda$0(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomDivider$lambda$0(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        IntercomDivider(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
