package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37680b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37681c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37682d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37683e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f37684f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37685a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r.f37684f;
        }

        public final int b() {
            return r.f37681c;
        }

        public final int c() {
            return r.f37682d;
        }

        public final int d() {
            return r.f37683e;
        }

        private a() {
        }
    }

    private /* synthetic */ r(int i10) {
        this.f37685a = i10;
    }

    public static final /* synthetic */ r e(int i10) {
        return new r(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof r) && i10 == ((r) obj).k();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String j(int i10) {
        if (h(i10, f37681c)) {
            return "Perceptual";
        }
        if (h(i10, f37682d)) {
            return "Relative";
        }
        if (h(i10, f37683e)) {
            return androidx.exifinterface.media.a.f51439m1;
        }
        return h(i10, f37684f) ? "Absolute" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return g(this.f37685a, obj);
    }

    public int hashCode() {
        return i(this.f37685a);
    }

    public final /* synthetic */ int k() {
        return this.f37685a;
    }

    @NotNull
    public String toString() {
        return j(this.f37685a);
    }
}
