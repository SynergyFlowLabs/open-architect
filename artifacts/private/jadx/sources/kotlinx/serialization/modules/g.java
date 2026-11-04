package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.a1;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import kotlinx.serialization.internal.e2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n384#2,7:264\n384#2,7:271\n1#3:278\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n*L\n196#1:264,7\n197#1:271,7\n*E\n"})
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, a> f316094a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, KSerializer<?>>> f316095b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Function1<?, d0<?>>> f316096c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Map<String, KSerializer<?>>> f316097d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Function1<String, kotlinx.serialization.e<?>>> f316098e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f316099f;

    @a1
    public g() {
    }

    public static /* synthetic */ void l(g gVar, kotlin.reflect.d dVar, kotlin.reflect.d dVar2, KSerializer kSerializer, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        gVar.k(dVar, dVar2, kSerializer, z10);
    }

    public static /* synthetic */ void n(g gVar, kotlin.reflect.d dVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        gVar.m(dVar, aVar, z10);
    }

    @Override // kotlinx.serialization.modules.j
    public <T> void contextual(@NotNull kotlin.reflect.d<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        n(this, kClass, new a.b(provider), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.j
    public <T> void d(@NotNull kotlin.reflect.d<T> kClass, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        n(this, kClass, new a.C2320a(serializer), false, 4, null);
    }

    @a1
    @NotNull
    public final f g() {
        return new d(this.f316094a, this.f316095b, this.f316096c, this.f316097d, this.f316098e, this.f316099f);
    }

    public final void h(@NotNull f module) {
        Intrinsics.checkNotNullParameter(module, "module");
        module.a(this);
    }

    @oj.i(name = "registerDefaultPolymorphicDeserializer")
    public final <Base> void i(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> defaultDeserializerProvider, boolean z10) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1<String, kotlinx.serialization.e<?>> function1 = this.f316098e.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultDeserializerProvider) || z10) {
            this.f316098e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
    }

    @oj.i(name = "registerDefaultPolymorphicSerializer")
    public final <Base> void j(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull Function1<? super Base, ? extends d0<? super Base>> defaultSerializerProvider, boolean z10) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Function1<?, d0<?>> function1 = this.f316096c.get(baseClass);
        if (function1 != null && !Intrinsics.areEqual(function1, defaultSerializerProvider) && !z10) {
            throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.f316096c.put(baseClass, defaultSerializerProvider);
    }

    @oj.i(name = "registerPolymorphicSerializer")
    public final <Base, Sub extends Base> void k(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull kotlin.reflect.d<Sub> concreteClass, @NotNull KSerializer<Sub> concreteSerializer, boolean z10) {
        Object next;
        kotlin.reflect.d dVar;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String serialName = concreteSerializer.getDescriptor().getSerialName();
        Map<kotlin.reflect.d<?>, Map<kotlin.reflect.d<?>, KSerializer<?>>> map = this.f316095b;
        Map<kotlin.reflect.d<?>, KSerializer<?>> map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(baseClass, map2);
        }
        Map<kotlin.reflect.d<?>, KSerializer<?>> map3 = map2;
        Map<kotlin.reflect.d<?>, Map<String, KSerializer<?>>> map4 = this.f316097d;
        Map<String, KSerializer<?>> map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(baseClass, map5);
        }
        Map<String, KSerializer<?>> map6 = map5;
        KSerializer<?> kSerializer = map3.get(concreteClass);
        if (kSerializer != null && !Intrinsics.areEqual(kSerializer, concreteSerializer)) {
            if (!z10) {
                throw new e(baseClass, concreteClass);
            }
            map6.remove(kSerializer.getDescriptor().getSerialName());
        }
        KSerializer<?> kSerializer2 = map6.get(serialName);
        if (kSerializer2 != null && !Intrinsics.areEqual(kSerializer2, concreteSerializer)) {
            Iterator it = MapsKt.asSequence(map3).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Map.Entry) next).getValue() != kSerializer2);
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (dVar = (kotlin.reflect.d) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + serialName + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (!z10) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + serialName + "': " + concreteSerializer + " for '" + concreteClass + "' and " + kSerializer2 + " for '" + dVar + '\'');
            }
            map3.remove(dVar);
        }
        map3.put(concreteClass, concreteSerializer);
        map6.put(serialName, concreteSerializer);
    }

    @oj.i(name = "registerSerializer")
    public final <T> void m(@NotNull kotlin.reflect.d<T> forClass, @NotNull a provider, boolean z10) {
        a aVar;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (z10 || (aVar = this.f316094a.get(forClass)) == null || Intrinsics.areEqual(aVar, provider)) {
            this.f316094a.put(forClass, provider);
            if (e2.n(forClass)) {
                this.f316099f = true;
                return;
            }
            return;
        }
        throw new e("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }

    @Override // kotlinx.serialization.modules.j
    public <Base, Sub extends Base> void polymorphic(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull kotlin.reflect.d<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        l(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // kotlinx.serialization.modules.j
    public <Base> void polymorphicDefaultDeserializer(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        i(baseClass, defaultDeserializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.j
    public <Base> void polymorphicDefaultSerializer(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull Function1<? super Base, ? extends d0<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        j(baseClass, defaultSerializerProvider, false);
    }
}
