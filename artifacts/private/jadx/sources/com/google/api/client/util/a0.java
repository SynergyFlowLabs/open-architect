package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f116038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f116039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Level f116040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Logger f116041d;

    public a0(m0 m0Var, Logger logger, Level level, int i10) {
        this.f116038a = m0Var;
        this.f116041d = logger;
        this.f116040c = level;
        this.f116039b = i10;
    }

    @Override // com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        z zVar = new z(outputStream, this.f116041d, this.f116040c, this.f116039b);
        try {
            this.f116038a.writeTo(zVar);
            zVar.a().close();
            outputStream.flush();
        } catch (Throwable th2) {
            zVar.a().close();
            throw th2;
        }
    }
}
