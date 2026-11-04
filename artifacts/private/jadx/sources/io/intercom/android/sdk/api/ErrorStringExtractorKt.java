package io.intercom.android.sdk.api;

import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.o;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.logger.LumberMill;
import io.sentry.k9;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ErrorStringExtractorKt {
    @NotNull
    public static final String extractErrorString(@NotNull ErrorObject errorObject) {
        String message;
        Intrinsics.checkNotNullParameter(errorObject, "errorObject");
        Twig logger = LumberMill.getLogger();
        if (!errorObject.hasErrorBody() || errorObject.getErrorBody() == null) {
            return "Something went wrong";
        }
        try {
            o oVar = (o) Injector.get().getGson().r(errorObject.getErrorBody(), o.class);
            if (oVar == null) {
                return "Something went wrong";
            }
            if (oVar.W("error")) {
                String strD = oVar.S("error").D();
                Intrinsics.checkNotNull(strD);
                return strD;
            }
            if (!oVar.W(k9.b.f305800g)) {
                return "Something went wrong";
            }
            i iVarT = oVar.T(k9.b.f305800g);
            Intrinsics.checkNotNullExpressionValue(iVarT, "getAsJsonArray(...)");
            return CollectionsKt.joinToString$default(iVarT, " - ", null, null, 0, null, new Function1() { // from class: io.intercom.android.sdk.api.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ErrorStringExtractorKt.extractErrorString$lambda$0((l) obj);
                }
            }, 30, null);
        } catch (Exception e10) {
            logger.e(e10);
            Throwable throwable = errorObject.getThrowable();
            return (throwable == null || (message = throwable.getMessage()) == null) ? "Something went wrong" : message;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence extractErrorString$lambda$0(l lVar) {
        if (!lVar.J() || !lVar.v().W("message")) {
            return "Something went wrong";
        }
        String strD = lVar.v().S("message").D();
        Intrinsics.checkNotNull(strD);
        return strD;
    }
}
