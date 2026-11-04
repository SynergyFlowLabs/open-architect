package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseCallback<T> implements Callback<T> {
    private final Twig twig = LumberMill.getLogger();

    static String getDetails(ErrorObject errorObject) {
        String errorBody = errorObject.hasErrorBody() ? errorObject.getErrorBody() : errorObject.getThrowable().getMessage();
        return errorBody == null ? "unknown error" : errorBody;
    }

    private void handleError(ErrorObject errorObject) {
        logFailure("Api call failed", errorObject);
        onError(errorObject);
    }

    void logFailure(String str, ErrorObject errorObject) {
        this.twig.e(str + ": " + getDetails(errorObject), new Object[0]);
    }

    protected void onError(ErrorObject errorObject) {
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call<T> call, Throwable th2) {
        handleError(new ErrorObject(th2, null));
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call<T> call, Response<T> response) {
        if (response == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), null));
            return;
        }
        if (response.body() == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), response));
        } else if (response.isSuccessful()) {
            onSuccess(response.body());
        } else {
            handleError(new ErrorObject(new Exception("Status code outside the 200-300 range"), response));
        }
    }

    protected abstract void onSuccess(T t10);
}
