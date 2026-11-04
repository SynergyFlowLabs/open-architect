package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.u1;
import androidx.compose.ui.graphics.v1;
import kotlin.Unit;
import kotlin.a1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,107:1\n54#2:108\n59#2:110\n54#2:112\n59#2:114\n85#3:109\n90#3:111\n85#3:113\n90#3:115\n536#4,17:116\n57#5,4:133\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n70#1:108\n71#1:110\n74#1:112\n74#1:114\n70#1:109\n71#1:111\n74#1:113\n74#1:115\n82#1:116,17\n92#1:133,4\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f38290h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private t1 f38291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private k0 f38292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f38293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.w f38294d = androidx.compose.ui.unit.w.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f38295e = androidx.compose.ui.unit.u.f42720b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38296f = u1.f38249b.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.drawscope.a f38297g = new androidx.compose.ui.graphics.drawscope.a();

    private final void a(androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, q0.f38131b.a(), 0L, 0L, 0.0f, null, null, d0.f37693b.a(), 62, null);
    }

    public static /* synthetic */ void d(a aVar, androidx.compose.ui.graphics.drawscope.f fVar, float f10, r0 r0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            r0Var = null;
        }
        aVar.c(fVar, f10, r0Var);
    }

    @a1
    public static /* synthetic */ void f() {
    }

    public final void b(int i10, long j10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        this.f38293c = dVar;
        this.f38294d = wVar;
        t1 t1VarB = this.f38291a;
        k0 k0VarA = this.f38292b;
        if (t1VarB == null || k0VarA == null || ((int) (j10 >> 32)) > t1VarB.getWidth() || ((int) (j10 & com.rabbitmq.client.k0.f265952a)) > t1VarB.getHeight() || !u1.i(this.f38296f, i10)) {
            t1VarB = v1.b((int) (j10 >> 32), (int) (com.rabbitmq.client.k0.f265952a & j10), i10, false, null, 24, null);
            k0VarA = m0.a(t1VarB);
            this.f38291a = t1VarB;
            this.f38292b = k0VarA;
            this.f38296f = i10;
        }
        this.f38295e = j10;
        androidx.compose.ui.graphics.drawscope.a aVar = this.f38297g;
        long jH = androidx.compose.ui.unit.v.h(j10);
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU = aVar.U();
        androidx.compose.ui.unit.d dVarA = c0286aU.a();
        androidx.compose.ui.unit.w wVarB = c0286aU.b();
        k0 k0VarC = c0286aU.c();
        long jD = c0286aU.d();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU2 = aVar.U();
        c0286aU2.l(dVar);
        c0286aU2.m(wVar);
        c0286aU2.k(k0VarA);
        c0286aU2.n(jH);
        k0VarA.save();
        a(aVar);
        function1.invoke(aVar);
        k0VarA.B();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU3 = aVar.U();
        c0286aU3.l(dVarA);
        c0286aU3.m(wVarB);
        c0286aU3.k(k0VarC);
        c0286aU3.n(jD);
        t1VarB.b();
    }

    public final void c(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, float f10, @Nullable r0 r0Var) {
        t1 t1Var = this.f38291a;
        if (!(t1Var != null)) {
            s0.a.i("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        androidx.compose.ui.graphics.drawscope.f.z0(fVar, t1Var, 0L, this.f38295e, 0L, 0L, f10, null, r0Var, 0, 0, 858, null);
    }

    @Nullable
    public final t1 e() {
        return this.f38291a;
    }

    public final void g(@Nullable t1 t1Var) {
        this.f38291a = t1Var;
    }
}
