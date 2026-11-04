package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n160#2:135\n160#2:139\n1803#3,3:136\n1803#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n124#1:135\n125#1:139\n124#1:136,3\n125#1:140,3\n*E\n"})
public final class l2 {
    public static final /* synthetic */ <SD extends SerialDescriptor> boolean b(SD sd2, Object obj, Function1<? super SD, Boolean> typeParamsAreEqual) {
        Intrinsics.checkNotNullParameter(sd2, "<this>");
        Intrinsics.checkNotNullParameter(typeParamsAreEqual, "typeParamsAreEqual");
        if (sd2 == obj) {
            return true;
        }
        Intrinsics.reifiedOperationMarker(3, "SD");
        if (!(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(sd2.getSerialName(), serialDescriptor.getSerialName()) || !typeParamsAreEqual.invoke(obj).booleanValue() || sd2.getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = sd2.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            if (!Intrinsics.areEqual(sd2.getElementDescriptor(i10).getSerialName(), serialDescriptor.getElementDescriptor(i10).getSerialName()) || !Intrinsics.areEqual(sd2.getElementDescriptor(i10).getKind(), serialDescriptor.getElementDescriptor(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int c(@NotNull SerialDescriptor serialDescriptor, @NotNull SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> iterableA = kotlinx.serialization.descriptors.h.a(serialDescriptor);
        Iterator<SerialDescriptor> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<SerialDescriptor> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            kotlinx.serialization.descriptors.l kind = it2.next().getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }

    @NotNull
    public static final String d(@NotNull final SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return CollectionsKt.joinToString$default(kotlin.ranges.r.W1(0, serialDescriptor.getElementsCount()), ", ", serialDescriptor.getSerialName() + '(', ")", 0, null, new Function1() { // from class: kotlinx.serialization.internal.k2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.e(serialDescriptor, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(SerialDescriptor serialDescriptor, int i10) {
        return serialDescriptor.getElementName(i10) + ": " + serialDescriptor.getElementDescriptor(i10).getSerialName();
    }
}
