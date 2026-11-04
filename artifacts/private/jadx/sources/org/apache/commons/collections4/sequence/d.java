package org.apache.commons.collections4.sequence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c<T>> f336268a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f336269b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f336270c = 0;

    public void a(b<T> bVar) {
        this.f336268a.add(bVar);
        this.f336270c++;
    }

    public void b(e<T> eVar) {
        this.f336268a.add(eVar);
        this.f336270c++;
    }

    public void c(f<T> fVar) {
        this.f336268a.add(fVar);
        this.f336269b++;
    }

    public int d() {
        return this.f336269b;
    }

    public int e() {
        return this.f336270c;
    }

    public void f(a<T> aVar) {
        Iterator<c<T>> it = this.f336268a.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }
}
