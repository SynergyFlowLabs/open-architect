package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 extends RecyclerView.m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f74168m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f74169n = "SimpleItemAnimator";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f74170l = true;

    @e.a({"UnknownNullness"})
    public abstract boolean D(RecyclerView.g0 g0Var);

    @e.a({"UnknownNullness"})
    public abstract boolean E(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13);

    @e.a({"UnknownNullness"})
    public abstract boolean F(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13);

    @e.a({"UnknownNullness"})
    public abstract boolean G(RecyclerView.g0 g0Var);

    @e.a({"UnknownNullness"})
    public final void H(RecyclerView.g0 g0Var) {
        Q(g0Var);
        h(g0Var);
    }

    @e.a({"UnknownNullness"})
    public final void I(RecyclerView.g0 g0Var) {
        R(g0Var);
    }

    @e.a({"UnknownNullness"})
    public final void J(RecyclerView.g0 g0Var, boolean z10) {
        S(g0Var, z10);
        h(g0Var);
    }

    @e.a({"UnknownNullness"})
    public final void K(RecyclerView.g0 g0Var, boolean z10) {
        T(g0Var, z10);
    }

    @e.a({"UnknownNullness"})
    public final void L(RecyclerView.g0 g0Var) {
        U(g0Var);
        h(g0Var);
    }

    @e.a({"UnknownNullness"})
    public final void M(RecyclerView.g0 g0Var) {
        V(g0Var);
    }

    @e.a({"UnknownNullness"})
    public final void N(RecyclerView.g0 g0Var) {
        W(g0Var);
        h(g0Var);
    }

    @e.a({"UnknownNullness"})
    public final void O(RecyclerView.g0 g0Var) {
        X(g0Var);
    }

    public boolean P() {
        return this.f74170l;
    }

    @e.a({"UnknownNullness"})
    public void Q(RecyclerView.g0 g0Var) {
    }

    @e.a({"UnknownNullness"})
    public void R(RecyclerView.g0 g0Var) {
    }

    @e.a({"UnknownNullness"})
    public void S(RecyclerView.g0 g0Var, boolean z10) {
    }

    @e.a({"UnknownNullness"})
    public void T(RecyclerView.g0 g0Var, boolean z10) {
    }

    @e.a({"UnknownNullness"})
    public void U(RecyclerView.g0 g0Var) {
    }

    @e.a({"UnknownNullness"})
    public void V(RecyclerView.g0 g0Var) {
    }

    @e.a({"UnknownNullness"})
    public void W(RecyclerView.g0 g0Var) {
    }

    @e.a({"UnknownNullness"})
    public void X(RecyclerView.g0 g0Var) {
    }

    public void Y(boolean z10) {
        this.f74170l = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(@NonNull RecyclerView.g0 g0Var, @p0 RecyclerView.m.d dVar, @NonNull RecyclerView.m.d dVar2) {
        int i10;
        int i11;
        return (dVar == null || ((i10 = dVar.f74017a) == (i11 = dVar2.f74017a) && dVar.f74018b == dVar2.f74018b)) ? D(g0Var) : F(g0Var, i10, dVar.f74018b, i11, dVar2.f74018b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.g0 g0Var2, @NonNull RecyclerView.m.d dVar, @NonNull RecyclerView.m.d dVar2) {
        int i10;
        int i11;
        int i12 = dVar.f74017a;
        int i13 = dVar.f74018b;
        if (g0Var2.shouldIgnore()) {
            int i14 = dVar.f74017a;
            i11 = dVar.f74018b;
            i10 = i14;
        } else {
            i10 = dVar2.f74017a;
            i11 = dVar2.f74018b;
        }
        return E(g0Var, g0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.m.d dVar, @p0 RecyclerView.m.d dVar2) {
        int i10 = dVar.f74017a;
        int i11 = dVar.f74018b;
        View view = g0Var.itemView;
        int left = dVar2 == null ? view.getLeft() : dVar2.f74017a;
        int top = dVar2 == null ? view.getTop() : dVar2.f74018b;
        if (g0Var.isRemoved() || (i10 == left && i11 == top)) {
            return G(g0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return F(g0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.m.d dVar, @NonNull RecyclerView.m.d dVar2) {
        int i10 = dVar.f74017a;
        int i11 = dVar2.f74017a;
        if (i10 != i11 || dVar.f74018b != dVar2.f74018b) {
            return F(g0Var, i10, dVar.f74018b, i11, dVar2.f74018b);
        }
        L(g0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(@NonNull RecyclerView.g0 g0Var) {
        if (this.f74170l && !g0Var.isInvalid()) {
            return false;
        }
        return true;
    }
}
