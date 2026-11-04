package com.superwall.sdk.identity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.f;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIdentityLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityLogic.kt\ncom/superwall/sdk/identity/IdentityLogic\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,96:1\n503#2,7:97\n487#2,7:104\n*S KotlinDebug\n*F\n+ 1 IdentityLogic.kt\ncom/superwall/sdk/identity/IdentityLogic\n*L\n42#1:97,7\n43#1:104,7\n*E\n"})
public final class IdentityLogic {

    @NotNull
    public static final IdentityLogic INSTANCE = new IdentityLogic();

    public enum IdentityConfigurationAction {
        RESET,
        LOAD_ASSIGNMENTS;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = c.c(values());

        @NotNull
        public static kotlin.enums.a<IdentityConfigurationAction> getEntries() {
            return $ENTRIES;
        }
    }

    private IdentityLogic() {
    }

    @NotNull
    public final String generateAlias() {
        return "$SuperwallAlias:" + UUID.randomUUID();
    }

    public final int generateSeed() {
        return r.g1(r.W1(0, 100), f.f312895a);
    }

    @NotNull
    public final Map<String, Object> mergeAttributes(@NotNull Map<String, ? extends Object> newAttributes, @NotNull Map<String, ? extends Object> oldAttributes, @NotNull String appInstalledAtString) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        Intrinsics.checkNotNullParameter(oldAttributes, "oldAttributes");
        Intrinsics.checkNotNullParameter(appInstalledAtString, "appInstalledAtString");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(oldAttributes);
        for (Map.Entry<String, ? extends Object> entry : newAttributes.entrySet()) {
            String key = entry.getKey();
            if (!Intrinsics.areEqual(key, "$is_standard_event") && !Intrinsics.areEqual(key, "$application_installed_at")) {
                if (StringsKt.u2(key, "$", false, 2, null)) {
                    key = StringsKt.k2(key, "$", "", false, 4, null);
                }
                Object value = entry.getValue();
                if (value instanceof List) {
                    mutableMap.put(key, CollectionsKt.filterNotNull((Iterable) value));
                } else if (value instanceof Map) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : ((Map) value).entrySet()) {
                        if (entry2.getValue() != null) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        if (entry3.getKey() != null) {
                            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    mutableMap.put(key, linkedHashMap2);
                } else if (value == null) {
                    mutableMap.remove(key);
                } else {
                    mutableMap.put(key, value);
                }
            }
        }
        mutableMap.put("applicationInstalledAt", appInstalledAtString);
        return mutableMap;
    }

    @Nullable
    public final String sanitize(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        String string = StringsKt.E5(userId).toString();
        if (string.length() == 0) {
            return null;
        }
        return string;
    }

    public final boolean shouldGetAssignments(boolean z10, boolean z11, boolean z12) {
        return z11 && (z10 || !z12);
    }
}
