package androidx.compose.foundation.relocation;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    static /* synthetic */ Object b(a aVar, n0.j jVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i10 & 1) != 0) {
            jVar = null;
        }
        return aVar.a(jVar, dVar);
    }

    @Nullable
    Object a(@Nullable n0.j jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
