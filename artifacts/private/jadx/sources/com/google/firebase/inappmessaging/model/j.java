package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class j extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final n f123097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @fj.h
    private final n f123098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @fj.h
    private final g f123099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @fj.h
    private final com.google.firebase.inappmessaging.model.a f123100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final String f123101q;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        n f123102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        n f123103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        g f123104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.h
        com.google.firebase.inappmessaging.model.a f123105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.h
        String f123106e;

        public j a(e eVar, @fj.h Map<String, String> map) {
            if (this.f123102a == null) {
                throw new IllegalArgumentException("Modal model must have a title");
            }
            com.google.firebase.inappmessaging.model.a aVar = this.f123105d;
            if (aVar != null && aVar.c() == null) {
                throw new IllegalArgumentException("Modal model action must be null or have a button");
            }
            if (TextUtils.isEmpty(this.f123106e)) {
                throw new IllegalArgumentException("Modal model must have a background color");
            }
            return new j(eVar, this.f123102a, this.f123103b, this.f123104c, this.f123105d, this.f123106e, map);
        }

        public b b(@fj.h com.google.firebase.inappmessaging.model.a aVar) {
            this.f123105d = aVar;
            return this;
        }

        public b c(@fj.h String str) {
            this.f123106e = str;
            return this;
        }

        public b d(@fj.h n nVar) {
            this.f123103b = nVar;
            return this;
        }

        public b e(@fj.h g gVar) {
            this.f123104c = gVar;
            return this;
        }

        public b f(@fj.h n nVar) {
            this.f123102a = nVar;
            return this;
        }
    }

    public static b n() {
        return new b();
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @fj.h
    public com.google.firebase.inappmessaging.model.a a() {
        return this.f123100p;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @NonNull
    public String c() {
        return this.f123101q;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @fj.h
    public n d() {
        return this.f123098n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (hashCode() != jVar.hashCode()) {
            return false;
        }
        n nVar = this.f123098n;
        if ((nVar == null && jVar.f123098n != null) || (nVar != null && !nVar.equals(jVar.f123098n))) {
            return false;
        }
        com.google.firebase.inappmessaging.model.a aVar = this.f123100p;
        if ((aVar == null && jVar.f123100p != null) || (aVar != null && !aVar.equals(jVar.f123100p))) {
            return false;
        }
        g gVar = this.f123099o;
        return (gVar != null || jVar.f123099o == null) && (gVar == null || gVar.equals(jVar.f123099o)) && this.f123097m.equals(jVar.f123097m) && this.f123101q.equals(jVar.f123101q);
    }

    public int hashCode() {
        n nVar = this.f123098n;
        int iHashCode = nVar != null ? nVar.hashCode() : 0;
        com.google.firebase.inappmessaging.model.a aVar = this.f123100p;
        int iHashCode2 = aVar != null ? aVar.hashCode() : 0;
        g gVar = this.f123099o;
        return this.f123097m.hashCode() + iHashCode + this.f123101q.hashCode() + iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @fj.h
    public g i() {
        return this.f123099o;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @NonNull
    public n m() {
        return this.f123097m;
    }

    private j(@NonNull e eVar, @NonNull n nVar, @fj.h n nVar2, @fj.h g gVar, @fj.h com.google.firebase.inappmessaging.model.a aVar, @NonNull String str, @fj.h Map<String, String> map) {
        super(eVar, MessageType.MODAL, map);
        this.f123097m = nVar;
        this.f123098n = nVar2;
        this.f123099o = gVar;
        this.f123100p = aVar;
        this.f123101q = str;
    }
}
