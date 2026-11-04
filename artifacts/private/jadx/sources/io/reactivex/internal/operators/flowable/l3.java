package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class l3<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<R, ? super T, R> f299687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<R> f299688d;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f299689m = -1776795561228106469L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f299690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<R, ? super T, R> f299691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ej.n<R> f299692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f299693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f299694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f299695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f299696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f299697h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Throwable f299698i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        org.reactivestreams.w f299699j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        R f299700k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f299701l;

        a(org.reactivestreams.v<? super R> vVar, dj.c<R, ? super T, R> cVar, R r10, int i10) {
            this.f299690a = vVar;
            this.f299691b = cVar;
            this.f299700k = r10;
            this.f299694e = i10;
            this.f299695f = i10 - (i10 >> 2);
            io.reactivex.internal.queue.b bVar = new io.reactivex.internal.queue.b(i10);
            this.f299692c = bVar;
            bVar.offer(r10);
            this.f299693d = new AtomicLong();
        }

        void a() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super R> vVar = this.f299690a;
            ej.n<R> nVar = this.f299692c;
            int i10 = this.f299695f;
            int i11 = this.f299701l;
            int iAddAndGet = 1;
            do {
                long j10 = this.f299693d.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f299696g) {
                        nVar.clear();
                        return;
                    }
                    boolean z10 = this.f299697h;
                    if (z10 && (th2 = this.f299698i) != null) {
                        nVar.clear();
                        vVar.onError(th2);
                        return;
                    }
                    R rPoll = nVar.poll();
                    boolean z11 = rPoll == null;
                    if (z10 && z11) {
                        vVar.onComplete();
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    vVar.onNext(rPoll);
                    j11++;
                    i11++;
                    if (i11 == i10) {
                        this.f299699j.request(i10);
                        i11 = 0;
                    }
                }
                if (j11 == j10 && this.f299697h) {
                    Throwable th3 = this.f299698i;
                    if (th3 != null) {
                        nVar.clear();
                        vVar.onError(th3);
                        return;
                    } else if (nVar.isEmpty()) {
                        vVar.onComplete();
                        return;
                    }
                }
                if (j11 != 0) {
                    io.reactivex.internal.util.d.e(this.f299693d, j11);
                }
                this.f299701l = i11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299696g = true;
            this.f299699j.cancel();
            if (getAndIncrement() == 0) {
                this.f299692c.clear();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299699j, wVar)) {
                this.f299699j = wVar;
                this.f299690a.l(this);
                wVar.request(this.f299694e - 1);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299697h) {
                return;
            }
            this.f299697h = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299697h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299698i = th2;
            this.f299697h = true;
            a();
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
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299697h) {
                return;
            }
            try {
                R r10 = (R) io.reactivex.internal.functions.b.g(this.f299691b.apply(this.f299700k, t10), "The accumulator returned a null value");
                this.f299700k = r10;
                this.f299692c.offer(r10);
                a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299699j.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299693d, j10);
                a();
            }
        }
    }

    public l3(io.reactivex.l<T> lVar, Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        super(lVar);
        this.f299687c = cVar;
        this.f299688d = callable;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        try {
            this.f299043b.j6(new a(vVar, this.f299687c, io.reactivex.internal.functions.b.g(this.f299688d.call(), "The seed supplied is null"), io.reactivex.l.Y()));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
