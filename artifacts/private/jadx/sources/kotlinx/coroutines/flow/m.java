package kotlinx.coroutines.flow;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final /* synthetic */ class m {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", AppsFlyerProperties.CHANNEL, "consume", "$this$emitAllImpl", AppsFlyerProperties.CHANNEL, "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f314708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f314709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f314710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f314711f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314710e = obj;
            this.f314711f |= Integer.MIN_VALUE;
            return m.d(null, null, false, this);
        }
    }

    @NotNull
    public static final <T> i<T> b(@NotNull kotlinx.coroutines.channels.n0<? extends T> n0Var) {
        return new e(n0Var, true, null, 0, null, 28, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull j<? super T> jVar, @NotNull kotlinx.coroutines.channels.n0<? extends T> n0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = d(jVar, n0Var, true, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #1 {all -> 0x0045, blocks: (B:14:0x003d, B:25:0x006f, B:29:0x0087, B:31:0x0090, B:21:0x0060, B:24:0x006b), top: B:46:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a6 -> B:15:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(kotlinx.coroutines.flow.j<? super T> r7, kotlinx.coroutines.channels.n0<? extends T> r8, boolean r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r6 = 6
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.m.a
            if (r0 == 0) goto L16
            r0 = r10
            kotlinx.coroutines.flow.m$a r0 = (kotlinx.coroutines.flow.m.a) r0
            int r1 = r0.f314711f
            r6 = 3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            r6 = 3
            int r1 = r1 - r2
            r0.f314711f = r1
            goto L1b
        L16:
            kotlinx.coroutines.flow.m$a r0 = new kotlinx.coroutines.flow.m$a
            r0.<init>(r10)
        L1b:
            java.lang.Object r10 = r0.f314710e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f314711f
            r3 = 2
            r3 = 2
            r6 = 0
            r4 = 1
            if (r2 == 0) goto L64
            if (r2 == r4) goto L51
            r6 = 6
            if (r2 != r3) goto L48
            boolean r9 = r0.f314709d
            java.lang.Object r7 = r0.f314708c
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            java.lang.Object r8 = r0.f314707b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            r6 = 4
            java.lang.Object r2 = r0.f314706a
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            r6 = 3
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L45
        L41:
            r10 = r7
            r7 = r2
            r6 = 4
            goto L6f
        L45:
            r7 = move-exception
            r6 = 7
            goto Lb3
        L48:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 2
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L51:
            boolean r9 = r0.f314709d
            r6 = 2
            java.lang.Object r7 = r0.f314708c
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            java.lang.Object r8 = r0.f314707b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            java.lang.Object r2 = r0.f314706a
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L45
            goto L87
        L64:
            r6 = 1
            kotlin.ResultKt.m(r10)
            kotlinx.coroutines.flow.k.q0(r7)
            kotlinx.coroutines.channels.r r10 = r8.iterator()     // Catch: java.lang.Throwable -> L45
        L6f:
            r6 = 1
            r0.f314706a = r7     // Catch: java.lang.Throwable -> L45
            r0.f314707b = r8     // Catch: java.lang.Throwable -> L45
            r0.f314708c = r10     // Catch: java.lang.Throwable -> L45
            r0.f314709d = r9     // Catch: java.lang.Throwable -> L45
            r0.f314711f = r4     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = r10.c(r0)     // Catch: java.lang.Throwable -> L45
            if (r2 != r1) goto L81
            goto La8
        L81:
            r5 = r2
            r5 = r2
            r2 = r7
            r2 = r7
            r7 = r10
            r10 = r5
        L87:
            r6 = 4
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L45
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto La9
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L45
            r6 = 2
            r0.f314706a = r2     // Catch: java.lang.Throwable -> L45
            r6 = 3
            r0.f314707b = r8     // Catch: java.lang.Throwable -> L45
            r0.f314708c = r7     // Catch: java.lang.Throwable -> L45
            r0.f314709d = r9     // Catch: java.lang.Throwable -> L45
            r6 = 7
            r0.f314711f = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L45
            r6 = 3
            if (r10 != r1) goto L41
        La8:
            return r1
        La9:
            if (r9 == 0) goto Lb0
            r6 = 2
            r7 = 0
            kotlinx.coroutines.channels.v.b(r8, r7)
        Lb0:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        Lb3:
            throw r7     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r10 = move-exception
            if (r9 == 0) goto Lba
            kotlinx.coroutines.channels.v.b(r8, r7)
        Lba:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m.d(kotlinx.coroutines.flow.j, kotlinx.coroutines.channels.n0, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public static final <T> kotlinx.coroutines.channels.n0<T> e(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var) {
        return kotlinx.coroutines.flow.internal.f.b(iVar).m(s0Var);
    }

    @NotNull
    public static final <T> i<T> f(@NotNull kotlinx.coroutines.channels.n0<? extends T> n0Var) {
        return new e(n0Var, false, null, 0, null, 28, null);
    }
}
