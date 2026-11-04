package androidx.compose.material;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,169:1\n75#2:170\n75#2:171\n75#2:178\n1282#3,6:172\n1282#3,6:179\n1282#3,6:185\n57#4:191\n61#4:194\n60#5:192\n70#5:195\n22#6:193\n113#7:196\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:170\n100#1:171\n134#1:178\n102#1:172,6\n137#1:179,6\n140#1:185,6\n165#1:191\n165#1:194\n165#1:192\n165#1:195\n165#1:193\n168#1:196\n*E\n"})
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f23122a = androidx.compose.foundation.layout.i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24));

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void c(@NotNull androidx.compose.ui.graphics.t1 t1Var, @Nullable String str, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0Var.W(x4.a())).M(), ((Number) c0Var.W(w4.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-554892675, i10, -1, "androidx.compose.material.Icon (Icon.kt:100)");
        }
        boolean zD = c0Var.D(t1Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            BitmapPainter bitmapPainter = new BitmapPainter(t1Var, 0L, 0L, 6, null);
            c0Var.Y(bitmapPainter);
            objI0 = bitmapPainter;
        }
        d((BitmapPainter) objI0, str, a0Var2, jW, c0Var, i10 & 8176, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0171  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:86:0x0125  */
    /* JADX WARN: Code duplicated, block: B:87:0x0129  */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    /* JADX WARN: Code duplicated, block: B:93:0x014c  */
    /* JADX WARN: Code duplicated, block: B:94:0x014e  */
    /* JADX WARN: Code duplicated, block: B:99:0x015d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@NotNull final androidx.compose.ui.graphics.painter.b bVar, @Nullable final String str, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long j11;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long jW;
        androidx.compose.ui.a0 a0Var5;
        boolean z11;
        Object objI0;
        long j13;
        androidx.compose.ui.a0 a0VarF;
        boolean z12;
        Object objI1;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1142959010);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(bVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(str) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                j11 = j10;
                if ((i11 & 8) == 0 || !c0VarR.L(j11)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i12 |= i13;
            } else {
                j11 = j10;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), ((Number) c0VarR.W(w4.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -7169;
                    } else {
                        jW = j11;
                    }
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.u();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    long j14 = j11;
                    a0Var5 = a0Var2;
                    jW = j14;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1142959010, i12, -1, "androidx.compose.material.Icon (Icon.kt:134)");
                }
                z11 = (((i12 & 7168) ^ 3072) <= 2048 && c0VarR.L(jW)) || (i12 & 3072) == 2048;
                objI0 = c0VarR.i0();
                if (!z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    if (androidx.compose.ui.graphics.q0.y(jW, androidx.compose.ui.graphics.q0.f38131b.u())) {
                        j13 = jW;
                        objI0 = null;
                    } else {
                        j13 = jW;
                        objI0 = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j13, 0, 2, null);
                    }
                    c0VarR.Y(objI0);
                } else {
                    j13 = jW;
                }
                androidx.compose.ui.graphics.r0 r0Var = (androidx.compose.ui.graphics.r0) objI0;
                if (str != null) {
                    c0VarR.E(609231686);
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material.g9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return i9.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI1, 1, null);
                    c0VarR.A();
                } else {
                    c0VarR.E(609390468);
                    c0VarR.A();
                    a0VarF = androidx.compose.ui.a0.E;
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.ui.draw.t.b(h(androidx.compose.ui.graphics.q1.l(a0Var5), bVar), bVar, false, null, androidx.compose.ui.layout.l.f39405a.i(), 0.0f, r0Var, 22, null).B2(a0VarF), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j12 = j13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i9.g(bVar, str, a0Var3, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            j11 = j10;
            if ((i11 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        } else {
            j11 = j10;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), ((Number) c0VarR.W(w4.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -7169;
                } else {
                    jW = j11;
                }
                a0Var5 = a0Var4;
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), ((Number) c0VarR.W(w4.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -7169;
                } else {
                    jW = j11;
                }
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1142959010, i12, -1, "androidx.compose.material.Icon (Icon.kt:134)");
            }
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            objI0 = c0VarR.i0();
            if (z11) {
                if (androidx.compose.ui.graphics.q0.y(jW, androidx.compose.ui.graphics.q0.f38131b.u())) {
                    j13 = jW;
                    objI0 = null;
                } else {
                    j13 = jW;
                    objI0 = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j13, 0, 2, null);
                }
                c0VarR.Y(objI0);
            } else {
                if (androidx.compose.ui.graphics.q0.y(jW, androidx.compose.ui.graphics.q0.f38131b.u())) {
                    j13 = jW;
                    objI0 = null;
                } else {
                    j13 = jW;
                    objI0 = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j13, 0, 2, null);
                }
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.graphics.r0 r0Var2 = (androidx.compose.ui.graphics.r0) objI0;
            if (str != null) {
                c0VarR.E(609231686);
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    objI1 = new Function1() { // from class: androidx.compose.material.g9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return i9.f(str, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material.g9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return i9.f(str, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                a0VarF = androidx.compose.ui.semantics.t.f(aVar2, false, (Function1) objI1, 1, null);
                c0VarR.A();
            } else {
                c0VarR.E(609390468);
                c0VarR.A();
                a0VarF = androidx.compose.ui.a0.E;
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.ui.draw.t.b(h(androidx.compose.ui.graphics.q1.l(a0Var5), bVar), bVar, false, null, androidx.compose.ui.layout.l.f39405a.i(), 0.0f, r0Var2, 22, null).B2(a0VarF), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j12 = j13;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = j11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.h9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i9.g(bVar, str, a0Var3, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void e(@NotNull androidx.compose.ui.graphics.vector.d dVar, @Nullable String str, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0Var.W(x4.a())).M(), ((Number) c0Var.W(w4.c())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-800853103, i10, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        d(androidx.compose.ui.graphics.vector.u.j(dVar, c0Var, i10 & 14), str, a0Var2, jW, c0Var, VectorPainter.f38280o | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 896) | (i10 & 7168), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.e());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.graphics.painter.b bVar, String str, androidx.compose.ui.a0 a0Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(bVar, str, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.painter.b bVar) {
        return a0Var.B2((n0.n.k(bVar.l(), n0.n.f332724b.a()) || i(bVar.l())) ? f23122a : androidx.compose.ui.a0.E);
    }

    private static final boolean i(long j10) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j10 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
    }
}
