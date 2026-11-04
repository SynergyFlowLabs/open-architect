package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.util.t;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48012b = "mailto:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f48013c = "mailto";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48014d = "to";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48015e = "body";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f48016f = "cc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48017g = "bcc";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f48018h = "subject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, String> f48019a = new HashMap<>();

    private c() {
    }

    public static boolean g(@p0 Uri uri) {
        return uri != null && f48013c.equals(uri.getScheme());
    }

    public static boolean h(@p0 String str) {
        return str != null && str.startsWith(f48012b);
    }

    @NonNull
    public static c i(@NonNull Uri uri) throws d {
        return j(uri.toString());
    }

    @NonNull
    public static c j(@NonNull String str) throws d {
        String strDecode;
        String strSubstring;
        t.l(str);
        if (!h(str)) {
            throw new d("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        int i10 = 3 & 1;
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        c cVar = new c();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    cVar.f48019a.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String strF = cVar.f();
        if (strF != null) {
            strDecode = strDecode + ", " + strF;
        }
        cVar.f48019a.put("to", strDecode);
        return cVar;
    }

    @p0
    public String a() {
        return this.f48019a.get(f48017g);
    }

    @p0
    public String b() {
        return this.f48019a.get("body");
    }

    @p0
    public String c() {
        return this.f48019a.get(f48016f);
    }

    @p0
    public Map<String, String> d() {
        return this.f48019a;
    }

    @p0
    public String e() {
        return this.f48019a.get(f48018h);
    }

    @p0
    public String f() {
        return this.f48019a.get("to");
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(f48012b);
        sb2.append('?');
        for (Map.Entry<String, String> entry : this.f48019a.entrySet()) {
            sb2.append(Uri.encode(entry.getKey()));
            sb2.append('=');
            sb2.append(Uri.encode(entry.getValue()));
            sb2.append(b0.f313279d);
        }
        return sb2.toString();
    }
}
