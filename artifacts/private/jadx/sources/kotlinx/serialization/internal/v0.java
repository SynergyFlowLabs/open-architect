package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class v0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements p0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ KSerializer<T> f316032a;

        a(KSerializer<T> kSerializer) {
            this.f316032a = kSerializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.serialization.internal.p0
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{this.f316032a};
        }

        @Override // kotlinx.serialization.e
        public T deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // kotlinx.serialization.d0
        public void serialize(Encoder encoder, T t10) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }
    }

    @kotlinx.serialization.i
    @NotNull
    public static final <T> SerialDescriptor a(@NotNull String name, @NotNull KSerializer<T> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new u0(name, new a(primitiveSerializer));
    }
}
