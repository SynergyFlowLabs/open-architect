package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
final class b4 extends androidx.compose.ui.node.m {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.j f13917w;

    public b4(@Nullable androidx.compose.ui.node.j jVar) {
        this.f13917w = jVar;
    }

    private final void G9() {
        androidx.compose.ui.node.j jVarV9;
        androidx.compose.ui.a0.d dVarW;
        androidx.compose.ui.node.j jVar = this.f13917w;
        if (jVar == null || (dVarW = jVar.w()) == null || dVarW.a9()) {
            jVarV9 = null;
        } else {
            androidx.compose.ui.node.j jVar2 = this.f13917w;
            Intrinsics.checkNotNull(jVar2);
            jVarV9 = v9(jVar2);
        }
        this.f13917w = jVarV9;
    }

    public final void H9(@Nullable androidx.compose.ui.node.j jVar) {
        androidx.compose.ui.node.j jVar2 = this.f13917w;
        if (jVar2 != null) {
            C9(jVar2);
        }
        this.f13917w = jVar;
        G9();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        G9();
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        androidx.compose.ui.node.j jVar = this.f13917w;
        if (jVar != null) {
            C9(jVar);
        }
    }
}
