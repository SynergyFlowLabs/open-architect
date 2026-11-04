package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicLong\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n1#2:435\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f313477c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final AtomicLongFieldUpdater<h> f313478d = AtomicLongFieldUpdater.newUpdater(h.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f313479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f313480b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(long j10, @NotNull m trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f313479a = trace;
        this.f313480b = j10;
    }

    public final long a(long j10) {
        long jAddAndGet = f313478d.addAndGet(this, j10);
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("addAndGet(" + j10 + "):" + jAddAndGet);
        }
        return jAddAndGet;
    }

    public final boolean b(long j10, long j11) {
        m mVar;
        boolean zCompareAndSet = f313478d.compareAndSet(this, j10, j11);
        if (zCompareAndSet && (mVar = this.f313479a) != m.a.f313514a) {
            mVar.a("CAS(" + j10 + ", " + j11 + ')');
        }
        return zCompareAndSet;
    }

    public final long c() {
        long jDecrementAndGet = f313478d.decrementAndGet(this);
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("decAndGet():" + jDecrementAndGet);
        }
        return jDecrementAndGet;
    }

    public final long d(long j10) {
        long andAdd = f313478d.getAndAdd(this, j10);
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndAdd(" + j10 + "):" + andAdd);
        }
        return andAdd;
    }

    public final long e() {
        long andDecrement = f313478d.getAndDecrement(this);
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndDec():" + andDecrement);
        }
        return andDecrement;
    }

    public final long f() {
        long andIncrement = f313478d.getAndIncrement(this);
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndInc():" + andIncrement);
        }
        return andIncrement;
    }

    public final long g(long j10) {
        long andSet = f313478d.getAndSet(this, j10);
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndSet(" + j10 + "):" + andSet);
        }
        return andSet;
    }

    @NotNull
    public final m h() {
        return this.f313479a;
    }

    public final long i() {
        return this.f313480b;
    }

    public final long j(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return i();
    }

    public final long k() {
        long jIncrementAndGet = f313478d.incrementAndGet(this);
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("incAndGet():" + jIncrementAndGet);
        }
        return jIncrementAndGet;
    }

    public final void l(long j10) {
        f313478d.lazySet(this, j10);
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("lazySet(" + j10 + ')');
        }
    }

    public final void m(long j10) {
        d(-j10);
    }

    public final void n(long j10) {
        d(j10);
    }

    public final void o(long j10) {
        this.f313480b = j10;
        m mVar = this.f313479a;
        if (mVar != m.a.f313514a) {
            mVar.a("set(" + j10 + ')');
        }
    }

    public final void p(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property, long j10) {
        Intrinsics.checkNotNullParameter(property, "property");
        o(j10);
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f313480b);
    }
}
