package androidx.compose.foundation.draganddrop;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDragAndDropTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropTarget.kt\nandroidx/compose/foundation/draganddrop/DragAndDropTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
final class q extends androidx.compose.ui.node.m {

    @NotNull
    private androidx.compose.ui.draganddrop.i X;

    @Nullable
    private androidx.compose.ui.draganddrop.j Y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.draganddrop.b, Boolean> f14166w;

    public q(@NotNull Function1<? super androidx.compose.ui.draganddrop.b, Boolean> function1, @NotNull androidx.compose.ui.draganddrop.i iVar) {
        this.f14166w = function1;
        this.X = iVar;
    }

    private final void H9() {
        this.Y = (androidx.compose.ui.draganddrop.j) v9(androidx.compose.ui.draganddrop.f.d(new Function1() { // from class: androidx.compose.foundation.draganddrop.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(q.I9(this.f14165a, (androidx.compose.ui.draganddrop.b) obj));
            }
        }, this.X));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I9(q qVar, androidx.compose.ui.draganddrop.b bVar) {
        return qVar.f14166w.invoke(bVar).booleanValue();
    }

    public final void J9(@NotNull Function1<? super androidx.compose.ui.draganddrop.b, Boolean> function1, @NotNull androidx.compose.ui.draganddrop.i iVar) {
        this.f14166w = function1;
        if (Intrinsics.areEqual(iVar, this.X)) {
            return;
        }
        androidx.compose.ui.draganddrop.j jVar = this.Y;
        if (jVar != null) {
            C9(jVar);
        }
        this.X = iVar;
        H9();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        H9();
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        androidx.compose.ui.draganddrop.j jVar = this.Y;
        Intrinsics.checkNotNull(jVar);
        C9(jVar);
    }
}
