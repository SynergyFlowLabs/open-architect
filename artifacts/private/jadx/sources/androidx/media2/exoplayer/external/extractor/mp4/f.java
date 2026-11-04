package androidx.media2.exoplayer.external.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.collection.g3;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.metadata.emsg.EventMessage;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.t;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class f implements androidx.media2.exoplayer.external.extractor.i {
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 4;
    private static final int R = 8;
    public static final int S = 16;
    private static final String T = "FragmentedMp4Extractor";
    private static final int U = 1936025959;
    private static final int X = 0;
    private static final int Y = 1;
    private static final int Z = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f54415a0 = 3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f54416b0 = 4;
    private long A;
    private long B;
    private long C;
    private c D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private androidx.media2.exoplayer.external.extractor.k J;
    private s[] K;
    private s[] L;
    private boolean M;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final l f54418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Format> f54419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final DrmInitData f54420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<c> f54421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x f54422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x f54423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x f54424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final byte[] f54425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final x f54426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private final k0 f54427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.metadata.emsg.b f54428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x f54429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayDeque<androidx.media2.exoplayer.external.extractor.mp4.a.C0510a> f54430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayDeque<b> f54431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private final s f54432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f54433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f54434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f54435v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f54436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private x f54437x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f54438y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f54439z;
    public static final androidx.media2.exoplayer.external.extractor.l N = e.f54414a;
    private static final byte[] V = {-94, 57, 79, 82, 90, -101, 79, com.google.common.base.c.f116471x, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format W = Format.w(null, "application/x-emsg", Long.MAX_VALUE);

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f54440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54441b;

        public b(long presentationTimeDeltaUs, int size) {
            this.f54440a = presentationTimeDeltaUs;
            this.f54441b = size;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f54442a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l f54444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.media2.exoplayer.external.extractor.mp4.c f54445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f54446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f54447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f54448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f54449h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f54443b = new n();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final x f54450i = new x(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final x f54451j = new x();

        public c(s output) {
            this.f54442a = output;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public m c() {
            n nVar = this.f54443b;
            int i10 = nVar.f54531a.f54403a;
            m mVarB = nVar.f54545o;
            if (mVarB == null) {
                mVarB = this.f54444c.b(i10);
            }
            if (mVarB == null || !mVarB.f54526a) {
                return null;
            }
            return mVarB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            m mVarC = c();
            if (mVarC == null) {
                return;
            }
            x xVar = this.f54443b.f54547q;
            int i10 = mVarC.f54529d;
            if (i10 != 0) {
                xVar.R(i10);
            }
            if (this.f54443b.g(this.f54446e)) {
                xVar.R(xVar.J() * 6);
            }
        }

        public void d(l track, androidx.media2.exoplayer.external.extractor.mp4.c defaultSampleValues) {
            this.f54444c = (l) androidx.media2.exoplayer.external.util.a.g(track);
            this.f54445d = (androidx.media2.exoplayer.external.extractor.mp4.c) androidx.media2.exoplayer.external.util.a.g(defaultSampleValues);
            this.f54442a.c(track.f54519f);
            g();
        }

        public boolean e() {
            this.f54446e++;
            int i10 = this.f54447f + 1;
            this.f54447f = i10;
            int[] iArr = this.f54443b.f54538h;
            int i11 = this.f54448g;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f54448g = i11 + 1;
            this.f54447f = 0;
            return false;
        }

        public int f() {
            x xVar;
            m mVarC = c();
            if (mVarC == null) {
                return 0;
            }
            int length = mVarC.f54529d;
            if (length != 0) {
                xVar = this.f54443b.f54547q;
            } else {
                byte[] bArr = mVarC.f54530e;
                this.f54451j.O(bArr, bArr.length);
                x xVar2 = this.f54451j;
                length = bArr.length;
                xVar = xVar2;
            }
            boolean zG = this.f54443b.g(this.f54446e);
            x xVar3 = this.f54450i;
            xVar3.f57720a[0] = (byte) ((zG ? 128 : 0) | length);
            xVar3.Q(0);
            this.f54442a.d(this.f54450i, 1);
            this.f54442a.d(xVar, length);
            if (!zG) {
                return length + 1;
            }
            x xVar4 = this.f54443b.f54547q;
            int iJ = xVar4.J();
            xVar4.R(-2);
            int i10 = (iJ * 6) + 2;
            this.f54442a.d(xVar4, i10);
            return length + 1 + i10;
        }

        public void g() {
            this.f54443b.f();
            this.f54446e = 0;
            this.f54448g = 0;
            this.f54447f = 0;
            this.f54449h = 0;
        }

        public void h(long timeUs) {
            long jC = androidx.media2.exoplayer.external.c.c(timeUs);
            int i10 = this.f54446e;
            while (true) {
                n nVar = this.f54443b;
                if (i10 >= nVar.f54536f || nVar.c(i10) >= jC) {
                    return;
                }
                if (this.f54443b.f54542l[i10]) {
                    this.f54449h = i10;
                }
                i10++;
            }
        }

        public void j(DrmInitData drmInitData) {
            m mVarB = this.f54444c.b(this.f54443b.f54531a.f54403a);
            this.f54442a.c(this.f54444c.f54519f.e(drmInitData.c(mVarB != null ? mVarB.f54527b : null)));
        }
    }

    public f() {
        this(0);
    }

    private static long A(x tfdt) {
        tfdt.Q(8);
        return androidx.media2.exoplayer.external.extractor.mp4.a.c(tfdt.l()) == 1 ? tfdt.I() : tfdt.F();
    }

    private static c B(x tfhd, SparseArray<c> trackBundles) {
        tfhd.Q(8);
        int iB = androidx.media2.exoplayer.external.extractor.mp4.a.b(tfhd.l());
        c cVarI = i(trackBundles, tfhd.l());
        if (cVarI == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jI = tfhd.I();
            n nVar = cVarI.f54443b;
            nVar.f54533c = jI;
            nVar.f54534d = jI;
        }
        androidx.media2.exoplayer.external.extractor.mp4.c cVar = cVarI.f54445d;
        cVarI.f54443b.f54531a = new androidx.media2.exoplayer.external.extractor.mp4.c((iB & 2) != 0 ? tfhd.H() - 1 : cVar.f54403a, (iB & 8) != 0 ? tfhd.H() : cVar.f54404b, (iB & 16) != 0 ? tfhd.H() : cVar.f54405c, (iB & 32) != 0 ? tfhd.H() : cVar.f54406d);
        return cVarI;
    }

    private static void C(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a traf, SparseArray<c> trackBundleArray, int flags, byte[] extendedTypeScratch) throws androidx.media2.exoplayer.external.k0 {
        c cVarB = B(traf.h(1952868452).f54366m1, trackBundleArray);
        if (cVarB == null) {
            return;
        }
        n nVar = cVarB.f54443b;
        long jA = nVar.f54549s;
        cVarB.g();
        if (traf.h(1952867444) != null && (flags & 2) == 0) {
            jA = A(traf.h(1952867444).f54366m1);
        }
        F(traf, cVarB, jA, flags);
        m mVarB = cVarB.f54444c.b(nVar.f54531a.f54403a);
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH = traf.h(1935763834);
        if (bVarH != null) {
            v(mVarB, bVarH.f54366m1, nVar);
        }
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH2 = traf.h(1935763823);
        if (bVarH2 != null) {
            u(bVarH2.f54366m1, nVar);
        }
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH3 = traf.h(1936027235);
        if (bVarH3 != null) {
            x(bVarH3.f54366m1, nVar);
        }
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH4 = traf.h(1935828848);
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH5 = traf.h(1936158820);
        if (bVarH4 != null && bVarH5 != null) {
            y(bVarH4.f54366m1, bVarH5.f54366m1, mVarB != null ? mVarB.f54527b : null, nVar);
        }
        int size = traf.f54364n1.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.media2.exoplayer.external.extractor.mp4.a.b bVar = traf.f54364n1.get(i10);
            if (bVar.f54362a == 1970628964) {
                G(bVar.f54366m1, nVar, extendedTypeScratch);
            }
        }
    }

    private static Pair<Integer, androidx.media2.exoplayer.external.extractor.mp4.c> D(x trex) {
        trex.Q(12);
        return Pair.create(Integer.valueOf(trex.l()), new androidx.media2.exoplayer.external.extractor.mp4.c(trex.H() - 1, trex.H(), trex.H(), trex.l()));
    }

    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v7 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private static int E(androidx.media2.exoplayer.external.extractor.mp4.f.c r27, int r28, long r29, int r31, androidx.media2.exoplayer.external.util.x r32, int r33) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.extractor.mp4.f.E(androidx.media2.exoplayer.external.extractor.mp4.f$c, int, long, int, androidx.media2.exoplayer.external.util.x, int):int");
    }

    private static void F(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a traf, c trackBundle, long decodeTime, int flags) {
        List<androidx.media2.exoplayer.external.extractor.mp4.a.b> list = traf.f54364n1;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.media2.exoplayer.external.extractor.mp4.a.b bVar = list.get(i13);
            if (bVar.f54362a == 1953658222) {
                x xVar = bVar.f54366m1;
                xVar.Q(12);
                int iH = xVar.H();
                if (iH > 0) {
                    i12 += iH;
                    i11++;
                }
            }
        }
        trackBundle.f54448g = 0;
        trackBundle.f54447f = 0;
        trackBundle.f54446e = 0;
        trackBundle.f54443b.e(i11, i12);
        int iE = 0;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.media2.exoplayer.external.extractor.mp4.a.b bVar2 = list.get(i14);
            if (bVar2.f54362a == 1953658222) {
                iE = E(trackBundle, i10, decodeTime, flags, bVar2.f54366m1, iE);
                i10++;
            }
        }
    }

    private static void G(x uuid, n out, byte[] extendedTypeScratch) throws androidx.media2.exoplayer.external.k0 {
        uuid.Q(8);
        uuid.i(extendedTypeScratch, 0, 16);
        if (Arrays.equals(extendedTypeScratch, V)) {
            w(uuid, 16, out);
        }
    }

    private void H(long atomEndPosition) throws androidx.media2.exoplayer.external.k0 {
        while (!this.f54430q.isEmpty() && this.f54430q.peek().f54363m1 == atomEndPosition) {
            m(this.f54430q.pop());
        }
        d();
    }

    private boolean I(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        if (this.f54436w == 0) {
            if (!input.e(this.f54429p.f57720a, 0, 8, true)) {
                return false;
            }
            this.f54436w = 8;
            this.f54429p.Q(0);
            this.f54435v = this.f54429p.F();
            this.f54434u = this.f54429p.l();
        }
        long j10 = this.f54435v;
        if (j10 == 1) {
            input.readFully(this.f54429p.f57720a, 8, 8);
            this.f54436w += 8;
            this.f54435v = this.f54429p.I();
        } else if (j10 == 0) {
            long length = input.getLength();
            if (length == -1 && !this.f54430q.isEmpty()) {
                length = this.f54430q.peek().f54363m1;
            }
            if (length != -1) {
                this.f54435v = (length - input.getPosition()) + ((long) this.f54436w);
            }
        }
        if (this.f54435v < this.f54436w) {
            throw new androidx.media2.exoplayer.external.k0("Atom size less than header length (unsupported).");
        }
        long position = input.getPosition() - ((long) this.f54436w);
        if (this.f54434u == 1836019558) {
            int size = this.f54421h.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = this.f54421h.valueAt(i10).f54443b;
                nVar.f54532b = position;
                nVar.f54534d = position;
                nVar.f54533c = position;
            }
        }
        int i11 = this.f54434u;
        if (i11 == 1835295092) {
            this.D = null;
            this.f54438y = this.f54435v + position;
            if (!this.M) {
                this.J.q(new q.b(this.B, position));
                this.M = true;
            }
            this.f54433t = 2;
            return true;
        }
        if (M(i11)) {
            long position2 = (input.getPosition() + this.f54435v) - 8;
            this.f54430q.push(new androidx.media2.exoplayer.external.extractor.mp4.a.C0510a(this.f54434u, position2));
            if (this.f54435v == this.f54436w) {
                H(position2);
            } else {
                d();
            }
        } else if (N(this.f54434u)) {
            if (this.f54436w != 8) {
                throw new androidx.media2.exoplayer.external.k0("Leaf atom defines extended atom size (unsupported).");
            }
            long j11 = this.f54435v;
            if (j11 > g3.f12256c) {
                throw new androidx.media2.exoplayer.external.k0("Leaf atom with length > 2147483647 (unsupported).");
            }
            x xVar = new x((int) j11);
            this.f54437x = xVar;
            System.arraycopy(this.f54429p.f57720a, 0, xVar.f57720a, 0, 8);
            this.f54433t = 1;
        } else {
            if (this.f54435v > g3.f12256c) {
                throw new androidx.media2.exoplayer.external.k0("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f54437x = null;
            this.f54433t = 1;
        }
        return true;
    }

    private void J(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        int i10 = ((int) this.f54435v) - this.f54436w;
        x xVar = this.f54437x;
        if (xVar != null) {
            input.readFully(xVar.f57720a, 8, i10);
            o(new androidx.media2.exoplayer.external.extractor.mp4.a.b(this.f54434u, this.f54437x), input.getPosition());
        } else {
            input.o(i10);
        }
        H(input.getPosition());
    }

    private void K(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        int size = this.f54421h.size();
        c cVarValueAt = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = this.f54421h.valueAt(i10).f54443b;
            if (nVar.f54548r) {
                long j11 = nVar.f54534d;
                if (j11 < j10) {
                    cVarValueAt = this.f54421h.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (cVarValueAt == null) {
            this.f54433t = 3;
            return;
        }
        int position = (int) (j10 - input.getPosition());
        if (position < 0) {
            throw new androidx.media2.exoplayer.external.k0("Offset to encryption data was negative.");
        }
        input.o(position);
        cVarValueAt.f54443b.a(input);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.media2.exoplayer.external.extractor.s] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean] */
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
    private boolean L(androidx.media2.exoplayer.external.extractor.j jVar) throws InterruptedException, IOException {
        ?? r17;
        boolean z10;
        s.a aVar;
        ?? r10;
        int iA;
        int i10 = 4;
        int i11 = 1;
        int i12 = 0;
        if (this.f54433t == 3) {
            if (this.D == null) {
                c cVarH = h(this.f54421h);
                if (cVarH == null) {
                    int position = (int) (this.f54438y - jVar.getPosition());
                    if (position < 0) {
                        throw new androidx.media2.exoplayer.external.k0("Offset to end of mdat was negative.");
                    }
                    jVar.o(position);
                    d();
                    return false;
                }
                int position2 = (int) (cVarH.f54443b.f54537g[cVarH.f54448g] - jVar.getPosition());
                if (position2 < 0) {
                    p.l(T, "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                jVar.o(position2);
                this.D = cVarH;
            }
            c cVar = this.D;
            int[] iArr = cVar.f54443b.f54539i;
            int i13 = cVar.f54446e;
            int i14 = iArr[i13];
            this.E = i14;
            if (i13 < cVar.f54449h) {
                jVar.o(i14);
                this.D.i();
                if (!this.D.e()) {
                    this.D = null;
                }
                this.f54433t = 3;
                return true;
            }
            if (cVar.f54444c.f54520g == 1) {
                this.E = i14 - 8;
                jVar.o(8);
            }
            int iF = this.D.f();
            this.F = iF;
            this.E += iF;
            this.f54433t = 4;
            this.G = 0;
            this.I = "audio/ac4".equals(this.D.f54444c.f54519f.f53103i);
        }
        c cVar2 = this.D;
        n nVar = cVar2.f54443b;
        l lVar = cVar2.f54444c;
        ?? r11 = cVar2.f54442a;
        int i15 = cVar2.f54446e;
        long jC = nVar.c(i15) * 1000;
        k0 k0Var = this.f54427n;
        if (k0Var != null) {
            jC = k0Var.a(jC);
        }
        int i16 = lVar.f54523j;
        if (i16 == 0) {
            r17 = 1;
            if (this.I) {
                androidx.media2.exoplayer.external.audio.b.a(this.E, this.f54426m);
                int iD = this.f54426m.d();
                r11.d(this.f54426m, iD);
                this.E += iD;
                this.F += iD;
                z10 = false;
                this.I = false;
            } else {
                z10 = false;
            }
            while (true) {
                int i17 = this.F;
                int i18 = this.E;
                if (i17 >= i18) {
                    break;
                }
                this.F += r11.a(jVar, i18 - i17, z10);
            }
        } else {
            byte[] bArr = this.f54423j.f57720a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i19 = i16 + 1;
            int i20 = 4 - i16;
            while (this.F < this.E) {
                int i21 = this.G;
                if (i21 == 0) {
                    jVar.readFully(bArr, i20, i19);
                    this.f54423j.Q(i12);
                    int iL = this.f54423j.l();
                    if (iL < i11) {
                        throw new androidx.media2.exoplayer.external.k0("Invalid NAL length");
                    }
                    this.G = iL - 1;
                    this.f54422i.Q(i12);
                    r11.d(this.f54422i, i10);
                    r11.d(this.f54423j, i11);
                    this.H = (this.L.length <= 0 || !t.g(lVar.f54519f.f53103i, bArr[i10])) ? i12 : i11;
                    this.F += 5;
                    this.E += i20;
                } else {
                    if (this.H) {
                        this.f54424k.M(i21);
                        jVar.readFully(this.f54424k.f57720a, i12, this.G);
                        r11.d(this.f54424k, this.G);
                        iA = this.G;
                        x xVar = this.f54424k;
                        int iK = t.k(xVar.f57720a, xVar.d());
                        this.f54424k.Q("video/hevc".equals(lVar.f54519f.f53103i) ? 1 : 0);
                        this.f54424k.P(iK);
                        androidx.media2.exoplayer.external.text.cea.g.a(jC, this.f54424k, this.L);
                    } else {
                        iA = r11.a(jVar, i21, i12);
                    }
                    this.F += iA;
                    this.G -= iA;
                    i11 = i11;
                    i10 = 4;
                    i12 = 0;
                }
            }
            r17 = i11;
        }
        boolean z11 = nVar.f54542l[i15];
        m mVarC = this.D.c();
        if (mVarC != null) {
            int i22 = (z11 ? 1 : 0) | 1073741824;
            aVar = mVarC.f54528c;
            r10 = i22;
        } else {
            aVar = null;
            r10 = z11;
        }
        r11.b(jC, r10 == true ? 1 : 0, this.E, 0, aVar);
        r(jC);
        if (!this.D.e()) {
            this.D = null;
        }
        this.f54433t = 3;
        return r17;
    }

    private static boolean M(int atom) {
        return atom == 1836019574 || atom == 1953653099 || atom == 1835297121 || atom == 1835626086 || atom == 1937007212 || atom == 1836019558 || atom == 1953653094 || atom == 1836475768 || atom == 1701082227;
    }

    private static boolean N(int atom) {
        return atom == 1751411826 || atom == 1835296868 || atom == 1836476516 || atom == 1936286840 || atom == 1937011556 || atom == 1952867444 || atom == 1952868452 || atom == 1953196132 || atom == 1953654136 || atom == 1953658222 || atom == 1886614376 || atom == 1935763834 || atom == 1935763823 || atom == 1936027235 || atom == 1970628964 || atom == 1935828848 || atom == 1936158820 || atom == 1701606260 || atom == 1835362404 || atom == 1701671783;
    }

    private void d() {
        this.f54433t = 0;
        this.f54436w = 0;
    }

    private androidx.media2.exoplayer.external.extractor.mp4.c e(SparseArray<androidx.media2.exoplayer.external.extractor.mp4.c> defaultSampleValuesArray, int trackId) {
        return defaultSampleValuesArray.size() == 1 ? defaultSampleValuesArray.valueAt(0) : (androidx.media2.exoplayer.external.extractor.mp4.c) androidx.media2.exoplayer.external.util.a.g(defaultSampleValuesArray.get(trackId));
    }

    private static DrmInitData g(List<androidx.media2.exoplayer.external.extractor.mp4.a.b> leafChildren) {
        int size = leafChildren.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.media2.exoplayer.external.extractor.mp4.a.b bVar = leafChildren.get(i10);
            if (bVar.f54362a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f54366m1.f57720a;
                UUID uuidF = j.f(bArr);
                if (uuidF == null) {
                    p.l(T, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidF, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static c h(SparseArray<c> trackBundles) {
        int size = trackBundles.size();
        c cVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            c cVarValueAt = trackBundles.valueAt(i10);
            int i11 = cVarValueAt.f54448g;
            n nVar = cVarValueAt.f54443b;
            if (i11 != nVar.f54535e) {
                long j11 = nVar.f54537g[i11];
                if (j11 < j10) {
                    cVar = cVarValueAt;
                    j10 = j11;
                }
            }
        }
        return cVar;
    }

    @p0
    private static c i(SparseArray<c> trackBundles, int trackId) {
        return trackBundles.size() == 1 ? trackBundles.valueAt(0) : trackBundles.get(trackId);
    }

    static final /* synthetic */ androidx.media2.exoplayer.external.extractor.i[] j() {
        return new androidx.media2.exoplayer.external.extractor.i[]{new f()};
    }

    private void k() {
        int i10;
        if (this.K == null) {
            int i11 = 1 << 2;
            s[] sVarArr = new s[2];
            this.K = sVarArr;
            s sVar = this.f54432s;
            if (sVar != null) {
                sVarArr[0] = sVar;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((this.f54417d & 4) != 0) {
                sVarArr[i10] = this.J.a(this.f54421h.size(), 4);
                i10++;
            }
            s[] sVarArr2 = (s[]) Arrays.copyOf(this.K, i10);
            this.K = sVarArr2;
            for (s sVar2 : sVarArr2) {
                sVar2.c(W);
            }
        }
        if (this.L == null) {
            this.L = new s[this.f54419f.size()];
            for (int i12 = 0; i12 < this.L.length; i12++) {
                s sVarA = this.J.a(this.f54421h.size() + 1 + i12, 3);
                sVarA.c(this.f54419f.get(i12));
                this.L[i12] = sVarA;
            }
        }
    }

    private void m(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a container) throws androidx.media2.exoplayer.external.k0 {
        int i10 = container.f54362a;
        if (i10 == 1836019574) {
            q(container);
        } else if (i10 == 1836019558) {
            p(container);
        } else {
            if (this.f54430q.isEmpty()) {
                return;
            }
            this.f54430q.peek().d(container);
        }
    }

    private void n(x atom) {
        String str;
        String str2;
        long jI0;
        long jI1;
        long jF;
        long jA;
        s[] sVarArr = this.K;
        if (sVarArr == null || sVarArr.length == 0) {
            return;
        }
        atom.Q(8);
        int iC = androidx.media2.exoplayer.external.extractor.mp4.a.c(atom.l());
        if (iC == 0) {
            str = (String) androidx.media2.exoplayer.external.util.a.g(atom.x());
            str2 = (String) androidx.media2.exoplayer.external.util.a.g(atom.x());
            long jF2 = atom.F();
            jI0 = q0.I0(atom.F(), 1000000L, jF2);
            long j10 = this.C;
            long j11 = j10 != -9223372036854775807L ? j10 + jI0 : -9223372036854775807L;
            jI1 = q0.I0(atom.F(), 1000L, jF2);
            jF = atom.F();
            jA = j11;
        } else {
            if (iC != 1) {
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Skipping unsupported emsg version: ");
                sb2.append(iC);
                p.l(T, sb2.toString());
                return;
            }
            long jF3 = atom.F();
            jA = q0.I0(atom.I(), 1000000L, jF3);
            long jI2 = q0.I0(atom.F(), 1000L, jF3);
            long jF4 = atom.F();
            str = (String) androidx.media2.exoplayer.external.util.a.g(atom.x());
            str2 = (String) androidx.media2.exoplayer.external.util.a.g(atom.x());
            jI1 = jI2;
            jF = jF4;
            jI0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[atom.a()];
        atom.i(bArr, 0, atom.a());
        x xVar = new x(this.f54428o.a(new EventMessage(str3, str4, jI1, jF, bArr)));
        int iA = xVar.a();
        for (s sVar : this.K) {
            xVar.Q(0);
            sVar.d(xVar, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f54431r.addLast(new b(jI0, iA));
            this.f54439z += iA;
            return;
        }
        k0 k0Var = this.f54427n;
        if (k0Var != null) {
            jA = k0Var.a(jA);
        }
        long j12 = jA;
        for (s sVar2 : this.K) {
            sVar2.b(j12, 1, iA, 0, null);
        }
    }

    private void o(androidx.media2.exoplayer.external.extractor.mp4.a.b leaf, long inputPosition) throws androidx.media2.exoplayer.external.k0 {
        if (!this.f54430q.isEmpty()) {
            this.f54430q.peek().e(leaf);
            return;
        }
        int i10 = leaf.f54362a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                n(leaf.f54366m1);
            }
            return;
        }
        Pair<Long, androidx.media2.exoplayer.external.extractor.c> pairZ = z(leaf.f54366m1, inputPosition);
        this.C = ((Long) pairZ.first).longValue();
        this.J.q((q) pairZ.second);
        int i11 = 6 | 1;
        this.M = true;
    }

    private void p(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a moof) throws androidx.media2.exoplayer.external.k0 {
        t(moof, this.f54421h, this.f54417d, this.f54425l);
        DrmInitData drmInitDataG = this.f54420g != null ? null : g(moof.f54364n1);
        if (drmInitDataG != null) {
            int size = this.f54421h.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f54421h.valueAt(i10).j(drmInitDataG);
            }
        }
        if (this.A != -9223372036854775807L) {
            int size2 = this.f54421h.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f54421h.valueAt(i11).h(this.A);
            }
            this.A = -9223372036854775807L;
        }
    }

    private void q(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a moov) throws androidx.media2.exoplayer.external.k0 {
        int i10 = 0;
        androidx.media2.exoplayer.external.util.a.j(this.f54418e == null, "Unexpected moov box.");
        DrmInitData drmInitDataG = this.f54420g;
        if (drmInitDataG == null) {
            drmInitDataG = g(moov.f54364n1);
        }
        DrmInitData drmInitData = drmInitDataG;
        androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510aG = moov.g(1836475768);
        SparseArray<androidx.media2.exoplayer.external.extractor.mp4.c> sparseArray = new SparseArray<>();
        int size = c0510aG.f54364n1.size();
        long jS = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.media2.exoplayer.external.extractor.mp4.a.b bVar = c0510aG.f54364n1.get(i11);
            int i12 = bVar.f54362a;
            if (i12 == 1953654136) {
                Pair<Integer, androidx.media2.exoplayer.external.extractor.mp4.c> pairD = D(bVar.f54366m1);
                sparseArray.put(((Integer) pairD.first).intValue(), (androidx.media2.exoplayer.external.extractor.mp4.c) pairD.second);
            } else if (i12 == 1835362404) {
                jS = s(bVar.f54366m1);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = moov.f54365o1.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510a = moov.f54365o1.get(i13);
            if (c0510a.f54362a == 1953653099) {
                l lVarL = l(androidx.media2.exoplayer.external.extractor.mp4.b.v(c0510a, moov.h(1836476516), jS, drmInitData, (this.f54417d & 16) != 0, false));
                if (lVarL != null) {
                    sparseArray2.put(lVarL.f54514a, lVarL);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.f54421h.size() != 0) {
            androidx.media2.exoplayer.external.util.a.i(this.f54421h.size() == size3);
            while (i10 < size3) {
                l lVar = (l) sparseArray2.valueAt(i10);
                this.f54421h.get(lVar.f54514a).d(lVar, e(sparseArray, lVar.f54514a));
                i10++;
            }
            return;
        }
        while (i10 < size3) {
            l lVar2 = (l) sparseArray2.valueAt(i10);
            c cVar = new c(this.J.a(i10, lVar2.f54515b));
            cVar.d(lVar2, e(sparseArray, lVar2.f54514a));
            this.f54421h.put(lVar2.f54514a, cVar);
            this.B = Math.max(this.B, lVar2.f54518e);
            i10++;
        }
        k();
        this.J.l();
    }

    private void r(long sampleTimeUs) {
        while (!this.f54431r.isEmpty()) {
            b bVarRemoveFirst = this.f54431r.removeFirst();
            this.f54439z -= bVarRemoveFirst.f54441b;
            long jA = bVarRemoveFirst.f54440a + sampleTimeUs;
            k0 k0Var = this.f54427n;
            if (k0Var != null) {
                jA = k0Var.a(jA);
            }
            long j10 = jA;
            for (s sVar : this.K) {
                sVar.b(j10, 1, bVarRemoveFirst.f54441b, this.f54439z, null);
            }
        }
    }

    private static long s(x mehd) {
        mehd.Q(8);
        return androidx.media2.exoplayer.external.extractor.mp4.a.c(mehd.l()) == 0 ? mehd.F() : mehd.I();
    }

    private static void t(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a moof, SparseArray<c> trackBundleArray, int flags, byte[] extendedTypeScratch) throws androidx.media2.exoplayer.external.k0 {
        int size = moof.f54365o1.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510a = moof.f54365o1.get(i10);
            if (c0510a.f54362a == 1953653094) {
                C(c0510a, trackBundleArray, flags, extendedTypeScratch);
            }
        }
    }

    private static void u(x saio, n out) throws androidx.media2.exoplayer.external.k0 {
        saio.Q(8);
        int iL = saio.l();
        if ((androidx.media2.exoplayer.external.extractor.mp4.a.b(iL) & 1) == 1) {
            saio.R(8);
        }
        int iH = saio.H();
        if (iH == 1) {
            out.f54534d += androidx.media2.exoplayer.external.extractor.mp4.a.c(iL) == 0 ? saio.F() : saio.I();
        } else {
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Unexpected saio entry count: ");
            sb2.append(iH);
            throw new androidx.media2.exoplayer.external.k0(sb2.toString());
        }
    }

    private static void v(m encryptionBox, x saiz, n out) throws androidx.media2.exoplayer.external.k0 {
        int i10;
        int i11 = encryptionBox.f54529d;
        saiz.Q(8);
        if ((androidx.media2.exoplayer.external.extractor.mp4.a.b(saiz.l()) & 1) == 1) {
            saiz.R(8);
        }
        int iD = saiz.D();
        int iH = saiz.H();
        if (iH != out.f54536f) {
            int i12 = out.f54536f;
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Length mismatch: ");
            sb2.append(iH);
            sb2.append(", ");
            sb2.append(i12);
            throw new androidx.media2.exoplayer.external.k0(sb2.toString());
        }
        if (iD == 0) {
            boolean[] zArr = out.f54544n;
            i10 = 0;
            for (int i13 = 0; i13 < iH; i13++) {
                int iD2 = saiz.D();
                i10 += iD2;
                zArr[i13] = iD2 > i11;
            }
        } else {
            i10 = iD * iH;
            Arrays.fill(out.f54544n, 0, iH, iD > i11);
        }
        out.d(i10);
    }

    private static void w(x senc, int offset, n out) throws androidx.media2.exoplayer.external.k0 {
        senc.Q(offset + 8);
        int iB = androidx.media2.exoplayer.external.extractor.mp4.a.b(senc.l());
        if ((iB & 1) != 0) {
            throw new androidx.media2.exoplayer.external.k0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iH = senc.H();
        if (iH == out.f54536f) {
            Arrays.fill(out.f54544n, 0, iH, z10);
            out.d(senc.a());
            out.b(senc);
        } else {
            int i10 = out.f54536f;
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Length mismatch: ");
            sb2.append(iH);
            sb2.append(", ");
            sb2.append(i10);
            throw new androidx.media2.exoplayer.external.k0(sb2.toString());
        }
    }

    private static void x(x senc, n out) throws androidx.media2.exoplayer.external.k0 {
        w(senc, 0, out);
    }

    private static void y(x sbgp, x sgpd, String schemeType, n out) throws androidx.media2.exoplayer.external.k0 {
        byte[] bArr;
        sbgp.Q(8);
        int iL = sbgp.l();
        if (sbgp.l() != U) {
            return;
        }
        if (androidx.media2.exoplayer.external.extractor.mp4.a.c(iL) == 1) {
            sbgp.R(4);
        }
        if (sbgp.l() != 1) {
            throw new androidx.media2.exoplayer.external.k0("Entry count in sbgp != 1 (unsupported).");
        }
        sgpd.Q(8);
        int iL2 = sgpd.l();
        if (sgpd.l() != U) {
            return;
        }
        int iC = androidx.media2.exoplayer.external.extractor.mp4.a.c(iL2);
        if (iC == 1) {
            if (sgpd.F() == 0) {
                throw new androidx.media2.exoplayer.external.k0("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC >= 2) {
            sgpd.R(4);
        }
        if (sgpd.F() != 1) {
            throw new androidx.media2.exoplayer.external.k0("Entry count in sgpd != 1 (unsupported).");
        }
        sgpd.R(1);
        int iD = sgpd.D();
        int i10 = (iD & 240) >> 4;
        int i11 = iD & 15;
        boolean z10 = sgpd.D() == 1;
        if (z10) {
            int iD2 = sgpd.D();
            byte[] bArr2 = new byte[16];
            sgpd.i(bArr2, 0, 16);
            if (iD2 == 0) {
                int iD3 = sgpd.D();
                bArr = new byte[iD3];
                sgpd.i(bArr, 0, iD3);
            } else {
                bArr = null;
            }
            byte[] bArr3 = bArr;
            out.f54543m = true;
            out.f54545o = new m(z10, schemeType, iD2, bArr2, i10, i11, bArr3);
        }
    }

    private static Pair<Long, androidx.media2.exoplayer.external.extractor.c> z(x atom, long inputPosition) throws androidx.media2.exoplayer.external.k0 {
        long jI;
        long jI2;
        atom.Q(8);
        int iC = androidx.media2.exoplayer.external.extractor.mp4.a.c(atom.l());
        atom.R(4);
        long jF = atom.F();
        if (iC == 0) {
            jI = atom.F();
            jI2 = atom.F();
        } else {
            jI = atom.I();
            jI2 = atom.I();
        }
        long j10 = inputPosition + jI2;
        long jI0 = q0.I0(jI, 1000000L, jF);
        atom.R(2);
        int iJ = atom.J();
        int[] iArr = new int[iJ];
        long[] jArr = new long[iJ];
        long[] jArr2 = new long[iJ];
        long[] jArr3 = new long[iJ];
        long j11 = j10;
        long jI1 = jI0;
        int i10 = 0;
        while (i10 < iJ) {
            int iL = atom.l();
            if ((Integer.MIN_VALUE & iL) != 0) {
                throw new androidx.media2.exoplayer.external.k0("Unhandled indirect reference");
            }
            long jF2 = atom.F();
            iArr[i10] = iL & Integer.MAX_VALUE;
            jArr[i10] = j11;
            jArr3[i10] = jI1;
            jI += jF2;
            long[] jArr4 = jArr3;
            jI1 = q0.I0(jI, 1000000L, jF);
            jArr2[i10] = jI1 - jArr4[i10];
            atom.R(4);
            j11 += (long) iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jI0), new androidx.media2.exoplayer.external.extractor.c(iArr, jArr, jArr2, jArr3));
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        int size = this.f54421h.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f54421h.valueAt(i10).g();
        }
        this.f54431r.clear();
        this.f54439z = 0;
        this.A = timeUs;
        this.f54430q.clear();
        this.I = false;
        d();
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        return k.b(input);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(androidx.media2.exoplayer.external.extractor.k output) {
        this.J = output;
        l lVar = this.f54418e;
        if (lVar != null) {
            c cVar = new c(output.a(0, lVar.f54515b));
            cVar.d(this.f54418e, new androidx.media2.exoplayer.external.extractor.mp4.c(0, 0, 0, 0));
            this.f54421h.put(0, cVar);
            k();
            this.J.l();
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.p seekPosition) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.f54433t;
            if (i10 != 0) {
                if (i10 == 1) {
                    J(input);
                } else if (i10 == 2) {
                    K(input);
                } else if (L(input)) {
                    return 0;
                }
            } else if (!I(input)) {
                int i11 = 3 ^ (-1);
                return -1;
            }
        }
    }

    @p0
    protected l l(@p0 l track) {
        return track;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }

    public f(int flags) {
        this(flags, null);
    }

    public f(int flags, @p0 k0 timestampAdjuster) {
        this(flags, timestampAdjuster, null, null);
    }

    public f(int flags, @p0 k0 timestampAdjuster, @p0 l sideloadedTrack, @p0 DrmInitData sideloadedDrmInitData) {
        this(flags, timestampAdjuster, sideloadedTrack, sideloadedDrmInitData, Collections.EMPTY_LIST);
    }

    public f(int flags, @p0 k0 timestampAdjuster, @p0 l sideloadedTrack, @p0 DrmInitData sideloadedDrmInitData, List<Format> closedCaptionFormats) {
        this(flags, timestampAdjuster, sideloadedTrack, sideloadedDrmInitData, closedCaptionFormats, null);
    }

    public f(int flags, @p0 k0 timestampAdjuster, @p0 l sideloadedTrack, @p0 DrmInitData sideloadedDrmInitData, List<Format> closedCaptionFormats, @p0 s additionalEmsgTrackOutput) {
        this.f54417d = flags | (sideloadedTrack != null ? 8 : 0);
        this.f54427n = timestampAdjuster;
        this.f54418e = sideloadedTrack;
        this.f54420g = sideloadedDrmInitData;
        this.f54419f = Collections.unmodifiableList(closedCaptionFormats);
        this.f54432s = additionalEmsgTrackOutput;
        this.f54428o = new androidx.media2.exoplayer.external.metadata.emsg.b();
        this.f54429p = new x(16);
        this.f54422i = new x(t.f57686b);
        this.f54423j = new x(5);
        this.f54424k = new x();
        byte[] bArr = new byte[16];
        this.f54425l = bArr;
        this.f54426m = new x(bArr);
        this.f54430q = new ArrayDeque<>();
        this.f54431r = new ArrayDeque<>();
        this.f54421h = new SparseArray<>();
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = -9223372036854775807L;
        d();
    }
}
