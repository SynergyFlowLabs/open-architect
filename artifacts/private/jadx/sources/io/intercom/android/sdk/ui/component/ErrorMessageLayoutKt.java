package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
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
@SourceDebugExtension({"SMAP\nErrorMessageLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorMessageLayout.kt\nio/intercom/android/sdk/ui/component/ErrorMessageLayoutKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n113#2:56\n113#2:94\n113#2:98\n99#3:57\n96#3,9:58\n106#3:102\n80#4,6:67\n87#4,3:82\n90#4,2:91\n94#4:101\n391#5,9:73\n400#5:93\n401#5,2:99\n4360#6,6:85\n1872#7,3:95\n*S KotlinDebug\n*F\n+ 1 ErrorMessageLayout.kt\nio/intercom/android/sdk/ui/component/ErrorMessageLayoutKt\n*L\n27#1:56\n31#1:94\n47#1:98\n24#1:57\n24#1:58,9\n24#1:102\n24#1:67,6\n24#1:82,3\n24#1:91,2\n24#1:101\n24#1:73,9\n24#1:93\n24#1:99,2\n24#1:85,6\n37#1:95,3\n*E\n"})
public final class ErrorMessageLayoutKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ErrorMessageLayout(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<? extends StringProvider> errorMessages, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(errorMessages, "errorMessages");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1308212592);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        float f10 = 4;
        androidx.compose.ui.a0 a0VarV = d5.v(i6.h(a0Var2, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f10), 5, null);
        a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
        ni.o(u0.e.c(R.drawable.intercom_ic_error, c0VarR, 0), null, i6.B(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), IntercomTheme.INSTANCE.getColors(c0VarR, 6).m702getError0d7_KjU(), c0VarR, 440, 0);
        StringBuilder sb2 = new StringBuilder();
        c0VarR.E(-1467578667);
        int i12 = 0;
        for (Object obj : errorMessages) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sb2.append(((StringProvider) obj).getText(c0VarR, 0));
            if (i12 != errorMessages.size() - 1) {
                sb2.append(". ");
            }
            i12 = i13;
        }
        c0VarR.A();
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        androidx.compose.ui.a0 a0VarV2 = d5.v(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10), 0.0f, 0.0f, 0.0f, 14, null);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        q50.t(string, a0VarV2, intercomTheme.getColors(c0VarR, 6).m702getError0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, intercomTheme.getTypography(c0VarR, 6).getType04(), c0VarR, 48, 24960, 110584);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ErrorMessageLayoutKt.ErrorMessageLayout$lambda$2(a0Var2, errorMessages, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorMessageLayout$lambda$2(androidx.compose.ui.a0 a0Var, List errorMessages, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(errorMessages, "$errorMessages");
        ErrorMessageLayout(a0Var, errorMessages, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
