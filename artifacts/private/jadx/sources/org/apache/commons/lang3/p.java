package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes14.dex */
public enum p {
    JAVA_0_9(1.5f, "0.9"),
    JAVA_1_1(1.1f, com.rabbitmq.tools.jsonrpc.j.f266120g),
    JAVA_1_2(1.2f, "1.2"),
    JAVA_1_3(1.3f, "1.3"),
    JAVA_1_4(1.4f, "1.4"),
    JAVA_1_5(1.5f, "1.5"),
    JAVA_1_6(1.6f, "1.6"),
    JAVA_1_7(1.7f, "1.7"),
    JAVA_1_8(1.8f, "1.8"),
    JAVA_1_9(9.0f, "9"),
    JAVA_9(9.0f, "9"),
    JAVA_10(10.0f, "10"),
    JAVA_RECENT(k(), Float.toString(k()));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f337245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f337246b;

    p(float f10, String str) {
        this.f337245a = f10;
        this.f337246b = str;
    }

    static p c(String str) {
        if ("0.9".equals(str)) {
            return JAVA_0_9;
        }
        if (com.rabbitmq.tools.jsonrpc.j.f266120g.equals(str)) {
            return JAVA_1_1;
        }
        if ("1.2".equals(str)) {
            return JAVA_1_2;
        }
        if ("1.3".equals(str)) {
            return JAVA_1_3;
        }
        if ("1.4".equals(str)) {
            return JAVA_1_4;
        }
        if ("1.5".equals(str)) {
            return JAVA_1_5;
        }
        if ("1.6".equals(str)) {
            return JAVA_1_6;
        }
        if ("1.7".equals(str)) {
            return JAVA_1_7;
        }
        if ("1.8".equals(str)) {
            return JAVA_1_8;
        }
        if ("9".equals(str)) {
            return JAVA_9;
        }
        if ("10".equals(str)) {
            return JAVA_10;
        }
        if (str != null && ((double) l(str)) - 1.0d < 1.0d) {
            int iMax = Math.max(str.indexOf(46), str.indexOf(44));
            if (Float.parseFloat(str.substring(iMax + 1, Math.max(str.length(), str.indexOf(44, iMax)))) > 0.9f) {
                return JAVA_RECENT;
            }
        }
        return null;
    }

    static p d(String str) {
        return c(str);
    }

    private static float k() {
        float fL = l(System.getProperty("java.specification.version", "99.0"));
        if (fL > 0.0f) {
            return fL;
        }
        return 99.0f;
    }

    private static float l(String str) {
        if (!str.contains(".")) {
            return sk.c.V(str, -1.0f);
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            return -1.0f;
        }
        return sk.c.V(strArrSplit[0] + '.' + strArrSplit[1], -1.0f);
    }

    public boolean b(p pVar) {
        return this.f337245a >= pVar.f337245a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f337246b;
    }
}
