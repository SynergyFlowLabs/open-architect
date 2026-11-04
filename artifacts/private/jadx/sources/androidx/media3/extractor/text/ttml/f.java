package androidx.media3.extractor.text.ttml;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import androidx.media3.common.text.k;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f68760a = "TtmlRenderUtil";

    private f() {
    }

    public static void a(Spannable spannable, int i10, int i11, g gVar, @p0 c cVar, Map<String, g> map, int i12) {
        c cVarE;
        g gVarF;
        int i13;
        if (gVar.n() != -1) {
            spannable.setSpan(new StyleSpan(gVar.n()), i10, i11, 33);
        }
        if (gVar.v()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.w()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.s()) {
            androidx.media3.common.text.i.b(spannable, new ForegroundColorSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.r()) {
            androidx.media3.common.text.i.b(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.e() != null) {
            androidx.media3.common.text.i.b(spannable, new TypefaceSpan(gVar.e()), i10, i11, 33);
        }
        if (gVar.q() != null) {
            b bVar = (b) androidx.media3.common.util.a.g(gVar.q());
            int i14 = bVar.f68670a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f68671b;
            }
            int i15 = bVar.f68672c;
            if (i15 == -2) {
                i15 = 1;
            }
            androidx.media3.common.text.i.b(spannable, new k(i14, i13, i15), i10, i11, 33);
        }
        int iL = gVar.l();
        if (iL == 2) {
            c cVarD = d(cVar, map);
            if (cVarD != null && (cVarE = e(cVarD, map)) != null) {
                if (cVarE.g() != 1 || cVarE.f(0).f68713b == null) {
                    z.h(f68760a, "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) k1.o(cVarE.f(0).f68713b);
                    g gVarF2 = f(cVarE.f68717f, cVarE.l(), map);
                    int iK = gVarF2 != null ? gVarF2.k() : -1;
                    if (iK == -1 && (gVarF = f(cVarD.f68717f, cVarD.l(), map)) != null) {
                        iK = gVarF.k();
                    }
                    spannable.setSpan(new androidx.media3.common.text.h(str, iK), i10, i11, 33);
                }
            }
        } else if (iL == 3 || iL == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.p()) {
            androidx.media3.common.text.i.b(spannable, new androidx.media3.common.text.f(), i10, i11, 33);
        }
        int iG = gVar.g();
        if (iG == 1) {
            androidx.media3.common.text.i.b(spannable, new AbsoluteSizeSpan((int) gVar.f(), true), i10, i11, 33);
        } else if (iG == 2) {
            androidx.media3.common.text.i.b(spannable, new RelativeSizeSpan(gVar.f()), i10, i11, 33);
        } else {
            if (iG != 3) {
                return;
            }
            androidx.media3.common.text.i.a(spannable, gVar.f() / 100.0f, i10, i11, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (spannableStringBuilder.charAt(length) == ' ');
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    @p0
    private static c d(@p0 c cVar, Map<String, g> map) {
        while (cVar != null) {
            g gVarF = f(cVar.f68717f, cVar.l(), map);
            if (gVarF != null && gVarF.l() == 1) {
                return cVar;
            }
            cVar = cVar.f68721j;
        }
        return null;
    }

    @p0
    private static c e(c cVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(cVar);
        while (!arrayDeque.isEmpty()) {
            c cVar2 = (c) arrayDeque.pop();
            g gVarF = f(cVar2.f68717f, cVar2.l(), map);
            if (gVarF != null && gVarF.l() == 3) {
                return cVar2;
            }
            for (int iG = cVar2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(cVar2.f(iG));
            }
        }
        return null;
    }

    @p0
    public static g f(@p0 g gVar, @p0 String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
