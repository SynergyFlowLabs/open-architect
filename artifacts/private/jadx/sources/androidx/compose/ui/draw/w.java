package androidx.compose.ui.draw;

import androidx.collection.g2;
import androidx.collection.t2;
import androidx.compose.ui.graphics.o1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/ScopedGraphicsContext\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,475:1\n57#2,4:476\n57#2,4:481\n1#3:480\n287#4,6:485\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/ScopedGraphicsContext\n*L\n209#1:476,4\n228#1:481,4\n234#1:485,6\n*E\n"})
final class w implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private g2<androidx.compose.ui.graphics.layer.c> f37311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private o1 f37312b;

    @Override // androidx.compose.ui.graphics.o1
    @NotNull
    public androidx.compose.ui.graphics.shadow.k a() {
        o1 o1Var = this.f37312b;
        if (!(o1Var != null)) {
            s0.a.i("GraphicsContext not provided");
        }
        return o1Var.a();
    }

    @Override // androidx.compose.ui.graphics.o1
    @NotNull
    public androidx.compose.ui.graphics.layer.c b() {
        o1 o1Var = this.f37312b;
        if (!(o1Var != null)) {
            s0.a.i("GraphicsContext not provided");
        }
        androidx.compose.ui.graphics.layer.c cVarB = o1Var.b();
        g2<androidx.compose.ui.graphics.layer.c> g2Var = this.f37311a;
        if (g2Var == null) {
            this.f37311a = t2.h(cVarB);
            return cVarB;
        }
        g2Var.a0(cVarB);
        return cVarB;
    }

    @Override // androidx.compose.ui.graphics.o1
    public void c(@NotNull androidx.compose.ui.graphics.layer.c cVar) {
        o1 o1Var = this.f37312b;
        if (o1Var != null) {
            o1Var.c(cVar);
        }
    }

    @Nullable
    public final o1 d() {
        return this.f37312b;
    }

    public final void e() {
        g2<androidx.compose.ui.graphics.layer.c> g2Var = this.f37311a;
        if (g2Var != null) {
            Object[] objArr = g2Var.f12449a;
            int i10 = g2Var.f12450b;
            for (int i11 = 0; i11 < i10; i11++) {
                c((androidx.compose.ui.graphics.layer.c) objArr[i11]);
            }
            g2Var.l0();
        }
    }

    public final void f(@Nullable o1 o1Var) {
        e();
        this.f37312b = o1Var;
    }
}
