package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicInt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n1#2:435\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f313472c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final AtomicIntegerFieldUpdater<f> f313473d = AtomicIntegerFieldUpdater.newUpdater(f.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f313474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f313475b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(int i10, @NotNull m trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f313474a = trace;
        this.f313475b = i10;
    }

    public final int a(int i10) {
        int iAddAndGet = f313473d.addAndGet(this, i10);
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("addAndGet(" + i10 + "):" + iAddAndGet);
        }
        return iAddAndGet;
    }

    public final boolean b(int i10, int i11) {
        m mVar;
        boolean zCompareAndSet = f313473d.compareAndSet(this, i10, i11);
        if (zCompareAndSet && (mVar = this.f313474a) != m.a.f313514a) {
            mVar.a("CAS(" + i10 + ", " + i11 + ')');
        }
        return zCompareAndSet;
    }

    public final int c() {
        int iDecrementAndGet = f313473d.decrementAndGet(this);
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("decAndGet():" + iDecrementAndGet);
        }
        return iDecrementAndGet;
    }

    public final int d(int i10) {
        int andAdd = f313473d.getAndAdd(this, i10);
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndAdd(" + i10 + "):" + andAdd);
        }
        return andAdd;
    }

    public final int e() {
        int andDecrement = f313473d.getAndDecrement(this);
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndDec():" + andDecrement);
        }
        return andDecrement;
    }

    public final int f() {
        int andIncrement = f313473d.getAndIncrement(this);
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndInc():" + andIncrement);
        }
        return andIncrement;
    }

    public final int g(int i10) {
        int andSet = f313473d.getAndSet(this, i10);
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndSet(" + i10 + "):" + andSet);
        }
        return andSet;
    }

    @NotNull
    public final m h() {
        return this.f313474a;
    }

    public final int i() {
        return this.f313475b;
    }

    public final int j(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return i();
    }

    public final int k() {
        int iIncrementAndGet = f313473d.incrementAndGet(this);
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("incAndGet():" + iIncrementAndGet);
        }
        return iIncrementAndGet;
    }

    public final void l(int i10) {
        f313473d.lazySet(this, i10);
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("lazySet(" + i10 + ')');
        }
    }

    public final void m(int i10) {
        d(-i10);
    }

    public final void n(int i10) {
        d(i10);
    }

    public final void o(int i10) {
        this.f313475b = i10;
        m mVar = this.f313474a;
        if (mVar != m.a.f313514a) {
            mVar.a("set(" + i10 + ')');
        }
    }

    public final void p(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property, int i10) {
        Intrinsics.checkNotNullParameter(property, "property");
        o(i10);
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f313475b);
    }
}
