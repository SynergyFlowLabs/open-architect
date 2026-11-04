package androidx.core.text;

import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.k1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.o;
import androidx.core.util.t;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Spannable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f48250e = '\n';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f48251f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    @b0("sLock")
    private static Executor f48252g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Spannable f48253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final b f48254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final int[] f48255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final PrecomputedText f48256d;

    @w0(28)
    static class a {
        private a() {
        }

        static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    private static class c extends FutureTask<g> {

        private static class a implements Callable<g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private b f48266a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private CharSequence f48267b;

            a(@NonNull b bVar, @NonNull CharSequence charSequence) {
                this.f48266a = bVar;
                this.f48267b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g call() throws Exception {
                return g.a(this.f48267b, this.f48266a);
            }
        }

        c(@NonNull b bVar, @NonNull CharSequence charSequence) {
            super(new a(bVar, charSequence));
        }
    }

    private g(@NonNull CharSequence charSequence, @NonNull b bVar, @NonNull int[] iArr) {
        this.f48253a = new SpannableString(charSequence);
        this.f48254b = bVar;
        this.f48255c = iArr;
        this.f48256d = null;
    }

    @e.a({"WrongConstant"})
    public static g a(@NonNull CharSequence charSequence, @NonNull b bVar) {
        t.l(charSequence);
        t.l(bVar);
        try {
            Trace.beginSection("PrecomputedText");
            PrecomputedText.Params params = bVar.f48261e;
            if (params != null) {
                g gVar = new g(PrecomputedText.create(charSequence, params), bVar);
                Trace.endSection();
                return gVar;
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i10, length);
                i10 = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i10));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), bVar.e(), Integer.MAX_VALUE).setBreakStrategy(bVar.b()).setHyphenationFrequency(bVar.c()).setTextDirection(bVar.d()).build();
            g gVar2 = new g(charSequence, bVar, iArr);
            Trace.endSection();
            return gVar2;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @k1
    public static Future<g> g(@NonNull CharSequence charSequence, @NonNull b bVar, @p0 Executor executor) {
        c cVar = new c(bVar, charSequence);
        if (executor == null) {
            synchronized (f48251f) {
                try {
                    if (f48252g == null) {
                        f48252g = Executors.newFixedThreadPool(1);
                    }
                    executor = f48252g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        executor.execute(cVar);
        return cVar;
    }

    @g0(from = 0)
    public int b() {
        return this.f48256d.getParagraphCount();
    }

    @g0(from = 0)
    public int c(@g0(from = 0) int i10) {
        t.g(i10, 0, b(), "paraIndex");
        return this.f48256d.getParagraphEnd(i10);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f48253a.charAt(i10);
    }

    @g0(from = 0)
    public int d(@g0(from = 0) int i10) {
        t.g(i10, 0, b(), "paraIndex");
        return this.f48256d.getParagraphStart(i10);
    }

    @NonNull
    public b e() {
        return this.f48254b;
    }

    @w0(28)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public PrecomputedText f() {
        Spannable spannable = this.f48253a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f48253a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f48253a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f48253a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f48256d.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f48253a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f48253a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        this.f48256d.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        this.f48256d.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f48253a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f48253a.toString();
    }

    @w0(28)
    private g(@NonNull PrecomputedText precomputedText, @NonNull b bVar) {
        this.f48253a = a.a(precomputedText);
        this.f48254b = bVar;
        this.f48255c = null;
        this.f48256d = precomputedText;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final TextPaint f48257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final TextDirectionHeuristic f48258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f48260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f48261e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NonNull
            private final TextPaint f48262a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f48264c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f48265d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f48263b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(@NonNull TextPaint textPaint) {
                this.f48262a = textPaint;
            }

            @NonNull
            public b a() {
                return new b(this.f48262a, this.f48263b, this.f48264c, this.f48265d);
            }

            @w0(23)
            public a b(int i10) {
                this.f48264c = i10;
                return this;
            }

            @w0(23)
            public a c(int i10) {
                this.f48265d = i10;
                return this;
            }

            public a d(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.f48263b = textDirectionHeuristic;
                return this;
            }
        }

        b(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f48261e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            this.f48257a = textPaint;
            this.f48258b = textDirectionHeuristic;
            this.f48259c = i10;
            this.f48260d = i11;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean a(@NonNull b bVar) {
            if (this.f48259c != bVar.b() || this.f48260d != bVar.c() || this.f48257a.getTextSize() != bVar.e().getTextSize() || this.f48257a.getTextScaleX() != bVar.e().getTextScaleX() || this.f48257a.getTextSkewX() != bVar.e().getTextSkewX() || this.f48257a.getLetterSpacing() != bVar.e().getLetterSpacing() || !TextUtils.equals(this.f48257a.getFontFeatureSettings(), bVar.e().getFontFeatureSettings()) || this.f48257a.getFlags() != bVar.e().getFlags() || !this.f48257a.getTextLocales().equals(bVar.e().getTextLocales())) {
                return false;
            }
            if (this.f48257a.getTypeface() == null) {
                return bVar.e().getTypeface() == null;
            }
            return this.f48257a.getTypeface().equals(bVar.e().getTypeface());
        }

        @w0(23)
        public int b() {
            return this.f48259c;
        }

        @w0(23)
        public int c() {
            return this.f48260d;
        }

        @p0
        public TextDirectionHeuristic d() {
            return this.f48258b;
        }

        @NonNull
        public TextPaint e() {
            return this.f48257a;
        }

        public boolean equals(@p0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return a(bVar) && this.f48258b == bVar.d();
        }

        public int hashCode() {
            return o.b(Float.valueOf(this.f48257a.getTextSize()), Float.valueOf(this.f48257a.getTextScaleX()), Float.valueOf(this.f48257a.getTextSkewX()), Float.valueOf(this.f48257a.getLetterSpacing()), Integer.valueOf(this.f48257a.getFlags()), this.f48257a.getTextLocales(), this.f48257a.getTypeface(), Boolean.valueOf(this.f48257a.isElegantTextHeight()), this.f48258b, Integer.valueOf(this.f48259c), Integer.valueOf(this.f48260d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f48257a.getTextSize());
            sb2.append(", textScaleX=" + this.f48257a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f48257a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f48257a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f48257a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f48257a.getTextLocales());
            sb2.append(", typeface=" + this.f48257a.getTypeface());
            sb2.append(", variationSettings=" + this.f48257a.getFontVariationSettings());
            sb2.append(", textDir=" + this.f48258b);
            sb2.append(", breakStrategy=" + this.f48259c);
            sb2.append(", hyphenationFrequency=" + this.f48260d);
            sb2.append("}");
            return sb2.toString();
        }

        @w0(28)
        public b(@NonNull PrecomputedText.Params params) {
            this.f48257a = params.getTextPaint();
            this.f48258b = params.getTextDirection();
            this.f48259c = params.getBreakStrategy();
            this.f48260d = params.getHyphenationFrequency();
            this.f48261e = params;
        }
    }
}
