package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nWebSocketExtensionHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketExtensionHeader.kt\nio/ktor/websocket/WebSocketExtensionHeaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1563#2:53\n1634#2,2:54\n1563#2:56\n1634#2,3:57\n1636#2:60\n*S KotlinDebug\n*F\n+ 1 WebSocketExtensionHeader.kt\nio/ktor/websocket/WebSocketExtensionHeaderKt\n*L\n46#1:53\n46#1:54,2\n49#1:56\n49#1:57,3\n46#1:60\n*E\n"})
public final class i0 {
    @NotNull
    public static final List<h0> a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 2 << 0;
        List listSplit$default = StringsKt.split$default(value, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt.split$default((String) it.next(), new String[]{";"}, false, 0, 6, null);
            String string = StringsKt.E5((String) CollectionsKt.first(listSplit$default2)).toString();
            List listDrop = CollectionsKt.drop(listSplit$default2, 1);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
            Iterator it2 = listDrop.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt.E5((String) it2.next()).toString());
            }
            arrayList.add(new h0(string, arrayList2));
        }
        return arrayList;
    }
}
