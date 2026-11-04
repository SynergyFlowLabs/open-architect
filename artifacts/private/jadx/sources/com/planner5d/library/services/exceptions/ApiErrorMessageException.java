package com.planner5d.library.services.exceptions;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.v;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import qd.b;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nApiErrorMessageException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiErrorMessageException.kt\ncom/planner5d/library/services/exceptions/ApiErrorMessageException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ApiErrorMessageException extends ErrorMessageException {

    @NotNull
    private final String category;
    private final int code;
    private final int httpCode;

    @NotNull
    private final String httpMessage;

    @NotNull
    private final String messageRawNew;

    @NotNull
    private final ApiErrorName name;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiErrorMessageException(@NotNull Context context, @NotNull Throwable cause, int i10, @NotNull String httpMessage, int i11, @NotNull ApiErrorName name, @NotNull String category) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(httpMessage, "httpMessage");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Integer numValueOf = Integer.valueOf(h3.z(context, "error_" + name.name(), v.b.f43988e));
        numValueOf = numValueOf.intValue() == 0 ? null : numValueOf;
        super(cause, numValueOf != null ? numValueOf.intValue() : b.q.N9, new String[0]);
        this.httpCode = i10;
        this.httpMessage = httpMessage;
        this.code = i11;
        this.name = name;
        this.category = category;
        int i12 = this.message;
        if (i12 != b.q.N9 && name != ApiErrorName.unknown) {
            httpMessage = context.getString(i12);
            Intrinsics.checkNotNull(httpMessage);
        }
        this.messageRawNew = httpMessage;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    @NotNull
    public final String getHttpMessage() {
        return this.httpMessage;
    }

    @Override // com.planner5d.library.services.exceptions.ErrorMessageException
    @NotNull
    public String getMessageRaw(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.messageRawNew;
    }

    @NotNull
    public final ApiErrorName getName() {
        return this.name;
    }

    @Override // com.planner5d.library.services.exceptions.ErrorMessageException
    @NotNull
    public k3 toTextValue() {
        return new k3(this.messageRawNew);
    }
}
