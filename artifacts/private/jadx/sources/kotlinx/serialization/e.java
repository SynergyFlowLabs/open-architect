package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface e<T> {
    T deserialize(@NotNull Decoder decoder);

    @NotNull
    SerialDescriptor getDescriptor();
}
