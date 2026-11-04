package androidx.compose.animation.core;

import androidx.compose.runtime.k7;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public final class a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12743c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f12744a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f12745b = kotlinx.coroutines.sync.g.b(false, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final x1 f12746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.p2 f12747b;

        public a(@NotNull x1 x1Var, @NotNull kotlinx.coroutines.p2 p2Var) {
            this.f12746a = x1Var;
            this.f12747b = p2Var;
        }

        public final boolean a(@NotNull a aVar) {
            return this.f12746a.compareTo(aVar.f12746a) >= 0;
        }

        public final void b() {
            this.f12747b.e(new y1());
        }

        @NotNull
        public final kotlinx.coroutines.p2 c() {
            return this.f12747b;
        }

        @NotNull
        public final x1 d() {
            return this.f12746a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, okhttp3.internal.ws.g.f334652s}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,172:1\n116#2,10:173\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n*L\n124#1:173,10\n*E\n"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f12749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f12750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f12752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ x1 f12753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a2 f12754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f12755h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(x1 x1Var, a2 a2Var, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f12753f = x1Var;
            this.f12754g = a2Var;
            this.f12755h = function1;
            int i10 = 2 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f12753f, this.f12754g, this.f12755h, dVar);
            bVar.f12752e = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            a2 a2Var;
            Function1<kotlin.coroutines.d<? super R>, Object> function1;
            Throwable th2;
            a aVar3;
            a2 a2Var2;
            kotlinx.coroutines.sync.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f12751d;
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f12752e;
                        x1 x1Var = this.f12753f;
                        CoroutineContext.Element element = s0Var.getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                        Intrinsics.checkNotNull(element);
                        aVar = new a(x1Var, (kotlinx.coroutines.p2) element);
                        this.f12754g.h(aVar);
                        aVar2 = this.f12754g.f12745b;
                        Function1<kotlin.coroutines.d<? super R>, Object> function2 = this.f12755h;
                        a2Var = this.f12754g;
                        this.f12752e = aVar;
                        this.f12748a = aVar2;
                        this.f12749b = function2;
                        this.f12750c = a2Var;
                        this.f12751d = 1;
                        if (aVar2.h(null, this) != objL) {
                            function1 = function2;
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a2Var2 = (a2) this.f12749b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f12748a;
                        aVar3 = (a) this.f12752e;
                        try {
                            ResultKt.m(obj);
                            z1.a(a2Var2.f12744a, aVar3, null);
                            aVar4.i(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            z1.a(a2Var2.f12744a, aVar3, null);
                            throw th2;
                        }
                    }
                    a2 a2Var3 = (a2) this.f12750c;
                    function1 = (Function1) this.f12749b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f12748a;
                    a aVar6 = (a) this.f12752e;
                    ResultKt.m(obj);
                    a2Var = a2Var3;
                    aVar = aVar6;
                    aVar2 = aVar5;
                    this.f12752e = aVar;
                    this.f12748a = aVar2;
                    this.f12749b = a2Var;
                    this.f12750c = null;
                    this.f12751d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar7 = aVar2;
                        obj = objInvoke;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        a2Var2 = a2Var;
                        z1.a(a2Var2.f12744a, aVar3, null);
                        aVar4.i(null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar3 = aVar;
                    a2Var2 = a2Var;
                    z1.a(a2Var2.f12744a, aVar3, null);
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 165}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,172:1\n116#2,10:173\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n*L\n163#1:173,10\n*E\n"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f12757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f12758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f12759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f12761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ x1 f12762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a2 f12763h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f12764i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f12765j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(x1 x1Var, a2 a2Var, Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, T t10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f12762g = x1Var;
            this.f12763h = a2Var;
            this.f12764i = function2;
            this.f12765j = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f12762g, this.f12763h, this.f12764i, this.f12765j, dVar);
            cVar.f12761f = obj;
            return cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            Function2 function2;
            a2 a2Var;
            Object obj2;
            Throwable th2;
            a aVar3;
            a2 a2Var2;
            kotlinx.coroutines.sync.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f12760e;
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f12761f;
                        x1 x1Var = this.f12762g;
                        CoroutineContext.Element element = s0Var.getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                        Intrinsics.checkNotNull(element);
                        aVar = new a(x1Var, (kotlinx.coroutines.p2) element);
                        this.f12763h.h(aVar);
                        aVar2 = this.f12763h.f12745b;
                        function2 = this.f12764i;
                        Object obj3 = this.f12765j;
                        a2Var = this.f12763h;
                        this.f12761f = aVar;
                        this.f12756a = aVar2;
                        this.f12757b = function2;
                        this.f12758c = obj3;
                        this.f12759d = a2Var;
                        this.f12760e = 1;
                        if (aVar2.h(null, this) != objL) {
                            obj2 = obj3;
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a2Var2 = (a2) this.f12757b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f12756a;
                        aVar3 = (a) this.f12761f;
                        try {
                            ResultKt.m(obj);
                            z1.a(a2Var2.f12744a, aVar3, null);
                            aVar4.i(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            z1.a(a2Var2.f12744a, aVar3, null);
                            throw th2;
                        }
                    }
                    a2 a2Var3 = (a2) this.f12759d;
                    obj2 = this.f12758c;
                    function2 = (Function2) this.f12757b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f12756a;
                    a aVar6 = (a) this.f12761f;
                    ResultKt.m(obj);
                    a2Var = a2Var3;
                    aVar = aVar6;
                    aVar2 = aVar5;
                    this.f12761f = aVar;
                    this.f12756a = aVar2;
                    this.f12757b = a2Var;
                    this.f12758c = null;
                    this.f12759d = null;
                    this.f12760e = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar7 = aVar2;
                        obj = objInvoke;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        a2Var2 = a2Var;
                        z1.a(a2Var2.f12744a, aVar3, null);
                        aVar4.i(null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar3 = aVar;
                    a2Var2 = a2Var;
                    z1.a(a2Var2.f12744a, aVar3, null);
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

    public static /* synthetic */ Object e(a2 a2Var, x1 x1Var, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x1Var = x1.Default;
        }
        return a2Var.d(x1Var, function1, dVar);
    }

    public static /* synthetic */ Object g(a2 a2Var, Object obj, x1 x1Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            x1Var = x1.Default;
        }
        return a2Var.f(obj, x1Var, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f12744a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!z1.a(this.f12744a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Nullable
    public final <R> Object d(@NotNull x1 x1Var, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.t0.g(new b(x1Var, this, function1, null), dVar);
    }

    @Nullable
    public final <T, R> Object f(T t10, @NotNull x1 x1Var, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.t0.g(new c(x1Var, this, function2, t10, null), dVar);
    }
}
