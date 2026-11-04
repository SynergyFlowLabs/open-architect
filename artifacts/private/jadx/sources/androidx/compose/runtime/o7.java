package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
public final class o7<T> extends m4<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36297d = 0;

    public o7(@NotNull Function0<? extends T> function0) {
        super(function0);
    }

    @Override // androidx.compose.runtime.m4
    @NotNull
    public n4<T> e(T t10) {
        int i10 = 3 ^ 0;
        return new n4<>(this, t10, t10 == null, null, null, null, false);
    }
}
