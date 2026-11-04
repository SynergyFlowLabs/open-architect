package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.target.p<?>> f97238a = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.i
    public void a() {
        Iterator it = com.bumptech.glide.util.m.k(this.f97238a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).a();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public void b() {
        Iterator it = com.bumptech.glide.util.m.k(this.f97238a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).b();
        }
    }

    public void c() {
        this.f97238a.clear();
    }

    @NonNull
    public List<com.bumptech.glide.request.target.p<?>> e() {
        return com.bumptech.glide.util.m.k(this.f97238a);
    }

    public void f(@NonNull com.bumptech.glide.request.target.p<?> pVar) {
        this.f97238a.add(pVar);
    }

    public void g(@NonNull com.bumptech.glide.request.target.p<?> pVar) {
        this.f97238a.remove(pVar);
    }

    @Override // com.bumptech.glide.manager.i
    public void m() {
        Iterator it = com.bumptech.glide.util.m.k(this.f97238a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).m();
        }
    }
}
