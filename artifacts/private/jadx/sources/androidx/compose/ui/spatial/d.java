package androidx.compose.ui.spatial;

import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRectListDebugger.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebugger_androidKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,92:1\n122#2,6:93\n129#2,4:108\n133#2:118\n135#2:121\n316#3,9:99\n325#3,2:119\n4360#4,6:112\n*S KotlinDebug\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebugger_androidKt\n*L\n40#1:93,6\n40#1:108,4\n40#1:118\n40#1:121\n40#1:99,9\n40#1:119,2\n40#1:112,6\n*E\n"})
public final class d {

    static final class a extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f41240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f41241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f41242c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a0 a0Var, int i10, int i11) {
            super(2);
            this.f41240a = a0Var;
            this.f41241b = i10;
            this.f41242c = i11;
        }

        public final void c(c0 c0Var, int i10) {
            d.a(this.f41240a, c0Var, t4.a(this.f41241b | 1), this.f41242c);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@Nullable a0 a0Var, @Nullable c0 c0Var, int i10, int i11) {
        int i12;
        c0 c0VarR = c0Var.R(949081399);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if (c0VarR.h((i12 & 3) != 2, i12 & 1)) {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            if (m0.l0()) {
                m0.A0(949081399, i12, -1, "androidx.compose.ui.spatial.RectListDebugger (RectListDebugger.android.kt:38)");
            }
            a0 a0VarB2 = a0Var.B2(RectListDebuggerModifierElement.f41230c);
            androidx.compose.ui.spatial.a aVar = androidx.compose.ui.spatial.a.f41231a;
            int iHashCode = Long.hashCode(v.l(c0VarR, 0));
            a0 a0VarN = m.n(c0VarR, a0VarB2);
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0VarR.S() == null) {
                v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, aVar, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            y7.n(c0VarD, a0VarN, aVar2.f());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new a(a0Var, i10, i11));
        }
    }
}
