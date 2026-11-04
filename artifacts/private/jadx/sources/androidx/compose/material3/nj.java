package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
final class nj implements Comparable<nj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31043b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f31044c = r(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f31045d = r(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f31046e = r(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31047a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return nj.f31044c;
        }

        public final int b() {
            return nj.f31046e;
        }

        public final int c() {
            return nj.f31045d;
        }

        public final int d(boolean z10, boolean z11, boolean z12) {
            if ((z10 && z11) || z12) {
                return b();
            }
            if (!z10 && !z11) {
                return a();
            }
            return c();
        }

        private a() {
        }
    }

    private /* synthetic */ nj(int i10) {
        this.f31047a = i10;
    }

    public static final /* synthetic */ nj o(int i10) {
        return new nj(i10);
    }

    public static int q(int i10, int i11) {
        return Intrinsics.compare(i10, i11);
    }

    private static int r(int i10) {
        return i10;
    }

    public static boolean s(int i10, Object obj) {
        return (obj instanceof nj) && i10 == ((nj) obj).x();
    }

    public static final boolean t(int i10, int i11) {
        return i10 == i11;
    }

    public static int v(int i10) {
        return Integer.hashCode(i10);
    }

    public static String w(int i10) {
        return "ListItemType(lines=" + i10 + ')';
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(nj njVar) {
        return p(njVar.x());
    }

    public boolean equals(Object obj) {
        return s(this.f31047a, obj);
    }

    public int hashCode() {
        return v(this.f31047a);
    }

    public int p(int i10) {
        return q(this.f31047a, i10);
    }

    public String toString() {
        return w(this.f31047a);
    }

    public final /* synthetic */ int x() {
        return this.f31047a;
    }
}
