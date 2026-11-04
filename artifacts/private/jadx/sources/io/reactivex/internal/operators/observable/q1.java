package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class q1 extends io.reactivex.b0<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.j0 f302170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f302172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f302173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f302174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TimeUnit f302175f;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f302176d = 1891866368734007884L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super Long> f302177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f302179c;

        a(io.reactivex.i0<? super Long> i0Var, long j10, long j11) {
            this.f302177a = i0Var;
            this.f302179c = j10;
            this.f302178b = j11;
        }

        public void a(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            if (get() != io.reactivex.internal.disposables.d.DISPOSED) {
                return false;
            }
            boolean z10 = !true;
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k()) {
                return;
            }
            long j10 = this.f302179c;
            this.f302177a.onNext(Long.valueOf(j10));
            if (j10 != this.f302178b) {
                this.f302179c = j10 + 1;
            } else {
                io.reactivex.internal.disposables.d.b(this);
                this.f302177a.onComplete();
            }
        }
    }

    public q1(long j10, long j11, long j12, long j13, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f302173d = j12;
        this.f302174e = j13;
        this.f302175f = timeUnit;
        this.f302170a = j0Var;
        this.f302171b = j10;
        this.f302172c = j11;
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
    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super Long> i0Var) {
        a aVar = new a(i0Var, this.f302171b, this.f302172c);
        i0Var.d(aVar);
        io.reactivex.j0 j0Var = this.f302170a;
        if (!(j0Var instanceof io.reactivex.internal.schedulers.s)) {
            aVar.a(j0Var.g(aVar, this.f302173d, this.f302174e, this.f302175f));
            return;
        }
        io.reactivex.j0.c cVarC = j0Var.c();
        aVar.a(cVarC);
        cVarC.d(aVar, this.f302173d, this.f302174e, this.f302175f);
    }
}
