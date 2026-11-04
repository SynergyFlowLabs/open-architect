package com.planner5d.library.services.download;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.a1;
import com.planner5d.library.services.utility.h3;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public final class m implements l<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f224284b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1 f224285a = new a1();

    @Override // com.planner5d.library.services.download.l
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull g uri) throws Throwable {
        Intrinsics.checkNotNullParameter(uri, "uri");
        HttpURLConnection httpURLConnectionD0 = h3.d0(uri.b());
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(httpURLConnectionD0.getInputStream());
            try {
                JSONObject jSONObjectA = this.f224285a.a(gZIPInputStream);
                if (jSONObjectA == null) {
                    jSONObjectA = new JSONObject();
                }
                kotlin.io.c.a(gZIPInputStream, null);
                httpURLConnectionD0.disconnect();
                return jSONObjectA;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(gZIPInputStream, th2);
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
