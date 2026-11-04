package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0<T2> extends f0.b<T2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final RecyclerView.h<?> f74244a;

    public g0(@e.a({"UnknownNullness", "MissingNullability"}) RecyclerView.h<?> hVar) {
        this.f74244a = hVar;
    }

    @Override // androidx.recyclerview.widget.f0.b, androidx.recyclerview.widget.v
    @e.a({"UnknownNullness"})
    public void a(int i10, int i11, Object obj) {
        this.f74244a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.v
    public void b(int i10, int i11) {
        this.f74244a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.v
    public void c(int i10, int i11) {
        this.f74244a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.v
    public void d(int i10, int i11) {
        this.f74244a.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.f0.b
    public void h(int i10, int i11) {
        this.f74244a.notifyItemRangeChanged(i10, i11);
    }
}
