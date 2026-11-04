package androidx.compose.ui.node;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f39928b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f39929c = o2.d(0, 0, 0, 0, 14, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f39930d = 32767;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f39931e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39932f = 32767;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f39933g = Long.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f39934a;

    @SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansion$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,249:1\n103#2,4:250\n103#2,4:254\n103#2,4:258\n103#2,4:262\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansion$Companion\n*L\n49#1:250,4\n52#1:254,4\n55#1:258,4\n58#1:262,4\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ long b(a aVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = 0;
            }
            if ((i14 & 2) != 0) {
                i11 = 0;
            }
            if ((i14 & 4) != 0) {
                i12 = 0;
            }
            if ((i14 & 8) != 0) {
                i13 = 0;
            }
            return aVar.a(i10, i11, i12, i13);
        }

        private final long f(int i10, int i11) {
            return ((long) (i10 & 32767)) << (i11 * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int g(long j10, int i10) {
            return ((int) (j10 >> (i10 * 15))) & 32767;
        }

        public final long a(int i10, int i11, int i12, int i13) {
            boolean z10 = true;
            if (!(i10 >= 0 && i10 < 32768)) {
                s0.a.g("Start must be in the range of 0 .. 32767");
            }
            if (!(i11 >= 0 && i11 < 32768)) {
                s0.a.g("Top must be in the range of 0 .. 32767");
            }
            if (!(i12 >= 0 && i12 < 32768)) {
                s0.a.g("End must be in the range of 0 .. 32767");
            }
            if (i13 < 0 || i13 >= 32768) {
                z10 = false;
            }
            if (!z10) {
                s0.a.g("Bottom must be in the range of 0 .. 32767");
            }
            return n2.e(e(i10, i11, i12, i13, false));
        }

        public final long d() {
            return n2.f39929c;
        }

        public final long e(int i10, int i11, int i12, int i13, boolean z10) {
            return f(i11, 1) | f(i10, 0) | f(i12, 2) | f(i13, 3) | (z10 ? Long.MIN_VALUE : 0L);
        }

        private a() {
        }
    }

    private /* synthetic */ n2(long j10) {
        this.f39934a = j10;
    }

    public static final /* synthetic */ n2 b(long j10) {
        return new n2(j10);
    }

    public static final int c(long j10, @NotNull androidx.compose.ui.unit.w wVar) {
        return (!m(j10) || wVar == androidx.compose.ui.unit.w.Ltr) ? j(j10) : i(j10);
    }

    public static final int d(long j10, @NotNull androidx.compose.ui.unit.w wVar) {
        return (!m(j10) || wVar == androidx.compose.ui.unit.w.Ltr) ? i(j10) : j(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof n2) && j10 == ((n2) obj).o();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int h(long j10) {
        return f39928b.g(j10, 3);
    }

    public static final int i(long j10) {
        return f39928b.g(j10, 2);
    }

    public static final int j(long j10) {
        return f39928b.g(j10, 0);
    }

    public static final int k(long j10) {
        return f39928b.g(j10, 1);
    }

    public static int l(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean m(long j10) {
        return (j10 & Long.MIN_VALUE) != 0;
    }

    public static String n(long j10) {
        return "TouchBoundsExpansion(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f39934a, obj);
    }

    public int hashCode() {
        return l(this.f39934a);
    }

    public final /* synthetic */ long o() {
        return this.f39934a;
    }

    public String toString() {
        return n(this.f39934a);
    }
}
