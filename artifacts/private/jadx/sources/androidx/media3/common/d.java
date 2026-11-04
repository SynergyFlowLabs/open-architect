package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f60472g = new e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f60473h = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f60474i = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f60475j = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f60476k = androidx.media3.common.util.k1.c1(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f60477l = androidx.media3.common.util.k1.c1(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f60481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f60482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private C0567d f60483f;

    @androidx.annotation.w0(29)
    private static final class b {
        private b() {
        }

        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    @androidx.annotation.w0(32)
    private static final class c {
        private c() {
        }

        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.d$d, reason: collision with other inner class name */
    public static final class C0567d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f60484a;

        private C0567d(d dVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f60478a).setFlags(dVar.f60479b).setUsage(dVar.f60480c);
            int i10 = androidx.media3.common.util.k1.f61540a;
            if (i10 >= 29) {
                b.a(usage, dVar.f60481d);
            }
            if (i10 >= 32) {
                c.a(usage, dVar.f60482e);
            }
            this.f60484a = usage.build();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f60485a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f60486b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f60487c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f60488d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f60489e = 0;

        public d a() {
            return new d(this.f60485a, this.f60486b, this.f60487c, this.f60488d, this.f60489e);
        }

        @z7.a
        public e b(int i10) {
            this.f60488d = i10;
            return this;
        }

        @z7.a
        public e c(int i10) {
            this.f60485a = i10;
            return this;
        }

        @z7.a
        public e d(int i10) {
            this.f60486b = i10;
            return this;
        }

        @z7.a
        public e e(int i10) {
            this.f60489e = i10;
            return this;
        }

        @z7.a
        public e f(int i10) {
            this.f60487c = i10;
            return this;
        }
    }

    @androidx.media3.common.util.b1
    public static d a(Bundle bundle) {
        e eVar = new e();
        String str = f60473h;
        if (bundle.containsKey(str)) {
            eVar.c(bundle.getInt(str));
        }
        String str2 = f60474i;
        if (bundle.containsKey(str2)) {
            eVar.d(bundle.getInt(str2));
        }
        String str3 = f60475j;
        if (bundle.containsKey(str3)) {
            eVar.f(bundle.getInt(str3));
        }
        String str4 = f60476k;
        if (bundle.containsKey(str4)) {
            eVar.b(bundle.getInt(str4));
        }
        String str5 = f60477l;
        if (bundle.containsKey(str5)) {
            eVar.e(bundle.getInt(str5));
        }
        return eVar.a();
    }

    public C0567d b() {
        if (this.f60483f == null) {
            this.f60483f = new C0567d();
        }
        return this.f60483f;
    }

    @androidx.media3.common.util.b1
    public int c() {
        if ((this.f60479b & 1) == 1) {
            return 1;
        }
        switch (this.f60480c) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    @androidx.media3.common.util.b1
    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putInt(f60473h, this.f60478a);
        bundle.putInt(f60474i, this.f60479b);
        bundle.putInt(f60475j, this.f60480c);
        bundle.putInt(f60476k, this.f60481d);
        bundle.putInt(f60477l, this.f60482e);
        return bundle;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f60478a == dVar.f60478a && this.f60479b == dVar.f60479b && this.f60480c == dVar.f60480c && this.f60481d == dVar.f60481d && this.f60482e == dVar.f60482e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f60478a) * 31) + this.f60479b) * 31) + this.f60480c) * 31) + this.f60481d) * 31) + this.f60482e;
    }

    private d(int i10, int i11, int i12, int i13, int i14) {
        this.f60478a = i10;
        this.f60479b = i11;
        this.f60480c = i12;
        this.f60481d = i13;
        this.f60482e = i14;
    }
}
