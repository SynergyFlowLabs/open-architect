package androidx.compose.ui.semantics;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class k implements Comparator<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f41136a = new k();

    private k() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull u uVar, @NotNull u uVar2) {
        n0.j jVarN = uVar.n();
        n0.j jVarN2 = uVar2.n();
        int iCompare = Float.compare(jVarN2.x(), jVarN.x());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(jVarN.B(), jVarN2.B());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(jVarN.j(), jVarN2.j());
        return iCompare3 != 0 ? iCompare3 : Float.compare(jVarN2.t(), jVarN.t());
    }
}
