package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicRef\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n1#2:435\n*E\n"})
public final class j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f313482c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final AtomicReferenceFieldUpdater<j<?>, Object> f313483d = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f313484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile T f313485b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(T t10, @NotNull m trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f313484a = trace;
        this.f313485b = t10;
    }

    public final boolean a(T t10, T t11) {
        m mVar;
        boolean zA = androidx.concurrent.futures.b.a(f313483d, this, t10, t11);
        if (zA && (mVar = this.f313484a) != m.a.f313514a) {
            mVar.a("CAS(" + t10 + ", " + t11 + ')');
        }
        return zA;
    }

    public final T b(T t10) {
        T t11 = (T) f313483d.getAndSet(this, t10);
        m mVar = this.f313484a;
        if (mVar != m.a.f313514a) {
            mVar.a("getAndSet(" + t10 + "):" + t11);
        }
        return t11;
    }

    @NotNull
    public final m c() {
        return this.f313484a;
    }

    public final T d() {
        return this.f313485b;
    }

    public final T e(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return d();
    }

    public final void f(T t10) {
        f313483d.lazySet(this, t10);
        m mVar = this.f313484a;
        if (mVar != m.a.f313514a) {
            mVar.a("lazySet(" + t10 + ')');
        }
    }

    public final void g(T t10) {
        this.f313485b = t10;
        m mVar = this.f313484a;
        if (mVar != m.a.f313514a) {
            mVar.a("set(" + t10 + ')');
        }
    }

    public final void h(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property, T t10) {
        Intrinsics.checkNotNullParameter(property, "property");
        g(t10);
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f313485b);
    }
}
