package androidx.compose.ui;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class j0 extends a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f39194t = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f39195s;

    static final class a extends l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f39196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f39197b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2 i2Var, j0 j0Var) {
            super(1);
            this.f39196a = i2Var;
            this.f39197b = j0Var;
        }

        public final void c(i2.a aVar) {
            aVar.N(this.f39196a, 0, 0, this.f39197b.v9());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public j0(float f10) {
        this.f39195s = f10;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        i2 i2VarP0 = z0Var.P0(j10);
        return c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new a(i2VarP0, this), 4, null);
    }

    @NotNull
    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f39195s + ')';
    }

    public final float v9() {
        return this.f39195s;
    }

    public final void w9(float f10) {
        this.f39195s = f10;
    }
}
