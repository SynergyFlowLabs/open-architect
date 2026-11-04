package kotlinx.serialization.json.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes13.dex */
public final class ArrayPoolsKt {
    private static final int MAX_CHARS_IN_POOL;

    static {
        Object objM785constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM785constructorimpl = Result.m785constructorimpl(property != null ? StringsKt.toIntOrNull(property) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        Integer num = (Integer) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
        MAX_CHARS_IN_POOL = num != null ? num.intValue() : 2097152;
    }
}
