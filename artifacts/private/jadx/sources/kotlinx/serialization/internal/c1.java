package kotlinx.serialization.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nTuples.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,168:1\n571#2,4:169\n*S KotlinDebug\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n*L\n35#1:169,4\n*E\n"})
public abstract class c1<K, V, R> implements KSerializer<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<K> f315901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final KSerializer<V> f315902b;

    public /* synthetic */ c1(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    protected abstract K b(R r10);

    @NotNull
    protected final KSerializer<K> c() {
        return this.f315901a;
    }

    protected abstract V d(R r10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.e
    public R deserialize(@NotNull Decoder decoder) {
        R r10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(descriptor);
        if (dVarBeginStructure.c()) {
            int i10 = 5 >> 0;
            r10 = (R) f(kotlinx.serialization.encoding.d.a(dVarBeginStructure, getDescriptor(), 0, c(), null, 8, null), kotlinx.serialization.encoding.d.a(dVarBeginStructure, getDescriptor(), 1, e(), null, 8, null));
        } else {
            Object objA = j3.f315952a;
            Object objA2 = j3.f315952a;
            while (true) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objA == j3.f315952a) {
                        throw new kotlinx.serialization.c0("Element 'key' is missing");
                    }
                    if (objA2 == j3.f315952a) {
                        throw new kotlinx.serialization.c0("Element 'value' is missing");
                    }
                    r10 = (R) f(objA, objA2);
                    break;
                }
                if (iDecodeElementIndex == 0) {
                    objA = kotlinx.serialization.encoding.d.a(dVarBeginStructure, getDescriptor(), 0, c(), null, 8, null);
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new kotlinx.serialization.c0("Invalid index: " + iDecodeElementIndex);
                    }
                    objA2 = kotlinx.serialization.encoding.d.a(dVarBeginStructure, getDescriptor(), 1, e(), null, 8, null);
                }
            }
        }
        dVarBeginStructure.endStructure(descriptor);
        return r10;
    }

    @NotNull
    protected final KSerializer<V> e() {
        return this.f315902b;
    }

    protected abstract R f(K k10, V v10);

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, R r10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(getDescriptor());
        eVarBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f315901a, b(r10));
        eVarBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f315902b, d(r10));
        eVarBeginStructure.endStructure(getDescriptor());
    }

    private c1(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.f315901a = kSerializer;
        this.f315902b = kSerializer2;
    }
}
