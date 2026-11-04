package io.customer.datapipelines.plugins;

import com.segment.analytics.kotlin.core.BaseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPluginExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginExtensions.kt\nio/customer/datapipelines/plugins/PluginExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1374#2:64\n1460#2,5:65\n*S KotlinDebug\n*F\n+ 1 PluginExtensions.kt\nio/customer/datapipelines/plugins/PluginExtensionsKt\n*L\n47#1:64\n47#1:65,5\n*E\n"})
public final class k {
    @NotNull
    public static final List<JsonPrimitive> a(@NotNull JsonObject jsonObject, @NotNull String path) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return b(jsonObject, StringsKt.T4(path, new char[]{'.'}, false, 0, 6, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<JsonPrimitive> b(JsonElement jsonElement, List<String> list) {
        if (list.isEmpty()) {
            return jsonElement instanceof JsonPrimitive ? CollectionsKt.listOf(jsonElement) : CollectionsKt.emptyList();
        }
        String str = (String) CollectionsKt.first((List) list);
        List listDrop = CollectionsKt.drop(list, 1);
        if (jsonElement instanceof JsonObject) {
            JsonElement jsonElement2 = (JsonElement) ((JsonObject) jsonElement).get((Object) str);
            return jsonElement2 != null ? b(jsonElement2, listDrop) : CollectionsKt.emptyList();
        }
        if (!(jsonElement instanceof JsonArray)) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) jsonElement).iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, b((JsonElement) it.next(), list));
        }
        return arrayList;
    }

    @NotNull
    public static final List<JsonPrimitive> c(@NotNull BaseEvent baseEvent, @NotNull String path) {
        Intrinsics.checkNotNullParameter(baseEvent, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return a(baseEvent.e(), path);
    }
}
