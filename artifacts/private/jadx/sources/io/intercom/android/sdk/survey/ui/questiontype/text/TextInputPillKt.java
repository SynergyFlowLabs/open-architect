package io.intercom.android.sdk.survey.ui.questiontype.text;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.t0;
import androidx.compose.foundation.text.b4;
import androidx.compose.foundation.text.y3;
import androidx.compose.foundation.text.z3;
import androidx.compose.material3.j40;
import androidx.compose.material3.n40;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u40;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.focus.p0;
import androidx.compose.ui.graphics.q0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTextInputPill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputPill.kt\nio/intercom/android/sdk/survey/ui/questiontype/text/TextInputPillKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,193:1\n1282#2,6:194\n1282#2,3:207\n1285#2,3:211\n607#3:200\n604#3,6:201\n605#4:210\n113#5:214\n*S KotlinDebug\n*F\n+ 1 TextInputPill.kt\nio/intercom/android/sdk/survey/ui/questiontype/text/TextInputPillKt\n*L\n58#1:194,6\n59#1:207,3\n59#1:211,3\n59#1:200\n59#1:201,6\n59#1:210\n66#1:214\n*E\n"})
public final class TextInputPillKt {
    /* JADX WARN: Code duplicated, block: B:100:0x014b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0151  */
    /* JADX WARN: Code duplicated, block: B:104:0x015f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0162  */
    /* JADX WARN: Code duplicated, block: B:109:0x016a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0173  */
    /* JADX WARN: Code duplicated, block: B:112:0x0177  */
    /* JADX WARN: Code duplicated, block: B:114:0x0181  */
    /* JADX WARN: Code duplicated, block: B:115:0x0184  */
    /* JADX WARN: Code duplicated, block: B:117:0x0189  */
    /* JADX WARN: Code duplicated, block: B:120:0x0197  */
    /* JADX WARN: Code duplicated, block: B:122:0x019e  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:127:0x01af  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:150:0x0206  */
    /* JADX WARN: Code duplicated, block: B:153:0x021c  */
    /* JADX WARN: Code duplicated, block: B:159:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x024d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0250  */
    /* JADX WARN: Code duplicated, block: B:163:0x0254  */
    /* JADX WARN: Code duplicated, block: B:164:0x0257  */
    /* JADX WARN: Code duplicated, block: B:166:0x025b  */
    /* JADX WARN: Code duplicated, block: B:167:0x025e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0262  */
    /* JADX WARN: Code duplicated, block: B:170:0x0266  */
    /* JADX WARN: Code duplicated, block: B:172:0x0269  */
    /* JADX WARN: Code duplicated, block: B:173:0x026d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0271  */
    /* JADX WARN: Code duplicated, block: B:176:0x0277  */
    /* JADX WARN: Code duplicated, block: B:178:0x027d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0284  */
    /* JADX WARN: Code duplicated, block: B:181:0x0288  */
    /* JADX WARN: Code duplicated, block: B:182:0x028f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0293  */
    /* JADX WARN: Code duplicated, block: B:185:0x0295  */
    /* JADX WARN: Code duplicated, block: B:187:0x0299  */
    /* JADX WARN: Code duplicated, block: B:188:0x029b  */
    /* JADX WARN: Code duplicated, block: B:190:0x029f  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:194:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:202:0x0310  */
    /* JADX WARN: Code duplicated, block: B:205:0x0326  */
    /* JADX WARN: Code duplicated, block: B:209:0x050b  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0112  */
    /* JADX WARN: Code duplicated, block: B:87:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0127  */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x013a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0142  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TextInputPill-g5ZjG94, reason: not valid java name */
    public static final void m523TextInputPillg5ZjG94(@Nullable String str, @Nullable String str2, @NotNull final Function1<? super String, Unit> onTextChanged, @Nullable q0 q0Var, final long j10, int i10, boolean z10, @Nullable Function1<? super y3, Unit> function1, int i11, int i12, boolean z11, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z12, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i13, final int i14, final int i15) {
        int i16;
        String str3;
        int i17;
        int i18;
        q0 q0Var2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        String str4;
        final String str5;
        q0 q0Var3;
        int i43;
        boolean z14;
        Function1<? super y3, Unit> function3;
        int iO;
        int iA;
        final boolean z15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        boolean z16;
        float fE;
        long jM;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        Object objI1;
        androidx.compose.runtime.c0 c0Var2;
        final String str6;
        final boolean z17;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final boolean z18;
        final int i44;
        final int i45;
        final int i46;
        final Function1<? super y3, Unit> function6;
        final String str7;
        final boolean z19;
        final q0 q0Var4;
        final float f11;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(701760197);
        int i47 = i15 & 1;
        if (i47 != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i16 = (c0VarR.D(str) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        int i48 = i15 & 2;
        if (i48 == 0) {
            if ((i13 & com.planner5d.library.engine.input.f.b.B) == 0) {
                str3 = str2;
                i16 |= c0VarR.D(str3) ? 32 : 16;
            }
            if ((i15 & 4) != 0) {
                i16 |= a5.S0;
            } else if ((i13 & 896) == 0) {
                if (c0VarR.k0(onTextChanged)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i16 |= i17;
            }
            i18 = i15 & 8;
            if (i18 != 0) {
                if ((i13 & 7168) == 0) {
                    q0Var2 = q0Var;
                    if (c0VarR.D(q0Var2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                if ((i15 & 16) != 0) {
                    i16 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    if (c0VarR.L(j10)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i16 |= i20;
                }
                i21 = i15 & 32;
                if (i21 != 0) {
                    i16 |= androidx.profileinstaller.n.c.f73814m;
                    i22 = i10;
                } else {
                    i22 = i10;
                    if ((i13 & 458752) == 0) {
                        if (c0VarR.K(i22)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i16 |= i23;
                    }
                }
                i24 = i15 & 64;
                if (i24 != 0) {
                    i16 |= 1572864;
                    z13 = z10;
                } else {
                    z13 = z10;
                    if ((i13 & 3670016) == 0) {
                        if (c0VarR.G(z13)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i16 |= i25;
                    }
                }
                i26 = i15 & 128;
                if (i26 != 0) {
                    i16 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (c0VarR.k0(function1)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
                i28 = i15 & 256;
                if (i28 != 0) {
                    if ((i13 & 234881024) == 0) {
                        if (c0VarR.K(i11)) {
                            i29 = 67108864;
                        } else {
                            i29 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i16 |= i29;
                    }
                    i30 = i15 & 512;
                    if (i30 != 0) {
                        if ((i13 & 1879048192) == 0) {
                            if (c0VarR.K(i12)) {
                                i31 = 536870912;
                            } else {
                                i31 = 268435456;
                            }
                            i16 |= i31;
                        }
                        i32 = i15 & 1024;
                        if (i32 != 0) {
                            i33 = i14 | 6;
                        } else if ((i14 & 14) == 0) {
                            if (c0VarR.G(z11)) {
                                i34 = 4;
                            } else {
                                i34 = 2;
                            }
                            i33 = i14 | i34;
                        } else {
                            i33 = i14;
                        }
                        i35 = i15 & 2048;
                        if (i35 != 0) {
                            i33 |= 48;
                        } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                            if (c0VarR.k0(function2)) {
                                i36 = 32;
                            } else {
                                i36 = 16;
                            }
                            i33 |= i36;
                        }
                        i37 = i33;
                        i38 = i15 & 4096;
                        if (i38 != 0) {
                            i39 = i37 | a5.S0;
                        } else if ((i14 & 896) == 0) {
                            i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                        } else {
                            i39 = i37;
                        }
                        i40 = i15 & 8192;
                        if (i40 != 0) {
                            i42 = i39 | 3072;
                        } else {
                            i41 = i39;
                            if ((i14 & 7168) == 0) {
                                i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                            } else {
                                i42 = i41;
                            }
                        }
                        if ((i16 & 1533916891) != 306783378 && (i42 & 5851) == 1170 && c0VarR.d()) {
                            c0VarR.u();
                            str6 = str;
                            function6 = function1;
                            i45 = i11;
                            z17 = z12;
                            f11 = f10;
                            c0Var2 = c0VarR;
                            q0Var4 = q0Var2;
                            i44 = i22;
                            z18 = z13;
                            str7 = str3;
                            i46 = i12;
                            z19 = z11;
                            function5 = function2;
                        } else {
                            if (i47 != 0) {
                                str4 = "";
                            } else {
                                str4 = str;
                            }
                            if (i48 != 0) {
                                str5 = "";
                            } else {
                                str5 = str3;
                            }
                            if (i18 != 0) {
                                q0Var3 = null;
                            } else {
                                q0Var3 = q0Var2;
                            }
                            if (i21 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i22;
                            }
                            if (i24 != 0) {
                                z14 = false;
                            } else {
                                z14 = z13;
                            }
                            if (i26 != 0) {
                                function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                    }
                                };
                            } else {
                                function3 = function1;
                            }
                            if (i28 != 0) {
                                iO = androidx.compose.ui.text.input.b0.f41811b.o();
                            } else {
                                iO = i11;
                            }
                            if (i30 != 0) {
                                iA = androidx.compose.ui.text.input.t.f41944b.a();
                            } else {
                                iA = i12;
                            }
                            if (i32 != 0) {
                                z15 = false;
                            } else {
                                z15 = z11;
                            }
                            if (i35 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i38 != 0) {
                                z16 = true;
                            } else {
                                z16 = z12;
                            }
                            if (i40 != 0) {
                                fE = androidx.compose.ui.unit.h.f42689b.e();
                            } else {
                                fE = f10;
                            }
                            c0VarR.E(-652105429);
                            if (q0Var3 == null) {
                                jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM = q0Var3.M();
                            }
                            int i49 = i42;
                            String str8 = str4;
                            long j11 = jM;
                            c0VarR.A();
                            c0VarR.E(-652099794);
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.foundation.relocation.d.a();
                                c0VarR.Y(objI0);
                            }
                            final androidx.compose.foundation.relocation.a aVar2 = (androidx.compose.foundation.relocation.a) objI0;
                            c0VarR.A();
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI1);
                            }
                            final s0 s0Var = (s0) objI1;
                            int i50 = i16;
                            Function1<? super y3, Unit> function7 = function3;
                            androidx.compose.ui.a0 a0VarB = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                            float fR = androidx.compose.ui.unit.h.r(1);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i51 = IntercomTheme.$stable;
                            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB, fR, j11, intercomTheme.getShapes(c0VarR, i51).m()), intercomTheme.getShapes(c0VarR, i51).m()), aVar2), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var, aVar2, (p0) obj);
                                }
                            });
                            j40 j40VarJ = n40.f30917a.j(c0VarR, 6);
                            q0.a aVar3 = q0.f38131b;
                            int i52 = iO;
                            int i53 = iA;
                            boolean z20 = z16;
                            c0Var2 = c0VarR;
                            boolean z21 = z15;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function4;
                            u40.h(str8, onTextChanged, a0VarA, z20, false, intercomTheme.getTypography(c0VarR, i51).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                    invoke(c0Var3, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i54) {
                                    if ((i54 & 11) == 2 && c0Var3.d()) {
                                        c0Var3.u();
                                    } else {
                                        q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                    }
                                }
                            }, c0VarR, 54), function8, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                    invoke(c0Var3, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i54) {
                                    if ((i54 & 11) == 2 && c0Var3.d()) {
                                        c0Var3.u();
                                    } else if (z15) {
                                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                    }
                                }
                            }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i52, i53, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function7, null, null, null, 59, null), z14, i43, 0, null, intercomTheme.getShapes(c0VarR, i51).m(), j40VarJ.c(((-1025) & 1) != 0 ? j40VarJ.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ.f29657c : intercomTheme.getColors(c0VarR, i51).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ.f29659e : intercomTheme.getColors(c0VarR, i51).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ.f29660f : intercomTheme.getColors(c0VarR, i51).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ.f29661g : intercomTheme.getColors(c0VarR, i51).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ.f29662h : intercomTheme.getColors(c0VarR, i51).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ.f29666l : aVar3.s(), ((-1025) & 4096) != 0 ? j40VarJ.f29667m : aVar3.s(), ((-1025) & 8192) != 0 ? j40VarJ.f29668n : aVar3.s(), ((-1025) & 16384) != 0 ? j40VarJ.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ.Q : 0L), c0Var2, 817889280 | (i50 & 14) | ((i50 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i49 << 3) & 7168) | ((i49 << 21) & 234881024), ((i50 << 3) & 29360128) | ((i50 << 9) & 234881024), 0, 1604688);
                            str6 = str8;
                            z17 = z20;
                            function5 = function8;
                            z18 = z14;
                            i44 = i43;
                            i45 = i52;
                            i46 = i53;
                            function6 = function7;
                            str7 = str5;
                            z19 = z21;
                            q0Var4 = q0Var3;
                            f11 = fE;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i16 |= 805306368;
                    i32 = i15 & 1024;
                    if (i32 != 0) {
                        i33 = i14 | 6;
                    } else if ((i14 & 14) == 0) {
                        if (c0VarR.G(z11)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i14 | i34;
                    } else {
                        i33 = i14;
                    }
                    i35 = i15 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                        if (c0VarR.k0(function2)) {
                            i36 = 32;
                        } else {
                            i36 = 16;
                        }
                        i33 |= i36;
                    }
                    i37 = i33;
                    i38 = i15 & 4096;
                    if (i38 != 0) {
                        i39 = i37 | a5.S0;
                    } else if ((i14 & 896) == 0) {
                        i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                    } else {
                        i39 = i37;
                    }
                    i40 = i15 & 8192;
                    if (i40 != 0) {
                        i42 = i39 | 3072;
                    } else {
                        i41 = i39;
                        if ((i14 & 7168) == 0) {
                            i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                        } else {
                            i42 = i41;
                        }
                    }
                    if ((i16 & 1533916891) != 306783378) {
                        if (i47 != 0) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        if (i48 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            q0Var3 = null;
                        } else {
                            q0Var3 = q0Var2;
                        }
                        if (i21 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i22;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        } else {
                            z14 = z13;
                        }
                        if (i26 != 0) {
                            function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        if (i28 != 0) {
                            iO = androidx.compose.ui.text.input.b0.f41811b.o();
                        } else {
                            iO = i11;
                        }
                        if (i30 != 0) {
                            iA = androidx.compose.ui.text.input.t.f41944b.a();
                        } else {
                            iA = i12;
                        }
                        if (i32 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i35 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i40 != 0) {
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                        } else {
                            fE = f10;
                        }
                        c0VarR.E(-652105429);
                        if (q0Var3 == null) {
                            jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM = q0Var3.M();
                        }
                        int i410 = i42;
                        String str9 = str4;
                        long j12 = jM;
                        c0VarR.A();
                        c0VarR.E(-652099794);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.foundation.relocation.d.a();
                            c0VarR.Y(objI0);
                        }
                        final androidx.compose.foundation.relocation.a aVar4 = (androidx.compose.foundation.relocation.a) objI0;
                        c0VarR.A();
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        final s0 s0Var2 = (s0) objI1;
                        int i54 = i16;
                        Function1<? super y3, Unit> function9 = function3;
                        androidx.compose.ui.a0 a0VarB2 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                        float fR2 = androidx.compose.ui.unit.h.r(1);
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i55 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB2, fR2, j12, intercomTheme2.getShapes(c0VarR, i55).m()), intercomTheme2.getShapes(c0VarR, i55).m()), aVar4), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var2, aVar4, (p0) obj);
                            }
                        });
                        j40 j40VarJ2 = n40.f30917a.j(c0VarR, 6);
                        q0.a aVar5 = q0.f38131b;
                        int i56 = iO;
                        int i57 = iA;
                        boolean z22 = z16;
                        c0Var2 = c0VarR;
                        boolean z23 = z15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function4;
                        u40.h(str9, onTextChanged, a0VarA2, z22, false, intercomTheme2.getTypography(c0VarR, i55).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i58) {
                                if ((i58 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else {
                                    q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                }
                            }
                        }, c0VarR, 54), function10, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i58) {
                                if ((i58 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else if (z15) {
                                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                }
                            }
                        }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i56, i57, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function9, null, null, null, 59, null), z14, i43, 0, null, intercomTheme2.getShapes(c0VarR, i55).m(), j40VarJ2.c(((-1025) & 1) != 0 ? j40VarJ2.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ2.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ2.f29657c : intercomTheme2.getColors(c0VarR, i55).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ2.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ2.f29659e : intercomTheme2.getColors(c0VarR, i55).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ2.f29660f : intercomTheme2.getColors(c0VarR, i55).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ2.f29661g : intercomTheme2.getColors(c0VarR, i55).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ2.f29662h : intercomTheme2.getColors(c0VarR, i55).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ2.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ2.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ2.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ2.f29666l : aVar5.s(), ((-1025) & 4096) != 0 ? j40VarJ2.f29667m : aVar5.s(), ((-1025) & 8192) != 0 ? j40VarJ2.f29668n : aVar5.s(), ((-1025) & 16384) != 0 ? j40VarJ2.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ2.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ2.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ2.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ2.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ2.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ2.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ2.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ2.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ2.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ2.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ2.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ2.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ2.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ2.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ2.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ2.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ2.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ2.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ2.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ2.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ2.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ2.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ2.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ2.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ2.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ2.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ2.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ2.Q : 0L), c0Var2, 817889280 | (i54 & 14) | ((i54 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i410 << 3) & 7168) | ((i410 << 21) & 234881024), ((i54 << 3) & 29360128) | ((i54 << 9) & 234881024), 0, 1604688);
                        str6 = str9;
                        z17 = z22;
                        function5 = function10;
                        z18 = z14;
                        i44 = i43;
                        i45 = i56;
                        i46 = i57;
                        function6 = function9;
                        str7 = str5;
                        z19 = z23;
                        q0Var4 = q0Var3;
                        f11 = fE;
                    } else {
                        if (i47 != 0) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        if (i48 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            q0Var3 = null;
                        } else {
                            q0Var3 = q0Var2;
                        }
                        if (i21 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i22;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        } else {
                            z14 = z13;
                        }
                        if (i26 != 0) {
                            function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        if (i28 != 0) {
                            iO = androidx.compose.ui.text.input.b0.f41811b.o();
                        } else {
                            iO = i11;
                        }
                        if (i30 != 0) {
                            iA = androidx.compose.ui.text.input.t.f41944b.a();
                        } else {
                            iA = i12;
                        }
                        if (i32 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i35 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i40 != 0) {
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                        } else {
                            fE = f10;
                        }
                        c0VarR.E(-652105429);
                        if (q0Var3 == null) {
                            jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM = q0Var3.M();
                        }
                        int i411 = i42;
                        String str10 = str4;
                        long j13 = jM;
                        c0VarR.A();
                        c0VarR.E(-652099794);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.foundation.relocation.d.a();
                            c0VarR.Y(objI0);
                        }
                        final androidx.compose.foundation.relocation.a aVar6 = (androidx.compose.foundation.relocation.a) objI0;
                        c0VarR.A();
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        final s0 s0Var3 = (s0) objI1;
                        int i58 = i16;
                        Function1<? super y3, Unit> function11 = function3;
                        androidx.compose.ui.a0 a0VarB3 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                        float fR3 = androidx.compose.ui.unit.h.r(1);
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i59 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarA3 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB3, fR3, j13, intercomTheme3.getShapes(c0VarR, i59).m()), intercomTheme3.getShapes(c0VarR, i59).m()), aVar6), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var3, aVar6, (p0) obj);
                            }
                        });
                        j40 j40VarJ3 = n40.f30917a.j(c0VarR, 6);
                        q0.a aVar7 = q0.f38131b;
                        int i510 = iO;
                        int i511 = iA;
                        boolean z24 = z16;
                        c0Var2 = c0VarR;
                        boolean z25 = z15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function4;
                        u40.h(str10, onTextChanged, a0VarA3, z24, false, intercomTheme3.getTypography(c0VarR, i59).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i512) {
                                if ((i512 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else {
                                    q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                }
                            }
                        }, c0VarR, 54), function12, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i512) {
                                if ((i512 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else if (z15) {
                                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                }
                            }
                        }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i510, i511, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function11, null, null, null, 59, null), z14, i43, 0, null, intercomTheme3.getShapes(c0VarR, i59).m(), j40VarJ3.c(((-1025) & 1) != 0 ? j40VarJ3.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ3.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ3.f29657c : intercomTheme3.getColors(c0VarR, i59).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ3.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ3.f29659e : intercomTheme3.getColors(c0VarR, i59).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ3.f29660f : intercomTheme3.getColors(c0VarR, i59).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ3.f29661g : intercomTheme3.getColors(c0VarR, i59).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ3.f29662h : intercomTheme3.getColors(c0VarR, i59).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ3.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ3.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ3.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ3.f29666l : aVar7.s(), ((-1025) & 4096) != 0 ? j40VarJ3.f29667m : aVar7.s(), ((-1025) & 8192) != 0 ? j40VarJ3.f29668n : aVar7.s(), ((-1025) & 16384) != 0 ? j40VarJ3.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ3.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ3.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ3.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ3.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ3.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ3.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ3.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ3.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ3.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ3.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ3.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ3.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ3.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ3.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ3.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ3.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ3.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ3.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ3.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ3.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ3.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ3.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ3.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ3.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ3.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ3.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ3.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ3.Q : 0L), c0Var2, 817889280 | (i58 & 14) | ((i58 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i411 << 3) & 7168) | ((i411 << 21) & 234881024), ((i58 << 3) & 29360128) | ((i58 << 9) & 234881024), 0, 1604688);
                        str6 = str10;
                        z17 = z24;
                        function5 = function12;
                        z18 = z14;
                        i44 = i43;
                        i45 = i510;
                        i46 = i511;
                        function6 = function11;
                        str7 = str5;
                        z19 = z25;
                        q0Var4 = q0Var3;
                        f11 = fE;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i16 |= 100663296;
                i30 = i15 & 512;
                if (i30 != 0) {
                    if ((i13 & 1879048192) == 0) {
                        if (c0VarR.K(i12)) {
                            i31 = 536870912;
                        } else {
                            i31 = 268435456;
                        }
                        i16 |= i31;
                    }
                    i32 = i15 & 1024;
                    if (i32 != 0) {
                        i33 = i14 | 6;
                    } else if ((i14 & 14) == 0) {
                        if (c0VarR.G(z11)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i14 | i34;
                    } else {
                        i33 = i14;
                    }
                    i35 = i15 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                        if (c0VarR.k0(function2)) {
                            i36 = 32;
                        } else {
                            i36 = 16;
                        }
                        i33 |= i36;
                    }
                    i37 = i33;
                    i38 = i15 & 4096;
                    if (i38 != 0) {
                        i39 = i37 | a5.S0;
                    } else if ((i14 & 896) == 0) {
                        i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                    } else {
                        i39 = i37;
                    }
                    i40 = i15 & 8192;
                    if (i40 != 0) {
                        i42 = i39 | 3072;
                    } else {
                        i41 = i39;
                        if ((i14 & 7168) == 0) {
                            i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                        } else {
                            i42 = i41;
                        }
                    }
                    if ((i16 & 1533916891) != 306783378) {
                        if (i47 != 0) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        if (i48 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            q0Var3 = null;
                        } else {
                            q0Var3 = q0Var2;
                        }
                        if (i21 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i22;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        } else {
                            z14 = z13;
                        }
                        if (i26 != 0) {
                            function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        if (i28 != 0) {
                            iO = androidx.compose.ui.text.input.b0.f41811b.o();
                        } else {
                            iO = i11;
                        }
                        if (i30 != 0) {
                            iA = androidx.compose.ui.text.input.t.f41944b.a();
                        } else {
                            iA = i12;
                        }
                        if (i32 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i35 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i40 != 0) {
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                        } else {
                            fE = f10;
                        }
                        c0VarR.E(-652105429);
                        if (q0Var3 == null) {
                            jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM = q0Var3.M();
                        }
                        int i412 = i42;
                        String str11 = str4;
                        long j14 = jM;
                        c0VarR.A();
                        c0VarR.E(-652099794);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.foundation.relocation.d.a();
                            c0VarR.Y(objI0);
                        }
                        final androidx.compose.foundation.relocation.a aVar8 = (androidx.compose.foundation.relocation.a) objI0;
                        c0VarR.A();
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        final s0 s0Var4 = (s0) objI1;
                        int i512 = i16;
                        Function1<? super y3, Unit> function13 = function3;
                        androidx.compose.ui.a0 a0VarB4 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                        float fR4 = androidx.compose.ui.unit.h.r(1);
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i513 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarA4 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB4, fR4, j14, intercomTheme4.getShapes(c0VarR, i513).m()), intercomTheme4.getShapes(c0VarR, i513).m()), aVar8), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var4, aVar8, (p0) obj);
                            }
                        });
                        j40 j40VarJ4 = n40.f30917a.j(c0VarR, 6);
                        q0.a aVar9 = q0.f38131b;
                        int i514 = iO;
                        int i515 = iA;
                        boolean z26 = z16;
                        c0Var2 = c0VarR;
                        boolean z27 = z15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function4;
                        u40.h(str11, onTextChanged, a0VarA4, z26, false, intercomTheme4.getTypography(c0VarR, i513).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i516) {
                                if ((i516 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else {
                                    q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                }
                            }
                        }, c0VarR, 54), function14, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i516) {
                                if ((i516 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else if (z15) {
                                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                }
                            }
                        }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i514, i515, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function13, null, null, null, 59, null), z14, i43, 0, null, intercomTheme4.getShapes(c0VarR, i513).m(), j40VarJ4.c(((-1025) & 1) != 0 ? j40VarJ4.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ4.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ4.f29657c : intercomTheme4.getColors(c0VarR, i513).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ4.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ4.f29659e : intercomTheme4.getColors(c0VarR, i513).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ4.f29660f : intercomTheme4.getColors(c0VarR, i513).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ4.f29661g : intercomTheme4.getColors(c0VarR, i513).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ4.f29662h : intercomTheme4.getColors(c0VarR, i513).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ4.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ4.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ4.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ4.f29666l : aVar9.s(), ((-1025) & 4096) != 0 ? j40VarJ4.f29667m : aVar9.s(), ((-1025) & 8192) != 0 ? j40VarJ4.f29668n : aVar9.s(), ((-1025) & 16384) != 0 ? j40VarJ4.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ4.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ4.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ4.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ4.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ4.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ4.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ4.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ4.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ4.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ4.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ4.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ4.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ4.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ4.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ4.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ4.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ4.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ4.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ4.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ4.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ4.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ4.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ4.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ4.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ4.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ4.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ4.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ4.Q : 0L), c0Var2, 817889280 | (i512 & 14) | ((i512 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i412 << 3) & 7168) | ((i412 << 21) & 234881024), ((i512 << 3) & 29360128) | ((i512 << 9) & 234881024), 0, 1604688);
                        str6 = str11;
                        z17 = z26;
                        function5 = function14;
                        z18 = z14;
                        i44 = i43;
                        i45 = i514;
                        i46 = i515;
                        function6 = function13;
                        str7 = str5;
                        z19 = z27;
                        q0Var4 = q0Var3;
                        f11 = fE;
                    } else {
                        if (i47 != 0) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        if (i48 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            q0Var3 = null;
                        } else {
                            q0Var3 = q0Var2;
                        }
                        if (i21 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i22;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        } else {
                            z14 = z13;
                        }
                        if (i26 != 0) {
                            function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        if (i28 != 0) {
                            iO = androidx.compose.ui.text.input.b0.f41811b.o();
                        } else {
                            iO = i11;
                        }
                        if (i30 != 0) {
                            iA = androidx.compose.ui.text.input.t.f41944b.a();
                        } else {
                            iA = i12;
                        }
                        if (i32 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i35 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i40 != 0) {
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                        } else {
                            fE = f10;
                        }
                        c0VarR.E(-652105429);
                        if (q0Var3 == null) {
                            jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM = q0Var3.M();
                        }
                        int i413 = i42;
                        String str12 = str4;
                        long j15 = jM;
                        c0VarR.A();
                        c0VarR.E(-652099794);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.foundation.relocation.d.a();
                            c0VarR.Y(objI0);
                        }
                        final androidx.compose.foundation.relocation.a aVar10 = (androidx.compose.foundation.relocation.a) objI0;
                        c0VarR.A();
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        final s0 s0Var5 = (s0) objI1;
                        int i516 = i16;
                        Function1<? super y3, Unit> function15 = function3;
                        androidx.compose.ui.a0 a0VarB5 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                        float fR5 = androidx.compose.ui.unit.h.r(1);
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i517 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarA5 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB5, fR5, j15, intercomTheme5.getShapes(c0VarR, i517).m()), intercomTheme5.getShapes(c0VarR, i517).m()), aVar10), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var5, aVar10, (p0) obj);
                            }
                        });
                        j40 j40VarJ5 = n40.f30917a.j(c0VarR, 6);
                        q0.a aVar11 = q0.f38131b;
                        int i518 = iO;
                        int i519 = iA;
                        boolean z28 = z16;
                        c0Var2 = c0VarR;
                        boolean z29 = z15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function4;
                        u40.h(str12, onTextChanged, a0VarA5, z28, false, intercomTheme5.getTypography(c0VarR, i517).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5110) {
                                if ((i5110 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else {
                                    q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                }
                            }
                        }, c0VarR, 54), function16, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5110) {
                                if ((i5110 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else if (z15) {
                                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                }
                            }
                        }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i518, i519, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function15, null, null, null, 59, null), z14, i43, 0, null, intercomTheme5.getShapes(c0VarR, i517).m(), j40VarJ5.c(((-1025) & 1) != 0 ? j40VarJ5.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ5.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ5.f29657c : intercomTheme5.getColors(c0VarR, i517).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ5.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ5.f29659e : intercomTheme5.getColors(c0VarR, i517).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ5.f29660f : intercomTheme5.getColors(c0VarR, i517).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ5.f29661g : intercomTheme5.getColors(c0VarR, i517).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ5.f29662h : intercomTheme5.getColors(c0VarR, i517).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ5.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ5.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ5.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ5.f29666l : aVar11.s(), ((-1025) & 4096) != 0 ? j40VarJ5.f29667m : aVar11.s(), ((-1025) & 8192) != 0 ? j40VarJ5.f29668n : aVar11.s(), ((-1025) & 16384) != 0 ? j40VarJ5.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ5.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ5.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ5.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ5.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ5.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ5.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ5.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ5.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ5.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ5.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ5.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ5.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ5.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ5.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ5.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ5.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ5.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ5.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ5.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ5.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ5.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ5.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ5.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ5.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ5.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ5.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ5.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ5.Q : 0L), c0Var2, 817889280 | (i516 & 14) | ((i516 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i413 << 3) & 7168) | ((i413 << 21) & 234881024), ((i516 << 3) & 29360128) | ((i516 << 9) & 234881024), 0, 1604688);
                        str6 = str12;
                        z17 = z28;
                        function5 = function16;
                        z18 = z14;
                        i44 = i43;
                        i45 = i518;
                        i46 = i519;
                        function6 = function15;
                        str7 = str5;
                        z19 = z29;
                        q0Var4 = q0Var3;
                        f11 = fE;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i16 |= 805306368;
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    if (c0VarR.G(z11)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                    if (c0VarR.k0(function2)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | a5.S0;
                } else if ((i14 & 896) == 0) {
                    i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                } else {
                    i39 = i37;
                }
                i40 = i15 & 8192;
                if (i40 != 0) {
                    i42 = i39 | 3072;
                } else {
                    i41 = i39;
                    if ((i14 & 7168) == 0) {
                        i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                    } else {
                        i42 = i41;
                    }
                }
                if ((i16 & 1533916891) != 306783378) {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i414 = i42;
                    String str13 = str4;
                    long j16 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar12 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var6 = (s0) objI1;
                    int i5110 = i16;
                    Function1<? super y3, Unit> function17 = function3;
                    androidx.compose.ui.a0 a0VarB6 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR6 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                    int i5111 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA6 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB6, fR6, j16, intercomTheme6.getShapes(c0VarR, i5111).m()), intercomTheme6.getShapes(c0VarR, i5111).m()), aVar12), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var6, aVar12, (p0) obj);
                        }
                    });
                    j40 j40VarJ6 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar13 = q0.f38131b;
                    int i5112 = iO;
                    int i5113 = iA;
                    boolean z210 = z16;
                    c0Var2 = c0VarR;
                    boolean z211 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function4;
                    u40.h(str13, onTextChanged, a0VarA6, z210, false, intercomTheme6.getTypography(c0VarR, i5111).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5114) {
                            if ((i5114 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function18, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5114) {
                            if ((i5114 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5112, i5113, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function17, null, null, null, 59, null), z14, i43, 0, null, intercomTheme6.getShapes(c0VarR, i5111).m(), j40VarJ6.c(((-1025) & 1) != 0 ? j40VarJ6.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ6.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ6.f29657c : intercomTheme6.getColors(c0VarR, i5111).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ6.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ6.f29659e : intercomTheme6.getColors(c0VarR, i5111).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ6.f29660f : intercomTheme6.getColors(c0VarR, i5111).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ6.f29661g : intercomTheme6.getColors(c0VarR, i5111).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ6.f29662h : intercomTheme6.getColors(c0VarR, i5111).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ6.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ6.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ6.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ6.f29666l : aVar13.s(), ((-1025) & 4096) != 0 ? j40VarJ6.f29667m : aVar13.s(), ((-1025) & 8192) != 0 ? j40VarJ6.f29668n : aVar13.s(), ((-1025) & 16384) != 0 ? j40VarJ6.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ6.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ6.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ6.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ6.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ6.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ6.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ6.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ6.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ6.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ6.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ6.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ6.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ6.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ6.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ6.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ6.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ6.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ6.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ6.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ6.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ6.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ6.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ6.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ6.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ6.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ6.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ6.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ6.Q : 0L), c0Var2, 817889280 | (i5110 & 14) | ((i5110 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i414 << 3) & 7168) | ((i414 << 21) & 234881024), ((i5110 << 3) & 29360128) | ((i5110 << 9) & 234881024), 0, 1604688);
                    str6 = str13;
                    z17 = z210;
                    function5 = function18;
                    z18 = z14;
                    i44 = i43;
                    i45 = i5112;
                    i46 = i5113;
                    function6 = function17;
                    str7 = str5;
                    z19 = z211;
                    q0Var4 = q0Var3;
                    f11 = fE;
                } else {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i415 = i42;
                    String str14 = str4;
                    long j17 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar14 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var7 = (s0) objI1;
                    int i5114 = i16;
                    Function1<? super y3, Unit> function19 = function3;
                    androidx.compose.ui.a0 a0VarB7 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR7 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                    int i5115 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA7 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB7, fR7, j17, intercomTheme7.getShapes(c0VarR, i5115).m()), intercomTheme7.getShapes(c0VarR, i5115).m()), aVar14), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var7, aVar14, (p0) obj);
                        }
                    });
                    j40 j40VarJ7 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar15 = q0.f38131b;
                    int i5116 = iO;
                    int i5117 = iA;
                    boolean z212 = z16;
                    c0Var2 = c0VarR;
                    boolean z213 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function4;
                    u40.h(str14, onTextChanged, a0VarA7, z212, false, intercomTheme7.getTypography(c0VarR, i5115).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5118) {
                            if ((i5118 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function110, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5118) {
                            if ((i5118 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5116, i5117, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function19, null, null, null, 59, null), z14, i43, 0, null, intercomTheme7.getShapes(c0VarR, i5115).m(), j40VarJ7.c(((-1025) & 1) != 0 ? j40VarJ7.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ7.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ7.f29657c : intercomTheme7.getColors(c0VarR, i5115).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ7.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ7.f29659e : intercomTheme7.getColors(c0VarR, i5115).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ7.f29660f : intercomTheme7.getColors(c0VarR, i5115).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ7.f29661g : intercomTheme7.getColors(c0VarR, i5115).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ7.f29662h : intercomTheme7.getColors(c0VarR, i5115).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ7.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ7.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ7.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ7.f29666l : aVar15.s(), ((-1025) & 4096) != 0 ? j40VarJ7.f29667m : aVar15.s(), ((-1025) & 8192) != 0 ? j40VarJ7.f29668n : aVar15.s(), ((-1025) & 16384) != 0 ? j40VarJ7.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ7.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ7.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ7.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ7.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ7.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ7.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ7.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ7.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ7.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ7.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ7.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ7.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ7.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ7.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ7.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ7.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ7.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ7.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ7.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ7.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ7.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ7.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ7.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ7.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ7.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ7.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ7.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ7.Q : 0L), c0Var2, 817889280 | (i5114 & 14) | ((i5114 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i415 << 3) & 7168) | ((i415 << 21) & 234881024), ((i5114 << 3) & 29360128) | ((i5114 << 9) & 234881024), 0, 1604688);
                    str6 = str14;
                    z17 = z212;
                    function5 = function110;
                    z18 = z14;
                    i44 = i43;
                    i45 = i5116;
                    i46 = i5117;
                    function6 = function19;
                    str7 = str5;
                    z19 = z213;
                    q0Var4 = q0Var3;
                    f11 = fE;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 |= 3072;
            q0Var2 = q0Var;
            if ((i15 & 16) != 0) {
                i16 |= 24576;
            } else if ((i13 & 57344) == 0) {
                if (c0VarR.L(j10)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i16 |= i20;
            }
            i21 = i15 & 32;
            if (i21 != 0) {
                i16 |= androidx.profileinstaller.n.c.f73814m;
                i22 = i10;
            } else {
                i22 = i10;
                if ((i13 & 458752) == 0) {
                    if (c0VarR.K(i22)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i16 |= i23;
                }
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                i16 |= 1572864;
                z13 = z10;
            } else {
                z13 = z10;
                if ((i13 & 3670016) == 0) {
                    if (c0VarR.G(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i16 |= i25;
                }
            }
            i26 = i15 & 128;
            if (i26 != 0) {
                i16 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (c0VarR.k0(function1)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            i28 = i15 & 256;
            if (i28 != 0) {
                if ((i13 & 234881024) == 0) {
                    if (c0VarR.K(i11)) {
                        i29 = 67108864;
                    } else {
                        i29 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i16 |= i29;
                }
                i30 = i15 & 512;
                if (i30 != 0) {
                    if ((i13 & 1879048192) == 0) {
                        if (c0VarR.K(i12)) {
                            i31 = 536870912;
                        } else {
                            i31 = 268435456;
                        }
                        i16 |= i31;
                    }
                    i32 = i15 & 1024;
                    if (i32 != 0) {
                        i33 = i14 | 6;
                    } else if ((i14 & 14) == 0) {
                        if (c0VarR.G(z11)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i14 | i34;
                    } else {
                        i33 = i14;
                    }
                    i35 = i15 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                        if (c0VarR.k0(function2)) {
                            i36 = 32;
                        } else {
                            i36 = 16;
                        }
                        i33 |= i36;
                    }
                    i37 = i33;
                    i38 = i15 & 4096;
                    if (i38 != 0) {
                        i39 = i37 | a5.S0;
                    } else if ((i14 & 896) == 0) {
                        i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                    } else {
                        i39 = i37;
                    }
                    i40 = i15 & 8192;
                    if (i40 != 0) {
                        i42 = i39 | 3072;
                    } else {
                        i41 = i39;
                        if ((i14 & 7168) == 0) {
                            i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                        } else {
                            i42 = i41;
                        }
                    }
                    if ((i16 & 1533916891) != 306783378) {
                        if (i47 != 0) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        if (i48 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            q0Var3 = null;
                        } else {
                            q0Var3 = q0Var2;
                        }
                        if (i21 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i22;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        } else {
                            z14 = z13;
                        }
                        if (i26 != 0) {
                            function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        if (i28 != 0) {
                            iO = androidx.compose.ui.text.input.b0.f41811b.o();
                        } else {
                            iO = i11;
                        }
                        if (i30 != 0) {
                            iA = androidx.compose.ui.text.input.t.f41944b.a();
                        } else {
                            iA = i12;
                        }
                        if (i32 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i35 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i40 != 0) {
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                        } else {
                            fE = f10;
                        }
                        c0VarR.E(-652105429);
                        if (q0Var3 == null) {
                            jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM = q0Var3.M();
                        }
                        int i416 = i42;
                        String str15 = str4;
                        long j18 = jM;
                        c0VarR.A();
                        c0VarR.E(-652099794);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.foundation.relocation.d.a();
                            c0VarR.Y(objI0);
                        }
                        final androidx.compose.foundation.relocation.a aVar16 = (androidx.compose.foundation.relocation.a) objI0;
                        c0VarR.A();
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        final s0 s0Var8 = (s0) objI1;
                        int i5118 = i16;
                        Function1<? super y3, Unit> function111 = function3;
                        androidx.compose.ui.a0 a0VarB8 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                        float fR8 = androidx.compose.ui.unit.h.r(1);
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i5119 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarA8 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB8, fR8, j18, intercomTheme8.getShapes(c0VarR, i5119).m()), intercomTheme8.getShapes(c0VarR, i5119).m()), aVar16), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var8, aVar16, (p0) obj);
                            }
                        });
                        j40 j40VarJ8 = n40.f30917a.j(c0VarR, 6);
                        q0.a aVar17 = q0.f38131b;
                        int i51110 = iO;
                        int i51111 = iA;
                        boolean z214 = z16;
                        c0Var2 = c0VarR;
                        boolean z215 = z15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function112 = function4;
                        u40.h(str15, onTextChanged, a0VarA8, z214, false, intercomTheme8.getTypography(c0VarR, i5119).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51112) {
                                if ((i51112 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else {
                                    q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                }
                            }
                        }, c0VarR, 54), function112, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51112) {
                                if ((i51112 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else if (z15) {
                                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                }
                            }
                        }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51110, i51111, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function111, null, null, null, 59, null), z14, i43, 0, null, intercomTheme8.getShapes(c0VarR, i5119).m(), j40VarJ8.c(((-1025) & 1) != 0 ? j40VarJ8.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ8.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ8.f29657c : intercomTheme8.getColors(c0VarR, i5119).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ8.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ8.f29659e : intercomTheme8.getColors(c0VarR, i5119).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ8.f29660f : intercomTheme8.getColors(c0VarR, i5119).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ8.f29661g : intercomTheme8.getColors(c0VarR, i5119).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ8.f29662h : intercomTheme8.getColors(c0VarR, i5119).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ8.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ8.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ8.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ8.f29666l : aVar17.s(), ((-1025) & 4096) != 0 ? j40VarJ8.f29667m : aVar17.s(), ((-1025) & 8192) != 0 ? j40VarJ8.f29668n : aVar17.s(), ((-1025) & 16384) != 0 ? j40VarJ8.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ8.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ8.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ8.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ8.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ8.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ8.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ8.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ8.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ8.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ8.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ8.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ8.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ8.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ8.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ8.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ8.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ8.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ8.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ8.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ8.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ8.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ8.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ8.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ8.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ8.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ8.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ8.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ8.Q : 0L), c0Var2, 817889280 | (i5118 & 14) | ((i5118 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i416 << 3) & 7168) | ((i416 << 21) & 234881024), ((i5118 << 3) & 29360128) | ((i5118 << 9) & 234881024), 0, 1604688);
                        str6 = str15;
                        z17 = z214;
                        function5 = function112;
                        z18 = z14;
                        i44 = i43;
                        i45 = i51110;
                        i46 = i51111;
                        function6 = function111;
                        str7 = str5;
                        z19 = z215;
                        q0Var4 = q0Var3;
                        f11 = fE;
                    } else {
                        if (i47 != 0) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        if (i48 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            q0Var3 = null;
                        } else {
                            q0Var3 = q0Var2;
                        }
                        if (i21 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i22;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        } else {
                            z14 = z13;
                        }
                        if (i26 != 0) {
                            function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        if (i28 != 0) {
                            iO = androidx.compose.ui.text.input.b0.f41811b.o();
                        } else {
                            iO = i11;
                        }
                        if (i30 != 0) {
                            iA = androidx.compose.ui.text.input.t.f41944b.a();
                        } else {
                            iA = i12;
                        }
                        if (i32 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i35 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i40 != 0) {
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                        } else {
                            fE = f10;
                        }
                        c0VarR.E(-652105429);
                        if (q0Var3 == null) {
                            jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM = q0Var3.M();
                        }
                        int i417 = i42;
                        String str16 = str4;
                        long j19 = jM;
                        c0VarR.A();
                        c0VarR.E(-652099794);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.foundation.relocation.d.a();
                            c0VarR.Y(objI0);
                        }
                        final androidx.compose.foundation.relocation.a aVar18 = (androidx.compose.foundation.relocation.a) objI0;
                        c0VarR.A();
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        final s0 s0Var9 = (s0) objI1;
                        int i51112 = i16;
                        Function1<? super y3, Unit> function113 = function3;
                        androidx.compose.ui.a0 a0VarB9 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                        float fR9 = androidx.compose.ui.unit.h.r(1);
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i51113 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarA9 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB9, fR9, j19, intercomTheme9.getShapes(c0VarR, i51113).m()), intercomTheme9.getShapes(c0VarR, i51113).m()), aVar18), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var9, aVar18, (p0) obj);
                            }
                        });
                        j40 j40VarJ9 = n40.f30917a.j(c0VarR, 6);
                        q0.a aVar19 = q0.f38131b;
                        int i51114 = iO;
                        int i51115 = iA;
                        boolean z216 = z16;
                        c0Var2 = c0VarR;
                        boolean z217 = z15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function114 = function4;
                        u40.h(str16, onTextChanged, a0VarA9, z216, false, intercomTheme9.getTypography(c0VarR, i51113).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51116) {
                                if ((i51116 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else {
                                    q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                }
                            }
                        }, c0VarR, 54), function114, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51116) {
                                if ((i51116 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else if (z15) {
                                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                }
                            }
                        }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51114, i51115, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function113, null, null, null, 59, null), z14, i43, 0, null, intercomTheme9.getShapes(c0VarR, i51113).m(), j40VarJ9.c(((-1025) & 1) != 0 ? j40VarJ9.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ9.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ9.f29657c : intercomTheme9.getColors(c0VarR, i51113).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ9.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ9.f29659e : intercomTheme9.getColors(c0VarR, i51113).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ9.f29660f : intercomTheme9.getColors(c0VarR, i51113).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ9.f29661g : intercomTheme9.getColors(c0VarR, i51113).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ9.f29662h : intercomTheme9.getColors(c0VarR, i51113).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ9.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ9.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ9.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ9.f29666l : aVar19.s(), ((-1025) & 4096) != 0 ? j40VarJ9.f29667m : aVar19.s(), ((-1025) & 8192) != 0 ? j40VarJ9.f29668n : aVar19.s(), ((-1025) & 16384) != 0 ? j40VarJ9.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ9.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ9.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ9.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ9.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ9.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ9.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ9.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ9.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ9.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ9.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ9.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ9.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ9.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ9.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ9.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ9.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ9.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ9.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ9.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ9.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ9.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ9.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ9.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ9.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ9.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ9.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ9.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ9.Q : 0L), c0Var2, 817889280 | (i51112 & 14) | ((i51112 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i417 << 3) & 7168) | ((i417 << 21) & 234881024), ((i51112 << 3) & 29360128) | ((i51112 << 9) & 234881024), 0, 1604688);
                        str6 = str16;
                        z17 = z216;
                        function5 = function114;
                        z18 = z14;
                        i44 = i43;
                        i45 = i51114;
                        i46 = i51115;
                        function6 = function113;
                        str7 = str5;
                        z19 = z217;
                        q0Var4 = q0Var3;
                        f11 = fE;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i16 |= 805306368;
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    if (c0VarR.G(z11)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                    if (c0VarR.k0(function2)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | a5.S0;
                } else if ((i14 & 896) == 0) {
                    i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                } else {
                    i39 = i37;
                }
                i40 = i15 & 8192;
                if (i40 != 0) {
                    i42 = i39 | 3072;
                } else {
                    i41 = i39;
                    if ((i14 & 7168) == 0) {
                        i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                    } else {
                        i42 = i41;
                    }
                }
                if ((i16 & 1533916891) != 306783378) {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i418 = i42;
                    String str17 = str4;
                    long j110 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar110 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var10 = (s0) objI1;
                    int i51116 = i16;
                    Function1<? super y3, Unit> function115 = function3;
                    androidx.compose.ui.a0 a0VarB10 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR10 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                    int i51117 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA10 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB10, fR10, j110, intercomTheme10.getShapes(c0VarR, i51117).m()), intercomTheme10.getShapes(c0VarR, i51117).m()), aVar110), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var10, aVar110, (p0) obj);
                        }
                    });
                    j40 j40VarJ10 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar111 = q0.f38131b;
                    int i51118 = iO;
                    int i51119 = iA;
                    boolean z218 = z16;
                    c0Var2 = c0VarR;
                    boolean z219 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function116 = function4;
                    u40.h(str17, onTextChanged, a0VarA10, z218, false, intercomTheme10.getTypography(c0VarR, i51117).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511110) {
                            if ((i511110 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function116, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511110) {
                            if ((i511110 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51118, i51119, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function115, null, null, null, 59, null), z14, i43, 0, null, intercomTheme10.getShapes(c0VarR, i51117).m(), j40VarJ10.c(((-1025) & 1) != 0 ? j40VarJ10.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ10.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ10.f29657c : intercomTheme10.getColors(c0VarR, i51117).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ10.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ10.f29659e : intercomTheme10.getColors(c0VarR, i51117).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ10.f29660f : intercomTheme10.getColors(c0VarR, i51117).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ10.f29661g : intercomTheme10.getColors(c0VarR, i51117).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ10.f29662h : intercomTheme10.getColors(c0VarR, i51117).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ10.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ10.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ10.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ10.f29666l : aVar111.s(), ((-1025) & 4096) != 0 ? j40VarJ10.f29667m : aVar111.s(), ((-1025) & 8192) != 0 ? j40VarJ10.f29668n : aVar111.s(), ((-1025) & 16384) != 0 ? j40VarJ10.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ10.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ10.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ10.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ10.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ10.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ10.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ10.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ10.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ10.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ10.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ10.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ10.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ10.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ10.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ10.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ10.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ10.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ10.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ10.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ10.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ10.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ10.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ10.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ10.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ10.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ10.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ10.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ10.Q : 0L), c0Var2, 817889280 | (i51116 & 14) | ((i51116 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i418 << 3) & 7168) | ((i418 << 21) & 234881024), ((i51116 << 3) & 29360128) | ((i51116 << 9) & 234881024), 0, 1604688);
                    str6 = str17;
                    z17 = z218;
                    function5 = function116;
                    z18 = z14;
                    i44 = i43;
                    i45 = i51118;
                    i46 = i51119;
                    function6 = function115;
                    str7 = str5;
                    z19 = z219;
                    q0Var4 = q0Var3;
                    f11 = fE;
                } else {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i419 = i42;
                    String str18 = str4;
                    long j111 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar112 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var11 = (s0) objI1;
                    int i511110 = i16;
                    Function1<? super y3, Unit> function117 = function3;
                    androidx.compose.ui.a0 a0VarB11 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR11 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    int i511111 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA11 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB11, fR11, j111, intercomTheme11.getShapes(c0VarR, i511111).m()), intercomTheme11.getShapes(c0VarR, i511111).m()), aVar112), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var11, aVar112, (p0) obj);
                        }
                    });
                    j40 j40VarJ11 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar113 = q0.f38131b;
                    int i511112 = iO;
                    int i511113 = iA;
                    boolean z2110 = z16;
                    c0Var2 = c0VarR;
                    boolean z2111 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function118 = function4;
                    u40.h(str18, onTextChanged, a0VarA11, z2110, false, intercomTheme11.getTypography(c0VarR, i511111).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511114) {
                            if ((i511114 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function118, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511114) {
                            if ((i511114 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i511112, i511113, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function117, null, null, null, 59, null), z14, i43, 0, null, intercomTheme11.getShapes(c0VarR, i511111).m(), j40VarJ11.c(((-1025) & 1) != 0 ? j40VarJ11.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ11.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ11.f29657c : intercomTheme11.getColors(c0VarR, i511111).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ11.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ11.f29659e : intercomTheme11.getColors(c0VarR, i511111).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ11.f29660f : intercomTheme11.getColors(c0VarR, i511111).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ11.f29661g : intercomTheme11.getColors(c0VarR, i511111).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ11.f29662h : intercomTheme11.getColors(c0VarR, i511111).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ11.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ11.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ11.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ11.f29666l : aVar113.s(), ((-1025) & 4096) != 0 ? j40VarJ11.f29667m : aVar113.s(), ((-1025) & 8192) != 0 ? j40VarJ11.f29668n : aVar113.s(), ((-1025) & 16384) != 0 ? j40VarJ11.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ11.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ11.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ11.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ11.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ11.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ11.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ11.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ11.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ11.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ11.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ11.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ11.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ11.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ11.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ11.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ11.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ11.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ11.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ11.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ11.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ11.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ11.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ11.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ11.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ11.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ11.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ11.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ11.Q : 0L), c0Var2, 817889280 | (i511110 & 14) | ((i511110 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i419 << 3) & 7168) | ((i419 << 21) & 234881024), ((i511110 << 3) & 29360128) | ((i511110 << 9) & 234881024), 0, 1604688);
                    str6 = str18;
                    z17 = z2110;
                    function5 = function118;
                    z18 = z14;
                    i44 = i43;
                    i45 = i511112;
                    i46 = i511113;
                    function6 = function117;
                    str7 = str5;
                    z19 = z2111;
                    q0Var4 = q0Var3;
                    f11 = fE;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 |= 100663296;
            i30 = i15 & 512;
            if (i30 != 0) {
                if ((i13 & 1879048192) == 0) {
                    if (c0VarR.K(i12)) {
                        i31 = 536870912;
                    } else {
                        i31 = 268435456;
                    }
                    i16 |= i31;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    if (c0VarR.G(z11)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                    if (c0VarR.k0(function2)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | a5.S0;
                } else if ((i14 & 896) == 0) {
                    i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                } else {
                    i39 = i37;
                }
                i40 = i15 & 8192;
                if (i40 != 0) {
                    i42 = i39 | 3072;
                } else {
                    i41 = i39;
                    if ((i14 & 7168) == 0) {
                        i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                    } else {
                        i42 = i41;
                    }
                }
                if ((i16 & 1533916891) != 306783378) {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i4110 = i42;
                    String str19 = str4;
                    long j112 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar114 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var12 = (s0) objI1;
                    int i511114 = i16;
                    Function1<? super y3, Unit> function119 = function3;
                    androidx.compose.ui.a0 a0VarB12 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR12 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    int i511115 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA12 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB12, fR12, j112, intercomTheme12.getShapes(c0VarR, i511115).m()), intercomTheme12.getShapes(c0VarR, i511115).m()), aVar114), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var12, aVar114, (p0) obj);
                        }
                    });
                    j40 j40VarJ12 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar115 = q0.f38131b;
                    int i511116 = iO;
                    int i511117 = iA;
                    boolean z2112 = z16;
                    c0Var2 = c0VarR;
                    boolean z2113 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1110 = function4;
                    u40.h(str19, onTextChanged, a0VarA12, z2112, false, intercomTheme12.getTypography(c0VarR, i511115).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511118) {
                            if ((i511118 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function1110, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511118) {
                            if ((i511118 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i511116, i511117, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function119, null, null, null, 59, null), z14, i43, 0, null, intercomTheme12.getShapes(c0VarR, i511115).m(), j40VarJ12.c(((-1025) & 1) != 0 ? j40VarJ12.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ12.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ12.f29657c : intercomTheme12.getColors(c0VarR, i511115).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ12.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ12.f29659e : intercomTheme12.getColors(c0VarR, i511115).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ12.f29660f : intercomTheme12.getColors(c0VarR, i511115).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ12.f29661g : intercomTheme12.getColors(c0VarR, i511115).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ12.f29662h : intercomTheme12.getColors(c0VarR, i511115).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ12.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ12.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ12.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ12.f29666l : aVar115.s(), ((-1025) & 4096) != 0 ? j40VarJ12.f29667m : aVar115.s(), ((-1025) & 8192) != 0 ? j40VarJ12.f29668n : aVar115.s(), ((-1025) & 16384) != 0 ? j40VarJ12.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ12.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ12.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ12.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ12.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ12.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ12.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ12.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ12.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ12.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ12.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ12.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ12.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ12.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ12.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ12.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ12.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ12.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ12.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ12.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ12.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ12.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ12.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ12.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ12.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ12.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ12.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ12.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ12.Q : 0L), c0Var2, 817889280 | (i511114 & 14) | ((i511114 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4110 << 3) & 7168) | ((i4110 << 21) & 234881024), ((i511114 << 3) & 29360128) | ((i511114 << 9) & 234881024), 0, 1604688);
                    str6 = str19;
                    z17 = z2112;
                    function5 = function1110;
                    z18 = z14;
                    i44 = i43;
                    i45 = i511116;
                    i46 = i511117;
                    function6 = function119;
                    str7 = str5;
                    z19 = z2113;
                    q0Var4 = q0Var3;
                    f11 = fE;
                } else {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i4111 = i42;
                    String str110 = str4;
                    long j113 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar116 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var13 = (s0) objI1;
                    int i511118 = i16;
                    Function1<? super y3, Unit> function1111 = function3;
                    androidx.compose.ui.a0 a0VarB13 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR13 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    int i511119 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA13 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB13, fR13, j113, intercomTheme13.getShapes(c0VarR, i511119).m()), intercomTheme13.getShapes(c0VarR, i511119).m()), aVar116), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var13, aVar116, (p0) obj);
                        }
                    });
                    j40 j40VarJ13 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar117 = q0.f38131b;
                    int i5111110 = iO;
                    int i5111111 = iA;
                    boolean z2114 = z16;
                    c0Var2 = c0VarR;
                    boolean z2115 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1112 = function4;
                    u40.h(str110, onTextChanged, a0VarA13, z2114, false, intercomTheme13.getTypography(c0VarR, i511119).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111112) {
                            if ((i5111112 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function1112, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111112) {
                            if ((i5111112 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5111110, i5111111, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1111, null, null, null, 59, null), z14, i43, 0, null, intercomTheme13.getShapes(c0VarR, i511119).m(), j40VarJ13.c(((-1025) & 1) != 0 ? j40VarJ13.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ13.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ13.f29657c : intercomTheme13.getColors(c0VarR, i511119).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ13.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ13.f29659e : intercomTheme13.getColors(c0VarR, i511119).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ13.f29660f : intercomTheme13.getColors(c0VarR, i511119).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ13.f29661g : intercomTheme13.getColors(c0VarR, i511119).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ13.f29662h : intercomTheme13.getColors(c0VarR, i511119).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ13.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ13.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ13.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ13.f29666l : aVar117.s(), ((-1025) & 4096) != 0 ? j40VarJ13.f29667m : aVar117.s(), ((-1025) & 8192) != 0 ? j40VarJ13.f29668n : aVar117.s(), ((-1025) & 16384) != 0 ? j40VarJ13.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ13.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ13.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ13.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ13.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ13.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ13.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ13.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ13.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ13.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ13.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ13.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ13.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ13.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ13.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ13.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ13.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ13.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ13.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ13.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ13.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ13.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ13.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ13.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ13.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ13.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ13.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ13.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ13.Q : 0L), c0Var2, 817889280 | (i511118 & 14) | ((i511118 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4111 << 3) & 7168) | ((i4111 << 21) & 234881024), ((i511118 << 3) & 29360128) | ((i511118 << 9) & 234881024), 0, 1604688);
                    str6 = str110;
                    z17 = z2114;
                    function5 = function1112;
                    z18 = z14;
                    i44 = i43;
                    i45 = i5111110;
                    i46 = i5111111;
                    function6 = function1111;
                    str7 = str5;
                    z19 = z2115;
                    q0Var4 = q0Var3;
                    f11 = fE;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 |= 805306368;
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                if (c0VarR.G(z11)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                if (c0VarR.k0(function2)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | a5.S0;
            } else if ((i14 & 896) == 0) {
                i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
            } else {
                i39 = i37;
            }
            i40 = i15 & 8192;
            if (i40 != 0) {
                i42 = i39 | 3072;
            } else {
                i41 = i39;
                if ((i14 & 7168) == 0) {
                    i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                } else {
                    i42 = i41;
                }
            }
            if ((i16 & 1533916891) != 306783378) {
                if (i47 != 0) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                if (i48 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    q0Var3 = null;
                } else {
                    q0Var3 = q0Var2;
                }
                if (i21 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i22;
                }
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i26 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function3 = function1;
                }
                if (i28 != 0) {
                    iO = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iO = i11;
                }
                if (i30 != 0) {
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                } else {
                    iA = i12;
                }
                if (i32 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i35 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i38 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i40 != 0) {
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                } else {
                    fE = f10;
                }
                c0VarR.E(-652105429);
                if (q0Var3 == null) {
                    jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM = q0Var3.M();
                }
                int i4112 = i42;
                String str111 = str4;
                long j114 = jM;
                c0VarR.A();
                c0VarR.E(-652099794);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar118 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var14 = (s0) objI1;
                int i5111112 = i16;
                Function1<? super y3, Unit> function1113 = function3;
                androidx.compose.ui.a0 a0VarB14 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                float fR14 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                int i5111113 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarA14 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB14, fR14, j114, intercomTheme14.getShapes(c0VarR, i5111113).m()), intercomTheme14.getShapes(c0VarR, i5111113).m()), aVar118), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var14, aVar118, (p0) obj);
                    }
                });
                j40 j40VarJ14 = n40.f30917a.j(c0VarR, 6);
                q0.a aVar119 = q0.f38131b;
                int i5111114 = iO;
                int i5111115 = iA;
                boolean z2116 = z16;
                c0Var2 = c0VarR;
                boolean z2117 = z15;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1114 = function4;
                u40.h(str111, onTextChanged, a0VarA14, z2116, false, intercomTheme14.getTypography(c0VarR, i5111113).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111116) {
                        if ((i5111116 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), function1114, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111116) {
                        if ((i5111116 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else if (z15) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5111114, i5111115, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1113, null, null, null, 59, null), z14, i43, 0, null, intercomTheme14.getShapes(c0VarR, i5111113).m(), j40VarJ14.c(((-1025) & 1) != 0 ? j40VarJ14.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ14.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ14.f29657c : intercomTheme14.getColors(c0VarR, i5111113).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ14.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ14.f29659e : intercomTheme14.getColors(c0VarR, i5111113).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ14.f29660f : intercomTheme14.getColors(c0VarR, i5111113).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ14.f29661g : intercomTheme14.getColors(c0VarR, i5111113).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ14.f29662h : intercomTheme14.getColors(c0VarR, i5111113).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ14.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ14.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ14.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ14.f29666l : aVar119.s(), ((-1025) & 4096) != 0 ? j40VarJ14.f29667m : aVar119.s(), ((-1025) & 8192) != 0 ? j40VarJ14.f29668n : aVar119.s(), ((-1025) & 16384) != 0 ? j40VarJ14.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ14.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ14.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ14.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ14.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ14.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ14.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ14.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ14.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ14.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ14.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ14.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ14.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ14.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ14.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ14.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ14.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ14.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ14.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ14.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ14.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ14.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ14.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ14.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ14.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ14.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ14.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ14.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ14.Q : 0L), c0Var2, 817889280 | (i5111112 & 14) | ((i5111112 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4112 << 3) & 7168) | ((i4112 << 21) & 234881024), ((i5111112 << 3) & 29360128) | ((i5111112 << 9) & 234881024), 0, 1604688);
                str6 = str111;
                z17 = z2116;
                function5 = function1114;
                z18 = z14;
                i44 = i43;
                i45 = i5111114;
                i46 = i5111115;
                function6 = function1113;
                str7 = str5;
                z19 = z2117;
                q0Var4 = q0Var3;
                f11 = fE;
            } else {
                if (i47 != 0) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                if (i48 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    q0Var3 = null;
                } else {
                    q0Var3 = q0Var2;
                }
                if (i21 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i22;
                }
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i26 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function3 = function1;
                }
                if (i28 != 0) {
                    iO = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iO = i11;
                }
                if (i30 != 0) {
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                } else {
                    iA = i12;
                }
                if (i32 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i35 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i38 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i40 != 0) {
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                } else {
                    fE = f10;
                }
                c0VarR.E(-652105429);
                if (q0Var3 == null) {
                    jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM = q0Var3.M();
                }
                int i4113 = i42;
                String str112 = str4;
                long j115 = jM;
                c0VarR.A();
                c0VarR.E(-652099794);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar1110 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var15 = (s0) objI1;
                int i5111116 = i16;
                Function1<? super y3, Unit> function1115 = function3;
                androidx.compose.ui.a0 a0VarB15 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                float fR15 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                int i5111117 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarA15 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB15, fR15, j115, intercomTheme15.getShapes(c0VarR, i5111117).m()), intercomTheme15.getShapes(c0VarR, i5111117).m()), aVar1110), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var15, aVar1110, (p0) obj);
                    }
                });
                j40 j40VarJ15 = n40.f30917a.j(c0VarR, 6);
                q0.a aVar1111 = q0.f38131b;
                int i5111118 = iO;
                int i5111119 = iA;
                boolean z2118 = z16;
                c0Var2 = c0VarR;
                boolean z2119 = z15;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1116 = function4;
                u40.h(str112, onTextChanged, a0VarA15, z2118, false, intercomTheme15.getTypography(c0VarR, i5111117).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111110) {
                        if ((i51111110 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), function1116, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111110) {
                        if ((i51111110 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else if (z15) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5111118, i5111119, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1115, null, null, null, 59, null), z14, i43, 0, null, intercomTheme15.getShapes(c0VarR, i5111117).m(), j40VarJ15.c(((-1025) & 1) != 0 ? j40VarJ15.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ15.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ15.f29657c : intercomTheme15.getColors(c0VarR, i5111117).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ15.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ15.f29659e : intercomTheme15.getColors(c0VarR, i5111117).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ15.f29660f : intercomTheme15.getColors(c0VarR, i5111117).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ15.f29661g : intercomTheme15.getColors(c0VarR, i5111117).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ15.f29662h : intercomTheme15.getColors(c0VarR, i5111117).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ15.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ15.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ15.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ15.f29666l : aVar1111.s(), ((-1025) & 4096) != 0 ? j40VarJ15.f29667m : aVar1111.s(), ((-1025) & 8192) != 0 ? j40VarJ15.f29668n : aVar1111.s(), ((-1025) & 16384) != 0 ? j40VarJ15.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ15.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ15.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ15.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ15.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ15.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ15.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ15.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ15.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ15.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ15.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ15.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ15.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ15.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ15.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ15.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ15.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ15.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ15.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ15.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ15.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ15.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ15.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ15.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ15.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ15.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ15.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ15.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ15.Q : 0L), c0Var2, 817889280 | (i5111116 & 14) | ((i5111116 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4113 << 3) & 7168) | ((i4113 << 21) & 234881024), ((i5111116 << 3) & 29360128) | ((i5111116 << 9) & 234881024), 0, 1604688);
                str6 = str112;
                z17 = z2118;
                function5 = function1116;
                z18 = z14;
                i44 = i43;
                i45 = i5111118;
                i46 = i5111119;
                function6 = function1115;
                str7 = str5;
                z19 = z2119;
                q0Var4 = q0Var3;
                f11 = fE;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 48;
        str3 = str2;
        if ((i15 & 4) != 0) {
            i16 |= a5.S0;
        } else if ((i13 & 896) == 0) {
            if (c0VarR.k0(onTextChanged)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i16 |= i17;
        }
        i18 = i15 & 8;
        if (i18 != 0) {
            if ((i13 & 7168) == 0) {
                q0Var2 = q0Var;
                if (c0VarR.D(q0Var2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i15 & 16) != 0) {
                i16 |= 24576;
            } else if ((i13 & 57344) == 0) {
                if (c0VarR.L(j10)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i16 |= i20;
            }
            i21 = i15 & 32;
            if (i21 != 0) {
                i16 |= androidx.profileinstaller.n.c.f73814m;
                i22 = i10;
            } else {
                i22 = i10;
                if ((i13 & 458752) == 0) {
                    if (c0VarR.K(i22)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i16 |= i23;
                }
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                i16 |= 1572864;
                z13 = z10;
            } else {
                z13 = z10;
                if ((i13 & 3670016) == 0) {
                    if (c0VarR.G(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i16 |= i25;
                }
            }
            i26 = i15 & 128;
            if (i26 != 0) {
                i16 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (c0VarR.k0(function1)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            i28 = i15 & 256;
            if (i28 != 0) {
                if ((i13 & 234881024) == 0) {
                    if (c0VarR.K(i11)) {
                        i29 = 67108864;
                    } else {
                        i29 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i16 |= i29;
                }
                i30 = i15 & 512;
                if (i30 != 0) {
                    if ((i13 & 1879048192) == 0) {
                        if (c0VarR.K(i12)) {
                            i31 = 536870912;
                        } else {
                            i31 = 268435456;
                        }
                        i16 |= i31;
                    }
                    i32 = i15 & 1024;
                    if (i32 != 0) {
                        i33 = i14 | 6;
                    } else if ((i14 & 14) == 0) {
                        if (c0VarR.G(z11)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i14 | i34;
                    } else {
                        i33 = i14;
                    }
                    i35 = i15 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                        if (c0VarR.k0(function2)) {
                            i36 = 32;
                        } else {
                            i36 = 16;
                        }
                        i33 |= i36;
                    }
                    i37 = i33;
                    i38 = i15 & 4096;
                    if (i38 != 0) {
                        i39 = i37 | a5.S0;
                    } else if ((i14 & 896) == 0) {
                        i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                    } else {
                        i39 = i37;
                    }
                    i40 = i15 & 8192;
                    if (i40 != 0) {
                        i42 = i39 | 3072;
                    } else {
                        i41 = i39;
                        if ((i14 & 7168) == 0) {
                            i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                        } else {
                            i42 = i41;
                        }
                    }
                    if ((i16 & 1533916891) != 306783378) {
                        if (i47 != 0) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        if (i48 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            q0Var3 = null;
                        } else {
                            q0Var3 = q0Var2;
                        }
                        if (i21 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i22;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        } else {
                            z14 = z13;
                        }
                        if (i26 != 0) {
                            function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        if (i28 != 0) {
                            iO = androidx.compose.ui.text.input.b0.f41811b.o();
                        } else {
                            iO = i11;
                        }
                        if (i30 != 0) {
                            iA = androidx.compose.ui.text.input.t.f41944b.a();
                        } else {
                            iA = i12;
                        }
                        if (i32 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i35 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i40 != 0) {
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                        } else {
                            fE = f10;
                        }
                        c0VarR.E(-652105429);
                        if (q0Var3 == null) {
                            jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM = q0Var3.M();
                        }
                        int i4114 = i42;
                        String str113 = str4;
                        long j116 = jM;
                        c0VarR.A();
                        c0VarR.E(-652099794);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.foundation.relocation.d.a();
                            c0VarR.Y(objI0);
                        }
                        final androidx.compose.foundation.relocation.a aVar1112 = (androidx.compose.foundation.relocation.a) objI0;
                        c0VarR.A();
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        final s0 s0Var16 = (s0) objI1;
                        int i51111110 = i16;
                        Function1<? super y3, Unit> function1117 = function3;
                        androidx.compose.ui.a0 a0VarB16 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                        float fR16 = androidx.compose.ui.unit.h.r(1);
                        IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                        int i51111111 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarA16 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB16, fR16, j116, intercomTheme16.getShapes(c0VarR, i51111111).m()), intercomTheme16.getShapes(c0VarR, i51111111).m()), aVar1112), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var16, aVar1112, (p0) obj);
                            }
                        });
                        j40 j40VarJ16 = n40.f30917a.j(c0VarR, 6);
                        q0.a aVar1113 = q0.f38131b;
                        int i51111112 = iO;
                        int i51111113 = iA;
                        boolean z21110 = z16;
                        c0Var2 = c0VarR;
                        boolean z21111 = z15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1118 = function4;
                        u40.h(str113, onTextChanged, a0VarA16, z21110, false, intercomTheme16.getTypography(c0VarR, i51111111).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111114) {
                                if ((i51111114 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else {
                                    q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                }
                            }
                        }, c0VarR, 54), function1118, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111114) {
                                if ((i51111114 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else if (z15) {
                                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                }
                            }
                        }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51111112, i51111113, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1117, null, null, null, 59, null), z14, i43, 0, null, intercomTheme16.getShapes(c0VarR, i51111111).m(), j40VarJ16.c(((-1025) & 1) != 0 ? j40VarJ16.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ16.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ16.f29657c : intercomTheme16.getColors(c0VarR, i51111111).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ16.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ16.f29659e : intercomTheme16.getColors(c0VarR, i51111111).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ16.f29660f : intercomTheme16.getColors(c0VarR, i51111111).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ16.f29661g : intercomTheme16.getColors(c0VarR, i51111111).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ16.f29662h : intercomTheme16.getColors(c0VarR, i51111111).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ16.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ16.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ16.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ16.f29666l : aVar1113.s(), ((-1025) & 4096) != 0 ? j40VarJ16.f29667m : aVar1113.s(), ((-1025) & 8192) != 0 ? j40VarJ16.f29668n : aVar1113.s(), ((-1025) & 16384) != 0 ? j40VarJ16.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ16.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ16.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ16.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ16.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ16.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ16.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ16.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ16.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ16.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ16.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ16.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ16.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ16.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ16.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ16.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ16.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ16.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ16.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ16.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ16.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ16.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ16.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ16.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ16.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ16.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ16.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ16.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ16.Q : 0L), c0Var2, 817889280 | (i51111110 & 14) | ((i51111110 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4114 << 3) & 7168) | ((i4114 << 21) & 234881024), ((i51111110 << 3) & 29360128) | ((i51111110 << 9) & 234881024), 0, 1604688);
                        str6 = str113;
                        z17 = z21110;
                        function5 = function1118;
                        z18 = z14;
                        i44 = i43;
                        i45 = i51111112;
                        i46 = i51111113;
                        function6 = function1117;
                        str7 = str5;
                        z19 = z21111;
                        q0Var4 = q0Var3;
                        f11 = fE;
                    } else {
                        if (i47 != 0) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        if (i48 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i18 != 0) {
                            q0Var3 = null;
                        } else {
                            q0Var3 = q0Var2;
                        }
                        if (i21 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i22;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        } else {
                            z14 = z13;
                        }
                        if (i26 != 0) {
                            function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        if (i28 != 0) {
                            iO = androidx.compose.ui.text.input.b0.f41811b.o();
                        } else {
                            iO = i11;
                        }
                        if (i30 != 0) {
                            iA = androidx.compose.ui.text.input.t.f41944b.a();
                        } else {
                            iA = i12;
                        }
                        if (i32 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i35 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i38 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i40 != 0) {
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                        } else {
                            fE = f10;
                        }
                        c0VarR.E(-652105429);
                        if (q0Var3 == null) {
                            jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM = q0Var3.M();
                        }
                        int i4115 = i42;
                        String str114 = str4;
                        long j117 = jM;
                        c0VarR.A();
                        c0VarR.E(-652099794);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.foundation.relocation.d.a();
                            c0VarR.Y(objI0);
                        }
                        final androidx.compose.foundation.relocation.a aVar1114 = (androidx.compose.foundation.relocation.a) objI0;
                        c0VarR.A();
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        final s0 s0Var17 = (s0) objI1;
                        int i51111114 = i16;
                        Function1<? super y3, Unit> function1119 = function3;
                        androidx.compose.ui.a0 a0VarB17 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                        float fR17 = androidx.compose.ui.unit.h.r(1);
                        IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                        int i51111115 = IntercomTheme.$stable;
                        androidx.compose.ui.a0 a0VarA17 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB17, fR17, j117, intercomTheme17.getShapes(c0VarR, i51111115).m()), intercomTheme17.getShapes(c0VarR, i51111115).m()), aVar1114), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var17, aVar1114, (p0) obj);
                            }
                        });
                        j40 j40VarJ17 = n40.f30917a.j(c0VarR, 6);
                        q0.a aVar1115 = q0.f38131b;
                        int i51111116 = iO;
                        int i51111117 = iA;
                        boolean z21112 = z16;
                        c0Var2 = c0VarR;
                        boolean z21113 = z15;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11110 = function4;
                        u40.h(str114, onTextChanged, a0VarA17, z21112, false, intercomTheme17.getTypography(c0VarR, i51111115).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111118) {
                                if ((i51111118 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else {
                                    q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                                }
                            }
                        }, c0VarR, 54), function11110, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                                invoke(c0Var3, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111118) {
                                if ((i51111118 & 11) == 2 && c0Var3.d()) {
                                    c0Var3.u();
                                } else if (z15) {
                                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                                }
                            }
                        }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51111116, i51111117, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1119, null, null, null, 59, null), z14, i43, 0, null, intercomTheme17.getShapes(c0VarR, i51111115).m(), j40VarJ17.c(((-1025) & 1) != 0 ? j40VarJ17.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ17.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ17.f29657c : intercomTheme17.getColors(c0VarR, i51111115).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ17.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ17.f29659e : intercomTheme17.getColors(c0VarR, i51111115).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ17.f29660f : intercomTheme17.getColors(c0VarR, i51111115).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ17.f29661g : intercomTheme17.getColors(c0VarR, i51111115).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ17.f29662h : intercomTheme17.getColors(c0VarR, i51111115).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ17.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ17.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ17.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ17.f29666l : aVar1115.s(), ((-1025) & 4096) != 0 ? j40VarJ17.f29667m : aVar1115.s(), ((-1025) & 8192) != 0 ? j40VarJ17.f29668n : aVar1115.s(), ((-1025) & 16384) != 0 ? j40VarJ17.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ17.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ17.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ17.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ17.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ17.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ17.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ17.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ17.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ17.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ17.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ17.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ17.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ17.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ17.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ17.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ17.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ17.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ17.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ17.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ17.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ17.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ17.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ17.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ17.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ17.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ17.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ17.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ17.Q : 0L), c0Var2, 817889280 | (i51111114 & 14) | ((i51111114 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4115 << 3) & 7168) | ((i4115 << 21) & 234881024), ((i51111114 << 3) & 29360128) | ((i51111114 << 9) & 234881024), 0, 1604688);
                        str6 = str114;
                        z17 = z21112;
                        function5 = function11110;
                        z18 = z14;
                        i44 = i43;
                        i45 = i51111116;
                        i46 = i51111117;
                        function6 = function1119;
                        str7 = str5;
                        z19 = z21113;
                        q0Var4 = q0Var3;
                        f11 = fE;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i16 |= 805306368;
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    if (c0VarR.G(z11)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                    if (c0VarR.k0(function2)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | a5.S0;
                } else if ((i14 & 896) == 0) {
                    i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                } else {
                    i39 = i37;
                }
                i40 = i15 & 8192;
                if (i40 != 0) {
                    i42 = i39 | 3072;
                } else {
                    i41 = i39;
                    if ((i14 & 7168) == 0) {
                        i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                    } else {
                        i42 = i41;
                    }
                }
                if ((i16 & 1533916891) != 306783378) {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i4116 = i42;
                    String str115 = str4;
                    long j118 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar1116 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var18 = (s0) objI1;
                    int i51111118 = i16;
                    Function1<? super y3, Unit> function11111 = function3;
                    androidx.compose.ui.a0 a0VarB18 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR18 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                    int i51111119 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA18 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB18, fR18, j118, intercomTheme18.getShapes(c0VarR, i51111119).m()), intercomTheme18.getShapes(c0VarR, i51111119).m()), aVar1116), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var18, aVar1116, (p0) obj);
                        }
                    });
                    j40 j40VarJ18 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar1117 = q0.f38131b;
                    int i511111110 = iO;
                    int i511111111 = iA;
                    boolean z21114 = z16;
                    c0Var2 = c0VarR;
                    boolean z21115 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11112 = function4;
                    u40.h(str115, onTextChanged, a0VarA18, z21114, false, intercomTheme18.getTypography(c0VarR, i51111119).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111112) {
                            if ((i511111112 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function11112, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111112) {
                            if ((i511111112 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i511111110, i511111111, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function11111, null, null, null, 59, null), z14, i43, 0, null, intercomTheme18.getShapes(c0VarR, i51111119).m(), j40VarJ18.c(((-1025) & 1) != 0 ? j40VarJ18.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ18.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ18.f29657c : intercomTheme18.getColors(c0VarR, i51111119).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ18.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ18.f29659e : intercomTheme18.getColors(c0VarR, i51111119).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ18.f29660f : intercomTheme18.getColors(c0VarR, i51111119).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ18.f29661g : intercomTheme18.getColors(c0VarR, i51111119).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ18.f29662h : intercomTheme18.getColors(c0VarR, i51111119).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ18.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ18.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ18.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ18.f29666l : aVar1117.s(), ((-1025) & 4096) != 0 ? j40VarJ18.f29667m : aVar1117.s(), ((-1025) & 8192) != 0 ? j40VarJ18.f29668n : aVar1117.s(), ((-1025) & 16384) != 0 ? j40VarJ18.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ18.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ18.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ18.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ18.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ18.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ18.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ18.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ18.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ18.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ18.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ18.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ18.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ18.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ18.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ18.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ18.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ18.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ18.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ18.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ18.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ18.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ18.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ18.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ18.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ18.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ18.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ18.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ18.Q : 0L), c0Var2, 817889280 | (i51111118 & 14) | ((i51111118 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4116 << 3) & 7168) | ((i4116 << 21) & 234881024), ((i51111118 << 3) & 29360128) | ((i51111118 << 9) & 234881024), 0, 1604688);
                    str6 = str115;
                    z17 = z21114;
                    function5 = function11112;
                    z18 = z14;
                    i44 = i43;
                    i45 = i511111110;
                    i46 = i511111111;
                    function6 = function11111;
                    str7 = str5;
                    z19 = z21115;
                    q0Var4 = q0Var3;
                    f11 = fE;
                } else {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i4117 = i42;
                    String str116 = str4;
                    long j119 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar1118 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var19 = (s0) objI1;
                    int i511111112 = i16;
                    Function1<? super y3, Unit> function11113 = function3;
                    androidx.compose.ui.a0 a0VarB19 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR19 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                    int i511111113 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA19 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB19, fR19, j119, intercomTheme19.getShapes(c0VarR, i511111113).m()), intercomTheme19.getShapes(c0VarR, i511111113).m()), aVar1118), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var19, aVar1118, (p0) obj);
                        }
                    });
                    j40 j40VarJ19 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar1119 = q0.f38131b;
                    int i511111114 = iO;
                    int i511111115 = iA;
                    boolean z21116 = z16;
                    c0Var2 = c0VarR;
                    boolean z21117 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11114 = function4;
                    u40.h(str116, onTextChanged, a0VarA19, z21116, false, intercomTheme19.getTypography(c0VarR, i511111113).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111116) {
                            if ((i511111116 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function11114, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111116) {
                            if ((i511111116 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i511111114, i511111115, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function11113, null, null, null, 59, null), z14, i43, 0, null, intercomTheme19.getShapes(c0VarR, i511111113).m(), j40VarJ19.c(((-1025) & 1) != 0 ? j40VarJ19.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ19.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ19.f29657c : intercomTheme19.getColors(c0VarR, i511111113).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ19.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ19.f29659e : intercomTheme19.getColors(c0VarR, i511111113).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ19.f29660f : intercomTheme19.getColors(c0VarR, i511111113).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ19.f29661g : intercomTheme19.getColors(c0VarR, i511111113).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ19.f29662h : intercomTheme19.getColors(c0VarR, i511111113).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ19.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ19.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ19.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ19.f29666l : aVar1119.s(), ((-1025) & 4096) != 0 ? j40VarJ19.f29667m : aVar1119.s(), ((-1025) & 8192) != 0 ? j40VarJ19.f29668n : aVar1119.s(), ((-1025) & 16384) != 0 ? j40VarJ19.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ19.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ19.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ19.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ19.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ19.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ19.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ19.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ19.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ19.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ19.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ19.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ19.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ19.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ19.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ19.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ19.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ19.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ19.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ19.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ19.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ19.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ19.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ19.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ19.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ19.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ19.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ19.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ19.Q : 0L), c0Var2, 817889280 | (i511111112 & 14) | ((i511111112 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4117 << 3) & 7168) | ((i4117 << 21) & 234881024), ((i511111112 << 3) & 29360128) | ((i511111112 << 9) & 234881024), 0, 1604688);
                    str6 = str116;
                    z17 = z21116;
                    function5 = function11114;
                    z18 = z14;
                    i44 = i43;
                    i45 = i511111114;
                    i46 = i511111115;
                    function6 = function11113;
                    str7 = str5;
                    z19 = z21117;
                    q0Var4 = q0Var3;
                    f11 = fE;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 |= 100663296;
            i30 = i15 & 512;
            if (i30 != 0) {
                if ((i13 & 1879048192) == 0) {
                    if (c0VarR.K(i12)) {
                        i31 = 536870912;
                    } else {
                        i31 = 268435456;
                    }
                    i16 |= i31;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    if (c0VarR.G(z11)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                    if (c0VarR.k0(function2)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | a5.S0;
                } else if ((i14 & 896) == 0) {
                    i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                } else {
                    i39 = i37;
                }
                i40 = i15 & 8192;
                if (i40 != 0) {
                    i42 = i39 | 3072;
                } else {
                    i41 = i39;
                    if ((i14 & 7168) == 0) {
                        i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                    } else {
                        i42 = i41;
                    }
                }
                if ((i16 & 1533916891) != 306783378) {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i4118 = i42;
                    String str117 = str4;
                    long j1110 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar11110 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var110 = (s0) objI1;
                    int i511111116 = i16;
                    Function1<? super y3, Unit> function11115 = function3;
                    androidx.compose.ui.a0 a0VarB110 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR110 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                    int i511111117 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA110 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB110, fR110, j1110, intercomTheme110.getShapes(c0VarR, i511111117).m()), intercomTheme110.getShapes(c0VarR, i511111117).m()), aVar11110), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var110, aVar11110, (p0) obj);
                        }
                    });
                    j40 j40VarJ110 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar11111 = q0.f38131b;
                    int i511111118 = iO;
                    int i511111119 = iA;
                    boolean z21118 = z16;
                    c0Var2 = c0VarR;
                    boolean z21119 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11116 = function4;
                    u40.h(str117, onTextChanged, a0VarA110, z21118, false, intercomTheme110.getTypography(c0VarR, i511111117).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111110) {
                            if ((i5111111110 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function11116, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111110) {
                            if ((i5111111110 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i511111118, i511111119, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function11115, null, null, null, 59, null), z14, i43, 0, null, intercomTheme110.getShapes(c0VarR, i511111117).m(), j40VarJ110.c(((-1025) & 1) != 0 ? j40VarJ110.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ110.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ110.f29657c : intercomTheme110.getColors(c0VarR, i511111117).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ110.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ110.f29659e : intercomTheme110.getColors(c0VarR, i511111117).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ110.f29660f : intercomTheme110.getColors(c0VarR, i511111117).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ110.f29661g : intercomTheme110.getColors(c0VarR, i511111117).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ110.f29662h : intercomTheme110.getColors(c0VarR, i511111117).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ110.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ110.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ110.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ110.f29666l : aVar11111.s(), ((-1025) & 4096) != 0 ? j40VarJ110.f29667m : aVar11111.s(), ((-1025) & 8192) != 0 ? j40VarJ110.f29668n : aVar11111.s(), ((-1025) & 16384) != 0 ? j40VarJ110.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ110.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ110.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ110.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ110.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ110.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ110.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ110.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ110.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ110.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ110.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ110.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ110.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ110.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ110.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ110.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ110.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ110.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ110.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ110.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ110.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ110.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ110.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ110.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ110.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ110.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ110.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ110.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ110.Q : 0L), c0Var2, 817889280 | (i511111116 & 14) | ((i511111116 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4118 << 3) & 7168) | ((i4118 << 21) & 234881024), ((i511111116 << 3) & 29360128) | ((i511111116 << 9) & 234881024), 0, 1604688);
                    str6 = str117;
                    z17 = z21118;
                    function5 = function11116;
                    z18 = z14;
                    i44 = i43;
                    i45 = i511111118;
                    i46 = i511111119;
                    function6 = function11115;
                    str7 = str5;
                    z19 = z21119;
                    q0Var4 = q0Var3;
                    f11 = fE;
                } else {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i4119 = i42;
                    String str118 = str4;
                    long j1111 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar11112 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var111 = (s0) objI1;
                    int i5111111110 = i16;
                    Function1<? super y3, Unit> function11117 = function3;
                    androidx.compose.ui.a0 a0VarB111 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR111 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                    int i5111111111 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA111 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB111, fR111, j1111, intercomTheme111.getShapes(c0VarR, i5111111111).m()), intercomTheme111.getShapes(c0VarR, i5111111111).m()), aVar11112), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var111, aVar11112, (p0) obj);
                        }
                    });
                    j40 j40VarJ111 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar11113 = q0.f38131b;
                    int i5111111112 = iO;
                    int i5111111113 = iA;
                    boolean z211110 = z16;
                    c0Var2 = c0VarR;
                    boolean z211111 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11118 = function4;
                    u40.h(str118, onTextChanged, a0VarA111, z211110, false, intercomTheme111.getTypography(c0VarR, i5111111111).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111114) {
                            if ((i5111111114 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function11118, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111114) {
                            if ((i5111111114 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5111111112, i5111111113, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function11117, null, null, null, 59, null), z14, i43, 0, null, intercomTheme111.getShapes(c0VarR, i5111111111).m(), j40VarJ111.c(((-1025) & 1) != 0 ? j40VarJ111.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ111.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ111.f29657c : intercomTheme111.getColors(c0VarR, i5111111111).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ111.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ111.f29659e : intercomTheme111.getColors(c0VarR, i5111111111).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ111.f29660f : intercomTheme111.getColors(c0VarR, i5111111111).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ111.f29661g : intercomTheme111.getColors(c0VarR, i5111111111).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ111.f29662h : intercomTheme111.getColors(c0VarR, i5111111111).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ111.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ111.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ111.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ111.f29666l : aVar11113.s(), ((-1025) & 4096) != 0 ? j40VarJ111.f29667m : aVar11113.s(), ((-1025) & 8192) != 0 ? j40VarJ111.f29668n : aVar11113.s(), ((-1025) & 16384) != 0 ? j40VarJ111.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ111.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ111.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ111.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ111.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ111.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ111.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ111.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ111.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ111.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ111.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ111.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ111.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ111.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ111.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ111.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ111.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ111.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ111.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ111.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ111.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ111.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ111.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ111.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ111.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ111.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ111.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ111.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ111.Q : 0L), c0Var2, 817889280 | (i5111111110 & 14) | ((i5111111110 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i4119 << 3) & 7168) | ((i4119 << 21) & 234881024), ((i5111111110 << 3) & 29360128) | ((i5111111110 << 9) & 234881024), 0, 1604688);
                    str6 = str118;
                    z17 = z211110;
                    function5 = function11118;
                    z18 = z14;
                    i44 = i43;
                    i45 = i5111111112;
                    i46 = i5111111113;
                    function6 = function11117;
                    str7 = str5;
                    z19 = z211111;
                    q0Var4 = q0Var3;
                    f11 = fE;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 |= 805306368;
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                if (c0VarR.G(z11)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                if (c0VarR.k0(function2)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | a5.S0;
            } else if ((i14 & 896) == 0) {
                i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
            } else {
                i39 = i37;
            }
            i40 = i15 & 8192;
            if (i40 != 0) {
                i42 = i39 | 3072;
            } else {
                i41 = i39;
                if ((i14 & 7168) == 0) {
                    i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                } else {
                    i42 = i41;
                }
            }
            if ((i16 & 1533916891) != 306783378) {
                if (i47 != 0) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                if (i48 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    q0Var3 = null;
                } else {
                    q0Var3 = q0Var2;
                }
                if (i21 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i22;
                }
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i26 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function3 = function1;
                }
                if (i28 != 0) {
                    iO = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iO = i11;
                }
                if (i30 != 0) {
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                } else {
                    iA = i12;
                }
                if (i32 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i35 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i38 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i40 != 0) {
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                } else {
                    fE = f10;
                }
                c0VarR.E(-652105429);
                if (q0Var3 == null) {
                    jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM = q0Var3.M();
                }
                int i41110 = i42;
                String str119 = str4;
                long j1112 = jM;
                c0VarR.A();
                c0VarR.E(-652099794);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar11114 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var112 = (s0) objI1;
                int i5111111114 = i16;
                Function1<? super y3, Unit> function11119 = function3;
                androidx.compose.ui.a0 a0VarB112 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                float fR112 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                int i5111111115 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarA112 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB112, fR112, j1112, intercomTheme112.getShapes(c0VarR, i5111111115).m()), intercomTheme112.getShapes(c0VarR, i5111111115).m()), aVar11114), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var112, aVar11114, (p0) obj);
                    }
                });
                j40 j40VarJ112 = n40.f30917a.j(c0VarR, 6);
                q0.a aVar11115 = q0.f38131b;
                int i5111111116 = iO;
                int i5111111117 = iA;
                boolean z211112 = z16;
                c0Var2 = c0VarR;
                boolean z211113 = z15;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111110 = function4;
                u40.h(str119, onTextChanged, a0VarA112, z211112, false, intercomTheme112.getTypography(c0VarR, i5111111115).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111118) {
                        if ((i5111111118 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), function111110, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111118) {
                        if ((i5111111118 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else if (z15) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5111111116, i5111111117, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function11119, null, null, null, 59, null), z14, i43, 0, null, intercomTheme112.getShapes(c0VarR, i5111111115).m(), j40VarJ112.c(((-1025) & 1) != 0 ? j40VarJ112.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ112.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ112.f29657c : intercomTheme112.getColors(c0VarR, i5111111115).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ112.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ112.f29659e : intercomTheme112.getColors(c0VarR, i5111111115).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ112.f29660f : intercomTheme112.getColors(c0VarR, i5111111115).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ112.f29661g : intercomTheme112.getColors(c0VarR, i5111111115).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ112.f29662h : intercomTheme112.getColors(c0VarR, i5111111115).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ112.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ112.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ112.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ112.f29666l : aVar11115.s(), ((-1025) & 4096) != 0 ? j40VarJ112.f29667m : aVar11115.s(), ((-1025) & 8192) != 0 ? j40VarJ112.f29668n : aVar11115.s(), ((-1025) & 16384) != 0 ? j40VarJ112.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ112.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ112.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ112.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ112.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ112.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ112.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ112.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ112.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ112.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ112.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ112.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ112.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ112.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ112.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ112.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ112.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ112.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ112.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ112.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ112.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ112.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ112.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ112.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ112.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ112.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ112.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ112.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ112.Q : 0L), c0Var2, 817889280 | (i5111111114 & 14) | ((i5111111114 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41110 << 3) & 7168) | ((i41110 << 21) & 234881024), ((i5111111114 << 3) & 29360128) | ((i5111111114 << 9) & 234881024), 0, 1604688);
                str6 = str119;
                z17 = z211112;
                function5 = function111110;
                z18 = z14;
                i44 = i43;
                i45 = i5111111116;
                i46 = i5111111117;
                function6 = function11119;
                str7 = str5;
                z19 = z211113;
                q0Var4 = q0Var3;
                f11 = fE;
            } else {
                if (i47 != 0) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                if (i48 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    q0Var3 = null;
                } else {
                    q0Var3 = q0Var2;
                }
                if (i21 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i22;
                }
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i26 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function3 = function1;
                }
                if (i28 != 0) {
                    iO = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iO = i11;
                }
                if (i30 != 0) {
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                } else {
                    iA = i12;
                }
                if (i32 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i35 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i38 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i40 != 0) {
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                } else {
                    fE = f10;
                }
                c0VarR.E(-652105429);
                if (q0Var3 == null) {
                    jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM = q0Var3.M();
                }
                int i41111 = i42;
                String str1110 = str4;
                long j1113 = jM;
                c0VarR.A();
                c0VarR.E(-652099794);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar11116 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var113 = (s0) objI1;
                int i5111111118 = i16;
                Function1<? super y3, Unit> function111111 = function3;
                androidx.compose.ui.a0 a0VarB113 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                float fR113 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                int i5111111119 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarA113 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB113, fR113, j1113, intercomTheme113.getShapes(c0VarR, i5111111119).m()), intercomTheme113.getShapes(c0VarR, i5111111119).m()), aVar11116), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var113, aVar11116, (p0) obj);
                    }
                });
                j40 j40VarJ113 = n40.f30917a.j(c0VarR, 6);
                q0.a aVar11117 = q0.f38131b;
                int i51111111110 = iO;
                int i51111111111 = iA;
                boolean z211114 = z16;
                c0Var2 = c0VarR;
                boolean z211115 = z15;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111112 = function4;
                u40.h(str1110, onTextChanged, a0VarA113, z211114, false, intercomTheme113.getTypography(c0VarR, i5111111119).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111111112) {
                        if ((i51111111112 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), function111112, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111111112) {
                        if ((i51111111112 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else if (z15) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51111111110, i51111111111, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function111111, null, null, null, 59, null), z14, i43, 0, null, intercomTheme113.getShapes(c0VarR, i5111111119).m(), j40VarJ113.c(((-1025) & 1) != 0 ? j40VarJ113.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ113.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ113.f29657c : intercomTheme113.getColors(c0VarR, i5111111119).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ113.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ113.f29659e : intercomTheme113.getColors(c0VarR, i5111111119).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ113.f29660f : intercomTheme113.getColors(c0VarR, i5111111119).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ113.f29661g : intercomTheme113.getColors(c0VarR, i5111111119).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ113.f29662h : intercomTheme113.getColors(c0VarR, i5111111119).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ113.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ113.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ113.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ113.f29666l : aVar11117.s(), ((-1025) & 4096) != 0 ? j40VarJ113.f29667m : aVar11117.s(), ((-1025) & 8192) != 0 ? j40VarJ113.f29668n : aVar11117.s(), ((-1025) & 16384) != 0 ? j40VarJ113.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ113.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ113.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ113.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ113.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ113.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ113.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ113.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ113.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ113.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ113.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ113.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ113.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ113.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ113.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ113.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ113.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ113.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ113.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ113.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ113.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ113.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ113.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ113.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ113.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ113.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ113.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ113.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ113.Q : 0L), c0Var2, 817889280 | (i5111111118 & 14) | ((i5111111118 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41111 << 3) & 7168) | ((i41111 << 21) & 234881024), ((i5111111118 << 3) & 29360128) | ((i5111111118 << 9) & 234881024), 0, 1604688);
                str6 = str1110;
                z17 = z211114;
                function5 = function111112;
                z18 = z14;
                i44 = i43;
                i45 = i51111111110;
                i46 = i51111111111;
                function6 = function111111;
                str7 = str5;
                z19 = z211115;
                q0Var4 = q0Var3;
                f11 = fE;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 3072;
        q0Var2 = q0Var;
        if ((i15 & 16) != 0) {
            i16 |= 24576;
        } else if ((i13 & 57344) == 0) {
            if (c0VarR.L(j10)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i16 |= i20;
        }
        i21 = i15 & 32;
        if (i21 != 0) {
            i16 |= androidx.profileinstaller.n.c.f73814m;
            i22 = i10;
        } else {
            i22 = i10;
            if ((i13 & 458752) == 0) {
                if (c0VarR.K(i22)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i16 |= i23;
            }
        }
        i24 = i15 & 64;
        if (i24 != 0) {
            i16 |= 1572864;
            z13 = z10;
        } else {
            z13 = z10;
            if ((i13 & 3670016) == 0) {
                if (c0VarR.G(z13)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i16 |= i25;
            }
        }
        i26 = i15 & 128;
        if (i26 != 0) {
            i16 |= 12582912;
        } else if ((i13 & 29360128) == 0) {
            if (c0VarR.k0(function1)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i16 |= i27;
        }
        i28 = i15 & 256;
        if (i28 != 0) {
            if ((i13 & 234881024) == 0) {
                if (c0VarR.K(i11)) {
                    i29 = 67108864;
                } else {
                    i29 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i16 |= i29;
            }
            i30 = i15 & 512;
            if (i30 != 0) {
                if ((i13 & 1879048192) == 0) {
                    if (c0VarR.K(i12)) {
                        i31 = 536870912;
                    } else {
                        i31 = 268435456;
                    }
                    i16 |= i31;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    if (c0VarR.G(z11)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                    if (c0VarR.k0(function2)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | a5.S0;
                } else if ((i14 & 896) == 0) {
                    i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
                } else {
                    i39 = i37;
                }
                i40 = i15 & 8192;
                if (i40 != 0) {
                    i42 = i39 | 3072;
                } else {
                    i41 = i39;
                    if ((i14 & 7168) == 0) {
                        i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                    } else {
                        i42 = i41;
                    }
                }
                if ((i16 & 1533916891) != 306783378) {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i41112 = i42;
                    String str1111 = str4;
                    long j1114 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar11118 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var114 = (s0) objI1;
                    int i51111111112 = i16;
                    Function1<? super y3, Unit> function111113 = function3;
                    androidx.compose.ui.a0 a0VarB114 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR114 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                    int i51111111113 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA114 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB114, fR114, j1114, intercomTheme114.getShapes(c0VarR, i51111111113).m()), intercomTheme114.getShapes(c0VarR, i51111111113).m()), aVar11118), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var114, aVar11118, (p0) obj);
                        }
                    });
                    j40 j40VarJ114 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar11119 = q0.f38131b;
                    int i51111111114 = iO;
                    int i51111111115 = iA;
                    boolean z211116 = z16;
                    c0Var2 = c0VarR;
                    boolean z211117 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111114 = function4;
                    u40.h(str1111, onTextChanged, a0VarA114, z211116, false, intercomTheme114.getTypography(c0VarR, i51111111113).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111111116) {
                            if ((i51111111116 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function111114, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111111116) {
                            if ((i51111111116 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51111111114, i51111111115, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function111113, null, null, null, 59, null), z14, i43, 0, null, intercomTheme114.getShapes(c0VarR, i51111111113).m(), j40VarJ114.c(((-1025) & 1) != 0 ? j40VarJ114.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ114.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ114.f29657c : intercomTheme114.getColors(c0VarR, i51111111113).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ114.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ114.f29659e : intercomTheme114.getColors(c0VarR, i51111111113).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ114.f29660f : intercomTheme114.getColors(c0VarR, i51111111113).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ114.f29661g : intercomTheme114.getColors(c0VarR, i51111111113).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ114.f29662h : intercomTheme114.getColors(c0VarR, i51111111113).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ114.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ114.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ114.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ114.f29666l : aVar11119.s(), ((-1025) & 4096) != 0 ? j40VarJ114.f29667m : aVar11119.s(), ((-1025) & 8192) != 0 ? j40VarJ114.f29668n : aVar11119.s(), ((-1025) & 16384) != 0 ? j40VarJ114.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ114.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ114.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ114.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ114.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ114.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ114.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ114.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ114.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ114.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ114.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ114.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ114.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ114.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ114.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ114.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ114.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ114.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ114.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ114.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ114.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ114.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ114.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ114.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ114.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ114.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ114.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ114.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ114.Q : 0L), c0Var2, 817889280 | (i51111111112 & 14) | ((i51111111112 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41112 << 3) & 7168) | ((i41112 << 21) & 234881024), ((i51111111112 << 3) & 29360128) | ((i51111111112 << 9) & 234881024), 0, 1604688);
                    str6 = str1111;
                    z17 = z211116;
                    function5 = function111114;
                    z18 = z14;
                    i44 = i43;
                    i45 = i51111111114;
                    i46 = i51111111115;
                    function6 = function111113;
                    str7 = str5;
                    z19 = z211117;
                    q0Var4 = q0Var3;
                    f11 = fE;
                } else {
                    if (i47 != 0) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    if (i48 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i18 != 0) {
                        q0Var3 = null;
                    } else {
                        q0Var3 = q0Var2;
                    }
                    if (i21 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i22;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    if (i26 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    if (i28 != 0) {
                        iO = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iO = i11;
                    }
                    if (i30 != 0) {
                        iA = androidx.compose.ui.text.input.t.f41944b.a();
                    } else {
                        iA = i12;
                    }
                    if (i32 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i35 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i38 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i40 != 0) {
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                    } else {
                        fE = f10;
                    }
                    c0VarR.E(-652105429);
                    if (q0Var3 == null) {
                        jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM = q0Var3.M();
                    }
                    int i41113 = i42;
                    String str1112 = str4;
                    long j1115 = jM;
                    c0VarR.A();
                    c0VarR.E(-652099794);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar111110 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var115 = (s0) objI1;
                    int i51111111116 = i16;
                    Function1<? super y3, Unit> function111115 = function3;
                    androidx.compose.ui.a0 a0VarB115 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                    float fR115 = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                    int i51111111117 = IntercomTheme.$stable;
                    androidx.compose.ui.a0 a0VarA115 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB115, fR115, j1115, intercomTheme115.getShapes(c0VarR, i51111111117).m()), intercomTheme115.getShapes(c0VarR, i51111111117).m()), aVar111110), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var115, aVar111110, (p0) obj);
                        }
                    });
                    j40 j40VarJ115 = n40.f30917a.j(c0VarR, 6);
                    q0.a aVar111111 = q0.f38131b;
                    int i51111111118 = iO;
                    int i51111111119 = iA;
                    boolean z211118 = z16;
                    c0Var2 = c0VarR;
                    boolean z211119 = z15;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111116 = function4;
                    u40.h(str1112, onTextChanged, a0VarA115, z211118, false, intercomTheme115.getTypography(c0VarR, i51111111117).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111111110) {
                            if ((i511111111110 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else {
                                q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                            }
                        }
                    }, c0VarR, 54), function111116, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111111110) {
                            if ((i511111111110 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                            } else if (z15) {
                                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                            }
                        }
                    }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51111111118, i51111111119, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function111115, null, null, null, 59, null), z14, i43, 0, null, intercomTheme115.getShapes(c0VarR, i51111111117).m(), j40VarJ115.c(((-1025) & 1) != 0 ? j40VarJ115.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ115.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ115.f29657c : intercomTheme115.getColors(c0VarR, i51111111117).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ115.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ115.f29659e : intercomTheme115.getColors(c0VarR, i51111111117).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ115.f29660f : intercomTheme115.getColors(c0VarR, i51111111117).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ115.f29661g : intercomTheme115.getColors(c0VarR, i51111111117).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ115.f29662h : intercomTheme115.getColors(c0VarR, i51111111117).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ115.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ115.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ115.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ115.f29666l : aVar111111.s(), ((-1025) & 4096) != 0 ? j40VarJ115.f29667m : aVar111111.s(), ((-1025) & 8192) != 0 ? j40VarJ115.f29668n : aVar111111.s(), ((-1025) & 16384) != 0 ? j40VarJ115.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ115.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ115.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ115.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ115.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ115.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ115.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ115.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ115.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ115.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ115.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ115.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ115.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ115.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ115.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ115.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ115.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ115.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ115.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ115.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ115.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ115.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ115.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ115.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ115.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ115.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ115.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ115.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ115.Q : 0L), c0Var2, 817889280 | (i51111111116 & 14) | ((i51111111116 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41113 << 3) & 7168) | ((i41113 << 21) & 234881024), ((i51111111116 << 3) & 29360128) | ((i51111111116 << 9) & 234881024), 0, 1604688);
                    str6 = str1112;
                    z17 = z211118;
                    function5 = function111116;
                    z18 = z14;
                    i44 = i43;
                    i45 = i51111111118;
                    i46 = i51111111119;
                    function6 = function111115;
                    str7 = str5;
                    z19 = z211119;
                    q0Var4 = q0Var3;
                    f11 = fE;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 |= 805306368;
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                if (c0VarR.G(z11)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                if (c0VarR.k0(function2)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | a5.S0;
            } else if ((i14 & 896) == 0) {
                i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
            } else {
                i39 = i37;
            }
            i40 = i15 & 8192;
            if (i40 != 0) {
                i42 = i39 | 3072;
            } else {
                i41 = i39;
                if ((i14 & 7168) == 0) {
                    i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                } else {
                    i42 = i41;
                }
            }
            if ((i16 & 1533916891) != 306783378) {
                if (i47 != 0) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                if (i48 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    q0Var3 = null;
                } else {
                    q0Var3 = q0Var2;
                }
                if (i21 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i22;
                }
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i26 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function3 = function1;
                }
                if (i28 != 0) {
                    iO = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iO = i11;
                }
                if (i30 != 0) {
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                } else {
                    iA = i12;
                }
                if (i32 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i35 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i38 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i40 != 0) {
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                } else {
                    fE = f10;
                }
                c0VarR.E(-652105429);
                if (q0Var3 == null) {
                    jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM = q0Var3.M();
                }
                int i41114 = i42;
                String str1113 = str4;
                long j1116 = jM;
                c0VarR.A();
                c0VarR.E(-652099794);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar111112 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var116 = (s0) objI1;
                int i511111111110 = i16;
                Function1<? super y3, Unit> function111117 = function3;
                androidx.compose.ui.a0 a0VarB116 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                float fR116 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                int i511111111111 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarA116 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB116, fR116, j1116, intercomTheme116.getShapes(c0VarR, i511111111111).m()), intercomTheme116.getShapes(c0VarR, i511111111111).m()), aVar111112), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var116, aVar111112, (p0) obj);
                    }
                });
                j40 j40VarJ116 = n40.f30917a.j(c0VarR, 6);
                q0.a aVar111113 = q0.f38131b;
                int i511111111112 = iO;
                int i511111111113 = iA;
                boolean z2111110 = z16;
                c0Var2 = c0VarR;
                boolean z2111111 = z15;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111118 = function4;
                u40.h(str1113, onTextChanged, a0VarA116, z2111110, false, intercomTheme116.getTypography(c0VarR, i511111111111).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111111114) {
                        if ((i511111111114 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), function111118, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111111114) {
                        if ((i511111111114 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else if (z15) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i511111111112, i511111111113, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function111117, null, null, null, 59, null), z14, i43, 0, null, intercomTheme116.getShapes(c0VarR, i511111111111).m(), j40VarJ116.c(((-1025) & 1) != 0 ? j40VarJ116.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ116.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ116.f29657c : intercomTheme116.getColors(c0VarR, i511111111111).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ116.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ116.f29659e : intercomTheme116.getColors(c0VarR, i511111111111).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ116.f29660f : intercomTheme116.getColors(c0VarR, i511111111111).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ116.f29661g : intercomTheme116.getColors(c0VarR, i511111111111).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ116.f29662h : intercomTheme116.getColors(c0VarR, i511111111111).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ116.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ116.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ116.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ116.f29666l : aVar111113.s(), ((-1025) & 4096) != 0 ? j40VarJ116.f29667m : aVar111113.s(), ((-1025) & 8192) != 0 ? j40VarJ116.f29668n : aVar111113.s(), ((-1025) & 16384) != 0 ? j40VarJ116.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ116.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ116.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ116.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ116.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ116.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ116.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ116.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ116.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ116.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ116.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ116.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ116.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ116.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ116.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ116.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ116.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ116.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ116.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ116.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ116.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ116.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ116.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ116.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ116.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ116.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ116.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ116.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ116.Q : 0L), c0Var2, 817889280 | (i511111111110 & 14) | ((i511111111110 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41114 << 3) & 7168) | ((i41114 << 21) & 234881024), ((i511111111110 << 3) & 29360128) | ((i511111111110 << 9) & 234881024), 0, 1604688);
                str6 = str1113;
                z17 = z2111110;
                function5 = function111118;
                z18 = z14;
                i44 = i43;
                i45 = i511111111112;
                i46 = i511111111113;
                function6 = function111117;
                str7 = str5;
                z19 = z2111111;
                q0Var4 = q0Var3;
                f11 = fE;
            } else {
                if (i47 != 0) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                if (i48 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    q0Var3 = null;
                } else {
                    q0Var3 = q0Var2;
                }
                if (i21 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i22;
                }
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i26 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function3 = function1;
                }
                if (i28 != 0) {
                    iO = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iO = i11;
                }
                if (i30 != 0) {
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                } else {
                    iA = i12;
                }
                if (i32 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i35 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i38 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i40 != 0) {
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                } else {
                    fE = f10;
                }
                c0VarR.E(-652105429);
                if (q0Var3 == null) {
                    jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM = q0Var3.M();
                }
                int i41115 = i42;
                String str1114 = str4;
                long j1117 = jM;
                c0VarR.A();
                c0VarR.E(-652099794);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar111114 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var117 = (s0) objI1;
                int i511111111114 = i16;
                Function1<? super y3, Unit> function111119 = function3;
                androidx.compose.ui.a0 a0VarB117 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                float fR117 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                int i511111111115 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarA117 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB117, fR117, j1117, intercomTheme117.getShapes(c0VarR, i511111111115).m()), intercomTheme117.getShapes(c0VarR, i511111111115).m()), aVar111114), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var117, aVar111114, (p0) obj);
                    }
                });
                j40 j40VarJ117 = n40.f30917a.j(c0VarR, 6);
                q0.a aVar111115 = q0.f38131b;
                int i511111111116 = iO;
                int i511111111117 = iA;
                boolean z2111112 = z16;
                c0Var2 = c0VarR;
                boolean z2111113 = z15;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111110 = function4;
                u40.h(str1114, onTextChanged, a0VarA117, z2111112, false, intercomTheme117.getTypography(c0VarR, i511111111115).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111111118) {
                        if ((i511111111118 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), function1111110, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i511111111118) {
                        if ((i511111111118 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else if (z15) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i511111111116, i511111111117, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function111119, null, null, null, 59, null), z14, i43, 0, null, intercomTheme117.getShapes(c0VarR, i511111111115).m(), j40VarJ117.c(((-1025) & 1) != 0 ? j40VarJ117.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ117.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ117.f29657c : intercomTheme117.getColors(c0VarR, i511111111115).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ117.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ117.f29659e : intercomTheme117.getColors(c0VarR, i511111111115).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ117.f29660f : intercomTheme117.getColors(c0VarR, i511111111115).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ117.f29661g : intercomTheme117.getColors(c0VarR, i511111111115).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ117.f29662h : intercomTheme117.getColors(c0VarR, i511111111115).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ117.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ117.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ117.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ117.f29666l : aVar111115.s(), ((-1025) & 4096) != 0 ? j40VarJ117.f29667m : aVar111115.s(), ((-1025) & 8192) != 0 ? j40VarJ117.f29668n : aVar111115.s(), ((-1025) & 16384) != 0 ? j40VarJ117.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ117.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ117.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ117.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ117.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ117.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ117.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ117.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ117.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ117.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ117.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ117.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ117.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ117.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ117.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ117.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ117.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ117.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ117.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ117.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ117.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ117.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ117.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ117.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ117.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ117.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ117.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ117.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ117.Q : 0L), c0Var2, 817889280 | (i511111111114 & 14) | ((i511111111114 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41115 << 3) & 7168) | ((i41115 << 21) & 234881024), ((i511111111114 << 3) & 29360128) | ((i511111111114 << 9) & 234881024), 0, 1604688);
                str6 = str1114;
                z17 = z2111112;
                function5 = function1111110;
                z18 = z14;
                i44 = i43;
                i45 = i511111111116;
                i46 = i511111111117;
                function6 = function111119;
                str7 = str5;
                z19 = z2111113;
                q0Var4 = q0Var3;
                f11 = fE;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 100663296;
        i30 = i15 & 512;
        if (i30 != 0) {
            if ((i13 & 1879048192) == 0) {
                if (c0VarR.K(i12)) {
                    i31 = 536870912;
                } else {
                    i31 = 268435456;
                }
                i16 |= i31;
            }
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                if (c0VarR.G(z11)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
                if (c0VarR.k0(function2)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | a5.S0;
            } else if ((i14 & 896) == 0) {
                i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
            } else {
                i39 = i37;
            }
            i40 = i15 & 8192;
            if (i40 != 0) {
                i42 = i39 | 3072;
            } else {
                i41 = i39;
                if ((i14 & 7168) == 0) {
                    i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
                } else {
                    i42 = i41;
                }
            }
            if ((i16 & 1533916891) != 306783378) {
                if (i47 != 0) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                if (i48 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    q0Var3 = null;
                } else {
                    q0Var3 = q0Var2;
                }
                if (i21 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i22;
                }
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i26 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function3 = function1;
                }
                if (i28 != 0) {
                    iO = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iO = i11;
                }
                if (i30 != 0) {
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                } else {
                    iA = i12;
                }
                if (i32 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i35 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i38 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i40 != 0) {
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                } else {
                    fE = f10;
                }
                c0VarR.E(-652105429);
                if (q0Var3 == null) {
                    jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM = q0Var3.M();
                }
                int i41116 = i42;
                String str1115 = str4;
                long j1118 = jM;
                c0VarR.A();
                c0VarR.E(-652099794);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar111116 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var118 = (s0) objI1;
                int i511111111118 = i16;
                Function1<? super y3, Unit> function1111111 = function3;
                androidx.compose.ui.a0 a0VarB118 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                float fR118 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                int i511111111119 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarA118 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB118, fR118, j1118, intercomTheme118.getShapes(c0VarR, i511111111119).m()), intercomTheme118.getShapes(c0VarR, i511111111119).m()), aVar111116), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var118, aVar111116, (p0) obj);
                    }
                });
                j40 j40VarJ118 = n40.f30917a.j(c0VarR, 6);
                q0.a aVar111117 = q0.f38131b;
                int i5111111111110 = iO;
                int i5111111111111 = iA;
                boolean z2111114 = z16;
                c0Var2 = c0VarR;
                boolean z2111115 = z15;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111112 = function4;
                u40.h(str1115, onTextChanged, a0VarA118, z2111114, false, intercomTheme118.getTypography(c0VarR, i511111111119).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111111112) {
                        if ((i5111111111112 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), function1111112, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111111112) {
                        if ((i5111111111112 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else if (z15) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5111111111110, i5111111111111, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1111111, null, null, null, 59, null), z14, i43, 0, null, intercomTheme118.getShapes(c0VarR, i511111111119).m(), j40VarJ118.c(((-1025) & 1) != 0 ? j40VarJ118.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ118.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ118.f29657c : intercomTheme118.getColors(c0VarR, i511111111119).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ118.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ118.f29659e : intercomTheme118.getColors(c0VarR, i511111111119).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ118.f29660f : intercomTheme118.getColors(c0VarR, i511111111119).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ118.f29661g : intercomTheme118.getColors(c0VarR, i511111111119).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ118.f29662h : intercomTheme118.getColors(c0VarR, i511111111119).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ118.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ118.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ118.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ118.f29666l : aVar111117.s(), ((-1025) & 4096) != 0 ? j40VarJ118.f29667m : aVar111117.s(), ((-1025) & 8192) != 0 ? j40VarJ118.f29668n : aVar111117.s(), ((-1025) & 16384) != 0 ? j40VarJ118.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ118.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ118.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ118.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ118.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ118.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ118.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ118.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ118.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ118.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ118.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ118.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ118.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ118.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ118.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ118.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ118.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ118.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ118.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ118.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ118.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ118.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ118.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ118.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ118.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ118.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ118.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ118.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ118.Q : 0L), c0Var2, 817889280 | (i511111111118 & 14) | ((i511111111118 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41116 << 3) & 7168) | ((i41116 << 21) & 234881024), ((i511111111118 << 3) & 29360128) | ((i511111111118 << 9) & 234881024), 0, 1604688);
                str6 = str1115;
                z17 = z2111114;
                function5 = function1111112;
                z18 = z14;
                i44 = i43;
                i45 = i5111111111110;
                i46 = i5111111111111;
                function6 = function1111111;
                str7 = str5;
                z19 = z2111115;
                q0Var4 = q0Var3;
                f11 = fE;
            } else {
                if (i47 != 0) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                if (i48 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i18 != 0) {
                    q0Var3 = null;
                } else {
                    q0Var3 = q0Var2;
                }
                if (i21 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i22;
                }
                if (i24 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (i26 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function3 = function1;
                }
                if (i28 != 0) {
                    iO = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iO = i11;
                }
                if (i30 != 0) {
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                } else {
                    iA = i12;
                }
                if (i32 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i35 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i38 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i40 != 0) {
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                } else {
                    fE = f10;
                }
                c0VarR.E(-652105429);
                if (q0Var3 == null) {
                    jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM = q0Var3.M();
                }
                int i41117 = i42;
                String str1116 = str4;
                long j1119 = jM;
                c0VarR.A();
                c0VarR.E(-652099794);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar111118 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var119 = (s0) objI1;
                int i5111111111112 = i16;
                Function1<? super y3, Unit> function1111113 = function3;
                androidx.compose.ui.a0 a0VarB119 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
                float fR119 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                int i5111111111113 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarA119 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB119, fR119, j1119, intercomTheme119.getShapes(c0VarR, i5111111111113).m()), intercomTheme119.getShapes(c0VarR, i5111111111113).m()), aVar111118), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var119, aVar111118, (p0) obj);
                    }
                });
                j40 j40VarJ119 = n40.f30917a.j(c0VarR, 6);
                q0.a aVar111119 = q0.f38131b;
                int i5111111111114 = iO;
                int i5111111111115 = iA;
                boolean z2111116 = z16;
                c0Var2 = c0VarR;
                boolean z2111117 = z15;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111114 = function4;
                u40.h(str1116, onTextChanged, a0VarA119, z2111116, false, intercomTheme119.getTypography(c0VarR, i5111111111113).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111111116) {
                        if ((i5111111111116 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), function1111114, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i5111111111116) {
                        if ((i5111111111116 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                        } else if (z15) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                        }
                    }
                }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5111111111114, i5111111111115, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1111113, null, null, null, 59, null), z14, i43, 0, null, intercomTheme119.getShapes(c0VarR, i5111111111113).m(), j40VarJ119.c(((-1025) & 1) != 0 ? j40VarJ119.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ119.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ119.f29657c : intercomTheme119.getColors(c0VarR, i5111111111113).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ119.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ119.f29659e : intercomTheme119.getColors(c0VarR, i5111111111113).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ119.f29660f : intercomTheme119.getColors(c0VarR, i5111111111113).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ119.f29661g : intercomTheme119.getColors(c0VarR, i5111111111113).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ119.f29662h : intercomTheme119.getColors(c0VarR, i5111111111113).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ119.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ119.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ119.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ119.f29666l : aVar111119.s(), ((-1025) & 4096) != 0 ? j40VarJ119.f29667m : aVar111119.s(), ((-1025) & 8192) != 0 ? j40VarJ119.f29668n : aVar111119.s(), ((-1025) & 16384) != 0 ? j40VarJ119.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ119.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ119.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ119.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ119.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ119.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ119.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ119.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ119.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ119.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ119.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ119.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ119.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ119.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ119.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ119.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ119.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ119.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ119.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ119.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ119.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ119.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ119.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ119.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ119.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ119.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ119.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ119.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ119.Q : 0L), c0Var2, 817889280 | (i5111111111112 & 14) | ((i5111111111112 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41117 << 3) & 7168) | ((i41117 << 21) & 234881024), ((i5111111111112 << 3) & 29360128) | ((i5111111111112 << 9) & 234881024), 0, 1604688);
                str6 = str1116;
                z17 = z2111116;
                function5 = function1111114;
                z18 = z14;
                i44 = i43;
                i45 = i5111111111114;
                i46 = i5111111111115;
                function6 = function1111113;
                str7 = str5;
                z19 = z2111117;
                q0Var4 = q0Var3;
                f11 = fE;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 805306368;
        i32 = i15 & 1024;
        if (i32 != 0) {
            i33 = i14 | 6;
        } else if ((i14 & 14) == 0) {
            if (c0VarR.G(z11)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i33 = i14 | i34;
        } else {
            i33 = i14;
        }
        i35 = i15 & 2048;
        if (i35 != 0) {
            i33 |= 48;
        } else if ((i14 & com.planner5d.library.engine.input.f.b.B) != 0) {
            if (c0VarR.k0(function2)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i33 |= i36;
        }
        i37 = i33;
        i38 = i15 & 4096;
        if (i38 != 0) {
            i39 = i37 | a5.S0;
        } else if ((i14 & 896) == 0) {
            i39 = i37 | (c0VarR.G(z12) ? 256 : 128);
        } else {
            i39 = i37;
        }
        i40 = i15 & 8192;
        if (i40 != 0) {
            i42 = i39 | 3072;
        } else {
            i41 = i39;
            if ((i14 & 7168) == 0) {
                i42 = i41 | (c0VarR.I(f10) ? 2048 : 1024);
            } else {
                i42 = i41;
            }
        }
        if ((i16 & 1533916891) != 306783378) {
            if (i47 != 0) {
                str4 = "";
            } else {
                str4 = str;
            }
            if (i48 != 0) {
                str5 = "";
            } else {
                str5 = str3;
            }
            if (i18 != 0) {
                q0Var3 = null;
            } else {
                q0Var3 = q0Var2;
            }
            if (i21 != 0) {
                i43 = Integer.MAX_VALUE;
            } else {
                i43 = i22;
            }
            if (i24 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            if (i26 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                    }
                };
            } else {
                function3 = function1;
            }
            if (i28 != 0) {
                iO = androidx.compose.ui.text.input.b0.f41811b.o();
            } else {
                iO = i11;
            }
            if (i30 != 0) {
                iA = androidx.compose.ui.text.input.t.f41944b.a();
            } else {
                iA = i12;
            }
            if (i32 != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if (i35 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i38 != 0) {
                z16 = true;
            } else {
                z16 = z12;
            }
            if (i40 != 0) {
                fE = androidx.compose.ui.unit.h.f42689b.e();
            } else {
                fE = f10;
            }
            c0VarR.E(-652105429);
            if (q0Var3 == null) {
                jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM = q0Var3.M();
            }
            int i41118 = i42;
            String str1117 = str4;
            long j11110 = jM;
            c0VarR.A();
            c0VarR.E(-652099794);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.foundation.relocation.d.a();
                c0VarR.Y(objI0);
            }
            final androidx.compose.foundation.relocation.a aVar1111110 = (androidx.compose.foundation.relocation.a) objI0;
            c0VarR.A();
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            final s0 s0Var1110 = (s0) objI1;
            int i5111111111116 = i16;
            Function1<? super y3, Unit> function1111115 = function3;
            androidx.compose.ui.a0 a0VarB1110 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
            float fR1110 = androidx.compose.ui.unit.h.r(1);
            IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
            int i5111111111117 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarA1110 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB1110, fR1110, j11110, intercomTheme1110.getShapes(c0VarR, i5111111111117).m()), intercomTheme1110.getShapes(c0VarR, i5111111111117).m()), aVar1111110), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var1110, aVar1111110, (p0) obj);
                }
            });
            j40 j40VarJ1110 = n40.f30917a.j(c0VarR, 6);
            q0.a aVar1111111 = q0.f38131b;
            int i5111111111118 = iO;
            int i5111111111119 = iA;
            boolean z2111118 = z16;
            c0Var2 = c0VarR;
            boolean z2111119 = z15;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111116 = function4;
            u40.h(str1117, onTextChanged, a0VarA1110, z2111118, false, intercomTheme1110.getTypography(c0VarR, i5111111111117).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111111111110) {
                    if ((i51111111111110 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                    } else {
                        q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                    }
                }
            }, c0VarR, 54), function1111116, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111111111110) {
                    if ((i51111111111110 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                    } else if (z15) {
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                    }
                }
            }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i5111111111118, i5111111111119, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1111115, null, null, null, 59, null), z14, i43, 0, null, intercomTheme1110.getShapes(c0VarR, i5111111111117).m(), j40VarJ1110.c(((-1025) & 1) != 0 ? j40VarJ1110.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ1110.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ1110.f29657c : intercomTheme1110.getColors(c0VarR, i5111111111117).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ1110.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ1110.f29659e : intercomTheme1110.getColors(c0VarR, i5111111111117).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ1110.f29660f : intercomTheme1110.getColors(c0VarR, i5111111111117).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ1110.f29661g : intercomTheme1110.getColors(c0VarR, i5111111111117).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ1110.f29662h : intercomTheme1110.getColors(c0VarR, i5111111111117).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ1110.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ1110.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ1110.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ1110.f29666l : aVar1111111.s(), ((-1025) & 4096) != 0 ? j40VarJ1110.f29667m : aVar1111111.s(), ((-1025) & 8192) != 0 ? j40VarJ1110.f29668n : aVar1111111.s(), ((-1025) & 16384) != 0 ? j40VarJ1110.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ1110.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ1110.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ1110.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ1110.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ1110.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ1110.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ1110.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ1110.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ1110.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ1110.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ1110.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ1110.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ1110.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ1110.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ1110.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ1110.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ1110.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ1110.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ1110.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ1110.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ1110.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ1110.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ1110.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ1110.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ1110.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ1110.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ1110.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ1110.Q : 0L), c0Var2, 817889280 | (i5111111111116 & 14) | ((i5111111111116 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41118 << 3) & 7168) | ((i41118 << 21) & 234881024), ((i5111111111116 << 3) & 29360128) | ((i5111111111116 << 9) & 234881024), 0, 1604688);
            str6 = str1117;
            z17 = z2111118;
            function5 = function1111116;
            z18 = z14;
            i44 = i43;
            i45 = i5111111111118;
            i46 = i5111111111119;
            function6 = function1111115;
            str7 = str5;
            z19 = z2111119;
            q0Var4 = q0Var3;
            f11 = fE;
        } else {
            if (i47 != 0) {
                str4 = "";
            } else {
                str4 = str;
            }
            if (i48 != 0) {
                str5 = "";
            } else {
                str5 = str3;
            }
            if (i18 != 0) {
                q0Var3 = null;
            } else {
                q0Var3 = q0Var2;
            }
            if (i21 != 0) {
                i43 = Integer.MAX_VALUE;
            } else {
                i43 = i22;
            }
            if (i24 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            if (i26 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((y3) obj);
                    }
                };
            } else {
                function3 = function1;
            }
            if (i28 != 0) {
                iO = androidx.compose.ui.text.input.b0.f41811b.o();
            } else {
                iO = i11;
            }
            if (i30 != 0) {
                iA = androidx.compose.ui.text.input.t.f41944b.a();
            } else {
                iA = i12;
            }
            if (i32 != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if (i35 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i38 != 0) {
                z16 = true;
            } else {
                z16 = z12;
            }
            if (i40 != 0) {
                fE = androidx.compose.ui.unit.h.f42689b.e();
            } else {
                fE = f10;
            }
            c0VarR.E(-652105429);
            if (q0Var3 == null) {
                jM = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM = q0Var3.M();
            }
            int i41119 = i42;
            String str1118 = str4;
            long j11111 = jM;
            c0VarR.A();
            c0VarR.E(-652099794);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.foundation.relocation.d.a();
                c0VarR.Y(objI0);
            }
            final androidx.compose.foundation.relocation.a aVar1111112 = (androidx.compose.foundation.relocation.a) objI0;
            c0VarR.A();
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            final s0 s0Var1111 = (s0) objI1;
            int i51111111111110 = i16;
            Function1<? super y3, Unit> function1111117 = function3;
            androidx.compose.ui.a0 a0VarB1111 = i6.b(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), 0.0f, fE, 1, null);
            float fR1111 = androidx.compose.ui.unit.h.r(1);
            IntercomTheme intercomTheme1111 = IntercomTheme.INSTANCE;
            int i51111111111111 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarA1111 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(androidx.compose.ui.draw.j.a(t0.i(a0VarB1111, fR1111, j11111, intercomTheme1111.getShapes(c0VarR, i51111111111111).m()), intercomTheme1111.getShapes(c0VarR, i51111111111111).m()), aVar1111112), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(s0Var1111, aVar1111112, (p0) obj);
                }
            });
            j40 j40VarJ1111 = n40.f30917a.j(c0VarR, 6);
            q0.a aVar1111113 = q0.f38131b;
            int i51111111111112 = iO;
            int i51111111111113 = iA;
            boolean z21111110 = z16;
            c0Var2 = c0VarR;
            boolean z21111111 = z15;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111118 = function4;
            u40.h(str1118, onTextChanged, a0VarA1111, z21111110, false, intercomTheme1111.getTypography(c0VarR, i51111111111111).getType04(), null, androidx.compose.runtime.internal.w.e(-712506390, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111111111114) {
                    if ((i51111111111114 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                    } else {
                        q50.t(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04(), c0Var3, 0, 0, 131070);
                    }
                }
            }, c0VarR, 54), function1111118, androidx.compose.runtime.internal.w.e(583948524, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i51111111111114) {
                    if ((i51111111111114 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                    } else if (z15) {
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0Var3, 0), "Looks good!", i6.w(d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var3, IntercomTheme.$stable).m686getActive0d7_KjU(), c0Var3, 440, 0);
                    }
                }
            }, c0VarR, 54), null, null, null, false, null, new b4(0, (Boolean) null, i51111111111112, i51111111111113, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 115, (DefaultConstructorMarker) null), new z3(null, null, function1111117, null, null, null, 59, null), z14, i43, 0, null, intercomTheme1111.getShapes(c0VarR, i51111111111111).m(), j40VarJ1111.c(((-1025) & 1) != 0 ? j40VarJ1111.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarJ1111.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarJ1111.f29657c : intercomTheme1111.getColors(c0VarR, i51111111111111).m699getDescriptionText0d7_KjU(), ((-1025) & 8) != 0 ? j40VarJ1111.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarJ1111.f29659e : intercomTheme1111.getColors(c0VarR, i51111111111111).m706getInputAlt0d7_KjU(), ((-1025) & 32) != 0 ? j40VarJ1111.f29660f : intercomTheme1111.getColors(c0VarR, i51111111111111).m706getInputAlt0d7_KjU(), ((-1025) & 64) != 0 ? j40VarJ1111.f29661g : intercomTheme1111.getColors(c0VarR, i51111111111111).m693getBubbleBackground0d7_KjU(), ((-1025) & 128) != 0 ? j40VarJ1111.f29662h : intercomTheme1111.getColors(c0VarR, i51111111111111).m706getInputAlt0d7_KjU(), ((-1025) & 256) != 0 ? j40VarJ1111.f29663i : j10, ((-1025) & 512) != 0 ? j40VarJ1111.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarJ1111.f29665k : null, ((-1025) & 2048) != 0 ? j40VarJ1111.f29666l : aVar1111113.s(), ((-1025) & 4096) != 0 ? j40VarJ1111.f29667m : aVar1111113.s(), ((-1025) & 8192) != 0 ? j40VarJ1111.f29668n : aVar1111113.s(), ((-1025) & 16384) != 0 ? j40VarJ1111.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarJ1111.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarJ1111.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarJ1111.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarJ1111.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarJ1111.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarJ1111.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarJ1111.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarJ1111.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarJ1111.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarJ1111.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarJ1111.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarJ1111.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarJ1111.B : 0L, ((-1025) & 268435456) != 0 ? j40VarJ1111.C : 0L, ((-1025) & 536870912) != 0 ? j40VarJ1111.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarJ1111.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarJ1111.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarJ1111.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarJ1111.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarJ1111.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarJ1111.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarJ1111.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarJ1111.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarJ1111.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarJ1111.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarJ1111.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarJ1111.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarJ1111.Q : 0L), c0Var2, 817889280 | (i51111111111110 & 14) | ((i51111111111110 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i41119 << 3) & 7168) | ((i41119 << 21) & 234881024), ((i51111111111110 << 3) & 29360128) | ((i51111111111110 << 9) & 234881024), 0, 1604688);
            str6 = str1118;
            z17 = z21111110;
            function5 = function1111118;
            z18 = z14;
            i44 = i43;
            i45 = i51111111111112;
            i46 = i51111111111113;
            function6 = function1111117;
            str7 = str5;
            z19 = z21111111;
            q0Var4 = q0Var3;
            f11 = fE;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str7, onTextChanged, q0Var4, j10, i44, z18, function6, i45, i46, z19, function5, z17, f11, i13, i14, i15, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextInputPillDisabled(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1100722979);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 7 ^ 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m522getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextInputPillKt.TextInputPillDisabled$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillDisabled$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextInputPillDisabled(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextInputPillError(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-175520743);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m521getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextInputPillKt.TextInputPillError$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillError$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextInputPillError(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextInputPillPlaceholder(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1437391364);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m518getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextInputPillKt.TextInputPillPlaceholder$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillPlaceholder$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextInputPillPlaceholder(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextInputPillUnchecked(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-869352961);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m519getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextInputPillKt.TextInputPillUnchecked$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillUnchecked$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextInputPillUnchecked(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TextInputPillValidated(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(559292703);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m520getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextInputPillKt.TextInputPillValidated$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillValidated$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TextInputPillValidated(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPill_g5ZjG94$lambda$0(y3 y3Var) {
        Intrinsics.checkNotNullParameter(y3Var, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPill_g5ZjG94$lambda$2(s0 coroutineScope, androidx.compose.foundation.relocation.a bringIntoViewRequester, p0 it) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        Intrinsics.checkNotNullParameter(bringIntoViewRequester, "$bringIntoViewRequester");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.k()) {
            kotlinx.coroutines.k.f(coroutineScope, null, null, new TextInputPillKt$TextInputPill$2$1(bringIntoViewRequester, null), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPill_g5ZjG94$lambda$3(String str, String str2, Function1 onTextChanged, q0 q0Var, long j10, int i10, boolean z10, Function1 function1, int i11, int i12, boolean z11, Function2 function2, boolean z12, float f10, int i13, int i14, int i15, androidx.compose.runtime.c0 c0Var, int i16) {
        Intrinsics.checkNotNullParameter(onTextChanged, "$onTextChanged");
        m523TextInputPillg5ZjG94(str, str2, onTextChanged, q0Var, j10, i10, z10, function1, i11, i12, z11, function2, z12, f10, c0Var, t4.a(i13 | 1), t4.a(i14), i15);
        return Unit.f312394a;
    }
}
