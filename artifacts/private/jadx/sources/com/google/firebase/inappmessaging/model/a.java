package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.x;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final String f123035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final d f123036b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private String f123037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private d f123038b;

        public a a() {
            return new a(this.f123037a, this.f123038b);
        }

        public b b(@p0 String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f123037a = str;
            }
            return this;
        }

        public b c(x.f fVar) {
            d.b bVar = new d.b();
            bVar.b(fVar.h9());
            bVar.c(fVar.getText());
            return this;
        }

        public b d(@p0 d dVar) {
            this.f123038b = dVar;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    @p0
    public String b() {
        return this.f123035a;
    }

    @p0
    public d c() {
        return this.f123036b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (hashCode() != aVar.hashCode()) {
            return false;
        }
        String str = this.f123035a;
        if ((str == null && aVar.f123035a != null) || (str != null && !str.equals(aVar.f123035a))) {
            return false;
        }
        d dVar = this.f123036b;
        return (dVar == null && aVar.f123036b == null) || (dVar != null && dVar.equals(aVar.f123036b));
    }

    public int hashCode() {
        String str = this.f123035a;
        int iHashCode = str != null ? str.hashCode() : 0;
        d dVar = this.f123036b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    private a(@p0 String str, @p0 d dVar) {
        this.f123035a = str;
        this.f123036b = dVar;
    }
}
