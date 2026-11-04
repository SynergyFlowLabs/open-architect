package io.sentry;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface n1 {
    <T> void a(@NotNull T t10, @NotNull Writer writer) throws IOException;

    void b(@NotNull g6 g6Var, @NotNull OutputStream outputStream) throws Exception;

    @Nullable
    <T> T c(@NotNull Reader reader, @NotNull Class<T> cls);

    @Nullable
    <T, R> T d(@NotNull Reader reader, @NotNull Class<T> cls, @Nullable a2<R> a2Var);

    @Nullable
    g6 e(@NotNull InputStream inputStream);

    @NotNull
    String f(@NotNull Map<String, Object> map) throws Exception;
}
