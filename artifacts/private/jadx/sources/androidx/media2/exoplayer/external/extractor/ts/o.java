package androidx.media2.exoplayer.external.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o implements m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f54944p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f54945q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f54946r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f54947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54949c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f54953g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f54955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f54957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f54958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f54959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f54960n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f54954h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f54950d = new t(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f54951e = new t(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f54952f = new t(6, 128);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54961o = new androidx.media2.exoplayer.external.util.x();

    private static final class b {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f54962s = 128;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f54963t = 1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final int f54964u = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f54965v = 5;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f54966w = 9;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.extractor.s f54967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f54968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f54969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<androidx.media2.exoplayer.external.util.t.b> f54970d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<androidx.media2.exoplayer.external.util.t.a> f54971e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.y f54972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f54973g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f54974h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f54975i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f54976j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f54977k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f54978l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f54979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f54980n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f54981o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f54982p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f54983q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f54984r;

        private static final class a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private static final int f54985q = 2;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final int f54986r = 7;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f54987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f54988b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private androidx.media2.exoplayer.external.util.t.b f54989c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f54990d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f54991e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f54992f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f54993g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f54994h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f54995i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f54996j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f54997k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f54998l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f54999m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f55000n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f55001o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f55002p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a other) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                boolean z11;
                if (this.f54987a) {
                    return (other.f54987a && this.f54992f == other.f54992f && this.f54993g == other.f54993g && this.f54994h == other.f54994h && (!this.f54995i || !other.f54995i || this.f54996j == other.f54996j) && (((i10 = this.f54990d) == (i11 = other.f54990d) || (i10 != 0 && i11 != 0)) && (((i12 = this.f54989c.f57707k) != 0 || other.f54989c.f57707k != 0 || (this.f54999m == other.f54999m && this.f55000n == other.f55000n)) && ((i12 != 1 || other.f54989c.f57707k != 1 || (this.f55001o == other.f55001o && this.f55002p == other.f55002p)) && (z10 = this.f54997k) == (z11 = other.f54997k) && (!z10 || !z11 || this.f54998l == other.f54998l))))) ? false : true;
                }
                return false;
            }

            public void b() {
                this.f54988b = false;
                this.f54987a = false;
            }

            public boolean d() {
                if (!this.f54988b) {
                    return false;
                }
                int i10 = this.f54991e;
                return i10 == 7 || i10 == 2;
            }

            public void e(androidx.media2.exoplayer.external.util.t.b spsData, int nalRefIdc, int sliceType, int frameNum, int picParameterSetId, boolean fieldPicFlag, boolean bottomFieldFlagPresent, boolean bottomFieldFlag, boolean idrPicFlag, int idrPicId, int picOrderCntLsb, int deltaPicOrderCntBottom, int deltaPicOrderCnt0, int deltaPicOrderCnt1) {
                this.f54989c = spsData;
                this.f54990d = nalRefIdc;
                this.f54991e = sliceType;
                this.f54992f = frameNum;
                this.f54993g = picParameterSetId;
                this.f54994h = fieldPicFlag;
                this.f54995i = bottomFieldFlagPresent;
                this.f54996j = bottomFieldFlag;
                this.f54997k = idrPicFlag;
                this.f54998l = idrPicId;
                this.f54999m = picOrderCntLsb;
                this.f55000n = deltaPicOrderCntBottom;
                this.f55001o = deltaPicOrderCnt0;
                this.f55002p = deltaPicOrderCnt1;
                this.f54987a = true;
                this.f54988b = true;
            }

            public void f(int sliceType) {
                this.f54991e = sliceType;
                this.f54988b = true;
            }
        }

        public b(androidx.media2.exoplayer.external.extractor.s output, boolean allowNonIdrKeyframes, boolean detectAccessUnits) {
            this.f54967a = output;
            this.f54968b = allowNonIdrKeyframes;
            this.f54969c = detectAccessUnits;
            this.f54979m = new a();
            this.f54980n = new a();
            byte[] bArr = new byte[128];
            this.f54973g = bArr;
            this.f54972f = new androidx.media2.exoplayer.external.util.y(bArr, 0, 0);
            g();
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
        private void d(int i10) {
            boolean z10 = this.f54984r;
            this.f54967a.b(this.f54983q, z10 ? 1 : 0, (int) (this.f54976j - this.f54982p), i10, null);
        }

        /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x010c  */
        /* JADX WARN: Code duplicated, block: B:54:0x010f  */
        /* JADX WARN: Code duplicated, block: B:56:0x0113  */
        /* JADX WARN: Code duplicated, block: B:59:0x011d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0126  */
        /* JADX WARN: Code duplicated, block: B:63:0x012c  */
        /* JADX WARN: Code duplicated, block: B:66:0x0137  */
        /* JADX WARN: Code duplicated, block: B:76:0x016c  */
        public void a(byte[] data, int offset, int limit) {
            boolean z10;
            boolean z11;
            boolean zD;
            boolean z12;
            int iH;
            int i10;
            int i11;
            int iG;
            int i12;
            int iG2;
            int iE;
            if (this.f54977k) {
                int i13 = limit - offset;
                byte[] bArr = this.f54973g;
                int length = bArr.length;
                int i14 = this.f54974h;
                if (length < i14 + i13) {
                    this.f54973g = Arrays.copyOf(bArr, (i14 + i13) * 2);
                }
                System.arraycopy(data, offset, this.f54973g, this.f54974h, i13);
                int i15 = this.f54974h + i13;
                this.f54974h = i15;
                this.f54972f.i(this.f54973g, 0, i15);
                if (this.f54972f.b(8)) {
                    this.f54972f.k();
                    int iE2 = this.f54972f.e(2);
                    this.f54972f.l(5);
                    if (this.f54972f.c()) {
                        this.f54972f.h();
                        if (this.f54972f.c()) {
                            int iH2 = this.f54972f.h();
                            if (!this.f54969c) {
                                this.f54977k = false;
                                this.f54980n.f(iH2);
                                return;
                            }
                            if (this.f54972f.c()) {
                                int iH3 = this.f54972f.h();
                                if (this.f54971e.indexOfKey(iH3) < 0) {
                                    this.f54977k = false;
                                    return;
                                }
                                androidx.media2.exoplayer.external.util.t.a aVar = this.f54971e.get(iH3);
                                androidx.media2.exoplayer.external.util.t.b bVar = this.f54970d.get(aVar.f57695b);
                                if (bVar.f57704h) {
                                    if (!this.f54972f.b(2)) {
                                        return;
                                    } else {
                                        this.f54972f.l(2);
                                    }
                                }
                                if (this.f54972f.b(bVar.f57706j)) {
                                    int iE3 = this.f54972f.e(bVar.f57706j);
                                    if (!bVar.f57705i) {
                                        if (this.f54972f.b(1)) {
                                            boolean zD2 = this.f54972f.d();
                                            if (!zD2) {
                                                z10 = zD2;
                                                z11 = false;
                                            } else {
                                                if (!this.f54972f.b(1)) {
                                                    return;
                                                }
                                                z10 = zD2;
                                                z11 = true;
                                                zD = this.f54972f.d();
                                            }
                                            if (this.f54975i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                iH = 0;
                                            } else if (!this.f54972f.c()) {
                                                return;
                                            } else {
                                                iH = this.f54972f.h();
                                            }
                                            i10 = bVar.f57707k;
                                            if (i10 != 0) {
                                                if (this.f54972f.b(bVar.f57708l)) {
                                                    iE = this.f54972f.e(bVar.f57708l);
                                                    if (aVar.f57696c || z10) {
                                                        i11 = iE;
                                                        iG = 0;
                                                    } else {
                                                        if (!this.f54972f.c()) {
                                                            return;
                                                        }
                                                        iG = this.f54972f.g();
                                                        i11 = iE;
                                                        i12 = 0;
                                                    }
                                                    iG2 = i12;
                                                    this.f54980n.e(bVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i11, iG, i12, iG2);
                                                    this.f54977k = false;
                                                }
                                                return;
                                            }
                                            if (i10 == 1 || bVar.f57709m) {
                                                i11 = 0;
                                                iG = 0;
                                            } else {
                                                if (!this.f54972f.c()) {
                                                    return;
                                                }
                                                int iG3 = this.f54972f.g();
                                                if (!aVar.f57696c || z10) {
                                                    i12 = iG3;
                                                    i11 = 0;
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!this.f54972f.c()) {
                                                        return;
                                                    }
                                                    iG2 = this.f54972f.g();
                                                    i12 = iG3;
                                                    i11 = 0;
                                                    iG = 0;
                                                }
                                            }
                                            this.f54980n.e(bVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i11, iG, i12, iG2);
                                            this.f54977k = false;
                                            i12 = iG;
                                            iG2 = i12;
                                            this.f54980n.e(bVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i11, iG, i12, iG2);
                                            this.f54977k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zD = z11;
                                    if (this.f54975i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        iH = 0;
                                    } else if (!this.f54972f.c()) {
                                        return;
                                    } else {
                                        iH = this.f54972f.h();
                                    }
                                    i10 = bVar.f57707k;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                        }
                                        i11 = 0;
                                        iG = 0;
                                    } else {
                                        if (this.f54972f.b(bVar.f57708l)) {
                                            return;
                                        }
                                        iE = this.f54972f.e(bVar.f57708l);
                                        if (aVar.f57696c) {
                                        }
                                        i11 = iE;
                                        iG = 0;
                                    }
                                    i12 = iG;
                                    iG2 = i12;
                                    this.f54980n.e(bVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i11, iG, i12, iG2);
                                    this.f54977k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long position, int offset, boolean hasOutputFormat, boolean randomAccessIndicator) {
            boolean z10 = false;
            if (this.f54975i == 9 || (this.f54969c && this.f54980n.c(this.f54979m))) {
                if (hasOutputFormat && this.f54981o) {
                    d(offset + ((int) (position - this.f54976j)));
                }
                this.f54982p = this.f54976j;
                this.f54983q = this.f54978l;
                this.f54984r = false;
                this.f54981o = true;
            }
            if (this.f54968b) {
                randomAccessIndicator = this.f54980n.d();
            }
            boolean z11 = this.f54984r;
            int i10 = this.f54975i;
            if (i10 == 5 || (randomAccessIndicator && i10 == 1)) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            this.f54984r = z12;
            return z12;
        }

        public boolean c() {
            return this.f54969c;
        }

        public void e(androidx.media2.exoplayer.external.util.t.a ppsData) {
            this.f54971e.append(ppsData.f57694a, ppsData);
        }

        public void f(androidx.media2.exoplayer.external.util.t.b spsData) {
            this.f54970d.append(spsData.f57700d, spsData);
        }

        public void g() {
            this.f54977k = false;
            this.f54981o = false;
            this.f54980n.b();
        }

        public void h(long position, int type, long pesTimeUs) {
            this.f54975i = type;
            this.f54978l = pesTimeUs;
            this.f54976j = position;
            if (!this.f54968b || type != 1) {
                if (!this.f54969c) {
                    return;
                }
                if (type != 5 && type != 1 && type != 2) {
                    return;
                }
            }
            a aVar = this.f54979m;
            this.f54979m = this.f54980n;
            this.f54980n = aVar;
            aVar.b();
            this.f54974h = 0;
            this.f54977k = true;
        }
    }

    public o(b0 seiReader, boolean allowNonIdrKeyframes, boolean detectAccessUnits) {
        this.f54947a = seiReader;
        this.f54948b = allowNonIdrKeyframes;
        this.f54949c = detectAccessUnits;
    }

    private void b(long position, int offset, int discardPadding, long pesTimeUs) {
        if (!this.f54958l || this.f54957k.c()) {
            this.f54950d.b(discardPadding);
            this.f54951e.b(discardPadding);
            if (this.f54958l) {
                if (this.f54950d.c()) {
                    t tVar = this.f54950d;
                    this.f54957k.f(androidx.media2.exoplayer.external.util.t.i(tVar.f55092d, 3, tVar.f55093e));
                    this.f54950d.d();
                } else if (this.f54951e.c()) {
                    t tVar2 = this.f54951e;
                    this.f54957k.e(androidx.media2.exoplayer.external.util.t.h(tVar2.f55092d, 3, tVar2.f55093e));
                    this.f54951e.d();
                }
            } else if (this.f54950d.c() && this.f54951e.c()) {
                ArrayList arrayList = new ArrayList();
                t tVar3 = this.f54950d;
                arrayList.add(Arrays.copyOf(tVar3.f55092d, tVar3.f55093e));
                t tVar4 = this.f54951e;
                arrayList.add(Arrays.copyOf(tVar4.f55092d, tVar4.f55093e));
                t tVar5 = this.f54950d;
                androidx.media2.exoplayer.external.util.t.b bVarI = androidx.media2.exoplayer.external.util.t.i(tVar5.f55092d, 3, tVar5.f55093e);
                t tVar6 = this.f54951e;
                androidx.media2.exoplayer.external.util.t.a aVarH = androidx.media2.exoplayer.external.util.t.h(tVar6.f55092d, 3, tVar6.f55093e);
                this.f54956j.c(Format.H(this.f54955i, "video/avc", androidx.media2.exoplayer.external.util.d.c(bVarI.f57697a, bVarI.f57698b, bVarI.f57699c), -1, -1, bVarI.f57701e, bVarI.f57702f, -1.0f, arrayList, -1, bVarI.f57703g, null));
                this.f54958l = true;
                this.f54957k.f(bVarI);
                this.f54957k.e(aVarH);
                this.f54950d.d();
                this.f54951e.d();
            }
        }
        if (this.f54952f.b(discardPadding)) {
            t tVar7 = this.f54952f;
            this.f54961o.O(this.f54952f.f55092d, androidx.media2.exoplayer.external.util.t.k(tVar7.f55092d, tVar7.f55093e));
            this.f54961o.Q(4);
            this.f54947a.a(pesTimeUs, this.f54961o);
        }
        if (this.f54957k.b(position, offset, this.f54958l, this.f54960n)) {
            this.f54960n = false;
        }
    }

    private void g(byte[] dataArray, int offset, int limit) {
        if (!this.f54958l || this.f54957k.c()) {
            this.f54950d.a(dataArray, offset, limit);
            this.f54951e.a(dataArray, offset, limit);
        }
        this.f54952f.a(dataArray, offset, limit);
        this.f54957k.a(dataArray, offset, limit);
    }

    private void h(long position, int nalUnitType, long pesTimeUs) {
        if (!this.f54958l || this.f54957k.c()) {
            this.f54950d.e(nalUnitType);
            this.f54951e.e(nalUnitType);
        }
        this.f54952f.e(nalUnitType);
        this.f54957k.h(position, nalUnitType, pesTimeUs);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        androidx.media2.exoplayer.external.util.t.a(this.f54954h);
        this.f54950d.d();
        this.f54951e.d();
        this.f54952f.d();
        this.f54957k.g();
        this.f54953g = 0L;
        this.f54960n = false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        boolean z10;
        this.f54959m = pesTimeUs;
        boolean z11 = this.f54960n;
        if ((flags & 2) != 0) {
            z10 = true;
            int i10 = 6 | 1;
        } else {
            z10 = false;
        }
        this.f54960n = z11 | z10;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) {
        int iC = data.c();
        int iD = data.d();
        byte[] bArr = data.f57720a;
        this.f54953g += (long) data.a();
        this.f54956j.d(data, data.a());
        while (true) {
            int iC2 = androidx.media2.exoplayer.external.util.t.c(bArr, iC, iD, this.f54954h);
            if (iC2 == iD) {
                this.g(bArr, iC, iD);
                return;
            }
            int iF = androidx.media2.exoplayer.external.util.t.f(bArr, iC2);
            int i10 = iC2 - iC;
            if (i10 > 0) {
                this.g(bArr, iC, iC2);
            }
            int i11 = iD - iC2;
            long j10 = this.f54953g - ((long) i11);
            o oVar = this;
            oVar.b(j10, i11, i10 < 0 ? -i10 : 0, this.f54959m);
            oVar.h(j10, iF, oVar.f54959m);
            iC = iC2 + 3;
            this = oVar;
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        idGenerator.a();
        this.f54955i = idGenerator.b();
        androidx.media2.exoplayer.external.extractor.s sVarA = extractorOutput.a(idGenerator.c(), 2);
        this.f54956j = sVarA;
        this.f54957k = new b(sVarA, this.f54948b, this.f54949c);
        this.f54947a.b(extractorOutput, idGenerator);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }
}
