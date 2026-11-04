package kotlinx.serialization.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class w3 implements KSerializer<Unit> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final w3 f316047b = new w3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ z1<Unit> f316048a = new z1<>("kotlin.Unit", Unit.f312394a);

    private w3() {
    }

    public void b(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f316048a.deserialize(decoder);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull Unit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f316048a.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        b(decoder);
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f316048a.getDescriptor();
    }
}
