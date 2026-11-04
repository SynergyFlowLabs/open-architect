package androidx.compose.ui.text.style;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42154b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42158f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42159a;

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

        public final int a() {
            return f.f42156d;
        }

        public final int c() {
            return f.f42157e;
        }

        public final int e() {
            return f.f42155c;
        }

        public final int g() {
            return f.f42158f;
        }

        private a() {
        }
    }

    @oj.g
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f42160b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f42161c = f(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f42162d = f(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f42163e = f(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f42164f = f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42165a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f42163e;
            }

            public final int b() {
                return b.f42162d;
            }

            public final int c() {
                return b.f42161c;
            }

            public final int d() {
                return b.f42164f;
            }

            private a() {
            }
        }

        private /* synthetic */ b(int i10) {
            this.f42165a = i10;
        }

        public static final /* synthetic */ b e(int i10) {
            return new b(i10);
        }

        public static int f(int i10) {
            return i10;
        }

        public static boolean g(int i10, Object obj) {
            int i11 = 7 & 0;
            return (obj instanceof b) && i10 == ((b) obj).k();
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }

        public static int i(int i10) {
            return Integer.hashCode(i10);
        }

        @NotNull
        public static String j(int i10) {
            if (h(i10, f42161c)) {
                return "Strategy.Simple";
            }
            if (h(i10, f42162d)) {
                return "Strategy.HighQuality";
            }
            if (h(i10, f42163e)) {
                return "Strategy.Balanced";
            }
            return h(i10, f42164f) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.f42165a, obj);
        }

        public int hashCode() {
            return i(this.f42165a);
        }

        public final /* synthetic */ int k() {
            return this.f42165a;
        }

        @NotNull
        public String toString() {
            return j(this.f42165a);
        }
    }

    @oj.g
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f42166b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f42167c = g(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f42168d = g(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f42169e = g(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f42170f = g(4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f42171g = g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42172a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f42167c;
            }

            public final int b() {
                return c.f42168d;
            }

            public final int c() {
                return c.f42169e;
            }

            public final int d() {
                return c.f42170f;
            }

            public final int e() {
                return c.f42171g;
            }

            private a() {
            }
        }

        static {
            int i10 = 7 >> 3;
        }

        private /* synthetic */ c(int i10) {
            this.f42172a = i10;
        }

        public static final /* synthetic */ c f(int i10) {
            return new c(i10);
        }

        public static int g(int i10) {
            return i10;
        }

        public static boolean h(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).l();
        }

        public static final boolean i(int i10, int i11) {
            return i10 == i11;
        }

        public static int j(int i10) {
            return Integer.hashCode(i10);
        }

        @NotNull
        public static String k(int i10) {
            if (i(i10, f42167c)) {
                return "Strictness.None";
            }
            if (i(i10, f42168d)) {
                return "Strictness.Loose";
            }
            if (i(i10, f42169e)) {
                return "Strictness.Normal";
            }
            if (i(i10, f42170f)) {
                return "Strictness.Strict";
            }
            return i(i10, f42171g) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return h(this.f42172a, obj);
        }

        public int hashCode() {
            return j(this.f42172a);
        }

        public final /* synthetic */ int l() {
            return this.f42172a;
        }

        @NotNull
        public String toString() {
            return k(this.f42172a);
        }
    }

    @oj.g
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f42173b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f42174c = e(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f42175d = e(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f42176e = e(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42177a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f42174c;
            }

            public final int b() {
                return d.f42175d;
            }

            public final int c() {
                return d.f42176e;
            }

            private a() {
            }
        }

        private /* synthetic */ d(int i10) {
            this.f42177a = i10;
        }

        public static final /* synthetic */ d d(int i10) {
            return new d(i10);
        }

        public static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof d) && i10 == ((d) obj).j();
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return Integer.hashCode(i10);
        }

        @NotNull
        public static String i(int i10) {
            if (g(i10, f42174c)) {
                return "WordBreak.None";
            }
            if (g(i10, f42175d)) {
                return "WordBreak.Phrase";
            }
            return g(i10, f42176e) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f42177a, obj);
        }

        public int hashCode() {
            return h(this.f42177a);
        }

        public final /* synthetic */ int j() {
            return this.f42177a;
        }

        @NotNull
        public String toString() {
            return i(this.f42177a);
        }
    }

    static {
        b.a aVar = b.f42160b;
        int iC = aVar.c();
        c.a aVar2 = c.f42166b;
        int iC2 = aVar2.c();
        d.a aVar3 = d.f42173b;
        f42155c = f(g.e(iC, iC2, aVar3.a()));
        f42156d = f(g.e(aVar.a(), aVar2.b(), aVar3.b()));
        f42157e = f(g.e(aVar.b(), aVar2.d(), aVar3.a()));
        f42158f = f(0);
    }

    private /* synthetic */ f(int i10) {
        this.f42159a = i10;
    }

    public static final /* synthetic */ f e(int i10) {
        return new f(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static int g(int i10, int i11, int i12) {
        return f(g.e(i10, i11, i12));
    }

    public static final int h(int i10, int i11, int i12, int i13) {
        return g(i11, i12, i13);
    }

    public static /* synthetic */ int i(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = l(i10);
        }
        if ((i14 & 2) != 0) {
            i12 = m(i10);
        }
        if ((i14 & 4) != 0) {
            i13 = n(i10);
        }
        return h(i10, i11, i12, i13);
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof f) && i10 == ((f) obj).q();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static final int l(int i10) {
        return b.f(g.f(i10));
    }

    public static final int m(int i10) {
        return c.g(g.g(i10));
    }

    public static final int n(int i10) {
        return d.e(g.h(i10));
    }

    public static int o(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String p(int i10) {
        return "LineBreak(strategy=" + ((Object) b.j(l(i10))) + ", strictness=" + ((Object) c.k(m(i10))) + ", wordBreak=" + ((Object) d.i(n(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return j(this.f42159a, obj);
    }

    public int hashCode() {
        return o(this.f42159a);
    }

    public final /* synthetic */ int q() {
        return this.f42159a;
    }

    @NotNull
    public String toString() {
        return p(this.f42159a);
    }
}
