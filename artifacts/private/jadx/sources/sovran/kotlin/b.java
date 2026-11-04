package sovran.kotlin;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sovran.kotlin.c;

/* JADX INFO: loaded from: classes14.dex */
public interface b<StateT extends c, ResultT> {
    @NotNull
    StateT a(@NotNull StateT state, @Nullable ResultT operationResult);

    void b(@NotNull StateT state, @NotNull Function2<? super ResultT, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> completion);
}
