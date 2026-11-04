package io.intercom.android.sdk.api;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import okhttp3.e0;
import okhttp3.x;
import okhttp3.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMessengerApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessengerApi.kt\nio/intercom/android/sdk/api/MessengerApiHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,295:1\n216#2,2:296\n*S KotlinDebug\n*F\n+ 1 MessengerApi.kt\nio/intercom/android/sdk/api/MessengerApiHelper\n*L\n288#1:296,2\n*E\n"})
public final class MessengerApiHelper {
    public static final int $stable = 0;

    @NotNull
    public static final MessengerApiHelper INSTANCE = new MessengerApiHelper();

    private MessengerApiHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e0 getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper messengerApiHelper, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(map);
    }

    @NotNull
    public final List<y.c> getDefaultMultipartFields$intercom_sdk_base_release() {
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        Intrinsics.checkNotNullExpressionValue(map, "toMap(...)");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(map);
        injector.getApi().addSecureHash(mutableMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : mutableMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            y.c.a aVar = y.c.f334834c;
            Intrinsics.checkNotNull(key);
            arrayList.add(aVar.c(key, value.toString()));
        }
        return arrayList;
    }

    @NotNull
    public final e0 getDefaultRequestBody$intercom_sdk_base_release(@NotNull Map<String, ? extends Object> bodyParams) {
        Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        injector.getApi().addSecureHash(map);
        map.putAll(bodyParams);
        Intrinsics.checkNotNull(map);
        return optionsMapToRequestBody(map);
    }

    @i(name = "optionsMapToRequestBody")
    @NotNull
    public final e0 optionsMapToRequestBody(@NotNull Map<String, ? extends Object> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        e0.a aVar = e0.Companion;
        String strD = new com.google.gson.f().D(options);
        Intrinsics.checkNotNullExpressionValue(strD, "toJson(...)");
        return aVar.b(strD, x.f334808e.c("application/json; charset=utf-8"));
    }
}
