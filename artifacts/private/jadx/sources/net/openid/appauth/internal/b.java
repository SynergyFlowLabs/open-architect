package net.openid.appauth.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.browser.customtabs.f;
import androidx.core.util.p;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.openid.appauth.t;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private b() {
        throw new IllegalStateException("This type is not intended to be instantiated");
    }

    public static void a(@NonNull Uri.Builder builder, @NonNull String str, @p0 Object obj) {
        if (obj == null || obj.toString() == null) {
            return;
        }
        builder.appendQueryParameter(str, obj.toString());
    }

    public static List<p<String, String>> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = str.split("&");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("=");
            try {
                arrayList.add(p.a(strArrSplit2[0], URLDecoder.decode(strArrSplit2[1], "utf-8")));
            } catch (UnsupportedEncodingException e10) {
                a.c("Unable to decode parameter, ignoring", e10);
            }
        }
        return arrayList;
    }

    public static Map<String, String> c(String str) {
        List<p<String, String>> listB = b(str);
        HashMap map = new HashMap();
        for (p<String, String> pVar : listB) {
            map.put(pVar.f48411a, pVar.f48412b);
        }
        return map;
    }

    @NonNull
    public static String d(@p0 Map<String, String> map) {
        if (map == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + e(entry.getValue()));
        }
        return TextUtils.join("&", arrayList);
    }

    @NonNull
    public static String e(@NonNull String str) {
        t.f(str);
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException("Unable to encode using UTF-8");
        }
    }

    public static Long f(@NonNull Uri uri, @NonNull String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return Long.valueOf(Long.parseLong(queryParameter));
        }
        return null;
    }

    public static Uri g(@p0 String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static List<Bundle> h(Uri[] uriArr, int i10) {
        t.b(i10 >= 0, "startIndex must be positive");
        if (uriArr == null || uriArr.length <= i10) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(uriArr.length - i10);
        while (i10 < uriArr.length) {
            if (uriArr[i10] == null) {
                a.l("Null URI in possibleUris list - ignoring", new Object[0]);
            } else {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f.f11916i, uriArr[i10]);
                arrayList.add(bundle);
            }
            i10++;
        }
        return arrayList;
    }
}
