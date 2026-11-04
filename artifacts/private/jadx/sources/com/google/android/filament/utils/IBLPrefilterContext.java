package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.Texture;

/* JADX INFO: loaded from: classes4.dex */
public class IBLPrefilterContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104782a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f104783a;

        public a(IBLPrefilterContext iBLPrefilterContext) {
            this.f104783a = IBLPrefilterContext.nCreateEquirectHelper(iBLPrefilterContext.h());
        }

        public void a() {
            IBLPrefilterContext.nDestroyEquirectHelper(b());
            this.f104783a = 0L;
        }

        protected long b() {
            long j10 = this.f104783a;
            if (j10 != 0) {
                return j10;
            }
            throw new IllegalStateException("Calling method on destroyed EquirectangularToCubemap");
        }

        public Texture c(Texture texture) {
            return new Texture(IBLPrefilterContext.nEquirectHelperRun(b(), texture.getNativeObject()));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f104784a;

        public b(IBLPrefilterContext iBLPrefilterContext) {
            this.f104784a = IBLPrefilterContext.nCreateSpecularFilter(iBLPrefilterContext.h());
        }

        public void a() {
            IBLPrefilterContext.nDestroySpecularFilter(b());
            this.f104784a = 0L;
        }

        protected long b() {
            long j10 = this.f104784a;
            if (j10 != 0) {
                return j10;
            }
            throw new IllegalStateException("Calling method on destroyed SpecularFilter");
        }

        public Texture c(Texture texture) {
            return new Texture(IBLPrefilterContext.nSpecularFilterRun(b(), texture.getNativeObject()));
        }
    }

    public IBLPrefilterContext(Engine engine) {
        long jNCreate = nCreate(engine.getNativeObject());
        this.f104782a = jNCreate;
        if (jNCreate == 0) {
            throw new IllegalStateException("Couldn't create IBLPrefilterContext");
        }
    }

    private static native long nCreate(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateEquirectHelper(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateSpecularFilter(long j10);

    private static native void nDestroy(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyEquirectHelper(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroySpecularFilter(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nEquirectHelperRun(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nSpecularFilterRun(long j10, long j11);

    public void g() {
        nDestroy(h());
        this.f104782a = 0L;
    }

    protected long h() {
        long j10 = this.f104782a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed IBLPrefilterContext");
    }
}
