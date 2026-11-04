package kotlinx.serialization.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface d2<T> {

    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object b(d2 d2Var, kotlin.reflect.d dVar, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return d2Var.a(dVar, list);
    }

    @NotNull
    Object a(@NotNull kotlin.reflect.d<Object> dVar, @NotNull List<? extends kotlin.reflect.s> list);
}
