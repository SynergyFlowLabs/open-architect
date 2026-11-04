package io.ktor.websocket;

import androidx.collection.g3;
import com.devtodev.core.data.metrics.MetricConsts;
import java.util.List;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.h f297338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.p f297339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f297340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f297341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f297342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<e> f297343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Object> f297344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f297345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f297346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final p2 f297347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final p2 f297348k;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.a0 f297349a;

        public a(@Nullable p2 p2Var) {
            this.f297349a = s2.a(p2Var);
        }

        @Nullable
        public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objD1 = this.f297349a.d1(dVar);
            return objD1 == kotlin.coroutines.intrinsics.b.l() ? objD1 : Unit.f312394a;
        }

        public final boolean b() {
            return this.f297349a.complete();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.RawWebSocketCommon", f = "RawWebSocketCommon.kt", i = {0}, l = {131, 134, 139}, m = "flush", n = {MetricConsts.Install}, s = {"L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297352c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297354e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297352c = obj;
            this.f297354e |= Integer.MIN_VALUE;
            return n.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", i = {2, 3}, l = {com.planner5d.library.engine.input.f.b.f160718p1, 102, 105, 109}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f297356b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new c(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0053 A[Catch: all -> 0x003d, CancellationException -> 0x0040, m -> 0x0043, h -> 0x0047, EOFException | c0 -> 0x00b2, EOFException | c0 -> 0x00b2, TRY_ENTER, TryCatch #3 {m -> 0x0043, blocks: (B:19:0x0038, B:31:0x0053, B:34:0x0073, B:36:0x007f, B:38:0x0088, B:40:0x0094, B:39:0x008b, B:41:0x0098, B:28:0x004b), top: B:64:0x000d, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0071  */
        /* JADX WARN: Code duplicated, block: B:34:0x0073 A[Catch: all -> 0x003d, CancellationException -> 0x0040, m -> 0x0043, h -> 0x0047, EOFException | c0 -> 0x00b2, EOFException | c0 -> 0x00b2, PHI: r11
          0x0073: PHI (r11v10 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:32:0x006f, B:28:0x004b] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {m -> 0x0043, blocks: (B:19:0x0038, B:31:0x0053, B:34:0x0073, B:36:0x007f, B:38:0x0088, B:40:0x0094, B:39:0x008b, B:41:0x0098, B:28:0x004b), top: B:64:0x000d, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x007f A[Catch: all -> 0x003d, CancellationException -> 0x0040, m -> 0x0043, h -> 0x0047, EOFException | c0 -> 0x00b2, EOFException | c0 -> 0x00b2, TryCatch #3 {m -> 0x0043, blocks: (B:19:0x0038, B:31:0x0053, B:34:0x0073, B:36:0x007f, B:38:0x0088, B:40:0x0094, B:39:0x008b, B:41:0x0098, B:28:0x004b), top: B:64:0x000d, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0088 A[Catch: all -> 0x003d, CancellationException -> 0x0040, m -> 0x0043, h -> 0x0047, EOFException | c0 -> 0x00b2, EOFException | c0 -> 0x00b2, TryCatch #3 {m -> 0x0043, blocks: (B:19:0x0038, B:31:0x0053, B:34:0x0073, B:36:0x007f, B:38:0x0088, B:40:0x0094, B:39:0x008b, B:41:0x0098, B:28:0x004b), top: B:64:0x000d, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x008b A[Catch: all -> 0x003d, CancellationException -> 0x0040, m -> 0x0043, h -> 0x0047, EOFException | c0 -> 0x00b2, EOFException | c0 -> 0x00b2, TryCatch #3 {m -> 0x0043, blocks: (B:19:0x0038, B:31:0x0053, B:34:0x0073, B:36:0x007f, B:38:0x0088, B:40:0x0094, B:39:0x008b, B:41:0x0098, B:28:0x004b), top: B:64:0x000d, outer: #2 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a5 -> B:31:0x0053). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.n.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1, 2}, l = {com.planner5d.library.engine.input.f.b.I0, 64, 65, com.planner5d.library.engine.input.f.b.B0, com.planner5d.library.engine.input.f.b.B0, com.planner5d.library.engine.input.f.b.B0, com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {"message", "message"}, s = {"L$0", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f297359b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new d(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0058  */
        /* JADX WARN: Code duplicated, block: B:23:0x005a A[Catch: all -> 0x002e, d -> 0x0032, PHI: r10
          0x005a: PHI (r10v24 java.lang.Object) = (r10v0 java.lang.Object), (r10v30 java.lang.Object) binds: [B:17:0x003c, B:21:0x0056] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {d -> 0x0032, all -> 0x002e, blocks: (B:9:0x002a, B:32:0x0092, B:20:0x0045, B:23:0x005a, B:25:0x0060, B:29:0x007f, B:38:0x00c6, B:40:0x00cb, B:41:0x00d7, B:42:0x00ee, B:34:0x0098, B:16:0x0038, B:17:0x003c), top: B:68:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00c6 A[Catch: all -> 0x002e, d -> 0x0032, TRY_ENTER, TryCatch #3 {d -> 0x0032, all -> 0x002e, blocks: (B:9:0x002a, B:32:0x0092, B:20:0x0045, B:23:0x005a, B:25:0x0060, B:29:0x007f, B:38:0x00c6, B:40:0x00cb, B:41:0x00d7, B:42:0x00ee, B:34:0x0098, B:16:0x0038, B:17:0x003c), top: B:68:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00cb A[Catch: all -> 0x002e, d -> 0x0032, TryCatch #3 {d -> 0x0032, all -> 0x002e, blocks: (B:9:0x002a, B:32:0x0092, B:20:0x0045, B:23:0x005a, B:25:0x0060, B:29:0x007f, B:38:0x00c6, B:40:0x00cb, B:41:0x00d7, B:42:0x00ee, B:34:0x0098, B:16:0x0038, B:17:0x003c), top: B:68:0x000c }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:32:0x0092). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cb -> B:20:0x0045). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.n.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public n(@NotNull io.ktor.utils.io.h input, @NotNull io.ktor.utils.io.p output, long j10, boolean z10, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f297338a = input;
        this.f297339b = output;
        this.f297340c = j10;
        this.f297341d = z10;
        kotlinx.coroutines.a0 a0VarA = s2.a((p2) coroutineContext.get(p2.M2));
        this.f297342e = a0VarA;
        this.f297343f = kotlinx.coroutines.channels.s.d(8, null, null, 6, null);
        this.f297344g = kotlinx.coroutines.channels.s.d(8, null, null, 6, null);
        this.f297346i = coroutineContext.plus(a0VarA).plus(new r0("raw-ws"));
        r0 r0Var = new r0("ws-writer");
        u0 u0Var = u0.ATOMIC;
        this.f297347j = kotlinx.coroutines.i.d(this, r0Var, u0Var, new d(null));
        this.f297348k = kotlinx.coroutines.i.d(this, new r0("ws-reader"), u0Var, new c(null));
        a0VarA.complete();
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public List<e0<?>> O0() {
        return CollectionsKt.emptyList();
    }

    @Override // io.ktor.websocket.o0
    public void R0(long j10) {
        this.f297340c = j10;
    }

    @Override // io.ktor.websocket.o0
    public long T() {
        return this.f297340c;
    }

    @Override // io.ktor.websocket.o0
    public void Y(boolean z10) {
        this.f297341d = z10;
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public kotlinx.coroutines.channels.n0<e> a() {
        return this.f297343f;
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public kotlinx.coroutines.channels.o0<e> b() {
        return this.f297344g;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r5.a(r0) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
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
    @Override // io.ktor.websocket.o0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.websocket.n.b
            if (r0 == 0) goto L18
            r0 = r10
            r0 = r10
            r8 = 3
            io.ktor.websocket.n$b r0 = (io.ktor.websocket.n.b) r0
            r8 = 4
            int r1 = r0.f297354e
            r8 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f297354e = r1
            goto L1d
        L18:
            io.ktor.websocket.n$b r0 = new io.ktor.websocket.n$b
            r0.<init>(r10)
        L1d:
            java.lang.Object r10 = r0.f297352c
            r8 = 3
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r8 = 2
            int r2 = r0.f297354e
            r3 = 3
            r8 = r3
            r4 = 2
            r8 = 1
            r5 = 1
            r6 = 2
            r6 = 0
            if (r2 == 0) goto L62
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L45
            r8 = 5
            if (r2 != r3) goto L3d
            r8 = 6
            kotlin.ResultKt.m(r10)
            goto Lbb
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L45:
            java.lang.Object r9 = r0.f297350a
            io.ktor.websocket.n$a r9 = (io.ktor.websocket.n.a) r9
            kotlin.ResultKt.m(r10)
            goto Laa
        L4d:
            r8 = 4
            java.lang.Object r2 = r0.f297351b
            io.ktor.websocket.n$a r2 = (io.ktor.websocket.n.a) r2
            r8 = 2
            java.lang.Object r5 = r0.f297350a
            io.ktor.websocket.n$a r5 = (io.ktor.websocket.n.a) r5
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L5b kotlinx.coroutines.channels.d0 -> L5e
            goto Lac
        L5b:
            r9 = move-exception
            r8 = 6
            goto L8f
        L5e:
            r10 = r2
            r2 = r5
            r8 = 7
            goto L95
        L62:
            kotlin.ResultKt.m(r10)
            io.ktor.websocket.n$a r2 = new io.ktor.websocket.n$a
            r8 = 6
            kotlin.coroutines.CoroutineContext r10 = r9.getCoroutineContext()
            r8 = 2
            kotlinx.coroutines.p2$b r7 = kotlinx.coroutines.p2.M2
            r8 = 0
            kotlin.coroutines.CoroutineContext$Element r10 = r10.get(r7)
            r8 = 2
            kotlinx.coroutines.p2 r10 = (kotlinx.coroutines.p2) r10
            r2.<init>(r10)
            kotlinx.coroutines.channels.p<java.lang.Object> r10 = r9.f297344g     // Catch: java.lang.Throwable -> L5b kotlinx.coroutines.channels.d0 -> L8c
            r0.f297350a = r2     // Catch: java.lang.Throwable -> L5b kotlinx.coroutines.channels.d0 -> L8c
            r0.f297351b = r2     // Catch: java.lang.Throwable -> L5b kotlinx.coroutines.channels.d0 -> L8c
            r0.f297354e = r5     // Catch: java.lang.Throwable -> L5b kotlinx.coroutines.channels.d0 -> L8c
            java.lang.Object r9 = r10.G(r2, r0)     // Catch: java.lang.Throwable -> L5b kotlinx.coroutines.channels.d0 -> L8c
            if (r9 != r1) goto L89
            goto Lba
        L89:
            r5 = r2
            r5 = r2
            goto Lac
        L8c:
            r10 = r2
            r10 = r2
            goto L95
        L8f:
            r8 = 7
            r2.b()
            r8 = 0
            throw r9
        L95:
            r10.b()
            r8 = 0
            kotlinx.coroutines.p2 r9 = r9.f297347j
            r0.f297350a = r2
            r0.f297351b = r6
            r8 = 4
            r0.f297354e = r4
            java.lang.Object r9 = r9.d1(r0)
            if (r9 != r1) goto La9
            goto Lba
        La9:
            r9 = r2
        Laa:
            r5 = r9
            r5 = r9
        Lac:
            r8 = 2
            r0.f297350a = r6
            r0.f297351b = r6
            r8 = 5
            r0.f297354e = r3
            java.lang.Object r9 = r5.a(r0)
            if (r9 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            kotlin.Unit r9 = kotlin.Unit.f312394a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.n.d(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object g1(@NotNull e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return o0.a.a(this, eVar, dVar);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f297346i;
    }

    @Override // io.ktor.websocket.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Use cancel() instead.", replaceWith = @b1(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void o0() {
        kotlinx.coroutines.channels.o0.a.a(b(), null, 1, null);
        this.f297342e.complete();
    }

    @Override // io.ktor.websocket.o0
    public boolean o1() {
        return this.f297341d;
    }

    public /* synthetic */ n(io.ktor.utils.io.h hVar, io.ktor.utils.io.p pVar, long j10, boolean z10, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, pVar, (i10 & 4) != 0 ? g3.f12256c : j10, (i10 & 8) != 0 ? false : z10, coroutineContext);
    }
}
