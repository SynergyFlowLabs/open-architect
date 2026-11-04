package com.planner5d.library.engine.libgdx.rendering.model.managing;

import androidx.annotation.m1;
import androidx.annotation.p0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class d implements ec.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ec.c f160944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ec.b f160945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f160946e;

    public d(ec.c cVar, ec.b bVar, j jVar) {
        this.f160944c = cVar;
        this.f160945d = bVar;
        this.f160946e = jVar;
    }

    @m1
    @p0
    public u4.b a(String str) throws Throwable {
        u4.b bVarF;
        InputStream inputStreamA = this.f160945d.a(str);
        if (inputStreamA != null) {
            try {
                bVarF = this.f160946e.f(inputStreamA);
            } catch (Throwable th2) {
                try {
                    inputStreamA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            bVarF = null;
        }
        if (inputStreamA != null) {
            inputStreamA.close();
        }
        return bVarF;
    }

    @Override // ec.c
    @m1
    public String b(String str) {
        return this.f160944c.b(str);
    }
}
