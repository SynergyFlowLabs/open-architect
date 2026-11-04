package androidx.compose.foundation;

import androidx.compose.runtime.s5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    /* JADX WARN: Code duplicated, block: B:101:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility.")
    @androidx.compose.runtime.o
    @b2
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @oj.i(name = "BasicTooltipBox")
    public static final /* synthetic */ void b(final androidx.compose.ui.window.s sVar, final Function2 function2, final l0 l0Var, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, final Function2 function3, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.window.s sVar2;
        int i12;
        Function2 function4;
        l0 l0Var2;
        final androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        Function2 function5;
        int i17;
        boolean z13;
        androidx.compose.runtime.c0 c0Var2;
        final boolean z14;
        final boolean z15;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        boolean z16;
        boolean z17;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1368136524);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            sVar2 = sVar;
        } else {
            sVar2 = sVar;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.D(sVar2) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function4) ? 32 : 16;
            }
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
            l0Var2 = l0Var;
        } else {
            l0Var2 = l0Var;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.D(l0Var2) ? 256 : 128;
            }
        }
        int i18 = i11 & 8;
        if (i18 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z10;
                    if (c0VarR.G(z12)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.G(z11)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                        function5 = function3;
                    } else {
                        function5 = function3;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function5)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i12 |= i17;
                        }
                    }
                    if ((599187 & i12) != 599186) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i12 & 1)) {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z16 = true;
                        } else {
                            z16 = z12;
                        }
                        if (i15 != 0) {
                            z17 = true;
                        } else {
                            z17 = z11;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1368136524, i12, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                        }
                        c0Var2 = c0VarR;
                        j0.h(sVar2, function4, l0Var2, a0Var3, z16, z17, function5, c0Var2, i12 & 4194302, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        z14 = z16;
                        z15 = z17;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z14 = z12;
                        z15 = z11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.o0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return p0.c(sVar, function2, l0Var, a0Var2, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    function5 = function3;
                } else {
                    function5 = function3;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function5)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                }
                if ((599187 & i12) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i15 != 0) {
                        z17 = true;
                    } else {
                        z17 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1368136524, i12, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                    }
                    c0Var2 = c0VarR;
                    j0.h(sVar2, function4, l0Var2, a0Var3, z16, z17, function5, c0Var2, i12 & 4194302, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    z14 = z16;
                    z15 = z17;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z14 = z12;
                    z15 = z11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.o0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return p0.c(sVar, function2, l0Var, a0Var2, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z12 = z10;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.G(z11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    function5 = function3;
                } else {
                    function5 = function3;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function5)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                }
                if ((599187 & i12) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i15 != 0) {
                        z17 = true;
                    } else {
                        z17 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1368136524, i12, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                    }
                    c0Var2 = c0VarR;
                    j0.h(sVar2, function4, l0Var2, a0Var3, z16, z17, function5, c0Var2, i12 & 4194302, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    z14 = z16;
                    z15 = z17;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z14 = z12;
                    z15 = z11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.o0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return p0.c(sVar, function2, l0Var, a0Var2, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                function5 = function3;
            } else {
                function5 = function3;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function5)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
            }
            if ((599187 & i12) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i15 != 0) {
                    z17 = true;
                } else {
                    z17 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1368136524, i12, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                }
                c0Var2 = c0VarR;
                j0.h(sVar2, function4, l0Var2, a0Var3, z16, z17, function5, c0Var2, i12 & 4194302, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                z14 = z16;
                z15 = z17;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z14 = z12;
                z15 = z11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.o0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return p0.c(sVar, function2, l0Var, a0Var2, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                z12 = z10;
                if (c0VarR.G(z12)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.G(z11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    function5 = function3;
                } else {
                    function5 = function3;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function5)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                }
                if ((599187 & i12) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z16 = true;
                    } else {
                        z16 = z12;
                    }
                    if (i15 != 0) {
                        z17 = true;
                    } else {
                        z17 = z11;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1368136524, i12, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                    }
                    c0Var2 = c0VarR;
                    j0.h(sVar2, function4, l0Var2, a0Var3, z16, z17, function5, c0Var2, i12 & 4194302, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    z14 = z16;
                    z15 = z17;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z14 = z12;
                    z15 = z11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.o0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return p0.c(sVar, function2, l0Var, a0Var2, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                function5 = function3;
            } else {
                function5 = function3;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function5)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
            }
            if ((599187 & i12) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i15 != 0) {
                    z17 = true;
                } else {
                    z17 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1368136524, i12, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                }
                c0Var2 = c0VarR;
                j0.h(sVar2, function4, l0Var2, a0Var3, z16, z17, function5, c0Var2, i12 & 4194302, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                z14 = z16;
                z15 = z17;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z14 = z12;
                z15 = z11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.o0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return p0.c(sVar, function2, l0Var, a0Var2, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z12 = z10;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                if (c0VarR.G(z11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                function5 = function3;
            } else {
                function5 = function3;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function5)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
            }
            if ((599187 & i12) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                if (i15 != 0) {
                    z17 = true;
                } else {
                    z17 = z11;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1368136524, i12, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                }
                c0Var2 = c0VarR;
                j0.h(sVar2, function4, l0Var2, a0Var3, z16, z17, function5, c0Var2, i12 & 4194302, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                z14 = z16;
                z15 = z17;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z14 = z12;
                z15 = z11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.o0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return p0.c(sVar, function2, l0Var, a0Var2, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
            function5 = function3;
        } else {
            function5 = function3;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function5)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
        }
        if ((599187 & i12) != 599186) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i12 & 1)) {
            if (i18 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                z16 = true;
            } else {
                z16 = z12;
            }
            if (i15 != 0) {
                z17 = true;
            } else {
                z17 = z11;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1368136524, i12, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
            }
            c0Var2 = c0VarR;
            j0.h(sVar2, function4, l0Var2, a0Var3, z16, z17, function5, c0Var2, i12 & 4194302, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            z14 = z16;
            z15 = z17;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            z14 = z12;
            z15 = z11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p0.c(sVar, function2, l0Var, a0Var2, z14, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.window.s sVar, Function2 function2, l0 l0Var, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(sVar, function2, l0Var, a0Var, z10, z11, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
