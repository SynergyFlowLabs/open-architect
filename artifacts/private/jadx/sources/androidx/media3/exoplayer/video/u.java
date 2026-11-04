package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class u extends GLSurfaceView implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f66570b = "VideoDecoderGLSV";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f66571a;

    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f66575n = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f66577s = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f66579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f66580b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f66581c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f66582d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f66583e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicReference<androidx.media3.decoder.l> f66584f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f66585g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private androidx.media3.common.util.r f66586h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f66587i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private androidx.media3.decoder.l f66588j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final float[] f66572k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f66573l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final float[] f66574m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String[] f66576o = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final FloatBuffer f66578t = androidx.media3.common.util.t.k(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        public a(GLSurfaceView gLSurfaceView) {
            this.f66579a = gLSurfaceView;
            int i10 = 7 & 3;
            for (int i11 = 0; i11 < 3; i11++) {
                int[] iArr = this.f66582d;
                this.f66583e[i11] = -1;
                iArr[i11] = -1;
            }
        }

        @il.m({"program"})
        private void b() {
            try {
                GLES20.glGenTextures(3, this.f66580b, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f66586h.l(f66576o[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    androidx.media3.common.util.t.c(3553, this.f66580b[i10], androidx.media3.common.j.I3);
                }
                androidx.media3.common.util.t.f();
            } catch (androidx.media3.common.util.t.a unused) {
            }
        }

        public void a(androidx.media3.decoder.l lVar) {
            androidx.media3.decoder.l andSet = this.f66584f.getAndSet(lVar);
            if (andSet != null) {
                andSet.D();
            }
            this.f66579a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            androidx.media3.decoder.l andSet = this.f66584f.getAndSet(null);
            if (andSet == null && this.f66588j == null) {
                return;
            }
            if (andSet != null) {
                androidx.media3.decoder.l lVar = this.f66588j;
                if (lVar != null) {
                    lVar.D();
                }
                this.f66588j = andSet;
            }
            androidx.media3.decoder.l lVar2 = (androidx.media3.decoder.l) androidx.media3.common.util.a.g(this.f66588j);
            float[] fArr = f66573l;
            int i10 = lVar2.f62740m;
            if (i10 == 1) {
                fArr = f66572k;
            } else if (i10 == 3) {
                fArr = f66574m;
            }
            GLES20.glUniformMatrix3fv(this.f66587i, 1, false, fArr, 0);
            int[] iArr = (int[]) androidx.media3.common.util.a.g(lVar2.f62739l);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) androidx.media3.common.util.a.g(lVar2.f62738k);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? lVar2.f62736i : (lVar2.f62736i + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f66580b[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = lVar2.f62735h;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f66582d[i15] != iArr2[i15] || this.f66583e[i15] != iArr[i15]) {
                    androidx.media3.common.util.a.i(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    this.f66585g[i15] = androidx.media3.common.util.t.k(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f66581c[i15], 2, 5126, false, 0, (Buffer) this.f66585g[i15]);
                    this.f66582d[i15] = iArr2[i15];
                    this.f66583e[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                androidx.media3.common.util.t.f();
            } catch (androidx.media3.common.util.t.a unused) {
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                androidx.media3.common.util.r rVar = new androidx.media3.common.util.r(f66575n, f66577s);
                this.f66586h = rVar;
                GLES20.glVertexAttribPointer(rVar.g("in_pos"), 2, 5126, false, 0, (Buffer) f66578t);
                this.f66581c[0] = this.f66586h.g("in_tc_y");
                this.f66581c[1] = this.f66586h.g("in_tc_u");
                this.f66581c[2] = this.f66586h.g("in_tc_v");
                this.f66587i = this.f66586h.l("mColorConversion");
                androidx.media3.common.util.t.f();
                b();
                androidx.media3.common.util.t.f();
            } catch (androidx.media3.common.util.t.a unused) {
            }
        }
    }

    public u(Context context) {
        this(context, null);
    }

    @Deprecated
    public v getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // androidx.media3.exoplayer.video.v
    public void setOutputBuffer(androidx.media3.decoder.l lVar) {
        this.f66571a.a(lVar);
    }

    public u(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f66571a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}
