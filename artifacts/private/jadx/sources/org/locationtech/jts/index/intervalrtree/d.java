package org.locationtech.jts.index.intervalrtree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rm.o;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f338407a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f338408b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338409c = 0;

    private void a(List list, List list2) {
        this.f338409c++;
        list2.clear();
        for (int i10 = 0; i10 < list.size(); i10 += 2) {
            c cVar = (c) list.get(i10);
            int i11 = i10 + 1;
            if ((i11 < list.size() ? (c) list.get(i10) : null) == null) {
                list2.add(cVar);
            } else {
                list2.add(new a((c) list.get(i10), (c) list.get(i11)));
            }
        }
    }

    private synchronized void b() {
        try {
            if (this.f338408b != null) {
                return;
            }
            this.f338408b = c();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private c c() {
        Collections.sort(this.f338407a, new c.a());
        List list = this.f338407a;
        List arrayList = new ArrayList();
        while (true) {
            a(list, arrayList);
            if (arrayList.size() == 1) {
                return (c) arrayList.get(0);
            }
            List list2 = arrayList;
            arrayList = list;
            list = list2;
        }
    }

    private void d() {
        if (this.f338408b != null) {
            return;
        }
        b();
    }

    private void f(c cVar) {
        System.out.println(o.A(new org.locationtech.jts.geom.a(cVar.f338405a, this.f338409c), new org.locationtech.jts.geom.a(cVar.f338406b, this.f338409c)));
    }

    public void e(double d10, double d11, Object obj) {
        if (this.f338408b != null) {
            throw new IllegalStateException("Index cannot be added to once it has been queried");
        }
        this.f338407a.add(new b(d10, d11, obj));
    }

    public void g(double d10, double d11, qm.b bVar) {
        d();
        this.f338408b.d(d10, d11, bVar);
    }
}
