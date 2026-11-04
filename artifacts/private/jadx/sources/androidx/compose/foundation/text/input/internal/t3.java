package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.d7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLegacyAdaptingPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAdaptingPlatformTextInputModifierNode.kt\nandroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,141:1\n85#2:142\n117#2,2:143\n*S KotlinDebug\n*F\n+ 1 LegacyAdaptingPlatformTextInputModifierNode.kt\nandroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode\n*L\n100#1:142\n100#1:143,2\n*E\n"})
public final class t3 extends androidx.compose.ui.a0.d implements androidx.compose.ui.platform.k3, androidx.compose.ui.node.h, androidx.compose.ui.node.v, x3.a {
    public static final int X = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private x3 f20067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.text.g4 f20068t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.text.selection.u3 f20069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f20070w = d7.g(null, null, 2, null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", i = {}, l = {androidx.media2.widget.f.i.f59767c0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20071a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.ui.platform.m3, kotlin.coroutines.d<?>, Object> f20073c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.ui.platform.m3, ? super kotlin.coroutines.d<?>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f20073c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t3.this.new a(this.f20073c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20071a;
            if (i10 == 0) {
                ResultKt.m(obj);
                t3 t3Var = t3.this;
                Function2<androidx.compose.ui.platform.m3, kotlin.coroutines.d<?>, Object> function2 = this.f20073c;
                this.f20071a = 1;
                if (androidx.compose.ui.platform.l3.c(t3Var, function2, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public t3(@NotNull x3 x3Var, @NotNull androidx.compose.foundation.text.g4 g4Var, @NotNull androidx.compose.foundation.text.selection.u3 u3Var) {
        this.f20067s = x3Var;
        this.f20068t = g4Var;
        this.f20069v = u3Var;
    }

    private void v9(androidx.compose.ui.layout.g0 g0Var) {
        this.f20070w.setValue(g0Var);
    }

    @Override // androidx.compose.foundation.text.input.internal.x3.a
    @Nullable
    public androidx.compose.ui.layout.g0 M() {
        return (androidx.compose.ui.layout.g0) this.f20070w.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.x3.a
    @Nullable
    public kotlinx.coroutines.p2 V6(@NotNull Function2<? super androidx.compose.ui.platform.m3, ? super kotlin.coroutines.d<?>, ? extends Object> function2) {
        if (a9()) {
            return kotlinx.coroutines.k.f(Q8(), null, kotlinx.coroutines.u0.UNDISPATCHED, new a(function2, null), 1, null);
        }
        return null;
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        this.f20067s.j(this);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f20067s.l(this);
    }

    @Override // androidx.compose.foundation.text.input.internal.x3.a
    @Nullable
    public androidx.compose.ui.platform.z3 getSoftwareKeyboardController() {
        return (androidx.compose.ui.platform.z3) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.y());
    }

    @Override // androidx.compose.foundation.text.input.internal.x3.a
    @NotNull
    public androidx.compose.ui.platform.o4 getViewConfiguration() {
        return (androidx.compose.ui.platform.o4) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.D());
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        v9(g0Var);
    }

    @Override // androidx.compose.foundation.text.input.internal.x3.a
    @NotNull
    public androidx.compose.foundation.text.selection.u3 o3() {
        return this.f20069v;
    }

    @Override // androidx.compose.foundation.text.input.internal.x3.a
    @NotNull
    public androidx.compose.foundation.text.g4 u4() {
        return this.f20068t;
    }

    public void w9(@NotNull androidx.compose.foundation.text.g4 g4Var) {
        this.f20068t = g4Var;
    }

    public final void x9(@NotNull x3 x3Var) {
        if (a9()) {
            this.f20067s.a();
            this.f20067s.l(this);
        }
        this.f20067s = x3Var;
        if (a9()) {
            this.f20067s.j(this);
        }
    }

    public void y9(@NotNull androidx.compose.foundation.text.selection.u3 u3Var) {
        this.f20069v = u3Var;
    }
}
