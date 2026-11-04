package androidx.compose.ui.input.indirect;

import androidx.compose.ui.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@p
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38742b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38743c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38744d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38745e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38746f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38747a;

    @p
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f38746f;
        }

        public final int b() {
            return d.f38744d;
        }

        public final int c() {
            return d.f38745e;
        }

        public final int d() {
            return d.f38743c;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i10) {
        this.f38747a = i10;
    }

    public static final /* synthetic */ d e(int i10) {
        return new d(i10);
    }

    private static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).k();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String j(int i10) {
        if (h(i10, f38744d)) {
            return "Press";
        }
        if (h(i10, f38745e)) {
            return "Release";
        }
        return h(i10, f38746f) ? "Move" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return g(this.f38747a, obj);
    }

    public int hashCode() {
        return i(this.f38747a);
    }

    public final /* synthetic */ int k() {
        return this.f38747a;
    }

    @NotNull
    public String toString() {
        return j(this.f38747a);
    }
}
