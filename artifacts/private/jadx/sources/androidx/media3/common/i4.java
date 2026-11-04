package androidx.media3.common;

import android.os.Bundle;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i4 f60639b = new i4(l6.F());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f60640c = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l6<a> f60641a;

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f60642f = androidx.media3.common.util.k1.c1(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f60643g = androidx.media3.common.util.k1.c1(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f60644h = androidx.media3.common.util.k1.c1(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f60645i = androidx.media3.common.util.k1.c1(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b4 f60647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f60648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f60649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f60650e;

        @androidx.media3.common.util.b1
        public a(b4 b4Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = b4Var.f60459a;
            this.f60646a = i10;
            boolean z11 = false;
            androidx.media3.common.util.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f60647b = b4Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f60648c = z11;
            this.f60649d = (int[]) iArr.clone();
            this.f60650e = (boolean[]) zArr.clone();
        }

        @androidx.media3.common.util.b1
        public static a b(Bundle bundle) {
            b4 b4VarB = b4.b((Bundle) androidx.media3.common.util.a.g(bundle.getBundle(f60642f)));
            return new a(b4VarB, bundle.getBoolean(f60645i, false), (int[]) com.google.common.base.b0.a(bundle.getIntArray(f60643g), new int[b4VarB.f60459a]), (boolean[]) com.google.common.base.b0.a(bundle.getBooleanArray(f60644h), new boolean[b4VarB.f60459a]));
        }

        @androidx.media3.common.util.b1
        public a a(String str) {
            return new a(this.f60647b.a(str), this.f60648c, this.f60649d, this.f60650e);
        }

        public b4 c() {
            return this.f60647b;
        }

        public w d(int i10) {
            return this.f60647b.c(i10);
        }

        @androidx.media3.common.util.b1
        public int e(int i10) {
            return this.f60649d[i10];
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f60648c == aVar.f60648c && this.f60647b.equals(aVar.f60647b) && Arrays.equals(this.f60649d, aVar.f60649d) && Arrays.equals(this.f60650e, aVar.f60650e)) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            return this.f60647b.f60461c;
        }

        public boolean g() {
            return this.f60648c;
        }

        public boolean h() {
            return com.google.common.primitives.a.g(this.f60650e, true);
        }

        public int hashCode() {
            return (((((this.f60647b.hashCode() * 31) + (this.f60648c ? 1 : 0)) * 31) + Arrays.hashCode(this.f60649d)) * 31) + Arrays.hashCode(this.f60650e);
        }

        public boolean i() {
            return j(false);
        }

        public boolean j(boolean z10) {
            for (int i10 = 0; i10 < this.f60649d.length; i10++) {
                if (m(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean k(int i10) {
            return this.f60650e[i10];
        }

        public boolean l(int i10) {
            return m(i10, false);
        }

        public boolean m(int i10, boolean z10) {
            int i11 = this.f60649d[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }

        public Bundle n() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f60642f, this.f60647b.h());
            bundle.putIntArray(f60643g, this.f60649d);
            bundle.putBooleanArray(f60644h, this.f60650e);
            bundle.putBoolean(f60645i, this.f60648c);
            return bundle;
        }
    }

    @androidx.media3.common.util.b1
    public i4(List<a> list) {
        this.f60641a = l6.w(list);
    }

    @androidx.media3.common.util.b1
    public static i4 b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60640c);
        return new i4(parcelableArrayList == null ? l6.F() : androidx.media3.common.util.i.d(new com.google.common.base.t() { // from class: androidx.media3.common.h4
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return i4.a.b((Bundle) obj);
            }
        }, parcelableArrayList));
    }

    public boolean a(int i10) {
        for (int i11 = 0; i11 < this.f60641a.size(); i11++) {
            if (this.f60641a.get(i11).f() == i10) {
                return true;
            }
        }
        return false;
    }

    public l6<a> c() {
        return this.f60641a;
    }

    public boolean d() {
        return this.f60641a.isEmpty();
    }

    public boolean e(int i10) {
        for (int i11 = 0; i11 < this.f60641a.size(); i11++) {
            a aVar = this.f60641a.get(i11);
            if (aVar.h() && aVar.f() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i4.class != obj.getClass()) {
            return false;
        }
        return this.f60641a.equals(((i4) obj).f60641a);
    }

    public boolean f(int i10) {
        return g(i10, false);
    }

    public boolean g(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f60641a.size(); i11++) {
            if (this.f60641a.get(i11).f() == i10 && this.f60641a.get(i11).j(z10)) {
                return true;
            }
        }
        return false;
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public boolean h(int i10) {
        return i(i10, false);
    }

    public int hashCode() {
        return this.f60641a.hashCode();
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public boolean i(int i10, boolean z10) {
        return !a(i10) || g(i10, z10);
    }

    @androidx.media3.common.util.b1
    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f60640c, androidx.media3.common.util.i.i(this.f60641a, new com.google.common.base.t() { // from class: androidx.media3.common.g4
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return ((i4.a) obj).n();
            }
        }));
        return bundle;
    }
}
