package io.ktor.client.plugins.cookies;

import io.ktor.http.Cookie;
import io.ktor.http.Url;
import java.io.Closeable;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface f extends Closeable {
    @Nullable
    Object Nd(@NotNull Url url, @NotNull Cookie cookie, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object R8(@NotNull Url url, @NotNull kotlin.coroutines.d<? super List<Cookie>> dVar);
}
