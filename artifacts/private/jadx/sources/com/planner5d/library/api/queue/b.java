package com.planner5d.library.api.queue;

import androidx.annotation.l1;
import com.facebook.internal.w0;
import com.planner5d.library.services.utility.g;
import com.planner5d.library.services.utility.p2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.k0;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.sync.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f142292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f142293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f142294c = new Object();

    public static final class a extends Exception {
    }

    /* JADX INFO: renamed from: com.planner5d.library.api.queue.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1510b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142295a;

        static {
            int[] iArr = new int[com.planner5d.library.api.queue.a.values().length];
            try {
                iArr[com.planner5d.library.api.queue.a.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.api.queue.a.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f142295a = iArr;
        }
    }

    @f(c = "com.planner5d.library.api.queue.QueuedPermitsExecutor", f = "QueuedPermitsExecutor.kt", i = {0, 0, 0, 1, 1, 1}, l = {29, 32, 32}, m = "enqueueForExecution", n = {"this", "permits", w0.f100156c1, "this", "permits", w0.f100156c1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f142297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f142298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f142299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f142300e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f142302g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f142300e = obj;
            this.f142302g |= Integer.MIN_VALUE;
            return b.this.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @f(c = "com.planner5d.library.api.queue.QueuedPermitsExecutor$enqueueForExecution$2", f = "QueuedPermitsExecutor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    static final class d<R> extends o implements Function2<s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142303a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.api.queue.a f142305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f142306d;

        @f(c = "com.planner5d.library.api.queue.QueuedPermitsExecutor$enqueueForExecution$2$1", f = "QueuedPermitsExecutor.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function1<kotlin.coroutines.d<? super R>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f142307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f142308b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f142308b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f142308b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f142307a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super R>, Object> function1 = this.f142308b;
                this.f142307a = 1;
                Object objInvoke = function1.invoke(this);
                return objInvoke == objL ? objL : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super R> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(com.planner5d.library.api.queue.a aVar, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f142305c = aVar;
            this.f142306d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new d(this.f142305c, this.f142306d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142303a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g gVarD = b.this.d();
            int iC = b.this.c(this.f142305c);
            a aVar = new a(this.f142306d, null);
            this.f142303a = 1;
            Object objD = gVarD.d(iC, aVar, this);
            return objD == objL ? objL : objD;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public b(int i10) {
        this.f142292a = i10;
        this.f142293b = new g(l.b(Math.max(1, i10), 0, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c(com.planner5d.library.api.queue.a aVar) {
        int i10 = C1510b.f142295a[aVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return this.f142292a;
        }
        throw new k0();
    }

    @l1
    public static /* synthetic */ void e() {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final <R> Object b(@NotNull com.planner5d.library.api.queue.a aVar, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super R> dVar) throws a {
        c cVar;
        b bVar;
        c3 c3Var;
        com.planner5d.library.api.queue.a aVar2;
        Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function2;
        Object objH;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f142302g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f142302g = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objB = cVar.f142300e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f142302g;
        int i12 = 2 >> 3;
        if (i11 == 0) {
            ResultKt.m(objB);
            p2.a aVar3 = p2.f229701c;
            Object obj = this.f142294c;
            cVar.f142296a = this;
            cVar.f142297b = aVar;
            cVar.f142298c = function1;
            cVar.f142302g = 1;
            objB = aVar3.b(obj, cVar);
            if (objB != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            function1 = (Function1) cVar.f142298c;
            aVar = (com.planner5d.library.api.queue.a) cVar.f142297b;
            this = (b) cVar.f142296a;
            ResultKt.m(objB);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objB);
                return objB;
            }
            c3Var = (c3) cVar.f142299d;
            function2 = (Function1) cVar.f142298c;
            aVar2 = (com.planner5d.library.api.queue.a) cVar.f142297b;
            bVar = (b) cVar.f142296a;
            ResultKt.m(objB);
        }
        CoroutineContext coroutineContextPlus = c3Var.plus((CoroutineContext) objB);
        d dVar2 = bVar.new d(aVar2, function2, null);
        cVar.f142296a = null;
        cVar.f142297b = null;
        cVar.f142298c = null;
        cVar.f142299d = null;
        cVar.f142302g = 3;
        objH = i.h(coroutineContextPlus, dVar2, cVar);
        if (objH != objL) {
            return objL;
        }
        return objH;
        if (((Boolean) objB).booleanValue()) {
            throw new a();
        }
        c3 c3Var2 = c3.f313552a;
        p2.a aVar4 = p2.f229701c;
        Object obj2 = this.f142294c;
        cVar.f142296a = this;
        cVar.f142297b = aVar;
        cVar.f142298c = function1;
        cVar.f142299d = c3Var2;
        cVar.f142302g = 2;
        Object objA = aVar4.a(obj2, cVar);
        if (objA != objL) {
            bVar = this;
            c3Var = c3Var2;
            objB = objA;
            Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function3 = function1;
            aVar2 = aVar;
            function2 = function3;
            CoroutineContext coroutineContextPlus2 = c3Var.plus((CoroutineContext) objB);
            d dVar3 = bVar.new d(aVar2, function2, null);
            cVar.f142296a = null;
            cVar.f142297b = null;
            cVar.f142298c = null;
            cVar.f142299d = null;
            cVar.f142302g = 3;
            objH = i.h(coroutineContextPlus2, dVar3, cVar);
            if (objH != objL) {
                return objH;
            }
        }
        return objL;
    }

    @NotNull
    public final g d() {
        return this.f142293b;
    }
}
