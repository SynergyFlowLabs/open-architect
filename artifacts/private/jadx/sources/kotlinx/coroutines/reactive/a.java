package kotlinx.coroutines.reactive;

import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.u;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/reactive/AwaitKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,325:1\n426#2,11:326\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/reactive/AwaitKt\n*L\n182#1:326,11\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {52}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
    static final class C2311a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f315211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315212c;

        C2311a(kotlin.coroutines.d<? super C2311a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315211b = obj;
            this.f315212c |= Integer.MIN_VALUE;
            return a.f(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w f315213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f315214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f315215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f315216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<T> f315217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f315218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f315219g;

        /* JADX INFO: renamed from: kotlinx.coroutines.reactive.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C2312a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f315220a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.FIRST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.FIRST_OR_DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i.LAST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i.SINGLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[i.SINGLE_OR_DEFAULT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f315220a = iArr;
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.reactive.a$b$b, reason: collision with other inner class name */
        static final class C2313b implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f315221a;

            C2313b(w wVar) {
                this.f315221a = wVar;
            }

            public final void c() {
                this.f315221a.cancel();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                c();
                return Unit.f312394a;
            }
        }

        static final class c implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f315222a;

            c(w wVar) {
                this.f315222a = wVar;
            }

            public final void c() {
                this.f315222a.cancel();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                c();
                return Unit.f312394a;
            }
        }

        static final class d implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f315223a;

            d(w wVar) {
                this.f315223a = wVar;
            }

            public final void c() {
                this.f315223a.cancel();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                c();
                return Unit.f312394a;
            }
        }

        static final class e implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f315225b;

            /* JADX INFO: renamed from: kotlinx.coroutines.reactive.a$b$e$a, reason: collision with other inner class name */
            static final class C2314a implements Function0<Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ w f315226a;

                C2314a(w wVar) {
                    this.f315226a = wVar;
                }

                public final void c() {
                    this.f315226a.cancel();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    c();
                    return Unit.f312394a;
                }
            }

            e(w wVar) {
                this.f315225b = wVar;
            }

            public final void c(Throwable th2) {
                b.this.c(new C2314a(this.f315225b));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                c(th2);
                return Unit.f312394a;
            }
        }

        static final class f implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f315227a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f315228b;

            f(w wVar, i iVar) {
                this.f315227a = wVar;
                this.f315228b = iVar;
            }

            public final void c() {
                w wVar = this.f315227a;
                i iVar = this.f315228b;
                wVar.request((iVar == i.FIRST || iVar == i.FIRST_OR_DEFAULT) ? 1L : Long.MAX_VALUE);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                c();
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.n<? super T> nVar, i iVar, T t10) {
            this.f315217e = nVar;
            this.f315218f = iVar;
            this.f315219g = t10;
        }

        private final boolean b(String str) {
            if (this.f315216d) {
                a.o(this.f315217e.getContext(), str);
                return false;
            }
            this.f315216d = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void c(Function0<Unit> function0) {
            function0.invoke();
        }

        @Override // org.reactivestreams.v
        public void l(w wVar) {
            if (this.f315213a != null) {
                c(new d(wVar));
                return;
            }
            this.f315213a = wVar;
            this.f315217e.e0(new e(wVar));
            c(new f(wVar, this.f315218f));
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (b("onComplete")) {
                if (!this.f315215c) {
                    i iVar = this.f315218f;
                    if (iVar != i.FIRST_OR_DEFAULT && iVar != i.SINGLE_OR_DEFAULT) {
                        if (this.f315217e.isActive()) {
                            kotlinx.coroutines.n<T> nVar = this.f315217e;
                            Result.a aVar = Result.Companion;
                            nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new NoSuchElementException("No value received via onNext for " + this.f315218f))));
                        }
                    }
                    kotlinx.coroutines.n<T> nVar2 = this.f315217e;
                    Result.a aVar2 = Result.Companion;
                    nVar2.resumeWith(Result.m785constructorimpl(this.f315219g));
                    return;
                }
                i iVar2 = this.f315218f;
                if (iVar2 != i.FIRST_OR_DEFAULT && iVar2 != i.FIRST && this.f315217e.isActive()) {
                    kotlinx.coroutines.n<T> nVar3 = this.f315217e;
                    Result.a aVar3 = Result.Companion;
                    nVar3.resumeWith(Result.m785constructorimpl(this.f315214b));
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (b("onError")) {
                kotlinx.coroutines.n<T> nVar = this.f315217e;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            w wVar = this.f315213a;
            kotlinx.coroutines.n<T> nVar = this.f315217e;
            if (wVar == null) {
                p0.b(nVar.getContext(), new IllegalStateException("'onNext' was called before 'onSubscribe'"));
                return;
            }
            if (this.f315216d) {
                a.o(nVar.getContext(), "onNext");
                return;
            }
            int i10 = C2312a.f315220a[this.f315218f.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (this.f315215c) {
                    a.p(this.f315217e.getContext(), this.f315218f);
                    return;
                }
                this.f315215c = true;
                c(new C2313b(wVar));
                kotlinx.coroutines.n<T> nVar2 = this.f315217e;
                Result.a aVar = Result.Companion;
                nVar2.resumeWith(Result.m785constructorimpl(t10));
                return;
            }
            int i11 = 2 & 3;
            if (i10 != 3 && i10 != 4 && i10 != 5) {
                throw new k0();
            }
            i iVar = this.f315218f;
            if ((iVar != i.SINGLE && iVar != i.SINGLE_OR_DEFAULT) || !this.f315215c) {
                this.f315214b = t10;
                this.f315215c = true;
                return;
            }
            c(new c(wVar));
            if (this.f315217e.isActive()) {
                kotlinx.coroutines.n<T> nVar3 = this.f315217e;
                Result.a aVar2 = Result.Companion;
                nVar3.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new IllegalArgumentException("More than one onNext value for " + this.f315218f))));
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {166}, m = "awaitSingleOrElse", n = {"defaultValue"}, s = {"L$0"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f315230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315231c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315230b = obj;
            this.f315231c |= Integer.MIN_VALUE;
            return a.m(null, null, this);
        }
    }

    @Nullable
    public static final <T> Object d(@NotNull u<T> uVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return j(uVar, i.FIRST, null, dVar, 2, null);
    }

    @Nullable
    public static final <T> Object e(@NotNull u<T> uVar, T t10, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return i(uVar, i.FIRST_OR_DEFAULT, t10, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    public static final <T> Object f(@NotNull u<T> uVar, @NotNull Function0<? extends T> function0, @NotNull kotlin.coroutines.d<? super T> dVar) {
        C2311a c2311a;
        if (dVar instanceof C2311a) {
            c2311a = (C2311a) dVar;
            int i10 = c2311a.f315212c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2311a.f315212c = i10 - Integer.MIN_VALUE;
            } else {
                c2311a = new C2311a(dVar);
            }
        } else {
            c2311a = new C2311a(dVar);
        }
        C2311a c2311a2 = c2311a;
        Object objJ = c2311a2.f315211b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2311a2.f315212c;
        if (i11 == 0) {
            ResultKt.m(objJ);
            i iVar = i.FIRST_OR_DEFAULT;
            c2311a2.f315210a = function0;
            c2311a2.f315212c = 1;
            objJ = j(uVar, iVar, null, c2311a2, 2, null);
            if (objJ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) c2311a2.f315210a;
            ResultKt.m(objJ);
        }
        return objJ == null ? function0.invoke() : objJ;
    }

    @Nullable
    public static final <T> Object g(@NotNull u<T> uVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return j(uVar, i.FIRST_OR_DEFAULT, null, dVar, 2, null);
    }

    @Nullable
    public static final <T> Object h(@NotNull u<T> uVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return j(uVar, i.LAST, null, dVar, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object i(u<T> uVar, i iVar, T t10, kotlin.coroutines.d<? super T> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        o.e(uVar, pVar.getContext()).e(new b(pVar, iVar, t10));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object j(u uVar, i iVar, Object obj, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return i(uVar, iVar, obj, dVar);
    }

    @Nullable
    public static final <T> Object k(@NotNull u<T> uVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return j(uVar, i.SINGLE, null, dVar, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated without a replacement due to its name incorrectly conveying the behavior. Please consider using awaitFirstOrElse().")
    public static final /* synthetic */ Object m(u uVar, Function0 function0, kotlin.coroutines.d dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f315231c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f315231c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object objJ = cVar2.f315230b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f315231c;
        if (i11 == 0) {
            ResultKt.m(objJ);
            i iVar = i.SINGLE_OR_DEFAULT;
            cVar2.f315229a = function0;
            cVar2.f315231c = 1;
            objJ = j(uVar, iVar, null, cVar2, 2, null);
            if (objJ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) cVar2.f315229a;
            ResultKt.m(objJ);
        }
        return objJ == null ? function0.invoke() : objJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(CoroutineContext coroutineContext, String str) {
        p0.b(coroutineContext, new IllegalStateException('\'' + str + "' was called after the publisher already signalled being in a terminal state"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(CoroutineContext coroutineContext, i iVar) {
        p0.b(coroutineContext, new IllegalStateException("Only a single value was requested in '" + iVar + "', but the publisher provided more"));
    }
}
