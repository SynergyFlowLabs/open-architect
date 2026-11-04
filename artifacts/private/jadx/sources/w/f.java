package w;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.modifier.i;
import androidx.compose.ui.modifier.j;
import androidx.compose.ui.modifier.k;
import androidx.compose.ui.node.m;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class f extends m implements j, androidx.compose.ui.node.h {
    public static final int Z = 8;

    @NotNull
    private final androidx.compose.foundation.content.internal.c X;

    @NotNull
    private final i Y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private d f385805w;

    public f(@NotNull d dVar) {
        this.f385805w = dVar;
        androidx.compose.foundation.content.internal.b bVar = new androidx.compose.foundation.content.internal.b(this);
        this.X = bVar;
        this.Y = k.d(TuplesKt.to(androidx.compose.foundation.content.internal.f.c(), bVar));
        v9(androidx.compose.foundation.content.internal.h.b(bVar, new Function1() { // from class: w.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.H9(this.f385804a, (androidx.compose.ui.draganddrop.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H9(f fVar, androidx.compose.ui.draganddrop.b bVar) {
        androidx.compose.foundation.content.internal.a.b(fVar, bVar);
        return Unit.f312394a;
    }

    @NotNull
    public final d I9() {
        return this.f385805w;
    }

    public final void J9(@NotNull d dVar) {
        this.f385805w = dVar;
    }

    public final void K9(@NotNull d dVar) {
        this.f385805w = dVar;
    }

    @Override // androidx.compose.ui.modifier.j
    @NotNull
    public i x1() {
        return this.Y;
    }
}
