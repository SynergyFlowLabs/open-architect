package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,87:1\n85#2:88\n80#2:89\n80#2:90\n80#2:91\n80#2:92\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n49#1:88\n57#1:89\n63#1:90\n69#1:91\n75#1:92\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37572b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f37573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f37574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f37575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f37576f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f37577a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f37576f;
        }

        public final long b() {
            return b.f37575e;
        }

        public final long c() {
            return b.f37573c;
        }

        public final long d() {
            return b.f37574d;
        }

        private a() {
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f37573c = f((((long) 0) & com.rabbitmq.client.k0.f265952a) | j11);
        f37574d = f((((long) 1) & com.rabbitmq.client.k0.f265952a) | j11);
        f37575e = f(j11 | (((long) 2) & com.rabbitmq.client.k0.f265952a));
        f37576f = f((j10 & com.rabbitmq.client.k0.f265952a) | (((long) 4) << 32));
    }

    private /* synthetic */ b(long j10) {
        this.f37577a = j10;
    }

    public static final /* synthetic */ b e(long j10) {
        return new b(j10);
    }

    public static long f(long j10) {
        return j10;
    }

    public static boolean g(long j10, Object obj) {
        if ((obj instanceof b) && j10 == ((b) obj).m()) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    @k7
    public static /* synthetic */ void i() {
    }

    @androidx.annotation.g0(from = 1, to = 4)
    public static final int j(long j10) {
        return (int) (j10 >> 32);
    }

    public static int k(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    public static String l(long j10) {
        if (h(j10, f37573c)) {
            return "Rgb";
        }
        if (h(j10, f37574d)) {
            return "Xyz";
        }
        if (h(j10, f37575e)) {
            return "Lab";
        }
        return h(j10, f37576f) ? "Cmyk" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return g(this.f37577a, obj);
    }

    public int hashCode() {
        return k(this.f37577a);
    }

    public final /* synthetic */ long m() {
        return this.f37577a;
    }

    @NotNull
    public String toString() {
        return l(this.f37577a);
    }
}
