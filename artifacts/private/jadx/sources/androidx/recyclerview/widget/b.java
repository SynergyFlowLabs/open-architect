package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RecyclerView.h f74138a;

    public b(@NonNull RecyclerView.h hVar) {
        this.f74138a = hVar;
    }

    @Override // androidx.recyclerview.widget.v
    @e.a({"UnknownNullness"})
    public void a(int i10, int i11, Object obj) {
        this.f74138a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.v
    public void b(int i10, int i11) {
        this.f74138a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.v
    public void c(int i10, int i11) {
        this.f74138a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.v
    public void d(int i10, int i11) {
        this.f74138a.notifyItemMoved(i10, i11);
    }
}
