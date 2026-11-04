package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class t1 extends io.reactivex.l<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f300226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f300227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f300228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f300229e;

    static final class a extends AtomicLong implements org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300230d = -2809475196591179431L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super Long> f300231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f300232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f300233c = new AtomicReference<>();

        a(org.reactivestreams.v<? super Long> vVar) {
            this.f300231a = vVar;
        }

        public void a(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f300233c, cVar);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.disposables.d.b(this.f300233c);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f300233c.get() != io.reactivex.internal.disposables.d.DISPOSED) {
                if (get() != 0) {
                    org.reactivestreams.v<? super Long> vVar = this.f300231a;
                    long j10 = this.f300232b;
                    this.f300232b = j10 + 1;
                    vVar.onNext(Long.valueOf(j10));
                    io.reactivex.internal.util.d.e(this, 1L);
                    return;
                }
                this.f300231a.onError(new io.reactivex.exceptions.c("Can't deliver value " + this.f300232b + " due to lack of requests"));
                io.reactivex.internal.disposables.d.b(this.f300233c);
            }
        }
    }

    public t1(long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f300227c = j10;
        this.f300228d = j11;
        this.f300229e = timeUnit;
        this.f300226b = j0Var;
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
        a aVar = new a(vVar);
        vVar.l(aVar);
        io.reactivex.j0 j0Var = this.f300226b;
        if (!(j0Var instanceof io.reactivex.internal.schedulers.s)) {
            aVar.a(j0Var.g(aVar, this.f300227c, this.f300228d, this.f300229e));
            return;
        }
        io.reactivex.j0.c cVarC = j0Var.c();
        aVar.a(cVarC);
        cVarC.d(aVar, this.f300227c, this.f300228d, this.f300229e);
    }
}
