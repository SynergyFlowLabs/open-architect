package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface d0<T> {
    @NotNull
    SerialDescriptor getDescriptor();

    void serialize(@NotNull Encoder encoder, T t10);
}
