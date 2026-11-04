package androidx.paging;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.l1
public interface c {

    public enum a {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW
    }

    @Nullable
    Object a(@NotNull a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    void b(@NotNull i<?> iVar);

    @Nullable
    Object c(@NotNull a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
