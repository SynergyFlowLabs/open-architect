package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,671:1\n1282#2,6:672\n1282#2,6:678\n1282#2,6:685\n75#3:684\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n*L\n197#1:672,6\n201#1:678,6\n204#1:685,6\n202#1:684\n*E\n"})
public abstract class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f25481a = 0;

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.w1<Boolean> f25482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.graphics.z3> f25483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.b5 f25484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x7 f25485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f25486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f25487f;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.animation.core.w1<Boolean> w1Var, androidx.compose.runtime.n3<androidx.compose.ui.graphics.z3> n3Var, androidx.compose.foundation.b5 b5Var, x7 x7Var, androidx.compose.ui.a0 a0Var, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f25482a = w1Var;
            this.f25483b = n3Var;
            this.f25484c = b5Var;
            this.f25485d = x7Var;
            this.f25486e = a0Var;
            this.f25487f = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1604457564, i10, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:211)");
            }
            ga.d(this.f25482a, this.f25483b, this.f25484c, x7.g(this.f25485d, this.f25486e, false, 1, null), this.f25487f, c0Var, androidx.compose.animation.core.w1.f13348e | 48, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.runtime.n3 n3Var, androidx.compose.ui.unit.s sVar, androidx.compose.ui.unit.s sVar2) {
        n3Var.setValue(androidx.compose.ui.graphics.z3.b(ga.l(sVar, sVar2)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(x7 x7Var, boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.foundation.b5 b5Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        x7Var.c(z10, function0, a0Var, b5Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    public static /* synthetic */ androidx.compose.ui.a0 g(x7 x7Var, androidx.compose.ui.a0 a0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return x7Var.f(a0Var, z10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0151  */
    /* JADX WARN: Code duplicated, block: B:104:0x0161  */
    /* JADX WARN: Code duplicated, block: B:107:0x0193  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void c(boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.foundation.b5 b5Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z11;
        int i12;
        Function0<Unit> function1;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        androidx.compose.foundation.b5 b5Var2;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i15;
        x7 x7Var;
        int i16;
        boolean z12;
        androidx.compose.ui.a0 a0Var3;
        final androidx.compose.foundation.b5 b5Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.b5 b5VarF;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        androidx.compose.animation.core.w1 w1Var;
        Object objI1;
        final androidx.compose.runtime.n3 n3Var;
        Object objI2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1576205770);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z11) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                function1 = function0;
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        b5Var2 = b5Var;
                        int i17 = c0VarR.D(b5Var2) ? 2048 : 1024;
                        i12 |= i17;
                    } else {
                        b5Var2 = b5Var;
                    }
                    i12 |= i17;
                } else {
                    b5Var2 = b5Var;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i12 |= i15;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        x7Var = this;
                    } else {
                        x7Var = this;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(x7Var)) {
                                i16 = 131072;
                            } else {
                                i16 = 65536;
                            }
                            i12 |= i16;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                a0Var3 = a0Var4;
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                a0Var3 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                                c0VarR.Y(objI0);
                            }
                            w1Var = (androidx.compose.animation.core.w1) objI0;
                            w1Var.f(Boolean.valueOf(z11));
                            if (!((Boolean) w1Var.a()).booleanValue() || ((Boolean) w1Var.b()).booleanValue()) {
                                c0VarR.E(132216667);
                                objI1 = c0VarR.i0();
                                if (objI1 == aVar.a()) {
                                    objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                    c0VarR.Y(objI1);
                                }
                                n3Var = (androidx.compose.runtime.n3) objI1;
                                androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                                long jB = androidx.compose.ui.unit.j.f42694b.b();
                                objI2 = c0VarR.i0();
                                if (objI2 == aVar.a()) {
                                    objI2 = new Function2() { // from class: androidx.compose.material.v7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI2);
                                }
                                androidx.compose.material.internal.j.h(function1, new n7(jB, dVar, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                                c0VarR.A();
                            } else {
                                c0VarR.E(133094060);
                                c0VarR.A();
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            b5Var3 = b5VarF;
                        } else {
                            c0VarR.u();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            a0Var3 = a0Var2;
                        }
                        b5VarF = b5Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                            c0VarR.Y(objI0);
                        }
                        w1Var = (androidx.compose.animation.core.w1) objI0;
                        w1Var.f(Boolean.valueOf(z11));
                        if (((Boolean) w1Var.a()).booleanValue()) {
                            c0VarR.E(132216667);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            long jB2 = androidx.compose.ui.unit.j.f42694b.b();
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.v7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.material.internal.j.h(function1, new n7(jB2, dVar2, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(132216667);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar3 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            long jB3 = androidx.compose.ui.unit.j.f42694b.b();
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.v7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.material.internal.j.h(function1, new n7(jB3, dVar3, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        b5Var3 = b5VarF;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        b5Var3 = b5Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final boolean z13 = z11;
                        final androidx.compose.ui.a0 a0Var5 = a0Var3;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.w7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x7.e(this.f25346a, z13, function0, a0Var5, b5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                nVar2 = nVar;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    x7Var = this;
                } else {
                    x7Var = this;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(x7Var)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            a0Var3 = a0Var4;
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            a0Var3 = a0Var4;
                            b5VarF = b5Var2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            a0Var3 = a0Var4;
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            a0Var3 = a0Var4;
                            b5VarF = b5Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                        c0VarR.Y(objI0);
                    }
                    w1Var = (androidx.compose.animation.core.w1) objI0;
                    w1Var.f(Boolean.valueOf(z11));
                    if (((Boolean) w1Var.a()).booleanValue()) {
                        c0VarR.E(132216667);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar4 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        long jB4 = androidx.compose.ui.unit.j.f42694b.b();
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.v7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material.internal.j.h(function1, new n7(jB4, dVar4, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(132216667);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar5 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        long jB5 = androidx.compose.ui.unit.j.f42694b.b();
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.v7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material.internal.j.h(function1, new n7(jB5, dVar5, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    b5Var3 = b5VarF;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var3 = b5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z14 = z11;
                    final androidx.compose.ui.a0 a0Var6 = a0Var3;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.w7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x7.e(this.f25346a, z14, function0, a0Var6, b5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    b5Var2 = b5Var;
                    if (c0VarR.D(b5Var2)) {
                    }
                    i12 |= i17;
                } else {
                    b5Var2 = b5Var;
                }
                i12 |= i17;
            } else {
                b5Var2 = b5Var;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    x7Var = this;
                } else {
                    x7Var = this;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(x7Var)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            a0Var3 = a0Var4;
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            a0Var3 = a0Var4;
                            b5VarF = b5Var2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            a0Var3 = a0Var4;
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            a0Var3 = a0Var4;
                            b5VarF = b5Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                        c0VarR.Y(objI0);
                    }
                    w1Var = (androidx.compose.animation.core.w1) objI0;
                    w1Var.f(Boolean.valueOf(z11));
                    if (((Boolean) w1Var.a()).booleanValue()) {
                        c0VarR.E(132216667);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar6 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        long jB6 = androidx.compose.ui.unit.j.f42694b.b();
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.v7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material.internal.j.h(function1, new n7(jB6, dVar6, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(132216667);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar7 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        long jB7 = androidx.compose.ui.unit.j.f42694b.b();
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.v7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material.internal.j.h(function1, new n7(jB7, dVar7, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    b5Var3 = b5VarF;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var3 = b5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z15 = z11;
                    final androidx.compose.ui.a0 a0Var7 = a0Var3;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.w7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x7.e(this.f25346a, z15, function0, a0Var7, b5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVar2 = nVar;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                x7Var = this;
            } else {
                x7Var = this;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(x7Var)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var3 = a0Var4;
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        a0Var3 = a0Var4;
                        b5VarF = b5Var2;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var3 = a0Var4;
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        a0Var3 = a0Var4;
                        b5VarF = b5Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                    c0VarR.Y(objI0);
                }
                w1Var = (androidx.compose.animation.core.w1) objI0;
                w1Var.f(Boolean.valueOf(z11));
                if (((Boolean) w1Var.a()).booleanValue()) {
                    c0VarR.E(132216667);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar8 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    long jB8 = androidx.compose.ui.unit.j.f42694b.b();
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.v7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material.internal.j.h(function1, new n7(jB8, dVar8, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(132216667);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar9 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    long jB9 = androidx.compose.ui.unit.j.f42694b.b();
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.v7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material.internal.j.h(function1, new n7(jB9, dVar9, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                b5Var3 = b5VarF;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                b5Var3 = b5Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final boolean z16 = z11;
                final androidx.compose.ui.a0 a0Var8 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.w7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return x7.e(this.f25346a, z16, function0, a0Var8, b5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function1 = function0;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    b5Var2 = b5Var;
                    if (c0VarR.D(b5Var2)) {
                    }
                    i12 |= i17;
                } else {
                    b5Var2 = b5Var;
                }
                i12 |= i17;
            } else {
                b5Var2 = b5Var;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    x7Var = this;
                } else {
                    x7Var = this;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(x7Var)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            a0Var3 = a0Var4;
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            a0Var3 = a0Var4;
                            b5VarF = b5Var2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            a0Var3 = a0Var4;
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            a0Var3 = a0Var4;
                            b5VarF = b5Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                        c0VarR.Y(objI0);
                    }
                    w1Var = (androidx.compose.animation.core.w1) objI0;
                    w1Var.f(Boolean.valueOf(z11));
                    if (((Boolean) w1Var.a()).booleanValue()) {
                        c0VarR.E(132216667);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar10 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        long jB10 = androidx.compose.ui.unit.j.f42694b.b();
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.v7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material.internal.j.h(function1, new n7(jB10, dVar10, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(132216667);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar11 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        long jB11 = androidx.compose.ui.unit.j.f42694b.b();
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.v7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material.internal.j.h(function1, new n7(jB11, dVar11, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    b5Var3 = b5VarF;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var3 = b5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z17 = z11;
                    final androidx.compose.ui.a0 a0Var9 = a0Var3;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.w7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x7.e(this.f25346a, z17, function0, a0Var9, b5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVar2 = nVar;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                x7Var = this;
            } else {
                x7Var = this;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(x7Var)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var3 = a0Var4;
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        a0Var3 = a0Var4;
                        b5VarF = b5Var2;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var3 = a0Var4;
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        a0Var3 = a0Var4;
                        b5VarF = b5Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                    c0VarR.Y(objI0);
                }
                w1Var = (androidx.compose.animation.core.w1) objI0;
                w1Var.f(Boolean.valueOf(z11));
                if (((Boolean) w1Var.a()).booleanValue()) {
                    c0VarR.E(132216667);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar12 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    long jB12 = androidx.compose.ui.unit.j.f42694b.b();
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.v7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material.internal.j.h(function1, new n7(jB12, dVar12, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(132216667);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar13 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    long jB13 = androidx.compose.ui.unit.j.f42694b.b();
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.v7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material.internal.j.h(function1, new n7(jB13, dVar13, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                b5Var3 = b5VarF;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                b5Var3 = b5Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final boolean z18 = z11;
                final androidx.compose.ui.a0 a0Var10 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.w7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return x7.e(this.f25346a, z18, function0, a0Var10, b5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                b5Var2 = b5Var;
                if (c0VarR.D(b5Var2)) {
                }
                i12 |= i17;
            } else {
                b5Var2 = b5Var;
            }
            i12 |= i17;
        } else {
            b5Var2 = b5Var;
        }
        if ((i11 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                x7Var = this;
            } else {
                x7Var = this;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(x7Var)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var3 = a0Var4;
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        a0Var3 = a0Var4;
                        b5VarF = b5Var2;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var3 = a0Var4;
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        a0Var3 = a0Var4;
                        b5VarF = b5Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                    c0VarR.Y(objI0);
                }
                w1Var = (androidx.compose.animation.core.w1) objI0;
                w1Var.f(Boolean.valueOf(z11));
                if (((Boolean) w1Var.a()).booleanValue()) {
                    c0VarR.E(132216667);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar14 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    long jB14 = androidx.compose.ui.unit.j.f42694b.b();
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.v7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material.internal.j.h(function1, new n7(jB14, dVar14, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(132216667);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar15 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    long jB15 = androidx.compose.ui.unit.j.f42694b.b();
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.v7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material.internal.j.h(function1, new n7(jB15, dVar15, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                b5Var3 = b5VarF;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                b5Var3 = b5Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final boolean z19 = z11;
                final androidx.compose.ui.a0 a0Var11 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.w7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return x7.e(this.f25346a, z19, function0, a0Var11, b5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        nVar2 = nVar;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            x7Var = this;
        } else {
            x7Var = this;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(x7Var)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((74899 & i12) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    a0Var3 = a0Var4;
                    b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                } else {
                    a0Var3 = a0Var4;
                    b5VarF = b5Var2;
                }
            } else {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    a0Var3 = a0Var4;
                    b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                } else {
                    a0Var3 = a0Var4;
                    b5VarF = b5Var2;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1576205770, i12, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new androidx.compose.animation.core.w1(Boolean.FALSE);
                c0VarR.Y(objI0);
            }
            w1Var = (androidx.compose.animation.core.w1) objI0;
            w1Var.f(Boolean.valueOf(z11));
            if (((Boolean) w1Var.a()).booleanValue()) {
                c0VarR.E(132216667);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                androidx.compose.ui.unit.d dVar16 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                long jB16 = androidx.compose.ui.unit.j.f42694b.b();
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function2() { // from class: androidx.compose.material.v7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.material.internal.j.h(function1, new n7(jB16, dVar16, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                c0VarR.A();
            } else {
                c0VarR.E(132216667);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                androidx.compose.ui.unit.d dVar17 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                long jB17 = androidx.compose.ui.unit.j.f42694b.b();
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function2() { // from class: androidx.compose.material.v7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x7.d(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.material.internal.j.h(function1, new n7(jB17, dVar17, (Function2) objI2, null), androidx.compose.runtime.internal.w.e(1604457564, true, new a(w1Var, n3Var, b5VarF, x7Var, a0Var3, nVar2), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | androidx.media3.exoplayer.a5.S0, 0);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            b5Var3 = b5VarF;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            b5Var3 = b5Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final boolean z110 = z11;
            final androidx.compose.ui.a0 a0Var12 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.w7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x7.e(this.f25346a, z110, function0, a0Var12, b5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public abstract androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, boolean z10);
}
