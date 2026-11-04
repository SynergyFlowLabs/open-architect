package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f106974a = Pattern.compile("\\\\.");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f106975b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private r() {
    }

    @g6.a
    public static boolean a(@p0 Object obj, @p0 Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObject2.has(next)) {
                    try {
                        com.google.android.gms.common.internal.w.r(next);
                        if (!a(jSONObject.get(next), jSONObject2.get(next))) {
                        }
                    } catch (JSONException unused) {
                    }
                }
                return false;
            }
            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                if (!a(jSONArray.get(i10), jSONArray2.get(i10))) {
                    return false;
                }
            } catch (JSONException unused2) {
            }
        }
        return true;
    }

    @p0
    @g6.a
    public static String b(@p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f106975b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char cCharAt = matcher.group().charAt(0);
            if (cCharAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (cCharAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (cCharAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (cCharAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @NonNull
    @g6.a
    public static String c(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            String strA = j0.a(str);
            Matcher matcher = f106974a.matcher(strA);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char cCharAt = matcher.group().charAt(1);
                if (cCharAt == '\"') {
                    matcher.appendReplacement(stringBuffer, "\"");
                } else if (cCharAt == '/') {
                    matcher.appendReplacement(stringBuffer, "/");
                } else if (cCharAt == '\\') {
                    matcher.appendReplacement(stringBuffer, "\\\\");
                } else if (cCharAt == 'b') {
                    matcher.appendReplacement(stringBuffer, "\b");
                } else if (cCharAt == 'f') {
                    matcher.appendReplacement(stringBuffer, "\f");
                } else if (cCharAt == 'n') {
                    matcher.appendReplacement(stringBuffer, "\n");
                } else if (cCharAt == 'r') {
                    matcher.appendReplacement(stringBuffer, org.apache.commons.lang3.z.f337565d);
                } else {
                    if (cCharAt != 't') {
                        throw new IllegalStateException("Found an escaped character that should never be.");
                    }
                    matcher.appendReplacement(stringBuffer, "\t");
                }
            }
            if (stringBuffer == null) {
                return strA;
            }
            matcher.appendTail(stringBuffer);
            str = stringBuffer.toString();
        }
        return str;
    }
}
