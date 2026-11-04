package io.intercom.android.sdk.helpcenter.api;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nHelpCenterApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterApi.kt\nio/intercom/android/sdk/helpcenter/api/HelpCenterApiHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1#2:60\n462#3:61\n412#3:62\n1246#4,4:63\n*S KotlinDebug\n*F\n+ 1 HelpCenterApi.kt\nio/intercom/android/sdk/helpcenter/api/HelpCenterApiHelper\n*L\n54#1:61\n54#1:62\n54#1:63,4\n*E\n"})
public final class HelpCenterApiHelper {
    public static final int $stable = 0;

    @NotNull
    public static final HelpCenterApiHelper INSTANCE = new HelpCenterApiHelper();

    private HelpCenterApiHelper() {
    }

    @NotNull
    public final Map<String, String> addDefaultOptions() {
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        injector.getApi().addSecureHash(map);
        Intrinsics.checkNotNullExpressionValue(map, "apply(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }
}
