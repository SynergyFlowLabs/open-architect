package org.commonmark.internal;

import java.util.LinkedList;
import java.util.ListIterator;
import org.commonmark.node.a0;

/* JADX INFO: loaded from: classes14.dex */
class s implements cm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f337692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f337693b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<cm.a> f337694c = new LinkedList<>();

    s(char c10) {
        this.f337692a = c10;
    }

    private cm.a g(int i10) {
        for (cm.a aVar : this.f337694c) {
            if (aVar.b() <= i10) {
                return aVar;
            }
        }
        return this.f337694c.getFirst();
    }

    @Override // cm.a
    public char a() {
        return this.f337692a;
    }

    @Override // cm.a
    public int b() {
        return this.f337693b;
    }

    @Override // cm.a
    public char c() {
        return this.f337692a;
    }

    @Override // cm.a
    public int d(cm.b bVar, cm.b bVar2) {
        return g(bVar.length()).d(bVar, bVar2);
    }

    @Override // cm.a
    public void e(a0 a0Var, a0 a0Var2, int i10) {
        g(i10).e(a0Var, a0Var2, i10);
    }

    void f(cm.a aVar) {
        int iB = aVar.b();
        ListIterator<cm.a> listIterator = this.f337694c.listIterator();
        while (listIterator.hasNext()) {
            int iB2 = listIterator.next().b();
            if (iB > iB2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iB == iB2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f337692a + "' and minimum length " + iB);
            }
        }
        this.f337694c.add(aVar);
        this.f337693b = iB;
    }
}
