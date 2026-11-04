package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class v7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f16497b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f16501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f16502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f16503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f16504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f16505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f16506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f16507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f16508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f16509n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16510a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return v7.f16498c;
        }

        public final int b() {
            return v7.f16500e;
        }

        public final int c() {
            return v7.f16499d;
        }

        public final int d() {
            return v7.f16501f;
        }

        public final int e() {
            return v7.f16505j;
        }

        public final int f() {
            return v7.f16503h;
        }

        public final int g() {
            return v7.f16508m;
        }

        public final int h() {
            return v7.f16506k;
        }

        public final int i() {
            return v7.f16507l;
        }

        public final int j() {
            return v7.f16502g;
        }

        public final int k() {
            return v7.f16504i;
        }

        public final int l() {
            return v7.f16509n;
        }

        private a() {
        }
    }

    static {
        int iN = n(8);
        f16498c = iN;
        int iN2 = n(4);
        f16499d = iN2;
        int iN3 = n(2);
        f16500e = iN3;
        int iN4 = n(1);
        f16501f = iN4;
        f16502g = s(iN, iN4);
        f16503h = s(iN2, iN3);
        int iN5 = n(16);
        f16504i = iN5;
        int iN6 = n(32);
        f16505j = iN6;
        int iS = s(iN, iN3);
        f16506k = iS;
        int iS2 = s(iN2, iN4);
        f16507l = iS2;
        f16508m = s(iS, iS2);
        f16509n = s(iN5, iN6);
    }

    private /* synthetic */ v7(int i10) {
        this.f16510a = i10;
    }

    public static final /* synthetic */ v7 m(int i10) {
        return new v7(i10);
    }

    private static int n(int i10) {
        return i10;
    }

    public static boolean o(int i10, Object obj) {
        return (obj instanceof v7) && i10 == ((v7) obj).u();
    }

    public static final boolean p(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean q(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int r(int i10) {
        return Integer.hashCode(i10);
    }

    public static final int s(int i10, int i11) {
        return n(i10 | i11);
    }

    @NotNull
    public static String t(int i10) {
        return "WindowInsetsSides(" + v(i10) + ')';
    }

    private static final String v(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f16502g;
        if ((i10 & i11) == i11) {
            w(sb2, "Start");
        }
        int i12 = f16506k;
        if ((i10 & i12) == i12) {
            w(sb2, "Left");
        }
        int i13 = f16504i;
        if ((i10 & i13) == i13) {
            w(sb2, "Top");
        }
        int i14 = f16503h;
        if ((i10 & i14) == i14) {
            w(sb2, "End");
        }
        int i15 = f16507l;
        if ((i10 & i15) == i15) {
            w(sb2, "Right");
        }
        int i16 = f16505j;
        if ((i10 & i16) == i16) {
            w(sb2, "Bottom");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final void w(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public boolean equals(Object obj) {
        return o(this.f16510a, obj);
    }

    public int hashCode() {
        return r(this.f16510a);
    }

    @NotNull
    public String toString() {
        return t(this.f16510a);
    }

    public final /* synthetic */ int u() {
        return this.f16510a;
    }
}
