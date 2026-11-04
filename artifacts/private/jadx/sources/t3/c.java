package t3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateListSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateListSerializer.kt\nandroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class c<T> implements KSerializer<SnapshotStateList<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f376186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final KSerializer<List<T>> f376187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f376188c;

    public c(@NotNull KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        this.f376186a = elementSerializer;
        KSerializer<List<T>> kSerializerI = hk.a.i(elementSerializer);
        this.f376187b = kSerializerI;
        this.f376188c = k.d("androidx.compose.runtime.SnapshotStateList", kSerializerI.getDescriptor());
    }

    public static /* synthetic */ void c() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SnapshotStateList<T> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        List list = (List) decoder.decodeSerializableValue(this.f376187b);
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(CollectionsKt.toList(list));
        return snapshotStateList;
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull SnapshotStateList<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(this.f376187b, value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f376188c;
    }
}
