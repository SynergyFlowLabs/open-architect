package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.unit.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposeDragShadowBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,59:1\n57#2:60\n61#2:63\n60#3:61\n70#3:64\n22#4:62\n22#4:65\n536#5,17:66\n*S KotlinDebug\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n*L\n42#1:60\n43#1:63\n42#1:61\n43#1:64\n42#1:62\n43#1:65\n50#1:66,17\n*E\n"})
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f37180d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f37181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f37183c;

    public /* synthetic */ a(androidx.compose.ui.unit.d dVar, long j10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10, function1);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(@NotNull Canvas canvas) {
        androidx.compose.ui.graphics.drawscope.a aVar = new androidx.compose.ui.graphics.drawscope.a();
        androidx.compose.ui.unit.d dVar = this.f37181a;
        long j10 = this.f37182b;
        w wVar = w.Ltr;
        k0 k0VarB = androidx.compose.ui.graphics.c.b(canvas);
        Function1<androidx.compose.ui.graphics.drawscope.f, Unit> function1 = this.f37183c;
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU = aVar.U();
        androidx.compose.ui.unit.d dVarA = c0286aU.a();
        w wVarB = c0286aU.b();
        k0 k0VarC = c0286aU.c();
        long jD = c0286aU.d();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU2 = aVar.U();
        c0286aU2.l(dVar);
        c0286aU2.m(wVar);
        c0286aU2.k(k0VarB);
        c0286aU2.n(j10);
        k0VarB.save();
        function1.invoke(aVar);
        k0VarB.B();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU3 = aVar.U();
        c0286aU3.l(dVarA);
        c0286aU3.m(wVarB);
        c0286aU3.k(k0VarC);
        c0286aU3.n(jD);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(@NotNull Point point, @NotNull Point point2) {
        androidx.compose.ui.unit.d dVar = this.f37181a;
        point.set(dVar.g6(dVar.F3(Float.intBitsToFloat((int) (this.f37182b >> 32)))), dVar.g6(dVar.F3(Float.intBitsToFloat((int) (this.f37182b & com.rabbitmq.client.k0.f265952a)))));
        point2.set(point.x / 2, point.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(androidx.compose.ui.unit.d dVar, long j10, Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        this.f37181a = dVar;
        this.f37182b = j10;
        this.f37183c = function1;
    }
}
