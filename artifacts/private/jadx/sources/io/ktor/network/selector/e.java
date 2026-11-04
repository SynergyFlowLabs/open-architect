package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLockFreeMPSCQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueueCore\n+ 2 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueueCore$Companion\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n235#2,3:245\n235#2,3:254\n235#2,3:259\n235#2,3:264\n235#2,3:274\n476#3,4:248\n467#3,2:252\n467#3,2:257\n467#3,2:262\n498#3,4:268\n154#3,2:272\n1#4:267\n*S KotlinDebug\n*F\n+ 1 LockFreeMPSCQueue.kt\nio/ktor/network/selector/LockFreeMPSCQueueCore\n*L\n74#1:245,3\n89#1:254,3\n135#1:259,3\n158#1:264,3\n189#1:274,3\n77#1:248,4\n87#1:252,2\n133#1:257,2\n157#1:262,2\n175#1:268,4\n181#1:272,2\n*E\n"})
final class e<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f296168g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f296169h = 30;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f296170i = 1073741823;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f296171j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f296172k = 1073741823;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f296173l = 30;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f296174m = 1152921503533105152L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f296175n = 60;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f296176o = 1152921504606846976L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f296177p = 61;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f296178q = 2305843009213693952L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f296180s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f296181t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f296182u = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f296183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f296184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicReferenceArray<Object> f296185c;

    @NotNull
    private volatile /* synthetic */ Object nextRef = null;

    @NotNull
    private volatile /* synthetic */ long stateRef = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f296165d = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Object f296179r = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f296166e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "nextRef");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f296167f = AtomicLongFieldUpdater.newUpdater(e.class, "stateRef");

    public static final class a {
        a() {
        }

        public String toString() {
            return "REMOVE_FROZEN";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long f(long j10, int i10) {
            return i(j10, 1073741823L) | ((long) i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long g(long j10, int i10) {
            return i(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        private final <T> T h(long j10, Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) (1073741823 & j10)), Integer.valueOf((int) ((j10 & 1152921503533105152L) >> 30)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long i(long j10, long j11) {
            return j10 & (~j11);
        }

        private b() {
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f296186a;

        public c(int i10) {
            this.f296186a = i10;
        }
    }

    public e(int i10) {
        this.f296183a = i10;
        int i11 = i10 - 1;
        this.f296184b = i11;
        this.f296185c = new AtomicReferenceArray<>(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final e<E> b(long j10) {
        e<E> eVar = new e<>(this.f296183a * 2);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f296184b;
            if ((i10 & i12) == (i11 & i12)) {
                eVar.stateRef = f296165d.i(j10, 1152921504606846976L);
                return eVar;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = eVar.f296185c;
            int i13 = eVar.f296184b & i10;
            Object cVar = this.f296185c.get(i12 & i10);
            if (cVar == null) {
                cVar = new c(i10);
            }
            atomicReferenceArray.set(i13, cVar);
            i10++;
        }
    }

    private final e<E> c(long j10) {
        while (true) {
            e<E> eVar = (e) this.nextRef;
            if (eVar != null) {
                return eVar;
            }
            androidx.concurrent.futures.b.a(f296166e, this, null, b(j10));
        }
    }

    private final e<E> e(int i10, E e10) {
        Object obj = this.f296185c.get(this.f296184b & i10);
        if (!(obj instanceof c) || ((c) obj).f296186a != i10) {
            return null;
        }
        this.f296185c.set(i10 & this.f296184b, e10);
        return this;
    }

    private final long g() {
        while (true) {
            long j10 = this.stateRef;
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            long j11 = j10 | 1152921504606846976L;
            e<E> eVar = this;
            if (f296167f.compareAndSet(eVar, j10, j11)) {
                return j11;
            }
            this = eVar;
        }
    }

    private final e<E> j(int i10, int i11) {
        while (true) {
            long j10 = this.stateRef;
            int i12 = (int) (1073741823 & j10);
            if (i12 != i10) {
                throw new IllegalStateException("This queue can have only one consumer");
            }
            if ((1152921504606846976L & j10) != 0) {
                return this.h();
            }
            e<E> eVar = this;
            if (f296167f.compareAndSet(eVar, j10, f296165d.f(j10, i11))) {
                eVar.f296185c.set(eVar.f296184b & i12, null);
                return null;
            }
            this = eVar;
        }
    }

    public final int a(@NotNull E element) {
        Intrinsics.checkNotNullParameter(element, "element");
        while (true) {
            long j10 = this.stateRef;
            if ((3458764513820540928L & j10) != 0) {
                return f296165d.e(j10);
            }
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = this.f296184b;
            if (((i10 + 2) & i11) == (((int) (1073741823 & j10)) & i11)) {
                return 1;
            }
            e<E> eVar = this;
            if (f296167f.compareAndSet(eVar, j10, f296165d.g(j10, (i10 + 1) & 1073741823))) {
                eVar.f296185c.set(eVar.f296184b & i10, element);
                e<E> eVarE = eVar;
                while ((eVarE.stateRef & 1152921504606846976L) != 0 && (eVarE = eVarE.h().e(i10, element)) != null) {
                }
                return 0;
            }
            this = eVar;
        }
    }

    public final boolean d() {
        while (true) {
            long j10 = this.stateRef;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
            e<E> eVar = this;
            if (f296167f.compareAndSet(eVar, j10, j10 | 2305843009213693952L)) {
                return true;
            }
            this = eVar;
        }
    }

    public final boolean f() {
        long j10 = this.stateRef;
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    @NotNull
    public final e<E> h() {
        return c(g());
    }

    @Nullable
    public final Object i() {
        Object obj;
        long j10 = this.stateRef;
        if ((1152921504606846976L & j10) != 0) {
            return f296179r;
        }
        int i10 = (int) (1073741823 & j10);
        int i11 = this.f296184b;
        if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i10 & i11) || (obj = this.f296185c.get(i11 & i10)) == null || (obj instanceof c)) {
            return null;
        }
        int i12 = (i10 + 1) & 1073741823;
        if (f296167f.compareAndSet(this, j10, f296165d.f(j10, i12))) {
            this.f296185c.set(this.f296184b & i10, null);
            return obj;
        }
        e<E> eVarJ = this;
        do {
            eVarJ = eVarJ.j(i10, i12);
        } while (eVarJ != null);
        return obj;
    }
}
