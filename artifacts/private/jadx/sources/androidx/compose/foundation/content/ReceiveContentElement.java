package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.d;
import w.f;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class ReceiveContentElement extends e1<f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14003d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f14004c;

    public ReceiveContentElement(@NotNull d dVar) {
        this.f14004c = dVar;
    }

    public static /* synthetic */ ReceiveContentElement n(ReceiveContentElement receiveContentElement, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = receiveContentElement.f14004c;
        }
        return receiveContentElement.m(dVar);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentElement) && Intrinsics.areEqual(this.f14004c, ((ReceiveContentElement) obj).f14004c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f14004c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("receiveContent");
    }

    @NotNull
    public final d l() {
        return this.f14004c;
    }

    @NotNull
    public final ReceiveContentElement m(@NotNull d dVar) {
        return new ReceiveContentElement(dVar);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f(this.f14004c);
    }

    @NotNull
    public final d p() {
        return this.f14004c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f fVar) {
        fVar.K9(this.f14004c);
    }

    @NotNull
    public String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.f14004c + ')';
    }
}
