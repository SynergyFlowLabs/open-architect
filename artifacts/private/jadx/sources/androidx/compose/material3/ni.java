package androidx.compose.material3;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n75#2:221\n75#2:222\n75#2:229\n1282#3,6:223\n1282#3,6:230\n1282#3,6:236\n1282#3,6:242\n57#4:248\n61#4:251\n60#5:249\n70#5:252\n22#6:250\n1#7:253\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n*L\n69#1:221\n105#1:222\n142#1:229\n107#1:223,6\n145#1:230,6\n148#1:236,6\n196#1:242,6\n216#1:248\n216#1:251\n216#1:249\n216#1:252\n216#1:250\n*E\n"})
public final class ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f31042a = androidx.compose.foundation.layout.i6.w(androidx.compose.ui.a0.E, d0.n2.f268546a.f());

    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void i(@NotNull final androidx.compose.ui.graphics.painter.b bVar, @Nullable final androidx.compose.ui.graphics.x0 x0Var, @Nullable final String str, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        String str2;
        final androidx.compose.ui.a0 a0Var2;
        boolean z10;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        boolean zK0;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1755070997);
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
            i12 |= c0VarR.k0(x0Var) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.D(str2) ? 256 : 128;
            }
        }
        int i13 = i11 & 8;
        if (i13 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1755070997, i12, -1, "androidx.compose.material3.Icon (Icon.kt:189)");
                }
                long jU = androidx.compose.ui.graphics.q0.f38131b.u();
                zK0 = c0VarR.k0(x0Var);
                objI0 = c0VarR.i0();
                if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.gi
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ni.j(x0Var, (androidx.compose.ui.draw.i) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                o(bVar, str2, androidx.compose.ui.draw.n.c(a0Var3, (Function1) objI0), jU, c0VarR, (i12 & 14) | 3072 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.hi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ni.m(bVar, x0Var, str, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1755070997, i12, -1, "androidx.compose.material3.Icon (Icon.kt:189)");
            }
            long jU2 = androidx.compose.ui.graphics.q0.f38131b.u();
            zK0 = c0VarR.k0(x0Var);
            objI0 = c0VarR.i0();
            if (zK0) {
                objI0 = new Function1() { // from class: androidx.compose.material3.gi
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ni.j(x0Var, (androidx.compose.ui.draw.i) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material3.gi
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ni.j(x0Var, (androidx.compose.ui.draw.i) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            o(bVar, str2, androidx.compose.ui.draw.n.c(a0Var3, (Function1) objI0), jU2, c0VarR, (i12 & 14) | 3072 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
        } else {
            c0VarR.u();
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.hi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ni.m(bVar, x0Var, str, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.o j(androidx.compose.ui.graphics.x0 x0Var, androidx.compose.ui.draw.i iVar) {
        final androidx.compose.ui.graphics.layer.c cVarJ = iVar.J();
        androidx.compose.ui.draw.i.U(iVar, cVarJ, null, null, 0L, new Function1() { // from class: androidx.compose.material3.ji
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ni.l((androidx.compose.ui.graphics.drawscope.c) obj);
            }
        }, 7, null);
        if (x0Var != null) {
            cVarJ.a0(androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, x0Var.a(), 0, 2, null));
        }
        return iVar.N(new Function1() { // from class: androidx.compose.material3.ki
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ni.k(cVarJ, (androidx.compose.ui.graphics.drawscope.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.ui.graphics.layer.c cVar, androidx.compose.ui.graphics.drawscope.c cVar2) {
        androidx.compose.ui.graphics.layer.e.a(cVar2, cVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.graphics.x0 x0Var, String str, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(bVar, x0Var, str, a0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void n(@NotNull final androidx.compose.ui.graphics.t1 t1Var, @Nullable final String str, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        String str2;
        androidx.compose.ui.a0 a0Var2;
        long j11;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i13;
        androidx.compose.ui.a0 a0Var5;
        long jM;
        boolean zD;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1092052280);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(t1Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.D(str2) ? 32 : 16;
            }
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    int i15 = c0VarR.L(j11) ? 2048 : 1024;
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                i12 |= i15;
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
                        i13 = i12 & (-7169);
                        a0Var5 = a0Var4;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    } else {
                        i13 = i12;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1092052280, i13, -1, "androidx.compose.material3.Icon (Icon.kt:105)");
                    }
                    zD = c0VarR.D(t1Var);
                    objI0 = c0VarR.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        BitmapPainter bitmapPainter = new BitmapPainter(t1Var, 0L, 0L, 6, null);
                        c0VarR.Y(bitmapPainter);
                        objI0 = bitmapPainter;
                    }
                    o((BitmapPainter) objI0, str2, a0Var5, jM, c0VarR, i13 & 8176, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    j12 = jM;
                } else {
                    c0VarR.u();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    i13 = i12;
                    a0Var5 = a0Var2;
                }
                jM = j11;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1092052280, i13, -1, "androidx.compose.material3.Icon (Icon.kt:105)");
                }
                zD = c0VarR.D(t1Var);
                objI0 = c0VarR.i0();
                if (zD) {
                    BitmapPainter bitmapPainter2 = new BitmapPainter(t1Var, 0L, 0L, 6, null);
                    c0VarR.Y(bitmapPainter2);
                    objI0 = bitmapPainter2;
                } else {
                    BitmapPainter bitmapPainter3 = new BitmapPainter(t1Var, 0L, 0L, 6, null);
                    c0VarR.Y(bitmapPainter3);
                    objI0 = bitmapPainter3;
                }
                o((BitmapPainter) objI0, str2, a0Var5, jM, c0VarR, i13 & 8176, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j12 = jM;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ii
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ni.r(t1Var, str, a0Var3, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j11 = j10;
                if (c0VarR.L(j11)) {
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            i12 |= i15;
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
                    i13 = i12 & (-7169);
                    a0Var5 = a0Var4;
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                } else {
                    i13 = i12;
                    a0Var5 = a0Var4;
                    jM = j11;
                }
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    i13 = i12 & (-7169);
                    a0Var5 = a0Var4;
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                } else {
                    i13 = i12;
                    a0Var5 = a0Var4;
                    jM = j11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1092052280, i13, -1, "androidx.compose.material3.Icon (Icon.kt:105)");
            }
            zD = c0VarR.D(t1Var);
            objI0 = c0VarR.i0();
            if (zD) {
                BitmapPainter bitmapPainter4 = new BitmapPainter(t1Var, 0L, 0L, 6, null);
                c0VarR.Y(bitmapPainter4);
                objI0 = bitmapPainter4;
            } else {
                BitmapPainter bitmapPainter5 = new BitmapPainter(t1Var, 0L, 0L, 6, null);
                c0VarR.Y(bitmapPainter5);
                objI0 = bitmapPainter5;
            }
            o((BitmapPainter) objI0, str2, a0Var5, jM, c0VarR, i13 & 8176, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j12 = jM;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = j11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ii
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ni.r(t1Var, str, a0Var3, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0159  */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0191  */
    /* JADX WARN: Code duplicated, block: B:110:0x019c  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x0133  */
    /* JADX WARN: Code duplicated, block: B:94:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x0145  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void o(@NotNull final androidx.compose.ui.graphics.painter.b bVar, @Nullable final String str, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long j11;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long jM;
        androidx.compose.ui.a0 a0Var5;
        boolean z11;
        Object objI0;
        long j13;
        androidx.compose.ui.a0 a0VarF;
        boolean z12;
        Object objI1;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2142239481);
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
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i12 &= -7169;
                    } else {
                        jM = j11;
                    }
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.u();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    long j14 = j11;
                    a0Var5 = a0Var2;
                    jM = j14;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2142239481, i12, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
                }
                z11 = (((i12 & 7168) ^ 3072) <= 2048 && c0VarR.L(jM)) || (i12 & 3072) == 2048;
                objI0 = c0VarR.i0();
                if (!z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    if (androidx.compose.ui.graphics.q0.y(jM, androidx.compose.ui.graphics.q0.f38131b.u())) {
                        j13 = jM;
                        objI0 = null;
                    } else {
                        j13 = jM;
                        objI0 = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j13, 0, 2, null);
                    }
                    c0VarR.Y(objI0);
                } else {
                    j13 = jM;
                }
                androidx.compose.ui.graphics.r0 r0Var = (androidx.compose.ui.graphics.r0) objI0;
                if (str != null) {
                    c0VarR.E(-536990979);
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.li
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ni.s(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI1, 1, null);
                    c0VarR.A();
                } else {
                    c0VarR.E(-536832197);
                    c0VarR.A();
                    a0VarF = androidx.compose.ui.a0.E;
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.ui.draw.t.b(u(androidx.compose.ui.graphics.q1.l(a0Var5), bVar), bVar, false, null, androidx.compose.ui.layout.l.f39405a.i(), 0.0f, r0Var, 22, null).B2(a0VarF), c0VarR, 0);
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
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ni.t(bVar, str, a0Var3, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    i12 &= -7169;
                } else {
                    jM = j11;
                }
                a0Var5 = a0Var4;
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    i12 &= -7169;
                } else {
                    jM = j11;
                }
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2142239481, i12, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
            }
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            objI0 = c0VarR.i0();
            if (z11) {
                if (androidx.compose.ui.graphics.q0.y(jM, androidx.compose.ui.graphics.q0.f38131b.u())) {
                    j13 = jM;
                    objI0 = null;
                } else {
                    j13 = jM;
                    objI0 = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j13, 0, 2, null);
                }
                c0VarR.Y(objI0);
            } else {
                if (androidx.compose.ui.graphics.q0.y(jM, androidx.compose.ui.graphics.q0.f38131b.u())) {
                    j13 = jM;
                    objI0 = null;
                } else {
                    j13 = jM;
                    objI0 = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j13, 0, 2, null);
                }
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.graphics.r0 r0Var2 = (androidx.compose.ui.graphics.r0) objI0;
            if (str != null) {
                c0VarR.E(-536990979);
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI1 = c0VarR.i0();
                if (z12) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.li
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ni.s(str, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.li
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ni.s(str, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                a0VarF = androidx.compose.ui.semantics.t.f(aVar2, false, (Function1) objI1, 1, null);
                c0VarR.A();
            } else {
                c0VarR.E(-536832197);
                c0VarR.A();
                a0VarF = androidx.compose.ui.a0.E;
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.ui.draw.t.b(u(androidx.compose.ui.graphics.q1.l(a0Var5), bVar), bVar, false, null, androidx.compose.ui.layout.l.f39405a.i(), 0.0f, r0Var2, 22, null).B2(a0VarF), c0VarR, 0);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.mi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ni.t(bVar, str, a0Var3, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void p(@NotNull final androidx.compose.ui.graphics.vector.d dVar, @Nullable final String str, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        String str2;
        final androidx.compose.ui.a0 a0Var2;
        final long j11;
        boolean z10;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.a0 a0Var4;
        long jM;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-126890956);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.D(str2) ? 32 : 16;
            }
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    int i14 = c0VarR.L(j11) ? 2048 : 1024;
                    i12 |= i14;
                } else {
                    j11 = j10;
                }
                i12 |= i14;
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
                    if (i13 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var4 = a0Var3;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    } else {
                        a0Var4 = a0Var3;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
                    }
                    o(androidx.compose.ui.graphics.vector.u.j(dVar, c0VarR, i12 & 14), str2, a0Var4, jM, c0VarR, VectorPainter.f38280o | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var4;
                    j11 = jM;
                } else {
                    c0VarR.u();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    a0Var4 = a0Var2;
                }
                jM = j11;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
                }
                o(androidx.compose.ui.graphics.vector.u.j(dVar, c0VarR, i12 & 14), str2, a0Var4, jM, c0VarR, VectorPainter.f38280o | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var4;
                j11 = jM;
            } else {
                c0VarR.u();
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.fi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ni.q(dVar, str, a0Var2, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j11 = j10;
                if (c0VarR.L(j11)) {
                }
                i12 |= i14;
            } else {
                j11 = j10;
            }
            i12 |= i14;
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
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    a0Var4 = a0Var3;
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                } else {
                    a0Var4 = a0Var3;
                    jM = j11;
                }
            } else {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    a0Var4 = a0Var3;
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                } else {
                    a0Var4 = a0Var3;
                    jM = j11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
            }
            o(androidx.compose.ui.graphics.vector.u.j(dVar, c0VarR, i12 & 14), str2, a0Var4, jM, c0VarR, VectorPainter.f38280o | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var4;
            j11 = jM;
        } else {
            c0VarR.u();
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.fi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ni.q(dVar, str, a0Var2, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.graphics.vector.d dVar, String str, androidx.compose.ui.a0 a0Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        p(dVar, str, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.ui.graphics.t1 t1Var, String str, androidx.compose.ui.a0 a0Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        n(t1Var, str, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.e());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(androidx.compose.ui.graphics.painter.b bVar, String str, androidx.compose.ui.a0 a0Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(bVar, str, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.a0 u(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.painter.b bVar) {
        return a0Var.B2((n0.n.k(bVar.l(), n0.n.f332724b.a()) || v(bVar.l())) ? f31042a : androidx.compose.ui.a0.E);
    }

    private static final boolean v(long j10) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j10 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
    }
}
