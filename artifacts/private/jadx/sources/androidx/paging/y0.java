package androidx.paging;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y0<VH extends RecyclerView.g0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private x0 f72758a = new x0.c(false);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return h(this.f72758a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i10) {
        return j(this.f72758a);
    }

    public boolean h(@NotNull x0 loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        if (!(loadState instanceof x0.b) && !(loadState instanceof x0.a)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final x0 i() {
        return this.f72758a;
    }

    public int j(@NotNull x0 loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return 0;
    }

    public abstract void k(@NotNull VH vh2, @NotNull x0 x0Var);

    @NotNull
    public abstract VH l(@NotNull ViewGroup viewGroup, @NotNull x0 x0Var);

    public final void m(@NotNull x0 loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        if (Intrinsics.areEqual(this.f72758a, loadState)) {
            return;
        }
        boolean zH = h(this.f72758a);
        boolean zH2 = h(loadState);
        if (zH && !zH2) {
            notifyItemRemoved(0);
        } else if (zH2 && !zH) {
            notifyItemInserted(0);
        } else if (zH && zH2) {
            notifyItemChanged(0);
        }
        this.f72758a = loadState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(@NotNull VH holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        k(holder, this.f72758a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public final VH onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return (VH) l(parent, this.f72758a);
    }
}
