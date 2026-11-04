package kotlin;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {s.class})
@e1(version = "1.7")
public final class h<T, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pj.n<j<T, R>, T, kotlin.coroutines.d<? super R>, Object> f312503a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull pj.n<? super j<T, R>, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f312503a = block;
    }

    @NotNull
    public final pj.n<j<T, R>, T, kotlin.coroutines.d<? super R>, Object> a() {
        return this.f312503a;
    }
}
