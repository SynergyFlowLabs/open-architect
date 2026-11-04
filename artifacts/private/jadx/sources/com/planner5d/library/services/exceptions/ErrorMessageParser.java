package com.planner5d.library.services.exceptions;

import android.app.Application;
import androidx.annotation.f1;
import com.planner5d.library.api.c;
import com.planner5d.library.api.d;
import ij.a;
import ij.f;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.b;

/* JADX INFO: loaded from: classes10.dex */
@f
@SourceDebugExtension({"SMAP\nErrorMessageParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorMessageParser.kt\ncom/planner5d/library/services/exceptions/ErrorMessageParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class ErrorMessageParser {

    @NotNull
    private final Application application;

    @NotNull
    private final Map<String, Integer> messages;

    @NotNull
    private final NetworkErrorUtility networkErrorUtility;

    @a
    public ErrorMessageParser(@NotNull Application application, @NotNull NetworkErrorUtility networkErrorUtility) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(networkErrorUtility, "networkErrorUtility");
        this.application = application;
        this.networkErrorUtility = networkErrorUtility;
        this.messages = MapsKt.mapOf(TuplesKt.to("Your current password is missing or incorrect", Integer.valueOf(b.q.Y7)), TuplesKt.to("Not found", Integer.valueOf(b.q.W7)), TuplesKt.to("Already exists", Integer.valueOf(b.q.f353069n7)), TuplesKt.to("Already exist", Integer.valueOf(b.q.f353167r9)), TuplesKt.to("Invalid email address", Integer.valueOf(b.q.W7)), TuplesKt.to("Other error: already", Integer.valueOf(b.q.f352807ca)), TuplesKt.to("Other error: Forbidden", Integer.valueOf(b.q.f352807ca)), TuplesKt.to("User temporarily disabled", Integer.valueOf(b.q.T9)), TuplesKt.to("Unable to resolve host", Integer.valueOf(b.q.f352998k8)), TuplesKt.to("No more HD snapshots", Integer.valueOf(b.q.f353118p8)), TuplesKt.to("digital_code_auth_error_invalid_code", Integer.valueOf(b.q.f352985jj)));
    }

    public static /* synthetic */ ErrorMessageException parse$default(ErrorMessageParser errorMessageParser, Throwable th2, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = Integer.valueOf(b.q.N9);
        }
        return errorMessageParser.parse(th2, num);
    }

    private final int toCode(Throwable th2, @f1 int i10) {
        String message;
        Object next;
        Integer num;
        if (th2 != null && (message = th2.getMessage()) != null) {
            Iterator<T> it = this.messages.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.S2(message, (String) next, true));
            String str = (String) next;
            if (str != null && (num = this.messages.get(str)) != null) {
                return num.intValue();
            }
        }
        return i10;
    }

    @j
    @NotNull
    public final ErrorMessageException parse(@Nullable Throwable th2) {
        return parse$default(this, th2, null, 2, null);
    }

    @j
    @NotNull
    public final ErrorMessageException parse(@Nullable Throwable th2, @f1 @Nullable Integer num) {
        int iIntValue;
        c cVarB;
        ApiErrorName apiErrorName;
        if (th2 instanceof ErrorMessageException) {
            return (ErrorMessageException) th2;
        }
        int i10 = 0;
        if (th2 == null || (cVarB = d.f142250b.b(th2)) == null || cVarB.c() <= 0 || cVarB.e() == null || cVarB.g() == null || cVarB.d() == null) {
            if (num == null || num.intValue() == 0) {
                iIntValue = (th2 == null || !this.networkErrorUtility.isNetworkError(this.application, th2)) ? b.q.P7 : b.q.f352998k8;
            } else {
                iIntValue = num.intValue();
            }
            return new ErrorMessageException(th2, toCode(th2, iIntValue), new String[0]);
        }
        Application application = this.application;
        int iC = cVarB.c();
        String strF = cVarB.f();
        if (strF == null) {
            strF = com.planner5d.library.model.payments.a.f222474i;
        }
        String str = strF;
        int iIntValue2 = cVarB.e().intValue();
        ApiErrorName[] apiErrorNameArrValues = ApiErrorName.values();
        int length = apiErrorNameArrValues.length;
        while (true) {
            if (i10 >= length) {
                apiErrorName = null;
                break;
            }
            apiErrorName = apiErrorNameArrValues[i10];
            if (Intrinsics.areEqual(apiErrorName.name(), cVarB.g())) {
                break;
            }
            i10++;
        }
        if (apiErrorName == null) {
            apiErrorName = ApiErrorName.unknown;
        }
        return new ApiErrorMessageException(application, th2, iC, str, iIntValue2, apiErrorName, cVarB.d());
    }
}
