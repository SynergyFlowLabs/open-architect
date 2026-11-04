package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f13317b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13318c = d(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f13319d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13320a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u2.f13318c;
        }

        public final int b() {
            return u2.f13319d;
        }

        private a() {
        }
    }

    private /* synthetic */ u2(int i10) {
        this.f13320a = i10;
    }

    public static final /* synthetic */ u2 c(int i10) {
        return new u2(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof u2) && i10 == ((u2) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return "StartOffsetType(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f13320a, obj);
    }

    public int hashCode() {
        return g(this.f13320a);
    }

    public final /* synthetic */ int i() {
        return this.f13320a;
    }

    public String toString() {
        return h(this.f13320a);
    }
}
