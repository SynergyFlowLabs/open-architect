package io.grpc.util;

import com.google.common.base.b0;
import com.google.common.base.j0;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.o1;
import io.grpc.t0;
import io.grpc.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
@t0
public class n extends j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f291138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected o1.k f291139n;

    @com.google.common.annotations.e
    static final class a extends o1.k {
        a() {
        }

        @Override // io.grpc.o1.k
        public o1.g a(o1.h hVar) {
            return o1.g.g();
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    @com.google.common.annotations.e
    static class b extends o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<o1.k> f291140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f291141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f291142c;

        public b(List<o1.k> list, AtomicInteger atomicInteger) {
            j0.e(!list.isEmpty(), "empty list");
            this.f291140a = list;
            this.f291141b = (AtomicInteger) j0.F(atomicInteger, FirebaseAnalytics.d.f120644b0);
            Iterator<o1.k> it = list.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
            this.f291142c = iHashCode;
        }

        private int d() {
            return (this.f291141b.getAndIncrement() & Integer.MAX_VALUE) % this.f291140a.size();
        }

        @Override // io.grpc.o1.k
        public o1.g a(o1.h hVar) {
            return this.f291140a.get(d()).a(hVar);
        }

        @com.google.common.annotations.e
        List<o1.k> c() {
            return this.f291140a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar == this) {
                return true;
            }
            return this.f291142c == bVar.f291142c && this.f291141b == bVar.f291141b && this.f291140a.size() == bVar.f291140a.size() && new HashSet(this.f291140a).containsAll(bVar.f291140a);
        }

        public int hashCode() {
            return this.f291142c;
        }

        public String toString() {
            return b0.b(b.class).f("subchannelPickers", this.f291140a).toString();
        }
    }

    public n(o1.f fVar) {
        super(fVar);
        this.f291138m = new AtomicInteger(new Random().nextInt());
        this.f291139n = new a();
    }

    private void F(u uVar, o1.k kVar) {
        if (uVar == this.f291047k && kVar.equals(this.f291139n)) {
            return;
        }
        t().q(uVar, kVar);
        this.f291047k = uVar;
        this.f291139n = kVar;
    }

    @Override // io.grpc.util.j
    protected void D() {
        List<j.c> listW = w();
        if (!listW.isEmpty()) {
            F(u.READY, E(listW));
            return;
        }
        Iterator<j.c> it = r().iterator();
        while (it.hasNext()) {
            u uVarK = it.next().k();
            u uVar = u.CONNECTING;
            if (uVarK == uVar || uVarK == u.IDLE) {
                F(uVar, new a());
                return;
            }
        }
        F(u.TRANSIENT_FAILURE, E(r()));
    }

    protected o1.k E(Collection<j.c> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<j.c> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j());
        }
        return new b(arrayList, this.f291138m);
    }

    @Override // io.grpc.util.j
    protected o1.k x(Map<Object, o1.k> map) {
        throw new UnsupportedOperationException();
    }
}
