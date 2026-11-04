package kotlin.coroutines;

import kotlin.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@e1(version = "1.3")
public interface d<T> {
    @NotNull
    CoroutineContext getContext();

    void resumeWith(@NotNull Object obj);
}
