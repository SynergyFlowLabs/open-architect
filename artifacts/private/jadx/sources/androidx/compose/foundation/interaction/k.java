package androidx.compose.foundation.interaction;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j0<g> f15641a = q0.b(0, 16, kotlinx.coroutines.channels.j.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.j
    public boolean a(@NotNull g gVar) {
        return c().f(gVar);
    }

    @Override // androidx.compose.foundation.interaction.j
    @Nullable
    public Object b(@NotNull g gVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objEmit = c().emit(gVar, dVar);
        return objEmit == kotlin.coroutines.intrinsics.b.l() ? objEmit : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.interaction.h
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j0<g> c() {
        return this.f15641a;
    }
}
