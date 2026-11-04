package uuJkLzXcV;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class iiOpQaSdF {

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public static final ExecutorService f381315xxCvBnMs = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public static final byte[] f381314vvBnMaSd = {h.a.f339272h, -118, h.a.f339272h, -106, h.a.f339272h, -106, h.a.f339272h, -110, h.a.f339272h, -107, h.a.f339271g, -100, h.a.f339271g, -111, h.a.f339271g, -111, h.a.f339272h, -123, h.a.f339272h, -118, h.a.f339272h, -121, h.a.f339272h, -123, h.a.f339272h, -115, h.a.f339272h, -125, h.a.f339272h, -110, h.a.f339272h, -110, h.a.f339272h, -105, h.a.f339272h, -110, h.a.f339272h, -122, h.a.f339272h, -125, h.a.f339272h, -106, h.a.f339272h, -121, h.a.f339271g, h.a.f339267c, h.a.f339272h, -125, h.a.f339272h, h.a.f339267c, h.a.f339272h, -122, h.a.f339272h, -108, h.a.f339272h, -111, h.a.f339272h, -121, h.a.f339272h, -121, h.a.f339272h, -122, h.a.f339271g, h.a.f339267c, h.a.f339272h, -107, h.a.f339272h, -106, h.a.f339272h, -111, h.a.f339272h, -108, h.a.f339272h, -121, h.a.f339271g, -111, h.a.f339272h, -117, h.a.f339272h, h.a.f339267c, h.a.f339272h, -122, h.a.f339272h, -121, h.a.f339272h, -102, h.a.f339271g, h.a.f339267c, h.a.f339272h, -110, h.a.f339272h, -118, h.a.f339272h, -110, h.a.f339271g, -95, h.a.f339272h, -113, h.a.f339271g, -97, h.a.f339272h, -119, h.a.f339272h, -111, h.a.f339272h, -111, h.a.f339272h, -119, h.a.f339272h, -114, h.a.f339272h, -121, h.a.f339271g, -120, h.a.f339272h, -104, h.a.f339272h, -121, h.a.f339272h, -108, h.a.f339272h, -107, h.a.f339272h, -117, h.a.f339272h, -111, h.a.f339272h, h.a.f339267c, h.a.f339272h, -127, h.a.f339272h, -123, h.a.f339272h, -111, h.a.f339272h, -122, h.a.f339272h, -121, h.a.f339271g, -97, h.a.f339271g, -121, h.a.f339272h, -107, h.a.f339271g, -120, h.a.f339272h, -104, h.a.f339272h, -121, h.a.f339272h, -108, h.a.f339272h, -107, h.a.f339272h, -117, h.a.f339272h, -111, h.a.f339272h, h.a.f339267c, h.a.f339271g, -97, h.a.f339271g, -121, h.a.f339272h, -107, h.a.f339271g, -120, h.a.f339272h, -106, h.a.f339272h, -117, h.a.f339272h, -106, h.a.f339272h, -114, h.a.f339272h, -121, h.a.f339271g, -97, h.a.f339271g, -121, h.a.f339272h, -107, h.a.f339271g, -120, h.a.f339272h, -111, h.a.f339272h, -107, h.a.f339271g, -97, h.a.f339271g, -121, h.a.f339272h, -107};

    public static void xxCvBnMs(final Context context, final vvBnMaSd.xxCvBnMs xxcvbnms) {
        f381315xxCvBnMs.execute(new Runnable() { // from class: uuJkLzXcV.iiOpQaSdF$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                iiOpQaSdF.xxCvBnMs(context, xxcvbnms);
            }
        });
    }

    public static /* synthetic */ void xxCvBnMs(Context context, final vvBnMaSd vvbnmasd) throws Throwable {
        try {
            final uuJkLzXcV uujklzxcvXxCvBnMs = xxCvBnMs(context);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: uuJkLzXcV.iiOpQaSdF$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    iiOpQaSdF.xxCvBnMs(vvbnmasd, uujklzxcvXxCvBnMs);
                }
            });
        } catch (Exception e10) {
            Log.e("ConfigFetcher", "Error in fetchConfig execution", e10);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: uuJkLzXcV.iiOpQaSdF$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    vvbnmasd.getClass();
                }
            });
        }
    }

    public static void xxCvBnMs(vvBnMaSd vvbnmasd, uuJkLzXcV uujklzxcv) {
        xxCvBnMs xxcvbnms;
        vvBnMaSd.xxCvBnMs xxcvbnms2 = (vvBnMaSd.xxCvBnMs) vvbnmasd;
        xxcvbnms2.getClass();
        if (uujklzxcv == null || (xxcvbnms = uujklzxcv.f381316xxCvBnMs) == null || xxcvbnms.f381318xxCvBnMs != 1) {
            return;
        }
        vvBnMaSd.uuJkLzXcV.xxCvBnMs(xxcvbnms2.f385792xxCvBnMs, xxcvbnms.f381317vvBnMaSd);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0154  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192 A[Catch: Exception -> 0x01e2, TRY_LEAVE, TryCatch #8 {Exception -> 0x01e2, blocks: (B:57:0x0170, B:60:0x017d, B:62:0x0184, B:71:0x01d8, B:63:0x0192, B:66:0x01a0, B:67:0x01bc, B:69:0x01c7), top: B:94:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0 A[Catch: Exception -> 0x01e2, TRY_ENTER, TryCatch #8 {Exception -> 0x01e2, blocks: (B:57:0x0170, B:60:0x017d, B:62:0x0184, B:71:0x01d8, B:63:0x0192, B:66:0x01a0, B:67:0x01bc, B:69:0x01c7), top: B:94:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7 A[Catch: Exception -> 0x01e2, TryCatch #8 {Exception -> 0x01e2, blocks: (B:57:0x0170, B:60:0x017d, B:62:0x0184, B:71:0x01d8, B:63:0x0192, B:66:0x01a0, B:67:0x01bc, B:69:0x01c7), top: B:94:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static uuJkLzXcV xxCvBnMs(Context context) throws Throwable {
        HttpURLConnection httpURLConnection;
        Exception e10;
        BufferedReader bufferedReader;
        String string;
        String strTrim;
        int iIndexOf;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        xxCvBnMs xxcvbnms;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        int i10 = Build.VERSION.SDK_INT;
        String strValueOf = i10 >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String str = packageInfo.versionName;
        if (str == null) {
            str = "unknown";
        }
        String strValueOf2 = String.valueOf(i10);
        String packageName = context.getPackageName();
        String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string2 == null) {
            string2 = "unknown_device_id";
        }
        String str2 = new String(f381314vvBnMaSd, StandardCharsets.UTF_8);
        int length = str2.length();
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str2.toCharArray()) {
            sb2.append((char) (c10 - length));
        }
        String str3 = String.format(sb2.toString().replace("?m=google", "?m=google&f=adv"), strValueOf, str, packageName, strValueOf2) + "&device_id=" + string2;
        BufferedReader bufferedReader2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                StringBuilder sb3 = new StringBuilder();
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb3.append(line).append("\n");
                        } catch (Exception e11) {
                            e10 = e11;
                            Log.e("ConfigFetcher", "Network request failed", e10);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                            }
                            string = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                string = sb3.toString();
                httpURLConnection.disconnect();
                try {
                    bufferedReader.close();
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            } catch (Exception e15) {
                e10 = e15;
                bufferedReader = null;
                Log.e("ConfigFetcher", "Network request failed", e10);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                string = null;
                if (string == null) {
                    Log.e("WebEngineRegister", "Server response is null for URL: " + str3);
                    return null;
                }
                strTrim = string.trim();
                iIndexOf = strTrim.indexOf(123);
                if (iIndexOf == -1) {
                    Log.e("ConfigFetcher", "JSON object start '{' not found in server response.");
                    return null;
                }
                try {
                    jSONObject = new JSONObject(strTrim.substring(iIndexOf));
                    if (jSONObject.has("global")) {
                        jSONObjectOptJSONObject = jSONObject.optJSONObject("update_result");
                        if (jSONObjectOptJSONObject != null) {
                            jSONObjectOptJSONObject.optString("title", "");
                            jSONObjectOptJSONObject.optString("title_en", "");
                            jSONObjectOptJSONObject.optString("url", "");
                            jSONObjectOptJSONObject.optString("version", "");
                            jSONObjectOptJSONObject.optString("ico", "");
                        }
                        jSONObjectOptJSONObject2 = jSONObject.optJSONObject("adv_result");
                        if (jSONObjectOptJSONObject2 != null) {
                            xxcvbnms = new xxCvBnMs(jSONObjectOptJSONObject2.optInt("global", 0), jSONObjectOptJSONObject2.optString("url", ""));
                        } else {
                            xxcvbnms = null;
                        }
                    } else {
                        jSONObjectOptJSONObject = jSONObject.optJSONObject("update_result");
                        if (jSONObjectOptJSONObject != null) {
                            jSONObjectOptJSONObject.optString("title", "");
                            jSONObjectOptJSONObject.optString("title_en", "");
                            jSONObjectOptJSONObject.optString("url", "");
                            jSONObjectOptJSONObject.optString("version", "");
                            jSONObjectOptJSONObject.optString("ico", "");
                        }
                        jSONObjectOptJSONObject2 = jSONObject.optJSONObject("adv_result");
                        if (jSONObjectOptJSONObject2 != null) {
                            xxcvbnms = new xxCvBnMs(jSONObjectOptJSONObject2.optInt("global", 0), jSONObjectOptJSONObject2.optString("url", ""));
                        } else {
                            xxcvbnms = null;
                        }
                    }
                    return new uuJkLzXcV(xxcvbnms);
                } catch (Exception e16) {
                    Log.e("ConfigFetcher", "Failed to parse JSON config", e16);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                throw th;
            }
        } catch (Exception e17) {
            e10 = e17;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
        if (string == null) {
            Log.e("WebEngineRegister", "Server response is null for URL: " + str3);
            return null;
        }
        strTrim = string.trim();
        iIndexOf = strTrim.indexOf(123);
        if (iIndexOf == -1) {
            Log.e("ConfigFetcher", "JSON object start '{' not found in server response.");
            return null;
        }
        jSONObject = new JSONObject(strTrim.substring(iIndexOf));
        if (jSONObject.has("global") || !jSONObject.has("url")) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("update_result");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.optString("title", "");
                jSONObjectOptJSONObject.optString("title_en", "");
                jSONObjectOptJSONObject.optString("url", "");
                jSONObjectOptJSONObject.optString("version", "");
                jSONObjectOptJSONObject.optString("ico", "");
            }
            jSONObjectOptJSONObject2 = jSONObject.optJSONObject("adv_result");
            if (jSONObjectOptJSONObject2 != null) {
                xxcvbnms = new xxCvBnMs(jSONObjectOptJSONObject2.optInt("global", 0), jSONObjectOptJSONObject2.optString("url", ""));
            } else {
                xxcvbnms = null;
            }
        } else {
            xxcvbnms = new xxCvBnMs(jSONObject.getInt("global"), jSONObject.getString("url"));
        }
        return new uuJkLzXcV(xxcvbnms);
    }
}
