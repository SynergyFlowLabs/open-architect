package org.locationtech.jts.index.strtree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a implements c, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f338441d = 6493722185909573708L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f338442a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f338443b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338444c;

    public a() {
    }

    public void a(c cVar) {
        org.locationtech.jts.util.a.c(this.f338443b == null);
        this.f338442a.add(cVar);
    }

    protected abstract Object b();

    public List c() {
        return this.f338442a;
    }

    public int d() {
        return this.f338444c;
    }

    public boolean e() {
        return this.f338442a.isEmpty();
    }

    public int f() {
        return this.f338442a.size();
    }

    @Override // org.locationtech.jts.index.strtree.c
    public Object getBounds() {
        if (this.f338443b == null) {
            this.f338443b = b();
        }
        return this.f338443b;
    }

    public a(int i10) {
        this.f338444c = i10;
    }
}
