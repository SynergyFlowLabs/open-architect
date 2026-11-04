package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.material3.q50;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nWrapReportingText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrapReportingText.kt\nio/intercom/android/sdk/m5/home/ui/components/WrapReportingTextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,47:1\n1282#2,6:48\n1282#2,6:54\n1282#2,6:60\n*S KotlinDebug\n*F\n+ 1 WrapReportingText.kt\nio/intercom/android/sdk/m5/home/ui/components/WrapReportingTextKt\n*L\n23#1:48,6\n28#1:54,6\n29#1:60,6\n*E\n"})
public final class WrapReportingTextKt {
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PreviewShortText(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(381018303);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 7 >> 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$WrapReportingTextKt.INSTANCE.m376getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WrapReportingTextKt.PreviewShortText$lambda$7(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewShortText$lambda$7(int i10, c0 c0Var, int i11) {
        PreviewShortText(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x011f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x012c  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: WrapReportingText-T042LqI, reason: not valid java name */
    public static final void m377WrapReportingTextT042LqI(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String text, final long j10, @NotNull final y3 style, @Nullable Function1<? super Boolean, Unit> function1, @Nullable c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        int i13;
        int i14;
        Function1<? super Boolean, Unit> function2;
        int i15;
        androidx.compose.ui.a0 a0Var3;
        final Function1<? super Boolean, Unit> function3;
        Object objI0;
        c0.a aVar;
        final n3 n3Var;
        Object objI1;
        boolean z10;
        Object objI2;
        c0 c0Var2;
        final androidx.compose.ui.a0 a0Var4;
        final Function1<? super Boolean, Unit> function4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        c0 c0VarR = c0Var.R(834036955);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(text) ? 32 : 16;
        }
        if ((i11 & 4) == 0) {
            if ((i10 & 896) == 0) {
                i12 |= c0VarR.L(j10) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c0VarR.D(style)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i11 & 16;
            if (i14 != 0) {
                if ((i10 & 57344) == 0) {
                    function2 = function1;
                    if (c0VarR.k0(function2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((46811 & i12) == 9362 || !c0VarR.d()) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i14 != 0) {
                        function3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.y
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
                            }
                        };
                    } else {
                        function3 = function2;
                    }
                    c0VarR.E(1070301976);
                    objI0 = c0VarR.i0();
                    aVar = c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI0);
                    }
                    n3Var = (n3) objI0;
                    c0VarR.A();
                    c0VarR.E(1070306974);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.z
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2(n3Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarD = androidx.compose.ui.draw.n.d(a0Var3, (Function1) objI1);
                    c0VarR.E(1070309155);
                    if ((57344 & i12) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z10 || objI2 == aVar.a()) {
                        objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    c0Var2 = c0VarR;
                    q50.t(text, a0VarD, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objI2, style, c0Var2, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 12) & 29360128, 65528);
                    a0Var4 = a0Var3;
                    function4 = function3;
                } else {
                    c0VarR.u();
                    c0Var2 = c0VarR;
                    a0Var4 = a0Var2;
                    function4 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6(a0Var4, text, j10, style, function4, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function2 = function1;
            if ((46811 & i12) == 9362) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
                        }
                    };
                } else {
                    function3 = function2;
                }
                c0VarR.E(1070301976);
                objI0 = c0VarR.i0();
                aVar = c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (n3) objI0;
                c0VarR.A();
                c0VarR.E(1070306974);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2(n3Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarD2 = androidx.compose.ui.draw.n.d(a0Var3, (Function1) objI1);
                c0VarR.E(1070309155);
                if ((57344 & i12) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI2 = c0VarR.i0();
                if (z10) {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                c0Var2 = c0VarR;
                q50.t(text, a0VarD2, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objI2, style, c0Var2, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 12) & 29360128, 65528);
                a0Var4 = a0Var3;
                function4 = function3;
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
                        }
                    };
                } else {
                    function3 = function2;
                }
                c0VarR.E(1070301976);
                objI0 = c0VarR.i0();
                aVar = c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (n3) objI0;
                c0VarR.A();
                c0VarR.E(1070306974);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2(n3Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarD3 = androidx.compose.ui.draw.n.d(a0Var3, (Function1) objI1);
                c0VarR.E(1070309155);
                if ((57344 & i12) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI2 = c0VarR.i0();
                if (z10) {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                c0Var2 = c0VarR;
                q50.t(text, a0VarD3, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objI2, style, c0Var2, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 12) & 29360128, 65528);
                a0Var4 = a0Var3;
                function4 = function3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6(a0Var4, text, j10, style, function4, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c0VarR.D(style)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i11 & 16;
        if (i14 != 0) {
            if ((i10 & 57344) == 0) {
                function2 = function1;
                if (c0VarR.k0(function2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((46811 & i12) == 9362) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
                        }
                    };
                } else {
                    function3 = function2;
                }
                c0VarR.E(1070301976);
                objI0 = c0VarR.i0();
                aVar = c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (n3) objI0;
                c0VarR.A();
                c0VarR.E(1070306974);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2(n3Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarD4 = androidx.compose.ui.draw.n.d(a0Var3, (Function1) objI1);
                c0VarR.E(1070309155);
                if ((57344 & i12) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI2 = c0VarR.i0();
                if (z10) {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                c0Var2 = c0VarR;
                q50.t(text, a0VarD4, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objI2, style, c0Var2, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 12) & 29360128, 65528);
                a0Var4 = a0Var3;
                function4 = function3;
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    function3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
                        }
                    };
                } else {
                    function3 = function2;
                }
                c0VarR.E(1070301976);
                objI0 = c0VarR.i0();
                aVar = c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (n3) objI0;
                c0VarR.A();
                c0VarR.E(1070306974);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2(n3Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                androidx.compose.ui.a0 a0VarD5 = androidx.compose.ui.draw.n.d(a0Var3, (Function1) objI1);
                c0VarR.E(1070309155);
                if ((57344 & i12) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI2 = c0VarR.i0();
                if (z10) {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                c0Var2 = c0VarR;
                q50.t(text, a0VarD5, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objI2, style, c0Var2, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 12) & 29360128, 65528);
                a0Var4 = a0Var3;
                function4 = function3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6(a0Var4, text, j10, style, function4, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function2 = function1;
        if ((46811 & i12) == 9362) {
            if (i16 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i14 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
                    }
                };
            } else {
                function3 = function2;
            }
            c0VarR.E(1070301976);
            objI0 = c0VarR.i0();
            aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            n3Var = (n3) objI0;
            c0VarR.A();
            c0VarR.E(1070306974);
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2(n3Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarD6 = androidx.compose.ui.draw.n.d(a0Var3, (Function1) objI1);
            c0VarR.E(1070309155);
            if ((57344 & i12) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI2 = c0VarR.i0();
            if (z10) {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            c0Var2 = c0VarR;
            q50.t(text, a0VarD6, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objI2, style, c0Var2, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 12) & 29360128, 65528);
            a0Var4 = a0Var3;
            function4 = function3;
        } else {
            if (i16 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i14 != 0) {
                function3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
                    }
                };
            } else {
                function3 = function2;
            }
            c0VarR.E(1070301976);
            objI0 = c0VarR.i0();
            aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            n3Var = (n3) objI0;
            c0VarR.A();
            c0VarR.E(1070306974);
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2(n3Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarD7 = androidx.compose.ui.draw.n.d(a0Var3, (Function1) objI1);
            c0VarR.E(1070309155);
            if ((57344 & i12) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI2 = c0VarR.i0();
            if (z10) {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(function3, n3Var, (p3) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            c0Var2 = c0VarR;
            q50.t(text, a0VarD7, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objI2, style, c0Var2, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 12) & 29360128, 65528);
            a0Var4 = a0Var3;
            function4 = function3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6(a0Var4, text, j10, style, function4, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapReportingText_T042LqI$lambda$0(boolean z10) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapReportingText_T042LqI$lambda$3$lambda$2(n3 readyToDraw, androidx.compose.ui.graphics.drawscope.c drawWithContent) {
        Intrinsics.checkNotNullParameter(readyToDraw, "$readyToDraw");
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (((Boolean) readyToDraw.getValue()).booleanValue()) {
            drawWithContent.E4();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapReportingText_T042LqI$lambda$5$lambda$4(Function1 function1, n3 readyToDraw, p3 textLayoutResult) {
        Intrinsics.checkNotNullParameter(readyToDraw, "$readyToDraw");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        function1.invoke(Boolean.valueOf(textLayoutResult.o() > 1));
        readyToDraw.setValue(Boolean.TRUE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapReportingText_T042LqI$lambda$6(androidx.compose.ui.a0 a0Var, String text, long j10, y3 style, Function1 function1, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(style, "$style");
        m377WrapReportingTextT042LqI(a0Var, text, j10, style, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
