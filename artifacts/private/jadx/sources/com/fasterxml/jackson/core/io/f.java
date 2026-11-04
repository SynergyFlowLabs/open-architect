package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonParser;

/* JADX INFO: loaded from: classes4.dex */
public class f extends com.fasterxml.jackson.core.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f102424g = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.n f102425f;

    public f(JsonParser jsonParser, com.fasterxml.jackson.core.n nVar, String str) {
        super(jsonParser, str);
        this.f102425f = nVar;
    }

    public com.fasterxml.jackson.core.n k() {
        return this.f102425f;
    }
}
