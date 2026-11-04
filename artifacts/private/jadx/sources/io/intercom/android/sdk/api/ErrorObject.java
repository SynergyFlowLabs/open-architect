package io.intercom.android.sdk.api;

import androidx.annotation.p0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
public class ErrorObject {

    @p0
    private final String errorBody;
    private final int statusCode;
    private final Throwable throwable;
    private final Twig twig = LumberMill.getLogger();

    public ErrorObject(Throwable th2, @p0 Response response) {
        this.throwable = th2;
        this.errorBody = parseErrorBody(response);
        this.statusCode = parseStatusCode(response);
    }

    private String parseErrorBody(@p0 Response response) {
        if (response == null || response.errorBody() == null) {
            return null;
        }
        try {
            return response.errorBody().string();
        } catch (IOException e10) {
            this.twig.internal("Couldn't parse error body: " + e10.getMessage());
            return null;
        }
    }

    private int parseStatusCode(@p0 Response response) {
        if (response != null) {
            return response.code();
        }
        return -1;
    }

    @p0
    String getErrorBody() {
        return this.errorBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    boolean hasErrorBody() {
        return this.errorBody != null;
    }
}
