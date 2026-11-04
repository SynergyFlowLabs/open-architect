package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.u7;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ei;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomTopBar.kt\nio/intercom/android/sdk/ui/component/IntercomTopBarKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,160:1\n87#2:161\n83#2,10:162\n87#2,6:248\n94#2:284\n94#2:333\n80#3,6:172\n87#3,3:187\n90#3,2:196\n80#3,6:217\n87#3,3:232\n90#3,2:241\n80#3,6:254\n87#3,3:269\n90#3,2:278\n94#3:283\n80#3,6:295\n87#3,3:310\n90#3,2:319\n94#3:324\n94#3:328\n94#3:332\n391#4,9:178\n400#4:198\n391#4,9:223\n400#4:243\n391#4,9:260\n400#4,3:280\n391#4,9:301\n400#4,3:321\n401#4,2:326\n401#4,2:330\n4360#5,6:190\n4360#5,6:235\n4360#5,6:272\n4360#5,6:313\n113#6:199\n113#6:200\n113#6:244\n113#6:246\n113#6:247\n1282#7,6:201\n70#8:207\n67#8,9:208\n77#8:329\n49#9:245\n99#10:285\n96#10,9:286\n106#10:325\n*S KotlinDebug\n*F\n+ 1 IntercomTopBar.kt\nio/intercom/android/sdk/ui/component/IntercomTopBarKt\n*L\n44#1:161\n44#1:162,10\n62#1:248,6\n62#1:284\n44#1:333\n44#1:172,6\n44#1:187,3\n44#1:196,2\n45#1:217,6\n45#1:232,3\n45#1:241,2\n62#1:254,6\n62#1:269,3\n62#1:278,2\n62#1:283\n94#1:295,6\n94#1:310,3\n94#1:319,2\n94#1:324\n45#1:328\n44#1:332\n44#1:178,9\n44#1:198\n45#1:223,9\n45#1:243\n62#1:260,9\n62#1:280,3\n94#1:301,9\n94#1:321,3\n45#1:326,2\n44#1:330,2\n44#1:190,6\n45#1:235,6\n62#1:272,6\n94#1:313,6\n50#1:199\n51#1:200\n57#1:244\n59#1:246\n61#1:247\n52#1:201,6\n45#1:207\n45#1:208,9\n45#1:329\n57#1:245\n94#1:285\n94#1:286,9\n94#1:325\n*E\n"})
public final class IntercomTopBarKt {
    /* JADX WARN: Code duplicated, block: B:105:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x015d  */
    /* JADX WARN: Code duplicated, block: B:109:0x015f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0166  */
    /* JADX WARN: Code duplicated, block: B:114:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0173  */
    /* JADX WARN: Code duplicated, block: B:120:0x0183  */
    /* JADX WARN: Code duplicated, block: B:121:0x0190  */
    /* JADX WARN: Code duplicated, block: B:123:0x0194  */
    /* JADX WARN: Code duplicated, block: B:124:0x019a  */
    /* JADX WARN: Code duplicated, block: B:126:0x019e  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:137:0x0212  */
    /* JADX WARN: Code duplicated, block: B:139:0x0220  */
    /* JADX WARN: Code duplicated, block: B:142:0x0277  */
    /* JADX WARN: Code duplicated, block: B:143:0x0279  */
    /* JADX WARN: Code duplicated, block: B:146:0x0280  */
    /* JADX WARN: Code duplicated, block: B:148:0x0288  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:158:0x030c  */
    /* JADX WARN: Code duplicated, block: B:160:0x031a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0335  */
    /* JADX WARN: Code duplicated, block: B:166:0x0351  */
    /* JADX WARN: Code duplicated, block: B:169:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:178:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:181:0x0415  */
    /* JADX WARN: Code duplicated, block: B:182:0x0495  */
    /* JADX WARN: Code duplicated, block: B:185:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:189:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:191:0x053b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0547  */
    /* JADX WARN: Code duplicated, block: B:195:0x054b  */
    /* JADX WARN: Code duplicated, block: B:198:0x056a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0578  */
    /* JADX WARN: Code duplicated, block: B:205:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0129  */
    /* JADX WARN: Code duplicated, block: B:95:0x0137  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: IntercomTopBar-bogVsAg, reason: not valid java name */
    public static final void m608IntercomTopBarbogVsAg(@Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable IntercomTopBarIcon intercomTopBarIcon, @Nullable androidx.compose.ui.e.b bVar, long j10, long j11, @Nullable Function0<Unit> function0, @Nullable pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        int i13;
        final IntercomTopBarIcon intercomTopBarIcon2;
        int i14;
        int i15;
        androidx.compose.ui.e.b bVar2;
        int i16;
        long jM704getHeader0d7_KjU;
        int i17;
        Function0<Unit> function1;
        int i18;
        int i19;
        int i20;
        String str2;
        androidx.compose.ui.e.b bVarU;
        long jM711getOnHeader0d7_KjU;
        final Function0<Unit> function2;
        final long j12;
        String str3;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        androidx.compose.ui.a0.a aVar;
        androidx.compose.foundation.layout.q qVar;
        androidx.compose.ui.e.a aVar2;
        int iHashCode;
        androidx.compose.ui.node.g.a aVar3;
        int i21;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z10;
        Object objI0;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        androidx.compose.foundation.layout.d0 d0Var;
        int i22;
        float fR;
        int i23;
        int iHashCode3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0Var3;
        final IntercomTopBarIcon intercomTopBarIcon3;
        final String str4;
        final long j13;
        final long j14;
        final androidx.compose.ui.e.b bVar3;
        final pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        final androidx.compose.ui.a0 a0Var3;
        int iHashCode4;
        Function0<androidx.compose.ui.node.g> function0A4;
        androidx.compose.runtime.c0 c0VarD4;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4;
        s5 s5VarT;
        int i24;
        int i25;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(832461575);
        int i26 = i11 & 1;
        if (i26 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i27 = i11 & 2;
        if (i27 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                i12 |= c0VarR.D(str) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    intercomTopBarIcon2 = intercomTopBarIcon;
                    if (c0VarR.D(intercomTopBarIcon2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        bVar2 = bVar;
                        if (c0VarR.D(bVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) == 0) {
                        jM704getHeader0d7_KjU = j10;
                        if ((i11 & 16) == 0 || !c0VarR.L(jM704getHeader0d7_KjU)) {
                            i25 = 8192;
                        } else {
                            i25 = 16384;
                        }
                        i12 |= i25;
                    } else {
                        jM704getHeader0d7_KjU = j10;
                    }
                    if ((458752 & i10) != 0) {
                        if ((i11 & 32) == 0 || !c0VarR.L(j11)) {
                            i24 = 65536;
                        } else {
                            i24 = 131072;
                        }
                        i12 |= i24;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        function1 = function0;
                    } else {
                        function1 = function0;
                        if ((i10 & 3670016) == 0) {
                            if (c0VarR.k0(function1)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        if ((i10 & 29360128) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 23967451) == 4793490 || !c0VarR.d()) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i26 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i27 != 0) {
                                    str2 = null;
                                } else {
                                    str2 = str;
                                }
                                if (i13 != 0) {
                                    intercomTopBarIcon2 = null;
                                }
                                if (i15 != 0) {
                                    bVarU = androidx.compose.ui.e.f37317a.u();
                                } else {
                                    bVarU = bVar2;
                                }
                                if ((i11 & 16) != 0) {
                                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                    i12 &= -458753;
                                } else {
                                    jM711getOnHeader0d7_KjU = j11;
                                }
                                if (i17 != 0) {
                                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.f312394a;
                                        }
                                    };
                                } else {
                                    function2 = function1;
                                }
                                if (i19 != 0) {
                                    j12 = jM711getOnHeader0d7_KjU;
                                    str3 = str2;
                                    nVar2 = null;
                                } else {
                                    j12 = jM711getOnHeader0d7_KjU;
                                    str3 = str2;
                                    nVar2 = nVar;
                                }
                            } else {
                                c0VarR.u();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                str3 = str;
                                j12 = j11;
                                nVar2 = nVar;
                                bVarU = bVar2;
                                function2 = function1;
                            }
                            c0VarR.Z();
                            aVar = androidx.compose.ui.a0.E;
                            qVar = androidx.compose.foundation.layout.q.f16330a;
                            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                            aVar2 = androidx.compose.ui.e.f37317a;
                            a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0VarR, 0);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0Var4 = a0Var2;
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
                            aVar3 = androidx.compose.ui.node.g.I;
                            i21 = i12;
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
                            long j15 = jM704getHeader0d7_KjU;
                            y7.n(c0VarD, a1VarB, aVar3.e());
                            y7.n(c0VarD, b1VarK, aVar3.g());
                            function2B = aVar3.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar3.f());
                            n0 n0Var = n0.f16227a;
                            androidx.compose.ui.a0 a0VarT = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var4, j15, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                            c0VarR.E(86796077);
                            if ((i21 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            androidx.compose.ui.a0 a0VarJ = i1.j(a0VarT, false, null, null, null, (Function0) objI0, 15, null);
                            a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarJ);
                            function0A2 = aVar3.a();
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
                            y7.n(c0VarD2, a1VarK, aVar3.e());
                            y7.n(c0VarD2, b1VarK2, aVar3.g());
                            function2B2 = aVar3.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN2, aVar3.f());
                            d0Var = androidx.compose.foundation.layout.d0.f15956a;
                            if (intercomTopBarIcon2 != null || Intrinsics.areEqual(bVarU, aVar2.m())) {
                                i22 = 16;
                                fR = androidx.compose.ui.unit.h.r(16);
                            } else {
                                i22 = 16;
                                fR = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(48) + androidx.compose.ui.unit.h.r(16));
                            }
                            androidx.compose.ui.a0 a0VarV = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                            i23 = i21 >> 3;
                            a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK3 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarV);
                            function0A3 = aVar3.a();
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
                            androidx.compose.ui.e.b bVar4 = bVarU;
                            y7.n(c0VarD3, a1VarB2, aVar3.e());
                            y7.n(c0VarD3, b1VarK3, aVar3.g());
                            function2B3 = aVar3.b();
                            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                                c0VarD3.Y(Integer.valueOf(iHashCode3));
                                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                            }
                            y7.n(c0VarD3, a0VarN3, aVar3.f());
                            c0VarR.E(560412879);
                            if (str3 != null) {
                                q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                                c0Var2 = c0VarR;
                            } else {
                                c0Var2 = c0VarR;
                            }
                            c0Var2.A();
                            c0Var2.o();
                            c0Var2.E(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                        invoke(c0Var4, num.intValue());
                                        return Unit.f312394a;
                                    }

                                    @androidx.compose.runtime.o
                                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                    public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                        if ((i28 & 11) == 2 && c0Var4.d()) {
                                            c0Var4.u();
                                        } else {
                                            ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                        }
                                    }
                                }, c0Var2, 54), c0Var2, 1572864, 60);
                            }
                            c0Var2.A();
                            c0Var2.E(-1319809649);
                            if (nVar2 != null) {
                                androidx.compose.ui.a0 a0VarB = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                                a1 a1VarE = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                                b1 b1VarK4 = c0Var2.k();
                                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, a0VarB);
                                function0A4 = aVar3.a();
                                if (c0Var2.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0Var2.q();
                                if (c0Var2.P()) {
                                    c0Var2.q0(function0A4);
                                } else {
                                    c0Var2.l();
                                }
                                c0VarD4 = y7.d(c0Var2);
                                y7.n(c0VarD4, a1VarE, aVar3.e());
                                y7.n(c0VarD4, b1VarK4, aVar3.g());
                                function2B4 = aVar3.b();
                                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                                }
                                y7.n(c0VarD4, a0VarN4, aVar3.f());
                                nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                                c0Var2.o();
                            }
                            c0Var2.A();
                            c0Var2.o();
                            IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                            c0Var2.o();
                            c0Var3 = c0Var2;
                            intercomTopBarIcon3 = intercomTopBarIcon2;
                            str4 = str3;
                            j13 = j15;
                            j14 = j12;
                            bVar3 = bVar4;
                            nVar3 = nVar2;
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            str4 = str;
                            c0Var3 = c0VarR;
                            a0Var3 = a0Var2;
                            j13 = jM704getHeader0d7_KjU;
                            intercomTopBarIcon3 = intercomTopBarIcon2;
                            bVar3 = bVar2;
                            function2 = function1;
                            j14 = j11;
                            nVar3 = nVar;
                        }
                        s5VarT = c0Var3.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i12 & 23967451) == 4793490) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        }
                        c0VarR.Z();
                        aVar = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY2 = qVar.y();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(mVarY2, aVar2.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0Var5 = a0Var2;
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar);
                        aVar3 = androidx.compose.ui.node.g.I;
                        i21 = i12;
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
                        long j16 = jM704getHeader0d7_KjU;
                        y7.n(c0VarD, a1VarB3, aVar3.e());
                        y7.n(c0VarD, b1VarK5, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN5, aVar3.f());
                        n0 n0Var2 = n0.f16227a;
                        androidx.compose.ui.a0 a0VarT2 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var5, j16, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                        c0VarR.E(86796077);
                        if ((i21 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ2 = i1.j(a0VarT2, false, null, null, null, (Function0) objI0, 15, null);
                        a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarJ2);
                        function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarK2, aVar3.e());
                        y7.n(c0VarD2, b1VarK6, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN6, aVar3.f());
                        d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        if (intercomTopBarIcon2 != null) {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        } else {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        androidx.compose.ui.a0 a0VarV2 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                        i23 = i21 >> 3;
                        a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK7 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
                        function0A3 = aVar3.a();
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
                        androidx.compose.ui.e.b bVar5 = bVarU;
                        y7.n(c0VarD3, a1VarB4, aVar3.e());
                        y7.n(c0VarD3, b1VarK7, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN7, aVar3.f());
                        c0VarR.E(560412879);
                        if (str3 != null) {
                            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                    invoke(c0Var4, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                    if ((i28 & 11) == 2 && c0Var4.d()) {
                                        c0Var4.u();
                                    } else {
                                        ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                    }
                                }
                            }, c0Var2, 54), c0Var2, 1572864, 60);
                        }
                        c0Var2.A();
                        c0Var2.E(-1319809649);
                        if (nVar2 != null) {
                            androidx.compose.ui.a0 a0VarB2 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                            a1 a1VarE2 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK8 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0Var2, a0VarB2);
                            function0A4 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A4);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD4 = y7.d(c0Var2);
                            y7.n(c0VarD4, a1VarE2, aVar3.e());
                            y7.n(c0VarD4, b1VarK8, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN8, aVar3.f());
                            nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                            c0Var2.o();
                        }
                        c0Var2.A();
                        c0Var2.o();
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                        c0Var3 = c0Var2;
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        str4 = str3;
                        j13 = j16;
                        j14 = j12;
                        bVar3 = bVar5;
                        nVar3 = nVar2;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        }
                        c0VarR.Z();
                        aVar = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY3 = qVar.y();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB5 = androidx.compose.foundation.layout.j0.b(mVarY3, aVar2.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0Var6 = a0Var2;
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, aVar);
                        aVar3 = androidx.compose.ui.node.g.I;
                        i21 = i12;
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
                        long j17 = jM704getHeader0d7_KjU;
                        y7.n(c0VarD, a1VarB5, aVar3.e());
                        y7.n(c0VarD, b1VarK9, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN9, aVar3.f());
                        n0 n0Var3 = n0.f16227a;
                        androidx.compose.ui.a0 a0VarT3 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var6, j17, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                        c0VarR.E(86796077);
                        if ((i21 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ3 = i1.j(a0VarT3, false, null, null, null, (Function0) objI0, 15, null);
                        a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK10 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarJ3);
                        function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarK3, aVar3.e());
                        y7.n(c0VarD2, b1VarK10, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN10, aVar3.f());
                        d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        if (intercomTopBarIcon2 != null) {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        } else {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        androidx.compose.ui.a0 a0VarV3 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                        i23 = i21 >> 3;
                        a1 a1VarB6 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarV3);
                        function0A3 = aVar3.a();
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
                        androidx.compose.ui.e.b bVar6 = bVarU;
                        y7.n(c0VarD3, a1VarB6, aVar3.e());
                        y7.n(c0VarD3, b1VarK11, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN11, aVar3.f());
                        c0VarR.E(560412879);
                        if (str3 != null) {
                            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                    invoke(c0Var4, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                    if ((i28 & 11) == 2 && c0Var4.d()) {
                                        c0Var4.u();
                                    } else {
                                        ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                    }
                                }
                            }, c0Var2, 54), c0Var2, 1572864, 60);
                        }
                        c0Var2.A();
                        c0Var2.E(-1319809649);
                        if (nVar2 != null) {
                            androidx.compose.ui.a0 a0VarB3 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                            a1 a1VarE3 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK12 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0Var2, a0VarB3);
                            function0A4 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A4);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD4 = y7.d(c0Var2);
                            y7.n(c0VarD4, a1VarE3, aVar3.e());
                            y7.n(c0VarD4, b1VarK12, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN12, aVar3.f());
                            nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                            c0Var2.o();
                        }
                        c0Var2.A();
                        c0Var2.o();
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                        c0Var3 = c0Var2;
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        str4 = str3;
                        j13 = j17;
                        j14 = j12;
                        bVar3 = bVar6;
                        nVar3 = nVar2;
                        a0Var3 = a0Var6;
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                bVar2 = bVar;
                if ((57344 & i10) == 0) {
                    jM704getHeader0d7_KjU = j10;
                    if ((i11 & 16) == 0) {
                        i25 = 8192;
                    } else {
                        i25 = 8192;
                    }
                    i12 |= i25;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i24 = 65536;
                    } else {
                        i24 = 65536;
                    }
                    i12 |= i24;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i10 & 3670016) == 0) {
                        if (c0VarR.k0(function1)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        }
                        c0VarR.Z();
                        aVar = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY4 = qVar.y();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB7 = androidx.compose.foundation.layout.j0.b(mVarY4, aVar2.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK13 = c0VarR.k();
                        androidx.compose.ui.a0 a0Var7 = a0Var2;
                        androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, aVar);
                        aVar3 = androidx.compose.ui.node.g.I;
                        i21 = i12;
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
                        long j18 = jM704getHeader0d7_KjU;
                        y7.n(c0VarD, a1VarB7, aVar3.e());
                        y7.n(c0VarD, b1VarK13, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN13, aVar3.f());
                        n0 n0Var4 = n0.f16227a;
                        androidx.compose.ui.a0 a0VarT4 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var7, j18, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                        c0VarR.E(86796077);
                        if ((i21 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ4 = i1.j(a0VarT4, false, null, null, null, (Function0) objI0, 15, null);
                        a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK14 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarJ4);
                        function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarK4, aVar3.e());
                        y7.n(c0VarD2, b1VarK14, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN14, aVar3.f());
                        d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        if (intercomTopBarIcon2 != null) {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        } else {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        androidx.compose.ui.a0 a0VarV4 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                        i23 = i21 >> 3;
                        a1 a1VarB8 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK15 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarV4);
                        function0A3 = aVar3.a();
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
                        androidx.compose.ui.e.b bVar7 = bVarU;
                        y7.n(c0VarD3, a1VarB8, aVar3.e());
                        y7.n(c0VarD3, b1VarK15, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN15, aVar3.f());
                        c0VarR.E(560412879);
                        if (str3 != null) {
                            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                    invoke(c0Var4, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                    if ((i28 & 11) == 2 && c0Var4.d()) {
                                        c0Var4.u();
                                    } else {
                                        ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                    }
                                }
                            }, c0Var2, 54), c0Var2, 1572864, 60);
                        }
                        c0Var2.A();
                        c0Var2.E(-1319809649);
                        if (nVar2 != null) {
                            androidx.compose.ui.a0 a0VarB4 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                            a1 a1VarE4 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK16 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0Var2, a0VarB4);
                            function0A4 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A4);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD4 = y7.d(c0Var2);
                            y7.n(c0VarD4, a1VarE4, aVar3.e());
                            y7.n(c0VarD4, b1VarK16, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN16, aVar3.f());
                            nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                            c0Var2.o();
                        }
                        c0Var2.A();
                        c0Var2.o();
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                        c0Var3 = c0Var2;
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        str4 = str3;
                        j13 = j18;
                        j14 = j12;
                        bVar3 = bVar7;
                        nVar3 = nVar2;
                        a0Var3 = a0Var7;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        }
                        c0VarR.Z();
                        aVar = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY5 = qVar.y();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB9 = androidx.compose.foundation.layout.j0.b(mVarY5, aVar2.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK17 = c0VarR.k();
                        androidx.compose.ui.a0 a0Var8 = a0Var2;
                        androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, aVar);
                        aVar3 = androidx.compose.ui.node.g.I;
                        i21 = i12;
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
                        long j19 = jM704getHeader0d7_KjU;
                        y7.n(c0VarD, a1VarB9, aVar3.e());
                        y7.n(c0VarD, b1VarK17, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN17, aVar3.f());
                        n0 n0Var5 = n0.f16227a;
                        androidx.compose.ui.a0 a0VarT5 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var8, j19, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                        c0VarR.E(86796077);
                        if ((i21 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ5 = i1.j(a0VarT5, false, null, null, null, (Function0) objI0, 15, null);
                        a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK18 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarJ5);
                        function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarK5, aVar3.e());
                        y7.n(c0VarD2, b1VarK18, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN18, aVar3.f());
                        d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        if (intercomTopBarIcon2 != null) {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        } else {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        androidx.compose.ui.a0 a0VarV5 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                        i23 = i21 >> 3;
                        a1 a1VarB10 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK19 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarV5);
                        function0A3 = aVar3.a();
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
                        androidx.compose.ui.e.b bVar8 = bVarU;
                        y7.n(c0VarD3, a1VarB10, aVar3.e());
                        y7.n(c0VarD3, b1VarK19, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN19, aVar3.f());
                        c0VarR.E(560412879);
                        if (str3 != null) {
                            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                    invoke(c0Var4, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                    if ((i28 & 11) == 2 && c0Var4.d()) {
                                        c0Var4.u();
                                    } else {
                                        ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                    }
                                }
                            }, c0Var2, 54), c0Var2, 1572864, 60);
                        }
                        c0Var2.A();
                        c0Var2.E(-1319809649);
                        if (nVar2 != null) {
                            androidx.compose.ui.a0 a0VarB5 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                            a1 a1VarE5 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK110 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0Var2, a0VarB5);
                            function0A4 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A4);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD4 = y7.d(c0Var2);
                            y7.n(c0VarD4, a1VarE5, aVar3.e());
                            y7.n(c0VarD4, b1VarK110, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN110, aVar3.f());
                            nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                            c0Var2.o();
                        }
                        c0Var2.A();
                        c0Var2.o();
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                        c0Var3 = c0Var2;
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        str4 = str3;
                        j13 = j19;
                        j14 = j12;
                        bVar3 = bVar8;
                        nVar3 = nVar2;
                        a0Var3 = a0Var8;
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY6 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB11 = androidx.compose.foundation.layout.j0.b(mVarY6, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var9 = a0Var2;
                    androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j110 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB11, aVar3.e());
                    y7.n(c0VarD, b1VarK111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111, aVar3.f());
                    n0 n0Var6 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT6 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var9, j110, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ6 = i1.j(a0VarT6, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarJ6);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK6, aVar3.e());
                    y7.n(c0VarD2, b1VarK112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN112, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV6 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB12 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarV6);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar9 = bVarU;
                    y7.n(c0VarD3, a1VarB12, aVar3.e());
                    y7.n(c0VarD3, b1VarK113, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN113, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB6 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE6 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK114 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0Var2, a0VarB6);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE6, aVar3.e());
                        y7.n(c0VarD4, b1VarK114, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN114, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j110;
                    j14 = j12;
                    bVar3 = bVar9;
                    nVar3 = nVar2;
                    a0Var3 = a0Var9;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY7 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB13 = androidx.compose.foundation.layout.j0.b(mVarY7, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK115 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var10 = a0Var2;
                    androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j111 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB13, aVar3.e());
                    y7.n(c0VarD, b1VarK115, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN115, aVar3.f());
                    n0 n0Var7 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT7 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var10, j111, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ7 = i1.j(a0VarT7, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK7 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarJ7);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK7, aVar3.e());
                    y7.n(c0VarD2, b1VarK116, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN116, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV7 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB14 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarV7);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar10 = bVarU;
                    y7.n(c0VarD3, a1VarB14, aVar3.e());
                    y7.n(c0VarD3, b1VarK117, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN117, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB7 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE7 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK118 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0Var2, a0VarB7);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE7, aVar3.e());
                        y7.n(c0VarD4, b1VarK118, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN118, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j111;
                    j14 = j12;
                    bVar3 = bVar10;
                    nVar3 = nVar2;
                    a0Var3 = a0Var10;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            intercomTopBarIcon2 = intercomTopBarIcon;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    bVar2 = bVar;
                    if (c0VarR.D(bVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    jM704getHeader0d7_KjU = j10;
                    if ((i11 & 16) == 0) {
                        i25 = 8192;
                    } else {
                        i25 = 8192;
                    }
                    i12 |= i25;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i24 = 65536;
                    } else {
                        i24 = 65536;
                    }
                    i12 |= i24;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i10 & 3670016) == 0) {
                        if (c0VarR.k0(function1)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        }
                        c0VarR.Z();
                        aVar = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY8 = qVar.y();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB15 = androidx.compose.foundation.layout.j0.b(mVarY8, aVar2.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK119 = c0VarR.k();
                        androidx.compose.ui.a0 a0Var11 = a0Var2;
                        androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, aVar);
                        aVar3 = androidx.compose.ui.node.g.I;
                        i21 = i12;
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
                        long j112 = jM704getHeader0d7_KjU;
                        y7.n(c0VarD, a1VarB15, aVar3.e());
                        y7.n(c0VarD, b1VarK119, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN119, aVar3.f());
                        n0 n0Var8 = n0.f16227a;
                        androidx.compose.ui.a0 a0VarT8 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var11, j112, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                        c0VarR.E(86796077);
                        if ((i21 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ8 = i1.j(a0VarT8, false, null, null, null, (Function0) objI0, 15, null);
                        a1 a1VarK8 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1110 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarJ8);
                        function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarK8, aVar3.e());
                        y7.n(c0VarD2, b1VarK1110, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1110, aVar3.f());
                        d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        if (intercomTopBarIcon2 != null) {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        } else {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        androidx.compose.ui.a0 a0VarV8 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                        i23 = i21 >> 3;
                        a1 a1VarB16 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarV8);
                        function0A3 = aVar3.a();
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
                        androidx.compose.ui.e.b bVar11 = bVarU;
                        y7.n(c0VarD3, a1VarB16, aVar3.e());
                        y7.n(c0VarD3, b1VarK1111, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1111, aVar3.f());
                        c0VarR.E(560412879);
                        if (str3 != null) {
                            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                    invoke(c0Var4, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                    if ((i28 & 11) == 2 && c0Var4.d()) {
                                        c0Var4.u();
                                    } else {
                                        ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                    }
                                }
                            }, c0Var2, 54), c0Var2, 1572864, 60);
                        }
                        c0Var2.A();
                        c0Var2.E(-1319809649);
                        if (nVar2 != null) {
                            androidx.compose.ui.a0 a0VarB8 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                            a1 a1VarE8 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK1112 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0Var2, a0VarB8);
                            function0A4 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A4);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD4 = y7.d(c0Var2);
                            y7.n(c0VarD4, a1VarE8, aVar3.e());
                            y7.n(c0VarD4, b1VarK1112, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN1112, aVar3.f());
                            nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                            c0Var2.o();
                        }
                        c0Var2.A();
                        c0Var2.o();
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                        c0Var3 = c0Var2;
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        str4 = str3;
                        j13 = j112;
                        j14 = j12;
                        bVar3 = bVar11;
                        nVar3 = nVar2;
                        a0Var3 = a0Var11;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        }
                        c0VarR.Z();
                        aVar = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY9 = qVar.y();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB17 = androidx.compose.foundation.layout.j0.b(mVarY9, aVar2.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1113 = c0VarR.k();
                        androidx.compose.ui.a0 a0Var12 = a0Var2;
                        androidx.compose.ui.a0 a0VarN1113 = androidx.compose.ui.m.n(c0VarR, aVar);
                        aVar3 = androidx.compose.ui.node.g.I;
                        i21 = i12;
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
                        long j113 = jM704getHeader0d7_KjU;
                        y7.n(c0VarD, a1VarB17, aVar3.e());
                        y7.n(c0VarD, b1VarK1113, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1113, aVar3.f());
                        n0 n0Var9 = n0.f16227a;
                        androidx.compose.ui.a0 a0VarT9 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var12, j113, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                        c0VarR.E(86796077);
                        if ((i21 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ9 = i1.j(a0VarT9, false, null, null, null, (Function0) objI0, 15, null);
                        a1 a1VarK9 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1114 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1114 = androidx.compose.ui.m.n(c0VarR, a0VarJ9);
                        function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarK9, aVar3.e());
                        y7.n(c0VarD2, b1VarK1114, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1114, aVar3.f());
                        d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        if (intercomTopBarIcon2 != null) {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        } else {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        androidx.compose.ui.a0 a0VarV9 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                        i23 = i21 >> 3;
                        a1 a1VarB18 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1115 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1115 = androidx.compose.ui.m.n(c0VarR, a0VarV9);
                        function0A3 = aVar3.a();
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
                        androidx.compose.ui.e.b bVar12 = bVarU;
                        y7.n(c0VarD3, a1VarB18, aVar3.e());
                        y7.n(c0VarD3, b1VarK1115, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1115, aVar3.f());
                        c0VarR.E(560412879);
                        if (str3 != null) {
                            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                    invoke(c0Var4, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                    if ((i28 & 11) == 2 && c0Var4.d()) {
                                        c0Var4.u();
                                    } else {
                                        ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                    }
                                }
                            }, c0Var2, 54), c0Var2, 1572864, 60);
                        }
                        c0Var2.A();
                        c0Var2.E(-1319809649);
                        if (nVar2 != null) {
                            androidx.compose.ui.a0 a0VarB9 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                            a1 a1VarE9 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK1116 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN1116 = androidx.compose.ui.m.n(c0Var2, a0VarB9);
                            function0A4 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A4);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD4 = y7.d(c0Var2);
                            y7.n(c0VarD4, a1VarE9, aVar3.e());
                            y7.n(c0VarD4, b1VarK1116, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN1116, aVar3.f());
                            nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                            c0Var2.o();
                        }
                        c0Var2.A();
                        c0Var2.o();
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                        c0Var3 = c0Var2;
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        str4 = str3;
                        j13 = j113;
                        j14 = j12;
                        bVar3 = bVar12;
                        nVar3 = nVar2;
                        a0Var3 = a0Var12;
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY10 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB19 = androidx.compose.foundation.layout.j0.b(mVarY10, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1117 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var13 = a0Var2;
                    androidx.compose.ui.a0 a0VarN1117 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j114 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB19, aVar3.e());
                    y7.n(c0VarD, b1VarK1117, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1117, aVar3.f());
                    n0 n0Var10 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT10 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var13, j114, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ10 = i1.j(a0VarT10, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK10 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1118 = androidx.compose.ui.m.n(c0VarR, a0VarJ10);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK10, aVar3.e());
                    y7.n(c0VarD2, b1VarK1118, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1118, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV10 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB110 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1119 = androidx.compose.ui.m.n(c0VarR, a0VarV10);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar13 = bVarU;
                    y7.n(c0VarD3, a1VarB110, aVar3.e());
                    y7.n(c0VarD3, b1VarK1119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1119, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB10 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE10 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK11110 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN11110 = androidx.compose.ui.m.n(c0Var2, a0VarB10);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE10, aVar3.e());
                        y7.n(c0VarD4, b1VarK11110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11110, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j114;
                    j14 = j12;
                    bVar3 = bVar13;
                    nVar3 = nVar2;
                    a0Var3 = a0Var13;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY11 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB111 = androidx.compose.foundation.layout.j0.b(mVarY11, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var14 = a0Var2;
                    androidx.compose.ui.a0 a0VarN11111 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j115 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB111, aVar3.e());
                    y7.n(c0VarD, b1VarK11111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11111, aVar3.f());
                    n0 n0Var11 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT11 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var14, j115, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ11 = i1.j(a0VarT11, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK11 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11112 = androidx.compose.ui.m.n(c0VarR, a0VarJ11);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK11, aVar3.e());
                    y7.n(c0VarD2, b1VarK11112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11112, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV11 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB112 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11113 = androidx.compose.ui.m.n(c0VarR, a0VarV11);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar14 = bVarU;
                    y7.n(c0VarD3, a1VarB112, aVar3.e());
                    y7.n(c0VarD3, b1VarK11113, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11113, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB11 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE11 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK11114 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN11114 = androidx.compose.ui.m.n(c0Var2, a0VarB11);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE11, aVar3.e());
                        y7.n(c0VarD4, b1VarK11114, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11114, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j115;
                    j14 = j12;
                    bVar3 = bVar14;
                    nVar3 = nVar2;
                    a0Var3 = a0Var14;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            bVar2 = bVar;
            if ((57344 & i10) == 0) {
                jM704getHeader0d7_KjU = j10;
                if ((i11 & 16) == 0) {
                    i25 = 8192;
                } else {
                    i25 = 8192;
                }
                i12 |= i25;
            } else {
                jM704getHeader0d7_KjU = j10;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i12 |= i24;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.k0(function1)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY12 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB113 = androidx.compose.foundation.layout.j0.b(mVarY12, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11115 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var15 = a0Var2;
                    androidx.compose.ui.a0 a0VarN11115 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j116 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB113, aVar3.e());
                    y7.n(c0VarD, b1VarK11115, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11115, aVar3.f());
                    n0 n0Var12 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT12 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var15, j116, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ12 = i1.j(a0VarT12, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK12 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11116 = androidx.compose.ui.m.n(c0VarR, a0VarJ12);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK12, aVar3.e());
                    y7.n(c0VarD2, b1VarK11116, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11116, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV12 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB114 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11117 = androidx.compose.ui.m.n(c0VarR, a0VarV12);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar15 = bVarU;
                    y7.n(c0VarD3, a1VarB114, aVar3.e());
                    y7.n(c0VarD3, b1VarK11117, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11117, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB12 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE12 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK11118 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN11118 = androidx.compose.ui.m.n(c0Var2, a0VarB12);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE12, aVar3.e());
                        y7.n(c0VarD4, b1VarK11118, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11118, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j116;
                    j14 = j12;
                    bVar3 = bVar15;
                    nVar3 = nVar2;
                    a0Var3 = a0Var15;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY13 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB115 = androidx.compose.foundation.layout.j0.b(mVarY13, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11119 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var16 = a0Var2;
                    androidx.compose.ui.a0 a0VarN11119 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j117 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB115, aVar3.e());
                    y7.n(c0VarD, b1VarK11119, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11119, aVar3.f());
                    n0 n0Var13 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT13 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var16, j117, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ13 = i1.j(a0VarT13, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK13 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111110 = androidx.compose.ui.m.n(c0VarR, a0VarJ13);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK13, aVar3.e());
                    y7.n(c0VarD2, b1VarK111110, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111110, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV13 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB116 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111 = androidx.compose.ui.m.n(c0VarR, a0VarV13);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar16 = bVarU;
                    y7.n(c0VarD3, a1VarB116, aVar3.e());
                    y7.n(c0VarD3, b1VarK111111, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN111111, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB13 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE13 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK111112 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN111112 = androidx.compose.ui.m.n(c0Var2, a0VarB13);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE13, aVar3.e());
                        y7.n(c0VarD4, b1VarK111112, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN111112, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j117;
                    j14 = j12;
                    bVar3 = bVar16;
                    nVar3 = nVar2;
                    a0Var3 = a0Var16;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 23967451) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                }
                c0VarR.Z();
                aVar = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY14 = qVar.y();
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB117 = androidx.compose.foundation.layout.j0.b(mVarY14, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111113 = c0VarR.k();
                androidx.compose.ui.a0 a0Var17 = a0Var2;
                androidx.compose.ui.a0 a0VarN111113 = androidx.compose.ui.m.n(c0VarR, aVar);
                aVar3 = androidx.compose.ui.node.g.I;
                i21 = i12;
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
                long j118 = jM704getHeader0d7_KjU;
                y7.n(c0VarD, a1VarB117, aVar3.e());
                y7.n(c0VarD, b1VarK111113, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111113, aVar3.f());
                n0 n0Var14 = n0.f16227a;
                androidx.compose.ui.a0 a0VarT14 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var17, j118, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                c0VarR.E(86796077);
                if ((i21 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ14 = i1.j(a0VarT14, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK14 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111114 = androidx.compose.ui.m.n(c0VarR, a0VarJ14);
                function0A2 = aVar3.a();
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
                y7.n(c0VarD2, a1VarK14, aVar3.e());
                y7.n(c0VarD2, b1VarK111114, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111114, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                if (intercomTopBarIcon2 != null) {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                } else {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                androidx.compose.ui.a0 a0VarV14 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                i23 = i21 >> 3;
                a1 a1VarB118 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111115 = androidx.compose.ui.m.n(c0VarR, a0VarV14);
                function0A3 = aVar3.a();
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
                androidx.compose.ui.e.b bVar17 = bVarU;
                y7.n(c0VarD3, a1VarB118, aVar3.e());
                y7.n(c0VarD3, b1VarK111115, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111115, aVar3.f());
                c0VarR.E(560412879);
                if (str3 != null) {
                    q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                            if ((i28 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 1572864, 60);
                }
                c0Var2.A();
                c0Var2.E(-1319809649);
                if (nVar2 != null) {
                    androidx.compose.ui.a0 a0VarB14 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                    a1 a1VarE14 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK111116 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN111116 = androidx.compose.ui.m.n(c0Var2, a0VarB14);
                    function0A4 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A4);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD4 = y7.d(c0Var2);
                    y7.n(c0VarD4, a1VarE14, aVar3.e());
                    y7.n(c0VarD4, b1VarK111116, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111116, aVar3.f());
                    nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                    c0Var2.o();
                }
                c0Var2.A();
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                c0Var2.o();
                c0Var3 = c0Var2;
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j13 = j118;
                j14 = j12;
                bVar3 = bVar17;
                nVar3 = nVar2;
                a0Var3 = a0Var17;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                }
                c0VarR.Z();
                aVar = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY15 = qVar.y();
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB119 = androidx.compose.foundation.layout.j0.b(mVarY15, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111117 = c0VarR.k();
                androidx.compose.ui.a0 a0Var18 = a0Var2;
                androidx.compose.ui.a0 a0VarN111117 = androidx.compose.ui.m.n(c0VarR, aVar);
                aVar3 = androidx.compose.ui.node.g.I;
                i21 = i12;
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
                long j119 = jM704getHeader0d7_KjU;
                y7.n(c0VarD, a1VarB119, aVar3.e());
                y7.n(c0VarD, b1VarK111117, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111117, aVar3.f());
                n0 n0Var15 = n0.f16227a;
                androidx.compose.ui.a0 a0VarT15 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var18, j119, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                c0VarR.E(86796077);
                if ((i21 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ15 = i1.j(a0VarT15, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK15 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111118 = androidx.compose.ui.m.n(c0VarR, a0VarJ15);
                function0A2 = aVar3.a();
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
                y7.n(c0VarD2, a1VarK15, aVar3.e());
                y7.n(c0VarD2, b1VarK111118, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111118, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                if (intercomTopBarIcon2 != null) {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                } else {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                androidx.compose.ui.a0 a0VarV15 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                i23 = i21 >> 3;
                a1 a1VarB1110 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111119 = androidx.compose.ui.m.n(c0VarR, a0VarV15);
                function0A3 = aVar3.a();
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
                androidx.compose.ui.e.b bVar18 = bVarU;
                y7.n(c0VarD3, a1VarB1110, aVar3.e());
                y7.n(c0VarD3, b1VarK111119, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111119, aVar3.f());
                c0VarR.E(560412879);
                if (str3 != null) {
                    q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                            if ((i28 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 1572864, 60);
                }
                c0Var2.A();
                c0Var2.E(-1319809649);
                if (nVar2 != null) {
                    androidx.compose.ui.a0 a0VarB15 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                    a1 a1VarE15 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK1111110 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN1111110 = androidx.compose.ui.m.n(c0Var2, a0VarB15);
                    function0A4 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A4);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD4 = y7.d(c0Var2);
                    y7.n(c0VarD4, a1VarE15, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111110, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111110, aVar3.f());
                    nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                    c0Var2.o();
                }
                c0Var2.A();
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                c0Var2.o();
                c0Var3 = c0Var2;
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j13 = j119;
                j14 = j12;
                bVar3 = bVar18;
                nVar3 = nVar2;
                a0Var3 = a0Var18;
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                intercomTopBarIcon2 = intercomTopBarIcon;
                if (c0VarR.D(intercomTopBarIcon2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    bVar2 = bVar;
                    if (c0VarR.D(bVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    jM704getHeader0d7_KjU = j10;
                    if ((i11 & 16) == 0) {
                        i25 = 8192;
                    } else {
                        i25 = 8192;
                    }
                    i12 |= i25;
                } else {
                    jM704getHeader0d7_KjU = j10;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i24 = 65536;
                    } else {
                        i24 = 65536;
                    }
                    i12 |= i24;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i10 & 3670016) == 0) {
                        if (c0VarR.k0(function1)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        }
                        c0VarR.Z();
                        aVar = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY16 = qVar.y();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB1111 = androidx.compose.foundation.layout.j0.b(mVarY16, aVar2.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111111 = c0VarR.k();
                        androidx.compose.ui.a0 a0Var19 = a0Var2;
                        androidx.compose.ui.a0 a0VarN1111111 = androidx.compose.ui.m.n(c0VarR, aVar);
                        aVar3 = androidx.compose.ui.node.g.I;
                        i21 = i12;
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
                        long j1110 = jM704getHeader0d7_KjU;
                        y7.n(c0VarD, a1VarB1111, aVar3.e());
                        y7.n(c0VarD, b1VarK1111111, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1111111, aVar3.f());
                        n0 n0Var16 = n0.f16227a;
                        androidx.compose.ui.a0 a0VarT16 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var19, j1110, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                        c0VarR.E(86796077);
                        if ((i21 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ16 = i1.j(a0VarT16, false, null, null, null, (Function0) objI0, 15, null);
                        a1 a1VarK16 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111112 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111112 = androidx.compose.ui.m.n(c0VarR, a0VarJ16);
                        function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarK16, aVar3.e());
                        y7.n(c0VarD2, b1VarK1111112, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1111112, aVar3.f());
                        d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        if (intercomTopBarIcon2 != null) {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        } else {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        androidx.compose.ui.a0 a0VarV16 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                        i23 = i21 >> 3;
                        a1 a1VarB1112 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111113 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111113 = androidx.compose.ui.m.n(c0VarR, a0VarV16);
                        function0A3 = aVar3.a();
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
                        androidx.compose.ui.e.b bVar19 = bVarU;
                        y7.n(c0VarD3, a1VarB1112, aVar3.e());
                        y7.n(c0VarD3, b1VarK1111113, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1111113, aVar3.f());
                        c0VarR.E(560412879);
                        if (str3 != null) {
                            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                    invoke(c0Var4, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                    if ((i28 & 11) == 2 && c0Var4.d()) {
                                        c0Var4.u();
                                    } else {
                                        ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                    }
                                }
                            }, c0Var2, 54), c0Var2, 1572864, 60);
                        }
                        c0Var2.A();
                        c0Var2.E(-1319809649);
                        if (nVar2 != null) {
                            androidx.compose.ui.a0 a0VarB16 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                            a1 a1VarE16 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK1111114 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN1111114 = androidx.compose.ui.m.n(c0Var2, a0VarB16);
                            function0A4 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A4);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD4 = y7.d(c0Var2);
                            y7.n(c0VarD4, a1VarE16, aVar3.e());
                            y7.n(c0VarD4, b1VarK1111114, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN1111114, aVar3.f());
                            nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                            c0Var2.o();
                        }
                        c0Var2.A();
                        c0Var2.o();
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                        c0Var3 = c0Var2;
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        str4 = str3;
                        j13 = j1110;
                        j14 = j12;
                        bVar3 = bVar19;
                        nVar3 = nVar2;
                        a0Var3 = a0Var19;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i27 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            } else {
                                bVarU = bVar2;
                            }
                            if ((i11 & 16) != 0) {
                                jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM711getOnHeader0d7_KjU = j11;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (i19 != 0) {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = null;
                            } else {
                                j12 = jM711getOnHeader0d7_KjU;
                                str3 = str2;
                                nVar2 = nVar;
                            }
                        }
                        c0VarR.Z();
                        aVar = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY17 = qVar.y();
                        aVar2 = androidx.compose.ui.e.f37317a;
                        a1 a1VarB1113 = androidx.compose.foundation.layout.j0.b(mVarY17, aVar2.u(), c0VarR, 0);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111115 = c0VarR.k();
                        androidx.compose.ui.a0 a0Var110 = a0Var2;
                        androidx.compose.ui.a0 a0VarN1111115 = androidx.compose.ui.m.n(c0VarR, aVar);
                        aVar3 = androidx.compose.ui.node.g.I;
                        i21 = i12;
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
                        long j1111 = jM704getHeader0d7_KjU;
                        y7.n(c0VarD, a1VarB1113, aVar3.e());
                        y7.n(c0VarD, b1VarK1111115, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1111115, aVar3.f());
                        n0 n0Var17 = n0.f16227a;
                        androidx.compose.ui.a0 a0VarT17 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var110, j1111, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                        c0VarR.E(86796077);
                        if ((i21 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10) {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarJ17 = i1.j(a0VarT17, false, null, null, null, (Function0) objI0, 15, null);
                        a1 a1VarK17 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111116 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111116 = androidx.compose.ui.m.n(c0VarR, a0VarJ17);
                        function0A2 = aVar3.a();
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
                        y7.n(c0VarD2, a1VarK17, aVar3.e());
                        y7.n(c0VarD2, b1VarK1111116, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1111116, aVar3.f());
                        d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        if (intercomTopBarIcon2 != null) {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        } else {
                            i22 = 16;
                            fR = androidx.compose.ui.unit.h.r(16);
                        }
                        androidx.compose.ui.a0 a0VarV17 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                        i23 = i21 >> 3;
                        a1 a1VarB1114 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111117 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111117 = androidx.compose.ui.m.n(c0VarR, a0VarV17);
                        function0A3 = aVar3.a();
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
                        androidx.compose.ui.e.b bVar110 = bVarU;
                        y7.n(c0VarD3, a1VarB1114, aVar3.e());
                        y7.n(c0VarD3, b1VarK1111117, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1111117, aVar3.f());
                        c0VarR.E(560412879);
                        if (str3 != null) {
                            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.E(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                    invoke(c0Var4, num.intValue());
                                    return Unit.f312394a;
                                }

                                @androidx.compose.runtime.o
                                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                    if ((i28 & 11) == 2 && c0Var4.d()) {
                                        c0Var4.u();
                                    } else {
                                        ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                    }
                                }
                            }, c0Var2, 54), c0Var2, 1572864, 60);
                        }
                        c0Var2.A();
                        c0Var2.E(-1319809649);
                        if (nVar2 != null) {
                            androidx.compose.ui.a0 a0VarB17 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                            a1 a1VarE17 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                            b1 b1VarK1111118 = c0Var2.k();
                            androidx.compose.ui.a0 a0VarN1111118 = androidx.compose.ui.m.n(c0Var2, a0VarB17);
                            function0A4 = aVar3.a();
                            if (c0Var2.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var2.q();
                            if (c0Var2.P()) {
                                c0Var2.q0(function0A4);
                            } else {
                                c0Var2.l();
                            }
                            c0VarD4 = y7.d(c0Var2);
                            y7.n(c0VarD4, a1VarE17, aVar3.e());
                            y7.n(c0VarD4, b1VarK1111118, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN1111118, aVar3.f());
                            nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                            c0Var2.o();
                        }
                        c0Var2.A();
                        c0Var2.o();
                        IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                        c0Var2.o();
                        c0Var3 = c0Var2;
                        intercomTopBarIcon3 = intercomTopBarIcon2;
                        str4 = str3;
                        j13 = j1111;
                        j14 = j12;
                        bVar3 = bVar110;
                        nVar3 = nVar2;
                        a0Var3 = a0Var110;
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY18 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB1115 = androidx.compose.foundation.layout.j0.b(mVarY18, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111119 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var111 = a0Var2;
                    androidx.compose.ui.a0 a0VarN1111119 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j1112 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB1115, aVar3.e());
                    y7.n(c0VarD, b1VarK1111119, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111119, aVar3.f());
                    n0 n0Var18 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT18 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var111, j1112, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ18 = i1.j(a0VarT18, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK18 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111110 = androidx.compose.ui.m.n(c0VarR, a0VarJ18);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK18, aVar3.e());
                    y7.n(c0VarD2, b1VarK11111110, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11111110, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV18 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB1116 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111111 = androidx.compose.ui.m.n(c0VarR, a0VarV18);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar111 = bVarU;
                    y7.n(c0VarD3, a1VarB1116, aVar3.e());
                    y7.n(c0VarD3, b1VarK11111111, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11111111, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB18 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE18 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK11111112 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN11111112 = androidx.compose.ui.m.n(c0Var2, a0VarB18);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE18, aVar3.e());
                        y7.n(c0VarD4, b1VarK11111112, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11111112, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j1112;
                    j14 = j12;
                    bVar3 = bVar111;
                    nVar3 = nVar2;
                    a0Var3 = a0Var111;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY19 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB1117 = androidx.compose.foundation.layout.j0.b(mVarY19, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111113 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var112 = a0Var2;
                    androidx.compose.ui.a0 a0VarN11111113 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j1113 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB1117, aVar3.e());
                    y7.n(c0VarD, b1VarK11111113, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11111113, aVar3.f());
                    n0 n0Var19 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT19 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var112, j1113, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ19 = i1.j(a0VarT19, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK19 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111114 = androidx.compose.ui.m.n(c0VarR, a0VarJ19);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK19, aVar3.e());
                    y7.n(c0VarD2, b1VarK11111114, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11111114, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV19 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB1118 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111115 = androidx.compose.ui.m.n(c0VarR, a0VarV19);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar112 = bVarU;
                    y7.n(c0VarD3, a1VarB1118, aVar3.e());
                    y7.n(c0VarD3, b1VarK11111115, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11111115, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB19 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE19 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK11111116 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN11111116 = androidx.compose.ui.m.n(c0Var2, a0VarB19);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE19, aVar3.e());
                        y7.n(c0VarD4, b1VarK11111116, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11111116, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j1113;
                    j14 = j12;
                    bVar3 = bVar112;
                    nVar3 = nVar2;
                    a0Var3 = a0Var112;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            bVar2 = bVar;
            if ((57344 & i10) == 0) {
                jM704getHeader0d7_KjU = j10;
                if ((i11 & 16) == 0) {
                    i25 = 8192;
                } else {
                    i25 = 8192;
                }
                i12 |= i25;
            } else {
                jM704getHeader0d7_KjU = j10;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i12 |= i24;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.k0(function1)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY110 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB1119 = androidx.compose.foundation.layout.j0.b(mVarY110, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111117 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var113 = a0Var2;
                    androidx.compose.ui.a0 a0VarN11111117 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j1114 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB1119, aVar3.e());
                    y7.n(c0VarD, b1VarK11111117, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11111117, aVar3.f());
                    n0 n0Var110 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT110 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var113, j1114, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ110 = i1.j(a0VarT110, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK110 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111118 = androidx.compose.ui.m.n(c0VarR, a0VarJ110);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK110, aVar3.e());
                    y7.n(c0VarD2, b1VarK11111118, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11111118, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV110 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB11110 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111119 = androidx.compose.ui.m.n(c0VarR, a0VarV110);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar113 = bVarU;
                    y7.n(c0VarD3, a1VarB11110, aVar3.e());
                    y7.n(c0VarD3, b1VarK11111119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11111119, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB110 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE110 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK111111110 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN111111110 = androidx.compose.ui.m.n(c0Var2, a0VarB110);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE110, aVar3.e());
                        y7.n(c0VarD4, b1VarK111111110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN111111110, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j1114;
                    j14 = j12;
                    bVar3 = bVar113;
                    nVar3 = nVar2;
                    a0Var3 = a0Var113;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY111 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB11111 = androidx.compose.foundation.layout.j0.b(mVarY111, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111111 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var114 = a0Var2;
                    androidx.compose.ui.a0 a0VarN111111111 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j1115 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB11111, aVar3.e());
                    y7.n(c0VarD, b1VarK111111111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111111111, aVar3.f());
                    n0 n0Var111 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT111 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var114, j1115, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ111 = i1.j(a0VarT111, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK111 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111112 = androidx.compose.ui.m.n(c0VarR, a0VarJ111);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK111, aVar3.e());
                    y7.n(c0VarD2, b1VarK111111112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111111112, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV111 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB11112 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111113 = androidx.compose.ui.m.n(c0VarR, a0VarV111);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar114 = bVarU;
                    y7.n(c0VarD3, a1VarB11112, aVar3.e());
                    y7.n(c0VarD3, b1VarK111111113, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN111111113, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB111 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE111 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK111111114 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN111111114 = androidx.compose.ui.m.n(c0Var2, a0VarB111);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE111, aVar3.e());
                        y7.n(c0VarD4, b1VarK111111114, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN111111114, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j1115;
                    j14 = j12;
                    bVar3 = bVar114;
                    nVar3 = nVar2;
                    a0Var3 = a0Var114;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 23967451) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                }
                c0VarR.Z();
                aVar = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY112 = qVar.y();
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB11113 = androidx.compose.foundation.layout.j0.b(mVarY112, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111115 = c0VarR.k();
                androidx.compose.ui.a0 a0Var115 = a0Var2;
                androidx.compose.ui.a0 a0VarN111111115 = androidx.compose.ui.m.n(c0VarR, aVar);
                aVar3 = androidx.compose.ui.node.g.I;
                i21 = i12;
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
                long j1116 = jM704getHeader0d7_KjU;
                y7.n(c0VarD, a1VarB11113, aVar3.e());
                y7.n(c0VarD, b1VarK111111115, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111115, aVar3.f());
                n0 n0Var112 = n0.f16227a;
                androidx.compose.ui.a0 a0VarT112 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var115, j1116, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                c0VarR.E(86796077);
                if ((i21 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ112 = i1.j(a0VarT112, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK112 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111116 = androidx.compose.ui.m.n(c0VarR, a0VarJ112);
                function0A2 = aVar3.a();
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
                y7.n(c0VarD2, a1VarK112, aVar3.e());
                y7.n(c0VarD2, b1VarK111111116, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111111116, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                if (intercomTopBarIcon2 != null) {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                } else {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                androidx.compose.ui.a0 a0VarV112 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                i23 = i21 >> 3;
                a1 a1VarB11114 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111117 = androidx.compose.ui.m.n(c0VarR, a0VarV112);
                function0A3 = aVar3.a();
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
                androidx.compose.ui.e.b bVar115 = bVarU;
                y7.n(c0VarD3, a1VarB11114, aVar3.e());
                y7.n(c0VarD3, b1VarK111111117, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111111117, aVar3.f());
                c0VarR.E(560412879);
                if (str3 != null) {
                    q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                            if ((i28 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 1572864, 60);
                }
                c0Var2.A();
                c0Var2.E(-1319809649);
                if (nVar2 != null) {
                    androidx.compose.ui.a0 a0VarB112 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                    a1 a1VarE112 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK111111118 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN111111118 = androidx.compose.ui.m.n(c0Var2, a0VarB112);
                    function0A4 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A4);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD4 = y7.d(c0Var2);
                    y7.n(c0VarD4, a1VarE112, aVar3.e());
                    y7.n(c0VarD4, b1VarK111111118, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111111118, aVar3.f());
                    nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                    c0Var2.o();
                }
                c0Var2.A();
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                c0Var2.o();
                c0Var3 = c0Var2;
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j13 = j1116;
                j14 = j12;
                bVar3 = bVar115;
                nVar3 = nVar2;
                a0Var3 = a0Var115;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                }
                c0VarR.Z();
                aVar = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY113 = qVar.y();
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB11115 = androidx.compose.foundation.layout.j0.b(mVarY113, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111119 = c0VarR.k();
                androidx.compose.ui.a0 a0Var116 = a0Var2;
                androidx.compose.ui.a0 a0VarN111111119 = androidx.compose.ui.m.n(c0VarR, aVar);
                aVar3 = androidx.compose.ui.node.g.I;
                i21 = i12;
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
                long j1117 = jM704getHeader0d7_KjU;
                y7.n(c0VarD, a1VarB11115, aVar3.e());
                y7.n(c0VarD, b1VarK111111119, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111119, aVar3.f());
                n0 n0Var113 = n0.f16227a;
                androidx.compose.ui.a0 a0VarT113 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var116, j1117, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                c0VarR.E(86796077);
                if ((i21 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ113 = i1.j(a0VarT113, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK113 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111111110 = androidx.compose.ui.m.n(c0VarR, a0VarJ113);
                function0A2 = aVar3.a();
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
                y7.n(c0VarD2, a1VarK113, aVar3.e());
                y7.n(c0VarD2, b1VarK1111111110, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN1111111110, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                if (intercomTopBarIcon2 != null) {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                } else {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                androidx.compose.ui.a0 a0VarV113 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                i23 = i21 >> 3;
                a1 a1VarB11116 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111111111 = androidx.compose.ui.m.n(c0VarR, a0VarV113);
                function0A3 = aVar3.a();
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
                androidx.compose.ui.e.b bVar116 = bVarU;
                y7.n(c0VarD3, a1VarB11116, aVar3.e());
                y7.n(c0VarD3, b1VarK1111111111, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN1111111111, aVar3.f());
                c0VarR.E(560412879);
                if (str3 != null) {
                    q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                            if ((i28 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 1572864, 60);
                }
                c0Var2.A();
                c0Var2.E(-1319809649);
                if (nVar2 != null) {
                    androidx.compose.ui.a0 a0VarB113 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                    a1 a1VarE113 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK1111111112 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN1111111112 = androidx.compose.ui.m.n(c0Var2, a0VarB113);
                    function0A4 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A4);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD4 = y7.d(c0Var2);
                    y7.n(c0VarD4, a1VarE113, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111111112, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111111112, aVar3.f());
                    nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                    c0Var2.o();
                }
                c0Var2.A();
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                c0Var2.o();
                c0Var3 = c0Var2;
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j13 = j1117;
                j14 = j12;
                bVar3 = bVar116;
                nVar3 = nVar2;
                a0Var3 = a0Var116;
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        intercomTopBarIcon2 = intercomTopBarIcon;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                bVar2 = bVar;
                if (c0VarR.D(bVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) == 0) {
                jM704getHeader0d7_KjU = j10;
                if ((i11 & 16) == 0) {
                    i25 = 8192;
                } else {
                    i25 = 8192;
                }
                i12 |= i25;
            } else {
                jM704getHeader0d7_KjU = j10;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i12 |= i24;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.k0(function1)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY114 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB11117 = androidx.compose.foundation.layout.j0.b(mVarY114, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111113 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var117 = a0Var2;
                    androidx.compose.ui.a0 a0VarN1111111113 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j1118 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB11117, aVar3.e());
                    y7.n(c0VarD, b1VarK1111111113, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111111113, aVar3.f());
                    n0 n0Var114 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT114 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var117, j1118, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ114 = i1.j(a0VarT114, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK114 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111114 = androidx.compose.ui.m.n(c0VarR, a0VarJ114);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK114, aVar3.e());
                    y7.n(c0VarD2, b1VarK1111111114, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1111111114, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV114 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB11118 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111115 = androidx.compose.ui.m.n(c0VarR, a0VarV114);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar117 = bVarU;
                    y7.n(c0VarD3, a1VarB11118, aVar3.e());
                    y7.n(c0VarD3, b1VarK1111111115, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111111115, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB114 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE114 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK1111111116 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN1111111116 = androidx.compose.ui.m.n(c0Var2, a0VarB114);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE114, aVar3.e());
                        y7.n(c0VarD4, b1VarK1111111116, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN1111111116, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j1118;
                    j14 = j12;
                    bVar3 = bVar117;
                    nVar3 = nVar2;
                    a0Var3 = a0Var117;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i27 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        } else {
                            bVarU = bVar2;
                        }
                        if ((i11 & 16) != 0) {
                            jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM711getOnHeader0d7_KjU = j11;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (i19 != 0) {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = null;
                        } else {
                            j12 = jM711getOnHeader0d7_KjU;
                            str3 = str2;
                            nVar2 = nVar;
                        }
                    }
                    c0VarR.Z();
                    aVar = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.m mVarY115 = qVar.y();
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarB11119 = androidx.compose.foundation.layout.j0.b(mVarY115, aVar2.u(), c0VarR, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111117 = c0VarR.k();
                    androidx.compose.ui.a0 a0Var118 = a0Var2;
                    androidx.compose.ui.a0 a0VarN1111111117 = androidx.compose.ui.m.n(c0VarR, aVar);
                    aVar3 = androidx.compose.ui.node.g.I;
                    i21 = i12;
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
                    long j1119 = jM704getHeader0d7_KjU;
                    y7.n(c0VarD, a1VarB11119, aVar3.e());
                    y7.n(c0VarD, b1VarK1111111117, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111111117, aVar3.f());
                    n0 n0Var115 = n0.f16227a;
                    androidx.compose.ui.a0 a0VarT115 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var118, j1119, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                    c0VarR.E(86796077);
                    if ((i21 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarJ115 = i1.j(a0VarT115, false, null, null, null, (Function0) objI0, 15, null);
                    a1 a1VarK115 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111118 = androidx.compose.ui.m.n(c0VarR, a0VarJ115);
                    function0A2 = aVar3.a();
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
                    y7.n(c0VarD2, a1VarK115, aVar3.e());
                    y7.n(c0VarD2, b1VarK1111111118, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1111111118, aVar3.f());
                    d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    if (intercomTopBarIcon2 != null) {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    } else {
                        i22 = 16;
                        fR = androidx.compose.ui.unit.h.r(16);
                    }
                    androidx.compose.ui.a0 a0VarV115 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                    i23 = i21 >> 3;
                    a1 a1VarB111110 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111119 = androidx.compose.ui.m.n(c0VarR, a0VarV115);
                    function0A3 = aVar3.a();
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
                    androidx.compose.ui.e.b bVar118 = bVarU;
                    y7.n(c0VarD3, a1VarB111110, aVar3.e());
                    y7.n(c0VarD3, b1VarK1111111119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111111119, aVar3.f());
                    c0VarR.E(560412879);
                    if (str3 != null) {
                        q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.E(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                                invoke(c0Var4, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                                if ((i28 & 11) == 2 && c0Var4.d()) {
                                    c0Var4.u();
                                } else {
                                    ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                                }
                            }
                        }, c0Var2, 54), c0Var2, 1572864, 60);
                    }
                    c0Var2.A();
                    c0Var2.E(-1319809649);
                    if (nVar2 != null) {
                        androidx.compose.ui.a0 a0VarB115 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                        a1 a1VarE115 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                        b1 b1VarK11111111110 = c0Var2.k();
                        androidx.compose.ui.a0 a0VarN11111111110 = androidx.compose.ui.m.n(c0Var2, a0VarB115);
                        function0A4 = aVar3.a();
                        if (c0Var2.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var2.q();
                        if (c0Var2.P()) {
                            c0Var2.q0(function0A4);
                        } else {
                            c0Var2.l();
                        }
                        c0VarD4 = y7.d(c0Var2);
                        y7.n(c0VarD4, a1VarE115, aVar3.e());
                        y7.n(c0VarD4, b1VarK11111111110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11111111110, aVar3.f());
                        nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                        c0Var2.o();
                    }
                    c0Var2.A();
                    c0Var2.o();
                    IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                    c0Var2.o();
                    c0Var3 = c0Var2;
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j13 = j1119;
                    j14 = j12;
                    bVar3 = bVar118;
                    nVar3 = nVar2;
                    a0Var3 = a0Var118;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 23967451) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                }
                c0VarR.Z();
                aVar = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY116 = qVar.y();
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB111111 = androidx.compose.foundation.layout.j0.b(mVarY116, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111111 = c0VarR.k();
                androidx.compose.ui.a0 a0Var119 = a0Var2;
                androidx.compose.ui.a0 a0VarN11111111111 = androidx.compose.ui.m.n(c0VarR, aVar);
                aVar3 = androidx.compose.ui.node.g.I;
                i21 = i12;
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
                long j11110 = jM704getHeader0d7_KjU;
                y7.n(c0VarD, a1VarB111111, aVar3.e());
                y7.n(c0VarD, b1VarK11111111111, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111111, aVar3.f());
                n0 n0Var116 = n0.f16227a;
                androidx.compose.ui.a0 a0VarT116 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var119, j11110, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                c0VarR.E(86796077);
                if ((i21 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ116 = i1.j(a0VarT116, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK116 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111112 = androidx.compose.ui.m.n(c0VarR, a0VarJ116);
                function0A2 = aVar3.a();
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
                y7.n(c0VarD2, a1VarK116, aVar3.e());
                y7.n(c0VarD2, b1VarK11111111112, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11111111112, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                if (intercomTopBarIcon2 != null) {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                } else {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                androidx.compose.ui.a0 a0VarV116 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                i23 = i21 >> 3;
                a1 a1VarB111112 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111113 = androidx.compose.ui.m.n(c0VarR, a0VarV116);
                function0A3 = aVar3.a();
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
                androidx.compose.ui.e.b bVar119 = bVarU;
                y7.n(c0VarD3, a1VarB111112, aVar3.e());
                y7.n(c0VarD3, b1VarK11111111113, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11111111113, aVar3.f());
                c0VarR.E(560412879);
                if (str3 != null) {
                    q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                            if ((i28 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 1572864, 60);
                }
                c0Var2.A();
                c0Var2.E(-1319809649);
                if (nVar2 != null) {
                    androidx.compose.ui.a0 a0VarB116 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                    a1 a1VarE116 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK11111111114 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN11111111114 = androidx.compose.ui.m.n(c0Var2, a0VarB116);
                    function0A4 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A4);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD4 = y7.d(c0Var2);
                    y7.n(c0VarD4, a1VarE116, aVar3.e());
                    y7.n(c0VarD4, b1VarK11111111114, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN11111111114, aVar3.f());
                    nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                    c0Var2.o();
                }
                c0Var2.A();
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                c0Var2.o();
                c0Var3 = c0Var2;
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j13 = j11110;
                j14 = j12;
                bVar3 = bVar119;
                nVar3 = nVar2;
                a0Var3 = a0Var119;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                }
                c0VarR.Z();
                aVar = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY117 = qVar.y();
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB111113 = androidx.compose.foundation.layout.j0.b(mVarY117, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111115 = c0VarR.k();
                androidx.compose.ui.a0 a0Var1110 = a0Var2;
                androidx.compose.ui.a0 a0VarN11111111115 = androidx.compose.ui.m.n(c0VarR, aVar);
                aVar3 = androidx.compose.ui.node.g.I;
                i21 = i12;
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
                long j11111 = jM704getHeader0d7_KjU;
                y7.n(c0VarD, a1VarB111113, aVar3.e());
                y7.n(c0VarD, b1VarK11111111115, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111115, aVar3.f());
                n0 n0Var117 = n0.f16227a;
                androidx.compose.ui.a0 a0VarT117 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var1110, j11111, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                c0VarR.E(86796077);
                if ((i21 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ117 = i1.j(a0VarT117, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK117 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111116 = androidx.compose.ui.m.n(c0VarR, a0VarJ117);
                function0A2 = aVar3.a();
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
                y7.n(c0VarD2, a1VarK117, aVar3.e());
                y7.n(c0VarD2, b1VarK11111111116, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11111111116, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                if (intercomTopBarIcon2 != null) {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                } else {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                androidx.compose.ui.a0 a0VarV117 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                i23 = i21 >> 3;
                a1 a1VarB111114 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111117 = androidx.compose.ui.m.n(c0VarR, a0VarV117);
                function0A3 = aVar3.a();
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
                androidx.compose.ui.e.b bVar1110 = bVarU;
                y7.n(c0VarD3, a1VarB111114, aVar3.e());
                y7.n(c0VarD3, b1VarK11111111117, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11111111117, aVar3.f());
                c0VarR.E(560412879);
                if (str3 != null) {
                    q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                            if ((i28 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 1572864, 60);
                }
                c0Var2.A();
                c0Var2.E(-1319809649);
                if (nVar2 != null) {
                    androidx.compose.ui.a0 a0VarB117 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                    a1 a1VarE117 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK11111111118 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN11111111118 = androidx.compose.ui.m.n(c0Var2, a0VarB117);
                    function0A4 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A4);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD4 = y7.d(c0Var2);
                    y7.n(c0VarD4, a1VarE117, aVar3.e());
                    y7.n(c0VarD4, b1VarK11111111118, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN11111111118, aVar3.f());
                    nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                    c0Var2.o();
                }
                c0Var2.A();
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                c0Var2.o();
                c0Var3 = c0Var2;
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j13 = j11111;
                j14 = j12;
                bVar3 = bVar1110;
                nVar3 = nVar2;
                a0Var3 = a0Var1110;
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        bVar2 = bVar;
        if ((57344 & i10) == 0) {
            jM704getHeader0d7_KjU = j10;
            if ((i11 & 16) == 0) {
                i25 = 8192;
            } else {
                i25 = 8192;
            }
            i12 |= i25;
        } else {
            jM704getHeader0d7_KjU = j10;
        }
        if ((458752 & i10) != 0) {
            if ((i11 & 32) == 0) {
                i24 = 65536;
            } else {
                i24 = 65536;
            }
            i12 |= i24;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 3670016) == 0) {
                if (c0VarR.k0(function1)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            if ((i10 & 29360128) == 0) {
                if (c0VarR.k0(nVar)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 23967451) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                }
                c0VarR.Z();
                aVar = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY118 = qVar.y();
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB111115 = androidx.compose.foundation.layout.j0.b(mVarY118, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111119 = c0VarR.k();
                androidx.compose.ui.a0 a0Var1111 = a0Var2;
                androidx.compose.ui.a0 a0VarN11111111119 = androidx.compose.ui.m.n(c0VarR, aVar);
                aVar3 = androidx.compose.ui.node.g.I;
                i21 = i12;
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
                long j11112 = jM704getHeader0d7_KjU;
                y7.n(c0VarD, a1VarB111115, aVar3.e());
                y7.n(c0VarD, b1VarK11111111119, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111119, aVar3.f());
                n0 n0Var118 = n0.f16227a;
                androidx.compose.ui.a0 a0VarT118 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var1111, j11112, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                c0VarR.E(86796077);
                if ((i21 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ118 = i1.j(a0VarT118, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK118 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111110 = androidx.compose.ui.m.n(c0VarR, a0VarJ118);
                function0A2 = aVar3.a();
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
                y7.n(c0VarD2, a1VarK118, aVar3.e());
                y7.n(c0VarD2, b1VarK111111111110, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111111111110, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                if (intercomTopBarIcon2 != null) {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                } else {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                androidx.compose.ui.a0 a0VarV118 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                i23 = i21 >> 3;
                a1 a1VarB111116 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111111 = androidx.compose.ui.m.n(c0VarR, a0VarV118);
                function0A3 = aVar3.a();
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
                androidx.compose.ui.e.b bVar1111 = bVarU;
                y7.n(c0VarD3, a1VarB111116, aVar3.e());
                y7.n(c0VarD3, b1VarK111111111111, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111111111111, aVar3.f());
                c0VarR.E(560412879);
                if (str3 != null) {
                    q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                            if ((i28 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 1572864, 60);
                }
                c0Var2.A();
                c0Var2.E(-1319809649);
                if (nVar2 != null) {
                    androidx.compose.ui.a0 a0VarB118 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                    a1 a1VarE118 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK111111111112 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN111111111112 = androidx.compose.ui.m.n(c0Var2, a0VarB118);
                    function0A4 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A4);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD4 = y7.d(c0Var2);
                    y7.n(c0VarD4, a1VarE118, aVar3.e());
                    y7.n(c0VarD4, b1VarK111111111112, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111111111112, aVar3.f());
                    nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                    c0Var2.o();
                }
                c0Var2.A();
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                c0Var2.o();
                c0Var3 = c0Var2;
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j13 = j11112;
                j14 = j12;
                bVar3 = bVar1111;
                nVar3 = nVar2;
                a0Var3 = a0Var1111;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i27 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    } else {
                        bVarU = bVar2;
                    }
                    if ((i11 & 16) != 0) {
                        jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM711getOnHeader0d7_KjU = j11;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (i19 != 0) {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = null;
                    } else {
                        j12 = jM711getOnHeader0d7_KjU;
                        str3 = str2;
                        nVar2 = nVar;
                    }
                }
                c0VarR.Z();
                aVar = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY119 = qVar.y();
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB111117 = androidx.compose.foundation.layout.j0.b(mVarY119, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111113 = c0VarR.k();
                androidx.compose.ui.a0 a0Var1112 = a0Var2;
                androidx.compose.ui.a0 a0VarN111111111113 = androidx.compose.ui.m.n(c0VarR, aVar);
                aVar3 = androidx.compose.ui.node.g.I;
                i21 = i12;
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
                long j11113 = jM704getHeader0d7_KjU;
                y7.n(c0VarD, a1VarB111117, aVar3.e());
                y7.n(c0VarD, b1VarK111111111113, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111111113, aVar3.f());
                n0 n0Var119 = n0.f16227a;
                androidx.compose.ui.a0 a0VarT119 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var1112, j11113, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
                c0VarR.E(86796077);
                if ((i21 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarJ119 = i1.j(a0VarT119, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK119 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111114 = androidx.compose.ui.m.n(c0VarR, a0VarJ119);
                function0A2 = aVar3.a();
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
                y7.n(c0VarD2, a1VarK119, aVar3.e());
                y7.n(c0VarD2, b1VarK111111111114, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111111111114, aVar3.f());
                d0Var = androidx.compose.foundation.layout.d0.f15956a;
                if (intercomTopBarIcon2 != null) {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                } else {
                    i22 = 16;
                    fR = androidx.compose.ui.unit.h.r(16);
                }
                androidx.compose.ui.a0 a0VarV119 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
                i23 = i21 >> 3;
                a1 a1VarB111118 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111115 = androidx.compose.ui.m.n(c0VarR, a0VarV119);
                function0A3 = aVar3.a();
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
                androidx.compose.ui.e.b bVar1112 = bVarU;
                y7.n(c0VarD3, a1VarB111118, aVar3.e());
                y7.n(c0VarD3, b1VarK111111111115, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111111111115, aVar3.f());
                c0VarR.E(560412879);
                if (str3 != null) {
                    q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.E(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                            if ((i28 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                            } else {
                                ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                            }
                        }
                    }, c0Var2, 54), c0Var2, 1572864, 60);
                }
                c0Var2.A();
                c0Var2.E(-1319809649);
                if (nVar2 != null) {
                    androidx.compose.ui.a0 a0VarB119 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                    a1 a1VarE119 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                    b1 b1VarK111111111116 = c0Var2.k();
                    androidx.compose.ui.a0 a0VarN111111111116 = androidx.compose.ui.m.n(c0Var2, a0VarB119);
                    function0A4 = aVar3.a();
                    if (c0Var2.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var2.q();
                    if (c0Var2.P()) {
                        c0Var2.q0(function0A4);
                    } else {
                        c0Var2.l();
                    }
                    c0VarD4 = y7.d(c0Var2);
                    y7.n(c0VarD4, a1VarE119, aVar3.e());
                    y7.n(c0VarD4, b1VarK111111111116, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111111111116, aVar3.f());
                    nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                    c0Var2.o();
                }
                c0Var2.A();
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
                c0Var2.o();
                c0Var3 = c0Var2;
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j13 = j11113;
                j14 = j12;
                bVar3 = bVar1112;
                nVar3 = nVar2;
                a0Var3 = a0Var1112;
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        if ((i12 & 23967451) == 4793490) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i27 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i13 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                } else {
                    bVarU = bVar2;
                }
                if ((i11 & 16) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (i19 != 0) {
                    j12 = jM711getOnHeader0d7_KjU;
                    str3 = str2;
                    nVar2 = null;
                } else {
                    j12 = jM711getOnHeader0d7_KjU;
                    str3 = str2;
                    nVar2 = nVar;
                }
            } else {
                if (i26 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i27 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i13 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                } else {
                    bVarU = bVar2;
                }
                if ((i11 & 16) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (i19 != 0) {
                    j12 = jM711getOnHeader0d7_KjU;
                    str3 = str2;
                    nVar2 = null;
                } else {
                    j12 = jM711getOnHeader0d7_KjU;
                    str3 = str2;
                    nVar2 = nVar;
                }
            }
            c0VarR.Z();
            aVar = androidx.compose.ui.a0.E;
            qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY1110 = qVar.y();
            aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarB111119 = androidx.compose.foundation.layout.j0.b(mVarY1110, aVar2.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111111111117 = c0VarR.k();
            androidx.compose.ui.a0 a0Var1113 = a0Var2;
            androidx.compose.ui.a0 a0VarN111111111117 = androidx.compose.ui.m.n(c0VarR, aVar);
            aVar3 = androidx.compose.ui.node.g.I;
            i21 = i12;
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
            long j11114 = jM704getHeader0d7_KjU;
            y7.n(c0VarD, a1VarB111119, aVar3.e());
            y7.n(c0VarD, b1VarK111111111117, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN111111111117, aVar3.f());
            n0 n0Var1110 = n0.f16227a;
            androidx.compose.ui.a0 a0VarT1110 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var1113, j11114, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
            c0VarR.E(86796077);
            if ((i21 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarJ1110 = i1.j(a0VarT1110, false, null, null, null, (Function0) objI0, 15, null);
            a1 a1VarK1110 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111111111118 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN111111111118 = androidx.compose.ui.m.n(c0VarR, a0VarJ1110);
            function0A2 = aVar3.a();
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
            y7.n(c0VarD2, a1VarK1110, aVar3.e());
            y7.n(c0VarD2, b1VarK111111111118, aVar3.g());
            function2B2 = aVar3.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN111111111118, aVar3.f());
            d0Var = androidx.compose.foundation.layout.d0.f15956a;
            if (intercomTopBarIcon2 != null) {
                i22 = 16;
                fR = androidx.compose.ui.unit.h.r(16);
            } else {
                i22 = 16;
                fR = androidx.compose.ui.unit.h.r(16);
            }
            androidx.compose.ui.a0 a0VarV1110 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
            i23 = i21 >> 3;
            a1 a1VarB1111110 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111111111119 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN111111111119 = androidx.compose.ui.m.n(c0VarR, a0VarV1110);
            function0A3 = aVar3.a();
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
            androidx.compose.ui.e.b bVar1113 = bVarU;
            y7.n(c0VarD3, a1VarB1111110, aVar3.e());
            y7.n(c0VarD3, b1VarK111111111119, aVar3.g());
            function2B3 = aVar3.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN111111111119, aVar3.f());
            c0VarR.E(560412879);
            if (str3 != null) {
                q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                c0Var2 = c0VarR;
            } else {
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            c0Var2.o();
            c0Var2.E(-1319827237);
            if (intercomTopBarIcon2 != null) {
                ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                        invoke(c0Var4, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                        if ((i28 & 11) == 2 && c0Var4.d()) {
                            c0Var4.u();
                        } else {
                            ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                        }
                    }
                }, c0Var2, 54), c0Var2, 1572864, 60);
            }
            c0Var2.A();
            c0Var2.E(-1319809649);
            if (nVar2 != null) {
                androidx.compose.ui.a0 a0VarB1110 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                a1 a1VarE1110 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK1111111111110 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN1111111111110 = androidx.compose.ui.m.n(c0Var2, a0VarB1110);
                function0A4 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A4);
                } else {
                    c0Var2.l();
                }
                c0VarD4 = y7.d(c0Var2);
                y7.n(c0VarD4, a1VarE1110, aVar3.e());
                y7.n(c0VarD4, b1VarK1111111111110, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN1111111111110, aVar3.f());
                nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                c0Var2.o();
            }
            c0Var2.A();
            c0Var2.o();
            IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
            c0Var2.o();
            c0Var3 = c0Var2;
            intercomTopBarIcon3 = intercomTopBarIcon2;
            str4 = str3;
            j13 = j11114;
            j14 = j12;
            bVar3 = bVar1113;
            nVar3 = nVar2;
            a0Var3 = a0Var1113;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i27 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i13 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                } else {
                    bVarU = bVar2;
                }
                if ((i11 & 16) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (i19 != 0) {
                    j12 = jM711getOnHeader0d7_KjU;
                    str3 = str2;
                    nVar2 = null;
                } else {
                    j12 = jM711getOnHeader0d7_KjU;
                    str3 = str2;
                    nVar2 = nVar;
                }
            } else {
                if (i26 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i27 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i13 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i15 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                } else {
                    bVarU = bVar2;
                }
                if ((i11 & 16) != 0) {
                    jM704getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m704getHeader0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM711getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m711getOnHeader0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM711getOnHeader0d7_KjU = j11;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.component.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (i19 != 0) {
                    j12 = jM711getOnHeader0d7_KjU;
                    str3 = str2;
                    nVar2 = null;
                } else {
                    j12 = jM711getOnHeader0d7_KjU;
                    str3 = str2;
                    nVar2 = nVar;
                }
            }
            c0VarR.Z();
            aVar = androidx.compose.ui.a0.E;
            qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY1111 = qVar.y();
            aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarB1111111 = androidx.compose.foundation.layout.j0.b(mVarY1111, aVar2.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111111111 = c0VarR.k();
            androidx.compose.ui.a0 a0Var1114 = a0Var2;
            androidx.compose.ui.a0 a0VarN1111111111111 = androidx.compose.ui.m.n(c0VarR, aVar);
            aVar3 = androidx.compose.ui.node.g.I;
            i21 = i12;
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
            long j11115 = jM704getHeader0d7_KjU;
            y7.n(c0VarD, a1VarB1111111, aVar3.e());
            y7.n(c0VarD, b1VarK1111111111111, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1111111111111, aVar3.f());
            n0 n0Var1111 = n0.f16227a;
            androidx.compose.ui.a0 a0VarT1111 = d5.t(i6.i(i6.h(u7.i(androidx.compose.foundation.v.d(a0Var1114, j11115, null, 2, null)), 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), androidx.compose.ui.unit.h.r(4), 0.0f, 2, null);
            c0VarR.E(86796077);
            if ((i21 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(function2);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarJ1111 = i1.j(a0VarT1111, false, null, null, null, (Function0) objI0, 15, null);
            a1 a1VarK1111 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111111112 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111111111112 = androidx.compose.ui.m.n(c0VarR, a0VarJ1111);
            function0A2 = aVar3.a();
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
            y7.n(c0VarD2, a1VarK1111, aVar3.e());
            y7.n(c0VarD2, b1VarK1111111111112, aVar3.g());
            function2B2 = aVar3.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN1111111111112, aVar3.f());
            d0Var = androidx.compose.foundation.layout.d0.f15956a;
            if (intercomTopBarIcon2 != null) {
                i22 = 16;
                fR = androidx.compose.ui.unit.h.r(16);
            } else {
                i22 = 16;
                fR = androidx.compose.ui.unit.h.r(16);
            }
            androidx.compose.ui.a0 a0VarV1111 = d5.v(i6.f(aVar, 0.0f, 1, null), fR, 0.0f, androidx.compose.ui.unit.h.r(i22), 0.0f, 10, null);
            i23 = i21 >> 3;
            a1 a1VarB1111112 = androidx.compose.foundation.layout.j0.b(qVar.m(), bVarU, c0VarR, 6 | ((((i23 & 896) | 48) >> 3) & com.planner5d.library.engine.input.f.b.B));
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111111113 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111111111113 = androidx.compose.ui.m.n(c0VarR, a0VarV1111);
            function0A3 = aVar3.a();
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
            androidx.compose.ui.e.b bVar1114 = bVarU;
            y7.n(c0VarD3, a1VarB1111112, aVar3.e());
            y7.n(c0VarD3, b1VarK1111111111113, aVar3.g());
            function2B3 = aVar3.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN1111111111113, aVar3.f());
            c0VarR.E(560412879);
            if (str3 != null) {
                q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, 6).getType03(), j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, i23 & 14, 24960, 110590);
                c0Var2 = c0VarR;
            } else {
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            c0Var2.o();
            c0Var2.E(-1319827237);
            if (intercomTopBarIcon2 != null) {
                ei.D(intercomTopBarIcon2.getOnClick(), d0Var.b(aVar, aVar2.o()), false, null, null, null, androidx.compose.runtime.internal.w.e(-423583748, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                        invoke(c0Var4, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var4, int i28) {
                        if ((i28 & 11) == 2 && c0Var4.d()) {
                            c0Var4.u();
                        } else {
                            ni.o(u0.e.c(intercomTopBarIcon2.getIconRes(), c0Var4, 0), intercomTopBarIcon2.getContentDescription(), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), j12, c0Var4, 392, 0);
                        }
                    }
                }, c0Var2, 54), c0Var2, 1572864, 60);
            }
            c0Var2.A();
            c0Var2.E(-1319809649);
            if (nVar2 != null) {
                androidx.compose.ui.a0 a0VarB1111 = d0Var.b(i6.J(i6.d(r60, 0.0f, 1, null), null, false, 3, null), aVar2.k());
                a1 a1VarE1111 = u5.e(qVar.w(), aVar2.q(), c0Var2, 48);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK1111111111114 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN1111111111114 = androidx.compose.ui.m.n(c0Var2, a0VarB1111);
                function0A4 = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A4);
                } else {
                    c0Var2.l();
                }
                c0VarD4 = y7.d(c0Var2);
                y7.n(c0VarD4, a1VarE1111, aVar3.e());
                y7.n(c0VarD4, b1VarK1111111111114, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN1111111111114, aVar3.f());
                nVar2.invoke(y5.f16577a, c0Var2, Integer.valueOf(6 | ((i21 >> 18) & com.planner5d.library.engine.input.f.b.B)));
                c0Var2.o();
            }
            c0Var2.A();
            c0Var2.o();
            IntercomDividerKt.IntercomDivider(null, c0Var2, 0, 1);
            c0Var2.o();
            c0Var3 = c0Var2;
            intercomTopBarIcon3 = intercomTopBarIcon2;
            str4 = str3;
            j13 = j11115;
            j14 = j12;
            bVar3 = bVar1114;
            nVar3 = nVar2;
            a0Var3 = a0Var1114;
        }
        s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(a0Var3, str4, intercomTopBarIcon3, bVar3, j13, j14, function2, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void IntercomTopBarPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-358701081);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m576getLambda1$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomTopBarKt.IntercomTopBarPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBarPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        IntercomTopBarPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void IntercomTopBarPreviewWithMenuItems(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2022840780);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m580getLambda5$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomTopBarKt.IntercomTopBarPreviewWithMenuItems$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBarPreviewWithMenuItems$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        IntercomTopBarPreviewWithMenuItems(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void IntercomTopBarPreviewWithoutNavIcon(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-110907621);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m577getLambda2$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomTopBarKt.IntercomTopBarPreviewWithoutNavIcon$lambda$9(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBarPreviewWithoutNavIcon$lambda$9(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        IntercomTopBarPreviewWithoutNavIcon(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBar_bogVsAg$lambda$7(androidx.compose.ui.a0 a0Var, String str, IntercomTopBarIcon intercomTopBarIcon, androidx.compose.ui.e.b bVar, long j10, long j11, Function0 function0, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        m608IntercomTopBarbogVsAg(a0Var, str, intercomTopBarIcon, bVar, j10, j11, function0, nVar, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
