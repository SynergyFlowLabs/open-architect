package com.android.volley.toolbox;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f89507a;

    a(o oVar) {
        this.f89507a = oVar;
    }

    @Override // com.android.volley.toolbox.e
    public n b(com.android.volley.s<?> sVar, Map<String, String> map) throws com.android.volley.d, IOException {
        try {
            HttpResponse httpResponseA = this.f89507a.a(sVar, map);
            int statusCode = httpResponseA.getStatusLine().getStatusCode();
            Header[] allHeaders = httpResponseA.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new com.android.volley.k(header.getName(), header.getValue()));
            }
            if (httpResponseA.getEntity() == null) {
                return new n(statusCode, arrayList);
            }
            long contentLength = httpResponseA.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new n(statusCode, arrayList, (int) httpResponseA.getEntity().getContentLength(), httpResponseA.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e10) {
            throw new SocketTimeoutException(e10.getMessage());
        }
    }
}
