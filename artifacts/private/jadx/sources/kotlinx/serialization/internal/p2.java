package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.n2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n1#1,283:1\n489#2,4:284\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n*L\n174#1:284,4\n*E\n"})
public abstract class p2<Element, Array, Builder extends n2<Array>> extends x<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(@NotNull KSerializer<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f315994b = new o2(primitiveSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.a, kotlinx.serialization.e
    public final Array deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return g(decoder, null);
    }

    @Override // kotlinx.serialization.internal.a
    @NotNull
    protected final Iterator<Element> e(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.x, kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.f315994b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Builder b() {
        return l(s());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int c(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return builder.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void d(@NotNull Builder builder, int i10) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.b(i10);
    }

    protected abstract Array s();

    @Override // kotlinx.serialization.internal.x, kotlinx.serialization.internal.a, kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, Array array) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iF = f(array);
        SerialDescriptor serialDescriptor = this.f315994b;
        kotlinx.serialization.encoding.e eVarE = encoder.e(serialDescriptor, iF);
        w(eVarE, array, iF);
        eVarE.endStructure(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.x
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void o(@NotNull Builder builder, int i10, Element element) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    protected abstract void u(@NotNull kotlinx.serialization.encoding.d dVar, int i10, @NotNull Builder builder, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final Array m(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return (Array) builder.a();
    }

    protected abstract void w(@NotNull kotlinx.serialization.encoding.e eVar, Array array, int i10);
}
