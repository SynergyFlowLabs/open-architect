package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.os;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSurveyTopBarComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyTopBarComponent.kt\nio/intercom/android/sdk/survey/ui/components/SurveyTopBarComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,165:1\n87#2:166\n84#2,9:167\n94#2:298\n80#3,6:176\n87#3,3:191\n90#3,2:200\n80#3,6:211\n87#3,3:226\n90#3,2:235\n80#3,6:250\n87#3,3:265\n90#3,2:274\n94#3:280\n94#3:285\n94#3:297\n391#4,9:182\n400#4:202\n391#4,9:217\n400#4:237\n391#4,9:256\n400#4:276\n401#4,2:278\n401#4,2:283\n401#4,2:295\n4360#5,6:194\n4360#5,6:229\n4360#5,6:268\n113#6:203\n113#6:204\n113#6:277\n113#6:282\n113#6:287\n113#6:288\n99#7,6:205\n99#7:239\n95#7,10:240\n106#7:281\n106#7:286\n75#8:238\n1282#9,6:289\n*S KotlinDebug\n*F\n+ 1 SurveyTopBarComponent.kt\nio/intercom/android/sdk/survey/ui/components/SurveyTopBarComponentKt\n*L\n50#1:166\n50#1:167,9\n50#1:298\n50#1:176,6\n50#1:191,3\n50#1:200,2\n54#1:211,6\n54#1:226,3\n54#1:235,2\n70#1:250,6\n70#1:265,3\n70#1:274,2\n70#1:280\n54#1:285\n50#1:297\n50#1:182,9\n50#1:202\n54#1:217,9\n54#1:237\n70#1:256,9\n70#1:276\n70#1:278,2\n54#1:283,2\n50#1:295,2\n50#1:194,6\n54#1:229,6\n70#1:268,6\n53#1:203\n57#1:204\n72#1:277\n84#1:282\n98#1:287\n127#1:288\n54#1:205,6\n70#1:239\n70#1:240,10\n70#1:281\n54#1:286\n64#1:238\n123#1:289,6\n*E\n"})
public final class SurveyTopBarComponentKt {
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NoTopBar(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1502798722);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            boolean z10 = false;
            SurveyTopBar(new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), new ProgressBarState(false, 0.0f, 3, null)), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.n0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, null, c0VarR, 48, 4);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyTopBarComponentKt.NoTopBar$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoTopBar$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        NoTopBar(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SurveyAvatarBar(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1511683997);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            Avatar avatarBuild = new Avatar.Builder().withInitials("VR").build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
            SurveyTopBar(new TopBarState.SenderTopBarState(avatarBuild, "Vinesh", SurveyComponentKt.getEmptyAppConfig(), false, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, 32, null), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, null, c0VarR, 56, 4);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.t0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyTopBarComponentKt.SurveyAvatarBar$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyAvatarBar$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SurveyAvatarBar(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:103:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:106:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:109:0x041a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0422  */
    /* JADX WARN: Code duplicated, block: B:116:0x0456  */
    /* JADX WARN: Code duplicated, block: B:118:0x0467  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x014a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:66:0x0187  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0202  */
    /* JADX WARN: Code duplicated, block: B:74:0x020e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0212  */
    /* JADX WARN: Code duplicated, block: B:78:0x0231  */
    /* JADX WARN: Code duplicated, block: B:80:0x023f  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x031b  */
    /* JADX WARN: Code duplicated, block: B:88:0x034f  */
    /* JADX WARN: Code duplicated, block: B:91:0x036f  */
    /* JADX WARN: Code duplicated, block: B:93:0x039e  */
    /* JADX WARN: Code duplicated, block: B:94:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x03be  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SurveyTopBar(@NotNull final TopBarState topBarState, @NotNull final Function0<Unit> onClose, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.foundation.layout.q qVar;
        androidx.compose.ui.e.a aVar;
        int iHashCode;
        androidx.compose.ui.node.g.a aVar2;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.ui.a0.a aVar3;
        float f10;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        androidx.compose.runtime.c0 c0Var2;
        float f11;
        boolean z10;
        int i13;
        int i14;
        ProgressBarState progressBarState;
        final androidx.compose.ui.a0 a0Var4;
        final n7<Float> n7VarF;
        long jB;
        SurveyUiColors surveyUiColors;
        long jM423getButton0d7_KjU;
        boolean zD;
        Object objI0;
        int iHashCode3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-295801747);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(topBarState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.k0(onClose) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 896) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c0VarR.d()) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
                aVar2 = androidx.compose.ui.node.g.I;
                function0A = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarB, aVar2.e());
                y7.n(c0VarD, b1VarK, aVar2.g());
                function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                aVar3 = androidx.compose.ui.a0.E;
                f10 = 16;
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
                androidx.compose.ui.e.c cVarQ = aVar.q();
                androidx.compose.ui.a0 a0VarH = i6.h(d5.t(aVar3, androidx.compose.ui.unit.h.r(f10), 0.0f, 2, null), 0.0f, 1, null);
                a1 a1VarE = u5.e(qVar.s(), cVarQ, c0VarR, 54);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarH);
                function0A2 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE, aVar2.e());
                y7.n(c0VarD2, b1VarK2, aVar2.g());
                function2B2 = aVar2.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar2.f());
                y5 y5Var = y5.f16577a;
                if (topBarState instanceof TopBarState.SenderTopBarState) {
                    c0VarR.E(359789399);
                    TopBarState.SenderTopBarState senderTopBarState = (TopBarState.SenderTopBarState) topBarState;
                    CharSequence charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_teammate_from_company).put("name", senderTopBarState.getSenderName()).put("company", senderTopBarState.getAppConfig().getName()).format();
                    a1 a1VarE2 = u5.e(qVar.w(), aVar.q(), c0VarR, 48);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar3);
                    function0A3 = aVar2.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = y7.d(c0VarR);
                    y7.n(c0VarD3, a1VarE2, aVar2.e());
                    y7.n(c0VarD3, b1VarK3, aVar2.g());
                    function2B3 = aVar2.b();
                    if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN3, aVar2.f());
                    z10 = true;
                    CircularAvatarComponentKt.m467CircularAvataraMcp0Q(senderTopBarState.getAvatar(), androidx.compose.ui.graphics.s0.b(senderTopBarState.getAppConfig().getSecondaryColor()), 0.0f, c0VarR, 8, 4);
                    l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    f11 = f10;
                    q50.t(charSequence.toString(), null, senderTopBarState.getSurveyUiColors().m426getOnBackground0d7_KjU(), null, androidx.compose.ui.unit.a0.m(14), null, v0.f41742b.m(), null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, null, c0VarR, 1597440, 24960, 241578);
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    c0Var2.A();
                    i13 = 6;
                } else {
                    c0Var2 = c0VarR;
                    f11 = f10;
                    z10 = true;
                    if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                        c0Var2.E(1535625002);
                        c0Var2.A();
                        throw new kotlin.k0();
                    }
                    c0Var2.E(360834719);
                    i13 = 6;
                    l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(1)), c0Var2, 6);
                    c0Var2.A();
                }
                c0Var2.E(1535664197);
                if (topBarState.getShowDismissButton()) {
                    i14 = 0;
                    c0VarR = c0Var2;
                    ni.o(u0.e.c(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, c0Var2, 0), u0.i.d(R.string.intercom_dismiss, c0Var2, 0), i1.j(aVar3, false, null, null, null, onClose, 15, null), topBarState.getSurveyUiColors().m426getOnBackground0d7_KjU(), c0VarR, 8, 0);
                } else {
                    c0VarR = c0Var2;
                    i14 = 0;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.E(-1116807584);
                progressBarState = topBarState.getProgressBarState();
                c0VarR.E(-1116806075);
                if (progressBarState.isVisible()) {
                    l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f11)), c0VarR, i13);
                    n7VarF = androidx.compose.animation.core.f.f(progressBarState.getProgress(), androidx.compose.animation.core.p.t(200, i14, null, i13, null), 0.0f, null, null, c0VarR, 48, 28);
                    if (ColorExtensionsKt.m735isDarkColor8_81llA(topBarState.getSurveyUiColors().m422getBackground0d7_KjU())) {
                        jB = androidx.compose.ui.graphics.s0.b(1728053247);
                    } else {
                        jB = androidx.compose.ui.graphics.s0.b(1291845632);
                    }
                    surveyUiColors = topBarState.getSurveyUiColors();
                    if (!androidx.compose.ui.graphics.q0.y(surveyUiColors.m422getBackground0d7_KjU(), surveyUiColors.m423getButton0d7_KjU()) && ColorExtensionsKt.m737isWhite8_81llA(surveyUiColors.m422getBackground0d7_KjU())) {
                        jM423getButton0d7_KjU = androidx.compose.ui.graphics.s0.d(3439329279L);
                    } else if (androidx.compose.ui.graphics.q0.y(surveyUiColors.m422getBackground0d7_KjU(), surveyUiColors.m423getButton0d7_KjU()) || !ColorExtensionsKt.m733isBlack8_81llA(surveyUiColors.m422getBackground0d7_KjU())) {
                        jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                    } else {
                        jM423getButton0d7_KjU = androidx.compose.ui.graphics.s0.d(2147483648L);
                    }
                    androidx.compose.ui.a0 a0VarH2 = i6.h(aVar3, 0.0f, 1, null);
                    float fR = androidx.compose.ui.unit.h.r(i14);
                    int iC = u3.f38256b.c();
                    c0VarR.E(1535712593);
                    zD = c0VarR.D(n7VarF);
                    objI0 = c0VarR.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.p0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(n7VarF));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.c0 c0Var3 = c0VarR;
                    os.Z((Function0) objI0, a0VarH2, jM423getButton0d7_KjU, jB, iC, fR, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.q0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$5((androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    }, c0Var3, 1769520, 0);
                    c0VarR = c0Var3;
                }
                c0VarR.A();
                Unit unit = Unit.f312394a;
                c0VarR.A();
                c0VarR.o();
                a0Var4 = a0Var3;
            } else {
                c0VarR.u();
                a0Var4 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.r0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SurveyTopBarComponentKt.SurveyTopBar$lambda$8(topBarState, onClose, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i12 & 731) == 146) {
            if (i15 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY2 = qVar.y();
            aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(mVarY2, aVar.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            aVar2 = androidx.compose.ui.node.g.I;
            function0A = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB2, aVar2.e());
            y7.n(c0VarD, b1VarK4, aVar2.g());
            function2B = aVar2.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN4, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
            aVar3 = androidx.compose.ui.a0.E;
            f10 = 16;
            l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
            androidx.compose.ui.e.c cVarQ2 = aVar.q();
            androidx.compose.ui.a0 a0VarH3 = i6.h(d5.t(aVar3, androidx.compose.ui.unit.h.r(f10), 0.0f, 2, null), 0.0f, 1, null);
            a1 a1VarE3 = u5.e(qVar.s(), cVarQ2, c0VarR, 54);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK5 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarH3);
            function0A2 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE3, aVar2.e());
            y7.n(c0VarD2, b1VarK5, aVar2.g());
            function2B2 = aVar2.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN5, aVar2.f());
            y5 y5Var2 = y5.f16577a;
            if (topBarState instanceof TopBarState.SenderTopBarState) {
                c0VarR.E(359789399);
                TopBarState.SenderTopBarState senderTopBarState2 = (TopBarState.SenderTopBarState) topBarState;
                CharSequence charSequence2 = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_teammate_from_company).put("name", senderTopBarState2.getSenderName()).put("company", senderTopBarState2.getAppConfig().getName()).format();
                a1 a1VarE4 = u5.e(qVar.w(), aVar.q(), c0VarR, 48);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, aVar3);
                function0A3 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarE4, aVar2.e());
                y7.n(c0VarD3, b1VarK6, aVar2.g());
                function2B3 = aVar2.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN6, aVar2.f());
                z10 = true;
                CircularAvatarComponentKt.m467CircularAvataraMcp0Q(senderTopBarState2.getAvatar(), androidx.compose.ui.graphics.s0.b(senderTopBarState2.getAppConfig().getSecondaryColor()), 0.0f, c0VarR, 8, 4);
                l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                f11 = f10;
                q50.t(charSequence2.toString(), null, senderTopBarState2.getSurveyUiColors().m426getOnBackground0d7_KjU(), null, androidx.compose.ui.unit.a0.m(14), null, v0.f41742b.m(), null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, null, c0VarR, 1597440, 24960, 241578);
                c0Var2 = c0VarR;
                c0Var2.o();
                c0Var2.A();
                i13 = 6;
            } else {
                c0Var2 = c0VarR;
                f11 = f10;
                z10 = true;
                if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                    c0Var2.E(1535625002);
                    c0Var2.A();
                    throw new kotlin.k0();
                }
                c0Var2.E(360834719);
                i13 = 6;
                l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(1)), c0Var2, 6);
                c0Var2.A();
            }
            c0Var2.E(1535664197);
            if (topBarState.getShowDismissButton()) {
                i14 = 0;
                c0VarR = c0Var2;
                ni.o(u0.e.c(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, c0Var2, 0), u0.i.d(R.string.intercom_dismiss, c0Var2, 0), i1.j(aVar3, false, null, null, null, onClose, 15, null), topBarState.getSurveyUiColors().m426getOnBackground0d7_KjU(), c0VarR, 8, 0);
            } else {
                c0VarR = c0Var2;
                i14 = 0;
            }
            c0VarR.A();
            c0VarR.o();
            c0VarR.E(-1116807584);
            progressBarState = topBarState.getProgressBarState();
            c0VarR.E(-1116806075);
            if (progressBarState.isVisible()) {
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f11)), c0VarR, i13);
                n7VarF = androidx.compose.animation.core.f.f(progressBarState.getProgress(), androidx.compose.animation.core.p.t(200, i14, null, i13, null), 0.0f, null, null, c0VarR, 48, 28);
                if (ColorExtensionsKt.m735isDarkColor8_81llA(topBarState.getSurveyUiColors().m422getBackground0d7_KjU())) {
                    jB = androidx.compose.ui.graphics.s0.b(1728053247);
                } else {
                    jB = androidx.compose.ui.graphics.s0.b(1291845632);
                }
                surveyUiColors = topBarState.getSurveyUiColors();
                if (!androidx.compose.ui.graphics.q0.y(surveyUiColors.m422getBackground0d7_KjU(), surveyUiColors.m423getButton0d7_KjU())) {
                    if (androidx.compose.ui.graphics.q0.y(surveyUiColors.m422getBackground0d7_KjU(), surveyUiColors.m423getButton0d7_KjU())) {
                        jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                    } else {
                        jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                    }
                } else if (androidx.compose.ui.graphics.q0.y(surveyUiColors.m422getBackground0d7_KjU(), surveyUiColors.m423getButton0d7_KjU())) {
                    jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                } else {
                    jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                }
                androidx.compose.ui.a0 a0VarH4 = i6.h(aVar3, 0.0f, 1, null);
                float fR2 = androidx.compose.ui.unit.h.r(i14);
                int iC2 = u3.f38256b.c();
                c0VarR.E(1535712593);
                zD = c0VarR.D(n7VarF);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.p0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(n7VarF));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.p0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(n7VarF));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.runtime.c0 c0Var4 = c0VarR;
                os.Z((Function0) objI0, a0VarH4, jM423getButton0d7_KjU, jB, iC2, fR2, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.q0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$5((androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                }, c0Var4, 1769520, 0);
                c0VarR = c0Var4;
            }
            c0VarR.A();
            Unit unit2 = Unit.f312394a;
            c0VarR.A();
            c0VarR.o();
            a0Var4 = a0Var3;
        } else {
            if (i15 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY3 = qVar.y();
            aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(mVarY3, aVar.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            aVar2 = androidx.compose.ui.node.g.I;
            function0A = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB3, aVar2.e());
            y7.n(c0VarD, b1VarK7, aVar2.g());
            function2B = aVar2.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN7, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
            aVar3 = androidx.compose.ui.a0.E;
            f10 = 16;
            l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
            androidx.compose.ui.e.c cVarQ3 = aVar.q();
            androidx.compose.ui.a0 a0VarH5 = i6.h(d5.t(aVar3, androidx.compose.ui.unit.h.r(f10), 0.0f, 2, null), 0.0f, 1, null);
            a1 a1VarE5 = u5.e(qVar.s(), cVarQ3, c0VarR, 54);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK8 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarH5);
            function0A2 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE5, aVar2.e());
            y7.n(c0VarD2, b1VarK8, aVar2.g());
            function2B2 = aVar2.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN8, aVar2.f());
            y5 y5Var3 = y5.f16577a;
            if (topBarState instanceof TopBarState.SenderTopBarState) {
                c0VarR.E(359789399);
                TopBarState.SenderTopBarState senderTopBarState3 = (TopBarState.SenderTopBarState) topBarState;
                CharSequence charSequence3 = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_teammate_from_company).put("name", senderTopBarState3.getSenderName()).put("company", senderTopBarState3.getAppConfig().getName()).format();
                a1 a1VarE6 = u5.e(qVar.w(), aVar.q(), c0VarR, 48);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK9 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, aVar3);
                function0A3 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarE6, aVar2.e());
                y7.n(c0VarD3, b1VarK9, aVar2.g());
                function2B3 = aVar2.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN9, aVar2.f());
                z10 = true;
                CircularAvatarComponentKt.m467CircularAvataraMcp0Q(senderTopBarState3.getAvatar(), androidx.compose.ui.graphics.s0.b(senderTopBarState3.getAppConfig().getSecondaryColor()), 0.0f, c0VarR, 8, 4);
                l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                f11 = f10;
                q50.t(charSequence3.toString(), null, senderTopBarState3.getSurveyUiColors().m426getOnBackground0d7_KjU(), null, androidx.compose.ui.unit.a0.m(14), null, v0.f41742b.m(), null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, null, c0VarR, 1597440, 24960, 241578);
                c0Var2 = c0VarR;
                c0Var2.o();
                c0Var2.A();
                i13 = 6;
            } else {
                c0Var2 = c0VarR;
                f11 = f10;
                z10 = true;
                if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                    c0Var2.E(1535625002);
                    c0Var2.A();
                    throw new kotlin.k0();
                }
                c0Var2.E(360834719);
                i13 = 6;
                l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(1)), c0Var2, 6);
                c0Var2.A();
            }
            c0Var2.E(1535664197);
            if (topBarState.getShowDismissButton()) {
                i14 = 0;
                c0VarR = c0Var2;
                ni.o(u0.e.c(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, c0Var2, 0), u0.i.d(R.string.intercom_dismiss, c0Var2, 0), i1.j(aVar3, false, null, null, null, onClose, 15, null), topBarState.getSurveyUiColors().m426getOnBackground0d7_KjU(), c0VarR, 8, 0);
            } else {
                c0VarR = c0Var2;
                i14 = 0;
            }
            c0VarR.A();
            c0VarR.o();
            c0VarR.E(-1116807584);
            progressBarState = topBarState.getProgressBarState();
            c0VarR.E(-1116806075);
            if (progressBarState.isVisible()) {
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f11)), c0VarR, i13);
                n7VarF = androidx.compose.animation.core.f.f(progressBarState.getProgress(), androidx.compose.animation.core.p.t(200, i14, null, i13, null), 0.0f, null, null, c0VarR, 48, 28);
                if (ColorExtensionsKt.m735isDarkColor8_81llA(topBarState.getSurveyUiColors().m422getBackground0d7_KjU())) {
                    jB = androidx.compose.ui.graphics.s0.b(1728053247);
                } else {
                    jB = androidx.compose.ui.graphics.s0.b(1291845632);
                }
                surveyUiColors = topBarState.getSurveyUiColors();
                if (!androidx.compose.ui.graphics.q0.y(surveyUiColors.m422getBackground0d7_KjU(), surveyUiColors.m423getButton0d7_KjU())) {
                    if (androidx.compose.ui.graphics.q0.y(surveyUiColors.m422getBackground0d7_KjU(), surveyUiColors.m423getButton0d7_KjU())) {
                        jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                    } else {
                        jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                    }
                } else if (androidx.compose.ui.graphics.q0.y(surveyUiColors.m422getBackground0d7_KjU(), surveyUiColors.m423getButton0d7_KjU())) {
                    jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                } else {
                    jM423getButton0d7_KjU = surveyUiColors.m423getButton0d7_KjU();
                }
                androidx.compose.ui.a0 a0VarH6 = i6.h(aVar3, 0.0f, 1, null);
                float fR3 = androidx.compose.ui.unit.h.r(i14);
                int iC3 = u3.f38256b.c();
                c0VarR.E(1535712593);
                zD = c0VarR.D(n7VarF);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.p0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(n7VarF));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.p0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(n7VarF));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.runtime.c0 c0Var5 = c0VarR;
                os.Z((Function0) objI0, a0VarH6, jM423getButton0d7_KjU, jB, iC3, fR3, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.q0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$5((androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                }, c0Var5, 1769520, 0);
                c0VarR = c0Var5;
            }
            c0VarR.A();
            Unit unit3 = Unit.f312394a;
            c0VarR.A();
            c0VarR.o();
            a0Var4 = a0Var3;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.r0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SurveyTopBarComponentKt.SurveyTopBar$lambda$8(topBarState, onClose, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(n7 animateFloatAsState) {
        Intrinsics.checkNotNullParameter(animateFloatAsState, "$animateFloatAsState");
        return ((Number) animateFloatAsState.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyTopBar$lambda$7$lambda$6$lambda$5(androidx.compose.ui.graphics.drawscope.f LinearProgressIndicator) {
        Intrinsics.checkNotNullParameter(LinearProgressIndicator, "$this$LinearProgressIndicator");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyTopBar$lambda$8(TopBarState topBarState, Function0 onClose, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(topBarState, "$topBarState");
        Intrinsics.checkNotNullParameter(onClose, "$onClose");
        SurveyTopBar(topBarState, onClose, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
