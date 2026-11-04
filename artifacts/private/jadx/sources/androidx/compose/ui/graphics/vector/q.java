package androidx.compose.ui.graphics.vector;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface q {

    public static final class a {
        @Deprecated
        public static <T> T a(@NotNull q qVar, @NotNull w<T> wVar, T t10) {
            return (T) q.super.b(wVar, t10);
        }
    }

    default <T> T b(@NotNull w<T> wVar, T t10) {
        return t10;
    }
}
