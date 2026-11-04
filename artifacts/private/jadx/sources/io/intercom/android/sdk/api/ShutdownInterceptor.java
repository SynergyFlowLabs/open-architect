package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.w;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ShutdownInterceptor implements w {
    private static final String ERROR = "error";
    private static final String MESSAGE = "message";
    private static final String MESSENGER_SHUTDOWN_RESPONSE = "messenger_shutdown_response";
    private static final String SHUTDOWN_PERIOD = "shutdown_period";
    private static final String TYPE = "type";
    private final ShutdownState shutdownState;
    private final Twig twig = LumberMill.getLogger();

    public ShutdownInterceptor(ShutdownState shutdownState) {
        this.shutdownState = shutdownState;
    }

    @Override // okhttp3.w
    public f0 intercept(w.a aVar) throws IOException {
        if (!this.shutdownState.canSendNetworkRequests()) {
            this.twig.e(this.shutdownState.getShutdownReason(), new Object[0]);
            throw new IOException(this.shutdownState.getShutdownReason());
        }
        f0 f0VarC = aVar.c(aVar.request());
        if (!f0VarC.isSuccessful()) {
            g0 g0VarR = f0VarC.r();
            String strString = g0VarR.string();
            f0VarC = f0VarC.j0().b(g0.create(g0VarR.contentType(), strString)).c();
            g0VarR.close();
            try {
                JSONObject jSONObject = new JSONObject(strString).getJSONObject("error");
                if (jSONObject.getString("type").equals(MESSENGER_SHUTDOWN_RESPONSE)) {
                    this.shutdownState.updateShutdownState(TimeUnit.SECONDS.toMillis(jSONObject.getLong(SHUTDOWN_PERIOD)), jSONObject.getString("message"));
                }
            } catch (JSONException unused) {
                this.twig.internal("Failed to deserialise error response: `" + strString + "` message: `" + f0VarC.f0() + "`");
            }
        }
        return f0VarC;
    }
}
