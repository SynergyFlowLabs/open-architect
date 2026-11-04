package com.sdk.growthbook.utils;

import com.sdk.growthbook.serializable_model.SerializableGBFeature;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCrypto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crypto.kt\ncom/sdk/growthbook/utils/CryptoKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n465#2:110\n415#2:111\n1252#3,4:112\n*S KotlinDebug\n*F\n+ 1 Crypto.kt\ncom/sdk/growthbook/utils/CryptoKt\n*L\n61#1:110\n61#1:111\n61#1:112,4\n*E\n"})
public final class e {
    @NotNull
    public static final byte[] b(@NotNull String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        return kotlin.io.encoding.a.k(kotlin.io.encoding.a.f312530d, base64, 0, 0, 6, null);
    }

    @Nullable
    public static final Map<String, com.sdk.growthbook.model.h> c(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        try {
            Map map = (Map) JsonKt.Json$default(null, new Function1() { // from class: com.sdk.growthbook.utils.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.d((JsonBuilder) obj);
                }
            }, 1, null).decodeFromString(hk.a.l(hk.a.K(q1.f312784a), SerializableGBFeature.Companion.serializer()), string);
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), qf.k.a((SerializableGBFeature) ((Map.Entry) obj).getValue()));
            }
            return linkedHashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setPrettyPrint(true);
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.f312394a;
    }

    @Nullable
    public static final Map<String, com.sdk.growthbook.model.h> e(@NotNull String encryptedString, @NotNull String encryptionKey, @Nullable c cVar) {
        Intrinsics.checkNotNullParameter(encryptedString, "encryptedString");
        Intrinsics.checkNotNullParameter(encryptionKey, "encryptionKey");
        List listSplit$default = StringsKt.split$default(encryptedString, new String[]{"."}, false, 0, 6, null);
        byte[] bArrB = b((String) listSplit$default.get(0));
        byte[] bArrB2 = b(encryptionKey);
        byte[] bArrB3 = b((String) listSplit$default.get(1));
        if (cVar == null) {
            cVar = new f();
        }
        return c(StringsKt.F1(cVar.b(bArrB3, bArrB2, bArrB)));
    }

    public static /* synthetic */ Map f(String str, String str2, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        return e(str, str2, cVar);
    }

    @Nullable
    public static final JsonObject g(@NotNull String encryptedString, @NotNull String encryptionKey, @Nullable c cVar) {
        Intrinsics.checkNotNullParameter(encryptedString, "encryptedString");
        Intrinsics.checkNotNullParameter(encryptionKey, "encryptionKey");
        int i10 = 4 | 0;
        List listSplit$default = StringsKt.split$default(encryptedString, new String[]{"."}, false, 0, 6, null);
        byte[] bArrB = b((String) listSplit$default.get(0));
        byte[] bArrB2 = b(encryptionKey);
        byte[] bArrB3 = b((String) listSplit$default.get(1));
        if (cVar == null) {
            cVar = new f();
        }
        try {
            return (JsonObject) Json.Default.decodeFromString(JsonObject.Companion.serializer(), StringsKt.F1(cVar.b(bArrB3, bArrB2, bArrB)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ JsonObject h(String str, String str2, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        return g(str, str2, cVar);
    }
}
