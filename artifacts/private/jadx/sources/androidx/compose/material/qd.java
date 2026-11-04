package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,223:1\n60#2:224\n60#2:236\n113#3:225\n113#3:232\n113#3:233\n113#3:234\n113#3:235\n113#3:237\n113#3:238\n1282#4,6:226\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n84#1:224\n220#1:236\n84#1:225\n122#1:232\n217#1:233\n218#1:234\n219#1:235\n221#1:237\n222#1:238\n114#1:226,6\n*E\n"})
public final class qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f24402a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24403b = androidx.compose.ui.unit.h.r(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f24404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f24405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f24406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f24407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f24408g;

    static {
        float f10 = 2;
        f24404c = androidx.compose.ui.unit.h.r(f10);
        float fR = androidx.compose.ui.unit.h.r(20);
        f24405d = fR;
        f24406e = androidx.compose.ui.unit.h.r(fR / f10);
        f24407f = androidx.compose.ui.unit.h.r(12);
        f24408g = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0145  */
    /* JADX WARN: Code duplicated, block: B:101:0x014f  */
    /* JADX WARN: Code duplicated, block: B:104:0x018b  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:113:0x0204  */
    /* JADX WARN: Code duplicated, block: B:116:0x0217  */
    /* JADX WARN: Code duplicated, block: B:119:0x021e  */
    /* JADX WARN: Code duplicated, block: B:122:0x022b  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x013d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(final boolean z10, @Nullable final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable md mdVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        md mdVarA;
        boolean z13;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final androidx.compose.foundation.interaction.j jVar3;
        final md mdVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z15;
        androidx.compose.foundation.interaction.j jVar4;
        androidx.compose.runtime.c0 c0Var2;
        int i17;
        androidx.compose.foundation.interaction.j jVar5;
        char c10;
        float fR;
        final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarD;
        final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarA;
        androidx.compose.ui.a0 a0VarA;
        androidx.compose.ui.a0 a0VarH;
        boolean zD;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1314435585);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function0) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            mdVarA = mdVar;
                            int i19 = c0VarR.D(mdVarA) ? 131072 : 65536;
                            i12 |= i19;
                        } else {
                            mdVarA = mdVar;
                        }
                        i12 |= i19;
                    } else {
                        mdVarA = mdVar;
                    }
                    if ((74899 & i12) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z12;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var2 = c0VarR;
                                i17 = i12 & (-458753);
                                mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                            } else {
                                c0Var2 = c0VarR;
                                i17 = i12;
                                mdVarA = mdVarA;
                            }
                            jVar5 = jVar4;
                        } else {
                            c0VarR.u();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            i17 = i12;
                            a0Var4 = a0Var2;
                            z15 = z12;
                            jVar5 = jVar2;
                            c0Var2 = c0VarR;
                            mdVarA = mdVarA;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1314435585, i17, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                        }
                        if (z10) {
                            c10 = 2;
                            fR = androidx.compose.ui.unit.h.r(f24407f / 2);
                        } else {
                            c10 = 2;
                            fR = androidx.compose.ui.unit.h.r(0);
                        }
                        char c11 = c10;
                        int i20 = i17;
                        c0VarR = c0Var2;
                        n7VarD = androidx.compose.animation.core.f.d(fR, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0VarR, 48, 12);
                        int i21 = i20 >> 9;
                        n7VarA = mdVarA.a(z15, z10, c0VarR, ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | (i21 & 14) | (i21 & 896));
                        if (function0 != null) {
                            z14 = z15;
                            a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar5, wd.h(false, f24403b, 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                        } else {
                            z14 = z15;
                            a0VarA = androidx.compose.ui.a0.E;
                        }
                        if (function0 != null) {
                            a0VarH = l9.h(androidx.compose.ui.a0.E);
                        } else {
                            a0VarH = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarO = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var4.B2(a0VarH).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), r4, c11, null), f24404c), f24405d);
                        zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarD);
                        objI0 = c0VarR.i0();
                        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.od
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.f1.e(a0VarO, (Function1) objI0, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar5;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        jVar3 = jVar2;
                    }
                    mdVar2 = mdVarA;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pd
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return qd.e(z10, function0, a0Var3, z14, jVar3, mdVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        mdVarA = mdVar;
                        if (c0VarR.D(mdVarA)) {
                        }
                        i12 |= i19;
                    } else {
                        mdVarA = mdVar;
                    }
                    i12 |= i19;
                } else {
                    mdVarA = mdVar;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                            mdVarA = mdVarA;
                        }
                        jVar5 = jVar4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                            mdVarA = mdVarA;
                        }
                        jVar5 = jVar4;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1314435585, i17, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                    }
                    if (z10) {
                        c10 = 2;
                        fR = androidx.compose.ui.unit.h.r(f24407f / 2);
                    } else {
                        c10 = 2;
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    char c12 = c10;
                    int i22 = i17;
                    c0VarR = c0Var2;
                    n7VarD = androidx.compose.animation.core.f.d(fR, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0VarR, 48, 12);
                    int i23 = i22 >> 9;
                    n7VarA = mdVarA.a(z15, z10, c0VarR, ((i22 << 3) & com.planner5d.library.engine.input.f.b.B) | (i23 & 14) | (i23 & 896));
                    if (function0 != null) {
                        z14 = z15;
                        a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar5, wd.h(false, f24403b, 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                    } else {
                        z14 = z15;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarO2 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var4.B2(a0VarH).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), r4, c12, null), f24404c), f24405d);
                    zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarD);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material.od
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material.od
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarO2, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar5;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    jVar3 = jVar2;
                }
                mdVar2 = mdVarA;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qd.e(z10, function0, a0Var3, z14, jVar3, mdVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        mdVarA = mdVar;
                        if (c0VarR.D(mdVarA)) {
                        }
                        i12 |= i19;
                    } else {
                        mdVarA = mdVar;
                    }
                    i12 |= i19;
                } else {
                    mdVarA = mdVar;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                            mdVarA = mdVarA;
                        }
                        jVar5 = jVar4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                            mdVarA = mdVarA;
                        }
                        jVar5 = jVar4;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1314435585, i17, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                    }
                    if (z10) {
                        c10 = 2;
                        fR = androidx.compose.ui.unit.h.r(f24407f / 2);
                    } else {
                        c10 = 2;
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    char c13 = c10;
                    int i24 = i17;
                    c0VarR = c0Var2;
                    n7VarD = androidx.compose.animation.core.f.d(fR, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0VarR, 48, 12);
                    int i25 = i24 >> 9;
                    n7VarA = mdVarA.a(z15, z10, c0VarR, ((i24 << 3) & com.planner5d.library.engine.input.f.b.B) | (i25 & 14) | (i25 & 896));
                    if (function0 != null) {
                        z14 = z15;
                        a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar5, wd.h(false, f24403b, 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                    } else {
                        z14 = z15;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarO3 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var4.B2(a0VarH).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), r4, c13, null), f24404c), f24405d);
                    zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarD);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material.od
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material.od
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarO3, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar5;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    jVar3 = jVar2;
                }
                mdVar2 = mdVarA;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qd.e(z10, function0, a0Var3, z14, jVar3, mdVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    mdVarA = mdVar;
                    if (c0VarR.D(mdVarA)) {
                    }
                    i12 |= i19;
                } else {
                    mdVarA = mdVar;
                }
                i12 |= i19;
            } else {
                mdVarA = mdVar;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                        mdVarA = mdVarA;
                    }
                    jVar5 = jVar4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                        mdVarA = mdVarA;
                    }
                    jVar5 = jVar4;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1314435585, i17, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                }
                if (z10) {
                    c10 = 2;
                    fR = androidx.compose.ui.unit.h.r(f24407f / 2);
                } else {
                    c10 = 2;
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                char c14 = c10;
                int i26 = i17;
                c0VarR = c0Var2;
                n7VarD = androidx.compose.animation.core.f.d(fR, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0VarR, 48, 12);
                int i27 = i26 >> 9;
                n7VarA = mdVarA.a(z15, z10, c0VarR, ((i26 << 3) & com.planner5d.library.engine.input.f.b.B) | (i27 & 14) | (i27 & 896));
                if (function0 != null) {
                    z14 = z15;
                    a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar5, wd.h(false, f24403b, 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                } else {
                    z14 = z15;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarO4 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var4.B2(a0VarH).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), r4, c14, null), f24404c), f24405d);
                zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarD);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material.od
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material.od
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarO4, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar5;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
                jVar3 = jVar2;
            }
            mdVar2 = mdVarA;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qd.e(z10, function0, a0Var3, z14, jVar3, mdVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        mdVarA = mdVar;
                        if (c0VarR.D(mdVarA)) {
                        }
                        i12 |= i19;
                    } else {
                        mdVarA = mdVar;
                    }
                    i12 |= i19;
                } else {
                    mdVarA = mdVar;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                            mdVarA = mdVarA;
                        }
                        jVar5 = jVar4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                            mdVarA = mdVarA;
                        }
                        jVar5 = jVar4;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1314435585, i17, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                    }
                    if (z10) {
                        c10 = 2;
                        fR = androidx.compose.ui.unit.h.r(f24407f / 2);
                    } else {
                        c10 = 2;
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    char c15 = c10;
                    int i28 = i17;
                    c0VarR = c0Var2;
                    n7VarD = androidx.compose.animation.core.f.d(fR, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0VarR, 48, 12);
                    int i29 = i28 >> 9;
                    n7VarA = mdVarA.a(z15, z10, c0VarR, ((i28 << 3) & com.planner5d.library.engine.input.f.b.B) | (i29 & 14) | (i29 & 896));
                    if (function0 != null) {
                        z14 = z15;
                        a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar5, wd.h(false, f24403b, 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                    } else {
                        z14 = z15;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarO5 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var4.B2(a0VarH).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), r4, c15, null), f24404c), f24405d);
                    zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarD);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material.od
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material.od
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarO5, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar5;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    jVar3 = jVar2;
                }
                mdVar2 = mdVarA;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qd.e(z10, function0, a0Var3, z14, jVar3, mdVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    mdVarA = mdVar;
                    if (c0VarR.D(mdVarA)) {
                    }
                    i12 |= i19;
                } else {
                    mdVarA = mdVar;
                }
                i12 |= i19;
            } else {
                mdVarA = mdVar;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                        mdVarA = mdVarA;
                    }
                    jVar5 = jVar4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                        mdVarA = mdVarA;
                    }
                    jVar5 = jVar4;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1314435585, i17, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                }
                if (z10) {
                    c10 = 2;
                    fR = androidx.compose.ui.unit.h.r(f24407f / 2);
                } else {
                    c10 = 2;
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                char c16 = c10;
                int i210 = i17;
                c0VarR = c0Var2;
                n7VarD = androidx.compose.animation.core.f.d(fR, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0VarR, 48, 12);
                int i211 = i210 >> 9;
                n7VarA = mdVarA.a(z15, z10, c0VarR, ((i210 << 3) & com.planner5d.library.engine.input.f.b.B) | (i211 & 14) | (i211 & 896));
                if (function0 != null) {
                    z14 = z15;
                    a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar5, wd.h(false, f24403b, 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                } else {
                    z14 = z15;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarO6 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var4.B2(a0VarH).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), r4, c16, null), f24404c), f24405d);
                zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarD);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material.od
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material.od
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarO6, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar5;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
                jVar3 = jVar2;
            }
            mdVar2 = mdVarA;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qd.e(z10, function0, a0Var3, z14, jVar3, mdVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    mdVarA = mdVar;
                    if (c0VarR.D(mdVarA)) {
                    }
                    i12 |= i19;
                } else {
                    mdVarA = mdVar;
                }
                i12 |= i19;
            } else {
                mdVarA = mdVar;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                        mdVarA = mdVarA;
                    }
                    jVar5 = jVar4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                        mdVarA = mdVarA;
                    }
                    jVar5 = jVar4;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1314435585, i17, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                }
                if (z10) {
                    c10 = 2;
                    fR = androidx.compose.ui.unit.h.r(f24407f / 2);
                } else {
                    c10 = 2;
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                char c17 = c10;
                int i212 = i17;
                c0VarR = c0Var2;
                n7VarD = androidx.compose.animation.core.f.d(fR, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0VarR, 48, 12);
                int i213 = i212 >> 9;
                n7VarA = mdVarA.a(z15, z10, c0VarR, ((i212 << 3) & com.planner5d.library.engine.input.f.b.B) | (i213 & 14) | (i213 & 896));
                if (function0 != null) {
                    z14 = z15;
                    a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar5, wd.h(false, f24403b, 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                } else {
                    z14 = z15;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarO7 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var4.B2(a0VarH).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), r4, c17, null), f24404c), f24405d);
                zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarD);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material.od
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material.od
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarO7, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar5;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
                jVar3 = jVar2;
            }
            mdVar2 = mdVarA;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qd.e(z10, function0, a0Var3, z14, jVar3, mdVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                mdVarA = mdVar;
                if (c0VarR.D(mdVarA)) {
                }
                i12 |= i19;
            } else {
                mdVarA = mdVar;
            }
            i12 |= i19;
        } else {
            mdVarA = mdVar;
        }
        if ((74899 & i12) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 32) != 0) {
                    c0Var2 = c0VarR;
                    i17 = i12 & (-458753);
                    mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                } else {
                    c0Var2 = c0VarR;
                    i17 = i12;
                    mdVarA = mdVarA;
                }
                jVar5 = jVar4;
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 32) != 0) {
                    c0Var2 = c0VarR;
                    i17 = i12 & (-458753);
                    mdVarA = nd.f23956a.a(0L, 0L, 0L, c0Var2, 3072, 7);
                } else {
                    c0Var2 = c0VarR;
                    i17 = i12;
                    mdVarA = mdVarA;
                }
                jVar5 = jVar4;
            }
            c0Var2.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1314435585, i17, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
            }
            if (z10) {
                c10 = 2;
                fR = androidx.compose.ui.unit.h.r(f24407f / 2);
            } else {
                c10 = 2;
                fR = androidx.compose.ui.unit.h.r(0);
            }
            char c18 = c10;
            int i214 = i17;
            c0VarR = c0Var2;
            n7VarD = androidx.compose.animation.core.f.d(fR, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0VarR, 48, 12);
            int i215 = i214 >> 9;
            n7VarA = mdVarA.a(z15, z10, c0VarR, ((i214 << 3) & com.planner5d.library.engine.input.f.b.B) | (i215 & 14) | (i215 & 896));
            if (function0 != null) {
                z14 = z15;
                a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar5, wd.h(false, f24403b, 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
            } else {
                z14 = z15;
                a0VarA = androidx.compose.ui.a0.E;
            }
            if (function0 != null) {
                a0VarH = l9.h(androidx.compose.ui.a0.E);
            } else {
                a0VarH = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarO8 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var4.B2(a0VarH).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), r4, c18, null), f24404c), f24405d);
            zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarD);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = new Function1() { // from class: androidx.compose.material.od
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material.od
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qd.d(n7VarA, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.f1.e(a0VarO8, (Function1) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jVar3 = jVar5;
            a0Var3 = a0Var4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z14 = z12;
            jVar3 = jVar2;
        }
        mdVar2 = mdVarA;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.pd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qd.e(z10, function0, a0Var3, z14, jVar3, mdVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fS7 = fVar.S7(f24408g);
        float f10 = fS7 / 2;
        androidx.compose.ui.graphics.drawscope.f.B4(fVar, ((androidx.compose.ui.graphics.q0) n7Var.getValue()).M(), fVar.S7(f24406e) - f10, 0L, 0.0f, new androidx.compose.ui.graphics.drawscope.n(fS7, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (androidx.compose.ui.unit.h.q(((androidx.compose.ui.unit.h) n7Var2.getValue()).O(), androidx.compose.ui.unit.h.r(0)) > 0) {
            androidx.compose.ui.graphics.drawscope.f.B4(fVar, ((androidx.compose.ui.graphics.q0) n7Var.getValue()).M(), fVar.S7(((androidx.compose.ui.unit.h) n7Var2.getValue()).O()) - f10, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.m.f37744a, null, 0, 108, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.foundation.interaction.j jVar, md mdVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(z10, function0, a0Var, z11, jVar, mdVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
