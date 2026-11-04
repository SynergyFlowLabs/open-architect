package org.commonmark.internal;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.node.a0;
import org.commonmark.node.v;
import org.commonmark.node.y;

/* JADX INFO: loaded from: classes14.dex */
public class n implements org.commonmark.parser.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f337627i = "<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f337628j = "[<][?].*?[?][>]";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f337629k = "<![A-Z]+\\s+[^>]*>";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f337630l = "<!\\[CDATA\\[[\\s\\S]*?\\]\\]>";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f337631m = "(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f337632n = "!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f337633o = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f337634p = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f337635q = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f337636r = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f337637s = Pattern.compile("`+");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f337638t = Pattern.compile("^`+");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f337639u = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f337640v = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f337641w = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f337642x = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f337643y = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f337644z = Pattern.compile(" *$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BitSet f337645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BitSet f337646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Character, cm.a> f337647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final org.commonmark.parser.b f337648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f337649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f337650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f337651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f337652h;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f337653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f337654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f337655c;

        a(int i10, boolean z10, boolean z11) {
            this.f337653a = i10;
            this.f337655c = z10;
            this.f337654b = z11;
        }
    }

    public n(org.commonmark.parser.b bVar) {
        Map<Character, cm.a> mapF = f(bVar.a());
        this.f337647c = mapF;
        BitSet bitSetE = e(mapF.keySet());
        this.f337646b = bitSetE;
        this.f337645a = g(bitSetE);
        this.f337648d = bVar;
    }

    private v A() {
        int i10 = this.f337650f;
        int length = this.f337649e.length();
        while (true) {
            int i11 = this.f337650f;
            if (i11 == length || this.f337645a.get(this.f337649e.charAt(i11))) {
                break;
            }
            this.f337650f++;
        }
        int i12 = this.f337650f;
        if (i10 != i12) {
            return M(this.f337649e, i10, i12);
        }
        return null;
    }

    private char B() {
        if (this.f337650f < this.f337649e.length()) {
            return this.f337649e.charAt(this.f337650f);
        }
        return (char) 0;
    }

    private void C(f fVar) {
        boolean z10;
        HashMap map = new HashMap();
        f fVar2 = this.f337651g;
        while (fVar2 != null) {
            f fVar3 = fVar2.f337589e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            char c10 = fVar2.f337586b;
            cm.a aVar = this.f337647c.get(Character.valueOf(c10));
            if (!fVar2.f337588d || aVar == null) {
                fVar2 = fVar2.f337590f;
            } else {
                char c11 = aVar.c();
                f fVar4 = fVar2.f337589e;
                int iD = 0;
                boolean z11 = false;
                while (true) {
                    if (fVar4 == null || fVar4 == fVar || fVar4 == map.get(Character.valueOf(c10))) {
                        z10 = z11;
                        z11 = false;
                        break;
                    }
                    if (fVar4.f337587c && fVar4.f337586b == c11) {
                        iD = aVar.d(fVar4, fVar2);
                        z11 = true;
                        if (iD > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.f337589e;
                }
                if (z11) {
                    a0 a0Var = fVar4.f337585a;
                    a0 a0Var2 = fVar2.f337585a;
                    fVar4.f337591g -= iD;
                    fVar2.f337591g -= iD;
                    a0Var.q(a0Var.p().substring(0, a0Var.p().length() - iD));
                    a0Var2.q(a0Var2.p().substring(0, a0Var2.p().length() - iD));
                    G(fVar4, fVar2);
                    k(a0Var, a0Var2);
                    aVar.e(a0Var, a0Var2, iD);
                    if (fVar4.f337591g == 0) {
                        E(fVar4);
                    }
                    if (fVar2.f337591g == 0) {
                        f fVar5 = fVar2.f337590f;
                        E(fVar2);
                        fVar2 = fVar5;
                    }
                } else {
                    if (!z10) {
                        map.put(Character.valueOf(c10), fVar2.f337589e);
                        if (!fVar2.f337587c) {
                            F(fVar2);
                        }
                    }
                    fVar2 = fVar2.f337590f;
                }
            }
        }
        while (true) {
            f fVar6 = this.f337651g;
            if (fVar6 == null || fVar6 == fVar) {
                return;
            } else {
                F(fVar6);
            }
        }
    }

    private void D(f fVar) {
        f fVar2 = fVar.f337589e;
        if (fVar2 != null) {
            fVar2.f337590f = fVar.f337590f;
        }
        f fVar3 = fVar.f337590f;
        if (fVar3 == null) {
            this.f337651g = fVar2;
        } else {
            fVar3.f337589e = fVar2;
        }
    }

    private void E(f fVar) {
        fVar.f337585a.o();
        D(fVar);
    }

    private void F(f fVar) {
        D(fVar);
    }

    private void G(f fVar, f fVar2) {
        f fVar3 = fVar2.f337589e;
        while (fVar3 != null && fVar3 != fVar) {
            f fVar4 = fVar3.f337589e;
            F(fVar3);
            fVar3 = fVar4;
        }
    }

    private void H() {
        this.f337652h = this.f337652h.f337581d;
    }

    private a J(cm.a aVar, char c10) {
        boolean z10;
        int i10 = this.f337650f;
        boolean z11 = false;
        int i11 = 0;
        while (B() == c10) {
            i11++;
            this.f337650f++;
        }
        if (i11 < aVar.b()) {
            this.f337650f = i10;
            return null;
        }
        String strSubstring = i10 == 0 ? "\n" : this.f337649e.substring(i10 - 1, i10);
        char cB = B();
        String strValueOf = cB != 0 ? String.valueOf(cB) : "\n";
        Pattern pattern = f337633o;
        boolean zMatches = pattern.matcher(strSubstring).matches();
        Pattern pattern2 = f337642x;
        boolean zMatches2 = pattern2.matcher(strSubstring).matches();
        boolean zMatches3 = pattern.matcher(strValueOf).matches();
        boolean zMatches4 = pattern2.matcher(strValueOf).matches();
        boolean z12 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
        boolean z13 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
        if (c10 == '_') {
            z10 = z12 && (!z13 || zMatches);
            if (z13 && (!z12 || zMatches3)) {
                z11 = true;
            }
        } else {
            boolean z14 = z12 && c10 == aVar.c();
            if (z13 && c10 == aVar.a()) {
                z11 = true;
            }
            z10 = z14;
        }
        this.f337650f = i10;
        return new a(i11, z10, z11);
    }

    private void K() {
        h(f337641w);
    }

    private a0 L(String str) {
        return new a0(str);
    }

    private a0 M(String str, int i10, int i11) {
        return new a0(str.substring(i10, i11));
    }

    private void b(e eVar) {
        e eVar2 = this.f337652h;
        if (eVar2 != null) {
            eVar2.f337584g = true;
        }
        this.f337652h = eVar;
    }

    private static void c(char c10, cm.a aVar, Map<Character, cm.a> map) {
        if (map.put(Character.valueOf(c10), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    private static void d(Iterable<cm.a> iterable, Map<Character, cm.a> map) {
        s sVar;
        for (cm.a aVar : iterable) {
            char c10 = aVar.c();
            char cA = aVar.a();
            if (c10 == cA) {
                cm.a aVar2 = map.get(Character.valueOf(c10));
                if (aVar2 == null || aVar2.c() != aVar2.a()) {
                    c(c10, aVar, map);
                } else {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(c10);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    map.put(Character.valueOf(c10), sVar);
                }
            } else {
                c(c10, aVar, map);
                c(cA, aVar, map);
            }
        }
    }

    public static BitSet e(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    public static Map<Character, cm.a> f(List<cm.a> list) {
        HashMap map = new HashMap();
        d(Arrays.asList(new org.commonmark.internal.inline.a(), new org.commonmark.internal.inline.c()), map);
        d(list, map);
        return map;
    }

    public static BitSet g(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    private String h(Pattern pattern) {
        if (this.f337650f >= this.f337649e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f337649e);
        matcher.region(this.f337650f, this.f337649e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f337650f = matcher.end();
        return matcher.group();
    }

    private void i(v vVar) {
        if (vVar.e() == vVar.f()) {
            return;
        }
        l(vVar.e(), vVar.f());
    }

    private void j(a0 a0Var, a0 a0Var2, int i10) {
        if (a0Var == null || a0Var2 == null || a0Var == a0Var2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(a0Var.p());
        v vVarG = a0Var.g();
        v vVarG2 = a0Var2.g();
        while (vVarG != vVarG2) {
            sb2.append(((a0) vVarG).p());
            v vVarG3 = vVarG.g();
            vVarG.o();
            vVarG = vVarG3;
        }
        a0Var.q(sb2.toString());
    }

    private void k(v vVar, v vVar2) {
        if (vVar == vVar2 || vVar.g() == vVar2) {
            return;
        }
        l(vVar.g(), vVar2.i());
    }

    private void l(v vVar, v vVar2) {
        a0 a0Var = null;
        a0 a0Var2 = null;
        int length = 0;
        while (vVar != null) {
            if (vVar instanceof a0) {
                a0Var2 = (a0) vVar;
                if (a0Var == null) {
                    a0Var = a0Var2;
                }
                length += a0Var2.p().length();
            } else {
                j(a0Var, a0Var2, length);
                a0Var = null;
                a0Var2 = null;
                length = 0;
            }
            if (vVar == vVar2) {
                break;
            } else {
                vVar = vVar.g();
            }
        }
        j(a0Var, a0Var2, length);
    }

    private v m() {
        String strH = h(f337639u);
        if (strH != null) {
            String strSubstring = strH.substring(1, strH.length() - 1);
            org.commonmark.node.r rVar = new org.commonmark.node.r(androidx.core.net.c.f48012b + strSubstring, null);
            rVar.d(new a0(strSubstring));
            return rVar;
        }
        String strH2 = h(f337640v);
        if (strH2 == null) {
            return null;
        }
        String strSubstring2 = strH2.substring(1, strH2.length() - 1);
        org.commonmark.node.r rVar2 = new org.commonmark.node.r(strSubstring2, null);
        rVar2.d(new a0(strSubstring2));
        return rVar2;
    }

    private v n() {
        this.f337650f++;
        if (B() == '\n') {
            org.commonmark.node.l lVar = new org.commonmark.node.l();
            this.f337650f++;
            return lVar;
        }
        if (this.f337650f < this.f337649e.length()) {
            Pattern pattern = f337635q;
            String str = this.f337649e;
            int i10 = this.f337650f;
            if (pattern.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f337649e;
                int i11 = this.f337650f;
                a0 a0VarM = M(str2, i11, i11 + 1);
                this.f337650f++;
                return a0VarM;
            }
        }
        return L("\\");
    }

    private v o() {
        String strH;
        String strH2 = h(f337638t);
        if (strH2 == null) {
            return null;
        }
        int i10 = this.f337650f;
        do {
            strH = h(f337637s);
            if (strH == null) {
                this.f337650f = i10;
                return L(strH2);
            }
        } while (!strH.equals(strH2));
        org.commonmark.node.e eVar = new org.commonmark.node.e();
        String strReplace = this.f337649e.substring(i10, this.f337650f - strH2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && org.commonmark.internal.util.d.e(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        eVar.q(strReplace);
        return eVar;
    }

    private v p() {
        int i10 = this.f337650f;
        this.f337650f = i10 + 1;
        if (B() != '[') {
            return L("!");
        }
        this.f337650f++;
        a0 a0VarL = L("![");
        b(e.a(a0VarL, i10 + 1, this.f337652h, this.f337651g));
        return a0VarL;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    private v q() {
        boolean z10;
        String strP;
        String strR;
        boolean z11 = true;
        int i10 = this.f337650f + 1;
        this.f337650f = i10;
        e eVar = this.f337652h;
        if (eVar == null) {
            return L("]");
        }
        if (!eVar.f337583f) {
            H();
            return L("]");
        }
        String strSubstring = null;
        if (B() == '(') {
            this.f337650f++;
            K();
            strP = v();
            if (strP != null) {
                K();
                Pattern pattern = f337643y;
                String str = this.f337649e;
                int i11 = this.f337650f;
                if (pattern.matcher(str.substring(i11 - 1, i11)).matches()) {
                    strR = x();
                    K();
                } else {
                    strR = null;
                }
                if (B() == ')') {
                    this.f337650f++;
                    z10 = true;
                } else {
                    this.f337650f = i10;
                    z10 = false;
                }
            } else {
                z10 = false;
                strR = null;
            }
        } else {
            z10 = false;
            strP = null;
            strR = null;
        }
        if (z10) {
            z11 = z10;
        } else {
            int i12 = this.f337650f;
            w();
            int i13 = this.f337650f - i12;
            if (i13 > 2) {
                strSubstring = this.f337649e.substring(i12, i13 + i12);
            } else if (!eVar.f337584g) {
                strSubstring = this.f337649e.substring(eVar.f337579b, i10);
            }
            if (strSubstring != null) {
                org.commonmark.node.s sVarB = this.f337648d.b(org.commonmark.internal.util.a.d(strSubstring));
                if (sVarB != null) {
                    strP = sVarB.p();
                    strR = sVarB.r();
                } else {
                    z11 = z10;
                }
            } else {
                z11 = z10;
            }
        }
        if (!z11) {
            this.f337650f = i10;
            H();
            return L("]");
        }
        v pVar = eVar.f337580c ? new org.commonmark.node.p(strP, strR) : new org.commonmark.node.r(strP, strR);
        v vVarG = eVar.f337578a.g();
        while (vVarG != null) {
            v vVarG2 = vVarG.g();
            pVar.d(vVarG);
            vVarG = vVarG2;
        }
        C(eVar.f337582e);
        i(pVar);
        eVar.f337578a.o();
        H();
        if (!eVar.f337580c) {
            for (e eVar2 = this.f337652h; eVar2 != null; eVar2 = eVar2.f337581d) {
                if (!eVar2.f337580c) {
                    eVar2.f337583f = false;
                }
            }
        }
        return pVar;
    }

    private v r(cm.a aVar, char c10) {
        a aVarJ = J(aVar, c10);
        if (aVarJ == null) {
            return null;
        }
        int i10 = aVarJ.f337653a;
        int i11 = this.f337650f;
        int i12 = i11 + i10;
        this.f337650f = i12;
        a0 a0VarM = M(this.f337649e, i11, i12);
        f fVar = new f(a0VarM, c10, aVarJ.f337655c, aVarJ.f337654b, this.f337651g);
        this.f337651g = fVar;
        fVar.f337591g = i10;
        fVar.f337592h = i10;
        f fVar2 = fVar.f337589e;
        if (fVar2 != null) {
            fVar2.f337590f = fVar;
        }
        return a0VarM;
    }

    private v s() {
        String strH = h(f337636r);
        if (strH != null) {
            return L(org.commonmark.internal.util.b.a(strH));
        }
        return null;
    }

    private v t() {
        String strH = h(f337634p);
        if (strH == null) {
            return null;
        }
        org.commonmark.node.o oVar = new org.commonmark.node.o();
        oVar.q(strH);
        return oVar;
    }

    private v u(v vVar) {
        v vVarY;
        char cB = B();
        if (cB == 0) {
            return null;
        }
        if (cB == '\n') {
            vVarY = y(vVar);
        } else if (cB == '!') {
            vVarY = p();
        } else if (cB == '&') {
            vVarY = s();
        } else if (cB == '<') {
            vVarY = m();
            if (vVarY == null) {
                vVarY = t();
            }
        } else if (cB != '`') {
            switch (cB) {
                case com.planner5d.library.engine.input.f.b.f160711n0 /* 91 */:
                    vVarY = z();
                    break;
                case com.planner5d.library.engine.input.f.b.f160697i1 /* 92 */:
                    vVarY = n();
                    break;
                case com.planner5d.library.engine.input.f.b.f160700j1 /* 93 */:
                    vVarY = q();
                    break;
                default:
                    vVarY = !this.f337646b.get(cB) ? A() : r(this.f337647c.get(Character.valueOf(cB)), cB);
                    break;
            }
        } else {
            vVarY = o();
        }
        if (vVarY != null) {
            return vVarY;
        }
        this.f337650f++;
        return L(String.valueOf(cB));
    }

    private String v() {
        int iA = org.commonmark.internal.util.c.a(this.f337649e, this.f337650f);
        if (iA == -1) {
            return null;
        }
        String strSubstring = B() == '<' ? this.f337649e.substring(this.f337650f + 1, iA - 1) : this.f337649e.substring(this.f337650f, iA);
        this.f337650f = iA;
        return org.commonmark.internal.util.a.g(strSubstring);
    }

    private String x() {
        int iD = org.commonmark.internal.util.c.d(this.f337649e, this.f337650f);
        if (iD == -1) {
            return null;
        }
        String strSubstring = this.f337649e.substring(this.f337650f + 1, iD - 1);
        this.f337650f = iD;
        return org.commonmark.internal.util.a.g(strSubstring);
    }

    private v y(v vVar) {
        this.f337650f++;
        if (vVar instanceof a0) {
            a0 a0Var = (a0) vVar;
            if (a0Var.p().endsWith(" ")) {
                String strP = a0Var.p();
                Matcher matcher = f337644z.matcher(strP);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    a0Var.q(strP.substring(0, strP.length() - iEnd));
                }
                return iEnd >= 2 ? new org.commonmark.node.l() : new y();
            }
        }
        return new y();
    }

    private v z() {
        int i10 = this.f337650f;
        this.f337650f = i10 + 1;
        a0 a0VarL = L("[");
        b(e.b(a0VarL, i10, this.f337652h, this.f337651g));
        return a0VarL;
    }

    void I(String str) {
        this.f337649e = str;
        this.f337650f = 0;
        this.f337651g = null;
        this.f337652h = null;
    }

    @Override // org.commonmark.parser.a
    public void a(String str, v vVar) {
        I(str.trim());
        v vVarU = null;
        while (true) {
            vVarU = u(vVarU);
            if (vVarU == null) {
                C(null);
                i(vVar);
                return;
            }
            vVar.d(vVarU);
        }
    }

    int w() {
        if (this.f337650f < this.f337649e.length() && this.f337649e.charAt(this.f337650f) == '[') {
            int i10 = this.f337650f + 1;
            int iC = org.commonmark.internal.util.c.c(this.f337649e, i10);
            int i11 = iC - i10;
            if (iC != -1 && i11 <= 999 && iC < this.f337649e.length() && this.f337649e.charAt(iC) == ']') {
                this.f337650f = iC + 1;
                return i11 + 2;
            }
        }
        return 0;
    }
}
