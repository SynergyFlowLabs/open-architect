package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f36500b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36501a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return i.b(1);
        }

        public final int b() {
            return i.b(4);
        }

        public final int c() {
            return i.b(2);
        }

        private a() {
        }
    }

    private /* synthetic */ i(int i10) {
        this.f36501a = i10;
    }

    public static final /* synthetic */ i a(int i10) {
        return new i(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static /* synthetic */ int c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return b(i10);
    }

    public static boolean d(int i10, Object obj) {
        if ((obj instanceof i) && i10 == ((i) obj).j()) {
            return true;
        }
        return false;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static String i(int i10) {
        return "ReaderKind(mask=" + i10 + ')';
    }

    public static final int k(int i10, int i11) {
        return b(i10 | i11);
    }

    public boolean equals(Object obj) {
        return d(this.f36501a, obj);
    }

    public final int f() {
        return this.f36501a;
    }

    public int hashCode() {
        return g(this.f36501a);
    }

    public final /* synthetic */ int j() {
        return this.f36501a;
    }

    public String toString() {
        return i(this.f36501a);
    }
}
