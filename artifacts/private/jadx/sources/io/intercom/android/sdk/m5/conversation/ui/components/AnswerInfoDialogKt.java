package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAnswerInfoDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerInfoDialog.kt\nio/intercom/android/sdk/m5/conversation/ui/components/AnswerInfoDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,110:1\n1282#2,6:111\n113#3:117\n99#4,6:118\n106#4:154\n80#5,6:124\n87#5,3:139\n90#5,2:148\n94#5:153\n391#6,9:130\n400#6,3:150\n4360#7,6:142\n*S KotlinDebug\n*F\n+ 1 AnswerInfoDialog.kt\nio/intercom/android/sdk/m5/conversation/ui/components/AnswerInfoDialogKt\n*L\n71#1:111,6\n73#1:117\n69#1:118,6\n69#1:154\n69#1:124,6\n69#1:139,3\n69#1:148,2\n69#1:153\n69#1:130,9\n69#1:150,3\n69#1:142,6\n*E\n"})
public final class AnswerInfoDialogKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$AnswerInfoDialog$3, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nAnswerInfoDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerInfoDialog.kt\nio/intercom/android/sdk/m5/conversation/ui/components/AnswerInfoDialogKt$AnswerInfoDialog$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,110:1\n113#2:111\n113#2:149\n87#3:112\n84#3,9:113\n94#3:159\n80#4,6:122\n87#4,3:137\n90#4,2:146\n94#4:158\n391#5,9:128\n400#5:148\n401#5,2:156\n4360#6,6:140\n1282#7,6:150\n*S KotlinDebug\n*F\n+ 1 AnswerInfoDialog.kt\nio/intercom/android/sdk/m5/conversation/ui/components/AnswerInfoDialogKt$AnswerInfoDialog$3\n*L\n39#1:111\n44#1:149\n35#1:112\n35#1:113,9\n35#1:159\n35#1:122,6\n35#1:137,3\n35#1:146,2\n35#1:158\n35#1:128,9\n35#1:148\n35#1:156,2\n35#1:140,6\n52#1:150,6\n*E\n"})
    static final class AnonymousClass3 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ AiAnswerInfo $info;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function0<Unit> $onReportAiAnswer;
        final /* synthetic */ boolean $showReportAiAnswerButton;

        AnonymousClass3(AiAnswerInfo aiAnswerInfo, boolean z10, Function0<Unit> function0, Function0<Unit> function1) {
            this.$info = aiAnswerInfo;
            this.$showReportAiAnswerButton = z10;
            this.$onDismiss = function0;
            this.$onReportAiAnswer = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function0 function0, Function0 function1) {
            function0.invoke();
            function1.invoke();
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
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.v.c(aVar, intercomTheme.getColors(c0Var, i11).m690getBackground0d7_KjU(), androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(10)));
            androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
            AiAnswerInfo aiAnswerInfo = this.$info;
            boolean z10 = this.$showReportAiAnswerButton;
            final Function0<Unit> function0 = this.$onDismiss;
            final Function0<Unit> function1 = this.$onReportAiAnswer;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), bVarM, c0Var, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarC);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            q50.t(aiAnswerInfo.getText(), d5.s(aVar, androidx.compose.ui.unit.h.r(24), androidx.compose.ui.unit.h.r(16)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var, i11).getType04(), c0Var, 48, 0, 131068);
            c0Var.E(1930845637);
            if (z10) {
                IntercomDividerKt.IntercomDivider(null, c0Var, 0, 1);
                String strD = u0.i.d(R.string.intercom_report_ai_answer, c0Var, 0);
                c0Var.E(1930852571);
                boolean zD = c0Var.D(function0) | c0Var.D(function1);
                Object objI0 = c0Var.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AnswerInfoDialogKt.AnonymousClass3.invoke$lambda$2$lambda$1$lambda$0(function0, function1);
                        }
                    };
                    c0Var.Y(objI0);
                }
                c0Var.A();
                AnswerInfoDialogKt.AnswerInfoButton(strD, (Function0) objI0, null, c0Var, 0, 4);
            }
            c0Var.A();
            c0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AnswerInfoButton(final String str, final Function0<Unit> function0, androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        String str2;
        int i12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(8337655);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            str2 = str;
        } else if ((i10 & 14) == 0) {
            str2 = str;
            i12 = i10 | (c0VarR.D(str2) ? 4 : 2);
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
            a0Var2 = a0Var;
            c0Var2 = c0VarR;
        } else {
            androidx.compose.ui.a0 a0Var3 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            c0VarR.E(934769186);
            boolean z10 = (i12 & com.planner5d.library.engine.input.f.b.B) == 32;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnswerInfoDialogKt.AnswerInfoButton$lambda$4$lambda$3(function0);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarS = d5.s(i6.h(androidx.compose.foundation.i1.j(aVar, false, null, null, null, (Function0) objI0, 15, null), 0.0f, 1, null), androidx.compose.ui.unit.h.r(24), androidx.compose.ui.unit.h.r(16));
            androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarS);
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
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            c0Var2 = c0VarR;
            q50.t(str2, null, intercomTheme.getColors(c0VarR, i13).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(intercomTheme.getTypography(c0VarR, i13).getType04(), 0L, 0L, androidx.compose.ui.text.font.v0.f41742b.o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), c0Var2, i12 & 14, 0, 131066);
            c0Var2.o();
            a0Var2 = a0Var3;
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnswerInfoDialogKt.AnswerInfoButton$lambda$6(str, function0, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoButton$lambda$4$lambda$3(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoButton$lambda$6(String text, Function0 onClick, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        AnswerInfoButton(text, onClick, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AnswerInfoDialog(@NotNull final AiAnswerInfo info, final boolean z10, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final Function0<Unit> function2;
        Intrinsics.checkNotNullParameter(info, "info");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1331432837);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(info) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(function0) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c0VarR.k0(function1) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
            function2 = function0;
        } else {
            if (i13 != 0) {
                function0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            }
            Function0<Unit> function3 = function0;
            if (i14 != 0) {
                function1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            }
            androidx.compose.ui.window.b.a(function3, null, androidx.compose.runtime.internal.w.e(-1632439278, true, new AnonymousClass3(info, z10, function3, function1), c0VarR, 54), c0VarR, ((i12 >> 6) & 14) | a5.S0, 2);
            function2 = function3;
        }
        final Function0<Unit> function4 = function1;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnswerInfoDialogKt.AnswerInfoDialog$lambda$2(info, z10, function2, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoDialog$lambda$2(AiAnswerInfo info, boolean z10, Function0 function0, Function0 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(info, "$info");
        AnswerInfoDialog(info, z10, function0, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AnswerInfoDialogPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1630534767);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AnswerInfoDialogKt.INSTANCE.m198getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnswerInfoDialogKt.AnswerInfoDialogPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoDialogPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        AnswerInfoDialogPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AnswerInfoDialogWithoutReportButtonPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-916076999);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AnswerInfoDialogKt.INSTANCE.m199getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnswerInfoDialogKt.AnswerInfoDialogWithoutReportButtonPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoDialogWithoutReportButtonPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        AnswerInfoDialogWithoutReportButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
