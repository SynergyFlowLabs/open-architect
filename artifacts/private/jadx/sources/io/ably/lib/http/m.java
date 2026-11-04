package io.ably.lib.http;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import io.ably.lib.types.b0;
import io.ably.lib.util.p;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, String> f287416a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f287417b = "0123456789ABCDEF";

    public static class a implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f287418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f287419b;

        public a(byte[] bArr, String str) {
            this.f287418a = bArr;
            this.f287419b = str;
        }

        @Override // io.ably.lib.http.i.c
        public String getContentType() {
            return this.f287419b;
        }

        @Override // io.ably.lib.http.i.c
        public byte[] getEncoded() {
            return this.f287418a;
        }
    }

    public static class b implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b0[] f287420a;

        public b(b0[] b0VarArr) {
            this.f287420a = b0VarArr;
        }

        @Override // io.ably.lib.http.i.c
        public String getContentType() {
            return "application/x-www-form-urlencoded";
        }

        @Override // io.ably.lib.http.i.c
        public byte[] getEncoded() {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < this.f287420a.length; i10++) {
                    if (i10 != 0) {
                        sb2.append(kotlin.text.b0.f313279d);
                    }
                    sb2.append(URLEncoder.encode(this.f287420a[i10].f287931a, "UTF-8"));
                    sb2.append('=');
                    sb2.append(URLEncoder.encode(this.f287420a[i10].f287932b, "UTF-8"));
                }
                return sb2.toString().getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return new byte[0];
            }
        }
    }

    public static class c implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f287421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f287422b;

        public c(String str) {
            this.f287421a = str;
        }

        @Override // io.ably.lib.http.i.c
        public String getContentType() {
            return "application/json";
        }

        @Override // io.ably.lib.http.i.c
        public byte[] getEncoded() {
            byte[] bArr = this.f287422b;
            if (bArr != null) {
                return bArr;
            }
            byte[] bytes = this.f287421a.getBytes(Charset.forName("UTF-8"));
            this.f287422b = bytes;
            return bytes;
        }

        public c(Object obj) {
            this(p.f288250c.D(obj));
        }
    }

    static {
        HashMap map = new HashMap();
        f287416a = map;
        map.put(PeopleCardEntry.json, "application/json");
        f287416a.put("xml", "application/xml");
        f287416a.put("html", "text/html");
        f287416a.put("msgpack", "application/x-msgpack");
    }

    static URL a(String str, String str2, int i10, String str3, b0[] b0VarArr) {
        try {
            return new URL(str + str2 + AbstractJsonLexerKt.COLON + i10 + e(str3, b0VarArr));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    static URL b(String str, b0[] b0VarArr) {
        try {
            return new URL(e(str, b0VarArr));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public static Map<String, b0> c(String str) {
        HashMap map = new HashMap();
        try {
            for (String str2 : str.split("&")) {
                int iIndexOf = str2.indexOf(61);
                String strDecode = URLDecoder.decode(str2.substring(0, iIndexOf), "UTF-8");
                map.put(strDecode, new b0(strDecode, URLDecoder.decode(str2.substring(iIndexOf + 1), "UTF-8")));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return map;
    }

    public static b0[] d(boolean z10) {
        return z10 ? new b0[]{new b0("Accept", "application/x-msgpack,application/json")} : new b0[]{new b0("Accept", "application/json")};
    }

    public static String e(String str, b0[] b0VarArr) {
        StringBuilder sb2 = new StringBuilder(str);
        if (b0VarArr != null && b0VarArr.length > 0) {
            int length = b0VarArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                b0 b0Var = b0VarArr[i10];
                sb2.append(z10 ? '?' : kotlin.text.b0.f313279d);
                sb2.append(b0Var.f287931a);
                sb2.append('=');
                sb2.append(f(b0Var.f287932b));
                i10++;
                z10 = false;
            }
        }
        return sb2.toString();
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        StringBuilder sb2 = new StringBuilder(bytes.length);
        for (byte b10 : bytes) {
            if (b10 < 97 ? b10 < 65 ? b10 < 48 ? b10 == 45 || b10 == 46 : b10 <= 57 : b10 <= 90 || b10 == 95 : b10 <= 122 || b10 == 126) {
                sb2.append((char) b10);
            } else {
                sb2.append('%');
                sb2.append(f287417b.charAt((b10 >> 4) & 15));
                sb2.append(f287417b.charAt(b10 & com.google.common.base.c.f116464q));
            }
        }
        return sb2.toString();
    }

    public static b0[] g(Map<String, b0> map) {
        if (map != null) {
            return (b0[]) map.values().toArray(new b0[map.size()]);
        }
        return null;
    }

    public static String h(b0[] b0VarArr, String str) {
        if (b0VarArr == null) {
            return null;
        }
        for (b0 b0Var : b0VarArr) {
            if (str.equals(b0Var.f287931a)) {
                return b0Var.f287932b;
            }
        }
        return null;
    }

    public static Map<String, b0> i(b0[] b0VarArr) {
        HashMap map = new HashMap();
        for (b0 b0Var : b0VarArr) {
            map.put(b0Var.f287931a, b0Var);
        }
        return map;
    }

    public static b0[] j(b0[] b0VarArr, b0[] b0VarArr2) {
        HashMap map = new HashMap();
        if (b0VarArr != null) {
            for (b0 b0Var : b0VarArr) {
                map.put(b0Var.f287931a, b0Var);
            }
        }
        if (b0VarArr2 != null) {
            for (b0 b0Var2 : b0VarArr2) {
                map.put(b0Var2.f287931a, b0Var2);
            }
        }
        return (b0[]) map.values().toArray(new b0[map.size()]);
    }

    public static Map<String, b0> k(Map<String, b0> map, Map<String, b0> map2) {
        for (b0 b0Var : map2.values()) {
            map.put(b0Var.f287931a, b0Var);
        }
        return map;
    }

    public static URL l(String str) throws io.ably.lib.types.a {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }

    public static i.c m(com.google.gson.l lVar, boolean z10) {
        return !z10 ? new c(lVar) : new a(p.f(lVar), "application/x-msgpack");
    }

    public static b0[] n(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(new b0(entry.getKey(), it.next()));
            }
        }
        return (b0[]) arrayList.toArray(new b0[arrayList.size()]);
    }

    public static String o(String str) throws io.ably.lib.types.a {
        try {
            URI uri = new URI(str);
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }
}
