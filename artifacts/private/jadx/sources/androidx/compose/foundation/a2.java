package androidx.compose.foundation;

import android.graphics.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@SourceDebugExtension({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,109:1\n1107#2:110\n1085#2,2:111\n136#3:113\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n*L\n100#1:110\n100#1:111,2\n101#1:113\n*E\n"})
final class a2 extends o4 {
    public a2(@Nullable Function1<? super androidx.compose.ui.layout.g0, n0.j> function1) {
        super(function1);
    }

    @Override // androidx.compose.foundation.o4
    public void B9(@NotNull androidx.compose.runtime.collection.d<Rect> dVar) {
        y9().setSystemGestureExclusionRects(dVar.q());
    }

    @Override // androidx.compose.foundation.o4
    @NotNull
    public androidx.compose.runtime.collection.d<Rect> w9() {
        androidx.compose.runtime.collection.d<Rect> dVar = new androidx.compose.runtime.collection.d<>(new Rect[16], 0);
        dVar.k(dVar.R(), y9().getSystemGestureExclusionRects());
        return dVar;
    }
}
