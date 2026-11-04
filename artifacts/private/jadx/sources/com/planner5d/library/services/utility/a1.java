package com.planner5d.library.services.utility;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.MalformedJsonException;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a1 {
    private Object b(JsonReader jsonReader) throws JSONException, IOException {
        try {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
                return g(jsonReader);
            }
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                return f(jsonReader);
            }
            if (jsonTokenPeek == JsonToken.BOOLEAN) {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
            if (jsonTokenPeek == JsonToken.STRING) {
                return jsonReader.nextString();
            }
            if (jsonTokenPeek == JsonToken.NUMBER) {
                return h(jsonReader.nextString());
            }
            if (jsonTokenPeek != JsonToken.NULL) {
                throw new JSONException("Invalid JsonToken");
            }
            jsonReader.nextNull();
            return JSONObject.NULL;
        } catch (EOFException e10) {
            throw new JSONException(e10.getMessage());
        }
    }

    private Object c(InputStream inputStream, boolean z10) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        jsonReader = null;
        inputStreamReader2 = null;
        JsonReader jsonReader = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(inputStream, Charset.defaultCharset());
                try {
                    try {
                        try {
                            JsonReader jsonReader2 = new JsonReader(inputStreamReader);
                            try {
                                Object objB = b(jsonReader2);
                                org.apache.commons.io.p.m(inputStreamReader);
                                return objB;
                            } catch (IOException e10) {
                                e = e10;
                                jsonReader = jsonReader2;
                                if (!z10 || e.getMessage() == null || !e.getMessage().contains("Expected JSON document to start with '[' or '{' but was STRING")) {
                                    throw e;
                                }
                                Object objD = d(jsonReader);
                                org.apache.commons.io.p.m(inputStreamReader);
                                return objD;
                            }
                        } catch (MalformedJsonException e11) {
                            e = e11;
                            inputStreamReader2 = inputStreamReader;
                            throw new JSONException(e.getMessage());
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader2 = inputStreamReader;
                    org.apache.commons.io.p.m(inputStreamReader2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (MalformedJsonException e13) {
            e = e13;
        } catch (IOException e14) {
            e = e14;
            inputStreamReader = null;
        }
    }

    @fj.h
    private Object d(JsonReader jsonReader) throws JSONException, IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jsonReader.nextString().getBytes());
        try {
            return c(byteArrayInputStream, false);
        } finally {
            org.apache.commons.io.p.k(byteArrayInputStream);
        }
    }

    private JSONArray f(JsonReader jsonReader) throws JSONException, IOException {
        jsonReader.beginArray();
        JSONArray jSONArray = new JSONArray();
        while (jsonReader.hasNext()) {
            jSONArray.put(b(jsonReader));
        }
        jsonReader.endArray();
        return jSONArray;
    }

    private JSONObject g(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            jSONObject.put(jsonReader.nextName(), b(jsonReader));
        }
        jsonReader.endObject();
        return jSONObject;
    }

    private Object h(String str) throws NumberFormatException {
        String strSubstring;
        int i10;
        if (str.indexOf(46) == -1) {
            if (str.startsWith("0x") || str.startsWith("0X")) {
                strSubstring = str.substring(2);
                i10 = 16;
            } else if (!str.startsWith(com.facebook.appevents.p.f99189d0) || str.length() <= 1) {
                i10 = 10;
                strSubstring = str;
            } else {
                strSubstring = str.substring(1);
                i10 = 8;
            }
            try {
                long j10 = Long.parseLong(strSubstring, i10);
                return (j10 > androidx.collection.g3.f12256c || j10 < androidx.collection.g3.f12261h) ? Long.valueOf(j10) : Integer.valueOf((int) j10);
            } catch (NumberFormatException unused) {
            }
        }
        return Double.valueOf(str);
    }

    @fj.h
    public JSONObject a(InputStream inputStream) throws Throwable {
        Object objC = c(inputStream, true);
        if (objC instanceof JSONObject) {
            return (JSONObject) objC;
        }
        return null;
    }

    @fj.h
    public JSONArray e(InputStream inputStream) throws Throwable {
        Object objC = c(inputStream, true);
        if (objC instanceof JSONArray) {
            return (JSONArray) objC;
        }
        return null;
    }

    @fj.h
    public Object i(InputStream inputStream) throws JSONException, IOException {
        return c(inputStream, true);
    }
}
