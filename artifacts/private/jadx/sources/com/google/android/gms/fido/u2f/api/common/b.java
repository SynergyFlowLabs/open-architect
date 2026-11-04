package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public static final String f107452c = "errorCode";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public static final String f107453d = "errorMessage";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ErrorCode f107454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107455b;

    public b(@NonNull ErrorCode errorCode) {
        this.f107454a = errorCode;
        this.f107455b = null;
    }

    @NonNull
    public ErrorCode a() {
        return this.f107454a;
    }

    @NonNull
    public String b() {
        return this.f107455b;
    }

    @NonNull
    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.f107454a.k());
            String str = this.f107455b;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public String toString() {
        return this.f107455b == null ? String.format(Locale.ENGLISH, "{errorCode: %d}", Integer.valueOf(this.f107454a.k())) : String.format(Locale.ENGLISH, "{errorCode: %d, errorMessage: %s}", Integer.valueOf(this.f107454a.k()), this.f107455b);
    }

    public b(@NonNull ErrorCode errorCode, @NonNull String str) {
        this.f107454a = errorCode;
        this.f107455b = str;
    }
}
