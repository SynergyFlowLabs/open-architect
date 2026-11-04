package androidx.room;

import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRoomDatabaseExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,239:1\n314#2,11:240\n*S KotlinDebug\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n*L\n92#1:240,11\n*E\n"})
@oj.i(name = "RoomDatabaseKt")
public final class c2 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", f = "RoomDatabaseExt.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super Set<? extends String>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f74689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f74690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b2 f74691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String[] f74692e;

        /* JADX INFO: renamed from: androidx.room.c2$a$a, reason: collision with other inner class name */
        static final class C0736a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.p2 f74693a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0736a(kotlinx.coroutines.p2 p2Var) {
                super(0);
                this.f74693a = p2Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.p2.a.b(this.f74693a, null, 1, null);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", f = "RoomDatabaseExt.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f74694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b2 f74695b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f74696c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f74697d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l0<Set<String>> f74698e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String[] f74699f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f74700g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(b2 b2Var, c cVar, boolean z10, kotlinx.coroutines.channels.l0<? super Set<String>> l0Var, String[] strArr, AtomicBoolean atomicBoolean, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f74695b = b2Var;
                this.f74696c = cVar;
                this.f74697d = z10;
                this.f74698e = l0Var;
                this.f74699f = strArr;
                this.f74700g = atomicBoolean;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f74695b, this.f74696c, this.f74697d, this.f74698e, this.f74699f, this.f74700g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f74694a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        this.f74695b.getInvalidationTracker().c(this.f74696c);
                        if (this.f74697d) {
                            this.f74698e.p(ArraysKt.toSet(this.f74699f));
                        }
                        this.f74700g.set(false);
                        this.f74694a = 1;
                        if (kotlinx.coroutines.d1.a(this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    throw new kotlin.a0();
                } catch (Throwable th2) {
                    this.f74695b.getInvalidationTracker().t(this.f74696c);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public static final class c extends l0.c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f74701b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l0<Set<String>> f74702c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(String[] strArr, AtomicBoolean atomicBoolean, kotlinx.coroutines.channels.l0<? super Set<String>> l0Var) {
                super(strArr);
                this.f74701b = atomicBoolean;
                this.f74702c = l0Var;
            }

            @Override // androidx.room.l0.c
            public void c(@NotNull Set<String> set) {
                if (this.f74701b.get()) {
                    return;
                }
                this.f74702c.p(set);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, b2 b2Var, String[] strArr, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f74690c = z10;
            this.f74691d = b2Var;
            this.f74692e = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f74690c, this.f74691d, this.f74692e, dVar);
            aVar.f74689b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.l0<? super Set<? extends String>> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke2((kotlinx.coroutines.channels.l0<? super Set<String>>) l0Var, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.e eVarA;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f74688a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f74689b;
                AtomicBoolean atomicBoolean = new AtomicBoolean(this.f74690c);
                c cVar = new c(this.f74692e, atomicBoolean, l0Var);
                p2 p2Var = (p2) l0Var.getCoroutineContext().get(p2.f75037c);
                if (p2Var == null || (eVarA = p2Var.b()) == null) {
                    eVarA = k.a(this.f74691d);
                }
                C0736a c0736a = new C0736a(kotlinx.coroutines.k.f(l0Var, eVarA, null, new b(this.f74691d, cVar, this.f74690c, l0Var, this.f74692e, atomicBoolean, null), 2, null));
                this.f74688a = 1;
                if (kotlinx.coroutines.channels.j0.b(l0Var, c0736a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull kotlinx.coroutines.channels.l0<? super Set<String>> l0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f74703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<R> f74704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b2 f74705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> f74706d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f74707a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f74708b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b2 f74709c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.n<R> f74710d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> f74711e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b2 b2Var, kotlinx.coroutines.n<? super R> nVar, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f74709c = b2Var;
                this.f74710d = nVar;
                this.f74711e = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f74709c, this.f74710d, this.f74711e, dVar);
                aVar.f74708b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.d dVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f74707a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    CoroutineContext.Element element = ((kotlinx.coroutines.s0) this.f74708b).getCoroutineContext().get(kotlin.coroutines.e.K2);
                    Intrinsics.checkNotNull(element);
                    CoroutineContext coroutineContextC = c2.c(this.f74709c, (kotlin.coroutines.e) element);
                    kotlin.coroutines.d dVar2 = this.f74710d;
                    Result.a aVar = Result.Companion;
                    Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> function2 = this.f74711e;
                    this.f74708b = dVar2;
                    this.f74707a = 1;
                    obj = kotlinx.coroutines.i.h(coroutineContextC, function2, this);
                    if (obj == objL) {
                        return objL;
                    }
                    dVar = dVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (kotlin.coroutines.d) this.f74708b;
                    ResultKt.m(obj);
                }
                dVar.resumeWith(Result.m785constructorimpl(obj));
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(CoroutineContext coroutineContext, kotlinx.coroutines.n<? super R> nVar, b2 b2Var, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
            this.f74703a = coroutineContext;
            this.f74704b = nVar;
            this.f74705c = b2Var;
            this.f74706d = function2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                boolean z10 = true | false;
                kotlinx.coroutines.i.f(this.f74703a.minusKey(kotlin.coroutines.e.K2), new a(this.f74705c, this.f74704b, this.f74706d, null));
            } catch (Throwable th2) {
                this.f74704b.c(th2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f74713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b2 f74714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f74715d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(b2 b2Var, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f74714c = b2Var;
            this.f74715d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f74714c, this.f74715d, dVar);
            cVar.f74713b = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            p2 p2Var;
            Throwable th2;
            p2 p2Var2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f74712a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    CoroutineContext.Element element = ((kotlinx.coroutines.s0) this.f74713b).getCoroutineContext().get(p2.f75037c);
                    Intrinsics.checkNotNull(element);
                    p2Var = (p2) element;
                    p2Var.a();
                    try {
                        this.f74714c.beginTransaction();
                        try {
                            Function1<kotlin.coroutines.d<? super R>, Object> function1 = this.f74715d;
                            this.f74713b = p2Var;
                            this.f74712a = 1;
                            Object objInvoke = function1.invoke(this);
                            if (objInvoke == objL) {
                                return objL;
                            }
                            p2Var2 = p2Var;
                            obj = objInvoke;
                        } catch (Throwable th3) {
                            th2 = th3;
                            this.f74714c.endTransaction();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        p2Var.d();
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p2 p2Var3 = (p2) this.f74713b;
                    try {
                        ResultKt.m(obj);
                        p2Var2 = p2Var3;
                    } catch (Throwable th5) {
                        th2 = th5;
                        this.f74714c.endTransaction();
                        throw th2;
                    }
                }
                this.f74714c.setTransactionSuccessful();
                this.f74714c.endTransaction();
                p2Var2.d();
                return obj;
            } catch (Throwable th6) {
                th = th6;
                p2Var = objL;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super R> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext c(b2 b2Var, kotlin.coroutines.e eVar) {
        p2 p2Var = new p2(eVar);
        return eVar.plus(p2Var).plus(s3.a(b2Var.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(p2Var))));
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<Set<String>> d(@NotNull b2 b2Var, @NotNull String[] strArr, boolean z10) {
        return kotlinx.coroutines.flow.k.t(new a(z10, b2Var, strArr, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i e(b2 b2Var, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return d(b2Var, strArr, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object f(b2 b2Var, CoroutineContext coroutineContext, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        try {
            b2Var.getTransactionExecutor().execute(new b(coroutineContext, pVar, b2Var, function2));
        } catch (RejectedExecutionException e10) {
            pVar.c(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Nullable
    public static final <R> Object g(@NotNull b2 b2Var, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        c cVar = new c(b2Var, function1, null);
        p2 p2Var = (p2) dVar.getContext().get(p2.f75037c);
        kotlin.coroutines.e eVarB = p2Var != null ? p2Var.b() : null;
        return eVarB != null ? kotlinx.coroutines.i.h(eVarB, cVar, dVar) : f(b2Var, dVar.getContext(), cVar, dVar);
    }
}
