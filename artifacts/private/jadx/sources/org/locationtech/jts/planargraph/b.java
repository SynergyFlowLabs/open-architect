package org.locationtech.jts.planargraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List f338952a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338953b = false;

    private void l() {
        if (this.f338953b) {
            return;
        }
        Collections.sort(this.f338952a);
        this.f338953b = true;
    }

    public void a(a aVar) {
        this.f338952a.add(aVar);
        this.f338953b = false;
    }

    public org.locationtech.jts.geom.a b() {
        Iterator itJ = j();
        if (itJ.hasNext()) {
            return ((a) itJ.next()).D();
        }
        return null;
    }

    public int c() {
        return this.f338952a.size();
    }

    public List d() {
        l();
        return this.f338952a;
    }

    public int e(int i10) {
        int size = i10 % this.f338952a.size();
        return size < 0 ? size + this.f338952a.size() : size;
    }

    public int f(a aVar) {
        l();
        for (int i10 = 0; i10 < this.f338952a.size(); i10++) {
            if (((a) this.f338952a.get(i10)) == aVar) {
                return i10;
            }
        }
        return -1;
    }

    public int g(c cVar) {
        l();
        for (int i10 = 0; i10 < this.f338952a.size(); i10++) {
            if (((a) this.f338952a.get(i10)).H() == cVar) {
                return i10;
            }
        }
        return -1;
    }

    public a h(a aVar) {
        return (a) this.f338952a.get(e(f(aVar) - 1));
    }

    public a i(a aVar) {
        return (a) this.f338952a.get(e(f(aVar) + 1));
    }

    public Iterator j() {
        l();
        return this.f338952a.iterator();
    }

    public void k(a aVar) {
        this.f338952a.remove(aVar);
    }
}
