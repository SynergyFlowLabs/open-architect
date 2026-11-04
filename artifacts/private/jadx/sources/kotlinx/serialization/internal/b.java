package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.i
@SourceDebugExtension({"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n476#2,2:116\n478#2,2:119\n82#3:118\n571#4,2:121\n573#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
public abstract class b<T> implements KSerializer<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T c(kotlinx.serialization.encoding.d dVar) {
        return (T) kotlinx.serialization.encoding.d.a(dVar, getDescriptor(), 1, kotlinx.serialization.q.a(this, dVar, dVar.decodeStringElement(getDescriptor(), 0)), null, 8, null);
    }

    @kotlinx.serialization.i
    @Nullable
    public kotlinx.serialization.e<T> d(@NotNull kotlinx.serialization.encoding.d decoder, @Nullable String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().g(f(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.e
    @NotNull
    public final T deserialize(@NotNull Decoder decoder) {
        T t10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(descriptor);
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        if (dVarBeginStructure.c()) {
            t10 = (T) c(dVarBeginStructure);
        } else {
            Object objA = null;
            while (true) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objA != null) {
                        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                        t10 = (T) objA;
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) hVar.f312751a)).toString());
                }
                if (iDecodeElementIndex == 0) {
                    hVar.f312751a = (T) dVarBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                } else {
                    if (iDecodeElementIndex != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) hVar.f312751a;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(iDecodeElementIndex);
                        throw new kotlinx.serialization.c0(sb2.toString());
                    }
                    T t11 = hVar.f312751a;
                    if (t11 == 0) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    hVar.f312751a = t11;
                    objA = kotlinx.serialization.encoding.d.a(dVarBeginStructure, getDescriptor(), iDecodeElementIndex, kotlinx.serialization.q.a(this, dVarBeginStructure, (String) t11), null, 8, null);
                }
            }
        }
        dVarBeginStructure.endStructure(descriptor);
        return t10;
    }

    @kotlinx.serialization.i
    @Nullable
    public kotlinx.serialization.d0<T> e(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().h(f(), value);
    }

    @NotNull
    public abstract kotlin.reflect.d<T> f();

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.d0<? super T> d0VarB = kotlinx.serialization.q.b(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(descriptor);
        eVarBeginStructure.encodeStringElement(getDescriptor(), 0, d0VarB.getDescriptor().getSerialName());
        SerialDescriptor descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(d0VarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        eVarBeginStructure.encodeSerializableElement(descriptor2, 1, d0VarB, value);
        eVarBeginStructure.endStructure(descriptor);
    }
}
