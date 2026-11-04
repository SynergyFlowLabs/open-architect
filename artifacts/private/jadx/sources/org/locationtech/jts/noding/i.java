package org.locationtech.jts.noding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class i extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qm.c f338588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f338589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Collection f338590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f338591f;

    public static class a extends org.locationtech.jts.index.chain.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t f338592c;

        public a(t tVar) {
            this.f338592c = tVar;
        }

        @Override // org.locationtech.jts.index.chain.c
        public void b(org.locationtech.jts.index.chain.a aVar, int i10, org.locationtech.jts.index.chain.a aVar2, int i11) {
            this.f338592c.a((y) aVar.d(), i10, (y) aVar2.d(), i11);
        }
    }

    public i() {
        this.f338587b = new ArrayList();
        this.f338588c = new org.locationtech.jts.index.strtree.k();
        this.f338589d = 0;
        this.f338591f = 0;
    }

    private void d(y yVar) {
        for (org.locationtech.jts.index.chain.a aVar : org.locationtech.jts.index.chain.b.d(yVar.n(), yVar)) {
            int i10 = this.f338589d;
            this.f338589d = i10 + 1;
            aVar.m(i10);
            this.f338588c.a(aVar.g(), aVar);
            this.f338587b.add(aVar);
        }
    }

    private void g() {
        a aVar = new a(this.f338566a);
        for (org.locationtech.jts.index.chain.a aVar2 : this.f338587b) {
            for (org.locationtech.jts.index.chain.a aVar3 : this.f338588c.b(aVar2.g())) {
                if (aVar3.h() > aVar2.h()) {
                    aVar2.b(aVar3, aVar);
                    this.f338591f++;
                }
                if (this.f338566a.isDone()) {
                    return;
                }
            }
        }
    }

    @Override // org.locationtech.jts.noding.d0, org.locationtech.jts.noding.n
    public void a(Collection collection) {
        this.f338590e = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d((y) it.next());
        }
        g();
    }

    @Override // org.locationtech.jts.noding.d0, org.locationtech.jts.noding.n
    public Collection b() {
        return m.g(this.f338590e);
    }

    public qm.c e() {
        return this.f338588c;
    }

    public List f() {
        return this.f338587b;
    }

    public i(t tVar) {
        super(tVar);
        this.f338587b = new ArrayList();
        this.f338588c = new org.locationtech.jts.index.strtree.k();
        this.f338589d = 0;
        this.f338591f = 0;
    }
}
