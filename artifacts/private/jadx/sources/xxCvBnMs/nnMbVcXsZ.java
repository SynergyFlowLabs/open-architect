package xxCvBnMs;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class nnMbVcXsZ implements Runnable {

    /* JADX INFO: renamed from: iiOpQaSdF, reason: collision with root package name */
    public final /* synthetic */ String f390652iiOpQaSdF;
    public final /* synthetic */ qWeRtYuIo mmNhBgVfR;
    public final /* synthetic */ Activity ooIkJuHyG;
    public final /* synthetic */ long ppLkMjNhB;

    /* JADX INFO: renamed from: uuJkLzXcV, reason: collision with root package name */
    public final /* synthetic */ String f390653uuJkLzXcV;

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final /* synthetic */ String f390654vvBnMaSd;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final /* synthetic */ String f390655xxCvBnMs;

    public nnMbVcXsZ(qWeRtYuIo qwertyuio, String str, String str2, String str3, String str4, long j10, Activity activity) {
        this.mmNhBgVfR = qwertyuio;
        this.f390655xxCvBnMs = str;
        this.f390654vvBnMaSd = str2;
        this.f390653uuJkLzXcV = str3;
        this.f390652iiOpQaSdF = str4;
        this.ppLkMjNhB = j10;
        this.ooIkJuHyG = activity;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[Catch: IOException -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x0095, blocks: (B:10:0x006a, B:29:0x0091), top: B:68:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9 A[Catch: JSONException -> 0x015a, TryCatch #7 {JSONException -> 0x015a, blocks: (B:35:0x009c, B:37:0x00f9, B:39:0x0109, B:41:0x0119, B:46:0x0131, B:48:0x0142), top: B:70:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142 A[Catch: JSONException -> 0x015a, TRY_LEAVE, TryCatch #7 {JSONException -> 0x015a, blocks: (B:35:0x009c, B:37:0x00f9, B:39:0x0109, B:41:0x0119, B:46:0x0131, B:48:0x0142), top: B:70:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        IOException e10;
        HttpURLConnection httpURLConnection;
        String string;
        String string2;
        String string3;
        String lowerCase;
        boolean z10;
        boolean z11;
        String str = String.format(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.f390663xxCvBnMs), this.f390655xxCvBnMs, this.f390654vvBnMaSd, this.f390653uuJkLzXcV, this.f390652iiOpQaSdF);
        qWeRtYuIo qwertyuio = this.mmNhBgVfR;
        qwertyuio.getClass();
        String string4 = null;
        string4 = null;
        string4 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setRequestMethod(qWeRtYuIo.xxCvBnMs(qwertyuio.ppLkMjNhB));
                    httpURLConnection.connect();
                    StringBuilder sb2 = new StringBuilder();
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb2.append(line).append("\n");
                            }
                        } catch (IOException e11) {
                            e10 = e11;
                            try {
                                e10.printStackTrace();
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (string4 != null) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(string4).getJSONObject(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.nnMbVcXsZ));
                                        string = jSONObject.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.fGhjKlQw));
                                        string2 = jSONObject.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.dSaZxCvB));
                                        string3 = jSONObject.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.gHjKlMnB));
                                        lowerCase = Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault());
                                        if (lowerCase.equals(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.qWeRtYuIo))) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        z11 = z10;
                                        if (System.currentTimeMillis() - this.ppLkMjNhB >= 86400000) {
                                            new Handler(Looper.getMainLooper()).post(new mmNhBgVfR(this, z11, string3, string, string2));
                                        }
                                    } catch (JSONException e12) {
                                        e12.printStackTrace();
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                httpURLConnection2 = httpURLConnection;
                                httpURLConnection = httpURLConnection2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                    }
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th2;
                        }
                    }
                    string4 = sb2.toString();
                    httpURLConnection.disconnect();
                    bufferedReader.close();
                } catch (IOException e14) {
                    e10 = e14;
                    bufferedReader = null;
                    e10.printStackTrace();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (string4 != null) {
                        JSONObject jSONObject2 = new JSONObject(string4).getJSONObject(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.nnMbVcXsZ));
                        string = jSONObject2.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.fGhjKlQw));
                        string2 = jSONObject2.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.dSaZxCvB));
                        string3 = jSONObject2.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.gHjKlMnB));
                        lowerCase = Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault());
                        if (lowerCase.equals(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.qWeRtYuIo))) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        z11 = z10;
                        if (System.currentTimeMillis() - this.ppLkMjNhB >= 86400000) {
                            new Handler(Looper.getMainLooper()).post(new mmNhBgVfR(this, z11, string3, string, string2));
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    bufferedReader = null;
                    httpURLConnection2 = httpURLConnection;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th2;
                }
            } catch (IOException e15) {
                e15.printStackTrace();
            }
        } catch (IOException e16) {
            e10 = e16;
            httpURLConnection = null;
        } catch (Throwable th6) {
            th2 = th6;
            bufferedReader = null;
            httpURLConnection = httpURLConnection2;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th2;
        }
        if (string4 != null) {
            JSONObject jSONObject3 = new JSONObject(string4).getJSONObject(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.nnMbVcXsZ));
            string = jSONObject3.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.fGhjKlQw));
            string2 = jSONObject3.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.dSaZxCvB));
            string3 = jSONObject3.getString(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.gHjKlMnB));
            lowerCase = Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault());
            if (lowerCase.equals(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.qWeRtYuIo)) || lowerCase.equals(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.aZxCvBnMo)) || lowerCase.equals(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.sDfGhjKlP)) || lowerCase.equals(qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.vBnMaSdFj))) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z10;
            if (System.currentTimeMillis() - this.ppLkMjNhB >= 86400000) {
                new Handler(Looper.getMainLooper()).post(new mmNhBgVfR(this, z11, string3, string, string2));
            }
        }
    }
}
