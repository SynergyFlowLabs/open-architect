package com.google.common.util.concurrent;

import com.google.common.collect.l6;
import com.google.common.collect.s4;
import com.google.common.collect.x7;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@z7.f("Use ClosingFuture.from(Futures.immediate*Future)")
@o0
public final class h0<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s1 f120010d = new s1(h0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<w> f120011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f120012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u0<V> f120013c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f120014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f120015b;

        a(final h0 this$0, final y val$consumer) {
            this.f120014a = val$consumer;
            this.f120015b = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            h0.x(this.f120014a, this.f120015b);
        }
    }

    class b implements Callable<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f120016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f120017b;

        b(final n val$callable, final m val$closeables) {
            this.f120016a = val$callable;
            this.f120017b = val$closeables;
        }

        @Override // java.util.concurrent.Callable
        @d2
        public V call() throws Exception {
            return (V) this.f120016a.a(this.f120017b.f120032a);
        }

        public String toString() {
            return this.f120016a.toString();
        }
    }

    class c implements com.google.common.util.concurrent.v<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f120018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f120019b;

        c(final k val$callable, final m val$closeables) {
            this.f120018a = val$callable;
            this.f120019b = val$closeables;
        }

        @Override // com.google.common.util.concurrent.v
        public t1<V> call() throws Exception {
            m mVar = new m(null);
            try {
                h0<V> h0VarA = this.f120018a.a(mVar.f120032a);
                h0VarA.i(this.f120019b);
                return ((h0) h0VarA).f120013c;
            } finally {
                this.f120019b.b(mVar, a2.c());
            }
        }

        public String toString() {
            return this.f120018a.toString();
        }
    }

    class d implements e1<AutoCloseable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f120021b;

        d(final Executor val$closingExecutor) {
            this.f120021b = val$closingExecutor;
        }

        @Override // com.google.common.util.concurrent.e1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(@fj.a AutoCloseable result) {
            h0.this.f120012b.f120032a.a(result, this.f120021b);
        }

        @Override // com.google.common.util.concurrent.e1
        public void onFailure(Throwable t10) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    class e<U> implements com.google.common.util.concurrent.w<V, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f120022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f120023b;

        e(final h0 this$0, final o val$function) {
            this.f120022a = val$function;
            this.f120023b = this$0;
        }

        @Override // com.google.common.util.concurrent.w
        public t1<U> apply(V input) throws Exception {
            return this.f120023b.f120012b.d(this.f120022a, input);
        }

        public String toString() {
            return this.f120022a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    class f<U> implements com.google.common.util.concurrent.w<V, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f120024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f120025b;

        f(final h0 this$0, final l val$function) {
            this.f120024a = val$function;
            this.f120025b = this$0;
        }

        @Override // com.google.common.util.concurrent.w
        public t1<U> apply(V input) throws Exception {
            return this.f120025b.f120012b.c(this.f120024a, input);
        }

        public String toString() {
            return this.f120024a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    class g<U> implements l<V, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.w f120026a;

        g(final com.google.common.util.concurrent.w val$function) {
            this.f120026a = val$function;
        }

        @Override // com.google.common.util.concurrent.h0.l
        public h0<U> a(u closer, V input) throws Exception {
            return h0.w(this.f120026a.apply(input));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    class h<W, X> implements com.google.common.util.concurrent.w<X, W> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f120027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f120028b;

        h(final h0 this$0, final o val$fallback) {
            this.f120027a = val$fallback;
            this.f120028b = this$0;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/t1<TW;>; */
        @Override // com.google.common.util.concurrent.w
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t1 apply(Throwable exception) throws Exception {
            return this.f120028b.f120012b.d(this.f120027a, exception);
        }

        public String toString() {
            return this.f120027a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    class i<W, X> implements com.google.common.util.concurrent.w<X, W> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f120029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f120030b;

        i(final h0 this$0, final l val$fallback) {
            this.f120029a = val$fallback;
            this.f120030b = this$0;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/t1<TW;>; */
        @Override // com.google.common.util.concurrent.w
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t1 apply(Throwable exception) throws Exception {
            return this.f120030b.f120012b.c(this.f120029a, exception);
        }

        public String toString() {
            return this.f120029a.toString();
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0 h0Var = h0.this;
            w wVar = w.WILL_CLOSE;
            w wVar2 = w.CLOSING;
            h0Var.o(wVar, wVar2);
            h0.this.p();
            h0.this.o(wVar2, w.CLOSED);
        }
    }

    public interface k<V> {
        h0<V> a(u closer) throws Exception;
    }

    public interface l<T, U> {
        h0<U> a(u closer, @d2 T input) throws Exception;
    }

    public interface n<V> {
        @d2
        V a(u closer) throws Exception;
    }

    public interface o<T, U> {
        @d2
        U a(u closer, @d2 T input) throws Exception;
    }

    @z7.f("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f120035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f120036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final l6<h0<?>> f120037c;

        class a implements Callable<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f120038a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f120039b;

            a(final p this$0, final d val$combiningCallable) {
                this.f120038a = val$combiningCallable;
                this.f120039b = this$0;
            }

            @Override // java.util.concurrent.Callable
            @d2
            public V call() throws Exception {
                return (V) new v(this.f120039b.f120037c, null).c(this.f120038a, this.f120039b.f120035a);
            }

            public String toString() {
                return this.f120038a.toString();
            }
        }

        class b implements com.google.common.util.concurrent.v<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f120040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f120041b;

            b(final p this$0, final c val$combiningCallable) {
                this.f120040a = val$combiningCallable;
                this.f120041b = this$0;
            }

            @Override // com.google.common.util.concurrent.v
            public t1<V> call() throws Exception {
                return new v(this.f120041b.f120037c, null).d(this.f120040a, this.f120041b.f120035a);
            }

            public String toString() {
                return this.f120040a.toString();
            }
        }

        public interface c<V> {
            h0<V> a(u closer, v peeker) throws Exception;
        }

        public interface d<V> {
            @d2
            V a(u closer, v peeker) throws Exception;
        }

        /* synthetic */ p(boolean z10, Iterable iterable, b bVar) {
            this(z10, iterable);
        }

        private h1.c<Object> e() {
            return this.f120036b ? h1.D(f()) : h1.B(f());
        }

        private l6<u0<?>> f() {
            return s4.D(this.f120037c).Y(new com.google.common.base.t() { // from class: com.google.common.util.concurrent.i0
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return ((h0) obj).f120013c;
                }
            }).R();
        }

        public <V> h0<V> c(final d<V> combiningCallable, Executor executor) {
            h0<V> h0Var = new h0<>(e().a(new a(this, combiningCallable), executor), (b) null);
            ((h0) h0Var).f120012b.b(this.f120035a, a2.c());
            return h0Var;
        }

        public <V> h0<V> d(final c<V> combiningCallable, Executor executor) {
            h0<V> h0Var = new h0<>(e().b(new b(this, combiningCallable), executor), (b) null);
            ((h0) h0Var).f120012b.b(this.f120035a, a2.c());
            return h0Var;
        }

        private p(boolean allMustSucceed, Iterable<? extends h0<?>> inputs) {
            this.f120035a = new m(null);
            this.f120036b = allMustSucceed;
            this.f120037c = l6.v(inputs);
            Iterator<? extends h0<?>> it = inputs.iterator();
            while (it.hasNext()) {
                it.next().i(this.f120035a);
            }
        }
    }

    public static final class q<V1, V2> extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h0<V1> f120042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h0<V2> f120043e;

        /* JADX INFO: Add missing generic type declarations: [U] */
        class a<U> implements p.d<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f120044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f120045b;

            a(final q this$0, final d val$function) {
                this.f120044a = val$function;
                this.f120045b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.h0.p.d
            @d2
            public U a(u uVar, v vVar) throws Exception {
                return (U) this.f120044a.a(uVar, vVar.e(this.f120045b.f120042d), vVar.e(this.f120045b.f120043e));
            }

            public String toString() {
                return this.f120044a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        class b<U> implements p.c<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f120046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f120047b;

            b(final q this$0, final c val$function) {
                this.f120046a = val$function;
                this.f120047b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.h0.p.c
            public h0<U> a(u closer, v peeker) throws Exception {
                return this.f120046a.a(closer, peeker.e(this.f120047b.f120042d), peeker.e(this.f120047b.f120043e));
            }

            public String toString() {
                return this.f120046a.toString();
            }
        }

        public interface c<V1, V2, U> {
            h0<U> a(u closer, @d2 V1 value1, @d2 V2 value2) throws Exception;
        }

        public interface d<V1, V2, U> {
            @d2
            U a(u closer, @d2 V1 value1, @d2 V2 value2) throws Exception;
        }

        /* synthetic */ q(h0 h0Var, h0 h0Var2, b bVar) {
            this(h0Var, h0Var2);
        }

        public <U> h0<U> i(d<V1, V2, U> dVar, Executor executor) {
            return c(new a(this, dVar), executor);
        }

        public <U> h0<U> j(c<V1, V2, U> cVar, Executor executor) {
            return d(new b(this, cVar), executor);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private q(h0<V1> future1, h0<V2> future2) {
            super(true, l6.J(future1, future2), null);
            int i10 = 6 & 1;
            this.f120042d = future1;
            this.f120043e = future2;
        }
    }

    public static final class r<V1, V2, V3> extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h0<V1> f120048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h0<V2> f120049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final h0<V3> f120050f;

        /* JADX INFO: Add missing generic type declarations: [U] */
        class a<U> implements p.d<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f120051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f120052b;

            a(final r this$0, final d val$function) {
                this.f120051a = val$function;
                this.f120052b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.h0.p.d
            @d2
            public U a(u uVar, v vVar) throws Exception {
                return (U) this.f120051a.a(uVar, vVar.e(this.f120052b.f120048d), vVar.e(this.f120052b.f120049e), vVar.e(this.f120052b.f120050f));
            }

            public String toString() {
                return this.f120051a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        class b<U> implements p.c<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f120053a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f120054b;

            b(final r this$0, final c val$function) {
                this.f120053a = val$function;
                this.f120054b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.h0.p.c
            public h0<U> a(u closer, v peeker) throws Exception {
                return this.f120053a.a(closer, peeker.e(this.f120054b.f120048d), peeker.e(this.f120054b.f120049e), peeker.e(this.f120054b.f120050f));
            }

            public String toString() {
                return this.f120053a.toString();
            }
        }

        public interface c<V1, V2, V3, U> {
            h0<U> a(u closer, @d2 V1 value1, @d2 V2 value2, @d2 V3 value3) throws Exception;
        }

        public interface d<V1, V2, V3, U> {
            @d2
            U a(u closer, @d2 V1 value1, @d2 V2 value2, @d2 V3 value3) throws Exception;
        }

        /* synthetic */ r(h0 h0Var, h0 h0Var2, h0 h0Var3, b bVar) {
            this(h0Var, h0Var2, h0Var3);
        }

        public <U> h0<U> j(d<V1, V2, V3, U> dVar, Executor executor) {
            return c(new a(this, dVar), executor);
        }

        public <U> h0<U> k(c<V1, V2, V3, U> cVar, Executor executor) {
            return d(new b(this, cVar), executor);
        }

        private r(h0<V1> future1, h0<V2> future2, h0<V3> future3) {
            super(true, l6.K(future1, future2, future3), null);
            this.f120048d = future1;
            this.f120049e = future2;
            this.f120050f = future3;
        }
    }

    public static final class s<V1, V2, V3, V4> extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h0<V1> f120055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h0<V2> f120056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final h0<V3> f120057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h0<V4> f120058g;

        /* JADX INFO: Add missing generic type declarations: [U] */
        class a<U> implements p.d<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f120059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f120060b;

            a(final s this$0, final d val$function) {
                this.f120059a = val$function;
                this.f120060b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.h0.p.d
            @d2
            public U a(u uVar, v vVar) throws Exception {
                return (U) this.f120059a.a(uVar, vVar.e(this.f120060b.f120055d), vVar.e(this.f120060b.f120056e), vVar.e(this.f120060b.f120057f), vVar.e(this.f120060b.f120058g));
            }

            public String toString() {
                return this.f120059a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        class b<U> implements p.c<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f120061a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f120062b;

            b(final s this$0, final c val$function) {
                this.f120061a = val$function;
                this.f120062b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.h0.p.c
            public h0<U> a(u closer, v peeker) throws Exception {
                return this.f120061a.a(closer, peeker.e(this.f120062b.f120055d), peeker.e(this.f120062b.f120056e), peeker.e(this.f120062b.f120057f), peeker.e(this.f120062b.f120058g));
            }

            public String toString() {
                return this.f120061a.toString();
            }
        }

        public interface c<V1, V2, V3, V4, U> {
            h0<U> a(u closer, @d2 V1 value1, @d2 V2 value2, @d2 V3 value3, @d2 V4 value4) throws Exception;
        }

        public interface d<V1, V2, V3, V4, U> {
            @d2
            U a(u closer, @d2 V1 value1, @d2 V2 value2, @d2 V3 value3, @d2 V4 value4) throws Exception;
        }

        /* synthetic */ s(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, b bVar) {
            this(h0Var, h0Var2, h0Var3, h0Var4);
        }

        public <U> h0<U> k(d<V1, V2, V3, V4, U> dVar, Executor executor) {
            return c(new a(this, dVar), executor);
        }

        public <U> h0<U> l(c<V1, V2, V3, V4, U> cVar, Executor executor) {
            return d(new b(this, cVar), executor);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private s(h0<V1> future1, h0<V2> future2, h0<V3> future3, h0<V4> future4) {
            super(true, l6.L(future1, future2, future3, future4), null);
            int i10 = 5 >> 0;
            this.f120055d = future1;
            this.f120056e = future2;
            this.f120057f = future3;
            this.f120058g = future4;
        }
    }

    public static final class t<V1, V2, V3, V4, V5> extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h0<V1> f120063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h0<V2> f120064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final h0<V3> f120065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h0<V4> f120066g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final h0<V5> f120067h;

        /* JADX INFO: Add missing generic type declarations: [U] */
        class a<U> implements p.d<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f120068a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f120069b;

            a(final t this$0, final d val$function) {
                this.f120068a = val$function;
                this.f120069b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.h0.p.d
            @d2
            public U a(u uVar, v vVar) throws Exception {
                return (U) this.f120068a.a(uVar, vVar.e(this.f120069b.f120063d), vVar.e(this.f120069b.f120064e), vVar.e(this.f120069b.f120065f), vVar.e(this.f120069b.f120066g), vVar.e(this.f120069b.f120067h));
            }

            public String toString() {
                return this.f120068a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        class b<U> implements p.c<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f120070a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f120071b;

            b(final t this$0, final c val$function) {
                this.f120070a = val$function;
                this.f120071b = this$0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.h0.p.c
            public h0<U> a(u closer, v peeker) throws Exception {
                return this.f120070a.a(closer, peeker.e(this.f120071b.f120063d), peeker.e(this.f120071b.f120064e), peeker.e(this.f120071b.f120065f), peeker.e(this.f120071b.f120066g), peeker.e(this.f120071b.f120067h));
            }

            public String toString() {
                return this.f120070a.toString();
            }
        }

        public interface c<V1, V2, V3, V4, V5, U> {
            h0<U> a(u closer, @d2 V1 value1, @d2 V2 value2, @d2 V3 value3, @d2 V4 value4, @d2 V5 value5) throws Exception;
        }

        public interface d<V1, V2, V3, V4, V5, U> {
            @d2
            U a(u closer, @d2 V1 value1, @d2 V2 value2, @d2 V3 value3, @d2 V4 value4, @d2 V5 value5) throws Exception;
        }

        /* synthetic */ t(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, b bVar) {
            this(h0Var, h0Var2, h0Var3, h0Var4, h0Var5);
        }

        public <U> h0<U> l(d<V1, V2, V3, V4, V5, U> dVar, Executor executor) {
            return c(new a(this, dVar), executor);
        }

        public <U> h0<U> m(c<V1, V2, V3, V4, V5, U> cVar, Executor executor) {
            return d(new b(this, cVar), executor);
        }

        private t(h0<V1> future1, h0<V2> future2, h0<V3> future3, h0<V4> future4, h0<V5> future5) {
            super(true, l6.M(future1, future2, future3, future4, future5), null);
            this.f120063d = future1;
            this.f120064e = future2;
            this.f120065f = future3;
            this.f120066g = future4;
            this.f120067h = future5;
        }
    }

    public static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.j
        private final m f120072a;

        u(m list) {
            this.f120072a = list;
        }

        @d2
        @z7.a
        public <C extends AutoCloseable> C a(@d2 C closeable, Executor closingExecutor) {
            com.google.common.base.j0.E(closingExecutor);
            if (closeable != null) {
                this.f120072a.b(closeable, closingExecutor);
            }
            return closeable;
        }
    }

    public static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l6<h0<?>> f120073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f120074b;

        /* synthetic */ v(l6 l6Var, b bVar) {
            this(l6Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @d2
        public <V> V c(p.d<V> combiner, m closeables) throws Exception {
            this.f120074b = true;
            m mVar = new m(null);
            try {
                V vA = combiner.a(mVar.f120032a, this);
                closeables.b(mVar, a2.c());
                this.f120074b = false;
                return vA;
            } catch (Throwable th2) {
                closeables.b(mVar, a2.c());
                this.f120074b = false;
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <V> u0<V> d(p.c<V> combiner, m closeables) throws Exception {
            this.f120074b = true;
            m mVar = new m(null);
            try {
                h0<V> h0VarA = combiner.a(mVar.f120032a, this);
                h0VarA.i(closeables);
                u0<V> u0Var = ((h0) h0VarA).f120013c;
                Executor executorC = a2.c();
                return u0Var;
            } finally {
                closeables.b(mVar, a2.c());
                this.f120074b = false;
            }
        }

        @d2
        public final <D> D e(h0<D> h0Var) throws ExecutionException {
            com.google.common.base.j0.g0(this.f120074b);
            com.google.common.base.j0.d(this.f120073a.contains(h0Var));
            return (D) h1.j(((h0) h0Var).f120013c);
        }

        private v(l6<h0<?>> futures) {
            this.f120073a = (l6) com.google.common.base.j0.E(futures);
        }
    }

    enum w {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public static final class x<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h0<? extends V> f120082a;

        x(h0<? extends V> closingFuture) {
            this.f120082a = (h0) com.google.common.base.j0.E(closingFuture);
        }

        public void a() {
            this.f120082a.p();
        }

        @d2
        public V b() throws ExecutionException {
            return (V) h1.j(((h0) this.f120082a).f120013c);
        }
    }

    public interface y<V> {
        void a(x<V> valueAndCloser);
    }

    /* synthetic */ h0(t1 t1Var, b bVar) {
        this(t1Var);
    }

    public static <V> h0<V> A(k<V> callable, Executor executor) {
        com.google.common.base.j0.E(callable);
        m mVar = new m(null);
        b3 b3VarN = b3.N(new c(callable, mVar));
        executor.execute(b3VarN);
        return new h0<>(b3VarN, mVar);
    }

    public static p D(h0<?> future1, h0<?>... moreFutures) {
        return E(x7.c(future1, moreFutures));
    }

    public static p E(Iterable<? extends h0<?>> futures) {
        return new p(false, futures, null);
    }

    public static <V1, V2> q<V1, V2> F(h0<V1> future1, h0<V2> future2) {
        return new q<>(future1, future2, null);
    }

    public static <V1, V2, V3> r<V1, V2, V3> G(h0<V1> future1, h0<V2> future2, h0<V3> future3) {
        return new r<>(future1, future2, future3, null);
    }

    public static <V1, V2, V3, V4> s<V1, V2, V3, V4> H(h0<V1> future1, h0<V2> future2, h0<V3> future3, h0<V4> future4) {
        return new s<>(future1, future2, future3, future4, null);
    }

    public static <V1, V2, V3, V4, V5> t<V1, V2, V3, V4, V5> I(h0<V1> future1, h0<V2> future2, h0<V3> future3, h0<V4> future4, h0<V5> future5) {
        return new t<>(future1, future2, future3, future4, future5, null);
    }

    public static p J(h0<?> future1, h0<?> future2, h0<?> future3, h0<?> future4, h0<?> future5, h0<?> future6, h0<?>... moreFutures) {
        return K(s4.O(future1, future2, future3, future4, future5, future6).k(moreFutures));
    }

    public static p K(Iterable<? extends h0<?>> futures) {
        return new p(true, futures, null);
    }

    public static <V, U> l<V, U> M(final com.google.common.util.concurrent.w<V, U> function) {
        com.google.common.base.j0.E(function);
        return new g(function);
    }

    public static /* synthetic */ void a(AutoCloseable autoCloseable) {
        try {
            androidx.documentfile.provider.b.a(autoCloseable);
        } catch (Exception e10) {
            f2.b(e10);
            f120010d.a().log(Level.WARNING, "thrown by close()", (Throwable) e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(m otherCloseables) {
        o(w.OPEN, w.SUBSUMED);
        otherCloseables.b(this.f120012b, a2.c());
    }

    private <X extends Throwable, W extends V> h0<V> m(Class<X> cls, l<? super X, W> lVar, Executor executor) {
        com.google.common.base.j0.E(lVar);
        return (h0<V>) s(this.f120013c.H(cls, new i(this, lVar), executor));
    }

    private <X extends Throwable, W extends V> h0<V> n(Class<X> cls, o<? super X, W> oVar, Executor executor) {
        com.google.common.base.j0.E(oVar);
        return (h0<V>) s(this.f120013c.H(cls, new h(this, oVar), executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(w oldState, w newState) {
        com.google.common.base.j0.B0(r(oldState, newState), "Expected state to be %s, but it was %s", oldState, newState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        f120010d.a().log(Level.FINER, "closing {0}", this);
        this.f120012b.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(@fj.a final AutoCloseable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: com.google.common.util.concurrent.g0
                @Override // java.lang.Runnable
                public final void run() {
                    h0.a(closeable);
                }
            });
        } catch (RejectedExecutionException e10) {
            s1 s1Var = f120010d;
            Logger loggerA = s1Var.a();
            Level level = Level.WARNING;
            if (loggerA.isLoggable(level)) {
                s1Var.a().log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e10);
            }
            q(closeable, a2.c());
        }
    }

    private boolean r(w oldState, w newState) {
        return androidx.compose.animation.core.z1.a(this.f120011a, oldState, newState);
    }

    private <U> h0<U> s(u0<U> future) {
        h0<U> h0Var = new h0<>(future);
        i(h0Var.f120012b);
        return h0Var;
    }

    @Deprecated
    public static <C extends AutoCloseable> h0<C> t(t1<C> future, final Executor closingExecutor) {
        com.google.common.base.j0.E(closingExecutor);
        h0<C> h0Var = new h0<>(h1.s(future));
        h1.c(future, new d(closingExecutor), a2.c());
        return h0Var;
    }

    public static <V> h0<V> w(t1<V> future) {
        return new h0<>(future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <C, V extends C> void x(y<C> consumer, h0<V> closingFuture) {
        consumer.a(new x<>(closingFuture));
    }

    public static <V> h0<V> z(n<V> callable, Executor executor) {
        com.google.common.base.j0.E(callable);
        m mVar = new m(null);
        b3 b3VarP = b3.P(new b(callable, mVar));
        executor.execute(b3VarP);
        return new h0<>(b3VarP, mVar);
    }

    public <U> h0<U> B(final o<? super V, U> function, Executor executor) {
        com.google.common.base.j0.E(function);
        return s(this.f120013c.L(new e(this, function), executor));
    }

    public <U> h0<U> C(final l<? super V, U> function, Executor executor) {
        com.google.common.base.j0.E(function);
        return s(this.f120013c.L(new f(this, function), executor));
    }

    @com.google.common.annotations.e
    CountDownLatch L() {
        return this.f120012b.e();
    }

    protected void finalize() {
        if (this.f120011a.get().equals(w.OPEN)) {
            f120010d.a().log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            u();
        }
    }

    @z7.a
    public boolean j(boolean mayInterruptIfRunning) {
        f120010d.a().log(Level.FINER, "cancelling {0}", this);
        boolean zCancel = this.f120013c.cancel(mayInterruptIfRunning);
        if (zCancel) {
            p();
        }
        return zCancel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> h0<V> k(Class<X> exceptionType, o<? super X, ? extends V> fallback, Executor executor) {
        return n(exceptionType, fallback, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> h0<V> l(Class<X> exceptionType, l<? super X, ? extends V> fallback, Executor executor) {
        return m(exceptionType, fallback, executor);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("state", this.f120011a.get()).s(this.f120013c).toString();
    }

    public u0<V> u() {
        if (r(w.OPEN, w.WILL_CLOSE)) {
            f120010d.a().log(Level.FINER, "will close {0}", this);
            this.f120013c.m0(new j(), a2.c());
        } else {
            int iOrdinal = this.f120011a.get().ordinal();
            if (iOrdinal == 0) {
                throw new AssertionError();
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (iOrdinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.f120013c;
    }

    public void v(final y<? super V> consumer, Executor executor) {
        com.google.common.base.j0.E(consumer);
        if (r(w.OPEN, w.WILL_CREATE_VALUE_AND_CLOSER)) {
            this.f120013c.m0(new a(this, consumer), executor);
            return;
        }
        int iOrdinal = this.f120011a.get().ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        if (iOrdinal != 2 && iOrdinal != 3) {
            int i10 = 3 & 4;
            if (iOrdinal != 4) {
                if (iOrdinal == 5) {
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                }
                throw new AssertionError(this.f120011a);
            }
        }
        throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
    }

    public t1<?> y() {
        return h1.s(this.f120013c.K(com.google.common.base.v.b(null), a2.c()));
    }

    private static final class m extends IdentityHashMap<AutoCloseable, Executor> implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f120032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f120033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        private volatile CountDownLatch f120034c;

        private m() {
            this.f120032a = new u(this);
        }

        void b(@fj.a AutoCloseable closeable, Executor executor) {
            com.google.common.base.j0.E(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f120033b) {
                        h0.q(closeable, executor);
                    } else {
                        put(closeable, executor);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        <V, U> u0<U> c(l<V, U> transformation, @d2 V input) throws Exception {
            m mVar = new m();
            try {
                h0<U> h0VarA = transformation.a(mVar.f120032a, input);
                h0VarA.i(mVar);
                u0<U> u0Var = ((h0) h0VarA).f120013c;
                b(mVar, a2.c());
                return u0Var;
            } catch (Throwable th2) {
                b(mVar, a2.c());
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f120033b) {
                synchronized (this) {
                    try {
                        if (this.f120033b) {
                            return;
                        }
                        this.f120033b = true;
                        for (Map.Entry<AutoCloseable, Executor> entry : entrySet()) {
                            h0.q(entry.getKey(), entry.getValue());
                        }
                        clear();
                        if (this.f120034c != null) {
                            this.f120034c.countDown();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        <V, U> t1<U> d(o<? super V, U> transformation, @d2 V input) throws Exception {
            m mVar = new m();
            try {
                t1<U> t1VarO = h1.o(transformation.a(mVar.f120032a, input));
                b(mVar, a2.c());
                return t1VarO;
            } catch (Throwable th2) {
                b(mVar, a2.c());
                throw th2;
            }
        }

        CountDownLatch e() {
            if (this.f120033b) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                try {
                    if (this.f120033b) {
                        return new CountDownLatch(0);
                    }
                    com.google.common.base.j0.g0(this.f120034c == null);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.f120034c = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* synthetic */ m(b bVar) {
            this();
        }
    }

    private h0(t1<V> future) {
        this(future, new m(null));
    }

    private h0(t1<V> future, m closeables) {
        this.f120011a = new AtomicReference<>(w.OPEN);
        this.f120013c = u0.J(future);
        this.f120012b = closeables;
    }
}
