package com.google.common.util.concurrent;

import com.google.common.collect.a7;
import com.google.common.collect.a9;
import com.google.common.collect.b8;
import com.google.common.collect.h6;
import com.google.common.collect.l6;
import com.google.common.collect.l8;
import com.google.common.collect.n6;
import com.google.common.collect.n8;
import com.google.common.collect.nb;
import com.google.common.collect.q8;
import com.google.common.collect.x7;
import com.google.common.collect.y9;
import com.google.common.collect.z6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public final class k2 implements l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s1 f120134c = new s1(k2.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final w1.a<e> f120135d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final w1.a<e> f120136e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f120137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l6<j2> f120138b;

    class a implements w1.a<e> {
        a() {
        }

        @Override // com.google.common.util.concurrent.w1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(e listener) {
            listener.b();
        }

        public String toString() {
            return "healthy()";
        }
    }

    class b implements w1.a<e> {
        b() {
        }

        @Override // com.google.common.util.concurrent.w1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(e listener) {
            listener.c();
        }

        public String toString() {
            return "stopped()";
        }
    }

    private static final class c extends Throwable {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private static final class d extends Throwable {
        d(j2 service) {
            super(service.toString(), service.e(), false, false);
        }
    }

    public static abstract class e {
        public void a(j2 service) {
        }

        public void b() {
        }

        public void c() {
        }
    }

    private static final class f extends p {
        private f() {
        }

        @Override // com.google.common.util.concurrent.p
        protected void n() throws Exception {
            v();
        }

        @Override // com.google.common.util.concurrent.p
        protected void o() throws Exception {
            w();
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static final class g extends j2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j2 f120139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WeakReference<h> f120140b;

        g(j2 service, WeakReference<h> state) {
            this.f120139a = service;
            this.f120140b = state;
        }

        @Override // com.google.common.util.concurrent.j2.a
        public void a(j2.b from, Throwable failure) throws Exception {
            h hVar = this.f120140b.get();
            if (hVar != null) {
                int i10 = 3 & 1;
                if ((!(this.f120139a instanceof f)) & (from != j2.b.STARTING)) {
                    k2.f120134c.a().log(Level.SEVERE, "Service " + this.f120139a + " has failed in the " + from + " state.", failure);
                }
                hVar.n(this.f120139a, from, j2.b.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.j2.a
        public void b() throws Exception {
            h hVar = this.f120140b.get();
            if (hVar != null) {
                hVar.n(this.f120139a, j2.b.STARTING, j2.b.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.j2.a
        public void c() throws Exception {
            h hVar = this.f120140b.get();
            if (hVar != null) {
                hVar.n(this.f120139a, j2.b.NEW, j2.b.STARTING);
                if (this.f120139a instanceof f) {
                    return;
                }
                k2.f120134c.a().log(Level.FINE, "Starting {0}.", this.f120139a);
            }
        }

        @Override // com.google.common.util.concurrent.j2.a
        public void d(j2.b from) throws Exception {
            h hVar = this.f120140b.get();
            if (hVar != null) {
                hVar.n(this.f120139a, from, j2.b.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.j2.a
        public void e(j2.b from) throws Exception {
            h hVar = this.f120140b.get();
            if (hVar != null) {
                if (!(this.f120139a instanceof f)) {
                    k2.f120134c.a().log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f120139a, from});
                }
                hVar.n(this.f120139a, from, j2.b.TERMINATED);
            }
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final z1 f120141a = new z1();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a8.a("monitor")
        final y9<j2.b, j2> f120142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.a("monitor")
        final q8<j2.b> f120143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a8.a("monitor")
        final IdentityHashMap<j2, com.google.common.base.q0> f120144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @a8.a("monitor")
        boolean f120145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @a8.a("monitor")
        boolean f120146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f120147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final z1.a f120148h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final z1.a f120149i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final w1<e> f120150j;

        class a implements com.google.common.base.t<Map.Entry<j2, Long>, Long> {
            a() {
            }

            @Override // com.google.common.base.t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Long apply(Map.Entry<j2, Long> input) {
                return input.getValue();
            }
        }

        class b implements w1.a<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j2 f120152a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f120153b;

            b(final h this$0, final j2 val$service) {
                this.f120152a = val$service;
                this.f120153b = this$0;
            }

            @Override // com.google.common.util.concurrent.w1.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(e listener) {
                listener.a(this.f120152a);
            }

            public String toString() {
                return "failed({service=" + this.f120152a + "})";
            }
        }

        final class c extends z1.a {
            c() {
                super(h.this.f120141a);
            }

            @Override // com.google.common.util.concurrent.z1.a
            @a8.a("ServiceManagerState.this.monitor")
            public boolean a() {
                int iP3 = h.this.f120143c.P3(j2.b.RUNNING);
                h hVar = h.this;
                if (iP3 != hVar.f120147g && !hVar.f120143c.contains(j2.b.STOPPING) && !h.this.f120143c.contains(j2.b.TERMINATED) && !h.this.f120143c.contains(j2.b.FAILED)) {
                    return false;
                }
                return true;
            }
        }

        final class d extends z1.a {
            d() {
                super(h.this.f120141a);
            }

            @Override // com.google.common.util.concurrent.z1.a
            @a8.a("ServiceManagerState.this.monitor")
            public boolean a() {
                return h.this.f120143c.P3(j2.b.TERMINATED) + h.this.f120143c.P3(j2.b.FAILED) == h.this.f120147g;
            }
        }

        h(h6<j2> services) {
            y9<j2.b, j2> y9VarA = l8.c(j2.b.class).g().a();
            this.f120142b = y9VarA;
            this.f120143c = y9VarA.keys();
            this.f120144d = new IdentityHashMap<>();
            this.f120148h = new c();
            this.f120149i = new d();
            this.f120150j = new w1<>();
            this.f120147g = services.size();
            y9VarA.v(j2.b.NEW, services);
        }

        void a(e listener, Executor executor) {
            this.f120150j.b(listener, executor);
        }

        void b() {
            this.f120141a.q(this.f120148h);
            try {
                f();
                z1 z1Var = this.f120141a;
            } finally {
                this.f120141a.D();
            }
        }

        void c(long timeout, TimeUnit unit) throws TimeoutException {
            this.f120141a.g();
            try {
                if (this.f120141a.N(this.f120148h, timeout, unit)) {
                    f();
                    this.f120141a.D();
                } else {
                    throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + n8.n(this.f120142b, com.google.common.base.l0.n(z6.K(j2.b.NEW, j2.b.STARTING))));
                }
            } catch (Throwable th2) {
                this.f120141a.D();
                throw th2;
            }
        }

        void d() {
            this.f120141a.q(this.f120149i);
            this.f120141a.D();
        }

        void e(long timeout, TimeUnit unit) throws TimeoutException {
            this.f120141a.g();
            try {
                if (this.f120141a.N(this.f120149i, timeout, unit)) {
                    this.f120141a.D();
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + n8.n(this.f120142b, com.google.common.base.l0.q(com.google.common.base.l0.n(EnumSet.of(j2.b.TERMINATED, j2.b.FAILED)))));
            } catch (Throwable th2) {
                this.f120141a.D();
                throw th2;
            }
        }

        @a8.a("monitor")
        void f() {
            q8<j2.b> q8Var = this.f120143c;
            j2.b bVar = j2.b.RUNNING;
            if (q8Var.P3(bVar) != this.f120147g) {
                IllegalStateException illegalStateException = new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + n8.n(this.f120142b, com.google.common.base.l0.q(com.google.common.base.l0.m(bVar))));
                Iterator<j2> it = this.f120142b.x(j2.b.FAILED).iterator();
                while (it.hasNext()) {
                    illegalStateException.addSuppressed(new d(it.next()));
                }
                throw illegalStateException;
            }
        }

        void g() throws Exception {
            com.google.common.base.j0.h0(!this.f120141a.B(), "It is incorrect to execute listeners with the monitor held.");
            this.f120150j.c();
        }

        void h(final j2 service) {
            this.f120150j.d(new b(this, service));
        }

        void i() {
            this.f120150j.d(k2.f120135d);
        }

        void j() {
            this.f120150j.d(k2.f120136e);
        }

        void k() {
            this.f120141a.g();
            try {
                if (!this.f120146f) {
                    this.f120145e = true;
                    this.f120141a.D();
                    return;
                }
                ArrayList arrayListQ = x7.q();
                nb<j2> it = l().values().iterator();
                while (it.hasNext()) {
                    j2 next = it.next();
                    if (next.h() != j2.b.NEW) {
                        arrayListQ.add(next);
                    }
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + arrayListQ);
            } catch (Throwable th2) {
                this.f120141a.D();
                throw th2;
            }
        }

        a7<j2.b, j2> l() {
            a7.a aVarM = a7.M();
            this.f120141a.g();
            try {
                for (Map.Entry<j2.b, j2> entry : this.f120142b.u()) {
                    if (!(entry.getValue() instanceof f)) {
                        aVarM.j(entry);
                    }
                }
                this.f120141a.D();
                return aVarM.a();
            } catch (Throwable th2) {
                this.f120141a.D();
                throw th2;
            }
        }

        n6<j2, Long> m() {
            this.f120141a.g();
            try {
                ArrayList arrayListU = x7.u(this.f120144d.size());
                for (Map.Entry<j2, com.google.common.base.q0> entry : this.f120144d.entrySet()) {
                    j2 key = entry.getKey();
                    com.google.common.base.q0 value = entry.getValue();
                    if (!value.i() && !(key instanceof f)) {
                        arrayListU.add(b8.O(key, Long.valueOf(value.g(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f120141a.D();
                Collections.sort(arrayListU, a9.z().D(new a()));
                return n6.f(arrayListU);
            } catch (Throwable th2) {
                this.f120141a.D();
                throw th2;
            }
        }

        void n(final j2 service, j2.b from, j2.b to) throws Exception {
            com.google.common.base.j0.E(service);
            com.google.common.base.j0.d(from != to);
            this.f120141a.g();
            try {
                this.f120146f = true;
                if (this.f120145e) {
                    com.google.common.base.j0.B0(this.f120142b.remove(from, service), "Service %s not at the expected location in the state map %s", service, from);
                    com.google.common.base.j0.B0(this.f120142b.put(to, service), "Service %s in the state map unexpectedly at %s", service, to);
                    com.google.common.base.q0 q0VarC = this.f120144d.get(service);
                    if (q0VarC == null) {
                        q0VarC = com.google.common.base.q0.c();
                        this.f120144d.put(service, q0VarC);
                    }
                    j2.b bVar = j2.b.RUNNING;
                    if (to.compareTo(bVar) >= 0 && q0VarC.i()) {
                        q0VarC.l();
                        if (!(service instanceof f)) {
                            k2.f120134c.a().log(Level.FINE, "Started {0} in {1}.", new Object[]{service, q0VarC});
                        }
                    }
                    j2.b bVar2 = j2.b.FAILED;
                    if (to == bVar2) {
                        h(service);
                    }
                    if (this.f120143c.P3(bVar) == this.f120147g) {
                        i();
                    } else if (this.f120143c.P3(j2.b.TERMINATED) + this.f120143c.P3(bVar2) == this.f120147g) {
                        j();
                    }
                }
                this.f120141a.D();
                g();
            } catch (Throwable th2) {
                this.f120141a.D();
                g();
                throw th2;
            }
        }

        void o(j2 service) {
            this.f120141a.g();
            try {
                if (this.f120144d.get(service) == null) {
                    this.f120144d.put(service, com.google.common.base.q0.c());
                }
            } finally {
                this.f120141a.D();
            }
        }
    }

    public k2(Iterable<? extends j2> services) {
        l6<j2> l6VarV = l6.v(services);
        if (l6VarV.isEmpty()) {
            a aVar = null;
            f120134c.a().log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new c(aVar));
            l6VarV = l6.G(new f(aVar));
        }
        h hVar = new h(l6VarV);
        this.f120137a = hVar;
        this.f120138b = l6VarV;
        WeakReference weakReference = new WeakReference(hVar);
        nb<j2> it = l6VarV.iterator();
        while (it.hasNext()) {
            j2 next = it.next();
            next.a(new g(next, weakReference), a2.c());
            com.google.common.base.j0.u(next.h() == j2.b.NEW, "Can only manage NEW services, %s", next);
        }
        this.f120137a.k();
    }

    public void e(e listener, Executor executor) {
        this.f120137a.a(listener, executor);
    }

    public void f() {
        this.f120137a.b();
    }

    public void g(long timeout, TimeUnit unit) throws TimeoutException {
        this.f120137a.c(timeout, unit);
    }

    public void h() {
        this.f120137a.d();
    }

    public void i(long timeout, TimeUnit unit) throws TimeoutException {
        this.f120137a.e(timeout, unit);
    }

    public boolean j() {
        nb<j2> it = this.f120138b.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.util.concurrent.l2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a7<j2.b, j2> a() {
        return this.f120137a.l();
    }

    @z7.a
    public k2 l() {
        nb<j2> it = this.f120138b.iterator();
        while (it.hasNext()) {
            com.google.common.base.j0.x0(it.next().h() == j2.b.NEW, "Not all services are NEW, cannot start %s", this);
        }
        nb<j2> it2 = this.f120138b.iterator();
        while (it2.hasNext()) {
            j2 next = it2.next();
            try {
                this.f120137a.o(next);
                next.g();
            } catch (IllegalStateException e10) {
                f120134c.a().log(Level.WARNING, "Unable to start Service " + next, (Throwable) e10);
            }
        }
        return this;
    }

    public n6<j2, Long> m() {
        return this.f120137a.m();
    }

    @z7.a
    public k2 n() {
        nb<j2> it = this.f120138b.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
        return this;
    }

    public String toString() {
        return com.google.common.base.b0.b(k2.class).f("services", com.google.common.collect.b3.d(this.f120138b, com.google.common.base.l0.q(com.google.common.base.l0.o(f.class)))).toString();
    }
}
