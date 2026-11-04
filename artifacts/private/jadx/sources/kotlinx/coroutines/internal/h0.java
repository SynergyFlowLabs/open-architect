package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n295#2,3:305\n295#2,3:308\n295#2,3:311\n295#2,3:314\n295#2,3:317\n295#2,3:321\n295#2,3:324\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n87#1:305,3\n88#1:308,3\n103#1:311,3\n163#1:314,3\n196#1:317,3\n227#1:321,3\n243#1:324,3\n*E\n"})
public final class h0<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f315055h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f315056i = 30;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f315057j = 1073741823;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f315058k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f315059l = 1073741823;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f315060m = 30;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f315061n = 1152921503533105152L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f315062o = 60;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f315063p = 1152921504606846976L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f315064q = 61;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f315065r = 2305843009213693952L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f315066s = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f315068u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f315069v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f315070w = 2;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f315071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f315072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f315073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f315074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f315052e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315053f = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f315054g = AtomicLongFieldUpdater.newUpdater(h0.class, "_state$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final z0 f315067t = new z0("REMOVE_FROZEN");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j10) {
            return (j10 & h0.f315065r) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return e(j10, 1073741823L) | ((long) i10);
        }

        public final long c(long j10, int i10) {
            return e(j10, h0.f315061n) | (((long) i10) << 30);
        }

        public final <T> T d(long j10, @NotNull Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) (1073741823 & j10)), Integer.valueOf((int) ((j10 & h0.f315061n) >> 30)));
        }

        public final long e(long j10, long j11) {
            return j10 & (~j11);
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f315075a;

        public b(int i10) {
            this.f315075a = i10;
        }
    }

    public h0(int i10, boolean z10) {
        this.f315071a = i10;
        this.f315072b = z10;
        int i11 = i10 - 1;
        this.f315073c = i11;
        this.f315074d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final h0<E> b(long j10) {
        h0<E> h0Var = new h0<>(this.f315071a * 2, this.f315072b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((f315061n & j10) >> 30);
        while (true) {
            int i12 = this.f315073c;
            if ((i10 & i12) == (i12 & i11)) {
                f315054g.set(h0Var, f315052e.e(j10, 1152921504606846976L));
                return h0Var;
            }
            Object bVar = f().get(this.f315073c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            h0Var.f().set(h0Var.f315073c & i10, bVar);
            i10++;
        }
    }

    private final h0<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315053f;
        while (true) {
            h0<E> h0Var = (h0) atomicReferenceFieldUpdater.get(this);
            if (h0Var != null) {
                return h0Var;
            }
            androidx.concurrent.futures.b.a(f315053f, this, null, b(j10));
        }
    }

    private final h0<E> e(int i10, E e10) {
        Object obj = f().get(this.f315073c & i10);
        if (!(obj instanceof b) || ((b) obj).f315075a != i10) {
            return null;
        }
        f().set(i10 & this.f315073c, e10);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f315074d;
    }

    private final /* synthetic */ Object h() {
        return this._next$volatile;
    }

    private final /* synthetic */ long j() {
        return this._state$volatile;
    }

    private final /* synthetic */ void n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void o(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, Function1<? super Long, Unit> function1) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final long q() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f315054g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            long j11 = 1152921504606846976L | j10;
            h0<E> h0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(h0Var, j10, j11)) {
                return j11;
            }
            this = h0Var;
        }
    }

    private final h0<E> t(int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f315054g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return this.r();
            }
            h0<E> h0Var = this;
            if (f315054g.compareAndSet(h0Var, j10, f315052e.b(j10, i11))) {
                h0Var.f().set(h0Var.f315073c & i12, null);
                return null;
            }
            this = h0Var;
        }
    }

    private final /* synthetic */ void u(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void v(long j10) {
        this._state$volatile = j10;
    }

    private final /* synthetic */ void w(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, Function1<? super Long, Long> function1) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, function1.invoke(Long.valueOf(j10)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    private final /* synthetic */ long x(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, Function1<? super Long, Long> function1) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            Long lInvoke = function1.invoke(Long.valueOf(j10));
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, lInvoke.longValue())) {
                return lInvoke.longValue();
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    public final int a(@NotNull E e10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f315054g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return f315052e.a(j10);
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((f315061n & j10) >> 30);
            int i12 = this.f315073c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (this.f315072b || this.f().get(i11 & i12) == null) {
                h0<E> h0Var = this;
                if (f315054g.compareAndSet(h0Var, j10, f315052e.c(j10, (i11 + 1) & f315057j))) {
                    h0Var.f().set(i11 & i12, e10);
                    h0<E> h0VarE = h0Var;
                    while ((f315054g.get(h0VarE) & 1152921504606846976L) != 0 && (h0VarE = h0VarE.r().e(i11, e10)) != null) {
                    }
                    return 0;
                }
                this = h0Var;
            } else {
                int i13 = this.f315071a;
                if (i13 < 1024 || ((i11 - i10) & f315057j) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f315054g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & f315065r) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
            h0<E> h0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(h0Var, j10, f315065r | j10)) {
                return true;
            }
            this = h0Var;
        }
    }

    public final int g() {
        long j10 = f315054g.get(this);
        return 1073741823 & (((int) ((j10 & f315061n) >> 30)) - ((int) (1073741823 & j10)));
    }

    public final boolean l() {
        return (f315054g.get(this) & f315065r) != 0;
    }

    public final boolean m() {
        long j10 = f315054g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & f315061n) >> 30));
    }

    @NotNull
    public final <R> List<R> p(@NotNull Function1<? super E, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(this.f315071a);
        long j10 = f315054g.get(this);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((j10 & f315061n) >> 30);
        while (true) {
            int i12 = this.f315073c;
            if ((i10 & i12) == (i12 & i11)) {
                return arrayList;
            }
            a0.b bVar = (Object) f().get(this.f315073c & i10);
            if (bVar != null && !(bVar instanceof b)) {
                arrayList.add(function1.invoke(bVar));
            }
            i10++;
        }
    }

    @NotNull
    public final h0<E> r() {
        return c(q());
    }

    @Nullable
    public final Object s() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f315054g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f315067t;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((f315061n & j10) >> 30);
            int i12 = this.f315073c;
            if ((i11 & i12) == (i12 & i10)) {
                return null;
            }
            Object obj = this.f().get(this.f315073c & i10);
            if (obj == null) {
                if (this.f315072b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & f315057j;
                h0<E> h0Var = this;
                if (f315054g.compareAndSet(h0Var, j10, f315052e.b(j10, i13))) {
                    h0Var.f().set(h0Var.f315073c & i10, null);
                    return obj;
                }
                if (h0Var.f315072b) {
                    h0<E> h0VarT = h0Var;
                    do {
                        h0VarT = h0VarT.t(i10, i13);
                    } while (h0VarT != null);
                    return obj;
                }
                this = h0Var;
            }
        }
    }
}
