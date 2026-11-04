package z0;

import android.graphics.Typeface;
import androidx.compose.ui.graphics.drawscope.i;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.platform.o;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.text.style.q;
import androidx.compose.ui.text.style.u;
import androidx.compose.ui.text.y0;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextPaintExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPaintExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/TextPaintExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class e {
    @Nullable
    public static final c3 a(@NotNull o oVar, @NotNull c3 c3Var, @NotNull pj.o<? super y, ? super v0, ? super q0, ? super r0, ? extends Typeface> oVar2, @NotNull androidx.compose.ui.unit.d dVar, boolean z10) {
        long jM = z.m(c3Var.q());
        b0.a aVar = b0.f42661b;
        if (b0.g(jM, aVar.b())) {
            oVar.setTextSize(dVar.p6(c3Var.q()));
        } else if (b0.g(jM, aVar.a())) {
            oVar.setTextSize(oVar.getTextSize() * z.n(c3Var.q()));
        }
        if (e(c3Var)) {
            y yVarO = c3Var.o();
            v0 v0VarT = c3Var.t();
            if (v0VarT == null) {
                v0VarT = v0.f41742b.m();
            }
            q0 q0VarR = c3Var.r();
            q0 q0VarC = q0.c(q0VarR != null ? q0VarR.j() : q0.f41690b.c());
            r0 r0VarS = c3Var.s();
            oVar.setTypeface(oVar2.invoke(yVarO, v0VarT, q0VarC, r0.e(r0VarS != null ? r0VarS.m() : r0.f41699b.a())));
        }
        if (c3Var.v() != null && !Intrinsics.areEqual(c3Var.v(), y0.f.f390674c.a())) {
            a.f399846a.b(oVar, c3Var.v());
        }
        if (c3Var.p() != null && !Intrinsics.areEqual(c3Var.p(), "")) {
            oVar.setFontFeatureSettings(c3Var.p());
        }
        if (c3Var.A() != null && !Intrinsics.areEqual(c3Var.A(), q.f42235c.a())) {
            oVar.setTextScaleX(oVar.getTextScaleX() * c3Var.A().d());
            oVar.setTextSkewX(oVar.getTextSkewX() + c3Var.A().e());
        }
        oVar.r(c3Var.m());
        oVar.n(c3Var.l(), n.f332724b.a(), c3Var.i());
        oVar.u(c3Var.x());
        oVar.w(c3Var.y());
        oVar.s(c3Var.n());
        if (b0.g(z.m(c3Var.u()), aVar.b()) && z.n(c3Var.u()) != 0.0f) {
            float textSize = oVar.getTextSize() * oVar.getTextScaleX();
            float fP6 = dVar.p6(c3Var.u());
            if (textSize != 0.0f) {
                oVar.setLetterSpacing(fP6 / textSize);
            }
        } else if (b0.g(z.m(c3Var.u()), aVar.a())) {
            oVar.setLetterSpacing(z.n(c3Var.u()));
        }
        return d(c3Var.u(), z10, c3Var.j(), c3Var.k());
    }

    public static /* synthetic */ c3 b(o oVar, c3 c3Var, pj.o oVar2, androidx.compose.ui.unit.d dVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return a(oVar, c3Var, oVar2, dVar, z10);
    }

    public static final float c(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    private static final c3 d(long j10, boolean z10, long j11, androidx.compose.ui.text.style.a aVar) {
        long jU = j11;
        boolean z11 = false;
        boolean z12 = z10 && b0.g(z.m(j10), b0.f42661b.b()) && z.n(j10) != 0.0f;
        androidx.compose.ui.graphics.q0.a aVar2 = androidx.compose.ui.graphics.q0.f38131b;
        boolean z13 = (androidx.compose.ui.graphics.q0.y(jU, aVar2.u()) || androidx.compose.ui.graphics.q0.y(jU, aVar2.s())) ? false : true;
        if (aVar != null) {
            if (!androidx.compose.ui.text.style.a.g(aVar.k(), androidx.compose.ui.text.style.a.f42141b.a())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jB = z12 ? j10 : z.f42728b.b();
        if (!z13) {
            jU = aVar2.u();
        }
        return new c3(0L, 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, jB, z11 ? aVar : null, (q) null, (y0.f) null, jU, (k) null, (o3) null, (y0) null, (i) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean e(@NotNull c3 c3Var) {
        return (c3Var.o() == null && c3Var.r() == null && c3Var.t() == null) ? false : true;
    }

    public static final void f(@NotNull o oVar, @Nullable u uVar) {
        if (uVar == null) {
            uVar = u.f42245c.b();
        }
        oVar.setFlags(uVar.f() ? oVar.getFlags() | 128 : oVar.getFlags() & (-129));
        int iE = uVar.e();
        u.b.a aVar = u.b.f42251b;
        if (u.b.g(iE, aVar.b())) {
            oVar.setFlags(oVar.getFlags() | 64);
            oVar.setHinting(0);
        } else if (u.b.g(iE, aVar.a())) {
            oVar.getFlags();
            oVar.setHinting(1);
        } else if (!u.b.g(iE, aVar.c())) {
            oVar.getFlags();
        } else {
            oVar.getFlags();
            oVar.setHinting(0);
        }
    }
}
