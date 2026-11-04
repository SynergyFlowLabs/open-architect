package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/DelegatingThemeAwareRippleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
final class DelegatingThemeAwareRippleNode extends androidx.compose.ui.node.m implements androidx.compose.ui.node.h, androidx.compose.ui.node.q1 {
    private final boolean X;
    private final float Y;

    @Nullable
    private androidx.compose.ui.node.j Z;

    @NotNull
    private final androidx.compose.ui.graphics.x0 color;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.h f25902w;

    @SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,316:1\n635#2:317\n635#2:318\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1\n*L\n273#1:317\n279#1:318\n*E\n"})
    static final class a implements androidx.compose.ui.graphics.x0 {
        a() {
        }

        @Override // androidx.compose.ui.graphics.x0
        public final long a() {
            long jA = DelegatingThemeAwareRippleNode.this.color.a();
            if (jA != 16) {
                return jA;
            }
            dt dtVar = (dt) androidx.compose.ui.node.i.a(DelegatingThemeAwareRippleNode.this, gt.c());
            return (dtVar == null || dtVar.a() == 16) ? ((androidx.compose.ui.graphics.q0) androidx.compose.ui.node.i.a(DelegatingThemeAwareRippleNode.this, c7.a())).M() : dtVar.a();
        }
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, androidx.compose.ui.graphics.x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, z10, f10, x0Var);
    }

    private final void J9() {
        this.Z = v9(androidx.compose.material.ripple.v.c(this.f25902w, this.X, this.Y, new a(), new Function0() { // from class: androidx.compose.material3.dd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegatingThemeAwareRippleNode.K9(this.f27097a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material.ripple.l K9(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        androidx.compose.material.ripple.l lVarB;
        dt dtVar = (dt) androidx.compose.ui.node.i.a(delegatingThemeAwareRippleNode, gt.c());
        return (dtVar == null || (lVarB = dtVar.b()) == null) ? et.f27436a.a() : lVarB;
    }

    private final void L9() {
        androidx.compose.ui.node.j jVar = this.Z;
        if (jVar != null) {
            C9(jVar);
        }
        this.Z = null;
    }

    private final void M9() {
        androidx.compose.ui.node.r1.a(this, new Function0() { // from class: androidx.compose.material3.cd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegatingThemeAwareRippleNode.N9(this.f26752a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N9(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        if (((dt) androidx.compose.ui.node.i.a(delegatingThemeAwareRippleNode, gt.c())) == null) {
            delegatingThemeAwareRippleNode.L9();
        } else if (delegatingThemeAwareRippleNode.Z == null) {
            delegatingThemeAwareRippleNode.J9();
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        M9();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        M9();
    }

    private DelegatingThemeAwareRippleNode(androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, androidx.compose.ui.graphics.x0 x0Var) {
        this.f25902w = hVar;
        this.X = z10;
        this.Y = f10;
        this.color = x0Var;
    }
}
