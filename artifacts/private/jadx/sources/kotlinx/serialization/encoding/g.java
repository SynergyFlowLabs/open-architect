package kotlinx.serialization.encoding;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,508:1\n489#1,2:509\n491#1,2:514\n1878#2,3:511\n*S KotlinDebug\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n502#1:509,2\n502#1:514,2\n503#1:511,3\n*E\n"})
public final class g {
    public static final void a(@NotNull Encoder encoder, @NotNull SerialDescriptor descriptor, int i10, @NotNull Function1<? super e, Unit> block) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        e eVarE = encoder.e(descriptor, i10);
        block.invoke(eVarE);
        eVarE.endStructure(descriptor);
    }

    public static final <E> void b(@NotNull Encoder encoder, @NotNull SerialDescriptor descriptor, @NotNull Collection<? extends E> collection, @NotNull n<? super e, ? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(block, "block");
        e eVarE = encoder.e(descriptor, collection.size());
        Iterator<T> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a0.c cVar = (Object) it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            block.invoke(eVarE, Integer.valueOf(i10), cVar);
            i10 = i11;
        }
        eVarE.endStructure(descriptor);
    }

    public static final void c(@NotNull Encoder encoder, @NotNull SerialDescriptor descriptor, @NotNull Function1<? super e, Unit> block) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        e eVarBeginStructure = encoder.beginStructure(descriptor);
        block.invoke(eVarBeginStructure);
        eVarBeginStructure.endStructure(descriptor);
    }
}
