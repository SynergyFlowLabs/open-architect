package ih;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static final /* synthetic */ <T extends Enum<T>> T a(String name) {
        Object objM785constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.a aVar = Result.Companion;
            Intrinsics.reifiedOperationMarker(5, androidx.exifinterface.media.a.f51379e5);
            objM785constructorimpl = Result.m785constructorimpl(Enum.valueOf(null, name));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        return (T) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
    }
}
