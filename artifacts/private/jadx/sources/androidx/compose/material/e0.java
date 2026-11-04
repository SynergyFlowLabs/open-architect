package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,123:1\n113#2:124\n188#2:125\n113#2:129\n188#2:130\n53#3,3:126\n53#3,3:131\n1282#4,6:134\n1282#4,6:140\n1282#4,6:147\n75#5:146\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n*L\n53#1:124\n53#1:125\n123#1:129\n123#1:130\n53#1:126,3\n123#1:131,3\n77#1:134,6\n81#1:140,6\n84#1:147,6\n82#1:146\n*E\n"})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.window.t f22591a = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.w1<Boolean> f22592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.graphics.z3> f22593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.b5 f22594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f22595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f22596e;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.animation.core.w1<Boolean> w1Var, androidx.compose.runtime.n3<androidx.compose.ui.graphics.z3> n3Var, androidx.compose.foundation.b5 b5Var, androidx.compose.ui.a0 a0Var, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f22592a = w1Var;
            this.f22593b = n3Var;
            this.f22594c = b5Var;
            this.f22595d = a0Var;
            this.f22596e = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1788768427, i10, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:92)");
            }
            ga.d(this.f22592a, this.f22593b, this.f22594c, this.f22595d, this.f22596e, c0Var, androidx.compose.animation.core.w1.f13348e | 48, 0);
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
        int i10 = 2 | 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0154  */
    /* JADX WARN: Code duplicated, block: B:102:0x015d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0161  */
    /* JADX WARN: Code duplicated, block: B:107:0x0173  */
    /* JADX WARN: Code duplicated, block: B:110:0x018a  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:126:0x023f  */
    /* JADX WARN: Code duplicated, block: B:129:0x024e  */
    /* JADX WARN: Code duplicated, block: B:132:0x025c  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112 A[PHI: r2 r7 r11 r13
      0x0112: PHI (r2v13 int) = (r2v5 int), (r2v16 int) binds: [B:103:0x015f, B:91:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r7v29 androidx.compose.ui.a0) = (r7v6 androidx.compose.ui.a0), (r7v3 androidx.compose.ui.a0) binds: [B:103:0x015f, B:91:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r11v8 long) = (r11v5 long), (r11v2 long) binds: [B:103:0x015f, B:91:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r13v15 androidx.compose.foundation.b5) = (r13v8 androidx.compose.foundation.b5), (r13v7 androidx.compose.foundation.b5) binds: [B:103:0x015f, B:91:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x014f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.foundation.b5 b5Var, @Nullable androidx.compose.ui.window.t tVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z11;
        int i12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        long jD;
        int i16;
        androidx.compose.foundation.b5 b5VarF;
        int i17;
        androidx.compose.ui.window.t tVar2;
        int i18;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        char c10;
        int i19;
        int i20;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.foundation.b5 b5Var2;
        final androidx.compose.ui.window.t tVar3;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        int i21;
        androidx.compose.ui.window.t tVar4;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.b5 b5Var3;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        androidx.compose.animation.core.w1 w1Var;
        Object objI1;
        final androidx.compose.runtime.n3 n3Var;
        Object objI2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1275450738);
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
                i12 |= c0VarR.k0(function0) ? 32 : 16;
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
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        jD = j10;
                        if (c0VarR.L(jD)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            b5VarF = b5Var;
                            int i22 = c0VarR.D(b5VarF) ? 16384 : 8192;
                            i12 |= i22;
                        } else {
                            b5VarF = b5Var;
                        }
                        i12 |= i22;
                    } else {
                        b5VarF = b5Var;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            tVar2 = tVar;
                            if (c0VarR.D(tVar2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                            nVar2 = nVar;
                            c10 = ' ';
                        } else {
                            nVar2 = nVar;
                            c10 = ' ';
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i12 |= i19;
                            }
                        }
                        i20 = i12;
                        if ((i12 & 599187) != 599186) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    float f10 = 0;
                                    jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f10))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f10))) << c10));
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                                } else {
                                    i21 = i20;
                                }
                                if (i17 != 0) {
                                    tVar4 = f22591a;
                                    a0Var4 = a0Var2;
                                    b5Var3 = b5VarF;
                                } else {
                                    a0Var4 = a0Var2;
                                    b5Var3 = b5VarF;
                                    tVar4 = tVar2;
                                }
                            } else {
                                c0VarR.u();
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    a0Var4 = a0Var2;
                                    b5Var3 = b5VarF;
                                    tVar4 = tVar2;
                                } else {
                                    a0Var4 = a0Var2;
                                    b5Var3 = b5VarF;
                                    tVar4 = tVar2;
                                    i21 = i20;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                                c0VarR.E(-622275818);
                                objI1 = c0VarR.i0();
                                if (objI1 == aVar.a()) {
                                    objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                    c0VarR.Y(objI1);
                                }
                                n3Var = (androidx.compose.runtime.n3) objI1;
                                androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                                objI2 = c0VarR.i0();
                                if (objI2 == aVar.a()) {
                                    objI2 = new Function2() { // from class: androidx.compose.material.b0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI2);
                                }
                                androidx.compose.ui.window.c.a(new n7(jD, dVar, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-621482032);
                                c0VarR.A();
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            tVar3 = tVar4;
                            b5Var2 = b5Var3;
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            b5Var2 = b5VarF;
                            tVar3 = tVar2;
                        }
                        j11 = jD;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final boolean z13 = z11;
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.j(z13, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    tVar2 = tVar;
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                        c10 = ' ';
                    } else {
                        nVar2 = nVar;
                        c10 = ' ';
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    i20 = i12;
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                float f11 = 0;
                                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f11))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f11))) << c10));
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                i21 = i20;
                            }
                            if (i17 != 0) {
                                tVar4 = f22591a;
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                            } else {
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                                tVar4 = tVar2;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                float f12 = 0;
                                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f12))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f12))) << c10));
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                i21 = i20;
                            }
                            if (i17 != 0) {
                                tVar4 = f22591a;
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                            } else {
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                                tVar4 = tVar2;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                            c0VarR.E(-622275818);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.b0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.window.c.a(new n7(jD, dVar2, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-622275818);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar3 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.b0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.window.c.a(new n7(jD, dVar3, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        tVar3 = tVar4;
                        b5Var2 = b5Var3;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        b5Var2 = b5VarF;
                        tVar3 = tVar2;
                    }
                    j11 = jD;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final boolean z14 = z11;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.j(z14, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                jD = j10;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        b5VarF = b5Var;
                        if (c0VarR.D(b5VarF)) {
                        }
                        i12 |= i22;
                    } else {
                        b5VarF = b5Var;
                    }
                    i12 |= i22;
                } else {
                    b5VarF = b5Var;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        tVar2 = tVar;
                        if (c0VarR.D(tVar2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                        c10 = ' ';
                    } else {
                        nVar2 = nVar;
                        c10 = ' ';
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    i20 = i12;
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                float f13 = 0;
                                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f13))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f13))) << c10));
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                i21 = i20;
                            }
                            if (i17 != 0) {
                                tVar4 = f22591a;
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                            } else {
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                                tVar4 = tVar2;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                float f14 = 0;
                                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f14))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f14))) << c10));
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                i21 = i20;
                            }
                            if (i17 != 0) {
                                tVar4 = f22591a;
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                            } else {
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                                tVar4 = tVar2;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                            c0VarR.E(-622275818);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar4 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.b0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.window.c.a(new n7(jD, dVar4, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-622275818);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar5 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.b0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.window.c.a(new n7(jD, dVar5, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        tVar3 = tVar4;
                        b5Var2 = b5Var3;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        b5Var2 = b5VarF;
                        tVar3 = tVar2;
                    }
                    j11 = jD;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final boolean z15 = z11;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.j(z15, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                tVar2 = tVar;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                    c10 = ' ';
                } else {
                    nVar2 = nVar;
                    c10 = ' ';
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i12;
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f15 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f15))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f15))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f16 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f16))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f16))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar6 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar6, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar7 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar7, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    tVar3 = tVar4;
                    b5Var2 = b5Var3;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var2 = b5VarF;
                    tVar3 = tVar2;
                }
                j11 = jD;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z16 = z11;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.j(z16, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    jD = j10;
                    if (c0VarR.L(jD)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        b5VarF = b5Var;
                        if (c0VarR.D(b5VarF)) {
                        }
                        i12 |= i22;
                    } else {
                        b5VarF = b5Var;
                    }
                    i12 |= i22;
                } else {
                    b5VarF = b5Var;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        tVar2 = tVar;
                        if (c0VarR.D(tVar2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                        c10 = ' ';
                    } else {
                        nVar2 = nVar;
                        c10 = ' ';
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    i20 = i12;
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                float f17 = 0;
                                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f17))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f17))) << c10));
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                i21 = i20;
                            }
                            if (i17 != 0) {
                                tVar4 = f22591a;
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                            } else {
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                                tVar4 = tVar2;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                float f18 = 0;
                                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f18))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f18))) << c10));
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                i21 = i20;
                            }
                            if (i17 != 0) {
                                tVar4 = f22591a;
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                            } else {
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                                tVar4 = tVar2;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                            c0VarR.E(-622275818);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar8 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.b0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.window.c.a(new n7(jD, dVar8, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-622275818);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar9 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.b0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.window.c.a(new n7(jD, dVar9, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        tVar3 = tVar4;
                        b5Var2 = b5Var3;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        b5Var2 = b5VarF;
                        tVar3 = tVar2;
                    }
                    j11 = jD;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final boolean z17 = z11;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.j(z17, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                tVar2 = tVar;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                    c10 = ' ';
                } else {
                    nVar2 = nVar;
                    c10 = ' ';
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i12;
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f19 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f19))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f19))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f110 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f110))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f110))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar10 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar10, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar11 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar11, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    tVar3 = tVar4;
                    b5Var2 = b5Var3;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var2 = b5VarF;
                    tVar3 = tVar2;
                }
                j11 = jD;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z18 = z11;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.j(z18, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            jD = j10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    b5VarF = b5Var;
                    if (c0VarR.D(b5VarF)) {
                    }
                    i12 |= i22;
                } else {
                    b5VarF = b5Var;
                }
                i12 |= i22;
            } else {
                b5VarF = b5Var;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    tVar2 = tVar;
                    if (c0VarR.D(tVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                    c10 = ' ';
                } else {
                    nVar2 = nVar;
                    c10 = ' ';
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i12;
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f111 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f111))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f111))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f112 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f112))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f112))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar12 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar12, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar13 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar13, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    tVar3 = tVar4;
                    b5Var2 = b5Var3;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var2 = b5VarF;
                    tVar3 = tVar2;
                }
                j11 = jD;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z19 = z11;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.j(z19, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            tVar2 = tVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
                c10 = ' ';
            } else {
                nVar2 = nVar;
                c10 = ' ';
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            i20 = i12;
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        float f113 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f113))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f113))) << c10));
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        i21 = i20;
                    }
                    if (i17 != 0) {
                        tVar4 = f22591a;
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                    } else {
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                        tVar4 = tVar2;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        float f114 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f114))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f114))) << c10));
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        i21 = i20;
                    }
                    if (i17 != 0) {
                        tVar4 = f22591a;
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                    } else {
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                        tVar4 = tVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                    c0VarR.E(-622275818);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar14 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.window.c.a(new n7(jD, dVar14, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(-622275818);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar15 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.window.c.a(new n7(jD, dVar15, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                tVar3 = tVar4;
                b5Var2 = b5Var3;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                b5Var2 = b5VarF;
                tVar3 = tVar2;
            }
            j11 = jD;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final boolean z110 = z11;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.j(z110, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
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
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    jD = j10;
                    if (c0VarR.L(jD)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        b5VarF = b5Var;
                        if (c0VarR.D(b5VarF)) {
                        }
                        i12 |= i22;
                    } else {
                        b5VarF = b5Var;
                    }
                    i12 |= i22;
                } else {
                    b5VarF = b5Var;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        tVar2 = tVar;
                        if (c0VarR.D(tVar2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                        nVar2 = nVar;
                        c10 = ' ';
                    } else {
                        nVar2 = nVar;
                        c10 = ' ';
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                    }
                    i20 = i12;
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                float f115 = 0;
                                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f115))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f115))) << c10));
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                i21 = i20;
                            }
                            if (i17 != 0) {
                                tVar4 = f22591a;
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                            } else {
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                                tVar4 = tVar2;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                float f116 = 0;
                                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f116))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f116))) << c10));
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                            } else {
                                i21 = i20;
                            }
                            if (i17 != 0) {
                                tVar4 = f22591a;
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                            } else {
                                a0Var4 = a0Var2;
                                b5Var3 = b5VarF;
                                tVar4 = tVar2;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                            c0VarR.E(-622275818);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar16 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.b0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.window.c.a(new n7(jD, dVar16, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-622275818);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            androidx.compose.ui.unit.d dVar17 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            objI2 = c0VarR.i0();
                            if (objI2 == aVar.a()) {
                                objI2 = new Function2() { // from class: androidx.compose.material.b0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.window.c.a(new n7(jD, dVar17, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        tVar3 = tVar4;
                        b5Var2 = b5Var3;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        b5Var2 = b5VarF;
                        tVar3 = tVar2;
                    }
                    j11 = jD;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final boolean z111 = z11;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.j(z111, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                tVar2 = tVar;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                    c10 = ' ';
                } else {
                    nVar2 = nVar;
                    c10 = ' ';
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i12;
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f117 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f117))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f117))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f118 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f118))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f118))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar18 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar18, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar19 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar19, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    tVar3 = tVar4;
                    b5Var2 = b5Var3;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var2 = b5VarF;
                    tVar3 = tVar2;
                }
                j11 = jD;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z112 = z11;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.j(z112, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            jD = j10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    b5VarF = b5Var;
                    if (c0VarR.D(b5VarF)) {
                    }
                    i12 |= i22;
                } else {
                    b5VarF = b5Var;
                }
                i12 |= i22;
            } else {
                b5VarF = b5Var;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    tVar2 = tVar;
                    if (c0VarR.D(tVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                    c10 = ' ';
                } else {
                    nVar2 = nVar;
                    c10 = ' ';
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i12;
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f119 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f119))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f119))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f1110 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1110))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1110))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar110 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar110, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar111 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar111, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    tVar3 = tVar4;
                    b5Var2 = b5Var3;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var2 = b5VarF;
                    tVar3 = tVar2;
                }
                j11 = jD;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z113 = z11;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.j(z113, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            tVar2 = tVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
                c10 = ' ';
            } else {
                nVar2 = nVar;
                c10 = ' ';
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            i20 = i12;
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        float f1111 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1111))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1111))) << c10));
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        i21 = i20;
                    }
                    if (i17 != 0) {
                        tVar4 = f22591a;
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                    } else {
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                        tVar4 = tVar2;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        float f1112 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1112))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1112))) << c10));
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        i21 = i20;
                    }
                    if (i17 != 0) {
                        tVar4 = f22591a;
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                    } else {
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                        tVar4 = tVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                    c0VarR.E(-622275818);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar112 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.window.c.a(new n7(jD, dVar112, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(-622275818);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar113 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.window.c.a(new n7(jD, dVar113, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                tVar3 = tVar4;
                b5Var2 = b5Var3;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                b5Var2 = b5VarF;
                tVar3 = tVar2;
            }
            j11 = jD;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final boolean z114 = z11;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.j(z114, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                jD = j10;
                if (c0VarR.L(jD)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    b5VarF = b5Var;
                    if (c0VarR.D(b5VarF)) {
                    }
                    i12 |= i22;
                } else {
                    b5VarF = b5Var;
                }
                i12 |= i22;
            } else {
                b5VarF = b5Var;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    tVar2 = tVar;
                    if (c0VarR.D(tVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    nVar2 = nVar;
                    c10 = ' ';
                } else {
                    nVar2 = nVar;
                    c10 = ' ';
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                }
                i20 = i12;
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f1113 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1113))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1113))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            float f1114 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1114))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1114))) << c10));
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                        } else {
                            i21 = i20;
                        }
                        if (i17 != 0) {
                            tVar4 = f22591a;
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                        } else {
                            a0Var4 = a0Var2;
                            b5Var3 = b5VarF;
                            tVar4 = tVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar114 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar114, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-622275818);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        androidx.compose.ui.unit.d dVar115 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        objI2 = c0VarR.i0();
                        if (objI2 == aVar.a()) {
                            objI2 = new Function2() { // from class: androidx.compose.material.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.window.c.a(new n7(jD, dVar115, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    tVar3 = tVar4;
                    b5Var2 = b5Var3;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    b5Var2 = b5VarF;
                    tVar3 = tVar2;
                }
                j11 = jD;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final boolean z115 = z11;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.j(z115, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            tVar2 = tVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
                c10 = ' ';
            } else {
                nVar2 = nVar;
                c10 = ' ';
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            i20 = i12;
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        float f1115 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1115))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1115))) << c10));
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        i21 = i20;
                    }
                    if (i17 != 0) {
                        tVar4 = f22591a;
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                    } else {
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                        tVar4 = tVar2;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        float f1116 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1116))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1116))) << c10));
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        i21 = i20;
                    }
                    if (i17 != 0) {
                        tVar4 = f22591a;
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                    } else {
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                        tVar4 = tVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                    c0VarR.E(-622275818);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar116 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.window.c.a(new n7(jD, dVar116, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(-622275818);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar117 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.window.c.a(new n7(jD, dVar117, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                tVar3 = tVar4;
                b5Var2 = b5Var3;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                b5Var2 = b5VarF;
                tVar3 = tVar2;
            }
            j11 = jD;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final boolean z116 = z11;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.j(z116, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        jD = j10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                b5VarF = b5Var;
                if (c0VarR.D(b5VarF)) {
                }
                i12 |= i22;
            } else {
                b5VarF = b5Var;
            }
            i12 |= i22;
        } else {
            b5VarF = b5Var;
        }
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                tVar2 = tVar;
                if (c0VarR.D(tVar2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                nVar2 = nVar;
                c10 = ' ';
            } else {
                nVar2 = nVar;
                c10 = ' ';
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
            }
            i20 = i12;
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        float f1117 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1117))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1117))) << c10));
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        i21 = i20;
                    }
                    if (i17 != 0) {
                        tVar4 = f22591a;
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                    } else {
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                        tVar4 = tVar2;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        float f1118 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1118))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1118))) << c10));
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                    } else {
                        i21 = i20;
                    }
                    if (i17 != 0) {
                        tVar4 = f22591a;
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                    } else {
                        a0Var4 = a0Var2;
                        b5Var3 = b5VarF;
                        tVar4 = tVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                    c0VarR.E(-622275818);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar118 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.window.c.a(new n7(jD, dVar118, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(-622275818);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    androidx.compose.ui.unit.d dVar119 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    objI2 = c0VarR.i0();
                    if (objI2 == aVar.a()) {
                        objI2 = new Function2() { // from class: androidx.compose.material.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.window.c.a(new n7(jD, dVar119, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                tVar3 = tVar4;
                b5Var2 = b5Var3;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                b5Var2 = b5VarF;
                tVar3 = tVar2;
            }
            j11 = jD;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final boolean z117 = z11;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.j(z117, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        tVar2 = tVar;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
            nVar2 = nVar;
            c10 = ' ';
        } else {
            nVar2 = nVar;
            c10 = ' ';
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
        }
        i20 = i12;
        if ((i12 & 599187) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i20 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    float f1119 = 0;
                    jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1119))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1119))) << c10));
                }
                if ((i11 & 16) != 0) {
                    i21 = i20 & (-57345);
                    b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                } else {
                    i21 = i20;
                }
                if (i17 != 0) {
                    tVar4 = f22591a;
                    a0Var4 = a0Var2;
                    b5Var3 = b5VarF;
                } else {
                    a0Var4 = a0Var2;
                    b5Var3 = b5VarF;
                    tVar4 = tVar2;
                }
            } else {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    float f11110 = 0;
                    jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f11110))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f11110))) << c10));
                }
                if ((i11 & 16) != 0) {
                    i21 = i20 & (-57345);
                    b5VarF = androidx.compose.foundation.q4.f(0, c0VarR, 0, 1);
                } else {
                    i21 = i20;
                }
                if (i17 != 0) {
                    tVar4 = f22591a;
                    a0Var4 = a0Var2;
                    b5Var3 = b5VarF;
                } else {
                    a0Var4 = a0Var2;
                    b5Var3 = b5VarF;
                    tVar4 = tVar2;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1275450738, i21, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
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
                c0VarR.E(-622275818);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                androidx.compose.ui.unit.d dVar1110 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function2() { // from class: androidx.compose.material.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.window.c.a(new n7(jD, dVar1110, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                c0VarR.A();
            } else {
                c0VarR.E(-622275818);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.d7.g(androidx.compose.ui.graphics.z3.b(androidx.compose.ui.graphics.z3.f38723b.a()), null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                androidx.compose.ui.unit.d dVar1111 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = new Function2() { // from class: androidx.compose.material.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.i(n3Var, (androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.window.c.a(new n7(jD, dVar1111, (Function2) objI2, null), function0, tVar4, androidx.compose.runtime.internal.w.e(1788768427, true, new a(w1Var, n3Var, b5Var3, a0Var4, nVar2), c0VarR, 54), c0VarR, (i21 & com.planner5d.library.engine.input.f.b.B) | 3072 | ((i21 >> 9) & 896), 0);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            tVar3 = tVar4;
            b5Var2 = b5Var3;
            a0Var3 = a0Var4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            b5Var2 = b5VarF;
            tVar3 = tVar2;
        }
        j11 = jD;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final boolean z118 = z11;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e0.j(z118, function0, a0Var3, j11, b5Var2, tVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0114  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0148  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0161  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @kotlin.b1(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final /* synthetic */ void f(final boolean z10, final Function0 function0, androidx.compose.ui.a0 a0Var, long j10, androidx.compose.ui.window.t tVar, final pj.n nVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z11;
        int i12;
        Function0 function1;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        pj.n nVar2;
        int i17;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.window.t tVar2;
        final androidx.compose.ui.a0 a0Var3;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long jD;
        androidx.compose.ui.window.t tVar3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2042390678);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.L(j10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(tVar)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            float f10 = 0;
                            jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f10))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f10))) << 32));
                        } else {
                            jD = j10;
                        }
                        if (i15 != 0) {
                            tVar3 = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            tVar3 = tVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-2042390678, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                        }
                        int i19 = i12 & 8190;
                        int i20 = i12 << 3;
                        c0Var2 = c0VarR;
                        e(z11, function1, a0Var4, jD, androidx.compose.foundation.q4.f(0, c0VarR, 0, 1), tVar3, nVar2, c0Var2, i19 | (458752 & i20) | (i20 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        j11 = jD;
                        tVar2 = tVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        tVar2 = tVar;
                        a0Var3 = a0Var2;
                        j11 = j10;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.d0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.k(z10, function0, a0Var3, j11, tVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        float f11 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f11))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f11))) << 32));
                    } else {
                        jD = j10;
                    }
                    if (i15 != 0) {
                        tVar3 = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        tVar3 = tVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2042390678, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    int i110 = i12 & 8190;
                    int i21 = i12 << 3;
                    c0Var2 = c0VarR;
                    e(z11, function1, a0Var4, jD, androidx.compose.foundation.q4.f(0, c0VarR, 0, 1), tVar3, nVar2, c0Var2, i110 | (458752 & i21) | (i21 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j11 = jD;
                    tVar2 = tVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    tVar2 = tVar;
                    a0Var3 = a0Var2;
                    j11 = j10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.d0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.k(z10, function0, a0Var3, j11, tVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        float f12 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f12))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f12))) << 32));
                    } else {
                        jD = j10;
                    }
                    if (i15 != 0) {
                        tVar3 = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        tVar3 = tVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2042390678, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    int i111 = i12 & 8190;
                    int i22 = i12 << 3;
                    c0Var2 = c0VarR;
                    e(z11, function1, a0Var4, jD, androidx.compose.foundation.q4.f(0, c0VarR, 0, 1), tVar3, nVar2, c0Var2, i111 | (458752 & i22) | (i22 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j11 = jD;
                    tVar2 = tVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    tVar2 = tVar;
                    a0Var3 = a0Var2;
                    j11 = j10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.d0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.k(z10, function0, a0Var3, j11, tVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    float f13 = 0;
                    jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f13))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f13))) << 32));
                } else {
                    jD = j10;
                }
                if (i15 != 0) {
                    tVar3 = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);
                } else {
                    tVar3 = tVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2042390678, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                }
                int i112 = i12 & 8190;
                int i23 = i12 << 3;
                c0Var2 = c0VarR;
                e(z11, function1, a0Var4, jD, androidx.compose.foundation.q4.f(0, c0VarR, 0, 1), tVar3, nVar2, c0Var2, i112 | (458752 & i23) | (i23 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j11 = jD;
                tVar2 = tVar3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                tVar2 = tVar;
                a0Var3 = a0Var2;
                j11 = j10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.k(z10, function0, a0Var3, j11, tVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.L(j10)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.D(tVar)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        float f14 = 0;
                        jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f14))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f14))) << 32));
                    } else {
                        jD = j10;
                    }
                    if (i15 != 0) {
                        tVar3 = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        tVar3 = tVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2042390678, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    int i113 = i12 & 8190;
                    int i24 = i12 << 3;
                    c0Var2 = c0VarR;
                    e(z11, function1, a0Var4, jD, androidx.compose.foundation.q4.f(0, c0VarR, 0, 1), tVar3, nVar2, c0Var2, i113 | (458752 & i24) | (i24 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j11 = jD;
                    tVar2 = tVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    tVar2 = tVar;
                    a0Var3 = a0Var2;
                    j11 = j10;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.d0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.k(z10, function0, a0Var3, j11, tVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    float f15 = 0;
                    jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f15))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f15))) << 32));
                } else {
                    jD = j10;
                }
                if (i15 != 0) {
                    tVar3 = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);
                } else {
                    tVar3 = tVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2042390678, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                }
                int i114 = i12 & 8190;
                int i25 = i12 << 3;
                c0Var2 = c0VarR;
                e(z11, function1, a0Var4, jD, androidx.compose.foundation.q4.f(0, c0VarR, 0, 1), tVar3, nVar2, c0Var2, i114 | (458752 & i25) | (i25 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j11 = jD;
                tVar2 = tVar3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                tVar2 = tVar;
                a0Var3 = a0Var2;
                j11 = j10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.k(z10, function0, a0Var3, j11, tVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        if ((i11 & 32) != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    float f16 = 0;
                    jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f16))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f16))) << 32));
                } else {
                    jD = j10;
                }
                if (i15 != 0) {
                    tVar3 = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);
                } else {
                    tVar3 = tVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2042390678, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                }
                int i115 = i12 & 8190;
                int i26 = i12 << 3;
                c0Var2 = c0VarR;
                e(z11, function1, a0Var4, jD, androidx.compose.foundation.q4.f(0, c0VarR, 0, 1), tVar3, nVar2, c0Var2, i115 | (458752 & i26) | (i26 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j11 = jD;
                tVar2 = tVar3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                tVar2 = tVar;
                a0Var3 = a0Var2;
                j11 = j10;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.k(z10, function0, a0Var3, j11, tVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        nVar2 = nVar;
        if ((74899 & i12) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i18 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                float f17 = 0;
                jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f17))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f17))) << 32));
            } else {
                jD = j10;
            }
            if (i15 != 0) {
                tVar3 = new androidx.compose.ui.window.t(true, false, false, false, 14, (DefaultConstructorMarker) null);
            } else {
                tVar3 = tVar;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2042390678, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
            }
            int i116 = i12 & 8190;
            int i27 = i12 << 3;
            c0Var2 = c0VarR;
            e(z11, function1, a0Var4, jD, androidx.compose.foundation.q4.f(0, c0VarR, 0, 1), tVar3, nVar2, c0Var2, i116 | (458752 & i27) | (i27 & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            j11 = jD;
            tVar2 = tVar3;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            tVar2 = tVar;
            a0Var3 = a0Var2;
            j11 = j10;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e0.k(z10, function0, a0Var3, j11, tVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void g(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.layout.g5 g5Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i19;
        boolean z12;
        final androidx.compose.foundation.layout.g5 g5Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z14;
        androidx.compose.foundation.layout.g5 g5VarA;
        androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(670540513);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c0VarR.D(g5Var)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c0VarR.D(jVar)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= androidx.profileinstaller.n.c.f73814m;
                            nVar2 = nVar;
                        } else {
                            nVar2 = nVar;
                            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                                i12 |= i19;
                            }
                        }
                        if ((74899 & i12) != 74898) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                g5VarA = ca.f22312a.a();
                            } else {
                                g5VarA = g5Var;
                            }
                            if (i17 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                            }
                            ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z13 = z14;
                            g5Var2 = g5VarA;
                            jVar2 = jVar3;
                        } else {
                            c0VarR.u();
                            g5Var2 = g5Var;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            jVar2 = jVar;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            g5VarA = ca.f22312a.a();
                        } else {
                            g5VarA = g5Var;
                        }
                        if (i17 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                        }
                        ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        g5Var2 = g5VarA;
                        jVar2 = jVar3;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            g5VarA = ca.f22312a.a();
                        } else {
                            g5VarA = g5Var;
                        }
                        if (i17 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                        }
                        ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        g5Var2 = g5VarA;
                        jVar2 = jVar3;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                    }
                    ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    g5Var2 = g5VarA;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            g5VarA = ca.f22312a.a();
                        } else {
                            g5VarA = g5Var;
                        }
                        if (i17 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                        }
                        ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        g5Var2 = g5VarA;
                        jVar2 = jVar3;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                    }
                    ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    g5Var2 = g5VarA;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                    }
                    ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    g5Var2 = g5VarA;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    g5VarA = ca.f22312a.a();
                } else {
                    g5VarA = g5Var;
                }
                if (i17 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                }
                ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                g5Var2 = g5VarA;
                jVar2 = jVar3;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar2 = nVar;
                    } else {
                        nVar2 = nVar;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            g5VarA = ca.f22312a.a();
                        } else {
                            g5VarA = g5Var;
                        }
                        if (i17 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                        }
                        ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        g5Var2 = g5VarA;
                        jVar2 = jVar3;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                    }
                    ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    g5Var2 = g5VarA;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                    }
                    ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    g5Var2 = g5VarA;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    g5VarA = ca.f22312a.a();
                } else {
                    g5VarA = g5Var;
                }
                if (i17 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                }
                ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                g5Var2 = g5VarA;
                jVar2 = jVar3;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.D(g5Var)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar2 = nVar;
                } else {
                    nVar2 = nVar;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                    }
                    ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    g5Var2 = g5VarA;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    g5VarA = ca.f22312a.a();
                } else {
                    g5VarA = g5Var;
                }
                if (i17 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                }
                ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                g5Var2 = g5VarA;
                jVar2 = jVar3;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.D(jVar)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    g5VarA = ca.f22312a.a();
                } else {
                    g5VarA = g5Var;
                }
                if (i17 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                }
                ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                g5Var2 = g5VarA;
                jVar2 = jVar3;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
        }
        if ((74899 & i12) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i20 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (i15 != 0) {
                g5VarA = ca.f22312a.a();
            } else {
                g5VarA = g5Var;
            }
            if (i17 != 0) {
                jVar3 = null;
            } else {
                jVar3 = jVar;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(670540513, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
            }
            ga.i(function1, a0Var4, z14, g5VarA, jVar3, nVar2, c0VarR, i12 & 524286, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            z13 = z14;
            g5Var2 = g5VarA;
            jVar2 = jVar3;
        } else {
            c0VarR.u();
            g5Var2 = g5Var;
            a0Var3 = a0Var2;
            z13 = z11;
            jVar2 = jVar;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e0.h(function0, a0Var3, z13, g5Var2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.layout.g5 g5Var, androidx.compose.foundation.interaction.j jVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g(function0, a0Var, z10, g5Var, jVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.runtime.n3 n3Var, androidx.compose.ui.unit.s sVar, androidx.compose.ui.unit.s sVar2) {
        n3Var.setValue(androidx.compose.ui.graphics.z3.b(ga.l(sVar, sVar2)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, long j10, androidx.compose.foundation.b5 b5Var, androidx.compose.ui.window.t tVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(z10, function0, a0Var, j10, b5Var, tVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, long j10, androidx.compose.ui.window.t tVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(z10, function0, a0Var, j10, tVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.window.t l() {
        return f22591a;
    }
}
