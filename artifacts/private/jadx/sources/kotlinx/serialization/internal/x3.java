package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.uuid.a
@kotlin.a1
public final class x3 implements KSerializer<kotlin.uuid.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x3 f316053a = new x3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f316054b = new r2("kotlin.uuid.Uuid", kotlinx.serialization.descriptors.e.i.f315839a);

    private x3() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public kotlin.uuid.d deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kotlin.uuid.d.f313446c.f(decoder.decodeString());
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull kotlin.uuid.d value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.toString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f316054b;
    }
}
