package com.google.api.client.http;

import com.google.api.client.util.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map<Character, a> f115613a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f115614b = ",";

    private enum a {
        PLUS('+', "", h0.f115614b, false, true),
        HASH('#', "#", h0.f115614b, false, true),
        DOT('.', ".", ".", false, false),
        FORWARD_SLASH('/', "/", "/", false, false),
        SEMI_COLON(';', ";", ";", true, false),
        QUERY('?', com.planner5d.library.model.payments.a.f222474i, "&", true, false),
        AMP(Character.valueOf(kotlin.text.b0.f313279d), "&", "&", true, false),
        SIMPLE(null, "", h0.f115614b, false, false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Character f115624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f115625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f115626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f115627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f115628e;

        a(Character ch2, String str, String str2, boolean z10, boolean z11) {
            this.f115624a = ch2;
            this.f115625b = (String) com.google.api.client.util.h0.d(str);
            this.f115626c = (String) com.google.api.client.util.h0.d(str2);
            this.f115627d = z10;
            this.f115628e = z11;
            if (ch2 != null) {
                h0.f115613a.put(ch2, this);
            }
        }

        String b(String str) {
            return this.f115628e ? com.google.api.client.util.escape.a.c(str) : com.google.api.client.util.escape.a.b(str);
        }

        String k() {
            return this.f115626c;
        }

        String l() {
            return this.f115625b;
        }

        boolean n() {
            return this.f115628e;
        }

        int o() {
            return this.f115624a == null ? 0 : 1;
        }

        boolean p() {
            return this.f115627d;
        }
    }

    static {
        a.values();
    }

    public static String a(String str, Object obj, boolean z10) {
        Object objD;
        Map<String, Object> mapE = e(obj);
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str.indexOf(123, i10);
            if (iIndexOf == -1) {
                if (i10 == 0 && !z10) {
                    return str;
                }
                sb2.append(str.substring(i10));
                break;
            }
            sb2.append(str.substring(i10, iIndexOf));
            int iIndexOf2 = str.indexOf(125, iIndexOf + 2);
            int i11 = iIndexOf2 + 1;
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            a aVarC = c(strSubstring);
            ListIterator<String> listIterator = com.google.api.client.repackaged.com.google.common.base.u.h(AbstractJsonLexerKt.COMMA).o(strSubstring).listIterator();
            boolean z11 = true;
            while (listIterator.hasNext()) {
                String next = listIterator.next();
                boolean zEndsWith = next.endsWith("*");
                int iO = listIterator.nextIndex() == 1 ? aVarC.o() : 0;
                int length2 = next.length();
                if (zEndsWith) {
                    length2--;
                }
                String strSubstring2 = next.substring(iO, length2);
                Object objRemove = mapE.remove(strSubstring2);
                if (objRemove != null) {
                    if (z11) {
                        sb2.append(aVarC.l());
                        z11 = false;
                    } else {
                        sb2.append(aVarC.k());
                    }
                    if (objRemove instanceof Iterator) {
                        objD = d(strSubstring2, (Iterator) objRemove, zEndsWith, aVarC);
                    } else if ((objRemove instanceof Iterable) || objRemove.getClass().isArray()) {
                        objD = d(strSubstring2, q0.l(objRemove).iterator(), zEndsWith, aVarC);
                    } else if (objRemove.getClass().isEnum()) {
                        if (com.google.api.client.util.r.k((Enum) objRemove).f() != null) {
                            if (aVarC.p()) {
                                objRemove = String.format("%s=%s", strSubstring2, objRemove);
                            }
                            objRemove = com.google.api.client.util.escape.a.c(objRemove.toString());
                        }
                        objD = objRemove;
                    } else if (com.google.api.client.util.n.e(objRemove)) {
                        if (aVarC.p()) {
                            objRemove = String.format("%s=%s", strSubstring2, objRemove);
                        }
                        objD = aVarC.n() ? com.google.api.client.util.escape.a.d(objRemove.toString()) : com.google.api.client.util.escape.a.c(objRemove.toString());
                    } else {
                        objD = f(strSubstring2, e(objRemove), zEndsWith, aVarC);
                    }
                    sb2.append(objD);
                }
            }
            i10 = i11;
        }
        if (z10) {
            j.g(mapE.entrySet(), sb2);
        }
        return sb2.toString();
    }

    public static String b(String str, String str2, Object obj, boolean z10) {
        if (str2.startsWith("/")) {
            j jVar = new j(str);
            jVar.G(null);
            str2 = jVar.k() + str2;
        } else if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            str2 = str + str2;
        }
        return a(str2, obj, z10);
    }

    static a c(String str) {
        a aVar = f115613a.get(Character.valueOf(str.charAt(0)));
        return aVar == null ? a.SIMPLE : aVar;
    }

    private static String d(String str, Iterator<?> it, boolean z10, a aVar) {
        String strK;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            strK = aVar.k();
        } else {
            if (aVar.p()) {
                sb2.append(com.google.api.client.util.escape.a.c(str));
                sb2.append("=");
            }
            strK = f115614b;
        }
        while (it.hasNext()) {
            if (z10 && aVar.p()) {
                sb2.append(com.google.api.client.util.escape.a.c(str));
                sb2.append("=");
            }
            sb2.append(aVar.b(it.next().toString()));
            if (it.hasNext()) {
                sb2.append(strK);
            }
        }
        return sb2.toString();
    }

    private static Map<String, Object> e(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : com.google.api.client.util.n.f(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !com.google.api.client.util.n.c(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    private static String f(String str, Map<String, Object> map, boolean z10, a aVar) {
        String strK;
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = "=";
        if (z10) {
            strK = aVar.k();
        } else {
            if (aVar.p()) {
                sb2.append(com.google.api.client.util.escape.a.c(str));
                sb2.append("=");
            }
            str2 = f115614b;
            strK = f115614b;
        }
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            String strB = aVar.b(next.getKey());
            String strB2 = aVar.b(next.getValue().toString());
            sb2.append(strB);
            sb2.append(str2);
            sb2.append(strB2);
            if (it.hasNext()) {
                sb2.append(strK);
            }
        }
        return sb2.toString();
    }
}
