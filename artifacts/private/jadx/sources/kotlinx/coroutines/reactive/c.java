package kotlinx.coroutines.reactive;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.u;

/* JADX INFO: loaded from: classes12.dex */
@k2
public interface c {
    @NotNull
    <T> u<T> a(@NotNull u<T> uVar, @NotNull CoroutineContext coroutineContext);
}
