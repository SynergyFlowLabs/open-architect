package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class n4 {

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.c0 f40669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.j0 f40670b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.lifecycle.c0 c0Var, androidx.lifecycle.j0 j0Var) {
            super(0);
            this.f40669a = c0Var;
            this.f40670b = j0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f40669a.g(this.f40670b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> c(final androidx.compose.ui.platform.a aVar, androidx.lifecycle.c0 c0Var) {
        if (c0Var.d().compareTo(androidx.lifecycle.c0.b.DESTROYED) > 0) {
            androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0() { // from class: androidx.compose.ui.platform.m4
                @Override // androidx.lifecycle.j0
                public final void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar2) {
                    n4.d(aVar, o0Var, aVar2);
                }
            };
            c0Var.c(j0Var);
            return new a(c0Var, j0Var);
        }
        throw new IllegalStateException(("Cannot configure " + aVar + " to disposeComposition at Lifecycle ON_DESTROY: " + c0Var + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(androidx.compose.ui.platform.a aVar, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar2) {
        if (aVar2 == androidx.lifecycle.c0.a.ON_DESTROY) {
            aVar.disposeComposition();
        }
    }
}
