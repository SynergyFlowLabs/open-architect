package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.d3;
import androidx.compose.foundation.text.selection.h0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m5;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.text.p3;
import com.rabbitmq.client.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,353:1\n202#2,4:354\n206#2:361\n207#2,3:364\n249#2,14:367\n57#3:358\n61#3:362\n60#4:359\n70#4:363\n22#5:360\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n159#1:354,4\n159#1:361\n159#1:364,3\n159#1:367,14\n159#1:358\n159#1:362\n159#1:359\n159#1:363\n159#1:360\n*E\n"})
public final class n implements m5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20639g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d3 f20641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private q f20643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.text.selection.e0 f20644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f20645f;

    public /* synthetic */ n(long j10, d3 d3Var, long j11, q qVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, d3Var, j11, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 f(n nVar) {
        return nVar.f20643d.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 g(n nVar) {
        return nVar.f20643d.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p3 h(n nVar) {
        return nVar.f20643d.g();
    }

    public final void d(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        h0 h0VarN = this.f20641b.f().n(this.f20640a);
        if (h0VarN == null) {
            return;
        }
        int iG = !h0VarN.g() ? h0VarN.h().g() : h0VarN.f().g();
        int iG2 = !h0VarN.g() ? h0VarN.f().g() : h0VarN.h().g();
        if (iG == iG2) {
            return;
        }
        androidx.compose.foundation.text.selection.e0 e0Var = this.f20644e;
        int iM = e0Var != null ? e0Var.m() : 0;
        k2 k2VarE = this.f20643d.e(kotlin.ranges.r.B(iG, iM), kotlin.ranges.r.B(iG2, iM));
        if (k2VarE == null) {
            return;
        }
        if (!this.f20643d.f()) {
            androidx.compose.ui.graphics.drawscope.f.K1(fVar, k2VarE, this.f20642c, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.d() & k0.f265952a));
        int iB = p0.f38096b.b();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iB);
            androidx.compose.ui.graphics.drawscope.f.K1(fVar, k2VarE, this.f20642c, 0.0f, null, null, 0, 60, null);
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    @NotNull
    public final androidx.compose.ui.a0 e() {
        return this.f20645f;
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
        this.f20644e = this.f20641b.h(new androidx.compose.foundation.text.selection.u(this.f20640a, new Function0() { // from class: androidx.compose.foundation.text.modifiers.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.g(this.f20636a);
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.modifiers.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.h(this.f20637a);
            }
        }));
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        androidx.compose.foundation.text.selection.e0 e0Var = this.f20644e;
        if (e0Var != null) {
            this.f20641b.b(e0Var);
            this.f20644e = null;
        }
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        androidx.compose.foundation.text.selection.e0 e0Var = this.f20644e;
        if (e0Var != null) {
            this.f20641b.b(e0Var);
            this.f20644e = null;
        }
    }

    public final void l(@NotNull g0 g0Var) {
        this.f20643d = q.c(this.f20643d, g0Var, null, 2, null);
        this.f20641b.a(this.f20640a);
    }

    public final void m(@NotNull p3 p3Var) {
        p3 p3VarG = this.f20643d.g();
        if (p3VarG != null && !Intrinsics.areEqual(p3VarG.l().n(), p3Var.l().n())) {
            this.f20641b.g(this.f20640a);
        }
        this.f20643d = q.c(this.f20643d, null, p3Var, 1, null);
    }

    private n(long j10, d3 d3Var, long j11, q qVar) {
        this.f20640a = j10;
        this.f20641b = d3Var;
        this.f20642c = j11;
        this.f20643d = qVar;
        this.f20645f = androidx.compose.ui.input.pointer.y.b(o.b(d3Var, j10, new Function0() { // from class: androidx.compose.foundation.text.modifiers.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.f(this.f20638a);
            }
        }), androidx.compose.ui.input.pointer.x.f39142a.d(), false, 2, null);
    }

    public /* synthetic */ n(long j10, d3 d3Var, long j11, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, d3Var, j11, (i10 & 8) != 0 ? q.f20656c.a() : qVar, null);
    }
}
