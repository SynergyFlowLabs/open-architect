package kotlinx.serialization.modules;

import java.util.List;
import kotlin.b1;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,245:1\n31#2,3:246\n31#2,3:249\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n*L\n97#1:246,3\n109#1:249,3\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f f316102a = new d(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), false);

    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f316103a;

        a(g gVar) {
            this.f316103a = gVar;
        }

        @Override // kotlinx.serialization.modules.j
        public <T> void contextual(kotlin.reflect.d<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f316103a.m(kClass, new kotlinx.serialization.modules.a.b(provider), true);
        }

        @Override // kotlinx.serialization.modules.j
        public <T> void d(kotlin.reflect.d<T> kClass, KSerializer<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.f316103a.m(kClass, new kotlinx.serialization.modules.a.C2320a(serializer), true);
        }

        @Override // kotlinx.serialization.modules.j
        public <Base, Sub extends Base> void polymorphic(kotlin.reflect.d<Base> baseClass, kotlin.reflect.d<Sub> actualClass, KSerializer<Sub> actualSerializer) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(actualClass, "actualClass");
            Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
            this.f316103a.k(baseClass, actualClass, actualSerializer, true);
        }

        @Override // kotlinx.serialization.modules.j
        public <Base> void polymorphicDefaultDeserializer(kotlin.reflect.d<Base> baseClass, Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> defaultDeserializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            this.f316103a.i(baseClass, defaultDeserializerProvider, true);
        }

        @Override // kotlinx.serialization.modules.j
        public <Base> void polymorphicDefaultSerializer(kotlin.reflect.d<Base> baseClass, Function1<? super Base, ? extends d0<? super Base>> defaultSerializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
            this.f316103a.j(baseClass, defaultSerializerProvider, true);
        }
    }

    @NotNull
    public static final f a() {
        return f316102a;
    }

    @l(level = n.WARNING, message = "Deprecated in the favour of 'EmptySerializersModule()'", replaceWith = @b1(expression = "EmptySerializersModule()", imports = {}))
    public static /* synthetic */ void b() {
    }

    @NotNull
    public static final f c(@NotNull f fVar, @NotNull f other) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        g gVar = new g();
        gVar.h(fVar);
        other.a(new a(gVar));
        return gVar.g();
    }

    @NotNull
    public static final f d(@NotNull f fVar, @NotNull f other) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        g gVar = new g();
        gVar.h(fVar);
        gVar.h(other);
        return gVar.g();
    }
}
