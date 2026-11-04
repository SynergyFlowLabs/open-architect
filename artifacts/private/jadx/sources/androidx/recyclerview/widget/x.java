package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final m0.c f74598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final h0.d f74599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.h<RecyclerView.g0> f74600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f74601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f74602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.j f74603f = new a();

    class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            x xVar = x.this;
            xVar.f74602e = xVar.f74600c.getItemCount();
            x xVar2 = x.this;
            xVar2.f74601d.g(xVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11) {
            x xVar = x.this;
            xVar.f74601d.a(xVar, i10, i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, @p0 Object obj) {
            x xVar = x.this;
            xVar.f74601d.a(xVar, i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            x xVar = x.this;
            xVar.f74602e += i11;
            xVar.f74601d.f(xVar, i10, i11);
            x xVar2 = x.this;
            if (xVar2.f74602e <= 0 || xVar2.f74600c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            x xVar3 = x.this;
            xVar3.f74601d.c(xVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            androidx.core.util.t.b(i12 == 1, "moving more than 1 item is not supported in RecyclerView");
            x xVar = x.this;
            xVar.f74601d.b(xVar, i10, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            x xVar = x.this;
            xVar.f74602e -= i11;
            xVar.f74601d.e(xVar, i10, i11);
            x xVar2 = x.this;
            if (xVar2.f74602e >= 1 || xVar2.f74600c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            x xVar3 = x.this;
            xVar3.f74601d.c(xVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            x xVar = x.this;
            xVar.f74601d.c(xVar);
        }
    }

    interface b {
        void a(@NonNull x xVar, int i10, int i11, @p0 Object obj);

        void b(@NonNull x xVar, int i10, int i11);

        void c(x xVar);

        void d(@NonNull x xVar, int i10, int i11);

        void e(@NonNull x xVar, int i10, int i11);

        void f(@NonNull x xVar, int i10, int i11);

        void g(@NonNull x xVar);
    }

    x(RecyclerView.h<RecyclerView.g0> hVar, b bVar, m0 m0Var, h0.d dVar) {
        this.f74600c = hVar;
        this.f74601d = bVar;
        this.f74598a = m0Var.b(this);
        this.f74599b = dVar;
        this.f74602e = hVar.getItemCount();
        hVar.registerAdapterDataObserver(this.f74603f);
    }

    void a() {
        this.f74600c.unregisterAdapterDataObserver(this.f74603f);
        this.f74598a.dispose();
    }

    int b() {
        return this.f74602e;
    }

    public long c(int i10) {
        return this.f74599b.a(this.f74600c.getItemId(i10));
    }

    int d(int i10) {
        return this.f74598a.a(this.f74600c.getItemViewType(i10));
    }

    void e(RecyclerView.g0 g0Var, int i10) {
        this.f74600c.bindViewHolder(g0Var, i10);
    }

    RecyclerView.g0 f(ViewGroup viewGroup, int i10) {
        return this.f74600c.onCreateViewHolder(viewGroup, this.f74598a.b(i10));
    }
}
