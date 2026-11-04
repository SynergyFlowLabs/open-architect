package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.p0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s<T> implements Comparable<s<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";

    @p0
    private f.a mCacheEntry;

    @androidx.annotation.b0("mLock")
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;

    @androidx.annotation.b0("mLock")
    @p0
    private v.a mErrorListener;
    private final b0.a mEventLog;
    private final Object mLock;
    private final int mMethod;

    @androidx.annotation.b0("mLock")
    private c mRequestCompleteListener;
    private t mRequestQueue;

    @androidx.annotation.b0("mLock")
    private boolean mResponseDelivered;
    private x mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f89476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f89477b;

        a(String str, long j10) {
            this.f89476a = str;
            this.f89477b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.mEventLog.a(this.f89476a, this.f89477b);
            s.this.mEventLog.b(s.this.toString());
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f89479a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f89480b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f89481c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f89482d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f89483e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f89484f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f89485g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f89486h = 6;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f89487i = 7;
    }

    interface c {
        void a(s<?> sVar);

        void b(s<?> sVar, v<?> vVar);
    }

    public enum d {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public s(String str, v.a aVar) {
        this(-1, str, aVar);
    }

    private byte[] b(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb2.append(URLEncoder.encode(entry.getKey(), str));
                sb2.append('=');
                sb2.append(URLEncoder.encode(entry.getValue(), str));
                sb2.append(kotlin.text.b0.f313279d);
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    private static int c(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (b0.a.f89378c) {
            this.mEventLog.a(str, Thread.currentThread().getId());
        }
    }

    @androidx.annotation.i
    public void cancel() {
        synchronized (this.mLock) {
            try {
                this.mCanceled = true;
                this.mErrorListener = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void deliverError(a0 a0Var) {
        v.a aVar;
        synchronized (this.mLock) {
            try {
                aVar = this.mErrorListener;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.b(a0Var);
        }
    }

    protected abstract void deliverResponse(T t10);

    void finish(String str) {
        t tVar = this.mRequestQueue;
        if (tVar != null) {
            tVar.g(this);
        }
        if (b0.a.f89378c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
            } else {
                this.mEventLog.a(str, id2);
                this.mEventLog.b(toString());
            }
        }
    }

    public byte[] getBody() throws com.android.volley.d {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return b(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    @p0
    public f.a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + org.apache.commons.codec.language.l.f335457d + url;
    }

    @p0
    public v.a getErrorListener() {
        v.a aVar;
        synchronized (this.mLock) {
            try {
                aVar = this.mErrorListener;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public Map<String, String> getHeaders() throws com.android.volley.d {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    @p0
    protected Map<String, String> getParams() throws com.android.volley.d {
        return null;
    }

    protected String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() throws com.android.volley.d {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return b(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @p0
    @Deprecated
    protected Map<String, String> getPostParams() throws com.android.volley.d {
        return getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public d getPriority() {
        return d.NORMAL;
    }

    public x getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().c();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mResponseDelivered;
        }
        return z10;
    }

    public boolean isCanceled() {
        boolean z10;
        synchronized (this.mLock) {
            try {
                z10 = this.mCanceled;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    void notifyListenerResponseNotUsable() {
        c cVar;
        synchronized (this.mLock) {
            try {
                cVar = this.mRequestCompleteListener;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            cVar.a(this);
        }
    }

    void notifyListenerResponseReceived(v<?> vVar) {
        c cVar;
        synchronized (this.mLock) {
            try {
                cVar = this.mRequestCompleteListener;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            cVar.b(this, vVar);
        }
    }

    protected a0 parseNetworkError(a0 a0Var) {
        return a0Var;
    }

    protected abstract v<T> parseNetworkResponse(o oVar);

    void sendEvent(int i10) {
        t tVar = this.mRequestQueue;
        if (tVar != null) {
            tVar.m(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s<?> setCacheEntry(f.a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    void setNetworkRequestCompleteListener(c cVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = cVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s<?> setRequestQueue(t tVar) {
        this.mRequestQueue = tVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s<?> setRetryPolicy(x xVar) {
        this.mRetryPolicy = xVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s<?> setSequence(int i10) {
        this.mSequence = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s<?> setShouldCache(boolean z10) {
        this.mShouldCache = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s<?> setShouldRetryConnectionErrors(boolean z10) {
        this.mShouldRetryConnectionErrors = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s<?> setShouldRetryServerErrors(boolean z10) {
        this.mShouldRetryServerErrors = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "[X] " : "[ ] ");
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }

    public s(int i10, String str, @p0 v.a aVar) {
        this.mEventLog = b0.a.f89378c ? new b0.a() : null;
        this.mLock = new Object();
        int i11 = 2 << 1;
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i10;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new i());
        this.mDefaultTrafficStatsTag = c(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(s<T> sVar) {
        int iOrdinal;
        int iOrdinal2;
        d priority = getPriority();
        d priority2 = sVar.getPriority();
        if (priority == priority2) {
            iOrdinal = this.mSequence.intValue();
            iOrdinal2 = sVar.mSequence.intValue();
        } else {
            iOrdinal = priority2.ordinal();
            iOrdinal2 = priority.ordinal();
        }
        return iOrdinal - iOrdinal2;
    }
}
