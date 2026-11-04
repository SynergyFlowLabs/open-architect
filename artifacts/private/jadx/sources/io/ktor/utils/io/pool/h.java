package io.ktor.utils.io.pool;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface h<T> extends AutoCloseable {

    public static final class a {
        public static <T> void a(@NotNull h<T> hVar) {
            hVar.dispose();
        }
    }

    int He();

    @NotNull
    T Jc();

    @Override // java.lang.AutoCloseable
    void close();

    void dispose();

    void h8(@NotNull T t10);
}
