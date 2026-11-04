package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nShortNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortNavigationBar.kt\nandroidx/compose/material3/ShortNavigationBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,541:1\n75#2:542\n1282#3,6:543\n52#4,9:549\n52#4,9:558\n52#4,9:567\n113#5:576\n*S KotlinDebug\n*F\n+ 1 ShortNavigationBar.kt\nandroidx/compose/material3/ShortNavigationBarKt\n*L\n103#1:542\n222#1:543,6\n524#1:549,9\n528#1:558,9\n532#1:567,9\n535#1:576\n*E\n"})
public final class dy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<ey> f27164a = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material3.cy
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return dy.d();
        }
    }, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f27165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f27166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f27167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f27168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f27169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f27170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f27171h;

    static {
        d0.l1 l1Var = d0.l1.f268418a;
        f27165b = l1Var.c();
        float f10 = 2;
        f27166c = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(l1Var.a() - l1Var.d()) / f10);
        f27167d = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(l1Var.b() - l1Var.d()) / f10);
        d0.j1 j1Var = d0.j1.f268308a;
        f27168e = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(j1Var.a() - j1Var.d()) / f10);
        f27169f = androidx.compose.ui.unit.h.r(4);
        f27170g = j1Var.b();
        f27171h = d0.k1.f268357a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ey d() {
        return gc.f27944a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:108:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x0151  */
    /* JADX WARN: Code duplicated, block: B:115:0x0171  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:120:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:99:0x0110  */
    @androidx.compose.runtime.o
    public static final void e(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable androidx.compose.foundation.layout.v6 v6Var, int i10, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        long jB;
        long jC;
        androidx.compose.foundation.layout.v6 v6VarD;
        int i14;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final androidx.compose.foundation.layout.v6 v6Var2;
        final int i15;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int iA;
        long j14;
        androidx.compose.foundation.layout.v6 v6Var3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(552087412);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                jB = j10;
                int i17 = c0VarR.L(jB) ? 32 : 16;
                i13 |= i17;
            } else {
                jB = j10;
            }
            i13 |= i17;
        } else {
            jB = j10;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                jC = j11;
                int i18 = c0VarR.L(jC) ? 256 : 128;
                i13 |= i18;
            } else {
                jC = j11;
            }
            i13 |= i18;
        } else {
            jC = j11;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                v6VarD = v6Var;
                int i19 = c0VarR.D(v6VarD) ? 2048 : 1024;
                i13 |= i19;
            } else {
                v6VarD = v6Var;
            }
            i13 |= i19;
        } else {
            v6VarD = v6Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                i14 = i10;
                int i20 = c0VarR.K(i14) ? 16384 : 8192;
                i13 |= i20;
            } else {
                i14 = i10;
            }
            i13 |= i20;
        } else {
            i14 = i10;
        }
        if ((i12 & 32) == 0) {
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                function3 = function2;
                i13 |= c0VarR.k0(function3) ? 131072 : 65536;
            }
            if ((74899 & i13) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0 || c0VarR.y()) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jB = xx.f34590a.b(c0VarR, 6);
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        jC = xx.f34590a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        v6VarD = xx.f34590a.d(c0VarR, 6);
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        a0Var3 = a0Var4;
                        iA = xx.f34590a.a();
                        j14 = jC;
                        v6Var3 = v6VarD;
                    } else {
                        a0Var3 = a0Var4;
                    }
                    long j15 = jB;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(552087412, i13, -1, "androidx.compose.material3.ShortNavigationBar (ShortNavigationBar.kt:101)");
                    }
                    ((ey) c0VarR.W(f27164a)).a(new fy(a0Var3, j15, j14, v6Var3, iA, function3, null), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j15;
                    j13 = j14;
                    v6Var2 = v6Var3;
                    i15 = iA;
                } else {
                    c0VarR.u();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                    a0Var3 = a0Var2;
                }
                j14 = jC;
                v6Var3 = v6VarD;
                iA = i14;
                long j16 = jB;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(552087412, i13, -1, "androidx.compose.material3.ShortNavigationBar (ShortNavigationBar.kt:101)");
                }
                ((ey) c0VarR.W(f27164a)).a(new fy(a0Var3, j16, j14, v6Var3, iA, function3, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j16;
                j13 = j14;
                v6Var2 = v6Var3;
                i15 = iA;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = jB;
                j13 = jC;
                v6Var2 = v6VarD;
                i15 = i14;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.zx
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return dy.h(a0Var5, j12, j13, v6Var2, i15, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        function3 = function2;
        if ((74899 & i13) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jB = xx.f34590a.b(c0VarR, 6);
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    jC = xx.f34590a.c(c0VarR, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    v6VarD = xx.f34590a.d(c0VarR, 6);
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    a0Var3 = a0Var4;
                    iA = xx.f34590a.a();
                    j14 = jC;
                    v6Var3 = v6VarD;
                } else {
                    a0Var3 = a0Var4;
                    j14 = jC;
                    v6Var3 = v6VarD;
                    iA = i14;
                }
            } else {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jB = xx.f34590a.b(c0VarR, 6);
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    jC = xx.f34590a.c(c0VarR, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    v6VarD = xx.f34590a.d(c0VarR, 6);
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    a0Var3 = a0Var4;
                    iA = xx.f34590a.a();
                    j14 = jC;
                    v6Var3 = v6VarD;
                } else {
                    a0Var3 = a0Var4;
                    j14 = jC;
                    v6Var3 = v6VarD;
                    iA = i14;
                }
            }
            long j17 = jB;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(552087412, i13, -1, "androidx.compose.material3.ShortNavigationBar (ShortNavigationBar.kt:101)");
            }
            ((ey) c0VarR.W(f27164a)).a(new fy(a0Var3, j17, j14, v6Var3, iA, function3, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = j17;
            j13 = j14;
            v6Var2 = v6Var3;
            i15 = iA;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = jB;
            j13 = jC;
            v6Var2 = v6VarD;
            i15 = i14;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var6 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.zx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return dy.h(a0Var6, j12, j13, v6Var2, i15, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x016f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0175  */
    /* JADX WARN: Code duplicated, block: B:119:0x0179  */
    /* JADX WARN: Code duplicated, block: B:122:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x018f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0195  */
    /* JADX WARN: Code duplicated, block: B:126:0x0197  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:147:0x0252  */
    /* JADX WARN: Code duplicated, block: B:149:0x025f  */
    /* JADX WARN: Code duplicated, block: B:152:0x026f  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void f(final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, int i10, @Nullable vo voVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        boolean z12;
        int i13;
        Function0<Unit> function1;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final androidx.compose.ui.a0 a0Var2;
        int i14;
        boolean z13;
        int i15;
        int i16;
        int iB;
        int i17;
        vo voVarA;
        int i18;
        int i19;
        int i20;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final boolean z15;
        final int i21;
        final vo voVar2;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        int i22;
        androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.ui.a0 a0Var3;
        boolean z16;
        vo voVar3;
        androidx.compose.foundation.interaction.j jVar4;
        boolean zF;
        float f10;
        float f11;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1164996656);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i11 & 6) == 0) {
                i13 = (c0VarR.G(z12) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i11 & 48) == 0) {
                i13 |= c0VarR.k0(function1) ? 32 : 16;
            }
        }
        if ((i12 & 4) != 0) {
            i13 |= androidx.media3.exoplayer.a5.S0;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                i13 |= c0VarR.k0(function4) ? 256 : 128;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
            function5 = function3;
        } else {
            function5 = function3;
            if ((i11 & 3072) == 0) {
                i13 |= c0VarR.k0(function5) ? 2048 : 1024;
            }
        }
        int i23 = i12 & 16;
        if (i23 == 0) {
            if ((i11 & 24576) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 16384 : 8192;
            }
            i14 = i12 & 32;
            if (i14 != 0) {
                if ((196608 & i11) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 64;
                if (i16 != 0) {
                    if ((1572864 & i11) == 0) {
                        iB = i10;
                        if (c0VarR.K(iB)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i13 |= i17;
                    }
                    if ((12582912 & i11) == 0) {
                        if ((i12 & 128) == 0) {
                            voVarA = voVar;
                            int i24 = c0VarR.D(voVarA) ? 8388608 : 4194304;
                            i13 |= i24;
                        } else {
                            voVarA = voVar;
                        }
                        i13 |= i24;
                    } else {
                        voVarA = voVar;
                    }
                    i18 = i12 & 256;
                    if (i18 != 0) {
                        if ((i11 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i19;
                        }
                        i20 = i13;
                        if ((i13 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i20 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0 || c0VarR.y()) {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i14 != 0) {
                                    z13 = true;
                                }
                                if (i16 != 0) {
                                    iB = wo.f34270b.b();
                                }
                                if ((i12 & 128) != 0) {
                                    i22 = i20 & (-29360129);
                                    voVarA = yx.f34867a.a(c0VarR, 6);
                                } else {
                                    i22 = i20;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                c0VarR.u();
                                if ((i12 & 128) != 0) {
                                    i22 = i20 & (-29360129);
                                    a0Var3 = a0Var2;
                                    z16 = z13;
                                    voVar3 = voVarA;
                                    jVar3 = jVar;
                                } else {
                                    jVar3 = jVar;
                                    i22 = i20;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                                }
                                if (jVar3 == null) {
                                    c0VarR.E(1215858123);
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = androidx.compose.foundation.interaction.i.a();
                                        c0VarR.Y(objI0);
                                    }
                                    c0VarR.A();
                                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                                } else {
                                    c0VarR.E(1424693900);
                                    c0VarR.A();
                                    jVar4 = jVar3;
                                }
                                zF = wo.f(iB, wo.f34270b.b());
                                if (zF) {
                                    f10 = f27167d;
                                } else {
                                    f10 = f27170g;
                                }
                                float f12 = f10;
                                if (zF) {
                                    f11 = f27166c;
                                } else {
                                    f11 = f27168e;
                                }
                                float f13 = f11;
                                d0.k1 k1Var = d0.k1.f268357a;
                                int i25 = i22 >> 6;
                                c0Var2 = c0VarR;
                                int i26 = iB;
                                qp.K(z12, function1, function4, la0.e(k1Var.l(), c0VarR, 6), cx.i(k1Var.g(), c0VarR, 6), d0.l1.f268418a.b(), f12, f13, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i26, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar2 = jVar3;
                                voVar2 = voVar3;
                                a0Var2 = a0Var3;
                                z15 = z16;
                                i21 = i26;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                            }
                            if (jVar3 == null) {
                                c0VarR.E(1215858123);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                c0VarR.E(1424693900);
                                c0VarR.A();
                                jVar4 = jVar3;
                            }
                            zF = wo.f(iB, wo.f34270b.b());
                            if (zF) {
                                f10 = f27167d;
                            } else {
                                f10 = f27170g;
                            }
                            float f14 = f10;
                            if (zF) {
                                f11 = f27166c;
                            } else {
                                f11 = f27168e;
                            }
                            float f15 = f11;
                            d0.k1 k1Var2 = d0.k1.f268357a;
                            int i27 = i22 >> 6;
                            c0Var2 = c0VarR;
                            int i28 = iB;
                            qp.K(z12, function1, function4, la0.e(k1Var2.l(), c0VarR, 6), cx.i(k1Var2.g(), c0VarR, 6), d0.l1.f268418a.b(), f14, f15, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i28, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | (i27 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar3;
                            voVar2 = voVar3;
                            a0Var2 = a0Var3;
                            z15 = z16;
                            i21 = i28;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            z15 = z13;
                            i21 = iB;
                            voVar2 = voVarA;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i20 = i13;
                    if ((i13 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                iB = wo.f34270b.b();
                            }
                            if ((i12 & 128) != 0) {
                                i22 = i20 & (-29360129);
                                voVarA = yx.f34867a.a(c0VarR, 6);
                            } else {
                                i22 = i20;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                iB = wo.f34270b.b();
                            }
                            if ((i12 & 128) != 0) {
                                i22 = i20 & (-29360129);
                                voVarA = yx.f34867a.a(c0VarR, 6);
                            } else {
                                i22 = i20;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(1215858123);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(1424693900);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        zF = wo.f(iB, wo.f34270b.b());
                        if (zF) {
                            f10 = f27167d;
                        } else {
                            f10 = f27170g;
                        }
                        float f16 = f10;
                        if (zF) {
                            f11 = f27166c;
                        } else {
                            f11 = f27168e;
                        }
                        float f17 = f11;
                        d0.k1 k1Var3 = d0.k1.f268357a;
                        int i29 = i22 >> 6;
                        c0Var2 = c0VarR;
                        int i210 = iB;
                        qp.K(z12, function1, function4, la0.e(k1Var3.l(), c0VarR, 6), cx.i(k1Var3.g(), c0VarR, 6), d0.l1.f268418a.b(), f16, f17, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i210, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i29 & 896) | (i29 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar3;
                        a0Var2 = a0Var3;
                        z15 = z16;
                        i21 = i210;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z13;
                        i21 = iB;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 1572864;
                iB = i10;
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                        }
                        i13 |= i24;
                    } else {
                        voVarA = voVar;
                    }
                    i13 |= i24;
                } else {
                    voVarA = voVar;
                }
                i18 = i12 & 256;
                if (i18 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i19;
                    }
                    i20 = i13;
                    if ((i13 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                iB = wo.f34270b.b();
                            }
                            if ((i12 & 128) != 0) {
                                i22 = i20 & (-29360129);
                                voVarA = yx.f34867a.a(c0VarR, 6);
                            } else {
                                i22 = i20;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                iB = wo.f34270b.b();
                            }
                            if ((i12 & 128) != 0) {
                                i22 = i20 & (-29360129);
                                voVarA = yx.f34867a.a(c0VarR, 6);
                            } else {
                                i22 = i20;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(1215858123);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(1424693900);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        zF = wo.f(iB, wo.f34270b.b());
                        if (zF) {
                            f10 = f27167d;
                        } else {
                            f10 = f27170g;
                        }
                        float f18 = f10;
                        if (zF) {
                            f11 = f27166c;
                        } else {
                            f11 = f27168e;
                        }
                        float f19 = f11;
                        d0.k1 k1Var4 = d0.k1.f268357a;
                        int i211 = i22 >> 6;
                        c0Var2 = c0VarR;
                        int i212 = iB;
                        qp.K(z12, function1, function4, la0.e(k1Var4.l(), c0VarR, 6), cx.i(k1Var4.g(), c0VarR, 6), d0.l1.f268418a.b(), f18, f19, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i212, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i211 & 896) | (i211 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar3;
                        a0Var2 = a0Var3;
                        z15 = z16;
                        i21 = i212;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z13;
                        i21 = iB;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i20 = i13;
                if ((i13 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(1215858123);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(1424693900);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    zF = wo.f(iB, wo.f34270b.b());
                    if (zF) {
                        f10 = f27167d;
                    } else {
                        f10 = f27170g;
                    }
                    float f110 = f10;
                    if (zF) {
                        f11 = f27166c;
                    } else {
                        f11 = f27168e;
                    }
                    float f111 = f11;
                    d0.k1 k1Var5 = d0.k1.f268357a;
                    int i213 = i22 >> 6;
                    c0Var2 = c0VarR;
                    int i214 = iB;
                    qp.K(z12, function1, function4, la0.e(k1Var5.l(), c0VarR, 6), cx.i(k1Var5.g(), c0VarR, 6), d0.l1.f268418a.b(), f110, f111, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i214, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i213 & 896) | (i213 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar3;
                    a0Var2 = a0Var3;
                    z15 = z16;
                    i21 = i214;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z13;
                    i21 = iB;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            i16 = i12 & 64;
            if (i16 != 0) {
                if ((1572864 & i11) == 0) {
                    iB = i10;
                    if (c0VarR.K(iB)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                }
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                        }
                        i13 |= i24;
                    } else {
                        voVarA = voVar;
                    }
                    i13 |= i24;
                } else {
                    voVarA = voVar;
                }
                i18 = i12 & 256;
                if (i18 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i19;
                    }
                    i20 = i13;
                    if ((i13 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                iB = wo.f34270b.b();
                            }
                            if ((i12 & 128) != 0) {
                                i22 = i20 & (-29360129);
                                voVarA = yx.f34867a.a(c0VarR, 6);
                            } else {
                                i22 = i20;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                iB = wo.f34270b.b();
                            }
                            if ((i12 & 128) != 0) {
                                i22 = i20 & (-29360129);
                                voVarA = yx.f34867a.a(c0VarR, 6);
                            } else {
                                i22 = i20;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(1215858123);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(1424693900);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        zF = wo.f(iB, wo.f34270b.b());
                        if (zF) {
                            f10 = f27167d;
                        } else {
                            f10 = f27170g;
                        }
                        float f112 = f10;
                        if (zF) {
                            f11 = f27166c;
                        } else {
                            f11 = f27168e;
                        }
                        float f113 = f11;
                        d0.k1 k1Var6 = d0.k1.f268357a;
                        int i215 = i22 >> 6;
                        c0Var2 = c0VarR;
                        int i216 = iB;
                        qp.K(z12, function1, function4, la0.e(k1Var6.l(), c0VarR, 6), cx.i(k1Var6.g(), c0VarR, 6), d0.l1.f268418a.b(), f112, f113, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i216, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i215 & 896) | (i215 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar3;
                        a0Var2 = a0Var3;
                        z15 = z16;
                        i21 = i216;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z13;
                        i21 = iB;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i20 = i13;
                if ((i13 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(1215858123);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(1424693900);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    zF = wo.f(iB, wo.f34270b.b());
                    if (zF) {
                        f10 = f27167d;
                    } else {
                        f10 = f27170g;
                    }
                    float f114 = f10;
                    if (zF) {
                        f11 = f27166c;
                    } else {
                        f11 = f27168e;
                    }
                    float f115 = f11;
                    d0.k1 k1Var7 = d0.k1.f268357a;
                    int i217 = i22 >> 6;
                    c0Var2 = c0VarR;
                    int i218 = iB;
                    qp.K(z12, function1, function4, la0.e(k1Var7.l(), c0VarR, 6), cx.i(k1Var7.g(), c0VarR, 6), d0.l1.f268418a.b(), f114, f115, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i218, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i217 & 896) | (i217 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar3;
                    a0Var2 = a0Var3;
                    z15 = z16;
                    i21 = i218;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z13;
                    i21 = iB;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            iB = i10;
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    voVarA = voVar;
                    if (c0VarR.D(voVarA)) {
                    }
                    i13 |= i24;
                } else {
                    voVarA = voVar;
                }
                i13 |= i24;
            } else {
                voVarA = voVar;
            }
            i18 = i12 & 256;
            if (i18 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i19;
                }
                i20 = i13;
                if ((i13 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(1215858123);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(1424693900);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    zF = wo.f(iB, wo.f34270b.b());
                    if (zF) {
                        f10 = f27167d;
                    } else {
                        f10 = f27170g;
                    }
                    float f116 = f10;
                    if (zF) {
                        f11 = f27166c;
                    } else {
                        f11 = f27168e;
                    }
                    float f117 = f11;
                    d0.k1 k1Var8 = d0.k1.f268357a;
                    int i219 = i22 >> 6;
                    c0Var2 = c0VarR;
                    int i2110 = iB;
                    qp.K(z12, function1, function4, la0.e(k1Var8.l(), c0VarR, 6), cx.i(k1Var8.g(), c0VarR, 6), d0.l1.f268418a.b(), f116, f117, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i2110, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i219 & 896) | (i219 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar3;
                    a0Var2 = a0Var3;
                    z15 = z16;
                    i21 = i2110;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z13;
                    i21 = iB;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i20 = i13;
            if ((i13 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        iB = wo.f34270b.b();
                    }
                    if ((i12 & 128) != 0) {
                        i22 = i20 & (-29360129);
                        voVarA = yx.f34867a.a(c0VarR, 6);
                    } else {
                        i22 = i20;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    a0Var3 = a0Var2;
                    z16 = z13;
                    voVar3 = voVarA;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        iB = wo.f34270b.b();
                    }
                    if ((i12 & 128) != 0) {
                        i22 = i20 & (-29360129);
                        voVarA = yx.f34867a.a(c0VarR, 6);
                    } else {
                        i22 = i20;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    a0Var3 = a0Var2;
                    z16 = z13;
                    voVar3 = voVarA;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                }
                if (jVar3 == null) {
                    c0VarR.E(1215858123);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(1424693900);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                zF = wo.f(iB, wo.f34270b.b());
                if (zF) {
                    f10 = f27167d;
                } else {
                    f10 = f27170g;
                }
                float f118 = f10;
                if (zF) {
                    f11 = f27166c;
                } else {
                    f11 = f27168e;
                }
                float f119 = f11;
                d0.k1 k1Var9 = d0.k1.f268357a;
                int i2111 = i22 >> 6;
                c0Var2 = c0VarR;
                int i2112 = iB;
                qp.K(z12, function1, function4, la0.e(k1Var9.l(), c0VarR, 6), cx.i(k1Var9.g(), c0VarR, 6), d0.l1.f268418a.b(), f118, f119, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i2112, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i2111 & 896) | (i2111 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar3;
                a0Var2 = a0Var3;
                z15 = z16;
                i21 = i2112;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z13;
                i21 = iB;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        a0Var2 = a0Var;
        i14 = i12 & 32;
        if (i14 != 0) {
            if ((196608 & i11) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i13 |= i15;
            }
            i16 = i12 & 64;
            if (i16 != 0) {
                if ((1572864 & i11) == 0) {
                    iB = i10;
                    if (c0VarR.K(iB)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                }
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        voVarA = voVar;
                        if (c0VarR.D(voVarA)) {
                        }
                        i13 |= i24;
                    } else {
                        voVarA = voVar;
                    }
                    i13 |= i24;
                } else {
                    voVarA = voVar;
                }
                i18 = i12 & 256;
                if (i18 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i19;
                    }
                    i20 = i13;
                    if ((i13 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                iB = wo.f34270b.b();
                            }
                            if ((i12 & 128) != 0) {
                                i22 = i20 & (-29360129);
                                voVarA = yx.f34867a.a(c0VarR, 6);
                            } else {
                                i22 = i20;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                iB = wo.f34270b.b();
                            }
                            if ((i12 & 128) != 0) {
                                i22 = i20 & (-29360129);
                                voVarA = yx.f34867a.a(c0VarR, 6);
                            } else {
                                i22 = i20;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            a0Var3 = a0Var2;
                            z16 = z13;
                            voVar3 = voVarA;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(1215858123);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(1424693900);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        zF = wo.f(iB, wo.f34270b.b());
                        if (zF) {
                            f10 = f27167d;
                        } else {
                            f10 = f27170g;
                        }
                        float f1110 = f10;
                        if (zF) {
                            f11 = f27166c;
                        } else {
                            f11 = f27168e;
                        }
                        float f1111 = f11;
                        d0.k1 k1Var10 = d0.k1.f268357a;
                        int i2113 = i22 >> 6;
                        c0Var2 = c0VarR;
                        int i2114 = iB;
                        qp.K(z12, function1, function4, la0.e(k1Var10.l(), c0VarR, 6), cx.i(k1Var10.g(), c0VarR, 6), d0.l1.f268418a.b(), f1110, f1111, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i2114, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i2113 & 896) | (i2113 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar3;
                        voVar2 = voVar3;
                        a0Var2 = a0Var3;
                        z15 = z16;
                        i21 = i2114;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z13;
                        i21 = iB;
                        voVar2 = voVarA;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i20 = i13;
                if ((i13 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(1215858123);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(1424693900);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    zF = wo.f(iB, wo.f34270b.b());
                    if (zF) {
                        f10 = f27167d;
                    } else {
                        f10 = f27170g;
                    }
                    float f1112 = f10;
                    if (zF) {
                        f11 = f27166c;
                    } else {
                        f11 = f27168e;
                    }
                    float f1113 = f11;
                    d0.k1 k1Var11 = d0.k1.f268357a;
                    int i2115 = i22 >> 6;
                    c0Var2 = c0VarR;
                    int i2116 = iB;
                    qp.K(z12, function1, function4, la0.e(k1Var11.l(), c0VarR, 6), cx.i(k1Var11.g(), c0VarR, 6), d0.l1.f268418a.b(), f1112, f1113, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i2116, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i2115 & 896) | (i2115 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar3;
                    a0Var2 = a0Var3;
                    z15 = z16;
                    i21 = i2116;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z13;
                    i21 = iB;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 1572864;
            iB = i10;
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    voVarA = voVar;
                    if (c0VarR.D(voVarA)) {
                    }
                    i13 |= i24;
                } else {
                    voVarA = voVar;
                }
                i13 |= i24;
            } else {
                voVarA = voVar;
            }
            i18 = i12 & 256;
            if (i18 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i19;
                }
                i20 = i13;
                if ((i13 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(1215858123);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(1424693900);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    zF = wo.f(iB, wo.f34270b.b());
                    if (zF) {
                        f10 = f27167d;
                    } else {
                        f10 = f27170g;
                    }
                    float f1114 = f10;
                    if (zF) {
                        f11 = f27166c;
                    } else {
                        f11 = f27168e;
                    }
                    float f1115 = f11;
                    d0.k1 k1Var12 = d0.k1.f268357a;
                    int i2117 = i22 >> 6;
                    c0Var2 = c0VarR;
                    int i2118 = iB;
                    qp.K(z12, function1, function4, la0.e(k1Var12.l(), c0VarR, 6), cx.i(k1Var12.g(), c0VarR, 6), d0.l1.f268418a.b(), f1114, f1115, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i2118, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i2117 & 896) | (i2117 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar3;
                    a0Var2 = a0Var3;
                    z15 = z16;
                    i21 = i2118;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z13;
                    i21 = iB;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i20 = i13;
            if ((i13 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        iB = wo.f34270b.b();
                    }
                    if ((i12 & 128) != 0) {
                        i22 = i20 & (-29360129);
                        voVarA = yx.f34867a.a(c0VarR, 6);
                    } else {
                        i22 = i20;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    a0Var3 = a0Var2;
                    z16 = z13;
                    voVar3 = voVarA;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        iB = wo.f34270b.b();
                    }
                    if ((i12 & 128) != 0) {
                        i22 = i20 & (-29360129);
                        voVarA = yx.f34867a.a(c0VarR, 6);
                    } else {
                        i22 = i20;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    a0Var3 = a0Var2;
                    z16 = z13;
                    voVar3 = voVarA;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                }
                if (jVar3 == null) {
                    c0VarR.E(1215858123);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(1424693900);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                zF = wo.f(iB, wo.f34270b.b());
                if (zF) {
                    f10 = f27167d;
                } else {
                    f10 = f27170g;
                }
                float f1116 = f10;
                if (zF) {
                    f11 = f27166c;
                } else {
                    f11 = f27168e;
                }
                float f1117 = f11;
                d0.k1 k1Var13 = d0.k1.f268357a;
                int i2119 = i22 >> 6;
                c0Var2 = c0VarR;
                int i21110 = iB;
                qp.K(z12, function1, function4, la0.e(k1Var13.l(), c0VarR, 6), cx.i(k1Var13.g(), c0VarR, 6), d0.l1.f268418a.b(), f1116, f1117, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i21110, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i2119 & 896) | (i2119 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar3;
                a0Var2 = a0Var3;
                z15 = z16;
                i21 = i21110;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z13;
                i21 = iB;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        z13 = z11;
        i16 = i12 & 64;
        if (i16 != 0) {
            if ((1572864 & i11) == 0) {
                iB = i10;
                if (c0VarR.K(iB)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            }
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    voVarA = voVar;
                    if (c0VarR.D(voVarA)) {
                    }
                    i13 |= i24;
                } else {
                    voVarA = voVar;
                }
                i13 |= i24;
            } else {
                voVarA = voVar;
            }
            i18 = i12 & 256;
            if (i18 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i19;
                }
                i20 = i13;
                if ((i13 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            iB = wo.f34270b.b();
                        }
                        if ((i12 & 128) != 0) {
                            i22 = i20 & (-29360129);
                            voVarA = yx.f34867a.a(c0VarR, 6);
                        } else {
                            i22 = i20;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        a0Var3 = a0Var2;
                        z16 = z13;
                        voVar3 = voVarA;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(1215858123);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(1424693900);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    zF = wo.f(iB, wo.f34270b.b());
                    if (zF) {
                        f10 = f27167d;
                    } else {
                        f10 = f27170g;
                    }
                    float f1118 = f10;
                    if (zF) {
                        f11 = f27166c;
                    } else {
                        f11 = f27168e;
                    }
                    float f1119 = f11;
                    d0.k1 k1Var14 = d0.k1.f268357a;
                    int i21111 = i22 >> 6;
                    c0Var2 = c0VarR;
                    int i21112 = iB;
                    qp.K(z12, function1, function4, la0.e(k1Var14.l(), c0VarR, 6), cx.i(k1Var14.g(), c0VarR, 6), d0.l1.f268418a.b(), f1118, f1119, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i21112, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i21111 & 896) | (i21111 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar3;
                    voVar2 = voVar3;
                    a0Var2 = a0Var3;
                    z15 = z16;
                    i21 = i21112;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z13;
                    i21 = iB;
                    voVar2 = voVarA;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i20 = i13;
            if ((i13 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        iB = wo.f34270b.b();
                    }
                    if ((i12 & 128) != 0) {
                        i22 = i20 & (-29360129);
                        voVarA = yx.f34867a.a(c0VarR, 6);
                    } else {
                        i22 = i20;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    a0Var3 = a0Var2;
                    z16 = z13;
                    voVar3 = voVarA;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        iB = wo.f34270b.b();
                    }
                    if ((i12 & 128) != 0) {
                        i22 = i20 & (-29360129);
                        voVarA = yx.f34867a.a(c0VarR, 6);
                    } else {
                        i22 = i20;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    a0Var3 = a0Var2;
                    z16 = z13;
                    voVar3 = voVarA;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                }
                if (jVar3 == null) {
                    c0VarR.E(1215858123);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(1424693900);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                zF = wo.f(iB, wo.f34270b.b());
                if (zF) {
                    f10 = f27167d;
                } else {
                    f10 = f27170g;
                }
                float f11110 = f10;
                if (zF) {
                    f11 = f27166c;
                } else {
                    f11 = f27168e;
                }
                float f11111 = f11;
                d0.k1 k1Var15 = d0.k1.f268357a;
                int i21113 = i22 >> 6;
                c0Var2 = c0VarR;
                int i21114 = iB;
                qp.K(z12, function1, function4, la0.e(k1Var15.l(), c0VarR, 6), cx.i(k1Var15.g(), c0VarR, 6), d0.l1.f268418a.b(), f11110, f11111, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i21114, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i21113 & 896) | (i21113 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar3;
                a0Var2 = a0Var3;
                z15 = z16;
                i21 = i21114;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z13;
                i21 = iB;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 1572864;
        iB = i10;
        if ((12582912 & i11) == 0) {
            if ((i12 & 128) == 0) {
                voVarA = voVar;
                if (c0VarR.D(voVarA)) {
                }
                i13 |= i24;
            } else {
                voVarA = voVar;
            }
            i13 |= i24;
        } else {
            voVarA = voVar;
        }
        i18 = i12 & 256;
        if (i18 != 0) {
            if ((i11 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i19 = 67108864;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i19;
            }
            i20 = i13;
            if ((i13 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        iB = wo.f34270b.b();
                    }
                    if ((i12 & 128) != 0) {
                        i22 = i20 & (-29360129);
                        voVarA = yx.f34867a.a(c0VarR, 6);
                    } else {
                        i22 = i20;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    a0Var3 = a0Var2;
                    z16 = z13;
                    voVar3 = voVarA;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        iB = wo.f34270b.b();
                    }
                    if ((i12 & 128) != 0) {
                        i22 = i20 & (-29360129);
                        voVarA = yx.f34867a.a(c0VarR, 6);
                    } else {
                        i22 = i20;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    a0Var3 = a0Var2;
                    z16 = z13;
                    voVar3 = voVarA;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                }
                if (jVar3 == null) {
                    c0VarR.E(1215858123);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(1424693900);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                zF = wo.f(iB, wo.f34270b.b());
                if (zF) {
                    f10 = f27167d;
                } else {
                    f10 = f27170g;
                }
                float f11112 = f10;
                if (zF) {
                    f11 = f27166c;
                } else {
                    f11 = f27168e;
                }
                float f11113 = f11;
                d0.k1 k1Var16 = d0.k1.f268357a;
                int i21115 = i22 >> 6;
                c0Var2 = c0VarR;
                int i21116 = iB;
                qp.K(z12, function1, function4, la0.e(k1Var16.l(), c0VarR, 6), cx.i(k1Var16.g(), c0VarR, 6), d0.l1.f268418a.b(), f11112, f11113, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i21116, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i21115 & 896) | (i21115 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar3;
                voVar2 = voVar3;
                a0Var2 = a0Var3;
                z15 = z16;
                i21 = i21116;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z13;
                i21 = iB;
                voVar2 = voVarA;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 100663296;
        i20 = i13;
        if ((i13 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i20 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    iB = wo.f34270b.b();
                }
                if ((i12 & 128) != 0) {
                    i22 = i20 & (-29360129);
                    voVarA = yx.f34867a.a(c0VarR, 6);
                } else {
                    i22 = i20;
                }
                if (i18 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                a0Var3 = a0Var2;
                z16 = z13;
                voVar3 = voVarA;
            } else {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    iB = wo.f34270b.b();
                }
                if ((i12 & 128) != 0) {
                    i22 = i20 & (-29360129);
                    voVarA = yx.f34867a.a(c0VarR, 6);
                } else {
                    i22 = i20;
                }
                if (i18 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                a0Var3 = a0Var2;
                z16 = z13;
                voVar3 = voVarA;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1164996656, i22, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
            }
            if (jVar3 == null) {
                c0VarR.E(1215858123);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
            } else {
                c0VarR.E(1424693900);
                c0VarR.A();
                jVar4 = jVar3;
            }
            zF = wo.f(iB, wo.f34270b.b());
            if (zF) {
                f10 = f27167d;
            } else {
                f10 = f27170g;
            }
            float f11114 = f10;
            if (zF) {
                f11 = f27166c;
            } else {
                f11 = f27168e;
            }
            float f11115 = f11;
            d0.k1 k1Var17 = d0.k1.f268357a;
            int i21117 = i22 >> 6;
            c0Var2 = c0VarR;
            int i21118 = iB;
            qp.K(z12, function1, function4, la0.e(k1Var17.l(), c0VarR, 6), cx.i(k1Var17.g(), c0VarR, 6), d0.l1.f268418a.b(), f11114, f11115, f27169f, f27171h, f27165b, voVar3, a0Var3, z16, function5, i21118, jVar4, c0Var2, (i22 & 14) | 906166272 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896), 6 | ((i22 >> 18) & com.planner5d.library.engine.input.f.b.B) | (i21117 & 896) | (i21117 & 7168) | ((i22 << 3) & 57344) | ((i22 >> 3) & 458752));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jVar2 = jVar3;
            voVar2 = voVar3;
            a0Var2 = a0Var3;
            z15 = z16;
            i21 = i21118;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            z15 = z13;
            i21 = iB;
            voVar2 = voVarA;
            jVar2 = jVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ay
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return dy.g(z10, function0, function2, function3, a0Var2, z15, i21, voVar2, jVar2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(boolean z10, Function0 function0, Function2 function2, Function2 function3, androidx.compose.ui.a0 a0Var, boolean z11, int i10, vo voVar, androidx.compose.foundation.interaction.j jVar, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        f(z10, function0, function2, function3, a0Var, z11, i10, voVar, jVar, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.foundation.layout.v6 v6Var, int i10, Function2 function2, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        e(a0Var, j10, j11, v6Var, i10, function2, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(int i10, int i11) {
        if (i10 > 6) {
            return 0;
        }
        return kotlin.math.b.L0((((100 - ((i10 + 3) * 10)) / 2.0f) / 100) * i11);
    }

    @NotNull
    public static final androidx.compose.runtime.m4<ey> k() {
        return f27164a;
    }

    public static final float l() {
        return f27170g;
    }

    public static final float m() {
        return f27168e;
    }

    public static final float n() {
        return f27171h;
    }

    public static final float o() {
        return f27167d;
    }

    public static final float p() {
        return f27169f;
    }

    public static final float q() {
        return f27166c;
    }

    public static final float r() {
        return f27165b;
    }
}
