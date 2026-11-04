package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.target.r;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class k<TranscodeType> extends com.bumptech.glide.request.a<k<TranscodeType>> implements Cloneable, g<k<TranscodeType>> {
    protected static final com.bumptech.glide.request.h P3 = new com.bumptech.glide.request.h().s(com.bumptech.glide.load.engine.j.f96621c).B0(h.LOW).J0(true);
    private final Context B3;
    private final l C3;
    private final Class<TranscodeType> D3;
    private final b E3;
    private final d F3;

    @NonNull
    private m<?, ? super TranscodeType> G3;

    @p0
    private Object H3;

    @p0
    private List<com.bumptech.glide.request.g<TranscodeType>> I3;

    @p0
    private k<TranscodeType> J3;

    @p0
    private k<TranscodeType> K3;

    @p0
    private Float L3;
    private boolean M3;
    private boolean N3;
    private boolean O3;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f96270b;

        static {
            int[] iArr = new int[h.values().length];
            f96270b = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96270b[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96270b[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96270b[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f96269a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96269a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f96269a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f96269a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f96269a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f96269a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f96269a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f96269a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @e.a({"CheckResult"})
    protected k(@NonNull b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        this.M3 = true;
        this.E3 = bVar;
        this.C3 = lVar;
        this.D3 = cls;
        this.B3 = context;
        this.G3 = lVar.G(cls);
        this.F3 = bVar.j();
        g1(lVar.E());
        a(lVar.F());
    }

    private com.bumptech.glide.request.d X0(p<TranscodeType> pVar, @p0 com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        return Y0(new Object(), pVar, gVar, null, this.G3, aVar.S(), aVar.O(), aVar.N(), aVar, executor);
    }

    private com.bumptech.glide.request.d Y0(Object obj, p<TranscodeType> pVar, @p0 com.bumptech.glide.request.g<TranscodeType> gVar, @p0 com.bumptech.glide.request.e eVar, m<?, ? super TranscodeType> mVar, h hVar, int i10, int i11, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.b bVar;
        if (this.K3 != null) {
            bVar = new com.bumptech.glide.request.b(obj, eVar);
            eVar = bVar;
        } else {
            bVar = null;
        }
        com.bumptech.glide.request.d dVarZ0 = Z0(obj, pVar, gVar, eVar, mVar, hVar, i10, i11, aVar, executor);
        if (bVar == null) {
            return dVarZ0;
        }
        int iO = this.K3.O();
        int iN = this.K3.N();
        if (com.bumptech.glide.util.m.v(i10, i11) && !this.K3.m0()) {
            iO = aVar.O();
            iN = aVar.N();
        }
        int i12 = iN;
        k<TranscodeType> kVar = this.K3;
        com.bumptech.glide.request.b bVar2 = bVar;
        bVar2.m(dVarZ0, kVar.Y0(obj, pVar, gVar, bVar2, kVar.G3, kVar.S(), iO, i12, this.K3, executor));
        return bVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private com.bumptech.glide.request.d Z0(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.g<TranscodeType> gVar, @p0 com.bumptech.glide.request.e eVar, m<?, ? super TranscodeType> mVar, h hVar, int i10, int i11, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        k<TranscodeType> kVar = this.J3;
        if (kVar == null) {
            if (this.L3 == null) {
                return z1(obj, pVar, gVar, aVar, eVar, mVar, hVar, i10, i11, executor);
            }
            com.bumptech.glide.request.k kVar2 = new com.bumptech.glide.request.k(obj, eVar);
            kVar2.l(z1(obj, pVar, gVar, aVar, kVar2, mVar, hVar, i10, i11, executor), z1(obj, pVar, gVar, aVar.n().I0(this.L3.floatValue()), kVar2, mVar, f1(hVar), i10, i11, executor));
            return kVar2;
        }
        if (this.O3) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        m<?, ? super TranscodeType> mVar2 = kVar.M3 ? mVar : kVar.G3;
        h hVarS = kVar.e0() ? this.J3.S() : f1(hVar);
        int iO = this.J3.O();
        int iN = this.J3.N();
        if (com.bumptech.glide.util.m.v(i10, i11) && !this.J3.m0()) {
            iO = aVar.O();
            iN = aVar.N();
        }
        com.bumptech.glide.request.k kVar3 = new com.bumptech.glide.request.k(obj, eVar);
        com.bumptech.glide.request.d dVarZ1 = z1(obj, pVar, gVar, aVar, kVar3, mVar, hVar, i10, i11, executor);
        this.O3 = true;
        k kVar4 = (k<TranscodeType>) this.J3;
        com.bumptech.glide.request.d dVarY0 = kVar4.Y0(obj, pVar, gVar, kVar3, mVar2, hVarS, iO, iN, kVar4, executor);
        this.O3 = false;
        kVar3.l(dVarZ1, dVarY0);
        return kVar3;
    }

    @NonNull
    private h f1(@NonNull h hVar) {
        int i10 = a.f96270b[hVar.ordinal()];
        if (i10 == 1) {
            return h.NORMAL;
        }
        if (i10 == 2) {
            return h.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + S());
    }

    @e.a({"CheckResult"})
    private void g1(List<com.bumptech.glide.request.g<Object>> list) {
        Iterator<com.bumptech.glide.request.g<Object>> it = list.iterator();
        while (it.hasNext()) {
            V0((com.bumptech.glide.request.g) it.next());
        }
    }

    private <Y extends p<TranscodeType>> Y j1(@NonNull Y y10, @p0 com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.util.k.d(y10);
        if (!this.N3) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.request.d dVarX0 = X0(y10, gVar, aVar, executor);
        com.bumptech.glide.request.d request = y10.getRequest();
        if (dVarX0.g(request) && !m1(aVar, request)) {
            if (!((com.bumptech.glide.request.d) com.bumptech.glide.util.k.d(request)).isRunning()) {
                request.s();
            }
            return y10;
        }
        this.C3.B(y10);
        y10.p(dVarX0);
        this.C3.a0(y10, dVarX0);
        return y10;
    }

    private boolean m1(com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.d dVar) {
        return !aVar.d0() && dVar.isComplete();
    }

    @NonNull
    private k<TranscodeType> y1(@p0 Object obj) {
        this.H3 = obj;
        this.N3 = true;
        return this;
    }

    private com.bumptech.glide.request.d z1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.e eVar, m<?, ? super TranscodeType> mVar, h hVar, int i10, int i11, Executor executor) {
        Context context = this.B3;
        d dVar = this.F3;
        return com.bumptech.glide.request.j.w(context, dVar, obj, this.H3, this.D3, aVar, i10, i11, hVar, pVar, gVar, this.I3, eVar, dVar.f(), mVar.c(), executor);
    }

    @NonNull
    public p<TranscodeType> A1() {
        return C1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    public p<TranscodeType> C1(int i10, int i11) {
        return i1(com.bumptech.glide.request.target.m.e(this.C3, i10, i11));
    }

    @NonNull
    public com.bumptech.glide.request.c<TranscodeType> D1() {
        return E1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    public com.bumptech.glide.request.c<TranscodeType> E1(int i10, int i11) {
        com.bumptech.glide.request.f fVar = new com.bumptech.glide.request.f(i10, i11);
        return (com.bumptech.glide.request.c) k1(fVar, fVar, com.bumptech.glide.util.e.a());
    }

    @NonNull
    @androidx.annotation.j
    public k<TranscodeType> F1(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.L3 = Float.valueOf(f10);
        return this;
    }

    @NonNull
    @androidx.annotation.j
    public k<TranscodeType> G1(@p0 k<TranscodeType> kVar) {
        this.J3 = kVar;
        return this;
    }

    @NonNull
    @androidx.annotation.j
    public k<TranscodeType> H1(@p0 k<TranscodeType>... kVarArr) {
        k<TranscodeType> kVarG1 = null;
        if (kVarArr == null || kVarArr.length == 0) {
            return G1(null);
        }
        for (int length = kVarArr.length - 1; length >= 0; length--) {
            k<TranscodeType> kVar = kVarArr[length];
            if (kVar != null) {
                kVarG1 = kVarG1 == null ? kVar : kVar.G1(kVarG1);
            }
        }
        return G1(kVarG1);
    }

    @NonNull
    @androidx.annotation.j
    public k<TranscodeType> I1(@NonNull m<?, ? super TranscodeType> mVar) {
        this.G3 = (m) com.bumptech.glide.util.k.d(mVar);
        this.M3 = false;
        return this;
    }

    @NonNull
    @androidx.annotation.j
    public k<TranscodeType> V0(@p0 com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (gVar != null) {
            if (this.I3 == null) {
                this.I3 = new ArrayList();
            }
            this.I3.add(gVar);
        }
        return this;
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> a(@NonNull com.bumptech.glide.request.a<?> aVar) {
        com.bumptech.glide.util.k.d(aVar);
        return (k) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.j
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k<TranscodeType> n() {
        k<TranscodeType> kVar = (k) super.n();
        kVar.G3 = kVar.G3.clone();
        return kVar;
    }

    @androidx.annotation.j
    @Deprecated
    public com.bumptech.glide.request.c<File> b1(int i10, int i11) {
        return e1().E1(i10, i11);
    }

    @androidx.annotation.j
    @Deprecated
    public <Y extends p<File>> Y c1(@NonNull Y y10) {
        return (Y) e1().i1(y10);
    }

    @NonNull
    public k<TranscodeType> d1(@p0 k<TranscodeType> kVar) {
        this.K3 = kVar;
        return this;
    }

    @NonNull
    @androidx.annotation.j
    protected k<File> e1() {
        return new k(File.class, this).a(P3);
    }

    @Deprecated
    public com.bumptech.glide.request.c<TranscodeType> h1(int i10, int i11) {
        return E1(i10, i11);
    }

    @NonNull
    public <Y extends p<TranscodeType>> Y i1(@NonNull Y y10) {
        return (Y) k1(y10, null, com.bumptech.glide.util.e.b());
    }

    @NonNull
    <Y extends p<TranscodeType>> Y k1(@NonNull Y y10, @p0 com.bumptech.glide.request.g<TranscodeType> gVar, Executor executor) {
        return (Y) j1(y10, gVar, this, executor);
    }

    @NonNull
    public r<ImageView, TranscodeType> l1(@NonNull ImageView imageView) {
        com.bumptech.glide.request.a aVarP0;
        com.bumptech.glide.util.m.b();
        com.bumptech.glide.util.k.d(imageView);
        if (!l0() && j0() && imageView.getScaleType() != null) {
            switch (a.f96269a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarP0 = n().p0();
                    break;
                case 2:
                    aVarP0 = n().q0();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarP0 = n().s0();
                    break;
                case 6:
                    aVarP0 = n().q0();
                    break;
                default:
                    aVarP0 = this;
                    break;
            }
        } else {
            aVarP0 = this;
        }
        return (r) j1(this.F3.a(imageView, this.D3), null, aVarP0, com.bumptech.glide.util.e.b());
    }

    @NonNull
    @androidx.annotation.j
    public k<TranscodeType> n1(@p0 com.bumptech.glide.request.g<TranscodeType> gVar) {
        this.I3 = null;
        return V0(gVar);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> o(@p0 Bitmap bitmap) {
        return y1(bitmap).a(com.bumptech.glide.request.h.a1(com.bumptech.glide.load.engine.j.f96620b));
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> g(@p0 Drawable drawable) {
        return y1(drawable).a(com.bumptech.glide.request.h.a1(com.bumptech.glide.load.engine.j.f96620b));
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> k(@p0 Uri uri) {
        return y1(uri);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> f(@p0 File file) {
        return y1(file);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> r(@u0 @v @p0 Integer num) {
        return y1(num).a(com.bumptech.glide.request.h.s1(com.bumptech.glide.signature.a.c(this.B3)));
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> j(@p0 Object obj) {
        return y1(obj);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> c(@p0 String str) {
        return y1(str);
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.j
    @Deprecated
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> e(@p0 URL url) {
        return y1(url);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> l(@p0 byte[] bArr) {
        k<TranscodeType> kVarY1 = y1(bArr);
        if (!kVarY1.b0()) {
            kVarY1 = kVarY1.a(com.bumptech.glide.request.h.a1(com.bumptech.glide.load.engine.j.f96620b));
        }
        return !kVarY1.i0() ? kVarY1.a(com.bumptech.glide.request.h.u1(true)) : kVarY1;
    }

    @e.a({"CheckResult"})
    protected k(Class<TranscodeType> cls, k<?> kVar) {
        this(kVar.E3, kVar.C3, cls, kVar.B3);
        this.H3 = kVar.H3;
        this.N3 = kVar.N3;
        a(kVar);
    }
}
