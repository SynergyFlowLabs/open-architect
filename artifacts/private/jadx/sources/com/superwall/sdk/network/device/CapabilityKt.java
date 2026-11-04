package com.superwall.sdk.network.device;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class CapabilityKt {
    @NotNull
    public static final String namesCommaSeparated(@NotNull List<? extends Capability> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.superwall.sdk.network.device.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CapabilityKt.namesCommaSeparated$lambda$0((Capability) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence namesCommaSeparated$lambda$0(Capability it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName();
    }

    @NotNull
    public static final JsonElement toJson(@NotNull List<? extends Capability> list, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.encodeToJsonElement(hk.a.i(Capability.Companion.serializer()), list);
    }
}
