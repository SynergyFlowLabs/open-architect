package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.x0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.unit.u;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nio/sentry/android/replay/util/NodesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n163#1,5:219\n159#1,9:224\n159#1,9:233\n159#1,9:242\n159#1,9:251\n143#1:260\n151#1:261\n143#1:262\n151#1:263\n1#2:218\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nio/sentry/android/replay/util/NodesKt\n*L\n159#1:219,5\n185#1:224,9\n186#1:233,9\n187#1:242,9\n188#1:251,9\n204#1:260\n205#1:261\n212#1:262\n213#1:263\n*E\n"})
public final class k {
    @NotNull
    public static final Rect a(@NotNull g0 g0Var, @Nullable g0 g0Var2) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        if (g0Var2 == null) {
            g0Var2 = h0.d(g0Var);
        }
        float fM = u.m(g0Var2.a());
        float fJ = u.j(g0Var2.a());
        n0.j jVarW = g0.W(g0Var2, g0Var, false, 2, null);
        float fT = jVarW.t();
        if (fT < 0.0f) {
            fT = 0.0f;
        }
        if (fT > fM) {
            fT = fM;
        }
        float fB = jVarW.B();
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > fJ) {
            fB = fJ;
        }
        float fX = jVarW.x();
        if (fX < 0.0f) {
            fX = 0.0f;
        }
        if (fX <= fM) {
            fM = fX;
        }
        float fJ2 = jVarW.j();
        float f10 = fJ2 >= 0.0f ? fJ2 : 0.0f;
        if (f10 <= fJ) {
            fJ = f10;
        }
        if (fT != fM && fB != fJ) {
            long jC0 = g0Var2.c0(n0.h.a(fT, fB));
            long jC1 = g0Var2.c0(n0.h.a(fM, fB));
            long jC2 = g0Var2.c0(n0.h.a(fM, fJ));
            long jC3 = g0Var2.c0(n0.h.a(fT, fJ));
            float fQ = n0.g.q(jC0);
            float fQ2 = n0.g.q(jC1);
            float fQ3 = n0.g.q(jC3);
            float fQ4 = n0.g.q(jC2);
            float fMin = Math.min(fQ, Math.min(fQ2, Math.min(fQ3, fQ4)));
            float fMax = Math.max(fQ, Math.max(fQ2, Math.max(fQ3, fQ4)));
            float fS = n0.g.s(jC0);
            float fS2 = n0.g.s(jC1);
            float fS3 = n0.g.s(jC3);
            float fS4 = n0.g.s(jC2);
            return new Rect((int) fMin, (int) Math.min(fS, Math.min(fS2, Math.min(fS3, fS4))), (int) fMax, (int) Math.max(fS, Math.max(fS2, Math.max(fS3, fS4))));
        }
        return new Rect();
    }

    private static final float b(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    private static final float c(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    private static final float d(float f10, float f11, float f12) {
        if (f10 < f11) {
            f10 = f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    private static final float e(float f10, float f11, float f12, float f13) {
        return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
    }

    private static final float f(float f10, float f11, float f12, float f13) {
        return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
    }

    @Nullable
    public static final androidx.compose.ui.graphics.painter.b g(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        List<g1> listL = l0Var.L();
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0VarC = listL.get(i10).c();
            String name = a0VarC.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.V2(name, "Painter", false, 2, null)) {
                try {
                    Field declaredField = a0VarC.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(a0VarC);
                    if (obj instanceof androidx.compose.ui.graphics.painter.b) {
                        return (androidx.compose.ui.graphics.painter.b) obj;
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        }
        return null;
    }

    @NotNull
    public static final p h(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        List<g1> listL = l0Var.L();
        int size = listL.size();
        q0 q0VarN = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0VarC = listL.get(i10).c();
            String name = a0VarC.getClass().getName();
            Intrinsics.checkNotNull(name);
            if (StringsKt.V2(name, "Text", false, 2, null)) {
                try {
                    Field declaredField = a0VarC.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(a0VarC);
                    x0 x0Var = obj instanceof x0 ? (x0) obj : null;
                    q0VarN = x0Var != null ? q0.n(x0Var.a()) : null;
                } catch (Throwable unused) {
                }
            } else if (StringsKt.V2(name, "Fill", false, 2, null)) {
                z10 = true;
            }
        }
        return new p(q0VarN, z10, null);
    }

    public static final boolean i(@NotNull androidx.compose.ui.graphics.painter.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String name = bVar.getClass().getName();
        Intrinsics.checkNotNull(name);
        int i10 = 6 | 2;
        return (StringsKt.V2(name, "Vector", false, 2, null) || StringsKt.V2(name, "Color", false, 2, null) || StringsKt.V2(name, "Brush", false, 2, null)) ? false : true;
    }
}
