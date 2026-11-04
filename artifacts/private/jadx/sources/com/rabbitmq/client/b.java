package com.rabbitmq.client;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final org.slf4j.c f265035c = org.slf4j.e.k(b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f265036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f265037b;

    public b(String str, int i10) {
        this.f265036a = str;
        this.f265037b = i10;
    }

    public static boolean c(String str) {
        int iLastIndexOf = str.lastIndexOf(":");
        int iLastIndexOf2 = str.lastIndexOf("]");
        if (iLastIndexOf2 == -1) {
            return str.contains(":");
        }
        return iLastIndexOf2 < iLastIndexOf;
    }

    public static b d(String str) {
        return c(str) ? new b(f(str), g(str)) : new b(str);
    }

    public static b[] e(String str) {
        String[] strArrSplit = str.split(" *, *");
        b[] bVarArr = new b[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            bVarArr[i10] = d(strArrSplit[i10]);
        }
        return bVarArr;
    }

    public static String f(String str) {
        int iLastIndexOf = str.lastIndexOf(":");
        int iLastIndexOf2 = str.lastIndexOf("]");
        if (iLastIndexOf2 != -1) {
            if (iLastIndexOf2 < iLastIndexOf) {
                str = str.substring(0, iLastIndexOf);
            }
            return str;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length <= 2) {
            return strArrSplit[0];
        }
        String str2 = "Address " + str + " seems to contain an unquoted IPv6 address. Make sure you quote IPv6 addresses like so: [2001:db8:85a3:8d3:1319:8a2e:370:7348]";
        f265035c.j(str2);
        throw new IllegalArgumentException(str2);
    }

    public static int g(String str) {
        int iLastIndexOf = str.lastIndexOf(":");
        int iLastIndexOf2 = str.lastIndexOf("]");
        if (iLastIndexOf2 != -1) {
            if (iLastIndexOf2 < iLastIndexOf) {
                return Integer.parseInt(str.substring(iLastIndexOf + 1));
            }
            return -1;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length <= 2) {
            if (strArrSplit.length == 2) {
                return Integer.parseInt(strArrSplit[1]);
            }
            return -1;
        }
        String str2 = "Address " + str + " seems to contain an unquoted IPv6 address. Make sure you quote IPv6 addresses like so: [2001:db8:85a3:8d3:1319:8a2e:370:7348]";
        f265035c.j(str2);
        throw new IllegalArgumentException(str2);
    }

    public String a() {
        return this.f265036a;
    }

    public int b() {
        return this.f265037b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f265036a.equals(bVar.f265036a) && this.f265037b == bVar.f265037b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f265036a.hashCode() * 31) + this.f265037b;
    }

    public String toString() {
        if (this.f265037b == -1) {
            return this.f265036a;
        }
        return this.f265036a + ":" + this.f265037b;
    }

    public b(String str) {
        this.f265036a = str;
        this.f265037b = -1;
    }
}
