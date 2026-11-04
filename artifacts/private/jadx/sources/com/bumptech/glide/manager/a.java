package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<i> f97192a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f97193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f97194c;

    a() {
    }

    @Override // com.bumptech.glide.manager.h
    public void a(@NonNull i iVar) {
        this.f97192a.remove(iVar);
    }

    @Override // com.bumptech.glide.manager.h
    public void b(@NonNull i iVar) {
        this.f97192a.add(iVar);
        if (this.f97194c) {
            iVar.b();
        } else if (this.f97193b) {
            iVar.m();
        } else {
            iVar.a();
        }
    }

    void c() {
        this.f97194c = true;
        Iterator it = com.bumptech.glide.util.m.k(this.f97192a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).b();
        }
    }

    void d() {
        this.f97193b = true;
        Iterator it = com.bumptech.glide.util.m.k(this.f97192a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).m();
        }
    }

    void e() {
        this.f97193b = false;
        Iterator it = com.bumptech.glide.util.m.k(this.f97192a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }
}
