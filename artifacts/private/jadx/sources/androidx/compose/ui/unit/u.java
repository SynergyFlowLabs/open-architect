package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.a1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,122:1\n54#1:125\n59#1:127\n54#1:143\n59#1:145\n85#2:123\n90#2:124\n85#2:126\n90#2:128\n85#2,6:129\n80#2:135\n85#2,6:136\n80#2:142\n85#2:144\n90#2:146\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n61#1:125\n63#1:127\n75#1:143\n75#1:145\n54#1:123\n59#1:124\n61#1:126\n63#1:128\n68#1:129,6\n68#1:135\n73#1:136,6\n73#1:142\n75#1:144\n75#1:146\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42720b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42721c = e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42722a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return u.f42721c;
        }

        private a() {
        }
    }

    @a1
    private /* synthetic */ u(long j10) {
        this.f42722a = j10;
    }

    public static final /* synthetic */ u b(long j10) {
        return new u(j10);
    }

    @k7
    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }

    @k7
    public static final int d(long j10) {
        return (int) (j10 & k0.f265952a);
    }

    @a1
    public static long e(long j10) {
        return j10;
    }

    @k7
    public static final long f(long j10, int i10) {
        return e((((long) (((int) (j10 >> 32)) / i10)) << 32) | (((long) (((int) (j10 & k0.f265952a)) / i10)) & k0.f265952a));
    }

    public static boolean g(long j10, Object obj) {
        if ((obj instanceof u) && j10 == ((u) obj).q()) {
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

    public static final int j(long j10) {
        return (int) (j10 & k0.f265952a);
    }

    @k7
    public static /* synthetic */ void l() {
    }

    public static final int m(long j10) {
        return (int) (j10 >> 32);
    }

    public static int n(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final long o(long j10, int i10) {
        return e((((long) (((int) (j10 >> 32)) * i10)) << 32) | (((long) (((int) (j10 & k0.f265952a)) * i10)) & k0.f265952a));
    }

    @k7
    @NotNull
    public static String p(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & k0.f265952a));
    }

    public boolean equals(Object obj) {
        return g(this.f42722a, obj);
    }

    public int hashCode() {
        return n(this.f42722a);
    }

    public final long k() {
        return this.f42722a;
    }

    public final /* synthetic */ long q() {
        return this.f42722a;
    }

    @k7
    @NotNull
    public String toString() {
        return p(this.f42722a);
    }
}
