package androidx.media2.exoplayer.external.text.webvtt;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.p;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e extends androidx.media2.exoplayer.external.text.b {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public final long f56976g3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final long f56977p2;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56978a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f56978a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56978a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56978a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f56979k = "WebvttCueBuilder";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f56980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f56981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SpannableStringBuilder f56982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f56983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f56984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f56985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f56986g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f56987h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f56988i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f56989j;

        public b() {
            c();
        }

        private b b() {
            Layout.Alignment alignment = this.f56983d;
            if (alignment == null) {
                this.f56988i = Integer.MIN_VALUE;
                return this;
            }
            int i10 = a.f56978a[alignment.ordinal()];
            if (i10 == 1) {
                this.f56988i = 0;
                return this;
            }
            if (i10 == 2) {
                this.f56988i = 1;
                return this;
            }
            if (i10 == 3) {
                this.f56988i = 2;
                return this;
            }
            String strValueOf = String.valueOf(this.f56983d);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("Unrecognized alignment: ");
            sb2.append(strValueOf);
            p.l(f56979k, sb2.toString());
            this.f56988i = 0;
            return this;
        }

        public e a() {
            if (this.f56987h != Float.MIN_VALUE && this.f56988i == Integer.MIN_VALUE) {
                b();
            }
            return new e(this.f56980a, this.f56981b, this.f56982c, this.f56983d, this.f56984e, this.f56985f, this.f56986g, this.f56987h, this.f56988i, this.f56989j);
        }

        public void c() {
            this.f56980a = 0L;
            this.f56981b = 0L;
            this.f56982c = null;
            this.f56983d = null;
            this.f56984e = Float.MIN_VALUE;
            this.f56985f = Integer.MIN_VALUE;
            this.f56986g = Integer.MIN_VALUE;
            this.f56987h = Float.MIN_VALUE;
            this.f56988i = Integer.MIN_VALUE;
            this.f56989j = Float.MIN_VALUE;
        }

        public b d(long time) {
            this.f56981b = time;
            return this;
        }

        public b e(float line) {
            this.f56984e = line;
            return this;
        }

        public b f(int lineAnchor) {
            this.f56986g = lineAnchor;
            return this;
        }

        public b g(int lineType) {
            this.f56985f = lineType;
            return this;
        }

        public b h(float position) {
            this.f56987h = position;
            return this;
        }

        public b i(int positionAnchor) {
            this.f56988i = positionAnchor;
            return this;
        }

        public b j(long time) {
            this.f56980a = time;
            return this;
        }

        public b k(SpannableStringBuilder aText) {
            this.f56982c = aText;
            return this;
        }

        public b l(Layout.Alignment textAlignment) {
            this.f56983d = textAlignment;
            return this;
        }

        public b m(float width) {
            this.f56989j = width;
            return this;
        }
    }

    public e(CharSequence text) {
        this(0L, 0L, text);
    }

    public boolean k() {
        return this.f56547d == Float.MIN_VALUE && this.f56550g == Float.MIN_VALUE;
    }

    public e(long startTime, long endTime, CharSequence text) {
        this(startTime, endTime, text, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public e(long startTime, long endTime, CharSequence text, Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float width) {
        super(text, textAlignment, line, lineType, lineAnchor, position, positionAnchor, width);
        this.f56977p2 = startTime;
        this.f56976g3 = endTime;
    }
}
