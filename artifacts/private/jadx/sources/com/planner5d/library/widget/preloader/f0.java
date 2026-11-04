package com.planner5d.library.widget.preloader;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.os;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.u3;
import com.planner5d.library.widget.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@Nullable androidx.compose.ui.a0 a0Var, @Nullable Function0<Float> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        Function0<Float> function1;
        final androidx.compose.ui.a0 a0Var3;
        Function0<Float> function2;
        androidx.compose.ui.a0 a0VarI;
        long jA;
        long jA2;
        int iA;
        float fA;
        final Function0<Float> function3;
        s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(814100216);
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
                function1 = function0;
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
            if ((i12 & 19) == 18 || !c0VarR.d()) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (m0.l0()) {
                    m0.A0(814100216, i12, -1, "com.planner5d.library.widget.preloader.PreloaderLinear (PreloaderLinear.kt:18)");
                }
                a0VarI = i6.i(a0Var3, u0.f.b(c1.f.Nc, c0VarR, 0));
                jA = u0.a.a(c1.e.f250917zg, c0VarR, 0);
                jA2 = u0.a.a(c1.e.Ge, c0VarR, 0);
                iA = u3.f38256b.a();
                fA = androidx.compose.ui.unit.h.f42689b.a();
                if (function2 != null) {
                    c0VarR.E(146913207);
                    os.Z(function2, a0VarI, jA, jA2, iA, fA, null, c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 64);
                    function3 = function2;
                    c0VarR.A();
                } else {
                    function3 = function2;
                    c0VarR.E(147019041);
                    os.e0(a0VarI, jA, jA2, iA, fA, c0VarR, 24576, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                }
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                function3 = function1;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.widget.preloader.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f0.c(a0Var3, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function1 = function0;
        if ((i12 & 19) == 18) {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i14 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (m0.l0()) {
                m0.A0(814100216, i12, -1, "com.planner5d.library.widget.preloader.PreloaderLinear (PreloaderLinear.kt:18)");
            }
            a0VarI = i6.i(a0Var3, u0.f.b(c1.f.Nc, c0VarR, 0));
            jA = u0.a.a(c1.e.f250917zg, c0VarR, 0);
            jA2 = u0.a.a(c1.e.Ge, c0VarR, 0);
            iA = u3.f38256b.a();
            fA = androidx.compose.ui.unit.h.f42689b.a();
            if (function2 != null) {
                c0VarR.E(146913207);
                os.Z(function2, a0VarI, jA, jA2, iA, fA, null, c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 64);
                function3 = function2;
                c0VarR.A();
            } else {
                function3 = function2;
                c0VarR.E(147019041);
                os.e0(a0VarI, jA, jA2, iA, fA, c0VarR, 24576, 0);
                c0VarR = c0VarR;
                c0VarR.A();
            }
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i14 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (m0.l0()) {
                m0.A0(814100216, i12, -1, "com.planner5d.library.widget.preloader.PreloaderLinear (PreloaderLinear.kt:18)");
            }
            a0VarI = i6.i(a0Var3, u0.f.b(c1.f.Nc, c0VarR, 0));
            jA = u0.a.a(c1.e.f250917zg, c0VarR, 0);
            jA2 = u0.a.a(c1.e.Ge, c0VarR, 0);
            iA = u3.f38256b.a();
            fA = androidx.compose.ui.unit.h.f42689b.a();
            if (function2 != null) {
                c0VarR.E(146913207);
                os.Z(function2, a0VarI, jA, jA2, iA, fA, null, c0VarR, ((i12 >> 3) & 14) | androidx.profileinstaller.n.c.f73814m, 64);
                function3 = function2;
                c0VarR.A();
            } else {
                function3 = function2;
                c0VarR.E(147019041);
                os.e0(a0VarI, jA, jA2, iA, fA, c0VarR, 24576, 0);
                c0VarR = c0VarR;
                c0VarR.A();
            }
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.widget.preloader.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f0.c(a0Var3, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.a0 a0Var, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(a0Var, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
