package io.ktor.websocket;

import com.devtodev.core.data.metrics.MetricConsts;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.p f297425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f297426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f297427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.pool.h<ByteBuffer> f297428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Object> f297429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final s f297430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final p2 f297431g;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.a0 f297432a;

        public a(@Nullable p2 p2Var) {
            this.f297432a = s2.a(p2Var);
        }

        @Nullable
        public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objD1 = this.f297432a.d1(dVar);
            return objD1 == kotlin.coroutines.intrinsics.b.l() ? objD1 : Unit.f312394a;
        }

        public final boolean b() {
            return this.f297432a.complete();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {125, 129, 143}, m = "drainQueueAndSerialize", n = {"buffer", "flush", "closeSent", "buffer", "flush", MetricConsts.Install, "closeSent", "flush", "closeSent"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "I$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f297435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f297437e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f297439g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297437e = obj;
            this.f297439g |= Integer.MIN_VALUE;
            return q0.this.i(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0}, l = {163, 166, 171}, m = "flush", n = {MetricConsts.Install}, s = {"L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297442c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297444e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297442c = obj;
            this.f297444e |= Integer.MIN_VALUE;
            return q0.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 1}, l = {50, 52, 67, 67, 67, 67}, m = "writeLoop", n = {"buffer", "buffer"}, s = {"L$0", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297447c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297449e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297447c = obj;
            this.f297449e |= Integer.MIN_VALUE;
            int i10 = 5 ^ 0;
            return q0.this.k(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nio/ktor/websocket/WebSocketWriter$writeLoopJob$1\n+ 2 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,179:1\n182#2,5:180\n*S KotlinDebug\n*F\n+ 1 WebSocketWriter.kt\nio/ktor/websocket/WebSocketWriter$writeLoopJob$1\n*L\n44#1:180,5\n*E\n"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297452c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q0.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            io.ktor.utils.io.pool.h hVar;
            Object obj2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f297452c;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.utils.io.pool.h<ByteBuffer> hVarJ = q0.this.j();
                q0 q0Var = q0.this;
                ByteBuffer byteBufferJc = hVarJ.Jc();
                try {
                    this.f297450a = hVarJ;
                    this.f297451b = byteBufferJc;
                    this.f297452c = 1;
                    if (q0Var.k(byteBufferJc, this) == objL) {
                        return objL;
                    }
                    hVar = hVarJ;
                    obj2 = byteBufferJc;
                } catch (Throwable th3) {
                    th2 = th3;
                    hVar = hVarJ;
                    obj2 = byteBufferJc;
                    hVar.h8(obj2);
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f297451b;
                hVar = (io.ktor.utils.io.pool.h) this.f297450a;
                try {
                    ResultKt.m(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    hVar.h8(obj2);
                    throw th2;
                }
            }
            Unit unit = Unit.f312394a;
            hVar.h8(obj2);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public q0(@NotNull io.ktor.utils.io.p writeChannel, @NotNull CoroutineContext coroutineContext, boolean z10, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f297425a = writeChannel;
        this.f297426b = coroutineContext;
        this.f297427c = z10;
        this.f297428d = pool;
        this.f297429e = kotlinx.coroutines.channels.s.d(8, null, null, 6, null);
        this.f297430f = new s();
        this.f297431g = kotlinx.coroutines.i.d(this, new r0("ws-writer"), u0.ATOMIC, new e(null));
    }

    private final void f() {
        kotlinx.coroutines.channels.o0.a.a(this.f297429e, null, 1, null);
        while (true) {
            try {
                Object objH = kotlinx.coroutines.channels.t.h(this.f297429e.w());
                if (objH == null) {
                    return;
                }
                if (!(objH instanceof io.ktor.websocket.e.b) && !(objH instanceof io.ktor.websocket.e.d) && !(objH instanceof io.ktor.websocket.e.C2109e)) {
                    if (objH instanceof a) {
                        ((a) objH).b();
                    } else if (!(objH instanceof io.ktor.websocket.e.f) && !(objH instanceof io.ktor.websocket.e.a)) {
                        throw new IllegalArgumentException("unknown message " + objH);
                    }
                }
            } catch (CancellationException unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x013b A[PHI: r11 r12 r13
      0x013b: PHI (r11v4 kotlin.jvm.internal.i1$h) = (r11v6 kotlin.jvm.internal.i1$h), (r11v11 kotlin.jvm.internal.i1$h) binds: [B:58:0x012a, B:77:0x0198] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r12v7 ??) = (r12v25 ??), (r12v26 ??) binds: [B:58:0x012a, B:77:0x0198] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r13v6 java.nio.ByteBuffer) = (r13v7 java.nio.ByteBuffer), (r13v8 java.nio.ByteBuffer) binds: [B:58:0x012a, B:77:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x015c -> B:73:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0162 -> B:73:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x016a -> B:73:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x017d -> B:72:0x0180). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(io.ktor.websocket.e r11, java.nio.ByteBuffer r12, kotlin.coroutines.d<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.q0.i(io.ktor.websocket.e, java.nio.ByteBuffer, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[Catch: all -> 0x00c5, d -> 0x00c9, TryCatch #4 {d -> 0x00c9, all -> 0x00c5, blocks: (B:39:0x00b3, B:32:0x008d, B:34:0x0095, B:36:0x009f, B:47:0x00cc, B:49:0x00d0, B:50:0x00da, B:51:0x00f3), top: B:75:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc A[Catch: all -> 0x00c5, d -> 0x00c9, TryCatch #4 {d -> 0x00c9, all -> 0x00c5, blocks: (B:39:0x00b3, B:32:0x008d, B:34:0x0095, B:36:0x009f, B:47:0x00cc, B:49:0x00d0, B:50:0x00da, B:51:0x00f3), top: B:75:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[Catch: all -> 0x00c5, d -> 0x00c9, TryCatch #4 {d -> 0x00c9, all -> 0x00c5, blocks: (B:39:0x00b3, B:32:0x008d, B:34:0x0095, B:36:0x009f, B:47:0x00cc, B:49:0x00d0, B:50:0x00da, B:51:0x00f3), top: B:75:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00af -> B:75:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d0 -> B:42:0x00bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(java.nio.ByteBuffer r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.q0.k(java.nio.ByteBuffer, kotlin.coroutines.d):java.lang.Object");
    }

    public final void Y(boolean z10) {
        this.f297427c = z10;
    }

    @NotNull
    public final kotlinx.coroutines.channels.o0<io.ktor.websocket.e> b() {
        return this.f297429e;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r5.a(r0) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            r8 = 3
            boolean r0 = r10 instanceof io.ktor.websocket.q0.c
            if (r0 == 0) goto L17
            r0 = r10
            io.ktor.websocket.q0$c r0 = (io.ktor.websocket.q0.c) r0
            int r1 = r0.f297444e
            r8 = 4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r8 = 4
            if (r3 == 0) goto L17
            r8 = 2
            int r1 = r1 - r2
            r0.f297444e = r1
            goto L1c
        L17:
            io.ktor.websocket.q0$c r0 = new io.ktor.websocket.q0$c
            r0.<init>(r10)
        L1c:
            java.lang.Object r10 = r0.f297442c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297444e
            r3 = 3
            r8 = 3
            r4 = 2
            r5 = 1
            r8 = 6
            r6 = 0
            if (r2 == 0) goto L62
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L42
            if (r2 != r3) goto L38
            r8 = 3
            kotlin.ResultKt.m(r10)
            goto Lb8
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 7
            r9.<init>(r10)
            r8 = 0
            throw r9
        L42:
            java.lang.Object r9 = r0.f297440a
            io.ktor.websocket.q0$a r9 = (io.ktor.websocket.q0.a) r9
            kotlin.ResultKt.m(r10)
            r8 = 2
            goto La8
        L4b:
            java.lang.Object r2 = r0.f297441b
            io.ktor.websocket.q0$a r2 = (io.ktor.websocket.q0.a) r2
            r8 = 3
            java.lang.Object r5 = r0.f297440a
            io.ktor.websocket.q0$a r5 = (io.ktor.websocket.q0.a) r5
            r8 = 2
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L59 kotlinx.coroutines.channels.d0 -> L5c
            goto La9
        L59:
            r9 = move-exception
            r8 = 5
            goto L91
        L5c:
            r10 = r2
            r10 = r2
            r2 = r5
            r2 = r5
            r8 = 6
            goto L95
        L62:
            kotlin.ResultKt.m(r10)
            io.ktor.websocket.q0$a r2 = new io.ktor.websocket.q0$a
            r8 = 3
            kotlin.coroutines.CoroutineContext r10 = r9.getCoroutineContext()
            r8 = 4
            kotlinx.coroutines.p2$b r7 = kotlinx.coroutines.p2.M2
            r8 = 0
            kotlin.coroutines.CoroutineContext$Element r10 = r10.get(r7)
            r8 = 3
            kotlinx.coroutines.p2 r10 = (kotlinx.coroutines.p2) r10
            r2.<init>(r10)
            r8 = 7
            kotlinx.coroutines.channels.p<java.lang.Object> r10 = r9.f297429e     // Catch: java.lang.Throwable -> L59 kotlinx.coroutines.channels.d0 -> L8e
            r0.f297440a = r2     // Catch: java.lang.Throwable -> L59 kotlinx.coroutines.channels.d0 -> L8e
            r0.f297441b = r2     // Catch: java.lang.Throwable -> L59 kotlinx.coroutines.channels.d0 -> L8e
            r0.f297444e = r5     // Catch: java.lang.Throwable -> L59 kotlinx.coroutines.channels.d0 -> L8e
            r8 = 1
            java.lang.Object r9 = r10.G(r2, r0)     // Catch: java.lang.Throwable -> L59 kotlinx.coroutines.channels.d0 -> L8e
            if (r9 != r1) goto L8b
            goto Lb6
        L8b:
            r5 = r2
            r5 = r2
            goto La9
        L8e:
            r10 = r2
            r10 = r2
            goto L95
        L91:
            r2.b()
            throw r9
        L95:
            r10.b()
            kotlinx.coroutines.p2 r9 = r9.f297431g
            r0.f297440a = r2
            r0.f297441b = r6
            r0.f297444e = r4
            java.lang.Object r9 = r9.d1(r0)
            if (r9 != r1) goto La7
            goto Lb6
        La7:
            r9 = r2
        La8:
            r5 = r9
        La9:
            r0.f297440a = r6
            r8 = 7
            r0.f297441b = r6
            r0.f297444e = r3
            java.lang.Object r9 = r5.a(r0)
            if (r9 != r1) goto Lb8
        Lb6:
            r8 = 6
            return r1
        Lb8:
            kotlin.Unit r9 = kotlin.Unit.f312394a
            r8 = 6
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.q0.d(kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object g1(@NotNull io.ktor.websocket.e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = this.f297429e.G(eVar, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f297426b;
    }

    @NotNull
    public final io.ktor.utils.io.pool.h<ByteBuffer> j() {
        return this.f297428d;
    }

    public final boolean o1() {
        return this.f297427c;
    }

    public /* synthetic */ q0(io.ktor.utils.io.p pVar, CoroutineContext coroutineContext, boolean z10, io.ktor.utils.io.pool.h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, coroutineContext, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? io.ktor.util.cio.a.a() : hVar);
    }
}
