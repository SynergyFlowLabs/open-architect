package com.superwall.sdk.debug;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import net.openid.appauth.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSWDebugManagerLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SWDebugManagerLogic.kt\ncom/superwall/sdk/debug/SWDebugManagerLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1557#2:30\n1628#2,2:31\n1630#2:34\n1#3:33\n*S KotlinDebug\n*F\n+ 1 SWDebugManagerLogic.kt\ncom/superwall/sdk/debug/SWDebugManagerLogic\n*L\n22#1:30\n22#1:31,2\n22#1:34\n*E\n"})
public final class SWDebugManagerLogic {

    @NotNull
    public static final SWDebugManagerLogic INSTANCE = new SWDebugManagerLogic();

    public enum Parameter {
        TOKEN(x.f333313b),
        PAYWALL_ID("paywall_id"),
        SUPERWALL_DEBUG("superwall_debug");

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        private final String value;

        Parameter(String str) {
            this.value = str;
        }

        @NotNull
        public static kotlin.enums.a<Parameter> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    private SWDebugManagerLogic() {
    }

    @Nullable
    public final String getQueryItemValue(@NotNull Uri uri, @NotNull Parameter name) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(name, "name");
        String query = uri.getQuery();
        if (query == null) {
            int i10 = 6 >> 0;
            return null;
        }
        List listSplit$default = StringsKt.split$default(query, new String[]{"&"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt.split$default((String) it.next(), new String[]{"="}, false, 0, 6, null);
            arrayList.add(new Pair(listSplit$default2.get(0), 1 < listSplit$default2.size() ? listSplit$default2.get(1) : ""));
        }
        return (String) MapsKt.toMap(arrayList).get(name.getValue());
    }
}
