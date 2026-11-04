package androidx.datastore.core;

import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n120#2,10:549\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n*L\n130#1:539,10\n148#1:549,10\n*E\n"})
public final class n<T> implements androidx.datastore.core.l<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f49537m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f49538n = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q0<T> f49539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.h<T> f49540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f49541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<T> f49542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f49543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private p2 f49545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.o<T> f49546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n<T>.b f49547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlin.f0<r0<T>> f49548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f49549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final n0<z.b<T>> f49550l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends k0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private List<? extends Function2<? super androidx.datastore.core.v<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> f49551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f49552d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", i = {0, 1}, l = {430, 434}, m = "doRun", n = {"this", "this"}, s = {"L$0", "L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f49553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f49554b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n<T>.b f49555c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f49556d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n<T>.b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f49555c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f49554b = obj;
                this.f49556d |= Integer.MIN_VALUE;
                return this.f49555c.b(this);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.core.n$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {437, com.facebook.internal.p.f100032p, 546, 468}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", MetricTracker.Place.API, "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
        @SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n1855#2,2:539\n120#3,10:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n*L\n458#1:539,2\n461#1:541,10\n*E\n"})
        static final class C0433b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super androidx.datastore.core.i<T>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f49557a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f49558b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f49559c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f49560d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f49561e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f49562f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f49563g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ n<T> f49564h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ n<T>.b f49565i;

            /* JADX INFO: renamed from: androidx.datastore.core.n$b$b$a */
            @SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n*L\n441#1:539,10\n*E\n"})
            public static final class a implements androidx.datastore.core.v<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.sync.a f49566a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ i1.a f49567b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ i1.h<T> f49568c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ n<T> f49569d;

                /* JADX INFO: renamed from: androidx.datastore.core.n$b$b$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", i = {0, 0, 1, 2, 2}, l = {544, 447, 449}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
                static final class C0434a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f49570a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f49571b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f49572c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f49573d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f49574e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    /* synthetic */ Object f49575f;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    int f49577h;

                    C0434a(kotlin.coroutines.d<? super C0434a> dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f49575f = obj;
                        this.f49577h |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(kotlinx.coroutines.sync.a aVar, i1.a aVar2, i1.h<T> hVar, n<T> nVar) {
                    this.f49566a = aVar;
                    this.f49567b = aVar2;
                    this.f49568c = hVar;
                    this.f49569d = nVar;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00d5 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #2 {all -> 0x0068, blocks: (B:22:0x0063, B:36:0x00cc, B:38:0x00d5), top: B:56:0x0063 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
                /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
                /* JADX WARN: Code duplicated, block: B:7:0x001b  */
                @Override // androidx.datastore.core.v
                @Nullable
                public Object a(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
                    C0434a c0434a;
                    kotlinx.coroutines.sync.a aVar;
                    i1.a aVar2;
                    i1.h<T> hVar;
                    n nVar;
                    n nVar2;
                    kotlinx.coroutines.sync.a aVar3;
                    kotlinx.coroutines.sync.a aVar4;
                    i1.h<T> hVar2;
                    n nVar3;
                    T t10;
                    if (dVar instanceof C0434a) {
                        c0434a = (C0434a) dVar;
                        int i10 = c0434a.f49577h;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0434a.f49577h = i10 - Integer.MIN_VALUE;
                        } else {
                            c0434a = new C0434a(dVar);
                        }
                    } else {
                        c0434a = new C0434a(dVar);
                    }
                    Object obj = c0434a.f49575f;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c0434a.f49577h;
                    boolean z10 = true | true;
                    try {
                        if (i11 == 0) {
                            ResultKt.m(obj);
                            aVar = this.f49566a;
                            aVar2 = this.f49567b;
                            hVar = this.f49568c;
                            nVar = (n<T>) this.f49569d;
                            c0434a.f49570a = function2;
                            c0434a.f49571b = aVar;
                            c0434a.f49572c = aVar2;
                            c0434a.f49573d = hVar;
                            c0434a.f49574e = nVar;
                            c0434a.f49577h = 1;
                            if (aVar.h(null, c0434a) != objL) {
                            }
                            nVar2 = nVar;
                            return objL;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t10 = (T) c0434a.f49572c;
                                hVar2 = (i1.h) c0434a.f49571b;
                                aVar3 = (kotlinx.coroutines.sync.a) c0434a.f49570a;
                                try {
                                    ResultKt.m(obj);
                                    hVar2.f312751a = t10;
                                    T t11 = hVar2.f312751a;
                                    aVar3.i(null);
                                    return t11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar3.i(null);
                                    throw th;
                                }
                            }
                            n nVar4 = (n) c0434a.f49572c;
                            hVar2 = (i1.h) c0434a.f49571b;
                            aVar4 = (kotlinx.coroutines.sync.a) c0434a.f49570a;
                            try {
                                ResultKt.m(obj);
                                nVar3 = nVar4;
                                if (!Intrinsics.areEqual(obj, hVar2.f312751a)) {
                                    c0434a.f49570a = aVar4;
                                    c0434a.f49571b = hVar2;
                                    c0434a.f49572c = obj;
                                    c0434a.f49577h = 3;
                                    if (nVar3.E(obj, false, c0434a) != objL) {
                                        t10 = (T) obj;
                                        aVar3 = aVar4;
                                        hVar2.f312751a = t10;
                                    }
                                    nVar2 = nVar;
                                    return objL;
                                }
                                aVar3 = aVar4;
                                T t12 = hVar2.f312751a;
                                aVar3.i(null);
                                return t12;
                            } catch (Throwable th3) {
                                th = th3;
                                aVar3 = aVar4;
                                aVar3.i(null);
                                throw th;
                            }
                        }
                        n nVar5 = (n<T>) ((n) c0434a.f49574e);
                        i1.h<T> hVar3 = (i1.h) c0434a.f49573d;
                        aVar2 = (i1.a) c0434a.f49572c;
                        kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) c0434a.f49571b;
                        Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function3 = (Function2) c0434a.f49570a;
                        ResultKt.m(obj);
                        hVar = hVar3;
                        function2 = function3;
                        aVar = aVar5;
                        nVar2 = nVar5;
                        nVar2 = nVar;
                        if (aVar2.f312744a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        T t13 = hVar.f312751a;
                        c0434a.f49570a = aVar;
                        c0434a.f49571b = hVar;
                        c0434a.f49572c = nVar2;
                        c0434a.f49573d = null;
                        c0434a.f49574e = null;
                        c0434a.f49577h = 2;
                        Object objInvoke = function2.invoke(t13, c0434a);
                        if (objInvoke != objL) {
                            aVar4 = aVar;
                            obj = objInvoke;
                            hVar2 = hVar;
                            nVar3 = nVar2;
                            if (!Intrinsics.areEqual(obj, hVar2.f312751a)) {
                                c0434a.f49570a = aVar4;
                                c0434a.f49571b = hVar2;
                                c0434a.f49572c = obj;
                                c0434a.f49577h = 3;
                                if (nVar3.E(obj, false, c0434a) != objL) {
                                    t10 = (T) obj;
                                    aVar3 = aVar4;
                                    hVar2.f312751a = t10;
                                }
                            } else {
                                aVar3 = aVar4;
                            }
                            T t14 = hVar2.f312751a;
                            aVar3.i(null);
                            return t14;
                        }
                        nVar2 = nVar;
                        return objL;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar3 = aVar;
                        aVar3.i(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0433b(n<T> nVar, n<T>.b bVar, kotlin.coroutines.d<? super C0433b> dVar) {
                super(1, dVar);
                this.f49564h = nVar;
                this.f49565i = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
                return new C0433b(this.f49564h, this.f49565i, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00d1  */
            /* JADX WARN: Code duplicated, block: B:31:0x0111  */
            /* JADX WARN: Code duplicated, block: B:32:0x0113  */
            /* JADX WARN: Code duplicated, block: B:36:0x011f  */
            /* JADX WARN: Code duplicated, block: B:40:0x013d  */
            /* JADX WARN: Code duplicated, block: B:49:0x013c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:22:0x00c9->B:51:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws androidx.datastore.core.g {
                kotlinx.coroutines.sync.a aVarB;
                i1.a aVar;
                i1.h hVar;
                i1.h hVar2;
                i1.a aVar2;
                kotlinx.coroutines.sync.a aVar3;
                Iterator<T> it;
                kotlinx.coroutines.sync.a aVar4;
                i1.a aVar5;
                i1.h hVar3;
                a aVar6;
                i1.h hVar4;
                Function2 function2;
                T t10;
                int iHashCode;
                Object objD;
                Object obj2;
                int i10;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f49563g;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    aVarB = kotlinx.coroutines.sync.g.b(false, 1, null);
                    aVar = new i1.a();
                    hVar = new i1.h();
                    n<T> nVar = this.f49564h;
                    this.f49557a = aVarB;
                    this.f49558b = aVar;
                    this.f49559c = hVar;
                    this.f49560d = hVar;
                    this.f49563g = 1;
                    obj = nVar.B(true, this);
                    if (obj != objL) {
                        hVar2 = hVar;
                    }
                    return objL;
                }
                if (i11 == 1) {
                    hVar = (i1.h) this.f49560d;
                    hVar2 = (i1.h) this.f49559c;
                    aVar = (i1.a) this.f49558b;
                    aVarB = (kotlinx.coroutines.sync.a) this.f49557a;
                    ResultKt.m(obj);
                } else {
                    if (i11 == 2) {
                        it = (Iterator) this.f49561e;
                        aVar6 = (a) this.f49560d;
                        hVar3 = (i1.h) this.f49559c;
                        aVar5 = (i1.a) this.f49558b;
                        aVar4 = (kotlinx.coroutines.sync.a) this.f49557a;
                        ResultKt.m(obj);
                        while (it.hasNext()) {
                            function2 = (Function2) it.next();
                            this.f49557a = aVar4;
                            this.f49558b = aVar5;
                            this.f49559c = hVar3;
                            this.f49560d = aVar6;
                            this.f49561e = it;
                            this.f49563g = 2;
                            if (function2.invoke(aVar6, this) == objL) {
                                return objL;
                            }
                        }
                        hVar2 = hVar3;
                        aVar2 = aVar5;
                        aVar3 = aVar4;
                        ((b) this.f49565i).f49551c = null;
                        this.f49557a = aVar2;
                        this.f49558b = hVar2;
                        this.f49559c = aVar3;
                        this.f49560d = null;
                        this.f49561e = null;
                        this.f49563g = 3;
                        if (aVar3.h(null, this) == objL) {
                            hVar4 = hVar2;
                            aVar2.f312744a = true;
                            Unit unit = Unit.f312394a;
                            aVar3.i(null);
                            t10 = hVar4.f312751a;
                            if (t10 != null) {
                            }
                            androidx.datastore.core.w wVarT = this.f49564h.t();
                            this.f49557a = t10;
                            this.f49558b = null;
                            this.f49559c = null;
                            this.f49562f = iHashCode;
                            this.f49563g = 4;
                            objD = wVarT.d(this);
                            if (objD != objL) {
                                obj = objD;
                                obj2 = t10;
                                i10 = iHashCode;
                            }
                        }
                        return objL;
                    }
                    if (i11 == 3) {
                        aVar3 = (kotlinx.coroutines.sync.a) this.f49559c;
                        hVar4 = (i1.h) this.f49558b;
                        aVar2 = (i1.a) this.f49557a;
                        ResultKt.m(obj);
                        try {
                            aVar2.f312744a = true;
                            Unit unit2 = Unit.f312394a;
                            aVar3.i(null);
                            t10 = hVar4.f312751a;
                            iHashCode = t10 != null ? t10.hashCode() : 0;
                            androidx.datastore.core.w wVarT2 = this.f49564h.t();
                            this.f49557a = t10;
                            this.f49558b = null;
                            this.f49559c = null;
                            this.f49562f = iHashCode;
                            this.f49563g = 4;
                            objD = wVarT2.d(this);
                            if (objD != objL) {
                                obj = objD;
                                obj2 = t10;
                                i10 = iHashCode;
                            }
                            return objL;
                        } catch (Throwable th2) {
                            aVar3.i(null);
                            throw th2;
                        }
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f49562f;
                    obj2 = this.f49557a;
                    ResultKt.m(obj);
                }
                return new androidx.datastore.core.i(obj2, i10, ((Number) obj).intValue());
                hVar.f312751a = (T) ((androidx.datastore.core.i) obj).d();
                a aVar7 = new a(aVarB, aVar, hVar2, this.f49564h);
                List list = ((b) this.f49565i).f49551c;
                if (list != null) {
                    it = list.iterator();
                    aVar4 = aVarB;
                    aVar5 = aVar;
                    hVar3 = hVar2;
                    aVar6 = aVar7;
                    while (it.hasNext()) {
                        function2 = (Function2) it.next();
                        this.f49557a = aVar4;
                        this.f49558b = aVar5;
                        this.f49559c = hVar3;
                        this.f49560d = aVar6;
                        this.f49561e = it;
                        this.f49563g = 2;
                        if (function2.invoke(aVar6, this) == objL) {
                            return objL;
                        }
                    }
                    hVar2 = hVar3;
                    aVar2 = aVar5;
                    aVar3 = aVar4;
                } else {
                    aVar2 = aVar;
                    aVar3 = aVarB;
                }
                ((b) this.f49565i).f49551c = null;
                this.f49557a = aVar2;
                this.f49558b = hVar2;
                this.f49559c = aVar3;
                this.f49560d = null;
                this.f49561e = null;
                this.f49563g = 3;
                if (aVar3.h(null, this) == objL) {
                    hVar4 = hVar2;
                    aVar2.f312744a = true;
                    Unit unit3 = Unit.f312394a;
                    aVar3.i(null);
                    t10 = hVar4.f312751a;
                    if (t10 != null) {
                    }
                    androidx.datastore.core.w wVarT3 = this.f49564h.t();
                    this.f49557a = t10;
                    this.f49558b = null;
                    this.f49559c = null;
                    this.f49562f = iHashCode;
                    this.f49563g = 4;
                    objD = wVarT3.d(this);
                    if (objD != objL) {
                        obj = objD;
                        obj2 = t10;
                        i10 = iHashCode;
                        return new androidx.datastore.core.i(obj2, i10, ((Number) obj).intValue());
                    }
                }
                return objL;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable kotlin.coroutines.d<? super androidx.datastore.core.i<T>> dVar) {
                return ((C0433b) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public b(@NotNull n nVar, List<? extends Function2<? super androidx.datastore.core.v<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f49552d = nVar;
            this.f49551c = CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
        
            if (r8 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        
            if (r8 == r1) goto L27;
         */
        @Override // androidx.datastore.core.k0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) throws androidx.datastore.core.g {
            /*
                r7 = this;
                boolean r0 = r8 instanceof androidx.datastore.core.n.b.a
                if (r0 == 0) goto L16
                r0 = r8
                r6 = 0
                androidx.datastore.core.n$b$a r0 = (androidx.datastore.core.n.b.a) r0
                r6 = 6
                int r1 = r0.f49556d
                r6 = 3
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f49556d = r1
                goto L1b
            L16:
                androidx.datastore.core.n$b$a r0 = new androidx.datastore.core.n$b$a
                r0.<init>(r7, r8)
            L1b:
                java.lang.Object r8 = r0.f49554b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f49556d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3d
                if (r2 != r3) goto L34
                java.lang.Object r7 = r0.f49553a
                androidx.datastore.core.n$b r7 = (androidx.datastore.core.n.b) r7
                r6 = 1
                kotlin.ResultKt.m(r8)
                goto L77
            L34:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 7
                throw r7
            L3d:
                java.lang.Object r7 = r0.f49553a
                androidx.datastore.core.n$b r7 = (androidx.datastore.core.n.b) r7
                kotlin.ResultKt.m(r8)
                r6 = 2
                goto L8a
            L46:
                kotlin.ResultKt.m(r8)
                r6 = 7
                java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.v<T>, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>> r8 = r7.f49551c
                r6 = 4
                if (r8 == 0) goto L7a
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
                boolean r8 = r8.isEmpty()
                r6 = 5
                if (r8 == 0) goto L5b
                r6 = 4
                goto L7a
            L5b:
                androidx.datastore.core.n<T> r8 = r7.f49552d
                androidx.datastore.core.w r8 = androidx.datastore.core.n.d(r8)
                r6 = 2
                androidx.datastore.core.n$b$b r2 = new androidx.datastore.core.n$b$b
                r6 = 1
                androidx.datastore.core.n<T> r4 = r7.f49552d
                r5 = 0
                r6 = r5
                r2.<init>(r4, r7, r5)
                r0.f49553a = r7
                r0.f49556d = r3
                java.lang.Object r8 = r8.a(r2, r0)
                if (r8 != r1) goto L77
                goto L89
            L77:
                androidx.datastore.core.i r8 = (androidx.datastore.core.i) r8
                goto L8c
            L7a:
                androidx.datastore.core.n<T> r8 = r7.f49552d
                r0.f49553a = r7
                r6 = 6
                r0.f49556d = r4
                r6 = 3
                r2 = 0
                java.lang.Object r8 = androidx.datastore.core.n.o(r8, r2, r0)
                if (r8 != r1) goto L8a
            L89:
                return r1
            L8a:
                androidx.datastore.core.i r8 = (androidx.datastore.core.i) r8
            L8c:
                androidx.datastore.core.n<T> r7 = r7.f49552d
                androidx.datastore.core.o r7 = androidx.datastore.core.n.e(r7)
                r6 = 3
                r7.d(r8)
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 6
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.b.b(kotlin.coroutines.d):java.lang.Object");
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<androidx.datastore.core.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f49578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n<T> nVar) {
            super(0);
            this.f49578a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.datastore.core.w invoke() {
            return this.f49578a.u().c();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {72, com.planner5d.library.engine.input.f.b.C0, 100}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "startState"}, s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,538:1\n53#2:539\n55#2:543\n50#3:540\n55#3:542\n107#4:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n108#1:539\n108#1:543\n108#1:540\n108#1:542\n108#1:541\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f49581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f49582d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super p0<T>>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f49583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n<T> f49584b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n<T> nVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f49584b = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f49584b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f49583a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    n<T> nVar = this.f49584b;
                    this.f49583a = 1;
                    if (nVar.x(this) == objL) {
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

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super p0<T>> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<p0<T>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f49585a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f49586b;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f49586b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f49585a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((p0) this.f49586b) instanceof androidx.datastore.core.u));
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull p0<T> p0Var, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
                return ((b) create(p0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<p0<T>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f49587a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f49588b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p0<T> f49589c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(p0<T> p0Var, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f49589c = p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.f49589c, dVar);
                cVar.f49588b = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f49587a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                p0 p0Var = (p0) this.f49588b;
                return kotlin.coroutines.jvm.internal.b.a((p0Var instanceof androidx.datastore.core.i) && p0Var.a() <= this.f49589c.a());
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull p0<T> p0Var, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
                return ((c) create(p0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.core.n$d$d, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", i = {}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "invokeSuspend", n = {}, s = {})
        static final class C0435d extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super T>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f49590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n<T> f49591b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0435d(n<T> nVar, kotlin.coroutines.d<? super C0435d> dVar) {
                super(3, dVar);
                this.f49591b = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f49590a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    n<T> nVar = this.f49591b;
                    this.f49590a = 1;
                    if (nVar.r(this) == objL) {
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

            @Override // pj.n
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @Nullable Throwable th2, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return new C0435d(this.f49591b, dVar).invokeSuspend(Unit.f312394a);
            }
        }

        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
        public static final class e implements kotlinx.coroutines.flow.i<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f49592a;

            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n1#1,222:1\n54#2:223\n109#3,5:224\n*E\n"})
            public static final class a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j f49593a;

                /* JADX INFO: renamed from: androidx.datastore.core.n$d$e$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class C0436a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f49594a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f49595b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f49596c;

                    public C0436a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f49594a = obj;
                        this.f49595b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(kotlinx.coroutines.flow.j jVar) {
                    this.f49593a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.j
                @Nullable
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) throws Throwable {
                    C0436a c0436a;
                    if (dVar instanceof C0436a) {
                        c0436a = (C0436a) dVar;
                        int i10 = c0436a.f49595b;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0436a.f49595b = i10 - Integer.MIN_VALUE;
                        } else {
                            c0436a = new C0436a(dVar);
                        }
                    } else {
                        c0436a = new C0436a(dVar);
                    }
                    Object obj2 = c0436a.f49594a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c0436a.f49595b;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        kotlinx.coroutines.flow.j jVar = this.f49593a;
                        p0 p0Var = (p0) obj;
                        if (p0Var instanceof i0) {
                            throw ((i0) p0Var).b();
                        }
                        if (!(p0Var instanceof androidx.datastore.core.i)) {
                            if (p0Var instanceof androidx.datastore.core.u ? true : p0Var instanceof t0) {
                                throw new IllegalStateException(n.f49538n);
                            }
                            throw new kotlin.k0();
                        }
                        Object objD = ((androidx.datastore.core.i) p0Var).d();
                        c0436a.f49595b = 1;
                        if (jVar.emit(objD, c0436a) == objL) {
                            return objL;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj2);
                    }
                    return Unit.f312394a;
                }
            }

            public e(kotlinx.coroutines.flow.i iVar) {
                this.f49592a = iVar;
            }

            @Override // kotlinx.coroutines.flow.i
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
                Object objCollect = this.f49592a.collect(new a(jVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n<T> nVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f49582d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f49582d, dVar);
            dVar2.f49581c = obj;
            return dVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
        
            if (kotlinx.coroutines.flow.k.o0(r1, r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0}, l = {544}, m = "decrementCollector", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f49601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49602e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n<T> nVar, kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
            this.f49601d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49600c = obj;
            this.f49602e |= Integer.MIN_VALUE;
            return this.f49601d.r(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.c.f44016q}, m = "invokeSuspend", n = {}, s = {})
    static final class f<R> extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f49604b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super f> dVar) {
            super(1, dVar);
            this.f49604b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new f(this.f49604b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49603a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<kotlin.coroutines.d<? super R>, Object> function1 = this.f49604b;
            this.f49603a = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super R> dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {1, 1}, l = {237, com.planner5d.library.engine.input.f.b.M1, com.planner5d.library.engine.input.f.b.P1}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u242"}, s = {"L$0", "L$1"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f49607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f49608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n<T> f49609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49610f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n<T> nVar, kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
            this.f49609e = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49608d = obj;
            this.f49610f |= Integer.MIN_VALUE;
            return this.f49609e.w(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0}, l = {544}, m = "incrementCollector", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f49614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49615e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(n<T> nVar, kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
            this.f49614d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49613c = obj;
            this.f49615e |= Integer.MIN_VALUE;
            return this.f49614d.x(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", i = {}, l = {134, 135}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<T> f49617b;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n<T> f49618a;

            a(n<T> nVar) {
                this.f49618a = nVar;
            }

            @Override // kotlinx.coroutines.flow.j
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull Unit unit, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                Object objZ;
                return ((((n) this.f49618a).f49546h.b() instanceof androidx.datastore.core.u) || (objZ = this.f49618a.z(true, dVar)) != kotlin.coroutines.intrinsics.b.l()) ? Unit.f312394a : objZ;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(n<T> nVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f49617b = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new i(this.f49617b, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (r6.collect(r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f49616a
                r2 = 2
                r3 = 1
                r4 = 5
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r6)
                goto L58
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1b:
                r4 = 1
                kotlin.ResultKt.m(r6)
                goto L36
            L20:
                r4 = 5
                kotlin.ResultKt.m(r6)
                androidx.datastore.core.n<T> r6 = r5.f49617b
                r4 = 2
                androidx.datastore.core.n$b r6 = androidx.datastore.core.n.f(r6)
                r5.f49616a = r3
                java.lang.Object r6 = r6.a(r5)
                r4 = 1
                if (r6 != r0) goto L36
                r4 = 3
                goto L57
            L36:
                androidx.datastore.core.n<T> r6 = r5.f49617b
                androidx.datastore.core.w r6 = androidx.datastore.core.n.d(r6)
                r4 = 1
                kotlinx.coroutines.flow.i r6 = r6.b()
                r4 = 7
                kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.flow.k.Y(r6)
                r4 = 3
                androidx.datastore.core.n$i$a r1 = new androidx.datastore.core.n$i$a
                androidx.datastore.core.n<T> r3 = r5.f49617b
                r1.<init>(r3)
                r5.f49616a = r2
                java.lang.Object r5 = r6.collect(r1, r5)
                r4 = 1
                if (r5 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this", "this", "preReadVersion"}, s = {"L$0", "L$0", "I$0"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f49622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49623e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(n<T> nVar, kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
            this.f49622d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49621c = obj;
            this.f49623e |= Integer.MIN_VALUE;
            return this.f49622d.y(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 2}, l = {287, 296, 304}, m = "readDataAndUpdateCache", n = {"this", "currentState", "requireLock", "this", "this"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f49626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f49627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n<T> f49628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49629f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(n<T> nVar, kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
            this.f49628e = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49627d = obj;
            this.f49629f |= Integer.MIN_VALUE;
            return this.f49628e.z(false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", i = {}, l = {298, 300}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Pair<? extends p0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f49632c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(n<T> nVar, kotlin.coroutines.d<? super l> dVar) {
            super(1, dVar);
            this.f49632c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new l(this.f49632c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            p0 i0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49631b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    n<T> nVar = this.f49632c;
                    this.f49631b = 1;
                    obj = nVar.B(true, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f49630a;
                        ResultKt.m(obj);
                        i0Var = new i0(th2, ((Number) obj).intValue());
                        return TuplesKt.to(i0Var, kotlin.coroutines.jvm.internal.b.a(true));
                    }
                    ResultKt.m(obj);
                }
                i0Var = (p0) obj;
            } catch (Throwable th3) {
                androidx.datastore.core.w wVarT = this.f49632c.t();
                this.f49630a = th3;
                this.f49631b = 2;
                Object objD = wVarT.d(this);
                if (objD != objL) {
                    obj = objD;
                    th2 = th3;
                }
                return objL;
            }
            return TuplesKt.to(i0Var, kotlin.coroutines.jvm.internal.b.a(true));
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Pair<? extends p0<T>, Boolean>> dVar) {
            return ((l) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", i = {0, 1}, l = {306, 309}, m = "invokeSuspend", n = {"locked", "locked"}, s = {"Z$0", "Z$0"})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<Boolean, kotlin.coroutines.d<? super Pair<? extends p0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f49635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f49636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f49637e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(n<T> nVar, int i10, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f49636d = nVar;
            this.f49637e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.f49636d, this.f49637e, dVar);
            mVar.f49635c = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return invoke(bool.booleanValue(), (kotlin.coroutines.d) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int iIntValue;
            Throwable th2;
            boolean z10;
            p0 i0Var;
            ?? r10;
            ?? r11;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r12 = this.f49634b;
            try {
                if (r12 == 0) {
                    ResultKt.m(obj);
                    boolean z11 = this.f49635c;
                    n<T> nVar = this.f49636d;
                    this.f49635c = z11;
                    this.f49634b = 1;
                    obj = nVar.B(z11, this);
                    r12 = z11;
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = this.f49635c;
                        th2 = (Throwable) this.f49633a;
                        ResultKt.m(obj);
                        iIntValue = ((Number) obj).intValue();
                        r11 = z10;
                        i0Var = new i0(th2, iIntValue);
                        r10 = r11;
                        return TuplesKt.to(i0Var, kotlin.coroutines.jvm.internal.b.a(r10));
                    }
                    boolean z12 = this.f49635c;
                    ResultKt.m(obj);
                    r12 = z12;
                }
                i0Var = (p0) obj;
                r10 = r12;
            } catch (Throwable th3) {
                if (r12 != 0) {
                    androidx.datastore.core.w wVarT = this.f49636d.t();
                    this.f49633a = th3;
                    this.f49635c = r12;
                    this.f49634b = 2;
                    Object objD = wVarT.d(this);
                    if (objD != objL) {
                        obj = objD;
                        th2 = th3;
                        z10 = r12 == true ? 1 : 0;
                    }
                    return objL;
                }
                iIntValue = this.f49637e;
                th2 = th3;
                r11 = r12;
            }
            return TuplesKt.to(i0Var, kotlin.coroutines.jvm.internal.b.a(r10));
        }

        @Nullable
        public final Object invoke(boolean z10, @Nullable kotlin.coroutines.d<? super Pair<? extends p0<T>, Boolean>> dVar) {
            return ((m) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.n$n, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5}, l = {365, 366, 368, 369, 380, a5.S0}, m = "readDataOrHandleCorruption", n = {"this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "ex", "newData", "hasWriteFileLock", "ex", "newData", "version"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2"})
    static final class C0437n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f49640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f49641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f49642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49644g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n<T> f49645h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f49646i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0437n(n<T> nVar, kotlin.coroutines.d<? super C0437n> dVar) {
            super(dVar);
            this.f49645h = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49644g = obj;
            this.f49646i |= Integer.MIN_VALUE;
            return this.f49645h.B(false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", i = {0, 1}, l = {370, 371}, m = "invokeSuspend", n = {"locked", "data"}, s = {"Z$0", "L$0"})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<Boolean, kotlin.coroutines.d<? super androidx.datastore.core.i<T>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f49649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f49650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f49651e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(n<T> nVar, int i10, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f49650d = nVar;
            this.f49651e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            o oVar = new o(this.f49650d, this.f49651e, dVar);
            oVar.f49649c = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return invoke(bool.booleanValue(), (kotlin.coroutines.d) obj);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code duplicated, block: B:23:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z10;
            int iIntValue;
            Object obj2;
            int iHashCode;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49648b;
            if (i10 == 0) {
                ResultKt.m(obj);
                z10 = this.f49649c;
                n<T> nVar = this.f49650d;
                this.f49649c = z10;
                this.f49648b = 1;
                obj = nVar.A(this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                z10 = this.f49649c;
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f49647a;
                ResultKt.m(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new androidx.datastore.core.i(obj2, iHashCode, iIntValue);
            if (z10) {
                androidx.datastore.core.w wVarT = this.f49650d.t();
                this.f49647a = obj;
                this.f49648b = 2;
                Object objD = wVarT.d(this);
                if (objD != objL) {
                    Object obj3 = obj;
                    obj = objD;
                    obj2 = obj3;
                    iIntValue = ((Number) obj).intValue();
                }
                return objL;
            }
            Object obj4 = obj;
            iIntValue = this.f49651e;
            obj2 = obj4;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new androidx.datastore.core.i(obj2, iHashCode, iIntValue);
        }

        @Nullable
        public final Object invoke(boolean z10, @Nullable kotlin.coroutines.d<? super androidx.datastore.core.i<T>> dVar) {
            return ((o) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", i = {}, l = {387, 388, 390}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.h<T> f49654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f49655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1.f f49656e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(i1.h<T> hVar, n<T> nVar, i1.f fVar, kotlin.coroutines.d<? super p> dVar) {
            super(1, dVar);
            this.f49654c = hVar;
            this.f49655d = nVar;
            this.f49656e = fVar;
            int i10 = 4 ^ 1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new p(this.f49654c, this.f49655d, this.f49656e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            i1.f fVar;
            i1.h<T> hVar;
            i1.f fVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49653b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    hVar = this.f49654c;
                    n<T> nVar = this.f49655d;
                    this.f49652a = hVar;
                    this.f49653b = 1;
                    obj = (T) nVar.A(this);
                    if (obj == objL) {
                    }
                    return objL;
                }
                if (i10 == 1) {
                    hVar = (i1.h) this.f49652a;
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fVar = (i1.f) this.f49652a;
                        ResultKt.m(obj);
                        fVar.f312749a = ((Number) obj).intValue();
                        return Unit.f312394a;
                    }
                    fVar2 = (i1.f) this.f49652a;
                    ResultKt.m(obj);
                }
                fVar2.f312749a = ((Number) obj).intValue();
                return Unit.f312394a;
                hVar.f312751a = (T) obj;
                fVar2 = this.f49656e;
                androidx.datastore.core.w wVarT = this.f49655d.t();
                this.f49652a = fVar2;
                this.f49653b = 2;
                obj = (T) wVarT.d(this);
                if (obj == objL) {
                    return objL;
                }
                fVar2.f312749a = ((Number) obj).intValue();
            } catch (androidx.datastore.core.g unused) {
                i1.f fVar3 = this.f49656e;
                n<T> nVar2 = this.f49655d;
                T t10 = this.f49654c.f312751a;
                this.f49652a = fVar3;
                this.f49653b = 3;
                Object objE = nVar2.E(t10, true, this);
                if (objE != objL) {
                    obj = (T) objE;
                    fVar = fVar3;
                }
                return objL;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", i = {}, l = {218, 226}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super p0<T>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<T> f49658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f49659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(n<T> nVar, boolean z10, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f49658b = nVar;
            this.f49659c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new q(this.f49658b, this.f49659c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r6 == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f49657a
                r2 = 2
                r3 = 1
                r4 = 7
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L15
                r4 = 4
                kotlin.ResultKt.m(r6)
                r4 = 6
                goto L5d
            L15:
                r4 = 4
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                r4 = 4
                throw r5
            L1f:
                kotlin.ResultKt.m(r6)     // Catch: java.lang.Throwable -> L61
                goto L4f
            L23:
                kotlin.ResultKt.m(r6)
                androidx.datastore.core.n<T> r6 = r5.f49658b
                androidx.datastore.core.o r6 = androidx.datastore.core.n.e(r6)
                r4 = 2
                androidx.datastore.core.p0 r6 = r6.b()
                boolean r6 = r6 instanceof androidx.datastore.core.u
                r4 = 3
                if (r6 == 0) goto L42
                androidx.datastore.core.n<T> r5 = r5.f49658b
                androidx.datastore.core.o r5 = androidx.datastore.core.n.e(r5)
                androidx.datastore.core.p0 r5 = r5.b()
                r4 = 7
                return r5
            L42:
                r4 = 7
                androidx.datastore.core.n<T> r6 = r5.f49658b     // Catch: java.lang.Throwable -> L61
                r5.f49657a = r3     // Catch: java.lang.Throwable -> L61
                java.lang.Object r6 = androidx.datastore.core.n.l(r6, r5)     // Catch: java.lang.Throwable -> L61
                r4 = 3
                if (r6 != r0) goto L4f
                goto L5c
            L4f:
                androidx.datastore.core.n<T> r6 = r5.f49658b
                boolean r1 = r5.f49659c
                r5.f49657a = r2
                java.lang.Object r6 = androidx.datastore.core.n.m(r6, r1, r5)
                r4 = 5
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                r4 = 4
                androidx.datastore.core.p0 r6 = (androidx.datastore.core.p0) r6
                return r6
            L61:
                r5 = move-exception
                androidx.datastore.core.i0 r6 = new androidx.datastore.core.i0
                r0 = -1
                r4 = 1
                r6.<init>(r5, r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super p0<T>> dVar) {
            return ((q) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class r extends kotlin.jvm.internal.l0 implements Function0<r0<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f49660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(n<T> nVar) {
            super(0);
            this.f49660a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0<T> invoke() {
            return ((n) this.f49660a).f49539a.createConnection();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", i = {1, 2}, l = {330, 331, 337}, m = "invokeSuspend", n = {"curData", "newData"}, s = {"L$0", "L$0"})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f49663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f49664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super T>, Object> f49665e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", i = {}, l = {331}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f49666a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<T, kotlin.coroutines.d<? super T>, Object> f49667b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.datastore.core.i<T> f49668c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, androidx.datastore.core.i<T> iVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f49667b = function2;
                this.f49668c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f49667b, this.f49668c, dVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.datastore.core.n$s$a for r4v3 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                /*
                    r4 = this;
                    r3 = 1
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f49666a
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L10
                    kotlin.ResultKt.m(r5)
                    return r5
                L10:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r3 = 7
                    r4.<init>(r5)
                    throw r4
                L19:
                    kotlin.ResultKt.m(r5)
                    kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super T>, java.lang.Object> r5 = r4.f49667b
                    androidx.datastore.core.i<T> r1 = r4.f49668c
                    java.lang.Object r1 = r1.d()
                    r3 = 6
                    r4.f49666a = r2
                    java.lang.Object r4 = r5.invoke(r1, r4)
                    if (r4 != r0) goto L2e
                    return r0
                L2e:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super T> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(n<T> nVar, CoroutineContext coroutineContext, Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super s> dVar) {
            super(1, dVar);
            this.f49663c = nVar;
            this.f49664d = coroutineContext;
            this.f49665e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new s(this.f49663c, this.f49664d, this.f49665e, dVar);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.datastore.core.n$s for r9v4 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r8 = 4
                int r1 = r9.f49662b
                r8 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r8 = 5
                if (r1 == 0) goto L35
                if (r1 == r4) goto L30
                r8 = 2
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                r8 = 3
                java.lang.Object r9 = r9.f49661a
                r8 = 5
                kotlin.ResultKt.m(r10)
                r8 = 6
                return r9
            L1e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L26:
                r8 = 3
                java.lang.Object r1 = r9.f49661a
                androidx.datastore.core.i r1 = (androidx.datastore.core.i) r1
                r8 = 1
                kotlin.ResultKt.m(r10)
                goto L60
            L30:
                kotlin.ResultKt.m(r10)
                r8 = 0
                goto L44
            L35:
                kotlin.ResultKt.m(r10)
                androidx.datastore.core.n<T> r10 = r9.f49663c
                r9.f49662b = r4
                java.lang.Object r10 = androidx.datastore.core.n.o(r10, r4, r9)
                r8 = 2
                if (r10 != r0) goto L44
                goto L7a
            L44:
                r1 = r10
                androidx.datastore.core.i r1 = (androidx.datastore.core.i) r1
                kotlin.coroutines.CoroutineContext r10 = r9.f49664d
                r8 = 0
                androidx.datastore.core.n$s$a r5 = new androidx.datastore.core.n$s$a
                r8 = 0
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super T>, java.lang.Object> r6 = r9.f49665e
                r7 = 0
                r8 = 2
                r5.<init>(r6, r1, r7)
                r9.f49661a = r1
                r9.f49662b = r3
                r8 = 3
                java.lang.Object r10 = kotlinx.coroutines.i.h(r10, r5, r9)
                if (r10 != r0) goto L60
                goto L7a
            L60:
                r1.b()
                java.lang.Object r1 = r1.d()
                r8 = 6
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r10)
                if (r1 != 0) goto L7c
                androidx.datastore.core.n<T> r1 = r9.f49663c
                r9.f49661a = r10
                r9.f49662b = r2
                java.lang.Object r9 = r1.E(r10, r4, r9)
                if (r9 != r0) goto L7c
            L7a:
                r8 = 7
                return r0
            L7c:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super T> dVar) {
            return ((s) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f49670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f49671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super T>, Object> f49672d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(n<T> nVar, Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
            this.f49671c = nVar;
            this.f49672d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            t tVar = new t(this.f49671c, this.f49672d, dVar);
            tVar.f49670b = obj;
            return tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49669a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f49670b;
            kotlinx.coroutines.x xVarC = kotlinx.coroutines.z.c(null, 1, null);
            ((n) this.f49671c).f49550l.e(new z.b(this.f49672d, xVarC, ((n) this.f49671c).f49546h.b(), s0Var.getCoroutineContext()));
            this.f49669a = 1;
            Object objQ = xVarC.q(this);
            return objQ == objL ? objL : objQ;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super T> dVar) {
            return ((t) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class u extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f49673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(n<T> nVar) {
            super(1);
            this.f49673a = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            if (th2 != null) {
                ((n) this.f49673a).f49546h.d(new androidx.datastore.core.u(th2));
            }
            if (((n) this.f49673a).f49548j.Z()) {
                this.f49673a.u().close();
            }
        }
    }

    static final class v extends kotlin.jvm.internal.l0 implements Function2<z.b<T>, Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f49674a = new v();

        v() {
            super(2);
        }

        public final void c(@NotNull z.b<T> msg, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            kotlinx.coroutines.x<T> xVarB = msg.b();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            xVarB.f(th2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
            c((z.b) obj, th2);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", i = {}, l = {androidx.compose.runtime.m0.f36245r}, m = "invokeSuspend", n = {}, s = {})
    static final class w extends kotlin.coroutines.jvm.internal.o implements Function2<z.b<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f49677c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(n<T> nVar, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f49677c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            w wVar = new w(this.f49677c, dVar);
            wVar.f49676b = obj;
            return wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49675a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z.b bVar = (z.b) this.f49676b;
                n<T> nVar = this.f49677c;
                this.f49675a = 1;
                if (nVar.w(bVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull z.b<T> bVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0}, l = {348}, m = "writeData$datastore_core_release", n = {"newVersion"}, s = {"L$0"})
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f49680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f49681d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(n<T> nVar, kotlin.coroutines.d<? super x> dVar) {
            super(dVar);
            this.f49680c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49679b = obj;
            this.f49681d |= Integer.MIN_VALUE;
            return this.f49680c.E(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", i = {0}, l = {352, 353}, m = "invokeSuspend", n = {"$this$writeScope"}, s = {"L$0"})
    static final class y extends kotlin.coroutines.jvm.internal.o implements Function2<w0<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f49684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1.f f49685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n<T> f49686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f49687f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49688g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(i1.f fVar, n<T> nVar, T t10, boolean z10, kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
            this.f49685d = fVar;
            this.f49686e = nVar;
            this.f49687f = t10;
            this.f49688g = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            y yVar = new y(this.f49685d, this.f49686e, this.f49687f, this.f49688g, dVar);
            yVar.f49684c = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        
            if (r3.a(r8, r7) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f49683b
                r2 = 2
                r6 = 4
                r3 = 1
                if (r1 == 0) goto L2b
                r6 = 4
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r8)
                goto L69
            L15:
                r6 = 3
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1e:
                java.lang.Object r1 = r7.f49682a
                kotlin.jvm.internal.i1$f r1 = (kotlin.jvm.internal.i1.f) r1
                r6 = 4
                java.lang.Object r3 = r7.f49684c
                androidx.datastore.core.w0 r3 = (androidx.datastore.core.w0) r3
                kotlin.ResultKt.m(r8)
                goto L4d
            L2b:
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f49684c
                r6 = 0
                androidx.datastore.core.w0 r8 = (androidx.datastore.core.w0) r8
                kotlin.jvm.internal.i1$f r1 = r7.f49685d
                r6 = 5
                androidx.datastore.core.n<T> r4 = r7.f49686e
                androidx.datastore.core.w r4 = androidx.datastore.core.n.d(r4)
                r7.f49684c = r8
                r7.f49682a = r1
                r7.f49683b = r3
                r6 = 5
                java.lang.Object r3 = r4.e(r7)
                if (r3 != r0) goto L4a
                goto L68
            L4a:
                r5 = r3
                r3 = r8
                r8 = r5
            L4d:
                r6 = 6
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                r6 = 4
                r1.f312749a = r8
                r6 = 4
                T r8 = r7.f49687f
                r1 = 0
                r7.f49684c = r1
                r7.f49682a = r1
                r7.f49683b = r2
                java.lang.Object r8 = r3.a(r8, r7)
                r6 = 7
                if (r8 != r0) goto L69
            L68:
                return r0
            L69:
                boolean r8 = r7.f49688g
                if (r8 == 0) goto L8c
                r6 = 7
                androidx.datastore.core.n<T> r8 = r7.f49686e
                androidx.datastore.core.o r8 = androidx.datastore.core.n.e(r8)
                r6 = 7
                androidx.datastore.core.i r0 = new androidx.datastore.core.i
                T r1 = r7.f49687f
                if (r1 == 0) goto L80
                int r2 = r1.hashCode()
                goto L81
            L80:
                r2 = 0
            L81:
                kotlin.jvm.internal.i1$f r7 = r7.f49685d
                int r7 = r7.f312749a
                r6 = 4
                r0.<init>(r1, r2, r7)
                r8.d(r0)
            L8c:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull w0<T> w0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((y) create(w0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public n(@NotNull q0<T> storage, @NotNull List<? extends Function2<? super androidx.datastore.core.v<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> initTasksList, @NotNull androidx.datastore.core.h<T> corruptionHandler, @NotNull kotlinx.coroutines.s0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f49539a = storage;
        this.f49540b = corruptionHandler;
        this.f49541c = scope;
        this.f49542d = kotlinx.coroutines.flow.k.K0(new d(this, null));
        this.f49543e = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f49546h = new androidx.datastore.core.o<>();
        this.f49547i = new b(this, initTasksList);
        this.f49548j = kotlin.g0.c(new r(this));
        this.f49549k = kotlin.g0.c(new c(this));
        this.f49550l = new n0<>(scope, new u(this), v.f49674a, new w(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(kotlin.coroutines.d<? super T> dVar) {
        return s0.a(u(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[Catch: g -> 0x0073, TryCatch #3 {g -> 0x0073, blocks: (B:19:0x006e, B:55:0x0126, B:24:0x007d, B:52:0x0104, B:32:0x009d, B:40:0x00ba, B:42:0x00c1, B:36:0x00a7, B:49:0x00ed), top: B:82:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object B(boolean z10, kotlin.coroutines.d<? super androidx.datastore.core.i<T>> dVar) throws androidx.datastore.core.g {
        C0437n c0437n;
        i1.h hVar;
        androidx.datastore.core.g gVar;
        n<T> nVar;
        boolean z11;
        i1.h hVar2;
        i1.f fVar;
        androidx.datastore.core.g gVar2;
        p pVar;
        i1.f fVar2;
        i1.h hVar3;
        int iHashCode;
        Object objD;
        n<T> nVar2;
        int i10;
        Object obj;
        if (dVar instanceof C0437n) {
            c0437n = (C0437n) dVar;
            int i11 = c0437n.f49646i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0437n.f49646i = i11 - Integer.MIN_VALUE;
            } else {
                c0437n = new C0437n(this, dVar);
            }
        } else {
            c0437n = new C0437n(this, dVar);
        }
        Object obj2 = (T) c0437n.f49644g;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        try {
            switch (c0437n.f49646i) {
                case 0:
                    ResultKt.m(obj2);
                    if (z10) {
                        c0437n.f49638a = this;
                        c0437n.f49642e = z10;
                        c0437n.f49646i = 1;
                        obj2 = (T) A(c0437n);
                        if (obj2 != objL) {
                            if (obj2 != null) {
                                iHashCode = obj2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            androidx.datastore.core.w wVarT = this.t();
                            c0437n.f49638a = this;
                            c0437n.f49639b = obj2;
                            c0437n.f49642e = z10;
                            c0437n.f49643f = iHashCode;
                            c0437n.f49646i = 2;
                            objD = wVarT.d(c0437n);
                            if (objD != objL) {
                                nVar2 = this;
                                i10 = iHashCode;
                                obj = obj2;
                                obj2 = (T) objD;
                                return new androidx.datastore.core.i(obj, i10, ((Number) obj2).intValue());
                            }
                        }
                    } else {
                        androidx.datastore.core.w wVarT2 = t();
                        c0437n.f49638a = this;
                        c0437n.f49642e = z10;
                        c0437n.f49646i = 3;
                        obj2 = (T) wVarT2.d(c0437n);
                        if (obj2 != objL) {
                            int iIntValue = ((Number) obj2).intValue();
                            androidx.datastore.core.w wVarT3 = this.t();
                            o oVar = new o(this, iIntValue, null);
                            c0437n.f49638a = this;
                            c0437n.f49642e = z10;
                            c0437n.f49646i = 4;
                            obj2 = (T) wVarT3.c(oVar, c0437n);
                            if (obj2 == objL) {
                            }
                            return (androidx.datastore.core.i) obj2;
                        }
                    }
                    return objL;
                case 1:
                    z10 = c0437n.f49642e;
                    this = (n) c0437n.f49638a;
                    ResultKt.m(obj2);
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    androidx.datastore.core.w wVarT4 = this.t();
                    c0437n.f49638a = this;
                    c0437n.f49639b = obj2;
                    c0437n.f49642e = z10;
                    c0437n.f49643f = iHashCode;
                    c0437n.f49646i = 2;
                    objD = wVarT4.d(c0437n);
                    if (objD != objL) {
                        nVar2 = this;
                        i10 = iHashCode;
                        obj = obj2;
                        obj2 = (T) objD;
                        return new androidx.datastore.core.i(obj, i10, ((Number) obj2).intValue());
                    }
                    return objL;
                case 2:
                    i10 = c0437n.f49643f;
                    z10 = c0437n.f49642e;
                    obj = c0437n.f49639b;
                    nVar2 = (n) c0437n.f49638a;
                    try {
                        ResultKt.m(obj2);
                        return new androidx.datastore.core.i(obj, i10, ((Number) obj2).intValue());
                    } catch (androidx.datastore.core.g e10) {
                        e = e10;
                        this = nVar2;
                        hVar = new i1.h();
                        androidx.datastore.core.h<T> hVar4 = this.f49540b;
                        c0437n.f49638a = this;
                        c0437n.f49639b = e;
                        c0437n.f49640c = hVar;
                        c0437n.f49641d = hVar;
                        c0437n.f49642e = z10;
                        c0437n.f49646i = 5;
                        Object objA = hVar4.a(e, c0437n);
                        if (objA != objL) {
                            gVar = e;
                            obj2 = (T) objA;
                            nVar = this;
                            z11 = z10;
                            hVar2 = hVar;
                            hVar2.f312751a = (T) obj2;
                            fVar = new i1.f();
                            try {
                                pVar = new p(hVar, nVar, fVar, null);
                                c0437n.f49638a = gVar;
                                c0437n.f49639b = hVar;
                                c0437n.f49640c = fVar;
                                c0437n.f49641d = null;
                                c0437n.f49646i = 6;
                                if (nVar.s(z11, pVar, c0437n) != objL) {
                                    fVar2 = fVar;
                                    hVar3 = hVar;
                                    T t10 = hVar3.f312751a;
                                    return new androidx.datastore.core.i(t10, t10 != null ? t10.hashCode() : 0, fVar2.f312749a);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                gVar2 = gVar;
                                kotlin.p.a(gVar2, th);
                                throw gVar2;
                            }
                        }
                        return objL;
                    }
                case 3:
                    z10 = c0437n.f49642e;
                    this = (n) c0437n.f49638a;
                    ResultKt.m(obj2);
                    int iIntValue2 = ((Number) obj2).intValue();
                    androidx.datastore.core.w wVarT5 = this.t();
                    o oVar2 = new o(this, iIntValue2, null);
                    c0437n.f49638a = this;
                    c0437n.f49642e = z10;
                    c0437n.f49646i = 4;
                    obj2 = (T) wVarT5.c(oVar2, c0437n);
                    if (obj2 == objL) {
                        return objL;
                    }
                    return (androidx.datastore.core.i) obj2;
                case 4:
                    boolean z12 = c0437n.f49642e;
                    ResultKt.m(obj2);
                    return (androidx.datastore.core.i) obj2;
                case 5:
                    z11 = c0437n.f49642e;
                    hVar2 = (i1.h) c0437n.f49641d;
                    hVar = (i1.h) c0437n.f49640c;
                    gVar = (androidx.datastore.core.g) c0437n.f49639b;
                    nVar = (n) c0437n.f49638a;
                    ResultKt.m(obj2);
                    hVar2.f312751a = (T) obj2;
                    fVar = new i1.f();
                    pVar = new p(hVar, nVar, fVar, null);
                    c0437n.f49638a = gVar;
                    c0437n.f49639b = hVar;
                    c0437n.f49640c = fVar;
                    c0437n.f49641d = null;
                    c0437n.f49646i = 6;
                    if (nVar.s(z11, pVar, c0437n) != objL) {
                        fVar2 = fVar;
                        hVar3 = hVar;
                        T t11 = hVar3.f312751a;
                        return new androidx.datastore.core.i(t11, t11 != null ? t11.hashCode() : 0, fVar2.f312749a);
                    }
                    return objL;
                case 6:
                    fVar2 = (i1.f) c0437n.f49640c;
                    hVar3 = (i1.h) c0437n.f49639b;
                    gVar2 = (androidx.datastore.core.g) c0437n.f49638a;
                    try {
                        ResultKt.m(obj2);
                        T t12 = hVar3.f312751a;
                        return new androidx.datastore.core.i(t12, t12 != null ? t12.hashCode() : 0, fVar2.f312749a);
                    } catch (Throwable th3) {
                        th = th3;
                        kotlin.p.a(gVar2, th);
                        throw gVar2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (androidx.datastore.core.g e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(boolean z10, kotlin.coroutines.d<? super p0<T>> dVar) {
        return kotlinx.coroutines.i.h(this.f49541c.getCoroutineContext(), new q(this, z10, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, kotlin.coroutines.d<? super T> dVar) {
        return t().a(new s(this, coroutineContext, function2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object r(kotlin.coroutines.d<? super Unit> dVar) {
        e eVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f49602e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f49602e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, dVar);
            }
        } else {
            eVar = new e(this, dVar);
        }
        Object obj = eVar.f49600c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f49602e;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f49543e;
            eVar.f49598a = this;
            eVar.f49599b = aVar;
            eVar.f49602e = 1;
            if (aVar.h(null, eVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) eVar.f49599b;
            n<T> nVar = (n) eVar.f49598a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = nVar;
        }
        try {
            int i12 = this.f49544f - 1;
            this.f49544f = i12;
            if (i12 == 0) {
                p2 p2Var = this.f49545g;
                if (p2Var != null) {
                    p2.a.b(p2Var, null, 1, null);
                }
                this.f49545g = null;
            }
            Unit unit = Unit.f312394a;
            aVar.i(null);
            return unit;
        } catch (Throwable th2) {
            aVar.i(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object s(boolean z10, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super R> dVar) {
        return z10 ? function1.invoke(dVar) : t().a(new f(function1, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.datastore.core.w t() {
        return (androidx.datastore.core.w) this.f49549k.getValue();
    }

    private static Object v(n<Object> nVar) {
        return ((n) nVar).f49548j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        if (r9 == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.n, androidx.datastore.core.n<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [androidx.datastore.core.n] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.x] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(androidx.datastore.core.z.b<T> r10, kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.w(androidx.datastore.core.z$b, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object x(kotlin.coroutines.d<? super Unit> dVar) {
        h hVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f49615e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f49615e = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, dVar);
            }
        } else {
            hVar = new h(this, dVar);
        }
        Object obj = hVar.f49613c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f49615e;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f49543e;
            hVar.f49611a = this;
            hVar.f49612b = aVar;
            hVar.f49615e = 1;
            if (aVar.h(null, hVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) hVar.f49612b;
            n<T> nVar = (n) hVar.f49611a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = nVar;
        }
        try {
            int i12 = this.f49544f + 1;
            this.f49544f = i12;
            if (i12 == 1) {
                this.f49545g = kotlinx.coroutines.k.f(this.f49541c, null, null, new i(this, null), 3, null);
            }
            return Unit.f312394a;
        } finally {
            aVar.i(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r2.c(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(kotlin.coroutines.d<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r6 = 2
            boolean r0 = r8 instanceof androidx.datastore.core.n.j
            r6 = 4
            if (r0 == 0) goto L17
            r0 = r8
            androidx.datastore.core.n$j r0 = (androidx.datastore.core.n.j) r0
            int r1 = r0.f49623e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            r6 = 7
            int r1 = r1 - r2
            r0.f49623e = r1
            r6 = 7
            goto L1d
        L17:
            androidx.datastore.core.n$j r0 = new androidx.datastore.core.n$j
            r6 = 7
            r0.<init>(r7, r8)
        L1d:
            java.lang.Object r8 = r0.f49621c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49623e
            r3 = 2
            r4 = 1
            r6 = r4
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3b
            int r7 = r0.f49620b
            r6 = 7
            java.lang.Object r0 = r0.f49619a
            androidx.datastore.core.n r0 = (androidx.datastore.core.n) r0
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L39
            goto L79
        L39:
            r8 = move-exception
            goto L83
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "/ch ov/ rkelus/en//ot /i eimel oo/feteoc/wauoibrrt "
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.Object r7 = r0.f49619a
            r6 = 7
            androidx.datastore.core.n r7 = (androidx.datastore.core.n) r7
            kotlin.ResultKt.m(r8)
            goto L60
        L4e:
            kotlin.ResultKt.m(r8)
            androidx.datastore.core.w r8 = r7.t()
            r0.f49619a = r7
            r0.f49623e = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L60
            goto L78
        L60:
            java.lang.Number r8 = (java.lang.Number) r8
            r6 = 0
            int r8 = r8.intValue()
            r6 = 7
            androidx.datastore.core.n<T>$b r2 = r7.f49547i     // Catch: java.lang.Throwable -> L7d
            r6 = 3
            r0.f49619a = r7     // Catch: java.lang.Throwable -> L7d
            r0.f49620b = r8     // Catch: java.lang.Throwable -> L7d
            r0.f49623e = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r2.c(r0)     // Catch: java.lang.Throwable -> L7d
            r6 = 4
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            r6 = 1
            return r7
        L7d:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r6 = 6
            r7 = r8
            r8 = r5
        L83:
            r6 = 4
            androidx.datastore.core.o<T> r0 = r0.f49546h
            androidx.datastore.core.i0 r1 = new androidx.datastore.core.i0
            r1.<init>(r8, r7)
            r0.d(r1)
            r6 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n.y(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object z(boolean z10, kotlin.coroutines.d<? super p0<T>> dVar) {
        k kVar;
        n<T> nVar;
        p0<T> p0Var;
        n<T> nVar2;
        Pair pair;
        p0<T> p0Var2;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f49629f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f49629f = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, dVar);
            }
        } else {
            kVar = new k(this, dVar);
        }
        Object objC = kVar.f49627d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f49629f;
        if (i11 == 0) {
            ResultKt.m(objC);
            p0<T> p0VarB = this.f49546h.b();
            if (p0VarB instanceof t0) {
                throw new IllegalStateException(f49538n);
            }
            androidx.datastore.core.w wVarT = t();
            kVar.f49624a = this;
            kVar.f49625b = p0VarB;
            kVar.f49626c = z10;
            kVar.f49629f = 1;
            Object objD = wVarT.d(kVar);
            if (objD != objL) {
                nVar = this;
                p0Var = p0VarB;
                objC = objD;
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                nVar2 = (n) kVar.f49624a;
                ResultKt.m(objC);
                pair = (Pair) objC;
                p0Var2 = (p0) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                    nVar2.f49546h.d(p0Var2);
                }
                return p0Var2;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar2 = (n) kVar.f49624a;
            ResultKt.m(objC);
            pair = (Pair) objC;
            p0Var2 = (p0) pair.component1();
            if (((Boolean) pair.component2()).booleanValue()) {
                nVar2.f49546h.d(p0Var2);
            }
            return p0Var2;
        }
        z10 = kVar.f49626c;
        p0Var = (p0) kVar.f49625b;
        nVar = (n) kVar.f49624a;
        ResultKt.m(objC);
        int iIntValue = ((Number) objC).intValue();
        boolean z11 = p0Var instanceof androidx.datastore.core.i;
        int iA = z11 ? p0Var.a() : -1;
        if (z11 && iIntValue == iA) {
            return p0Var;
        }
        if (z10) {
            androidx.datastore.core.w wVarT2 = nVar.t();
            l lVar = new l(nVar, null);
            kVar.f49624a = nVar;
            kVar.f49625b = null;
            kVar.f49629f = 2;
            objC = wVarT2.a(lVar, kVar);
            if (objC != objL) {
                nVar2 = nVar;
                pair = (Pair) objC;
                p0Var2 = (p0) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                    nVar2.f49546h.d(p0Var2);
                }
                return p0Var2;
            }
        } else {
            androidx.datastore.core.w wVarT3 = nVar.t();
            m mVar = new m(nVar, iA, null);
            kVar.f49624a = nVar;
            kVar.f49625b = null;
            kVar.f49629f = 3;
            objC = wVarT3.c(mVar, kVar);
            if (objC != objL) {
                nVar2 = nVar;
                pair = (Pair) objC;
                p0Var2 = (p0) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                    nVar2.f49546h.d(p0Var2);
                }
                return p0Var2;
            }
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object E(T t10, boolean z10, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        x xVar;
        i1.f fVar;
        if (dVar instanceof x) {
            xVar = (x) dVar;
            int i10 = xVar.f49681d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f49681d = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, dVar);
            }
        } else {
            xVar = new x(this, dVar);
        }
        Object obj = xVar.f49679b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = xVar.f49681d;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.f fVar2 = new i1.f();
            r0<T> r0VarU = u();
            y yVar = new y(fVar2, this, t10, z10, null);
            xVar.f49678a = fVar2;
            xVar.f49681d = 1;
            if (r0VarU.b(yVar, xVar) == objL) {
                return objL;
            }
            fVar = fVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (i1.f) xVar.f49678a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.f(fVar.f312749a);
    }

    @Override // androidx.datastore.core.l
    @Nullable
    public Object a(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        v0 v0Var = (v0) dVar.getContext().get(v0.a.C0438a.f49816a);
        if (v0Var != null) {
            v0Var.b(this);
        }
        return kotlinx.coroutines.i.h(new v0(v0Var, this), new t(this, function2, null), dVar);
    }

    @Override // androidx.datastore.core.l
    @NotNull
    public kotlinx.coroutines.flow.i<T> getData() {
        return this.f49542d;
    }

    @NotNull
    public final r0<T> u() {
        return this.f49548j.getValue();
    }

    public /* synthetic */ n(q0 q0Var, List list, androidx.datastore.core.h hVar, kotlinx.coroutines.s0 s0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? new v1.a() : hVar, (i10 & 8) != 0 ? kotlinx.coroutines.t0.a(androidx.datastore.core.a.a().plus(q3.c(null, 1, null))) : s0Var);
    }
}
