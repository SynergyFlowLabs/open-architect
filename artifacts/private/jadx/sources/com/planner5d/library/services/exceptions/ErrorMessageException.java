package com.planner5d.library.services.exceptions;

import android.content.Context;
import androidx.annotation.f1;
import com.planner5d.library.api.c;
import com.planner5d.library.api.e;
import com.planner5d.library.model.u;
import com.planner5d.library.services.utility.k3;
import qd.b;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
public class ErrorMessageException extends Exception {
    protected final int message;
    protected final String[] parameters;

    public ErrorMessageException(@f1 int i10, String... strArr) {
        this.message = i10;
        this.parameters = createParameters(null, i10, strArr);
    }

    public static ErrorMessageException createNetworkException() {
        return new ErrorMessageException(b.q.f352998k8, new String[0]);
    }

    public static ErrorMessageException createNoInternetException() {
        return new ErrorMessageException(b.q.f353070n8, new String[0]);
    }

    private String[] createParameters(Throwable th2, @f1 int i10, String... strArr) {
        String str;
        if ((i10 != b.q.f352998k8 && i10 != b.q.P7) || strArr.length != 0) {
            return strArr;
        }
        Response<c> responseB = th2 instanceof e ? ((e) th2).b() : null;
        if (responseB != null) {
            str = "#n:" + responseB.code();
        } else {
            str = "";
        }
        return new String[]{str};
    }

    public static ErrorMessageException createUserMissingException() {
        return new ErrorMessageException(b.q.Y9, new String[0]);
    }

    public static ErrorMessageException extract(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof ErrorMessageException) {
                return (ErrorMessageException) th2;
            }
            th2 = th2.getCause();
        }
        return null;
    }

    public static String getError(Context context, Throwable th2) {
        ErrorMessageException errorMessageExceptionExtract = extract(th2);
        return errorMessageExceptionExtract != null ? getError(context, errorMessageExceptionExtract) : getError(context, th2.getMessage());
    }

    public static String getWarning(Context context, ErrorMessageException errorMessageException) {
        return getWarning(context, errorMessageException.getMessageRaw(context));
    }

    public static boolean isOutOfFreeSpace(Context context, Throwable th2) {
        return getError(context, th2).contains("Not enough free space");
    }

    public static boolean isWithCode(Throwable th2, int... iArr) {
        if (th2 instanceof ErrorMessageException) {
            int i10 = ((ErrorMessageException) th2).message;
            for (int i11 : iArr) {
                if (i10 == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getMessageRaw(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getString(this.message, this.parameters);
        } catch (Throwable unused) {
            return null;
        }
    }

    public u toMessage() {
        return new u(u.c.Error, new k3(b.q.f352974j8, toTextValue()), new u.a[0]);
    }

    public k3 toTextValue() {
        return new k3(this.message, this.parameters);
    }

    public static String getWarning(Context context, String str) {
        return getError(context, str, b.q.mu);
    }

    public ErrorMessageException(Throwable th2, @f1 int i10, String... strArr) {
        super(th2);
        this.message = i10;
        this.parameters = createParameters(th2, i10, strArr);
    }

    public static String getError(Context context, ErrorMessageException errorMessageException) {
        return getError(context, errorMessageException.getMessageRaw(context));
    }

    public static String getError(Context context, @f1 int i10) {
        return getError(context, context.getString(i10));
    }

    public static String getError(Context context, String str) {
        return getError(context, str, b.q.f352974j8);
    }

    private static String getError(Context context, String str, @f1 int i10) {
        if (context == null) {
            return null;
        }
        return context.getString(i10, str);
    }
}
