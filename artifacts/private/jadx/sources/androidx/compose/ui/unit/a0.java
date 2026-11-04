package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,371:1\n252#1:372\n247#1,6:373\n252#1:379\n252#1:384\n252#1:393\n38#2,4:380\n38#2,4:385\n38#2,4:389\n38#2,4:394\n38#2,4:398\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n247#1:372\n258#1:373,6\n332#1:379\n337#1:384\n345#1:393\n332#1:380,4\n337#1:385,4\n340#1:389,4\n345#1:394,4\n348#1:398,4\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f42654a = 1095216660480L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f42655b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42656c = 4294967296L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f42657d = 8589934592L;

    public static final long a(float f10, long j10) {
        return v(j10, f10);
    }

    @a1
    public static final void b(long j10) {
        if (z.l(j10) == 0) {
            p.c("Cannot perform operation for Unspecified type.");
        }
    }

    @a1
    public static final void c(long j10, long j11) {
        if (!((z.l(j10) == 0 || z.l(j11) == 0) ? false : true)) {
            p.c("Cannot perform operation for Unspecified type.");
        }
        if (b0.g(z.m(j10), z.m(j11))) {
            return;
        }
        p.c("Cannot perform operation for " + ((Object) b0.i(z.m(j10))) + " and " + ((Object) b0.i(z.m(j11))));
    }

    @a1
    public static final void d(long j10, long j11, long j12) {
        boolean z10 = false;
        if (!((z.l(j10) == 0 || z.l(j11) == 0 || z.l(j12) == 0) ? false : true)) {
            p.c("Cannot perform operation for Unspecified type.");
        }
        if (b0.g(z.m(j10), z.m(j11)) && b0.g(z.m(j11), z.m(j12))) {
            z10 = true;
        }
        if (!z10) {
            p.c("Cannot perform operation for " + ((Object) b0.i(z.m(j10))) + " and " + ((Object) b0.i(z.m(j11))));
        }
    }

    public static final long e(double d10) {
        return v(f42657d, (float) d10);
    }

    public static final long f(float f10) {
        return v(f42657d, f10);
    }

    public static final long g(int i10) {
        return v(f42657d, i10);
    }

    @k7
    public static /* synthetic */ void h(double d10) {
    }

    @k7
    public static /* synthetic */ void i(float f10) {
    }

    @k7
    public static /* synthetic */ void j(int i10) {
    }

    public static final long k(double d10) {
        return v(f42656c, (float) d10);
    }

    public static final long l(float f10) {
        return v(f42656c, f10);
    }

    public static final long m(int i10) {
        return v(f42656c, i10);
    }

    @k7
    public static /* synthetic */ void n(double d10) {
    }

    @k7
    public static /* synthetic */ void o(float f10) {
    }

    @k7
    public static /* synthetic */ void p(int i10) {
    }

    public static final boolean q(long j10) {
        return !(z.l(j10) == 0);
    }

    @k7
    public static /* synthetic */ void r(long j10) {
    }

    public static final boolean s(long j10) {
        return z.l(j10) == 0;
    }

    @k7
    public static /* synthetic */ void t(long j10) {
    }

    @k7
    public static final long u(long j10, long j11, float f10) {
        c(j10, j11);
        return v(z.l(j10), androidx.compose.ui.util.e.r(z.n(j10), z.n(j11), f10));
    }

    @a1
    public static final long v(long j10, float f10) {
        return z.e(j10 | (((long) Float.floatToRawIntBits(f10)) & k0.f265952a));
    }

    public static final long w(long j10, @NotNull Function0<z> function0) {
        return !((z.l(j10) > 0L ? 1 : (z.l(j10) == 0L ? 0 : -1)) == 0) ? j10 : function0.invoke().w();
    }

    @k7
    public static final long x(double d10, long j10) {
        b(j10);
        return v(z.l(j10), ((float) d10) * z.n(j10));
    }

    @k7
    public static final long y(float f10, long j10) {
        b(j10);
        return v(z.l(j10), f10 * z.n(j10));
    }

    @k7
    public static final long z(int i10, long j10) {
        b(j10);
        return v(z.l(j10), i10 * z.n(j10));
    }
}
