package androidx.compose.material;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<androidx.compose.ui.unit.h> f24166a = new androidx.compose.animation.core.y3<>(120, 0, androidx.compose.animation.core.u0.d(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<androidx.compose.ui.unit.h> f24167b = new androidx.compose.animation.core.y3<>(150, 0, new androidx.compose.animation.core.e0(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<androidx.compose.ui.unit.h> f24168c = new androidx.compose.animation.core.y3<>(120, 0, new androidx.compose.animation.core.e0(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    @Nullable
    public static final Object d(@NotNull androidx.compose.animation.core.c<androidx.compose.ui.unit.h, ?> cVar, float f10, @Nullable androidx.compose.foundation.interaction.g gVar, @Nullable androidx.compose.foundation.interaction.g gVar2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        androidx.compose.animation.core.o<androidx.compose.ui.unit.h> oVarB;
        if (gVar2 != null) {
            oVarB = o7.f24039a.a(gVar2);
        } else {
            oVarB = gVar != null ? o7.f24039a.b(gVar) : null;
        }
        androidx.compose.animation.core.o<androidx.compose.ui.unit.h> oVar = oVarB;
        if (oVar != null) {
            Object objI = androidx.compose.animation.core.c.i(cVar, androidx.compose.ui.unit.h.o(f10), oVar, null, null, dVar, 12, null);
            return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
        }
        Object objC = cVar.C(androidx.compose.ui.unit.h.o(f10), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    public static /* synthetic */ Object e(androidx.compose.animation.core.c cVar, float f10, androidx.compose.foundation.interaction.g gVar, androidx.compose.foundation.interaction.g gVar2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            gVar = null;
        }
        if ((i10 & 4) != 0) {
            gVar2 = null;
        }
        return d(cVar, f10, gVar, gVar2, dVar);
    }
}
