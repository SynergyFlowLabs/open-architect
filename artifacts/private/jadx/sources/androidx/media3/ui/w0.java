package androidx.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.common.collect.n6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f70521a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f70523b;

        private b(String str, Map<String, String> map) {
            this.f70522a = str;
            this.f70523b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator<c> f70524e = new Comparator() { // from class: androidx.media3.ui.x0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return w0.c.b((w0.c) obj, (w0.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator<c> f70525f = new Comparator() { // from class: androidx.media3.ui.y0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return w0.c.a((w0.c) obj, (w0.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f70527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f70529d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f70526a, cVar.f70526a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f70528c.compareTo(cVar.f70528c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f70529d.compareTo(cVar.f70529d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f70527b, cVar.f70527b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f70528c.compareTo(cVar2.f70528c);
            return iCompareTo != 0 ? iCompareTo : cVar.f70529d.compareTo(cVar2.f70529d);
        }

        private c(int i10, int i11, String str, String str2) {
            this.f70526a = i10;
            this.f70527b = i11;
            this.f70528c = str;
            this.f70529d = str2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f70530a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<c> f70531b = new ArrayList();
    }

    private w0() {
    }

    public static b a(@androidx.annotation.p0 CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", n6.q());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), n6.q());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(h.a("bg_" + iIntValue), androidx.media3.common.util.k1.S("background-color:%s;", h.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f70531b, c.f70525f);
            Iterator it2 = dVar.f70531b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f70529d);
            }
            Collections.sort(dVar.f70530a, c.f70524e);
            Iterator it3 = dVar.f70530a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f70528c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f70521a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f10) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f10);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                androidx.media3.common.util.a.g(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f70530a.add(cVar);
                f(sparseArray, spanEnd).f70531b.add(cVar);
            }
        }
        return sparseArray;
    }

    @androidx.annotation.p0
    private static String d(Object obj) {
        if (!(obj instanceof StrikethroughSpan) && !(obj instanceof ForegroundColorSpan) && !(obj instanceof BackgroundColorSpan) && !(obj instanceof androidx.media3.common.text.f) && !(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan) && !(obj instanceof androidx.media3.common.text.k)) {
            if (obj instanceof TypefaceSpan) {
                if (((TypefaceSpan) obj).getFamily() != null) {
                    return "</span>";
                }
                return null;
            }
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "</b>";
                }
                int i10 = 7 & 2;
                if (style == 2) {
                    return "</i>";
                }
                if (style == 3) {
                    return "</i></b>";
                }
            } else {
                if (obj instanceof androidx.media3.common.text.h) {
                    return "<rt>" + b(((androidx.media3.common.text.h) obj).f61426a) + "</rt></ruby>";
                }
                if (obj instanceof UnderlineSpan) {
                    return "</u>";
                }
            }
            return null;
        }
        return "</span>";
    }

    @androidx.annotation.p0
    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return androidx.media3.common.util.k1.S("<span style='color:%s;'>", h.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return androidx.media3.common.util.k1.S("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof androidx.media3.common.text.f) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return androidx.media3.common.util.k1.S("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return androidx.media3.common.util.k1.S("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return androidx.media3.common.util.k1.S("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof androidx.media3.common.text.h)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof androidx.media3.common.text.k)) {
                return null;
            }
            androidx.media3.common.text.k kVar = (androidx.media3.common.text.k) obj;
            return androidx.media3.common.util.k1.S("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(kVar.f61441a, kVar.f61442b), g(kVar.f61443c));
        }
        int i10 = ((androidx.media3.common.text.h) obj).f61427b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar == null) {
            dVar = new d();
            sparseArray.put(i10, dVar);
        }
        return dVar;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append(androidx.media3.extractor.text.ttml.c.A0);
        } else if (i10 == 2) {
            sb2.append(androidx.media3.extractor.text.ttml.c.f68709y0);
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append(androidx.media3.extractor.text.ttml.c.f68711z0);
        }
        return sb2.toString();
    }
}
