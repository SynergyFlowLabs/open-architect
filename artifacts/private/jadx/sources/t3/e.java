package t3;

import androidx.compose.runtime.snapshots.l0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateMapSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMapSerializer.kt\nandroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class e<K, V> implements KSerializer<l0<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<Map<K, V>> f376189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f376190b;

    public e(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        KSerializer<Map<K, V>> kSerializerL = hk.a.l(keySerializer, valueSerializer);
        this.f376189a = kSerializerL;
        this.f376190b = k.d("androidx.compose.runtime.SnapshotStateMap", kSerializerL.getDescriptor());
    }

    public static /* synthetic */ void c() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0<K, V> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Map<? extends K, ? extends V> map = (Map) decoder.decodeSerializableValue(this.f376189a);
        l0<K, V> l0Var = new l0<>();
        l0Var.putAll(map);
        return l0Var;
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull l0<K, V> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(this.f376189a, value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f376190b;
    }
}
