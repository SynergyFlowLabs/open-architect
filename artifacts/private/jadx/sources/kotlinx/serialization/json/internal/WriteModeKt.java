package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"})
public final class WriteModeKt {
    @NotNull
    public static final SerialDescriptor carrierDescriptor(@NotNull SerialDescriptor serialDescriptor, @NotNull f module) {
        SerialDescriptor serialDescriptorCarrierDescriptor;
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(serialDescriptor.getKind(), l.a.f315859a)) {
            return serialDescriptor.isInline() ? carrierDescriptor(serialDescriptor.getElementDescriptor(0), module) : serialDescriptor;
        }
        SerialDescriptor serialDescriptorC = kotlinx.serialization.descriptors.b.c(module, serialDescriptor);
        return (serialDescriptorC == null || (serialDescriptorCarrierDescriptor = carrierDescriptor(serialDescriptorC, module)) == null) ? serialDescriptor : serialDescriptorCarrierDescriptor;
    }

    public static final <T, R1 extends T, R2 extends T> T selectMapMode(@NotNull Json json, @NotNull SerialDescriptor mapDescriptor, @NotNull Function0<? extends R1> ifMap, @NotNull Function0<? extends R2> ifList) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(mapDescriptor, "mapDescriptor");
        Intrinsics.checkNotNullParameter(ifMap, "ifMap");
        Intrinsics.checkNotNullParameter(ifList, "ifList");
        SerialDescriptor serialDescriptorCarrierDescriptor = carrierDescriptor(mapDescriptor.getElementDescriptor(0), json.getSerializersModule());
        l kind = serialDescriptorCarrierDescriptor.getKind();
        if ((kind instanceof e) || Intrinsics.areEqual(kind, l.b.f315860a)) {
            return ifMap.invoke();
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return ifList.invoke();
        }
        throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
    }

    @NotNull
    public static final WriteMode switchMode(@NotNull Json json, @NotNull SerialDescriptor desc) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        l kind = desc.getKind();
        if (kind instanceof kotlinx.serialization.descriptors.d) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.areEqual(kind, m.b.f315862a)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.areEqual(kind, m.c.f315863a)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor serialDescriptorCarrierDescriptor = carrierDescriptor(desc.getElementDescriptor(0), json.getSerializersModule());
        l kind2 = serialDescriptorCarrierDescriptor.getKind();
        if ((kind2 instanceof e) || Intrinsics.areEqual(kind2, l.b.f315860a)) {
            return WriteMode.MAP;
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return WriteMode.LIST;
        }
        throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
    }
}
