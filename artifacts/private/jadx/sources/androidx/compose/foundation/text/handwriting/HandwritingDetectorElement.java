package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import com.sun.jna.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class HandwritingDetectorElement extends e1<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f19348c;

    public HandwritingDetectorElement(@NotNull Function0<Unit> function0) {
        this.f19348c = function0;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        boolean z10 = false;
        boolean z11 = this == obj;
        if ((obj instanceof HandwritingDetectorElement) && this.f19348c == ((HandwritingDetectorElement) obj).f19348c) {
            z10 = true;
        }
        return z11 | z10;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f19348c.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("handwritingDetector");
        t2Var.b().c(Callback.METHOD_NAME, this.f19348c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.f19348c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull c cVar) {
        cVar.N9(this.f19348c);
    }
}
