package androidx.activity.result;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final void a(@NotNull h<Void> hVar, @Nullable androidx.core.app.e eVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        hVar.c(null, eVar);
    }

    public static /* synthetic */ void b(h hVar, androidx.core.app.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = null;
        }
        a(hVar, eVar);
    }

    @oj.i(name = "launchUnit")
    public static final void c(@NotNull h<Unit> hVar, @Nullable androidx.core.app.e eVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        hVar.c(Unit.f312394a, eVar);
    }

    public static /* synthetic */ void d(h hVar, androidx.core.app.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = null;
        }
        c(hVar, eVar);
    }
}
