package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.foundation.b1;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.t0;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.d0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
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
@SourceDebugExtension({"SMAP\nChoicePill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChoicePill.kt\nio/intercom/android/sdk/survey/ui/questiontype/choice/ChoicePillKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,131:1\n113#2:132\n113#2:139\n113#2:176\n1282#3,6:133\n99#4:140\n97#4,8:141\n106#4:180\n80#5,6:149\n87#5,3:164\n90#5,2:173\n94#5:179\n391#6,9:155\n400#6:175\n401#6,2:177\n4360#7,6:167\n*S KotlinDebug\n*F\n+ 1 ChoicePill.kt\nio/intercom/android/sdk/survey/ui/questiontype/choice/ChoicePillKt\n*L\n37#1:132\n54#1:139\n72#1:176\n53#1:133,6\n44#1:140\n44#1:141,8\n44#1:180\n44#1:149,6\n44#1:164,3\n44#1:173,2\n44#1:179\n44#1:155,9\n44#1:175\n44#1:177,2\n44#1:167,6\n*E\n"})
public final class ChoicePillKt {
    /* JADX WARN: Code duplicated, block: B:101:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:105:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0158  */
    /* JADX WARN: Code duplicated, block: B:110:0x015f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0179  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01df  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:133:0x0240  */
    /* JADX WARN: Code duplicated, block: B:136:0x024c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0250  */
    /* JADX WARN: Code duplicated, block: B:140:0x0271  */
    /* JADX WARN: Code duplicated, block: B:142:0x027f  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:146:0x033e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0358  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x0121  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: ChoicePill-UdaoDFU, reason: not valid java name */
    public static final void m481ChoicePillUdaoDFU(final boolean z10, @Nullable Function1<? super String, Unit> function1, @NotNull final String text, long j10, float f10, long j11, @Nullable v0 v0Var, long j12, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function1<? super String, Unit> function2;
        int i13;
        int i14;
        int i15;
        int i16;
        float fR;
        int i17;
        int i18;
        long j13;
        int i19;
        int i20;
        v0 v0VarM;
        int i21;
        long jA;
        long jW;
        long jM729generateTextColor8_81llA;
        final Function1<? super String, Unit> function3;
        float f11;
        int i22;
        long j14;
        androidx.compose.ui.a0.a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objI0;
        androidx.compose.ui.e.a aVar2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        y5 y5Var;
        int i23;
        long j15;
        androidx.compose.runtime.c0 c0Var2;
        final Function1<? super String, Unit> function4;
        final v0 v0Var2;
        final long j16;
        final float f12;
        final long j17;
        final long j18;
        s5 s5VarT;
        int i24;
        Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(418926179);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 2;
        if (i25 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                function2 = function1;
                i12 |= c0VarR.k0(function2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= a5.S0;
            } else if ((i10 & 896) == 0) {
                if (c0VarR.D(text)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    if (c0VarR.L(j10)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((57344 & i10) == 0) {
                        fR = f10;
                        if (c0VarR.I(fR)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        j13 = j11;
                    } else {
                        j13 = j11;
                        if ((i10 & 458752) == 0) {
                            if (c0VarR.L(j13)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    i20 = i11 & 64;
                    if (i20 != 0) {
                        i12 |= 1572864;
                        v0VarM = v0Var;
                    } else {
                        v0VarM = v0Var;
                        if ((i10 & 3670016) == 0) {
                            if (c0VarR.D(v0VarM)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i10 & 29360128) != 0) {
                        if ((i11 & 128) == 0 || !c0VarR.L(j12)) {
                            i24 = 4194304;
                        } else {
                            i24 = 8388608;
                        }
                        i12 |= i24;
                    }
                    if ((23967451 & i12) == 4793490 || !c0VarR.d()) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i25 != 0) {
                                function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                    }
                                };
                            }
                            if (i14 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j10;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i18 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j13;
                            }
                            if (i20 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 128) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -29360129;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            function3 = function2;
                            f11 = fR;
                            i22 = i12;
                            j14 = jA;
                        } else {
                            c0VarR.u();
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            function3 = function2;
                            jW = j13;
                            f11 = fR;
                            jM729generateTextColor8_81llA = j12;
                            i22 = i12;
                            j14 = j10;
                        }
                        c0VarR.Z();
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i26 = IntercomTheme.$stable;
                        androidx.compose.foundation.shape.e eVarM = intercomTheme.getShapes(c0VarR, i26).m();
                        v0 v0Var3 = v0VarM;
                        aVar = androidx.compose.ui.a0.E;
                        long j19 = jW;
                        androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM), eVarM), j19, null, 2, null);
                        c0VarR.E(-8583674);
                        if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i22 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objI0 = c0VarR.i0();
                        if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarR = d5.r(i1.j(a0VarD, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                        androidx.compose.foundation.layout.q.f fVarS = androidx.compose.foundation.layout.q.f16330a.s();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        Function1<? super String, Unit> function5 = function3;
                        a1 a1VarE = u5.e(fVarS, aVar2.w(), c0VarR, 6);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarR);
                        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                        function0A = aVar3.a();
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
                        float f13 = f11;
                        y7.n(c0VarD, a1VarE, aVar3.e());
                        y7.n(c0VarD, b1VarK, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar3.f());
                        y5Var = y5.f16577a;
                        long j20 = j14;
                        i23 = i22;
                        j15 = jM729generateTextColor8_81llA;
                        q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i26).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                        c0VarR.E(2120583720);
                        if (z10) {
                            ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        function4 = function5;
                        v0Var2 = v0Var3;
                        j16 = j19;
                        f12 = f13;
                        j17 = j15;
                        j18 = j20;
                    } else {
                        c0VarR.u();
                        c0Var2 = c0VarR;
                        function4 = function2;
                        f12 = fR;
                        j18 = j10;
                        v0Var2 = v0VarM;
                        j16 = j13;
                        j17 = j12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, function4, text, j18, f12, j16, v0Var2, j17, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                fR = f10;
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    j13 = j11;
                } else {
                    j13 = j11;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.L(j13)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                    v0VarM = v0Var;
                } else {
                    v0VarM = v0Var;
                    if ((i10 & 3670016) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                if ((23967451 & i12) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    } else {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    }
                    c0VarR.Z();
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i27 = IntercomTheme.$stable;
                    androidx.compose.foundation.shape.e eVarM2 = intercomTheme2.getShapes(c0VarR, i27).m();
                    v0 v0Var4 = v0VarM;
                    aVar = androidx.compose.ui.a0.E;
                    long j110 = jW;
                    androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM2), eVarM2), j110, null, 2, null);
                    c0VarR.E(-8583674);
                    if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarR2 = d5.r(i1.j(a0VarD2, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                    androidx.compose.foundation.layout.q.f fVarS2 = androidx.compose.foundation.layout.q.f16330a.s();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    Function1<? super String, Unit> function6 = function3;
                    a1 a1VarE2 = u5.e(fVarS2, aVar2.w(), c0VarR, 6);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarR2);
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
                    float f14 = f11;
                    y7.n(c0VarD, a1VarE2, aVar4.e());
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
                    y5Var = y5.f16577a;
                    long j21 = j14;
                    i23 = i22;
                    j15 = jM729generateTextColor8_81llA;
                    q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c0VarR, i27).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                    c0VarR.E(2120583720);
                    if (z10) {
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    function4 = function6;
                    v0Var2 = v0Var4;
                    j16 = j110;
                    f12 = f14;
                    j17 = j15;
                    j18 = j21;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    } else {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    }
                    c0VarR.Z();
                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                    int i28 = IntercomTheme.$stable;
                    androidx.compose.foundation.shape.e eVarM3 = intercomTheme3.getShapes(c0VarR, i28).m();
                    v0 v0Var5 = v0VarM;
                    aVar = androidx.compose.ui.a0.E;
                    long j111 = jW;
                    androidx.compose.ui.a0 a0VarD3 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM3), eVarM3), j111, null, 2, null);
                    c0VarR.E(-8583674);
                    if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarR3 = d5.r(i1.j(a0VarD3, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                    androidx.compose.foundation.layout.q.f fVarS3 = androidx.compose.foundation.layout.q.f16330a.s();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    Function1<? super String, Unit> function7 = function3;
                    a1 a1VarE3 = u5.e(fVarS3, aVar2.w(), c0VarR, 6);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarR3);
                    androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                    function0A = aVar5.a();
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
                    float f15 = f11;
                    y7.n(c0VarD, a1VarE3, aVar5.e());
                    y7.n(c0VarD, b1VarK3, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN3, aVar5.f());
                    y5Var = y5.f16577a;
                    long j22 = j14;
                    i23 = i22;
                    j15 = jM729generateTextColor8_81llA;
                    q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var5, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0VarR, i28).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                    c0VarR.E(2120583720);
                    if (z10) {
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    function4 = function7;
                    v0Var2 = v0Var5;
                    j16 = j111;
                    f12 = f15;
                    j17 = j15;
                    j18 = j22;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, function4, text, j18, f12, j16, v0Var2, j17, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((57344 & i10) == 0) {
                    fR = f10;
                    if (c0VarR.I(fR)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    j13 = j11;
                } else {
                    j13 = j11;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.L(j13)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                    v0VarM = v0Var;
                } else {
                    v0VarM = v0Var;
                    if ((i10 & 3670016) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                if ((23967451 & i12) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    } else {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    }
                    c0VarR.Z();
                    IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                    int i29 = IntercomTheme.$stable;
                    androidx.compose.foundation.shape.e eVarM4 = intercomTheme4.getShapes(c0VarR, i29).m();
                    v0 v0Var6 = v0VarM;
                    aVar = androidx.compose.ui.a0.E;
                    long j112 = jW;
                    androidx.compose.ui.a0 a0VarD4 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM4), eVarM4), j112, null, 2, null);
                    c0VarR.E(-8583674);
                    if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarR4 = d5.r(i1.j(a0VarD4, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                    androidx.compose.foundation.layout.q.f fVarS4 = androidx.compose.foundation.layout.q.f16330a.s();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    Function1<? super String, Unit> function8 = function3;
                    a1 a1VarE4 = u5.e(fVarS4, aVar2.w(), c0VarR, 6);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarR4);
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
                    float f16 = f11;
                    y7.n(c0VarD, a1VarE4, aVar6.e());
                    y7.n(c0VarD, b1VarK4, aVar6.g());
                    function2B = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN4, aVar6.f());
                    y5Var = y5.f16577a;
                    long j23 = j14;
                    i23 = i22;
                    j15 = jM729generateTextColor8_81llA;
                    q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var6, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme4.getTypography(c0VarR, i29).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                    c0VarR.E(2120583720);
                    if (z10) {
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    function4 = function8;
                    v0Var2 = v0Var6;
                    j16 = j112;
                    f12 = f16;
                    j17 = j15;
                    j18 = j23;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    } else {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    }
                    c0VarR.Z();
                    IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                    int i210 = IntercomTheme.$stable;
                    androidx.compose.foundation.shape.e eVarM5 = intercomTheme5.getShapes(c0VarR, i210).m();
                    v0 v0Var7 = v0VarM;
                    aVar = androidx.compose.ui.a0.E;
                    long j113 = jW;
                    androidx.compose.ui.a0 a0VarD5 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM5), eVarM5), j113, null, 2, null);
                    c0VarR.E(-8583674);
                    if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarR5 = d5.r(i1.j(a0VarD5, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                    androidx.compose.foundation.layout.q.f fVarS5 = androidx.compose.foundation.layout.q.f16330a.s();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    Function1<? super String, Unit> function9 = function3;
                    a1 a1VarE5 = u5.e(fVarS5, aVar2.w(), c0VarR, 6);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarR5);
                    androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                    function0A = aVar7.a();
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
                    float f17 = f11;
                    y7.n(c0VarD, a1VarE5, aVar7.e());
                    y7.n(c0VarD, b1VarK5, aVar7.g());
                    function2B = aVar7.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN5, aVar7.f());
                    y5Var = y5.f16577a;
                    long j24 = j14;
                    i23 = i22;
                    j15 = jM729generateTextColor8_81llA;
                    q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var7, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme5.getTypography(c0VarR, i210).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                    c0VarR.E(2120583720);
                    if (z10) {
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    function4 = function9;
                    v0Var2 = v0Var7;
                    j16 = j113;
                    f12 = f17;
                    j17 = j15;
                    j18 = j24;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, function4, text, j18, f12, j16, v0Var2, j17, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            fR = f10;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                j13 = j11;
            } else {
                j13 = j11;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.L(j13)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
                v0VarM = v0Var;
            } else {
                v0VarM = v0Var;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.D(v0VarM)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            if ((23967451 & i12) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                } else {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                }
                c0VarR.Z();
                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                int i211 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM6 = intercomTheme6.getShapes(c0VarR, i211).m();
                v0 v0Var8 = v0VarM;
                aVar = androidx.compose.ui.a0.E;
                long j114 = jW;
                androidx.compose.ui.a0 a0VarD6 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM6), eVarM6), j114, null, 2, null);
                c0VarR.E(-8583674);
                if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objI0 = c0VarR.i0();
                if (z13) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarR6 = d5.r(i1.j(a0VarD6, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                androidx.compose.foundation.layout.q.f fVarS6 = androidx.compose.foundation.layout.q.f16330a.s();
                aVar2 = androidx.compose.ui.e.f37317a;
                Function1<? super String, Unit> function10 = function3;
                a1 a1VarE6 = u5.e(fVarS6, aVar2.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarR6);
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
                float f18 = f11;
                y7.n(c0VarD, a1VarE6, aVar8.e());
                y7.n(c0VarD, b1VarK6, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN6, aVar8.f());
                y5Var = y5.f16577a;
                long j25 = j14;
                i23 = i22;
                j15 = jM729generateTextColor8_81llA;
                q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var8, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme6.getTypography(c0VarR, i211).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                c0VarR.E(2120583720);
                if (z10) {
                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                function4 = function10;
                v0Var2 = v0Var8;
                j16 = j114;
                f12 = f18;
                j17 = j15;
                j18 = j25;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                } else {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                }
                c0VarR.Z();
                IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                int i212 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM7 = intercomTheme7.getShapes(c0VarR, i212).m();
                v0 v0Var9 = v0VarM;
                aVar = androidx.compose.ui.a0.E;
                long j115 = jW;
                androidx.compose.ui.a0 a0VarD7 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM7), eVarM7), j115, null, 2, null);
                c0VarR.E(-8583674);
                if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objI0 = c0VarR.i0();
                if (z13) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarR7 = d5.r(i1.j(a0VarD7, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                androidx.compose.foundation.layout.q.f fVarS7 = androidx.compose.foundation.layout.q.f16330a.s();
                aVar2 = androidx.compose.ui.e.f37317a;
                Function1<? super String, Unit> function11 = function3;
                a1 a1VarE7 = u5.e(fVarS7, aVar2.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarR7);
                androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                function0A = aVar9.a();
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
                float f19 = f11;
                y7.n(c0VarD, a1VarE7, aVar9.e());
                y7.n(c0VarD, b1VarK7, aVar9.g());
                function2B = aVar9.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN7, aVar9.f());
                y5Var = y5.f16577a;
                long j26 = j14;
                i23 = i22;
                j15 = jM729generateTextColor8_81llA;
                q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var9, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme7.getTypography(c0VarR, i212).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                c0VarR.E(2120583720);
                if (z10) {
                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                function4 = function11;
                v0Var2 = v0Var9;
                j16 = j115;
                f12 = f19;
                j17 = j15;
                j18 = j26;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, function4, text, j18, f12, j16, v0Var2, j17, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function2 = function1;
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            if (c0VarR.D(text)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                if (c0VarR.L(j10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((57344 & i10) == 0) {
                    fR = f10;
                    if (c0VarR.I(fR)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    j13 = j11;
                } else {
                    j13 = j11;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.L(j13)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                    v0VarM = v0Var;
                } else {
                    v0VarM = v0Var;
                    if ((i10 & 3670016) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                if ((23967451 & i12) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    } else {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    }
                    c0VarR.Z();
                    IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                    int i213 = IntercomTheme.$stable;
                    androidx.compose.foundation.shape.e eVarM8 = intercomTheme8.getShapes(c0VarR, i213).m();
                    v0 v0Var10 = v0VarM;
                    aVar = androidx.compose.ui.a0.E;
                    long j116 = jW;
                    androidx.compose.ui.a0 a0VarD8 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM8), eVarM8), j116, null, 2, null);
                    c0VarR.E(-8583674);
                    if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarR8 = d5.r(i1.j(a0VarD8, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                    androidx.compose.foundation.layout.q.f fVarS8 = androidx.compose.foundation.layout.q.f16330a.s();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    Function1<? super String, Unit> function12 = function3;
                    a1 a1VarE8 = u5.e(fVarS8, aVar2.w(), c0VarR, 6);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarR8);
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
                    float f110 = f11;
                    y7.n(c0VarD, a1VarE8, aVar10.e());
                    y7.n(c0VarD, b1VarK8, aVar10.g());
                    function2B = aVar10.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN8, aVar10.f());
                    y5Var = y5.f16577a;
                    long j27 = j14;
                    i23 = i22;
                    j15 = jM729generateTextColor8_81llA;
                    q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var10, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme8.getTypography(c0VarR, i213).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                    c0VarR.E(2120583720);
                    if (z10) {
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    function4 = function12;
                    v0Var2 = v0Var10;
                    j16 = j116;
                    f12 = f110;
                    j17 = j15;
                    j18 = j27;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    } else {
                        if (i25 != 0) {
                            function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                }
                            };
                        }
                        if (i14 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j10;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i18 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j13;
                        }
                        if (i20 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 128) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -29360129;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        function3 = function2;
                        f11 = fR;
                        i22 = i12;
                        j14 = jA;
                    }
                    c0VarR.Z();
                    IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                    int i214 = IntercomTheme.$stable;
                    androidx.compose.foundation.shape.e eVarM9 = intercomTheme9.getShapes(c0VarR, i214).m();
                    v0 v0Var11 = v0VarM;
                    aVar = androidx.compose.ui.a0.E;
                    long j117 = jW;
                    androidx.compose.ui.a0 a0VarD9 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM9), eVarM9), j117, null, 2, null);
                    c0VarR.E(-8583674);
                    if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarR9 = d5.r(i1.j(a0VarD9, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                    androidx.compose.foundation.layout.q.f fVarS9 = androidx.compose.foundation.layout.q.f16330a.s();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    Function1<? super String, Unit> function13 = function3;
                    a1 a1VarE9 = u5.e(fVarS9, aVar2.w(), c0VarR, 6);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarR9);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    function0A = aVar11.a();
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
                    float f111 = f11;
                    y7.n(c0VarD, a1VarE9, aVar11.e());
                    y7.n(c0VarD, b1VarK9, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN9, aVar11.f());
                    y5Var = y5.f16577a;
                    long j28 = j14;
                    i23 = i22;
                    j15 = jM729generateTextColor8_81llA;
                    q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var11, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme9.getTypography(c0VarR, i214).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                    c0VarR.E(2120583720);
                    if (z10) {
                        ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    function4 = function13;
                    v0Var2 = v0Var11;
                    j16 = j117;
                    f12 = f111;
                    j17 = j15;
                    j18 = j28;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, function4, text, j18, f12, j16, v0Var2, j17, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            fR = f10;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                j13 = j11;
            } else {
                j13 = j11;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.L(j13)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
                v0VarM = v0Var;
            } else {
                v0VarM = v0Var;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.D(v0VarM)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            if ((23967451 & i12) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                } else {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                }
                c0VarR.Z();
                IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                int i215 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM10 = intercomTheme10.getShapes(c0VarR, i215).m();
                v0 v0Var12 = v0VarM;
                aVar = androidx.compose.ui.a0.E;
                long j118 = jW;
                androidx.compose.ui.a0 a0VarD10 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM10), eVarM10), j118, null, 2, null);
                c0VarR.E(-8583674);
                if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objI0 = c0VarR.i0();
                if (z13) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarR10 = d5.r(i1.j(a0VarD10, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                androidx.compose.foundation.layout.q.f fVarS10 = androidx.compose.foundation.layout.q.f16330a.s();
                aVar2 = androidx.compose.ui.e.f37317a;
                Function1<? super String, Unit> function14 = function3;
                a1 a1VarE10 = u5.e(fVarS10, aVar2.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarR10);
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
                float f112 = f11;
                y7.n(c0VarD, a1VarE10, aVar12.e());
                y7.n(c0VarD, b1VarK10, aVar12.g());
                function2B = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN10, aVar12.f());
                y5Var = y5.f16577a;
                long j29 = j14;
                i23 = i22;
                j15 = jM729generateTextColor8_81llA;
                q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var12, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme10.getTypography(c0VarR, i215).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                c0VarR.E(2120583720);
                if (z10) {
                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                function4 = function14;
                v0Var2 = v0Var12;
                j16 = j118;
                f12 = f112;
                j17 = j15;
                j18 = j29;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                } else {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                }
                c0VarR.Z();
                IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                int i216 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM11 = intercomTheme11.getShapes(c0VarR, i216).m();
                v0 v0Var13 = v0VarM;
                aVar = androidx.compose.ui.a0.E;
                long j119 = jW;
                androidx.compose.ui.a0 a0VarD11 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM11), eVarM11), j119, null, 2, null);
                c0VarR.E(-8583674);
                if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objI0 = c0VarR.i0();
                if (z13) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarR11 = d5.r(i1.j(a0VarD11, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                androidx.compose.foundation.layout.q.f fVarS11 = androidx.compose.foundation.layout.q.f16330a.s();
                aVar2 = androidx.compose.ui.e.f37317a;
                Function1<? super String, Unit> function15 = function3;
                a1 a1VarE11 = u5.e(fVarS11, aVar2.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarR11);
                androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                function0A = aVar13.a();
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
                float f113 = f11;
                y7.n(c0VarD, a1VarE11, aVar13.e());
                y7.n(c0VarD, b1VarK11, aVar13.g());
                function2B = aVar13.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11, aVar13.f());
                y5Var = y5.f16577a;
                long j210 = j14;
                i23 = i22;
                j15 = jM729generateTextColor8_81llA;
                q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var13, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11.getTypography(c0VarR, i216).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                c0VarR.E(2120583720);
                if (z10) {
                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                function4 = function15;
                v0Var2 = v0Var13;
                j16 = j119;
                f12 = f113;
                j17 = j15;
                j18 = j210;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, function4, text, j18, f12, j16, v0Var2, j17, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((57344 & i10) == 0) {
                fR = f10;
                if (c0VarR.I(fR)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                j13 = j11;
            } else {
                j13 = j11;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.L(j13)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
                v0VarM = v0Var;
            } else {
                v0VarM = v0Var;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.D(v0VarM)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            if ((23967451 & i12) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                } else {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                }
                c0VarR.Z();
                IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                int i217 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM12 = intercomTheme12.getShapes(c0VarR, i217).m();
                v0 v0Var14 = v0VarM;
                aVar = androidx.compose.ui.a0.E;
                long j1110 = jW;
                androidx.compose.ui.a0 a0VarD12 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM12), eVarM12), j1110, null, 2, null);
                c0VarR.E(-8583674);
                if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objI0 = c0VarR.i0();
                if (z13) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarR12 = d5.r(i1.j(a0VarD12, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                androidx.compose.foundation.layout.q.f fVarS12 = androidx.compose.foundation.layout.q.f16330a.s();
                aVar2 = androidx.compose.ui.e.f37317a;
                Function1<? super String, Unit> function16 = function3;
                a1 a1VarE12 = u5.e(fVarS12, aVar2.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarR12);
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
                float f114 = f11;
                y7.n(c0VarD, a1VarE12, aVar14.e());
                y7.n(c0VarD, b1VarK12, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN12, aVar14.f());
                y5Var = y5.f16577a;
                long j211 = j14;
                i23 = i22;
                j15 = jM729generateTextColor8_81llA;
                q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var14, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme12.getTypography(c0VarR, i217).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                c0VarR.E(2120583720);
                if (z10) {
                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                function4 = function16;
                v0Var2 = v0Var14;
                j16 = j1110;
                f12 = f114;
                j17 = j15;
                j18 = j211;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                } else {
                    if (i25 != 0) {
                        function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                            }
                        };
                    }
                    if (i14 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j10;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i18 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j13;
                    }
                    if (i20 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 128) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -29360129;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    function3 = function2;
                    f11 = fR;
                    i22 = i12;
                    j14 = jA;
                }
                c0VarR.Z();
                IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                int i218 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM13 = intercomTheme13.getShapes(c0VarR, i218).m();
                v0 v0Var15 = v0VarM;
                aVar = androidx.compose.ui.a0.E;
                long j1111 = jW;
                androidx.compose.ui.a0 a0VarD13 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM13), eVarM13), j1111, null, 2, null);
                c0VarR.E(-8583674);
                if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objI0 = c0VarR.i0();
                if (z13) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarR13 = d5.r(i1.j(a0VarD13, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
                androidx.compose.foundation.layout.q.f fVarS13 = androidx.compose.foundation.layout.q.f16330a.s();
                aVar2 = androidx.compose.ui.e.f37317a;
                Function1<? super String, Unit> function17 = function3;
                a1 a1VarE13 = u5.e(fVarS13, aVar2.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarR13);
                androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                function0A = aVar15.a();
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
                float f115 = f11;
                y7.n(c0VarD, a1VarE13, aVar15.e());
                y7.n(c0VarD, b1VarK13, aVar15.g());
                function2B = aVar15.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN13, aVar15.f());
                y5Var = y5.f16577a;
                long j212 = j14;
                i23 = i22;
                j15 = jM729generateTextColor8_81llA;
                q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var15, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme13.getTypography(c0VarR, i218).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
                c0VarR.E(2120583720);
                if (z10) {
                    ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                function4 = function17;
                v0Var2 = v0Var15;
                j16 = j1111;
                f12 = f115;
                j17 = j15;
                j18 = j212;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, function4, text, j18, f12, j16, v0Var2, j17, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        fR = f10;
        i18 = i11 & 32;
        if (i18 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            j13 = j11;
        } else {
            j13 = j11;
            if ((i10 & 458752) == 0) {
                if (c0VarR.L(j13)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
        }
        i20 = i11 & 64;
        if (i20 != 0) {
            i12 |= 1572864;
            v0VarM = v0Var;
        } else {
            v0VarM = v0Var;
            if ((i10 & 3670016) == 0) {
                if (c0VarR.D(v0VarM)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
        }
        if ((i10 & 29360128) != 0) {
            if ((i11 & 128) == 0) {
                i24 = 4194304;
            } else {
                i24 = 4194304;
            }
            i12 |= i24;
        }
        if ((23967451 & i12) == 4793490) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                        }
                    };
                }
                if (i14 != 0) {
                    jA = q0.f38131b.a();
                } else {
                    jA = j10;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i18 != 0) {
                    jW = q0.f38131b.w();
                } else {
                    jW = j13;
                }
                if (i20 != 0) {
                    v0VarM = v0.f41742b.m();
                }
                if ((i11 & 128) != 0) {
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    i12 &= -29360129;
                } else {
                    jM729generateTextColor8_81llA = j12;
                }
                function3 = function2;
                f11 = fR;
                i22 = i12;
                j14 = jA;
            } else {
                if (i25 != 0) {
                    function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                        }
                    };
                }
                if (i14 != 0) {
                    jA = q0.f38131b.a();
                } else {
                    jA = j10;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i18 != 0) {
                    jW = q0.f38131b.w();
                } else {
                    jW = j13;
                }
                if (i20 != 0) {
                    v0VarM = v0.f41742b.m();
                }
                if ((i11 & 128) != 0) {
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    i12 &= -29360129;
                } else {
                    jM729generateTextColor8_81llA = j12;
                }
                function3 = function2;
                f11 = fR;
                i22 = i12;
                j14 = jA;
            }
            c0VarR.Z();
            IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
            int i219 = IntercomTheme.$stable;
            androidx.compose.foundation.shape.e eVarM14 = intercomTheme14.getShapes(c0VarR, i219).m();
            v0 v0Var16 = v0VarM;
            aVar = androidx.compose.ui.a0.E;
            long j1112 = jW;
            androidx.compose.ui.a0 a0VarD14 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM14), eVarM14), j1112, null, 2, null);
            c0VarR.E(-8583674);
            if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i22 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z11 | z12;
            objI0 = c0VarR.i0();
            if (z13) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarR14 = d5.r(i1.j(a0VarD14, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
            androidx.compose.foundation.layout.q.f fVarS14 = androidx.compose.foundation.layout.q.f16330a.s();
            aVar2 = androidx.compose.ui.e.f37317a;
            Function1<? super String, Unit> function18 = function3;
            a1 a1VarE14 = u5.e(fVarS14, aVar2.w(), c0VarR, 6);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarR14);
            androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
            function0A = aVar16.a();
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
            float f116 = f11;
            y7.n(c0VarD, a1VarE14, aVar16.e());
            y7.n(c0VarD, b1VarK14, aVar16.g());
            function2B = aVar16.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN14, aVar16.f());
            y5Var = y5.f16577a;
            long j213 = j14;
            i23 = i22;
            j15 = jM729generateTextColor8_81llA;
            q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var16, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme14.getTypography(c0VarR, i219).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
            c0VarR.E(2120583720);
            if (z10) {
                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                c0Var2 = c0VarR;
            } else {
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            c0Var2.o();
            function4 = function18;
            v0Var2 = v0Var16;
            j16 = j1112;
            f12 = f116;
            j17 = j15;
            j18 = j213;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                        }
                    };
                }
                if (i14 != 0) {
                    jA = q0.f38131b.a();
                } else {
                    jA = j10;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i18 != 0) {
                    jW = q0.f38131b.w();
                } else {
                    jW = j13;
                }
                if (i20 != 0) {
                    v0VarM = v0.f41742b.m();
                }
                if ((i11 & 128) != 0) {
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    i12 &= -29360129;
                } else {
                    jM729generateTextColor8_81llA = j12;
                }
                function3 = function2;
                f11 = fR;
                i22 = i12;
                j14 = jA;
            } else {
                if (i25 != 0) {
                    function2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                        }
                    };
                }
                if (i14 != 0) {
                    jA = q0.f38131b.a();
                } else {
                    jA = j10;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i18 != 0) {
                    jW = q0.f38131b.w();
                } else {
                    jW = j13;
                }
                if (i20 != 0) {
                    v0VarM = v0.f41742b.m();
                }
                if ((i11 & 128) != 0) {
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    i12 &= -29360129;
                } else {
                    jM729generateTextColor8_81llA = j12;
                }
                function3 = function2;
                f11 = fR;
                i22 = i12;
                j14 = jA;
            }
            c0VarR.Z();
            IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
            int i2110 = IntercomTheme.$stable;
            androidx.compose.foundation.shape.e eVarM15 = intercomTheme15.getShapes(c0VarR, i2110).m();
            v0 v0Var17 = v0VarM;
            aVar = androidx.compose.ui.a0.E;
            long j1113 = jW;
            androidx.compose.ui.a0 a0VarD15 = androidx.compose.foundation.v.d(androidx.compose.ui.draw.j.a(t0.g(i6.h(aVar, 0.0f, 1, null), b1.a(f11, j14), eVarM15), eVarM15), j1113, null, 2, null);
            c0VarR.E(-8583674);
            if ((i22 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i22 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z11 | z12;
            objI0 = c0VarR.i0();
            if (z13) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(function3, text);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarR15 = d5.r(i1.j(a0VarD15, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(16));
            androidx.compose.foundation.layout.q.f fVarS15 = androidx.compose.foundation.layout.q.f16330a.s();
            aVar2 = androidx.compose.ui.e.f37317a;
            Function1<? super String, Unit> function19 = function3;
            a1 a1VarE15 = u5.e(fVarS15, aVar2.w(), c0VarR, 6);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarR15);
            androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
            function0A = aVar17.a();
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
            float f117 = f11;
            y7.n(c0VarD, a1VarE15, aVar17.e());
            y7.n(c0VarD, b1VarK15, aVar17.g());
            function2B = aVar17.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN15, aVar17.f());
            y5Var = y5.f16577a;
            long j214 = j14;
            i23 = i22;
            j15 = jM729generateTextColor8_81llA;
            q50.t(text, y5Var.n(i6.g(aVar, 0.85f), aVar2.q()), j15, null, 0L, null, v0Var17, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme15.getTypography(c0VarR, i2110).getType04(), c0VarR, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | (i22 & 3670016), 0, 131000);
            c0VarR.E(2120583720);
            if (z10) {
                ni.o(u0.e.c(R.drawable.intercom_attribute_verified_tick, c0VarR, 0), u0.i.d(d0.c.f37161m, c0VarR, 0), y5Var.n(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.q()), j15, c0VarR, ((i23 >> 12) & 7168) | 8, 0);
                c0Var2 = c0VarR;
            } else {
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            c0Var2.o();
            function4 = function19;
            v0Var2 = v0Var17;
            j16 = j1113;
            f12 = f117;
            j17 = j15;
            j18 = j214;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, function4, text, j18, f12, j16, v0Var2, j17, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChoicePill_UdaoDFU$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChoicePill_UdaoDFU$lambda$2$lambda$1(Function1 function1, String text) {
        Intrinsics.checkNotNullParameter(text, "$text");
        function1.invoke(text);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChoicePill_UdaoDFU$lambda$4(boolean z10, Function1 function1, String text, long j10, float f10, long j11, v0 v0Var, long j12, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        m481ChoicePillUdaoDFU(z10, function1, text, j10, f10, j11, v0Var, j12, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyPill(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1274080153);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m482getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChoicePillKt.EmptyPill$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyPill$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        EmptyPill(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void SelectedPill(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1118291055);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m483getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChoicePillKt.SelectedPill$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPill$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SelectedPill(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void SelectedPillDark(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-774877671);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m484getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChoicePillKt.SelectedPillDark$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPillDark$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SelectedPillDark(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(fontScale = 2.0f)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void SelectedPillLongBigText(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1982481602);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            SelectedPillLongText(c0VarR, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChoicePillKt.SelectedPillLongBigText$lambda$9(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPillLongBigText$lambda$9(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SelectedPillLongBigText(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void SelectedPillLongText(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(173524454);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m485getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChoicePillKt.SelectedPillLongText$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPillLongText$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SelectedPillLongText(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
