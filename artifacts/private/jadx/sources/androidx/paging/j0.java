package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class j0<K, V> extends r<K, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull kotlinx.coroutines.n0 notifyDispatcher, @NotNull kotlinx.coroutines.n0 backgroundDispatcher, @NotNull q1.e config, @Nullable K k10) {
        super(new s0(notifyDispatcher, new i0()), coroutineScope, notifyDispatcher, backgroundDispatcher, null, config, h2.b.c.f72100f.a(), k10);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
