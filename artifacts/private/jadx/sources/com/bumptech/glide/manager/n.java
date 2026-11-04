package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f97226d = "RequestTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.d> f97227a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.request.d> f97228b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f97229c;

    @l1
    void a(com.bumptech.glide.request.d dVar) {
        this.f97227a.add(dVar);
    }

    public boolean b(@p0 com.bumptech.glide.request.d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean zRemove = this.f97227a.remove(dVar);
        if (!this.f97228b.remove(dVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void c() {
        Iterator it = com.bumptech.glide.util.m.k(this.f97227a).iterator();
        while (it.hasNext()) {
            b((com.bumptech.glide.request.d) it.next());
        }
        this.f97228b.clear();
    }

    public boolean d() {
        return this.f97229c;
    }

    public void e() {
        this.f97229c = true;
        for (com.bumptech.glide.request.d dVar : com.bumptech.glide.util.m.k(this.f97227a)) {
            if (dVar.isRunning() || dVar.isComplete()) {
                dVar.clear();
                this.f97228b.add(dVar);
            }
        }
    }

    public void f() {
        this.f97229c = true;
        for (com.bumptech.glide.request.d dVar : com.bumptech.glide.util.m.k(this.f97227a)) {
            if (dVar.isRunning()) {
                dVar.pause();
                this.f97228b.add(dVar);
            }
        }
    }

    public void g() {
        for (com.bumptech.glide.request.d dVar : com.bumptech.glide.util.m.k(this.f97227a)) {
            if (!dVar.isComplete() && !dVar.f()) {
                dVar.clear();
                if (this.f97229c) {
                    this.f97228b.add(dVar);
                } else {
                    dVar.s();
                }
            }
        }
    }

    public void h() {
        this.f97229c = false;
        for (com.bumptech.glide.request.d dVar : com.bumptech.glide.util.m.k(this.f97227a)) {
            if (!dVar.isComplete() && !dVar.isRunning()) {
                dVar.s();
            }
        }
        this.f97228b.clear();
    }

    public void i(@NonNull com.bumptech.glide.request.d dVar) {
        this.f97227a.add(dVar);
        if (!this.f97229c) {
            dVar.s();
        } else {
            dVar.clear();
            this.f97228b.add(dVar);
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f97227a.size() + ", isPaused=" + this.f97229c + "}";
    }
}
