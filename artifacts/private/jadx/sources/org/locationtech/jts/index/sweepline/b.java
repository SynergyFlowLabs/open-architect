package org.locationtech.jts.index.sweepline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List f338477a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338479c;

    private void b() {
        if (this.f338478b) {
            return;
        }
        Collections.sort(this.f338477a);
        for (int i10 = 0; i10 < this.f338477a.size(); i10++) {
            a aVar = (a) this.f338477a.get(i10);
            if (aVar.o()) {
                aVar.l().q(i10);
            }
        }
        this.f338478b = true;
    }

    private void d(int i10, int i11, c cVar, d dVar) {
        while (i10 < i11) {
            a aVar = (a) this.f338477a.get(i10);
            if (aVar.p()) {
                dVar.a(cVar, aVar.n());
                this.f338479c++;
            }
            i10++;
        }
    }

    public void a(c cVar) {
        a aVar = new a(cVar.c(), null, cVar);
        this.f338477a.add(aVar);
        this.f338477a.add(new a(cVar.b(), aVar, cVar));
    }

    public void c(d dVar) {
        this.f338479c = 0;
        b();
        for (int i10 = 0; i10 < this.f338477a.size(); i10++) {
            a aVar = (a) this.f338477a.get(i10);
            if (aVar.p()) {
                d(i10, aVar.k(), aVar.n(), dVar);
            }
        }
    }
}
