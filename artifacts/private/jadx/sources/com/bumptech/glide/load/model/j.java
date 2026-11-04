package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<i>> f96843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f96844d;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f96845d = "User-Agent";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f96846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Map<String, List<i>> f96847f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f96848a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, List<i>> f96849b = f96847f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f96850c = true;

        static {
            String strG = g();
            f96846e = strG;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strG)) {
                map.put("User-Agent", Collections.singletonList(new b(strG)));
            }
            f96847f = Collections.unmodifiableMap(map);
        }

        private Map<String, List<i>> d() {
            HashMap map = new HashMap(this.f96849b.size());
            for (Map.Entry<String, List<i>> entry : this.f96849b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        private void e() {
            if (this.f96848a) {
                this.f96848a = false;
                this.f96849b = d();
            }
        }

        private List<i> f(String str) {
            List<i> list = this.f96849b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f96849b.put(str, arrayList);
            return arrayList;
        }

        @l1
        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(@NonNull String str, @NonNull i iVar) {
            if (this.f96850c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, iVar);
            }
            e();
            f(str).add(iVar);
            return this;
        }

        public a b(@NonNull String str, @NonNull String str2) {
            return a(str, new b(str2));
        }

        public j c() {
            this.f96848a = true;
            return new j(this.f96849b);
        }

        public a h(@NonNull String str, @p0 i iVar) {
            e();
            if (iVar == null) {
                this.f96849b.remove(str);
            } else {
                List<i> listF = f(str);
                listF.clear();
                listF.add(iVar);
            }
            if (this.f96850c && "User-Agent".equalsIgnoreCase(str)) {
                int i10 = 4 ^ 0;
                this.f96850c = false;
            }
            return this;
        }

        public a i(@NonNull String str, @p0 String str2) {
            return h(str, str2 == null ? null : new b(str2));
        }
    }

    static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f96851a;

        b(@NonNull String str) {
            this.f96851a = str;
        }

        @Override // com.bumptech.glide.load.model.i
        public String a() {
            return this.f96851a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f96851a.equals(((b) obj).f96851a);
            }
            return false;
        }

        public int hashCode() {
            return this.f96851a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f96851a + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    j(Map<String, List<i>> map) {
        this.f96843c = Collections.unmodifiableMap(map);
    }

    @NonNull
    private String a(@NonNull List<i> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        int i10 = 7 ^ 0;
        for (int i11 = 0; i11 < size; i11++) {
            String strA = list.get(i11).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i11 != list.size() - 1) {
                    sb2.append(AbstractJsonLexerKt.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Map<String, String> b() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f96843c.entrySet()) {
            String strA = a(entry.getValue());
            if (!TextUtils.isEmpty(strA)) {
                map.put(entry.getKey(), strA);
            }
        }
        return map;
    }

    @Override // com.bumptech.glide.load.model.h
    public Map<String, String> O() {
        if (this.f96844d == null) {
            synchronized (this) {
                try {
                    if (this.f96844d == null) {
                        this.f96844d = Collections.unmodifiableMap(b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f96844d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f96843c.equals(((j) obj).f96843c);
        }
        return false;
    }

    public int hashCode() {
        return this.f96843c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f96843c + AbstractJsonLexerKt.END_OBJ;
    }
}
