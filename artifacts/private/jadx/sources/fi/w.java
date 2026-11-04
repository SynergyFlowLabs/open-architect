package fi;

import io.ktor.http.Url;
import io.ktor.http.f1;
import io.ktor.http.j1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface w extends f1, s0 {

    public static final class a {
        @NotNull
        public static CoroutineContext a(@NotNull w wVar) {
            return wVar.h().getCoroutineContext();
        }
    }

    @NotNull
    io.ktor.util.b getAttributes();

    @NotNull
    io.ktor.http.content.w getContent();

    @NotNull
    CoroutineContext getCoroutineContext();

    @NotNull
    j1 getMethod();

    @NotNull
    Url getUrl();

    @NotNull
    io.ktor.client.call.b h();
}
