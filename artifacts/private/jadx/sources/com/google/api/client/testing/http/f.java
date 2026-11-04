package com.google.api.client.testing.http;

import com.google.api.client.http.e0;
import com.google.api.client.http.f0;
import com.google.api.client.http.s;
import com.google.api.client.util.j;
import com.google.api.client.util.t;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class f extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f115990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, List<String>> f115991f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f115992g = new g();

    public f() {
    }

    @Override // com.google.api.client.http.e0
    public void a(String str, String str2) throws IOException {
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> arrayList = this.f115991f.get(lowerCase);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f115991f.put(lowerCase, arrayList);
        }
        arrayList.add(str2);
    }

    @Override // com.google.api.client.http.e0
    public f0 b() throws IOException {
        return this.f115992g;
    }

    public String l() throws IOException {
        if (f() == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        f().writeTo(byteArrayOutputStream);
        String strC = c();
        if (strC != null && strC.contains("gzip")) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            byteArrayOutputStream = new ByteArrayOutputStream();
            t.b(gZIPInputStream, byteArrayOutputStream);
        }
        String strE = e();
        s sVar = strE != null ? new s(strE) : null;
        return byteArrayOutputStream.toString(((sVar == null || sVar.f() == null) ? j.f116087b : sVar.f()).name());
    }

    public String m(String str) {
        List<String> list = this.f115991f.get(str.toLowerCase(Locale.US));
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    public List<String> n(String str) {
        List<String> list = this.f115991f.get(str.toLowerCase(Locale.US));
        return list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
    }

    public Map<String, List<String>> o() {
        return Collections.unmodifiableMap(this.f115991f);
    }

    public g p() {
        return this.f115992g;
    }

    public String q() {
        return this.f115990e;
    }

    public f r(g gVar) {
        this.f115992g = gVar;
        return this;
    }

    public f s(String str) {
        this.f115990e = str;
        return this;
    }

    public f(String str) {
        this.f115990e = str;
    }
}
