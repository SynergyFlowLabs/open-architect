package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,267:1\n60#2:268\n60#2:270\n60#2:277\n113#3:269\n113#3:278\n113#3:279\n113#3:280\n113#3:281\n1282#4,6:271\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n84#1:268\n97#1:270\n120#1:277\n84#1:269\n123#1:278\n264#1:279\n265#1:280\n266#1:281\n115#1:271,6\n*E\n"})
public final class us {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f33774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f33775b = androidx.compose.ui.unit.h.r(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f33776c;

    static {
        float f10 = 2;
        f33774a = androidx.compose.ui.unit.h.r(f10);
        f33776c = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x0165  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x0204  */
    /* JADX WARN: Code duplicated, block: B:120:0x0213  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void c(final boolean z10, @Nullable final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable qs qsVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        int i14;
        qs qsVarA;
        int i15;
        int i16;
        boolean z13;
        final androidx.compose.foundation.interaction.j jVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final qs qsVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i17;
        boolean z15;
        qs qsVar3;
        float fR;
        final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarD;
        final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarG;
        Object obj;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.ui.a0 a0VarA;
        androidx.compose.ui.a0 a0VarJ;
        boolean zD;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(408580840);
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
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        qsVarA = qsVar;
                        int i19 = c0VarR.D(qsVarA) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        qsVarA = qsVar;
                    }
                    i12 |= i19;
                } else {
                    qsVarA = qsVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.D(jVar)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
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
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                qsVarA = rs.f32593a.a(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                i17 = i12;
                                z15 = z12;
                                qsVar3 = qsVarA;
                                jVar = null;
                            } else {
                                i17 = i12;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                            }
                            if (z10) {
                                fR = androidx.compose.ui.unit.h.r(f33775b / 2);
                            } else {
                                fR = androidx.compose.ui.unit.h.r(0);
                            }
                            n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
                            n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
                            if (function0 != null) {
                                androidx.compose.ui.a0 a0Var6 = a0Var4;
                                z14 = z15;
                                a0Var5 = a0Var6;
                                obj = null;
                                a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                            } else {
                                obj = null;
                                a0Var5 = a0Var4;
                                z14 = z15;
                                a0VarA = androidx.compose.ui.a0.E;
                            }
                            if (function0 != null) {
                                a0VarJ = wi.j(androidx.compose.ui.a0.E);
                            } else {
                                a0VarJ = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0VarO = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
                            zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
                            objI0 = c0VarR.i0();
                            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.ss
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.foundation.f1.e(a0VarO, (Function1) objI0, c0VarR, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar;
                            qsVar2 = qsVar3;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            i17 = i12;
                            a0Var4 = a0Var2;
                        }
                        z15 = z12;
                        qsVar3 = qsVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                        }
                        if (z10) {
                            fR = androidx.compose.ui.unit.h.r(f33775b / 2);
                        } else {
                            fR = androidx.compose.ui.unit.h.r(0);
                        }
                        n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
                        n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
                        if (function0 != null) {
                            androidx.compose.ui.a0 a0Var7 = a0Var4;
                            z14 = z15;
                            a0Var5 = a0Var7;
                            obj = null;
                            a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                        } else {
                            obj = null;
                            a0Var5 = a0Var4;
                            z14 = z15;
                            a0VarA = androidx.compose.ui.a0.E;
                        }
                        if (function0 != null) {
                            a0VarJ = wi.j(androidx.compose.ui.a0.E);
                        } else {
                            a0VarJ = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarO2 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
                        zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ss
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ss
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.f1.e(a0VarO2, (Function1) objI0, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar;
                        qsVar2 = qsVar3;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        qsVar2 = qsVarA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ts
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return us.e(z10, function0, a0Var3, z14, qsVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
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
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            qsVarA = rs.f32593a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                            jVar = null;
                        } else {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            qsVarA = rs.f32593a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                            jVar = null;
                        } else {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                    }
                    if (z10) {
                        fR = androidx.compose.ui.unit.h.r(f33775b / 2);
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
                    n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
                    if (function0 != null) {
                        androidx.compose.ui.a0 a0Var8 = a0Var4;
                        z14 = z15;
                        a0Var5 = a0Var8;
                        obj = null;
                        a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                    } else {
                        obj = null;
                        a0Var5 = a0Var4;
                        z14 = z15;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarJ = wi.j(androidx.compose.ui.a0.E);
                    } else {
                        a0VarJ = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarO3 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
                    zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ss
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ss
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarO3, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar;
                    qsVar2 = qsVar3;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    qsVar2 = qsVarA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ts
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return us.e(z10, function0, a0Var3, z14, qsVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    qsVarA = qsVar;
                    if (c0VarR.D(qsVarA)) {
                    }
                    i12 |= i19;
                } else {
                    qsVarA = qsVar;
                }
                i12 |= i19;
            } else {
                qsVarA = qsVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(jVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
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
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            qsVarA = rs.f32593a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                            jVar = null;
                        } else {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            qsVarA = rs.f32593a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                            jVar = null;
                        } else {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                    }
                    if (z10) {
                        fR = androidx.compose.ui.unit.h.r(f33775b / 2);
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
                    n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
                    if (function0 != null) {
                        androidx.compose.ui.a0 a0Var9 = a0Var4;
                        z14 = z15;
                        a0Var5 = a0Var9;
                        obj = null;
                        a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                    } else {
                        obj = null;
                        a0Var5 = a0Var4;
                        z14 = z15;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarJ = wi.j(androidx.compose.ui.a0.E);
                    } else {
                        a0VarJ = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarO4 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
                    zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ss
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ss
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarO4, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar;
                    qsVar2 = qsVar3;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    qsVar2 = qsVarA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ts
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return us.e(z10, function0, a0Var3, z14, qsVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
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
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        qsVarA = rs.f32593a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                        jVar = null;
                    } else {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        qsVarA = rs.f32593a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                        jVar = null;
                    } else {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                }
                if (z10) {
                    fR = androidx.compose.ui.unit.h.r(f33775b / 2);
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
                n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
                if (function0 != null) {
                    androidx.compose.ui.a0 a0Var10 = a0Var4;
                    z14 = z15;
                    a0Var5 = a0Var10;
                    obj = null;
                    a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                } else {
                    obj = null;
                    a0Var5 = a0Var4;
                    z14 = z15;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarJ = wi.j(androidx.compose.ui.a0.E);
                } else {
                    a0VarJ = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarO5 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
                zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ss
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ss
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarO5, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar;
                qsVar2 = qsVar3;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z14 = z12;
                qsVar2 = qsVarA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ts
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return us.e(z10, function0, a0Var3, z14, qsVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
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
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    qsVarA = qsVar;
                    if (c0VarR.D(qsVarA)) {
                    }
                    i12 |= i19;
                } else {
                    qsVarA = qsVar;
                }
                i12 |= i19;
            } else {
                qsVarA = qsVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.D(jVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
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
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            qsVarA = rs.f32593a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                            jVar = null;
                        } else {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            qsVarA = rs.f32593a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                            jVar = null;
                        } else {
                            i17 = i12;
                            z15 = z12;
                            qsVar3 = qsVarA;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                    }
                    if (z10) {
                        fR = androidx.compose.ui.unit.h.r(f33775b / 2);
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
                    n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
                    if (function0 != null) {
                        androidx.compose.ui.a0 a0Var11 = a0Var4;
                        z14 = z15;
                        a0Var5 = a0Var11;
                        obj = null;
                        a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                    } else {
                        obj = null;
                        a0Var5 = a0Var4;
                        z14 = z15;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarJ = wi.j(androidx.compose.ui.a0.E);
                    } else {
                        a0VarJ = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarO6 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
                    zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ss
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ss
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarO6, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar;
                    qsVar2 = qsVar3;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    qsVar2 = qsVarA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ts
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return us.e(z10, function0, a0Var3, z14, qsVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
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
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        qsVarA = rs.f32593a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                        jVar = null;
                    } else {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        qsVarA = rs.f32593a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                        jVar = null;
                    } else {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                }
                if (z10) {
                    fR = androidx.compose.ui.unit.h.r(f33775b / 2);
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
                n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
                if (function0 != null) {
                    androidx.compose.ui.a0 a0Var12 = a0Var4;
                    z14 = z15;
                    a0Var5 = a0Var12;
                    obj = null;
                    a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                } else {
                    obj = null;
                    a0Var5 = a0Var4;
                    z14 = z15;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarJ = wi.j(androidx.compose.ui.a0.E);
                } else {
                    a0VarJ = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarO7 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
                zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ss
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ss
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarO7, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar;
                qsVar2 = qsVar3;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z14 = z12;
                qsVar2 = qsVarA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ts
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return us.e(z10, function0, a0Var3, z14, qsVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                qsVarA = qsVar;
                if (c0VarR.D(qsVarA)) {
                }
                i12 |= i19;
            } else {
                qsVarA = qsVar;
            }
            i12 |= i19;
        } else {
            qsVarA = qsVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                if (c0VarR.D(jVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
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
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        qsVarA = rs.f32593a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                        jVar = null;
                    } else {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        qsVarA = rs.f32593a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                        jVar = null;
                    } else {
                        i17 = i12;
                        z15 = z12;
                        qsVar3 = qsVarA;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                }
                if (z10) {
                    fR = androidx.compose.ui.unit.h.r(f33775b / 2);
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
                n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
                if (function0 != null) {
                    androidx.compose.ui.a0 a0Var13 = a0Var4;
                    z14 = z15;
                    a0Var5 = a0Var13;
                    obj = null;
                    a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
                } else {
                    obj = null;
                    a0Var5 = a0Var4;
                    z14 = z15;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarJ = wi.j(androidx.compose.ui.a0.E);
                } else {
                    a0VarJ = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarO8 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
                zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ss
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ss
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarO8, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar;
                qsVar2 = qsVar3;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z14 = z12;
                qsVar2 = qsVarA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ts
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return us.e(z10, function0, a0Var3, z14, qsVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
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
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    qsVarA = rs.f32593a.a(c0VarR, 6);
                }
                if (i15 != 0) {
                    i17 = i12;
                    z15 = z12;
                    qsVar3 = qsVarA;
                    jVar = null;
                } else {
                    i17 = i12;
                    z15 = z12;
                    qsVar3 = qsVarA;
                }
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    qsVarA = rs.f32593a.a(c0VarR, 6);
                }
                if (i15 != 0) {
                    i17 = i12;
                    z15 = z12;
                    qsVar3 = qsVarA;
                    jVar = null;
                } else {
                    i17 = i12;
                    z15 = z12;
                    qsVar3 = qsVarA;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(408580840, i17, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
            }
            if (z10) {
                fR = androidx.compose.ui.unit.h.r(f33775b / 2);
            } else {
                fR = androidx.compose.ui.unit.h.r(0);
            }
            n7VarD = androidx.compose.animation.core.f.d(fR, hm.b(d0.h1.FastSpatial, c0VarR, 6), null, null, c0VarR, 0, 12);
            n7VarG = qsVar3.g(z15, z10, c0VarR, ((i17 >> 6) & 896) | ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B));
            if (function0 != null) {
                androidx.compose.ui.a0 a0Var14 = a0Var4;
                z14 = z15;
                a0Var5 = a0Var14;
                obj = null;
                a0VarA = androidx.compose.foundation.selection.c.a(androidx.compose.ui.a0.E, z10, jVar, gt.e(false, androidx.compose.ui.unit.h.r(d0.d2.f267839a.h() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.f()), function0);
            } else {
                obj = null;
                a0Var5 = a0Var4;
                z14 = z15;
                a0VarA = androidx.compose.ui.a0.E;
            }
            if (function0 != null) {
                a0VarJ = wi.j(androidx.compose.ui.a0.E);
            } else {
                a0VarJ = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarO9 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.d5.r(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarJ).B2(a0VarA), androidx.compose.ui.e.f37317a.i(), false, 2, obj), f33774a), d0.d2.f267839a.c());
            zD = c0VarR.D(n7VarG) | c0VarR.D(n7VarD);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ss
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material3.ss
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return us.d(n7VarG, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj2);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.f1.e(a0VarO9, (Function1) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jVar2 = jVar;
            qsVar2 = qsVar3;
            a0Var3 = a0Var5;
        } else {
            c0VarR.u();
            jVar2 = jVar;
            a0Var3 = a0Var2;
            z14 = z12;
            qsVar2 = qsVarA;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ts
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return us.e(z10, function0, a0Var3, z14, qsVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fS7 = fVar.S7(f33776c);
        float f10 = 2;
        float f11 = fS7 / f10;
        androidx.compose.ui.graphics.drawscope.f.B4(fVar, ((androidx.compose.ui.graphics.q0) n7Var.getValue()).M(), fVar.S7(androidx.compose.ui.unit.h.r(d0.d2.f267839a.c() / f10)) - f11, 0L, 0.0f, new androidx.compose.ui.graphics.drawscope.n(fS7, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (androidx.compose.ui.unit.h.q(((androidx.compose.ui.unit.h) n7Var2.getValue()).O(), androidx.compose.ui.unit.h.r(0)) > 0) {
            androidx.compose.ui.graphics.drawscope.f.B4(fVar, ((androidx.compose.ui.graphics.q0) n7Var.getValue()).M(), fVar.S7(((androidx.compose.ui.unit.h) n7Var2.getValue()).O()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.m.f37744a, null, 0, 108, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z11, qs qsVar, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(z10, function0, a0Var, z11, qsVar, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
