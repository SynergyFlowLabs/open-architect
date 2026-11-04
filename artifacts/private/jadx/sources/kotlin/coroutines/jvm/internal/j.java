package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.3")
public abstract class j extends a {
    public j(@Nullable kotlin.coroutines.d<Object> dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != kotlin.coroutines.h.f312451a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return kotlin.coroutines.h.f312451a;
    }
}
