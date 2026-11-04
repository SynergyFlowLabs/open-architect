package kotlinx.serialization.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class i3<A, B, C> implements KSerializer<kotlin.n1<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<A> f315942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final KSerializer<B> f315943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final KSerializer<C> f315944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315945d;

    public i3(@NotNull KSerializer<A> aSerializer, @NotNull KSerializer<B> bSerializer, @NotNull KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.f315942a = aSerializer;
        this.f315943b = bSerializer;
        this.f315944c = cSerializer;
        this.f315945d = kotlinx.serialization.descriptors.k.e("kotlin.Triple", new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.h3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i3.e(this.f315934a, (kotlinx.serialization.descriptors.a) obj);
            }
        });
    }

    private final kotlin.n1<A, B, C> c(kotlinx.serialization.encoding.d dVar) {
        Object objA = kotlinx.serialization.encoding.d.a(dVar, getDescriptor(), 0, this.f315942a, null, 8, null);
        Object objA2 = kotlinx.serialization.encoding.d.a(dVar, getDescriptor(), 1, this.f315943b, null, 8, null);
        Object objA3 = kotlinx.serialization.encoding.d.a(dVar, getDescriptor(), 2, this.f315944c, null, 8, null);
        dVar.endStructure(getDescriptor());
        return new kotlin.n1<>(objA, objA2, objA3);
    }

    private final kotlin.n1<A, B, C> d(kotlinx.serialization.encoding.d dVar) {
        kotlinx.serialization.encoding.d dVar2;
        Object objA = j3.f315952a;
        Object objA2 = j3.f315952a;
        Object objA3 = j3.f315952a;
        while (true) {
            int iDecodeElementIndex = dVar.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex == -1) {
                dVar.endStructure(getDescriptor());
                if (objA == j3.f315952a) {
                    throw new kotlinx.serialization.c0("Element 'first' is missing");
                }
                if (objA2 == j3.f315952a) {
                    throw new kotlinx.serialization.c0("Element 'second' is missing");
                }
                if (objA3 != j3.f315952a) {
                    return new kotlin.n1<>(objA, objA2, objA3);
                }
                throw new kotlinx.serialization.c0("Element 'third' is missing");
            }
            if (iDecodeElementIndex != 0) {
                int i10 = 7 << 1;
                if (iDecodeElementIndex == 1) {
                    dVar2 = dVar;
                    objA2 = kotlinx.serialization.encoding.d.a(dVar2, getDescriptor(), 1, this.f315943b, null, 8, null);
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new kotlinx.serialization.c0("Unexpected index " + iDecodeElementIndex);
                    }
                    objA3 = kotlinx.serialization.encoding.d.a(dVar, getDescriptor(), 2, this.f315944c, null, 8, null);
                }
            } else {
                dVar2 = dVar;
                objA = kotlinx.serialization.encoding.d.a(dVar2, getDescriptor(), 0, this.f315942a, null, 8, null);
            }
            dVar = dVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(i3 i3Var, kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "first", i3Var.f315942a.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "second", i3Var.f315943b.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "third", i3Var.f315944c.getDescriptor(), null, false, 12, null);
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public kotlin.n1<A, B, C> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(getDescriptor());
        return dVarBeginStructure.c() ? c(dVarBeginStructure) : d(dVarBeginStructure);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull kotlin.n1<? extends A, ? extends B, ? extends C> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(getDescriptor());
        eVarBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f315942a, value.f());
        eVarBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f315943b, value.g());
        eVarBeginStructure.encodeSerializableElement(getDescriptor(), 2, this.f315944c, value.h());
        eVarBeginStructure.endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f315945d;
    }
}
