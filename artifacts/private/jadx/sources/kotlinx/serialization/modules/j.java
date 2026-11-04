package kotlinx.serialization.modules;

import java.util.List;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.g
public interface j {

    public static final class a {
        @Deprecated
        public static <T> void a(@NotNull j jVar, @NotNull kotlin.reflect.d<T> kClass, @NotNull KSerializer<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            j.super.d(kClass, serializer);
        }

        @l(level = n.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @b1(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        @Deprecated
        public static <Base> void b(@NotNull j jVar, @NotNull kotlin.reflect.d<Base> baseClass, @NotNull Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> defaultDeserializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            j.super.f(baseClass, defaultDeserializerProvider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static KSerializer a(KSerializer kSerializer, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kSerializer;
    }

    <T> void contextual(@NotNull kotlin.reflect.d<T> dVar, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1);

    default <T> void d(@NotNull kotlin.reflect.d<T> kClass, @NotNull final KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        contextual(kClass, new Function1() { // from class: kotlinx.serialization.modules.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.a(serializer, (List) obj);
            }
        });
    }

    @l(level = n.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @b1(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    default <Base> void f(@NotNull kotlin.reflect.d<Base> baseClass, @NotNull Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider);
    }

    <Base, Sub extends Base> void polymorphic(@NotNull kotlin.reflect.d<Base> dVar, @NotNull kotlin.reflect.d<Sub> dVar2, @NotNull KSerializer<Sub> kSerializer);

    <Base> void polymorphicDefaultDeserializer(@NotNull kotlin.reflect.d<Base> dVar, @NotNull Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> function1);

    <Base> void polymorphicDefaultSerializer(@NotNull kotlin.reflect.d<Base> dVar, @NotNull Function1<? super Base, ? extends d0<? super Base>> function1);
}
