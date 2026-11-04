package androidx.constraintlayout.core.dsl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Map<c.f, String> f43163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Map<b, String> f43164f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f43165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected a f43166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f43167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Map<String, String> f43168d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f43169a;

        public a(String str) {
            this.f43169a = str;
        }

        public String toString() {
            return this.f43169a;
        }
    }

    public enum b {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    static {
        HashMap map = new HashMap();
        f43163e = map;
        map.put(c.f.LEFT, "'left'");
        map.put(c.f.RIGHT, "'right'");
        map.put(c.f.TOP, "'top'");
        map.put(c.f.BOTTOM, "'bottom'");
        map.put(c.f.START, "'start'");
        map.put(c.f.END, "'end'");
        map.put(c.f.BASELINE, "'baseline'");
        HashMap map2 = new HashMap();
        f43164f = map2;
        map2.put(b.VERTICAL_GUIDELINE, "vGuideline");
        map2.put(b.HORIZONTAL_GUIDELINE, "hGuideline");
        map2.put(b.VERTICAL_CHAIN, "vChain");
        map2.put(b.HORIZONTAL_CHAIN, "hChain");
        map2.put(b.BARRIER, "barrier");
    }

    public h(String str, a aVar) {
        this.f43166b = null;
        this.f43168d = new HashMap();
        this.f43165a = str;
        this.f43166b = aVar;
    }

    public static void f(String[] strArr) {
        System.out.println(new androidx.constraintlayout.core.dsl.a("abc", "['a1', 'b2']").toString());
    }

    public void a(Map<String, String> map, StringBuilder sb2) {
        if (map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":");
            sb2.append(map.get(str));
            sb2.append(",\n");
        }
    }

    public Map<String, String> b() {
        String str = this.f43167c;
        if (str != null && str.length() != 0) {
            HashMap map = new HashMap();
            StringBuilder sb2 = new StringBuilder();
            String string = "";
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f43167c.length(); i12++) {
                char cCharAt = this.f43167c.charAt(i12);
                if (cCharAt == ':') {
                    string = sb2.toString();
                    sb2.setLength(0);
                } else if (cCharAt == ',' && i10 == 0 && i11 == 0) {
                    map.put(string, sb2.toString());
                    sb2.setLength(0);
                    string = "";
                } else if (cCharAt != ' ') {
                    if (cCharAt == '[') {
                        i10++;
                    } else if (cCharAt == ']') {
                        i10--;
                    } else if (cCharAt == '{') {
                        i11++;
                    } else if (cCharAt == '}') {
                        i11--;
                    }
                    sb2.append(cCharAt);
                }
            }
            map.put(string, sb2.toString());
            return map;
        }
        return null;
    }

    public String c() {
        return this.f43167c;
    }

    public String d() {
        return this.f43165a;
    }

    public a e() {
        return this.f43166b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f43165a + ":{\n");
        if (this.f43166b != null) {
            sb2.append("type:'");
            sb2.append(this.f43166b.toString());
            sb2.append("',\n");
        }
        Map<String, String> map = this.f43168d;
        if (map != null) {
            a(map, sb2);
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public h(String str, a aVar, String str2) {
        this.f43166b = null;
        this.f43168d = new HashMap();
        this.f43165a = str;
        this.f43166b = aVar;
        this.f43167c = str2;
        this.f43168d = b();
    }
}
