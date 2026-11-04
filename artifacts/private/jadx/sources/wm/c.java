package wm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.h0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.util.h;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f390595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f390596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f390597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f390598d;

    public c(Collection collection, r rVar) {
        this.f390595a = new ArrayList();
        this.f390596b = new ArrayList();
        this.f390597c = new ArrayList();
        this.f390598d = rVar;
        a(collection);
    }

    private void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((n) it.next());
        }
    }

    private void b(n nVar) {
        if (this.f390598d == null) {
            this.f390598d = nVar.g0();
        }
        h.c(nVar, e0.class, this.f390595a);
        h.c(nVar, v.class, this.f390596b);
        h.c(nVar, d0.class, this.f390597c);
    }

    public static n d(Collection collection) {
        return new c(collection).c();
    }

    public static n e(Collection collection, r rVar) {
        return new c(collection, rVar).c();
    }

    public static n f(n nVar) {
        return new c(nVar).c();
    }

    private n g(n nVar) {
        return org.locationtech.jts.operation.overlay.snap.c.d(nVar, this.f390598d.u(), 2);
    }

    private n h(n nVar, n nVar2) {
        if (nVar == null && nVar2 == null) {
            return null;
        }
        if (nVar2 == null) {
            return nVar;
        }
        return nVar == null ? nVar2 : nVar.O0(nVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v7, types: [org.locationtech.jts.geom.n] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public n c() {
        n nVarB;
        if (this.f390598d == null) {
            return null;
        }
        Object objG = this.f390597c.size() > 0 ? g(this.f390598d.b(this.f390597c)) : null;
        n nVarH = h(this.f390596b.size() > 0 ? g(this.f390598d.b(this.f390596b)) : null, this.f390595a.size() > 0 ? a.k(this.f390595a) : null);
        ?? r10 = objG;
        if (objG == null) {
            r10 = nVarH;
        } else if (nVarH != null) {
            nVarB = b.b((h0) objG, nVarH);
        }
        if (r10 == 0) {
            r10 = nVarB;
            return this.f390598d.d();
        }
        r10 = nVarB;
        return r10;
    }

    public c(Collection collection) {
        this.f390595a = new ArrayList();
        this.f390596b = new ArrayList();
        this.f390597c = new ArrayList();
        this.f390598d = null;
        a(collection);
    }

    public c(n nVar) {
        this.f390595a = new ArrayList();
        this.f390596b = new ArrayList();
        this.f390597c = new ArrayList();
        this.f390598d = null;
        b(nVar);
    }
}
