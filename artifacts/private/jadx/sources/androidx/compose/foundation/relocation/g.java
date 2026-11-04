package androidx.compose.foundation.relocation;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,161:1\n643#2,2:162\n648#2,2:164\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n*L\n146#1:162,2\n153#1:164,2\n*E\n"})
public final class g extends a0.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f18570v = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private a f18571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f18572t;

    public g(@NotNull a aVar) {
        this.f18571s = aVar;
    }

    private final void v9() {
        a aVar = this.f18571s;
        if (aVar instanceof c) {
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((c) aVar).e().n0(this);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f18572t;
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        w9(this.f18571s);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        v9();
    }

    public final void w9(@NotNull a aVar) {
        v9();
        if (aVar instanceof c) {
            ((c) aVar).e().d(this);
        }
        this.f18571s = aVar;
    }
}
