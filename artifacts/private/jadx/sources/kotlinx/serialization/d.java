package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.f2;
import kotlinx.serialization.internal.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@g
public final class d<T> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<T> f315814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final KSerializer<T> f315815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<KSerializer<?>> f315816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315817d;

    public d(@NotNull kotlin.reflect.d<T> serializableClass, @Nullable KSerializer<T> kSerializer, @NotNull KSerializer<?>[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f315814a = serializableClass;
        this.f315815b = kSerializer;
        this.f315816c = ArraysKt.asList(typeArgumentsSerializers);
        this.f315817d = kotlinx.serialization.descriptors.b.e(kotlinx.serialization.descriptors.k.h("kotlinx.serialization.ContextualSerializer", kotlinx.serialization.descriptors.l.a.f315859a, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.c(this.f315813a, (kotlinx.serialization.descriptors.a) obj);
            }
        }), serializableClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(d dVar, kotlinx.serialization.descriptors.a buildSerialDescriptor) {
        SerialDescriptor descriptor;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        KSerializer<T> kSerializer = dVar.f315815b;
        List<Annotation> annotations = (kSerializer == null || (descriptor = kSerializer.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = CollectionsKt.emptyList();
        }
        buildSerialDescriptor.l(annotations);
        return Unit.f312394a;
    }

    private final KSerializer<T> d(kotlinx.serialization.modules.f fVar) {
        KSerializer<T> kSerializerC = fVar.c(this.f315814a, this.f315816c);
        if (kSerializerC != null) {
            return kSerializerC;
        }
        KSerializer<T> kSerializer = this.f315815b;
        if (kSerializer != null) {
            return kSerializer;
        }
        f2.j(this.f315814a);
        throw new kotlin.a0();
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (T) decoder.decodeSerializableValue(d(decoder.getSerializersModule()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f315817d;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(d(encoder.getSerializersModule()), value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull kotlin.reflect.d<T> serializableClass) {
        this(serializableClass, null, m2.f315974a);
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
    }
}
