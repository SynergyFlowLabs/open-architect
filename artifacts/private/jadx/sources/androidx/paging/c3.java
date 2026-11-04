package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f71611b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f71612c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f71613a;

    private static final class a extends CancellationException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c3 f71614a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull c3 runner) {
            super("Cancelled isolated runner");
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.f71614a = runner;
        }

        @NotNull
        public final c3 a() {
            return this.f71614a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @SourceDebugExtension({"SMAP\nSingleRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,125:1\n120#2,10:126\n120#2,10:136\n*S KotlinDebug\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n*L\n94#1:126,10\n113#1:136,10\n*E\n"})
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c3 f71615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f71616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.sync.a f71617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private kotlinx.coroutines.p2 f71618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f71619e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0}, l = {131}, m = "onFinish", n = {"this", "job", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f71620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f71621b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f71622c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f71623d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f71625f;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71623d = obj;
                this.f71625f |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {131, 102}, m = "tryEnqueue", n = {"this", "job", "$this$withLock_u24default$iv", "priority", "this", "job", "$this$withLock_u24default$iv", "priority"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f71626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f71627b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f71628c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f71629d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f71630e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f71632g;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71630e = obj;
                this.f71632g |= Integer.MIN_VALUE;
                return c.this.b(0, null, this);
            }
        }

        public c(@NotNull c3 singleRunner, boolean z10) {
            Intrinsics.checkNotNullParameter(singleRunner, "singleRunner");
            this.f71615a = singleRunner;
            this.f71616b = z10;
            this.f71617c = kotlinx.coroutines.sync.g.b(false, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Nullable
        public final Object a(@NotNull kotlinx.coroutines.p2 p2Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            kotlinx.coroutines.sync.a aVar2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f71625f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f71625f = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f71623d;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f71625f;
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar2 = this.f71617c;
                aVar.f71620a = this;
                aVar.f71621b = p2Var;
                aVar.f71622c = aVar2;
                aVar.f71625f = 1;
                if (aVar2.h(null, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) aVar.f71622c;
                p2Var = (kotlinx.coroutines.p2) aVar.f71621b;
                c cVar = (c) aVar.f71620a;
                ResultKt.m(obj);
                aVar2 = aVar3;
                this = cVar;
            }
            try {
                if (p2Var == this.f71618d) {
                    this.f71618d = null;
                }
                return Unit.f312394a;
            } finally {
                aVar2.i(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Nullable
        public final Object b(int i10, @NotNull kotlinx.coroutines.p2 p2Var, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
            b bVar;
            kotlinx.coroutines.sync.a aVar;
            c cVar;
            int i11;
            kotlinx.coroutines.sync.a aVar2;
            int i12;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i13 = bVar.f71632g;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    bVar.f71632g = i13 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f71630e;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i14 = bVar.f71632g;
            boolean z10 = true;
            int i15 = 7 | 0;
            try {
                if (i14 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f71617c;
                    bVar.f71626a = this;
                    bVar.f71627b = p2Var;
                    bVar.f71628c = aVar;
                    bVar.f71629d = i10;
                    bVar.f71632g = 1;
                    if (aVar.h(null, bVar) != objL) {
                    }
                    return objL;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = bVar.f71629d;
                    aVar2 = (kotlinx.coroutines.sync.a) bVar.f71628c;
                    p2Var = (kotlinx.coroutines.p2) bVar.f71627b;
                    cVar = (c) bVar.f71626a;
                    try {
                        ResultKt.m(obj);
                        aVar = aVar2;
                        i10 = i11;
                        this = cVar;
                        this.f71618d = p2Var;
                        this.f71619e = i10;
                        aVar2 = aVar;
                        Boolean boolA = kotlin.coroutines.jvm.internal.b.a(z10);
                        aVar2.i(null);
                        return boolA;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.i(null);
                        throw th;
                    }
                }
                i10 = bVar.f71629d;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) bVar.f71628c;
                p2Var = (kotlinx.coroutines.p2) bVar.f71627b;
                c cVar2 = (c) bVar.f71626a;
                ResultKt.m(obj);
                aVar = aVar3;
                this = cVar2;
                kotlinx.coroutines.p2 p2Var2 = this.f71618d;
                if (p2Var2 == null || !p2Var2.isActive() || (i12 = this.f71619e) < i10 || (i12 == i10 && this.f71616b)) {
                    if (p2Var2 != null) {
                        p2Var2.e(new a(this.f71615a));
                    }
                    if (p2Var2 != null) {
                        bVar.f71626a = this;
                        bVar.f71627b = p2Var;
                        bVar.f71628c = aVar;
                        bVar.f71629d = i10;
                        bVar.f71632g = 2;
                        if (p2Var2.d1(bVar) != objL) {
                            cVar = this;
                            i11 = i10;
                            aVar2 = aVar;
                            aVar = aVar2;
                            i10 = i11;
                            this = cVar;
                        }
                        return objL;
                    }
                    this.f71618d = p2Var;
                    this.f71619e = i10;
                } else {
                    z10 = false;
                }
                aVar2 = aVar;
                Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(z10);
                aVar2.i(null);
                return boolA2;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                aVar2.i(null);
                throw th;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", i = {0}, l = {49}, m = "runInIsolation", n = {"this"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f71633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f71634b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f71636d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f71634b = obj;
            this.f71636d |= Integer.MIN_VALUE;
            return c3.this.b(0, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", i = {0, 1}, l = {53, com.planner5d.library.engine.input.f.b.D0, 61, 61}, m = "invokeSuspend", n = {"myJob", "myJob"}, s = {"L$0", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f71638b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f71640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f71641e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(int i10, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f71640d = i10;
            this.f71641e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            e eVar = c3.this.new e(this.f71640d, this.f71641e, dVar);
            eVar.f71638b = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v16, types: [androidx.paging.c3$c] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.p2] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.p2] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.c3$c] */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.paging.c3$e, java.lang.Object, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r9v1, types: [androidx.paging.c3$e, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            kotlinx.coroutines.p2 p2Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f71637a;
            int i10 = 4;
            try {
                if (r10 == 0) {
                    ResultKt.m(obj);
                    CoroutineContext.Element element = ((kotlinx.coroutines.s0) this.f71638b).getCoroutineContext().get(kotlinx.coroutines.p2.M2);
                    if (element == null) {
                        throw new IllegalStateException("Internal error. coroutineScope should've created a job.");
                    }
                    kotlinx.coroutines.p2 p2Var2 = (kotlinx.coroutines.p2) element;
                    c cVar = c3.this.f71613a;
                    int i11 = this.f71640d;
                    this.f71638b = p2Var2;
                    this.f71637a = 1;
                    Object objB = cVar.b(i11, p2Var2, this);
                    if (objB != objL) {
                        p2Var = p2Var2;
                        obj = objB;
                    }
                    r10 = p2Var;
                    return objL;
                }
                if (r10 == 1) {
                    kotlinx.coroutines.p2 p2Var3 = (kotlinx.coroutines.p2) this.f71638b;
                    ResultKt.m(obj);
                    p2Var = p2Var3;
                } else if (r10 == 2) {
                    kotlinx.coroutines.p2 p2Var4 = (kotlinx.coroutines.p2) this.f71638b;
                    ResultKt.m(obj);
                    r10 = p2Var4;
                    r10 = p2Var;
                    ?? r11 = c3.this.f71613a;
                    i10 = 0;
                    this.f71638b = null;
                    this.f71637a = 3;
                    this = r11.a(r10, this);
                    if (this == objL) {
                        r10 = p2Var;
                        return objL;
                    }
                } else {
                    if (r10 != 3) {
                        if (r10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.f71638b;
                        ResultKt.m(obj);
                        throw th2;
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
                if (((Boolean) obj).booleanValue()) {
                    Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f71641e;
                    this.f71638b = p2Var;
                    this.f71637a = 2;
                    if (function1.invoke(this) != objL) {
                        r10 = p2Var;
                        ?? r12 = c3.this.f71613a;
                        i10 = 0;
                        this.f71638b = null;
                        this.f71637a = 3;
                        this = r12.a(r10, this);
                        if (this == objL) {
                        }
                    }
                    r10 = p2Var;
                    return objL;
                }
                return Unit.f312394a;
            } catch (Throwable th3) {
                ?? r13 = c3.this.f71613a;
                this.f71638b = th3;
                this.f71637a = i10;
                if (r13.a(r10, this) != objL) {
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c3() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object c(c3 c3Var, int i10, Function1 function1, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return c3Var.b(i10, function1, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.paging.c3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Nullable
    public final Object b(int i10, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.f71636d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f71636d = i11 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f71634b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = dVar2.f71636d;
        try {
            if (i12 == 0) {
                ResultKt.m(obj);
                e eVar = new e(i10, function1, null);
                dVar2.f71633a = this;
                dVar2.f71636d = 1;
                Object objG = kotlinx.coroutines.t0.g(eVar, dVar2);
                this = objG;
                if (objG == objL) {
                    return objL;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3 c3Var = (c3) dVar2.f71633a;
                ResultKt.m(obj);
                this = c3Var;
            }
        } catch (a e10) {
            if (e10.a() != this) {
                throw e10;
            }
        }
        return Unit.f312394a;
    }

    public c3(boolean z10) {
        this.f71613a = new c(this, z10);
    }

    public /* synthetic */ c3(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
