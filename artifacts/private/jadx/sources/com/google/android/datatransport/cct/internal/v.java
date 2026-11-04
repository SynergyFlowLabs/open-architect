package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f103366a = "LogResponseInternal";

    static v a(long j10) {
        return new l(j10);
    }

    @NonNull
    public static v b(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        v vVarA = a(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return vVarA;
                    }
                    v vVarA2 = a(jsonReader.nextLong());
                    jsonReader.close();
                    return vVarA2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public abstract long c();
}
