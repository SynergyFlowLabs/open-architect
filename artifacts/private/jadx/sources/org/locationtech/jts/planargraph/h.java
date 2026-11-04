package org.locationtech.jts.planargraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected g f338964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Set f338965b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List f338966c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected f f338967d = new f();

    public h(g gVar) {
        this.f338964a = gVar;
    }

    public void a(c cVar) {
        if (this.f338965b.contains(cVar)) {
            return;
        }
        this.f338965b.add(cVar);
        this.f338966c.add(cVar.x(0));
        this.f338966c.add(cVar.x(1));
        this.f338967d.a(cVar.x(0).L());
        this.f338967d.a(cVar.x(1).L());
    }

    public boolean b(c cVar) {
        return this.f338965b.contains(cVar);
    }

    public Iterator c() {
        return this.f338966c.iterator();
    }

    public Iterator d() {
        return this.f338965b.iterator();
    }

    public g e() {
        return this.f338964a;
    }

    public Iterator f() {
        return this.f338967d.c();
    }
}
