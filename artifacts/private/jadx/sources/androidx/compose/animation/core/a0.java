package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f12738b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12739c = e(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f12740d = e(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f12741e = e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12742a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a0.f12739c;
        }

        public final int b() {
            return a0.f12740d;
        }

        public final int c() {
            return a0.f12741e;
        }

        private a() {
        }
    }

    private /* synthetic */ a0(int i10) {
        this.f12742a = i10;
    }

    public static final /* synthetic */ a0 d(int i10) {
        return new a0(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof a0) && i10 == ((a0) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return "ArcMode(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f12742a, obj);
    }

    public int hashCode() {
        return h(this.f12742a);
    }

    public final /* synthetic */ int j() {
        return this.f12742a;
    }

    public String toString() {
        return i(this.f12742a);
    }
}
