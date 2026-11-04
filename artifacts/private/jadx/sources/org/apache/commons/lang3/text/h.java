package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f337314h = '$';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f337315i = g.m("${");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f337316j = g.m("}");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f337317k = g.m(":-");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char f337318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f337319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f337320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f337321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f<?> f337322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f337323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f337324g;

    public h() {
        this((f<?>) null, f337315i, f337316j, '$');
    }

    public static String C(Object obj) {
        return new h(f.d()).k(obj);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    private int R(e eVar, int i10, int i11, List<String> list) {
        g gVar;
        boolean z10;
        int i12;
        String strSubstring;
        String strD;
        int iG;
        g gVarD = d();
        g gVarF = f();
        char cB = b();
        g gVarC = c();
        boolean zG = g();
        boolean z11 = list == null;
        int i13 = i10;
        int i14 = i10 + i11;
        int i15 = 0;
        int i16 = 0;
        char[] cArr = eVar.f337290a;
        List<String> arrayList = list;
        while (i13 < i14) {
            int iG2 = gVarD.g(cArr, i13, i10, i14);
            if (iG2 != 0) {
                if (i13 > i10) {
                    i12 = 1;
                    int i17 = i13 - 1;
                    if (cArr[i17] == cB) {
                        if (this.f337324g) {
                            i13++;
                        } else {
                            eVar.u0(i17);
                            i15--;
                            i14--;
                            gVar = gVarD;
                            z10 = zG;
                            cArr = eVar.f337290a;
                            i16 = 1;
                        }
                    }
                } else {
                    i12 = 1;
                }
                int i18 = i13 + iG2;
                int i19 = i18;
                int i20 = 0;
                while (true) {
                    if (i19 >= i14) {
                        gVar = gVarD;
                        z10 = zG;
                        i13 = i19;
                        break;
                    }
                    if (!zG || (iG = gVarD.g(cArr, i19, i10, i14)) == 0) {
                        int iG3 = gVarF.g(cArr, i19, i10, i14);
                        if (iG3 == 0) {
                            i19++;
                        } else {
                            if (i20 == 0) {
                                String str = new String(cArr, i18, (i19 - i13) - iG2);
                                if (zG) {
                                    e eVar2 = new e(str);
                                    S(eVar2, 0, eVar2.length());
                                    str = eVar2.toString();
                                }
                                int i21 = i19 + iG3;
                                if (gVarC != null) {
                                    char[] charArray = str.toCharArray();
                                    z10 = zG;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= charArray.length || !(z10 || gVarD.g(charArray, i22, i22, charArray.length) == 0)) {
                                            gVar = gVarD;
                                        } else {
                                            int iF = gVarC.f(charArray, i22);
                                            if (iF != 0) {
                                                gVar = gVarD;
                                                String strSubstring2 = str.substring(0, i22);
                                                strSubstring = str.substring(i22 + iF);
                                                str = strSubstring2;
                                            } else {
                                                i22++;
                                                gVarD = gVarD;
                                            }
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList<>();
                                            arrayList.add(new String(cArr, i10, i11));
                                        }
                                        a(str, arrayList);
                                        arrayList.add(str);
                                        strD = D(str, eVar, i13, i21);
                                        if (strD != null) {
                                            strSubstring = strD;
                                        }
                                        if (strSubstring != null) {
                                            int length = strSubstring.length();
                                            eVar.g1(i13, i21, strSubstring);
                                            int iR = (R(eVar, i13, length, arrayList) + length) - (i21 - i13);
                                            i21 += iR;
                                            i14 += iR;
                                            i15 += iR;
                                            cArr = eVar.f337290a;
                                            i16 = i12;
                                        }
                                        i13 = i21;
                                        arrayList.remove(arrayList.size() - 1);
                                        break;
                                    }
                                }
                                gVar = gVarD;
                                z10 = zG;
                                strSubstring = null;
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                    arrayList.add(new String(cArr, i10, i11));
                                }
                                a(str, arrayList);
                                arrayList.add(str);
                                strD = D(str, eVar, i13, i21);
                                if (strD != null) {
                                    strSubstring = strD;
                                }
                                if (strSubstring != null) {
                                    int length2 = strSubstring.length();
                                    eVar.g1(i13, i21, strSubstring);
                                    int iR2 = (R(eVar, i13, length2, arrayList) + length2) - (i21 - i13);
                                    i21 += iR2;
                                    i14 += iR2;
                                    i15 += iR2;
                                    cArr = eVar.f337290a;
                                    i16 = i12;
                                }
                                i13 = i21;
                                arrayList.remove(arrayList.size() - 1);
                                break;
                            }
                            i20--;
                            i19 += iG3;
                            gVarD = gVarD;
                        }
                    } else {
                        i20++;
                        i19 += iG;
                    }
                }
            } else {
                i13++;
                gVar = gVarD;
                z10 = zG;
            }
            gVarF = gVarF;
            cB = cB;
            zG = z10;
            gVarD = gVar;
        }
        return z11 ? i16 : i15;
    }

    private void a(String str, List<String> list) {
        if (list.contains(str)) {
            e eVar = new e(256);
            eVar.i("Infinite loop in property interpolation of ");
            eVar.i(list.remove(0));
            eVar.i(": ");
            eVar.N(list, "->");
            throw new IllegalStateException(eVar.toString());
        }
    }

    public static <V> String l(Object obj, Map<String, V> map) {
        return new h(map).k(obj);
    }

    public static <V> String m(Object obj, Map<String, V> map, String str, String str2) {
        return new h(map, str, str2).k(obj);
    }

    public static String n(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap map = new HashMap();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            String str = (String) enumerationPropertyNames.nextElement();
            map.put(str, properties.getProperty(str));
        }
        return l(obj, map);
    }

    public boolean A(e eVar) {
        if (eVar == null) {
            return false;
        }
        return S(eVar, 0, eVar.length());
    }

    public boolean B(e eVar, int i10, int i11) {
        if (eVar == null) {
            return false;
        }
        return S(eVar, i10, i11);
    }

    protected String D(String str, e eVar, int i10, int i11) {
        f<?> fVarE = e();
        if (fVarE == null) {
            return null;
        }
        return fVarE.a(str);
    }

    public void E(boolean z10) {
        this.f337323f = z10;
    }

    public void F(char c10) {
        this.f337318a = c10;
    }

    public void G(boolean z10) {
        this.f337324g = z10;
    }

    public h H(char c10) {
        return J(g.a(c10));
    }

    public h I(String str) {
        if (!z.A0(str)) {
            return J(g.m(str));
        }
        J(null);
        return this;
    }

    public h J(g gVar) {
        this.f337321d = gVar;
        return this;
    }

    public h K(char c10) {
        return M(g.a(c10));
    }

    public h L(String str) {
        if (str != null) {
            return M(g.m(str));
        }
        throw new IllegalArgumentException("Variable prefix must not be null!");
    }

    public h M(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        }
        this.f337319b = gVar;
        return this;
    }

    public void N(f<?> fVar) {
        this.f337322e = fVar;
    }

    public h O(char c10) {
        return Q(g.a(c10));
    }

    public h P(String str) {
        if (str != null) {
            return Q(g.m(str));
        }
        throw new IllegalArgumentException("Variable suffix must not be null!");
    }

    public h Q(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        }
        this.f337320c = gVar;
        return this;
    }

    protected boolean S(e eVar, int i10, int i11) {
        return R(eVar, i10, i11, null) > 0;
    }

    public char b() {
        return this.f337318a;
    }

    public g c() {
        return this.f337321d;
    }

    public g d() {
        return this.f337319b;
    }

    public f<?> e() {
        return this.f337322e;
    }

    public g f() {
        return this.f337320c;
    }

    public boolean g() {
        return this.f337323f;
    }

    public boolean h() {
        return this.f337324g;
    }

    public String i(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return j(charSequence, 0, charSequence.length());
    }

    public String j(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return null;
        }
        e eVarAppend = new e(i11).append(charSequence, i10, i11);
        S(eVarAppend, 0, i11);
        return eVarAppend.toString();
    }

    public String k(Object obj) {
        if (obj == null) {
            return null;
        }
        e eVarH = new e().h(obj);
        S(eVarH, 0, eVarH.length());
        return eVarH.toString();
    }

    public String o(String str) {
        if (str == null) {
            return null;
        }
        e eVar = new e(str);
        return !S(eVar, 0, str.length()) ? str : eVar.toString();
    }

    public String p(String str, int i10, int i11) {
        if (str == null) {
            return null;
        }
        e eVarJ = new e(i11).j(str, i10, i11);
        return !S(eVarJ, 0, i11) ? str.substring(i10, i11 + i10) : eVarJ.toString();
    }

    public String q(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        e eVarL = new e(stringBuffer.length()).l(stringBuffer);
        S(eVarL, 0, eVarL.length());
        return eVarL.toString();
    }

    public String r(StringBuffer stringBuffer, int i10, int i11) {
        if (stringBuffer == null) {
            return null;
        }
        e eVarM = new e(i11).m(stringBuffer, i10, i11);
        S(eVarM, 0, i11);
        return eVarM.toString();
    }

    public String s(e eVar) {
        if (eVar == null) {
            return null;
        }
        e eVarR = new e(eVar.length()).r(eVar);
        S(eVarR, 0, eVarR.length());
        return eVarR.toString();
    }

    public String t(e eVar, int i10, int i11) {
        if (eVar == null) {
            return null;
        }
        e eVarS = new e(i11).s(eVar, i10, i11);
        S(eVarS, 0, i11);
        return eVarS.toString();
    }

    public String u(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        e eVarU = new e(cArr.length).u(cArr);
        S(eVarU, 0, cArr.length);
        return eVarU.toString();
    }

    public String v(char[] cArr, int i10, int i11) {
        if (cArr == null) {
            return null;
        }
        e eVarV = new e(i11).v(cArr, i10, i11);
        S(eVarV, 0, i11);
        return eVarV.toString();
    }

    public boolean w(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return x(stringBuffer, 0, stringBuffer.length());
    }

    public boolean x(StringBuffer stringBuffer, int i10, int i11) {
        if (stringBuffer == null) {
            return false;
        }
        e eVarM = new e(i11).m(stringBuffer, i10, i11);
        if (!S(eVarM, 0, i11)) {
            return false;
        }
        stringBuffer.replace(i10, i11 + i10, eVarM.toString());
        return true;
    }

    public boolean y(StringBuilder sb2) {
        if (sb2 == null) {
            return false;
        }
        return z(sb2, 0, sb2.length());
    }

    public boolean z(StringBuilder sb2, int i10, int i11) {
        if (sb2 == null) {
            return false;
        }
        e eVarO = new e(i11).o(sb2, i10, i11);
        if (!S(eVarO, 0, i11)) {
            return false;
        }
        sb2.replace(i10, i11 + i10, eVarO.toString());
        return true;
    }

    public <V> h(Map<String, V> map) {
        this((f<?>) f.b(map), f337315i, f337316j, '$');
    }

    public <V> h(Map<String, V> map, String str, String str2) {
        this((f<?>) f.b(map), str, str2, '$');
    }

    public <V> h(Map<String, V> map, String str, String str2, char c10) {
        this((f<?>) f.b(map), str, str2, c10);
    }

    public <V> h(Map<String, V> map, String str, String str2, char c10, String str3) {
        this((f<?>) f.b(map), str, str2, c10, str3);
    }

    public h(f<?> fVar) {
        this(fVar, f337315i, f337316j, '$');
    }

    public h(f<?> fVar, String str, String str2, char c10) {
        this.f337324g = false;
        N(fVar);
        L(str);
        P(str2);
        F(c10);
        J(f337317k);
    }

    public h(f<?> fVar, String str, String str2, char c10, String str3) {
        this.f337324g = false;
        N(fVar);
        L(str);
        P(str2);
        F(c10);
        I(str3);
    }

    public h(f<?> fVar, g gVar, g gVar2, char c10) {
        this(fVar, gVar, gVar2, c10, f337317k);
    }

    public h(f<?> fVar, g gVar, g gVar2, char c10, g gVar3) {
        this.f337324g = false;
        N(fVar);
        M(gVar);
        Q(gVar2);
        F(c10);
        J(gVar3);
    }
}
