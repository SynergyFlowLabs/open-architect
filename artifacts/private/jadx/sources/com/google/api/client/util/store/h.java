package com.google.api.client.util.store;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class h extends com.google.api.client.util.store.b {

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f116177a = new h();

        a() {
        }
    }

    static class b<V extends Serializable> extends c<V> {
        b(h hVar, String str) {
            super(hVar, str);
        }

        @Override // com.google.api.client.util.store.a, com.google.api.client.util.store.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h d() {
            return (h) super.d();
        }
    }

    public static h c() {
        return a.f116177a;
    }

    @Override // com.google.api.client.util.store.b
    protected <V extends Serializable> d<V> b(String str) throws IOException {
        return new b(this, str);
    }
}
