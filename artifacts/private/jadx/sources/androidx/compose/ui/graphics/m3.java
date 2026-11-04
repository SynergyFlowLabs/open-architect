package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,742:1\n1#2:743\n*E\n"})
public abstract class m3 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private b4 f38052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private float[] f38054e;

    public m3() {
        super(null);
        this.f38053d = n0.n.f332724b.a();
    }

    private final b4 e() {
        b4 b4Var = this.f38052c;
        if (b4Var != null) {
            return b4Var;
        }
        b4 b4Var2 = new b4();
        this.f38052c = b4Var2;
        return b4Var2;
    }

    @Override // androidx.compose.ui.graphics.i0
    public final void a(long j10, @NotNull h2 h2Var, float f10) {
        b4 b4VarE = this.f38052c;
        if (b4VarE == null || !n0.n.k(this.f38053d, j10)) {
            if (n0.n.v(j10)) {
                this.f38052c = null;
                this.f38053d = n0.n.f332724b.a();
                b4VarE = null;
            } else {
                b4VarE = e();
                float[] fArr = this.f38054e;
                if (fArr != null) {
                    b4VarE.d(fArr);
                }
                b4VarE.c(c(j10));
                this.f38052c = b4VarE;
                this.f38053d = j10;
            }
        }
        long jU = h2Var.u();
        q0.a aVar = q0.f38131b;
        if (!q0.y(jU, aVar.a())) {
            h2Var.S(aVar.a());
        }
        if (!Intrinsics.areEqual(h2Var.v(), b4VarE != null ? b4VarE.a() : null)) {
            h2Var.M(b4VarE != null ? b4VarE.a() : null);
        }
        if (h2Var.r() == f10) {
            return;
        }
        h2Var.setAlpha(f10);
    }

    @NotNull
    public abstract Shader c(long j10);

    @Nullable
    public final float[] d() {
        return this.f38054e;
    }

    public final void f(@Nullable float[] fArr) {
        this.f38054e = fArr;
        b4 b4Var = this.f38052c;
        if (b4Var != null) {
            b4Var.d(fArr);
        }
    }
}
