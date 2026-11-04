package com.planner5d.library.engine.libgdx.rendering.graphics.shadows;

import android.opengl.GLES20;
import androidx.media3.common.j;
import androidx.work.h;
import com.badlogic.gdx.graphics.g3d.utils.m;
import com.planner5d.library.engine.k;
import com.planner5d.library.services.exceptions.ErrorMessageException;

/* JADX INFO: loaded from: classes5.dex */
class c implements gc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f160888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f160889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f160890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f160891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m<com.badlogic.gdx.graphics.e> f160892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f160893f;

    private static class a extends com.badlogic.gdx.graphics.e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f160894g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f160895h;

        @Override // com.badlogic.gdx.graphics.e
        public int e() {
            return 0;
        }

        @Override // com.badlogic.gdx.graphics.e
        public int f() {
            return this.f160895h;
        }

        @Override // com.badlogic.gdx.graphics.e
        public int o() {
            return this.f160894g;
        }

        @Override // com.badlogic.gdx.graphics.e
        public boolean q() {
            return false;
        }

        @Override // com.badlogic.gdx.graphics.e
        protected void u() {
        }

        private a(int i10, int i11) {
            super(3553, com.badlogic.gdx.graphics.glutils.d.h());
            this.f160894g = i10;
            this.f160895h = i11;
            GLES20.glBindTexture(3553, this.f94202b);
            GLES20.glTexParameteri(3553, h.f76563d, j.I3);
            GLES20.glTexParameteri(3553, 10241, j.I3);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
        }
    }

    c(k kVar, int i10, int i11) throws ErrorMessageException {
        this.f160893f = kVar;
        m<com.badlogic.gdx.graphics.e> mVar = new m<>(new a(i10, i11));
        this.f160892e = mVar;
        this.f160888a = com.badlogic.gdx.graphics.glutils.d.f();
        this.f160890c = i10;
        this.f160891d = i11;
        s();
        int i12 = 2 << 0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, mVar.f94685a.i(), 0);
        int iG = com.badlogic.gdx.graphics.glutils.d.g();
        this.f160889b = iG;
        GLES20.glBindRenderbuffer(36161, iG);
        GLES20.glRenderbufferStorage(36161, 33189, i10, i11);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iG);
        boolean z10 = GLES20.glCheckFramebufferStatus(36160) != 36053;
        end();
        if (z10) {
            dispose();
            throw new ErrorMessageException(zb.b.q.U9, new String[0]);
        }
    }

    m<com.badlogic.gdx.graphics.e> a() {
        return this.f160892e;
    }

    @Override // gc.e
    public void dispose() {
        this.f160892e.f94685a.dispose();
        com.badlogic.gdx.graphics.glutils.d.b(this.f160889b);
        com.badlogic.gdx.graphics.glutils.d.a(this.f160888a);
    }

    void end() {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, this.f160893f.getWidth(), this.f160893f.getHeight());
    }

    void s() {
        GLES20.glBindFramebuffer(36160, this.f160888a);
        GLES20.glViewport(0, 0, this.f160890c, this.f160891d);
    }
}
