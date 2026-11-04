package com.planner5d.library.feed.data;

import android.os.Bundle;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.k1;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nDesignOfTheDayGalleryRecordJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesignOfTheDayGalleryRecordJsonParser.kt\ncom/planner5d/library/feed/data/DesignOfTheDayGalleryRecordJsonParser\n+ 2 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n*L\n1#1,66:1\n215#2:67\n215#2:68\n215#2:69\n215#2:70\n215#2:71\n215#2:72\n*S KotlinDebug\n*F\n+ 1 DesignOfTheDayGalleryRecordJsonParser.kt\ncom/planner5d/library/feed/data/DesignOfTheDayGalleryRecordJsonParser\n*L\n56#1:67\n57#1:68\n58#1:69\n59#1:70\n60#1:71\n61#1:72\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f175279a = new f();

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(Bundle bundle, String str, JSONArray jSONArray, List<String> list) throws JSONException {
        if (jSONArray.length() != 0) {
            if (list.contains(str)) {
                bundle.putLongArray(str, k1.G(jSONArray));
                return;
            }
            int i10 = 0;
            Object obj = jSONArray.get(0);
            if (obj instanceof String) {
                int length = jSONArray.length();
                String[] strArr = new String[length];
                while (i10 < length) {
                    strArr[i10] = jSONArray.get(i10);
                    i10++;
                }
                bundle.putStringArray(str, strArr);
                return;
            }
            if (obj instanceof Integer) {
                int length2 = jSONArray.length();
                Integer[] numArr = new Integer[length2];
                while (i10 < length2) {
                    numArr[i10] = jSONArray.get(i10);
                    i10++;
                }
                bundle.putIntArray(str, ArraysKt.toIntArray(numArr));
                return;
            }
            if (obj instanceof Long) {
                int length3 = jSONArray.length();
                Long[] lArr = new Long[length3];
                while (i10 < length3) {
                    lArr[i10] = jSONArray.get(i10);
                    i10++;
                }
                bundle.putLongArray(str, ArraysKt.toLongArray(lArr));
                return;
            }
            if (obj instanceof Boolean) {
                int length4 = jSONArray.length();
                Boolean[] boolArr = new Boolean[length4];
                while (i10 < length4) {
                    boolArr[i10] = jSONArray.get(i10);
                    i10++;
                }
                bundle.putBooleanArray(str, ArraysKt.toBooleanArray(boolArr));
                return;
            }
            if (obj instanceof Float) {
                int length5 = jSONArray.length();
                Float[] fArr = new Float[length5];
                while (i10 < length5) {
                    fArr[i10] = jSONArray.get(i10);
                    i10++;
                }
                bundle.putFloatArray(str, ArraysKt.toFloatArray(fArr));
                return;
            }
            if (obj instanceof Double) {
                int length6 = jSONArray.length();
                Double[] dArr = new Double[length6];
                while (i10 < length6) {
                    dArr[i10] = jSONArray.get(i10);
                    i10++;
                }
                bundle.putDoubleArray(str, ArraysKt.toDoubleArray(dArr));
            }
        }
    }

    private final void c(Bundle bundle, String str, int i10, List<String> list) throws JSONException {
        if (list.contains(str)) {
            bundle.putLong(str, i10);
        } else {
            bundle.putInt(str, i10);
        }
    }

    @NotNull
    public final Bundle a(@NotNull JSONObject json, @NotNull u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Bundle bundle = new Bundle();
        try {
            Iterator<String> itKeys = json.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = json.get(next);
                if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof Integer) {
                    Intrinsics.checkNotNull(next);
                    c(bundle, next, ((Number) obj).intValue(), CollectionsKt.listOf((Object[]) new String[]{"projectId", "totalViews", "totalLikes", "totalComments"}));
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj, logRecordManager));
                } else if (obj instanceof JSONArray) {
                    Intrinsics.checkNotNull(next);
                    b(bundle, next, (JSONArray) obj, CollectionsKt.listOf("tags"));
                } else if (obj instanceof Float) {
                    bundle.putFloat(next, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Number) obj).doubleValue());
                } else {
                    bundle.putString(next, obj.getClass().getSimpleName());
                }
            }
            return bundle;
        } catch (JSONException e10) {
            logRecordManager.b("design_of_the_day_json_parse", null, e10);
            return bundle;
        }
    }
}
