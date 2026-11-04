package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.x;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final String f123109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final String f123110b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private String f123111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private String f123112b;

        public n a() {
            if (TextUtils.isEmpty(this.f123112b)) {
                throw new IllegalArgumentException("Text model must have a color");
            }
            return new n(this.f123111a, this.f123112b);
        }

        public b b(@p0 String str) {
            this.f123112b = str;
            return this;
        }

        public b c(x.p pVar) {
            d(pVar.getText());
            b(pVar.ra());
            return this;
        }

        public b d(@p0 String str) {
            this.f123111a = str;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    @NonNull
    public String b() {
        return this.f123110b;
    }

    @p0
    public String c() {
        return this.f123109a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (hashCode() != nVar.hashCode()) {
            return false;
        }
        String str = this.f123109a;
        return (str != null || nVar.f123109a == null) && (str == null || str.equals(nVar.f123109a)) && this.f123110b.equals(nVar.f123110b);
    }

    public int hashCode() {
        String str = this.f123109a;
        return str != null ? str.hashCode() + this.f123110b.hashCode() : this.f123110b.hashCode();
    }

    private n(@p0 String str, @NonNull String str2) {
        this.f123109a = str;
        this.f123110b = str2;
    }
}
