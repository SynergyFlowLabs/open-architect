package io.intercom.android.sdk.survey.ui.components.validation;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.m;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import d1.c;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nValidationErrorComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidationErrorComponent.kt\nio/intercom/android/sdk/survey/ui/components/validation/ValidationErrorComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n113#2:67\n113#2:105\n113#2:109\n99#3:68\n96#3,9:69\n106#3:113\n80#4,6:78\n87#4,3:93\n90#4,2:102\n94#4:112\n391#5,9:84\n400#5:104\n401#5,2:110\n4360#6,6:96\n75#7:106\n1863#8,2:107\n*S KotlinDebug\n*F\n+ 1 ValidationErrorComponent.kt\nio/intercom/android/sdk/survey/ui/components/validation/ValidationErrorComponentKt\n*L\n32#1:67\n36#1:105\n49#1:109\n29#1:68\n29#1:69,9\n29#1:113\n29#1:78,6\n29#1:93,3\n29#1:102,2\n29#1:112\n29#1:84,9\n29#1:104\n29#1:110,2\n29#1:96,6\n41#1:106\n42#1:107,2\n*E\n"})
public final class ValidationErrorComponentKt {
    @o
    @c(showBackground = true)
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void ErrorPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1851250451);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ValidationErrorComponentKt.INSTANCE.m471getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.validation.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ValidationErrorComponentKt.ErrorPreview$lambda$3(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorPreview$lambda$3(int i10, c0 c0Var, int i11) {
        ErrorPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: ValidationErrorComponent-FNF3uiM, reason: not valid java name */
    public static final void m472ValidationErrorComponentFNF3uiM(@Nullable a0 a0Var, @NotNull final ValidationError.ValidationStringError validationStringError, final long j10, @Nullable c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(validationStringError, "validationStringError");
        c0 c0VarR = c0Var.R(-1195832801);
        final a0 a0Var2 = (i11 & 1) != 0 ? a0.E : a0Var;
        float f10 = 2;
        a0 a0VarV = d5.v(i6.h(a0Var2, 0.0f, 1, null), 0.0f, h.r(f10), 0.0f, h.r(f10), 5, null);
        a1 a1VarE = u5.e(q.f16330a.w(), e.f37317a.q(), c0VarR, 48);
        int iHashCode = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = m.n(c0VarR, a0VarV);
        g.a aVar = g.I;
        Function0<g> function0A = aVar.a();
        if (c0VarR.S() == null) {
            v.r();
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
        Function2<g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        y5 y5Var = y5.f16577a;
        ni.o(u0.e.c(R.drawable.intercom_ic_error, c0VarR, 0), null, i6.B(a0.E, h.r(16)), j10, c0VarR, ((i10 << 3) & 7168) | 440, 0);
        Phrase phraseFrom = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), validationStringError.getStringRes());
        Iterator<T> it = validationStringError.getParams().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            phraseFrom.put((String) pair.getFirst(), (CharSequence) pair.getSecond());
        }
        q50.t(phraseFrom.format().toString(), d5.v(i6.h(a0.E, 0.0f, 1, null), h.r(4), 0.0f, 0.0f, 0.0f, 14, null), j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), c0VarR, (i10 & 896) | 48, 0, 131064);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.validation.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ValidationErrorComponentKt.ValidationErrorComponent_FNF3uiM$lambda$2(a0Var2, validationStringError, j10, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValidationErrorComponent_FNF3uiM$lambda$2(a0 a0Var, ValidationError.ValidationStringError validationStringError, long j10, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(validationStringError, "$validationStringError");
        m472ValidationErrorComponentFNF3uiM(a0Var, validationStringError, j10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
