package io.grpc.internal;

import com.google.common.collect.l6;
import com.google.common.collect.nb;
import com.google.common.collect.x7;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@io.grpc.e0("https://github.com/grpc/grpc-java/issues/10383")
final class c2 extends io.grpc.o1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Logger f288933p = Logger.getLogger(c2.class.getName());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int f288934q = 250;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f288935r = "GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.grpc.o1.f f288936g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f288938i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @fj.h
    private io.grpc.c3.d f288941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.grpc.u f288942m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.grpc.u f288943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f288944o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<SocketAddress, h> f288937h = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f288939j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f288940k = true;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f288945a;

        static {
            int[] iArr = new int[io.grpc.u.values().length];
            f288945a = iArr;
            try {
                iArr[io.grpc.u.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f288945a[io.grpc.u.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f288945a[io.grpc.u.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f288945a[io.grpc.u.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f288945a[io.grpc.u.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c2.this.f288941l = null;
            if (c2.this.f288938i.c()) {
                c2.this.f();
            }
        }
    }

    @com.google.common.annotations.e
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<io.grpc.d0> f288950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f288951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f288952c;

        public d(List<io.grpc.d0> list) {
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            this.f288950a = list;
        }

        public SocketAddress a() {
            if (e()) {
                return this.f288950a.get(this.f288951b).a().get(this.f288952c);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        public io.grpc.a b() {
            if (e()) {
                return this.f288950a.get(this.f288951b).b();
            }
            throw new IllegalStateException("Index is off the end of the address group list");
        }

        public boolean c() {
            if (!e()) {
                return false;
            }
            io.grpc.d0 d0Var = this.f288950a.get(this.f288951b);
            int i10 = this.f288952c + 1;
            this.f288952c = i10;
            if (i10 < d0Var.a().size()) {
                return true;
            }
            int i11 = this.f288951b + 1;
            this.f288951b = i11;
            this.f288952c = 0;
            return i11 < this.f288950a.size();
        }

        public boolean d() {
            return this.f288951b == 0 && this.f288952c == 0;
        }

        public boolean e() {
            return this.f288951b < this.f288950a.size();
        }

        public void f() {
            this.f288951b = 0;
            this.f288952c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            for (int i10 = 0; i10 < this.f288950a.size(); i10++) {
                int iIndexOf = this.f288950a.get(i10).a().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f288951b = i10;
                    this.f288952c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public int h() {
            List<io.grpc.d0> list = this.f288950a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void i(l6<io.grpc.d0> l6Var) {
            List<io.grpc.d0> list = l6Var;
            if (l6Var == null) {
                list = Collections.EMPTY_LIST;
            }
            this.f288950a = list;
            f();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        public final Boolean f288953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        final Long f288954b;

        public e(@fj.h Boolean bool) {
            this(bool, null);
        }

        e(@fj.h Boolean bool, @fj.h Long l10) {
            this.f288953a = bool;
            this.f288954b = l10;
        }
    }

    private static final class f extends io.grpc.o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.o1.g f288955a;

        f(io.grpc.o1.g gVar) {
            this.f288955a = (io.grpc.o1.g) com.google.common.base.j0.F(gVar, "result");
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            return this.f288955a;
        }

        public String toString() {
            return com.google.common.base.b0.b(f.class).f("result", this.f288955a).toString();
        }
    }

    private final class g extends io.grpc.o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c2 f288956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f288957b = new AtomicBoolean(false);

        g(c2 c2Var) {
            this.f288956a = (c2) com.google.common.base.j0.F(c2Var, "pickFirstLeafLoadBalancer");
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            if (this.f288957b.compareAndSet(false, true)) {
                io.grpc.c3 c3VarM = c2.this.f288936g.m();
                final c2 c2Var = this.f288956a;
                Objects.requireNonNull(c2Var);
                c3VarM.execute(new Runnable() { // from class: io.grpc.internal.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2Var.f();
                    }
                });
            }
            return io.grpc.o1.g.g();
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.o1.j f288959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.grpc.u f288960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f288961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f288962d = false;

        public h(io.grpc.o1.j jVar, io.grpc.u uVar, c cVar) {
            this.f288959a = jVar;
            this.f288960b = uVar;
            this.f288961c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public io.grpc.u f() {
            return this.f288961c.f288947a.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(io.grpc.u uVar) {
            this.f288960b = uVar;
            if (uVar == io.grpc.u.READY || uVar == io.grpc.u.TRANSIENT_FAILURE) {
                this.f288962d = true;
            } else if (uVar == io.grpc.u.IDLE) {
                this.f288962d = false;
            }
        }

        public io.grpc.u g() {
            return this.f288960b;
        }

        public io.grpc.o1.j h() {
            return this.f288959a;
        }

        public boolean i() {
            return this.f288962d;
        }
    }

    c2(io.grpc.o1.f fVar) {
        io.grpc.u uVar = io.grpc.u.IDLE;
        this.f288942m = uVar;
        this.f288943n = uVar;
        this.f288944o = v0.i(f288935r, false);
        this.f288936g = (io.grpc.o1.f) com.google.common.base.j0.F(fVar, "helper");
    }

    private void o() {
        io.grpc.c3.d dVar = this.f288941l;
        if (dVar != null) {
            dVar.a();
            this.f288941l = null;
        }
    }

    private io.grpc.o1.j p(SocketAddress socketAddress) {
        c cVar = new c(this, null);
        final io.grpc.o1.j jVarF = this.f288936g.f(io.grpc.o1.b.d().f(x7.t(new io.grpc.d0(socketAddress))).b(io.grpc.o1.f290192c, cVar).c());
        if (jVarF == null) {
            f288933p.warning("Was not able to create subchannel for " + socketAddress);
            throw new IllegalStateException("Can't create subchannel");
        }
        h hVar = new h(jVarF, io.grpc.u.IDLE, cVar);
        cVar.f288948b = hVar;
        this.f288937h.put(socketAddress, hVar);
        if (jVarF.d().b(io.grpc.o1.f290193d) == null) {
            cVar.f288947a = io.grpc.v.a(io.grpc.u.READY);
        }
        jVarF.i(new io.grpc.o1.l() { // from class: io.grpc.internal.b2
            @Override // io.grpc.o1.l
            public final void a(io.grpc.v vVar) {
                this.f288868a.t(jVarF, vVar);
            }
        });
        return jVarF;
    }

    private SocketAddress q(io.grpc.o1.j jVar) {
        return jVar.b().a().get(0);
    }

    private boolean s() {
        d dVar = this.f288938i;
        if (dVar == null || dVar.e() || this.f288937h.size() < this.f288938i.h()) {
            return false;
        }
        Iterator<h> it = this.f288937h.values().iterator();
        while (it.hasNext()) {
            if (!it.next().i()) {
                return false;
            }
        }
        return true;
    }

    private void u() {
        if (this.f288944o) {
            io.grpc.c3.d dVar = this.f288941l;
            if (dVar == null || !dVar.b()) {
                this.f288941l = this.f288936g.m().c(new b(), 250L, TimeUnit.MILLISECONDS, this.f288936g.l());
            }
        }
    }

    private void v(h hVar) {
        o();
        for (h hVar2 : this.f288937h.values()) {
            if (!hVar2.h().equals(hVar.f288959a)) {
                hVar2.h().h();
            }
        }
        this.f288937h.clear();
        hVar.j(io.grpc.u.READY);
        this.f288937h.put(q(hVar.f288959a), hVar);
    }

    private void w(io.grpc.u uVar, io.grpc.o1.k kVar) {
        if (uVar == this.f288943n && (uVar == io.grpc.u.IDLE || uVar == io.grpc.u.CONNECTING)) {
            return;
        }
        this.f288943n = uVar;
        this.f288936g.q(uVar, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(h hVar) {
        io.grpc.u uVar = hVar.f288960b;
        io.grpc.u uVar2 = io.grpc.u.READY;
        if (uVar != uVar2) {
            return;
        }
        if (hVar.f() == uVar2) {
            w(uVar2, new io.grpc.o1.e(io.grpc.o1.g.h(hVar.f288959a)));
            return;
        }
        io.grpc.u uVarF = hVar.f();
        io.grpc.u uVar3 = io.grpc.u.TRANSIENT_FAILURE;
        if (uVarF == uVar3) {
            w(uVar3, new f(io.grpc.o1.g.f(hVar.f288961c.f288947a.d())));
        } else if (this.f288943n != uVar3) {
            w(hVar.f(), new f(io.grpc.o1.g.g()));
        }
    }

    @Override // io.grpc.o1
    public io.grpc.y2 a(io.grpc.o1.i iVar) {
        io.grpc.u uVar;
        e eVar;
        Boolean bool;
        if (this.f288942m == io.grpc.u.SHUTDOWN) {
            return io.grpc.y2.f291460o.u("Already shut down");
        }
        List<io.grpc.d0> listA = iVar.a();
        if (listA.isEmpty()) {
            io.grpc.y2 y2VarU = io.grpc.y2.f291465t.u("NameResolver returned no usable address. addrs=" + iVar.a() + ", attrs=" + iVar.b());
            c(y2VarU);
            return y2VarU;
        }
        Iterator<io.grpc.d0> it = listA.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                io.grpc.y2 y2VarU2 = io.grpc.y2.f291465t.u("NameResolver returned address list with null endpoint. addrs=" + iVar.a() + ", attrs=" + iVar.b());
                c(y2VarU2);
                return y2VarU2;
            }
        }
        this.f288940k = true;
        if ((iVar.c() instanceof e) && (bool = (eVar = (e) iVar.c()).f288953a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listA);
            Collections.shuffle(arrayList, eVar.f288954b != null ? new Random(eVar.f288954b.longValue()) : new Random());
            listA = arrayList;
        }
        l6<io.grpc.d0> l6VarE = l6.s().c(listA).e();
        d dVar = this.f288938i;
        if (dVar == null) {
            this.f288938i = new d(l6VarE);
        } else if (this.f288942m == io.grpc.u.READY) {
            SocketAddress socketAddressA = dVar.a();
            this.f288938i.i(l6VarE);
            if (this.f288938i.g(socketAddressA)) {
                return io.grpc.y2.f291450e;
            }
            this.f288938i.f();
        } else {
            dVar.i(l6VarE);
        }
        HashSet<SocketAddress> hashSet = new HashSet(this.f288937h.keySet());
        HashSet hashSet2 = new HashSet();
        nb<io.grpc.d0> it2 = l6VarE.iterator();
        while (it2.hasNext()) {
            hashSet2.addAll(it2.next().a());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                this.f288937h.remove(socketAddress).h().h();
            }
        }
        if (hashSet.size() == 0 || (uVar = this.f288942m) == io.grpc.u.CONNECTING || uVar == io.grpc.u.READY) {
            io.grpc.u uVar2 = io.grpc.u.CONNECTING;
            this.f288942m = uVar2;
            w(uVar2, new f(io.grpc.o1.g.g()));
            o();
            f();
        } else {
            io.grpc.u uVar3 = io.grpc.u.IDLE;
            if (uVar == uVar3) {
                w(uVar3, new g(this));
            } else if (uVar == io.grpc.u.TRANSIENT_FAILURE) {
                o();
                f();
            }
        }
        return io.grpc.y2.f291450e;
    }

    @Override // io.grpc.o1
    public void c(io.grpc.y2 y2Var) {
        Iterator<h> it = this.f288937h.values().iterator();
        while (it.hasNext()) {
            it.next().h().h();
        }
        this.f288937h.clear();
        w(io.grpc.u.TRANSIENT_FAILURE, new f(io.grpc.o1.g.f(y2Var)));
    }

    @Override // io.grpc.o1
    public void f() {
        d dVar = this.f288938i;
        if (dVar != null && dVar.e() && this.f288942m != io.grpc.u.SHUTDOWN) {
            SocketAddress socketAddressA = this.f288938i.a();
            io.grpc.o1.j jVarH = this.f288937h.containsKey(socketAddressA) ? this.f288937h.get(socketAddressA).h() : p(socketAddressA);
            int i10 = a.f288945a[this.f288937h.get(socketAddressA).g().ordinal()];
            if (i10 == 1) {
                jVarH.g();
                this.f288937h.get(socketAddressA).j(io.grpc.u.CONNECTING);
                u();
            } else {
                if (i10 == 2) {
                    if (this.f288944o) {
                        u();
                        return;
                    } else {
                        jVarH.g();
                        return;
                    }
                }
                if (i10 == 3) {
                    f288933p.warning("Requesting a connection even though we have a READY subchannel");
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    this.f288938i.c();
                    f();
                }
            }
        }
    }

    @Override // io.grpc.o1
    public void g() {
        f288933p.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(this.f288937h.size()));
        io.grpc.u uVar = io.grpc.u.SHUTDOWN;
        this.f288942m = uVar;
        this.f288943n = uVar;
        o();
        Iterator<h> it = this.f288937h.values().iterator();
        while (it.hasNext()) {
            it.next().h().h();
        }
        this.f288937h.clear();
    }

    @com.google.common.annotations.e
    io.grpc.u r() {
        return this.f288943n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(io.grpc.o1.j jVar, io.grpc.v vVar) {
        io.grpc.u uVarC = vVar.c();
        h hVar = this.f288937h.get(q(jVar));
        if (hVar == null || hVar.h() != jVar || uVarC == io.grpc.u.SHUTDOWN) {
            return;
        }
        io.grpc.u uVar = io.grpc.u.IDLE;
        if (uVarC == uVar) {
            this.f288936g.p();
        }
        hVar.j(uVarC);
        io.grpc.u uVar2 = this.f288942m;
        io.grpc.u uVar3 = io.grpc.u.TRANSIENT_FAILURE;
        if (uVar2 == uVar3 || this.f288943n == uVar3) {
            if (uVarC == io.grpc.u.CONNECTING) {
                return;
            }
            if (uVarC == uVar) {
                f();
                return;
            }
        }
        int i10 = a.f288945a[uVarC.ordinal()];
        if (i10 == 1) {
            this.f288938i.f();
            this.f288942m = uVar;
            w(uVar, new g(this));
            return;
        }
        if (i10 == 2) {
            io.grpc.u uVar4 = io.grpc.u.CONNECTING;
            this.f288942m = uVar4;
            w(uVar4, new f(io.grpc.o1.g.g()));
            return;
        }
        if (i10 == 3) {
            v(hVar);
            this.f288938i.g(q(jVar));
            this.f288942m = io.grpc.u.READY;
            x(hVar);
            return;
        }
        if (i10 != 4) {
            throw new IllegalArgumentException("Unsupported state:" + uVarC);
        }
        if (this.f288938i.e() && this.f288937h.get(this.f288938i.a()).h() == jVar && this.f288938i.c()) {
            o();
            f();
        }
        if (s()) {
            this.f288942m = uVar3;
            w(uVar3, new f(io.grpc.o1.g.f(vVar.d())));
            int i11 = this.f288939j + 1;
            this.f288939j = i11;
            if (i11 >= this.f288938i.h() || this.f288940k) {
                this.f288940k = false;
                this.f288939j = 0;
                this.f288936g.p();
            }
        }
    }

    private final class c implements io.grpc.o1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.grpc.v f288947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f288948b;

        private c() {
            this.f288947a = io.grpc.v.a(io.grpc.u.IDLE);
        }

        @Override // io.grpc.o1.l
        public void a(io.grpc.v vVar) {
            c2.f288933p.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{vVar, this.f288948b.f288959a});
            this.f288947a = vVar;
            if (c2.this.f288938i.e() && ((h) c2.this.f288937h.get(c2.this.f288938i.a())).f288961c == this) {
                c2.this.x(this.f288948b);
            }
        }

        /* synthetic */ c(c2 c2Var, a aVar) {
            this();
        }
    }
}
