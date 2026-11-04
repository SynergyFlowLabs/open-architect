package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.x;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final n f123056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final String f123057b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private n f123058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private String f123059b;

        public d a() {
            if (TextUtils.isEmpty(this.f123059b)) {
                throw new IllegalArgumentException("Button model must have a color");
            }
            n nVar = this.f123058a;
            if (nVar != null) {
                return new d(nVar, this.f123059b);
            }
            throw new IllegalArgumentException("Button model must have text");
        }

        public b b(@p0 String str) {
            this.f123059b = str;
            return this;
        }

        public b c(x.p pVar) {
            n.b bVar = new n.b();
            bVar.c(pVar);
            this.f123058a = bVar.a();
            return this;
        }

        public b d(@p0 n nVar) {
            this.f123058a = nVar;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    @NonNull
    public String b() {
        return this.f123057b;
    }

    @NonNull
    public n c() {
        return this.f123056a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return hashCode() == dVar.hashCode() && this.f123056a.equals(dVar.f123056a) && this.f123057b.equals(dVar.f123057b);
    }

    public int hashCode() {
        return this.f123056a.hashCode() + this.f123057b.hashCode();
    }

    private d(@NonNull n nVar, @NonNull String str) {
        this.f123056a = nVar;
        this.f123057b = str;
    }
}
