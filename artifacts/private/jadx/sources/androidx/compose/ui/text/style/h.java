package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f42178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42179e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final h f42180f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42183c;

    @oj.g
    @SourceDebugExtension({"SMAP\nLineHeightStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineHeightStyle.kt\nandroidx/compose/ui/text/style/LineHeightStyle$Alignment\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,329:1\n81#2,4:330\n*S KotlinDebug\n*F\n+ 1 LineHeightStyle.kt\nandroidx/compose/ui/text/style/LineHeightStyle$Alignment\n*L\n211#1:330,4\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0340a f42184b = new C0340a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f42185c = f(0.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f42186d = f(0.5f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f42187e = f(-1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final float f42188f = f(1.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f42189a;

        /* JADX INFO: renamed from: androidx.compose.ui.text.style.h$a$a, reason: collision with other inner class name */
        public static final class C0340a {
            public /* synthetic */ C0340a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.f42188f;
            }

            public final float b() {
                return a.f42186d;
            }

            public final float c() {
                return a.f42187e;
            }

            public final float d() {
                return a.f42185c;
            }

            private C0340a() {
            }
        }

        private /* synthetic */ a(float f10) {
            this.f42189a = f10;
        }

        public static final /* synthetic */ a e(float f10) {
            return new a(f10);
        }

        public static float f(float f10) {
            if (!((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f)) {
                x0.a.g("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        public static boolean g(float f10, Object obj) {
            return (obj instanceof a) && Float.compare(f10, ((a) obj).k()) == 0;
        }

        public static final boolean h(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        public static int i(float f10) {
            return Float.hashCode(f10);
        }

        @NotNull
        public static String j(float f10) {
            if (f10 == f42185c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f42186d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f42187e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f42188f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public boolean equals(Object obj) {
            return g(this.f42189a, obj);
        }

        public int hashCode() {
            return i(this.f42189a);
        }

        public final /* synthetic */ float k() {
            return this.f42189a;
        }

        @NotNull
        public String toString() {
            return j(this.f42189a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h a() {
            return h.f42180f;
        }

        private b() {
        }
    }

    @oj.g
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f42190b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f42191c = d(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f42192d = d(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42193a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f42191c;
            }

            public final int b() {
                return c.f42192d;
            }

            private a() {
            }
        }

        private /* synthetic */ c(int i10) {
            this.f42193a = i10;
        }

        public static final /* synthetic */ c c(int i10) {
            return new c(i10);
        }

        private static int d(int i10) {
            return i10;
        }

        public static boolean e(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).i();
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static int g(int i10) {
            return Integer.hashCode(i10);
        }

        public static String h(int i10) {
            return "Mode(value=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f42193a, obj);
        }

        public int hashCode() {
            return g(this.f42193a);
        }

        public final /* synthetic */ int i() {
            return this.f42193a;
        }

        public String toString() {
            return h(this.f42193a);
        }
    }

    @oj.g
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f42195c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f42196d = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f42194b = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f42197e = f(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f42198f = f(16);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f42199g = f(17);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f42200h = f(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f42199g;
            }

            public final int b() {
                return d.f42197e;
            }

            public final int c() {
                return d.f42198f;
            }

            public final int d() {
                return d.f42200h;
            }

            private a() {
            }
        }

        private /* synthetic */ d(int i10) {
            this.f42201a = i10;
        }

        public static final /* synthetic */ d e(int i10) {
            return new d(i10);
        }

        private static int f(int i10) {
            return i10;
        }

        public static boolean g(int i10, Object obj) {
            return (obj instanceof d) && i10 == ((d) obj).m();
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }

        public static int i(int i10) {
            return Integer.hashCode(i10);
        }

        public static final boolean j(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean k(int i10) {
            return (i10 & 16) > 0;
        }

        @NotNull
        public static String l(int i10) {
            if (i10 == f42197e) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i10 == f42198f) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i10 == f42199g) {
                return "LineHeightStyle.Trim.Both";
            }
            return i10 == f42200h ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.f42201a, obj);
        }

        public int hashCode() {
            return i(this.f42201a);
        }

        public final /* synthetic */ int m() {
            return this.f42201a;
        }

        @NotNull
        public String toString() {
            return l(this.f42201a);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f42178d = new b(defaultConstructorMarker);
        f42180f = new h(a.f42184b.c(), d.f42194b.a(), c.f42190b.a(), defaultConstructorMarker);
    }

    public /* synthetic */ h(float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10, i11);
    }

    public static /* synthetic */ h c(h hVar, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f10 = hVar.f42181a;
        }
        if ((i12 & 2) != 0) {
            i10 = hVar.f42182b;
        }
        if ((i12 & 4) != 0) {
            i11 = hVar.f42183c;
        }
        return hVar.b(f10, i10, i11);
    }

    @NotNull
    public final h b(float f10, int i10, int i11) {
        return new h(f10, i10, i11, null);
    }

    public final float d() {
        return this.f42181a;
    }

    public final int e() {
        return this.f42183c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a.h(this.f42181a, hVar.f42181a) && d.h(this.f42182b, hVar.f42182b) && c.f(this.f42183c, hVar.f42183c);
    }

    public final int f() {
        return this.f42182b;
    }

    public int hashCode() {
        return (((a.i(this.f42181a) * 31) + d.i(this.f42182b)) * 31) + c.g(this.f42183c);
    }

    @NotNull
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.j(this.f42181a)) + ", trim=" + ((Object) d.l(this.f42182b)) + ",mode=" + ((Object) c.h(this.f42183c)) + ')';
    }

    public /* synthetic */ h(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10);
    }

    private h(float f10, int i10, int i11) {
        this.f42181a = f10;
        this.f42182b = i10;
        this.f42183c = i11;
    }

    private h(float f10, int i10) {
        this(f10, i10, c.f42190b.a(), null);
    }
}
