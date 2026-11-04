package kotlinx.coroutines.rx2;

import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class e extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f315321e = AtomicLongFieldUpdater.newUpdater(e.class, "workerCounter$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final n0 f315322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f315323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s0 f315324d;
    private volatile /* synthetic */ long workerCounter$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends j0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f315325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final n0 f315326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.a0 f315327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final s0 f315328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.channels.p<Function1<kotlin.coroutines.d<? super Unit>, Object>> f315329e;

        /* JADX INFO: renamed from: kotlinx.coroutines.rx2.e$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1", f = "RxScheduler.kt", i = {0, 1}, l = {183, 78}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nRxScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxScheduler.kt\nkotlinx/coroutines/rx2/DispatcherScheduler$DispatcherWorker$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,178:1\n160#2:179\n94#2,3:180\n161#2,2:183\n101#2:185\n97#2,3:186\n*S KotlinDebug\n*F\n+ 1 RxScheduler.kt\nkotlinx/coroutines/rx2/DispatcherScheduler$DispatcherWorker$1\n*L\n77#1:179\n77#1:180,3\n77#1:183,2\n77#1:185\n77#1:186,3\n*E\n"})
        static final class C2315a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f315330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f315331b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f315332c;

            C2315a(kotlin.coroutines.d<? super C2315a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return a.this.new C2315a(dVar);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0058  */
            /* JADX WARN: Code duplicated, block: B:22:0x0059  */
            /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:8:0x0019, B:19:0x004a, B:23:0x005c, B:25:0x0066, B:28:0x007a, B:15:0x0036, B:18:0x0045), top: B:38:0x000a }] */
            /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:8:0x0019, B:19:0x004a, B:23:0x005c, B:25:0x0066, B:28:0x007a, B:15:0x0036, B:18:0x0045), top: B:38:0x000a }] */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
            
                if (r8.invoke(r7) == r0) goto L27;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0077 -> B:9:0x001c). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r7.f315332c
                    r6 = 3
                    r2 = 2
                    r6 = 6
                    r3 = 1
                    if (r1 == 0) goto L3b
                    if (r1 == r3) goto L2b
                    r6 = 7
                    if (r1 != r2) goto L21
                    java.lang.Object r1 = r7.f315331b
                    kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                    java.lang.Object r4 = r7.f315330a
                    kotlinx.coroutines.channels.n0 r4 = (kotlinx.coroutines.channels.n0) r4
                    kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L1f
                L1c:
                    r8 = r1
                    r6 = 6
                    goto L4a
                L1f:
                    r7 = move-exception
                    goto L82
                L21:
                    r6 = 0
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    r6 = 6
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2b:
                    java.lang.Object r1 = r7.f315331b
                    r6 = 0
                    kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                    r6 = 0
                    java.lang.Object r4 = r7.f315330a
                    r6 = 4
                    kotlinx.coroutines.channels.n0 r4 = (kotlinx.coroutines.channels.n0) r4
                    r6 = 1
                    kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L1f
                    goto L5c
                L3b:
                    r6 = 7
                    kotlin.ResultKt.m(r8)
                    kotlinx.coroutines.rx2.e$a r8 = kotlinx.coroutines.rx2.e.a.this
                    kotlinx.coroutines.channels.p r4 = kotlinx.coroutines.rx2.e.a.g(r8)
                    r6 = 7
                    kotlinx.coroutines.channels.r r8 = r4.iterator()     // Catch: java.lang.Throwable -> L1f
                L4a:
                    r7.f315330a = r4     // Catch: java.lang.Throwable -> L1f
                    r6 = 2
                    r7.f315331b = r8     // Catch: java.lang.Throwable -> L1f
                    r7.f315332c = r3     // Catch: java.lang.Throwable -> L1f
                    java.lang.Object r1 = r8.c(r7)     // Catch: java.lang.Throwable -> L1f
                    r6 = 5
                    if (r1 != r0) goto L59
                    goto L79
                L59:
                    r5 = r1
                    r1 = r8
                    r8 = r5
                L5c:
                    r6 = 4
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L1f
                    r6 = 1
                    boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L1f
                    if (r8 == 0) goto L7a
                    java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L1f
                    kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8     // Catch: java.lang.Throwable -> L1f
                    r7.f315330a = r4     // Catch: java.lang.Throwable -> L1f
                    r7.f315331b = r1     // Catch: java.lang.Throwable -> L1f
                    r7.f315332c = r2     // Catch: java.lang.Throwable -> L1f
                    r6 = 7
                    java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L1f
                    if (r8 != r0) goto L1c
                L79:
                    return r0
                L7a:
                    r6 = 4
                    kotlin.Unit r7 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L1f
                    r8 = 0
                    kotlinx.coroutines.channels.v.b(r4, r8)
                    return r7
                L82:
                    r6 = 6
                    throw r7     // Catch: java.lang.Throwable -> L84
                L84:
                    r8 = move-exception
                    kotlinx.coroutines.channels.v.b(r4, r7)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.e.a.C2315a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2315a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public a(long j10, @NotNull n0 n0Var, @NotNull p2 p2Var) {
            this.f315325a = j10;
            this.f315326b = n0Var;
            kotlinx.coroutines.a0 a0VarA = q3.a(p2Var);
            this.f315327c = a0VarA;
            s0 s0VarA = t0.a(a0VarA.plus(n0Var));
            this.f315328d = s0VarA;
            this.f315329e = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
            kotlinx.coroutines.k.f(s0VarA, null, null, new C2315a(null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Runnable h(final a aVar, final Function1 function1) {
            return new Runnable() { // from class: kotlinx.coroutines.rx2.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.i(this.f315319a, function1);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(a aVar, Function1 function1) {
            aVar.f315329e.p(function1);
        }

        @Override // io.reactivex.j0.c
        @NotNull
        public io.reactivex.disposables.c c(@NotNull Runnable runnable, long j10, @NotNull TimeUnit timeUnit) {
            return a0.h(this.f315328d, runnable, timeUnit.toMillis(j10), new Function1() { // from class: kotlinx.coroutines.rx2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.a.h(this.f315315a, (Function1) obj);
                }
            });
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            o0.a.a(this.f315329e, null, 1, null);
            p2.a.b(this.f315327c, null, 1, null);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return !t0.k(this.f315328d);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f315326b);
            sb2.append(" (worker ");
            sb2.append(this.f315325a);
            sb2.append(", ");
            sb2.append(k() ? "disposed" : "active");
            sb2.append(')');
            return sb2.toString();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.DispatcherScheduler$scheduleDirect$1$1$1", f = "RxScheduler.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f315335b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f315335b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f315335b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315334a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f315335b;
                this.f315334a = 1;
                if (function1.invoke(this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public e(@NotNull n0 n0Var) {
        this.f315322b = n0Var;
        kotlinx.coroutines.a0 a0VarC = q3.c(null, 1, null);
        this.f315323c = a0VarC;
        this.f315324d = t0.a(a0VarC.plus(n0Var));
        this.workerCounter$volatile = 1L;
    }

    private final /* synthetic */ long n() {
        return this.workerCounter$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable p(final e eVar, final Function1 function1) {
        return new Runnable() { // from class: kotlinx.coroutines.rx2.a
            @Override // java.lang.Runnable
            public final void run() {
                e.q(this.f315305a, function1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(e eVar, Function1 function1) {
        kotlinx.coroutines.k.f(eVar.f315324d, null, null, new b(function1, null), 3, null);
    }

    private final /* synthetic */ void r(long j10) {
        this.workerCounter$volatile = j10;
    }

    @Override // io.reactivex.j0
    @NotNull
    public j0.c c() {
        return new a(f315321e.getAndIncrement(this), this.f315322b, this.f315323c);
    }

    @Override // io.reactivex.j0
    @NotNull
    public io.reactivex.disposables.c f(@NotNull Runnable runnable, long j10, @NotNull TimeUnit timeUnit) {
        return a0.h(this.f315324d, runnable, timeUnit.toMillis(j10), new Function1() { // from class: kotlinx.coroutines.rx2.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.p(this.f315313a, (Function1) obj);
            }
        });
    }

    @Override // io.reactivex.j0
    public void h() {
        p2.a.b(this.f315323c, null, 1, null);
    }

    @NotNull
    public String toString() {
        return this.f315322b.toString();
    }
}
