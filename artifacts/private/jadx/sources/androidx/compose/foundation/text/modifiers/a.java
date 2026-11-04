package androidx.compose.foundation.text.modifiers;

import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,51:1\n53#2,3:52\n60#2:55\n70#2:57\n22#3:56\n22#3:58\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n33#1:52,3\n38#1:55\n41#1:57\n38#1:56\n41#1:58\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0153a f20552b = new C0153a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f20553c = c(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20554a;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.a$a, reason: collision with other inner class name */
    public static final class C0153a {
        public /* synthetic */ C0153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f20553c;
        }

        private C0153a() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.f20554a = j10;
    }

    public static final /* synthetic */ a b(long j10) {
        return new a(j10);
    }

    public static long c(float f10, float f11) {
        return d((((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    private static long d(long j10) {
        return j10;
    }

    public static long e(@NotNull androidx.compose.ui.unit.d dVar) {
        return c(dVar.getDensity(), dVar.m0());
    }

    public static boolean f(long j10, Object obj) {
        if ((obj instanceof a) && j10 == ((a) obj).l()) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    public static String k(long j10) {
        return "InlineDensity(density=" + h(j10) + ", fontScale=" + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f20554a, obj);
    }

    public int hashCode() {
        return j(this.f20554a);
    }

    public final /* synthetic */ long l() {
        return this.f20554a;
    }

    @NotNull
    public String toString() {
        return k(this.f20554a);
    }
}
