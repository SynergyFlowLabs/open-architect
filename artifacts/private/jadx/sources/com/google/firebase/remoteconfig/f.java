package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, String> f124466a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, String> f124467a = new HashMap();

        @NonNull
        public f b() {
            return new f(this);
        }

        @NonNull
        public a c(@NonNull String str, double d10) {
            this.f124467a.put(str, Double.toString(d10));
            return this;
        }

        @NonNull
        public a d(@NonNull String str, long j10) {
            this.f124467a.put(str, Long.toString(j10));
            return this;
        }

        @NonNull
        public a e(@NonNull String str, @p0 String str2) {
            this.f124467a.put(str, str2);
            return this;
        }
    }

    f(@NonNull a aVar) {
        this.f124466a = aVar.f124467a;
    }
}
