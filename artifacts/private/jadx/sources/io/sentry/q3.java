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
final class q3 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q3 f306581a = new q3();

    private q3() {
    }

    public static q3 g() {
        return f306581a;
    }

    @Override // io.sentry.n1
    public <T> void a(@NotNull T t10, @NotNull Writer writer) throws IOException {
    }

    @Override // io.sentry.n1
    public void b(@NotNull g6 g6Var, @NotNull OutputStream outputStream) throws Exception {
    }

    @Override // io.sentry.n1
    @Nullable
    public <T> T c(@NotNull Reader reader, @NotNull Class<T> cls) {
        return null;
    }

    @Override // io.sentry.n1
    @Nullable
    public <T, R> T d(@NotNull Reader reader, @NotNull Class<T> cls, @Nullable a2<R> a2Var) {
        return null;
    }

    @Override // io.sentry.n1
    @Nullable
    public g6 e(@NotNull InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.n1
    @NotNull
    public String f(@NotNull Map<String, Object> map) throws Exception {
        return "";
    }
}
