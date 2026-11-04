package oh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJsonExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonExtensions.kt\nio/customer/tracking/migration/extensions/JsonExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1617#2,9:44\n1869#2:53\n1870#2:55\n1626#2:56\n1#3:54\n1#3:57\n*S KotlinDebug\n*F\n+ 1 JsonExtensions.kt\nio/customer/tracking/migration/extensions/JsonExtensionsKt\n*L\n7#1:44,9\n7#1:53\n7#1:55\n7#1:56\n7#1:54\n*E\n"})
public final class a {
    @Nullable
    public static final JSONObject a(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return jSONObject.optJSONObject(key);
    }

    @Nullable
    public static final Long b(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return Long.valueOf(jSONObject.optLong(key));
    }

    public static final /* synthetic */ <T> T c(JSONObject jSONObject, String key) {
        T t10;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.isNull(key)) {
            t10 = null;
        } else {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            d dVarD = j1.d(Object.class);
            if (Intrinsics.areEqual(dVarD, j1.d(String.class))) {
                t10 = (T) jSONObject.optString(key);
                Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
            } else if (Intrinsics.areEqual(dVarD, j1.d(Long.TYPE))) {
                t10 = (T) Long.valueOf(jSONObject.optLong(key));
                Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
            } else if (Intrinsics.areEqual(dVarD, j1.d(JSONObject.class))) {
                t10 = (T) jSONObject.optJSONObject(key);
                Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
            } else {
                Object objOpt = jSONObject.opt(key);
                Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
                if (objOpt == null) {
                    Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                    throw new IllegalArgumentException("Type: " + j1.d(Object.class) + " is not supported by migration JSON parser for key: " + key + " in " + jSONObject + ". Could not parse task.");
                }
                t10 = (T) objOpt;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(("Required key '" + key + "' is missing or null in " + jSONObject + ". Could not parse task.").toString());
    }

    @Nullable
    public static final String d(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return jSONObject.optString(key);
    }

    @NotNull
    public static final List<JSONObject> e(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange intRangeW1 = r.W1(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(((IntIterator) it).nextInt());
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(jSONObjectOptJSONObject);
            }
        }
        return arrayList;
    }
}
