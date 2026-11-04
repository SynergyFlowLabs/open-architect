package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class j2<T> implements f0<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function0<? extends T> f312716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object f312717b;

    public j2(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f312716a = initializer;
        this.f312717b = c2.f312406a;
    }

    private final Object writeReplace() {
        return new z(getValue());
    }

    @Override // kotlin.f0
    public boolean Z() {
        return this.f312717b != c2.f312406a;
    }

    @Override // kotlin.f0
    public T getValue() {
        if (this.f312717b == c2.f312406a) {
            Function0<? extends T> function0 = this.f312716a;
            Intrinsics.checkNotNull(function0);
            this.f312717b = function0.invoke();
            this.f312716a = null;
        }
        return (T) this.f312717b;
    }

    @NotNull
    public String toString() {
        return Z() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
