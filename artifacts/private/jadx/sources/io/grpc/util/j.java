package io.grpc.util;

import com.google.common.base.j0;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import com.google.common.collect.nb;
import io.grpc.d0;
import io.grpc.internal.f2;
import io.grpc.o1;
import io.grpc.p1;
import io.grpc.t0;
import io.grpc.u;
import io.grpc.y2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@t0
public abstract class j extends o1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Logger f291042l = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o1.f f291044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f291045i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected u f291047k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Object, c> f291043g = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final p1 f291046j = new f2();

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y2 f291048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c> f291049b;

        public b(y2 y2Var, List<c> list) {
            this.f291048a = y2Var;
            this.f291049b = list;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f291050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o1.i f291051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f291052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f291053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p1 f291054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private u f291055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o1.k f291056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f291057h;

        private final class a extends f {
            private a() {
            }

            @Override // io.grpc.util.f, io.grpc.o1.f
            public void q(u uVar, o1.k kVar) {
                if (j.this.f291043g.containsKey(c.this.f291050a)) {
                    c.this.f291055f = uVar;
                    c.this.f291056g = kVar;
                    if (c.this.f291057h) {
                        return;
                    }
                    j jVar = j.this;
                    if (jVar.f291045i) {
                        return;
                    }
                    if (uVar == u.IDLE && jVar.A()) {
                        c.this.f291053d.f();
                    }
                    j.this.D();
                }
            }

            @Override // io.grpc.util.f
            protected o1.f t() {
                return j.this.f291044h;
            }
        }

        public c(j jVar, Object obj, p1 p1Var, Object obj2, o1.k kVar) {
            this(obj, p1Var, obj2, kVar, null, false);
        }

        protected void h() {
            if (this.f291057h) {
                return;
            }
            j.this.f291043g.remove(this.f291050a);
            this.f291057h = true;
            j.f291042l.log(Level.FINE, "Child balancer {0} deactivated", this.f291050a);
        }

        Object i() {
            return this.f291052c;
        }

        public o1.k j() {
            return this.f291056g;
        }

        public u k() {
            return this.f291055f;
        }

        public d0 l() {
            o1.i iVar = this.f291051b;
            if (iVar == null || iVar.a().isEmpty()) {
                return null;
            }
            return this.f291051b.a().get(0);
        }

        public Object m() {
            return this.f291050a;
        }

        protected h n() {
            return this.f291053d;
        }

        public p1 o() {
            return this.f291054e;
        }

        @com.google.common.annotations.e
        public o1.i p() {
            return this.f291051b;
        }

        protected o1.j q(o1.h hVar) {
            if (j() == null) {
                return null;
            }
            return j().a(hVar).c();
        }

        public boolean r() {
            return this.f291057h;
        }

        protected void s() {
            this.f291057h = false;
        }

        protected void t(p1 p1Var) {
            this.f291057h = false;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Address = ");
            sb2.append(this.f291050a);
            sb2.append(", state = ");
            sb2.append(this.f291055f);
            sb2.append(", picker type: ");
            sb2.append(this.f291056g.getClass());
            sb2.append(", lb: ");
            sb2.append(this.f291053d.h().getClass());
            sb2.append(this.f291057h ? ", deactivated" : "");
            return sb2.toString();
        }

        protected void u() {
            this.f291057h = true;
        }

        protected void v(o1.i iVar) {
            j0.F(iVar, "Missing address list for child");
            this.f291051b = iVar;
        }

        protected void w() {
            this.f291053d.g();
            this.f291055f = u.SHUTDOWN;
            j.f291042l.log(Level.FINE, "Child balancer {0} deleted", this.f291050a);
        }

        public c(Object obj, p1 p1Var, Object obj2, o1.k kVar, o1.i iVar, boolean z10) {
            this.f291050a = obj;
            this.f291054e = p1Var;
            this.f291057h = z10;
            this.f291056g = kVar;
            this.f291052c = obj2;
            h hVar = new h(new a());
            this.f291053d = hVar;
            this.f291055f = z10 ? u.IDLE : u.CONNECTING;
            this.f291051b = iVar;
            if (!z10) {
                hVar.t(p1Var);
            }
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f291060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f291061b;

        public d(d0 d0Var) {
            j0.F(d0Var, "eag");
            this.f291060a = new String[d0Var.a().size()];
            Iterator<SocketAddress> it = d0Var.a().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                this.f291060a[i10] = it.next().toString();
                i10++;
            }
            Arrays.sort(this.f291060a);
            this.f291061b = Arrays.hashCode(this.f291060a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.f291061b == this.f291061b) {
                String[] strArr = dVar.f291060a;
                int length = strArr.length;
                String[] strArr2 = this.f291060a;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f291061b;
        }

        public String toString() {
            return Arrays.toString(this.f291060a);
        }
    }

    protected j(o1.f fVar) {
        this.f291044h = (o1.f) j0.F(fVar, "helper");
        f291042l.log(Level.FINE, "Created");
    }

    @fj.h
    protected static u l(@fj.h u uVar, u uVar2) {
        if (uVar == null) {
            return uVar2;
        }
        u uVar3 = u.READY;
        return (uVar == uVar3 || uVar2 == uVar3 || uVar == (uVar3 = u.CONNECTING) || uVar2 == uVar3 || uVar == (uVar3 = u.IDLE) || uVar2 == uVar3) ? uVar3 : uVar;
    }

    protected boolean A() {
        return true;
    }

    protected void B(Object obj) {
        this.f291043g.remove(obj);
    }

    protected void C(List<c> list) {
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            it.next().w();
        }
    }

    protected void D() {
        HashMap map = new HashMap();
        u uVarL = null;
        for (c cVar : r()) {
            if (!cVar.f291057h) {
                map.put(cVar.f291050a, cVar.f291056g);
                uVarL = l(uVarL, cVar.f291055f);
            }
        }
        if (uVarL != null) {
            this.f291044h.q(uVarL, x(map));
            this.f291047k = uVarL;
        }
    }

    @Override // io.grpc.o1
    public y2 a(o1.i iVar) {
        try {
            this.f291045i = true;
            b bVarH = h(iVar);
            if (!bVarH.f291048a.r()) {
                return bVarH.f291048a;
            }
            D();
            C(bVarH.f291049b);
            return bVarH.f291048a;
        } finally {
            this.f291045i = false;
        }
    }

    @Override // io.grpc.o1
    public void c(y2 y2Var) {
        if (this.f291047k != u.READY) {
            this.f291044h.q(u.TRANSIENT_FAILURE, s(y2Var));
        }
    }

    @Override // io.grpc.o1
    public void g() {
        f291042l.log(Level.FINE, "Shutdown");
        Iterator<c> it = this.f291043g.values().iterator();
        while (it.hasNext()) {
            it.next().w();
        }
        this.f291043g.clear();
    }

    protected b h(o1.i iVar) {
        f291042l.log(Level.FINE, "Received resolution result: {0}", iVar);
        Map<Object, c> mapM = m(iVar);
        if (mapM.isEmpty()) {
            y2 y2VarU = y2.f291465t.u("NameResolver returned no usable address. " + iVar);
            c(y2VarU);
            return new b(y2VarU, null);
        }
        for (Map.Entry<Object, c> entry : mapM.entrySet()) {
            Object key = entry.getKey();
            p1 p1VarO = entry.getValue().o();
            Object objI = entry.getValue().i();
            if (this.f291043g.containsKey(key)) {
                c cVar = this.f291043g.get(key);
                if (cVar.r() && z()) {
                    cVar.t(p1VarO);
                }
            } else {
                this.f291043g.put(key, entry.getValue());
            }
            c cVar2 = this.f291043g.get(key);
            o1.i iVarO = o(key, iVar, objI);
            this.f291043g.get(key).v(iVarO);
            if (!cVar2.f291057h) {
                cVar2.f291053d.d(iVarO);
            }
        }
        ArrayList arrayList = new ArrayList();
        nb it = l6.w(this.f291043g.keySet()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (!mapM.containsKey(next)) {
                c cVar3 = this.f291043g.get(next);
                cVar3.h();
                arrayList.add(cVar3);
            }
        }
        return new b(y2.f291450e, arrayList);
    }

    protected Map<Object, c> m(o1.i iVar) {
        HashMap map = new HashMap();
        Iterator<d0> it = iVar.a().iterator();
        while (it.hasNext()) {
            d dVar = new d(it.next());
            c cVar = this.f291043g.get(dVar);
            if (cVar != null) {
                map.put(dVar, cVar);
            } else {
                map.put(dVar, n(dVar, null, v(), iVar));
            }
        }
        return map;
    }

    protected c n(Object obj, Object obj2, o1.k kVar, o1.i iVar) {
        return new c(this, obj, this.f291046j, obj2, kVar);
    }

    protected o1.i o(Object obj, o1.i iVar, Object obj2) {
        d dVar;
        if (obj instanceof d0) {
            dVar = new d((d0) obj);
        } else {
            j0.e(obj instanceof d, "key is wrong type");
            dVar = (d) obj;
        }
        for (d0 d0Var : iVar.a()) {
            if (dVar.equals(new d(d0Var))) {
                j0.F(d0Var, obj + " no longer present in load balancer children");
                return iVar.e().b(Collections.singletonList(d0Var)).c(io.grpc.a.e().d(o1.f290194e, Boolean.TRUE).a()).d(obj2).a();
            }
        }
        d0Var = null;
        j0.F(d0Var, obj + " no longer present in load balancer children");
        return iVar.e().b(Collections.singletonList(d0Var)).c(io.grpc.a.e().d(o1.f290194e, Boolean.TRUE).a()).d(obj2).a();
    }

    protected c p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof d0) {
            obj = new d((d0) obj);
        }
        return this.f291043g.get(obj);
    }

    protected c q(d0 d0Var) {
        return p(new d(d0Var));
    }

    @com.google.common.annotations.e
    protected Collection<c> r() {
        return this.f291043g.values();
    }

    protected o1.k s(y2 y2Var) {
        return new o1.e(o1.g.f(y2Var));
    }

    protected o1.f t() {
        return this.f291044h;
    }

    protected n6<Object, c> u() {
        return n6.g(this.f291043g);
    }

    protected o1.k v() {
        return new o1.e(o1.g.g());
    }

    protected List<c> w() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : r()) {
            if (!cVar.r() && cVar.k() == u.READY) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    protected abstract o1.k x(Map<Object, o1.k> map);

    protected void y(c cVar, y2 y2Var) {
        cVar.f291053d.c(y2Var);
    }

    protected boolean z() {
        return true;
    }
}
