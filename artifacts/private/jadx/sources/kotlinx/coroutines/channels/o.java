package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.e1;
import kotlinx.coroutines.internal.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class o {
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 60;
    private static final long G = 1152921504606846975L;
    private static final long H = 4611686018427387904L;
    private static final long I = 4611686018427387903L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f313837d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f313838e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f313851r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f313852s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f313853t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f313854u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f313855v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f313856w = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final u<Object> f313834a = new u<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public static final int f313835b = e1.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f313836c = e1.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final z0 f313839f = new z0("BUFFERED");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final z0 f313840g = new z0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final z0 f313841h = new z0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final z0 f313842i = new z0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final z0 f313843j = new z0("POISONED");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final z0 f313844k = new z0("DONE_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final z0 f313845l = new z0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final z0 f313846m = new z0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final z0 f313847n = new z0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final z0 f313848o = new z0("SUSPEND");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final z0 f313849p = new z0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final z0 f313850q = new z0("FAILED");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final z0 f313857x = new z0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final z0 f313858y = new z0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final z0 f313859z = new z0("CLOSE_HANDLER_INVOKED");

    @NotNull
    private static final z0 A = new z0("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* synthetic */ class a<E> extends kotlin.jvm.internal.g0 implements Function2<Long, u<E>, u<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313860a = new a();

        a() {
            super(2, o.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final u<E> X(long j10, u<E> uVar) {
            return o.x(j10, uVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return X(l10.longValue(), (u) obj);
        }
    }

    private static final long A(long j10) {
        return j10 & 4611686018427387903L;
    }

    private static final boolean B(long j10) {
        return (j10 & 4611686018427387904L) != 0;
    }

    private static final int C(long j10) {
        return (int) (j10 >> 60);
    }

    private static final long D(long j10) {
        return j10 & G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long E(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean F(kotlinx.coroutines.n<? super T> nVar, T t10, pj.n<? super Throwable, ? super T, ? super CoroutineContext, Unit> nVar2) {
        Object objP = nVar.P(t10, null, nVar2);
        if (objP == null) {
            return false;
        }
        nVar.b0(objP);
        return true;
    }

    static /* synthetic */ boolean G(kotlinx.coroutines.n nVar, Object obj, pj.n nVar2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            nVar2 = null;
        }
        return F(nVar, obj, nVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> u<E> x(long j10, u<E> uVar) {
        return new u<>(j10, uVar, uVar.G(), 0);
    }

    @NotNull
    public static final <E> kotlin.reflect.i<u<E>> y() {
        return a.f313860a;
    }

    @NotNull
    public static final z0 z() {
        return f313847n;
    }
}
