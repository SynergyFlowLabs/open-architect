package app.rive.runtime.kotlin.renderers;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.g0;

/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class RiveArtboardRenderer$1$1 extends g0 implements Function0<Unit> {
    RiveArtboardRenderer$1$1(Object obj) {
        super(0, obj, RiveArtboardRenderer.class, "start", "start()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RiveArtboardRenderer) this.receiver).start();
    }
}
