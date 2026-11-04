package com.devtodev.core.network;

import android.os.AsyncTask;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.log.CoreLog;
import com.google.common.net.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class CoreAsyncTask extends AsyncTask<Request, Object, Response> {
    public static final String TAG = "CoreAsyncTask";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnRequestSend f98322a;

    public CoreAsyncTask(OnRequestSend onRequestSend) {
        this.f98322a = onRequestSend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private Response a(Request request) throws Throwable {
        Response response;
        HttpURLConnection httpURLConnection;
        Object obj;
        ?? r10 = 0;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                URL url = new URL(request.getFullUrl());
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                try {
                    httpURLConnection3.setConnectTimeout(10000);
                    CoreLog.d("DevToDev", "URL: " + url.toString());
                    if (request.getHttpMethod() == HttpMethod.POST && request.getPostData() != null) {
                        CoreLog.d("DevToDev", "POST: " + new String(request.getPostData()));
                        httpURLConnection3.setDoOutput(true);
                        OutputStream outputStream = httpURLConnection3.getOutputStream();
                        outputStream.write(request.getZippedPostData());
                        outputStream.flush();
                        outputStream.close();
                    }
                    CoreLog.d("DevToDev", "Code: " + httpURLConnection3.getResponseCode());
                    String strA = a(httpURLConnection3.getInputStream());
                    CoreLog.d("DevToDev", "Response: " + strA);
                    response = new Response(httpURLConnection3.getResponseCode(), strA);
                    obj = strA;
                    httpURLConnection = httpURLConnection3;
                    if (request.isWaitRedirect()) {
                        response.setRedirectUrl(httpURLConnection3.getHeaderField(d.f119539t0));
                        obj = strA;
                        httpURLConnection = httpURLConnection3;
                    }
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection2 = httpURLConnection3;
                    e.printStackTrace();
                    CoreLog.e("DevToDev", e.toString());
                    response = new Response(0, "");
                    r10 = httpURLConnection2;
                    if (httpURLConnection2 != null) {
                        httpURLConnection = httpURLConnection2;
                        obj = httpURLConnection2;
                    }
                    return response;
                } catch (Throwable th2) {
                    th = th2;
                    r10 = httpURLConnection3;
                    if (r10 != 0) {
                        r10.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        httpURLConnection.disconnect();
        r10 = obj;
        return response;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Response doInBackground(Request... requestArr) {
        Request request = requestArr[0];
        if (SDKClient.getInstance().getContext().checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            CoreLog.e("DevToDev", "Permission denied (missing INTERNET permission?)");
            return new Response(0, "");
        }
        if (request != null) {
            return a(request);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Response response) {
        super.onPostExecute(response);
        OnRequestSend onRequestSend = this.f98322a;
        if (onRequestSend != null) {
            onRequestSend.OnSend(response);
        }
    }

    private static String a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return new String(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }
}
