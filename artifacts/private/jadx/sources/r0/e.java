package r0;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.unit.c0;
import androidx.compose.ui.unit.d0;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,725:1\n65#2:726\n69#2:729\n60#3:727\n70#3:730\n22#4:728\n22#4:731\n57#5,4:732\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n*L\n75#1:726\n76#1:729\n75#1:727\n76#1:730\n75#1:728\n76#1:731\n103#1:732,4\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f359044f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d.a f359045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f359046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f359047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f359048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f359049e;

    public e() {
        d.a aVar = f.m() ? d.a.Impulse : d.a.Lsq2;
        this.f359045a = aVar;
        this.f359046b = new d(false, aVar, 1, null);
        this.f359047c = new d(false, aVar, 1, null);
        this.f359048d = g.f332700b.e();
    }

    public final void a(long j10, long j11) {
        this.f359046b.a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        this.f359047c.a(j10, Float.intBitsToFloat((int) (j11 & k0.f265952a)));
    }

    public final long b() {
        return c(d0.a(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long j10) {
        if (!(c0.l(j10) > 0.0f && c0.n(j10) > 0.0f)) {
            s0.a.i("maximumVelocity should be a positive value. You specified=" + ((Object) c0.t(j10)));
        }
        return d0.a(this.f359046b.d(c0.l(j10)), this.f359047c.d(c0.n(j10)));
    }

    public final long d() {
        return this.f359048d;
    }

    public final long e() {
        return this.f359049e;
    }

    public final void f() {
        this.f359046b.f();
        this.f359047c.f();
        this.f359049e = 0L;
    }

    public final void g(long j10) {
        this.f359048d = j10;
    }

    public final void h(long j10) {
        this.f359049e = j10;
    }
}
