package androidx.work;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final /* synthetic */ <T> boolean a(h hVar, String key) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        int i10 = 3 >> 4;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return hVar.C(key, Object.class);
    }

    @NotNull
    public static final h b(@NotNull Pair<String, ? extends Object>... pairs) throws Throwable {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        h.a aVar = new h.a();
        for (Pair<String, ? extends Object> pair : pairs) {
            aVar.b(pair.getFirst(), pair.getSecond());
        }
        h hVarA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(hVarA, "dataBuilder.build()");
        return hVarA;
    }
}
