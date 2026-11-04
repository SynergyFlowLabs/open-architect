package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1#2:112\n1563#3:113\n1634#3,3:114\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n*L\n76#1:113\n76#1:114,3\n*E\n"})
public final class b {
    @Nullable
    public static final kotlin.reflect.d<?> a(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof c) {
            return ((c) serialDescriptor).f315827b;
        }
        if (serialDescriptor instanceof u2) {
            return a(((u2) serialDescriptor).e());
        }
        return null;
    }

    @kotlinx.serialization.g
    public static /* synthetic */ void b(SerialDescriptor serialDescriptor) {
    }

    @kotlinx.serialization.g
    @Nullable
    public static final SerialDescriptor c(@NotNull kotlinx.serialization.modules.f fVar, @NotNull SerialDescriptor descriptor) {
        KSerializer kSerializerD;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.reflect.d<?> dVarA = a(descriptor);
        if (dVarA == null || (kSerializerD = kotlinx.serialization.modules.f.d(fVar, dVarA, null, 2, null)) == null) {
            return null;
        }
        return kSerializerD.getDescriptor();
    }

    @kotlinx.serialization.g
    @NotNull
    public static final List<SerialDescriptor> d(@NotNull kotlinx.serialization.modules.f fVar, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.reflect.d<?> dVarA = a(descriptor);
        if (dVarA == null) {
            return CollectionsKt.emptyList();
        }
        Map<kotlin.reflect.d<?>, KSerializer<?>> map = ((kotlinx.serialization.modules.d) fVar).f316089b.get(dVarA);
        List listValues = map != null ? map.values() : null;
        if (listValues == null) {
            listValues = CollectionsKt.emptyList();
        }
        Collection<KSerializer<?>> collection = listValues;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((KSerializer) it.next()).getDescriptor());
        }
        return arrayList;
    }

    @NotNull
    public static final SerialDescriptor e(@NotNull SerialDescriptor serialDescriptor, @NotNull kotlin.reflect.d<?> context) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new c(serialDescriptor, context);
    }
}
