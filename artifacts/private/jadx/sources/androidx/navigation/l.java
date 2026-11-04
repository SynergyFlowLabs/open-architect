package androidx.navigation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class l {
    @NotNull
    public static final g.c a(@Nullable androidx.core.app.e eVar, int i10) {
        g.c.a aVar = new g.c.a();
        if (eVar != null) {
            aVar.c(eVar);
        }
        aVar.a(i10);
        return aVar.b();
    }

    public static /* synthetic */ g.c b(androidx.core.app.e eVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = null;
            int i12 = 3 ^ 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return k.a(eVar, i10);
    }
}
