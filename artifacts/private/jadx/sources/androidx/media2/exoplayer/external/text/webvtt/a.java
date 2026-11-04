package androidx.media2.exoplayer.external.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f56930c = "background-color";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f56931d = "font-family";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f56932e = "font-weight";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f56933f = "text-decoration";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f56934g = "bold";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f56935h = "underline";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f56936i = "{";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f56937j = "}";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f56938k = "font-style";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f56939l = "italic";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f56940m = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f56941a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f56942b = new StringBuilder();

    private void a(d style, String selector) {
        if (!"".equals(selector)) {
            int iIndexOf = selector.indexOf(91);
            if (iIndexOf != -1) {
                Matcher matcher = f56940m.matcher(selector.substring(iIndexOf));
                if (matcher.matches()) {
                    style.z(matcher.group(1));
                }
                selector = selector.substring(0, iIndexOf);
            }
            String[] strArrO0 = q0.O0(selector, "\\.");
            String str = strArrO0[0];
            int iIndexOf2 = str.indexOf(35);
            if (iIndexOf2 != -1) {
                style.y(str.substring(0, iIndexOf2));
                style.x(str.substring(iIndexOf2 + 1));
            } else {
                style.y(str);
            }
            if (strArrO0.length > 1) {
                style.w((String[]) q0.B0(strArrO0, 1, strArrO0.length));
            }
        }
    }

    private static boolean b(x input) {
        int iC = input.c();
        int iD = input.d();
        byte[] bArr = input.f57720a;
        if (iC + 2 <= iD) {
            int i10 = iC + 1;
            if (bArr[iC] == 47) {
                int i11 = iC + 2;
                if (bArr[i10] == 42) {
                    while (true) {
                        int i12 = i11 + 1;
                        if (i12 >= iD) {
                            input.R(iD - input.c());
                            return true;
                        }
                        if (((char) bArr[i11]) == '*' && ((char) bArr[i12]) == '/') {
                            i11 += 2;
                            iD = i11;
                        } else {
                            i11 = i12;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean c(x input) {
        char cJ = j(input, input.c());
        if (cJ != '\t' && cJ != '\n' && cJ != '\f' && cJ != '\r' && cJ != ' ') {
            return false;
        }
        input.R(1);
        return true;
    }

    private static String e(x input, StringBuilder stringBuilder) {
        boolean z10 = false;
        stringBuilder.setLength(0);
        int iC = input.c();
        int iD = input.d();
        while (iC < iD && !z10) {
            char c10 = (char) input.f57720a[iC];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iC++;
                stringBuilder.append(c10);
            }
        }
        input.R(iC - input.c());
        return stringBuilder.toString();
    }

    @p0
    static String f(x input, StringBuilder stringBuilder) {
        m(input);
        if (input.a() == 0) {
            return null;
        }
        String strE = e(input, stringBuilder);
        if (!"".equals(strE)) {
            return strE;
        }
        char cD = (char) input.D();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append(cD);
        return sb2.toString();
    }

    @p0
    private static String g(x input, StringBuilder stringBuilder) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iC = input.c();
            String strF = f(input, stringBuilder);
            if (strF == null) {
                return null;
            }
            if (f56937j.equals(strF) || ";".equals(strF)) {
                input.Q(iC);
                z10 = true;
            } else {
                sb2.append(strF);
            }
        }
        return sb2.toString();
    }

    @p0
    private static String h(x input, StringBuilder stringBuilder) {
        m(input);
        if (input.a() >= 5 && "::cue".equals(input.A(5))) {
            int iC = input.c();
            String strF = f(input, stringBuilder);
            if (strF == null) {
                return null;
            }
            if (f56936i.equals(strF)) {
                input.Q(iC);
                return "";
            }
            String strK = "(".equals(strF) ? k(input) : null;
            if (")".equals(f(input, stringBuilder))) {
                return strK;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    private static void i(x input, d style, StringBuilder stringBuilder) {
        m(input);
        String strE = e(input, stringBuilder);
        if (!"".equals(strE) && ":".equals(f(input, stringBuilder))) {
            m(input);
            String strG = g(input, stringBuilder);
            if (strG != null && !"".equals(strG)) {
                int iC = input.c();
                String strF = f(input, stringBuilder);
                if (";".equals(strF)) {
                    if ("color".equals(strE)) {
                        style.q(androidx.media2.exoplayer.external.util.e.c(strG));
                        return;
                    }
                    if (f56930c.equals(strE)) {
                        style.o(androidx.media2.exoplayer.external.util.e.c(strG));
                        return;
                    }
                    if (f56933f.equals(strE)) {
                        if ("underline".equals(strG)) {
                            style.B(true);
                        }
                    } else if (f56931d.equals(strE)) {
                        style.r(strG);
                    } else if (f56932e.equals(strE)) {
                        if ("bold".equals(strG)) {
                            style.p(true);
                        }
                    } else if (f56938k.equals(strE)) {
                        style.u(true);
                    }
                } else if (f56937j.equals(strF)) {
                    input.Q(iC);
                    if ("color".equals(strE)) {
                        style.q(androidx.media2.exoplayer.external.util.e.c(strG));
                        return;
                    }
                    if (f56930c.equals(strE)) {
                        style.o(androidx.media2.exoplayer.external.util.e.c(strG));
                        return;
                    }
                    if (f56933f.equals(strE)) {
                        if ("underline".equals(strG)) {
                            style.B(true);
                        }
                    } else if (f56931d.equals(strE)) {
                        style.r(strG);
                    } else if (f56932e.equals(strE)) {
                        if ("bold".equals(strG)) {
                            style.p(true);
                        }
                    } else if (f56938k.equals(strE) && "italic".equals(strG)) {
                        style.u(true);
                    }
                }
            }
        }
    }

    private static char j(x input, int position) {
        return (char) input.f57720a[position];
    }

    private static String k(x input) {
        int iC = input.c();
        int iD = input.d();
        boolean z10 = false;
        while (iC < iD && !z10) {
            int i10 = iC + 1;
            z10 = ((char) input.f57720a[iC]) == ')';
            iC = i10;
        }
        return input.A((iC - 1) - input.c()).trim();
    }

    static void l(x input) {
        while (!TextUtils.isEmpty(input.n())) {
        }
    }

    static void m(x input) {
        while (true) {
            for (boolean z10 = true; input.a() > 0 && z10; z10 = false) {
                if (!c(input) && !b(input)) {
                }
            }
            return;
        }
    }

    public List<d> d(x input) {
        this.f56942b.setLength(0);
        int iC = input.c();
        l(input);
        this.f56941a.O(input.f57720a, input.c());
        this.f56941a.Q(iC);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strH = h(this.f56941a, this.f56942b);
            if (strH == null || !f56936i.equals(f(this.f56941a, this.f56942b))) {
                break;
                break;
            }
            d dVar = new d();
            a(dVar, strH);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iC2 = this.f56941a.c();
                String strF = f(this.f56941a, this.f56942b);
                boolean z11 = strF == null || f56937j.equals(strF);
                if (!z11) {
                    this.f56941a.Q(iC2);
                    i(this.f56941a, dVar, this.f56942b);
                }
                str = strF;
                z10 = z11;
            }
            if (f56937j.equals(str)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }
}
