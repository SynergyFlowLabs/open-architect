package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1427:1\n113#2:1428\n113#2:1430\n113#2:1431\n110#3:1429\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n1056#1:1428\n981#1:1430\n987#1:1431\n1103#1:1429\n*E\n"})
public final class k30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k30 f29939a = new k30();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f29940b = androidx.compose.ui.unit.h.r(90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f29941c = androidx.compose.ui.unit.h.r(52);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29942d = 0;

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n1#1,110:1\n1104#2,3:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f30 f29943a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f30 f30Var) {
            super(1);
            this.f29943a = f30Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("tabIndicatorOffset");
            t2Var.e(this.f29943a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1427:1\n1282#2,6:1428\n85#3:1434\n85#3:1435\n32#4:1436\n80#5:1437\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n*L\n1121#1:1428,6\n1110#1:1434\n1115#1:1435\n1121#1:1436\n1121#1:1437\n*E\n"})
    static final class b implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f30 f29944a;

        b(f30 f30Var) {
            this.f29944a = f30Var;
        }

        private static final float f(androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var) {
            return n7Var.getValue().O();
        }

        private static final float i(androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var) {
            return n7Var.getValue().O();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.q k(androidx.compose.runtime.n7 n7Var, androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) dVar.g6(i(n7Var))) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a)));
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1541271084);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1541271084, i10, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1108)");
            }
            float fD = this.f29944a.d();
            d0.h1 h1Var = d0.h1.DefaultSpatial;
            androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarD = androidx.compose.animation.core.f.d(fD, hm.b(h1Var, c0Var, 6), null, null, c0Var, 0, 12);
            final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarD2 = androidx.compose.animation.core.f.d(this.f29944a.b(), hm.b(h1Var, c0Var, 6), null, null, c0Var, 0, 12);
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.H(androidx.compose.foundation.layout.i6.h(a0Var, 0.0f, 1, null), androidx.compose.ui.e.f37317a.g(), false, 2, null);
            boolean zD = c0Var.D(n7VarD2);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.l30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k30.b.k(n7VarD2, (androidx.compose.ui.unit.d) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.layout.i6.B(androidx.compose.foundation.layout.s4.j(a0VarH, (Function1) objI0), f(n7VarD));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return d(a0Var, c0Var, num.intValue());
        }
    }

    private k30() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(k30 k30Var, androidx.compose.ui.a0 a0Var, float f10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k30Var.d(a0Var, f10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(k30 k30Var, androidx.compose.ui.a0 a0Var, float f10, float f11, long j10, androidx.compose.ui.graphics.q3 q3Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k30Var.f(a0Var, f10, f11, j10, q3Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(k30 k30Var, androidx.compose.ui.a0 a0Var, float f10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k30Var.h(a0Var, f10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @kotlin.l(message = "Use TabRowDefaults.primaryContainerColor instead", replaceWith = @kotlin.b1(expression = "primaryContainerColor", imports = {}))
    public static /* synthetic */ void k() {
    }

    @kotlin.l(message = "Use TabRowDefaults.primaryContentColor instead", replaceWith = @kotlin.b1(expression = "primaryContentColor", imports = {}))
    public static /* synthetic */ void m() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[PHI: r2 r3 r4
      0x008e: PHI (r2v7 androidx.compose.ui.a0) = (r2v4 androidx.compose.ui.a0), (r2v9 androidx.compose.ui.a0) binds: [B:58:0x00a3, B:49:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r3v12 float) = (r3v8 float), (r3v13 float) binds: [B:58:0x00a3, B:49:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r4v16 int) = (r4v9 int), (r4v17 int) binds: [B:58:0x00a3, B:49:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(message = "Use SecondaryIndicator instead.", replaceWith = @kotlin.b1(expression = "SecondaryIndicator(modifier, height, color)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void d(@Nullable androidx.compose.ui.a0 a0Var, float f10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        float f11;
        long j11;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final float fG;
        final long j12;
        androidx.compose.runtime.s5 s5VarT;
        long jO;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1454716052);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 32 : 16;
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
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
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
                    if (i14 != 0) {
                        fG = d0.b2.f267655a.g();
                    } else {
                        fG = f11;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jO = o6.o(pj.f31758a.a(c0VarR, 6), d0.b2.f267655a.f());
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1454716052, i12, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1038)");
                    }
                    androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), fG), jO, null, 2, null), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = jO;
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    a0Var3 = a0Var2;
                    fG = f11;
                }
                jO = j11;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1454716052, i12, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1038)");
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), fG), jO, null, 2, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = jO;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                fG = f11;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.h30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k30.e(this.f28111a, a0Var3, fG, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        f11 = f10;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
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
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
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
                if (i14 != 0) {
                    fG = d0.b2.f267655a.g();
                } else {
                    fG = f11;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jO = o6.o(pj.f31758a.a(c0VarR, 6), d0.b2.f267655a.f());
                } else {
                    jO = j11;
                }
            } else {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    fG = d0.b2.f267655a.g();
                } else {
                    fG = f11;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jO = o6.o(pj.f31758a.a(c0VarR, 6), d0.b2.f267655a.f());
                } else {
                    jO = j11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1454716052, i12, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1038)");
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), fG), jO, null, 2, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = jO;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            fG = f11;
            j12 = j11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.h30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k30.e(this.f28111a, a0Var3, fG, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void f(@Nullable androidx.compose.ui.a0 a0Var, float f10, float f11, long j10, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        float fR;
        int i13;
        float fG;
        int i14;
        long jR;
        int i15;
        androidx.compose.ui.graphics.q3 q3VarH;
        int i16;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final float f12;
        final float f13;
        final long j11;
        final androidx.compose.ui.graphics.q3 q3Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1895596205);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                fR = f10;
                i12 |= c0VarR.I(fR) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    fG = f11;
                    if (c0VarR.I(fG)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        jR = j10;
                        int i19 = c0VarR.L(jR) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        jR = j10;
                    }
                    i12 |= i19;
                } else {
                    jR = j10;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        q3VarH = q3Var;
                        if (c0VarR.D(q3VarH)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i17 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i18 != 0) {
                                fR = androidx.compose.ui.unit.h.r(24);
                            }
                            if (i13 != 0) {
                                fG = d0.b2.f267655a.g();
                            }
                            if ((i11 & 8) != 0) {
                                jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                                i12 &= -7169;
                            }
                            if (i15 != 0) {
                                q3VarH = d0.b2.f267655a.h();
                            }
                        } else {
                            c0VarR.u();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            a0Var3 = a0Var2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1895596205, i12, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
                        }
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.t(androidx.compose.foundation.layout.i6.l(a0Var3, fG), fR), jR, q3VarH), c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    f12 = fR;
                    f13 = fG;
                    j11 = jR;
                    q3Var2 = q3VarH;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.i30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k30.g(this.f28318a, a0Var3, f12, f13, j11, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                q3VarH = q3Var;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i18 != 0) {
                            fR = androidx.compose.ui.unit.h.r(24);
                        }
                        if (i13 != 0) {
                            fG = d0.b2.f267655a.g();
                        }
                        if ((i11 & 8) != 0) {
                            jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                            i12 &= -7169;
                        }
                        if (i15 != 0) {
                            q3VarH = d0.b2.f267655a.h();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i18 != 0) {
                            fR = androidx.compose.ui.unit.h.r(24);
                        }
                        if (i13 != 0) {
                            fG = d0.b2.f267655a.g();
                        }
                        if ((i11 & 8) != 0) {
                            jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                            i12 &= -7169;
                        }
                        if (i15 != 0) {
                            q3VarH = d0.b2.f267655a.h();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1895596205, i12, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.t(androidx.compose.foundation.layout.i6.l(a0Var3, fG), fR), jR, q3VarH), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                f12 = fR;
                f13 = fG;
                j11 = jR;
                q3Var2 = q3VarH;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.i30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k30.g(this.f28318a, a0Var3, f12, f13, j11, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            fG = f11;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jR = j10;
                    if (c0VarR.L(jR)) {
                    }
                    i12 |= i19;
                } else {
                    jR = j10;
                }
                i12 |= i19;
            } else {
                jR = j10;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    q3VarH = q3Var;
                    if (c0VarR.D(q3VarH)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i18 != 0) {
                            fR = androidx.compose.ui.unit.h.r(24);
                        }
                        if (i13 != 0) {
                            fG = d0.b2.f267655a.g();
                        }
                        if ((i11 & 8) != 0) {
                            jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                            i12 &= -7169;
                        }
                        if (i15 != 0) {
                            q3VarH = d0.b2.f267655a.h();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i18 != 0) {
                            fR = androidx.compose.ui.unit.h.r(24);
                        }
                        if (i13 != 0) {
                            fG = d0.b2.f267655a.g();
                        }
                        if ((i11 & 8) != 0) {
                            jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                            i12 &= -7169;
                        }
                        if (i15 != 0) {
                            q3VarH = d0.b2.f267655a.h();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1895596205, i12, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.t(androidx.compose.foundation.layout.i6.l(a0Var3, fG), fR), jR, q3VarH), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                f12 = fR;
                f13 = fG;
                j11 = jR;
                q3Var2 = q3VarH;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.i30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k30.g(this.f28318a, a0Var3, f12, f13, j11, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            q3VarH = q3Var;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        fR = androidx.compose.ui.unit.h.r(24);
                    }
                    if (i13 != 0) {
                        fG = d0.b2.f267655a.g();
                    }
                    if ((i11 & 8) != 0) {
                        jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                        i12 &= -7169;
                    }
                    if (i15 != 0) {
                        q3VarH = d0.b2.f267655a.h();
                    }
                } else {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        fR = androidx.compose.ui.unit.h.r(24);
                    }
                    if (i13 != 0) {
                        fG = d0.b2.f267655a.g();
                    }
                    if ((i11 & 8) != 0) {
                        jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                        i12 &= -7169;
                    }
                    if (i15 != 0) {
                        q3VarH = d0.b2.f267655a.h();
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1895596205, i12, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.t(androidx.compose.foundation.layout.i6.l(a0Var3, fG), fR), jR, q3VarH), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            f12 = fR;
            f13 = fG;
            j11 = jR;
            q3Var2 = q3VarH;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.i30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k30.g(this.f28318a, a0Var3, f12, f13, j11, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        fR = f10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                fG = f11;
                if (c0VarR.I(fG)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jR = j10;
                    if (c0VarR.L(jR)) {
                    }
                    i12 |= i19;
                } else {
                    jR = j10;
                }
                i12 |= i19;
            } else {
                jR = j10;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    q3VarH = q3Var;
                    if (c0VarR.D(q3VarH)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i18 != 0) {
                            fR = androidx.compose.ui.unit.h.r(24);
                        }
                        if (i13 != 0) {
                            fG = d0.b2.f267655a.g();
                        }
                        if ((i11 & 8) != 0) {
                            jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                            i12 &= -7169;
                        }
                        if (i15 != 0) {
                            q3VarH = d0.b2.f267655a.h();
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i18 != 0) {
                            fR = androidx.compose.ui.unit.h.r(24);
                        }
                        if (i13 != 0) {
                            fG = d0.b2.f267655a.g();
                        }
                        if ((i11 & 8) != 0) {
                            jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                            i12 &= -7169;
                        }
                        if (i15 != 0) {
                            q3VarH = d0.b2.f267655a.h();
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1895596205, i12, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.t(androidx.compose.foundation.layout.i6.l(a0Var3, fG), fR), jR, q3VarH), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                f12 = fR;
                f13 = fG;
                j11 = jR;
                q3Var2 = q3VarH;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.i30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k30.g(this.f28318a, a0Var3, f12, f13, j11, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            q3VarH = q3Var;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        fR = androidx.compose.ui.unit.h.r(24);
                    }
                    if (i13 != 0) {
                        fG = d0.b2.f267655a.g();
                    }
                    if ((i11 & 8) != 0) {
                        jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                        i12 &= -7169;
                    }
                    if (i15 != 0) {
                        q3VarH = d0.b2.f267655a.h();
                    }
                } else {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        fR = androidx.compose.ui.unit.h.r(24);
                    }
                    if (i13 != 0) {
                        fG = d0.b2.f267655a.g();
                    }
                    if ((i11 & 8) != 0) {
                        jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                        i12 &= -7169;
                    }
                    if (i15 != 0) {
                        q3VarH = d0.b2.f267655a.h();
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1895596205, i12, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.t(androidx.compose.foundation.layout.i6.l(a0Var3, fG), fR), jR, q3VarH), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            f12 = fR;
            f13 = fG;
            j11 = jR;
            q3Var2 = q3VarH;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.i30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k30.g(this.f28318a, a0Var3, f12, f13, j11, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        fG = f11;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jR = j10;
                if (c0VarR.L(jR)) {
                }
                i12 |= i19;
            } else {
                jR = j10;
            }
            i12 |= i19;
        } else {
            jR = j10;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                q3VarH = q3Var;
                if (c0VarR.D(q3VarH)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        fR = androidx.compose.ui.unit.h.r(24);
                    }
                    if (i13 != 0) {
                        fG = d0.b2.f267655a.g();
                    }
                    if ((i11 & 8) != 0) {
                        jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                        i12 &= -7169;
                    }
                    if (i15 != 0) {
                        q3VarH = d0.b2.f267655a.h();
                    }
                } else {
                    if (i17 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i18 != 0) {
                        fR = androidx.compose.ui.unit.h.r(24);
                    }
                    if (i13 != 0) {
                        fG = d0.b2.f267655a.g();
                    }
                    if ((i11 & 8) != 0) {
                        jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                        i12 &= -7169;
                    }
                    if (i15 != 0) {
                        q3VarH = d0.b2.f267655a.h();
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1895596205, i12, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.t(androidx.compose.foundation.layout.i6.l(a0Var3, fG), fR), jR, q3VarH), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            f12 = fR;
            f13 = fG;
            j11 = jR;
            q3Var2 = q3VarH;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.i30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k30.g(this.f28318a, a0Var3, f12, f13, j11, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        q3VarH = q3Var;
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i18 != 0) {
                    fR = androidx.compose.ui.unit.h.r(24);
                }
                if (i13 != 0) {
                    fG = d0.b2.f267655a.g();
                }
                if ((i11 & 8) != 0) {
                    jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                    i12 &= -7169;
                }
                if (i15 != 0) {
                    q3VarH = d0.b2.f267655a.h();
                }
            } else {
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i18 != 0) {
                    fR = androidx.compose.ui.unit.h.r(24);
                }
                if (i13 != 0) {
                    fG = d0.b2.f267655a.g();
                }
                if ((i11 & 8) != 0) {
                    jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                    i12 &= -7169;
                }
                if (i15 != 0) {
                    q3VarH = d0.b2.f267655a.h();
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1895596205, i12, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
            }
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.t(androidx.compose.foundation.layout.i6.l(a0Var3, fG), fR), jR, q3VarH), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        f12 = fR;
        f13 = fG;
        j11 = jR;
        q3Var2 = q3VarH;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.i30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k30.g(this.f28318a, a0Var3, f12, f13, j11, q3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[PHI: r2 r3 r4
      0x008e: PHI (r2v7 androidx.compose.ui.a0) = (r2v4 androidx.compose.ui.a0), (r2v10 androidx.compose.ui.a0) binds: [B:58:0x00a3, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r3v13 float) = (r3v9 float), (r3v14 float) binds: [B:58:0x00a3, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r4v16 int) = (r4v9 int), (r4v17 int) binds: [B:58:0x00a3, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00df  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void h(@Nullable androidx.compose.ui.a0 a0Var, float f10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        float f11;
        long j11;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final float fG;
        final long j12;
        androidx.compose.runtime.s5 s5VarT;
        long jR;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1498258020);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 32 : 16;
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
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
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
                    if (i14 != 0) {
                        fG = d0.b2.f267655a.g();
                    } else {
                        fG = f11;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1498258020, i12, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1081)");
                    }
                    androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), fG), jR, null, 2, null), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = jR;
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    a0Var3 = a0Var2;
                    fG = f11;
                }
                jR = j11;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1498258020, i12, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1081)");
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), fG), jR, null, 2, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = jR;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                fG = f11;
                j12 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k30.i(this.f29639a, a0Var3, fG, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        f11 = f10;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
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
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
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
                if (i14 != 0) {
                    fG = d0.b2.f267655a.g();
                } else {
                    fG = f11;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                } else {
                    jR = j11;
                }
            } else {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    fG = d0.b2.f267655a.g();
                } else {
                    fG = f11;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jR = o6.r(d0.b2.f267655a.f(), c0VarR, 6);
                } else {
                    jR = j11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1498258020, i12, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1081)");
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), fG), jR, null, 2, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = jR;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            fG = f11;
            j12 = j11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.j30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k30.i(this.f29639a, a0Var3, fG, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long j(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2026555673, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:994)");
        }
        long jR = o6.r(d0.b2.f267655a.l(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContentColor")
    public final long l(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1163072359, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:1010)");
        }
        long jR = o6.r(d0.b2.f267655a.i(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getPrimaryContainerColor")
    public final long n(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2069154037, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:998)");
        }
        long jR = o6.r(d0.b2.f267655a.l(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getPrimaryContentColor")
    public final long o(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1410362619, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1014)");
        }
        long jR = o6.r(d0.b2.f267655a.i(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float p() {
        return f29941c;
    }

    public final float q() {
        return f29940b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getSecondaryContainerColor")
    public final long r(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1938007129, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1002)");
        }
        long jR = o6.r(d0.i2.f268258a.c(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getSecondaryContentColor")
    public final long s(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1166419479, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1018)");
        }
        long jR = o6.r(d0.i2.f268258a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Solely for use alongside deprecated TabRowDefaults.Indicator method. For recommended PrimaryIndicator and SecondaryIndicator methods, please use TabIndicatorScope.tabIndicatorOffset method.")
    @NotNull
    public final androidx.compose.ui.a0 t(@NotNull androidx.compose.ui.a0 a0Var, @NotNull f30 f30Var) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new a(f30Var) : androidx.compose.ui.platform.r2.b(), new b(f30Var));
    }
}
