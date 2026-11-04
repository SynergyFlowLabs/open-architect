package kotlinx.coroutines.selects;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@k2
public interface n<R> {
    void f(@Nullable Object obj);

    void g(@NotNull o1 o1Var);

    @NotNull
    CoroutineContext getContext();

    boolean i(@NotNull Object obj, @Nullable Object obj2);
}
