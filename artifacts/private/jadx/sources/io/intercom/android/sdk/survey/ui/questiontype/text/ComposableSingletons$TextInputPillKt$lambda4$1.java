package io.intercom.android.sdk.survey.ui.questiontype.text;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$TextInputPillKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTextInputPill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputPill.kt\nio/intercom/android/sdk/survey/ui/questiontype/text/ComposableSingletons$TextInputPillKt$lambda-4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,193:1\n113#2:194\n87#3:195\n84#3,9:196\n94#3:235\n80#4,6:205\n87#4,3:220\n90#4,2:229\n94#4:234\n391#5,9:211\n400#5,3:231\n4360#6,6:223\n*S KotlinDebug\n*F\n+ 1 TextInputPill.kt\nio/intercom/android/sdk/survey/ui/questiontype/text/ComposableSingletons$TextInputPillKt$lambda-4$1\n*L\n165#1:194\n165#1:195\n165#1:196,9\n165#1:235\n165#1:205,6\n165#1:220,3\n165#1:229,2\n165#1:234\n165#1:211,9\n165#1:231,3\n165#1:223,6\n*E\n"})
final class ComposableSingletons$TextInputPillKt$lambda4$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$TextInputPillKt$lambda4$1 INSTANCE = new ComposableSingletons$TextInputPillKt$lambda4$1();

    ComposableSingletons$TextInputPillKt$lambda4$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
            return;
        }
        androidx.compose.ui.a0 a0VarR = d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16));
        a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        b1 b1VarK = c0Var.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarR);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0Var.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var.q();
        if (c0Var.P()) {
            c0Var.q0(function0A);
        } else {
            c0Var.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        n0 n0Var = n0.f16227a;
        TextInputPillKt.m523TextInputPillg5ZjG94("some text", "Enter text...", new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$TextInputPillKt$lambda4$1.invoke$lambda$1$lambda$0((String) obj);
            }
        }, q0.n(q0.f38131b.q()), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)).m423getButton0d7_KjU(), 0, false, null, 0, 0, false, null, false, 0.0f, c0Var, 3510, 6, 15328);
        c0Var.o();
    }
}
