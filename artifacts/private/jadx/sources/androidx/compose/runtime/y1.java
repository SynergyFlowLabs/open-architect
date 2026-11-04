package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
public final class y1<T> extends m4<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36805e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u6<T> f36806d;

    public y1(@NotNull u6<T> u6Var, @NotNull Function0<? extends T> function0) {
        super(function0);
        this.f36806d = u6Var;
    }

    @Override // androidx.compose.runtime.m4
    @NotNull
    public n4<T> e(T t10) {
        return new n4<>(this, t10, t10 == null, this.f36806d, null, null, true);
    }
}
