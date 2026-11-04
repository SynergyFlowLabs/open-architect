package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nObjectSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,57:1\n571#2,4:58\n*S KotlinDebug\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n*L\n43#1:58,4\n*E\n"})
public final class z1<T> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f316064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<? extends Annotation> f316065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f316066c;

    public z1(@NotNull final String serialName, @NotNull T objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f316064a = objectInstance;
        this.f316065b = CollectionsKt.emptyList();
        this.f316066c = kotlin.g0.b(kotlin.j0.PUBLICATION, new Function0() { // from class: kotlinx.serialization.internal.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z1.d(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor d(String str, final z1 z1Var) {
        return kotlinx.serialization.descriptors.k.h(str, kotlinx.serialization.descriptors.m.d.f315864a, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z1.e(this.f316057a, (kotlinx.serialization.descriptors.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(z1 z1Var, kotlinx.serialization.descriptors.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.l(z1Var.f316065b);
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        int iDecodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(descriptor);
        if (dVarBeginStructure.c() || (iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(getDescriptor())) == -1) {
            Unit unit = Unit.f312394a;
            dVarBeginStructure.endStructure(descriptor);
            return this.f316064a;
        }
        throw new kotlinx.serialization.c0("Unexpected index " + iDecodeElementIndex);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f316066c.getValue();
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.a1
    public z1(@NotNull String serialName, @NotNull T objectInstance, @NotNull Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f316065b = ArraysKt.asList(classAnnotations);
    }
}
