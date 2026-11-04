package androidx.compose.foundation.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class u4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21629c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21630d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f21631e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21632f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f21633g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f21634h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f21628b = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f21635i = c(0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u4.f21635i;
        }

        private a() {
        }
    }

    private /* synthetic */ u4(int i10) {
        this.f21636a = i10;
    }

    public static final /* synthetic */ u4 b(int i10) {
        return new u4(i10);
    }

    private static int c(int i10) {
        return i10;
    }

    public static int d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return c((z10 ? 1 : 0) | (z11 ? 2 : 0) | (z12 ? 4 : 0) | (z13 ? 8 : 0) | (z14 ? 16 : 0));
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof u4) && i10 == ((u4) obj).o();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean g(int i10) {
        return (i10 & 16) == 16;
    }

    public static final boolean h(int i10) {
        return (i10 & 1) == 1;
    }

    public static final boolean i(int i10) {
        return (i10 & 4) == 4;
    }

    public static final boolean j(int i10) {
        return (i10 & 2) == 2;
    }

    public static final boolean k(int i10) {
        return (i10 & 8) == 8;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return "MenuItemsAvailability(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f21636a, obj);
    }

    public int hashCode() {
        return m(this.f21636a);
    }

    public final int l() {
        return this.f21636a;
    }

    public final /* synthetic */ int o() {
        return this.f21636a;
    }

    public String toString() {
        return n(this.f21636a);
    }
}
