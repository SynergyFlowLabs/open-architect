package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.i1;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@i1(markerClass = {d2.class})
public interface j0<T> extends o0<T>, j<T> {
    @c2
    void d();

    @Override // kotlinx.coroutines.flow.j
    @Nullable
    Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    boolean f(T t10);

    @NotNull
    z0<Integer> i();
}
