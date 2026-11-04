package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g3 {
    @NotNull
    public static final f.e<String> a(@NotNull f.e<? extends f.a> eVar) {
        f.a aVarH = eVar.h();
        Intrinsics.checkNotNull(aVarH, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new f.e<>(((f3) aVarH).h(), eVar.i(), eVar.g(), eVar.j());
    }
}
