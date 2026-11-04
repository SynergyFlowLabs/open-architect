package androidx.compose.ui.text.input;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41811b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41812c = l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41813d = l(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41814e = l(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f41815f = l(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41816g = l(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f41817h = l(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f41818i = l(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f41819j = l(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f41820k = l(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f41821l = l(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41822a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @k7
        public static /* synthetic */ void d() {
        }

        @k7
        public static /* synthetic */ void f() {
        }

        @k7
        public static /* synthetic */ void h() {
        }

        @k7
        public static /* synthetic */ void j() {
        }

        @k7
        public static /* synthetic */ void l() {
        }

        @k7
        public static /* synthetic */ void n() {
        }

        @k7
        public static /* synthetic */ void p() {
        }

        @k7
        public static /* synthetic */ void r() {
        }

        @k7
        public static /* synthetic */ void t() {
        }

        public final int a() {
            return b0.f41814e;
        }

        public final int c() {
            return b0.f41821l;
        }

        public final int e() {
            return b0.f41818i;
        }

        public final int g() {
            return b0.f41815f;
        }

        public final int i() {
            return b0.f41820k;
        }

        public final int k() {
            return b0.f41819j;
        }

        public final int m() {
            return b0.f41816g;
        }

        public final int o() {
            return b0.f41813d;
        }

        public final int q() {
            return b0.f41812c;
        }

        public final int s() {
            return b0.f41817h;
        }

        private a() {
        }
    }

    private /* synthetic */ b0(int i10) {
        this.f41822a = i10;
    }

    public static final /* synthetic */ b0 k(int i10) {
        return new b0(i10);
    }

    private static int l(int i10) {
        return i10;
    }

    public static boolean m(int i10, Object obj) {
        return (obj instanceof b0) && i10 == ((b0) obj).q();
    }

    public static final boolean n(int i10, int i11) {
        return i10 == i11;
    }

    public static int o(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String p(int i10) {
        if (n(i10, f41812c)) {
            return "Unspecified";
        }
        if (n(i10, f41813d)) {
            return "Text";
        }
        if (n(i10, f41814e)) {
            return "Ascii";
        }
        if (n(i10, f41815f)) {
            return "Number";
        }
        if (n(i10, f41816g)) {
            return "Phone";
        }
        if (n(i10, f41817h)) {
            return "Uri";
        }
        if (n(i10, f41818i)) {
            return "Email";
        }
        if (n(i10, f41819j)) {
            return "Password";
        }
        if (n(i10, f41820k)) {
            return "NumberPassword";
        }
        return n(i10, f41821l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.f41822a, obj);
    }

    public int hashCode() {
        return o(this.f41822a);
    }

    public final /* synthetic */ int q() {
        return this.f41822a;
    }

    @NotNull
    public String toString() {
        return p(this.f41822a);
    }
}
