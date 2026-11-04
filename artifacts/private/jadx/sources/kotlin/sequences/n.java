package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.i
@e1(version = "1.3")
public abstract class n<T> {
    @Nullable
    public abstract Object b(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    public final Object d(@NotNull Iterable<? extends T> iterable, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (objE = e(iterable.iterator(), dVar)) == kotlin.coroutines.intrinsics.b.l()) ? objE : Unit.f312394a;
    }

    @Nullable
    public abstract Object e(@NotNull Iterator<? extends T> it, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    public final Object f(@NotNull Sequence<? extends T> sequence, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e(sequence.iterator(), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }
}
