package com.google.firebase.inappmessaging.model;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class h extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private g f123081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @fj.h
    private com.google.firebase.inappmessaging.model.a f123082n;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        g f123083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        com.google.firebase.inappmessaging.model.a f123084b;

        public h a(e eVar, @fj.h Map<String, String> map) {
            g gVar = this.f123083a;
            if (gVar != null) {
                return new h(eVar, gVar, this.f123084b, map);
            }
            throw new IllegalArgumentException("ImageOnly model must have image data");
        }

        public b b(@fj.h com.google.firebase.inappmessaging.model.a aVar) {
            this.f123084b = aVar;
            return this;
        }

        public b c(@fj.h g gVar) {
            this.f123083a = gVar;
            return this;
        }
    }

    public static b n() {
        return new b();
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @fj.h
    public com.google.firebase.inappmessaging.model.a a() {
        return this.f123082n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hashCode() != hVar.hashCode()) {
            return false;
        }
        com.google.firebase.inappmessaging.model.a aVar = this.f123082n;
        return (aVar != null || hVar.f123082n == null) && (aVar == null || aVar.equals(hVar.f123082n)) && this.f123081m.equals(hVar.f123081m);
    }

    public int hashCode() {
        com.google.firebase.inappmessaging.model.a aVar = this.f123082n;
        return this.f123081m.hashCode() + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // com.google.firebase.inappmessaging.model.i
    @NonNull
    public g i() {
        return this.f123081m;
    }

    private h(@NonNull e eVar, @NonNull g gVar, @fj.h com.google.firebase.inappmessaging.model.a aVar, @fj.h Map<String, String> map) {
        super(eVar, MessageType.IMAGE_ONLY, map);
        this.f123081m = gVar;
        this.f123082n = aVar;
    }
}
