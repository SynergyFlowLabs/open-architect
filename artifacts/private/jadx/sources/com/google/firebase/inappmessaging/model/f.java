package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class f extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final n f123063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private final n f123064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    private final String f123065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private final com.google.firebase.inappmessaging.model.a f123066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private final com.google.firebase.inappmessaging.model.a f123067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private final g f123068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private final g f123069s;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        g f123070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        g f123071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        String f123072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        com.google.firebase.inappmessaging.model.a f123073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        n f123074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        n f123075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        com.google.firebase.inappmessaging.model.a f123076g;

        public f a(e eVar, @p0 Map<String, String> map) {
            com.google.firebase.inappmessaging.model.a aVar = this.f123073d;
            if (aVar == null) {
                throw new IllegalArgumentException("Card model must have a primary action");
            }
            if (aVar.c() == null) {
                throw new IllegalArgumentException("Card model must have a primary action button");
            }
            com.google.firebase.inappmessaging.model.a aVar2 = this.f123076g;
            if (aVar2 != null && aVar2.c() == null) {
                throw new IllegalArgumentException("Card model secondary action must be null or have a button");
            }
            if (this.f123074e == null) {
                throw new IllegalArgumentException("Card model must have a title");
            }
            if (this.f123070a == null && this.f123071b == null) {
                throw new IllegalArgumentException("Card model must have at least one image");
            }
            if (TextUtils.isEmpty(this.f123072c)) {
                throw new IllegalArgumentException("Card model must have a background color");
            }
            return new f(eVar, this.f123074e, this.f123075f, this.f123070a, this.f123071b, this.f123072c, this.f123073d, this.f123076g, map);
        }

        public b b(@p0 String str) {
            this.f123072c = str;
            return this;
        }

        public b c(@p0 n nVar) {
            this.f123075f = nVar;
            return this;
        }

        public b d(@p0 g gVar) {
            this.f123071b = gVar;
            return this;
        }

        public b e(@p0 g gVar) {
            this.f123070a = gVar;
            return this;
        }

        public b f(@p0 com.google.firebase.inappmessaging.model.a aVar) {
            this.f123073d = aVar;
            return this;
        }

        public b g(@p0 com.google.firebase.inappmessaging.model.a aVar) {
            this.f123076g = aVar;
            return this;
        }

        public b h(@p0 n nVar) {
            this.f123074e = nVar;
            return this;
        }
    }

    public static b n() {
        return new b();
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @p0
    @Deprecated
    public com.google.firebase.inappmessaging.model.a a() {
        return this.f123066p;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @NonNull
    public String c() {
        return this.f123065o;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @p0
    public n d() {
        return this.f123064n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (hashCode() != fVar.hashCode()) {
            return false;
        }
        n nVar = this.f123064n;
        if ((nVar == null && fVar.f123064n != null) || (nVar != null && !nVar.equals(fVar.f123064n))) {
            return false;
        }
        com.google.firebase.inappmessaging.model.a aVar = this.f123067q;
        if ((aVar == null && fVar.f123067q != null) || (aVar != null && !aVar.equals(fVar.f123067q))) {
            return false;
        }
        g gVar = this.f123068r;
        if ((gVar == null && fVar.f123068r != null) || (gVar != null && !gVar.equals(fVar.f123068r))) {
            return false;
        }
        g gVar2 = this.f123069s;
        return (gVar2 != null || fVar.f123069s == null) && (gVar2 == null || gVar2.equals(fVar.f123069s)) && this.f123063m.equals(fVar.f123063m) && this.f123066p.equals(fVar.f123066p) && this.f123065o.equals(fVar.f123065o);
    }

    public int hashCode() {
        n nVar = this.f123064n;
        int iHashCode = nVar != null ? nVar.hashCode() : 0;
        com.google.firebase.inappmessaging.model.a aVar = this.f123067q;
        int iHashCode2 = aVar != null ? aVar.hashCode() : 0;
        g gVar = this.f123068r;
        int iHashCode3 = gVar != null ? gVar.hashCode() : 0;
        g gVar2 = this.f123069s;
        return this.f123063m.hashCode() + iHashCode + this.f123065o.hashCode() + this.f123066p.hashCode() + iHashCode2 + iHashCode3 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @p0
    @Deprecated
    public g i() {
        return this.f123068r;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @NonNull
    public n m() {
        return this.f123063m;
    }

    @p0
    public g o() {
        return this.f123069s;
    }

    @p0
    public g p() {
        return this.f123068r;
    }

    @NonNull
    public com.google.firebase.inappmessaging.model.a q() {
        return this.f123066p;
    }

    @p0
    public com.google.firebase.inappmessaging.model.a r() {
        return this.f123067q;
    }

    private f(@NonNull e eVar, @NonNull n nVar, @p0 n nVar2, @p0 g gVar, @p0 g gVar2, @NonNull String str, @NonNull com.google.firebase.inappmessaging.model.a aVar, @p0 com.google.firebase.inappmessaging.model.a aVar2, @p0 Map<String, String> map) {
        super(eVar, MessageType.CARD, map);
        this.f123063m = nVar;
        this.f123064n = nVar2;
        this.f123068r = gVar;
        this.f123069s = gVar2;
        this.f123065o = str;
        this.f123066p = aVar;
        this.f123067q = aVar2;
    }
}
