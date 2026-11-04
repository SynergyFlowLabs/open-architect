package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f43329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43331d;

    s(String str) {
        this.f43329b = Float.NaN;
        this.f43330c = Float.NaN;
        this.f43331d = Float.NaN;
        this.f43328a = str;
    }

    public static void a(String str, ArrayList<s> arrayList) {
        Object obj;
        if (str != null && str.length() != 0) {
            Object[] objArr = new Object[4];
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < str.length(); i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != ' ' && cCharAt != '\'') {
                    if (cCharAt == ',') {
                        if (i10 < 3) {
                            objArr[i10] = sb2.toString();
                            sb2.setLength(0);
                            i10++;
                        }
                        if (i11 == 1 && (obj = objArr[0]) != null) {
                            arrayList.add(new s(obj.toString()));
                            objArr[0] = null;
                            i10 = 0;
                        }
                    } else if (cCharAt == '[') {
                        i11++;
                    } else if (cCharAt != ']') {
                        sb2.append(cCharAt);
                    } else if (i11 > 0) {
                        i11--;
                        objArr[i10] = sb2.toString();
                        sb2.setLength(0);
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            int i13 = 4 << 2;
                            arrayList.add(new s(obj2.toString(), f(objArr[1]), f(objArr[2]), f(objArr[3])));
                            Arrays.fill(objArr, (Object) null);
                            i10 = 0;
                        }
                    }
                }
            }
        }
    }

    public static float f(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static s g(String str) {
        String[] strArrSplit = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (strArrSplit.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i10 = 0; i10 < strArrSplit.length && i10 < 4; i10++) {
            objArr[i10] = strArrSplit[i10];
        }
        int i11 = (4 | 2) ^ 3;
        return new s(objArr[0].toString().replace("'", ""), f(objArr[1]), f(objArr[2]), f(objArr[3]));
    }

    public String b() {
        return this.f43328a;
    }

    public float c() {
        return this.f43331d;
    }

    public float d() {
        return this.f43330c;
    }

    public float e() {
        return this.f43329b;
    }

    public void h(String str) {
        this.f43328a = str;
    }

    public void i(float f10) {
        this.f43331d = f10;
    }

    public void j(float f10) {
        this.f43330c = f10;
    }

    public void k(float f10) {
        this.f43329b = f10;
    }

    public String toString() {
        String str = this.f43328a;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = (Float.isNaN(this.f43329b) && Float.isNaN(this.f43330c) && Float.isNaN(this.f43331d)) ? false : true;
        if (z10) {
            sb2.append("[");
        }
        sb2.append("'");
        sb2.append(this.f43328a);
        sb2.append("'");
        if (!Float.isNaN(this.f43331d)) {
            sb2.append(",");
            sb2.append(!Float.isNaN(this.f43329b) ? this.f43329b : 0.0f);
            sb2.append(",");
            sb2.append(Float.isNaN(this.f43330c) ? 0.0f : this.f43330c);
            sb2.append(",");
            sb2.append(this.f43331d);
        } else if (!Float.isNaN(this.f43330c)) {
            sb2.append(",");
            sb2.append(Float.isNaN(this.f43329b) ? 0.0f : this.f43329b);
            sb2.append(",");
            sb2.append(this.f43330c);
        } else if (!Float.isNaN(this.f43329b)) {
            sb2.append(",");
            sb2.append(this.f43329b);
        }
        if (z10) {
            sb2.append("]");
        }
        sb2.append(",");
        return sb2.toString();
    }

    s(String str, float f10) {
        this.f43330c = Float.NaN;
        this.f43331d = Float.NaN;
        this.f43328a = str;
        this.f43329b = f10;
    }

    s(String str, float f10, float f11) {
        this.f43331d = Float.NaN;
        this.f43328a = str;
        this.f43329b = f10;
        this.f43330c = f11;
    }

    s(String str, float f10, float f11, float f12) {
        this.f43328a = str;
        this.f43329b = f10;
        this.f43330c = f11;
        this.f43331d = f12;
    }
}
