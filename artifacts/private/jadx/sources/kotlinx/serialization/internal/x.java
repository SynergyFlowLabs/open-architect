package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n489#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
public abstract class x<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<Element> f316049a;

    public /* synthetic */ x(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @Override // kotlinx.serialization.internal.a
    protected final void h(@NotNull kotlinx.serialization.encoding.d decoder, Builder builder, int i10, int i11) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            i(decoder, i10 + i12, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.a
    protected void i(@NotNull kotlinx.serialization.encoding.d decoder, int i10, Builder builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int i11 = 2 >> 0;
        o(builder, i10, kotlinx.serialization.encoding.d.a(decoder, getDescriptor(), i10, this.f316049a, null, 8, null));
    }

    protected abstract void o(Builder builder, int i10, Element element);

    @Override // kotlinx.serialization.internal.a, kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iF = f(collection);
        SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.e eVarE = encoder.e(descriptor, iF);
        Iterator<Element> itE = e(collection);
        for (int i10 = 0; i10 < iF; i10++) {
            eVarE.encodeSerializableElement(getDescriptor(), i10, this.f316049a, itE.next());
        }
        eVarE.endStructure(descriptor);
    }

    private x(KSerializer<Element> kSerializer) {
        super(null);
        this.f316049a = kSerializer;
    }
}
