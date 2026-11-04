package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,68:1\n113#2:69\n113#2:70\n123#2:72\n75#3:71\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n*L\n49#1:69\n50#1:70\n60#1:72\n60#1:71\n*E\n"})
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f25150a = 0.12f;

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa A[PHI: r2 r4 r7 r9
      0x00aa: PHI (r2v9 androidx.compose.ui.a0) = (r2v6 androidx.compose.ui.a0), (r2v11 androidx.compose.ui.a0) binds: [B:69:0x00dd, B:59:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r4v31 int) = (r4v15 int), (r4v32 int) binds: [B:69:0x00dd, B:59:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r7v8 long) = (r7v4 long), (r7v1 long) binds: [B:69:0x00dd, B:59:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r9v8 float) = (r9v5 float), (r9v2 float) binds: [B:69:0x00dd, B:59:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x011b  */
    /* JADX WARN: Code duplicated, block: B:81:0x013a  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0178  */
    /* JADX WARN: Code duplicated, block: B:90:0x0186  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@Nullable androidx.compose.ui.a0 a0Var, long j10, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jW;
        float fR;
        int i13;
        float f12;
        int i14;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        final float f13;
        final float f14;
        androidx.compose.runtime.s5 s5VarT;
        float fR2;
        androidx.compose.ui.a0 a0VarV;
        float fR3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1249392198);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            jW = j10;
            i12 |= ((i11 & 2) == 0 && c0VarR.L(jW)) ? 32 : 16;
        } else {
            jW = j10;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                fR = f10;
                i12 |= c0VarR.I(fR) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    f12 = f11;
                    if (c0VarR.I(f12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i15 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0VarR, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -113;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i13 != 0) {
                            fR2 = androidx.compose.ui.unit.h.r(0);
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1249392198, i12, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                        }
                        if (fR2 == 0.0f) {
                            a0VarV = androidx.compose.ui.a0.E;
                        } else {
                            a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, fR2, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (androidx.compose.ui.unit.h.x(fR, androidx.compose.ui.unit.h.f42689b.a())) {
                            c0VarR.E(-455967894);
                            fR3 = androidx.compose.ui.unit.h.r(1.0f / ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).getDensity());
                            c0VarR.A();
                        } else {
                            c0VarR.E(-455901337);
                            c0VarR.A();
                            fR3 = fR;
                        }
                        androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3.B2(a0VarV), 0.0f, 1, null), fR3), jW, null, 2, null), c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f13 = fR2;
                    } else {
                        c0VarR.u();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        a0Var3 = a0Var2;
                    }
                    fR2 = f12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1249392198, i12, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                    }
                    if (fR2 == 0.0f) {
                        a0VarV = androidx.compose.ui.a0.E;
                    } else {
                        a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, fR2, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (androidx.compose.ui.unit.h.x(fR, androidx.compose.ui.unit.h.f42689b.a())) {
                        c0VarR.E(-455967894);
                        fR3 = androidx.compose.ui.unit.h.r(1.0f / ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).getDensity());
                        c0VarR.A();
                    } else {
                        c0VarR.E(-455901337);
                        c0VarR.A();
                        fR3 = fR;
                    }
                    androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3.B2(a0VarV), 0.0f, 1, null), fR3), jW, null, 2, null), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f13 = fR2;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    f13 = f12;
                }
                f14 = fR;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var4 = a0Var3;
                    final long j11 = jW;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.t5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return u5.c(a0Var4, j11, f14, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            f12 = f11;
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0VarR, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -113;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i13 != 0) {
                        fR2 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR2 = f12;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0VarR, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -113;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i13 != 0) {
                        fR2 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR2 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1249392198, i12, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                }
                if (fR2 == 0.0f) {
                    a0VarV = androidx.compose.ui.a0.E;
                } else {
                    a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, fR2, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (androidx.compose.ui.unit.h.x(fR, androidx.compose.ui.unit.h.f42689b.a())) {
                    c0VarR.E(-455967894);
                    fR3 = androidx.compose.ui.unit.h.r(1.0f / ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).getDensity());
                    c0VarR.A();
                } else {
                    c0VarR.E(-455901337);
                    c0VarR.A();
                    fR3 = fR;
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3.B2(a0VarV), 0.0f, 1, null), fR3), jW, null, 2, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f13 = fR2;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                f13 = f12;
            }
            f14 = fR;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var3;
                final long j12 = jW;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.t5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return u5.c(a0Var5, j12, f14, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        fR = f10;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                f12 = f11;
                if (c0VarR.I(f12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0VarR, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -113;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i13 != 0) {
                        fR2 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR2 = f12;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0VarR, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -113;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i13 != 0) {
                        fR2 = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR2 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1249392198, i12, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                }
                if (fR2 == 0.0f) {
                    a0VarV = androidx.compose.ui.a0.E;
                } else {
                    a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, fR2, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (androidx.compose.ui.unit.h.x(fR, androidx.compose.ui.unit.h.f42689b.a())) {
                    c0VarR.E(-455967894);
                    fR3 = androidx.compose.ui.unit.h.r(1.0f / ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).getDensity());
                    c0VarR.A();
                } else {
                    c0VarR.E(-455901337);
                    c0VarR.A();
                    fR3 = fR;
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3.B2(a0VarV), 0.0f, 1, null), fR3), jW, null, 2, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f13 = fR2;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                f13 = f12;
            }
            f14 = fR;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var3;
                final long j13 = jW;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.t5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return u5.c(a0Var6, j13, f14, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        f12 = f11;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0VarR, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -113;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i13 != 0) {
                    fR2 = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR2 = f12;
                }
            } else {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0VarR, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -113;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i13 != 0) {
                    fR2 = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR2 = f12;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1249392198, i12, -1, "androidx.compose.material.Divider (Divider.kt:50)");
            }
            if (fR2 == 0.0f) {
                a0VarV = androidx.compose.ui.a0.E;
            } else {
                a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, fR2, 0.0f, 0.0f, 0.0f, 14, null);
            }
            if (androidx.compose.ui.unit.h.x(fR, androidx.compose.ui.unit.h.f42689b.a())) {
                c0VarR.E(-455967894);
                fR3 = androidx.compose.ui.unit.h.r(1.0f / ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).getDensity());
                c0VarR.A();
            } else {
                c0VarR.E(-455901337);
                c0VarR.A();
                fR3 = fR;
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3.B2(a0VarV), 0.0f, 1, null), fR3), jW, null, 2, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f13 = fR2;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            f13 = f12;
        }
        f14 = fR;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var7 = a0Var3;
            final long j14 = jW;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.t5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u5.c(a0Var7, j14, f14, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.a0 a0Var, long j10, float f10, float f11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(a0Var, j10, f10, f11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
