package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class u1 extends io.reactivex.l<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f300300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f300301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f300302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f300303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f300304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final TimeUnit f300305g;

    static final class a extends AtomicLong implements org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f300306e = -2809475196591179431L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super Long> f300307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f300309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f300310d = new AtomicReference<>();

        a(org.reactivestreams.v<? super Long> vVar, long j10, long j11) {
            this.f300307a = vVar;
            this.f300309c = j10;
            this.f300308b = j11;
        }

        public void a(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f300310d, cVar);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.disposables.d.b(this.f300310d);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.disposables.c cVar = this.f300310d.get();
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (cVar != dVar) {
                long j10 = get();
                if (j10 == 0) {
                    this.f300307a.onError(new io.reactivex.exceptions.c("Can't deliver value " + this.f300309c + " due to lack of requests"));
                    io.reactivex.internal.disposables.d.b(this.f300310d);
                    return;
                }
                long j11 = this.f300309c;
                this.f300307a.onNext(Long.valueOf(j11));
                if (j11 == this.f300308b) {
                    if (this.f300310d.get() != dVar) {
                        this.f300307a.onComplete();
                    }
                    io.reactivex.internal.disposables.d.b(this.f300310d);
                } else {
                    this.f300309c = j11 + 1;
                    if (j10 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    public u1(long j10, long j11, long j12, long j13, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f300303e = j12;
        this.f300304f = j13;
        this.f300305g = timeUnit;
        this.f300300b = j0Var;
        this.f300301c = j10;
        this.f300302d = j11;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super Long> vVar) {
        a aVar = new a(vVar, this.f300301c, this.f300302d);
        vVar.l(aVar);
        io.reactivex.j0 j0Var = this.f300300b;
        if (!(j0Var instanceof io.reactivex.internal.schedulers.s)) {
            aVar.a(j0Var.g(aVar, this.f300303e, this.f300304f, this.f300305g));
            return;
        }
        io.reactivex.j0.c cVarC = j0Var.c();
        aVar.a(cVarC);
        cVarC.d(aVar, this.f300303e, this.f300304f, this.f300305g);
    }
}
