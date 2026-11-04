package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class p1 extends io.reactivex.b0<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.j0 f302109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f302111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f302112d;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302113c = 346773832286157679L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super Long> f302114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f302115b;

        a(io.reactivex.i0<? super Long> i0Var) {
            this.f302114a = i0Var;
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
            return get() == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != io.reactivex.internal.disposables.d.DISPOSED) {
                io.reactivex.i0<? super Long> i0Var = this.f302114a;
                long j10 = this.f302115b;
                this.f302115b = 1 + j10;
                i0Var.onNext(Long.valueOf(j10));
            }
        }
    }

    public p1(long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f302110b = j10;
        this.f302111c = j11;
        this.f302112d = timeUnit;
        this.f302109a = j0Var;
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
        a aVar = new a(i0Var);
        i0Var.d(aVar);
        io.reactivex.j0 j0Var = this.f302109a;
        if (!(j0Var instanceof io.reactivex.internal.schedulers.s)) {
            aVar.a(j0Var.g(aVar, this.f302110b, this.f302111c, this.f302112d));
            return;
        }
        io.reactivex.j0.c cVarC = j0Var.c();
        aVar.a(cVarC);
        cVarC.d(aVar, this.f302110b, this.f302111c, this.f302112d);
    }
}
