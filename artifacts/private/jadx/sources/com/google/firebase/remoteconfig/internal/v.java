package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.l1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@androidx.annotation.d
public class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("ConfigStorageClient.class")
    private static final Map<String, v> f124682c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f124683d = "UTF-8";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f124684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f124685b;

    private v(Context context, String str) {
        this.f124684a = context;
        this.f124685b = str;
    }

    @l1
    public static synchronized void b() {
        try {
            f124682c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized v d(Context context, String str) {
        Map<String, v> map;
        try {
            map = f124682c;
            if (!map.containsKey(str)) {
                map.put(str, new v(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map.get(str);
    }

    public synchronized Void a() {
        this.f124684a.deleteFile(this.f124685b);
        return null;
    }

    String c() {
        return this.f124685b;
    }

    @fj.h
    public synchronized h e() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            try {
                fileInputStreamOpenFileInput = this.f124684a.openFileInput(this.f124685b);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    h hVarB = h.b(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                    return hVarB;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th5) {
            fileInputStreamOpenFileInput = null;
            th2 = th5;
        }
    }

    public synchronized Void f(h hVar) throws IOException {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = this.f124684a.openFileOutput(this.f124685b, 0);
            try {
                fileOutputStreamOpenFileOutput.write(hVar.toString().getBytes("UTF-8"));
                fileOutputStreamOpenFileOutput.close();
            } catch (Throwable th2) {
                fileOutputStreamOpenFileOutput.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return null;
    }
}
