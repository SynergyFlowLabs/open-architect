package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.n;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f102759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f102760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f102761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f102762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f102763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f102764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f102765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f102766h;

    public enum a {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean k() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public c() {
    }

    public c(Object obj, n nVar) {
        this(obj, nVar, (Object) null);
    }

    public c(Object obj, Class<?> cls, n nVar) {
        this(obj, nVar, (Object) null);
        this.f102760b = cls;
    }

    public c(Object obj, n nVar, Object obj2) {
        this.f102759a = obj;
        this.f102761c = obj2;
        this.f102764f = nVar;
    }
}
