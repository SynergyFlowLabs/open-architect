package kotlinx.coroutines.rx2;

import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.q0;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRxAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxAwait.kt\nkotlinx/coroutines/rx2/RxAwaitKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,294:1\n426#2,11:295\n426#2,11:306\n426#2,11:317\n426#2,11:328\n*S KotlinDebug\n*F\n+ 1 RxAwait.kt\nkotlinx/coroutines/rx2/RxAwaitKt\n*L\n21#1:295,11\n48#1:306,11\n134#1:317,11\n239#1:328,11\n*E\n"})
public final class h {

    public static final class a implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<Unit> f315348a;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.n<? super Unit> nVar) {
            this.f315348a = nVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            h.q(this.f315348a, cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            kotlinx.coroutines.n<Unit> nVar = this.f315348a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            kotlinx.coroutines.n<Unit> nVar = this.f315348a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<T> f315349a;

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.n<? super T> nVar) {
            this.f315349a = nVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            kotlinx.coroutines.n<T> nVar = this.f315349a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(t10));
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            h.q(this.f315349a, cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            kotlinx.coroutines.n<T> nVar = this.f315349a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {196}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f315351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315352c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315351b = obj;
            this.f315352c |= Integer.MIN_VALUE;
            return h.h(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> implements i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.reactivex.disposables.c f315353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f315354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f315355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<T> f315356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.rx2.f f315357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f315358f;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f315359a;

            static {
                int[] iArr = new int[kotlinx.coroutines.rx2.f.values().length];
                try {
                    iArr[kotlinx.coroutines.rx2.f.FIRST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlinx.coroutines.rx2.f.FIRST_OR_DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlinx.coroutines.rx2.f.LAST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[kotlinx.coroutines.rx2.f.SINGLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f315359a = iArr;
            }
        }

        static final class b implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.reactivex.disposables.c f315360a;

            b(io.reactivex.disposables.c cVar) {
                this.f315360a = cVar;
            }

            public final void c(Throwable th2) {
                this.f315360a.dispose();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                c(th2);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(kotlinx.coroutines.n<? super T> nVar, kotlinx.coroutines.rx2.f fVar, T t10) {
            this.f315356d = nVar;
            this.f315357e = fVar;
            this.f315358f = t10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f315353a = cVar;
            this.f315356d.e0(new b(cVar));
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f315355c) {
                if (this.f315356d.isActive()) {
                    kotlinx.coroutines.n<T> nVar = this.f315356d;
                    Result.a aVar = Result.Companion;
                    nVar.resumeWith(Result.m785constructorimpl(this.f315354b));
                    return;
                }
                return;
            }
            if (this.f315357e == kotlinx.coroutines.rx2.f.FIRST_OR_DEFAULT) {
                kotlinx.coroutines.n<T> nVar2 = this.f315356d;
                Result.a aVar2 = Result.Companion;
                nVar2.resumeWith(Result.m785constructorimpl(this.f315358f));
            } else if (this.f315356d.isActive()) {
                kotlinx.coroutines.n<T> nVar3 = this.f315356d;
                Result.a aVar3 = Result.Companion;
                nVar3.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new NoSuchElementException("No value received via onNext for " + this.f315357e))));
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            kotlinx.coroutines.n<T> nVar = this.f315356d;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            int i10 = a.f315359a[this.f315357e.ordinal()];
            io.reactivex.disposables.c cVar = null;
            if (i10 == 1 || i10 == 2) {
                if (this.f315355c) {
                    return;
                }
                this.f315355c = true;
                kotlinx.coroutines.n<T> nVar = this.f315356d;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(t10));
                io.reactivex.disposables.c cVar2 = this.f315353a;
                if (cVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subscription");
                } else {
                    cVar = cVar2;
                }
                cVar.dispose();
                return;
            }
            if (i10 != 3 && i10 != 4) {
                throw new k0();
            }
            if (this.f315357e != kotlinx.coroutines.rx2.f.SINGLE || !this.f315355c) {
                this.f315354b = t10;
                this.f315355c = true;
                return;
            }
            if (this.f315356d.isActive()) {
                kotlinx.coroutines.n<T> nVar2 = this.f315356d;
                Result.a aVar2 = Result.Companion;
                nVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new IllegalArgumentException("More than one onNext value for " + this.f315357e))));
            }
            io.reactivex.disposables.c cVar3 = this.f315353a;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subscription");
            } else {
                cVar = cVar3;
            }
            cVar.dispose();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {122}, m = "awaitOrDefault", n = {"default"}, s = {"L$0"})
    static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f315362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315363c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315362b = obj;
            this.f315363c |= Integer.MIN_VALUE;
            return h.m(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxAwaitKt", f = "RxAwait.kt", i = {}, l = {78}, m = "awaitSingle", n = {}, s = {})
    static final class f<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f315364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f315365b;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315364a = obj;
            this.f315365b |= Integer.MIN_VALUE;
            return h.n(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class g<T> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<T> f315366a;

        /* JADX WARN: Multi-variable type inference failed */
        g(kotlinx.coroutines.n<? super T> nVar) {
            this.f315366a = nVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            kotlinx.coroutines.n<T> nVar = this.f315366a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(t10));
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            h.q(this.f315366a, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            kotlinx.coroutines.n<T> nVar = this.f315366a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(null));
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            kotlinx.coroutines.n<T> nVar = this.f315366a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    @Nullable
    public static final Object c(@NotNull io.reactivex.i iVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        iVar.b(new a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Nullable
    public static final <T> Object e(@NotNull q0<T> q0Var, @NotNull kotlin.coroutines.d<? super T> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        q0Var.f(new b(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Nullable
    public static final <T> Object f(@NotNull io.reactivex.g0<T> g0Var, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return l(g0Var, kotlinx.coroutines.rx2.f.FIRST, null, dVar, 2, null);
    }

    @Nullable
    public static final <T> Object g(@NotNull io.reactivex.g0<T> g0Var, T t10, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return k(g0Var, kotlinx.coroutines.rx2.f.FIRST_OR_DEFAULT, t10, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public static final <T> Object h(@NotNull io.reactivex.g0<T> g0Var, @NotNull Function0<? extends T> function0, @NotNull kotlin.coroutines.d<? super T> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f315352c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f315352c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object objL = cVar2.f315351b;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f315352c;
        if (i11 == 0) {
            ResultKt.m(objL);
            kotlinx.coroutines.rx2.f fVar = kotlinx.coroutines.rx2.f.FIRST_OR_DEFAULT;
            cVar2.f315350a = function0;
            cVar2.f315352c = 1;
            int i12 = 3 & 0;
            objL = l(g0Var, fVar, null, cVar2, 2, null);
            if (objL == objL2) {
                return objL2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) cVar2.f315350a;
            ResultKt.m(objL);
        }
        return objL == null ? function0.invoke() : objL;
    }

    @Nullable
    public static final <T> Object i(@NotNull io.reactivex.g0<T> g0Var, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return l(g0Var, kotlinx.coroutines.rx2.f.FIRST_OR_DEFAULT, null, dVar, 2, null);
    }

    @Nullable
    public static final <T> Object j(@NotNull io.reactivex.g0<T> g0Var, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return l(g0Var, kotlinx.coroutines.rx2.f.LAST, null, dVar, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object k(io.reactivex.g0<T> g0Var, kotlinx.coroutines.rx2.f fVar, T t10, kotlin.coroutines.d<? super T> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        g0Var.a(new d(pVar, fVar, t10));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    static /* synthetic */ Object l(io.reactivex.g0 g0Var, kotlinx.coroutines.rx2.f fVar, Object obj, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return k(g0Var, fVar, obj, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in favor of awaitSingleOrNull()", replaceWith = @b1(expression = "this.awaitSingleOrNull() ?: default", imports = {}))
    public static final /* synthetic */ Object m(io.reactivex.y yVar, Object obj, kotlin.coroutines.d dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f315363c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f315363c = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objP = eVar.f315362b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f315363c;
        if (i11 == 0) {
            ResultKt.m(objP);
            eVar.f315361a = obj;
            eVar.f315363c = 1;
            objP = p(yVar, eVar);
            if (objP == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = eVar.f315361a;
            ResultKt.m(objP);
        }
        return objP == null ? obj : objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final <T> Object n(@NotNull io.reactivex.y<T> yVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f315365b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f315365b = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objP = fVar.f315364a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f315365b;
        if (i11 == 0) {
            ResultKt.m(objP);
            fVar.f315365b = 1;
            objP = p(yVar, fVar);
            if (objP == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objP);
        }
        if (objP != null) {
            return objP;
        }
        throw new NoSuchElementException();
    }

    @Nullable
    public static final <T> Object o(@NotNull io.reactivex.g0<T> g0Var, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return l(g0Var, kotlinx.coroutines.rx2.f.SINGLE, null, dVar, 2, null);
    }

    @Nullable
    public static final <T> Object p(@NotNull io.reactivex.y<T> yVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        yVar.a(new g(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    public static final void q(@NotNull kotlinx.coroutines.n<?> nVar, @NotNull final io.reactivex.disposables.c cVar) {
        nVar.e0(new Function1() { // from class: kotlinx.coroutines.rx2.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.r(cVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(io.reactivex.disposables.c cVar, Throwable th2) {
        cVar.dispose();
        return Unit.f312394a;
    }
}
