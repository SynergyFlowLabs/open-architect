package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes9.dex */
public class k implements nk.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f335453b = "01360240043788015936020505";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f335454c = f335453b.toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f335455d = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f335456a;

    public k() {
        this.f335456a = f335454c;
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return d((String) obj);
        }
        throw new nk.h("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    public int b(String str, String str2) throws nk.h {
        return m.b(this, str, str2);
    }

    char c(char c10) {
        if (Character.isLetter(c10)) {
            return this.f335456a[Character.toUpperCase(c10) - 'A'];
        }
        return (char) 0;
    }

    public String d(String str) {
        if (str == null) {
            return null;
        }
        String strA = m.a(str);
        if (strA.length() == 0) {
            return strA;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strA.charAt(0));
        char c10 = '*';
        for (int i10 = 0; i10 < strA.length(); i10++) {
            char c11 = c(strA.charAt(i10));
            if (c11 != c10) {
                if (c11 != 0) {
                    sb2.append(c11);
                }
                c10 = c11;
            }
        }
        return sb2.toString();
    }

    @Override // nk.j
    public String f(String str) {
        return d(str);
    }

    public k(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        this.f335456a = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public k(String str) {
        this.f335456a = str.toCharArray();
    }
}
