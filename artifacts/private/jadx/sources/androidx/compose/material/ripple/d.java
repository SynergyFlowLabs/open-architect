package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.x0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleNode\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n256#2:363\n1#3:364\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleNode\n*L\n120#1:363\n*E\n"})
public final class d extends RippleNode implements p {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f24744i3 = 8;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private o f24745g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private s f24746h3;

    public /* synthetic */ d(androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, x0 x0Var, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, z10, f10, x0Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M9(d dVar) {
        androidx.compose.ui.node.u.a(dVar);
        return Unit.f312394a;
    }

    private final o N9() {
        o oVar = this.f24745g3;
        if (oVar != null) {
            Intrinsics.checkNotNull(oVar);
            return oVar;
        }
        o oVarC = z.c(z.e((View) androidx.compose.ui.node.i.a(this, AndroidCompositionLocals_androidKt.m())));
        this.f24745g3 = oVarC;
        Intrinsics.checkNotNull(oVarC);
        return oVarC;
    }

    private final void O9(s sVar) {
        this.f24746h3 = sVar;
        androidx.compose.ui.node.u.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void A9(@NotNull androidx.compose.foundation.interaction.l.b bVar, long j10, float f10) {
        s sVarB = N9().b(this);
        sVarB.b(bVar, C9(), j10, kotlin.math.b.L0(f10), E9(), D9().invoke().d(), new Function0() { // from class: androidx.compose.material.ripple.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.M9(this.f24743a);
            }
        });
        O9(sVarB);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void B9(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        k0 k0VarF = fVar.Z3().f();
        s sVar = this.f24746h3;
        if (sVar != null) {
            sVar.f(F9(), kotlin.math.b.L0(G9()), E9(), D9().invoke().d());
            sVar.draw(androidx.compose.ui.graphics.c.d(k0VarF));
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void I9(@NotNull androidx.compose.foundation.interaction.l.b bVar) {
        s sVar = this.f24746h3;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        o oVar = this.f24745g3;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    @Override // androidx.compose.material.ripple.p
    public void u7() {
        O9(null);
    }

    private d(androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, x0 x0Var, Function0<l> function0) {
        super(hVar, z10, f10, x0Var, function0, null);
    }
}
