package com.google.firebase.inappmessaging.model;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f123077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final Bitmap f123078b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private String f123079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private Bitmap f123080b;

        public g a() {
            if (TextUtils.isEmpty(this.f123079a)) {
                throw new IllegalArgumentException("ImageData model must have an imageUrl");
            }
            return new g(this.f123079a, this.f123080b);
        }

        public a b(@p0 Bitmap bitmap) {
            this.f123080b = bitmap;
            return this;
        }

        public a c(@p0 String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f123079a = str;
            }
            return this;
        }
    }

    public g(@NonNull String str, @p0 Bitmap bitmap) {
        this.f123077a = str;
        this.f123078b = bitmap;
    }

    public static a a() {
        return new a();
    }

    @p0
    public Bitmap b() {
        return this.f123078b;
    }

    @NonNull
    public String c() {
        return this.f123077a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return hashCode() == gVar.hashCode() && this.f123077a.equals(gVar.f123077a);
    }

    public int hashCode() {
        Bitmap bitmap = this.f123078b;
        return this.f123077a.hashCode() + (bitmap != null ? bitmap.hashCode() : 0);
    }
}
