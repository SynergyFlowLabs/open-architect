package androidx.datastore.core;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,205:1\n159#1,8:226\n159#1,8:234\n120#2,10:206\n32#3,10:216\n*S KotlinDebug\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n99#1:226,8\n106#1:234,8\n43#1:206,10\n60#1:216,10\n*E\n"})
public final class a0 implements w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f49445j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f49446k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f49447l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f49448m = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f49449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f49450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Unit> f49451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f49452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f49453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f49454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f49455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f49456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlin.f0<m0> f49457i;

    public static final class a {

        /* JADX INFO: renamed from: androidx.datastore.core.a0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", i = {0, 0}, l = {182}, m = "getExclusiveFileLockWithRetryIfDeadlock", n = {"lockFileStream", "backoff"}, s = {"L$0", "J$0"})
        static final class C0428a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f49458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            long f49459b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f49460c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f49462e;

            C0428a(kotlin.coroutines.d<? super C0428a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f49460c = obj;
                this.f49462e |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:32|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
        
            r1 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        
            if (r1 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        
            r13.f49458a = r14;
            r13.f49459b = r4;
            r13.f49462e = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        
            if (kotlinx.coroutines.d1.b(r4, r13) == r15) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
        
            return r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:28:0x0092). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(java.io.FileOutputStream r14, kotlin.coroutines.d<? super java.nio.channels.FileLock> r15) throws java.io.IOException {
            /*
                r13 = this;
                boolean r0 = r15 instanceof androidx.datastore.core.a0.a.C0428a
                if (r0 == 0) goto L15
                r0 = r15
                androidx.datastore.core.a0$a$a r0 = (androidx.datastore.core.a0.a.C0428a) r0
                int r1 = r0.f49462e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r12 = 4
                r3 = r1 & r2
                if (r3 == 0) goto L15
                int r1 = r1 - r2
                r0.f49462e = r1
                r12 = 5
                goto L1a
            L15:
                androidx.datastore.core.a0$a$a r0 = new androidx.datastore.core.a0$a$a
                r0.<init>(r15)
            L1a:
                java.lang.Object r13 = r0.f49460c
                java.lang.Object r15 = kotlin.coroutines.intrinsics.b.l()
                r12 = 1
                int r1 = r0.f49462e
                r12 = 4
                r2 = 2
                r3 = 1
                r12 = 0
                if (r1 == 0) goto L42
                if (r1 != r3) goto L3a
                r12 = 6
                long r4 = r0.f49459b
                java.lang.Object r14 = r0.f49458a
                r12 = 5
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                r12 = 6
                kotlin.ResultKt.m(r13)
                r13 = r0
                r12 = 4
                goto L92
            L3a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L42:
                r12 = 2
                kotlin.ResultKt.m(r13)
                long r4 = androidx.datastore.core.a0.i()
                r13 = r0
            L4b:
                long r0 = androidx.datastore.core.a0.k()
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                r12 = 3
            */
            //  java.lang.String r1 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r0 > 0) goto L96
                r12 = 3
                java.nio.channels.FileChannel r6 = r14.getChannel()     // Catch: java.io.IOException -> L71
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r12 = 6
                r7 = 0
                java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L71
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.io.IOException -> L71
                return r0
            L71:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L95
                java.lang.String r6 = androidx.datastore.core.a0.h()
                r7 = 0
                r8 = 0
                boolean r1 = kotlin.text.StringsKt.V2(r1, r6, r7, r2, r8)
                if (r1 != r3) goto L95
                r13.f49458a = r14
                r13.f49459b = r4
                r13.f49462e = r3
                java.lang.Object r0 = kotlinx.coroutines.d1.b(r4, r13)
                if (r0 != r15) goto L92
                r12 = 7
                return r15
            L92:
                long r0 = (long) r2
                long r4 = r4 * r0
                goto L4b
            L95:
                throw r0
            L96:
                java.nio.channels.FileChannel r6 = r14.getChannel()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r7 = 0
                java.nio.channels.FileLock r13 = r6.lock(r7, r9, r11)
                r12 = 7
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r1)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.a0.a.b(java.io.FileOutputStream, kotlin.coroutines.d):java.lang.Object");
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n+ 2 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n1#1,205:1\n99#2:206\n*E\n"})
    public static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Integer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49463a;

        public b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a0.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f49463a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.f(a0.this.s().b());
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Integer> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n+ 2 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n1#1,205:1\n106#2:206\n*E\n"})
    public static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Integer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49465a;

        public c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f49465a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.f(a0.this.s().c());
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Integer> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function0<m0> {

        static final class a extends kotlin.jvm.internal.l0 implements Function0<File> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a0 f49468a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var) {
                super(0);
                this.f49468a = a0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final File invoke() throws IOException {
                a0 a0Var = this.f49468a;
                File fileP = a0Var.p(a0Var.f49453e);
                this.f49468a.n(fileP);
                return fileP;
            }
        }

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            m0.a aVar = m0.f49534b;
            aVar.d();
            return aVar.a(new a(a0.this));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {211, 47, 48}, m = io.sentry.protocol.z.b.f306551r, n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", io.sentry.protocol.z.b.f306551r}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
    static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f49471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f49472d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49474f;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49472d = obj;
            this.f49474f |= Integer.MIN_VALUE;
            return a0.this.a(null, this);
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function0<File> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            a0 a0Var = a0.this;
            File fileP = a0Var.p(a0Var.f49452d);
            a0.this.n(fileP);
            return fileP;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 1, 1, 1}, l = {com.planner5d.library.engine.input.f.b.I0, com.planner5d.library.engine.input.f.b.f160690g0}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", io.sentry.protocol.z.b.f306551r, "locked$iv"}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
    static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f49478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f49479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f49480e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49482g;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49480e = obj;
            this.f49482g |= Integer.MIN_VALUE;
            int i10 = 0 >> 0;
            return a0.this.c(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n*L\n1#1,205:1\n*E\n"})
    public static final class h<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<m0, kotlin.coroutines.d<? super T>, Object> f49484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f49485c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function2<? super m0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, a0 a0Var, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f49484b = function2;
            this.f49485c = a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new h(this.f49484b, this.f49485c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49483a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function2<m0, kotlin.coroutines.d<? super T>, Object> function2 = this.f49484b;
            m0 m0VarS = this.f49485c.s();
            this.f49483a = 1;
            Object objInvoke = function2.invoke(m0VarS, this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            return this.f49484b.invoke(this.f49485c.s(), this);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super T> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a0(@NotNull CoroutineContext context, @NotNull File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f49449a = context;
        this.f49450b = file;
        this.f49451c = e0.f49493c.f(file);
        this.f49452d = ".lock";
        this.f49453e = ".version";
        this.f49454f = "fcntl failed: EAGAIN";
        int i10 = 3 & 1;
        this.f49455g = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f49456h = kotlin.g0.c(new f());
        this.f49457i = kotlin.g0.c(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(File file) throws IOException {
        o(file);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private final void o(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File p(String str) {
        return new File(this.f49450b.getAbsolutePath() + str);
    }

    private final File r() {
        return (File) this.f49456h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m0 s() {
        return this.f49457i.getValue();
    }

    private static Object t(a0 a0Var) {
        return a0Var.f49457i;
    }

    private final <T> Object u(Function2<? super m0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super T> dVar) {
        if (this.f49457i.Z()) {
            return function2.invoke(s(), dVar);
        }
        CoroutineContext coroutineContext = this.f49449a;
        h hVar = new h(function2, this, null);
        kotlin.jvm.internal.h0.e(0);
        Object objH = kotlinx.coroutines.i.h(coroutineContext, hVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[Catch: all -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00db, blocks: (B:43:0x00d6, B:58:0x00fd, B:60:0x0101), top: B:81:0x0028, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd A[Catch: all -> 0x00db, TRY_ENTER, TryCatch #7 {all -> 0x00db, blocks: (B:43:0x00d6, B:58:0x00fd, B:60:0x0101), top: B:81:0x0028, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.Closeable, java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super T>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v23, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.datastore.core.w
    @Nullable
    public <T> Object a(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        e eVar;
        kotlinx.coroutines.sync.a aVar;
        ?? r10;
        FileOutputStream fileOutputStream;
        Throwable th2;
        ?? r11;
        ?? r12;
        ?? r13;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        ?? r14;
        ?? r15;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f49474f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f49474f = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        ?? r16 = eVar.f49472d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f49474f;
        try {
            try {
                try {
                    if (i11 == 0) {
                        ResultKt.m(r16);
                        aVar = this.f49455g;
                        eVar.f49469a = this;
                        eVar.f49470b = function1;
                        eVar.f49471c = aVar;
                        eVar.f49474f = 1;
                        if (aVar.h(null, eVar) != objL) {
                        }
                        r10 = function1;
                        r16 = aVar;
                        return objL;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) eVar.f49471c;
                            closeable = (Closeable) eVar.f49470b;
                            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) eVar.f49469a;
                            try {
                                ResultKt.m(r16);
                                r14 = aVar2;
                                r15 = r16;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    kotlin.io.c.a(closeable, null);
                                    r14.i(null);
                                    return r15;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r16 = r14;
                                    r16.i(null);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        }
                        closeable = (Closeable) eVar.f49471c;
                        r12 = (kotlinx.coroutines.sync.a) eVar.f49470b;
                        Function1 function2 = (Function1) eVar.f49469a;
                        try {
                            ResultKt.m(r16);
                            r13 = function2;
                            r12 = r12;
                            r11 = r16;
                            fileLock2 = (FileLock) r11;
                            try {
                                eVar.f49469a = r12;
                                eVar.f49470b = closeable;
                                eVar.f49471c = fileLock2;
                                eVar.f49474f = 3;
                                objInvoke = r13.invoke(eVar);
                                if (objInvoke != objL) {
                                    r14 = r12;
                                    fileLock = fileLock2;
                                    r15 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    kotlin.io.c.a(closeable, null);
                                    r14.i(null);
                                    return r15;
                                }
                                r10 = function1;
                                r16 = aVar;
                                return objL;
                            } catch (Throwable th5) {
                                fileLock = fileLock2;
                                th2 = th5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th2;
                        }
                    }
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) eVar.f49471c;
                    boolean z10 = (Function1<? super kotlin.coroutines.d<? super T>, ? extends Object>) ((Function1) eVar.f49470b);
                    a0 a0Var = (a0) eVar.f49469a;
                    ResultKt.m(r16);
                    r16 = aVar3;
                    this = a0Var;
                    r10 = z10;
                    a aVar4 = f49445j;
                    eVar.f49469a = r10;
                    eVar.f49470b = r16;
                    eVar.f49471c = fileOutputStream;
                    eVar.f49474f = 2;
                    Object objB = aVar4.b(fileOutputStream, eVar);
                    if (objB != objL) {
                        ?? r17 = r16;
                        r11 = objB;
                        r12 = r17;
                        r13 = r10;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r11;
                        eVar.f49469a = r12;
                        eVar.f49470b = closeable;
                        eVar.f49471c = fileLock2;
                        eVar.f49474f = 3;
                        objInvoke = r13.invoke(eVar);
                        if (objInvoke != objL) {
                            r14 = r12;
                            fileLock = fileLock2;
                            r15 = objInvoke;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            kotlin.io.c.a(closeable, null);
                            r14.i(null);
                            return r15;
                        }
                    }
                    r10 = function1;
                    r16 = aVar;
                    return objL;
                } catch (Throwable th7) {
                    th2 = th7;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th2;
                }
                r10 = function1;
                r16 = aVar;
                fileOutputStream = new FileOutputStream(this.r());
            } catch (Throwable th8) {
                th = th8;
                r16.i(null);
                throw th;
            }
        } catch (Throwable th9) {
            r16 = eVar;
            try {
                throw th9;
            } catch (Throwable th10) {
                kotlin.io.c.a(function1, th9);
                throw th10;
            }
        }
    }

    @Override // androidx.datastore.core.w
    @NotNull
    public kotlinx.coroutines.flow.i<Unit> b() {
        return this.f49451c;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00f2, blocks: (B:60:0x00ee, B:74:0x010b, B:75:0x010e), top: B:89:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b A[Catch: all -> 0x00f2, TRY_ENTER, TryCatch #2 {all -> 0x00f2, blocks: (B:60:0x00ee, B:74:0x010b, B:75:0x010e), top: B:89:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.a0$g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // androidx.datastore.core.w
    @Nullable
    public <T> Object c(@NotNull Function2<? super Boolean, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        ?? gVar;
        ?? r10;
        ?? r11;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        Closeable closeable;
        ?? r12;
        ?? r13;
        if (dVar instanceof g) {
            g gVar2 = (g) dVar;
            int i10 = gVar2.f49482g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar2.f49482g = i10 - Integer.MIN_VALUE;
                gVar = gVar2;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objInvoke = ((g) gVar).f49480e;
        ?? L = kotlin.coroutines.intrinsics.b.l();
        int i11 = ((g) gVar).f49482g;
        try {
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                kotlinx.coroutines.sync.a aVar = this.f49455g;
                boolean zB = aVar.b(null);
                try {
                    if (zB) {
                        FileInputStream fileInputStream = new FileInputStream(r());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e10) {
                            String message2 = e10.getMessage();
                            if ((message2 == null || !StringsKt.u2(message2, this.f49454f, false, 2, null)) && ((message = e10.getMessage()) == null || !StringsKt.u2(message, f49446k, false, 2, null))) {
                                throw e10;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(fileLockTryLock != null);
                            ((g) gVar).f49476a = aVar;
                            ((g) gVar).f49477b = fileInputStream;
                            ((g) gVar).f49478c = fileLockTryLock;
                            ((g) gVar).f49479d = zB;
                            ((g) gVar).f49482g = 2;
                            objInvoke = function2.invoke(boolA, (Object) gVar);
                            if (objInvoke != L) {
                                fileLock = fileLockTryLock;
                                gVar = aVar;
                                r10 = zB;
                                closeable = fileInputStream;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                kotlin.io.c.a(closeable, null);
                                if (r10 != 0) {
                                    ((kotlinx.coroutines.sync.a) gVar).i(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(false);
                        ((g) gVar).f49476a = aVar;
                        ((g) gVar).f49479d = zB;
                        ((g) gVar).f49482g = 1;
                        objInvoke = function2.invoke(boolA2, (Object) gVar);
                        if (objInvoke != L) {
                            r12 = aVar;
                            r13 = zB;
                            if (r13 != 0) {
                                r12.i(null);
                            }
                            return objInvoke;
                        }
                    }
                    return L;
                } catch (Throwable th4) {
                    th = th4;
                    r11 = aVar;
                    r10 = zB;
                }
            } else if (i11 == 1) {
                r10 = ((g) gVar).f49479d;
                r11 = (kotlinx.coroutines.sync.a) ((g) gVar).f49476a;
                try {
                    ResultKt.m(objInvoke);
                    r13 = r10;
                    r12 = r11;
                    if (r13 != 0) {
                        r12.i(null);
                    }
                    return objInvoke;
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = ((g) gVar).f49479d;
                fileLock = (FileLock) ((g) gVar).f49478c;
                closeable = (Closeable) ((g) gVar).f49477b;
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) ((g) gVar).f49476a;
                try {
                    ResultKt.m(objInvoke);
                    r10 = z10;
                    gVar = aVar2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        kotlin.io.c.a(closeable, null);
                        if (r10 != 0) {
                            ((kotlinx.coroutines.sync.a) gVar).i(null);
                        }
                        return objInvoke;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th8) {
            try {
                throw th8;
            } catch (Throwable th9) {
                try {
                    kotlin.io.c.a(L, th8);
                    throw th9;
                } catch (Throwable th10) {
                    th = th10;
                    r10 = this;
                }
            }
        }
        r11 = gVar;
        if (r10 != 0) {
            r11.i(null);
        }
        throw th;
    }

    @Override // androidx.datastore.core.w
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Integer> dVar) {
        return this.f49457i.Z() ? kotlin.coroutines.jvm.internal.b.f(s().b()) : kotlinx.coroutines.i.h(this.f49449a, new b(null), dVar);
    }

    @Override // androidx.datastore.core.w
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Integer> dVar) {
        return this.f49457i.Z() ? kotlin.coroutines.jvm.internal.b.f(s().c()) : kotlinx.coroutines.i.h(this.f49449a, new c(null), dVar);
    }

    @NotNull
    protected final File q() {
        return this.f49450b;
    }
}
