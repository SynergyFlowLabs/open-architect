package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface KSerializer<T> extends d0<T>, e<T> {
    @Override // kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    SerialDescriptor getDescriptor();
}
