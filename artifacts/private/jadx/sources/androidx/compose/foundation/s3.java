package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public final class s3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18611c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f18612a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f18613b = kotlinx.coroutines.sync.g.b(false, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final q3 f18614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.p2 f18615b;

        public a(@NotNull q3 q3Var, @NotNull kotlinx.coroutines.p2 p2Var) {
            this.f18614a = q3Var;
            this.f18615b = p2Var;
        }

        public final boolean a(@NotNull a aVar) {
            return this.f18614a.compareTo(aVar.f18614a) >= 0;
        }

        public final void b() {
            this.f18615b.e(new r3());
        }

        @NotNull
        public final kotlinx.coroutines.p2 c() {
            return this.f18615b;
        }

        @NotNull
        public final q3 d() {
            return this.f18614a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {211, 127}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,206:1\n116#2,10:207\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n*L\n125#1:207,10\n*E\n"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f18616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f18617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f18618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f18620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q3 f18621f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s3 f18622g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f18623h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q3 q3Var, s3 s3Var, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f18621f = q3Var;
            this.f18622g = s3Var;
            this.f18623h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f18621f, this.f18622g, this.f18623h, dVar);
            bVar.f18620e = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            s3 s3Var;
            Function1<kotlin.coroutines.d<? super R>, Object> function1;
            Throwable th2;
            a aVar3;
            s3 s3Var2;
            kotlinx.coroutines.sync.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f18619d;
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f18620e;
                        q3 q3Var = this.f18621f;
                        CoroutineContext.Element element = s0Var.getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                        Intrinsics.checkNotNull(element);
                        aVar = new a(q3Var, (kotlinx.coroutines.p2) element);
                        this.f18622g.j(aVar);
                        aVar2 = this.f18622g.f18613b;
                        Function1<kotlin.coroutines.d<? super R>, Object> function2 = this.f18623h;
                        s3Var = this.f18622g;
                        this.f18620e = aVar;
                        this.f18616a = aVar2;
                        this.f18617b = function2;
                        this.f18618c = s3Var;
                        this.f18619d = 1;
                        if (aVar2.h(null, this) != objL) {
                            function1 = function2;
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s3Var2 = (s3) this.f18617b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f18616a;
                        aVar3 = (a) this.f18620e;
                        try {
                            ResultKt.m(obj);
                            androidx.compose.animation.core.z1.a(s3Var2.f18612a, aVar3, null);
                            aVar4.i(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            androidx.compose.animation.core.z1.a(s3Var2.f18612a, aVar3, null);
                            throw th2;
                        }
                    }
                    s3 s3Var3 = (s3) this.f18618c;
                    function1 = (Function1) this.f18617b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f18616a;
                    a aVar6 = (a) this.f18620e;
                    ResultKt.m(obj);
                    s3Var = s3Var3;
                    aVar = aVar6;
                    aVar2 = aVar5;
                    this.f18620e = aVar;
                    this.f18616a = aVar2;
                    this.f18617b = s3Var;
                    this.f18618c = null;
                    this.f18619d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar7 = aVar2;
                        obj = objInvoke;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        s3Var2 = s3Var;
                        androidx.compose.animation.core.z1.a(s3Var2.f18612a, aVar3, null);
                        aVar4.i(null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar3 = aVar;
                    s3Var2 = s3Var;
                    androidx.compose.animation.core.z1.a(s3Var2.f18612a, aVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r10.i(null);
                throw th5;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {211, 167}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,206:1\n116#2,10:207\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n*L\n165#1:207,10\n*E\n"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f18624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f18625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f18626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f18627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f18629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q3 f18630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ s3 f18631h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f18632i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f18633j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(q3 q3Var, s3 s3Var, Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, T t10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f18630g = q3Var;
            this.f18631h = s3Var;
            this.f18632i = function2;
            this.f18633j = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f18630g, this.f18631h, this.f18632i, this.f18633j, dVar);
            cVar.f18629f = obj;
            return cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            Function2 function2;
            s3 s3Var;
            Object obj2;
            Throwable th2;
            a aVar3;
            s3 s3Var2;
            kotlinx.coroutines.sync.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f18628e;
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f18629f;
                        q3 q3Var = this.f18630g;
                        CoroutineContext.Element element = s0Var.getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                        Intrinsics.checkNotNull(element);
                        aVar = new a(q3Var, (kotlinx.coroutines.p2) element);
                        this.f18631h.j(aVar);
                        aVar2 = this.f18631h.f18613b;
                        function2 = this.f18632i;
                        Object obj3 = this.f18633j;
                        s3Var = this.f18631h;
                        this.f18629f = aVar;
                        this.f18624a = aVar2;
                        this.f18625b = function2;
                        this.f18626c = obj3;
                        this.f18627d = s3Var;
                        this.f18628e = 1;
                        if (aVar2.h(null, this) != objL) {
                            obj2 = obj3;
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s3Var2 = (s3) this.f18625b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f18624a;
                        aVar3 = (a) this.f18629f;
                        try {
                            ResultKt.m(obj);
                            androidx.compose.animation.core.z1.a(s3Var2.f18612a, aVar3, null);
                            aVar4.i(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            androidx.compose.animation.core.z1.a(s3Var2.f18612a, aVar3, null);
                            throw th2;
                        }
                    }
                    s3 s3Var3 = (s3) this.f18627d;
                    obj2 = this.f18626c;
                    function2 = (Function2) this.f18625b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f18624a;
                    a aVar6 = (a) this.f18629f;
                    ResultKt.m(obj);
                    s3Var = s3Var3;
                    aVar = aVar6;
                    aVar2 = aVar5;
                    this.f18629f = aVar;
                    this.f18624a = aVar2;
                    this.f18625b = s3Var;
                    this.f18626c = null;
                    this.f18627d = null;
                    this.f18628e = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar7 = aVar2;
                        obj = objInvoke;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        s3Var2 = s3Var;
                        androidx.compose.animation.core.z1.a(s3Var2.f18612a, aVar3, null);
                        aVar4.i(null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar3 = aVar;
                    s3Var2 = s3Var;
                    androidx.compose.animation.core.z1.a(s3Var2.f18612a, aVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r10.i(null);
                throw th5;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static /* synthetic */ Object e(s3 s3Var, q3 q3Var, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = q3.Default;
        }
        return s3Var.d(q3Var, function1, dVar);
    }

    public static /* synthetic */ Object g(s3 s3Var, Object obj, q3 q3Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q3Var = q3.Default;
        }
        return s3Var.f(obj, q3Var, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f18612a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.compose.animation.core.z1.a(this.f18612a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Nullable
    public final <R> Object d(@NotNull q3 q3Var, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.t0.g(new b(q3Var, this, function1, null), dVar);
    }

    @Nullable
    public final <T, R> Object f(T t10, @NotNull q3 q3Var, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.t0.g(new c(q3Var, this, function2, t10, null), dVar);
    }

    @kotlin.a1
    public final boolean h() {
        int i10 = 3 ^ 1;
        return kotlinx.coroutines.sync.a.C2318a.c(this.f18613b, null, 1, null);
    }

    public final boolean i(@NotNull Function0<Unit> function0) {
        boolean zH = h();
        if (!zH) {
            return zH;
        }
        try {
            function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            k();
            kotlin.jvm.internal.h0.c(1);
            return zH;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            k();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    @kotlin.a1
    public final void k() {
        kotlinx.coroutines.sync.a.C2318a.d(this.f18613b, null, 1, null);
    }
}
