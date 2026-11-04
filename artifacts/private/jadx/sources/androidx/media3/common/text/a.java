package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f61367s = -3.4028235E38f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f61368t = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f61369u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f61370v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f61371w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f61372x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f61373y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f61374z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final CharSequence f61375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final Layout.Alignment f61376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final Layout.Alignment f61377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final Bitmap f61378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f61379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f61381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f61382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f61383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f61384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f61385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f61386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f61387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f61388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f61389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f61390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f61391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final a f61366r = new c().A("").a();
    private static final String E = k1.c1(0);
    private static final String F = k1.c1(17);
    private static final String G = k1.c1(1);
    private static final String H = k1.c1(2);
    private static final String I = k1.c1(3);
    private static final String J = k1.c1(18);
    private static final String K = k1.c1(4);
    private static final String L = k1.c1(5);
    private static final String M = k1.c1(6);
    private static final String N = k1.c1(7);
    private static final String O = k1.c1(8);
    private static final String P = k1.c1(9);
    private static final String Q = k1.c1(10);
    private static final String R = k1.c1(11);
    private static final String S = k1.c1(12);
    private static final String T = k1.c1(13);
    private static final String U = k1.c1(14);
    private static final String V = k1.c1(15);
    private static final String W = k1.c1(16);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @b1
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private CharSequence f61392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private Bitmap f61393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Layout.Alignment f61394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Layout.Alignment f61395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f61396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f61397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f61398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f61399h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f61400i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f61401j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f61402k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f61403l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f61404m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f61405n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @androidx.annotation.l
        private int f61406o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f61407p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f61408q;

        @z7.a
        public c A(CharSequence charSequence) {
            this.f61392a = charSequence;
            return this;
        }

        @z7.a
        public c B(@p0 Layout.Alignment alignment) {
            this.f61394c = alignment;
            return this;
        }

        @z7.a
        public c C(float f10, int i10) {
            this.f61402k = f10;
            this.f61401j = i10;
            return this;
        }

        @z7.a
        public c D(int i10) {
            this.f61407p = i10;
            return this;
        }

        @z7.a
        public c E(@androidx.annotation.l int i10) {
            this.f61406o = i10;
            this.f61405n = true;
            return this;
        }

        public a a() {
            return new a(this.f61392a, this.f61394c, this.f61395d, this.f61393b, this.f61396e, this.f61397f, this.f61398g, this.f61399h, this.f61400i, this.f61401j, this.f61402k, this.f61403l, this.f61404m, this.f61405n, this.f61406o, this.f61407p, this.f61408q);
        }

        @z7.a
        public c b() {
            this.f61405n = false;
            return this;
        }

        @p0
        @xl.d
        public Bitmap c() {
            return this.f61393b;
        }

        @xl.d
        public float d() {
            return this.f61404m;
        }

        @xl.d
        public float e() {
            return this.f61396e;
        }

        @xl.d
        public int f() {
            return this.f61398g;
        }

        @xl.d
        public int g() {
            return this.f61397f;
        }

        @xl.d
        public float h() {
            return this.f61399h;
        }

        @xl.d
        public int i() {
            return this.f61400i;
        }

        @xl.d
        public float j() {
            return this.f61403l;
        }

        @p0
        @xl.d
        public CharSequence k() {
            return this.f61392a;
        }

        @p0
        @xl.d
        public Layout.Alignment l() {
            return this.f61394c;
        }

        @xl.d
        public float m() {
            return this.f61402k;
        }

        @xl.d
        public int n() {
            return this.f61401j;
        }

        @xl.d
        public int o() {
            return this.f61407p;
        }

        @androidx.annotation.l
        @xl.d
        public int p() {
            return this.f61406o;
        }

        public boolean q() {
            return this.f61405n;
        }

        @z7.a
        public c r(Bitmap bitmap) {
            this.f61393b = bitmap;
            return this;
        }

        @z7.a
        public c s(float f10) {
            this.f61404m = f10;
            return this;
        }

        @z7.a
        public c t(float f10, int i10) {
            this.f61396e = f10;
            this.f61397f = i10;
            return this;
        }

        @z7.a
        public c u(int i10) {
            this.f61398g = i10;
            return this;
        }

        @z7.a
        public c v(@p0 Layout.Alignment alignment) {
            this.f61395d = alignment;
            return this;
        }

        @z7.a
        public c w(float f10) {
            this.f61399h = f10;
            return this;
        }

        @z7.a
        public c x(int i10) {
            this.f61400i = i10;
            return this;
        }

        @z7.a
        public c y(float f10) {
            this.f61408q = f10;
            return this;
        }

        @z7.a
        public c z(float f10) {
            this.f61403l = f10;
            return this;
        }

        public c() {
            this.f61392a = null;
            this.f61393b = null;
            this.f61394c = null;
            this.f61395d = null;
            this.f61396e = -3.4028235E38f;
            this.f61397f = Integer.MIN_VALUE;
            this.f61398g = Integer.MIN_VALUE;
            this.f61399h = -3.4028235E38f;
            this.f61400i = Integer.MIN_VALUE;
            this.f61401j = Integer.MIN_VALUE;
            this.f61402k = -3.4028235E38f;
            this.f61403l = -3.4028235E38f;
            this.f61404m = -3.4028235E38f;
            this.f61405n = false;
            this.f61406o = -16777216;
            this.f61407p = Integer.MIN_VALUE;
        }

        private c(a aVar) {
            this.f61392a = aVar.f61375a;
            this.f61393b = aVar.f61378d;
            this.f61394c = aVar.f61376b;
            this.f61395d = aVar.f61377c;
            this.f61396e = aVar.f61379e;
            this.f61397f = aVar.f61380f;
            this.f61398g = aVar.f61381g;
            this.f61399h = aVar.f61382h;
            this.f61400i = aVar.f61383i;
            this.f61401j = aVar.f61388n;
            this.f61402k = aVar.f61389o;
            this.f61403l = aVar.f61384j;
            this.f61404m = aVar.f61385k;
            this.f61405n = aVar.f61386l;
            this.f61406o = aVar.f61387m;
            this.f61407p = aVar.f61390p;
            this.f61408q = aVar.f61391q;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @b1
    public static a b(Bundle bundle) {
        c cVar = new c();
        CharSequence charSequence = bundle.getCharSequence(E);
        if (charSequence != null) {
            cVar.A(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(F);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    androidx.media3.common.text.e.c((Bundle) it.next(), spannableStringValueOf);
                }
                cVar.A(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(G);
        if (alignment != null) {
            cVar.B(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(H);
        if (alignment2 != null) {
            cVar.v(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(I);
        if (bitmap != null) {
            cVar.r(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(J);
            if (byteArray != null) {
                cVar.r(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = K;
        if (bundle.containsKey(str)) {
            String str2 = L;
            if (bundle.containsKey(str2)) {
                cVar.t(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = M;
        if (bundle.containsKey(str3)) {
            cVar.u(bundle.getInt(str3));
        }
        String str4 = N;
        if (bundle.containsKey(str4)) {
            cVar.w(bundle.getFloat(str4));
        }
        String str5 = O;
        if (bundle.containsKey(str5)) {
            cVar.x(bundle.getInt(str5));
        }
        String str6 = Q;
        if (bundle.containsKey(str6)) {
            String str7 = P;
            if (bundle.containsKey(str7)) {
                cVar.C(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = R;
        if (bundle.containsKey(str8)) {
            cVar.z(bundle.getFloat(str8));
        }
        String str9 = S;
        if (bundle.containsKey(str9)) {
            cVar.s(bundle.getFloat(str9));
        }
        String str10 = T;
        if (bundle.containsKey(str10)) {
            cVar.E(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(U, false)) {
            cVar.b();
        }
        String str11 = V;
        if (bundle.containsKey(str11)) {
            cVar.D(bundle.getInt(str11));
        }
        String str12 = W;
        if (bundle.containsKey(str12)) {
            cVar.y(bundle.getFloat(str12));
        }
        return cVar.a();
    }

    private Bundle e() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f61375a;
        if (charSequence != null) {
            bundle.putCharSequence(E, charSequence);
            CharSequence charSequence2 = this.f61375a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListA = androidx.media3.common.text.e.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(F, arrayListA);
                }
            }
        }
        bundle.putSerializable(G, this.f61376b);
        bundle.putSerializable(H, this.f61377c);
        bundle.putFloat(K, this.f61379e);
        bundle.putInt(L, this.f61380f);
        bundle.putInt(M, this.f61381g);
        bundle.putFloat(N, this.f61382h);
        bundle.putInt(O, this.f61383i);
        bundle.putInt(P, this.f61388n);
        bundle.putFloat(Q, this.f61389o);
        bundle.putFloat(R, this.f61384j);
        bundle.putFloat(S, this.f61385k);
        bundle.putBoolean(U, this.f61386l);
        bundle.putInt(T, this.f61387m);
        bundle.putInt(V, this.f61390p);
        bundle.putFloat(W, this.f61391q);
        return bundle;
    }

    @b1
    public c a() {
        return new c();
    }

    @b1
    public Bundle c() {
        Bundle bundleE = e();
        Bitmap bitmap = this.f61378d;
        if (bitmap != null) {
            bundleE.putParcelable(I, bitmap);
        }
        return bundleE;
    }

    @b1
    @Deprecated
    public Bundle d() {
        return c();
    }

    public boolean equals(@p0 Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f61375a, aVar.f61375a) && this.f61376b == aVar.f61376b && this.f61377c == aVar.f61377c && ((bitmap = this.f61378d) != null ? !((bitmap2 = aVar.f61378d) == null || !bitmap.sameAs(bitmap2)) : aVar.f61378d == null) && this.f61379e == aVar.f61379e && this.f61380f == aVar.f61380f && this.f61381g == aVar.f61381g && this.f61382h == aVar.f61382h && this.f61383i == aVar.f61383i && this.f61384j == aVar.f61384j && this.f61385k == aVar.f61385k && this.f61386l == aVar.f61386l && this.f61387m == aVar.f61387m && this.f61388n == aVar.f61388n && this.f61389o == aVar.f61389o && this.f61390p == aVar.f61390p && this.f61391q == aVar.f61391q) {
                return true;
            }
        }
        return false;
    }

    @b1
    public Bundle f() {
        Bundle bundleE = e();
        if (this.f61378d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            androidx.media3.common.util.a.i(this.f61378d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleE.putByteArray(J, byteArrayOutputStream.toByteArray());
        }
        return bundleE;
    }

    public int hashCode() {
        return Objects.hash(this.f61375a, this.f61376b, this.f61377c, this.f61378d, Float.valueOf(this.f61379e), Integer.valueOf(this.f61380f), Integer.valueOf(this.f61381g), Float.valueOf(this.f61382h), Integer.valueOf(this.f61383i), Float.valueOf(this.f61384j), Float.valueOf(this.f61385k), Boolean.valueOf(this.f61386l), Integer.valueOf(this.f61387m), Integer.valueOf(this.f61388n), Float.valueOf(this.f61389o), Integer.valueOf(this.f61390p), Float.valueOf(this.f61391q));
    }

    private a(@p0 CharSequence charSequence, @p0 Layout.Alignment alignment, @p0 Layout.Alignment alignment2, @p0 Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            androidx.media3.common.util.a.g(bitmap);
        } else {
            androidx.media3.common.util.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f61375a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f61375a = charSequence.toString();
        } else {
            this.f61375a = null;
        }
        this.f61376b = alignment;
        this.f61377c = alignment2;
        this.f61378d = bitmap;
        this.f61379e = f10;
        this.f61380f = i10;
        this.f61381g = i11;
        this.f61382h = f11;
        this.f61383i = i12;
        this.f61384j = f13;
        this.f61385k = f14;
        this.f61386l = z10;
        this.f61387m = i14;
        this.f61388n = i13;
        this.f61389o = f12;
        this.f61390p = i15;
        this.f61391q = f15;
    }
}
