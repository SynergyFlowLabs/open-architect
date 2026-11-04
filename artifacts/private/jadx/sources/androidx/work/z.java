package androidx.work;

import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class z {
    public static final /* synthetic */ <W extends u> y.a a() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.U4);
        return new y.a(u.class);
    }

    @NotNull
    public static final y.a b(@NotNull y.a aVar, @NonNull @NotNull kotlin.reflect.d<? extends p> inputMerger) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
        return aVar.C(oj.b.e(inputMerger));
    }
}
