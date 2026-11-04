package androidx.compose.material3.internal;

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
public final class s2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f29102c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f29103a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f29104b = kotlinx.coroutines.sync.g.b(false, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.foundation.q3 f29105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.p2 f29106b;

        public a(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull kotlinx.coroutines.p2 p2Var) {
            this.f29105a = q3Var;
            this.f29106b = p2Var;
        }

        public final boolean a(@NotNull a aVar) {
            return this.f29105a.compareTo(aVar.f29105a) >= 0;
        }

        public final void b() {
            kotlinx.coroutines.p2.a.b(this.f29106b, null, 1, null);
        }

        @NotNull
        public final kotlinx.coroutines.p2 c() {
            return this.f29106b;
        }

        @NotNull
        public final androidx.compose.foundation.q3 d() {
            return this.f29105a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {179, com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/internal/InternalMutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n116#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/internal/InternalMutatorMutex$mutate$2\n*L\n101#1:175,10\n*E\n"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f29110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f29111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f29112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s2 f29113g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f29114h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.foundation.q3 q3Var, s2 s2Var, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f29112f = q3Var;
            this.f29113g = s2Var;
            this.f29114h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f29112f, this.f29113g, this.f29114h, dVar);
            bVar.f29111e = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            s2 s2Var;
            Function1<kotlin.coroutines.d<? super R>, Object> function1;
            Throwable th2;
            a aVar3;
            s2 s2Var2;
            kotlinx.coroutines.sync.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f29110d;
            int i10 = 4 >> 0;
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f29111e;
                        androidx.compose.foundation.q3 q3Var = this.f29112f;
                        CoroutineContext.Element element = s0Var.getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                        Intrinsics.checkNotNull(element);
                        aVar = new a(q3Var, (kotlinx.coroutines.p2) element);
                        this.f29113g.i(aVar);
                        aVar2 = this.f29113g.f29104b;
                        Function1<kotlin.coroutines.d<? super R>, Object> function2 = this.f29114h;
                        s2Var = this.f29113g;
                        this.f29111e = aVar;
                        this.f29107a = aVar2;
                        this.f29108b = function2;
                        this.f29109c = s2Var;
                        this.f29110d = 1;
                        if (aVar2.h(null, this) != objL) {
                            function1 = function2;
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s2Var2 = (s2) this.f29108b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f29107a;
                        aVar3 = (a) this.f29111e;
                        try {
                            ResultKt.m(obj);
                            androidx.compose.animation.core.z1.a(s2Var2.f29103a, aVar3, null);
                            aVar4.i(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            androidx.compose.animation.core.z1.a(s2Var2.f29103a, aVar3, null);
                            throw th2;
                        }
                    }
                    s2 s2Var3 = (s2) this.f29109c;
                    function1 = (Function1) this.f29108b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f29107a;
                    a aVar6 = (a) this.f29111e;
                    ResultKt.m(obj);
                    s2Var = s2Var3;
                    aVar = aVar6;
                    aVar2 = aVar5;
                    this.f29111e = aVar;
                    this.f29107a = aVar2;
                    this.f29108b = s2Var;
                    this.f29109c = null;
                    this.f29110d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar7 = aVar2;
                        obj = objInvoke;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        s2Var2 = s2Var;
                        androidx.compose.animation.core.z1.a(s2Var2.f29103a, aVar3, null);
                        aVar4.i(null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar3 = aVar;
                    s2Var2 = s2Var;
                    androidx.compose.animation.core.z1.a(s2Var2.f29103a, aVar3, null);
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {179, androidx.media2.widget.f.i.f59777h0}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/internal/InternalMutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n116#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/internal/InternalMutatorMutex$mutateWith$2\n*L\n140#1:175,10\n*E\n"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f29118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f29119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f29120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f29121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ s2 f29122h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f29123i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f29124j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.foundation.q3 q3Var, s2 s2Var, Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, T t10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f29121g = q3Var;
            this.f29122h = s2Var;
            this.f29123i = function2;
            this.f29124j = t10;
            int i10 = 6 & 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f29121g, this.f29122h, this.f29123i, this.f29124j, dVar);
            cVar.f29120f = obj;
            return cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            Function2 function2;
            s2 s2Var;
            Object obj2;
            Throwable th2;
            a aVar3;
            s2 s2Var2;
            kotlinx.coroutines.sync.a aVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f29119e;
            int i10 = 2 << 1;
            try {
                try {
                    if (r10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f29120f;
                        androidx.compose.foundation.q3 q3Var = this.f29121g;
                        CoroutineContext.Element element = s0Var.getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                        Intrinsics.checkNotNull(element);
                        aVar = new a(q3Var, (kotlinx.coroutines.p2) element);
                        this.f29122h.i(aVar);
                        aVar2 = this.f29122h.f29104b;
                        function2 = this.f29123i;
                        Object obj3 = this.f29124j;
                        s2Var = this.f29122h;
                        this.f29120f = aVar;
                        this.f29115a = aVar2;
                        this.f29116b = function2;
                        this.f29117c = obj3;
                        this.f29118d = s2Var;
                        this.f29119e = 1;
                        if (aVar2.h(null, this) != objL) {
                            obj2 = obj3;
                        }
                        return objL;
                    }
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s2Var2 = (s2) this.f29116b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f29115a;
                        aVar3 = (a) this.f29120f;
                        try {
                            ResultKt.m(obj);
                            androidx.compose.animation.core.z1.a(s2Var2.f29103a, aVar3, null);
                            aVar4.i(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            androidx.compose.animation.core.z1.a(s2Var2.f29103a, aVar3, null);
                            throw th2;
                        }
                    }
                    s2 s2Var3 = (s2) this.f29118d;
                    obj2 = this.f29117c;
                    function2 = (Function2) this.f29116b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f29115a;
                    a aVar6 = (a) this.f29120f;
                    ResultKt.m(obj);
                    s2Var = s2Var3;
                    aVar = aVar6;
                    aVar2 = aVar5;
                    this.f29120f = aVar;
                    this.f29115a = aVar2;
                    this.f29116b = s2Var;
                    this.f29117c = null;
                    this.f29118d = null;
                    this.f29119e = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != objL) {
                        kotlinx.coroutines.sync.a aVar7 = aVar2;
                        obj = objInvoke;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        s2Var2 = s2Var;
                        androidx.compose.animation.core.z1.a(s2Var2.f29103a, aVar3, null);
                        aVar4.i(null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar3 = aVar;
                    s2Var2 = s2Var;
                    androidx.compose.animation.core.z1.a(s2Var2.f29103a, aVar3, null);
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

    public s2() {
        boolean z10 = false & true;
    }

    public static /* synthetic */ Object e(s2 s2Var, androidx.compose.foundation.q3 q3Var, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return s2Var.d(q3Var, function1, dVar);
    }

    public static /* synthetic */ Object g(s2 s2Var, Object obj, androidx.compose.foundation.q3 q3Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return s2Var.f(obj, q3Var, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f29103a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.compose.animation.core.z1.a(this.f29103a, aVar2, aVar));
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
        boolean zC = kotlinx.coroutines.sync.a.C2318a.c(this.f29104b, null, 1, null);
        if (!zC) {
            return zC;
        }
        try {
            function0.invoke();
            kotlinx.coroutines.sync.a.C2318a.d(this.f29104b, null, 1, null);
            return zC;
        } catch (Throwable th2) {
            kotlinx.coroutines.sync.a.C2318a.d(this.f29104b, null, 1, null);
            throw th2;
        }
    }
}
