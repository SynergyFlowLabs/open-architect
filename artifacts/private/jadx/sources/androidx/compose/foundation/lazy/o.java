package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class o implements androidx.compose.foundation.lazy.layout.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17685c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f17686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s0 f17687b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function2 function2, q0 q0Var) {
        function2.invoke(Integer.valueOf(q0Var.getIndex()), Integer.valueOf(q0Var.a()));
        return Unit.f312394a;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public boolean b() {
        return !o().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int c() {
        return o().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @NotNull
    public List<androidx.compose.foundation.lazy.layout.i1.b> d(int i10, @NotNull final Function2<? super Integer, ? super Integer, Unit> function2) {
        return CollectionsKt.listOf(p().a(i10, new Function1() { // from class: androidx.compose.foundation.lazy.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.q(function2, (q0) obj);
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int e(int i10) {
        return o().h().get(i10).getSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int f() {
        return androidx.compose.foundation.gestures.snapping.f.d(o());
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int g() {
        if (c() == 0) {
            return -1;
        }
        return c() - 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @Nullable
    public androidx.compose.ui.unit.d getDensity() {
        f0 f0VarO = o();
        m0 m0Var = f0VarO instanceof m0 ? (m0) f0VarO : null;
        if (m0Var != null) {
            return m0Var.w();
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int h() {
        return ((v) CollectionsKt.first((List) o().h())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int i(int i10) {
        return o().h().get(i10).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int j() {
        return o().h().size();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int k(int i10) {
        return i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int l() {
        return ((v) CollectionsKt.last((List) o().h())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int m() {
        return Math.abs(kotlin.ranges.r.B(((v) CollectionsKt.first((List) o().h())).getOffset() + o().f(), 0));
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int n() {
        v vVar = (v) CollectionsKt.last((List) o().h());
        return Math.abs(((vVar.getOffset() + vVar.getSize()) + o().g()) - o().e());
    }

    @NotNull
    public final f0 o() {
        f0 f0Var = this.f17686a;
        if (f0Var != null) {
            return f0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutInfo");
        return null;
    }

    @NotNull
    public final s0 p() {
        s0 s0Var = this.f17687b;
        if (s0Var != null) {
            return s0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("prefetchScope");
        return null;
    }

    public final void r(@NotNull f0 f0Var) {
        this.f17686a = f0Var;
    }

    public final void s(@NotNull s0 s0Var) {
        this.f17687b = s0Var;
    }
}
