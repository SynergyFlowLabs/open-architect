package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f52167a = new HashMap();

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public boolean a(@NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.f52167a.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z10 = (iIntValue & i10) != 0;
        this.f52167a.put(name, Integer.valueOf(i10 | iIntValue));
        return !z10;
    }
}
