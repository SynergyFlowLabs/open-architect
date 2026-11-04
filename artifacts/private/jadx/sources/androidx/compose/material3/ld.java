package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,119:1\n1282#2,6:120\n1282#2,6:126\n75#3:132\n123#4:133\n30#5:134\n30#5:141\n30#5:145\n30#5:152\n53#6,3:135\n60#6:139\n53#6,3:142\n53#6,3:146\n70#6:150\n53#6,3:153\n57#7:138\n61#7:149\n22#8:140\n22#8:151\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n*L\n54#1:120,6\n82#1:126,6\n103#1:132\n103#1:133\n58#1:134\n59#1:141\n86#1:145\n87#1:152\n58#1:135,3\n59#1:139\n59#1:142,3\n86#1:146,3\n87#1:150\n87#1:153,3\n59#1:138\n87#1:149\n59#1:140\n87#1:151\n*E\n"})
public final class ld {
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    @androidx.compose.runtime.o
    @kotlin.l(message = "Renamed to HorizontalDivider", replaceWith = @kotlin.b1(expression = "HorizontalDivider(modifier, thickness, color)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void f(@Nullable androidx.compose.ui.a0 a0Var, float f10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        long j11;
        androidx.compose.ui.a0 a0Var2;
        float fB;
        long jA;
        float fR;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1562471785);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j10;
                int i15 = c0VarR.L(j11) ? 256 : 128;
                i12 |= i15;
            } else {
                j11 = j10;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                a0Var2 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var;
                fB = i14 != 0 ? fd.f27637a.b() : f10;
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jA = fd.f27637a.a(c0VarR, 6);
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1562471785, i12, -1, "androidx.compose.material3.Divider (Divider.kt:99)");
                }
                if (androidx.compose.ui.unit.h.x(fB, androidx.compose.ui.unit.h.f42689b.a())) {
                    c0VarR.E(-1258250053);
                    fR = androidx.compose.ui.unit.h.r(1.0f / ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).getDensity());
                    c0VarR.A();
                } else {
                    c0VarR.E(-1258183496);
                    c0VarR.A();
                    fR = fB;
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var2, 0.0f, 1, null), fR), jA, null, 2, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                a0Var2 = a0Var;
                fB = f10;
            }
            jA = j11;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1562471785, i12, -1, "androidx.compose.material3.Divider (Divider.kt:99)");
            }
            if (androidx.compose.ui.unit.h.x(fB, androidx.compose.ui.unit.h.f42689b.a())) {
                c0VarR.E(-1258250053);
                fR = androidx.compose.ui.unit.h.r(1.0f / ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).getDensity());
                c0VarR.A();
            } else {
                c0VarR.E(-1258183496);
                c0VarR.A();
                fR = fB;
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var2, 0.0f, 1, null), fR), jA, null, 2, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            fB = f10;
            jA = j11;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            final float f11 = fB;
            final long j12 = jA;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.gd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ld.g(a0Var3, f11, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.a0 a0Var, float f10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(a0Var, f10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:84:0x0115  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void h(@Nullable androidx.compose.ui.a0 a0Var, float f10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        float f11;
        final long jA;
        boolean z10;
        boolean z11;
        androidx.compose.ui.a0 a0Var3;
        final float fB;
        androidx.compose.runtime.s5 s5VarT;
        boolean z12;
        boolean z13;
        Object objI0;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(75144485);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                jA = j10;
                if ((i11 & 4) == 0 || !c0VarR.L(jA)) {
                    i13 = 128;
                } else {
                    i13 = 256;
                }
                i12 |= i13;
            } else {
                jA = j10;
            }
            z10 = true;
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        fB = fd.f27637a.b();
                    } else {
                        fB = f11;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jA = fd.f27637a.a(c0VarR, 6);
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    a0Var3 = a0Var2;
                    fB = f11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(75144485, i12, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
                }
                androidx.compose.ui.a0 a0VarI = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), fB);
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 || !c0VarR.L(jA)) && (i12 & androidx.media3.exoplayer.a5.S0) != 256) {
                }
                z13 = z12 | z10;
                objI0 = c0VarR.i0();
                if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.jd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ld.i(fB, jA, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarI, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                fB = f11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var3;
                final float f12 = fB;
                final long j11 = jA;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.kd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ld.j(a0Var4, f12, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        f11 = f10;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            jA = j10;
            if ((i11 & 4) == 0) {
                i13 = 128;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        } else {
            jA = j10;
        }
        z10 = true;
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    fB = fd.f27637a.b();
                } else {
                    fB = f11;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jA = fd.f27637a.a(c0VarR, 6);
                }
            } else {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    fB = fd.f27637a.b();
                } else {
                    fB = f11;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jA = fd.f27637a.a(c0VarR, 6);
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(75144485, i12, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
            }
            androidx.compose.ui.a0 a0VarI2 = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), fB);
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 = ((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 ? false : false;
            z13 = z12 | z10;
            objI0 = c0VarR.i0();
            if (z13) {
                objI0 = new Function1() { // from class: androidx.compose.material3.jd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ld.i(fB, jA, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material3.jd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ld.i(fB, jA, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.f1.e(a0VarI2, (Function1) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            fB = f11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var5 = a0Var3;
            final float f13 = fB;
            final long j12 = jA;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.kd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ld.j(a0Var5, f13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(float f10, long j10, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fS7 = fVar.S7(f10);
        float f11 = 2;
        androidx.compose.ui.graphics.drawscope.f.j2(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fVar.S7(f10) / f11)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fVar.S7(f10) / f11)) & com.rabbitmq.client.k0.f265952a)), fS7, 0, null, 0.0f, null, 0, 496, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.ui.a0 a0Var, float f10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(a0Var, f10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0116  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void k(@Nullable androidx.compose.ui.a0 a0Var, float f10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        float f11;
        final long jA;
        boolean z10;
        boolean z11;
        androidx.compose.ui.a0 a0Var3;
        final float fB;
        androidx.compose.runtime.s5 s5VarT;
        boolean z12;
        boolean z13;
        Object objI0;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1534852205);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                jA = j10;
                if ((i11 & 4) == 0 || !c0VarR.L(jA)) {
                    i13 = 128;
                } else {
                    i13 = 256;
                }
                i12 |= i13;
            } else {
                jA = j10;
            }
            z10 = true;
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i14 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        fB = fd.f27637a.b();
                    } else {
                        fB = f11;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jA = fd.f27637a.a(c0VarR, 6);
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    a0Var3 = a0Var2;
                    fB = f11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1534852205, i12, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:81)");
                }
                androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.layout.i6.B(androidx.compose.foundation.layout.i6.d(a0Var3, 0.0f, 1, null), fB);
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 || !c0VarR.L(jA)) && (i12 & androidx.media3.exoplayer.a5.S0) != 256) {
                }
                z13 = z12 | z10;
                objI0 = c0VarR.i0();
                if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.hd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ld.l(fB, jA, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarB, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                fB = f11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var3;
                final float f12 = fB;
                final long j11 = jA;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.id
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ld.m(a0Var4, f12, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        f11 = f10;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            jA = j10;
            if ((i11 & 4) == 0) {
                i13 = 128;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        } else {
            jA = j10;
        }
        z10 = true;
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    fB = fd.f27637a.b();
                } else {
                    fB = f11;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jA = fd.f27637a.a(c0VarR, 6);
                }
            } else {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    fB = fd.f27637a.b();
                } else {
                    fB = f11;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jA = fd.f27637a.a(c0VarR, 6);
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1534852205, i12, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:81)");
            }
            androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.B(androidx.compose.foundation.layout.i6.d(a0Var3, 0.0f, 1, null), fB);
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 = ((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 ? false : false;
            z13 = z12 | z10;
            objI0 = c0VarR.i0();
            if (z13) {
                objI0 = new Function1() { // from class: androidx.compose.material3.hd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ld.l(fB, jA, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material3.hd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ld.l(fB, jA, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.f1.e(a0VarB2, (Function1) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            fB = f11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var5 = a0Var3;
            final float f13 = fB;
            final long j12 = jA;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.id
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ld.m(a0Var5, f13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(float f10, long j10, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fS7 = fVar.S7(f10);
        float f11 = 2;
        androidx.compose.ui.graphics.drawscope.f.j2(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(fVar.S7(f10) / f11)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(fVar.S7(f10) / f11)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a)), fS7, 0, null, 0.0f, null, 0, 496, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.a0 a0Var, float f10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(a0Var, f10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
