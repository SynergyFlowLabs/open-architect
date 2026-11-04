package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView.g0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u<T, VH extends RecyclerView.g0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final d<T> f74563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.b<T> f74564b;

    class a implements d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(@NonNull List<T> list, @NonNull List<T> list2) {
            u.this.j(list, list2);
        }
    }

    protected u(@NonNull k.f<T> fVar) {
        a aVar = new a();
        this.f74564b = aVar;
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.f74563a = dVar;
        dVar.a(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f74563a.b().size();
    }

    @NonNull
    public List<T> h() {
        return this.f74563a.b();
    }

    protected T i(int i10) {
        return this.f74563a.b().get(i10);
    }

    public void j(@NonNull List<T> list, @NonNull List<T> list2) {
    }

    public void k(@p0 List<T> list) {
        this.f74563a.f(list);
    }

    public void l(@p0 List<T> list, @p0 Runnable runnable) {
        this.f74563a.g(list, runnable);
    }

    protected u(@NonNull c<T> cVar) {
        a aVar = new a();
        this.f74564b = aVar;
        d<T> dVar = new d<>(new b(this), cVar);
        this.f74563a = dVar;
        dVar.a(aVar);
    }
}
