package io.ably.lib.types;

/* JADX INFO: loaded from: classes13.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f287931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f287932b;

    public b0(String str, String str2) {
        this.f287931a = str;
        this.f287932b = str2;
    }

    public static b0[] a(b0 b0Var) {
        return new b0[]{b0Var};
    }

    public static boolean b(b0[] b0VarArr, String str) {
        return c(b0VarArr, str) != null;
    }

    public static String c(b0[] b0VarArr, String str) {
        if (b0VarArr == null) {
            return null;
        }
        for (b0 b0Var : b0VarArr) {
            if (b0Var.f287931a.equals(str)) {
                return b0Var.f287932b;
            }
        }
        return null;
    }

    public static b0[] d(b0[] b0VarArr, b0 b0Var) {
        if (b0VarArr == null) {
            return new b0[]{b0Var};
        }
        int length = b0VarArr.length;
        b0[] b0VarArr2 = new b0[length + 1];
        System.arraycopy(b0VarArr, 0, b0VarArr2, 0, length);
        b0VarArr2[length] = b0Var;
        return b0VarArr2;
    }

    public static b0[] e(b0[] b0VarArr, String str, String str2) {
        return d(b0VarArr, new b0(str, str2));
    }

    public static b0[] f(b0[] b0VarArr, b0 b0Var) {
        if (b0VarArr == null) {
            return new b0[]{b0Var};
        }
        for (int i10 = 0; i10 < b0VarArr.length; i10++) {
            if (b0VarArr[i10].f287931a.equals(b0Var.f287931a)) {
                b0VarArr[i10] = b0Var;
                return b0VarArr;
            }
        }
        return d(b0VarArr, b0Var);
    }

    public static b0[] g(b0[] b0VarArr, String str, String str2) {
        return f(b0VarArr, new b0(str, str2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b0 b0Var = (b0) obj;
            String str = this.f287931a;
            if (str == null ? b0Var.f287931a != null : !str.equals(b0Var.f287931a)) {
                return false;
            }
            String str2 = this.f287932b;
            if (str2 != null) {
                return str2.equals(b0Var.f287932b);
            }
            if (b0Var.f287932b == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f287931a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f287932b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f287931a + ":" + this.f287932b;
    }

    public b0(String str, Object obj) {
        this(str, obj.toString());
    }
}
