package androidx.work;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OverwritingInputMerger extends p {
    @Override // androidx.work.p
    @NotNull
    public h a(@NotNull List<h> inputs) throws Throwable {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        h.a aVar = new h.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<h> it = inputs.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapX = it.next().x();
            Intrinsics.checkNotNullExpressionValue(mapX, "input.keyValueMap");
            linkedHashMap.putAll(mapX);
        }
        aVar.d(linkedHashMap);
        h hVarA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(hVarA, "output.build()");
        return hVarA;
    }
}
