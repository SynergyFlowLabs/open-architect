package androidx.compose.ui.draw;

import androidx.compose.runtime.k7;
import androidx.compose.ui.graphics.d3;
import androidx.compose.ui.graphics.f3;
import androidx.compose.ui.graphics.q1;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.r1;
import androidx.compose.ui.graphics.x3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,148:1\n113#2:149\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n107#1:149\n*E\n"})
public final class d {

    static final class a extends l0 implements Function1<r1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f37274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f37275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q3 f37277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37278e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, int i10, q3 q3Var, boolean z10) {
            super(1);
            this.f37274a = f10;
            this.f37275b = f11;
            this.f37276c = i10;
            this.f37277d = q3Var;
            this.f37278e = z10;
        }

        public final void c(r1 r1Var) {
            float fS7 = r1Var.S7(this.f37274a);
            float fS8 = r1Var.S7(this.f37275b);
            r1Var.A((fS7 <= 0.0f || fS8 <= 0.0f) ? null : f3.a(fS7, fS8, this.f37276c));
            q3 q3VarA = this.f37277d;
            if (q3VarA == null) {
                q3VarA = d3.a();
            }
            r1Var.Q3(q3VarA);
            r1Var.O(this.f37278e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1 r1Var) {
            c(r1Var);
            return Unit.f312394a;
        }
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11, @NotNull q3 q3Var) {
        int iB;
        boolean z10;
        if (q3Var != null) {
            iB = x3.f38688b.a();
            z10 = true;
        } else {
            iB = x3.f38688b.b();
            z10 = false;
        }
        float f12 = 0;
        return ((androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r(f12)) <= 0 || androidx.compose.ui.unit.h.q(f11, androidx.compose.ui.unit.h.r(f12)) <= 0) && !z10) ? a0Var : q1.a(a0Var, new a(f10, f11, iB, q3Var, z10));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, float f10, float f11, e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            eVar = e.c(e.f37279b.a());
        }
        return a(a0Var, f10, f11, eVar.j());
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, float f10, @NotNull q3 q3Var) {
        return a(a0Var, f10, f10, q3Var);
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, float f10, e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = e.c(e.f37279b.a());
        }
        return c(a0Var, f10, eVar.j());
    }
}
