package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.graphics.h2;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.m3;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.graphics.s3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,203:1\n1#2:204\n65#3:205\n69#3:208\n60#4:206\n70#4:209\n22#5:207\n22#5:210\n635#6:211\n136#7:212\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n101#1:205\n102#1:208\n101#1:206\n102#1:209\n101#1:207\n102#1:210\n110#1:211\n137#1:212\n*E\n"})
public final class o extends TextPaint {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f42094j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private h2 f42095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.style.k f42096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private o3 f42098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private q0 f42099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private i0 f42100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private n7<? extends Shader> f42101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private n0.n f42102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.drawscope.i f42103i;

    public o(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f42096b = androidx.compose.ui.text.style.k.f42215b.d();
        this.f42097c = androidx.compose.ui.graphics.drawscope.f.H.a();
        this.f42098d = o3.f38091d.a();
    }

    private final void b() {
        this.f42101g = null;
        this.f42100f = null;
        this.f42102h = null;
        setShader(null);
    }

    @l1
    public static /* synthetic */ void e() {
    }

    @l1
    public static /* synthetic */ void g() {
    }

    private final h2 h() {
        h2 h2Var = this.f42095a;
        if (h2Var != null) {
            return h2Var;
        }
        h2 h2VarB = androidx.compose.ui.graphics.m.b(this);
        this.f42095a = h2VarB;
        return h2VarB;
    }

    @l1
    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void o(o oVar, i0 i0Var, long j10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        oVar.n(i0Var, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader q(i0 i0Var, long j10) {
        return ((m3) i0Var).c(j10);
    }

    public final int c() {
        return this.f42097c;
    }

    @Nullable
    public final i0 d() {
        return this.f42100f;
    }

    @Nullable
    public final n0.n f() {
        return this.f42102h;
    }

    @Nullable
    public final n7<Shader> i() {
        return this.f42101g;
    }

    @NotNull
    public final o3 j() {
        return this.f42098d;
    }

    public final void l(int i10) {
        if (androidx.compose.ui.graphics.d0.G(i10, this.f42097c)) {
            return;
        }
        h().s(i10);
        this.f42097c = i10;
    }

    public final void m(@Nullable i0 i0Var) {
        this.f42100f = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    public final void n(@Nullable final i0 i0Var, final long j10, float f10) {
        if (i0Var == null) {
            b();
            return;
        }
        if (i0Var instanceof s3) {
            r(androidx.compose.ui.text.style.m.c(((s3) i0Var).c(), f10));
            return;
        }
        if (!(i0Var instanceof m3)) {
            throw new k0();
        }
        if (Intrinsics.areEqual(this.f42100f, i0Var)) {
            n0.n nVar = this.f42102h;
            if (!(nVar == null ? false : n0.n.k(nVar.y(), j10))) {
                if (j10 != n0.d.f332689d) {
                    this.f42100f = i0Var;
                    this.f42102h = n0.n.c(j10);
                    this.f42101g = w6.e(new Function0() { // from class: androidx.compose.ui.text.platform.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.q(i0Var, j10);
                        }
                    });
                }
            }
        } else {
            if (j10 != n0.d.f332689d) {
                this.f42100f = i0Var;
                this.f42102h = n0.n.c(j10);
                this.f42101g = w6.e(new Function0() { // from class: androidx.compose.ui.text.platform.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.q(i0Var, j10);
                    }
                });
            }
        }
        h2 h2VarH = h();
        n7<? extends Shader> n7Var = this.f42101g;
        h2VarH.M(n7Var != null ? n7Var.getValue() : null);
        this.f42099e = null;
        p.a(this, f10);
    }

    public final void p(@Nullable n0.n nVar) {
        this.f42102h = nVar;
    }

    public final void r(long j10) {
        q0 q0Var = this.f42099e;
        if (q0Var == null ? false : q0.y(q0Var.M(), j10)) {
            return;
        }
        if (j10 != 16) {
            this.f42099e = q0.n(j10);
            setColor(s0.t(j10));
            b();
        }
    }

    public final void s(@Nullable androidx.compose.ui.graphics.drawscope.i iVar) {
        if (iVar == null || Intrinsics.areEqual(this.f42103i, iVar)) {
            return;
        }
        this.f42103i = iVar;
        if (Intrinsics.areEqual(iVar, androidx.compose.ui.graphics.drawscope.m.f37744a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(iVar instanceof androidx.compose.ui.graphics.drawscope.n)) {
            throw new k0();
        }
        h().G(j2.f37801b.b());
        androidx.compose.ui.graphics.drawscope.n nVar = (androidx.compose.ui.graphics.drawscope.n) iVar;
        h().H(nVar.g());
        h().E(nVar.e());
        h().A(nVar.d());
        h().x(nVar.c());
        h().K(nVar.f());
    }

    public final void t(@Nullable n7<? extends Shader> n7Var) {
        this.f42101g = n7Var;
    }

    public final void u(@Nullable o3 o3Var) {
        if (o3Var == null || Intrinsics.areEqual(this.f42098d, o3Var)) {
            return;
        }
        this.f42098d = o3Var;
        if (Intrinsics.areEqual(o3Var, o3.f38091d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(z0.e.c(this.f42098d.d()), Float.intBitsToFloat((int) (this.f42098d.h() >> 32)), Float.intBitsToFloat((int) (this.f42098d.h() & com.rabbitmq.client.k0.f265952a)), s0.t(this.f42098d.f()));
        }
    }

    public final void v(@NotNull o3 o3Var) {
        this.f42098d = o3Var;
    }

    public final void w(@Nullable androidx.compose.ui.text.style.k kVar) {
        if (kVar == null || Intrinsics.areEqual(this.f42096b, kVar)) {
            return;
        }
        this.f42096b = kVar;
        androidx.compose.ui.text.style.k.a aVar = androidx.compose.ui.text.style.k.f42215b;
        setUnderlineText(kVar.d(aVar.f()));
        setStrikeThruText(this.f42096b.d(aVar.b()));
    }
}
