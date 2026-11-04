package androidx.compose.ui;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FrameRateElement extends e1<s> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f36924c;

    public FrameRateElement(float f10) {
        this.f36924c = f10;
    }

    public static /* synthetic */ FrameRateElement n(FrameRateElement frameRateElement, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = frameRateElement.f36924c;
        }
        return frameRateElement.m(f10);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrameRateElement) && Float.compare(this.f36924c, ((FrameRateElement) obj).f36924c) == 0;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return Float.hashCode(this.f36924c);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("FrameRateModifierNode");
        t2Var.b().c(io.sentry.rrweb.j.b.f306747l, Float.valueOf(this.f36924c));
    }

    public final float l() {
        return this.f36924c;
    }

    @NotNull
    public final FrameRateElement m(float f10) {
        return new FrameRateElement(f10);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public s a() {
        return new s(this.f36924c);
    }

    public final float p() {
        return this.f36924c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull s sVar) {
        if (sVar.v9() == this.f36924c) {
            return;
        }
        sVar.A9(true);
        sVar.z9(this.f36924c);
        androidx.compose.ui.node.u.a(sVar);
    }

    @NotNull
    public String toString() {
        return "FrameRateElement(frameRate=" + this.f36924c + ')';
    }
}
