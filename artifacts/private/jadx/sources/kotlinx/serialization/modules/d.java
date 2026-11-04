package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.r1;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,245:1\n216#2,2:246\n216#2:248\n216#2:249\n217#2:251\n217#2:252\n216#2,2:253\n216#2,2:255\n78#3:250\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n186#1:246,2\n196#1:248\n197#1:249\n197#1:251\n196#1:252\n206#1:253,2\n210#1:255,2\n201#1:250\n*E\n"})
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, a> f316088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Map<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, KSerializer<?>>> f316089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Function1<?, d0<?>>> f316090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Map<String, KSerializer<?>>> f316091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Function1<String, kotlinx.serialization.e<?>>> f316092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f316093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Map<kotlin.reflect.d<?>, ? extends a> class2ContextualFactory, @NotNull Map<kotlin.reflect.d<?>, ? extends Map<kotlin.reflect.d<?>, ? extends KSerializer<?>>> polyBase2Serializers, @NotNull Map<kotlin.reflect.d<?>, ? extends Function1<?, ? extends d0<?>>> polyBase2DefaultSerializerProvider, @NotNull Map<kotlin.reflect.d<?>, ? extends Map<String, ? extends KSerializer<?>>> polyBase2NamedSerializers, @NotNull Map<kotlin.reflect.d<?>, ? extends Function1<? super String, ? extends kotlinx.serialization.e<?>>> polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f316088a = class2ContextualFactory;
        this.f316089b = polyBase2Serializers;
        this.f316090c = polyBase2DefaultSerializerProvider;
        this.f316091d = polyBase2NamedSerializers;
        this.f316092e = polyBase2DefaultDeserializerProvider;
        this.f316093f = z10;
    }

    @Override // kotlinx.serialization.modules.f
    public void a(@NotNull j collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry<kotlin.reflect.d<?>, a> entry : this.f316088a.entrySet()) {
            kotlin.reflect.d<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C2320a) {
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> kSerializerB = ((a.C2320a) value).b();
                Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.d(key, kSerializerB);
            } else {
                if (!(value instanceof a.b)) {
                    throw new k0();
                }
                collector.contextual(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, KSerializer<?>>> entry2 : this.f316089b.entrySet()) {
            kotlin.reflect.d<?> key2 = entry2.getKey();
            for (Map.Entry<kotlin.reflect.d<?>, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                kotlin.reflect.d<?> key3 = entry3.getKey();
                KSerializer<?> value2 = entry3.getValue();
                Intrinsics.checkNotNull(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.polymorphic(key2, key3, value2);
            }
        }
        for (Map.Entry<kotlin.reflect.d<?>, Function1<?, d0<?>>> entry4 : this.f316090c.entrySet()) {
            kotlin.reflect.d<?> key4 = entry4.getKey();
            Function1<?, d0<?>> value3 = entry4.getValue();
            Intrinsics.checkNotNull(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.polymorphicDefaultSerializer(key4, (Function1) r1.q(value3, 1));
        }
        for (Map.Entry<kotlin.reflect.d<?>, Function1<String, kotlinx.serialization.e<?>>> entry5 : this.f316092e.entrySet()) {
            kotlin.reflect.d<?> key5 = entry5.getKey();
            Function1<String, kotlinx.serialization.e<?>> value4 = entry5.getValue();
            Intrinsics.checkNotNull(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.polymorphicDefaultDeserializer(key5, (Function1) r1.q(value4, 1));
        }
    }

    @Override // kotlinx.serialization.modules.f
    @Nullable
    public <T> KSerializer<T> c(@NotNull kotlin.reflect.d<T> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.f316088a.get(kClass);
        KSerializer<T> kSerializer = aVar != null ? (KSerializer<T>) aVar.a(typeArgumentsSerializers) : null;
        if (kSerializer instanceof KSerializer) {
            return kSerializer;
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.f
    public boolean e() {
        return this.f316093f;
    }

    @Override // kotlinx.serialization.modules.f
    @Nullable
    public <T> kotlinx.serialization.e<T> g(@NotNull kotlin.reflect.d<? super T> baseClass, @Nullable String str) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map<String, KSerializer<?>> map = this.f316091d.get(baseClass);
        KSerializer<?> kSerializer = map != null ? map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Function1<String, kotlinx.serialization.e<?>> function1 = this.f316092e.get(baseClass);
        Function1<String, kotlinx.serialization.e<?>> function2 = r1.B(function1, 1) ? function1 : null;
        if (function2 != null) {
            return (kotlinx.serialization.e) function2.invoke(str);
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.f
    @Nullable
    public <T> d0<T> h(@NotNull kotlin.reflect.d<? super T> baseClass, @NotNull T value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 2 | 0;
        if (!baseClass.K(value)) {
            return null;
        }
        Map<kotlin.reflect.d<?>, KSerializer<?>> map = this.f316089b.get(baseClass);
        KSerializer<?> kSerializer = map != null ? map.get(j1.d(value.getClass())) : null;
        KSerializer<?> kSerializer2 = kSerializer instanceof d0 ? kSerializer : null;
        if (kSerializer2 != null) {
            return kSerializer2;
        }
        Function1<?, d0<?>> function1 = this.f316090c.get(baseClass);
        Function1<?, d0<?>> function2 = r1.B(function1, 1) ? function1 : null;
        if (function2 != null) {
            return (d0) function2.invoke(value);
        }
        return null;
    }
}
