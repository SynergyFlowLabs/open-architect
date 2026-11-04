package com.segment.analytics.kotlin.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storage.kt\ncom/segment/analytics/kotlin/core/StorageKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1549#2:132\n1620#2,3:133\n*S KotlinDebug\n*F\n+ 1 Storage.kt\ncom/segment/analytics/kotlin/core/StorageKt\n*L\n108#1:132\n108#1:133,3\n*E\n"})
public final class t {
    @NotNull
    public static final List<String> a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return CollectionsKt.emptyList();
        }
        List listSplit$default = StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.E5((String) it.next()).toString());
        }
        return arrayList;
    }
}
