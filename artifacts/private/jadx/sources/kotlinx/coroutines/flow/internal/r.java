package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@k2
public interface r<T> extends kotlinx.coroutines.flow.i<T> {

    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.i a(r rVar, CoroutineContext coroutineContext, int i10, kotlinx.coroutines.channels.j jVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = kotlin.coroutines.h.f312451a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                jVar = kotlinx.coroutines.channels.j.SUSPEND;
            }
            return rVar.b(coroutineContext, i10, jVar);
        }
    }

    @NotNull
    kotlinx.coroutines.flow.i<T> b(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar);
}
