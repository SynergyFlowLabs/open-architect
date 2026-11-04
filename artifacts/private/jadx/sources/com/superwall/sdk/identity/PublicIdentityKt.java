package com.superwall.sdk.identity;

import com.superwall.sdk.Superwall;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PublicIdentityKt {
    @NotNull
    public static final Map<String, Object> cleanAttributes(@NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : attributes.keySet()) {
            if (!StringsKt.u2(str, "$", false, 2, null)) {
                linkedHashMap.put(str, attributes.get(str));
            }
        }
        return MapsKt.toMap(linkedHashMap);
    }

    public static final void identify(@NotNull Superwall superwall, @NotNull String userId, @Nullable IdentityOptions identityOptions) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        superwall.getDependencyContainer$superwall_release().getIdentityManager().identify(userId, identityOptions);
    }

    public static /* synthetic */ void identify$default(Superwall superwall, String str, IdentityOptions identityOptions, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            identityOptions = null;
        }
        identify(superwall, str, identityOptions);
    }

    public static final void setUserAttributes(@NotNull Superwall superwall, @NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        IdentityManager.mergeUserAttributes$default(superwall.getDependencyContainer$superwall_release().getIdentityManager(), cleanAttributes(attributes), false, 2, null);
    }
}
