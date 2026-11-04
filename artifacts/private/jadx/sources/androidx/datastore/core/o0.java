package androidx.datastore.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSingleProcessCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,60:1\n120#2,10:61\n32#3,10:71\n*S KotlinDebug\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n*L\n40#1:61,10\n49#1:71,10\n*E\n"})
public final class o0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f49700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f49701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f49702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Unit> f49703d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0, 1}, l = {66, 41}, m = io.sentry.protocol.z.b.f306551r, n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49706c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49708e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49706c = obj;
            this.f49708e |= Integer.MIN_VALUE;
            return o0.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0}, l = {50}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv"}, s = {"L$0", "Z$0"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f49710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49711c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49713e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49711c = obj;
            this.f49713e |= Integer.MIN_VALUE;
            return o0.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49714a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f49714a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super Unit> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public o0(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f49700a = filePath;
        int i10 = 0 >> 1;
        this.f49701b = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f49702c = new d(0);
        this.f49703d = kotlinx.coroutines.flow.k.K0(new c(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.o0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.a] */
    @Override // androidx.datastore.core.w
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super T> r9) {
        /*
            r7 = this;
            java.lang.String r6 = "Androeed.ru"
            boolean r0 = r9 instanceof androidx.datastore.core.o0.a
            if (r0 == 0) goto L17
            r0 = r9
            androidx.datastore.core.o0$a r0 = (androidx.datastore.core.o0.a) r0
            int r1 = r0.f49708e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            r6 = 6
            int r1 = r1 - r2
            r6 = 7
            r0.f49708e = r1
            goto L1c
        L17:
            androidx.datastore.core.o0$a r0 = new androidx.datastore.core.o0$a
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f49706c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49708e
            r3 = 7
            r3 = 2
            r4 = 5
            r4 = 1
            r5 = 0
            r6 = r5
            if (r2 == 0) goto L53
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.f49704a
            kotlinx.coroutines.sync.a r7 = (kotlinx.coroutines.sync.a) r7
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L39
            r6 = 5
            goto L77
        L39:
            r8 = move-exception
            goto L7b
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            r6 = 5
            throw r7
        L44:
            r6 = 6
            java.lang.Object r7 = r0.f49705b
            r6 = 3
            kotlinx.coroutines.sync.a r7 = (kotlinx.coroutines.sync.a) r7
            java.lang.Object r8 = r0.f49704a
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            kotlin.ResultKt.m(r9)
            r6 = 0
            goto L66
        L53:
            kotlin.ResultKt.m(r9)
            kotlinx.coroutines.sync.a r7 = r7.f49701b
            r0.f49704a = r8
            r0.f49705b = r7
            r6 = 1
            r0.f49708e = r4
            java.lang.Object r9 = r7.h(r5, r0)
            if (r9 != r1) goto L66
            goto L75
        L66:
            r0.f49704a = r7     // Catch: java.lang.Throwable -> L39
            r6 = 0
            r0.f49705b = r5     // Catch: java.lang.Throwable -> L39
            r0.f49708e = r3     // Catch: java.lang.Throwable -> L39
            r6 = 7
            java.lang.Object r9 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L39
            r6 = 0
            if (r9 != r1) goto L77
        L75:
            r6 = 7
            return r1
        L77:
            r7.i(r5)
            return r9
        L7b:
            r6 = 2
            r7.i(r5)
            r6 = 1
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.o0.a(kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.datastore.core.w
    @NotNull
    public kotlinx.coroutines.flow.i<Unit> b() {
        return this.f49703d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.datastore.core.w
    @Nullable
    public <T> Object c(@NotNull Function2<? super Boolean, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        boolean z10;
        Throwable th2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f49713e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f49713e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f49711c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f49713e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar.f49710b;
            aVar = (kotlinx.coroutines.sync.a) bVar.f49709a;
            try {
                ResultKt.m(obj);
                if (z10) {
                    aVar.i(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z10) {
                    throw th2;
                }
                aVar.i(null);
                throw th2;
            }
        }
        ResultKt.m(obj);
        kotlinx.coroutines.sync.a aVar2 = this.f49701b;
        boolean zB = aVar2.b(null);
        try {
            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zB);
            bVar.f49709a = aVar2;
            bVar.f49710b = zB;
            bVar.f49713e = 1;
            Object objInvoke = function2.invoke(boolA, bVar);
            if (objInvoke == objL) {
                return objL;
            }
            aVar = aVar2;
            z10 = zB;
            obj = objInvoke;
            if (z10) {
                aVar.i(null);
            }
            return obj;
        } catch (Throwable th4) {
            aVar = aVar2;
            z10 = zB;
            th2 = th4;
            if (z10) {
                throw th2;
            }
            aVar.i(null);
            throw th2;
        }
    }

    @Override // androidx.datastore.core.w
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Integer> dVar) {
        return kotlin.coroutines.jvm.internal.b.f(this.f49702c.b());
    }

    @Override // androidx.datastore.core.w
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Integer> dVar) {
        return kotlin.coroutines.jvm.internal.b.f(this.f49702c.d());
    }
}
