package kotlinx.serialization.modules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.a1;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPolymorphicModuleBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,119:1\n1869#2:120\n1870#2:122\n78#3:121\n*S KotlinDebug\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n*L\n88#1:120\n88#1:122\n92#1:121\n*E\n"})
public final class b<Base> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<Base> f316083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final KSerializer<Base> f316084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Pair<kotlin.reflect.d<? extends Base>, KSerializer<? extends Base>>> f316085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function1<? super Base, ? extends d0<? super Base>> f316086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> f316087e;

    @a1
    public b(@NotNull kotlin.reflect.d<Base> baseClass, @Nullable KSerializer<Base> kSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f316083a = baseClass;
        this.f316084b = kSerializer;
        this.f316085c = new ArrayList();
    }

    @a1
    public final void a(@NotNull g builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        KSerializer<Base> kSerializer = this.f316084b;
        if (kSerializer != null) {
            kotlin.reflect.d<Base> dVar = this.f316083a;
            g.l(builder, dVar, dVar, kSerializer, false, 8, null);
        }
        Iterator<T> it = this.f316085c.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            kotlin.reflect.d dVar2 = (kotlin.reflect.d) pair.component1();
            KSerializer kSerializer2 = (KSerializer) pair.component2();
            kotlin.reflect.d<Base> dVar3 = this.f316083a;
            Intrinsics.checkNotNull(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            Intrinsics.checkNotNull(kSerializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            g.l(builder, dVar3, dVar2, kSerializer2, false, 8, null);
        }
        Function1<? super Base, ? extends d0<? super Base>> function1 = this.f316086d;
        if (function1 != null) {
            builder.j(this.f316083a, function1, false);
        }
        Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> function2 = this.f316087e;
        if (function2 != null) {
            builder.i(this.f316083a, function2, false);
        }
    }

    @l(level = n.WARNING, message = "Deprecated in favor of function with more precise name: defaultDeserializer", replaceWith = @b1(expression = "defaultDeserializer(defaultSerializerProvider)", imports = {}))
    public final void b(@NotNull Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        c(defaultSerializerProvider);
    }

    public final void c(@NotNull Function1<? super String, ? extends kotlinx.serialization.e<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        if (this.f316087e == null) {
            this.f316087e = defaultDeserializerProvider;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.f316083a + ": " + this.f316087e).toString());
    }

    public final <T extends Base> void d(@NotNull kotlin.reflect.d<T> subclass, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(subclass, "subclass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f316085c.add(TuplesKt.to(subclass, serializer));
    }

    public /* synthetic */ b(kotlin.reflect.d dVar, KSerializer kSerializer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? null : kSerializer);
    }
}
