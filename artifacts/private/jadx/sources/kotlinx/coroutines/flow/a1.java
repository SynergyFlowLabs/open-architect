package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,433:1\n14#2:434\n14#2:442\n29#3:435\n29#3:439\n16#4:436\n16#4:440\n13402#5,2:437\n375#6:441\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n320#1:434\n401#1:442\n329#1:435\n357#1:439\n329#1:436\n357#1:440\n353#1:437,2\n390#1:441\n*E\n"})
final class a1<T> extends kotlinx.coroutines.flow.internal.b<c1> implements k0<T>, c<T>, kotlinx.coroutines.flow.internal.r<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f314050f = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f314051e;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {389, 401, com.rabbitmq.client.a.f264843n}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f314054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f314055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f314056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f314057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a1<T> f314058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f314059h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a1<T> a1Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f314058g = a1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314057f = obj;
            this.f314059h |= Integer.MIN_VALUE;
            return this.f314058g.collect(null, this);
        }
    }

    public a1(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    private final /* synthetic */ Object q() {
        return this._state$volatile;
    }

    private final /* synthetic */ void s(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean t(Object obj, Object obj2) {
        int i10;
        c1[] c1VarArrN;
        synchronized (this) {
            try {
                Object obj3 = f314050f.get(this);
                if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                    return false;
                }
                if (Intrinsics.areEqual(obj3, obj2)) {
                    return true;
                }
                f314050f.set(this, obj2);
                int i11 = this.f314051e;
                if ((i11 & 1) != 0) {
                    this.f314051e = i11 + 2;
                    return true;
                }
                int i12 = i11 + 1;
                this.f314051e = i12;
                c1[] c1VarArrN2 = n();
                Unit unit = Unit.f312394a;
                while (true) {
                    c1[] c1VarArr = c1VarArrN2;
                    if (c1VarArr != null) {
                        for (c1 c1Var : c1VarArr) {
                            if (c1Var != null) {
                                c1Var.g();
                            }
                        }
                    }
                    synchronized (this) {
                        try {
                            i10 = this.f314051e;
                            if (i10 == i12) {
                                this.f314051e = i12 + 1;
                                return true;
                            }
                            c1VarArrN = n();
                            Unit unit2 = Unit.f312394a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    c1VarArrN2 = c1VarArrN;
                    i12 = i10;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.o0
    @NotNull
    public List<T> a() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.internal.r
    @NotNull
    public i<T> b(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return b1.d(this, coroutineContext, i10, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[Catch: all -> 0x0094, PHI: r2 r6 r11 r12 r13
      0x00cf: PHI (r2v7 ??) = (r2v18 ??), (r2v19 ??), (r2v20 ??), (r2v21 ??) binds: [B:52:0x0110, B:54:0x0123, B:35:0x00be, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r6v3 ??) = (r6v11 ??), (r6v12 ??), (r6v6 ??), (r6v13 ??) binds: [B:52:0x0110, B:54:0x0123, B:35:0x00be, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r11v7 'this' kotlinx.coroutines.flow.a1<T>) = 
      (r11v6 'this' kotlinx.coroutines.flow.a1<T>)
      (r11v6 'this' kotlinx.coroutines.flow.a1<T>)
      (r11v9 'this' kotlinx.coroutines.flow.a1<T>)
      (r11v15 'this' kotlinx.coroutines.flow.a1<T>)
     binds: [B:52:0x0110, B:54:0x0123, B:35:0x00be, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r12v4 kotlinx.coroutines.p2) = 
      (r12v3 kotlinx.coroutines.p2)
      (r12v3 kotlinx.coroutines.p2)
      (r12v7 kotlinx.coroutines.p2)
      (r12v13 kotlinx.coroutines.p2)
     binds: [B:52:0x0110, B:54:0x0123, B:35:0x00be, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r13v10 java.lang.Object) = (r13v9 java.lang.Object), (r13v9 java.lang.Object), (r13v20 java.lang.Object), (r13v22 java.lang.Object) binds: [B:52:0x0110, B:54:0x0123, B:35:0x00be, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0094, blocks: (B:36:0x00cf, B:38:0x00da, B:40:0x00df, B:51:0x010a, B:53:0x0112, B:42:0x00e5, B:46:0x00ef, B:25:0x008f, B:35:0x00be, B:30:0x00a6, B:32:0x00ab), top: B:58:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00da A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:36:0x00cf, B:38:0x00da, B:40:0x00df, B:51:0x010a, B:53:0x0112, B:42:0x00e5, B:46:0x00ef, B:25:0x008f, B:35:0x00be, B:30:0x00a6, B:32:0x00ab), top: B:58:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00df A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:36:0x00cf, B:38:0x00da, B:40:0x00df, B:51:0x010a, B:53:0x0112, B:42:0x00e5, B:46:0x00ef, B:25:0x008f, B:35:0x00be, B:30:0x00a6, B:32:0x00ab), top: B:58:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:36:0x00cf, B:38:0x00da, B:40:0x00df, B:51:0x010a, B:53:0x0112, B:42:0x00e5, B:46:0x00ef, B:25:0x008f, B:35:0x00be, B:30:0x00a6, B:32:0x00ab), top: B:58:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.flow.internal.d] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlinx.coroutines.flow.c1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0110 -> B:36:0x00cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0123 -> B:36:0x00cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.o0, kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<?> r13) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a1.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.k0
    public boolean compareAndSet(T t10, T t11) {
        if (t10 == null) {
            t10 = (T) kotlinx.coroutines.flow.internal.u.f314619a;
        }
        if (t11 == null) {
            t11 = (T) kotlinx.coroutines.flow.internal.u.f314619a;
        }
        return t(t10, t11);
    }

    @Override // kotlinx.coroutines.flow.j0
    public void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.j0, kotlinx.coroutines.flow.j
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        setValue(t10);
        return Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.j0
    public boolean f(T t10) {
        setValue(t10);
        return true;
    }

    @Override // kotlinx.coroutines.flow.k0, kotlinx.coroutines.flow.z0
    public T getValue() {
        kotlinx.coroutines.internal.z0 z0Var = kotlinx.coroutines.flow.internal.u.f314619a;
        T t10 = (T) f314050f.get(this);
        if (t10 == z0Var) {
            t10 = null;
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.b
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public c1 h() {
        return new c1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.b
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public c1[] j(int i10) {
        return new c1[i10];
    }

    @Override // kotlinx.coroutines.flow.k0
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) kotlinx.coroutines.flow.internal.u.f314619a;
        }
        t(null, t10);
    }
}
