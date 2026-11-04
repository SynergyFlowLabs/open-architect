package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.modules.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JsonSerializersModuleValidator implements j {

    @NotNull
    private final String discriminator;
    private final boolean isDiscriminatorRequired;
    private final boolean useArrayPolymorphism;

    public JsonSerializersModuleValidator(@NotNull JsonConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.discriminator = configuration.getClassDiscriminator();
        this.useArrayPolymorphism = configuration.getUseArrayPolymorphism();
        this.isDiscriminatorRequired = configuration.getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE;
    }

    private final void checkDiscriminatorCollisions(SerialDescriptor serialDescriptor, kotlin.reflect.d<?> dVar) {
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            String elementName = serialDescriptor.getElementName(i10);
            if (Intrinsics.areEqual(elementName, this.discriminator)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + elementName + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void checkKind(SerialDescriptor serialDescriptor, kotlin.reflect.d<?> dVar) {
        l kind = serialDescriptor.getKind();
        if ((kind instanceof kotlinx.serialization.descriptors.d) || Intrinsics.areEqual(kind, l.a.f315859a)) {
            throw new IllegalArgumentException("Serializer for " + dVar.Q() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.useArrayPolymorphism && this.isDiscriminatorRequired) {
            if (Intrinsics.areEqual(kind, m.b.f315862a) || Intrinsics.areEqual(kind, m.c.f315863a) || (kind instanceof e) || (kind instanceof l.b)) {
                throw new IllegalArgumentException("Serializer for " + dVar.Q() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    @Override // kotlinx.serialization.modules.j
    public <T> void contextual(@NotNull kotlin.reflect.d<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // kotlinx.serialization.modules.j
    public <Base, Sub extends Base> void polymorphic(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull kotlin.reflect.d<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        checkKind(descriptor, actualClass);
        if (this.useArrayPolymorphism || !this.isDiscriminatorRequired) {
            return;
        }
        checkDiscriminatorCollisions(descriptor, actualClass);
    }

    @Override // kotlinx.serialization.modules.j
    public <Base> void polymorphicDefaultDeserializer(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // kotlinx.serialization.modules.j
    public <Base> void polymorphicDefaultSerializer(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull Function1<? super Base, ? extends d0<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }
}
