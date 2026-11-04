package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class q0 extends n1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull SerialDescriptor keyDesc, @NotNull SerialDescriptor valueDesc) {
        super(w.f316042f, keyDesc, valueDesc, null);
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
