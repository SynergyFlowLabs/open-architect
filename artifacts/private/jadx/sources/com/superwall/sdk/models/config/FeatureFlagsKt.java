package com.superwall.sdk.models.config;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFeatureFlags.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlags.kt\ncom/superwall/sdk/models/config/FeatureFlagsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n295#2,2:34\n*S KotlinDebug\n*F\n+ 1 FeatureFlags.kt\ncom/superwall/sdk/models/config/FeatureFlagsKt\n*L\n30#1:34,2\n*E\n"})
public final class FeatureFlagsKt {
    public static final boolean value(@NotNull List<RawFeatureFlag> list, @NotNull String key, boolean z10) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((RawFeatureFlag) next).getKey(), key));
        RawFeatureFlag rawFeatureFlag = (RawFeatureFlag) next;
        return rawFeatureFlag != null ? rawFeatureFlag.getEnabled() : z10;
    }
}
