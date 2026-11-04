package kotlin.jvm.internal;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    @NotNull
    public static final <T> Iterator<T> a(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new h(array);
    }
}
