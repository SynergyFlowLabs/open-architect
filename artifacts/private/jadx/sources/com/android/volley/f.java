package com.android.volley;

import androidx.annotation.p0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f89433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f89434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f89435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f89436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f89437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f89438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map<String, String> f89439g = Collections.EMPTY_MAP;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<k> f89440h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        boolean b(long j10) {
            return this.f89437e < j10;
        }

        public boolean c() {
            return d(System.currentTimeMillis());
        }

        boolean d(long j10) {
            return this.f89438f < j10;
        }
    }

    void a(String str, boolean z10);

    void b(String str, a aVar);

    void clear();

    @p0
    a get(String str);

    void initialize();

    void remove(String str);
}
