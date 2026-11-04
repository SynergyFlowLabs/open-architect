package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,171:1\n85#2:172\n90#2:173\n80#2:174\n85#2,6:175\n85#2:181\n90#2:182\n80#2:183\n85#2:184\n90#2:185\n80#2:186\n85#2,6:187\n80#2:193\n85#2:194\n90#2:196\n80#2:198\n85#2:199\n90#2:201\n80#2:203\n85#2,6:204\n80#2:210\n26#3:195\n26#3:197\n26#3:200\n26#3:202\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n54#1:172\n59#1:173\n67#1:174\n66#1:175,6\n74#1:181\n75#1:182\n73#1:183\n84#1:184\n85#1:185\n83#1:186\n92#1:187,6\n92#1:193\n105#1:194\n106#1:196\n104#1:198\n121#1:199\n122#1:201\n120#1:203\n134#1:204,6\n134#1:210\n105#1:195\n106#1:197\n121#1:200\n122#1:202\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42709b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42710c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f42711d = f(9223372034707292159L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42712a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return q.f42711d;
        }

        public final long b() {
            return q.f42710c;
        }

        private a() {
        }
    }

    private /* synthetic */ q(long j10) {
        this.f42712a = j10;
    }

    public static final /* synthetic */ q c(long j10) {
        return new q(j10);
    }

    @k7
    public static final int d(long j10) {
        return n(j10);
    }

    @k7
    public static final int e(long j10) {
        return p(j10);
    }

    public static long f(long j10) {
        return j10;
    }

    public static final long g(long j10, int i10, int i11) {
        return f((((long) i10) << 32) | (((long) i11) & k0.f265952a));
    }

    public static /* synthetic */ long h(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (k0.f265952a & j10);
        }
        return g(j10, i10, i11);
    }

    @k7
    public static final long i(long j10, float f10) {
        return f((((long) Math.round(((int) (j10 >> 32)) / f10)) << 32) | (((long) Math.round(((int) (j10 & k0.f265952a)) / f10)) & k0.f265952a));
    }

    public static boolean j(long j10, Object obj) {
        return (obj instanceof q) && j10 == ((q) obj).x();
    }

    public static final boolean k(long j10, long j11) {
        return j10 == j11;
    }

    @k7
    public static /* synthetic */ void m() {
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    @k7
    public static /* synthetic */ void o() {
    }

    public static final int p(long j10) {
        return (int) (j10 & k0.f265952a);
    }

    public static int q(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final long r(long j10, long j11) {
        return f((((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & k0.f265952a)) - ((int) (j11 & k0.f265952a)))) & k0.f265952a));
    }

    @k7
    public static final long s(long j10, long j11) {
        return f((((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & k0.f265952a)) + ((int) (j11 & k0.f265952a)))) & k0.f265952a));
    }

    @k7
    public static final long t(long j10, int i10) {
        return f((((long) (((int) (j10 >> 32)) % i10)) << 32) | (((long) (((int) (j10 & k0.f265952a)) % i10)) & k0.f265952a));
    }

    @k7
    public static final long u(long j10, float f10) {
        return f((((long) Math.round(((int) (j10 >> 32)) * f10)) << 32) | (((long) Math.round(((int) (j10 & k0.f265952a)) * f10)) & k0.f265952a));
    }

    @k7
    @NotNull
    public static String v(long j10) {
        return '(' + n(j10) + ", " + p(j10) + ')';
    }

    @k7
    public static final long w(long j10) {
        int i10 = -((int) (j10 >> 32));
        return f((((long) (-((int) (j10 & k0.f265952a)))) & k0.f265952a) | (((long) i10) << 32));
    }

    public boolean equals(Object obj) {
        return j(this.f42712a, obj);
    }

    public int hashCode() {
        return q(this.f42712a);
    }

    public final long l() {
        return this.f42712a;
    }

    @k7
    @NotNull
    public String toString() {
        return v(this.f42712a);
    }

    public final /* synthetic */ long x() {
        return this.f42712a;
    }
}
