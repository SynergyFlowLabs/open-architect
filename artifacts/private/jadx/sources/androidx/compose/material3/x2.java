package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@af
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,548:1\n189#2:549\n1282#3,6:550\n113#4:556\n113#4:557\n113#4:558\n113#4:559\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n*L\n417#1:549\n420#1:550,6\n394#1:556\n397#1:557\n404#1:558\n406#1:559\n*E\n"})
public final class x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f34348c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f34350e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34352g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x2 f34346a = new x2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f34347b = d0.l2.f268424a.g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f34349d = androidx.compose.ui.unit.h.r(640);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f34351f = androidx.compose.ui.unit.h.r(125);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f34353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34354b;

        a(float f10, float f11) {
            this.f34353a = f10;
            this.f34354b = f11;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1039573072, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:425)");
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.layout.i6.y(androidx.compose.ui.a0.E, this.f34353a, this.f34354b), c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static {
        float f10 = 56;
        f34348c = androidx.compose.ui.unit.h.r(f10);
        f34350e = androidx.compose.ui.unit.h.r(f10);
    }

    private x2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(x2 x2Var, androidx.compose.ui.a0 a0Var, float f10, float f11, androidx.compose.ui.graphics.q3 q3Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        x2Var.c(a0Var, f10, f11, q3Var, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018c  */
    /* JADX WARN: Code duplicated, block: B:105:0x019b  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0145  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void c(@Nullable androidx.compose.ui.a0 a0Var, float f10, float f11, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        float fE;
        int i13;
        float fD;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarG;
        long jR;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final float f12;
        final float f13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        final String strB;
        boolean zD;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1364277227);
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
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                fE = f10;
                i12 |= c0VarR.I(fE) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    fD = f11;
                    if (c0VarR.I(fD)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        q3VarG = q3Var;
                        int i17 = c0VarR.D(q3VarG) ? 2048 : 1024;
                        i12 |= i17;
                    } else {
                        q3VarG = q3Var;
                    }
                    i12 |= i17;
                } else {
                    q3VarG = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jR = j10;
                        int i18 = c0VarR.L(jR) ? 16384 : 8192;
                        i12 |= i18;
                    } else {
                        jR = j10;
                    }
                    i12 |= i18;
                } else {
                    jR = j10;
                }
                if ((i12 & 9363) != 9362) {
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
                        if (i16 != 0) {
                            fE = d0.l2.f268424a.e();
                        }
                        if (i13 != 0) {
                            fD = d0.l2.f268424a.d();
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarG = pj.f31758a.d(c0VarR, 6).g();
                        }
                        if ((i11 & 16) != 0) {
                            jR = o6.r(d0.l2.f268424a.c(), c0VarR, 6);
                            i12 &= -57345;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        a0Var3 = a0Var2;
                    }
                    float f14 = fD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1364277227, i12, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
                    }
                    androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31830c), c0VarR, 0);
                    androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(a0Var3, 0.0f, ix.f29396a, 1, null);
                    zD = c0VarR.D(strB);
                    objI0 = c0VarR.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.v2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return x2.d(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i19 = i12 >> 6;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.ui.semantics.t.f(a0VarT, false, (Function1) objI0, 1, null), q3VarG, jR, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1039573072, true, new a(fE, f14), c0VarR, 54), c0Var2, (i19 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i19 & 896), 120);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f12 = f14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    f12 = fD;
                }
                f13 = fE;
                q3Var2 = q3VarG;
                j11 = jR;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.w2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x2.e(this.f34057a, a0Var3, f13, f12, q3Var2, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            fD = f11;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarG = q3Var;
                    if (c0VarR.D(q3VarG)) {
                    }
                    i12 |= i17;
                } else {
                    q3VarG = q3Var;
                }
                i12 |= i17;
            } else {
                q3VarG = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jR = j10;
                    if (c0VarR.L(jR)) {
                    }
                    i12 |= i18;
                } else {
                    jR = j10;
                }
                i12 |= i18;
            } else {
                jR = j10;
            }
            if ((i12 & 9363) != 9362) {
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
                    if (i16 != 0) {
                        fE = d0.l2.f268424a.e();
                    }
                    if (i13 != 0) {
                        fD = d0.l2.f268424a.d();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarG = pj.f31758a.d(c0VarR, 6).g();
                    }
                    if ((i11 & 16) != 0) {
                        jR = o6.r(d0.l2.f268424a.c(), c0VarR, 6);
                        i12 &= -57345;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i16 != 0) {
                        fE = d0.l2.f268424a.e();
                    }
                    if (i13 != 0) {
                        fD = d0.l2.f268424a.d();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarG = pj.f31758a.d(c0VarR, 6).g();
                    }
                    if ((i11 & 16) != 0) {
                        jR = o6.r(d0.l2.f268424a.c(), c0VarR, 6);
                        i12 &= -57345;
                    }
                }
                float f15 = fD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1364277227, i12, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
                }
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31830c), c0VarR, 0);
                androidx.compose.ui.a0 a0VarT2 = androidx.compose.foundation.layout.d5.t(a0Var3, 0.0f, ix.f29396a, 1, null);
                zD = c0VarR.D(strB);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.v2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return x2.d(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material3.v2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return x2.d(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i110 = i12 >> 6;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.ui.semantics.t.f(a0VarT2, false, (Function1) objI0, 1, null), q3VarG, jR, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1039573072, true, new a(fE, f15), c0VarR, 54), c0Var2, (i110 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i110 & 896), 120);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f12 = f15;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                f12 = fD;
            }
            f13 = fE;
            q3Var2 = q3VarG;
            j11 = jR;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.w2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return x2.e(this.f34057a, a0Var3, f13, f12, q3Var2, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        fE = f10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                fD = f11;
                if (c0VarR.I(fD)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarG = q3Var;
                    if (c0VarR.D(q3VarG)) {
                    }
                    i12 |= i17;
                } else {
                    q3VarG = q3Var;
                }
                i12 |= i17;
            } else {
                q3VarG = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jR = j10;
                    if (c0VarR.L(jR)) {
                    }
                    i12 |= i18;
                } else {
                    jR = j10;
                }
                i12 |= i18;
            } else {
                jR = j10;
            }
            if ((i12 & 9363) != 9362) {
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
                    if (i16 != 0) {
                        fE = d0.l2.f268424a.e();
                    }
                    if (i13 != 0) {
                        fD = d0.l2.f268424a.d();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarG = pj.f31758a.d(c0VarR, 6).g();
                    }
                    if ((i11 & 16) != 0) {
                        jR = o6.r(d0.l2.f268424a.c(), c0VarR, 6);
                        i12 &= -57345;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i16 != 0) {
                        fE = d0.l2.f268424a.e();
                    }
                    if (i13 != 0) {
                        fD = d0.l2.f268424a.d();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarG = pj.f31758a.d(c0VarR, 6).g();
                    }
                    if ((i11 & 16) != 0) {
                        jR = o6.r(d0.l2.f268424a.c(), c0VarR, 6);
                        i12 &= -57345;
                    }
                }
                float f16 = fD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1364277227, i12, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
                }
                androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31830c), c0VarR, 0);
                androidx.compose.ui.a0 a0VarT3 = androidx.compose.foundation.layout.d5.t(a0Var3, 0.0f, ix.f29396a, 1, null);
                zD = c0VarR.D(strB);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.v2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return x2.d(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.material3.v2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return x2.d(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i111 = i12 >> 6;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.ui.semantics.t.f(a0VarT3, false, (Function1) objI0, 1, null), q3VarG, jR, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1039573072, true, new a(fE, f16), c0VarR, 54), c0Var2, (i111 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i111 & 896), 120);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f12 = f16;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                f12 = fD;
            }
            f13 = fE;
            q3Var2 = q3VarG;
            j11 = jR;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.w2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return x2.e(this.f34057a, a0Var3, f13, f12, q3Var2, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        fD = f11;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3VarG = q3Var;
                if (c0VarR.D(q3VarG)) {
                }
                i12 |= i17;
            } else {
                q3VarG = q3Var;
            }
            i12 |= i17;
        } else {
            q3VarG = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                jR = j10;
                if (c0VarR.L(jR)) {
                }
                i12 |= i18;
            } else {
                jR = j10;
            }
            i12 |= i18;
        } else {
            jR = j10;
        }
        if ((i12 & 9363) != 9362) {
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
                if (i16 != 0) {
                    fE = d0.l2.f268424a.e();
                }
                if (i13 != 0) {
                    fD = d0.l2.f268424a.d();
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarG = pj.f31758a.d(c0VarR, 6).g();
                }
                if ((i11 & 16) != 0) {
                    jR = o6.r(d0.l2.f268424a.c(), c0VarR, 6);
                    i12 &= -57345;
                }
            } else {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i16 != 0) {
                    fE = d0.l2.f268424a.e();
                }
                if (i13 != 0) {
                    fD = d0.l2.f268424a.d();
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarG = pj.f31758a.d(c0VarR, 6).g();
                }
                if ((i11 & 16) != 0) {
                    jR = o6.r(d0.l2.f268424a.c(), c0VarR, 6);
                    i12 &= -57345;
                }
            }
            float f17 = fD;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1364277227, i12, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
            }
            androidx.compose.material3.internal.l3.a aVar4 = androidx.compose.material3.internal.l3.f29010b;
            strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31830c), c0VarR, 0);
            androidx.compose.ui.a0 a0VarT4 = androidx.compose.foundation.layout.d5.t(a0Var3, 0.0f, ix.f29396a, 1, null);
            zD = c0VarR.D(strB);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = new Function1() { // from class: androidx.compose.material3.v2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return x2.d(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material3.v2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return x2.d(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i112 = i12 >> 6;
            c0Var2 = c0VarR;
            u10.c(androidx.compose.ui.semantics.t.f(a0VarT4, false, (Function1) objI0, 1, null), q3VarG, jR, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1039573072, true, new a(fE, f17), c0VarR, 54), c0Var2, (i112 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i112 & 896), 120);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f12 = f17;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            f12 = fD;
        }
        f13 = fE;
        q3Var2 = q3VarG;
        j11 = jR;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.w2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x2.e(this.f34057a, a0Var3, f13, f12, q3Var2, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    public final long f(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(433375448, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:383)");
        }
        long jR = o6.r(d0.l2.f268424a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float g() {
        return f34347b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getExpandedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 h(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1683783414, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:379)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.l2.f268424a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getHiddenShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1971658024, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:375)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.l2.f268424a.f(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    public final float j() {
        return f34350e;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getScrimColor")
    public final long k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2040719176, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:390)");
        }
        long jW = androidx.compose.ui.graphics.q0.w(o6.r(d0.f2.f268022a.a(), c0Var, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jW;
    }

    public final float l() {
        return f34349d;
    }

    public final float m() {
        return f34348c;
    }

    public final float n() {
        return f34351f;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 o(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-511309409, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:401)");
        }
        androidx.compose.foundation.layout.v6 v6VarZ = androidx.compose.foundation.layout.b8.z(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarZ, androidx.compose.foundation.layout.v7.s(aVar.e(), aVar.k()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }
}
