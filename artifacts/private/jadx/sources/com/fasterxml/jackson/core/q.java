package com.fasterxml.jackson.core;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends t implements w {
    protected q() {
    }

    @Override // com.fasterxml.jackson.core.t
    public abstract u a();

    @Override // com.fasterxml.jackson.core.t
    public abstract u b();

    @Override // com.fasterxml.jackson.core.t
    public abstract <T extends u> T c(JsonParser jsonParser) throws IOException;

    @Override // com.fasterxml.jackson.core.t
    public abstract JsonParser d(u uVar);

    @Override // com.fasterxml.jackson.core.t
    public abstract void e(h hVar, u uVar) throws IOException;

    public f f() {
        return g();
    }

    @Deprecated
    public f g() {
        return f();
    }

    public abstract <T> T h(JsonParser jsonParser, com.fasterxml.jackson.core.type.a aVar) throws IOException;

    public abstract <T> T i(JsonParser jsonParser, com.fasterxml.jackson.core.type.b<?> bVar) throws IOException;

    public abstract <T> T j(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> Iterator<T> k(JsonParser jsonParser, com.fasterxml.jackson.core.type.a aVar) throws IOException;

    public abstract <T> Iterator<T> l(JsonParser jsonParser, com.fasterxml.jackson.core.type.b<?> bVar) throws IOException;

    public abstract <T> Iterator<T> m(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> T n(u uVar, Class<T> cls) throws l;

    public abstract void o(h hVar, Object obj) throws IOException;

    @Override // com.fasterxml.jackson.core.w
    public abstract v version();
}
