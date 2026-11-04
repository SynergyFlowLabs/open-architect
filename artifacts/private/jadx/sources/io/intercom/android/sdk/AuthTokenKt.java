package io.intercom.android.sdk;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAuthToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthToken.kt\nio/intercom/android/sdk/AuthTokenKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,9:1\n1187#2,2:10\n1261#2,4:12\n*S KotlinDebug\n*F\n+ 1 AuthToken.kt\nio/intercom/android/sdk/AuthTokenKt\n*L\n8#1:10,2\n8#1:12,4\n*E\n"})
public final class AuthTokenKt {
    @NotNull
    public static final Map<String, String> toMap(@NotNull List<AuthToken> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<AuthToken> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (AuthToken authToken : list2) {
            Pair pair = TuplesKt.to(authToken.getName(), authToken.getToken());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
