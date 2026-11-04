package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14150b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f14151a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(e eVar, androidx.compose.ui.graphics.drawscope.c cVar) {
        androidx.compose.ui.graphics.layer.c cVar2 = eVar.f14151a;
        Intrinsics.checkNotNull(cVar2);
        androidx.compose.ui.graphics.layer.e.a(cVar, cVar2);
        return Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.ui.draw.o c(@NotNull androidx.compose.ui.draw.i iVar) {
        androidx.compose.ui.graphics.layer.c cVarJ = iVar.J();
        androidx.compose.ui.draw.i.U(iVar, cVarJ, null, null, 0L, new Function1() { // from class: androidx.compose.foundation.draganddrop.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.d((androidx.compose.ui.graphics.drawscope.c) obj);
            }
        }, 7, null);
        this.f14151a = cVarJ;
        return iVar.N(new Function1() { // from class: androidx.compose.foundation.draganddrop.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.e(this.f14149a, (androidx.compose.ui.graphics.drawscope.c) obj);
            }
        });
    }

    public final void f(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.layer.c cVar = this.f14151a;
        if (cVar == null) {
            throw new IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
        }
        androidx.compose.ui.graphics.layer.e.a(fVar, cVar);
    }
}
