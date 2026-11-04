package androidx.compose.ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41676b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41677c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41678d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41679e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41680a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return o0.f41679e;
        }

        public final int b() {
            return o0.f41677c;
        }

        public final int c() {
            return o0.f41678d;
        }

        private a() {
        }
    }

    private /* synthetic */ o0(int i10) {
        this.f41680a = i10;
    }

    public static final /* synthetic */ o0 d(int i10) {
        return new o0(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof o0) && i10 == ((o0) obj).k();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String j(int i10) {
        if (g(i10, f41677c)) {
            return "Blocking";
        }
        if (g(i10, f41678d)) {
            return "Optional";
        }
        if (g(i10, f41679e)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f41680a, obj);
    }

    public final int h() {
        return this.f41680a;
    }

    public int hashCode() {
        return i(this.f41680a);
    }

    public final /* synthetic */ int k() {
        return this.f41680a;
    }

    @NotNull
    public String toString() {
        return j(this.f41680a);
    }
}
