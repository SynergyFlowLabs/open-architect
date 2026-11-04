package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 {
    @NotNull
    public static final <Key, Value> u2<Key, Value> a(@NotNull kotlinx.coroutines.s0 scope, @NotNull s2<Key, Value> delegate) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new t2(scope, delegate);
    }
}
