package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.runtime.s5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n607#2:457\n604#2,6:458\n607#2:495\n604#2,6:496\n1282#3,3:464\n1285#3,3:468\n1282#3,6:471\n1282#3,6:477\n1282#3,6:483\n1282#3,6:489\n1282#3,3:502\n1285#3,3:506\n1282#3,6:509\n1282#3,6:515\n1282#3,6:521\n1282#3,6:527\n605#4:467\n605#4:505\n54#5:533\n59#5:535\n54#5:537\n59#5:539\n85#6:534\n90#6:536\n85#6:538\n90#6:540\n1#7:541\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n*L\n189#1:457\n189#1:458,6\n372#1:495\n372#1:496,6\n189#1:464,3\n189#1:468,3\n190#1:471,6\n279#1:477,6\n286#1:483,6\n287#1:489,6\n372#1:502,3\n372#1:506,3\n373#1:509,6\n437#1:515,6\n439#1:521,6\n440#1:527,6\n189#1:467\n372#1:505\n289#1:533\n289#1:535\n442#1:537\n442#1:539\n289#1:534\n289#1:536\n442#1:538\n442#1:540\n*E\n"})
public final class s {
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:111:0x0166  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:96:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void i(@Nullable androidx.compose.ui.a0 a0Var, boolean z10, long j10, @Nullable final float[] fArr, @NotNull final Function1<? super h, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        boolean z11;
        long jA;
        int i13;
        androidx.compose.ui.graphics.c2 c2VarA;
        int i14;
        Function1<? super h, Unit> function2;
        int i15;
        boolean z12;
        final float[] fArr2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final long j11;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        final boolean z14;
        final g gVarS;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        Object objI1;
        boolean z15;
        androidx.compose.ui.graphics.c2 c2VarA2;
        boolean zK0;
        Object objI2;
        final long j12;
        int i16;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(217541314);
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
                z11 = z10;
                i12 |= c0VarR.G(z11) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                jA = j10;
                if ((i11 & 4) == 0 || !c0VarR.L(jA)) {
                    i16 = 128;
                } else {
                    i16 = 256;
                }
                i12 |= i16;
            } else {
                jA = j10;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (fArr != null) {
                    c2VarA = androidx.compose.ui.graphics.c2.a(fArr);
                } else {
                    c2VarA = null;
                }
                if (c0VarR.k0(c2VarA)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function2 = function1;
                    if (c0VarR.k0(function2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            jA = androidx.compose.ui.unit.u.f42720b.a();
                        }
                        if (i13 != 0) {
                            z14 = z11;
                            fArr = null;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(217541314, i12, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
                        }
                        gVarS = s(c0VarR, 0);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s.j((Context) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function1 function3 = (Function1) objI0;
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s.k((TextureView) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function1 function4 = (Function1) objI1;
                        boolean zK1 = ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jA)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(gVarS);
                        if ((57344 & i12) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z16 = zK1 | z15 | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
                        if (fArr != null) {
                            c2VarA2 = androidx.compose.ui.graphics.c2.a(fArr);
                        } else {
                            c2VarA2 = null;
                        }
                        zK0 = z16 | c0VarR.k0(c2VarA2);
                        objI2 = c0VarR.i0();
                        if (!zK0 || objI2 == aVar.a()) {
                            j12 = jA;
                            final Function1<? super h, Unit> function5 = function2;
                            objI2 = new Function1() { // from class: androidx.compose.foundation.q
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s.l(j12, gVarS, function5, z14, fArr, (TextureView) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            j12 = jA;
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var4;
                        androidx.compose.ui.viewinterop.e.b(function3, a0Var5, function4, null, (Function1) objI2, c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 8);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        j11 = j12;
                        z13 = z14;
                        fArr2 = fArr;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        a0Var4 = a0Var2;
                    }
                    z14 = z11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(217541314, i12, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
                    }
                    gVarS = s(c0VarR, 0);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.j((Context) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function1 function6 = (Function1) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.k((TextureView) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function1 function7 = (Function1) objI1;
                    boolean zK2 = ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jA)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(gVarS);
                    if ((57344 & i12) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z17 = zK2 | z15 | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
                    if (fArr != null) {
                        c2VarA2 = androidx.compose.ui.graphics.c2.a(fArr);
                    } else {
                        c2VarA2 = null;
                    }
                    zK0 = z17 | c0VarR.k0(c2VarA2);
                    objI2 = c0VarR.i0();
                    if (zK0) {
                        j12 = jA;
                        final Function1 function8 = function2;
                        objI2 = new Function1() { // from class: androidx.compose.foundation.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.l(j12, gVarS, function8, z14, fArr, (TextureView) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        j12 = jA;
                        final Function1 function9 = function2;
                        objI2 = new Function1() { // from class: androidx.compose.foundation.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.l(j12, gVarS, function9, z14, fArr, (TextureView) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0Var6 = a0Var4;
                    androidx.compose.ui.viewinterop.e.b(function6, a0Var6, function7, null, (Function1) objI2, c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 8);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var6;
                    j11 = j12;
                    z13 = z14;
                    fArr2 = fArr;
                } else {
                    c0VarR.u();
                    fArr2 = fArr;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    j11 = jA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.r
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s.m(a0Var3, z13, j11, fArr2, function1, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function2 = function1;
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i13 != 0) {
                        z14 = z11;
                        fArr = null;
                    } else {
                        z14 = z11;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i13 != 0) {
                        z14 = z11;
                        fArr = null;
                    } else {
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(217541314, i12, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
                }
                gVarS = s(c0VarR, 0);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.j((Context) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function1 function10 = (Function1) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.k((TextureView) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function1 function11 = (Function1) objI1;
                boolean zK3 = ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jA)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(gVarS);
                if ((57344 & i12) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z18 = zK3 | z15 | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
                if (fArr != null) {
                    c2VarA2 = androidx.compose.ui.graphics.c2.a(fArr);
                } else {
                    c2VarA2 = null;
                }
                zK0 = z18 | c0VarR.k0(c2VarA2);
                objI2 = c0VarR.i0();
                if (zK0) {
                    j12 = jA;
                    final Function1 function12 = function2;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.l(j12, gVarS, function12, z14, fArr, (TextureView) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    j12 = jA;
                    final Function1 function13 = function2;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.l(j12, gVarS, function13, z14, fArr, (TextureView) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0Var7 = a0Var4;
                androidx.compose.ui.viewinterop.e.b(function10, a0Var7, function11, null, (Function1) objI2, c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 8);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var7;
                j11 = j12;
                z13 = z14;
                fArr2 = fArr;
            } else {
                c0VarR.u();
                fArr2 = fArr;
                a0Var3 = a0Var2;
                z13 = z11;
                j11 = jA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.r
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.m(a0Var3, z13, j11, fArr2, function1, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        z11 = z10;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            jA = j10;
            if ((i11 & 4) == 0) {
                i16 = 128;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        } else {
            jA = j10;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (fArr != null) {
                c2VarA = androidx.compose.ui.graphics.c2.a(fArr);
            } else {
                c2VarA = null;
            }
            if (c0VarR.k0(c2VarA)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i11 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                function2 = function1;
                if (c0VarR.k0(function2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i13 != 0) {
                        z14 = z11;
                        fArr = null;
                    } else {
                        z14 = z11;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i13 != 0) {
                        z14 = z11;
                        fArr = null;
                    } else {
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(217541314, i12, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
                }
                gVarS = s(c0VarR, 0);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.j((Context) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function1 function14 = (Function1) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.k((TextureView) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function1 function15 = (Function1) objI1;
                boolean zK4 = ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jA)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(gVarS);
                if ((57344 & i12) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z19 = zK4 | z15 | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
                if (fArr != null) {
                    c2VarA2 = androidx.compose.ui.graphics.c2.a(fArr);
                } else {
                    c2VarA2 = null;
                }
                zK0 = z19 | c0VarR.k0(c2VarA2);
                objI2 = c0VarR.i0();
                if (zK0) {
                    j12 = jA;
                    final Function1 function16 = function2;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.l(j12, gVarS, function16, z14, fArr, (TextureView) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    j12 = jA;
                    final Function1 function17 = function2;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.l(j12, gVarS, function17, z14, fArr, (TextureView) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0Var8 = a0Var4;
                androidx.compose.ui.viewinterop.e.b(function14, a0Var8, function15, null, (Function1) objI2, c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 8);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var8;
                j11 = j12;
                z13 = z14;
                fArr2 = fArr;
            } else {
                c0VarR.u();
                fArr2 = fArr;
                a0Var3 = a0Var2;
                z13 = z11;
                j11 = jA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.r
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.m(a0Var3, z13, j11, fArr2, function1, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function2 = function1;
        if ((i12 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i18 != 0) {
                    z11 = true;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jA = androidx.compose.ui.unit.u.f42720b.a();
                }
                if (i13 != 0) {
                    z14 = z11;
                    fArr = null;
                } else {
                    z14 = z11;
                }
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i18 != 0) {
                    z11 = true;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    jA = androidx.compose.ui.unit.u.f42720b.a();
                }
                if (i13 != 0) {
                    z14 = z11;
                    fArr = null;
                } else {
                    z14 = z11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(217541314, i12, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
            }
            gVarS = s(c0VarR, 0);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.j((Context) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            Function1 function18 = (Function1) objI0;
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.foundation.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.k((TextureView) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            Function1 function19 = (Function1) objI1;
            boolean zK5 = ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jA)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(gVarS);
            if ((57344 & i12) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z110 = zK5 | z15 | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
            if (fArr != null) {
                c2VarA2 = androidx.compose.ui.graphics.c2.a(fArr);
            } else {
                c2VarA2 = null;
            }
            zK0 = z110 | c0VarR.k0(c2VarA2);
            objI2 = c0VarR.i0();
            if (zK0) {
                j12 = jA;
                final Function1 function110 = function2;
                objI2 = new Function1() { // from class: androidx.compose.foundation.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.l(j12, gVarS, function110, z14, fArr, (TextureView) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                j12 = jA;
                final Function1 function111 = function2;
                objI2 = new Function1() { // from class: androidx.compose.foundation.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.l(j12, gVarS, function111, z14, fArr, (TextureView) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.a0 a0Var9 = a0Var4;
            androidx.compose.ui.viewinterop.e.b(function18, a0Var9, function19, null, (Function1) objI2, c0VarR, ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | 390, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var9;
            j11 = j12;
            z13 = z14;
            fArr2 = fArr;
        } else {
            c0VarR.u();
            fArr2 = fArr;
            a0Var3 = a0Var2;
            z13 = z11;
            j11 = jA;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s.m(a0Var3, z13, j11, fArr2, function1, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureView j(Context context) {
        return new TextureView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(TextureView textureView) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(long j10, g gVar, Function1 function1, boolean z10, float[] fArr, TextureView textureView) {
        Matrix matrixJ;
        SurfaceTexture surfaceTexture;
        if (!androidx.compose.ui.unit.u.h(j10, androidx.compose.ui.unit.u.f42720b.a()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize((int) (j10 >> 32), (int) (com.rabbitmq.client.k0.f265952a & j10));
        }
        gVar.l(j10);
        if (textureView.getSurfaceTextureListener() != gVar) {
            function1.invoke(gVar);
            textureView.setSurfaceTextureListener(gVar);
        }
        textureView.setOpaque(z10);
        if (fArr != null) {
            matrixJ = gVar.j();
            androidx.compose.ui.graphics.k.a(matrixJ, fArr);
        } else {
            matrixJ = null;
        }
        textureView.setTransform(matrixJ);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.a0 a0Var, boolean z10, long j10, float[] fArr, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(a0Var, z10, j10, fArr, function1, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x0159  */
    /* JADX WARN: Code duplicated, block: B:111:0x016b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0182  */
    /* JADX WARN: Code duplicated, block: B:123:0x018a  */
    /* JADX WARN: Code duplicated, block: B:124:0x018f  */
    /* JADX WARN: Code duplicated, block: B:128:0x019a  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x0207  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void n(@Nullable androidx.compose.ui.a0 a0Var, boolean z10, long j10, int i10, boolean z11, @NotNull final Function1<? super h, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        long jA;
        int i14;
        int iA;
        int i15;
        int i16;
        boolean z13;
        int i17;
        int i18;
        boolean z14;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final long j11;
        final boolean z16;
        final int i19;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.a0 a0Var5;
        final i iVarT;
        boolean z17;
        boolean zK0;
        Object objI0;
        Object objI1;
        androidx.compose.runtime.c0.a aVar;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objI2;
        long j12;
        boolean z21;
        int i20;
        boolean z22;
        int i21;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(640888974);
        int i22 = i12 & 1;
        if (i22 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        int i23 = i12 & 2;
        if (i23 == 0) {
            if ((i11 & 48) == 0) {
                z12 = z10;
                i13 |= c0VarR.G(z12) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                jA = j10;
                if ((i12 & 4) == 0 || !c0VarR.L(jA)) {
                    i21 = 128;
                } else {
                    i21 = 256;
                }
                i13 |= i21;
            } else {
                jA = j10;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    iA = i10;
                    if (c0VarR.K(iA)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function1)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0 || c0VarR.y()) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i23 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                jA = androidx.compose.ui.unit.u.f42720b.a();
                            }
                            if (i14 != 0) {
                                iA = j.f15701b.a();
                            }
                            if (i16 != 0) {
                                z13 = false;
                            }
                            a0Var5 = a0Var4;
                        } else {
                            c0VarR.u();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            a0Var5 = a0Var2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                        }
                        iVarT = t(c0VarR, 0);
                        if ((458752 & i13) == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zK0 = z17 | c0VarR.k0(iVarT);
                        objI0 = c0VarR.i0();
                        if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s.o(function1, iVarT, (Context) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function1 function2 = (Function1) objI0;
                        objI1 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar.a()) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.l
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s.p((SurfaceView) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function1 function3 = (Function1) objI1;
                        boolean z23 = (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jA)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256;
                        if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean z24 = z18 | z23;
                        if ((i13 & 7168) == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = z24 | z19 | ((57344 & i13) == 16384);
                        objI2 = c0VarR.i0();
                        if (!z20 || objI2 == aVar.a()) {
                            final boolean z25 = z12;
                            final long j13 = jA;
                            final boolean z26 = z13;
                            final int i24 = iA;
                            objI2 = new Function1() { // from class: androidx.compose.foundation.m
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s.q(j13, z25, i24, z26, (SurfaceView) obj);
                                }
                            };
                            j12 = j13;
                            z21 = z25;
                            i20 = i24;
                            z22 = z26;
                            c0VarR.Y(objI2);
                        } else {
                            z21 = z12;
                            j12 = jA;
                            z22 = z13;
                            i20 = iA;
                        }
                        androidx.compose.ui.viewinterop.e.b(function2, a0Var5, function3, null, (Function1) objI2, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.media3.exoplayer.a5.S0, 8);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j11 = j12;
                        a0Var3 = a0Var5;
                        z16 = z22;
                        i19 = i20;
                        z15 = z21;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z12;
                        j11 = jA;
                        z16 = z13;
                        i19 = iA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s.r(a0Var3, z15, j11, i19, z16, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                z13 = z11;
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function1)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((i13 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i23 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jA = androidx.compose.ui.unit.u.f42720b.a();
                        }
                        if (i14 != 0) {
                            iA = j.f15701b.a();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        a0Var5 = a0Var4;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i23 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jA = androidx.compose.ui.unit.u.f42720b.a();
                        }
                        if (i14 != 0) {
                            iA = j.f15701b.a();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                    }
                    iVarT = t(c0VarR, 0);
                    if ((458752 & i13) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zK0 = z17 | c0VarR.k0(iVarT);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.o(function1, iVarT, (Context) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.o(function1, iVarT, (Context) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function1 function4 = (Function1) objI0;
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.p((SurfaceView) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function1 function5 = (Function1) objI1;
                    if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                    }
                    if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z27 = z18 | z23;
                    if ((i13 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z27 | z19 | ((57344 & i13) == 16384);
                    objI2 = c0VarR.i0();
                    if (z20) {
                        final boolean z28 = z12;
                        final long j14 = jA;
                        final boolean z29 = z13;
                        final int i25 = iA;
                        objI2 = new Function1() { // from class: androidx.compose.foundation.m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.q(j14, z28, i25, z29, (SurfaceView) obj);
                            }
                        };
                        j12 = j14;
                        z21 = z28;
                        i20 = i25;
                        z22 = z29;
                        c0VarR.Y(objI2);
                    } else {
                        final boolean z210 = z12;
                        final long j15 = jA;
                        final boolean z211 = z13;
                        final int i26 = iA;
                        objI2 = new Function1() { // from class: androidx.compose.foundation.m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.q(j15, z210, i26, z211, (SurfaceView) obj);
                            }
                        };
                        j12 = j15;
                        z21 = z210;
                        i20 = i26;
                        z22 = z211;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.viewinterop.e.b(function4, a0Var5, function5, null, (Function1) objI2, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.media3.exoplayer.a5.S0, 8);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j12;
                    a0Var3 = a0Var5;
                    z16 = z22;
                    i19 = i20;
                    z15 = z21;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z12;
                    j11 = jA;
                    z16 = z13;
                    i19 = iA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s.r(a0Var3, z15, j11, i19, z16, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            iA = i10;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function1)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((i13 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i23 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jA = androidx.compose.ui.unit.u.f42720b.a();
                        }
                        if (i14 != 0) {
                            iA = j.f15701b.a();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        a0Var5 = a0Var4;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i23 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jA = androidx.compose.ui.unit.u.f42720b.a();
                        }
                        if (i14 != 0) {
                            iA = j.f15701b.a();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                    }
                    iVarT = t(c0VarR, 0);
                    if ((458752 & i13) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zK0 = z17 | c0VarR.k0(iVarT);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.o(function1, iVarT, (Context) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.o(function1, iVarT, (Context) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function1 function6 = (Function1) objI0;
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.p((SurfaceView) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function1 function7 = (Function1) objI1;
                    if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                    }
                    if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z212 = z18 | z23;
                    if ((i13 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z212 | z19 | ((57344 & i13) == 16384);
                    objI2 = c0VarR.i0();
                    if (z20) {
                        final boolean z213 = z12;
                        final long j16 = jA;
                        final boolean z214 = z13;
                        final int i27 = iA;
                        objI2 = new Function1() { // from class: androidx.compose.foundation.m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.q(j16, z213, i27, z214, (SurfaceView) obj);
                            }
                        };
                        j12 = j16;
                        z21 = z213;
                        i20 = i27;
                        z22 = z214;
                        c0VarR.Y(objI2);
                    } else {
                        final boolean z215 = z12;
                        final long j17 = jA;
                        final boolean z216 = z13;
                        final int i28 = iA;
                        objI2 = new Function1() { // from class: androidx.compose.foundation.m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.q(j17, z215, i28, z216, (SurfaceView) obj);
                            }
                        };
                        j12 = j17;
                        z21 = z215;
                        i20 = i28;
                        z22 = z216;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.viewinterop.e.b(function6, a0Var5, function7, null, (Function1) objI2, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.media3.exoplayer.a5.S0, 8);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j12;
                    a0Var3 = a0Var5;
                    z16 = z22;
                    i19 = i20;
                    z15 = z21;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z12;
                    j11 = jA;
                    z16 = z13;
                    i19 = iA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s.r(a0Var3, z15, j11, i19, z16, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z13 = z11;
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function1)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((i13 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i23 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i14 != 0) {
                        iA = j.f15701b.a();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    a0Var5 = a0Var4;
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i23 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i14 != 0) {
                        iA = j.f15701b.a();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                }
                iVarT = t(c0VarR, 0);
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zK0 = z17 | c0VarR.k0(iVarT);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.o(function1, iVarT, (Context) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.o(function1, iVarT, (Context) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function1 function8 = (Function1) objI0;
                objI1 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.p((SurfaceView) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function1 function9 = (Function1) objI1;
                if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                }
                if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z217 = z18 | z23;
                if ((i13 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z217 | z19 | ((57344 & i13) == 16384);
                objI2 = c0VarR.i0();
                if (z20) {
                    final boolean z218 = z12;
                    final long j18 = jA;
                    final boolean z219 = z13;
                    final int i29 = iA;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.q(j18, z218, i29, z219, (SurfaceView) obj);
                        }
                    };
                    j12 = j18;
                    z21 = z218;
                    i20 = i29;
                    z22 = z219;
                    c0VarR.Y(objI2);
                } else {
                    final boolean z2110 = z12;
                    final long j19 = jA;
                    final boolean z2111 = z13;
                    final int i210 = iA;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.q(j19, z2110, i210, z2111, (SurfaceView) obj);
                        }
                    };
                    j12 = j19;
                    z21 = z2110;
                    i20 = i210;
                    z22 = z2111;
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.viewinterop.e.b(function8, a0Var5, function9, null, (Function1) objI2, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.media3.exoplayer.a5.S0, 8);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j11 = j12;
                a0Var3 = a0Var5;
                z16 = z22;
                i19 = i20;
                z15 = z21;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z12;
                j11 = jA;
                z16 = z13;
                i19 = iA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.r(a0Var3, z15, j11, i19, z16, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        z12 = z10;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            jA = j10;
            if ((i12 & 4) == 0) {
                i21 = 128;
            } else {
                i21 = 128;
            }
            i13 |= i21;
        } else {
            jA = j10;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                iA = i10;
                if (c0VarR.K(iA)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function1)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((i13 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i23 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jA = androidx.compose.ui.unit.u.f42720b.a();
                        }
                        if (i14 != 0) {
                            iA = j.f15701b.a();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        a0Var5 = a0Var4;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i23 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            jA = androidx.compose.ui.unit.u.f42720b.a();
                        }
                        if (i14 != 0) {
                            iA = j.f15701b.a();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                    }
                    iVarT = t(c0VarR, 0);
                    if ((458752 & i13) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zK0 = z17 | c0VarR.k0(iVarT);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.o(function1, iVarT, (Context) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.o(function1, iVarT, (Context) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function1 function10 = (Function1) objI0;
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.p((SurfaceView) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function1 function11 = (Function1) objI1;
                    if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                    }
                    if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z2112 = z18 | z23;
                    if ((i13 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z2112 | z19 | ((57344 & i13) == 16384);
                    objI2 = c0VarR.i0();
                    if (z20) {
                        final boolean z2113 = z12;
                        final long j110 = jA;
                        final boolean z2114 = z13;
                        final int i211 = iA;
                        objI2 = new Function1() { // from class: androidx.compose.foundation.m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.q(j110, z2113, i211, z2114, (SurfaceView) obj);
                            }
                        };
                        j12 = j110;
                        z21 = z2113;
                        i20 = i211;
                        z22 = z2114;
                        c0VarR.Y(objI2);
                    } else {
                        final boolean z2115 = z12;
                        final long j111 = jA;
                        final boolean z2116 = z13;
                        final int i212 = iA;
                        objI2 = new Function1() { // from class: androidx.compose.foundation.m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s.q(j111, z2115, i212, z2116, (SurfaceView) obj);
                            }
                        };
                        j12 = j111;
                        z21 = z2115;
                        i20 = i212;
                        z22 = z2116;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.viewinterop.e.b(function10, a0Var5, function11, null, (Function1) objI2, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.media3.exoplayer.a5.S0, 8);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j11 = j12;
                    a0Var3 = a0Var5;
                    z16 = z22;
                    i19 = i20;
                    z15 = z21;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z12;
                    j11 = jA;
                    z16 = z13;
                    i19 = iA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s.r(a0Var3, z15, j11, i19, z16, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z13 = z11;
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function1)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((i13 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i23 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i14 != 0) {
                        iA = j.f15701b.a();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    a0Var5 = a0Var4;
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i23 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i14 != 0) {
                        iA = j.f15701b.a();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                }
                iVarT = t(c0VarR, 0);
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zK0 = z17 | c0VarR.k0(iVarT);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.o(function1, iVarT, (Context) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.o(function1, iVarT, (Context) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function1 function12 = (Function1) objI0;
                objI1 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.p((SurfaceView) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function1 function13 = (Function1) objI1;
                if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                }
                if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z2117 = z18 | z23;
                if ((i13 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z2117 | z19 | ((57344 & i13) == 16384);
                objI2 = c0VarR.i0();
                if (z20) {
                    final boolean z2118 = z12;
                    final long j112 = jA;
                    final boolean z2119 = z13;
                    final int i213 = iA;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.q(j112, z2118, i213, z2119, (SurfaceView) obj);
                        }
                    };
                    j12 = j112;
                    z21 = z2118;
                    i20 = i213;
                    z22 = z2119;
                    c0VarR.Y(objI2);
                } else {
                    final boolean z21110 = z12;
                    final long j113 = jA;
                    final boolean z21111 = z13;
                    final int i214 = iA;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.q(j113, z21110, i214, z21111, (SurfaceView) obj);
                        }
                    };
                    j12 = j113;
                    z21 = z21110;
                    i20 = i214;
                    z22 = z21111;
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.viewinterop.e.b(function12, a0Var5, function13, null, (Function1) objI2, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.media3.exoplayer.a5.S0, 8);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j11 = j12;
                a0Var3 = a0Var5;
                z16 = z22;
                i19 = i20;
                z15 = z21;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z12;
                j11 = jA;
                z16 = z13;
                i19 = iA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.r(a0Var3, z15, j11, i19, z16, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        iA = i10;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function1)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((i13 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i23 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i14 != 0) {
                        iA = j.f15701b.a();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    a0Var5 = a0Var4;
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i23 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        jA = androidx.compose.ui.unit.u.f42720b.a();
                    }
                    if (i14 != 0) {
                        iA = j.f15701b.a();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                }
                iVarT = t(c0VarR, 0);
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zK0 = z17 | c0VarR.k0(iVarT);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.o(function1, iVarT, (Context) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.o(function1, iVarT, (Context) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function1 function14 = (Function1) objI0;
                objI1 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.p((SurfaceView) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function1 function15 = (Function1) objI1;
                if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                }
                if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z21112 = z18 | z23;
                if ((i13 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z21112 | z19 | ((57344 & i13) == 16384);
                objI2 = c0VarR.i0();
                if (z20) {
                    final boolean z21113 = z12;
                    final long j114 = jA;
                    final boolean z21114 = z13;
                    final int i215 = iA;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.q(j114, z21113, i215, z21114, (SurfaceView) obj);
                        }
                    };
                    j12 = j114;
                    z21 = z21113;
                    i20 = i215;
                    z22 = z21114;
                    c0VarR.Y(objI2);
                } else {
                    final boolean z21115 = z12;
                    final long j115 = jA;
                    final boolean z21116 = z13;
                    final int i216 = iA;
                    objI2 = new Function1() { // from class: androidx.compose.foundation.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s.q(j115, z21115, i216, z21116, (SurfaceView) obj);
                        }
                    };
                    j12 = j115;
                    z21 = z21115;
                    i20 = i216;
                    z22 = z21116;
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.viewinterop.e.b(function14, a0Var5, function15, null, (Function1) objI2, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.media3.exoplayer.a5.S0, 8);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j11 = j12;
                a0Var3 = a0Var5;
                z16 = z22;
                i19 = i20;
                z15 = z21;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z12;
                j11 = jA;
                z16 = z13;
                i19 = iA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.r(a0Var3, z15, j11, i19, z16, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        z13 = z11;
        if ((i12 & 32) != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(function1)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i13 |= i18;
        }
        if ((i13 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i23 != 0) {
                    z12 = true;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    jA = androidx.compose.ui.unit.u.f42720b.a();
                }
                if (i14 != 0) {
                    iA = j.f15701b.a();
                }
                if (i16 != 0) {
                    z13 = false;
                }
                a0Var5 = a0Var4;
            } else {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i23 != 0) {
                    z12 = true;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    jA = androidx.compose.ui.unit.u.f42720b.a();
                }
                if (i14 != 0) {
                    iA = j.f15701b.a();
                }
                if (i16 != 0) {
                    z13 = false;
                }
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(640888974, i13, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
            }
            iVarT = t(c0VarR, 0);
            if ((458752 & i13) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            zK0 = z17 | c0VarR.k0(iVarT);
            objI0 = c0VarR.i0();
            if (zK0) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.o(function1, iVarT, (Context) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.foundation.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.o(function1, iVarT, (Context) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            Function1 function16 = (Function1) objI0;
            objI1 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.foundation.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.p((SurfaceView) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            Function1 function17 = (Function1) objI1;
            if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
            }
            if ((i13 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z21117 = z18 | z23;
            if ((i13 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = z21117 | z19 | ((57344 & i13) == 16384);
            objI2 = c0VarR.i0();
            if (z20) {
                final boolean z21118 = z12;
                final long j116 = jA;
                final boolean z21119 = z13;
                final int i217 = iA;
                objI2 = new Function1() { // from class: androidx.compose.foundation.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.q(j116, z21118, i217, z21119, (SurfaceView) obj);
                    }
                };
                j12 = j116;
                z21 = z21118;
                i20 = i217;
                z22 = z21119;
                c0VarR.Y(objI2);
            } else {
                final boolean z211110 = z12;
                final long j117 = jA;
                final boolean z211111 = z13;
                final int i218 = iA;
                objI2 = new Function1() { // from class: androidx.compose.foundation.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s.q(j117, z211110, i218, z211111, (SurfaceView) obj);
                    }
                };
                j12 = j117;
                z21 = z211110;
                i20 = i218;
                z22 = z211111;
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.viewinterop.e.b(function16, a0Var5, function17, null, (Function1) objI2, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.media3.exoplayer.a5.S0, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j11 = j12;
            a0Var3 = a0Var5;
            z16 = z22;
            i19 = i20;
            z15 = z21;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z15 = z12;
            j11 = jA;
            z16 = z13;
            i19 = iA;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s.r(a0Var3, z15, j11, i19, z16, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurfaceView o(Function1 function1, i iVar, Context context) {
        SurfaceView surfaceView = new SurfaceView(context);
        function1.invoke(iVar);
        surfaceView.getHolder().addCallback(iVar);
        return surfaceView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(SurfaceView surfaceView) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(long j10, boolean z10, int i10, boolean z11, SurfaceView surfaceView) {
        if (androidx.compose.ui.unit.u.h(j10, androidx.compose.ui.unit.u.f42720b.a())) {
            surfaceView.getHolder().setSizeFromLayout();
        } else {
            surfaceView.getHolder().setFixedSize((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a));
        }
        surfaceView.getHolder().setFormat(z10 ? -1 : -3);
        j.a aVar = j.f15701b;
        if (j.g(i10, aVar.a())) {
            surfaceView.setZOrderOnTop(false);
        } else if (j.g(i10, aVar.b())) {
            surfaceView.setZOrderMediaOverlay(true);
        } else if (j.g(i10, aVar.c())) {
            surfaceView.setZOrderOnTop(true);
        }
        surfaceView.setSecure(z11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.ui.a0 a0Var, boolean z10, long j10, int i10, boolean z11, Function1 function1, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        n(a0Var, z10, j10, i10, z11, function1, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final g s(androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1057437053, i10, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:370)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
            c0Var.Y(objI0);
        }
        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
        Object objI1 = c0Var.i0();
        if (objI1 == aVar.a()) {
            objI1 = new g(s0Var);
            c0Var.Y(objI1);
        }
        g gVar = (g) objI1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return gVar;
    }

    @androidx.compose.runtime.o
    private static final i t(androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-873615933, i10, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:187)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
            c0Var.Y(objI0);
        }
        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
        Object objI1 = c0Var.i0();
        if (objI1 == aVar.a()) {
            objI1 = new i(s0Var);
            c0Var.Y(objI1);
        }
        i iVar = (i) objI1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return iVar;
    }
}
