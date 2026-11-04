package kotlinx.coroutines.sync;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface h {
    boolean a();

    int f();

    @Nullable
    Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    void release();
}
