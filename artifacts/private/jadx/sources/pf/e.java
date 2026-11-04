package pf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class e {
    @Nullable
    public static final <T> T a(@NotNull d dVar, @NotNull String fileName, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        JsonElement jsonElementB = dVar.b(fileName);
        if (jsonElementB == null) {
            return null;
        }
        return (T) Json.Default.decodeFromJsonElement(serializer, jsonElementB);
    }

    public static final <T> void b(@NotNull d dVar, @NotNull String fileName, T t10, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        dVar.a(fileName, Json.Default.encodeToJsonElement(serializer, t10));
    }
}
