package androidx.compose.ui.text.style;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0339a f42141b = new C0339a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f42142c = e(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f42143d = e(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f42144e = e(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42145a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.a$a, reason: collision with other inner class name */
    public static final class C0339a {
        public /* synthetic */ C0339a(DefaultConstructorMarker defaultConstructorMarker) {
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

        public final float a() {
            return a.f42144e;
        }

        public final float c() {
            return a.f42143d;
        }

        public final float e() {
            return a.f42142c;
        }

        private C0339a() {
        }
    }

    private /* synthetic */ a(float f10) {
        this.f42145a = f10;
    }

    public static final /* synthetic */ a d(float f10) {
        return new a(f10);
    }

    public static float e(float f10) {
        return f10;
    }

    public static boolean f(float f10, Object obj) {
        return (obj instanceof a) && Float.compare(f10, ((a) obj).k()) == 0;
    }

    public static final boolean g(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int i(float f10) {
        return Float.hashCode(f10);
    }

    public static String j(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f42145a, obj);
    }

    public final float h() {
        return this.f42145a;
    }

    public int hashCode() {
        return i(this.f42145a);
    }

    public final /* synthetic */ float k() {
        return this.f42145a;
    }

    public String toString() {
        return j(this.f42145a);
    }
}
