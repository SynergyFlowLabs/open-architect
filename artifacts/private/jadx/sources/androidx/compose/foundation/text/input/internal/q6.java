package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.d7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,258:1\n113#2:259\n85#3:260\n85#3:261\n117#3,2:262\n85#3:264\n117#3,2:265\n85#3:267\n117#3,2:268\n85#3:270\n117#3,2:271\n69#4:273\n65#4:276\n65#4:279\n70#5:274\n60#5:277\n60#5:280\n22#6:275\n22#6:278\n22#6:281\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n*L\n79#1:259\n45#1:260\n74#1:261\n74#1:262,2\n75#1:264\n75#1:265,2\n76#1:267\n76#1:268,2\n79#1:270\n79#1:271,2\n182#1:273\n183#1:276\n184#1:279\n182#1:274\n183#1:277\n184#1:280\n182#1:275\n183#1:278\n184#1:281\n*E\n"})
public final class q6 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f19760i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private j6 f19761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function2<? super androidx.compose.ui.unit.d, ? super Function0<androidx.compose.ui.text.p3>, Unit> f19762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j6 f19763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.relocation.a f19768h;

    public q6() {
        j6 j6Var = new j6();
        this.f19761a = j6Var;
        this.f19763c = j6Var;
        this.f19764d = androidx.compose.runtime.w6.k(null, androidx.compose.runtime.w6.o());
        this.f19765e = androidx.compose.runtime.w6.k(null, androidx.compose.runtime.w6.o());
        this.f19766f = androidx.compose.runtime.w6.k(null, androidx.compose.runtime.w6.o());
        this.f19767g = d7.g(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(0)), null, 2, null);
        this.f19768h = androidx.compose.foundation.relocation.d.a();
    }

    public static /* synthetic */ int i(q6 q6Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return q6Var.h(j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.p3 n(q6 q6Var) {
        return q6Var.f19761a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public final long b(long j10) {
        n0.j jVarA;
        androidx.compose.ui.layout.g0 g0VarK = k();
        if (g0VarK == null) {
            jVarA = n0.j.f332705e.a();
        } else {
            if (g0VarK.I()) {
                androidx.compose.ui.layout.g0 g0VarE = e();
                jVarA = null;
                if (g0VarE != null) {
                    jVarA = androidx.compose.ui.layout.g0.W(g0VarE, g0VarK, false, 2, null);
                }
            } else {
                jVarA = n0.j.f332705e.a();
            }
            if (jVarA == null) {
                jVarA = n0.j.f332705e.a();
            }
        }
        return r6.a(j10, jVarA);
    }

    @NotNull
    public final androidx.compose.foundation.relocation.a c() {
        return this.f19768h;
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 d() {
        return (androidx.compose.ui.layout.g0) this.f19765e.getValue();
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 e() {
        return (androidx.compose.ui.layout.g0) this.f19766f.getValue();
    }

    @Nullable
    public final androidx.compose.ui.text.p3 f() {
        return this.f19763c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float g() {
        return ((androidx.compose.ui.unit.h) this.f19767g.getValue()).O();
    }

    public final int h(long j10, boolean z10) {
        androidx.compose.ui.text.p3 p3VarF = f();
        if (p3VarF == null) {
            return -1;
        }
        if (z10) {
            j10 = b(j10);
        }
        return p3VarF.y(r6.b(this, j10));
    }

    @Nullable
    public final Function2<androidx.compose.ui.unit.d, Function0<androidx.compose.ui.text.p3>, Unit> j() {
        return this.f19762b;
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 k() {
        return (androidx.compose.ui.layout.g0) this.f19764d.getValue();
    }

    public final boolean l(long j10) {
        androidx.compose.ui.text.p3 p3VarF = f();
        if (p3VarF == null) {
            return false;
        }
        long jB = r6.b(this, b(j10));
        int iS = p3VarF.s(Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & jB)));
        int i10 = (int) (jB >> 32);
        return Float.intBitsToFloat(i10) >= p3VarF.t(iS) && Float.intBitsToFloat(i10) <= p3VarF.u(iS);
    }

    @NotNull
    public final androidx.compose.ui.text.p3 m(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.text.font.y.b bVar, long j10) {
        androidx.compose.ui.text.p3 p3VarE = this.f19761a.E(dVar, wVar, bVar, j10);
        Function2<? super androidx.compose.ui.unit.d, ? super Function0<androidx.compose.ui.text.p3>, Unit> function2 = this.f19762b;
        if (function2 != null) {
            function2.invoke(dVar, new Function0() { // from class: androidx.compose.foundation.text.input.internal.p6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q6.n(this.f19745a);
                }
            });
        }
        return p3VarE;
    }

    public final void o(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f19765e.setValue(g0Var);
    }

    public final void p(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f19766f.setValue(g0Var);
    }

    public final void q(float f10) {
        this.f19767g.setValue(androidx.compose.ui.unit.h.o(f10));
    }

    public final void r(@Nullable Function2<? super androidx.compose.ui.unit.d, ? super Function0<androidx.compose.ui.text.p3>, Unit> function2) {
        this.f19762b = function2;
    }

    public final void s(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f19764d.setValue(g0Var);
    }

    public final void t(@NotNull w6 w6Var, @NotNull androidx.compose.ui.text.y3 y3Var, boolean z10, boolean z11, @NotNull androidx.compose.foundation.text.b4 b4Var) {
        this.f19761a.J(w6Var, y3Var, z10, z11, b4Var);
    }
}
