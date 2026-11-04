package androidx.compose.animation;

import androidx.compose.animation.core.j5;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final s f13413a = new s() { // from class: androidx.compose.animation.c
        @Override // androidx.compose.animation.s
        public final androidx.compose.animation.core.y0 a(n0.j jVar, n0.j jVar2) {
            return d.b(jVar, jVar2);
        }
    };

    static final class a extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13414a = new a();

        a() {
            super(2);
        }

        public final long c(long j10, long j11) {
            return j11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.b invoke(androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
            return androidx.compose.ui.unit.b.a(c(uVar.q(), bVar.x()));
        }
    }

    @SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,441:1\n54#2:442\n59#2:444\n85#3:443\n90#3:445\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2\n*L\n142#1:442\n142#1:444\n142#1:443\n142#1:445\n*E\n"})
    static final class b extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13415a = new b();

        b() {
            super(2);
        }

        public final long c(long j10, long j11) {
            return androidx.compose.ui.unit.b.f42658b.c((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.b invoke(androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
            return androidx.compose.ui.unit.b.a(c(uVar.q(), bVar.x()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.y0 b(n0.j jVar, n0.j jVar2) {
        return androidx.compose.animation.core.p.q(1.0f, 400.0f, j5.h(n0.j.f332705e));
    }

    @i0
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.w0 w0Var, @NotNull androidx.compose.ui.a0 a0Var2, @NotNull s sVar, boolean z10) {
        return a0Var.B2(new BoundsAnimationElement(w0Var, sVar, a.f13414a, z10)).B2(a0Var2).B2(new BoundsAnimationElement(w0Var, sVar, b.f13415a, z10));
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, androidx.compose.ui.layout.w0 w0Var, androidx.compose.ui.a0 a0Var2, s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            a0Var2 = androidx.compose.ui.a0.E;
        }
        if ((i10 & 4) != 0) {
            sVar = f13413a;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c(a0Var, w0Var, a0Var2, sVar, z10);
    }

    private static /* synthetic */ void e() {
    }
}
