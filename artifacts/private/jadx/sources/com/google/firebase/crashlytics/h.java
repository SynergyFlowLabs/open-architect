package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, String> f120945a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, String> f120946a = new HashMap();

        @NonNull
        public h b() {
            return new h(this);
        }

        @NonNull
        public a c(@NonNull String str, boolean z10) {
            this.f120946a.put(str, Boolean.toString(z10));
            return this;
        }

        @NonNull
        public a d(@NonNull String str, double d10) {
            this.f120946a.put(str, Double.toString(d10));
            return this;
        }

        @NonNull
        public a e(@NonNull String str, float f10) {
            this.f120946a.put(str, Float.toString(f10));
            return this;
        }

        @NonNull
        public a f(@NonNull String str, int i10) {
            this.f120946a.put(str, Integer.toString(i10));
            return this;
        }

        @NonNull
        public a g(@NonNull String str, long j10) {
            this.f120946a.put(str, Long.toString(j10));
            return this;
        }

        @NonNull
        public a h(@NonNull String str, @NonNull String str2) {
            this.f120946a.put(str, str2);
            return this;
        }
    }

    h(@NonNull a aVar) {
        this.f120945a = aVar.f120946a;
    }
}
