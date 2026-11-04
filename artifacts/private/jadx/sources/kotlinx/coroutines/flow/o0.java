package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.i1;
import kotlinx.coroutines.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@i1(markerClass = {d2.class})
public interface o0<T> extends i<T> {
    @NotNull
    List<T> a();

    @Override // kotlinx.coroutines.flow.i
    @Nullable
    Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<?> dVar);
}
