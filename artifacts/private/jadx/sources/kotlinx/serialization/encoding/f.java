package kotlinx.serialization.encoding;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class f {
    @Nullable
    public static final <T> T a(@NotNull Decoder decoder, @NotNull kotlinx.serialization.e<? extends T> deserializer, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!deserializer.getDescriptor().isNullable() && !decoder.decodeNotNullMark()) {
            return (T) decoder.decodeNull();
        }
        return block.invoke();
    }

    public static final <T> T b(@NotNull Decoder decoder, @NotNull SerialDescriptor descriptor, @NotNull Function1<? super d, ? extends T> block) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        d dVarBeginStructure = decoder.beginStructure(descriptor);
        T tInvoke = block.invoke(dVarBeginStructure);
        dVarBeginStructure.endStructure(descriptor);
        return tInvoke;
    }
}
