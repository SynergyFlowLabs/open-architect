package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class k5 implements x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x3 f15764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.j f15765d;

    public static final class a extends androidx.compose.ui.a0.d {
        a() {
        }
    }

    public k5(boolean z10, boolean z11, @NotNull x3 x3Var) {
        this.f15762a = z10;
        this.f15763b = z11;
        this.f15764c = x3Var;
        this.f15765d = z10 ? x3Var.w() : new a();
    }

    @Override // androidx.compose.foundation.x3
    @Nullable
    public Object A(long j10, @NotNull Function2<? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (this.f15763b) {
            Object objA = this.f15764c.A(j10, function2, dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
        Object objInvoke = function2.invoke(androidx.compose.ui.unit.c0.b(j10), dVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return this.f15762a == k5Var.f15762a && this.f15763b == k5Var.f15763b && Intrinsics.areEqual(this.f15764c, k5Var.f15764c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f15762a) * 31) + Boolean.hashCode(this.f15763b)) * 31) + this.f15764c.hashCode();
    }

    @Override // androidx.compose.foundation.x3
    @NotNull
    public androidx.compose.ui.node.j w() {
        return this.f15765d;
    }

    @Override // androidx.compose.foundation.x3
    public boolean x() {
        return this.f15764c.x();
    }

    @Override // androidx.compose.foundation.x3
    public long z(long j10, int i10, @NotNull Function1<? super n0.g, n0.g> function1) {
        return this.f15763b ? this.f15764c.z(j10, i10, function1) : function1.invoke(n0.g.d(j10)).B();
    }
}
