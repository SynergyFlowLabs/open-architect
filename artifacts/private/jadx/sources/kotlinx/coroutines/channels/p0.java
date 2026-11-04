package kotlinx.coroutines.channels;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class p0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {102, 104, 105}, m = "fixedDelayTicker", n = {AppsFlyerProperties.CHANNEL, "delayMillis", AppsFlyerProperties.CHANNEL, "delayMillis", AppsFlyerProperties.CHANNEL, "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f313869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f313871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313872d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313871c = obj;
            this.f313872d |= Integer.MIN_VALUE;
            return p0.c(0L, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {80, com.planner5d.library.engine.input.f.b.B0, 90, com.planner5d.library.engine.input.f.b.f160697i1}, m = "fixedPeriodTicker", n = {AppsFlyerProperties.CHANNEL, "delayMillis", "deadline", AppsFlyerProperties.CHANNEL, "deadline", "delayNs", AppsFlyerProperties.CHANNEL, "deadline", "delayNs", AppsFlyerProperties.CHANNEL, "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f313873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f313874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313877e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313876d = obj;
            this.f313877e |= Integer.MIN_VALUE;
            return p0.d(0L, 0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V, com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f313879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q0 f313880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f313881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f313882e;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f313883a;

            static {
                int[] iArr = new int[q0.values().length];
                try {
                    iArr[q0.FIXED_PERIOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q0.FIXED_DELAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f313883a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q0 q0Var, long j10, long j11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f313880c = q0Var;
            this.f313881d = j10;
            this.f313882e = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f313880c, this.f313881d, this.f313882e, dVar);
            cVar.f313879b = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (kotlinx.coroutines.channels.p0.d(r1, r3, r5, r11) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f313878a
                r2 = 6
                r2 = 2
                r10 = 5
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L11
                r10 = 2
                if (r1 != r2) goto L15
            L11:
                kotlin.ResultKt.m(r12)
                goto L70
            L15:
                r10 = 2
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "s/sokrin/e/  taer olec//ul/ b/nmo e oticvoehut/rfie"
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r10 = 3
                r11.<init>(r12)
                throw r11
            L21:
                kotlin.ResultKt.m(r12)
                r10 = 0
                java.lang.Object r12 = r11.f313879b
                kotlinx.coroutines.channels.l0 r12 = (kotlinx.coroutines.channels.l0) r12
                kotlinx.coroutines.channels.q0 r1 = r11.f313880c
                int[] r4 = kotlinx.coroutines.channels.p0.c.a.f313883a
                int r1 = r1.ordinal()
                r10 = 7
                r1 = r4[r1]
                r10 = 1
                if (r1 == r3) goto L56
                r10 = 1
                if (r1 != r2) goto L4e
                long r4 = r11.f313881d
                long r6 = r11.f313882e
                kotlinx.coroutines.channels.o0 r8 = r12.s()
                r11.f313878a = r2
                r9 = r11
                r10 = 0
                java.lang.Object r11 = kotlinx.coroutines.channels.p0.a(r4, r6, r8, r9)
                if (r11 != r0) goto L70
                r10 = 7
                goto L6e
            L4e:
                kotlin.k0 r11 = new kotlin.k0
                r10 = 4
                r11.<init>()
                r10 = 3
                throw r11
            L56:
                r6 = r11
                r6 = r11
                r10 = 7
                long r1 = r6.f313881d
                r10 = 7
                r11 = r3
                r11 = r3
                long r3 = r6.f313882e
                kotlinx.coroutines.channels.o0 r5 = r12.s()
                r10 = 1
                r6.f313878a = r11
                java.lang.Object r11 = kotlinx.coroutines.channels.p0.b(r1, r3, r5, r6)
                r10 = 2
                if (r11 != r0) goto L70
            L6e:
                r10 = 0
                return r0
            L70:
                r10 = 7
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.p0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super Unit> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (kotlinx.coroutines.d1.b(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r7, long r9, kotlinx.coroutines.channels.o0<? super kotlin.Unit> r11, kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.p0.a
            if (r0 == 0) goto L16
            r0 = r12
            r0 = r12
            kotlinx.coroutines.channels.p0$a r0 = (kotlinx.coroutines.channels.p0.a) r0
            int r1 = r0.f313872d
            r6 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f313872d = r1
            r6 = 4
            goto L1c
        L16:
            r6 = 4
            kotlinx.coroutines.channels.p0$a r0 = new kotlinx.coroutines.channels.p0$a
            r0.<init>(r12)
        L1c:
            java.lang.Object r12 = r0.f313871c
            r6 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 1
            int r2 = r0.f313872d
            r6 = 5
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L61
            r6 = 6
            if (r2 == r5) goto L55
            if (r2 == r4) goto L4b
            r6 = 0
            if (r2 != r3) goto L41
            r6 = 7
            long r7 = r0.f313869a
            java.lang.Object r9 = r0.f313870b
            kotlinx.coroutines.channels.o0 r9 = (kotlinx.coroutines.channels.o0) r9
            kotlin.ResultKt.m(r12)
        L3e:
            r11 = r9
            r11 = r9
            goto L72
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 7
            r7.<init>(r8)
            r6 = 0
            throw r7
        L4b:
            long r7 = r0.f313869a
            java.lang.Object r9 = r0.f313870b
            kotlinx.coroutines.channels.o0 r9 = (kotlinx.coroutines.channels.o0) r9
            kotlin.ResultKt.m(r12)
            goto L86
        L55:
            long r7 = r0.f313869a
            java.lang.Object r9 = r0.f313870b
            r11 = r9
            r6 = 6
            kotlinx.coroutines.channels.o0 r11 = (kotlinx.coroutines.channels.o0) r11
            kotlin.ResultKt.m(r12)
            goto L72
        L61:
            kotlin.ResultKt.m(r12)
            r0.f313870b = r11
            r0.f313869a = r7
            r6 = 6
            r0.f313872d = r5
            java.lang.Object r9 = kotlinx.coroutines.d1.b(r9, r0)
            if (r9 != r1) goto L72
            goto L94
        L72:
            r6 = 5
            kotlin.Unit r9 = kotlin.Unit.f312394a
            r0.f313870b = r11
            r0.f313869a = r7
            r6 = 3
            r0.f313872d = r4
            java.lang.Object r9 = r11.G(r9, r0)
            r6 = 0
            if (r9 != r1) goto L84
            goto L94
        L84:
            r9 = r11
            r9 = r11
        L86:
            r0.f313870b = r9
            r6 = 5
            r0.f313869a = r7
            r0.f313872d = r3
            java.lang.Object r10 = kotlinx.coroutines.d1.b(r7, r0)
            r6 = 7
            if (r10 != r1) goto L3e
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.p0.c(long, long, kotlinx.coroutines.channels.o0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
    
        if (kotlinx.coroutines.d1.b(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
    
        if (kotlinx.coroutines.d1.b(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0100 -> B:31:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0116 -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r18, long r20, kotlinx.coroutines.channels.o0<? super kotlin.Unit> r22, kotlin.coroutines.d<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.p0.d(long, long, kotlinx.coroutines.channels.o0, kotlin.coroutines.d):java.lang.Object");
    }

    @f3
    @NotNull
    public static final n0<Unit> e(long j10, long j11, @NotNull CoroutineContext coroutineContext, @NotNull q0 q0Var) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j10 + " ms").toString());
        }
        if (j11 >= 0) {
            return j0.e(f2.f314023a, l1.g().plus(coroutineContext), 0, new c(q0Var, j10, j11, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j11 + " ms").toString());
    }

    public static /* synthetic */ n0 f(long j10, long j11, CoroutineContext coroutineContext, q0 q0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        if ((i10 & 4) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 8) != 0) {
            q0Var = q0.FIXED_PERIOD;
        }
        return e(j10, j11, coroutineContext, q0Var);
    }
}
