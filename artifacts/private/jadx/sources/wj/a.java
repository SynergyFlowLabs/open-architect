package wj;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.j;
import kotlin.text.k;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@i(name = "RegexExtensionsJDK8Kt")
public final class a {
    @e1(version = "1.2")
    @Nullable
    public static final MatchGroup a(@NotNull j jVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        k kVar = jVar instanceof k ? (k) jVar : null;
        if (kVar != null) {
            return kVar.get(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
