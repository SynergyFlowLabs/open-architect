package gm;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f280059c = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f280060a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f280061b;

    private c() {
    }

    public static c c(String str) {
        String strTrim;
        c cVar = new c();
        String[] strArrSplit = str.split(";");
        cVar.f280061b = strArrSplit[0].trim();
        for (int i10 = 1; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length > 1) {
                strTrim = strArrSplit2[1].trim();
                if ((strTrim.startsWith("\"") && strTrim.endsWith("\"")) || (strTrim.startsWith("'") && strTrim.endsWith("'") && strTrim.length() > 2)) {
                    strTrim = strTrim.substring(1, strTrim.length() - 1);
                }
            } else {
                strTrim = "";
            }
            cVar.f280060a.put(strArrSplit2[0].trim(), strTrim);
        }
        return cVar;
    }

    public String a() {
        return this.f280061b;
    }

    public Map<String, String> b() {
        return this.f280060a;
    }
}
