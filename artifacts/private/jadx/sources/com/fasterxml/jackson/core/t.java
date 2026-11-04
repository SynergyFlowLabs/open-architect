package com.fasterxml.jackson.core;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t {
    public abstract u a();

    public abstract u b();

    public abstract <T extends u> T c(JsonParser jsonParser) throws IOException;

    public abstract JsonParser d(u uVar);

    public abstract void e(h hVar, u uVar) throws IOException;
}
