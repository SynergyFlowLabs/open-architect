package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f20317b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20318c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f20319d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20320a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return s.f20319d;
        }

        public final int b() {
            return s.f20318c;
        }

        private a() {
        }
    }

    private /* synthetic */ s(int i10) {
        this.f20320a = i10;
    }

    public static final /* synthetic */ s c(int i10) {
        return new s(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof s) && i10 == ((s) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return "TextHighlightType(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f20320a, obj);
    }

    public int hashCode() {
        return g(this.f20320a);
    }

    public final /* synthetic */ int i() {
        return this.f20320a;
    }

    public String toString() {
        return h(this.f20320a);
    }
}
