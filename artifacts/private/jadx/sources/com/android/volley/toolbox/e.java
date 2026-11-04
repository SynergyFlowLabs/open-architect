package com.android.volley.toolbox;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements o {
    @Override // com.android.volley.toolbox.o
    @Deprecated
    public final HttpResponse a(com.android.volley.s<?> sVar, Map<String, String> map) throws com.android.volley.d, IOException {
        n nVarB = b(sVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), nVarB.e(), ""));
        ArrayList arrayList = new ArrayList();
        for (com.android.volley.k kVar : nVarB.d()) {
            arrayList.add(new BasicHeader(kVar.a(), kVar.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[0]));
        InputStream inputStreamA = nVarB.a();
        if (inputStreamA != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStreamA);
            basicHttpEntity.setContentLength(nVarB.c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    public abstract n b(com.android.volley.s<?> sVar, Map<String, String> map) throws com.android.volley.d, IOException;
}
