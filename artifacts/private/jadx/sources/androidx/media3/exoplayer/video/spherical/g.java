package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import androidx.annotation.p0;
import androidx.media3.common.util.r;
import androidx.media3.common.util.t;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f66496j = "ProjectionRenderer";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f66497k = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f66498l = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f66499m = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f66500n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f66501o = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float[] f66502p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float[] f66503q = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f66504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private a f66505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private a f66506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f66507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f66511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f66512i;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f66513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f66514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f66515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f66516d;

        public a(e.c cVar) {
            this.f66513a = cVar.a();
            this.f66514b = t.k(cVar.f66485c);
            this.f66515c = t.k(cVar.f66486d);
            int i10 = cVar.f66484b;
            if (i10 == 1) {
                this.f66516d = 5;
            } else if (i10 != 2) {
                this.f66516d = 4;
            } else {
                this.f66516d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.b bVar = eVar.f66477a;
        e.b bVar2 = eVar.f66478b;
        int i10 = 0 >> 1;
        return bVar.b() == 1 && bVar.a(0).f66483a == 0 && bVar2.b() == 1 && bVar2.a(0).f66483a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f66506c : this.f66505b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f66504a;
        if (i11 == 1) {
            fArr2 = z10 ? f66501o : f66500n;
        } else if (i11 == 2) {
            fArr2 = z10 ? f66503q : f66502p;
        } else {
            fArr2 = f66499m;
        }
        GLES20.glUniformMatrix3fv(this.f66509f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f66508e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f66512i, 0);
        try {
            t.f();
        } catch (t.a unused) {
        }
        GLES20.glVertexAttribPointer(this.f66510g, 3, 5126, false, 12, (Buffer) aVar.f66514b);
        try {
            t.f();
        } catch (t.a unused2) {
        }
        GLES20.glVertexAttribPointer(this.f66511h, 2, 5126, false, 8, (Buffer) aVar.f66515c);
        try {
            t.f();
        } catch (t.a unused3) {
        }
        GLES20.glDrawArrays(aVar.f66516d, 0, aVar.f66513a);
        try {
            t.f();
        } catch (t.a unused4) {
        }
    }

    public void b() {
        try {
            r rVar = new r(f66497k, f66498l);
            this.f66507d = rVar;
            this.f66508e = rVar.l("uMvpMatrix");
            this.f66509f = this.f66507d.l("uTexMatrix");
            this.f66510g = this.f66507d.g("aPosition");
            this.f66511h = this.f66507d.g("aTexCoords");
            this.f66512i = this.f66507d.l("uTexture");
        } catch (t.a unused) {
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f66504a = eVar.f66479c;
            a aVar = new a(eVar.f66477a.a(0));
            this.f66505b = aVar;
            if (!eVar.f66480d) {
                aVar = new a(eVar.f66478b.a(0));
            }
            this.f66506c = aVar;
        }
    }

    public void e() {
        r rVar = this.f66507d;
        if (rVar != null) {
            try {
                rVar.f();
            } catch (t.a unused) {
            }
        }
    }
}
