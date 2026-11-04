package com.planner5d.library.spaces.view.dashboard;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.s2;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSpacesDashboardProfile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesDashboardProfile.kt\ncom/planner5d/library/spaces/view/dashboard/SpacesDashboardProfileKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,41:1\n113#2:42\n*S KotlinDebug\n*F\n+ 1 SpacesDashboardProfile.kt\ncom/planner5d/library/spaces/view/dashboard/SpacesDashboardProfileKt\n*L\n22#1:42\n*E\n"})
public final class x {
    /* JADX WARN: Code duplicated, block: B:30:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@Nullable Bitmap bitmap, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Bitmap bitmap2;
        int i12;
        float f11;
        final Bitmap bitmap3;
        final float fR;
        String strD;
        androidx.compose.ui.layout.l lVarA;
        androidx.compose.ui.a0 a0VarA;
        s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1028731540);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            bitmap2 = bitmap;
        } else if ((i10 & 6) == 0) {
            bitmap2 = bitmap;
            i12 = (c0VarR.k0(bitmap2) ? 4 : 2) | i10;
        } else {
            bitmap2 = bitmap;
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 32 : 16;
            }
            if ((i12 & 19) == 18 || !c0VarR.d()) {
                if (i13 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i14 != 0) {
                    fR = androidx.compose.ui.unit.h.r(44);
                } else {
                    fR = f11;
                }
                if (m0.l0()) {
                    m0.A0(-1028731540, i12, -1, "com.planner5d.library.spaces.view.dashboard.ProfileIcon (SpacesDashboardProfile.kt:21)");
                }
                strD = u0.i.d(de.b.r.Xk, c0VarR, 0);
                lVarA = androidx.compose.ui.layout.l.f39405a.a();
                a0VarA = androidx.compose.ui.draw.j.a(i6.i(i6.B(androidx.compose.ui.a0.E, fR), fR), androidx.compose.foundation.shape.o.k());
                if (bitmap3 != null) {
                    c0VarR.E(-1130098729);
                    s2.h(androidx.compose.ui.graphics.j.c(bitmap3), strD, a0VarA, null, lVarA, 0.0f, null, 0, c0VarR, 24576, 232);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1129941001);
                    s2.d(u0.e.c(de.b.g.f271958rc, c0VarR, 0), strD, a0VarA, null, lVarA, 0.0f, null, c0VarR, 24576, 104);
                    c0VarR = c0VarR;
                    c0VarR.A();
                }
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                bitmap3 = bitmap2;
                fR = f11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.w
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return x.c(bitmap3, fR, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        f11 = f10;
        if ((i12 & 19) == 18) {
            if (i13 != 0) {
                bitmap3 = null;
            } else {
                bitmap3 = bitmap2;
            }
            if (i14 != 0) {
                fR = androidx.compose.ui.unit.h.r(44);
            } else {
                fR = f11;
            }
            if (m0.l0()) {
                m0.A0(-1028731540, i12, -1, "com.planner5d.library.spaces.view.dashboard.ProfileIcon (SpacesDashboardProfile.kt:21)");
            }
            strD = u0.i.d(de.b.r.Xk, c0VarR, 0);
            lVarA = androidx.compose.ui.layout.l.f39405a.a();
            a0VarA = androidx.compose.ui.draw.j.a(i6.i(i6.B(androidx.compose.ui.a0.E, fR), fR), androidx.compose.foundation.shape.o.k());
            if (bitmap3 != null) {
                c0VarR.E(-1130098729);
                s2.h(androidx.compose.ui.graphics.j.c(bitmap3), strD, a0VarA, null, lVarA, 0.0f, null, 0, c0VarR, 24576, 232);
                c0VarR.A();
            } else {
                c0VarR.E(-1129941001);
                s2.d(u0.e.c(de.b.g.f271958rc, c0VarR, 0), strD, a0VarA, null, lVarA, 0.0f, null, c0VarR, 24576, 104);
                c0VarR = c0VarR;
                c0VarR.A();
            }
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            if (i13 != 0) {
                bitmap3 = null;
            } else {
                bitmap3 = bitmap2;
            }
            if (i14 != 0) {
                fR = androidx.compose.ui.unit.h.r(44);
            } else {
                fR = f11;
            }
            if (m0.l0()) {
                m0.A0(-1028731540, i12, -1, "com.planner5d.library.spaces.view.dashboard.ProfileIcon (SpacesDashboardProfile.kt:21)");
            }
            strD = u0.i.d(de.b.r.Xk, c0VarR, 0);
            lVarA = androidx.compose.ui.layout.l.f39405a.a();
            a0VarA = androidx.compose.ui.draw.j.a(i6.i(i6.B(androidx.compose.ui.a0.E, fR), fR), androidx.compose.foundation.shape.o.k());
            if (bitmap3 != null) {
                c0VarR.E(-1130098729);
                s2.h(androidx.compose.ui.graphics.j.c(bitmap3), strD, a0VarA, null, lVarA, 0.0f, null, 0, c0VarR, 24576, 232);
                c0VarR.A();
            } else {
                c0VarR.E(-1129941001);
                s2.d(u0.e.c(de.b.g.f271958rc, c0VarR, 0), strD, a0VarA, null, lVarA, 0.0f, null, c0VarR, 24576, 104);
                c0VarR = c0VarR;
                c0VarR.A();
            }
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x.c(bitmap3, fR, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Bitmap bitmap, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(bitmap, f10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
