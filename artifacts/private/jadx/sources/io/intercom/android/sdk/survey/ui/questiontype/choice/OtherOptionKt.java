package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nOtherOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherOption.kt\nio/intercom/android/sdk/survey/ui/questiontype/choice/OtherOptionKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,86:1\n113#2:87\n113#2:132\n113#2:137\n87#3:88\n83#3,10:89\n94#3:136\n80#4,6:99\n87#4,3:114\n90#4,2:123\n94#4:135\n391#5,9:105\n400#5:125\n401#5,2:133\n4360#6,6:117\n1282#7,6:126\n*S KotlinDebug\n*F\n+ 1 OtherOption.kt\nio/intercom/android/sdk/survey/ui/questiontype/choice/OtherOptionKt\n*L\n36#1:87\n52#1:132\n76#1:137\n41#1:88\n41#1:89,10\n41#1:136\n41#1:99,6\n41#1:114,3\n41#1:123,2\n41#1:135\n41#1:105,9\n41#1:125\n41#1:133,2\n41#1:117,6\n50#1:126,6\n*E\n"})
public final class OtherOptionKt {
    /* JADX WARN: Code duplicated, block: B:101:0x014e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0151  */
    /* JADX WARN: Code duplicated, block: B:105:0x0159  */
    /* JADX WARN: Code duplicated, block: B:108:0x016a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0180  */
    /* JADX WARN: Code duplicated, block: B:114:0x018b  */
    /* JADX WARN: Code duplicated, block: B:121:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:137:0x0228  */
    /* JADX WARN: Code duplicated, block: B:140:0x0234  */
    /* JADX WARN: Code duplicated, block: B:141:0x0238  */
    /* JADX WARN: Code duplicated, block: B:144:0x025b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0269  */
    /* JADX WARN: Code duplicated, block: B:149:0x0293  */
    /* JADX WARN: Code duplicated, block: B:150:0x0295  */
    /* JADX WARN: Code duplicated, block: B:153:0x029d  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:159:0x0333  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:81:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x0122  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:93:0x0135  */
    /* JADX WARN: Code duplicated, block: B:97:0x013f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0145  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: OtherOption-YCJL08c, reason: not valid java name */
    public static final void m489OtherOptionYCJL08c(final boolean z10, @NotNull final SurveyUiColors surveyUiColors, @NotNull final String text, @NotNull final Function0<Unit> onClicked, @NotNull final Function1<? super String, Unit> onTextChanged, long j10, float f10, long j11, @Nullable v0 v0Var, long j12, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        long jA;
        int i13;
        int i14;
        int i15;
        int i16;
        long jW;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float fR;
        v0 v0VarM;
        float f11;
        int i23;
        long jM729generateTextColor8_81llA;
        long j13;
        v0 v0Var2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z11;
        Object objI0;
        final float f12;
        final long j14;
        final long j15;
        final v0 v0Var3;
        final long j16;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-933969743);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(surveyUiColors) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(text) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c0VarR.k0(onClicked) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i12 |= c0VarR.k0(onTextChanged) ? 16384 : 8192;
        }
        int i24 = i11 & 32;
        if (i24 == 0) {
            if ((i10 & 458752) == 0) {
                jA = j10;
                i12 |= c0VarR.L(jA) ? 131072 : 65536;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                i14 = 57344;
            } else {
                i14 = 57344;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.I(f10)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                }
            }
            i16 = i11 & 128;
            if (i16 != 0) {
                i12 |= 12582912;
                jW = j11;
            } else {
                jW = j11;
                if ((i10 & 29360128) == 0) {
                    if (c0VarR.L(jW)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
            }
            i18 = i11 & 256;
            if (i18 != 0) {
                if ((i10 & 234881024) == 0) {
                    if (c0VarR.D(v0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                if ((i10 & 1879048192) == 0) {
                    int i25 = i12;
                    if ((i11 & 512) == 0) {
                        i21 = i24;
                        int i26 = c0VarR.L(j12) ? 536870912 : 268435456;
                        i20 = i25 | i26;
                    } else {
                        i21 = i24;
                    }
                    i20 = i25 | i26;
                } else {
                    i20 = i12;
                    i21 = i24;
                }
                i22 = i21;
                if ((i20 & 1533916891) == 306783378 || !c0VarR.d()) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i22 != 0) {
                            jA = q0.f38131b.a();
                        }
                        if (i13 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        } else {
                            fR = f10;
                        }
                        if (i16 != 0) {
                            jW = q0.f38131b.w();
                        }
                        if (i18 != 0) {
                            v0VarM = v0.f41742b.m();
                        } else {
                            v0VarM = v0Var;
                        }
                        if ((i11 & 512) != 0) {
                            int i27 = i20 & (-1879048193);
                            f11 = fR;
                            i23 = i27;
                            v0Var2 = v0VarM;
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            j13 = jW;
                        } else {
                            int i28 = i20;
                            f11 = fR;
                            i23 = i28;
                            jM729generateTextColor8_81llA = j12;
                            j13 = jW;
                            v0Var2 = v0VarM;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 512) != 0) {
                            i20 &= -1879048193;
                        }
                        v0Var2 = v0Var;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        i23 = i20;
                        f11 = f10;
                    }
                    c0VarR.Z();
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
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
                    n0 n0Var = n0.f16227a;
                    String strD = u0.i.d(R.string.intercom_surveys_multiselect_other_option_value, c0VarR, 0);
                    c0VarR.E(-1990898758);
                    if ((i23 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    int i29 = i23 >> 6;
                    ChoicePillKt.m481ChoicePillUdaoDFU(z10, (Function1) objI0, strD, jA, f11, j13, v0Var2, jM729generateTextColor8_81llA, c0VarR, (i29 & 7168) | (i23 & 14) | (i29 & i14) | (i29 & 458752) | (i29 & 3670016) | (i29 & 29360128), 0);
                    f12 = f11;
                    j14 = j13;
                    c0VarR = c0VarR;
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    androidx.compose.animation.k.g(n0Var, z10, null, null, null, null, androidx.compose.runtime.internal.w.e(-252181085, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                            invoke(lVar, c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i30) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            String str = text;
                            Function1<String, Unit> function1 = onTextChanged;
                            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                            a1 a1VarB2 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK2 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var2, aVar3);
                            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A2);
                            } else {
                                c0Var2.l();
                            }
                            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                            y7.n(c0VarD2, a1VarB2, aVar4.e());
                            y7.n(c0VarD2, b1VarK2, aVar4.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN2, aVar4.f());
                            n0 n0Var2 = n0.f16227a;
                            q50.t(u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_label, c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                            l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                            TextInputPillKt.m523TextInputPillg5ZjG94(str, u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_placeholder, c0Var2, 0), function1, null, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m423getButton0d7_KjU()), 0, false, null, 0, androidx.compose.ui.text.input.t.f41944b.g(), false, null, false, 0.0f, c0Var2, 805306368, 6, 14824);
                            c0Var2.o();
                        }
                    }, c0VarR, 54), c0VarR, 1572870 | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 30);
                    c0VarR.o();
                    j15 = jA;
                    v0Var3 = v0Var2;
                    j16 = jM729generateTextColor8_81llA;
                } else {
                    c0VarR.u();
                    j14 = jW;
                    j15 = jA;
                    f12 = f10;
                    v0Var3 = v0Var;
                    j16 = j12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.u
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$3(z10, surveyUiColors, text, onClicked, onTextChanged, j15, f12, j14, v0Var3, j16, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i10 & 1879048192) == 0) {
                int i210 = i12;
                if ((i11 & 512) == 0) {
                    i21 = i24;
                    if (c0VarR.L(j12)) {
                    }
                    i20 = i210 | i26;
                } else {
                    i21 = i24;
                }
                i20 = i210 | i26;
            } else {
                i20 = i12;
                i21 = i24;
            }
            i22 = i21;
            if ((i20 & 1533916891) == 306783378) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        jA = q0.f38131b.a();
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    } else {
                        fR = f10;
                    }
                    if (i16 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i18 != 0) {
                        v0VarM = v0.f41742b.m();
                    } else {
                        v0VarM = v0Var;
                    }
                    if ((i11 & 512) != 0) {
                        int i211 = i20 & (-1879048193);
                        f11 = fR;
                        i23 = i211;
                        v0Var2 = v0VarM;
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        j13 = jW;
                    } else {
                        int i212 = i20;
                        f11 = fR;
                        i23 = i212;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        v0Var2 = v0VarM;
                    }
                } else {
                    if (i22 != 0) {
                        jA = q0.f38131b.a();
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    } else {
                        fR = f10;
                    }
                    if (i16 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i18 != 0) {
                        v0VarM = v0.f41742b.m();
                    } else {
                        v0VarM = v0Var;
                    }
                    if ((i11 & 512) != 0) {
                        int i213 = i20 & (-1879048193);
                        f11 = fR;
                        i23 = i213;
                        v0Var2 = v0VarM;
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        j13 = jW;
                    } else {
                        int i214 = i20;
                        f11 = fR;
                        i23 = i214;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        v0Var2 = v0VarM;
                    }
                }
                c0VarR.Z();
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                a1 a1VarB2 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
                androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                function0A = aVar4.a();
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
                y7.n(c0VarD, a1VarB2, aVar4.e());
                y7.n(c0VarD, b1VarK2, aVar4.g());
                function2B = aVar4.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN2, aVar4.f());
                n0 n0Var2 = n0.f16227a;
                String strD2 = u0.i.d(R.string.intercom_surveys_multiselect_other_option_value, c0VarR, 0);
                c0VarR.E(-1990898758);
                if ((i23 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i215 = i23 >> 6;
                ChoicePillKt.m481ChoicePillUdaoDFU(z10, (Function1) objI0, strD2, jA, f11, j13, v0Var2, jM729generateTextColor8_81llA, c0VarR, (i215 & 7168) | (i23 & 14) | (i215 & i14) | (i215 & 458752) | (i215 & 3670016) | (i215 & 29360128), 0);
                f12 = f11;
                j14 = j13;
                c0VarR = c0VarR;
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.animation.k.g(n0Var2, z10, null, null, null, null, androidx.compose.runtime.internal.w.e(-252181085, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(lVar, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i30) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        String str = text;
                        Function1<String, Unit> function1 = onTextChanged;
                        androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                        a1 a1VarB3 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK3 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, aVar5);
                        androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar6.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A2);
                        } else {
                            c0Var2.l();
                        }
                        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                        y7.n(c0VarD2, a1VarB3, aVar6.e());
                        y7.n(c0VarD2, b1VarK3, aVar6.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar6.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN3, aVar6.f());
                        n0 n0Var3 = n0.f16227a;
                        q50.t(u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_label, c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                        l6.a(i6.i(aVar5, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                        TextInputPillKt.m523TextInputPillg5ZjG94(str, u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_placeholder, c0Var2, 0), function1, null, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m423getButton0d7_KjU()), 0, false, null, 0, androidx.compose.ui.text.input.t.f41944b.g(), false, null, false, 0.0f, c0Var2, 805306368, 6, 14824);
                        c0Var2.o();
                    }
                }, c0VarR, 54), c0VarR, 1572870 | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 30);
                c0VarR.o();
                j15 = jA;
                v0Var3 = v0Var2;
                j16 = jM729generateTextColor8_81llA;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        jA = q0.f38131b.a();
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    } else {
                        fR = f10;
                    }
                    if (i16 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i18 != 0) {
                        v0VarM = v0.f41742b.m();
                    } else {
                        v0VarM = v0Var;
                    }
                    if ((i11 & 512) != 0) {
                        int i216 = i20 & (-1879048193);
                        f11 = fR;
                        i23 = i216;
                        v0Var2 = v0VarM;
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        j13 = jW;
                    } else {
                        int i217 = i20;
                        f11 = fR;
                        i23 = i217;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        v0Var2 = v0VarM;
                    }
                } else {
                    if (i22 != 0) {
                        jA = q0.f38131b.a();
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    } else {
                        fR = f10;
                    }
                    if (i16 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i18 != 0) {
                        v0VarM = v0.f41742b.m();
                    } else {
                        v0VarM = v0Var;
                    }
                    if ((i11 & 512) != 0) {
                        int i218 = i20 & (-1879048193);
                        f11 = fR;
                        i23 = i218;
                        v0Var2 = v0VarM;
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        j13 = jW;
                    } else {
                        int i219 = i20;
                        f11 = fR;
                        i23 = i219;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        v0Var2 = v0VarM;
                    }
                }
                c0VarR.Z();
                androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                a1 a1VarB3 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar5);
                androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                function0A = aVar6.a();
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
                y7.n(c0VarD, a1VarB3, aVar6.e());
                y7.n(c0VarD, b1VarK3, aVar6.g());
                function2B = aVar6.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN3, aVar6.f());
                n0 n0Var3 = n0.f16227a;
                String strD3 = u0.i.d(R.string.intercom_surveys_multiselect_other_option_value, c0VarR, 0);
                c0VarR.E(-1990898758);
                if ((i23 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i2110 = i23 >> 6;
                ChoicePillKt.m481ChoicePillUdaoDFU(z10, (Function1) objI0, strD3, jA, f11, j13, v0Var2, jM729generateTextColor8_81llA, c0VarR, (i2110 & 7168) | (i23 & 14) | (i2110 & i14) | (i2110 & 458752) | (i2110 & 3670016) | (i2110 & 29360128), 0);
                f12 = f11;
                j14 = j13;
                c0VarR = c0VarR;
                l6.a(i6.i(aVar5, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.animation.k.g(n0Var3, z10, null, null, null, null, androidx.compose.runtime.internal.w.e(-252181085, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(lVar, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i30) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        String str = text;
                        Function1<String, Unit> function1 = onTextChanged;
                        androidx.compose.ui.a0.a aVar7 = androidx.compose.ui.a0.E;
                        a1 a1VarB4 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK4 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, aVar7);
                        androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar8.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A2);
                        } else {
                            c0Var2.l();
                        }
                        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                        y7.n(c0VarD2, a1VarB4, aVar8.e());
                        y7.n(c0VarD2, b1VarK4, aVar8.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar8.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN4, aVar8.f());
                        n0 n0Var4 = n0.f16227a;
                        q50.t(u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_label, c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                        l6.a(i6.i(aVar7, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                        TextInputPillKt.m523TextInputPillg5ZjG94(str, u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_placeholder, c0Var2, 0), function1, null, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m423getButton0d7_KjU()), 0, false, null, 0, androidx.compose.ui.text.input.t.f41944b.g(), false, null, false, 0.0f, c0Var2, 805306368, 6, 14824);
                        c0Var2.o();
                    }
                }, c0VarR, 54), c0VarR, 1572870 | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 30);
                c0VarR.o();
                j15 = jA;
                v0Var3 = v0Var2;
                j16 = jM729generateTextColor8_81llA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$3(z10, surveyUiColors, text, onClicked, onTextChanged, j15, f12, j14, v0Var3, j16, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        jA = j10;
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            i14 = 57344;
        } else {
            i14 = 57344;
            if ((i10 & 3670016) == 0) {
                if (c0VarR.I(f10)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
            }
        }
        i16 = i11 & 128;
        if (i16 != 0) {
            i12 |= 12582912;
            jW = j11;
        } else {
            jW = j11;
            if ((i10 & 29360128) == 0) {
                if (c0VarR.L(jW)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
        }
        i18 = i11 & 256;
        if (i18 != 0) {
            if ((i10 & 234881024) == 0) {
                if (c0VarR.D(v0Var)) {
                    i19 = 67108864;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i19;
            }
            if ((i10 & 1879048192) == 0) {
                int i2111 = i12;
                if ((i11 & 512) == 0) {
                    i21 = i24;
                    if (c0VarR.L(j12)) {
                    }
                    i20 = i2111 | i26;
                } else {
                    i21 = i24;
                }
                i20 = i2111 | i26;
            } else {
                i20 = i12;
                i21 = i24;
            }
            i22 = i21;
            if ((i20 & 1533916891) == 306783378) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        jA = q0.f38131b.a();
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    } else {
                        fR = f10;
                    }
                    if (i16 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i18 != 0) {
                        v0VarM = v0.f41742b.m();
                    } else {
                        v0VarM = v0Var;
                    }
                    if ((i11 & 512) != 0) {
                        int i2112 = i20 & (-1879048193);
                        f11 = fR;
                        i23 = i2112;
                        v0Var2 = v0VarM;
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        j13 = jW;
                    } else {
                        int i2113 = i20;
                        f11 = fR;
                        i23 = i2113;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        v0Var2 = v0VarM;
                    }
                } else {
                    if (i22 != 0) {
                        jA = q0.f38131b.a();
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    } else {
                        fR = f10;
                    }
                    if (i16 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i18 != 0) {
                        v0VarM = v0.f41742b.m();
                    } else {
                        v0VarM = v0Var;
                    }
                    if ((i11 & 512) != 0) {
                        int i2114 = i20 & (-1879048193);
                        f11 = fR;
                        i23 = i2114;
                        v0Var2 = v0VarM;
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        j13 = jW;
                    } else {
                        int i2115 = i20;
                        f11 = fR;
                        i23 = i2115;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        v0Var2 = v0VarM;
                    }
                }
                c0VarR.Z();
                androidx.compose.ui.a0.a aVar7 = androidx.compose.ui.a0.E;
                a1 a1VarB4 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar7);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                function0A = aVar8.a();
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
                y7.n(c0VarD, a1VarB4, aVar8.e());
                y7.n(c0VarD, b1VarK4, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar8.f());
                n0 n0Var4 = n0.f16227a;
                String strD4 = u0.i.d(R.string.intercom_surveys_multiselect_other_option_value, c0VarR, 0);
                c0VarR.E(-1990898758);
                if ((i23 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i2116 = i23 >> 6;
                ChoicePillKt.m481ChoicePillUdaoDFU(z10, (Function1) objI0, strD4, jA, f11, j13, v0Var2, jM729generateTextColor8_81llA, c0VarR, (i2116 & 7168) | (i23 & 14) | (i2116 & i14) | (i2116 & 458752) | (i2116 & 3670016) | (i2116 & 29360128), 0);
                f12 = f11;
                j14 = j13;
                c0VarR = c0VarR;
                l6.a(i6.i(aVar7, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.animation.k.g(n0Var4, z10, null, null, null, null, androidx.compose.runtime.internal.w.e(-252181085, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(lVar, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i30) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        String str = text;
                        Function1<String, Unit> function1 = onTextChanged;
                        androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                        a1 a1VarB5 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK5 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0Var2, aVar9);
                        androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar10.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A2);
                        } else {
                            c0Var2.l();
                        }
                        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                        y7.n(c0VarD2, a1VarB5, aVar10.e());
                        y7.n(c0VarD2, b1VarK5, aVar10.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar10.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN5, aVar10.f());
                        n0 n0Var5 = n0.f16227a;
                        q50.t(u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_label, c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                        l6.a(i6.i(aVar9, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                        TextInputPillKt.m523TextInputPillg5ZjG94(str, u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_placeholder, c0Var2, 0), function1, null, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m423getButton0d7_KjU()), 0, false, null, 0, androidx.compose.ui.text.input.t.f41944b.g(), false, null, false, 0.0f, c0Var2, 805306368, 6, 14824);
                        c0Var2.o();
                    }
                }, c0VarR, 54), c0VarR, 1572870 | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 30);
                c0VarR.o();
                j15 = jA;
                v0Var3 = v0Var2;
                j16 = jM729generateTextColor8_81llA;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        jA = q0.f38131b.a();
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    } else {
                        fR = f10;
                    }
                    if (i16 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i18 != 0) {
                        v0VarM = v0.f41742b.m();
                    } else {
                        v0VarM = v0Var;
                    }
                    if ((i11 & 512) != 0) {
                        int i2117 = i20 & (-1879048193);
                        f11 = fR;
                        i23 = i2117;
                        v0Var2 = v0VarM;
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        j13 = jW;
                    } else {
                        int i2118 = i20;
                        f11 = fR;
                        i23 = i2118;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        v0Var2 = v0VarM;
                    }
                } else {
                    if (i22 != 0) {
                        jA = q0.f38131b.a();
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    } else {
                        fR = f10;
                    }
                    if (i16 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i18 != 0) {
                        v0VarM = v0.f41742b.m();
                    } else {
                        v0VarM = v0Var;
                    }
                    if ((i11 & 512) != 0) {
                        int i2119 = i20 & (-1879048193);
                        f11 = fR;
                        i23 = i2119;
                        v0Var2 = v0VarM;
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        j13 = jW;
                    } else {
                        int i21110 = i20;
                        f11 = fR;
                        i23 = i21110;
                        jM729generateTextColor8_81llA = j12;
                        j13 = jW;
                        v0Var2 = v0VarM;
                    }
                }
                c0VarR.Z();
                androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                a1 a1VarB5 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK5 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar9);
                androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                function0A = aVar10.a();
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
                y7.n(c0VarD, a1VarB5, aVar10.e());
                y7.n(c0VarD, b1VarK5, aVar10.g());
                function2B = aVar10.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN5, aVar10.f());
                n0 n0Var5 = n0.f16227a;
                String strD5 = u0.i.d(R.string.intercom_surveys_multiselect_other_option_value, c0VarR, 0);
                c0VarR.E(-1990898758);
                if ((i23 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                int i21111 = i23 >> 6;
                ChoicePillKt.m481ChoicePillUdaoDFU(z10, (Function1) objI0, strD5, jA, f11, j13, v0Var2, jM729generateTextColor8_81llA, c0VarR, (i21111 & 7168) | (i23 & 14) | (i21111 & i14) | (i21111 & 458752) | (i21111 & 3670016) | (i21111 & 29360128), 0);
                f12 = f11;
                j14 = j13;
                c0VarR = c0VarR;
                l6.a(i6.i(aVar9, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.animation.k.g(n0Var5, z10, null, null, null, null, androidx.compose.runtime.internal.w.e(-252181085, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(lVar, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i30) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        String str = text;
                        Function1<String, Unit> function1 = onTextChanged;
                        androidx.compose.ui.a0.a aVar11 = androidx.compose.ui.a0.E;
                        a1 a1VarB6 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK6 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0Var2, aVar11);
                        androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar12.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A2);
                        } else {
                            c0Var2.l();
                        }
                        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                        y7.n(c0VarD2, a1VarB6, aVar12.e());
                        y7.n(c0VarD2, b1VarK6, aVar12.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar12.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN6, aVar12.f());
                        n0 n0Var6 = n0.f16227a;
                        q50.t(u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_label, c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                        l6.a(i6.i(aVar11, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                        TextInputPillKt.m523TextInputPillg5ZjG94(str, u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_placeholder, c0Var2, 0), function1, null, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m423getButton0d7_KjU()), 0, false, null, 0, androidx.compose.ui.text.input.t.f41944b.g(), false, null, false, 0.0f, c0Var2, 805306368, 6, 14824);
                        c0Var2.o();
                    }
                }, c0VarR, 54), c0VarR, 1572870 | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 30);
                c0VarR.o();
                j15 = jA;
                v0Var3 = v0Var2;
                j16 = jM729generateTextColor8_81llA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$3(z10, surveyUiColors, text, onClicked, onTextChanged, j15, f12, j14, v0Var3, j16, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i10 & 1879048192) == 0) {
            int i21112 = i12;
            if ((i11 & 512) == 0) {
                i21 = i24;
                if (c0VarR.L(j12)) {
                }
                i20 = i21112 | i26;
            } else {
                i21 = i24;
            }
            i20 = i21112 | i26;
        } else {
            i20 = i12;
            i21 = i24;
        }
        i22 = i21;
        if ((i20 & 1533916891) == 306783378) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    jA = q0.f38131b.a();
                }
                if (i13 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                } else {
                    fR = f10;
                }
                if (i16 != 0) {
                    jW = q0.f38131b.w();
                }
                if (i18 != 0) {
                    v0VarM = v0.f41742b.m();
                } else {
                    v0VarM = v0Var;
                }
                if ((i11 & 512) != 0) {
                    int i21113 = i20 & (-1879048193);
                    f11 = fR;
                    i23 = i21113;
                    v0Var2 = v0VarM;
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    j13 = jW;
                } else {
                    int i21114 = i20;
                    f11 = fR;
                    i23 = i21114;
                    jM729generateTextColor8_81llA = j12;
                    j13 = jW;
                    v0Var2 = v0VarM;
                }
            } else {
                if (i22 != 0) {
                    jA = q0.f38131b.a();
                }
                if (i13 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                } else {
                    fR = f10;
                }
                if (i16 != 0) {
                    jW = q0.f38131b.w();
                }
                if (i18 != 0) {
                    v0VarM = v0.f41742b.m();
                } else {
                    v0VarM = v0Var;
                }
                if ((i11 & 512) != 0) {
                    int i21115 = i20 & (-1879048193);
                    f11 = fR;
                    i23 = i21115;
                    v0Var2 = v0VarM;
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    j13 = jW;
                } else {
                    int i21116 = i20;
                    f11 = fR;
                    i23 = i21116;
                    jM729generateTextColor8_81llA = j12;
                    j13 = jW;
                    v0Var2 = v0VarM;
                }
            }
            c0VarR.Z();
            androidx.compose.ui.a0.a aVar11 = androidx.compose.ui.a0.E;
            a1 a1VarB6 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, aVar11);
            androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
            function0A = aVar12.a();
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
            y7.n(c0VarD, a1VarB6, aVar12.e());
            y7.n(c0VarD, b1VarK6, aVar12.g());
            function2B = aVar12.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN6, aVar12.f());
            n0 n0Var6 = n0.f16227a;
            String strD6 = u0.i.d(R.string.intercom_surveys_multiselect_other_option_value, c0VarR, 0);
            c0VarR.E(-1990898758);
            if ((i23 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            int i21117 = i23 >> 6;
            ChoicePillKt.m481ChoicePillUdaoDFU(z10, (Function1) objI0, strD6, jA, f11, j13, v0Var2, jM729generateTextColor8_81llA, c0VarR, (i21117 & 7168) | (i23 & 14) | (i21117 & i14) | (i21117 & 458752) | (i21117 & 3670016) | (i21117 & 29360128), 0);
            f12 = f11;
            j14 = j13;
            c0VarR = c0VarR;
            l6.a(i6.i(aVar11, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            androidx.compose.animation.k.g(n0Var6, z10, null, null, null, null, androidx.compose.runtime.internal.w.e(-252181085, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(lVar, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i30) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                    String str = text;
                    Function1<String, Unit> function1 = onTextChanged;
                    androidx.compose.ui.a0.a aVar13 = androidx.compose.ui.a0.E;
                    a1 a1VarB7 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK7 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0Var2, aVar13);
                    androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A2 = aVar14.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A2);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                    y7.n(c0VarD2, a1VarB7, aVar14.e());
                    y7.n(c0VarD2, b1VarK7, aVar14.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar14.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN7, aVar14.f());
                    n0 n0Var7 = n0.f16227a;
                    q50.t(u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_label, c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                    l6.a(i6.i(aVar13, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                    TextInputPillKt.m523TextInputPillg5ZjG94(str, u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_placeholder, c0Var2, 0), function1, null, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m423getButton0d7_KjU()), 0, false, null, 0, androidx.compose.ui.text.input.t.f41944b.g(), false, null, false, 0.0f, c0Var2, 805306368, 6, 14824);
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, 1572870 | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 30);
            c0VarR.o();
            j15 = jA;
            v0Var3 = v0Var2;
            j16 = jM729generateTextColor8_81llA;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    jA = q0.f38131b.a();
                }
                if (i13 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                } else {
                    fR = f10;
                }
                if (i16 != 0) {
                    jW = q0.f38131b.w();
                }
                if (i18 != 0) {
                    v0VarM = v0.f41742b.m();
                } else {
                    v0VarM = v0Var;
                }
                if ((i11 & 512) != 0) {
                    int i21118 = i20 & (-1879048193);
                    f11 = fR;
                    i23 = i21118;
                    v0Var2 = v0VarM;
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    j13 = jW;
                } else {
                    int i21119 = i20;
                    f11 = fR;
                    i23 = i21119;
                    jM729generateTextColor8_81llA = j12;
                    j13 = jW;
                    v0Var2 = v0VarM;
                }
            } else {
                if (i22 != 0) {
                    jA = q0.f38131b.a();
                }
                if (i13 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                } else {
                    fR = f10;
                }
                if (i16 != 0) {
                    jW = q0.f38131b.w();
                }
                if (i18 != 0) {
                    v0VarM = v0.f41742b.m();
                } else {
                    v0VarM = v0Var;
                }
                if ((i11 & 512) != 0) {
                    int i211110 = i20 & (-1879048193);
                    f11 = fR;
                    i23 = i211110;
                    v0Var2 = v0VarM;
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    j13 = jW;
                } else {
                    int i211111 = i20;
                    f11 = fR;
                    i23 = i211111;
                    jM729generateTextColor8_81llA = j12;
                    j13 = jW;
                    v0Var2 = v0VarM;
                }
            }
            c0VarR.Z();
            androidx.compose.ui.a0.a aVar13 = androidx.compose.ui.a0.E;
            a1 a1VarB7 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, aVar13);
            androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
            function0A = aVar14.a();
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
            y7.n(c0VarD, a1VarB7, aVar14.e());
            y7.n(c0VarD, b1VarK7, aVar14.g());
            function2B = aVar14.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN7, aVar14.f());
            n0 n0Var7 = n0.f16227a;
            String strD7 = u0.i.d(R.string.intercom_surveys_multiselect_other_option_value, c0VarR, 0);
            c0VarR.E(-1990898758);
            if ((i23 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            int i211112 = i23 >> 6;
            ChoicePillKt.m481ChoicePillUdaoDFU(z10, (Function1) objI0, strD7, jA, f11, j13, v0Var2, jM729generateTextColor8_81llA, c0VarR, (i211112 & 7168) | (i23 & 14) | (i211112 & i14) | (i211112 & 458752) | (i211112 & 3670016) | (i211112 & 29360128), 0);
            f12 = f11;
            j14 = j13;
            c0VarR = c0VarR;
            l6.a(i6.i(aVar13, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            androidx.compose.animation.k.g(n0Var7, z10, null, null, null, null, androidx.compose.runtime.internal.w.e(-252181085, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(lVar, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i30) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                    String str = text;
                    Function1<String, Unit> function1 = onTextChanged;
                    androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                    a1 a1VarB8 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var2, 0);
                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK8 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0Var2, aVar15);
                    androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A2 = aVar16.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A2);
                    } else {
                        c0Var2.l();
                    }
                    androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var2);
                    y7.n(c0VarD2, a1VarB8, aVar16.e());
                    y7.n(c0VarD2, b1VarK8, aVar16.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar16.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN8, aVar16.f());
                    n0 n0Var8 = n0.f16227a;
                    q50.t(u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_label, c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                    l6.a(i6.i(aVar15, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                    TextInputPillKt.m523TextInputPillg5ZjG94(str, u0.i.d(R.string.intercom_surveys_multiselect_other_option_input_placeholder, c0Var2, 0), function1, null, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m423getButton0d7_KjU()), 0, false, null, 0, androidx.compose.ui.text.input.t.f41944b.g(), false, null, false, 0.0f, c0Var2, 805306368, 6, 14824);
                    c0Var2.o();
                }
            }, c0VarR, 54), c0VarR, 1572870 | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 30);
            c0VarR.o();
            j15 = jA;
            v0Var3 = v0Var2;
            j16 = jM729generateTextColor8_81llA;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OtherOptionKt.OtherOption_YCJL08c$lambda$3(z10, surveyUiColors, text, onClicked, onTextChanged, j15, f12, j14, v0Var3, j16, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void OtherOptionPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-469899921);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            u10.c(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OtherOptionKt.INSTANCE.m487getLambda1$intercom_sdk_base_release(), c0VarR, 12582918, okhttp3.internal.ws.g.f334652s);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OtherOptionKt.OtherOptionPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OtherOptionPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        OtherOptionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(Function0 onClicked, String it) {
        Intrinsics.checkNotNullParameter(onClicked, "$onClicked");
        Intrinsics.checkNotNullParameter(it, "it");
        onClicked.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OtherOption_YCJL08c$lambda$3(boolean z10, SurveyUiColors surveyUiColors, String text, Function0 onClicked, Function1 onTextChanged, long j10, float f10, long j11, v0 v0Var, long j12, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(surveyUiColors, "$surveyUiColors");
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClicked, "$onClicked");
        Intrinsics.checkNotNullParameter(onTextChanged, "$onTextChanged");
        m489OtherOptionYCJL08c(z10, surveyUiColors, text, onClicked, onTextChanged, j10, f10, j11, v0Var, j12, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
