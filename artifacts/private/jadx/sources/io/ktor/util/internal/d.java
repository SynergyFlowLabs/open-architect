package io.ktor.util.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class d extends f {
    @Override // io.ktor.util.internal.f
    public final boolean C() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Void J() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ <T extends f> void K(Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object objT = t();
        Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        for (f fVarU = (f) objT; !Intrinsics.areEqual(fVarU, this); fVarU = fVarU.u()) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (fVarU != null) {
                block.invoke(fVarU);
            }
        }
    }

    public final boolean L() {
        return t() == this;
    }

    public final void M() {
        Object objT = t();
        Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        f fVar = (f) objT;
        f fVar2 = this;
        while (!Intrinsics.areEqual(fVar, this)) {
            f fVarU = fVar.u();
            fVar.I(fVar2, fVarU);
            fVar2 = fVar;
            fVar = fVarU;
        }
        Object objT2 = t();
        Intrinsics.checkNotNull(objT2, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        I(fVar2, (f) objT2);
    }

    @Override // io.ktor.util.internal.f
    public /* bridge */ /* synthetic */ a n() {
        return (a) J();
    }
}
