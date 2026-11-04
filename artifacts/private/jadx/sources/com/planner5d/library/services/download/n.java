package com.planner5d.library.services.download;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.h3;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 1)
public final class n implements l<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f224286a = 0;

    @Override // com.planner5d.library.services.download.l
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull g uri) throws Throwable {
        Intrinsics.checkNotNullParameter(uri, "uri");
        HttpURLConnection httpURLConnectionD0 = h3.d0(uri.b());
        try {
            InputStream inputStream = httpURLConnectionD0.getInputStream();
            try {
                JSONObject jSONObject = new JSONObject(org.apache.commons.io.p.K0(inputStream, Charset.defaultCharset()));
                kotlin.io.c.a(inputStream, null);
                httpURLConnectionD0.disconnect();
                return jSONObject;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            if (httpURLConnectionD0 != null) {
                httpURLConnectionD0.disconnect();
            }
            throw th4;
        }
    }
}
