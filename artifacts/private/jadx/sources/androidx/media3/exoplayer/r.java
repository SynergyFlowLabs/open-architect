package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class r implements e5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f64613l = 5000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f64614m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f64615n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f64616o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f64617p = 50;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f64618q = "DefaultRenderersFactory";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f64619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.mediacodec.j f64620b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f64623e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f64625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f64626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f64627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f64628j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f64621c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f64622d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.mediacodec.z f64624f = androidx.media3.exoplayer.mediacodec.z.f64220a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f64629k = -9223372036854775807L;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public r(Context context) {
        this.f64619a = context;
        this.f64620b = new androidx.media3.exoplayer.mediacodec.j(context);
    }

    @Override // androidx.media3.exoplayer.e5
    @androidx.annotation.p0
    public z4 a(z4 z4Var, Handler handler, androidx.media3.exoplayer.video.l0 l0Var, androidx.media3.exoplayer.audio.w wVar, androidx.media3.exoplayer.text.h hVar, androidx.media3.exoplayer.metadata.b bVar) {
        if (z4Var.f() == 2) {
            return i(z4Var, this.f64619a, this.f64621c, this.f64624f, this.f64623e, handler, l0Var, this.f64622d);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.e5
    public z4[] b(Handler handler, androidx.media3.exoplayer.video.l0 l0Var, androidx.media3.exoplayer.audio.w wVar, androidx.media3.exoplayer.text.h hVar, androidx.media3.exoplayer.metadata.b bVar) {
        Handler handler2;
        ArrayList<z4> arrayList = new ArrayList<>();
        k(this.f64619a, this.f64621c, this.f64624f, this.f64623e, handler, l0Var, this.f64622d, arrayList);
        androidx.media3.exoplayer.audio.x xVarD = d(this.f64619a, this.f64625g, this.f64626h);
        if (xVarD != null) {
            handler2 = handler;
            c(this.f64619a, this.f64621c, this.f64624f, this.f64623e, xVarD, handler2, wVar, arrayList);
        } else {
            handler2 = handler;
        }
        j(this.f64619a, hVar, handler2.getLooper(), this.f64621c, arrayList);
        g(this.f64619a, bVar, handler2.getLooper(), this.f64621c, arrayList);
        e(this.f64619a, this.f64621c, arrayList);
        f(arrayList);
        h(this.f64619a, handler2, this.f64621c, arrayList);
        return (z4[]) arrayList.toArray(new z4[0]);
    }

    protected void c(Context context, int i10, androidx.media3.exoplayer.mediacodec.z zVar, boolean z10, androidx.media3.exoplayer.audio.x xVar, Handler handler, androidx.media3.exoplayer.audio.w wVar, ArrayList<z4> arrayList) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        arrayList.add(new androidx.media3.exoplayer.audio.p0(context, r(), zVar, z10, handler, wVar, xVar));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (z4) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.w.class, androidx.media3.exoplayer.audio.x.class).newInstance(context, handler, wVar, xVar));
                    androidx.media3.common.util.z.h(f64618q, "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (z4) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.w.class, androidx.media3.exoplayer.audio.x.class).newInstance(handler, wVar, xVar));
                        androidx.media3.common.util.z.h(f64618q, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    try {
                        i13 = i12 + 1;
                        try {
                            arrayList.add(i12, (z4) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.w.class, androidx.media3.exoplayer.audio.x.class).newInstance(handler, wVar, xVar));
                            androidx.media3.common.util.z.h(f64618q, "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                            i12 = i13;
                            i13 = i12;
                        }
                    } catch (Exception e10) {
                        throw new IllegalStateException("Error instantiating FLAC extension", e10);
                    }
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    try {
                        i14 = i13 + 1;
                        try {
                            arrayList.add(i13, (z4) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.w.class, androidx.media3.exoplayer.audio.x.class).newInstance(handler, wVar, xVar));
                            androidx.media3.common.util.z.h(f64618q, "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused7) {
                            i13 = i14;
                            i14 = i13;
                        }
                    } catch (ClassNotFoundException unused8) {
                    }
                    try {
                        try {
                            i15 = i14 + 1;
                            try {
                                arrayList.add(i14, (z4) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.w.class, androidx.media3.exoplayer.audio.x.class).newInstance(context, handler, wVar, xVar));
                                androidx.media3.common.util.z.h(f64618q, "Loaded LibiamfAudioRenderer.");
                            } catch (ClassNotFoundException unused9) {
                                i14 = i15;
                                i15 = i14;
                            }
                        } catch (ClassNotFoundException unused10) {
                        }
                        try {
                            arrayList.add(i15, (z4) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.w.class, androidx.media3.exoplayer.audio.x.class).newInstance(handler, wVar, xVar));
                            androidx.media3.common.util.z.h(f64618q, "Loaded MpeghAudioRenderer.");
                        } catch (ClassNotFoundException unused11) {
                        } catch (Exception e11) {
                            throw new IllegalStateException("Error instantiating MPEG-H extension", e11);
                        }
                    } catch (Exception e12) {
                        throw new IllegalStateException("Error instantiating IAMF extension", e12);
                    }
                } catch (Exception e13) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e13);
                }
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating Opus extension", e14);
            }
        } catch (Exception e15) {
            throw new IllegalStateException("Error instantiating MIDI extension", e15);
        }
    }

    @androidx.annotation.p0
    protected androidx.media3.exoplayer.audio.x d(Context context, boolean z10, boolean z11) {
        return new androidx.media3.exoplayer.audio.j0.h(context).r(z10).q(z11).j();
    }

    protected void e(Context context, int i10, ArrayList<z4> arrayList) {
        arrayList.add(new androidx.media3.exoplayer.video.spherical.b());
    }

    protected void f(ArrayList<z4> arrayList) {
        arrayList.add(new androidx.media3.exoplayer.image.g(s(), null));
    }

    protected void g(Context context, androidx.media3.exoplayer.metadata.b bVar, Looper looper, int i10, ArrayList<z4> arrayList) {
        arrayList.add(new androidx.media3.exoplayer.metadata.c(bVar, looper));
        arrayList.add(new androidx.media3.exoplayer.metadata.c(bVar, looper));
    }

    protected void h(Context context, Handler handler, int i10, ArrayList<z4> arrayList) {
    }

    @androidx.annotation.p0
    protected z4 i(z4 z4Var, Context context, int i10, androidx.media3.exoplayer.mediacodec.z zVar, boolean z10, Handler handler, androidx.media3.exoplayer.video.l0 l0Var, long j10) {
        if (this.f64627i && z4Var.getClass() == androidx.media3.exoplayer.video.k.class) {
            return new androidx.media3.exoplayer.video.k.d(context).r(r()).w(zVar).p(j10).s(z10).t(handler).u(l0Var).v(50).o(this.f64628j).n(this.f64629k).m();
        }
        return null;
    }

    protected void j(Context context, androidx.media3.exoplayer.text.h hVar, Looper looper, int i10, ArrayList<z4> arrayList) {
        arrayList.add(new androidx.media3.exoplayer.text.i(hVar, looper));
    }

    protected void k(Context context, int i10, androidx.media3.exoplayer.mediacodec.z zVar, boolean z10, Handler handler, androidx.media3.exoplayer.video.l0 l0Var, long j10, ArrayList<z4> arrayList) {
        int i11;
        int i12;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new androidx.media3.exoplayer.video.k.d(context).r(r()).w(zVar).p(j10).s(z10).t(handler).u(l0Var).v(50).o(this.f64628j).n(this.f64629k).m());
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (z4) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.l0.class, cls).newInstance(Long.valueOf(j10), handler, l0Var, 50));
                    androidx.media3.common.util.z.h(f64618q, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (z4) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.l0.class, cls).newInstance(Long.valueOf(j10), handler, l0Var, 50));
                        androidx.media3.common.util.z.h(f64618q, "Loaded Libgav1VideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    arrayList.add(i12, (z4) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.l0.class, cls).newInstance(Long.valueOf(j10), handler, l0Var, 50));
                    androidx.media3.common.util.z.h(f64618q, "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e10) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating AV1 extension", e11);
            }
        } catch (Exception e12) {
            throw new IllegalStateException("Error instantiating VP9 extension", e12);
        }
    }

    @z7.a
    public final r l(boolean z10) {
        this.f64627i = z10;
        return this;
    }

    @z7.a
    public final r m(long j10) {
        this.f64629k = j10;
        return this;
    }

    @z7.a
    public final r n(boolean z10) {
        this.f64620b.c(z10);
        return this;
    }

    @z7.a
    public final r o(boolean z10) {
        this.f64628j = z10;
        return this;
    }

    @z7.a
    public final r p() {
        this.f64620b.d();
        return this;
    }

    @z7.a
    public final r q() {
        this.f64620b.e();
        return this;
    }

    protected androidx.media3.exoplayer.mediacodec.q.b r() {
        return this.f64620b;
    }

    protected androidx.media3.exoplayer.image.d.a s() {
        return androidx.media3.exoplayer.image.d.a.f63879a;
    }

    @z7.a
    public final r t(long j10) {
        this.f64622d = j10;
        return this;
    }

    @z7.a
    public final r u(boolean z10) {
        this.f64625g = z10;
        return this;
    }

    @z7.a
    public final r v(boolean z10) {
        this.f64626h = z10;
        return this;
    }

    @z7.a
    public final r w(boolean z10) {
        this.f64623e = z10;
        return this;
    }

    @z7.a
    public final r x(int i10) {
        this.f64621c = i10;
        return this;
    }

    @z7.a
    public final r y(androidx.media3.exoplayer.mediacodec.z zVar) {
        this.f64624f = zVar;
        return this;
    }
}
