package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class l1<T> implements f0<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function0<? extends T> f312851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private volatile Object f312852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f312853c;

    public l1(@NotNull Function0<? extends T> initializer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f312851a = initializer;
        this.f312852b = c2.f312406a;
        this.f312853c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new z(getValue());
    }

    @Override // kotlin.f0
    public boolean Z() {
        return this.f312852b != c2.f312406a;
    }

    @Override // kotlin.f0
    public T getValue() {
        T tInvoke;
        T t10 = (T) this.f312852b;
        c2 c2Var = c2.f312406a;
        if (t10 != c2Var) {
            return t10;
        }
        synchronized (this.f312853c) {
            try {
                tInvoke = (T) this.f312852b;
                if (tInvoke == c2Var) {
                    Function0<? extends T> function0 = this.f312851a;
                    Intrinsics.checkNotNull(function0);
                    tInvoke = function0.invoke();
                    this.f312852b = tInvoke;
                    this.f312851a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tInvoke;
    }

    @NotNull
    public String toString() {
        return Z() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ l1(Function0 function0, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i10 & 2) != 0 ? null : obj);
    }
}
