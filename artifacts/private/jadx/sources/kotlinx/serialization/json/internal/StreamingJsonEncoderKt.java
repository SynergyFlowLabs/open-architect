package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.q1;
import kotlin.u1;
import kotlin.y1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class StreamingJsonEncoderKt {

    @NotNull
    private static final Set<SerialDescriptor> unsignedNumberDescriptors = SetsKt.setOf((Object[]) new SerialDescriptor[]{hk.a.y(u1.f313438b).getDescriptor(), hk.a.z(y1.f313456b).getDescriptor(), hk.a.x(q1.f312878b).getDescriptor(), hk.a.A(e2.f312490b).getDescriptor()});

    static {
        int i10 = 4 << 0;
    }

    public static final boolean isUnquotedLiteral(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && Intrinsics.areEqual(serialDescriptor, JsonElementKt.getJsonUnquotedLiteralDescriptor());
    }

    public static final boolean isUnsignedNumber(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && unsignedNumberDescriptors.contains(serialDescriptor);
    }
}
