package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f89274a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f89275a = new HashSet();

        @NonNull
        public a a() {
            this.f89275a.add(2);
            return this;
        }

        @NonNull
        public a b(int i10) {
            this.f89275a.add(Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public v c() {
            return new v(this.f89275a, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int A0 = 0;
        public static final int B0 = 2;
    }

    /* synthetic */ v(Set set, a3 a3Var) {
        this.f89274a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    @NonNull
    public static a a() {
        return new a();
    }

    final ArrayList b() {
        return this.f89274a;
    }
}
