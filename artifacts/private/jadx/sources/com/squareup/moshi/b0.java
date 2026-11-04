package com.squareup.moshi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 {
    @kotlin.s
    public static final /* synthetic */ <T> h<T> a(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        return b(wVar, null);
    }

    @kotlin.s
    @NotNull
    public static final <T> h<T> b(@NotNull w wVar, @NotNull kotlin.reflect.s ktype) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(ktype, "ktype");
        h<T> hVarD = wVar.d(kotlin.reflect.a0.f(ktype));
        if (!(hVarD instanceof com.squareup.moshi.internal.b) && !(hVarD instanceof com.squareup.moshi.internal.a)) {
            if (ktype.A()) {
                h<T> hVarJ = hVarD.j();
                Intrinsics.checkNotNullExpressionValue(hVarJ, "{\n    adapter.nullSafe()\n  }");
                return hVarJ;
            }
            hVarD = hVarD.i();
            Intrinsics.checkNotNullExpressionValue(hVarD, "{\n    adapter.nonNull()\n  }");
        }
        return hVarD;
    }

    @kotlin.s
    public static final /* synthetic */ <T> w.c c(w.c cVar, h<T> adapter) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        w.c cVarC = cVar.c(kotlin.reflect.a0.f(null), adapter);
        Intrinsics.checkNotNullExpressionValue(cVarC, "add(typeOf<T>().javaType, adapter)");
        return cVarC;
    }
}
