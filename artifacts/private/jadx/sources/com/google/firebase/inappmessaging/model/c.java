package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final n f123046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @fj.h
    private final n f123047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @fj.h
    private final g f123048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @fj.h
    private final com.google.firebase.inappmessaging.model.a f123049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final String f123050q;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        n f123051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        n f123052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        g f123053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.h
        com.google.firebase.inappmessaging.model.a f123054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.h
        String f123055e;

        public c a(e eVar, @fj.h Map<String, String> map) {
            if (this.f123051a == null) {
                throw new IllegalArgumentException("Banner model must have a title");
            }
            if (TextUtils.isEmpty(this.f123055e)) {
                throw new IllegalArgumentException("Banner model must have a background color");
            }
            return new c(eVar, this.f123051a, this.f123052b, this.f123053c, this.f123054d, this.f123055e, map);
        }

        public b b(@fj.h com.google.firebase.inappmessaging.model.a aVar) {
            this.f123054d = aVar;
            return this;
        }

        public b c(@fj.h String str) {
            this.f123055e = str;
            return this;
        }

        public b d(@fj.h n nVar) {
            this.f123052b = nVar;
            return this;
        }

        public b e(@fj.h g gVar) {
            this.f123053c = gVar;
            return this;
        }

        public b f(@fj.h n nVar) {
            this.f123051a = nVar;
            return this;
        }
    }

    public static b n() {
        return new b();
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @fj.h
    public com.google.firebase.inappmessaging.model.a a() {
        return this.f123049p;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @NonNull
    public String c() {
        return this.f123050q;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @fj.h
    public n d() {
        return this.f123047n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (hashCode() != cVar.hashCode()) {
            return false;
        }
        n nVar = this.f123047n;
        if ((nVar == null && cVar.f123047n != null) || (nVar != null && !nVar.equals(cVar.f123047n))) {
            return false;
        }
        g gVar = this.f123048o;
        if ((gVar == null && cVar.f123048o != null) || (gVar != null && !gVar.equals(cVar.f123048o))) {
            return false;
        }
        com.google.firebase.inappmessaging.model.a aVar = this.f123049p;
        return (aVar != null || cVar.f123049p == null) && (aVar == null || aVar.equals(cVar.f123049p)) && this.f123046m.equals(cVar.f123046m) && this.f123050q.equals(cVar.f123050q);
    }

    public int hashCode() {
        n nVar = this.f123047n;
        int iHashCode = nVar != null ? nVar.hashCode() : 0;
        g gVar = this.f123048o;
        int iHashCode2 = gVar != null ? gVar.hashCode() : 0;
        com.google.firebase.inappmessaging.model.a aVar = this.f123049p;
        return this.f123046m.hashCode() + iHashCode + iHashCode2 + (aVar != null ? aVar.hashCode() : 0) + this.f123050q.hashCode();
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @fj.h
    public g i() {
        return this.f123048o;
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @NonNull
    public n m() {
        return this.f123046m;
    }

    private c(@NonNull e eVar, @NonNull n nVar, @fj.h n nVar2, @fj.h g gVar, @fj.h com.google.firebase.inappmessaging.model.a aVar, @NonNull String str, @fj.h Map<String, String> map) {
        super(eVar, MessageType.BANNER, map);
        this.f123046m = nVar;
        this.f123047n = nVar2;
        this.f123048o = gVar;
        this.f123049p = aVar;
        this.f123050q = str;
    }
}
