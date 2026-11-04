package androidx.savedstate.serialization.serializers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final String a(@NotNull String serialName, @NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return "Cannot deserialize " + serialName + " with '" + j1.d(decoder.getClass()).Q() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    @NotNull
    public static final String b(@NotNull String serialName, @NotNull Encoder encoder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        return "Cannot serialize " + serialName + " with '" + j1.d(encoder.getClass()).Q() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
