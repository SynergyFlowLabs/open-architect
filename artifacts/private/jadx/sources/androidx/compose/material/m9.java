package androidx.compose.material;

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
@androidx.compose.runtime.k7
public final class m9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23748c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f23749a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f23750b = kotlinx.coroutines.sync.g.b(false, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.foundation.q3 f23751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.p2 f23752b;

        public a(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlinx.coroutines.p2 p2Var) {
            this.f23751a = q3Var;
            this.f23752b = p2Var;
        }

        public final boolean a(@NotNull a aVar) {
            return this.f23751a.compareTo(aVar.f23751a) >= 0;
        }

        public final void b() {
            kotlinx.coroutines.p2.a.b(this.f23752b, null, 1, null);
        }

        @NotNull
        public final kotlinx.coroutines.p2 c() {
            return this.f23752b;
        }

        @NotNull
        public final androidx.compose.foundation.q3 d() {
            return this.f23751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {179, com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n116#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutate$2\n*L\n101#1:175,10\n*E\n"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f23755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f23757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f23758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m9 f23759g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f23760h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.foundation.q3 q3Var, m9 m9Var, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f23758f = q3Var;
            this.f23759g = m9Var;
            this.f23760h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f23758f, this.f23759g, this.f23760h, dVar);
            bVar.f23757e = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            m9 m9Var;
            Function1<kotlin.coroutines.d<? super R>, Object> function1;
            Throwable th2;
            a aVar3;
            m9 m9Var2;
            kotlinx.coroutines.sync.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f23756d;
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f23757e;
                        androidx.compose.foundation.q3 q3Var = this.f23758f;
                        CoroutineContext.Element element = s0Var.getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                        Intrinsics.checkNotNull(element);
                        aVar = new a(q3Var, (kotlinx.coroutines.p2) element);
                        this.f23759g.i(aVar);
                        aVar2 = this.f23759g.f23750b;
                        Function1<kotlin.coroutines.d<? super R>, Object> function2 = this.f23760h;
                        m9Var = this.f23759g;
                        this.f23757e = aVar;
                        this.f23753a = aVar2;
                        this.f23754b = function2;
                        this.f23755c = m9Var;
                        this.f23756d = 1;
                        if (aVar2.h(null, this) != objL) {
                            function1 = function2;
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m9Var2 = (m9) this.f23754b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f23753a;
                        aVar3 = (a) this.f23757e;
                        try {
                            ResultKt.m(obj);
                            androidx.compose.animation.core.z1.a(m9Var2.f23749a, aVar3, null);
                            aVar4.i(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            androidx.compose.animation.core.z1.a(m9Var2.f23749a, aVar3, null);
                            throw th2;
                        }
                    }
                    m9 m9Var3 = (m9) this.f23755c;
                    function1 = (Function1) this.f23754b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f23753a;
                    a aVar6 = (a) this.f23757e;
                    ResultKt.m(obj);
                    m9Var = m9Var3;
                    aVar = aVar6;
                    aVar2 = aVar5;
                    this.f23757e = aVar;
                    this.f23753a = aVar2;
                    this.f23754b = m9Var;
                    this.f23755c = null;
                    this.f23756d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar7 = aVar2;
                        obj = objInvoke;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        m9Var2 = m9Var;
                        androidx.compose.animation.core.z1.a(m9Var2.f23749a, aVar3, null);
                        aVar4.i(null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar3 = aVar;
                    m9Var2 = m9Var;
                    androidx.compose.animation.core.z1.a(m9Var2.f23749a, aVar3, null);
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {179, androidx.media2.widget.f.i.f59777h0}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n116#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutateWith$2\n*L\n140#1:175,10\n*E\n"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f23763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f23766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f23767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m9 f23768h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f23769i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f23770j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.foundation.q3 q3Var, m9 m9Var, Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, T t10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f23767g = q3Var;
            this.f23768h = m9Var;
            this.f23769i = function2;
            this.f23770j = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f23767g, this.f23768h, this.f23769i, this.f23770j, dVar);
            cVar.f23766f = obj;
            return cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            Function2 function2;
            m9 m9Var;
            Object obj2;
            Throwable th2;
            a aVar3;
            m9 m9Var2;
            kotlinx.coroutines.sync.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f23765e;
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f23766f;
                        androidx.compose.foundation.q3 q3Var = this.f23767g;
                        CoroutineContext.Element element = s0Var.getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                        Intrinsics.checkNotNull(element);
                        aVar = new a(q3Var, (kotlinx.coroutines.p2) element);
                        this.f23768h.i(aVar);
                        aVar2 = this.f23768h.f23750b;
                        function2 = this.f23769i;
                        Object obj3 = this.f23770j;
                        m9Var = this.f23768h;
                        this.f23766f = aVar;
                        this.f23761a = aVar2;
                        this.f23762b = function2;
                        this.f23763c = obj3;
                        this.f23764d = m9Var;
                        this.f23765e = 1;
                        if (aVar2.h(null, this) != objL) {
                            obj2 = obj3;
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m9Var2 = (m9) this.f23762b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f23761a;
                        aVar3 = (a) this.f23766f;
                        try {
                            ResultKt.m(obj);
                            androidx.compose.animation.core.z1.a(m9Var2.f23749a, aVar3, null);
                            aVar4.i(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            androidx.compose.animation.core.z1.a(m9Var2.f23749a, aVar3, null);
                            throw th2;
                        }
                    }
                    m9 m9Var3 = (m9) this.f23764d;
                    obj2 = this.f23763c;
                    function2 = (Function2) this.f23762b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f23761a;
                    a aVar6 = (a) this.f23766f;
                    ResultKt.m(obj);
                    m9Var = m9Var3;
                    aVar = aVar6;
                    aVar2 = aVar5;
                    this.f23766f = aVar;
                    this.f23761a = aVar2;
                    this.f23762b = m9Var;
                    this.f23763c = null;
                    this.f23764d = null;
                    this.f23765e = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar7 = aVar2;
                        obj = objInvoke;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        m9Var2 = m9Var;
                        androidx.compose.animation.core.z1.a(m9Var2.f23749a, aVar3, null);
                        aVar4.i(null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar3 = aVar;
                    m9Var2 = m9Var;
                    androidx.compose.animation.core.z1.a(m9Var2.f23749a, aVar3, null);
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

    public static /* synthetic */ Object e(m9 m9Var, androidx.compose.foundation.q3 q3Var, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return m9Var.d(q3Var, function1, dVar);
    }

    public static /* synthetic */ Object g(m9 m9Var, Object obj, androidx.compose.foundation.q3 q3Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return m9Var.f(obj, q3Var, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f23749a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.compose.animation.core.z1.a(this.f23749a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Nullable
    public final <R> Object d(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.t0.g(new b(q3Var, this, function1, null), dVar);
    }

    @Nullable
    public final <T, R> Object f(T t10, @NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.t0.g(new c(q3Var, this, function2, t10, null), dVar);
    }

    public final boolean h(@NotNull Function0<Unit> function0) {
        boolean zC = kotlinx.coroutines.sync.a.C2318a.c(this.f23750b, null, 1, null);
        if (!zC) {
            return zC;
        }
        try {
            function0.invoke();
            return zC;
        } finally {
            kotlinx.coroutines.sync.a.C2318a.d(this.f23750b, null, 1, null);
        }
    }
}
