package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicBoolean\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n1#2:435\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f313467c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final AtomicIntegerFieldUpdater<b> f313468d = AtomicIntegerFieldUpdater.newUpdater(b.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f313469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f313470b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(boolean z10, @NotNull m trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f313469a = trace;
        this.f313470b = z10 ? 1 : 0;
    }

    public final boolean a(boolean z10, boolean z11) {
        m mVar;
        boolean zCompareAndSet = f313468d.compareAndSet(this, z10 ? 1 : 0, z11 ? 1 : 0);
        if (zCompareAndSet && (mVar = this.f313469a) != m.a.f313514a) {
            mVar.a("CAS(" + z10 + ", " + z11 + ')');
        }
        return zCompareAndSet;
    }

    public final boolean b(boolean z10) {
        int andSet = f313468d.getAndSet(this, z10 ? 1 : 0);
        m mVar = this.f313469a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndSet(" + z10 + "):" + andSet);
        }
        return andSet == 1;
    }

    @NotNull
    public final m c() {
        return this.f313469a;
    }

    public final boolean d() {
        return this.f313470b != 0;
    }

    public final boolean e(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return d();
    }

    public final void f(boolean z10) {
        f313468d.lazySet(this, z10 ? 1 : 0);
        m mVar = this.f313469a;
        if (mVar != m.a.f313514a) {
            mVar.a("lazySet(" + z10 + ')');
        }
    }

    public final void g(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property, boolean z10) {
        Intrinsics.checkNotNullParameter(property, "property");
        h(z10);
    }

    public final void h(boolean z10) {
        this.f313470b = z10 ? 1 : 0;
        m mVar = this.f313469a;
        if (mVar != m.a.f313514a) {
            mVar.a("set(" + z10 + ')');
        }
    }

    @NotNull
    public String toString() {
        return String.valueOf(d());
    }
}
