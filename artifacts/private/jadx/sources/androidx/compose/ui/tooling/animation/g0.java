package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.l3;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {
    @Nullable
    public static final f0<?> a(@NotNull l3<?> l3Var) {
        Set of2;
        Object objP = l3Var.p();
        if (objP == null) {
            return null;
        }
        Object[] enumConstants = objP.getClass().getEnumConstants();
        if (enumConstants == null || (of2 = ArraysKt.toSet(enumConstants)) == null) {
            of2 = SetsKt.setOf(objP);
        }
        String strS = l3Var.s();
        if (strS == null) {
            strS = j1.d(objP.getClass()).Q();
        }
        return new f0<>(l3Var, of2, strS);
    }
}
