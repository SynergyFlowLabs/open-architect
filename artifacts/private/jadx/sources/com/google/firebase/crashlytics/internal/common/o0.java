package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface o0 {

    @u7.d
    public static abstract class a {
        static a a(String str, m0 m0Var) {
            return new c(str, m0Var.f(), m0Var.e());
        }

        public static a b(String str) {
            return new c(str, null, null);
        }

        @NonNull
        public abstract String c();

        @androidx.annotation.p0
        public abstract String d();

        @androidx.annotation.p0
        public abstract String e();
    }

    a a();
}
