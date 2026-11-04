package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.l;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f68862c = "WebvttCssParser";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f68863d = "{";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f68864e = "}";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f68865f = "color";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f68866g = "background-color";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f68867h = "font-family";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f68868i = "font-weight";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f68869j = "font-size";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f68870k = "ruby-position";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f68871l = "over";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f68872m = "under";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f68873n = "text-combine-upright";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f68874o = "all";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f68875p = "digits";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f68876q = "text-decoration";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f68877r = "bold";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f68878s = "underline";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f68879t = "font-style";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f68880u = "italic";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f68881v = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f68882w = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f68883a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f68884b = new StringBuilder();

    private void a(c cVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f68881v.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.A((String) androidx.media3.common.util.a.g(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrL2 = k1.l2(str, "\\.");
        String str2 = strArrL2[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.z(str2.substring(0, iIndexOf2));
            cVar.y(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.z(str2);
        }
        if (strArrL2.length > 1) {
            cVar.x((String[]) k1.K1(strArrL2, 1, strArrL2.length));
        }
    }

    private static boolean b(o0 o0Var) {
        int iF = o0Var.f();
        int iG = o0Var.g();
        byte[] bArrE = o0Var.e();
        if (iF + 2 <= iG) {
            int i10 = iF + 1;
            if (bArrE[iF] == 47) {
                int i11 = iF + 2;
                if (bArrE[i10] == 42) {
                    while (true) {
                        int i12 = i11 + 1;
                        if (i12 >= iG) {
                            o0Var.b0(iG - o0Var.f());
                            return true;
                        }
                        if (((char) bArrE[i11]) == '*' && ((char) bArrE[i12]) == '/') {
                            i11 += 2;
                            iG = i11;
                        } else {
                            i11 = i12;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean c(o0 o0Var) {
        char cK = k(o0Var, o0Var.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        o0Var.b0(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f68882w.matcher(com.google.common.base.c.g(str));
        if (!matcher.matches()) {
            z.n(f68862c, "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) androidx.media3.common.util.a.g(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) androidx.media3.common.util.a.g(matcher.group(1))));
    }

    private static String f(o0 o0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iF = o0Var.f();
        int iG = o0Var.g();
        while (iF < iG && !z10) {
            char c10 = (char) o0Var.e()[iF];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iF++;
                sb2.append(c10);
            }
        }
        o0Var.b0(iF - o0Var.f());
        return sb2.toString();
    }

    @p0
    static String g(o0 o0Var, StringBuilder sb2) {
        n(o0Var);
        if (o0Var.a() == 0) {
            return null;
        }
        String strF = f(o0Var, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) o0Var.L());
    }

    @p0
    private static String h(o0 o0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iF = o0Var.f();
            String strG = g(o0Var, sb2);
            if (strG == null) {
                return null;
            }
            if (f68864e.equals(strG) || ";".equals(strG)) {
                o0Var.a0(iF);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    @p0
    private static String i(o0 o0Var, StringBuilder sb2) {
        n(o0Var);
        if (o0Var.a() < 5 || !"::cue".equals(o0Var.I(5))) {
            return null;
        }
        int iF = o0Var.f();
        String strG = g(o0Var, sb2);
        if (strG == null) {
            return null;
        }
        if (f68863d.equals(strG)) {
            o0Var.a0(iF);
            return "";
        }
        String strL = "(".equals(strG) ? l(o0Var) : null;
        if (")".equals(g(o0Var, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(o0 o0Var, c cVar, StringBuilder sb2) {
        n(o0Var);
        String strF = f(o0Var, sb2);
        if (!"".equals(strF) && ":".equals(g(o0Var, sb2))) {
            n(o0Var);
            String strH = h(o0Var, sb2);
            if (strH != null && !"".equals(strH)) {
                int iF = o0Var.f();
                String strG = g(o0Var, sb2);
                if (!";".equals(strG)) {
                    if (!f68864e.equals(strG)) {
                        return;
                    } else {
                        o0Var.a0(iF);
                    }
                }
                if ("color".equals(strF)) {
                    cVar.q(l.b(strH));
                    return;
                }
                if (f68866g.equals(strF)) {
                    cVar.n(l.b(strH));
                    return;
                }
                boolean z10 = true;
                if (f68870k.equals(strF)) {
                    if (f68871l.equals(strH)) {
                        cVar.w(1);
                        return;
                    } else {
                        if (f68872m.equals(strH)) {
                            cVar.w(2);
                            return;
                        }
                        return;
                    }
                }
                if (f68873n.equals(strF)) {
                    if (!"all".equals(strH) && !strH.startsWith(f68875p)) {
                        z10 = false;
                    }
                    cVar.p(z10);
                    return;
                }
                if (f68876q.equals(strF)) {
                    if ("underline".equals(strH)) {
                        cVar.B(true);
                        return;
                    }
                    return;
                }
                if (f68867h.equals(strF)) {
                    cVar.r(strH);
                    return;
                }
                if (f68868i.equals(strF)) {
                    if ("bold".equals(strH)) {
                        cVar.o(true);
                    }
                } else if (f68879t.equals(strF)) {
                    if ("italic".equals(strH)) {
                        cVar.u(true);
                    }
                } else if (f68869j.equals(strF)) {
                    e(strH, cVar);
                }
            }
        }
    }

    private static char k(o0 o0Var, int i10) {
        return (char) o0Var.e()[i10];
    }

    private static String l(o0 o0Var) {
        int iF = o0Var.f();
        int iG = o0Var.g();
        boolean z10 = false;
        while (iF < iG && !z10) {
            int i10 = iF + 1;
            z10 = ((char) o0Var.e()[iF]) == ')';
            iF = i10;
        }
        return o0Var.I((iF - 1) - o0Var.f()).trim();
    }

    static void m(o0 o0Var) {
        while (!TextUtils.isEmpty(o0Var.u())) {
        }
    }

    static void n(o0 o0Var) {
        loop0: while (true) {
            for (boolean z10 = true; o0Var.a() > 0 && z10; z10 = false) {
                if (!c(o0Var) && !b(o0Var)) {
                }
            }
            break loop0;
        }
    }

    public List<c> d(o0 o0Var) {
        this.f68884b.setLength(0);
        int iF = o0Var.f();
        m(o0Var);
        this.f68883a.Y(o0Var.e(), o0Var.f());
        this.f68883a.a0(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f68883a, this.f68884b);
            if (strI == null || !f68863d.equals(g(this.f68883a, this.f68884b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iF2 = this.f68883a.f();
                String strG = g(this.f68883a, this.f68884b);
                boolean z11 = strG == null || f68864e.equals(strG);
                if (!z11) {
                    this.f68883a.a0(iF2);
                    j(this.f68883a, cVar, this.f68884b);
                }
                str = strG;
                z10 = z11;
            }
            if (f68864e.equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
