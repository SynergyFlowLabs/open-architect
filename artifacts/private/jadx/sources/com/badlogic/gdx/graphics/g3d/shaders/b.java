package com.badlogic.gdx.graphics.g3d.shaders;

import com.badlogic.gdx.graphics.g3d.attributes.d;
import com.badlogic.gdx.graphics.g3d.attributes.f;
import com.badlogic.gdx.graphics.g3d.attributes.g;
import com.badlogic.gdx.graphics.g3d.attributes.j;
import com.badlogic.gdx.graphics.g3d.environment.e;
import com.badlogic.gdx.graphics.g3d.h;
import com.badlogic.gdx.graphics.g3d.utils.i;
import com.badlogic.gdx.graphics.m;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class b extends com.badlogic.gdx.graphics.g3d.shaders.a {

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    @Deprecated
    public static final int f94480h4 = 1029;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @Deprecated
    public static final int f94481i4 = 515;
    public final int H1;
    protected int K3;
    protected int L3;
    protected int M3;
    protected int N3;
    protected int O3;
    protected int P3;
    protected int Q3;
    protected int R3;
    protected int S3;
    protected final boolean T3;
    protected final boolean U3;
    protected final boolean V3;
    public final int X;
    protected final com.badlogic.gdx.graphics.g3d.environment.c[] X3;
    public final int Y;
    protected final e[] Y3;
    public final int Z;
    private h Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    protected final long f94483a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private long f94484b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    protected final a f94485c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.g3d.b f94486d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private float f94487e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private boolean f94488f4;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public final int f94489g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public final int f94490h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public final int f94491i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public final int f94492j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public final int f94493k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public final int f94494l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public final int f94495m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f94496n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public final int f94497n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f94498o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public final int f94499o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f94500p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final int f94501p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final int f94502p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public final int f94503p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public final int f94504q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public final int f94505r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f94506s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public final int f94507s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f94508t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public final int f94509t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public final int f94510u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f94511v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public final int f94512v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f94513w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public final int f94514w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    protected final int f94515x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    protected final int f94516y3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    protected static final long f94479g4 = (((com.badlogic.gdx.graphics.g3d.attributes.a.f94300i | j.f94350k) | com.badlogic.gdx.graphics.g3d.attributes.b.f94306f) | com.badlogic.gdx.graphics.g3d.attributes.b.f94308h) | f.f94336f;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final long f94482j4 = g.f94341f | d.f94326i;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    protected final int f94517z3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_dirLights[0].color"));
    protected final int A3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_dirLights[0].direction"));
    protected final int B3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_dirLights[1].color"));
    protected final int C3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_pointLights[0].color"));
    protected final int D3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_pointLights[0].position"));
    protected final int E3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_pointLights[0].intensity"));
    protected final int F3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_pointLights[1].color"));
    protected final int G3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_fogColor"));
    protected final int H3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_shadowMapProjViewTrans"));
    protected final int I3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_shadowTexture"));
    protected final int J3 = i(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_shadowPCFOffset"));
    protected final com.badlogic.gdx.graphics.g3d.environment.a W3 = new com.badlogic.gdx.graphics.g3d.environment.a();

    /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g3d.shaders.b$b, reason: collision with other inner class name */
    public static class C0840b {
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d A;
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d B;
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d C;
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d D;
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d E;
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d F;
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d G;
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d H;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94527a = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_projTrans");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94528b = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_viewTrans");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94529c = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_projViewTrans");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94530d = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_cameraPosition");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94531e = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_cameraDirection");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94532f = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_cameraUp");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94533g = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_worldTrans");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94534h = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_viewWorldTrans");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94535i = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_projViewWorldTrans");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94536j = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_normalMatrix");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94537k = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_bones");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94538l = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_shininess", f.f94336f);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94539m = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_opacity", com.badlogic.gdx.graphics.g3d.attributes.a.f94300i);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94540n = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_diffuseColor", com.badlogic.gdx.graphics.g3d.attributes.b.f94306f);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94541o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94542p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94543q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94544r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94545s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94546t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94547u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94548v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94549w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94550x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94551y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.d f94552z;

        static {
            long j10 = j.f94350k;
            f94541o = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_diffuseTexture", j10);
            f94542p = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_diffuseUVTransform", j10);
            f94543q = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_specularColor", com.badlogic.gdx.graphics.g3d.attributes.b.f94308h);
            long j11 = j.f94352m;
            f94544r = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_specularTexture", j11);
            f94545s = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_specularUVTransform", j11);
            f94546t = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_emissiveColor", com.badlogic.gdx.graphics.g3d.attributes.b.f94312l);
            long j12 = j.Y;
            f94547u = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_emissiveTexture", j12);
            f94548v = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_emissiveUVTransform", j12);
            f94549w = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_reflectionColor", com.badlogic.gdx.graphics.g3d.attributes.b.f94314n);
            long j13 = j.f94355p0;
            f94550x = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_reflectionTexture", j13);
            f94551y = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_reflectionUVTransform", j13);
            long j14 = j.f94358t;
            f94552z = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_normalTexture", j14);
            A = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_normalUVTransform", j14);
            long j15 = j.f94360w;
            B = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_ambientTexture", j15);
            C = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_ambientUVTransform", j15);
            D = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_alphaTest");
            E = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_ambientCubemap");
            F = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_dirLights");
            G = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_pointLights");
            H = new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_environmentCubemap");
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.badlogic.gdx.math.t f94574a = new com.badlogic.gdx.math.t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Matrix4 f94575b = new Matrix4();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.badlogic.gdx.graphics.g3d.shaders.a.c f94576c = new k();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.badlogic.gdx.graphics.g3d.shaders.a.c f94577d = new u();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.badlogic.gdx.graphics.g3d.shaders.a.c f94578e = new v();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94553f = new w();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94554g = new x();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94555h = new y();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94556i = new z();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94557j = new a0();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94558k = new b0();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94559l = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94560m = new C0841b();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94561n = new C0842c();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94562o = new d();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94563p = new e();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94564q = new f();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94565r = new g();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94566s = new h();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94567t = new i();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94568u = new j();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94569v = new l();

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94570w = new m();

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94571x = new n();

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94572y = new o();

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c f94573z = new p();
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c A = new q();
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c B = new r();
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c C = new s();
        public static final com.badlogic.gdx.graphics.g3d.shaders.a.c D = new t();

        class a extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            a() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.K(i10, hVar.f94422a);
            }
        }

        class a0 extends com.badlogic.gdx.graphics.g3d.shaders.a.AbstractC0839a {
            a0() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.Q(i10, aVar.f94471j.Q1());
            }
        }

        /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g3d.shaders.b$c$b, reason: collision with other inner class name */
        class C0841b extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            C0841b() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.y(i10, ((com.badlogic.gdx.graphics.g3d.attributes.f) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.f.f94336f)).f94339d);
            }
        }

        class b0 extends com.badlogic.gdx.graphics.g3d.shaders.a.AbstractC0839a {
            b0() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.Q(i10, aVar.f94471j.z());
            }
        }

        /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g3d.shaders.b$c$c, reason: collision with other inner class name */
        class C0842c extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            C0842c() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.G(i10, ((com.badlogic.gdx.graphics.g3d.attributes.b) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.b.f94306f)).f94320d);
            }
        }

        public static class c0 extends com.badlogic.gdx.graphics.g3d.shaders.a.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final float[] f94579a = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final com.badlogic.gdx.graphics.g3d.environment.a f94580b = new com.badlogic.gdx.graphics.g3d.environment.a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final d0 f94581c = new d0();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f94582d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f94583e;

            public c0(int i10, int i11) {
                this.f94582d = i10;
                this.f94583e = i11;
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                if (hVar.f94428g == null) {
                    com.badlogic.gdx.graphics.glutils.j jVar = aVar.f94469h;
                    int iH = aVar.h(i10);
                    float[] fArr = this.f94579a;
                    jVar.h0(iH, fArr, 0, fArr.length);
                    return;
                }
                hVar.f94422a.r(this.f94581c);
                long j10 = com.badlogic.gdx.graphics.g3d.attributes.b.f94316s;
                if (bVar.a2(j10)) {
                    this.f94580b.n(((com.badlogic.gdx.graphics.g3d.attributes.b) bVar.W1(j10)).f94320d);
                }
                long j11 = com.badlogic.gdx.graphics.g3d.attributes.e.f94333f;
                if (bVar.a2(j11)) {
                    com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.environment.c> bVar2 = ((com.badlogic.gdx.graphics.g3d.attributes.e) bVar.W1(j11)).f94334d;
                    for (int i11 = this.f94582d; i11 < bVar2.f95174b; i11++) {
                        this.f94580b.f(bVar2.get(i11).f94391a, bVar2.get(i11).f94392b);
                    }
                }
                long j12 = com.badlogic.gdx.graphics.g3d.attributes.h.f94344f;
                if (bVar.a2(j12)) {
                    com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.environment.e> bVar3 = ((com.badlogic.gdx.graphics.g3d.attributes.h) bVar.W1(j12)).f94345d;
                    for (int i12 = this.f94583e; i12 < bVar3.f95174b; i12++) {
                        this.f94580b.h(bVar3.get(i12).f94391a, bVar3.get(i12).f94399b, this.f94581c, bVar3.get(i12).f94400c);
                    }
                }
                this.f94580b.j();
                com.badlogic.gdx.graphics.glutils.j jVar2 = aVar.f94469h;
                int iH2 = aVar.h(i10);
                float[] fArr2 = this.f94580b.f94390a;
                jVar2.h0(iH2, fArr2, 0, fArr2.length);
            }
        }

        class d extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            d() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.C(i10, aVar.f94470i.f94676a.d(((com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94350k)).f94361d));
            }
        }

        class e extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            e() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                com.badlogic.gdx.graphics.g3d.attributes.j jVar = (com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94350k);
                aVar.B(i10, jVar.f94362e, jVar.f94363f, jVar.f94364g, jVar.f94365h);
            }
        }

        class f extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            f() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.G(i10, ((com.badlogic.gdx.graphics.g3d.attributes.b) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.b.f94308h)).f94320d);
            }
        }

        class g extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            g() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.C(i10, aVar.f94470i.f94676a.d(((com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94352m)).f94361d));
            }
        }

        class h extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            h() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                com.badlogic.gdx.graphics.g3d.attributes.j jVar = (com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94352m);
                aVar.B(i10, jVar.f94362e, jVar.f94363f, jVar.f94364g, jVar.f94365h);
            }
        }

        class i extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            i() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.G(i10, ((com.badlogic.gdx.graphics.g3d.attributes.b) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.b.f94312l)).f94320d);
            }
        }

        class j extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            j() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.C(i10, aVar.f94470i.f94676a.d(((com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.Y)).f94361d));
            }
        }

        class k extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            k() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.K(i10, c.this.f94575b.S(aVar.f94471j.getView().f165412a).w(hVar.f94422a));
            }
        }

        class l extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            l() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                com.badlogic.gdx.graphics.g3d.attributes.j jVar = (com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.Y);
                aVar.B(i10, jVar.f94362e, jVar.f94363f, jVar.f94364g, jVar.f94365h);
            }
        }

        class m extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            m() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.G(i10, ((com.badlogic.gdx.graphics.g3d.attributes.b) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.b.f94314n)).f94320d);
            }
        }

        class n extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            n() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.C(i10, aVar.f94470i.f94676a.d(((com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94355p0)).f94361d));
            }
        }

        class o extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            o() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                com.badlogic.gdx.graphics.g3d.attributes.j jVar = (com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94355p0);
                aVar.B(i10, jVar.f94362e, jVar.f94363f, jVar.f94364g, jVar.f94365h);
            }
        }

        class p extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            p() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.C(i10, aVar.f94470i.f94676a.d(((com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94358t)).f94361d));
            }
        }

        class q extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            q() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                com.badlogic.gdx.graphics.g3d.attributes.j jVar = (com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94358t);
                aVar.B(i10, jVar.f94362e, jVar.f94363f, jVar.f94364g, jVar.f94365h);
            }
        }

        class r extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            r() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.C(i10, aVar.f94470i.f94676a.d(((com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94360w)).f94361d));
            }
        }

        class s extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            s() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                com.badlogic.gdx.graphics.g3d.attributes.j jVar = (com.badlogic.gdx.graphics.g3d.attributes.j) bVar.W1(com.badlogic.gdx.graphics.g3d.attributes.j.f94360w);
                aVar.B(i10, jVar.f94362e, jVar.f94363f, jVar.f94364g, jVar.f94365h);
            }
        }

        class t extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            t() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                long j10 = com.badlogic.gdx.graphics.g3d.attributes.c.f94322f;
                if (bVar.a2(j10)) {
                    aVar.C(i10, aVar.f94470i.f94676a.d(((com.badlogic.gdx.graphics.g3d.attributes.c) bVar.W1(j10)).f94324d));
                }
            }
        }

        class u extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            u() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.K(i10, c.this.f94575b.S(aVar.f94471j.Y1().f165412a).w(hVar.f94422a));
            }
        }

        class v extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
            v() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.J(i10, c.this.f94574a.u(hVar.f94422a).h().G());
            }
        }

        class w extends com.badlogic.gdx.graphics.g3d.shaders.a.AbstractC0839a {
            w() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.X(i10, aVar.f94471j.U1().f165412a);
            }
        }

        class x extends com.badlogic.gdx.graphics.g3d.shaders.a.AbstractC0839a {
            x() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.X(i10, aVar.f94471j.getView().f165412a);
            }
        }

        class y extends com.badlogic.gdx.graphics.g3d.shaders.a.AbstractC0839a {
            y() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.X(i10, aVar.f94471j.Y1().f165412a);
            }
        }

        class z extends com.badlogic.gdx.graphics.g3d.shaders.a.AbstractC0839a {
            z() {
            }

            @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
            public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
                aVar.B(i10, aVar.f94471j.getPosition().f180482a, aVar.f94471j.getPosition().f180483b, aVar.f94471j.getPosition().f180484c, 1.1881f / (aVar.f94471j.X1() * aVar.f94471j.X1()));
            }
        }
    }

    public b(h hVar, a aVar, com.badlogic.gdx.graphics.glutils.j jVar, c cVar) {
        int i10;
        int i11;
        com.badlogic.gdx.graphics.g3d.b bVar = new com.badlogic.gdx.graphics.g3d.b();
        this.f94486d4 = bVar;
        f0(hVar, bVar);
        this.f94485c4 = aVar;
        this.f94469h = jVar;
        int i12 = 0;
        boolean z10 = hVar.f94428g != null;
        this.T3 = z10;
        long j10 = com.badlogic.gdx.graphics.g3d.attributes.c.f94322f;
        this.U3 = bVar.a2(j10) || (z10 && bVar.a2(j10));
        this.V3 = z10 && hVar.f94428g.f94373d != null;
        this.Z3 = hVar;
        this.f94483a4 = bVar.Z1() | f94482j4;
        this.f94484b4 = hVar.f94423b.x().r();
        if (!z10 || (i10 = aVar.f94520c) <= 0) {
            i10 = 0;
        }
        this.X3 = new com.badlogic.gdx.graphics.g3d.environment.c[i10];
        int i13 = 0;
        while (true) {
            com.badlogic.gdx.graphics.g3d.environment.c[] cVarArr = this.X3;
            if (i13 >= cVarArr.length) {
                break;
            }
            cVarArr[i13] = new com.badlogic.gdx.graphics.g3d.environment.c();
            i13++;
        }
        this.Y3 = new e[(!this.T3 || (i11 = aVar.f94521d) <= 0) ? 0 : i11];
        while (true) {
            e[] eVarArr = this.Y3;
            if (i12 >= eVarArr.length) {
                break;
            }
            eVarArr[i12] = new e();
            i12++;
        }
        if (!aVar.f94524g) {
            long j11 = f94479g4;
            long j12 = this.f94483a4;
            if ((j11 & j12) != j12) {
                throw new t("Some attributes not implemented yet (" + this.f94483a4 + ")");
            }
        }
        this.f94496n = j(C0840b.f94527a, c.f94553f);
        this.f94498o = j(C0840b.f94528b, c.f94554g);
        this.f94506s = j(C0840b.f94529c, c.f94555h);
        this.f94508t = j(C0840b.f94530d, c.f94556i);
        this.f94511v = j(C0840b.f94531e, c.f94557j);
        this.f94513w = j(C0840b.f94532f, c.f94558k);
        this.X = j(C0840b.f94533g, c.f94559l);
        this.Y = j(C0840b.f94534h, cVar.f94576c);
        this.Z = j(C0840b.f94535i, cVar.f94577d);
        this.f94500p0 = j(C0840b.f94536j, cVar.f94578e);
        this.f94501p1 = -1;
        this.H1 = j(C0840b.f94538l, c.f94560m);
        this.f94502p2 = i(C0840b.f94539m);
        this.f94489g3 = j(C0840b.f94540n, c.f94561n);
        this.f94490h3 = j(C0840b.f94541o, c.f94562o);
        this.f94491i3 = j(C0840b.f94542p, c.f94563p);
        this.f94492j3 = j(C0840b.f94543q, c.f94564q);
        this.f94493k3 = j(C0840b.f94544r, c.f94565r);
        this.f94494l3 = j(C0840b.f94545s, c.f94566s);
        this.f94495m3 = j(C0840b.f94546t, c.f94567t);
        this.f94497n3 = j(C0840b.f94547u, c.f94568u);
        this.f94499o3 = j(C0840b.f94548v, c.f94569v);
        this.f94503p3 = j(C0840b.f94549w, c.f94570w);
        this.f94504q3 = j(C0840b.f94550x, c.f94571x);
        this.f94505r3 = j(C0840b.f94551y, c.f94572y);
        this.f94507s3 = j(C0840b.f94552z, c.f94573z);
        this.f94509t3 = j(C0840b.A, c.A);
        this.f94510u3 = j(C0840b.B, c.B);
        this.f94512v3 = j(C0840b.C, c.C);
        this.f94514w3 = i(C0840b.D);
        this.f94515x3 = this.T3 ? j(C0840b.E, new c.c0(aVar.f94520c, aVar.f94521d)) : -1;
        this.f94516y3 = this.U3 ? j(C0840b.H, c.D) : -1;
    }

    private static final boolean b0(long j10, long j11) {
        return (j10 & j11) == j11;
    }

    private static void f0(h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
        bVar.clear();
        com.badlogic.gdx.graphics.g3d.c cVar = hVar.f94428g;
        if (cVar != null) {
            bVar.m2(cVar);
        }
        com.badlogic.gdx.graphics.g3d.d dVar = hVar.f94427f;
        if (dVar != null) {
            bVar.m2(dVar);
        }
    }

    public static String g0(h hVar, a aVar) {
        String str;
        com.badlogic.gdx.graphics.g3d.b bVar = new com.badlogic.gdx.graphics.g3d.b();
        f0(hVar, bVar);
        long jZ1 = bVar.Z1();
        long jR = hVar.f94423b.x().r();
        String str2 = b0(jR, 1L) ? "#define positionFlag\n" : "";
        if (o0(jR, 6L)) {
            str2 = str2 + "#define colorFlag\n";
        }
        if (b0(jR, 256L)) {
            str2 = str2 + "#define binormalFlag\n";
        }
        if (b0(jR, 128L)) {
            str2 = str2 + "#define tangentFlag\n";
        }
        if (b0(jR, 8L)) {
            str2 = str2 + "#define normalFlag\n";
        }
        if ((b0(jR, 8L) || b0(jR, 384L)) && hVar.f94428g != null) {
            String str3 = (((str2 + "#define lightingFlag\n") + "#define ambientCubemapFlag\n") + "#define numDirectionalLights " + aVar.f94520c + "\n") + "#define numPointLights " + aVar.f94521d + "\n";
            if (bVar.a2(com.badlogic.gdx.graphics.g3d.attributes.b.f94318v)) {
                str3 = str3 + "#define fogFlag\n";
            }
            if (hVar.f94428g.f94373d != null) {
                str3 = str3 + "#define shadowMapFlag\n";
            }
            str2 = str3;
            if (bVar.a2(com.badlogic.gdx.graphics.g3d.attributes.c.f94322f)) {
                str2 = str2 + "#define environmentCubemapFlag\n";
            }
        }
        int size = hVar.f94423b.x().size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVarP = hVar.f94423b.x().p(i10);
            int i11 = mVarP.f94824a;
            if (i11 == 64) {
                str = str2 + "#define boneWeight" + mVarP.f94830g + "Flag\n";
            } else {
                if (i11 == 16) {
                    str = str2 + "#define texCoord" + mVarP.f94830g + "Flag\n";
                }
            }
            str2 = str;
        }
        long j10 = com.badlogic.gdx.graphics.g3d.attributes.a.f94300i;
        if ((jZ1 & j10) == j10) {
            str2 = str2 + "#define blendedFlag\n";
        }
        long j11 = j.f94350k;
        if ((jZ1 & j11) == j11) {
            str2 = (str2 + "#define diffuseTextureFlag\n") + "#define diffuseTextureCoord texCoord0\n";
        }
        long j12 = j.f94352m;
        if ((jZ1 & j12) == j12) {
            str2 = (str2 + "#define specularTextureFlag\n") + "#define specularTextureCoord texCoord0\n";
        }
        long j13 = j.f94358t;
        if ((jZ1 & j13) == j13) {
            str2 = (str2 + "#define normalTextureFlag\n") + "#define normalTextureCoord texCoord0\n";
        }
        long j14 = j.Y;
        if ((jZ1 & j14) == j14) {
            str2 = (str2 + "#define emissiveTextureFlag\n") + "#define emissiveTextureCoord texCoord0\n";
        }
        long j15 = j.f94355p0;
        if ((jZ1 & j15) == j15) {
            str2 = (str2 + "#define reflectionTextureFlag\n") + "#define reflectionTextureCoord texCoord0\n";
        }
        long j16 = j.f94360w;
        if ((jZ1 & j16) == j16) {
            str2 = (str2 + "#define ambientTextureFlag\n") + "#define ambientTextureCoord texCoord0\n";
        }
        long j17 = com.badlogic.gdx.graphics.g3d.attributes.b.f94306f;
        if ((jZ1 & j17) == j17) {
            str2 = str2 + "#define diffuseColorFlag\n";
        }
        long j18 = com.badlogic.gdx.graphics.g3d.attributes.b.f94308h;
        if ((jZ1 & j18) == j18) {
            str2 = str2 + "#define specularColorFlag\n";
        }
        long j19 = com.badlogic.gdx.graphics.g3d.attributes.b.f94312l;
        if ((jZ1 & j19) == j19) {
            str2 = str2 + "#define emissiveColorFlag\n";
        }
        long j20 = com.badlogic.gdx.graphics.g3d.attributes.b.f94314n;
        if ((jZ1 & j20) == j20) {
            str2 = str2 + "#define reflectionColorFlag\n";
        }
        long j21 = f.f94336f;
        if ((jZ1 & j21) == j21) {
            str2 = str2 + "#define shininessFlag\n";
        }
        long j22 = f.f94338h;
        if ((jZ1 & j22) == j22) {
            str2 = str2 + "#define alphaTestFlag\n";
        }
        if (hVar.f94429h == null || aVar.f94523f <= 0) {
            return str2;
        }
        return str2 + "#define numBones " + aVar.f94523f + "\n";
    }

    private static final boolean o0(long j10, long j11) {
        return (j10 & j11) != 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.a, com.badlogic.gdx.graphics.g3d.j
    public void B1(com.planner5d.library.engine.g gVar, i iVar) {
        super.B1(gVar, iVar);
        for (com.badlogic.gdx.graphics.g3d.environment.c cVar : this.X3) {
            cVar.f(0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        }
        for (e eVar : this.Y3) {
            int i10 = 4 ^ 0;
            eVar.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.f94488f4 = false;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public int J0(com.badlogic.gdx.graphics.g3d.j jVar) {
        return jVar == null ? -1 : 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public boolean V0(h hVar) {
        f0(hVar, this.f94486d4);
        if (this.f94483a4 == (this.f94486d4.Z1() | f94482j4) && this.f94484b4 == hVar.f94423b.x().r()) {
            if ((hVar.f94428g != null) == this.T3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb A[EDGE_INSN: B:74:0x00cb->B:39:0x00cb BREAK  A[LOOP:0: B:13:0x0033->B:38:0x00c6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x016f A[EDGE_INSN: B:80:0x016f->B:66:0x016f BREAK  A[LOOP:1: B:41:0x00d0->B:65:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x016b A[SYNTHETIC] */
    protected void c0(h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
        int i10;
        int i11;
        com.badlogic.gdx.graphics.g3d.c cVar = hVar.f94428g;
        com.badlogic.gdx.graphics.g3d.attributes.e eVar = (com.badlogic.gdx.graphics.g3d.attributes.e) bVar.X1(com.badlogic.gdx.graphics.g3d.attributes.e.class, com.badlogic.gdx.graphics.g3d.attributes.e.f94333f);
        com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.environment.c> bVar2 = eVar == null ? null : eVar.f94334d;
        com.badlogic.gdx.graphics.g3d.attributes.h hVar2 = (com.badlogic.gdx.graphics.g3d.attributes.h) bVar.X1(com.badlogic.gdx.graphics.g3d.attributes.h.class, com.badlogic.gdx.graphics.g3d.attributes.h.f94344f);
        com.badlogic.gdx.utils.b<e> bVar3 = hVar2 != null ? hVar2.f94345d : null;
        int i12 = 0;
        if (this.K3 >= 0) {
            int i13 = 0;
            while (true) {
                com.badlogic.gdx.graphics.g3d.environment.c[] cVarArr = this.X3;
                if (i13 >= cVarArr.length) {
                    break;
                }
                if (bVar2 == null || i13 >= bVar2.f95174b) {
                    if (this.f94488f4) {
                        com.badlogic.gdx.graphics.b bVar4 = cVarArr[i13].f94391a;
                        if (bVar4.f94187a != 0.0f || bVar4.f94188b != 0.0f || bVar4.f94189c != 0.0f) {
                        }
                    }
                    cVarArr[i13].f94391a.B(0.0f, 0.0f, 0.0f, 1.0f);
                    int i14 = this.K3 + (this.N3 * i13);
                    com.badlogic.gdx.graphics.glutils.j jVar = this.f94469h;
                    int i15 = this.L3 + i14;
                    com.badlogic.gdx.graphics.b bVar5 = this.X3[i13].f94391a;
                    jVar.b1(i15, bVar5.f94187a, bVar5.f94188b, bVar5.f94189c);
                    com.badlogic.gdx.graphics.glutils.j jVar2 = this.f94469h;
                    int i16 = i14 + this.M3;
                    d0 d0Var = this.X3[i13].f94392b;
                    jVar2.b1(i16, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
                    if (this.N3 <= 0) {
                        break;
                    }
                } else if (!this.f94488f4 || !cVarArr[i13].e(bVar2.get(i13))) {
                    this.X3[i13].j(bVar2.get(i13));
                    int i17 = this.K3 + (this.N3 * i13);
                    com.badlogic.gdx.graphics.glutils.j jVar3 = this.f94469h;
                    int i18 = this.L3 + i17;
                    com.badlogic.gdx.graphics.b bVar6 = this.X3[i13].f94391a;
                    jVar3.b1(i18, bVar6.f94187a, bVar6.f94188b, bVar6.f94189c);
                    com.badlogic.gdx.graphics.glutils.j jVar4 = this.f94469h;
                    int i19 = i17 + this.M3;
                    d0 d0Var2 = this.X3[i13].f94392b;
                    jVar4.b1(i19, d0Var2.f180482a, d0Var2.f180483b, d0Var2.f180484c);
                    if (this.N3 <= 0) {
                        break;
                        break;
                    }
                }
                i13++;
            }
        }
        if (this.O3 >= 0) {
            while (true) {
                e[] eVarArr = this.Y3;
                if (i12 >= eVarArr.length) {
                    break;
                }
                if (bVar3 == null || i12 >= bVar3.f95174b) {
                    if (!this.f94488f4 || eVarArr[i12].f94400c != 0.0f) {
                        eVarArr[i12].f94400c = 0.0f;
                        i10 = this.O3 + (this.S3 * i12);
                        com.badlogic.gdx.graphics.glutils.j jVar5 = this.f94469h;
                        int i20 = this.P3 + i10;
                        e eVar2 = this.Y3[i12];
                        com.badlogic.gdx.graphics.b bVar7 = eVar2.f94391a;
                        float f10 = bVar7.f94187a;
                        float f11 = eVar2.f94400c;
                        jVar5.b1(i20, f10 * f11, bVar7.f94188b * f11, bVar7.f94189c * f11);
                        com.badlogic.gdx.graphics.glutils.j jVar6 = this.f94469h;
                        int i21 = this.Q3 + i10;
                        d0 d0Var3 = this.Y3[i12].f94399b;
                        jVar6.b1(i21, d0Var3.f180482a, d0Var3.f180483b, d0Var3.f180484c);
                        i11 = this.R3;
                        if (i11 >= 0) {
                            this.f94469h.Y0(i10 + i11, this.Y3[i12].f94400c);
                        }
                        if (this.S3 <= 0) {
                            break;
                        }
                    }
                } else if (!this.f94488f4 || !eVarArr[i12].e(bVar3.get(i12))) {
                    this.Y3[i12].j(bVar3.get(i12));
                    i10 = this.O3 + (this.S3 * i12);
                    com.badlogic.gdx.graphics.glutils.j jVar7 = this.f94469h;
                    int i22 = this.P3 + i10;
                    e eVar3 = this.Y3[i12];
                    com.badlogic.gdx.graphics.b bVar8 = eVar3.f94391a;
                    float f12 = bVar8.f94187a;
                    float f13 = eVar3.f94400c;
                    jVar7.b1(i22, f12 * f13, bVar8.f94188b * f13, bVar8.f94189c * f13);
                    com.badlogic.gdx.graphics.glutils.j jVar8 = this.f94469h;
                    int i23 = this.Q3 + i10;
                    d0 d0Var4 = this.Y3[i12].f94399b;
                    jVar8.b1(i23, d0Var4.f180482a, d0Var4.f180483b, d0Var4.f180484c);
                    i11 = this.R3;
                    if (i11 >= 0) {
                        this.f94469h.Y0(i10 + i11, this.Y3[i12].f94400c);
                    }
                    if (this.S3 <= 0) {
                        break;
                        break;
                    }
                }
                i12++;
            }
        }
        long j10 = com.badlogic.gdx.graphics.g3d.attributes.b.f94318v;
        if (bVar.a2(j10)) {
            G(this.G3, ((com.badlogic.gdx.graphics.g3d.attributes.b) bVar.W1(j10)).f94320d);
        }
        com.badlogic.gdx.graphics.g3d.environment.f fVar = cVar.f94373d;
        if (fVar != null) {
            X(this.H3, fVar.b());
            I(this.I3, cVar.f94373d.a());
            y(this.J3, 1.0f / (cVar.f94373d.a().f94685a.o() * 2.0f));
        }
        this.f94488f4 = true;
    }

    protected void d0(com.badlogic.gdx.graphics.g3d.b bVar) {
        a aVar = this.f94485c4;
        int i10 = aVar.f94525h;
        if (i10 == -1) {
            i10 = 1029;
        }
        int i11 = aVar.f94526i;
        if (i11 == -1) {
            i11 = f94481i4;
        }
        float f10 = 0.0f;
        float f11 = 1.0f;
        boolean z10 = true;
        for (com.badlogic.gdx.graphics.g3d.a aVar2 : bVar) {
            long j10 = aVar2.f94297a;
            if (com.badlogic.gdx.graphics.g3d.attributes.a.s(j10)) {
                com.badlogic.gdx.graphics.g3d.attributes.a aVar3 = (com.badlogic.gdx.graphics.g3d.attributes.a) aVar2;
                this.f94470i.c(true, aVar3.f94302e, aVar3.f94303f);
                y(this.f94502p2, aVar3.f94304g);
            } else {
                long j11 = g.f94341f;
                if ((j10 & j11) == j11) {
                    i10 = ((g) aVar2).f94342d;
                } else {
                    long j12 = f.f94338h;
                    if ((j10 & j12) == j12) {
                        y(this.f94514w3, ((f) aVar2).f94339d);
                    } else {
                        long j13 = d.f94326i;
                        if ((j10 & j13) == j13) {
                            d dVar = (d) aVar2;
                            i11 = dVar.f94328d;
                            f10 = dVar.f94329e;
                            f11 = dVar.f94330f;
                            z10 = dVar.f94331g;
                        } else if (!this.f94485c4.f94524g) {
                            throw new t("Unknown material attribute: " + aVar2.toString());
                        }
                    }
                }
            }
        }
        this.f94470i.d(i10);
        this.f94470i.g(i11, f10, f11);
        this.f94470i.e(z10);
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.a, gc.e
    public void dispose() {
        com.badlogic.gdx.graphics.glutils.j jVar = this.f94469h;
        if (jVar != null) {
            jVar.dispose();
        }
        super.dispose();
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.a, com.badlogic.gdx.graphics.g3d.j
    public void end() {
        super.end();
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return h0((b) obj);
        }
        return false;
    }

    public boolean h0(b bVar) {
        return bVar == this;
    }

    public int j0() {
        int i10 = this.f94485c4.f94525h;
        if (i10 == -1) {
            return 1029;
        }
        return i10;
    }

    public int k0() {
        int i10 = this.f94485c4.f94526i;
        return i10 == -1 ? f94481i4 : i10;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public void r() {
        com.badlogic.gdx.graphics.glutils.j jVar = this.f94469h;
        this.f94469h = null;
        g(jVar, this.Z3);
        this.Z3 = null;
        this.K3 = h(this.f94517z3);
        this.L3 = h(this.f94517z3) - this.K3;
        this.M3 = h(this.A3) - this.K3;
        int iH = h(this.B3) - this.K3;
        this.N3 = iH;
        if (iH < 0) {
            this.N3 = 0;
        }
        this.O3 = h(this.C3);
        this.P3 = h(this.C3) - this.O3;
        this.Q3 = h(this.D3) - this.O3;
        this.R3 = f(this.E3) ? h(this.E3) - this.O3 : -1;
        int iH2 = h(this.F3) - this.O3;
        this.S3 = iH2;
        if (iH2 < 0) {
            this.S3 = 0;
        }
    }

    public void r0(int i10) {
        this.f94485c4.f94525h = i10;
    }

    public void t0(int i10) {
        this.f94485c4.f94526i = i10;
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.a
    public void x(h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
        if (!bVar.a2(com.badlogic.gdx.graphics.g3d.attributes.a.f94300i)) {
            this.f94470i.c(false, 770, 771);
        }
        d0(bVar);
        if (this.T3) {
            c0(hVar, bVar);
        }
        super.x(hVar, bVar);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f94519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f94520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f94521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f94522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f94523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f94524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f94525h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f94526i;

        public a() {
            this.f94518a = null;
            this.f94519b = null;
            int i10 = 7 & 1;
            this.f94520c = 1;
            this.f94521d = 0;
            this.f94522e = 0;
            this.f94523f = 12;
            this.f94524g = true;
            this.f94525h = -1;
            this.f94526i = -1;
        }

        public a(String str, String str2) {
            this.f94520c = 1;
            this.f94521d = 0;
            this.f94522e = 0;
            this.f94523f = 12;
            this.f94524g = true;
            this.f94525h = -1;
            this.f94526i = -1;
            this.f94518a = str;
            this.f94519b = str2;
        }
    }
}
