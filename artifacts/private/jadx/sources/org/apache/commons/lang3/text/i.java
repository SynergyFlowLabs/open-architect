package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class i implements ListIterator<String>, Cloneable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final i f337325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final i f337326k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f337327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f337328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f337329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f337330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f337331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f337332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f337333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f337334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f337335i;

    static {
        i iVar = new i();
        f337325j = iVar;
        iVar.K(g.d());
        iVar.T(g.e());
        iVar.P(g.h());
        iVar.X(g.o());
        iVar.M(false);
        iVar.N(false);
        i iVar2 = new i();
        f337326k = iVar2;
        iVar2.K(g.n());
        iVar2.T(g.e());
        iVar2.P(g.h());
        iVar2.X(g.o());
        iVar2.M(false);
        iVar2.N(false);
    }

    public i() {
        this.f337330d = g.l();
        this.f337331e = g.h();
        this.f337332f = g.h();
        this.f337333g = g.h();
        this.f337334h = false;
        this.f337335i = true;
        this.f337327a = null;
    }

    private int D(char[] cArr, int i10, int i11, e eVar, List<String> list) {
        int i12 = i10;
        while (i12 < i11) {
            int iMax = Math.max(l().g(cArr, i12, i12, i11), u().g(cArr, i12, i12, i11));
            if (iMax == 0 || k().g(cArr, i12, i12, i11) > 0 || n().g(cArr, i12, i12, i11) > 0) {
                break;
            }
            i12 += iMax;
        }
        if (i12 >= i11) {
            c(list, "");
            return -1;
        }
        int iG = k().g(cArr, i12, i12, i11);
        if (iG > 0) {
            c(list, "");
            return i12 + iG;
        }
        int iG2 = n().g(cArr, i12, i12, i11);
        if (iG2 <= 0) {
            return E(cArr, i12, i11, eVar, list, 0, 0);
        }
        int i13 = i12;
        return E(cArr, i13 + iG2, i11, eVar, list, i13, iG2);
    }

    private int E(char[] cArr, int i10, int i11, e eVar, List<String> list, int i12, int i13) {
        int i14;
        int i15 = i11;
        eVar.n0();
        boolean z10 = i13 > 0;
        int i16 = i10;
        int iW1 = 0;
        while (i16 < i15) {
            if (z10) {
                int i17 = i16;
                if (x(cArr, i16, i15, i12, i13)) {
                    i16 = i17 + i13;
                    i15 = i11;
                    if (x(cArr, i16, i15, i12, i13)) {
                        eVar.v(cArr, i17, i13);
                        i16 = (i13 * 2) + i17;
                        iW1 = eVar.w1();
                    } else {
                        z10 = false;
                    }
                } else {
                    i15 = i11;
                    i16 = i17 + 1;
                    eVar.append(cArr[i17]);
                    iW1 = eVar.w1();
                }
            } else {
                int i18 = i16;
                int iG = k().g(cArr, i18, i10, i15);
                if (iG > 0) {
                    c(list, eVar.z1(0, iW1));
                    return iG + i18;
                }
                if (i13 > 0) {
                    i14 = i18;
                    if (x(cArr, i14, i15, i12, i13)) {
                        i16 = i14 + i13;
                        z10 = true;
                    }
                } else {
                    i14 = i18;
                }
                int iG2 = l().g(cArr, i14, i10, i15);
                if (iG2 <= 0) {
                    iG2 = u().g(cArr, i14, i10, i15);
                    if (iG2 > 0) {
                        eVar.v(cArr, i14, iG2);
                    } else {
                        eVar.append(cArr[i14]);
                        iW1 = eVar.w1();
                        i16 = i14 + 1;
                    }
                }
                i16 = i14 + iG2;
            }
        }
        c(list, eVar.z1(0, iW1));
        return -1;
    }

    private void c(List<String> list, String str) {
        if (z.A0(str)) {
            if (w()) {
                return;
            }
            if (v()) {
                str = null;
            }
        }
        list.add(str);
    }

    private void d() {
        if (this.f337328b == null) {
            char[] cArr = this.f337327a;
            if (cArr == null) {
                List<String> listY = Y(null, 0, 0);
                this.f337328b = (String[]) listY.toArray(new String[listY.size()]);
            } else {
                List<String> listY2 = Y(cArr, 0, cArr.length);
                this.f337328b = (String[]) listY2.toArray(new String[listY2.size()]);
            }
        }
    }

    private static i f() {
        return (i) f337325j.clone();
    }

    public static i g() {
        return f();
    }

    public static i h(String str) {
        i iVarF = f();
        iVarF.G(str);
        return iVarF;
    }

    public static i i(char[] cArr) {
        i iVarF = f();
        iVarF.H(cArr);
        return iVarF;
    }

    private static i o() {
        return (i) f337326k.clone();
    }

    public static i p() {
        return o();
    }

    public static i q(String str) {
        i iVarO = o();
        iVarO.G(str);
        return iVarO;
    }

    public static i r(char[] cArr) {
        i iVarO = o();
        iVarO.H(cArr);
        return iVarO;
    }

    private boolean x(char[] cArr, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i10 + i14;
            if (i15 >= i11 || cArr[i15] != cArr[i12 + i14]) {
                return false;
            }
        }
        return true;
    }

    public String A() {
        if (!hasNext()) {
            return null;
        }
        String[] strArr = this.f337328b;
        int i10 = this.f337329c;
        this.f337329c = i10 + 1;
        return strArr[i10];
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public String previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f337328b;
        int i10 = this.f337329c - 1;
        this.f337329c = i10;
        return strArr[i10];
    }

    public String C() {
        if (!hasPrevious()) {
            return null;
        }
        String[] strArr = this.f337328b;
        int i10 = this.f337329c - 1;
        this.f337329c = i10;
        return strArr[i10];
    }

    public i F() {
        this.f337329c = 0;
        this.f337328b = null;
        return this;
    }

    public i G(String str) {
        F();
        if (str != null) {
            this.f337327a = str.toCharArray();
            return this;
        }
        this.f337327a = null;
        return this;
    }

    public i H(char[] cArr) {
        F();
        this.f337327a = org.apache.commons.lang3.c.D(cArr);
        return this;
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void set(String str) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public i J(char c10) {
        return K(g.a(c10));
    }

    public i K(g gVar) {
        if (gVar == null) {
            this.f337330d = g.h();
            return this;
        }
        this.f337330d = gVar;
        return this;
    }

    public i L(String str) {
        return K(g.m(str));
    }

    public i M(boolean z10) {
        this.f337334h = z10;
        return this;
    }

    public i N(boolean z10) {
        this.f337335i = z10;
        return this;
    }

    public i O(char c10) {
        return P(g.a(c10));
    }

    public i P(g gVar) {
        if (gVar != null) {
            this.f337332f = gVar;
        }
        return this;
    }

    public i Q(char c10) {
        return T(g.a(c10));
    }

    public i T(g gVar) {
        if (gVar != null) {
            this.f337331e = gVar;
        }
        return this;
    }

    public i X(g gVar) {
        if (gVar != null) {
            this.f337333g = gVar;
        }
        return this;
    }

    protected List<String> Y(char[] cArr, int i10, int i11) {
        if (cArr != null && i11 != 0) {
            e eVar = new e();
            ArrayList arrayList = new ArrayList();
            int iD = i10;
            while (iD >= 0 && iD < i11) {
                i iVar = this;
                char[] cArr2 = cArr;
                int i12 = i11;
                iD = iVar.D(cArr2, iD, i12, eVar, arrayList);
                if (iD >= i12) {
                    iVar.c(arrayList, "");
                }
                this = iVar;
                cArr = cArr2;
                i11 = i12;
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(String str) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    public Object clone() {
        try {
            return e();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    Object e() throws CloneNotSupportedException {
        i iVar = (i) super.clone();
        char[] cArr = iVar.f337327a;
        if (cArr != null) {
            iVar.f337327a = (char[]) cArr.clone();
        }
        iVar.F();
        return iVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        d();
        return this.f337329c < this.f337328b.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        d();
        return this.f337329c > 0;
    }

    public String j() {
        char[] cArr = this.f337327a;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public g k() {
        return this.f337330d;
    }

    public g l() {
        return this.f337332f;
    }

    public g n() {
        return this.f337331e;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f337329c;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f337329c - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public String[] s() {
        d();
        return (String[]) this.f337328b.clone();
    }

    public int size() {
        d();
        return this.f337328b.length;
    }

    public List<String> t() {
        d();
        ArrayList arrayList = new ArrayList(this.f337328b.length);
        arrayList.addAll(Arrays.asList(this.f337328b));
        return arrayList;
    }

    public String toString() {
        if (this.f337328b == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        return "StrTokenizer" + t();
    }

    public g u() {
        return this.f337333g;
    }

    public boolean v() {
        return this.f337334h;
    }

    public boolean w() {
        return this.f337335i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String[] strArr = this.f337328b;
        int i10 = this.f337329c;
        this.f337329c = i10 + 1;
        return strArr[i10];
    }

    public i(String str) {
        this.f337330d = g.l();
        this.f337331e = g.h();
        this.f337332f = g.h();
        this.f337333g = g.h();
        this.f337334h = false;
        this.f337335i = true;
        if (str != null) {
            this.f337327a = str.toCharArray();
        } else {
            this.f337327a = null;
        }
    }

    public i(String str, char c10) {
        this(str);
        J(c10);
    }

    public i(String str, String str2) {
        this(str);
        L(str2);
    }

    public i(String str, g gVar) {
        this(str);
        K(gVar);
    }

    public i(String str, char c10, char c11) {
        this(str, c10);
        Q(c11);
    }

    public i(String str, g gVar, g gVar2) {
        this(str, gVar);
        T(gVar2);
    }

    public i(char[] cArr) {
        this.f337330d = g.l();
        this.f337331e = g.h();
        this.f337332f = g.h();
        this.f337333g = g.h();
        this.f337334h = false;
        this.f337335i = true;
        this.f337327a = org.apache.commons.lang3.c.D(cArr);
    }

    public i(char[] cArr, char c10) {
        this(cArr);
        J(c10);
    }

    public i(char[] cArr, String str) {
        this(cArr);
        L(str);
    }

    public i(char[] cArr, g gVar) {
        this(cArr);
        K(gVar);
    }

    public i(char[] cArr, char c10, char c11) {
        this(cArr, c10);
        Q(c11);
    }

    public i(char[] cArr, g gVar, g gVar2) {
        this(cArr, gVar);
        T(gVar2);
    }
}
