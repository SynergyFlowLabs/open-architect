package kotlinx.coroutines.flow;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface i<T> {
    @Nullable
    Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
