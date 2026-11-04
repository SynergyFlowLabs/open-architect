package androidx.media3.common;

import android.os.Bundle;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f61001e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61002f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f61003g = new b(0).e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f61004h = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f61005i = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f61006j = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f61007k = androidx.media3.common.util.k1.c1(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.g0(from = 0)
    public final int f61009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.g0(from = 0)
    public final int f61010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f61011d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f61012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f61013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f61014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private String f61015d;

        public b(int i10) {
            this.f61012a = i10;
        }

        public o e() {
            androidx.media3.common.util.a.a(this.f61013b <= this.f61014c);
            return new o(this);
        }

        @z7.a
        public b f(@androidx.annotation.g0(from = 0) int i10) {
            this.f61014c = i10;
            return this;
        }

        @z7.a
        public b g(@androidx.annotation.g0(from = 0) int i10) {
            this.f61013b = i10;
            return this;
        }

        @z7.a
        public b h(@androidx.annotation.p0 String str) {
            androidx.media3.common.util.a.a(this.f61012a != 0 || str == null);
            this.f61015d = str;
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @androidx.media3.common.util.b1
    public static o a(Bundle bundle) {
        int i10 = bundle.getInt(f61004h, 0);
        int i11 = bundle.getInt(f61005i, 0);
        int i12 = bundle.getInt(f61006j, 0);
        return new b(i10).g(i11).f(i12).h(bundle.getString(f61007k)).e();
    }

    @androidx.media3.common.util.b1
    public Bundle b() {
        Bundle bundle = new Bundle();
        int i10 = this.f61008a;
        if (i10 != 0) {
            bundle.putInt(f61004h, i10);
        }
        int i11 = this.f61009b;
        if (i11 != 0) {
            bundle.putInt(f61005i, i11);
        }
        int i12 = this.f61010c;
        if (i12 != 0) {
            bundle.putInt(f61006j, i12);
        }
        String str = this.f61011d;
        if (str != null) {
            bundle.putString(f61007k, str);
        }
        return bundle;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f61008a == oVar.f61008a && this.f61009b == oVar.f61009b && this.f61010c == oVar.f61010c && Objects.equals(this.f61011d, oVar.f61011d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f61008a) * 31) + this.f61009b) * 31) + this.f61010c) * 31;
        String str = this.f61011d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public o(int i10, @androidx.annotation.g0(from = 0) int i11, @androidx.annotation.g0(from = 0) int i12) {
        this(new b(i10).g(i11).f(i12));
    }

    private o(b bVar) {
        this.f61008a = bVar.f61012a;
        this.f61009b = bVar.f61013b;
        this.f61010c = bVar.f61014c;
        this.f61011d = bVar.f61015d;
    }
}
