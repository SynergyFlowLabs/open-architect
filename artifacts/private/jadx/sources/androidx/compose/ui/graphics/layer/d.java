package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.e3;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f37911a = a.f37912a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f37912a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f37913b = C0288a.f37914a;

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.d$a$a, reason: collision with other inner class name */
        static final class C0288a extends l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0288a f37914a = new C0288a();

            C0288a() {
                super(1);
            }

            public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
                androidx.compose.ui.graphics.drawscope.f.V3(fVar, q0.f38131b.s(), 0L, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
                c(fVar);
                return Unit.f312394a;
            }
        }

        private a() {
        }

        @NotNull
        public final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> a() {
            return f37913b;
        }
    }

    void A(@Nullable e3 e3Var);

    float B();

    void C(float f10);

    float D();

    void E(float f10);

    float F();

    int G();

    void H(int i10, int i11, long j10);

    long I();

    void J(boolean z10);

    long K();

    long L();

    void M(long j10);

    void N(int i10);

    void O(boolean z10);

    void Q(float f10);

    default boolean a() {
        return true;
    }

    float a0();

    boolean b();

    void c();

    boolean d();

    @Nullable
    r0 e();

    void f(@Nullable r0 r0Var);

    long f0();

    @Nullable
    e3 g();

    long getLayerId();

    void h(float f10);

    void h0(long j10);

    float i();

    void j(float f10);

    void j0(long j10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    @NotNull
    Matrix n();

    float o();

    float p();

    float q();

    float r();

    void s(int i10);

    void setAlpha(float f10);

    int t();

    default boolean u() {
        return false;
    }

    float v();

    void w(@Nullable Outline outline, long j10);

    void x(@NotNull k0 k0Var);

    void y(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull c cVar, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1);

    void z(float f10);
}
