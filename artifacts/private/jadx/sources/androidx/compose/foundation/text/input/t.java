package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f20321b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20322c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f20323d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f20324e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20325a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return t.f20324e;
        }

        public final int b() {
            return t.f20323d;
        }

        public final int c() {
            return t.f20322c;
        }

        private a() {
        }
    }

    private /* synthetic */ t(int i10) {
        this.f20325a = i10;
    }

    public static final /* synthetic */ t d(int i10) {
        return new t(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof t) && i10 == ((t) obj).k();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static String j(int i10) {
        return "TextObfuscationMode(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f20325a, obj);
    }

    public final int h() {
        return this.f20325a;
    }

    public int hashCode() {
        return i(this.f20325a);
    }

    public final /* synthetic */ int k() {
        return this.f20325a;
    }

    public String toString() {
        return j(this.f20325a);
    }
}
