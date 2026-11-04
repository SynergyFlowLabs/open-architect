package io.grpc.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
final class e2 extends io.grpc.o1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.grpc.o1.f f289114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.grpc.o1.j f289115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.grpc.u f289116i = io.grpc.u.IDLE;

    class a implements io.grpc.o1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.o1.j f289117a;

        a(io.grpc.o1.j jVar) {
            this.f289117a = jVar;
        }

        @Override // io.grpc.o1.l
        public void a(io.grpc.v vVar) {
            e2.this.j(this.f289117a, vVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f289119a;

        static {
            int[] iArr = new int[io.grpc.u.values().length];
            f289119a = iArr;
            try {
                iArr[io.grpc.u.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f289119a[io.grpc.u.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f289119a[io.grpc.u.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f289119a[io.grpc.u.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        public final Boolean f289120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        final Long f289121b;

        public c(@fj.h Boolean bool) {
            this(bool, null);
        }

        c(@fj.h Boolean bool, @fj.h Long l10) {
            this.f289120a = bool;
            this.f289121b = l10;
        }
    }

    private static final class d extends io.grpc.o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.o1.g f289122a;

        d(io.grpc.o1.g gVar) {
            this.f289122a = (io.grpc.o1.g) com.google.common.base.j0.F(gVar, "result");
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            return this.f289122a;
        }

        public String toString() {
            return com.google.common.base.b0.b(d.class).f("result", this.f289122a).toString();
        }
    }

    private final class e extends io.grpc.o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.grpc.o1.j f289123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f289124b = new AtomicBoolean(false);

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f289123a.g();
            }
        }

        e(io.grpc.o1.j jVar) {
            this.f289123a = (io.grpc.o1.j) com.google.common.base.j0.F(jVar, "subchannel");
        }

        @Override // io.grpc.o1.k
        public io.grpc.o1.g a(io.grpc.o1.h hVar) {
            if (this.f289124b.compareAndSet(false, true)) {
                e2.this.f289114g.m().execute(new a());
            }
            return io.grpc.o1.g.g();
        }
    }

    e2(io.grpc.o1.f fVar) {
        this.f289114g = (io.grpc.o1.f) com.google.common.base.j0.F(fVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(io.grpc.o1.j jVar, io.grpc.v vVar) {
        io.grpc.o1.k eVar;
        io.grpc.o1.k dVar;
        io.grpc.u uVarC = vVar.c();
        if (uVarC == io.grpc.u.SHUTDOWN) {
            return;
        }
        io.grpc.u uVar = io.grpc.u.TRANSIENT_FAILURE;
        if (uVarC == uVar || uVarC == io.grpc.u.IDLE) {
            this.f289114g.p();
        }
        if (this.f289116i == uVar) {
            if (uVarC == io.grpc.u.CONNECTING) {
                return;
            }
            if (uVarC == io.grpc.u.IDLE) {
                f();
                return;
            }
        }
        int i10 = b.f289119a[uVarC.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                dVar = new d(io.grpc.o1.g.g());
            } else if (i10 == 3) {
                eVar = new d(io.grpc.o1.g.h(jVar));
            } else {
                if (i10 != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + uVarC);
                }
                dVar = new d(io.grpc.o1.g.f(vVar.d()));
            }
            k(uVarC, dVar);
        }
        eVar = new e(jVar);
        dVar = eVar;
        k(uVarC, dVar);
    }

    private void k(io.grpc.u uVar, io.grpc.o1.k kVar) {
        this.f289116i = uVar;
        this.f289114g.q(uVar, kVar);
    }

    @Override // io.grpc.o1
    public io.grpc.y2 a(io.grpc.o1.i iVar) {
        c cVar;
        Boolean bool;
        List<io.grpc.d0> listA = iVar.a();
        if (listA.isEmpty()) {
            io.grpc.y2 y2VarU = io.grpc.y2.f291465t.u("NameResolver returned no usable address. addrs=" + iVar.a() + ", attrs=" + iVar.b());
            c(y2VarU);
            return y2VarU;
        }
        if ((iVar.c() instanceof c) && (bool = (cVar = (c) iVar.c()).f289120a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listA);
            Collections.shuffle(arrayList, cVar.f289121b != null ? new Random(cVar.f289121b.longValue()) : new Random());
            listA = arrayList;
        }
        io.grpc.o1.j jVar = this.f289115h;
        if (jVar == null) {
            io.grpc.o1.j jVarF = this.f289114g.f(io.grpc.o1.b.d().f(listA).c());
            jVarF.i(new a(jVarF));
            this.f289115h = jVarF;
            k(io.grpc.u.CONNECTING, new d(io.grpc.o1.g.h(jVarF)));
            jVarF.g();
        } else {
            jVar.j(listA);
        }
        return io.grpc.y2.f291450e;
    }

    @Override // io.grpc.o1
    public void c(io.grpc.y2 y2Var) {
        io.grpc.o1.j jVar = this.f289115h;
        if (jVar != null) {
            jVar.h();
            this.f289115h = null;
        }
        k(io.grpc.u.TRANSIENT_FAILURE, new d(io.grpc.o1.g.f(y2Var)));
    }

    @Override // io.grpc.o1
    public void f() {
        io.grpc.o1.j jVar = this.f289115h;
        if (jVar != null) {
            jVar.g();
        }
    }

    @Override // io.grpc.o1
    public void g() {
        io.grpc.o1.j jVar = this.f289115h;
        if (jVar != null) {
            jVar.h();
        }
    }
}
