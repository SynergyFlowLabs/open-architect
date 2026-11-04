package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f74245b = "ConcatAdapter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f74246a;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final a f74247c = new a(true, b.NO_STABLE_IDS);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f74248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final b f74249b;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.h$a$a, reason: collision with other inner class name */
        public static final class C0729a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f74250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private b f74251b;

            public C0729a() {
                a aVar = a.f74247c;
                this.f74250a = aVar.f74248a;
                this.f74251b = aVar.f74249b;
            }

            @NonNull
            public a a() {
                return new a(this.f74250a, this.f74251b);
            }

            @NonNull
            public C0729a b(boolean z10) {
                this.f74250a = z10;
                return this;
            }

            @NonNull
            public C0729a c(@NonNull b bVar) {
                this.f74251b = bVar;
                return this;
            }
        }

        public enum b {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        a(boolean z10, @NonNull b bVar) {
            this.f74248a = z10;
            this.f74249b = bVar;
        }
    }

    @SafeVarargs
    public h(@NonNull RecyclerView.h<? extends RecyclerView.g0>... hVarArr) {
        this(a.f74247c, hVarArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int findRelativeAdapterPositionIn(@NonNull RecyclerView.h<? extends RecyclerView.g0> hVar, @NonNull RecyclerView.g0 g0Var, int i10) {
        return this.f74246a.t(hVar, g0Var, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f74246a.u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f74246a.r(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f74246a.s(i10);
    }

    public boolean h(int i10, @NonNull RecyclerView.h<? extends RecyclerView.g0> hVar) {
        return this.f74246a.h(i10, hVar);
    }

    public boolean i(@NonNull RecyclerView.h<? extends RecyclerView.g0> hVar) {
        return this.f74246a.i(hVar);
    }

    @NonNull
    public List<? extends RecyclerView.h<? extends RecyclerView.g0>> j() {
        return Collections.unmodifiableList(this.f74246a.q());
    }

    @NonNull
    public Pair<RecyclerView.h<? extends RecyclerView.g0>, Integer> k(int i10) {
        return this.f74246a.v(i10);
    }

    void l(@NonNull RecyclerView.h.a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    public boolean m(@NonNull RecyclerView.h<? extends RecyclerView.g0> hVar) {
        return this.f74246a.J(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f74246a.A(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NonNull RecyclerView.g0 g0Var, int i10) {
        this.f74246a.B(g0Var, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    public RecyclerView.g0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return this.f74246a.C(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f74246a.D(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(@NonNull RecyclerView.g0 g0Var) {
        return this.f74246a.E(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@NonNull RecyclerView.g0 g0Var) {
        this.f74246a.F(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(@NonNull RecyclerView.g0 g0Var) {
        this.f74246a.G(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@NonNull RecyclerView.g0 g0Var) {
        this.f74246a.H(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setStateRestorationPolicy(@NonNull RecyclerView.h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public h(@NonNull a aVar, @NonNull RecyclerView.h<? extends RecyclerView.g0>... hVarArr) {
        this(aVar, (List<? extends RecyclerView.h<? extends RecyclerView.g0>>) Arrays.asList(hVarArr));
    }

    public h(@NonNull List<? extends RecyclerView.h<? extends RecyclerView.g0>> list) {
        this(a.f74247c, list);
    }

    public h(@NonNull a aVar, @NonNull List<? extends RecyclerView.h<? extends RecyclerView.g0>> list) {
        this.f74246a = new i(this, aVar);
        Iterator<? extends RecyclerView.h<? extends RecyclerView.g0>> it = list.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
        super.setHasStableIds(this.f74246a.x());
    }
}
