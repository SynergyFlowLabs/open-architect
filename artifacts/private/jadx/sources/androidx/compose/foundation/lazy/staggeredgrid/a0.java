package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.c5;
import androidx.compose.foundation.gestures.c3;
import androidx.compose.foundation.gestures.l4;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.lazy.layout.r1;
import androidx.compose.foundation.x3;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.o1;
import androidx.compose.ui.platform.q1;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,126:1\n113#2:127\n113#2:128\n113#2:129\n607#3:130\n604#3,6:131\n1282#4,3:137\n1285#4,3:141\n605#5:140\n75#6:144\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n48#1:127\n58#1:128\n60#1:129\n65#1:130\n65#1:131,6\n65#1:137,3\n65#1:141,3\n65#1:140\n66#1:144\n*E\n"})
public final class a0 {
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x0159  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165  */
    /* JADX WARN: Code duplicated, block: B:125:0x016a  */
    /* JADX WARN: Code duplicated, block: B:127:0x016e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0174  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:134:0x018c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0195  */
    /* JADX WARN: Code duplicated, block: B:141:0x019f  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:162:0x0205  */
    /* JADX WARN: Code duplicated, block: B:165:0x020a  */
    /* JADX WARN: Code duplicated, block: B:168:0x020f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0215  */
    /* JADX WARN: Code duplicated, block: B:171:0x0219  */
    /* JADX WARN: Code duplicated, block: B:172:0x0228  */
    /* JADX WARN: Code duplicated, block: B:175:0x023c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0259  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:186:0x036b  */
    /* JADX WARN: Code duplicated, block: B:188:0x037e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0397  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@NotNull final a1 a1Var, @NotNull final q3 q3Var, @NotNull final a aVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable g5 g5Var, boolean z10, @Nullable c3 c3Var, boolean z11, @Nullable final x3 x3Var, float f10, float f11, @NotNull final Function1<? super o0, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        g5 g5Var2;
        int i15;
        int i16;
        boolean z12;
        int i17;
        c3 c3VarA;
        int i18;
        boolean z13;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z14;
        final float f12;
        androidx.compose.runtime.c0 c0Var2;
        final c3 c3Var2;
        final boolean z15;
        final g5 g5Var3;
        final boolean z16;
        final androidx.compose.ui.a0 a0Var3;
        final float f13;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        g5 g5VarF;
        int i29;
        androidx.compose.ui.a0 a0Var5;
        int i30;
        int i31;
        Object objI0;
        q3 q3Var2;
        androidx.compose.ui.a0 a0VarB;
        int i32;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1904835166);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.D(a1Var) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c0VarR.K(q3Var.ordinal()) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i13 |= (i10 & 512) == 0 ? c0VarR.D(aVar) : c0VarR.k0(aVar) ? 256 : 128;
        }
        int i33 = i12 & 8;
        if (i33 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    g5Var2 = g5Var;
                    if (c0VarR.D(g5Var2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z12)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    c3VarA = c3Var;
                    if ((i12 & 64) == 0 || !c0VarR.D(c3VarA)) {
                        i32 = 524288;
                    } else {
                        i32 = 1048576;
                    }
                    i13 |= i32;
                } else {
                    c3VarA = c3Var;
                }
                i18 = i12 & 128;
                if (i18 != 0) {
                    i13 |= 12582912;
                    z13 = z11;
                } else {
                    z13 = z11;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.G(z13)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(x3Var)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 512;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.I(f10)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 1024;
                        if (i23 != 0) {
                            i24 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.I(f11)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i11 | i25;
                        } else {
                            i24 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            i24 |= 48;
                        } else if ((i11 & 48) == 0) {
                            if (c0VarR.k0(function1)) {
                                i26 = 32;
                            } else {
                                i26 = 16;
                            }
                            i24 |= i26;
                        }
                        i27 = i24;
                        i28 = i13;
                        if ((i28 & 306783379) == 306783378 || (i27 & 19) != 18) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i28 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i33 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                                } else {
                                    g5VarF = g5Var2;
                                }
                                if (i16 != 0) {
                                    z12 = false;
                                }
                                if ((i12 & 64) != 0) {
                                    c3VarA = l4.f14799a.a(c0VarR, 6);
                                    i29 = i28 & (-3670017);
                                } else {
                                    i29 = i28;
                                }
                                z13 = i18 == 0 ? z13 : true;
                                if (i21 != 0) {
                                    f10 = androidx.compose.ui.unit.h.r(0);
                                } else {
                                    f10 = f10;
                                }
                                if (i23 != 0) {
                                    a0Var5 = a0Var4;
                                    g5Var2 = g5VarF;
                                    z12 = z12;
                                    c3VarA = c3VarA;
                                    i30 = i29;
                                    f11 = androidx.compose.ui.unit.h.r(0);
                                } else {
                                    a0Var5 = a0Var4;
                                    g5Var2 = g5VarF;
                                    z12 = z12;
                                    c3VarA = c3VarA;
                                    i30 = i29;
                                    f11 = f11;
                                }
                            } else {
                                c0VarR.u();
                                i30 = (i12 & 64) != 0 ? i28 & (-3670017) : i28;
                                a0Var5 = a0Var2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                            }
                            i31 = i30 & 14;
                            Function0<r> function0C = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            int i34 = i30 >> 6;
                            int i35 = i30 >> 12;
                            int i36 = i30;
                            float f14 = f10;
                            androidx.compose.foundation.lazy.layout.v0 v0VarF = i0.f(a1Var, function0C, g5Var2, z12, q3Var, f14, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i34 & 7168) | (i34 & 896) | i31 | ((i30 << 9) & 57344) | (i35 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                            g5 g5Var4 = g5Var2;
                            float f15 = f11;
                            androidx.compose.foundation.lazy.layout.q1 q1VarA = t0.a(a1Var, z12, c0VarR, (i35 & com.planner5d.library.engine.input.f.b.B) | i31);
                            if (z13) {
                                c0VarR.E(-1834534838);
                                q3Var2 = q3Var;
                                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                                c0VarR.A();
                            } else {
                                q3Var2 = q3Var;
                                c0VarR.E(-1834229984);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            boolean z17 = z12;
                            boolean z18 = z13;
                            c3 c3Var3 = c3VarA;
                            androidx.compose.foundation.lazy.layout.u0.c(function0C, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C, q1VarA, q3Var2, z18, z17, c0VarR, ((i36 << 6) & 7168) | ((i36 >> 9) & 57344) | (i36 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z18, z17, c3Var3, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF, c0VarR, 0, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            c0Var2 = c0VarR;
                            z16 = z17;
                            c3Var2 = c3Var3;
                            a0Var3 = a0Var5;
                            z15 = z18;
                            g5Var3 = g5Var4;
                            f13 = f14;
                            f12 = f15;
                        } else {
                            c0VarR.u();
                            f12 = f11;
                            c0Var2 = c0VarR;
                            c3Var2 = c3VarA;
                            z15 = z13;
                            g5Var3 = g5Var2;
                            z16 = z12;
                            a0Var3 = a0Var2;
                            f13 = f10;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i23 = i12 & 1024;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.I(f11)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function1)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    i28 = i13;
                    if ((i28 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c0VarR.h(z14, i28 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i33 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i29 = i28 & (-3670017);
                            } else {
                                i29 = i28;
                            }
                            if (i18 == 0) {
                            }
                            if (i21 != 0) {
                                f10 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                f10 = f10;
                            }
                            if (i23 != 0) {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = f11;
                            }
                        } else {
                            if (i33 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i29 = i28 & (-3670017);
                            } else {
                                i29 = i28;
                            }
                            if (i18 == 0) {
                            }
                            if (i21 != 0) {
                                f10 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                f10 = f10;
                            }
                            if (i23 != 0) {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                        }
                        i31 = i30 & 14;
                        Function0<r> function0C2 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        int i37 = i30 >> 6;
                        int i38 = i30 >> 12;
                        int i39 = i30;
                        float f16 = f10;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF2 = i0.f(a1Var, function0C2, g5Var2, z12, q3Var, f16, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i37 & 7168) | (i37 & 896) | i31 | ((i30 << 9) & 57344) | (i38 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                        g5 g5Var5 = g5Var2;
                        float f17 = f11;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA2 = t0.a(a1Var, z12, c0VarR, (i38 & com.planner5d.library.engine.input.f.b.B) | i31);
                        if (z13) {
                            c0VarR.E(-1834534838);
                            q3Var2 = q3Var;
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                            c0VarR.A();
                        } else {
                            q3Var2 = q3Var;
                            c0VarR.E(-1834229984);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        boolean z19 = z12;
                        boolean z110 = z13;
                        c3 c3Var4 = c3VarA;
                        androidx.compose.foundation.lazy.layout.u0.c(function0C2, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C2, q1VarA2, q3Var2, z110, z19, c0VarR, ((i39 << 6) & 7168) | ((i39 >> 9) & 57344) | (i39 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z110, z19, c3Var4, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF2, c0VarR, 0, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        z16 = z19;
                        c3Var2 = c3Var4;
                        a0Var3 = a0Var5;
                        z15 = z110;
                        g5Var3 = g5Var5;
                        f13 = f16;
                        f12 = f17;
                    } else {
                        c0VarR.u();
                        f12 = f11;
                        c0Var2 = c0VarR;
                        c3Var2 = c3VarA;
                        z15 = z13;
                        g5Var3 = g5Var2;
                        z16 = z12;
                        a0Var3 = a0Var2;
                        f13 = f10;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i21 = i12 & 512;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f10)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 1024;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.I(f11)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function1)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    i28 = i13;
                    if ((i28 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c0VarR.h(z14, i28 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i33 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i29 = i28 & (-3670017);
                            } else {
                                i29 = i28;
                            }
                            if (i18 == 0) {
                            }
                            if (i21 != 0) {
                                f10 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                f10 = f10;
                            }
                            if (i23 != 0) {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = f11;
                            }
                        } else {
                            if (i33 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i29 = i28 & (-3670017);
                            } else {
                                i29 = i28;
                            }
                            if (i18 == 0) {
                            }
                            if (i21 != 0) {
                                f10 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                f10 = f10;
                            }
                            if (i23 != 0) {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                        }
                        i31 = i30 & 14;
                        Function0<r> function0C3 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        int i310 = i30 >> 6;
                        int i311 = i30 >> 12;
                        int i312 = i30;
                        float f18 = f10;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF3 = i0.f(a1Var, function0C3, g5Var2, z12, q3Var, f18, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i310 & 7168) | (i310 & 896) | i31 | ((i30 << 9) & 57344) | (i311 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                        g5 g5Var6 = g5Var2;
                        float f19 = f11;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA3 = t0.a(a1Var, z12, c0VarR, (i311 & com.planner5d.library.engine.input.f.b.B) | i31);
                        if (z13) {
                            c0VarR.E(-1834534838);
                            q3Var2 = q3Var;
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                            c0VarR.A();
                        } else {
                            q3Var2 = q3Var;
                            c0VarR.E(-1834229984);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        boolean z111 = z12;
                        boolean z112 = z13;
                        c3 c3Var5 = c3VarA;
                        androidx.compose.foundation.lazy.layout.u0.c(function0C3, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C3, q1VarA3, q3Var2, z112, z111, c0VarR, ((i312 << 6) & 7168) | ((i312 >> 9) & 57344) | (i312 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z112, z111, c3Var5, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF3, c0VarR, 0, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        z16 = z111;
                        c3Var2 = c3Var5;
                        a0Var3 = a0Var5;
                        z15 = z112;
                        g5Var3 = g5Var6;
                        f13 = f18;
                        f12 = f19;
                    } else {
                        c0VarR.u();
                        f12 = f11;
                        c0Var2 = c0VarR;
                        c3Var2 = c3VarA;
                        z15 = z13;
                        g5Var3 = g5Var2;
                        z16 = z12;
                        a0Var3 = a0Var2;
                        f13 = f10;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.I(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function1)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                i28 = i13;
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i28 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    } else {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i31 = i30 & 14;
                    Function0<r> function0C4 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    int i313 = i30 >> 6;
                    int i314 = i30 >> 12;
                    int i315 = i30;
                    float f110 = f10;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF4 = i0.f(a1Var, function0C4, g5Var2, z12, q3Var, f110, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i313 & 7168) | (i313 & 896) | i31 | ((i30 << 9) & 57344) | (i314 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                    g5 g5Var7 = g5Var2;
                    float f111 = f11;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA4 = t0.a(a1Var, z12, c0VarR, (i314 & com.planner5d.library.engine.input.f.b.B) | i31);
                    if (z13) {
                        c0VarR.E(-1834534838);
                        q3Var2 = q3Var;
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                        c0VarR.A();
                    } else {
                        q3Var2 = q3Var;
                        c0VarR.E(-1834229984);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z113 = z12;
                    boolean z114 = z13;
                    c3 c3Var6 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C4, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C4, q1VarA4, q3Var2, z114, z113, c0VarR, ((i315 << 6) & 7168) | ((i315 >> 9) & 57344) | (i315 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z114, z113, c3Var6, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF4, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    z16 = z113;
                    c3Var2 = c3Var6;
                    a0Var3 = a0Var5;
                    z15 = z114;
                    g5Var3 = g5Var7;
                    f13 = f110;
                    f12 = f111;
                } else {
                    c0VarR.u();
                    f12 = f11;
                    c0Var2 = c0VarR;
                    c3Var2 = c3VarA;
                    z15 = z13;
                    g5Var3 = g5Var2;
                    z16 = z12;
                    a0Var3 = a0Var2;
                    f13 = f10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            g5Var2 = g5Var;
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z12)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            if ((i10 & 1572864) == 0) {
                c3VarA = c3Var;
                if ((i12 & 64) == 0) {
                    i32 = 524288;
                } else {
                    i32 = 524288;
                }
                i13 |= i32;
            } else {
                c3VarA = c3Var;
            }
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
                z13 = z11;
            } else {
                z13 = z11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z13)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(x3Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f10)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 1024;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.I(f11)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function1)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    i28 = i13;
                    if ((i28 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c0VarR.h(z14, i28 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i33 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i29 = i28 & (-3670017);
                            } else {
                                i29 = i28;
                            }
                            if (i18 == 0) {
                            }
                            if (i21 != 0) {
                                f10 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                f10 = f10;
                            }
                            if (i23 != 0) {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = f11;
                            }
                        } else {
                            if (i33 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i29 = i28 & (-3670017);
                            } else {
                                i29 = i28;
                            }
                            if (i18 == 0) {
                            }
                            if (i21 != 0) {
                                f10 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                f10 = f10;
                            }
                            if (i23 != 0) {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                        }
                        i31 = i30 & 14;
                        Function0<r> function0C5 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        int i316 = i30 >> 6;
                        int i317 = i30 >> 12;
                        int i318 = i30;
                        float f112 = f10;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF5 = i0.f(a1Var, function0C5, g5Var2, z12, q3Var, f112, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i316 & 7168) | (i316 & 896) | i31 | ((i30 << 9) & 57344) | (i317 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                        g5 g5Var8 = g5Var2;
                        float f113 = f11;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA5 = t0.a(a1Var, z12, c0VarR, (i317 & com.planner5d.library.engine.input.f.b.B) | i31);
                        if (z13) {
                            c0VarR.E(-1834534838);
                            q3Var2 = q3Var;
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                            c0VarR.A();
                        } else {
                            q3Var2 = q3Var;
                            c0VarR.E(-1834229984);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        boolean z115 = z12;
                        boolean z116 = z13;
                        c3 c3Var7 = c3VarA;
                        androidx.compose.foundation.lazy.layout.u0.c(function0C5, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C5, q1VarA5, q3Var2, z116, z115, c0VarR, ((i318 << 6) & 7168) | ((i318 >> 9) & 57344) | (i318 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z116, z115, c3Var7, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF5, c0VarR, 0, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        z16 = z115;
                        c3Var2 = c3Var7;
                        a0Var3 = a0Var5;
                        z15 = z116;
                        g5Var3 = g5Var8;
                        f13 = f112;
                        f12 = f113;
                    } else {
                        c0VarR.u();
                        f12 = f11;
                        c0Var2 = c0VarR;
                        c3Var2 = c3VarA;
                        z15 = z13;
                        g5Var3 = g5Var2;
                        z16 = z12;
                        a0Var3 = a0Var2;
                        f13 = f10;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.I(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function1)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                i28 = i13;
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i28 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    } else {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i31 = i30 & 14;
                    Function0<r> function0C6 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    int i319 = i30 >> 6;
                    int i3110 = i30 >> 12;
                    int i3111 = i30;
                    float f114 = f10;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF6 = i0.f(a1Var, function0C6, g5Var2, z12, q3Var, f114, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i319 & 7168) | (i319 & 896) | i31 | ((i30 << 9) & 57344) | (i3110 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                    g5 g5Var9 = g5Var2;
                    float f115 = f11;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA6 = t0.a(a1Var, z12, c0VarR, (i3110 & com.planner5d.library.engine.input.f.b.B) | i31);
                    if (z13) {
                        c0VarR.E(-1834534838);
                        q3Var2 = q3Var;
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                        c0VarR.A();
                    } else {
                        q3Var2 = q3Var;
                        c0VarR.E(-1834229984);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z117 = z12;
                    boolean z118 = z13;
                    c3 c3Var8 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C6, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C6, q1VarA6, q3Var2, z118, z117, c0VarR, ((i3111 << 6) & 7168) | ((i3111 >> 9) & 57344) | (i3111 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z118, z117, c3Var8, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF6, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    z16 = z117;
                    c3Var2 = c3Var8;
                    a0Var3 = a0Var5;
                    z15 = z118;
                    g5Var3 = g5Var9;
                    f13 = f114;
                    f12 = f115;
                } else {
                    c0VarR.u();
                    f12 = f11;
                    c0Var2 = c0VarR;
                    c3Var2 = c3VarA;
                    z15 = z13;
                    g5Var3 = g5Var2;
                    z16 = z12;
                    a0Var3 = a0Var2;
                    f13 = f10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i21 = i12 & 512;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f10)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.I(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function1)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                i28 = i13;
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i28 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    } else {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i31 = i30 & 14;
                    Function0<r> function0C7 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    int i3112 = i30 >> 6;
                    int i3113 = i30 >> 12;
                    int i3114 = i30;
                    float f116 = f10;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF7 = i0.f(a1Var, function0C7, g5Var2, z12, q3Var, f116, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i3112 & 7168) | (i3112 & 896) | i31 | ((i30 << 9) & 57344) | (i3113 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                    g5 g5Var10 = g5Var2;
                    float f117 = f11;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA7 = t0.a(a1Var, z12, c0VarR, (i3113 & com.planner5d.library.engine.input.f.b.B) | i31);
                    if (z13) {
                        c0VarR.E(-1834534838);
                        q3Var2 = q3Var;
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                        c0VarR.A();
                    } else {
                        q3Var2 = q3Var;
                        c0VarR.E(-1834229984);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z119 = z12;
                    boolean z1110 = z13;
                    c3 c3Var9 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C7, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C7, q1VarA7, q3Var2, z1110, z119, c0VarR, ((i3114 << 6) & 7168) | ((i3114 >> 9) & 57344) | (i3114 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z1110, z119, c3Var9, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF7, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    z16 = z119;
                    c3Var2 = c3Var9;
                    a0Var3 = a0Var5;
                    z15 = z1110;
                    g5Var3 = g5Var10;
                    f13 = f116;
                    f12 = f117;
                } else {
                    c0VarR.u();
                    f12 = f11;
                    c0Var2 = c0VarR;
                    c3Var2 = c3VarA;
                    z15 = z13;
                    g5Var3 = g5Var2;
                    z16 = z12;
                    a0Var3 = a0Var2;
                    f13 = f10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 1024;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.I(f11)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 2048) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function1)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            i28 = i13;
            if ((i28 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c0VarR.h(z14, i28 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i33 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i29 = i28 & (-3670017);
                    } else {
                        i29 = i28;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        f10 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        f10 = f10;
                    }
                    if (i23 != 0) {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = f11;
                    }
                } else {
                    if (i33 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i29 = i28 & (-3670017);
                    } else {
                        i29 = i28;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        f10 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        f10 = f10;
                    }
                    if (i23 != 0) {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                }
                i31 = i30 & 14;
                Function0<r> function0C8 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                int i3115 = i30 >> 6;
                int i3116 = i30 >> 12;
                int i3117 = i30;
                float f118 = f10;
                androidx.compose.foundation.lazy.layout.v0 v0VarF8 = i0.f(a1Var, function0C8, g5Var2, z12, q3Var, f118, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i3115 & 7168) | (i3115 & 896) | i31 | ((i30 << 9) & 57344) | (i3116 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                g5 g5Var11 = g5Var2;
                float f119 = f11;
                androidx.compose.foundation.lazy.layout.q1 q1VarA8 = t0.a(a1Var, z12, c0VarR, (i3116 & com.planner5d.library.engine.input.f.b.B) | i31);
                if (z13) {
                    c0VarR.E(-1834534838);
                    q3Var2 = q3Var;
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                    c0VarR.A();
                } else {
                    q3Var2 = q3Var;
                    c0VarR.E(-1834229984);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                boolean z1111 = z12;
                boolean z1112 = z13;
                c3 c3Var10 = c3VarA;
                androidx.compose.foundation.lazy.layout.u0.c(function0C8, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C8, q1VarA8, q3Var2, z1112, z1111, c0VarR, ((i3117 << 6) & 7168) | ((i3117 >> 9) & 57344) | (i3117 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z1112, z1111, c3Var10, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF8, c0VarR, 0, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                z16 = z1111;
                c3Var2 = c3Var10;
                a0Var3 = a0Var5;
                z15 = z1112;
                g5Var3 = g5Var11;
                f13 = f118;
                f12 = f119;
            } else {
                c0VarR.u();
                f12 = f11;
                c0Var2 = c0VarR;
                c3Var2 = c3VarA;
                z15 = z13;
                g5Var3 = g5Var2;
                z16 = z12;
                a0Var3 = a0Var2;
                f13 = f10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        a0Var2 = a0Var;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i10 & 24576) == 0) {
                g5Var2 = g5Var;
                if (c0VarR.D(g5Var2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z12)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            if ((i10 & 1572864) == 0) {
                c3VarA = c3Var;
                if ((i12 & 64) == 0) {
                    i32 = 524288;
                } else {
                    i32 = 524288;
                }
                i13 |= i32;
            } else {
                c3VarA = c3Var;
            }
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
                z13 = z11;
            } else {
                z13 = z11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z13)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(x3Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f10)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 1024;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.I(f11)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function1)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    i28 = i13;
                    if ((i28 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c0VarR.h(z14, i28 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i33 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i29 = i28 & (-3670017);
                            } else {
                                i29 = i28;
                            }
                            if (i18 == 0) {
                            }
                            if (i21 != 0) {
                                f10 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                f10 = f10;
                            }
                            if (i23 != 0) {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = f11;
                            }
                        } else {
                            if (i33 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i29 = i28 & (-3670017);
                            } else {
                                i29 = i28;
                            }
                            if (i18 == 0) {
                            }
                            if (i21 != 0) {
                                f10 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                f10 = f10;
                            }
                            if (i23 != 0) {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = androidx.compose.ui.unit.h.r(0);
                            } else {
                                a0Var5 = a0Var4;
                                g5Var2 = g5VarF;
                                z12 = z12;
                                c3VarA = c3VarA;
                                i30 = i29;
                                f11 = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                        }
                        i31 = i30 & 14;
                        Function0<r> function0C9 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        int i3118 = i30 >> 6;
                        int i3119 = i30 >> 12;
                        int i31110 = i30;
                        float f1110 = f10;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF9 = i0.f(a1Var, function0C9, g5Var2, z12, q3Var, f1110, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i3118 & 7168) | (i3118 & 896) | i31 | ((i30 << 9) & 57344) | (i3119 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                        g5 g5Var12 = g5Var2;
                        float f1111 = f11;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA9 = t0.a(a1Var, z12, c0VarR, (i3119 & com.planner5d.library.engine.input.f.b.B) | i31);
                        if (z13) {
                            c0VarR.E(-1834534838);
                            q3Var2 = q3Var;
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                            c0VarR.A();
                        } else {
                            q3Var2 = q3Var;
                            c0VarR.E(-1834229984);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        boolean z1113 = z12;
                        boolean z1114 = z13;
                        c3 c3Var11 = c3VarA;
                        androidx.compose.foundation.lazy.layout.u0.c(function0C9, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C9, q1VarA9, q3Var2, z1114, z1113, c0VarR, ((i31110 << 6) & 7168) | ((i31110 >> 9) & 57344) | (i31110 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z1114, z1113, c3Var11, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF9, c0VarR, 0, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        z16 = z1113;
                        c3Var2 = c3Var11;
                        a0Var3 = a0Var5;
                        z15 = z1114;
                        g5Var3 = g5Var12;
                        f13 = f1110;
                        f12 = f1111;
                    } else {
                        c0VarR.u();
                        f12 = f11;
                        c0Var2 = c0VarR;
                        c3Var2 = c3VarA;
                        z15 = z13;
                        g5Var3 = g5Var2;
                        z16 = z12;
                        a0Var3 = a0Var2;
                        f13 = f10;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.I(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function1)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                i28 = i13;
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i28 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    } else {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i31 = i30 & 14;
                    Function0<r> function0C10 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    int i31111 = i30 >> 6;
                    int i31112 = i30 >> 12;
                    int i31113 = i30;
                    float f1112 = f10;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF10 = i0.f(a1Var, function0C10, g5Var2, z12, q3Var, f1112, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i31111 & 7168) | (i31111 & 896) | i31 | ((i30 << 9) & 57344) | (i31112 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                    g5 g5Var13 = g5Var2;
                    float f1113 = f11;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA10 = t0.a(a1Var, z12, c0VarR, (i31112 & com.planner5d.library.engine.input.f.b.B) | i31);
                    if (z13) {
                        c0VarR.E(-1834534838);
                        q3Var2 = q3Var;
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                        c0VarR.A();
                    } else {
                        q3Var2 = q3Var;
                        c0VarR.E(-1834229984);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z1115 = z12;
                    boolean z1116 = z13;
                    c3 c3Var12 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C10, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C10, q1VarA10, q3Var2, z1116, z1115, c0VarR, ((i31113 << 6) & 7168) | ((i31113 >> 9) & 57344) | (i31113 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z1116, z1115, c3Var12, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF10, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    z16 = z1115;
                    c3Var2 = c3Var12;
                    a0Var3 = a0Var5;
                    z15 = z1116;
                    g5Var3 = g5Var13;
                    f13 = f1112;
                    f12 = f1113;
                } else {
                    c0VarR.u();
                    f12 = f11;
                    c0Var2 = c0VarR;
                    c3Var2 = c3VarA;
                    z15 = z13;
                    g5Var3 = g5Var2;
                    z16 = z12;
                    a0Var3 = a0Var2;
                    f13 = f10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i21 = i12 & 512;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f10)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.I(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function1)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                i28 = i13;
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i28 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    } else {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i31 = i30 & 14;
                    Function0<r> function0C11 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    int i31114 = i30 >> 6;
                    int i31115 = i30 >> 12;
                    int i31116 = i30;
                    float f1114 = f10;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF11 = i0.f(a1Var, function0C11, g5Var2, z12, q3Var, f1114, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i31114 & 7168) | (i31114 & 896) | i31 | ((i30 << 9) & 57344) | (i31115 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                    g5 g5Var14 = g5Var2;
                    float f1115 = f11;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA11 = t0.a(a1Var, z12, c0VarR, (i31115 & com.planner5d.library.engine.input.f.b.B) | i31);
                    if (z13) {
                        c0VarR.E(-1834534838);
                        q3Var2 = q3Var;
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                        c0VarR.A();
                    } else {
                        q3Var2 = q3Var;
                        c0VarR.E(-1834229984);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z1117 = z12;
                    boolean z1118 = z13;
                    c3 c3Var13 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C11, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C11, q1VarA11, q3Var2, z1118, z1117, c0VarR, ((i31116 << 6) & 7168) | ((i31116 >> 9) & 57344) | (i31116 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z1118, z1117, c3Var13, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF11, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    z16 = z1117;
                    c3Var2 = c3Var13;
                    a0Var3 = a0Var5;
                    z15 = z1118;
                    g5Var3 = g5Var14;
                    f13 = f1114;
                    f12 = f1115;
                } else {
                    c0VarR.u();
                    f12 = f11;
                    c0Var2 = c0VarR;
                    c3Var2 = c3VarA;
                    z15 = z13;
                    g5Var3 = g5Var2;
                    z16 = z12;
                    a0Var3 = a0Var2;
                    f13 = f10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 1024;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.I(f11)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 2048) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function1)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            i28 = i13;
            if ((i28 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c0VarR.h(z14, i28 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i33 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i29 = i28 & (-3670017);
                    } else {
                        i29 = i28;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        f10 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        f10 = f10;
                    }
                    if (i23 != 0) {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = f11;
                    }
                } else {
                    if (i33 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i29 = i28 & (-3670017);
                    } else {
                        i29 = i28;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        f10 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        f10 = f10;
                    }
                    if (i23 != 0) {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                }
                i31 = i30 & 14;
                Function0<r> function0C12 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                int i31117 = i30 >> 6;
                int i31118 = i30 >> 12;
                int i31119 = i30;
                float f1116 = f10;
                androidx.compose.foundation.lazy.layout.v0 v0VarF12 = i0.f(a1Var, function0C12, g5Var2, z12, q3Var, f1116, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i31117 & 7168) | (i31117 & 896) | i31 | ((i30 << 9) & 57344) | (i31118 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                g5 g5Var15 = g5Var2;
                float f1117 = f11;
                androidx.compose.foundation.lazy.layout.q1 q1VarA12 = t0.a(a1Var, z12, c0VarR, (i31118 & com.planner5d.library.engine.input.f.b.B) | i31);
                if (z13) {
                    c0VarR.E(-1834534838);
                    q3Var2 = q3Var;
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                    c0VarR.A();
                } else {
                    q3Var2 = q3Var;
                    c0VarR.E(-1834229984);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                boolean z1119 = z12;
                boolean z11110 = z13;
                c3 c3Var14 = c3VarA;
                androidx.compose.foundation.lazy.layout.u0.c(function0C12, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C12, q1VarA12, q3Var2, z11110, z1119, c0VarR, ((i31119 << 6) & 7168) | ((i31119 >> 9) & 57344) | (i31119 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z11110, z1119, c3Var14, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF12, c0VarR, 0, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                z16 = z1119;
                c3Var2 = c3Var14;
                a0Var3 = a0Var5;
                z15 = z11110;
                g5Var3 = g5Var15;
                f13 = f1116;
                f12 = f1117;
            } else {
                c0VarR.u();
                f12 = f11;
                c0Var2 = c0VarR;
                c3Var2 = c3VarA;
                z15 = z13;
                g5Var3 = g5Var2;
                z16 = z12;
                a0Var3 = a0Var2;
                f13 = f10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        g5Var2 = g5Var;
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.G(z12)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
        }
        if ((i10 & 1572864) == 0) {
            c3VarA = c3Var;
            if ((i12 & 64) == 0) {
                i32 = 524288;
            } else {
                i32 = 524288;
            }
            i13 |= i32;
        } else {
            c3VarA = c3Var;
        }
        i18 = i12 & 128;
        if (i18 != 0) {
            i13 |= 12582912;
            z13 = z11;
        } else {
            z13 = z11;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z13)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
        }
        if ((i12 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.D(x3Var)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f10)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.I(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function1)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                i28 = i13;
                if ((i28 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i28 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    } else {
                        if (i33 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i29 = i28 & (-3670017);
                        } else {
                            i29 = i28;
                        }
                        if (i18 == 0) {
                        }
                        if (i21 != 0) {
                            f10 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            f10 = f10;
                        }
                        if (i23 != 0) {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            a0Var5 = a0Var4;
                            g5Var2 = g5VarF;
                            z12 = z12;
                            c3VarA = c3VarA;
                            i30 = i29;
                            f11 = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                    }
                    i31 = i30 & 14;
                    Function0<r> function0C13 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    int i311110 = i30 >> 6;
                    int i311111 = i30 >> 12;
                    int i311112 = i30;
                    float f1118 = f10;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF13 = i0.f(a1Var, function0C13, g5Var2, z12, q3Var, f1118, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i311110 & 7168) | (i311110 & 896) | i31 | ((i30 << 9) & 57344) | (i311111 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                    g5 g5Var16 = g5Var2;
                    float f1119 = f11;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA13 = t0.a(a1Var, z12, c0VarR, (i311111 & com.planner5d.library.engine.input.f.b.B) | i31);
                    if (z13) {
                        c0VarR.E(-1834534838);
                        q3Var2 = q3Var;
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                        c0VarR.A();
                    } else {
                        q3Var2 = q3Var;
                        c0VarR.E(-1834229984);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z11111 = z12;
                    boolean z11112 = z13;
                    c3 c3Var15 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C13, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C13, q1VarA13, q3Var2, z11112, z11111, c0VarR, ((i311112 << 6) & 7168) | ((i311112 >> 9) & 57344) | (i311112 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z11112, z11111, c3Var15, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF13, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    z16 = z11111;
                    c3Var2 = c3Var15;
                    a0Var3 = a0Var5;
                    z15 = z11112;
                    g5Var3 = g5Var16;
                    f13 = f1118;
                    f12 = f1119;
                } else {
                    c0VarR.u();
                    f12 = f11;
                    c0Var2 = c0VarR;
                    c3Var2 = c3VarA;
                    z15 = z13;
                    g5Var3 = g5Var2;
                    z16 = z12;
                    a0Var3 = a0Var2;
                    f13 = f10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 1024;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.I(f11)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 2048) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function1)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            i28 = i13;
            if ((i28 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c0VarR.h(z14, i28 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i33 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i29 = i28 & (-3670017);
                    } else {
                        i29 = i28;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        f10 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        f10 = f10;
                    }
                    if (i23 != 0) {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = f11;
                    }
                } else {
                    if (i33 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i29 = i28 & (-3670017);
                    } else {
                        i29 = i28;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        f10 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        f10 = f10;
                    }
                    if (i23 != 0) {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                }
                i31 = i30 & 14;
                Function0<r> function0C14 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                int i311113 = i30 >> 6;
                int i311114 = i30 >> 12;
                int i311115 = i30;
                float f11110 = f10;
                androidx.compose.foundation.lazy.layout.v0 v0VarF14 = i0.f(a1Var, function0C14, g5Var2, z12, q3Var, f11110, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i311113 & 7168) | (i311113 & 896) | i31 | ((i30 << 9) & 57344) | (i311114 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                g5 g5Var17 = g5Var2;
                float f11111 = f11;
                androidx.compose.foundation.lazy.layout.q1 q1VarA14 = t0.a(a1Var, z12, c0VarR, (i311114 & com.planner5d.library.engine.input.f.b.B) | i31);
                if (z13) {
                    c0VarR.E(-1834534838);
                    q3Var2 = q3Var;
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                    c0VarR.A();
                } else {
                    q3Var2 = q3Var;
                    c0VarR.E(-1834229984);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                boolean z11113 = z12;
                boolean z11114 = z13;
                c3 c3Var16 = c3VarA;
                androidx.compose.foundation.lazy.layout.u0.c(function0C14, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C14, q1VarA14, q3Var2, z11114, z11113, c0VarR, ((i311115 << 6) & 7168) | ((i311115 >> 9) & 57344) | (i311115 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z11114, z11113, c3Var16, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF14, c0VarR, 0, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                z16 = z11113;
                c3Var2 = c3Var16;
                a0Var3 = a0Var5;
                z15 = z11114;
                g5Var3 = g5Var17;
                f13 = f11110;
                f12 = f11111;
            } else {
                c0VarR.u();
                f12 = f11;
                c0Var2 = c0VarR;
                c3Var2 = c3VarA;
                z15 = z13;
                g5Var3 = g5Var2;
                z16 = z12;
                a0Var3 = a0Var2;
                f13 = f10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 100663296;
        i21 = i12 & 512;
        if (i21 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.I(f10)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            i23 = i12 & 1024;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.I(f11)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 2048) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function1)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            i28 = i13;
            if ((i28 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c0VarR.h(z14, i28 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i33 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i29 = i28 & (-3670017);
                    } else {
                        i29 = i28;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        f10 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        f10 = f10;
                    }
                    if (i23 != 0) {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = f11;
                    }
                } else {
                    if (i33 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i29 = i28 & (-3670017);
                    } else {
                        i29 = i28;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        f10 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        f10 = f10;
                    }
                    if (i23 != 0) {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        a0Var5 = a0Var4;
                        g5Var2 = g5VarF;
                        z12 = z12;
                        c3VarA = c3VarA;
                        i30 = i29;
                        f11 = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                }
                i31 = i30 & 14;
                Function0<r> function0C15 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                int i311116 = i30 >> 6;
                int i311117 = i30 >> 12;
                int i311118 = i30;
                float f11112 = f10;
                androidx.compose.foundation.lazy.layout.v0 v0VarF15 = i0.f(a1Var, function0C15, g5Var2, z12, q3Var, f11112, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i311116 & 7168) | (i311116 & 896) | i31 | ((i30 << 9) & 57344) | (i311117 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
                g5 g5Var18 = g5Var2;
                float f11113 = f11;
                androidx.compose.foundation.lazy.layout.q1 q1VarA15 = t0.a(a1Var, z12, c0VarR, (i311117 & com.planner5d.library.engine.input.f.b.B) | i31);
                if (z13) {
                    c0VarR.E(-1834534838);
                    q3Var2 = q3Var;
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                    c0VarR.A();
                } else {
                    q3Var2 = q3Var;
                    c0VarR.E(-1834229984);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                boolean z11115 = z12;
                boolean z11116 = z13;
                c3 c3Var17 = c3VarA;
                androidx.compose.foundation.lazy.layout.u0.c(function0C15, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C15, q1VarA15, q3Var2, z11116, z11115, c0VarR, ((i311118 << 6) & 7168) | ((i311118 >> 9) & 57344) | (i311118 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z11116, z11115, c3Var17, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF15, c0VarR, 0, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                z16 = z11115;
                c3Var2 = c3Var17;
                a0Var3 = a0Var5;
                z15 = z11116;
                g5Var3 = g5Var18;
                f13 = f11112;
                f12 = f11113;
            } else {
                c0VarR.u();
                f12 = f11;
                c0Var2 = c0VarR;
                c3Var2 = c3VarA;
                z15 = z13;
                g5Var3 = g5Var2;
                z16 = z12;
                a0Var3 = a0Var2;
                f13 = f10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        i23 = i12 & 1024;
        if (i23 != 0) {
            i24 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.I(f11)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i11 | i25;
        } else {
            i24 = i11;
        }
        if ((i12 & 2048) != 0) {
            i24 |= 48;
        } else if ((i11 & 48) == 0) {
            if (c0VarR.k0(function1)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i24 |= i26;
        }
        i27 = i24;
        i28 = i13;
        if ((i28 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c0VarR.h(z14, i28 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i33 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i14 != 0) {
                    g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                } else {
                    g5VarF = g5Var2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if ((i12 & 64) != 0) {
                    c3VarA = l4.f14799a.a(c0VarR, 6);
                    i29 = i28 & (-3670017);
                } else {
                    i29 = i28;
                }
                if (i18 == 0) {
                }
                if (i21 != 0) {
                    f10 = androidx.compose.ui.unit.h.r(0);
                } else {
                    f10 = f10;
                }
                if (i23 != 0) {
                    a0Var5 = a0Var4;
                    g5Var2 = g5VarF;
                    z12 = z12;
                    c3VarA = c3VarA;
                    i30 = i29;
                    f11 = androidx.compose.ui.unit.h.r(0);
                } else {
                    a0Var5 = a0Var4;
                    g5Var2 = g5VarF;
                    z12 = z12;
                    c3VarA = c3VarA;
                    i30 = i29;
                    f11 = f11;
                }
            } else {
                if (i33 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i14 != 0) {
                    g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                } else {
                    g5VarF = g5Var2;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if ((i12 & 64) != 0) {
                    c3VarA = l4.f14799a.a(c0VarR, 6);
                    i29 = i28 & (-3670017);
                } else {
                    i29 = i28;
                }
                if (i18 == 0) {
                }
                if (i21 != 0) {
                    f10 = androidx.compose.ui.unit.h.r(0);
                } else {
                    f10 = f10;
                }
                if (i23 != 0) {
                    a0Var5 = a0Var4;
                    g5Var2 = g5VarF;
                    z12 = z12;
                    c3VarA = c3VarA;
                    i30 = i29;
                    f11 = androidx.compose.ui.unit.h.r(0);
                } else {
                    a0Var5 = a0Var4;
                    g5Var2 = g5VarF;
                    z12 = z12;
                    c3VarA = c3VarA;
                    i30 = i29;
                    f11 = f11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1904835166, i30, i27, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
            }
            i31 = i30 & 14;
            Function0<r> function0C16 = w.c(a1Var, function1, c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | i31);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            int i311119 = i30 >> 6;
            int i3111110 = i30 >> 12;
            int i3111111 = i30;
            float f11114 = f10;
            androidx.compose.foundation.lazy.layout.v0 v0VarF16 = i0.f(a1Var, function0C16, g5Var2, z12, q3Var, f11114, f11, (kotlinx.coroutines.s0) objI0, aVar, (o1) c0VarR.W(q1.r()), c0VarR, (i311119 & 7168) | (i311119 & 896) | i31 | ((i30 << 9) & 57344) | (i3111110 & 458752) | ((i27 << 18) & 3670016) | ((i30 << 18) & 234881024));
            g5 g5Var19 = g5Var2;
            float f11115 = f11;
            androidx.compose.foundation.lazy.layout.q1 q1VarA16 = t0.a(a1Var, z12, c0VarR, (i3111110 & com.planner5d.library.engine.input.f.b.B) | i31);
            if (z13) {
                c0VarR.E(-1834534838);
                q3Var2 = q3Var;
                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, b.a(a1Var, c0VarR, i31), a1Var.D(), z12, q3Var2);
                c0VarR.A();
            } else {
                q3Var2 = q3Var;
                c0VarR.E(-1834229984);
                c0VarR.A();
                a0VarB = androidx.compose.ui.a0.E;
            }
            boolean z11117 = z12;
            boolean z11118 = z13;
            c3 c3Var18 = c3VarA;
            androidx.compose.foundation.lazy.layout.u0.c(function0C16, c5.a(r1.c(a0Var5.B2(a1Var.W()).B2(a1Var.C()), function0C16, q1VarA16, q3Var2, z11118, z11117, c0VarR, ((i3111111 << 6) & 7168) | ((i3111111 >> 9) & 57344) | (i3111111 & 458752)).B2(a0VarB).B2(a1Var.I().j()), a1Var, q3Var, z11118, z11117, c3Var18, a1Var.O(), false, x3Var, (256 & 256) != 0 ? null : null), a1Var.T(), v0VarF16, c0VarR, 0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var2 = c0VarR;
            z16 = z11117;
            c3Var2 = c3Var18;
            a0Var3 = a0Var5;
            z15 = z11118;
            g5Var3 = g5Var19;
            f13 = f11114;
            f12 = f11115;
        } else {
            c0VarR.u();
            f12 = f11;
            c0Var2 = c0VarR;
            c3Var2 = c3VarA;
            z15 = z13;
            g5Var3 = g5Var2;
            z16 = z12;
            a0Var3 = a0Var2;
            f13 = f10;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a0.c(a1Var, q3Var, aVar, a0Var3, g5Var3, z16, c3Var2, z15, x3Var, f13, f12, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(a1 a1Var, q3 q3Var, a aVar, androidx.compose.ui.a0 a0Var, g5 g5Var, boolean z10, c3 c3Var, boolean z11, x3 x3Var, float f10, float f11, Function1 function1, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        b(a1Var, q3Var, aVar, a0Var, g5Var, z10, c3Var, z11, x3Var, f10, f11, function1, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }
}
