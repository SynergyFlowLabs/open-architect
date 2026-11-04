package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.i
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n489#3,2:285\n491#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
public abstract class o1<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<Key> f315987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final KSerializer<Value> f315988b;

    public /* synthetic */ o1(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @NotNull
    public final KSerializer<Key> n() {
        return this.f315987a;
    }

    @NotNull
    public final KSerializer<Value> o() {
        return this.f315988b;
    }

    protected abstract void p(@NotNull Builder builder, int i10, Key key, Value value);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void h(@NotNull kotlinx.serialization.encoding.d decoder, @NotNull Builder builder, int i10, int i11) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, i11 * 2), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (true) {
                i(decoder, i10 + iL, builder, false);
                if (iL == iM) {
                    break;
                } else {
                    iL += iN;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void i(@NotNull kotlinx.serialization.encoding.d decoder, int i10, @NotNull Builder builder, boolean z10) {
        int iDecodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objA = kotlinx.serialization.encoding.d.a(decoder, getDescriptor(), i10, this.f315987a, null, 8, null);
        if (z10) {
            iDecodeElementIndex = decoder.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iDecodeElementIndex).toString());
            }
        } else {
            iDecodeElementIndex = i10 + 1;
        }
        int i11 = iDecodeElementIndex;
        builder.put(objA, (!builder.containsKey(objA) || (this.f315988b.getDescriptor().getKind() instanceof kotlinx.serialization.descriptors.e)) ? kotlinx.serialization.encoding.d.a(decoder, getDescriptor(), i11, this.f315988b, null, 8, null) : decoder.decodeSerializableElement(getDescriptor(), i11, this.f315988b, MapsKt.getValue(builder, objA)));
    }

    @Override // kotlinx.serialization.internal.a, kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iF = f(collection);
        SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.e eVarE = encoder.e(descriptor, iF);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itE = e(collection);
        int i10 = 0;
        while (itE.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itE.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            eVarE.encodeSerializableElement(getDescriptor(), i10, n(), key);
            i10 += 2;
            eVarE.encodeSerializableElement(getDescriptor(), i11, o(), value);
        }
        eVarE.endStructure(descriptor);
    }

    private o1(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.f315987a = kSerializer;
        this.f315988b = kSerializer2;
    }
}
