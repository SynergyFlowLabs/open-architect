package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.d0;
import androidx.compose.foundation.text.input.internal.v;
import androidx.compose.ui.input.pointer.q;
import androidx.compose.ui.input.pointer.s;
import androidx.compose.ui.node.d2;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.m;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class c extends m implements d2 {

    @NotNull
    private final f0 X = g0.b(j0.NONE, new Function0() { // from class: androidx.compose.foundation.text.handwriting.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.I9(this.f19350a);
        }
    });

    @NotNull
    private final i Y = (i) v9(new i(new Function0() { // from class: androidx.compose.foundation.text.handwriting.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.M9(this.f19351a);
        }
    }));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f19352w;

    public c(@NotNull Function0<Unit> function0) {
        this.f19352w = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v I9(c cVar) {
        return d0.b(l.a(cVar));
    }

    private final v K9() {
        return (v) this.X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M9(c cVar) {
        cVar.f19352w.invoke();
        cVar.K9().i();
        return Unit.f312394a;
    }

    @NotNull
    public final Function0<Unit> J9() {
        return this.f19352w;
    }

    @NotNull
    public final i L9() {
        return this.Y;
    }

    public final void N9(@NotNull Function0<Unit> function0) {
        this.f19352w = function0;
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        this.Y.p3();
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull q qVar, @NotNull s sVar, long j10) {
        this.Y.p5(qVar, sVar, j10);
    }

    @Override // androidx.compose.ui.node.d2
    public long z2() {
        return this.Y.z2();
    }
}
