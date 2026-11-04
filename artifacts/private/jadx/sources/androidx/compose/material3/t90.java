package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,216:1\n113#2:217\n113#2:218\n113#2:219\n113#2:220\n*S KotlinDebug\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n*L\n58#1:217\n59#1:218\n102#1:219\n103#1:220\n*E\n"})
public final class t90 {
    /* JADX WARN: Code duplicated, block: B:103:0x012f A[PHI: r19
      0x012f: PHI (r19v9 int) = (r19v4 int), (r19v6 int), (r19v7 int) binds: [B:102:0x012d, B:110:0x0143, B:109:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x016f  */
    /* JADX WARN: Code duplicated, block: B:137:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x019f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:164:0x0203  */
    /* JADX WARN: Code duplicated, block: B:167:0x0212  */
    /* JADX WARN: Code duplicated, block: B:168:0x0220  */
    /* JADX WARN: Code duplicated, block: B:171:0x0249  */
    /* JADX WARN: Code duplicated, block: B:173:0x0259  */
    /* JADX WARN: Code duplicated, block: B:176:0x026e  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility.")
    @af
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @oj.i(name = "PlainTooltip")
    public static final /* synthetic */ void e(final k90 k90Var, androidx.compose.ui.a0 a0Var, long j10, float f10, androidx.compose.ui.graphics.q3 q3Var, long j11, long j12, float f11, float f12, final Function2 function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long j13;
        int i13;
        float f13;
        int i14;
        androidx.compose.ui.graphics.q3 q3Var2;
        long j14;
        int i15;
        int i16;
        final float f14;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j15;
        final float f15;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final long j16;
        final long j17;
        final float f16;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long jA;
        float fJ;
        androidx.compose.ui.graphics.q3 q3VarH;
        long jI;
        long jG;
        float fR;
        long j18;
        androidx.compose.ui.graphics.q3 q3Var4;
        long j19;
        int i22;
        float fR2;
        int i23;
        int i24;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1456881596);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(k90Var) : c0VarR.k0(k90Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 1;
        if (i25 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 2) == 0) {
                    j13 = j10;
                    int i26 = c0VarR.L(j13) ? 256 : 128;
                    i12 |= i26;
                } else {
                    j13 = j10;
                }
                i12 |= i26;
            } else {
                j13 = j10;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    f13 = f10;
                    if (c0VarR.I(f13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 8) == 0) {
                        q3Var2 = q3Var;
                        int i27 = c0VarR.D(q3Var2) ? 16384 : 8192;
                        i12 |= i27;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i27;
                } else {
                    q3Var2 = q3Var;
                }
                if ((196608 & i10) == 0) {
                    j14 = j11;
                    if ((i11 & 16) == 0 || !c0VarR.L(j14)) {
                        i24 = 65536;
                    } else {
                        i24 = 131072;
                    }
                    i12 |= i24;
                } else {
                    j14 = j11;
                }
                if ((1572864 & i10) == 0) {
                    int i28 = i12;
                    if ((i11 & 32) == 0 || !c0VarR.L(j12)) {
                        i23 = 524288;
                    } else {
                        i23 = 1048576;
                    }
                    i15 = i28 | i23;
                } else {
                    i15 = i12;
                }
                i16 = i11 & 64;
                if (i16 != 0) {
                    i15 |= 12582912;
                    f14 = f11;
                } else {
                    f14 = f11;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f14)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i15 |= i17;
                    }
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i15 |= i19;
                    }
                    i20 = 805306368;
                    if ((i11 & 256) == 0) {
                        i15 |= i20;
                    } else if ((i10 & 805306368) != 0) {
                        if (c0VarR.k0(function2)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i15 |= i20;
                    }
                    i21 = i15;
                    if ((i21 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 2) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i21 &= -897;
                            } else {
                                jA = j13;
                            }
                            if (i13 != 0) {
                                fJ = u80.f33535a.j();
                            } else {
                                fJ = f13;
                            }
                            if ((i11 & 8) != 0) {
                                q3VarH = u80.f33535a.h(c0VarR, 6);
                                i21 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i11 & 16) != 0) {
                                jI = u80.f33535a.i(c0VarR, 6);
                                i21 &= -458753;
                            } else {
                                jI = j14;
                            }
                            if ((i11 & 32) != 0) {
                                jG = u80.f33535a.g(c0VarR, 6);
                                i21 &= -3670017;
                            } else {
                                jG = j12;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f14;
                            }
                            if (i18 != 0) {
                                f14 = fR;
                                i22 = i21;
                                fR2 = androidx.compose.ui.unit.h.r(0);
                                j18 = jA;
                                q3Var4 = q3VarH;
                                j19 = jG;
                            } else {
                                f14 = fR;
                                j18 = jA;
                                q3Var4 = q3VarH;
                                j19 = jG;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                            }
                            int i29 = 2147482750 & i22;
                            long j20 = j18;
                            float f17 = fJ;
                            long j21 = jI;
                            float f18 = f14;
                            float f19 = fR2;
                            h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f17, q3Var4, j21, j19, f18, f19, function2, c0VarR, i29, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            f14 = f18;
                            f16 = f19;
                            j17 = j19;
                            j16 = j21;
                            f15 = f17;
                            q3Var3 = q3Var4;
                            j15 = j20;
                        } else {
                            c0VarR.u();
                            if ((i11 & 2) != 0) {
                                i21 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i21 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i21 &= -458753;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -3670017;
                            }
                            a0Var4 = a0Var2;
                            j18 = j13;
                            fJ = f13;
                            q3Var4 = q3Var2;
                            jI = j14;
                            j19 = j12;
                        }
                        i22 = i21;
                        fR2 = f12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                        }
                        int i210 = 2147482750 & i22;
                        long j22 = j18;
                        float f110 = fJ;
                        long j23 = jI;
                        float f111 = f14;
                        float f112 = fR2;
                        h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f110, q3Var4, j23, j19, f111, f112, function2, c0VarR, i210, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        f14 = f111;
                        f16 = f112;
                        j17 = j19;
                        j16 = j23;
                        f15 = f110;
                        q3Var3 = q3Var4;
                        j15 = j22;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        j15 = j13;
                        f15 = f13;
                        q3Var3 = q3Var2;
                        j16 = j14;
                        j17 = j12;
                        f16 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.s90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.h(k90Var, a0Var3, j15, f15, q3Var3, j16, j17, f14, f16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 100663296;
                i20 = 805306368;
                if ((i11 & 256) == 0) {
                    i15 |= i20;
                } else if ((i10 & 805306368) != 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i15 |= i20;
                }
                i21 = i15;
                if ((i21 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i21 &= -897;
                        } else {
                            jA = j13;
                        }
                        if (i13 != 0) {
                            fJ = u80.f33535a.j();
                        } else {
                            fJ = f13;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarH = u80.f33535a.h(c0VarR, 6);
                            i21 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jI = u80.f33535a.i(c0VarR, 6);
                            i21 &= -458753;
                        } else {
                            jI = j14;
                        }
                        if ((i11 & 32) != 0) {
                            jG = u80.f33535a.g(c0VarR, 6);
                            i21 &= -3670017;
                        } else {
                            jG = j12;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f14;
                        }
                        if (i18 != 0) {
                            f14 = fR;
                            i22 = i21;
                            fR2 = androidx.compose.ui.unit.h.r(0);
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                        } else {
                            f14 = fR;
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                            i22 = i21;
                            fR2 = f12;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i21 &= -897;
                        } else {
                            jA = j13;
                        }
                        if (i13 != 0) {
                            fJ = u80.f33535a.j();
                        } else {
                            fJ = f13;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarH = u80.f33535a.h(c0VarR, 6);
                            i21 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jI = u80.f33535a.i(c0VarR, 6);
                            i21 &= -458753;
                        } else {
                            jI = j14;
                        }
                        if ((i11 & 32) != 0) {
                            jG = u80.f33535a.g(c0VarR, 6);
                            i21 &= -3670017;
                        } else {
                            jG = j12;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f14;
                        }
                        if (i18 != 0) {
                            f14 = fR;
                            i22 = i21;
                            fR2 = androidx.compose.ui.unit.h.r(0);
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                        } else {
                            f14 = fR;
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                            i22 = i21;
                            fR2 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                    }
                    int i211 = 2147482750 & i22;
                    long j24 = j18;
                    float f113 = fJ;
                    long j25 = jI;
                    float f114 = f14;
                    float f115 = fR2;
                    h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f113, q3Var4, j25, j19, f114, f115, function2, c0VarR, i211, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f14 = f114;
                    f16 = f115;
                    j17 = j19;
                    j16 = j25;
                    f15 = f113;
                    q3Var3 = q3Var4;
                    j15 = j24;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j15 = j13;
                    f15 = f13;
                    q3Var3 = q3Var2;
                    j16 = j14;
                    j17 = j12;
                    f16 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.s90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.h(k90Var, a0Var3, j15, f15, q3Var3, j16, j17, f14, f16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            f13 = f10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 8) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i27;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i27;
            } else {
                q3Var2 = q3Var;
            }
            if ((196608 & i10) == 0) {
                j14 = j11;
                if ((i11 & 16) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i12 |= i24;
            } else {
                j14 = j11;
            }
            if ((1572864 & i10) == 0) {
                int i212 = i12;
                if ((i11 & 32) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i15 = i212 | i23;
            } else {
                i15 = i12;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i15 |= 12582912;
                f14 = f11;
            } else {
                f14 = f11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f14)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i11 & 128;
            if (i18 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i19;
                }
                i20 = 805306368;
                if ((i11 & 256) == 0) {
                    i15 |= i20;
                } else if ((i10 & 805306368) != 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i15 |= i20;
                }
                i21 = i15;
                if ((i21 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i21 &= -897;
                        } else {
                            jA = j13;
                        }
                        if (i13 != 0) {
                            fJ = u80.f33535a.j();
                        } else {
                            fJ = f13;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarH = u80.f33535a.h(c0VarR, 6);
                            i21 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jI = u80.f33535a.i(c0VarR, 6);
                            i21 &= -458753;
                        } else {
                            jI = j14;
                        }
                        if ((i11 & 32) != 0) {
                            jG = u80.f33535a.g(c0VarR, 6);
                            i21 &= -3670017;
                        } else {
                            jG = j12;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f14;
                        }
                        if (i18 != 0) {
                            f14 = fR;
                            i22 = i21;
                            fR2 = androidx.compose.ui.unit.h.r(0);
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                        } else {
                            f14 = fR;
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                            i22 = i21;
                            fR2 = f12;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i21 &= -897;
                        } else {
                            jA = j13;
                        }
                        if (i13 != 0) {
                            fJ = u80.f33535a.j();
                        } else {
                            fJ = f13;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarH = u80.f33535a.h(c0VarR, 6);
                            i21 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jI = u80.f33535a.i(c0VarR, 6);
                            i21 &= -458753;
                        } else {
                            jI = j14;
                        }
                        if ((i11 & 32) != 0) {
                            jG = u80.f33535a.g(c0VarR, 6);
                            i21 &= -3670017;
                        } else {
                            jG = j12;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f14;
                        }
                        if (i18 != 0) {
                            f14 = fR;
                            i22 = i21;
                            fR2 = androidx.compose.ui.unit.h.r(0);
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                        } else {
                            f14 = fR;
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                            i22 = i21;
                            fR2 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                    }
                    int i213 = 2147482750 & i22;
                    long j26 = j18;
                    float f116 = fJ;
                    long j27 = jI;
                    float f117 = f14;
                    float f118 = fR2;
                    h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f116, q3Var4, j27, j19, f117, f118, function2, c0VarR, i213, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f14 = f117;
                    f16 = f118;
                    j17 = j19;
                    j16 = j27;
                    f15 = f116;
                    q3Var3 = q3Var4;
                    j15 = j26;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j15 = j13;
                    f15 = f13;
                    q3Var3 = q3Var2;
                    j16 = j14;
                    j17 = j12;
                    f16 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.s90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.h(k90Var, a0Var3, j15, f15, q3Var3, j16, j17, f14, f16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 100663296;
            i20 = 805306368;
            if ((i11 & 256) == 0) {
                i15 |= i20;
            } else if ((i10 & 805306368) != 0) {
                if (c0VarR.k0(function2)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i15 |= i20;
            }
            i21 = i15;
            if ((i21 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i21 &= -897;
                    } else {
                        jA = j13;
                    }
                    if (i13 != 0) {
                        fJ = u80.f33535a.j();
                    } else {
                        fJ = f13;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i21 &= -458753;
                    } else {
                        jI = j14;
                    }
                    if ((i11 & 32) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jG = j12;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f14;
                    }
                    if (i18 != 0) {
                        f14 = fR;
                        i22 = i21;
                        fR2 = androidx.compose.ui.unit.h.r(0);
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                    } else {
                        f14 = fR;
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                        i22 = i21;
                        fR2 = f12;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i21 &= -897;
                    } else {
                        jA = j13;
                    }
                    if (i13 != 0) {
                        fJ = u80.f33535a.j();
                    } else {
                        fJ = f13;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i21 &= -458753;
                    } else {
                        jI = j14;
                    }
                    if ((i11 & 32) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jG = j12;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f14;
                    }
                    if (i18 != 0) {
                        f14 = fR;
                        i22 = i21;
                        fR2 = androidx.compose.ui.unit.h.r(0);
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                    } else {
                        f14 = fR;
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                        i22 = i21;
                        fR2 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                }
                int i214 = 2147482750 & i22;
                long j28 = j18;
                float f119 = fJ;
                long j29 = jI;
                float f1110 = f14;
                float f1111 = fR2;
                h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f119, q3Var4, j29, j19, f1110, f1111, function2, c0VarR, i214, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                f14 = f1110;
                f16 = f1111;
                j17 = j19;
                j16 = j29;
                f15 = f119;
                q3Var3 = q3Var4;
                j15 = j28;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j15 = j13;
                f15 = f13;
                q3Var3 = q3Var2;
                j16 = j14;
                j17 = j12;
                f16 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.s90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.h(k90Var, a0Var3, j15, f15, q3Var3, j16, j17, f14, f16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 2) == 0) {
                j13 = j10;
                if (c0VarR.L(j13)) {
                }
                i12 |= i26;
            } else {
                j13 = j10;
            }
            i12 |= i26;
        } else {
            j13 = j10;
        }
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                f13 = f10;
                if (c0VarR.I(f13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 8) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i27;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i27;
            } else {
                q3Var2 = q3Var;
            }
            if ((196608 & i10) == 0) {
                j14 = j11;
                if ((i11 & 16) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i12 |= i24;
            } else {
                j14 = j11;
            }
            if ((1572864 & i10) == 0) {
                int i215 = i12;
                if ((i11 & 32) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i15 = i215 | i23;
            } else {
                i15 = i12;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i15 |= 12582912;
                f14 = f11;
            } else {
                f14 = f11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f14)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i11 & 128;
            if (i18 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i15 |= i19;
                }
                i20 = 805306368;
                if ((i11 & 256) == 0) {
                    i15 |= i20;
                } else if ((i10 & 805306368) != 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i15 |= i20;
                }
                i21 = i15;
                if ((i21 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i21 &= -897;
                        } else {
                            jA = j13;
                        }
                        if (i13 != 0) {
                            fJ = u80.f33535a.j();
                        } else {
                            fJ = f13;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarH = u80.f33535a.h(c0VarR, 6);
                            i21 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jI = u80.f33535a.i(c0VarR, 6);
                            i21 &= -458753;
                        } else {
                            jI = j14;
                        }
                        if ((i11 & 32) != 0) {
                            jG = u80.f33535a.g(c0VarR, 6);
                            i21 &= -3670017;
                        } else {
                            jG = j12;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f14;
                        }
                        if (i18 != 0) {
                            f14 = fR;
                            i22 = i21;
                            fR2 = androidx.compose.ui.unit.h.r(0);
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                        } else {
                            f14 = fR;
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                            i22 = i21;
                            fR2 = f12;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i21 &= -897;
                        } else {
                            jA = j13;
                        }
                        if (i13 != 0) {
                            fJ = u80.f33535a.j();
                        } else {
                            fJ = f13;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarH = u80.f33535a.h(c0VarR, 6);
                            i21 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jI = u80.f33535a.i(c0VarR, 6);
                            i21 &= -458753;
                        } else {
                            jI = j14;
                        }
                        if ((i11 & 32) != 0) {
                            jG = u80.f33535a.g(c0VarR, 6);
                            i21 &= -3670017;
                        } else {
                            jG = j12;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f14;
                        }
                        if (i18 != 0) {
                            f14 = fR;
                            i22 = i21;
                            fR2 = androidx.compose.ui.unit.h.r(0);
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                        } else {
                            f14 = fR;
                            j18 = jA;
                            q3Var4 = q3VarH;
                            j19 = jG;
                            i22 = i21;
                            fR2 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                    }
                    int i216 = 2147482750 & i22;
                    long j210 = j18;
                    float f1112 = fJ;
                    long j211 = jI;
                    float f1113 = f14;
                    float f1114 = fR2;
                    h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f1112, q3Var4, j211, j19, f1113, f1114, function2, c0VarR, i216, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    f14 = f1113;
                    f16 = f1114;
                    j17 = j19;
                    j16 = j211;
                    f15 = f1112;
                    q3Var3 = q3Var4;
                    j15 = j210;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j15 = j13;
                    f15 = f13;
                    q3Var3 = q3Var2;
                    j16 = j14;
                    j17 = j12;
                    f16 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.s90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.h(k90Var, a0Var3, j15, f15, q3Var3, j16, j17, f14, f16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 100663296;
            i20 = 805306368;
            if ((i11 & 256) == 0) {
                i15 |= i20;
            } else if ((i10 & 805306368) != 0) {
                if (c0VarR.k0(function2)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i15 |= i20;
            }
            i21 = i15;
            if ((i21 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i21 &= -897;
                    } else {
                        jA = j13;
                    }
                    if (i13 != 0) {
                        fJ = u80.f33535a.j();
                    } else {
                        fJ = f13;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i21 &= -458753;
                    } else {
                        jI = j14;
                    }
                    if ((i11 & 32) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jG = j12;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f14;
                    }
                    if (i18 != 0) {
                        f14 = fR;
                        i22 = i21;
                        fR2 = androidx.compose.ui.unit.h.r(0);
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                    } else {
                        f14 = fR;
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                        i22 = i21;
                        fR2 = f12;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i21 &= -897;
                    } else {
                        jA = j13;
                    }
                    if (i13 != 0) {
                        fJ = u80.f33535a.j();
                    } else {
                        fJ = f13;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i21 &= -458753;
                    } else {
                        jI = j14;
                    }
                    if ((i11 & 32) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jG = j12;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f14;
                    }
                    if (i18 != 0) {
                        f14 = fR;
                        i22 = i21;
                        fR2 = androidx.compose.ui.unit.h.r(0);
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                    } else {
                        f14 = fR;
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                        i22 = i21;
                        fR2 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                }
                int i217 = 2147482750 & i22;
                long j212 = j18;
                float f1115 = fJ;
                long j213 = jI;
                float f1116 = f14;
                float f1117 = fR2;
                h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f1115, q3Var4, j213, j19, f1116, f1117, function2, c0VarR, i217, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                f14 = f1116;
                f16 = f1117;
                j17 = j19;
                j16 = j213;
                f15 = f1115;
                q3Var3 = q3Var4;
                j15 = j212;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j15 = j13;
                f15 = f13;
                q3Var3 = q3Var2;
                j16 = j14;
                j17 = j12;
                f16 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.s90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.h(k90Var, a0Var3, j15, f15, q3Var3, j16, j17, f14, f16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        f13 = f10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 8) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i27;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i27;
        } else {
            q3Var2 = q3Var;
        }
        if ((196608 & i10) == 0) {
            j14 = j11;
            if ((i11 & 16) == 0) {
                i24 = 65536;
            } else {
                i24 = 65536;
            }
            i12 |= i24;
        } else {
            j14 = j11;
        }
        if ((1572864 & i10) == 0) {
            int i218 = i12;
            if ((i11 & 32) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i15 = i218 | i23;
        } else {
            i15 = i12;
        }
        i16 = i11 & 64;
        if (i16 != 0) {
            i15 |= 12582912;
            f14 = f11;
        } else {
            f14 = f11;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f14)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
        }
        i18 = i11 & 128;
        if (i18 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f12)) {
                    i19 = 67108864;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i19;
            }
            i20 = 805306368;
            if ((i11 & 256) == 0) {
                i15 |= i20;
            } else if ((i10 & 805306368) != 0) {
                if (c0VarR.k0(function2)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i15 |= i20;
            }
            i21 = i15;
            if ((i21 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i21 &= -897;
                    } else {
                        jA = j13;
                    }
                    if (i13 != 0) {
                        fJ = u80.f33535a.j();
                    } else {
                        fJ = f13;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i21 &= -458753;
                    } else {
                        jI = j14;
                    }
                    if ((i11 & 32) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jG = j12;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f14;
                    }
                    if (i18 != 0) {
                        f14 = fR;
                        i22 = i21;
                        fR2 = androidx.compose.ui.unit.h.r(0);
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                    } else {
                        f14 = fR;
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                        i22 = i21;
                        fR2 = f12;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i21 &= -897;
                    } else {
                        jA = j13;
                    }
                    if (i13 != 0) {
                        fJ = u80.f33535a.j();
                    } else {
                        fJ = f13;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i21 &= -458753;
                    } else {
                        jI = j14;
                    }
                    if ((i11 & 32) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jG = j12;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f14;
                    }
                    if (i18 != 0) {
                        f14 = fR;
                        i22 = i21;
                        fR2 = androidx.compose.ui.unit.h.r(0);
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                    } else {
                        f14 = fR;
                        j18 = jA;
                        q3Var4 = q3VarH;
                        j19 = jG;
                        i22 = i21;
                        fR2 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                }
                int i219 = 2147482750 & i22;
                long j214 = j18;
                float f1118 = fJ;
                long j215 = jI;
                float f1119 = f14;
                float f11110 = fR2;
                h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f1118, q3Var4, j215, j19, f1119, f11110, function2, c0VarR, i219, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                f14 = f1119;
                f16 = f11110;
                j17 = j19;
                j16 = j215;
                f15 = f1118;
                q3Var3 = q3Var4;
                j15 = j214;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j15 = j13;
                f15 = f13;
                q3Var3 = q3Var2;
                j16 = j14;
                j17 = j12;
                f16 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.s90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.h(k90Var, a0Var3, j15, f15, q3Var3, j16, j17, f14, f16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 100663296;
        i20 = 805306368;
        if ((i11 & 256) == 0) {
            i15 |= i20;
        } else if ((i10 & 805306368) != 0) {
            if (c0VarR.k0(function2)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i15 |= i20;
        }
        i21 = i15;
        if ((i21 & 306783379) != 306783378) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i21 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jA = androidx.compose.ui.unit.l.f42704b.a();
                    i21 &= -897;
                } else {
                    jA = j13;
                }
                if (i13 != 0) {
                    fJ = u80.f33535a.j();
                } else {
                    fJ = f13;
                }
                if ((i11 & 8) != 0) {
                    q3VarH = u80.f33535a.h(c0VarR, 6);
                    i21 &= -57345;
                } else {
                    q3VarH = q3Var2;
                }
                if ((i11 & 16) != 0) {
                    jI = u80.f33535a.i(c0VarR, 6);
                    i21 &= -458753;
                } else {
                    jI = j14;
                }
                if ((i11 & 32) != 0) {
                    jG = u80.f33535a.g(c0VarR, 6);
                    i21 &= -3670017;
                } else {
                    jG = j12;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f14;
                }
                if (i18 != 0) {
                    f14 = fR;
                    i22 = i21;
                    fR2 = androidx.compose.ui.unit.h.r(0);
                    j18 = jA;
                    q3Var4 = q3VarH;
                    j19 = jG;
                } else {
                    f14 = fR;
                    j18 = jA;
                    q3Var4 = q3VarH;
                    j19 = jG;
                    i22 = i21;
                    fR2 = f12;
                }
            } else {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jA = androidx.compose.ui.unit.l.f42704b.a();
                    i21 &= -897;
                } else {
                    jA = j13;
                }
                if (i13 != 0) {
                    fJ = u80.f33535a.j();
                } else {
                    fJ = f13;
                }
                if ((i11 & 8) != 0) {
                    q3VarH = u80.f33535a.h(c0VarR, 6);
                    i21 &= -57345;
                } else {
                    q3VarH = q3Var2;
                }
                if ((i11 & 16) != 0) {
                    jI = u80.f33535a.i(c0VarR, 6);
                    i21 &= -458753;
                } else {
                    jI = j14;
                }
                if ((i11 & 32) != 0) {
                    jG = u80.f33535a.g(c0VarR, 6);
                    i21 &= -3670017;
                } else {
                    jG = j12;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f14;
                }
                if (i18 != 0) {
                    f14 = fR;
                    i22 = i21;
                    fR2 = androidx.compose.ui.unit.h.r(0);
                    j18 = jA;
                    q3Var4 = q3VarH;
                    j19 = jG;
                } else {
                    f14 = fR;
                    j18 = jA;
                    q3Var4 = q3VarH;
                    j19 = jG;
                    i22 = i21;
                    fR2 = f12;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1456881596, i22, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
            }
            int i2110 = 2147482750 & i22;
            long j216 = j18;
            float f11111 = fJ;
            long j217 = jI;
            float f11112 = f14;
            float f11113 = fR2;
            h90.m(k90Var, a0Var4, u80.f33535a.b(j18), f11111, q3Var4, j217, j19, f11112, f11113, function2, c0VarR, i2110, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            f14 = f11112;
            f16 = f11113;
            j17 = j19;
            j16 = j217;
            f15 = f11111;
            q3Var3 = q3Var4;
            j15 = j216;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j15 = j13;
            f15 = f13;
            q3Var3 = q3Var2;
            j16 = j14;
            j17 = j12;
            f16 = f12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.s90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t90.h(k90Var, a0Var3, j15, f15, q3Var3, j16, j17, f14, f16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x016b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0172  */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:135:0x018d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0199  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:151:0x0229  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x024a  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use overload with maxWidth parameter.")
    @af
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @oj.i(name = "PlainTooltip")
    public static final /* synthetic */ void f(final k90 k90Var, androidx.compose.ui.a0 a0Var, long j10, androidx.compose.ui.graphics.q3 q3Var, long j11, long j12, float f10, float f11, final Function2 function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long jA;
        androidx.compose.ui.graphics.q3 q3VarH;
        long jI;
        long jG;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        final float f12;
        final androidx.compose.ui.a0 a0Var3;
        final long j13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j14;
        final long j15;
        final float f13;
        androidx.compose.runtime.s5 s5VarT;
        float fR;
        float fR2;
        long j16;
        long j17;
        long j18;
        int i18;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2114904198);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(k90Var) : c0VarR.k0(k90Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 1;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 2) == 0) {
                    jA = j10;
                    int i20 = c0VarR.L(jA) ? 256 : 128;
                    i12 |= i20;
                } else {
                    jA = j10;
                }
                i12 |= i20;
            } else {
                jA = j10;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 4) == 0) {
                    q3VarH = q3Var;
                    int i21 = c0VarR.D(q3VarH) ? 2048 : 1024;
                    i12 |= i21;
                } else {
                    q3VarH = q3Var;
                }
                i12 |= i21;
            } else {
                q3VarH = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 8) == 0) {
                    jI = j11;
                    int i22 = c0VarR.L(jI) ? 16384 : 8192;
                    i12 |= i22;
                } else {
                    jI = j11;
                }
                i12 |= i22;
            } else {
                jI = j11;
            }
            if ((196608 & i10) == 0) {
                jG = j12;
                if ((i11 & 16) == 0 || !c0VarR.L(jG)) {
                    i18 = 65536;
                } else {
                    i18 = 131072;
                }
                i12 |= i18;
            } else {
                jG = j12;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 67108864;
                    } else {
                        i17 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i17;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i19 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 2) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -897;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -7169;
                            q3VarH = u80.f33535a.h(c0VarR, 6);
                        }
                        if ((i11 & 8) != 0) {
                            jI = u80.f33535a.i(c0VarR, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            jG = u80.f33535a.g(c0VarR, 6);
                            i12 &= -458753;
                        }
                        if (i13 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f10;
                        }
                        if (i15 != 0) {
                            fR2 = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR2 = f11;
                        }
                        j16 = jA;
                        j17 = jI;
                        j18 = jG;
                    } else {
                        c0VarR.u();
                        if ((i11 & 2) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                        }
                        i12 = i12;
                        a0Var2 = a0Var2;
                        j16 = jA;
                        q3VarH = q3VarH;
                        j17 = jI;
                        j18 = jG;
                        fR = f10;
                        fR2 = f11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2114904198, i12, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:61)");
                    }
                    u80 u80Var = u80.f33535a;
                    long j19 = j16;
                    androidx.compose.ui.graphics.q3 q3VarB = u80Var.b(j19);
                    float fJ = u80Var.j();
                    int i23 = (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B);
                    int i24 = i12 << 3;
                    h90.m(k90Var, a0Var2, q3VarB, fJ, q3VarH, j17, j18, fR, fR2, function2, c0VarR, (i24 & 1879048192) | i23 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    f12 = fR2;
                    f13 = fR;
                    j15 = j18;
                    j14 = j17;
                    q3Var2 = q3VarH;
                    j13 = j19;
                } else {
                    c0VarR.u();
                    f12 = f11;
                    a0Var3 = a0Var2;
                    j13 = jA;
                    q3Var2 = q3VarH;
                    j14 = jI;
                    j15 = jG;
                    f13 = f10;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.r90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.g(k90Var, a0Var3, j13, q3Var2, j14, j15, f13, f12, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -897;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -7169;
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (i15 != 0) {
                        fR2 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR2 = f11;
                    }
                    j16 = jA;
                    j17 = jI;
                    j18 = jG;
                } else {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -897;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -7169;
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (i15 != 0) {
                        fR2 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR2 = f11;
                    }
                    j16 = jA;
                    j17 = jI;
                    j18 = jG;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2114904198, i12, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:61)");
                }
                u80 u80Var2 = u80.f33535a;
                long j110 = j16;
                androidx.compose.ui.graphics.q3 q3VarB2 = u80Var2.b(j110);
                float fJ2 = u80Var2.j();
                int i25 = (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B);
                int i26 = i12 << 3;
                h90.m(k90Var, a0Var2, q3VarB2, fJ2, q3VarH, j17, j18, fR, fR2, function2, c0VarR, (i26 & 1879048192) | i25 | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128) | (i26 & 234881024), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                f12 = fR2;
                f13 = fR;
                j15 = j18;
                j14 = j17;
                q3Var2 = q3VarH;
                j13 = j110;
            } else {
                c0VarR.u();
                f12 = f11;
                a0Var3 = a0Var2;
                j13 = jA;
                q3Var2 = q3VarH;
                j14 = jI;
                j15 = jG;
                f13 = f10;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.r90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.g(k90Var, a0Var3, j13, q3Var2, j14, j15, f13, f12, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 2) == 0) {
                jA = j10;
                if (c0VarR.L(jA)) {
                }
                i12 |= i20;
            } else {
                jA = j10;
            }
            i12 |= i20;
        } else {
            jA = j10;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 4) == 0) {
                q3VarH = q3Var;
                if (c0VarR.D(q3VarH)) {
                }
                i12 |= i21;
            } else {
                q3VarH = q3Var;
            }
            i12 |= i21;
        } else {
            q3VarH = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 8) == 0) {
                jI = j11;
                if (c0VarR.L(jI)) {
                }
                i12 |= i22;
            } else {
                jI = j11;
            }
            i12 |= i22;
        } else {
            jI = j11;
        }
        if ((196608 & i10) == 0) {
            jG = j12;
            if ((i11 & 16) == 0) {
                i18 = 65536;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        } else {
            jG = j12;
        }
        i13 = i11 & 32;
        if (i13 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.I(f10)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f11)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 67108864;
                } else {
                    i17 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i17;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -897;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -7169;
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (i15 != 0) {
                        fR2 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR2 = f11;
                    }
                    j16 = jA;
                    j17 = jI;
                    j18 = jG;
                } else {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 2) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -897;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -7169;
                        q3VarH = u80.f33535a.h(c0VarR, 6);
                    }
                    if ((i11 & 8) != 0) {
                        jI = u80.f33535a.i(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        jG = u80.f33535a.g(c0VarR, 6);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f10;
                    }
                    if (i15 != 0) {
                        fR2 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR2 = f11;
                    }
                    j16 = jA;
                    j17 = jI;
                    j18 = jG;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2114904198, i12, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:61)");
                }
                u80 u80Var3 = u80.f33535a;
                long j111 = j16;
                androidx.compose.ui.graphics.q3 q3VarB3 = u80Var3.b(j111);
                float fJ3 = u80Var3.j();
                int i27 = (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B);
                int i28 = i12 << 3;
                h90.m(k90Var, a0Var2, q3VarB3, fJ3, q3VarH, j17, j18, fR, fR2, function2, c0VarR, (i28 & 1879048192) | i27 | (i28 & 57344) | (i28 & 458752) | (i28 & 3670016) | (i28 & 29360128) | (i28 & 234881024), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                f12 = fR2;
                f13 = fR;
                j15 = j18;
                j14 = j17;
                q3Var2 = q3VarH;
                j13 = j111;
            } else {
                c0VarR.u();
                f12 = f11;
                a0Var3 = a0Var2;
                j13 = jA;
                q3Var2 = q3VarH;
                j14 = jI;
                j15 = jG;
                f13 = f10;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.r90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.g(k90Var, a0Var3, j13, q3Var2, j14, j15, f13, f12, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i12 & 38347923) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 2) != 0) {
                    jA = androidx.compose.ui.unit.l.f42704b.a();
                    i12 &= -897;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -7169;
                    q3VarH = u80.f33535a.h(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    jI = u80.f33535a.i(c0VarR, 6);
                    i12 &= -57345;
                }
                if ((i11 & 16) != 0) {
                    jG = u80.f33535a.g(c0VarR, 6);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f10;
                }
                if (i15 != 0) {
                    fR2 = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR2 = f11;
                }
                j16 = jA;
                j17 = jI;
                j18 = jG;
            } else {
                if (i19 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 2) != 0) {
                    jA = androidx.compose.ui.unit.l.f42704b.a();
                    i12 &= -897;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -7169;
                    q3VarH = u80.f33535a.h(c0VarR, 6);
                }
                if ((i11 & 8) != 0) {
                    jI = u80.f33535a.i(c0VarR, 6);
                    i12 &= -57345;
                }
                if ((i11 & 16) != 0) {
                    jG = u80.f33535a.g(c0VarR, 6);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f10;
                }
                if (i15 != 0) {
                    fR2 = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR2 = f11;
                }
                j16 = jA;
                j17 = jI;
                j18 = jG;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2114904198, i12, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:61)");
            }
            u80 u80Var4 = u80.f33535a;
            long j112 = j16;
            androidx.compose.ui.graphics.q3 q3VarB4 = u80Var4.b(j112);
            float fJ4 = u80Var4.j();
            int i29 = (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B);
            int i210 = i12 << 3;
            h90.m(k90Var, a0Var2, q3VarB4, fJ4, q3VarH, j17, j18, fR, fR2, function2, c0VarR, (i210 & 1879048192) | i29 | (i210 & 57344) | (i210 & 458752) | (i210 & 3670016) | (i210 & 29360128) | (i210 & 234881024), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var2;
            f12 = fR2;
            f13 = fR;
            j15 = j18;
            j14 = j17;
            q3Var2 = q3VarH;
            j13 = j112;
        } else {
            c0VarR.u();
            f12 = f11;
            a0Var3 = a0Var2;
            j13 = jA;
            q3Var2 = q3VarH;
            j14 = jI;
            j15 = jG;
            f13 = f10;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.r90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t90.g(k90Var, a0Var3, j13, q3Var2, j14, j15, f13, f12, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(k90 k90Var, androidx.compose.ui.a0 a0Var, long j10, androidx.compose.ui.graphics.q3 q3Var, long j11, long j12, float f10, float f11, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(k90Var, a0Var, j10, q3Var, j11, j12, f10, f11, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(k90 k90Var, androidx.compose.ui.a0 a0Var, long j10, float f10, androidx.compose.ui.graphics.q3 q3Var, long j11, long j12, float f11, float f12, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(k90Var, a0Var, j10, f10, q3Var, j11, j12, f11, f12, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0150  */
    /* JADX WARN: Code duplicated, block: B:119:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:125:0x0170  */
    /* JADX WARN: Code duplicated, block: B:129:0x0178  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:159:0x01db  */
    /* JADX WARN: Code duplicated, block: B:161:0x01de  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:170:0x0202  */
    /* JADX WARN: Code duplicated, block: B:171:0x0209  */
    /* JADX WARN: Code duplicated, block: B:173:0x020d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0220  */
    /* JADX WARN: Code duplicated, block: B:177:0x0239  */
    /* JADX WARN: Code duplicated, block: B:180:0x0263  */
    /* JADX WARN: Code duplicated, block: B:182:0x0274  */
    /* JADX WARN: Code duplicated, block: B:185:0x028e  */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility.")
    @af
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @oj.i(name = "RichTooltip")
    public static final /* synthetic */ void i(final k90 k90Var, androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, long j10, float f10, androidx.compose.ui.graphics.q3 q3Var, ct ctVar, float f11, float f12, final Function2 function4, androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        Function2 function5;
        int i15;
        int i16;
        Function2 function6;
        int i17;
        long j11;
        int i18;
        float fL;
        int i19;
        ct ctVarQ;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z10;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final float f13;
        final androidx.compose.ui.a0 a0Var3;
        final Function2 function7;
        final float f14;
        final float f15;
        final ct ctVar2;
        final Function2 function8;
        final long j12;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        Function2 function9;
        long jA;
        androidx.compose.ui.graphics.q3 q3VarK;
        float fA;
        int i26;
        Function2 function10;
        float f16;
        float fG;
        float f17;
        ct ctVar3;
        long j13;
        Function2 function11;
        int i27;
        int i28;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-905938553);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = ((i10 & 8) == 0 ? c0VarR.D(k90Var) : c0VarR.k0(k90Var) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i29 = i12 & 1;
        if (i29 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i14 = i12 & 2;
            if (i14 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 4;
                if (i16 != 0) {
                    if ((i10 & 3072) == 0) {
                        function6 = function3;
                        if (c0VarR.k0(function6)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i12 & 8) == 0) {
                            j11 = j10;
                            int i30 = c0VarR.L(j11) ? 16384 : 8192;
                            i13 |= i30;
                        } else {
                            j11 = j10;
                        }
                        i13 |= i30;
                    } else {
                        j11 = j10;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                        fL = f10;
                    } else {
                        fL = f10;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.I(fL)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i12 & 32) == 0 || !c0VarR.D(q3Var)) {
                            i28 = 524288;
                        } else {
                            i28 = 1048576;
                        }
                        i13 |= i28;
                    }
                    if ((i10 & 12582912) == 0) {
                        ctVarQ = ctVar;
                        if ((i12 & 64) == 0 || !c0VarR.D(ctVarQ)) {
                            i27 = 4194304;
                        } else {
                            i27 = 8388608;
                        }
                        i13 |= i27;
                    } else {
                        ctVarQ = ctVar;
                    }
                    i20 = i12 & 128;
                    if (i20 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.I(f11)) {
                                i21 = 67108864;
                            } else {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i21;
                        }
                        i22 = i12 & 256;
                        if (i22 != 0) {
                            if ((i10 & 805306368) == 0) {
                                if (c0VarR.I(f12)) {
                                    i23 = 536870912;
                                } else {
                                    i23 = 268435456;
                                }
                                i13 |= i23;
                            }
                            if ((i12 & 512) != 0) {
                                i24 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.k0(function4)) {
                                    i25 = 4;
                                } else {
                                    i25 = 2;
                                }
                                i24 = i11 | i25;
                            } else {
                                i24 = i11;
                            }
                            if ((i13 & 306783379) == 306783378 || (i24 & 3) != 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i29 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i14 != 0) {
                                        function5 = null;
                                    }
                                    function9 = i16 == 0 ? function6 : null;
                                    if ((i12 & 8) != 0) {
                                        jA = androidx.compose.ui.unit.l.f42704b.a();
                                        i13 &= -57345;
                                    } else {
                                        jA = j11;
                                    }
                                    if (i18 != 0) {
                                        fL = u80.f33535a.l();
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarK = u80.f33535a.k(c0VarR, 6);
                                        i13 &= -3670017;
                                    } else {
                                        q3VarK = q3Var;
                                    }
                                    if ((i12 & 64) != 0) {
                                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                                        i13 = (-29360129) & i13;
                                    }
                                    if (i20 != 0) {
                                        fA = d0.e0.f267938a.a();
                                    } else {
                                        fA = f11;
                                    }
                                    if (i22 != 0) {
                                        long j14 = jA;
                                        f17 = fA;
                                        ctVar3 = ctVarQ;
                                        function11 = function5;
                                        fG = d0.e2.f267955a.g();
                                        i26 = i13;
                                        function10 = function9;
                                        f16 = fL;
                                        j13 = j14;
                                    } else {
                                        i26 = i13;
                                        function10 = function9;
                                        f16 = fL;
                                        Function2 function12 = function5;
                                        fG = f12;
                                        long j15 = jA;
                                        f17 = fA;
                                        ctVar3 = ctVarQ;
                                        j13 = j15;
                                        function11 = function12;
                                    }
                                } else {
                                    c0VarR.u();
                                    if ((i12 & 8) != 0) {
                                        i13 &= -57345;
                                    }
                                    if ((i12 & 32) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((i12 & 64) != 0) {
                                        i13 &= -29360129;
                                    }
                                    Function2 function13 = function6;
                                    i26 = i13;
                                    function10 = function13;
                                    q3VarK = q3Var;
                                    f17 = f11;
                                    f16 = fL;
                                    a0Var4 = a0Var2;
                                    function11 = function5;
                                    fG = f12;
                                    ctVar3 = ctVarQ;
                                    j13 = j11;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                                }
                                long j16 = j13;
                                float f18 = f16;
                                androidx.compose.ui.graphics.q3 q3Var3 = q3VarK;
                                h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f18, q3Var3, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                function8 = function10;
                                f13 = f17;
                                function7 = function11;
                                q3Var2 = q3Var3;
                                f14 = fG;
                                a0Var3 = a0Var4;
                                ctVar2 = ctVar3;
                                f15 = f18;
                                j12 = j16;
                            } else {
                                c0VarR.u();
                                q3Var2 = q3Var;
                                f13 = f11;
                                a0Var3 = a0Var2;
                                function7 = function5;
                                f14 = f12;
                                f15 = fL;
                                ctVar2 = ctVarQ;
                                function8 = function6;
                                j12 = j11;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 805306368;
                        if ((i12 & 512) != 0) {
                            i24 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i11 | i25;
                        } else {
                            i24 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j17 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j17;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function14 = function5;
                                    fG = f12;
                                    long j18 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j18;
                                    function11 = function14;
                                }
                            } else {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j19 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j19;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function15 = function5;
                                    fG = f12;
                                    long j110 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j110;
                                    function11 = function15;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                            }
                            long j111 = j13;
                            float f19 = f16;
                            androidx.compose.ui.graphics.q3 q3Var4 = q3VarK;
                            h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f19, q3Var4, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function10;
                            f13 = f17;
                            function7 = function11;
                            q3Var2 = q3Var4;
                            f14 = fG;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            f15 = f19;
                            j12 = j111;
                        } else {
                            c0VarR.u();
                            q3Var2 = q3Var;
                            f13 = f11;
                            a0Var3 = a0Var2;
                            function7 = function5;
                            f14 = f12;
                            f15 = fL;
                            ctVar2 = ctVarQ;
                            function8 = function6;
                            j12 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.I(f12)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i13 |= i23;
                        }
                        if ((i12 & 512) != 0) {
                            i24 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i11 | i25;
                        } else {
                            i24 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j112 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j112;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function16 = function5;
                                    fG = f12;
                                    long j113 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j113;
                                    function11 = function16;
                                }
                            } else {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j114 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j114;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function17 = function5;
                                    fG = f12;
                                    long j115 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j115;
                                    function11 = function17;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                            }
                            long j116 = j13;
                            float f110 = f16;
                            androidx.compose.ui.graphics.q3 q3Var5 = q3VarK;
                            h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f110, q3Var5, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function10;
                            f13 = f17;
                            function7 = function11;
                            q3Var2 = q3Var5;
                            f14 = fG;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            f15 = f110;
                            j12 = j116;
                        } else {
                            c0VarR.u();
                            q3Var2 = q3Var;
                            f13 = f11;
                            a0Var3 = a0Var2;
                            function7 = function5;
                            f14 = f12;
                            f15 = fL;
                            ctVar2 = ctVarQ;
                            function8 = function6;
                            j12 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j117 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j117;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function18 = function5;
                                fG = f12;
                                long j118 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j118;
                                function11 = function18;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j119 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j119;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function19 = function5;
                                fG = f12;
                                long j1110 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j1110;
                                function11 = function19;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j1111 = j13;
                        float f111 = f16;
                        androidx.compose.ui.graphics.q3 q3Var6 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f111, q3Var6, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var6;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f111;
                        j12 = j1111;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 3072;
                function6 = function3;
                if ((i10 & 24576) == 0) {
                    if ((i12 & 8) == 0) {
                        j11 = j10;
                        if (c0VarR.L(j11)) {
                        }
                        i13 |= i30;
                    } else {
                        j11 = j10;
                    }
                    i13 |= i30;
                } else {
                    j11 = j10;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    fL = f10;
                } else {
                    fL = f10;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(fL)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 32) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i13 |= i28;
                }
                if ((i10 & 12582912) == 0) {
                    ctVarQ = ctVar;
                    if ((i12 & 64) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i13 |= i27;
                } else {
                    ctVarQ = ctVar;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f11)) {
                            i21 = 67108864;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.I(f12)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i13 |= i23;
                        }
                        if ((i12 & 512) != 0) {
                            i24 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i11 | i25;
                        } else {
                            i24 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j1112 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j1112;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function110 = function5;
                                    fG = f12;
                                    long j1113 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j1113;
                                    function11 = function110;
                                }
                            } else {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j1114 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j1114;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function111 = function5;
                                    fG = f12;
                                    long j1115 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j1115;
                                    function11 = function111;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                            }
                            long j1116 = j13;
                            float f112 = f16;
                            androidx.compose.ui.graphics.q3 q3Var7 = q3VarK;
                            h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f112, q3Var7, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function10;
                            f13 = f17;
                            function7 = function11;
                            q3Var2 = q3Var7;
                            f14 = fG;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            f15 = f112;
                            j12 = j1116;
                        } else {
                            c0VarR.u();
                            q3Var2 = q3Var;
                            f13 = f11;
                            a0Var3 = a0Var2;
                            function7 = function5;
                            f14 = f12;
                            f15 = fL;
                            ctVar2 = ctVarQ;
                            function8 = function6;
                            j12 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j1117 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j1117;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function112 = function5;
                                fG = f12;
                                long j1118 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j1118;
                                function11 = function112;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j1119 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j1119;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function113 = function5;
                                fG = f12;
                                long j11110 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11110;
                                function11 = function113;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j11111 = j13;
                        float f113 = f16;
                        androidx.compose.ui.graphics.q3 q3Var8 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f113, q3Var8, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var8;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f113;
                        j12 = j11111;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i22 = i12 & 256;
                if (i22 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f12)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j11112 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j11112;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function114 = function5;
                                fG = f12;
                                long j11113 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11113;
                                function11 = function114;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j11114 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j11114;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function115 = function5;
                                fG = f12;
                                long j11115 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11115;
                                function11 = function115;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j11116 = j13;
                        float f114 = f16;
                        androidx.compose.ui.graphics.q3 q3Var9 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f114, q3Var9, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var9;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f114;
                        j12 = j11116;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j11117 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j11117;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function116 = function5;
                            fG = f12;
                            long j11118 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j11118;
                            function11 = function116;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j11119 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j11119;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function117 = function5;
                            fG = f12;
                            long j111110 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111110;
                            function11 = function117;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j111111 = j13;
                    float f115 = f16;
                    androidx.compose.ui.graphics.q3 q3Var10 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f115, q3Var10, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var10;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f115;
                    j12 = j111111;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.media3.exoplayer.a5.S0;
            function5 = function2;
            i16 = i12 & 4;
            if (i16 != 0) {
                if ((i10 & 3072) == 0) {
                    function6 = function3;
                    if (c0VarR.k0(function6)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i10 & 24576) == 0) {
                    if ((i12 & 8) == 0) {
                        j11 = j10;
                        if (c0VarR.L(j11)) {
                        }
                        i13 |= i30;
                    } else {
                        j11 = j10;
                    }
                    i13 |= i30;
                } else {
                    j11 = j10;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    fL = f10;
                } else {
                    fL = f10;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(fL)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 32) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i13 |= i28;
                }
                if ((i10 & 12582912) == 0) {
                    ctVarQ = ctVar;
                    if ((i12 & 64) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i13 |= i27;
                } else {
                    ctVarQ = ctVar;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f11)) {
                            i21 = 67108864;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.I(f12)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i13 |= i23;
                        }
                        if ((i12 & 512) != 0) {
                            i24 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i11 | i25;
                        } else {
                            i24 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j111112 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j111112;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function118 = function5;
                                    fG = f12;
                                    long j111113 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j111113;
                                    function11 = function118;
                                }
                            } else {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j111114 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j111114;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function119 = function5;
                                    fG = f12;
                                    long j111115 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j111115;
                                    function11 = function119;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                            }
                            long j111116 = j13;
                            float f116 = f16;
                            androidx.compose.ui.graphics.q3 q3Var11 = q3VarK;
                            h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f116, q3Var11, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function10;
                            f13 = f17;
                            function7 = function11;
                            q3Var2 = q3Var11;
                            f14 = fG;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            f15 = f116;
                            j12 = j111116;
                        } else {
                            c0VarR.u();
                            q3Var2 = q3Var;
                            f13 = f11;
                            a0Var3 = a0Var2;
                            function7 = function5;
                            f14 = f12;
                            f15 = fL;
                            ctVar2 = ctVarQ;
                            function8 = function6;
                            j12 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j111117 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j111117;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function1110 = function5;
                                fG = f12;
                                long j111118 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j111118;
                                function11 = function1110;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j111119 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j111119;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function1111 = function5;
                                fG = f12;
                                long j1111110 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j1111110;
                                function11 = function1111;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j1111111 = j13;
                        float f117 = f16;
                        androidx.compose.ui.graphics.q3 q3Var12 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f117, q3Var12, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var12;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f117;
                        j12 = j1111111;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i22 = i12 & 256;
                if (i22 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f12)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j1111112 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j1111112;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function1112 = function5;
                                fG = f12;
                                long j1111113 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j1111113;
                                function11 = function1112;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j1111114 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j1111114;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function1113 = function5;
                                fG = f12;
                                long j1111115 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j1111115;
                                function11 = function1113;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j1111116 = j13;
                        float f118 = f16;
                        androidx.compose.ui.graphics.q3 q3Var13 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f118, q3Var13, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var13;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f118;
                        j12 = j1111116;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j1111117 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j1111117;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1114 = function5;
                            fG = f12;
                            long j1111118 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j1111118;
                            function11 = function1114;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j1111119 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j1111119;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1115 = function5;
                            fG = f12;
                            long j11111110 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j11111110;
                            function11 = function1115;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j11111111 = j13;
                    float f119 = f16;
                    androidx.compose.ui.graphics.q3 q3Var14 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f119, q3Var14, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var14;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f119;
                    j12 = j11111111;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            function6 = function3;
            if ((i10 & 24576) == 0) {
                if ((i12 & 8) == 0) {
                    j11 = j10;
                    if (c0VarR.L(j11)) {
                    }
                    i13 |= i30;
                } else {
                    j11 = j10;
                }
                i13 |= i30;
            } else {
                j11 = j10;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                fL = f10;
            } else {
                fL = f10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(fL)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 32) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i13 |= i28;
            }
            if ((i10 & 12582912) == 0) {
                ctVarQ = ctVar;
                if ((i12 & 64) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i13 |= i27;
            } else {
                ctVarQ = ctVar;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i21 = 67108864;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f12)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j11111112 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j11111112;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function1116 = function5;
                                fG = f12;
                                long j11111113 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11111113;
                                function11 = function1116;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j11111114 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j11111114;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function1117 = function5;
                                fG = f12;
                                long j11111115 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11111115;
                                function11 = function1117;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j11111116 = j13;
                        float f1110 = f16;
                        androidx.compose.ui.graphics.q3 q3Var15 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1110, q3Var15, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var15;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f1110;
                        j12 = j11111116;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j11111117 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j11111117;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1118 = function5;
                            fG = f12;
                            long j11111118 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j11111118;
                            function11 = function1118;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j11111119 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j11111119;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1119 = function5;
                            fG = f12;
                            long j111111110 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111111110;
                            function11 = function1119;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j111111111 = j13;
                    float f1111 = f16;
                    androidx.compose.ui.graphics.q3 q3Var16 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1111, q3Var16, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var16;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f1111;
                    j12 = j111111111;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i22 = i12 & 256;
            if (i22 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f12)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j111111112 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j111111112;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function11110 = function5;
                            fG = f12;
                            long j111111113 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111111113;
                            function11 = function11110;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j111111114 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j111111114;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function11111 = function5;
                            fG = f12;
                            long j111111115 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111111115;
                            function11 = function11111;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j111111116 = j13;
                    float f1112 = f16;
                    androidx.compose.ui.graphics.q3 q3Var17 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1112, q3Var17, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var17;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f1112;
                    j12 = j111111116;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j111111117 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j111111117;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function11112 = function5;
                        fG = f12;
                        long j111111118 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j111111118;
                        function11 = function11112;
                    }
                } else {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j111111119 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j111111119;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function11113 = function5;
                        fG = f12;
                        long j1111111110 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j1111111110;
                        function11 = function11113;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                }
                long j1111111111 = j13;
                float f1113 = f16;
                androidx.compose.ui.graphics.q3 q3Var18 = q3VarK;
                h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1113, q3Var18, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function10;
                f13 = f17;
                function7 = function11;
                q3Var2 = q3Var18;
                f14 = fG;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                f15 = f1113;
                j12 = j1111111111;
            } else {
                c0VarR.u();
                q3Var2 = q3Var;
                f13 = f11;
                a0Var3 = a0Var2;
                function7 = function5;
                f14 = f12;
                f15 = fL;
                ctVar2 = ctVarQ;
                function8 = function6;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        i14 = i12 & 2;
        if (i14 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function5 = function2;
                if (c0VarR.k0(function5)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 4;
            if (i16 != 0) {
                if ((i10 & 3072) == 0) {
                    function6 = function3;
                    if (c0VarR.k0(function6)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i10 & 24576) == 0) {
                    if ((i12 & 8) == 0) {
                        j11 = j10;
                        if (c0VarR.L(j11)) {
                        }
                        i13 |= i30;
                    } else {
                        j11 = j10;
                    }
                    i13 |= i30;
                } else {
                    j11 = j10;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    fL = f10;
                } else {
                    fL = f10;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(fL)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 32) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i13 |= i28;
                }
                if ((i10 & 12582912) == 0) {
                    ctVarQ = ctVar;
                    if ((i12 & 64) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i13 |= i27;
                } else {
                    ctVarQ = ctVar;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f11)) {
                            i21 = 67108864;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.I(f12)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i13 |= i23;
                        }
                        if ((i12 & 512) != 0) {
                            i24 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i11 | i25;
                        } else {
                            i24 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j1111111112 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j1111111112;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function11114 = function5;
                                    fG = f12;
                                    long j1111111113 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j1111111113;
                                    function11 = function11114;
                                }
                            } else {
                                if (i29 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i14 != 0) {
                                    function5 = null;
                                }
                                if (i16 == 0) {
                                }
                                if ((i12 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i13 &= -57345;
                                } else {
                                    jA = j11;
                                }
                                if (i18 != 0) {
                                    fL = u80.f33535a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    q3VarK = q3Var;
                                }
                                if ((i12 & 64) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i13 = (-29360129) & i13;
                                }
                                if (i20 != 0) {
                                    fA = d0.e0.f267938a.a();
                                } else {
                                    fA = f11;
                                }
                                if (i22 != 0) {
                                    long j1111111114 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    function11 = function5;
                                    fG = d0.e2.f267955a.g();
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    j13 = j1111111114;
                                } else {
                                    i26 = i13;
                                    function10 = function9;
                                    f16 = fL;
                                    Function2 function11115 = function5;
                                    fG = f12;
                                    long j1111111115 = jA;
                                    f17 = fA;
                                    ctVar3 = ctVarQ;
                                    j13 = j1111111115;
                                    function11 = function11115;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                            }
                            long j1111111116 = j13;
                            float f1114 = f16;
                            androidx.compose.ui.graphics.q3 q3Var19 = q3VarK;
                            h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1114, q3Var19, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function10;
                            f13 = f17;
                            function7 = function11;
                            q3Var2 = q3Var19;
                            f14 = fG;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            f15 = f1114;
                            j12 = j1111111116;
                        } else {
                            c0VarR.u();
                            q3Var2 = q3Var;
                            f13 = f11;
                            a0Var3 = a0Var2;
                            function7 = function5;
                            f14 = f12;
                            f15 = fL;
                            ctVar2 = ctVarQ;
                            function8 = function6;
                            j12 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j1111111117 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j1111111117;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function11116 = function5;
                                fG = f12;
                                long j1111111118 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j1111111118;
                                function11 = function11116;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j1111111119 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j1111111119;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function11117 = function5;
                                fG = f12;
                                long j11111111110 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11111111110;
                                function11 = function11117;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j11111111111 = j13;
                        float f1115 = f16;
                        androidx.compose.ui.graphics.q3 q3Var110 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1115, q3Var110, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var110;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f1115;
                        j12 = j11111111111;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i22 = i12 & 256;
                if (i22 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f12)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j11111111112 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j11111111112;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function11118 = function5;
                                fG = f12;
                                long j11111111113 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11111111113;
                                function11 = function11118;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j11111111114 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j11111111114;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function11119 = function5;
                                fG = f12;
                                long j11111111115 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11111111115;
                                function11 = function11119;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j11111111116 = j13;
                        float f1116 = f16;
                        androidx.compose.ui.graphics.q3 q3Var111 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1116, q3Var111, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var111;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f1116;
                        j12 = j11111111116;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j11111111117 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j11111111117;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function111110 = function5;
                            fG = f12;
                            long j11111111118 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j11111111118;
                            function11 = function111110;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j11111111119 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j11111111119;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function111111 = function5;
                            fG = f12;
                            long j111111111110 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111111111110;
                            function11 = function111111;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j111111111111 = j13;
                    float f1117 = f16;
                    androidx.compose.ui.graphics.q3 q3Var112 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1117, q3Var112, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var112;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f1117;
                    j12 = j111111111111;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            function6 = function3;
            if ((i10 & 24576) == 0) {
                if ((i12 & 8) == 0) {
                    j11 = j10;
                    if (c0VarR.L(j11)) {
                    }
                    i13 |= i30;
                } else {
                    j11 = j10;
                }
                i13 |= i30;
            } else {
                j11 = j10;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                fL = f10;
            } else {
                fL = f10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(fL)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 32) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i13 |= i28;
            }
            if ((i10 & 12582912) == 0) {
                ctVarQ = ctVar;
                if ((i12 & 64) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i13 |= i27;
            } else {
                ctVarQ = ctVar;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i21 = 67108864;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f12)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j111111111112 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j111111111112;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function111112 = function5;
                                fG = f12;
                                long j111111111113 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j111111111113;
                                function11 = function111112;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j111111111114 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j111111111114;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function111113 = function5;
                                fG = f12;
                                long j111111111115 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j111111111115;
                                function11 = function111113;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j111111111116 = j13;
                        float f1118 = f16;
                        androidx.compose.ui.graphics.q3 q3Var113 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1118, q3Var113, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var113;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f1118;
                        j12 = j111111111116;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j111111111117 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j111111111117;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function111114 = function5;
                            fG = f12;
                            long j111111111118 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111111111118;
                            function11 = function111114;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j111111111119 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j111111111119;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function111115 = function5;
                            fG = f12;
                            long j1111111111110 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j1111111111110;
                            function11 = function111115;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j1111111111111 = j13;
                    float f1119 = f16;
                    androidx.compose.ui.graphics.q3 q3Var114 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f1119, q3Var114, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var114;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f1119;
                    j12 = j1111111111111;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i22 = i12 & 256;
            if (i22 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f12)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j1111111111112 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j1111111111112;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function111116 = function5;
                            fG = f12;
                            long j1111111111113 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j1111111111113;
                            function11 = function111116;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j1111111111114 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j1111111111114;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function111117 = function5;
                            fG = f12;
                            long j1111111111115 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j1111111111115;
                            function11 = function111117;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j1111111111116 = j13;
                    float f11110 = f16;
                    androidx.compose.ui.graphics.q3 q3Var115 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11110, q3Var115, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var115;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f11110;
                    j12 = j1111111111116;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j1111111111117 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j1111111111117;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function111118 = function5;
                        fG = f12;
                        long j1111111111118 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j1111111111118;
                        function11 = function111118;
                    }
                } else {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j1111111111119 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j1111111111119;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function111119 = function5;
                        fG = f12;
                        long j11111111111110 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j11111111111110;
                        function11 = function111119;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                }
                long j11111111111111 = j13;
                float f11111 = f16;
                androidx.compose.ui.graphics.q3 q3Var116 = q3VarK;
                h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11111, q3Var116, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function10;
                f13 = f17;
                function7 = function11;
                q3Var2 = q3Var116;
                f14 = fG;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                f15 = f11111;
                j12 = j11111111111111;
            } else {
                c0VarR.u();
                q3Var2 = q3Var;
                f13 = f11;
                a0Var3 = a0Var2;
                function7 = function5;
                f14 = f12;
                f15 = fL;
                ctVar2 = ctVarQ;
                function8 = function6;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        function5 = function2;
        i16 = i12 & 4;
        if (i16 != 0) {
            if ((i10 & 3072) == 0) {
                function6 = function3;
                if (c0VarR.k0(function6)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i10 & 24576) == 0) {
                if ((i12 & 8) == 0) {
                    j11 = j10;
                    if (c0VarR.L(j11)) {
                    }
                    i13 |= i30;
                } else {
                    j11 = j10;
                }
                i13 |= i30;
            } else {
                j11 = j10;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                fL = f10;
            } else {
                fL = f10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(fL)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 32) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i13 |= i28;
            }
            if ((i10 & 12582912) == 0) {
                ctVarQ = ctVar;
                if ((i12 & 64) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i13 |= i27;
            } else {
                ctVarQ = ctVar;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i21 = 67108864;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f12)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((i12 & 512) != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j11111111111112 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j11111111111112;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function1111110 = function5;
                                fG = f12;
                                long j11111111111113 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11111111111113;
                                function11 = function1111110;
                            }
                        } else {
                            if (i29 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i14 != 0) {
                                function5 = null;
                            }
                            if (i16 == 0) {
                            }
                            if ((i12 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i13 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if (i18 != 0) {
                                fL = u80.f33535a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                q3VarK = q3Var;
                            }
                            if ((i12 & 64) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i13 = (-29360129) & i13;
                            }
                            if (i20 != 0) {
                                fA = d0.e0.f267938a.a();
                            } else {
                                fA = f11;
                            }
                            if (i22 != 0) {
                                long j11111111111114 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                function11 = function5;
                                fG = d0.e2.f267955a.g();
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                j13 = j11111111111114;
                            } else {
                                i26 = i13;
                                function10 = function9;
                                f16 = fL;
                                Function2 function1111111 = function5;
                                fG = f12;
                                long j11111111111115 = jA;
                                f17 = fA;
                                ctVar3 = ctVarQ;
                                j13 = j11111111111115;
                                function11 = function1111111;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                        }
                        long j11111111111116 = j13;
                        float f11112 = f16;
                        androidx.compose.ui.graphics.q3 q3Var117 = q3VarK;
                        h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11112, q3Var117, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function10;
                        f13 = f17;
                        function7 = function11;
                        q3Var2 = q3Var117;
                        f14 = fG;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        f15 = f11112;
                        j12 = j11111111111116;
                    } else {
                        c0VarR.u();
                        q3Var2 = q3Var;
                        f13 = f11;
                        a0Var3 = a0Var2;
                        function7 = function5;
                        f14 = f12;
                        f15 = fL;
                        ctVar2 = ctVarQ;
                        function8 = function6;
                        j12 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j11111111111117 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j11111111111117;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1111112 = function5;
                            fG = f12;
                            long j11111111111118 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j11111111111118;
                            function11 = function1111112;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j11111111111119 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j11111111111119;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1111113 = function5;
                            fG = f12;
                            long j111111111111110 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111111111111110;
                            function11 = function1111113;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j111111111111111 = j13;
                    float f11113 = f16;
                    androidx.compose.ui.graphics.q3 q3Var118 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11113, q3Var118, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var118;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f11113;
                    j12 = j111111111111111;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i22 = i12 & 256;
            if (i22 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f12)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j111111111111112 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j111111111111112;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1111114 = function5;
                            fG = f12;
                            long j111111111111113 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111111111111113;
                            function11 = function1111114;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j111111111111114 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j111111111111114;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1111115 = function5;
                            fG = f12;
                            long j111111111111115 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j111111111111115;
                            function11 = function1111115;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j111111111111116 = j13;
                    float f11114 = f16;
                    androidx.compose.ui.graphics.q3 q3Var119 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11114, q3Var119, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var119;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f11114;
                    j12 = j111111111111116;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j111111111111117 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j111111111111117;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function1111116 = function5;
                        fG = f12;
                        long j111111111111118 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j111111111111118;
                        function11 = function1111116;
                    }
                } else {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j111111111111119 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j111111111111119;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function1111117 = function5;
                        fG = f12;
                        long j1111111111111110 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j1111111111111110;
                        function11 = function1111117;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                }
                long j1111111111111111 = j13;
                float f11115 = f16;
                androidx.compose.ui.graphics.q3 q3Var1110 = q3VarK;
                h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11115, q3Var1110, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function10;
                f13 = f17;
                function7 = function11;
                q3Var2 = q3Var1110;
                f14 = fG;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                f15 = f11115;
                j12 = j1111111111111111;
            } else {
                c0VarR.u();
                q3Var2 = q3Var;
                f13 = f11;
                a0Var3 = a0Var2;
                function7 = function5;
                f14 = f12;
                f15 = fL;
                ctVar2 = ctVarQ;
                function8 = function6;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        function6 = function3;
        if ((i10 & 24576) == 0) {
            if ((i12 & 8) == 0) {
                j11 = j10;
                if (c0VarR.L(j11)) {
                }
                i13 |= i30;
            } else {
                j11 = j10;
            }
            i13 |= i30;
        } else {
            j11 = j10;
        }
        i18 = i12 & 16;
        if (i18 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            fL = f10;
        } else {
            fL = f10;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.I(fL)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
        }
        if ((i10 & 1572864) != 0) {
            if ((i12 & 32) == 0) {
                i28 = 524288;
            } else {
                i28 = 524288;
            }
            i13 |= i28;
        }
        if ((i10 & 12582912) == 0) {
            ctVarQ = ctVar;
            if ((i12 & 64) == 0) {
                i27 = 4194304;
            } else {
                i27 = 4194304;
            }
            i13 |= i27;
        } else {
            ctVarQ = ctVar;
        }
        i20 = i12 & 128;
        if (i20 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f11)) {
                    i21 = 67108864;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i21;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f12)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((i12 & 512) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j1111111111111112 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j1111111111111112;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1111118 = function5;
                            fG = f12;
                            long j1111111111111113 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j1111111111111113;
                            function11 = function1111118;
                        }
                    } else {
                        if (i29 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i14 != 0) {
                            function5 = null;
                        }
                        if (i16 == 0) {
                        }
                        if ((i12 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i13 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if (i18 != 0) {
                            fL = u80.f33535a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            q3VarK = q3Var;
                        }
                        if ((i12 & 64) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i13 = (-29360129) & i13;
                        }
                        if (i20 != 0) {
                            fA = d0.e0.f267938a.a();
                        } else {
                            fA = f11;
                        }
                        if (i22 != 0) {
                            long j1111111111111114 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            function11 = function5;
                            fG = d0.e2.f267955a.g();
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            j13 = j1111111111111114;
                        } else {
                            i26 = i13;
                            function10 = function9;
                            f16 = fL;
                            Function2 function1111119 = function5;
                            fG = f12;
                            long j1111111111111115 = jA;
                            f17 = fA;
                            ctVar3 = ctVarQ;
                            j13 = j1111111111111115;
                            function11 = function1111119;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                    }
                    long j1111111111111116 = j13;
                    float f11116 = f16;
                    androidx.compose.ui.graphics.q3 q3Var1111 = q3VarK;
                    h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11116, q3Var1111, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function10;
                    f13 = f17;
                    function7 = function11;
                    q3Var2 = q3Var1111;
                    f14 = fG;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    f15 = f11116;
                    j12 = j1111111111111116;
                } else {
                    c0VarR.u();
                    q3Var2 = q3Var;
                    f13 = f11;
                    a0Var3 = a0Var2;
                    function7 = function5;
                    f14 = f12;
                    f15 = fL;
                    ctVar2 = ctVarQ;
                    function8 = function6;
                    j12 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j1111111111111117 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j1111111111111117;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function11111110 = function5;
                        fG = f12;
                        long j1111111111111118 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j1111111111111118;
                        function11 = function11111110;
                    }
                } else {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j1111111111111119 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j1111111111111119;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function11111111 = function5;
                        fG = f12;
                        long j11111111111111110 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j11111111111111110;
                        function11 = function11111111;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                }
                long j11111111111111111 = j13;
                float f11117 = f16;
                androidx.compose.ui.graphics.q3 q3Var1112 = q3VarK;
                h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11117, q3Var1112, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function10;
                f13 = f17;
                function7 = function11;
                q3Var2 = q3Var1112;
                f14 = fG;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                f15 = f11117;
                j12 = j11111111111111111;
            } else {
                c0VarR.u();
                q3Var2 = q3Var;
                f13 = f11;
                a0Var3 = a0Var2;
                function7 = function5;
                f14 = f12;
                f15 = fL;
                ctVar2 = ctVarQ;
                function8 = function6;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 100663296;
        i22 = i12 & 256;
        if (i22 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.I(f12)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            if ((i12 & 512) != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j11111111111111112 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j11111111111111112;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function11111112 = function5;
                        fG = f12;
                        long j11111111111111113 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j11111111111111113;
                        function11 = function11111112;
                    }
                } else {
                    if (i29 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i14 != 0) {
                        function5 = null;
                    }
                    if (i16 == 0) {
                    }
                    if ((i12 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i13 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if (i18 != 0) {
                        fL = u80.f33535a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i12 & 64) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i13 = (-29360129) & i13;
                    }
                    if (i20 != 0) {
                        fA = d0.e0.f267938a.a();
                    } else {
                        fA = f11;
                    }
                    if (i22 != 0) {
                        long j11111111111111114 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        function11 = function5;
                        fG = d0.e2.f267955a.g();
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        j13 = j11111111111111114;
                    } else {
                        i26 = i13;
                        function10 = function9;
                        f16 = fL;
                        Function2 function11111113 = function5;
                        fG = f12;
                        long j11111111111111115 = jA;
                        f17 = fA;
                        ctVar3 = ctVarQ;
                        j13 = j11111111111111115;
                        function11 = function11111113;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                }
                long j11111111111111116 = j13;
                float f11118 = f16;
                androidx.compose.ui.graphics.q3 q3Var1113 = q3VarK;
                h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11118, q3Var1113, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function10;
                f13 = f17;
                function7 = function11;
                q3Var2 = q3Var1113;
                f14 = fG;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                f15 = f11118;
                j12 = j11111111111111116;
            } else {
                c0VarR.u();
                q3Var2 = q3Var;
                f13 = f11;
                a0Var3 = a0Var2;
                function7 = function5;
                f14 = f12;
                f15 = fL;
                ctVar2 = ctVarQ;
                function8 = function6;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        if ((i12 & 512) != 0) {
            i24 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function4)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i11 | i25;
        } else {
            i24 = i11;
        }
        if ((i13 & 306783379) == 306783378) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i29 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i14 != 0) {
                    function5 = null;
                }
                if (i16 == 0) {
                }
                if ((i12 & 8) != 0) {
                    jA = androidx.compose.ui.unit.l.f42704b.a();
                    i13 &= -57345;
                } else {
                    jA = j11;
                }
                if (i18 != 0) {
                    fL = u80.f33535a.l();
                }
                if ((i12 & 32) != 0) {
                    q3VarK = u80.f33535a.k(c0VarR, 6);
                    i13 &= -3670017;
                } else {
                    q3VarK = q3Var;
                }
                if ((i12 & 64) != 0) {
                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                    i13 = (-29360129) & i13;
                }
                if (i20 != 0) {
                    fA = d0.e0.f267938a.a();
                } else {
                    fA = f11;
                }
                if (i22 != 0) {
                    long j11111111111111117 = jA;
                    f17 = fA;
                    ctVar3 = ctVarQ;
                    function11 = function5;
                    fG = d0.e2.f267955a.g();
                    i26 = i13;
                    function10 = function9;
                    f16 = fL;
                    j13 = j11111111111111117;
                } else {
                    i26 = i13;
                    function10 = function9;
                    f16 = fL;
                    Function2 function11111114 = function5;
                    fG = f12;
                    long j11111111111111118 = jA;
                    f17 = fA;
                    ctVar3 = ctVarQ;
                    j13 = j11111111111111118;
                    function11 = function11111114;
                }
            } else {
                if (i29 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i14 != 0) {
                    function5 = null;
                }
                if (i16 == 0) {
                }
                if ((i12 & 8) != 0) {
                    jA = androidx.compose.ui.unit.l.f42704b.a();
                    i13 &= -57345;
                } else {
                    jA = j11;
                }
                if (i18 != 0) {
                    fL = u80.f33535a.l();
                }
                if ((i12 & 32) != 0) {
                    q3VarK = u80.f33535a.k(c0VarR, 6);
                    i13 &= -3670017;
                } else {
                    q3VarK = q3Var;
                }
                if ((i12 & 64) != 0) {
                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                    i13 = (-29360129) & i13;
                }
                if (i20 != 0) {
                    fA = d0.e0.f267938a.a();
                } else {
                    fA = f11;
                }
                if (i22 != 0) {
                    long j11111111111111119 = jA;
                    f17 = fA;
                    ctVar3 = ctVarQ;
                    function11 = function5;
                    fG = d0.e2.f267955a.g();
                    i26 = i13;
                    function10 = function9;
                    f16 = fL;
                    j13 = j11111111111111119;
                } else {
                    i26 = i13;
                    function10 = function9;
                    f16 = fL;
                    Function2 function11111115 = function5;
                    fG = f12;
                    long j111111111111111110 = jA;
                    f17 = fA;
                    ctVar3 = ctVarQ;
                    j13 = j111111111111111110;
                    function11 = function11111115;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-905938553, i26, i24, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
            }
            long j111111111111111111 = j13;
            float f11119 = f16;
            androidx.compose.ui.graphics.q3 q3Var1114 = q3VarK;
            h90.r(k90Var, a0Var4, function11, function10, u80.f33535a.b(j13), f11119, q3Var1114, ctVar3, f17, fG, function4, c0VarR, i26 & 2147426302, i24 & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function8 = function10;
            f13 = f17;
            function7 = function11;
            q3Var2 = q3Var1114;
            f14 = fG;
            a0Var3 = a0Var4;
            ctVar2 = ctVar3;
            f15 = f11119;
            j12 = j111111111111111111;
        } else {
            c0VarR.u();
            q3Var2 = q3Var;
            f13 = f11;
            a0Var3 = a0Var2;
            function7 = function5;
            f14 = f12;
            f15 = fL;
            ctVar2 = ctVarQ;
            function8 = function6;
            j12 = j11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.p90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t90.k(k90Var, a0Var3, function7, function8, j12, f15, q3Var2, ctVar2, f13, f14, function4, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:114:0x014c  */
    /* JADX WARN: Code duplicated, block: B:115:0x014e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:132:0x0182 A[PHI: r2 r3 r5 r7 r9 r10 r12 r14
      0x0182: PHI (r2v10 float) = (r2v5 float), (r2v2 float), (r2v2 float) binds: [B:151:0x01ce, B:130:0x017f, B:131:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r3v41 int) = (r3v34 int), (r3v44 int), (r3v45 int) binds: [B:151:0x01ce, B:130:0x017f, B:131:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r5v9 androidx.compose.ui.a0) = (r5v5 androidx.compose.ui.a0), (r5v2 androidx.compose.ui.a0), (r5v2 androidx.compose.ui.a0) binds: [B:151:0x01ce, B:130:0x017f, B:131:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r7v11 kotlin.jvm.functions.Function2) = (r7v6 kotlin.jvm.functions.Function2), (r7v2 kotlin.jvm.functions.Function2), (r7v2 kotlin.jvm.functions.Function2) binds: [B:151:0x01ce, B:130:0x017f, B:131:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r9v12 kotlin.jvm.functions.Function2) = (r9v6 kotlin.jvm.functions.Function2), (r9v3 kotlin.jvm.functions.Function2), (r9v3 kotlin.jvm.functions.Function2) binds: [B:151:0x01ce, B:130:0x017f, B:131:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r10v27 androidx.compose.material3.ct) = (r10v10 androidx.compose.material3.ct), (r10v7 androidx.compose.material3.ct), (r10v7 androidx.compose.material3.ct) binds: [B:151:0x01ce, B:130:0x017f, B:131:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r12v9 long) = (r12v3 long), (r12v1 long), (r12v1 long) binds: [B:151:0x01ce, B:130:0x017f, B:131:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r14v13 androidx.compose.ui.graphics.q3) = 
      (r14v4 androidx.compose.ui.graphics.q3)
      (r14v2 androidx.compose.ui.graphics.q3)
      (r14v2 androidx.compose.ui.graphics.q3)
     binds: [B:151:0x01ce, B:130:0x017f, B:131:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0193  */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:158:0x023e  */
    /* JADX WARN: Code duplicated, block: B:160:0x024d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0261  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use overload with maxWidth parameter.")
    @af
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @oj.i(name = "RichTooltip")
    public static final /* synthetic */ void j(final k90 k90Var, androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, long j10, androidx.compose.ui.graphics.q3 q3Var, ct ctVar, float f10, float f11, final Function2 function4, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        Function2 function5;
        int i14;
        int i15;
        Function2 function6;
        int i16;
        long jA;
        androidx.compose.ui.graphics.q3 q3VarK;
        ct ctVarQ;
        int i17;
        float fA;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        final Function2 function7;
        final Function2 function8;
        final ct ctVar2;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final float f12;
        final float f13;
        final androidx.compose.ui.a0 a0Var3;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        float fG;
        int i22;
        Function2 function9;
        float f14;
        androidx.compose.ui.a0 a0Var4;
        Function2 function10;
        ct ctVar3;
        long j12;
        androidx.compose.ui.graphics.q3 q3Var3;
        int i23;
        int i24;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-244908363);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(k90Var) : c0VarR.k0(k90Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 1;
        if (i25 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 2;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 4;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        function6 = function3;
                        if (c0VarR.k0(function6)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        jA = j10;
                        if ((i11 & 8) == 0 || !c0VarR.L(jA)) {
                            i24 = 8192;
                        } else {
                            i24 = 16384;
                        }
                        i12 |= i24;
                    } else {
                        jA = j10;
                    }
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if ((i11 & 16) == 0) {
                            q3VarK = q3Var;
                            int i26 = c0VarR.D(q3VarK) ? 131072 : 65536;
                            i12 |= i26;
                        } else {
                            q3VarK = q3Var;
                        }
                        i12 |= i26;
                    } else {
                        q3VarK = q3Var;
                    }
                    if ((i10 & 1572864) == 0) {
                        ctVarQ = ctVar;
                        if ((i11 & 32) == 0 || !c0VarR.D(ctVarQ)) {
                            i23 = 524288;
                        } else {
                            i23 = 1048576;
                        }
                        i12 |= i23;
                    } else {
                        ctVarQ = ctVar;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 12582912;
                        fA = f10;
                    } else {
                        fA = f10;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.I(fA)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i12 |= i18;
                        }
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.I(f11)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 256) != 0) {
                            if ((i10 & 805306368) == 0) {
                                if (c0VarR.k0(function4)) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i12 |= i21;
                            }
                            if ((i12 & 306783379) != 306783378) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i25 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i13 != 0) {
                                        function5 = null;
                                    }
                                    if (i15 != 0) {
                                        function6 = null;
                                    }
                                    if ((i11 & 8) != 0) {
                                        jA = androidx.compose.ui.unit.l.f42704b.a();
                                        i12 &= -57345;
                                    }
                                    if ((i11 & 16) != 0) {
                                        i12 &= -458753;
                                        q3VarK = u80.f33535a.k(c0VarR, 6);
                                    }
                                    if ((i11 & 32) != 0) {
                                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                                        i12 = (-3670017) & i12;
                                    }
                                    if (i17 != 0) {
                                        fA = d0.e0.f267938a.a();
                                    }
                                    if (i19 != 0) {
                                        Function2 function11 = function6;
                                        fG = d0.e2.f267955a.g();
                                        i22 = i12;
                                        function9 = function11;
                                        f14 = fA;
                                        a0Var4 = a0Var2;
                                        function10 = function5;
                                        ctVar3 = ctVarQ;
                                        j12 = jA;
                                        q3Var3 = q3VarK;
                                    }
                                    c0VarR.Z();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                                    }
                                    u80 u80Var = u80.f33535a;
                                    long j13 = j12;
                                    int i27 = i22 << 3;
                                    h90.r(k90Var, a0Var4, function10, function9, u80Var.b(j13), u80Var.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i27 & 3670016) | (i27 & 29360128) | (i27 & 234881024) | (i27 & 1879048192), (i22 >> 27) & 14, 0);
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    function8 = function9;
                                    f12 = fG;
                                    function7 = function10;
                                    f13 = f14;
                                    a0Var3 = a0Var4;
                                    ctVar2 = ctVar3;
                                    q3Var2 = q3Var3;
                                    j11 = j13;
                                } else {
                                    c0VarR.u();
                                    if ((i11 & 8) != 0) {
                                        i12 &= -57345;
                                    }
                                    if ((i11 & 16) != 0) {
                                        i12 &= -458753;
                                    }
                                    if ((i11 & 32) != 0) {
                                        i12 &= -3670017;
                                    }
                                }
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                                }
                                u80 u80Var2 = u80.f33535a;
                                long j14 = j12;
                                int i28 = i22 << 3;
                                h90.r(k90Var, a0Var4, function10, function9, u80Var2.b(j14), u80Var2.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i28 & 3670016) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), (i22 >> 27) & 14, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                function8 = function9;
                                f12 = fG;
                                function7 = function10;
                                f13 = f14;
                                a0Var3 = a0Var4;
                                ctVar2 = ctVar3;
                                q3Var2 = q3Var3;
                                j11 = j14;
                            } else {
                                c0VarR.u();
                                function7 = function5;
                                function8 = function6;
                                ctVar2 = ctVarQ;
                                q3Var2 = q3VarK;
                                f12 = f11;
                                f13 = fA;
                                a0Var3 = a0Var2;
                                j11 = jA;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 805306368;
                        if ((i12 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function12 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function12;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            } else {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function13 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function13;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                            }
                            u80 u80Var3 = u80.f33535a;
                            long j15 = j12;
                            int i29 = i22 << 3;
                            h90.r(k90Var, a0Var4, function10, function9, u80Var3.b(j15), u80Var3.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i29 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), (i22 >> 27) & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function9;
                            f12 = fG;
                            function7 = function10;
                            f13 = f14;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            q3Var2 = q3Var3;
                            j11 = j15;
                        } else {
                            c0VarR.u();
                            function7 = function5;
                            function8 = function6;
                            ctVar2 = ctVarQ;
                            q3Var2 = q3VarK;
                            f12 = f11;
                            f13 = fA;
                            a0Var3 = a0Var2;
                            j11 = jA;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i11 & 256) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function4)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function14 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function14;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            } else {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function15 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function15;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                            }
                            u80 u80Var4 = u80.f33535a;
                            long j16 = j12;
                            int i210 = i22 << 3;
                            h90.r(k90Var, a0Var4, function10, function9, u80Var4.b(j16), u80Var4.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i210 & 3670016) | (i210 & 29360128) | (i210 & 234881024) | (i210 & 1879048192), (i22 >> 27) & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function9;
                            f12 = fG;
                            function7 = function10;
                            f13 = f14;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            q3Var2 = q3Var3;
                            j11 = j16;
                        } else {
                            c0VarR.u();
                            function7 = function5;
                            function8 = function6;
                            ctVar2 = ctVarQ;
                            q3Var2 = q3VarK;
                            f12 = f11;
                            f13 = fA;
                            a0Var3 = a0Var2;
                            j11 = jA;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function16 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function16;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function17 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function17;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var5 = u80.f33535a;
                        long j17 = j12;
                        int i211 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var5.b(j17), u80Var5.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i211 & 3670016) | (i211 & 29360128) | (i211 & 234881024) | (i211 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j17;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                function6 = function3;
                if ((i10 & 24576) == 0) {
                    jA = j10;
                    if ((i11 & 8) == 0) {
                        i24 = 8192;
                    } else {
                        i24 = 8192;
                    }
                    i12 |= i24;
                } else {
                    jA = j10;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarK = q3Var;
                        if (c0VarR.D(q3VarK)) {
                        }
                        i12 |= i26;
                    } else {
                        q3VarK = q3Var;
                    }
                    i12 |= i26;
                } else {
                    q3VarK = q3Var;
                }
                if ((i10 & 1572864) == 0) {
                    ctVarQ = ctVar;
                    if ((i11 & 32) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    ctVarQ = ctVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                    fA = f10;
                } else {
                    fA = f10;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(fA)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function4)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function18 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function18;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            } else {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function19 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function19;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                            }
                            u80 u80Var6 = u80.f33535a;
                            long j18 = j12;
                            int i212 = i22 << 3;
                            h90.r(k90Var, a0Var4, function10, function9, u80Var6.b(j18), u80Var6.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i212 & 3670016) | (i212 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), (i22 >> 27) & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function9;
                            f12 = fG;
                            function7 = function10;
                            f13 = f14;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            q3Var2 = q3Var3;
                            j11 = j18;
                        } else {
                            c0VarR.u();
                            function7 = function5;
                            function8 = function6;
                            ctVar2 = ctVarQ;
                            q3Var2 = q3VarK;
                            f12 = f11;
                            f13 = fA;
                            a0Var3 = a0Var2;
                            j11 = jA;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function110 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function110;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function111 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function111;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var7 = u80.f33535a;
                        long j19 = j12;
                        int i213 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var7.b(j19), u80Var7.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i213 & 3670016) | (i213 & 29360128) | (i213 & 234881024) | (i213 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j19;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 256) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function112 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function112;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function113 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function113;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var8 = u80.f33535a;
                        long j110 = j12;
                        int i214 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var8.b(j110), u80Var8.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i214 & 3670016) | (i214 & 29360128) | (i214 & 234881024) | (i214 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j110;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function114 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function114;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function115 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function115;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var9 = u80.f33535a;
                    long j111 = j12;
                    int i215 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var9.b(j111), u80Var9.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i215 & 3670016) | (i215 & 29360128) | (i215 & 234881024) | (i215 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j111;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            function5 = function2;
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function6 = function3;
                    if (c0VarR.k0(function6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    jA = j10;
                    if ((i11 & 8) == 0) {
                        i24 = 8192;
                    } else {
                        i24 = 8192;
                    }
                    i12 |= i24;
                } else {
                    jA = j10;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarK = q3Var;
                        if (c0VarR.D(q3VarK)) {
                        }
                        i12 |= i26;
                    } else {
                        q3VarK = q3Var;
                    }
                    i12 |= i26;
                } else {
                    q3VarK = q3Var;
                }
                if ((i10 & 1572864) == 0) {
                    ctVarQ = ctVar;
                    if ((i11 & 32) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    ctVarQ = ctVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                    fA = f10;
                } else {
                    fA = f10;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(fA)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function4)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function116 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function116;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            } else {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function117 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function117;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                            }
                            u80 u80Var10 = u80.f33535a;
                            long j112 = j12;
                            int i216 = i22 << 3;
                            h90.r(k90Var, a0Var4, function10, function9, u80Var10.b(j112), u80Var10.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i216 & 3670016) | (i216 & 29360128) | (i216 & 234881024) | (i216 & 1879048192), (i22 >> 27) & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function9;
                            f12 = fG;
                            function7 = function10;
                            f13 = f14;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            q3Var2 = q3Var3;
                            j11 = j112;
                        } else {
                            c0VarR.u();
                            function7 = function5;
                            function8 = function6;
                            ctVar2 = ctVarQ;
                            q3Var2 = q3VarK;
                            f12 = f11;
                            f13 = fA;
                            a0Var3 = a0Var2;
                            j11 = jA;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function118 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function118;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function119 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function119;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var11 = u80.f33535a;
                        long j113 = j12;
                        int i217 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var11.b(j113), u80Var11.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i217 & 3670016) | (i217 & 29360128) | (i217 & 234881024) | (i217 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j113;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 256) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function1110 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function1110;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function1111 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function1111;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var12 = u80.f33535a;
                        long j114 = j12;
                        int i218 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var12.b(j114), u80Var12.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i218 & 3670016) | (i218 & 29360128) | (i218 & 234881024) | (i218 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j114;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1112 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1112;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1113 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1113;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var13 = u80.f33535a;
                    long j115 = j12;
                    int i219 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var13.b(j115), u80Var13.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i219 & 3670016) | (i219 & 29360128) | (i219 & 234881024) | (i219 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j115;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function6 = function3;
            if ((i10 & 24576) == 0) {
                jA = j10;
                if ((i11 & 8) == 0) {
                    i24 = 8192;
                } else {
                    i24 = 8192;
                }
                i12 |= i24;
            } else {
                jA = j10;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarK = q3Var;
                    if (c0VarR.D(q3VarK)) {
                    }
                    i12 |= i26;
                } else {
                    q3VarK = q3Var;
                }
                i12 |= i26;
            } else {
                q3VarK = q3Var;
            }
            if ((i10 & 1572864) == 0) {
                ctVarQ = ctVar;
                if ((i11 & 32) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            } else {
                ctVarQ = ctVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
                fA = f10;
            } else {
                fA = f10;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(fA)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function1114 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function1114;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function1115 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function1115;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var14 = u80.f33535a;
                        long j116 = j12;
                        int i2110 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var14.b(j116), u80Var14.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2110 & 3670016) | (i2110 & 29360128) | (i2110 & 234881024) | (i2110 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j116;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1116 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1116;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1117 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1117;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var15 = u80.f33535a;
                    long j117 = j12;
                    int i2111 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var15.b(j117), u80Var15.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2111 & 3670016) | (i2111 & 29360128) | (i2111 & 234881024) | (i2111 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j117;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 256) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function4)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1118 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1118;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1119 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1119;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var16 = u80.f33535a;
                    long j118 = j12;
                    int i2112 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var16.b(j118), u80Var16.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2112 & 3670016) | (i2112 & 29360128) | (i2112 & 234881024) | (i2112 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j118;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function11110 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function11110;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function11111 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function11111;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                }
                u80 u80Var17 = u80.f33535a;
                long j119 = j12;
                int i2113 = i22 << 3;
                h90.r(k90Var, a0Var4, function10, function9, u80Var17.b(j119), u80Var17.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2113 & 3670016) | (i2113 & 29360128) | (i2113 & 234881024) | (i2113 & 1879048192), (i22 >> 27) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function9;
                f12 = fG;
                function7 = function10;
                f13 = f14;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                q3Var2 = q3Var3;
                j11 = j119;
            } else {
                c0VarR.u();
                function7 = function5;
                function8 = function6;
                ctVar2 = ctVarQ;
                q3Var2 = q3VarK;
                f12 = f11;
                f13 = fA;
                a0Var3 = a0Var2;
                j11 = jA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 2;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function5 = function2;
                if (c0VarR.k0(function5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 4;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function6 = function3;
                    if (c0VarR.k0(function6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    jA = j10;
                    if ((i11 & 8) == 0) {
                        i24 = 8192;
                    } else {
                        i24 = 8192;
                    }
                    i12 |= i24;
                } else {
                    jA = j10;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarK = q3Var;
                        if (c0VarR.D(q3VarK)) {
                        }
                        i12 |= i26;
                    } else {
                        q3VarK = q3Var;
                    }
                    i12 |= i26;
                } else {
                    q3VarK = q3Var;
                }
                if ((i10 & 1572864) == 0) {
                    ctVarQ = ctVar;
                    if ((i11 & 32) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    ctVarQ = ctVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                    fA = f10;
                } else {
                    fA = f10;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(fA)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function4)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function11112 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function11112;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            } else {
                                if (i25 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                if (i15 != 0) {
                                    function6 = null;
                                }
                                if ((i11 & 8) != 0) {
                                    jA = androidx.compose.ui.unit.l.f42704b.a();
                                    i12 &= -57345;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -458753;
                                    q3VarK = u80.f33535a.k(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                                    i12 = (-3670017) & i12;
                                }
                                if (i17 != 0) {
                                    fA = d0.e0.f267938a.a();
                                }
                                if (i19 != 0) {
                                    Function2 function11113 = function6;
                                    fG = d0.e2.f267955a.g();
                                    i22 = i12;
                                    function9 = function11113;
                                    f14 = fA;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                } else {
                                    f14 = fA;
                                    i22 = i12;
                                    a0Var4 = a0Var2;
                                    function10 = function5;
                                    function9 = function6;
                                    ctVar3 = ctVarQ;
                                    j12 = jA;
                                    q3Var3 = q3VarK;
                                    fG = f11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                            }
                            u80 u80Var18 = u80.f33535a;
                            long j1110 = j12;
                            int i2114 = i22 << 3;
                            h90.r(k90Var, a0Var4, function10, function9, u80Var18.b(j1110), u80Var18.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2114 & 3670016) | (i2114 & 29360128) | (i2114 & 234881024) | (i2114 & 1879048192), (i22 >> 27) & 14, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function8 = function9;
                            f12 = fG;
                            function7 = function10;
                            f13 = f14;
                            a0Var3 = a0Var4;
                            ctVar2 = ctVar3;
                            q3Var2 = q3Var3;
                            j11 = j1110;
                        } else {
                            c0VarR.u();
                            function7 = function5;
                            function8 = function6;
                            ctVar2 = ctVarQ;
                            q3Var2 = q3VarK;
                            f12 = f11;
                            f13 = fA;
                            a0Var3 = a0Var2;
                            j11 = jA;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function11114 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function11114;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function11115 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function11115;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var19 = u80.f33535a;
                        long j1111 = j12;
                        int i2115 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var19.b(j1111), u80Var19.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2115 & 3670016) | (i2115 & 29360128) | (i2115 & 234881024) | (i2115 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j1111;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 256) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function11116 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function11116;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function11117 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function11117;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var110 = u80.f33535a;
                        long j1112 = j12;
                        int i2116 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var110.b(j1112), u80Var110.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2116 & 3670016) | (i2116 & 29360128) | (i2116 & 234881024) | (i2116 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j1112;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function11118 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function11118;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function11119 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function11119;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var111 = u80.f33535a;
                    long j1113 = j12;
                    int i2117 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var111.b(j1113), u80Var111.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2117 & 3670016) | (i2117 & 29360128) | (i2117 & 234881024) | (i2117 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j1113;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function6 = function3;
            if ((i10 & 24576) == 0) {
                jA = j10;
                if ((i11 & 8) == 0) {
                    i24 = 8192;
                } else {
                    i24 = 8192;
                }
                i12 |= i24;
            } else {
                jA = j10;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarK = q3Var;
                    if (c0VarR.D(q3VarK)) {
                    }
                    i12 |= i26;
                } else {
                    q3VarK = q3Var;
                }
                i12 |= i26;
            } else {
                q3VarK = q3Var;
            }
            if ((i10 & 1572864) == 0) {
                ctVarQ = ctVar;
                if ((i11 & 32) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            } else {
                ctVarQ = ctVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
                fA = f10;
            } else {
                fA = f10;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(fA)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function111110 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function111110;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function111111 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function111111;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var112 = u80.f33535a;
                        long j1114 = j12;
                        int i2118 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var112.b(j1114), u80Var112.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2118 & 3670016) | (i2118 & 29360128) | (i2118 & 234881024) | (i2118 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j1114;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function111112 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function111112;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function111113 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function111113;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var113 = u80.f33535a;
                    long j1115 = j12;
                    int i2119 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var113.b(j1115), u80Var113.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i2119 & 3670016) | (i2119 & 29360128) | (i2119 & 234881024) | (i2119 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j1115;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 256) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function4)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function111114 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function111114;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function111115 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function111115;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var114 = u80.f33535a;
                    long j1116 = j12;
                    int i21110 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var114.b(j1116), u80Var114.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21110 & 3670016) | (i21110 & 29360128) | (i21110 & 234881024) | (i21110 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j1116;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function111116 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function111116;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function111117 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function111117;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                }
                u80 u80Var115 = u80.f33535a;
                long j1117 = j12;
                int i21111 = i22 << 3;
                h90.r(k90Var, a0Var4, function10, function9, u80Var115.b(j1117), u80Var115.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21111 & 3670016) | (i21111 & 29360128) | (i21111 & 234881024) | (i21111 & 1879048192), (i22 >> 27) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function9;
                f12 = fG;
                function7 = function10;
                f13 = f14;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                q3Var2 = q3Var3;
                j11 = j1117;
            } else {
                c0VarR.u();
                function7 = function5;
                function8 = function6;
                ctVar2 = ctVarQ;
                q3Var2 = q3VarK;
                f12 = f11;
                f13 = fA;
                a0Var3 = a0Var2;
                j11 = jA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        function5 = function2;
        i15 = i11 & 4;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                function6 = function3;
                if (c0VarR.k0(function6)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                jA = j10;
                if ((i11 & 8) == 0) {
                    i24 = 8192;
                } else {
                    i24 = 8192;
                }
                i12 |= i24;
            } else {
                jA = j10;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarK = q3Var;
                    if (c0VarR.D(q3VarK)) {
                    }
                    i12 |= i26;
                } else {
                    q3VarK = q3Var;
                }
                i12 |= i26;
            } else {
                q3VarK = q3Var;
            }
            if ((i10 & 1572864) == 0) {
                ctVarQ = ctVar;
                if ((i11 & 32) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            } else {
                ctVarQ = ctVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
                fA = f10;
            } else {
                fA = f10;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(fA)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function111118 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function111118;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        } else {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if ((i11 & 8) != 0) {
                                jA = androidx.compose.ui.unit.l.f42704b.a();
                                i12 &= -57345;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -458753;
                                q3VarK = u80.f33535a.k(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                ctVarQ = u80.f33535a.q(c0VarR, 6);
                                i12 = (-3670017) & i12;
                            }
                            if (i17 != 0) {
                                fA = d0.e0.f267938a.a();
                            }
                            if (i19 != 0) {
                                Function2 function111119 = function6;
                                fG = d0.e2.f267955a.g();
                                i22 = i12;
                                function9 = function111119;
                                f14 = fA;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                            } else {
                                f14 = fA;
                                i22 = i12;
                                a0Var4 = a0Var2;
                                function10 = function5;
                                function9 = function6;
                                ctVar3 = ctVarQ;
                                j12 = jA;
                                q3Var3 = q3VarK;
                                fG = f11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                        }
                        u80 u80Var116 = u80.f33535a;
                        long j1118 = j12;
                        int i21112 = i22 << 3;
                        h90.r(k90Var, a0Var4, function10, function9, u80Var116.b(j1118), u80Var116.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21112 & 3670016) | (i21112 & 29360128) | (i21112 & 234881024) | (i21112 & 1879048192), (i22 >> 27) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function8 = function9;
                        f12 = fG;
                        function7 = function10;
                        f13 = f14;
                        a0Var3 = a0Var4;
                        ctVar2 = ctVar3;
                        q3Var2 = q3Var3;
                        j11 = j1118;
                    } else {
                        c0VarR.u();
                        function7 = function5;
                        function8 = function6;
                        ctVar2 = ctVarQ;
                        q3Var2 = q3VarK;
                        f12 = f11;
                        f13 = fA;
                        a0Var3 = a0Var2;
                        j11 = jA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1111110 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1111110;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1111111 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1111111;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var117 = u80.f33535a;
                    long j1119 = j12;
                    int i21113 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var117.b(j1119), u80Var117.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21113 & 3670016) | (i21113 & 29360128) | (i21113 & 234881024) | (i21113 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j1119;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 256) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function4)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1111112 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1111112;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1111113 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1111113;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var118 = u80.f33535a;
                    long j11110 = j12;
                    int i21114 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var118.b(j11110), u80Var118.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21114 & 3670016) | (i21114 & 29360128) | (i21114 & 234881024) | (i21114 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j11110;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function1111114 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function1111114;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function1111115 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function1111115;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                }
                u80 u80Var119 = u80.f33535a;
                long j11111 = j12;
                int i21115 = i22 << 3;
                h90.r(k90Var, a0Var4, function10, function9, u80Var119.b(j11111), u80Var119.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21115 & 3670016) | (i21115 & 29360128) | (i21115 & 234881024) | (i21115 & 1879048192), (i22 >> 27) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function9;
                f12 = fG;
                function7 = function10;
                f13 = f14;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                q3Var2 = q3Var3;
                j11 = j11111;
            } else {
                c0VarR.u();
                function7 = function5;
                function8 = function6;
                ctVar2 = ctVarQ;
                q3Var2 = q3VarK;
                f12 = f11;
                f13 = fA;
                a0Var3 = a0Var2;
                j11 = jA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function6 = function3;
        if ((i10 & 24576) == 0) {
            jA = j10;
            if ((i11 & 8) == 0) {
                i24 = 8192;
            } else {
                i24 = 8192;
            }
            i12 |= i24;
        } else {
            jA = j10;
        }
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if ((i11 & 16) == 0) {
                q3VarK = q3Var;
                if (c0VarR.D(q3VarK)) {
                }
                i12 |= i26;
            } else {
                q3VarK = q3Var;
            }
            i12 |= i26;
        } else {
            q3VarK = q3Var;
        }
        if ((i10 & 1572864) == 0) {
            ctVarQ = ctVar;
            if ((i11 & 32) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        } else {
            ctVarQ = ctVar;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 12582912;
            fA = f10;
        } else {
            fA = f10;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.I(fA)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function4)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1111116 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1111116;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if ((i11 & 8) != 0) {
                            jA = androidx.compose.ui.unit.l.f42704b.a();
                            i12 &= -57345;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -458753;
                            q3VarK = u80.f33535a.k(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            ctVarQ = u80.f33535a.q(c0VarR, 6);
                            i12 = (-3670017) & i12;
                        }
                        if (i17 != 0) {
                            fA = d0.e0.f267938a.a();
                        }
                        if (i19 != 0) {
                            Function2 function1111117 = function6;
                            fG = d0.e2.f267955a.g();
                            i22 = i12;
                            function9 = function1111117;
                            f14 = fA;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                        } else {
                            f14 = fA;
                            i22 = i12;
                            a0Var4 = a0Var2;
                            function10 = function5;
                            function9 = function6;
                            ctVar3 = ctVarQ;
                            j12 = jA;
                            q3Var3 = q3VarK;
                            fG = f11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                    }
                    u80 u80Var1110 = u80.f33535a;
                    long j11112 = j12;
                    int i21116 = i22 << 3;
                    h90.r(k90Var, a0Var4, function10, function9, u80Var1110.b(j11112), u80Var1110.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21116 & 3670016) | (i21116 & 29360128) | (i21116 & 234881024) | (i21116 & 1879048192), (i22 >> 27) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function8 = function9;
                    f12 = fG;
                    function7 = function10;
                    f13 = f14;
                    a0Var3 = a0Var4;
                    ctVar2 = ctVar3;
                    q3Var2 = q3Var3;
                    j11 = j11112;
                } else {
                    c0VarR.u();
                    function7 = function5;
                    function8 = function6;
                    ctVar2 = ctVarQ;
                    q3Var2 = q3VarK;
                    f12 = f11;
                    f13 = fA;
                    a0Var3 = a0Var2;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function1111118 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function1111118;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function1111119 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function1111119;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                }
                u80 u80Var1111 = u80.f33535a;
                long j11113 = j12;
                int i21117 = i22 << 3;
                h90.r(k90Var, a0Var4, function10, function9, u80Var1111.b(j11113), u80Var1111.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21117 & 3670016) | (i21117 & 29360128) | (i21117 & 234881024) | (i21117 & 1879048192), (i22 >> 27) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function9;
                f12 = fG;
                function7 = function10;
                f13 = f14;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                q3Var2 = q3Var3;
                j11 = j11113;
            } else {
                c0VarR.u();
                function7 = function5;
                function8 = function6;
                ctVar2 = ctVarQ;
                q3Var2 = q3VarK;
                f12 = f11;
                f13 = fA;
                a0Var3 = a0Var2;
                j11 = jA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i11 & 256) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function4)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function11111110 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function11111110;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if ((i11 & 8) != 0) {
                        jA = androidx.compose.ui.unit.l.f42704b.a();
                        i12 &= -57345;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -458753;
                        q3VarK = u80.f33535a.k(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        ctVarQ = u80.f33535a.q(c0VarR, 6);
                        i12 = (-3670017) & i12;
                    }
                    if (i17 != 0) {
                        fA = d0.e0.f267938a.a();
                    }
                    if (i19 != 0) {
                        Function2 function11111111 = function6;
                        fG = d0.e2.f267955a.g();
                        i22 = i12;
                        function9 = function11111111;
                        f14 = fA;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                    } else {
                        f14 = fA;
                        i22 = i12;
                        a0Var4 = a0Var2;
                        function10 = function5;
                        function9 = function6;
                        ctVar3 = ctVarQ;
                        j12 = jA;
                        q3Var3 = q3VarK;
                        fG = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                }
                u80 u80Var1112 = u80.f33535a;
                long j11114 = j12;
                int i21118 = i22 << 3;
                h90.r(k90Var, a0Var4, function10, function9, u80Var1112.b(j11114), u80Var1112.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21118 & 3670016) | (i21118 & 29360128) | (i21118 & 234881024) | (i21118 & 1879048192), (i22 >> 27) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function8 = function9;
                f12 = fG;
                function7 = function10;
                f13 = f14;
                a0Var3 = a0Var4;
                ctVar2 = ctVar3;
                q3Var2 = q3Var3;
                j11 = j11114;
            } else {
                c0VarR.u();
                function7 = function5;
                function8 = function6;
                ctVar2 = ctVarQ;
                q3Var2 = q3VarK;
                f12 = f11;
                f13 = fA;
                a0Var3 = a0Var2;
                j11 = jA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 805306368;
        if ((i12 & 306783379) != 306783378) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    function6 = null;
                }
                if ((i11 & 8) != 0) {
                    jA = androidx.compose.ui.unit.l.f42704b.a();
                    i12 &= -57345;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -458753;
                    q3VarK = u80.f33535a.k(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                    i12 = (-3670017) & i12;
                }
                if (i17 != 0) {
                    fA = d0.e0.f267938a.a();
                }
                if (i19 != 0) {
                    Function2 function11111112 = function6;
                    fG = d0.e2.f267955a.g();
                    i22 = i12;
                    function9 = function11111112;
                    f14 = fA;
                    a0Var4 = a0Var2;
                    function10 = function5;
                    ctVar3 = ctVarQ;
                    j12 = jA;
                    q3Var3 = q3VarK;
                } else {
                    f14 = fA;
                    i22 = i12;
                    a0Var4 = a0Var2;
                    function10 = function5;
                    function9 = function6;
                    ctVar3 = ctVarQ;
                    j12 = jA;
                    q3Var3 = q3VarK;
                    fG = f11;
                }
            } else {
                if (i25 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    function6 = null;
                }
                if ((i11 & 8) != 0) {
                    jA = androidx.compose.ui.unit.l.f42704b.a();
                    i12 &= -57345;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -458753;
                    q3VarK = u80.f33535a.k(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    ctVarQ = u80.f33535a.q(c0VarR, 6);
                    i12 = (-3670017) & i12;
                }
                if (i17 != 0) {
                    fA = d0.e0.f267938a.a();
                }
                if (i19 != 0) {
                    Function2 function11111113 = function6;
                    fG = d0.e2.f267955a.g();
                    i22 = i12;
                    function9 = function11111113;
                    f14 = fA;
                    a0Var4 = a0Var2;
                    function10 = function5;
                    ctVar3 = ctVarQ;
                    j12 = jA;
                    q3Var3 = q3VarK;
                } else {
                    f14 = fA;
                    i22 = i12;
                    a0Var4 = a0Var2;
                    function10 = function5;
                    function9 = function6;
                    ctVar3 = ctVarQ;
                    j12 = jA;
                    q3Var3 = q3VarK;
                    fG = f11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-244908363, i22, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
            }
            u80 u80Var1113 = u80.f33535a;
            long j11115 = j12;
            int i21119 = i22 << 3;
            h90.r(k90Var, a0Var4, function10, function9, u80Var1113.b(j11115), u80Var1113.l(), q3Var3, ctVar3, f14, fG, function4, c0VarR, (i22 & 14) | androidx.profileinstaller.n.c.f73814m | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21119 & 3670016) | (i21119 & 29360128) | (i21119 & 234881024) | (i21119 & 1879048192), (i22 >> 27) & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function8 = function9;
            f12 = fG;
            function7 = function10;
            f13 = f14;
            a0Var3 = a0Var4;
            ctVar2 = ctVar3;
            q3Var2 = q3Var3;
            j11 = j11115;
        } else {
            c0VarR.u();
            function7 = function5;
            function8 = function6;
            ctVar2 = ctVarQ;
            q3Var2 = q3VarK;
            f12 = f11;
            f13 = fA;
            a0Var3 = a0Var2;
            j11 = jA;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.q90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t90.l(k90Var, a0Var3, function7, function8, j11, q3Var2, ctVar2, f13, f12, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(k90 k90Var, androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, long j10, float f10, androidx.compose.ui.graphics.q3 q3Var, ct ctVar, float f11, float f12, Function2 function4, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        i(k90Var, a0Var, function2, function3, j10, f10, q3Var, ctVar, f11, f12, function4, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(k90 k90Var, androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, long j10, androidx.compose.ui.graphics.q3 q3Var, ct ctVar, float f10, float f11, Function2 function4, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(k90Var, a0Var, function2, function3, j10, q3Var, ctVar, f10, f11, function4, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
