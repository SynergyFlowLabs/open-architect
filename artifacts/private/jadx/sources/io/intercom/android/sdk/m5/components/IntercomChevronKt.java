package io.intercom.android.sdk.m5.components;

import androidx.compose.material3.ni;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomChevron.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomChevron.kt\nio/intercom/android/sdk/m5/components/IntercomChevronKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,33:1\n75#2:34\n*S KotlinDebug\n*F\n+ 1 IntercomChevron.kt\nio/intercom/android/sdk/m5/components/IntercomChevronKt\n*L\n20#1:34\n*E\n"})
public final class IntercomChevronKt {
    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(locale = "ar", name = "RTL"), @d1.c(locale = "en", name = "LTR")})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void IntercomChevron(@Nullable final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(467059601);
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
            boolean z10 = false | false;
            ni.o(u0.e.c(R.drawable.intercom_chevron, c0VarR, 0), null, androidx.compose.ui.draw.u.a(a0Var, c0VarR.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl ? 180.0f : 0.0f), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU(), c0VarR, 56, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.z1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomChevronKt.IntercomChevron$lambda$0(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomChevron$lambda$0(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        IntercomChevron(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
