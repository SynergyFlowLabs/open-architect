package com.planner5d.library.services.utility;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSuspendSynchronizedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendSynchronizedMap.kt\ncom/planner5d/library/services/utility/SuspendSynchronizedMap\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n116#2,10:60\n116#2,7:70\n124#2,2:84\n116#2,7:86\n124#2,2:94\n116#2,10:96\n381#3,7:77\n1#4:93\n*S KotlinDebug\n*F\n+ 1 SuspendSynchronizedMap.kt\ncom/planner5d/library/services/utility/SuspendSynchronizedMap\n*L\n34#1:60,10\n36#1:70,7\n36#1:84,2\n50#1:86,7\n50#1:94,2\n56#1:96,10\n38#1:77,7\n*E\n"})
public final class e3<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<K, V> f225197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f225198b;

    public static abstract class a<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V f225199a;

        /* JADX INFO: renamed from: com.planner5d.library.services.utility.e3$a$a, reason: collision with other inner class name */
        public static final class C1687a<V> extends a<V> {
            public C1687a(V v10) {
                super(v10, null);
            }
        }

        public static final class b<V> extends a<V> {
            public b(V v10) {
                super(v10, null);
            }
        }

        public /* synthetic */ a(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj);
        }

        public final V a(@NotNull Function1<? super V, ? extends V> modifier) {
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            if (this instanceof C1687a) {
                return modifier.invoke(((C1687a) this).b());
            }
            if (this instanceof b) {
                return ((b) this).b();
            }
            throw new kotlin.k0();
        }

        public final V b() {
            return this.f225199a;
        }

        private a(V v10) {
            this.f225199a = v10;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.SuspendSynchronizedMap", f = "SuspendSynchronizedMap.kt", i = {0, 0, 0}, l = {64}, m = "get", n = {"this", "key", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f225202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f225203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e3<K, V> f225204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f225205f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e3<K, V> e3Var, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f225204e = e3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225203d = obj;
            this.f225205f |= Integer.MIN_VALUE;
            return this.f225204e.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.SuspendSynchronizedMap", f = "SuspendSynchronizedMap.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {64, 40}, m = "getOrPut", n = {"this", "key", "defaultValue", "$this$withLock_u24default$iv", "key", "$this$withLock_u24default$iv", "didPut", "$this$getOrPut$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f225208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f225209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f225210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e3<K, V> f225211f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f225212g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e3<K, V> e3Var, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f225211f = e3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225210e = obj;
            this.f225212g |= Integer.MIN_VALUE;
            return this.f225211f.b(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.SuspendSynchronizedMap", f = "SuspendSynchronizedMap.kt", i = {0, 0, 0, 0}, l = {64}, m = "putIfAbsent", n = {"this", "key", "value", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f225215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f225216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f225217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e3<K, V> f225218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f225219g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e3<K, V> e3Var, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f225218f = e3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225217e = obj;
            this.f225219g |= Integer.MIN_VALUE;
            int i10 = 5 >> 0;
            return this.f225218f.c(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.SuspendSynchronizedMap", f = "SuspendSynchronizedMap.kt", i = {0, 0, 0}, l = {64}, m = "remove", n = {"this", "key", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f225222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f225223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e3<K, V> f225224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f225225f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e3<K, V> e3Var, kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
            this.f225224e = e3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225223d = obj;
            this.f225225f |= Integer.MIN_VALUE;
            return this.f225224e.d(null, this);
        }
    }

    public e3(@NotNull Map<K, V> map, @NotNull kotlinx.coroutines.sync.a mutex) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.f225197a = map;
        this.f225198b = mutex;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object a(K k10, @NotNull kotlin.coroutines.d<? super V> dVar) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f225205f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f225205f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f225203d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f225205f;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f225198b;
            bVar.f225200a = this;
            bVar.f225201b = k10;
            bVar.f225202c = aVar;
            bVar.f225205f = 1;
            if (aVar.h(null, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) bVar.f225202c;
            k10 = (K) bVar.f225201b;
            e3<K, V> e3Var = (e3) bVar.f225200a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = e3Var;
        }
        try {
            return this.f225197a.get(k10);
        } finally {
            aVar.i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003f, B:31:0x00b0, B:35:0x00be, B:37:0x00c2, B:38:0x00c9), top: B:43:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003f, B:31:0x00b0, B:35:0x00be, B:37:0x00c2, B:38:0x00c9), top: B:43:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Map] */
    @Nullable
    public final Object b(K k10, @NotNull Function1<? super kotlin.coroutines.d<? super V>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super a<V>> dVar) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        kotlin.jvm.internal.i1.a aVar3;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.i1.a aVar4;
        Object c1687a;
        ?? r10;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f225212g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f225212g = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, dVar);
            }
        } else {
            cVar = new c(this, dVar);
        }
        Object obj3 = cVar.f225210e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f225212g;
        try {
            if (i11 == 0) {
                ResultKt.m(obj3);
                aVar = this.f225198b;
                cVar.f225206a = this;
                cVar.f225207b = k10;
                cVar.f225208c = function1;
                cVar.f225209d = aVar;
                cVar.f225212g = 1;
                if (aVar.h(null, cVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = (Map<K, V>) ((Map) cVar.f225209d);
                aVar4 = (kotlin.jvm.internal.i1.a) cVar.f225208c;
                aVar2 = (kotlinx.coroutines.sync.a) cVar.f225207b;
                obj2 = cVar.f225206a;
                try {
                    ResultKt.m(obj3);
                    r10 = z10;
                    r10.put(obj2, obj3);
                    aVar3 = aVar4;
                    obj = obj3;
                    if (aVar3.f312744a) {
                        c1687a = new a.b(obj);
                    } else {
                        c1687a = new a.C1687a(obj);
                    }
                    aVar2.i(null);
                    return c1687a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.i(null);
                    throw th;
                }
            }
            kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) cVar.f225209d;
            function1 = (Function1) cVar.f225208c;
            k10 = (K) cVar.f225207b;
            e3<K, V> e3Var = (e3) cVar.f225206a;
            ResultKt.m(obj3);
            aVar = aVar5;
            this = e3Var;
            aVar3 = new kotlin.jvm.internal.i1.a();
            Map<K, V> map = this.f225197a;
            obj = map.get(k10);
            if (obj == null) {
                aVar3.f312744a = true;
                cVar.f225206a = k10;
                cVar.f225207b = aVar;
                cVar.f225208c = aVar3;
                cVar.f225209d = map;
                cVar.f225212g = 2;
                Object objInvoke = function1.invoke(cVar);
                if (objInvoke != objL) {
                    kotlinx.coroutines.sync.a aVar6 = aVar;
                    obj3 = objInvoke;
                    aVar2 = aVar6;
                    obj2 = k10;
                    aVar4 = aVar3;
                    r10 = map;
                    r10.put(obj2, obj3);
                    aVar3 = aVar4;
                    obj = obj3;
                }
                return objL;
            }
            aVar2 = aVar;
            if (aVar3.f312744a) {
                c1687a = new a.b(obj);
            } else {
                c1687a = new a.C1687a(obj);
            }
            aVar2.i(null);
            return c1687a;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final Object c(K k10, V v10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        d dVar2;
        kotlinx.coroutines.sync.a aVar;
        Object obj;
        Object obj2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f225219g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f225219g = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj3 = dVar2.f225217e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f225219g;
        if (i11 == 0) {
            ResultKt.m(obj3);
            aVar = this.f225198b;
            dVar2.f225213a = this;
            dVar2.f225214b = k10;
            dVar2.f225215c = v10;
            dVar2.f225216d = aVar;
            dVar2.f225219g = 1;
            if (aVar.h(null, dVar2) == objL) {
                obj2 = k10;
                obj = v10;
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) dVar2.f225216d;
            Object obj4 = dVar2.f225215c;
            Object obj5 = dVar2.f225214b;
            e3<K, V> e3Var = (e3) dVar2.f225213a;
            ResultKt.m(obj3);
            aVar = aVar2;
            this = e3Var;
            obj2 = obj5;
            obj = obj4;
        }
        try {
            obj2 = k10;
            obj = v10;
            if (this.f225197a.get(obj2) != null) {
                int i12 = 3 >> 0;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                aVar.i(null);
                return boolA;
            }
            this.f225197a.put((K) obj2, (V) obj);
            Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(true);
            aVar.i(null);
            return boolA2;
        } catch (Throwable th2) {
            aVar.i(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object d(K k10, @NotNull kotlin.coroutines.d<? super V> dVar) {
        e eVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f225225f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f225225f = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, dVar);
            }
        } else {
            eVar = new e(this, dVar);
        }
        Object obj = eVar.f225223d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f225225f;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f225198b;
            eVar.f225220a = this;
            eVar.f225221b = k10;
            eVar.f225222c = aVar;
            eVar.f225225f = 1;
            if (aVar.h(null, eVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) eVar.f225222c;
            k10 = (K) eVar.f225221b;
            e3<K, V> e3Var = (e3) eVar.f225220a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = e3Var;
        }
        try {
            return this.f225197a.remove(k10);
        } finally {
            aVar.i(null);
        }
    }

    public /* synthetic */ e3(Map map, kotlinx.coroutines.sync.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? kotlinx.coroutines.sync.g.b(false, 1, null) : aVar);
    }
}
