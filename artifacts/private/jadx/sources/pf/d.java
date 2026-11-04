package pf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface d {

    public static final class a {
        @Nullable
        public static JsonElement a(@NotNull d dVar, @NotNull String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return null;
        }

        public static void b(@NotNull d dVar, @NotNull String fileName, @NotNull JsonElement content) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(content, "content");
        }
    }

    void a(@NotNull String str, @NotNull JsonElement jsonElement);

    @Nullable
    JsonElement b(@NotNull String str);
}
