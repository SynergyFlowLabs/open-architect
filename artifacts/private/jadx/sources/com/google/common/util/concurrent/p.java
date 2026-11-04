package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class p implements j2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w1.a<j2.a> f120236h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final w1.a<j2.a> f120237i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final w1.a<j2.a> f120238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final w1.a<j2.a> f120239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final w1.a<j2.a> f120240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final w1.a<j2.a> f120241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w1.a<j2.a> f120242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final w1.a<j2.a> f120243o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1 f120244a = new z1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z1.a f120245b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z1.a f120246c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z1.a f120247d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z1.a f120248e = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w1<j2.a> f120249f = new w1<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile k f120250g = new k(j2.b.NEW);

    class a implements w1.a<j2.a> {
        a() {
        }

        @Override // com.google.common.util.concurrent.w1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j2.a listener) {
            listener.c();
        }

        public String toString() {
            return "starting()";
        }
    }

    class b implements w1.a<j2.a> {
        b() {
        }

        @Override // com.google.common.util.concurrent.w1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j2.a listener) {
            listener.b();
        }

        public String toString() {
            return "running()";
        }
    }

    class c implements w1.a<j2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j2.b f120251a;

        c(final j2.b val$from) {
            this.f120251a = val$from;
        }

        @Override // com.google.common.util.concurrent.w1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j2.a listener) {
            listener.e(this.f120251a);
        }

        public String toString() {
            return "terminated({from = " + this.f120251a + "})";
        }
    }

    class d implements w1.a<j2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j2.b f120252a;

        d(final j2.b val$from) {
            this.f120252a = val$from;
        }

        @Override // com.google.common.util.concurrent.w1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j2.a listener) {
            listener.d(this.f120252a);
        }

        public String toString() {
            return "stopping({from = " + this.f120252a + "})";
        }
    }

    class e implements w1.a<j2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j2.b f120253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f120254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f120255c;

        e(final p this$0, final j2.b val$from, final Throwable val$cause) {
            this.f120253a = val$from;
            this.f120254b = val$cause;
            this.f120255c = this$0;
        }

        @Override // com.google.common.util.concurrent.w1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j2.a listener) {
            listener.a(this.f120253a, this.f120254b);
        }

        public String toString() {
            return "failed({from = " + this.f120253a + ", cause = " + this.f120254b + "})";
        }
    }

    static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f120256a;

        static {
            int[] iArr = new int[j2.b.values().length];
            f120256a = iArr;
            try {
                iArr[j2.b.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120256a[j2.b.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120256a[j2.b.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120256a[j2.b.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f120256a[j2.b.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f120256a[j2.b.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private final class g extends z1.a {
        g() {
            super(p.this.f120244a);
        }

        @Override // com.google.common.util.concurrent.z1.a
        public boolean a() {
            return p.this.h().compareTo(j2.b.RUNNING) >= 0;
        }
    }

    private final class h extends z1.a {
        h() {
            super(p.this.f120244a);
        }

        @Override // com.google.common.util.concurrent.z1.a
        public boolean a() {
            return p.this.h() == j2.b.NEW;
        }
    }

    private final class i extends z1.a {
        i() {
            super(p.this.f120244a);
        }

        @Override // com.google.common.util.concurrent.z1.a
        public boolean a() {
            return p.this.h().compareTo(j2.b.RUNNING) <= 0;
        }
    }

    private final class j extends z1.a {
        j() {
            super(p.this.f120244a);
        }

        @Override // com.google.common.util.concurrent.z1.a
        public boolean a() {
            return p.this.h().compareTo(j2.b.TERMINATED) >= 0;
        }
    }

    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j2.b f120261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f120262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        final Throwable f120263c;

        k(j2.b internalState) {
            this(internalState, false, null);
        }

        j2.b a() {
            return (this.f120262b && this.f120261a == j2.b.STARTING) ? j2.b.STOPPING : this.f120261a;
        }

        Throwable b() {
            j2.b bVar = this.f120261a;
            com.google.common.base.j0.x0(bVar == j2.b.FAILED, "failureCause() is only valid if the service has failed, service is %s", bVar);
            Throwable th2 = this.f120263c;
            Objects.requireNonNull(th2);
            return th2;
        }

        k(j2.b internalState, boolean shutdownWhenStartupFinishes, @fj.a Throwable failure) {
            com.google.common.base.j0.u(!shutdownWhenStartupFinishes || internalState == j2.b.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", internalState);
            com.google.common.base.j0.y((failure != null) == (internalState == j2.b.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", internalState, failure);
            this.f120261a = internalState;
            this.f120262b = shutdownWhenStartupFinishes;
            this.f120263c = failure;
        }
    }

    static {
        j2.b bVar = j2.b.STARTING;
        f120238j = x(bVar);
        j2.b bVar2 = j2.b.RUNNING;
        f120239k = x(bVar2);
        f120240l = y(j2.b.NEW);
        f120241m = y(bVar);
        f120242n = y(bVar2);
        f120243o = y(j2.b.STOPPING);
    }

    protected p() {
    }

    @a8.a("monitor")
    private void k(j2.b expected) {
        j2.b bVarH = h();
        if (bVarH != expected) {
            if (bVarH == j2.b.FAILED) {
                throw new IllegalStateException("Expected the service " + this + " to be " + expected + ", but the service has FAILED", e());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + expected + ", but was " + bVarH);
        }
    }

    private void l() throws Exception {
        if (this.f120244a.B()) {
            return;
        }
        this.f120249f.c();
    }

    private void p(final j2.b from, final Throwable cause) {
        this.f120249f.d(new e(this, from, cause));
    }

    private void q() {
        this.f120249f.d(f120237i);
    }

    private void r() {
        this.f120249f.d(f120236h);
    }

    private void s(final j2.b from) {
        if (from == j2.b.STARTING) {
            this.f120249f.d(f120238j);
        } else {
            if (from != j2.b.RUNNING) {
                throw new AssertionError();
            }
            this.f120249f.d(f120239k);
        }
    }

    private void t(final j2.b from) {
        switch (f.f120256a[from.ordinal()]) {
            case 1:
                this.f120249f.d(f120240l);
                return;
            case 2:
                this.f120249f.d(f120241m);
                return;
            case 3:
                this.f120249f.d(f120242n);
                return;
            case 4:
                this.f120249f.d(f120243o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    private static w1.a<j2.a> x(final j2.b from) {
        return new d(from);
    }

    private static w1.a<j2.a> y(final j2.b from) {
        return new c(from);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void a(j2.a listener, Executor executor) {
        this.f120249f.b(listener, executor);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void b(long timeout, TimeUnit unit) throws TimeoutException {
        if (this.f120244a.r(this.f120247d, timeout, unit)) {
            try {
                k(j2.b.RUNNING);
                z1 z1Var = this.f120244a;
                return;
            } finally {
                this.f120244a.D();
            }
        }
        throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
    }

    @Override // com.google.common.util.concurrent.j2
    public final void c(long timeout, TimeUnit unit) throws TimeoutException {
        if (this.f120244a.r(this.f120248e, timeout, unit)) {
            try {
                k(j2.b.TERMINATED);
                z1 z1Var = this.f120244a;
                return;
            } finally {
                this.f120244a.D();
            }
        }
        throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + h());
    }

    @Override // com.google.common.util.concurrent.j2
    public final void d() {
        this.f120244a.q(this.f120247d);
        try {
            k(j2.b.RUNNING);
            this.f120244a.D();
        } catch (Throwable th2) {
            this.f120244a.D();
            throw th2;
        }
    }

    @Override // com.google.common.util.concurrent.j2
    public final Throwable e() {
        return this.f120250g.b();
    }

    @Override // com.google.common.util.concurrent.j2
    public final void f() {
        this.f120244a.q(this.f120248e);
        try {
            k(j2.b.TERMINATED);
        } finally {
            this.f120244a.D();
        }
    }

    @Override // com.google.common.util.concurrent.j2
    @z7.a
    public final j2 g() throws Exception {
        if (!this.f120244a.i(this.f120245b)) {
            throw new IllegalStateException("Service " + this + " has already been started");
        }
        try {
            this.f120250g = new k(j2.b.STARTING);
            r();
            n();
        } catch (Throwable th2) {
            try {
                f2.b(th2);
                u(th2);
            } catch (Throwable th3) {
                this.f120244a.D();
                l();
                throw th3;
            }
        }
        this.f120244a.D();
        l();
        return this;
    }

    @Override // com.google.common.util.concurrent.j2
    public final j2.b h() {
        return this.f120250g.a();
    }

    @Override // com.google.common.util.concurrent.j2
    @z7.a
    public final j2 i() throws Exception {
        if (!this.f120244a.i(this.f120246c)) {
            return this;
        }
        try {
            j2.b bVarH = h();
            switch (f.f120256a[bVarH.ordinal()]) {
                case 1:
                    this.f120250g = new k(j2.b.TERMINATED);
                    t(j2.b.NEW);
                    break;
                case 2:
                    j2.b bVar = j2.b.STARTING;
                    this.f120250g = new k(bVar, true, null);
                    s(bVar);
                    m();
                    break;
                case 3:
                    this.f120250g = new k(j2.b.STOPPING);
                    s(j2.b.RUNNING);
                    o();
                    break;
                case 4:
                case 5:
                case 6:
                    throw new AssertionError("isStoppable is incorrectly implemented, saw: " + bVarH);
            }
        } catch (Throwable th2) {
            try {
                f2.b(th2);
                u(th2);
            } finally {
                this.f120244a.D();
                l();
            }
        }
        this.f120244a.D();
        return this;
    }

    @Override // com.google.common.util.concurrent.j2
    public final boolean isRunning() {
        return h() == j2.b.RUNNING;
    }

    @z7.g
    protected void m() {
    }

    @z7.g
    protected abstract void n();

    @z7.g
    protected abstract void o();

    public String toString() {
        return getClass().getSimpleName() + " [" + h() + "]";
    }

    protected final void u(Throwable cause) throws Exception {
        com.google.common.base.j0.E(cause);
        this.f120244a.g();
        try {
            j2.b bVarH = h();
            int i10 = f.f120256a[bVarH.ordinal()];
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    this.f120250g = new k(j2.b.FAILED, false, cause);
                    p(bVarH, cause);
                } else if (i10 != 5) {
                }
                this.f120244a.D();
                l();
                return;
            }
            throw new IllegalStateException("Failed while in state:" + bVarH, cause);
        } catch (Throwable th2) {
            this.f120244a.D();
            l();
            throw th2;
        }
    }

    protected final void v() throws Exception {
        this.f120244a.g();
        try {
            if (this.f120250g.f120261a != j2.b.STARTING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.f120250g.f120261a);
                u(illegalStateException);
                throw illegalStateException;
            }
            if (this.f120250g.f120262b) {
                this.f120250g = new k(j2.b.STOPPING);
                o();
            } else {
                this.f120250g = new k(j2.b.RUNNING);
                q();
            }
            this.f120244a.D();
            l();
        } catch (Throwable th2) {
            this.f120244a.D();
            l();
            throw th2;
        }
    }

    protected final void w() throws Exception {
        this.f120244a.g();
        try {
            j2.b bVarH = h();
            switch (f.f120256a[bVarH.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + bVarH);
                case 2:
                case 3:
                case 4:
                    this.f120250g = new k(j2.b.TERMINATED);
                    t(bVarH);
                    break;
            }
            this.f120244a.D();
            l();
        } catch (Throwable th2) {
            this.f120244a.D();
            l();
            throw th2;
        }
    }
}
