package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class l<T> implements Comparator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Comparator<T> f312434a;

    public l(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f312434a = comparator;
    }

    @NotNull
    public final Comparator<T> a() {
        return this.f312434a;
    }

    @Override // java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f312434a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.f312434a;
    }
}
