package com.devtodev.core.network;

import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.log.CoreLog;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class Request {
    public static final String TAG = "Request";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f98326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HttpMethod f98327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f98328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f98329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TreeMap<String, Object> f98330f;

    public Request(String str) {
        this.f98328d = false;
        this.f98329e = false;
        this.f98327c = HttpMethod.GET;
        this.f98325a = str;
        this.f98330f = new TreeMap<>();
    }

    public void addParameter(String str, Object obj) {
        if (str != null && obj != null) {
            this.f98330f.put(str, obj);
        }
    }

    public void copyParametersFromRequest(Request request) {
        for (Map.Entry<String, Object> entry : request.f98330f.entrySet()) {
            this.f98330f.put(entry.getKey(), entry.getValue());
        }
    }

    public String getFullUrl() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f98330f.size() > 0) {
            sb2.append(com.planner5d.library.model.payments.a.f222474i);
            try {
                for (Map.Entry<String, Object> entry : this.f98330f.entrySet()) {
                    sb2.append(entry.getKey());
                    sb2.append("=");
                    sb2.append(entry.getValue() == null ? "" : com.devtodev.core.utils.k.a.b(entry.getValue().toString(), "UTF-8"));
                    sb2.append("&");
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (this.f98328d && SDKClient.getInstance().getSecretKey() != null) {
            String secretKey = SDKClient.getInstance().getSecretKey();
            sb2.append("s");
            sb2.append("=");
            sb2.append(b.a(this.f98330f, this.f98326b, secretKey));
        } else if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        if (sb2.length() == 0) {
            return this.f98325a;
        }
        return this.f98325a + "/" + sb2.toString();
    }

    public HttpMethod getHttpMethod() {
        return this.f98327c;
    }

    public byte[] getPostData() {
        return this.f98326b;
    }

    public String getUrl() {
        return this.f98325a;
    }

    public byte[] getZippedPostData() {
        byte[] byteArray = this.f98326b;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(this.f98326b);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e10) {
            CoreLog.e("DevToDev", "", e10);
            return byteArray;
        }
    }

    public boolean isNeedSigned() {
        return this.f98328d;
    }

    public boolean isWaitRedirect() {
        return this.f98329e;
    }

    public void setNeedRedirect(boolean z10) {
        this.f98329e = z10;
    }

    public void setNeedSigned(boolean z10) {
        this.f98328d = z10;
    }

    public void setPostData(byte[] bArr) {
        this.f98327c = HttpMethod.POST;
        this.f98326b = bArr;
    }

    public Request(String str, byte[] bArr) {
        this.f98328d = false;
        this.f98329e = false;
        this.f98327c = HttpMethod.POST;
        this.f98325a = str;
        this.f98326b = bArr;
        this.f98330f = new TreeMap<>();
    }
}
