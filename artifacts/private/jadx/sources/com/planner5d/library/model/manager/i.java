package com.planner5d.library.model.manager;

import android.content.Intent;
import com.planner5d.library.model.LogRecord;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nConsumableIntentRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumableIntentRepository.kt\ncom/planner5d/library/model/manager/ConsumableIntentRepository\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,67:1\n54#2,8:68\n54#2,8:76\n54#2,8:84\n*S KotlinDebug\n*F\n+ 1 ConsumableIntentRepository.kt\ncom/planner5d/library/model/manager/ConsumableIntentRepository\n*L\n25#1:68,8\n30#1:76,8\n37#1:84,8\n*E\n"})
public final class i implements z2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f191511e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f191512f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f191513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t1 f191514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final HashMap<Integer, Long> f191515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f191516d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Intrinsics.areEqual("android.intent.action.VIEW", intent.getAction()) && !new com.planner5d.library.services.utility.j(intent.getExtras()).a(com.planner5d.library.services.r.consumedIntent);
        }

        @Nullable
        public final Intent b(@Nullable Intent intent) {
            if (intent == null || !a(intent)) {
                return null;
            }
            intent.replaceExtras(new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.consumedIntent, true).a());
            return intent;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ConsumableIntentRepository$createIntentId$$inlined$withReentrantLock$default$1", f = "ConsumableIntentRepository.kt", i = {0, 0, 1, 1}, l = {265, 268}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 ConsumableIntentRepository.kt\ncom/planner5d/library/model/manager/ConsumableIntentRepository\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:271\n31#3,3:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:271,2\n*E\n"})
    public static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f191521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f191522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f191523g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f191524h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, i iVar, int i10) {
            super(2, dVar);
            this.f191521e = aVar;
            this.f191522f = obj;
            this.f191523g = iVar;
            this.f191524h = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f191521e, this.f191522f, dVar, this.f191523g, this.f191524h);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Object obj3;
            kotlinx.coroutines.sync.a aVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191520d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f191521e;
                    obj2 = this.f191522f;
                    this.f191517a = aVar;
                    this.f191518b = obj2;
                    this.f191520d = 1;
                    if (aVar.h(obj2, this) != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f191518b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f191517a;
                    try {
                        ResultKt.m(obj);
                        long jLongValue = ((Number) obj).longValue();
                        this.f191523g.f191515c.put(kotlin.coroutines.jvm.internal.b.f(this.f191524h), kotlin.coroutines.jvm.internal.b.g(jLongValue));
                        aVar2.i(obj3);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.i(obj3);
                        throw th;
                    }
                }
                obj2 = this.f191518b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f191517a;
                ResultKt.m(obj);
                aVar = aVar3;
                com.planner5d.library.model.manager.config.p pVar = this.f191523g.f191513a;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.consumedIntent;
                this.f191517a = aVar;
                this.f191518b = obj2;
                this.f191520d = 2;
                Object objO = pVar.o(rVar, 1L, this);
                if (objO != objL) {
                    obj3 = obj2;
                    aVar2 = aVar;
                    obj = objO;
                    long jLongValue2 = ((Number) obj).longValue();
                    this.f191523g.f191515c.put(kotlin.coroutines.jvm.internal.b.f(this.f191524h), kotlin.coroutines.jvm.internal.b.g(jLongValue2));
                    aVar2.i(obj3);
                    return obj;
                }
                return objL;
            } catch (Throwable th3) {
                th = th3;
                obj3 = obj2;
                aVar2 = aVar;
                aVar2.i(obj3);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ConsumableIntentRepository", f = "ConsumableIntentRepository.kt", i = {0, 0, 0, 1, 1, 2, 2, 2}, l = {com.planner5d.library.engine.input.f.b.f160708m0, 31, 72, 72}, m = "createIntentId", n = {"this", "$receiver$iv", "notificationId", "this", "notificationId", "this", "$receiver$iv", "notificationId"}, s = {"L$0", "L$1", "I$0", "L$0", "I$0", "L$0", "L$1", "I$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191528d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191530f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191528d = obj;
            this.f191530f |= Integer.MIN_VALUE;
            int i10 = 2 | 0;
            return i.this.k(0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ConsumableIntentRepository$getActiveIntentId$$inlined$withReentrantLock$default$1", f = "ConsumableIntentRepository.kt", i = {0, 0, 1, 1}, l = {265, 268}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 ConsumableIntentRepository.kt\ncom/planner5d/library/model/manager/ConsumableIntentRepository\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:270\n26#3,2:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:270,2\n*E\n"})
    public static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f191535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f191536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f191537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f191538h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, i iVar, int i10) {
            super(2, dVar);
            this.f191535e = aVar;
            this.f191536f = obj;
            this.f191537g = iVar;
            this.f191538h = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f191535e, this.f191536f, dVar, this.f191537g, this.f191538h);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object obj3;
            Object objG;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191534d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f191535e;
                    obj2 = this.f191536f;
                    this.f191531a = aVar;
                    this.f191532b = obj2;
                    this.f191534d = 1;
                    if (aVar.h(obj2, this) == objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f191532b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f191531a;
                    try {
                        ResultKt.m(obj);
                        Object obj4 = obj;
                        aVar = aVar2;
                        objG = obj4;
                        obj2 = obj3;
                        aVar.i(obj2);
                        return objG;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(obj3);
                        throw th2;
                    }
                }
                obj2 = this.f191532b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f191531a;
                ResultKt.m(obj);
                aVar = aVar3;
                Long l10 = (Long) this.f191537g.f191515c.get(kotlin.coroutines.jvm.internal.b.f(this.f191538h));
                if (l10 == null) {
                    i iVar = this.f191537g;
                    int i11 = this.f191538h;
                    this.f191531a = aVar;
                    this.f191532b = obj2;
                    this.f191534d = 2;
                    Object objK = iVar.k(i11, this);
                    if (objK != objL) {
                        kotlinx.coroutines.sync.a aVar4 = aVar;
                        obj = objK;
                        aVar2 = aVar4;
                        obj3 = obj2;
                        Object obj5 = obj;
                        aVar = aVar2;
                        objG = obj5;
                        obj2 = obj3;
                    }
                    return objL;
                }
                objG = kotlin.coroutines.jvm.internal.b.g(l10.longValue());
                aVar.i(obj2);
                return objG;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar5 = aVar;
                th2 = th4;
                aVar2 = aVar5;
                obj3 = obj2;
                aVar2.i(obj3);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ConsumableIntentRepository", f = "ConsumableIntentRepository.kt", i = {0, 0, 0, 2, 2, 2}, l = {com.planner5d.library.engine.input.f.b.f160708m0, 26, 72, 72}, m = "getActiveIntentId", n = {"this", "$receiver$iv", "notificationId", "this", "$receiver$iv", "notificationId"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191542d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191544f;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191542d = obj;
            this.f191544f |= Integer.MIN_VALUE;
            return i.this.l(0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ConsumableIntentRepository", f = "ConsumableIntentRepository.kt", i = {0}, l = {48}, m = "isIntentConsumed", n = {"id"}, s = {"J$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f191545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191546b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191548d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191546b = obj;
            this.f191548d |= Integer.MIN_VALUE;
            return i.this.m(0L, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ConsumableIntentRepository$setIntentConsumed$$inlined$withReentrantLock$default$1", f = "ConsumableIntentRepository.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {265, 268, com.badlogic.gdx.utils.compression.lzma.a.A, 274}, m = "invokeSuspend", n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 ConsumableIntentRepository.kt\ncom/planner5d/library/model/manager/ConsumableIntentRepository\n*L\n1#1,261:1\n117#2,6:262\n124#2,2:276\n38#3,8:268\n*S KotlinDebug\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$withReentrantLock$2\n*L\n59#1:262,6\n59#1:276,2\n*E\n"})
    public static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.a f191553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f191554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f191555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f191556h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f191557i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kotlinx.coroutines.sync.a aVar, Object obj, kotlin.coroutines.d dVar, i iVar, long j10, int i10) {
            super(2, dVar);
            this.f191553e = aVar;
            this.f191554f = obj;
            this.f191555g = iVar;
            this.f191556h = j10;
            this.f191557i = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f191553e, this.f191554f, dVar, this.f191555g, this.f191556h, this.f191557i);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00a5 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:41:0x0104, B:33:0x009b, B:35:0x00a5, B:38:0x00ee, B:30:0x0086), top: B:57:0x0086 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00ee A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:41:0x0104, B:33:0x009b, B:35:0x00a5, B:38:0x00ee, B:30:0x0086), top: B:57:0x0086 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0103  */
        /* JADX WARN: Code duplicated, block: B:41:0x0104 A[Catch: all -> 0x00e6, PHI: r1 r3 r12
          0x0104: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v11 java.lang.Object) binds: [B:39:0x0101, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0104: PHI (r3v3 java.lang.Object) = (r3v1 java.lang.Object), (r3v9 java.lang.Object) binds: [B:39:0x0101, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0104: PHI (r12v5 kotlinx.coroutines.sync.a) = (r12v4 kotlinx.coroutines.sync.a), (r12v17 kotlinx.coroutines.sync.a) binds: [B:39:0x0101, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x00e6, blocks: (B:41:0x0104, B:33:0x009b, B:35:0x00a5, B:38:0x00ee, B:30:0x0086), top: B:57:0x0086 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0129  */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x00a5, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            Object obj2;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object obj3;
            Object objM;
            Object objL;
            Unit unit;
            long jLongValue;
            com.planner5d.library.model.manager.config.p pVar;
            com.planner5d.library.services.r rVar;
            Object objL2 = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191552d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f191553e;
                    obj2 = this.f191554f;
                    this.f191549a = aVar;
                    this.f191550b = obj2;
                    this.f191552d = 1;
                    if (aVar.h(obj2, this) != objL2) {
                    }
                    return objL2;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        obj2 = this.f191550b;
                        kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f191549a;
                        try {
                            ResultKt.m(obj);
                            objM = obj;
                            aVar = aVar3;
                            if (!((Boolean) objM).booleanValue()) {
                                i iVar = this.f191555g;
                                int i11 = this.f191557i;
                                this.f191549a = aVar;
                                this.f191550b = obj2;
                                this.f191552d = 3;
                                objL = iVar.l(i11, this);
                                if (objL == objL2) {
                                    jLongValue = ((Number) objL).longValue() + 1;
                                    pVar = this.f191555g.f191513a;
                                    rVar = com.planner5d.library.services.r.consumedIntent;
                                    this.f191549a = aVar;
                                    this.f191550b = obj2;
                                    this.f191552d = 4;
                                    if (pVar.r(rVar, jLongValue, this) != objL2) {
                                        aVar2 = aVar;
                                        obj3 = obj2;
                                        aVar = aVar2;
                                        unit = Unit.f312394a;
                                        obj2 = obj3;
                                    }
                                }
                                return objL2;
                            }
                            this.f191555g.f191514b.u(new LogRecord("consumable_intent", null, null));
                            timber.log.b.f381052a.k("Intent " + this.f191556h + " is already consumed", new Object[0]);
                            unit = Unit.f312394a;
                            aVar.i(obj2);
                            return unit;
                        } catch (Throwable th3) {
                            th2 = th3;
                            obj3 = obj2;
                            aVar2 = aVar3;
                        }
                    } else if (i10 == 3) {
                        obj2 = this.f191550b;
                        kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) this.f191549a;
                        try {
                            ResultKt.m(obj);
                            objL = obj;
                            aVar = aVar4;
                            jLongValue = ((Number) objL).longValue() + 1;
                            pVar = this.f191555g.f191513a;
                            rVar = com.planner5d.library.services.r.consumedIntent;
                            this.f191549a = aVar;
                            this.f191550b = obj2;
                            this.f191552d = 4;
                            if (pVar.r(rVar, jLongValue, this) != objL2) {
                                aVar2 = aVar;
                                obj3 = obj2;
                                aVar = aVar2;
                                unit = Unit.f312394a;
                                obj2 = obj3;
                                aVar.i(obj2);
                                return unit;
                            }
                            return objL2;
                        } catch (Throwable th4) {
                            th2 = th4;
                            obj3 = obj2;
                            aVar2 = aVar4;
                        }
                    } else {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj3 = this.f191550b;
                        aVar2 = (kotlinx.coroutines.sync.a) this.f191549a;
                        try {
                            ResultKt.m(obj);
                            aVar = aVar2;
                            unit = Unit.f312394a;
                            obj2 = obj3;
                            aVar.i(obj2);
                            return unit;
                        } catch (Throwable th5) {
                            th2 = th5;
                        }
                    }
                    aVar2.i(obj3);
                    throw th2;
                }
                obj2 = this.f191550b;
                kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f191549a;
                ResultKt.m(obj);
                aVar = aVar5;
                i iVar2 = this.f191555g;
                long j10 = this.f191556h;
                int i12 = this.f191557i;
                this.f191549a = aVar;
                this.f191550b = obj2;
                this.f191552d = 2;
                objM = iVar2.m(j10, i12, this);
                if (objM != objL2) {
                    if (!((Boolean) objM).booleanValue()) {
                        this.f191555g.f191514b.u(new LogRecord("consumable_intent", null, null));
                        timber.log.b.f381052a.k("Intent " + this.f191556h + " is already consumed", new Object[0]);
                        unit = Unit.f312394a;
                    } else {
                        i iVar3 = this.f191555g;
                        int i13 = this.f191557i;
                        this.f191549a = aVar;
                        this.f191550b = obj2;
                        this.f191552d = 3;
                        objL = iVar3.l(i13, this);
                        if (objL == objL2) {
                            jLongValue = ((Number) objL).longValue() + 1;
                            pVar = this.f191555g.f191513a;
                            rVar = com.planner5d.library.services.r.consumedIntent;
                            this.f191549a = aVar;
                            this.f191550b = obj2;
                            this.f191552d = 4;
                            if (pVar.r(rVar, jLongValue, this) != objL2) {
                                aVar2 = aVar;
                                obj3 = obj2;
                                aVar = aVar2;
                                unit = Unit.f312394a;
                                obj2 = obj3;
                            }
                        }
                    }
                    aVar.i(obj2);
                    return unit;
                }
                return objL2;
            } catch (Throwable th6) {
                kotlinx.coroutines.sync.a aVar6 = aVar;
                th2 = th6;
                aVar2 = aVar6;
                obj3 = obj2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ConsumableIntentRepository", f = "ConsumableIntentRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 4, 4, 4, 4}, l = {com.planner5d.library.engine.input.f.b.f160708m0, 38, 43, 44, 72, 72}, m = "setIntentConsumed", n = {"this", "$receiver$iv", "intentId", "notificationId", "this", "intentId", "notificationId", "this", "this", "$receiver$iv", "intentId", "notificationId"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "J$0", "I$0", "L$0", "L$0", "L$1", "J$0", "I$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f191560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f191562e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f191564g;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191562e = obj;
            this.f191564g |= Integer.MIN_VALUE;
            return i.this.n(0L, 0, this);
        }
    }

    @ij.a
    public i(@NotNull com.planner5d.library.model.manager.config.p sharedPreferencesManager, @NotNull t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f191513a = sharedPreferencesManager;
        this.f191514b = logRecordManager;
        this.f191515c = new HashMap<>();
        this.f191516d = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object k(int i10, kotlin.coroutines.d<? super Long> dVar) {
        c cVar;
        int i11;
        kotlinx.coroutines.sync.a aVar;
        i iVar;
        int i12;
        i iVar2;
        int i13;
        Object objH;
        i iVar3 = this;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f191530f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f191530f = i14 - Integer.MIN_VALUE;
            } else {
                cVar = iVar3.new c(dVar);
            }
        } else {
            cVar = iVar3.new c(dVar);
        }
        Object objA = cVar.f191528d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i15 = cVar.f191530f;
        if (i15 == 0) {
            ResultKt.m(objA);
            com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
            kotlinx.coroutines.sync.a aVar2 = iVar3.f191516d;
            com.planner5d.library.services.utility.p2.a aVar3 = com.planner5d.library.services.utility.p2.f229701c;
            cVar.f191525a = iVar3;
            cVar.f191526b = aVar2;
            i11 = i10;
            cVar.f191527c = i11;
            cVar.f191530f = 1;
            Object objB = aVar3.b(aVar2, cVar);
            if (objB != objL) {
                aVar = aVar2;
                objA = objB;
            }
            return objL;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                i13 = cVar.f191527c;
                iVar2 = (i) cVar.f191525a;
                ResultKt.m(objA);
                long jLongValue = ((Number) objA).longValue();
                iVar2.f191515c.put(kotlin.coroutines.jvm.internal.b.f(i13), kotlin.coroutines.jvm.internal.b.g(jLongValue));
                return objA;
            }
            if (i15 != 3) {
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objA);
                return objA;
            }
            int i16 = cVar.f191527c;
            aVar = (kotlinx.coroutines.sync.a) cVar.f191526b;
            i iVar4 = (i) cVar.f191525a;
            ResultKt.m(objA);
            i12 = i16;
            iVar = iVar4;
            b bVar = new b(aVar, null, null, iVar, i12);
            cVar.f191525a = null;
            cVar.f191526b = null;
            cVar.f191530f = 4;
            objH = kotlinx.coroutines.i.h((CoroutineContext) objA, bVar, cVar);
            if (objH != objL) {
                return objL;
            }
            return objH;
        }
        int i17 = cVar.f191527c;
        aVar = (kotlinx.coroutines.sync.a) cVar.f191526b;
        i iVar5 = (i) cVar.f191525a;
        ResultKt.m(objA);
        i11 = i17;
        iVar3 = iVar5;
        if (((Boolean) objA).booleanValue()) {
            com.planner5d.library.model.manager.config.p pVar = iVar3.f191513a;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.consumedIntent;
            cVar.f191525a = iVar3;
            cVar.f191526b = null;
            cVar.f191527c = i11;
            cVar.f191530f = 2;
            objA = pVar.o(rVar, 1L, cVar);
            if (objA != objL) {
                iVar2 = iVar3;
                i13 = i11;
                long jLongValue2 = ((Number) objA).longValue();
                iVar2.f191515c.put(kotlin.coroutines.jvm.internal.b.f(i13), kotlin.coroutines.jvm.internal.b.g(jLongValue2));
                return objA;
            }
        } else {
            com.planner5d.library.services.utility.p2.a aVar4 = com.planner5d.library.services.utility.p2.f229701c;
            cVar.f191525a = iVar3;
            cVar.f191526b = aVar;
            cVar.f191527c = i11;
            cVar.f191530f = 3;
            objA = aVar4.a(aVar, cVar);
            if (objA != objL) {
                iVar = iVar3;
                i12 = i11;
                b bVar2 = new b(aVar, null, null, iVar, i12);
                cVar.f191525a = null;
                cVar.f191526b = null;
                cVar.f191530f = 4;
                objH = kotlinx.coroutines.i.h((CoroutineContext) objA, bVar2, cVar);
                if (objH != objL) {
                    return objH;
                }
            }
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public final Object l(int i10, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        e eVar;
        int i11;
        kotlinx.coroutines.sync.a aVar;
        i iVar;
        int i12;
        Object objH;
        i iVar2 = this;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i13 = eVar.f191544f;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f191544f = i13 - Integer.MIN_VALUE;
            } else {
                eVar = iVar2.new e(dVar);
            }
        } else {
            eVar = iVar2.new e(dVar);
        }
        Object objA = eVar.f191542d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i14 = eVar.f191544f;
        if (i14 == 0) {
            ResultKt.m(objA);
            com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
            kotlinx.coroutines.sync.a aVar2 = iVar2.f191516d;
            com.planner5d.library.services.utility.p2.a aVar3 = com.planner5d.library.services.utility.p2.f229701c;
            eVar.f191539a = iVar2;
            eVar.f191540b = aVar2;
            i11 = i10;
            eVar.f191541c = i11;
            eVar.f191544f = 1;
            Object objB = aVar3.b(aVar2, eVar);
            if (objB != objL) {
                aVar = aVar2;
                objA = objB;
            }
            return objL;
        }
        if (i14 == 1) {
            int i15 = eVar.f191541c;
            aVar = (kotlinx.coroutines.sync.a) eVar.f191540b;
            i iVar3 = (i) eVar.f191539a;
            ResultKt.m(objA);
            i11 = i15;
            iVar2 = iVar3;
        } else {
            if (i14 == 2) {
                ResultKt.m(objA);
                return objA;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objA);
                return objA;
            }
            int i16 = eVar.f191541c;
            aVar = (kotlinx.coroutines.sync.a) eVar.f191540b;
            i iVar4 = (i) eVar.f191539a;
            ResultKt.m(objA);
            i12 = i16;
            iVar = iVar4;
        }
        d dVar2 = new d(aVar, null, null, iVar, i12);
        eVar.f191539a = null;
        eVar.f191540b = null;
        eVar.f191544f = 4;
        objH = kotlinx.coroutines.i.h((CoroutineContext) objA, dVar2, eVar);
        if (objH != objL) {
            return objL;
        }
        return objH;
        if (((Boolean) objA).booleanValue()) {
            Long l10 = (Long) iVar2.f191515c.get(kotlin.coroutines.jvm.internal.b.f(i11));
            if (l10 != null) {
                return kotlin.coroutines.jvm.internal.b.g(l10.longValue());
            }
            eVar.f191539a = null;
            eVar.f191540b = null;
            eVar.f191544f = 2;
            Object objK = iVar2.k(i11, eVar);
            if (objK != objL) {
                return objK;
            }
        } else {
            com.planner5d.library.services.utility.p2.a aVar4 = com.planner5d.library.services.utility.p2.f229701c;
            eVar.f191539a = iVar2;
            eVar.f191540b = aVar;
            eVar.f191541c = i11;
            eVar.f191544f = 3;
            objA = aVar4.a(aVar, eVar);
            if (objA != objL) {
                iVar = iVar2;
                i12 = i11;
                d dVar3 = new d(aVar, null, null, iVar, i12);
                eVar.f191539a = null;
                eVar.f191540b = null;
                eVar.f191544f = 4;
                objH = kotlinx.coroutines.i.h((CoroutineContext) objA, dVar3, eVar);
                if (objH != objL) {
                    return objH;
                }
            }
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object m(long j10, int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i11 = fVar.f191548d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f191548d = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objL = fVar.f191546b;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i12 = fVar.f191548d;
        if (i12 == 0) {
            ResultKt.m(objL);
            fVar.f191545a = j10;
            fVar.f191548d = 1;
            objL = l(i10, fVar);
            if (objL == objL2) {
                return objL2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = fVar.f191545a;
            ResultKt.m(objL);
        }
        return kotlin.coroutines.jvm.internal.b.a(((Number) objL).longValue() != j10);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[PHI: r0 r1 r6 r8
      0x00c2: PHI (r0v4 com.planner5d.library.model.manager.i) = (r0v1 com.planner5d.library.model.manager.i), (r0v10 com.planner5d.library.model.manager.i) binds: [B:27:0x00be, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r1v12 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:27:0x00be, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r6v3 long) = (r6v1 long), (r6v4 long) binds: [B:27:0x00be, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r8v5 int) = (r8v1 int), (r8v6 int) binds: [B:27:0x00be, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107 A[PHI: r0 r1
      0x0107: PHI (r0v11 com.planner5d.library.model.manager.i) = (r0v4 com.planner5d.library.model.manager.i), (r0v15 com.planner5d.library.model.manager.i) binds: [B:34:0x0104, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r1v20 java.lang.Object) = (r1v16 java.lang.Object), (r1v1 java.lang.Object) binds: [B:34:0x0104, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x013b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0121, code lost:
    
        if (r0.r(r1, r6, r2) == r3) goto L47;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00ca, please report this as an issue */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(long r19, int r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.i.n(long, int, kotlin.coroutines.d):java.lang.Object");
    }
}
