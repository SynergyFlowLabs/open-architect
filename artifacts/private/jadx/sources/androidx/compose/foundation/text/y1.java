package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,104:1\n1282#2,6:105\n1282#2,6:111\n1282#2,6:117\n1282#2,6:123\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n78#1:105,6\n81#1:111,6\n83#1:117,6\n98#1:123,6\n*E\n"})
public final class y1 {

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.text.p3> f21783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f21784b;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.runtime.n3<androidx.compose.ui.text.p3> n3Var, Function1<? super Integer, Unit> function1) {
            this.f21783a = n3Var;
            this.f21784b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(androidx.compose.runtime.n3 n3Var, Function1 function1, n0.g gVar) {
            androidx.compose.ui.text.p3 p3Var = (androidx.compose.ui.text.p3) n3Var.getValue();
            if (p3Var != null) {
                function1.invoke(Integer.valueOf(p3Var.y(gVar.B())));
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final androidx.compose.runtime.n3<androidx.compose.ui.text.p3> n3Var = this.f21783a;
            final Function1<Integer, Unit> function1 = this.f21784b;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, null, new Function1() { // from class: androidx.compose.foundation.text.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.a.b(n3Var, function1, (n0.g) obj);
                }
            }, dVar, 7, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:101:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:106:0x0152  */
    /* JADX WARN: Code duplicated, block: B:108:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0166  */
    /* JADX WARN: Code duplicated, block: B:112:0x0171  */
    /* JADX WARN: Code duplicated, block: B:115:0x0179  */
    /* JADX WARN: Code duplicated, block: B:118:0x018e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01af  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:138:0x0210  */
    /* JADX WARN: Code duplicated, block: B:141:0x021d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    @androidx.compose.runtime.o
    @kotlin.l(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation. Check LinkAnnotation's documentation for more details and samples.")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@NotNull final androidx.compose.ui.text.f fVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.text.y3 y3Var, boolean z10, int i10, int i11, @Nullable Function1<? super androidx.compose.ui.text.p3, Unit> function1, @NotNull final Function1<? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i12, final int i13) {
        androidx.compose.ui.text.f fVar2;
        int i14;
        androidx.compose.ui.a0 a0Var2;
        int i15;
        androidx.compose.ui.text.y3 y3Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        int iA;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z11;
        androidx.compose.runtime.c0 c0Var2;
        final boolean z12;
        final int i26;
        final androidx.compose.ui.text.y3 y3Var3;
        final Function1<? super androidx.compose.ui.text.p3, Unit> function3;
        final androidx.compose.ui.a0 a0Var3;
        final int i27;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.text.y3 y3VarA;
        boolean z13;
        int i28;
        int i29;
        final Function1<? super androidx.compose.ui.text.p3, Unit> function4;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final androidx.compose.runtime.n3 n3Var;
        boolean z14;
        Object objI1;
        boolean z15;
        Object objI2;
        Object objI3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-246609449);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            if ((i12 & 6) == 0) {
                i14 = (c0VarR.D(fVar2) ? 4 : 2) | i12;
            } else {
                i14 = i12;
            }
        }
        int i30 = i13 & 2;
        if (i30 == 0) {
            if ((i12 & 48) == 0) {
                a0Var2 = a0Var;
                i14 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                    y3Var2 = y3Var;
                    if (c0VarR.D(y3Var2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 3072) == 0) {
                        if (c0VarR.G(z10)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 24576) == 0) {
                            iA = i10;
                            if (c0VarR.K(iA)) {
                                i20 = 16384;
                            } else {
                                i20 = 8192;
                            }
                            i14 |= i20;
                        }
                        i21 = i13 & 32;
                        if (i21 != 0) {
                            i14 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.K(i11)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(function1)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 128) != 0) {
                            i14 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i25 = 8388608;
                            } else {
                                i25 = 4194304;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 4793491) != 4793490) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c0VarR.h(z11, i14 & 1)) {
                            if (i30 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                            } else {
                                y3VarA = y3Var2;
                            }
                            if (i17 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.v.f42256b.a();
                            }
                            if (i21 != 0) {
                                i29 = Integer.MAX_VALUE;
                                i28 = i23;
                            } else {
                                i28 = i23;
                                i29 = i11;
                            }
                            if (i28 != 0) {
                                objI3 = c0VarR.i0();
                                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return y1.e((androidx.compose.ui.text.p3) obj);
                                        }
                                    };
                                    c0VarR.Y(objI3);
                                }
                                function4 = (Function1) objI3;
                            } else {
                                function4 = function1;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                                c0VarR.Y(objI0);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI0;
                            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                            if ((29360128 & i14) == 8388608) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z14 || objI1 == aVar.a()) {
                                objI1 = new a(n3Var, function2);
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.ui.a0 a0VarB2 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar2, function2, (PointerInputEventHandler) objI1));
                            z15 = (i14 & 3670016) == 1048576;
                            objI2 = c0VarR.i0();
                            if (z15 || objI2 == aVar.a()) {
                                objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0Var2 = c0VarR;
                            p1.y(fVar2, a0VarB2, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function3 = function4;
                            y3Var3 = y3VarA;
                            z12 = z13;
                            i26 = i29;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            z12 = z10;
                            i26 = i11;
                            y3Var3 = y3Var2;
                            function3 = function1;
                        }
                        a0Var3 = a0Var2;
                        i27 = iA;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= 24576;
                    iA = i10;
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(function1)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i14 & 1)) {
                        if (i30 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                        } else {
                            y3VarA = y3Var2;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        }
                        if (i21 != 0) {
                            i29 = Integer.MAX_VALUE;
                            i28 = i23;
                        } else {
                            i28 = i23;
                            i29 = i11;
                        }
                        if (i28 != 0) {
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return y1.e((androidx.compose.ui.text.p3) obj);
                                    }
                                };
                                c0VarR.Y(objI3);
                            }
                            function4 = (Function1) objI3;
                        } else {
                            function4 = function1;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI0;
                        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                        if ((29360128 & i14) == 8388608) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new a(n3Var, function2);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new a(n3Var, function2);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarB3 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar3, function2, (PointerInputEventHandler) objI1));
                        if ((i14 & 3670016) == 1048576) {
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0Var2 = c0VarR;
                        p1.y(fVar2, a0VarB3, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function3 = function4;
                        y3Var3 = y3VarA;
                        z12 = z13;
                        i26 = i29;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z12 = z10;
                        i26 = i11;
                        y3Var3 = y3Var2;
                        function3 = function1;
                    }
                    a0Var3 = a0Var2;
                    i27 = iA;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 3072;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        iA = i10;
                        if (c0VarR.K(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(function1)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i14 & 1)) {
                        if (i30 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                        } else {
                            y3VarA = y3Var2;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        }
                        if (i21 != 0) {
                            i29 = Integer.MAX_VALUE;
                            i28 = i23;
                        } else {
                            i28 = i23;
                            i29 = i11;
                        }
                        if (i28 != 0) {
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return y1.e((androidx.compose.ui.text.p3) obj);
                                    }
                                };
                                c0VarR.Y(objI3);
                            }
                            function4 = (Function1) objI3;
                        } else {
                            function4 = function1;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI0;
                        androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                        if ((29360128 & i14) == 8388608) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new a(n3Var, function2);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new a(n3Var, function2);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarB4 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar4, function2, (PointerInputEventHandler) objI1));
                        if ((i14 & 3670016) == 1048576) {
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0Var2 = c0VarR;
                        p1.y(fVar2, a0VarB4, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function3 = function4;
                        y3Var3 = y3VarA;
                        z12 = z13;
                        i26 = i29;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z12 = z10;
                        i26 = i11;
                        y3Var3 = y3Var2;
                        function3 = function1;
                    }
                    a0Var3 = a0Var2;
                    i27 = iA;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(function1)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i14 & 4793491) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i14 & 1)) {
                    if (i30 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                    } else {
                        y3VarA = y3Var2;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    }
                    if (i21 != 0) {
                        i29 = Integer.MAX_VALUE;
                        i28 = i23;
                    } else {
                        i28 = i23;
                        i29 = i11;
                    }
                    if (i28 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.e((androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        function4 = (Function1) objI3;
                    } else {
                        function4 = function1;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                    if ((29360128 & i14) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarB5 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar5, function2, (PointerInputEventHandler) objI1));
                    if ((i14 & 3670016) == 1048576) {
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0Var2 = c0VarR;
                    p1.y(fVar2, a0VarB5, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function3 = function4;
                    y3Var3 = y3VarA;
                    z12 = z13;
                    i26 = i29;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z12 = z10;
                    i26 = i11;
                    y3Var3 = y3Var2;
                    function3 = function1;
                }
                a0Var3 = a0Var2;
                i27 = iA;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.media3.exoplayer.a5.S0;
            y3Var2 = y3Var;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    if (c0VarR.G(z10)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        iA = i10;
                        if (c0VarR.K(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(function1)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i14 & 1)) {
                        if (i30 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                        } else {
                            y3VarA = y3Var2;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        }
                        if (i21 != 0) {
                            i29 = Integer.MAX_VALUE;
                            i28 = i23;
                        } else {
                            i28 = i23;
                            i29 = i11;
                        }
                        if (i28 != 0) {
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return y1.e((androidx.compose.ui.text.p3) obj);
                                    }
                                };
                                c0VarR.Y(objI3);
                            }
                            function4 = (Function1) objI3;
                        } else {
                            function4 = function1;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI0;
                        androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                        if ((29360128 & i14) == 8388608) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new a(n3Var, function2);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new a(n3Var, function2);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarB6 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar6, function2, (PointerInputEventHandler) objI1));
                        if ((i14 & 3670016) == 1048576) {
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0Var2 = c0VarR;
                        p1.y(fVar2, a0VarB6, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function3 = function4;
                        y3Var3 = y3VarA;
                        z12 = z13;
                        i26 = i29;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z12 = z10;
                        i26 = i11;
                        y3Var3 = y3Var2;
                        function3 = function1;
                    }
                    a0Var3 = a0Var2;
                    i27 = iA;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(function1)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i14 & 4793491) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i14 & 1)) {
                    if (i30 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                    } else {
                        y3VarA = y3Var2;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    }
                    if (i21 != 0) {
                        i29 = Integer.MAX_VALUE;
                        i28 = i23;
                    } else {
                        i28 = i23;
                        i29 = i11;
                    }
                    if (i28 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.e((androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        function4 = (Function1) objI3;
                    } else {
                        function4 = function1;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    androidx.compose.ui.a0.a aVar7 = androidx.compose.ui.a0.E;
                    if ((29360128 & i14) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarB7 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar7, function2, (PointerInputEventHandler) objI1));
                    if ((i14 & 3670016) == 1048576) {
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0Var2 = c0VarR;
                    p1.y(fVar2, a0VarB7, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function3 = function4;
                    y3Var3 = y3VarA;
                    z12 = z13;
                    i26 = i29;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z12 = z10;
                    i26 = i11;
                    y3Var3 = y3Var2;
                    function3 = function1;
                }
                a0Var3 = a0Var2;
                i27 = iA;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    iA = i10;
                    if (c0VarR.K(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(function1)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i14 & 4793491) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i14 & 1)) {
                    if (i30 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                    } else {
                        y3VarA = y3Var2;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    }
                    if (i21 != 0) {
                        i29 = Integer.MAX_VALUE;
                        i28 = i23;
                    } else {
                        i28 = i23;
                        i29 = i11;
                    }
                    if (i28 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.e((androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        function4 = (Function1) objI3;
                    } else {
                        function4 = function1;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                    if ((29360128 & i14) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarB8 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar8, function2, (PointerInputEventHandler) objI1));
                    if ((i14 & 3670016) == 1048576) {
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0Var2 = c0VarR;
                    p1.y(fVar2, a0VarB8, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function3 = function4;
                    y3Var3 = y3VarA;
                    z12 = z13;
                    i26 = i29;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z12 = z10;
                    i26 = i11;
                    y3Var3 = y3Var2;
                    function3 = function1;
                }
                a0Var3 = a0Var2;
                i27 = iA;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(function1)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((i14 & 4793491) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i14 & 1)) {
                if (i30 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                } else {
                    y3VarA = y3Var2;
                }
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                }
                if (i21 != 0) {
                    i29 = Integer.MAX_VALUE;
                    i28 = i23;
                } else {
                    i28 = i23;
                    i29 = i11;
                }
                if (i28 != 0) {
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.e((androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    function4 = (Function1) objI3;
                } else {
                    function4 = function1;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                if ((29360128 & i14) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new a(n3Var, function2);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new a(n3Var, function2);
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarB9 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar9, function2, (PointerInputEventHandler) objI1));
                if ((i14 & 3670016) == 1048576) {
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0Var2 = c0VarR;
                p1.y(fVar2, a0VarB9, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function3 = function4;
                y3Var3 = y3VarA;
                z12 = z13;
                i26 = i29;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z12 = z10;
                i26 = i11;
                y3Var3 = y3Var2;
                function3 = function1;
            }
            a0Var3 = a0Var2;
            i27 = iA;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 48;
        a0Var2 = a0Var;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                y3Var2 = y3Var;
                if (c0VarR.D(y3Var2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    if (c0VarR.G(z10)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        iA = i10;
                        if (c0VarR.K(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(function1)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i14 & 1)) {
                        if (i30 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                        } else {
                            y3VarA = y3Var2;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.v.f42256b.a();
                        }
                        if (i21 != 0) {
                            i29 = Integer.MAX_VALUE;
                            i28 = i23;
                        } else {
                            i28 = i23;
                            i29 = i11;
                        }
                        if (i28 != 0) {
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return y1.e((androidx.compose.ui.text.p3) obj);
                                    }
                                };
                                c0VarR.Y(objI3);
                            }
                            function4 = (Function1) objI3;
                        } else {
                            function4 = function1;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                            c0VarR.Y(objI0);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI0;
                        androidx.compose.ui.a0.a aVar10 = androidx.compose.ui.a0.E;
                        if ((29360128 & i14) == 8388608) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new a(n3Var, function2);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new a(n3Var, function2);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarB10 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar10, function2, (PointerInputEventHandler) objI1));
                        if ((i14 & 3670016) == 1048576) {
                        }
                        objI2 = c0VarR.i0();
                        if (z15) {
                            objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0Var2 = c0VarR;
                        p1.y(fVar2, a0VarB10, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function3 = function4;
                        y3Var3 = y3VarA;
                        z12 = z13;
                        i26 = i29;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z12 = z10;
                        i26 = i11;
                        y3Var3 = y3Var2;
                        function3 = function1;
                    }
                    a0Var3 = a0Var2;
                    i27 = iA;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(function1)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i14 & 4793491) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i14 & 1)) {
                    if (i30 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                    } else {
                        y3VarA = y3Var2;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    }
                    if (i21 != 0) {
                        i29 = Integer.MAX_VALUE;
                        i28 = i23;
                    } else {
                        i28 = i23;
                        i29 = i11;
                    }
                    if (i28 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.e((androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        function4 = (Function1) objI3;
                    } else {
                        function4 = function1;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    androidx.compose.ui.a0.a aVar11 = androidx.compose.ui.a0.E;
                    if ((29360128 & i14) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarB11 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar11, function2, (PointerInputEventHandler) objI1));
                    if ((i14 & 3670016) == 1048576) {
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0Var2 = c0VarR;
                    p1.y(fVar2, a0VarB11, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function3 = function4;
                    y3Var3 = y3VarA;
                    z12 = z13;
                    i26 = i29;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z12 = z10;
                    i26 = i11;
                    y3Var3 = y3Var2;
                    function3 = function1;
                }
                a0Var3 = a0Var2;
                i27 = iA;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    iA = i10;
                    if (c0VarR.K(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(function1)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i14 & 4793491) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i14 & 1)) {
                    if (i30 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                    } else {
                        y3VarA = y3Var2;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    }
                    if (i21 != 0) {
                        i29 = Integer.MAX_VALUE;
                        i28 = i23;
                    } else {
                        i28 = i23;
                        i29 = i11;
                    }
                    if (i28 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.e((androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        function4 = (Function1) objI3;
                    } else {
                        function4 = function1;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                    if ((29360128 & i14) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarB12 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar12, function2, (PointerInputEventHandler) objI1));
                    if ((i14 & 3670016) == 1048576) {
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0Var2 = c0VarR;
                    p1.y(fVar2, a0VarB12, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function3 = function4;
                    y3Var3 = y3VarA;
                    z12 = z13;
                    i26 = i29;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z12 = z10;
                    i26 = i11;
                    y3Var3 = y3Var2;
                    function3 = function1;
                }
                a0Var3 = a0Var2;
                i27 = iA;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(function1)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((i14 & 4793491) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i14 & 1)) {
                if (i30 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                } else {
                    y3VarA = y3Var2;
                }
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                }
                if (i21 != 0) {
                    i29 = Integer.MAX_VALUE;
                    i28 = i23;
                } else {
                    i28 = i23;
                    i29 = i11;
                }
                if (i28 != 0) {
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.e((androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    function4 = (Function1) objI3;
                } else {
                    function4 = function1;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                androidx.compose.ui.a0.a aVar13 = androidx.compose.ui.a0.E;
                if ((29360128 & i14) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new a(n3Var, function2);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new a(n3Var, function2);
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarB13 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar13, function2, (PointerInputEventHandler) objI1));
                if ((i14 & 3670016) == 1048576) {
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0Var2 = c0VarR;
                p1.y(fVar2, a0VarB13, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function3 = function4;
                y3Var3 = y3VarA;
                z12 = z13;
                i26 = i29;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z12 = z10;
                i26 = i11;
                y3Var3 = y3Var2;
                function3 = function1;
            }
            a0Var3 = a0Var2;
            i27 = iA;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= androidx.media3.exoplayer.a5.S0;
        y3Var2 = y3Var;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                if (c0VarR.G(z10)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    iA = i10;
                    if (c0VarR.K(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(function1)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i14 & 4793491) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i14 & 1)) {
                    if (i30 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                    } else {
                        y3VarA = y3Var2;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.v.f42256b.a();
                    }
                    if (i21 != 0) {
                        i29 = Integer.MAX_VALUE;
                        i28 = i23;
                    } else {
                        i28 = i23;
                        i29 = i11;
                    }
                    if (i28 != 0) {
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return y1.e((androidx.compose.ui.text.p3) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        function4 = (Function1) objI3;
                    } else {
                        function4 = function1;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI0;
                    androidx.compose.ui.a0.a aVar14 = androidx.compose.ui.a0.E;
                    if ((29360128 & i14) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n3Var, function2);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarB14 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar14, function2, (PointerInputEventHandler) objI1));
                    if ((i14 & 3670016) == 1048576) {
                    }
                    objI2 = c0VarR.i0();
                    if (z15) {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0Var2 = c0VarR;
                    p1.y(fVar2, a0VarB14, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function3 = function4;
                    y3Var3 = y3VarA;
                    z12 = z13;
                    i26 = i29;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z12 = z10;
                    i26 = i11;
                    y3Var3 = y3Var2;
                    function3 = function1;
                }
                a0Var3 = a0Var2;
                i27 = iA;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(function1)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((i14 & 4793491) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i14 & 1)) {
                if (i30 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                } else {
                    y3VarA = y3Var2;
                }
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                }
                if (i21 != 0) {
                    i29 = Integer.MAX_VALUE;
                    i28 = i23;
                } else {
                    i28 = i23;
                    i29 = i11;
                }
                if (i28 != 0) {
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.e((androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    function4 = (Function1) objI3;
                } else {
                    function4 = function1;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                if ((29360128 & i14) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new a(n3Var, function2);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new a(n3Var, function2);
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarB15 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar15, function2, (PointerInputEventHandler) objI1));
                if ((i14 & 3670016) == 1048576) {
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0Var2 = c0VarR;
                p1.y(fVar2, a0VarB15, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function3 = function4;
                y3Var3 = y3VarA;
                z12 = z13;
                i26 = i29;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z12 = z10;
                i26 = i11;
                y3Var3 = y3Var2;
                function3 = function1;
            }
            a0Var3 = a0Var2;
            i27 = iA;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                iA = i10;
                if (c0VarR.K(iA)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i14 |= i20;
            }
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(function1)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((i14 & 4793491) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i14 & 1)) {
                if (i30 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    y3VarA = androidx.compose.ui.text.y3.f42348d.a();
                } else {
                    y3VarA = y3Var2;
                }
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.v.f42256b.a();
                }
                if (i21 != 0) {
                    i29 = Integer.MAX_VALUE;
                    i28 = i23;
                } else {
                    i28 = i23;
                    i29 = i11;
                }
                if (i28 != 0) {
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return y1.e((androidx.compose.ui.text.p3) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    function4 = (Function1) objI3;
                } else {
                    function4 = function1;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                androidx.compose.ui.a0.a aVar16 = androidx.compose.ui.a0.E;
                if ((29360128 & i14) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new a(n3Var, function2);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new a(n3Var, function2);
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarB16 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar16, function2, (PointerInputEventHandler) objI1));
                if ((i14 & 3670016) == 1048576) {
                }
                objI2 = c0VarR.i0();
                if (z15) {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0Var2 = c0VarR;
                p1.y(fVar2, a0VarB16, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function3 = function4;
                y3Var3 = y3VarA;
                z12 = z13;
                i26 = i29;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z12 = z10;
                i26 = i11;
                y3Var3 = y3Var2;
                function3 = function1;
            }
            a0Var3 = a0Var2;
            i27 = iA;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 24576;
        iA = i10;
        i21 = i13 & 32;
        if (i21 != 0) {
            i14 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.K(i11)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i14 |= i22;
        }
        i23 = i13 & 64;
        if (i23 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c0VarR.k0(function1)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i14 |= i24;
        }
        if ((i13 & 128) != 0) {
            i14 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (c0VarR.k0(function2)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i14 |= i25;
        }
        if ((i14 & 4793491) != 4793490) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i14 & 1)) {
            if (i30 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i15 != 0) {
                y3VarA = androidx.compose.ui.text.y3.f42348d.a();
            } else {
                y3VarA = y3Var2;
            }
            if (i17 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            if (i19 != 0) {
                iA = androidx.compose.ui.text.style.v.f42256b.a();
            }
            if (i21 != 0) {
                i29 = Integer.MAX_VALUE;
                i28 = i23;
            } else {
                i28 = i23;
                i29 = i11;
            }
            if (i28 != 0) {
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = new Function1() { // from class: androidx.compose.foundation.text.u1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return y1.e((androidx.compose.ui.text.p3) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                function4 = (Function1) objI3;
            } else {
                function4 = function1;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                c0VarR.Y(objI0);
            }
            n3Var = (androidx.compose.runtime.n3) objI0;
            androidx.compose.ui.a0.a aVar17 = androidx.compose.ui.a0.E;
            if ((29360128 & i14) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            objI1 = c0VarR.i0();
            if (z14) {
                objI1 = new a(n3Var, function2);
                c0VarR.Y(objI1);
            } else {
                objI1 = new a(n3Var, function2);
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarB17 = a0Var2.B2(androidx.compose.ui.input.pointer.w0.e(aVar17, function2, (PointerInputEventHandler) objI1));
            if ((i14 & 3670016) == 1048576) {
            }
            objI2 = c0VarR.i0();
            if (z15) {
                objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: androidx.compose.foundation.text.v1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y1.f(n3Var, function4, (androidx.compose.ui.text.p3) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0Var2 = c0VarR;
            p1.y(fVar2, a0VarB17, y3VarA, (Function1) objI2, iA, z13, i29, 0, null, null, null, c0Var2, (58254 & i14) | (458752 & (i14 << 6)) | ((i14 << 3) & 3670016), 0, 1920);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function3 = function4;
            y3Var3 = y3VarA;
            z12 = z13;
            i26 = i29;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            z12 = z10;
            i26 = i11;
            y3Var3 = y3Var2;
            function3 = function1;
        }
        a0Var3 = a0Var2;
        i27 = iA;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.w1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y1.g(fVar, a0Var3, y3Var3, z12, i27, i26, function3, function2, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.compose.ui.text.p3 p3Var) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.runtime.n3 n3Var, Function1 function1, androidx.compose.ui.text.p3 p3Var) {
        n3Var.setValue(p3Var);
        function1.invoke(p3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.text.f fVar, androidx.compose.ui.a0 a0Var, androidx.compose.ui.text.y3 y3Var, boolean z10, int i10, int i11, Function1 function1, Function1 function2, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        d(fVar, a0Var, y3Var, z10, i10, i11, function1, function2, c0Var, androidx.compose.runtime.t4.a(i12 | 1), i13);
        return Unit.f312394a;
    }
}
