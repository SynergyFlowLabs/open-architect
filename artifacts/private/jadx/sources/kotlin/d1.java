package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class d1<T> implements f0<T>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f312485d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<d1<?>, Object> f312486e = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private volatile Function0<? extends T> f312487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private volatile Object f312488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f312489c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d1(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f312487a = initializer;
        c2 c2Var = c2.f312406a;
        this.f312488b = c2Var;
        this.f312489c = c2Var;
    }

    private final Object writeReplace() {
        return new z(getValue());
    }

    @Override // kotlin.f0
    public boolean Z() {
        return this.f312488b != c2.f312406a;
    }

    @Override // kotlin.f0
    public T getValue() {
        T t10 = (T) this.f312488b;
        c2 c2Var = c2.f312406a;
        if (t10 != c2Var) {
            return t10;
        }
        Function0<? extends T> function0 = this.f312487a;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            if (androidx.concurrent.futures.b.a(f312486e, this, c2Var, tInvoke)) {
                this.f312487a = null;
                return tInvoke;
            }
        }
        return (T) this.f312488b;
    }

    @NotNull
    public String toString() {
        return Z() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
