package androidx.compose.ui.text;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class y3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42349e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c3 f42351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t0 f42352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final a1 f42353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f42348d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final y3 f42350f = new y3(0, 0, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0, (androidx.compose.ui.text.style.s) null, (a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 16777215, (DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final y3 a() {
            return y3.f42350f;
        }

        private a() {
        }
    }

    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, iVar, i10, i11, j14, sVar, a1Var, hVar, i12, i13, uVar);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void C() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void G() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void Q() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void U() {
    }

    public static /* synthetic */ y3 c(y3 y3Var, long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, int i10, Object obj) {
        androidx.compose.ui.text.style.e eVarD;
        androidx.compose.ui.text.style.f fVar3;
        long jM = (i10 & 1) != 0 ? y3Var.f42351a.m() : j10;
        long jQ = (i10 & 2) != 0 ? y3Var.f42351a.q() : j11;
        androidx.compose.ui.text.font.v0 v0VarT = (i10 & 4) != 0 ? y3Var.f42351a.t() : v0Var;
        androidx.compose.ui.text.font.q0 q0VarR = (i10 & 8) != 0 ? y3Var.f42351a.r() : q0Var;
        androidx.compose.ui.text.font.r0 r0VarS = (i10 & 16) != 0 ? y3Var.f42351a.s() : r0Var;
        androidx.compose.ui.text.font.y yVarO = (i10 & 32) != 0 ? y3Var.f42351a.o() : yVar;
        String strP = (i10 & 64) != 0 ? y3Var.f42351a.p() : str;
        long jU = (i10 & 128) != 0 ? y3Var.f42351a.u() : j12;
        androidx.compose.ui.text.style.a aVarK = (i10 & 256) != 0 ? y3Var.f42351a.k() : aVar;
        androidx.compose.ui.text.style.q qVarA = (i10 & 512) != 0 ? y3Var.f42351a.A() : qVar;
        y0.f fVarV = (i10 & 1024) != 0 ? y3Var.f42351a.v() : fVar;
        long j15 = jM;
        long j16 = (i10 & 2048) != 0 ? y3Var.f42351a.j() : j13;
        androidx.compose.ui.text.style.k kVarY = (i10 & 4096) != 0 ? y3Var.f42351a.y() : kVar;
        androidx.compose.ui.graphics.o3 o3VarX = (i10 & 8192) != 0 ? y3Var.f42351a.x() : o3Var;
        androidx.compose.ui.text.style.k kVar2 = kVarY;
        androidx.compose.ui.text.style.j jVarH = (i10 & 16384) != 0 ? androidx.compose.ui.text.style.j.h(y3Var.f42352b.v()) : jVar;
        androidx.compose.ui.text.style.l lVarG = (i10 & 32768) != 0 ? androidx.compose.ui.text.style.l.g(y3Var.f42352b.y()) : lVar;
        long jQ2 = (i10 & 65536) != 0 ? y3Var.f42352b.q() : j14;
        androidx.compose.ui.text.style.s sVarZ = (i10 & 131072) != 0 ? y3Var.f42352b.z() : sVar;
        a1 a1Var2 = (i10 & 262144) != 0 ? y3Var.f42353c : a1Var;
        androidx.compose.ui.text.style.h hVarR = (i10 & 524288) != 0 ? y3Var.f42352b.r() : hVar;
        androidx.compose.ui.text.style.f fVarE = (i10 & 1048576) != 0 ? androidx.compose.ui.text.style.f.e(y3Var.f42352b.p()) : fVar2;
        if ((i10 & 2097152) != 0) {
            fVar3 = fVarE;
            eVarD = androidx.compose.ui.text.style.e.d(y3Var.f42352b.m());
        } else {
            eVarD = eVar;
            fVar3 = fVarE;
        }
        return y3Var.b(j15, jQ, v0VarT, q0VarR, r0VarS, yVarO, strP, jU, aVarK, qVarA, fVarV, j16, kVar2, o3VarX, jVarH, lVarG, jQ2, sVarZ, a1Var2, hVarR, fVar3, eVarD);
    }

    public static /* synthetic */ y3 e(y3 y3Var, long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, int i10, Object obj) {
        long jM = (i10 & 1) != 0 ? y3Var.f42351a.m() : j10;
        return y3Var.d(jM, (i10 & 2) != 0 ? y3Var.f42351a.q() : j11, (i10 & 4) != 0 ? y3Var.f42351a.t() : v0Var, (i10 & 8) != 0 ? y3Var.f42351a.r() : q0Var, (i10 & 16) != 0 ? y3Var.f42351a.s() : r0Var, (i10 & 32) != 0 ? y3Var.f42351a.o() : yVar, (i10 & 64) != 0 ? y3Var.f42351a.p() : str, (i10 & 128) != 0 ? y3Var.f42351a.u() : j12, (i10 & 256) != 0 ? y3Var.f42351a.k() : aVar, (i10 & 512) != 0 ? y3Var.f42351a.A() : qVar, (i10 & 1024) != 0 ? y3Var.f42351a.v() : fVar, (i10 & 2048) != 0 ? y3Var.f42351a.j() : j13, (i10 & 4096) != 0 ? y3Var.f42351a.y() : kVar, (i10 & 8192) != 0 ? y3Var.f42351a.x() : o3Var, (i10 & 16384) != 0 ? androidx.compose.ui.text.style.j.h(y3Var.f42352b.v()) : jVar, (i10 & 32768) != 0 ? androidx.compose.ui.text.style.l.g(y3Var.f42352b.y()) : lVar, (i10 & 65536) != 0 ? y3Var.f42352b.q() : j14, (i10 & 131072) != 0 ? y3Var.f42352b.z() : sVar);
    }

    public static /* synthetic */ y3 f0(y3 y3Var, y3 y3Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y3Var2 = null;
        }
        return y3Var.e0(y3Var2);
    }

    public static /* synthetic */ y3 g(y3 y3Var, long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i10, Object obj) {
        androidx.compose.ui.text.style.h hVarR;
        a1 a1Var2;
        long jM = (i10 & 1) != 0 ? y3Var.f42351a.m() : j10;
        long jQ = (i10 & 2) != 0 ? y3Var.f42351a.q() : j11;
        androidx.compose.ui.text.font.v0 v0VarT = (i10 & 4) != 0 ? y3Var.f42351a.t() : v0Var;
        androidx.compose.ui.text.font.q0 q0VarR = (i10 & 8) != 0 ? y3Var.f42351a.r() : q0Var;
        androidx.compose.ui.text.font.r0 r0VarS = (i10 & 16) != 0 ? y3Var.f42351a.s() : r0Var;
        androidx.compose.ui.text.font.y yVarO = (i10 & 32) != 0 ? y3Var.f42351a.o() : yVar;
        String strP = (i10 & 64) != 0 ? y3Var.f42351a.p() : str;
        long jU = (i10 & 128) != 0 ? y3Var.f42351a.u() : j12;
        androidx.compose.ui.text.style.a aVarK = (i10 & 256) != 0 ? y3Var.f42351a.k() : aVar;
        androidx.compose.ui.text.style.q qVarA = (i10 & 512) != 0 ? y3Var.f42351a.A() : qVar;
        y0.f fVarV = (i10 & 1024) != 0 ? y3Var.f42351a.v() : fVar;
        long j15 = jM;
        long j16 = (i10 & 2048) != 0 ? y3Var.f42351a.j() : j13;
        androidx.compose.ui.text.style.k kVarY = (i10 & 4096) != 0 ? y3Var.f42351a.y() : kVar;
        androidx.compose.ui.graphics.o3 o3VarX = (i10 & 8192) != 0 ? y3Var.f42351a.x() : o3Var;
        androidx.compose.ui.text.style.k kVar2 = kVarY;
        androidx.compose.ui.text.style.j jVarH = (i10 & 16384) != 0 ? androidx.compose.ui.text.style.j.h(y3Var.f42352b.v()) : jVar;
        androidx.compose.ui.text.style.l lVarG = (i10 & 32768) != 0 ? androidx.compose.ui.text.style.l.g(y3Var.f42352b.y()) : lVar;
        long jQ2 = (i10 & 65536) != 0 ? y3Var.f42352b.q() : j14;
        androidx.compose.ui.text.style.s sVarZ = (i10 & 131072) != 0 ? y3Var.f42352b.z() : sVar;
        a1 a1Var3 = (i10 & 262144) != 0 ? y3Var.f42353c : a1Var;
        if ((i10 & 524288) != 0) {
            a1Var2 = a1Var3;
            hVarR = y3Var.f42352b.r();
        } else {
            hVarR = hVar;
            a1Var2 = a1Var3;
        }
        return y3Var.f(j15, jQ, v0VarT, q0VarR, r0VarS, yVarO, strP, jU, aVarK, qVarA, fVarV, j16, kVar2, o3VarX, jVarH, lVarG, jQ2, sVarZ, a1Var2, hVarR);
    }

    public static /* synthetic */ y3 i(y3 y3Var, androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, int i14, Object obj) {
        androidx.compose.ui.text.style.u uVarA;
        int i15;
        float fI = (i14 & 2) != 0 ? y3Var.f42351a.i() : f10;
        long jQ = (i14 & 4) != 0 ? y3Var.f42351a.q() : j10;
        androidx.compose.ui.text.font.v0 v0VarT = (i14 & 8) != 0 ? y3Var.f42351a.t() : v0Var;
        androidx.compose.ui.text.font.q0 q0VarR = (i14 & 16) != 0 ? y3Var.f42351a.r() : q0Var;
        androidx.compose.ui.text.font.r0 r0VarS = (i14 & 32) != 0 ? y3Var.f42351a.s() : r0Var;
        androidx.compose.ui.text.font.y yVarO = (i14 & 64) != 0 ? y3Var.f42351a.o() : yVar;
        String strP = (i14 & 128) != 0 ? y3Var.f42351a.p() : str;
        long jU = (i14 & 256) != 0 ? y3Var.f42351a.u() : j11;
        androidx.compose.ui.text.style.a aVarK = (i14 & 512) != 0 ? y3Var.f42351a.k() : aVar;
        androidx.compose.ui.text.style.q qVarA = (i14 & 1024) != 0 ? y3Var.f42351a.A() : qVar;
        y0.f fVarV = (i14 & 2048) != 0 ? y3Var.f42351a.v() : fVar;
        long j14 = (i14 & 4096) != 0 ? y3Var.f42351a.j() : j12;
        float f11 = fI;
        androidx.compose.ui.text.style.k kVarY = (i14 & 8192) != 0 ? y3Var.f42351a.y() : kVar;
        androidx.compose.ui.graphics.o3 o3VarX = (i14 & 16384) != 0 ? y3Var.f42351a.x() : o3Var;
        androidx.compose.ui.graphics.drawscope.i iVarN = (i14 & 32768) != 0 ? y3Var.f42351a.n() : iVar;
        int iV = (i14 & 65536) != 0 ? y3Var.f42352b.v() : i10;
        int iY = (i14 & 131072) != 0 ? y3Var.f42352b.y() : i11;
        long jQ2 = (i14 & 262144) != 0 ? y3Var.f42352b.q() : j13;
        androidx.compose.ui.text.style.s sVarZ = (i14 & 524288) != 0 ? y3Var.f42352b.z() : sVar;
        a1 a1Var2 = (i14 & 1048576) != 0 ? y3Var.f42353c : a1Var;
        androidx.compose.ui.text.style.h hVarR = (i14 & 2097152) != 0 ? y3Var.f42352b.r() : hVar;
        int iP = (i14 & 4194304) != 0 ? y3Var.f42352b.p() : i12;
        int iM = (i14 & 8388608) != 0 ? y3Var.f42352b.m() : i13;
        if ((i14 & 16777216) != 0) {
            i15 = iM;
            uVarA = y3Var.f42352b.A();
        } else {
            uVarA = uVar;
            i15 = iM;
        }
        return y3Var.h(i0Var, f11, jQ, v0VarT, q0VarR, r0VarS, yVarO, strP, jU, aVarK, qVarA, fVarV, j14, kVarY, o3VarX, iVarN, iV, iY, jQ2, sVarZ, a1Var2, hVarR, iP, i15, uVarA);
    }

    public static /* synthetic */ y3 k(y3 y3Var, androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, int i10, Object obj) {
        androidx.compose.ui.text.style.u uVarA;
        androidx.compose.ui.text.style.e eVar2;
        float fI = (i10 & 2) != 0 ? y3Var.f42351a.i() : f10;
        long jQ = (i10 & 4) != 0 ? y3Var.f42351a.q() : j10;
        androidx.compose.ui.text.font.v0 v0VarT = (i10 & 8) != 0 ? y3Var.f42351a.t() : v0Var;
        androidx.compose.ui.text.font.q0 q0VarR = (i10 & 16) != 0 ? y3Var.f42351a.r() : q0Var;
        androidx.compose.ui.text.font.r0 r0VarS = (i10 & 32) != 0 ? y3Var.f42351a.s() : r0Var;
        androidx.compose.ui.text.font.y yVarO = (i10 & 64) != 0 ? y3Var.f42351a.o() : yVar;
        String strP = (i10 & 128) != 0 ? y3Var.f42351a.p() : str;
        long jU = (i10 & 256) != 0 ? y3Var.f42351a.u() : j11;
        androidx.compose.ui.text.style.a aVarK = (i10 & 512) != 0 ? y3Var.f42351a.k() : aVar;
        androidx.compose.ui.text.style.q qVarA = (i10 & 1024) != 0 ? y3Var.f42351a.A() : qVar;
        y0.f fVarV = (i10 & 2048) != 0 ? y3Var.f42351a.v() : fVar;
        long j14 = (i10 & 4096) != 0 ? y3Var.f42351a.j() : j12;
        float f11 = fI;
        androidx.compose.ui.text.style.k kVarY = (i10 & 8192) != 0 ? y3Var.f42351a.y() : kVar;
        androidx.compose.ui.graphics.o3 o3VarX = (i10 & 16384) != 0 ? y3Var.f42351a.x() : o3Var;
        androidx.compose.ui.graphics.drawscope.i iVarN = (i10 & 32768) != 0 ? y3Var.f42351a.n() : iVar;
        androidx.compose.ui.text.style.j jVarH = (i10 & 65536) != 0 ? androidx.compose.ui.text.style.j.h(y3Var.f42352b.v()) : jVar;
        androidx.compose.ui.text.style.l lVarG = (i10 & 131072) != 0 ? androidx.compose.ui.text.style.l.g(y3Var.f42352b.y()) : lVar;
        long jQ2 = (i10 & 262144) != 0 ? y3Var.f42352b.q() : j13;
        androidx.compose.ui.text.style.s sVarZ = (i10 & 524288) != 0 ? y3Var.f42352b.z() : sVar;
        a1 a1Var2 = (i10 & 1048576) != 0 ? y3Var.f42353c : a1Var;
        androidx.compose.ui.text.style.h hVarR = (i10 & 2097152) != 0 ? y3Var.f42352b.r() : hVar;
        androidx.compose.ui.text.style.f fVarE = (i10 & 4194304) != 0 ? androidx.compose.ui.text.style.f.e(y3Var.f42352b.p()) : fVar2;
        androidx.compose.ui.text.style.e eVarD = (i10 & 8388608) != 0 ? androidx.compose.ui.text.style.e.d(y3Var.f42352b.m()) : eVar;
        if ((i10 & 16777216) != 0) {
            eVar2 = eVarD;
            uVarA = y3Var.f42352b.A();
        } else {
            uVarA = uVar;
            eVar2 = eVarD;
        }
        return y3Var.j(i0Var, f11, jQ, v0VarT, q0VarR, r0VarS, yVarO, strP, jU, aVarK, qVarA, fVarV, j14, kVarY, o3VarX, iVarN, jVarH, lVarG, jQ2, sVarZ, a1Var2, hVarR, fVarE, eVar2, uVarA);
    }

    public static /* synthetic */ y3 m(y3 y3Var, long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, int i14, Object obj) {
        androidx.compose.ui.text.style.u uVarA;
        int i15;
        long jM = (i14 & 1) != 0 ? y3Var.f42351a.m() : j10;
        long jQ = (i14 & 2) != 0 ? y3Var.f42351a.q() : j11;
        androidx.compose.ui.text.font.v0 v0VarT = (i14 & 4) != 0 ? y3Var.f42351a.t() : v0Var;
        androidx.compose.ui.text.font.q0 q0VarR = (i14 & 8) != 0 ? y3Var.f42351a.r() : q0Var;
        androidx.compose.ui.text.font.r0 r0VarS = (i14 & 16) != 0 ? y3Var.f42351a.s() : r0Var;
        androidx.compose.ui.text.font.y yVarO = (i14 & 32) != 0 ? y3Var.f42351a.o() : yVar;
        String strP = (i14 & 64) != 0 ? y3Var.f42351a.p() : str;
        long jU = (i14 & 128) != 0 ? y3Var.f42351a.u() : j12;
        androidx.compose.ui.text.style.a aVarK = (i14 & 256) != 0 ? y3Var.f42351a.k() : aVar;
        androidx.compose.ui.text.style.q qVarA = (i14 & 512) != 0 ? y3Var.f42351a.A() : qVar;
        y0.f fVarV = (i14 & 1024) != 0 ? y3Var.f42351a.v() : fVar;
        long j15 = jM;
        long j16 = (i14 & 2048) != 0 ? y3Var.f42351a.j() : j13;
        androidx.compose.ui.text.style.k kVarY = (i14 & 4096) != 0 ? y3Var.f42351a.y() : kVar;
        androidx.compose.ui.graphics.o3 o3VarX = (i14 & 8192) != 0 ? y3Var.f42351a.x() : o3Var;
        androidx.compose.ui.text.style.k kVar2 = kVarY;
        androidx.compose.ui.graphics.drawscope.i iVarN = (i14 & 16384) != 0 ? y3Var.f42351a.n() : iVar;
        int iV = (i14 & 32768) != 0 ? y3Var.f42352b.v() : i10;
        int iY = (i14 & 65536) != 0 ? y3Var.f42352b.y() : i11;
        long jQ2 = (i14 & 131072) != 0 ? y3Var.f42352b.q() : j14;
        androidx.compose.ui.text.style.s sVarZ = (i14 & 262144) != 0 ? y3Var.f42352b.z() : sVar;
        a1 a1Var2 = (i14 & 524288) != 0 ? y3Var.f42353c : a1Var;
        androidx.compose.ui.text.style.h hVarR = (i14 & 1048576) != 0 ? y3Var.f42352b.r() : hVar;
        int iP = (i14 & 2097152) != 0 ? y3Var.f42352b.p() : i12;
        int iM = (i14 & 4194304) != 0 ? y3Var.f42352b.m() : i13;
        if ((i14 & 8388608) != 0) {
            i15 = iM;
            uVarA = y3Var.f42352b.A();
        } else {
            uVarA = uVar;
            i15 = iM;
        }
        return y3Var.l(j15, jQ, v0VarT, q0VarR, r0VarS, yVarO, strP, jU, aVarK, qVarA, fVarV, j16, kVar2, o3VarX, iVarN, iV, iY, jQ2, sVarZ, a1Var2, hVarR, iP, i15, uVarA);
    }

    public static /* synthetic */ y3 o(y3 y3Var, long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, int i10, Object obj) {
        androidx.compose.ui.text.style.u uVarA;
        androidx.compose.ui.text.style.e eVar2;
        long jM = (i10 & 1) != 0 ? y3Var.f42351a.m() : j10;
        long jQ = (i10 & 2) != 0 ? y3Var.f42351a.q() : j11;
        androidx.compose.ui.text.font.v0 v0VarT = (i10 & 4) != 0 ? y3Var.f42351a.t() : v0Var;
        androidx.compose.ui.text.font.q0 q0VarR = (i10 & 8) != 0 ? y3Var.f42351a.r() : q0Var;
        androidx.compose.ui.text.font.r0 r0VarS = (i10 & 16) != 0 ? y3Var.f42351a.s() : r0Var;
        androidx.compose.ui.text.font.y yVarO = (i10 & 32) != 0 ? y3Var.f42351a.o() : yVar;
        String strP = (i10 & 64) != 0 ? y3Var.f42351a.p() : str;
        long jU = (i10 & 128) != 0 ? y3Var.f42351a.u() : j12;
        androidx.compose.ui.text.style.a aVarK = (i10 & 256) != 0 ? y3Var.f42351a.k() : aVar;
        androidx.compose.ui.text.style.q qVarA = (i10 & 512) != 0 ? y3Var.f42351a.A() : qVar;
        y0.f fVarV = (i10 & 1024) != 0 ? y3Var.f42351a.v() : fVar;
        long j15 = jM;
        long j16 = (i10 & 2048) != 0 ? y3Var.f42351a.j() : j13;
        androidx.compose.ui.text.style.k kVarY = (i10 & 4096) != 0 ? y3Var.f42351a.y() : kVar;
        androidx.compose.ui.graphics.o3 o3VarX = (i10 & 8192) != 0 ? y3Var.f42351a.x() : o3Var;
        androidx.compose.ui.text.style.k kVar2 = kVarY;
        androidx.compose.ui.graphics.drawscope.i iVarN = (i10 & 16384) != 0 ? y3Var.f42351a.n() : iVar;
        androidx.compose.ui.text.style.j jVarH = (i10 & 32768) != 0 ? androidx.compose.ui.text.style.j.h(y3Var.f42352b.v()) : jVar;
        androidx.compose.ui.text.style.l lVarG = (i10 & 65536) != 0 ? androidx.compose.ui.text.style.l.g(y3Var.f42352b.y()) : lVar;
        long jQ2 = (i10 & 131072) != 0 ? y3Var.f42352b.q() : j14;
        androidx.compose.ui.text.style.s sVarZ = (i10 & 262144) != 0 ? y3Var.f42352b.z() : sVar;
        a1 a1Var2 = (i10 & 524288) != 0 ? y3Var.f42353c : a1Var;
        androidx.compose.ui.text.style.h hVarR = (i10 & 1048576) != 0 ? y3Var.f42352b.r() : hVar;
        androidx.compose.ui.text.style.f fVarE = (i10 & 2097152) != 0 ? androidx.compose.ui.text.style.f.e(y3Var.f42352b.p()) : fVar2;
        androidx.compose.ui.text.style.e eVarD = (i10 & 4194304) != 0 ? androidx.compose.ui.text.style.e.d(y3Var.f42352b.m()) : eVar;
        if ((i10 & 8388608) != 0) {
            eVar2 = eVarD;
            uVarA = y3Var.f42352b.A();
        } else {
            uVarA = uVar;
            eVar2 = eVarD;
        }
        return y3Var.n(j15, jQ, v0VarT, q0VarR, r0VarS, yVarO, strP, jU, aVarK, qVarA, fVarV, j16, kVar2, o3VarX, iVarN, jVarH, lVarG, jQ2, sVarZ, a1Var2, hVarR, fVarE, eVar2, uVarA);
    }

    @Nullable
    public final androidx.compose.ui.text.font.v0 A() {
        return this.f42351a.t();
    }

    @oj.i(name = "getHyphens-EaSxIns")
    @Nullable
    public final androidx.compose.ui.text.style.e B() {
        return androidx.compose.ui.text.style.e.d(D());
    }

    public final int D() {
        return this.f42352b.m();
    }

    public final long E() {
        return this.f42351a.u();
    }

    @oj.i(name = "getLineBreak-LgCVezo")
    @Nullable
    public final androidx.compose.ui.text.style.f F() {
        return androidx.compose.ui.text.style.f.e(H());
    }

    public final int H() {
        return this.f42352b.p();
    }

    public final long I() {
        return this.f42352b.q();
    }

    @Nullable
    public final androidx.compose.ui.text.style.h J() {
        return this.f42352b.r();
    }

    @Nullable
    public final y0.f K() {
        return this.f42351a.v();
    }

    @NotNull
    public final t0 L() {
        return this.f42352b;
    }

    @Nullable
    public final a1 M() {
        return this.f42353c;
    }

    @Nullable
    public final androidx.compose.ui.graphics.o3 N() {
        return this.f42351a.x();
    }

    @NotNull
    public final c3 O() {
        return this.f42351a;
    }

    @oj.i(name = "getTextAlign-buA522U")
    @Nullable
    public final androidx.compose.ui.text.style.j P() {
        return androidx.compose.ui.text.style.j.h(R());
    }

    public final int R() {
        return this.f42352b.v();
    }

    @Nullable
    public final androidx.compose.ui.text.style.k S() {
        return this.f42351a.y();
    }

    @oj.i(name = "getTextDirection-mmuk1to")
    @Nullable
    public final androidx.compose.ui.text.style.l T() {
        return androidx.compose.ui.text.style.l.g(V());
    }

    public final int V() {
        return this.f42352b.y();
    }

    @Nullable
    public final androidx.compose.ui.text.style.q W() {
        return this.f42351a.A();
    }

    @Nullable
    public final androidx.compose.ui.text.style.s X() {
        return this.f42352b.z();
    }

    @Nullable
    public final androidx.compose.ui.text.style.u Y() {
        return this.f42352b.A();
    }

    public final boolean Z(@NotNull y3 y3Var) {
        return this == y3Var || this.f42351a.C(y3Var.f42351a);
    }

    public final boolean a0(@NotNull y3 y3Var) {
        return this == y3Var || (Intrinsics.areEqual(this.f42352b, y3Var.f42352b) && this.f42351a.B(y3Var.f42351a));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    public final /* synthetic */ y3 b(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar) {
        return new y3(new c3(androidx.compose.ui.graphics.q0.y(j10, this.f42351a.m()) ? this.f42351a.z() : androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, u(), (DefaultConstructorMarker) null), new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j14, sVar, a1Var != null ? a1Var.a() : null, hVar, fVar2 != null ? fVar2.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), Y(), (DefaultConstructorMarker) null), a1Var);
    }

    public final int b0() {
        int iD = ((this.f42351a.D() * 31) + this.f42352b.hashCode()) * 31;
        a1 a1Var = this.f42353c;
        return iD + (a1Var != null ? a1Var.hashCode() : 0);
    }

    @k7
    @NotNull
    public final y3 c0(@NotNull t0 t0Var) {
        return new y3(o0(), n0().B(t0Var));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final /* synthetic */ y3 d(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar) {
        return new y3(new c3(androidx.compose.ui.graphics.q0.y(j10, this.f42351a.m()) ? this.f42351a.z() : androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, this.f42351a.w(), this.f42351a.n(), (DefaultConstructorMarker) null), new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j14, sVar, this.f42352b.s(), J(), H(), D(), Y(), (DefaultConstructorMarker) null), this.f42353c);
    }

    @k7
    @NotNull
    public final y3 d0(@NotNull c3 c3Var) {
        return new y3(o0().E(c3Var), n0());
    }

    @k7
    @NotNull
    public final y3 e0(@Nullable y3 y3Var) {
        if (y3Var != null && !Intrinsics.areEqual(y3Var, f42350f)) {
            return new y3(o0().E(y3Var.o0()), n0().B(y3Var.n0()));
        }
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return Intrinsics.areEqual(this.f42351a, y3Var.f42351a) && Intrinsics.areEqual(this.f42352b, y3Var.f42352b) && Intrinsics.areEqual(this.f42353c, y3Var.f42353c);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final /* synthetic */ y3 f(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar) {
        return new y3(new c3(androidx.compose.ui.graphics.q0.y(j10, this.f42351a.m()) ? this.f42351a.z() : androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, this.f42351a.n(), (DefaultConstructorMarker) null), new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j14, sVar, a1Var != null ? a1Var.a() : null, hVar, H(), D(), Y(), (DefaultConstructorMarker) null), a1Var);
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final /* synthetic */ y3 g0(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, a1 a1Var, androidx.compose.ui.text.style.u uVar) {
        c3 c3VarB = e3.b(this.f42351a, j10, null, Float.NaN, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar);
        t0 t0VarA = u0.a(this.f42352b, jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j14, sVar, a1Var != null ? a1Var.a() : null, hVar, fVar2 != null ? fVar2.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), uVar);
        return (this.f42351a == c3VarB && this.f42352b == t0VarA) ? this : new y3(c3VarB, t0VarA);
    }

    @NotNull
    public final y3 h(@Nullable androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, @Nullable androidx.compose.ui.text.font.v0 v0Var, @Nullable androidx.compose.ui.text.font.q0 q0Var, @Nullable androidx.compose.ui.text.font.r0 r0Var, @Nullable androidx.compose.ui.text.font.y yVar, @Nullable String str, long j11, @Nullable androidx.compose.ui.text.style.a aVar, @Nullable androidx.compose.ui.text.style.q qVar, @Nullable y0.f fVar, long j12, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j13, @Nullable androidx.compose.ui.text.style.s sVar, @Nullable a1 a1Var, @Nullable androidx.compose.ui.text.style.h hVar, int i12, int i13, @Nullable androidx.compose.ui.text.style.u uVar) {
        return new y3(new c3(i0Var, f10, j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar, (DefaultConstructorMarker) null), new t0(i10, i11, j13, sVar, a1Var != null ? a1Var.a() : null, hVar, i12, i13, uVar, (DefaultConstructorMarker) null), a1Var);
    }

    public int hashCode() {
        int iHashCode = ((this.f42351a.hashCode() * 31) + this.f42352b.hashCode()) * 31;
        a1 a1Var = this.f42353c;
        return iHashCode + (a1Var != null ? a1Var.hashCode() : 0);
    }

    @k7
    @NotNull
    public final y3 i0(long j10, long j11, @Nullable androidx.compose.ui.text.font.v0 v0Var, @Nullable androidx.compose.ui.text.font.q0 q0Var, @Nullable androidx.compose.ui.text.font.r0 r0Var, @Nullable androidx.compose.ui.text.font.y yVar, @Nullable String str, long j12, @Nullable androidx.compose.ui.text.style.a aVar, @Nullable androidx.compose.ui.text.style.q qVar, @Nullable y0.f fVar, long j13, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j14, @Nullable androidx.compose.ui.text.style.s sVar, @Nullable androidx.compose.ui.text.style.h hVar, int i12, int i13, @Nullable a1 a1Var, @Nullable androidx.compose.ui.text.style.u uVar) {
        c3 c3VarB = e3.b(this.f42351a, j10, null, Float.NaN, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar);
        t0 t0VarA = u0.a(this.f42352b, i10, i11, j14, sVar, a1Var != null ? a1Var.a() : null, hVar, i12, i13, uVar);
        return (this.f42351a == c3VarB && this.f42352b == t0VarA) ? this : new y3(c3VarB, t0VarA);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final /* synthetic */ y3 j(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar) {
        return new y3(new c3(i0Var, f10, j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar, (DefaultConstructorMarker) null), new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j13, sVar, a1Var != null ? a1Var.a() : null, hVar, fVar2 != null ? fVar2.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), uVar, (DefaultConstructorMarker) null), a1Var);
    }

    @k7
    @NotNull
    public final y3 k0(@NotNull t0 t0Var) {
        return c0(t0Var);
    }

    @NotNull
    public final y3 l(long j10, long j11, @Nullable androidx.compose.ui.text.font.v0 v0Var, @Nullable androidx.compose.ui.text.font.q0 q0Var, @Nullable androidx.compose.ui.text.font.r0 r0Var, @Nullable androidx.compose.ui.text.font.y yVar, @Nullable String str, long j12, @Nullable androidx.compose.ui.text.style.a aVar, @Nullable androidx.compose.ui.text.style.q qVar, @Nullable y0.f fVar, long j13, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j14, @Nullable androidx.compose.ui.text.style.s sVar, @Nullable a1 a1Var, @Nullable androidx.compose.ui.text.style.h hVar, int i12, int i13, @Nullable androidx.compose.ui.text.style.u uVar) {
        return new y3(new c3(androidx.compose.ui.graphics.q0.y(j10, this.f42351a.m()) ? this.f42351a.z() : androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar, (DefaultConstructorMarker) null), new t0(i10, i11, j14, sVar, a1Var != null ? a1Var.a() : null, hVar, i12, i13, uVar, (DefaultConstructorMarker) null), a1Var);
    }

    @k7
    @NotNull
    public final y3 l0(@NotNull c3 c3Var) {
        return d0(c3Var);
    }

    @k7
    @NotNull
    public final y3 m0(@NotNull y3 y3Var) {
        return e0(y3Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final /* synthetic */ y3 n(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar) {
        return new y3(new c3(androidx.compose.ui.graphics.q0.y(j10, this.f42351a.m()) ? this.f42351a.z() : androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar, (DefaultConstructorMarker) null), new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j14, sVar, a1Var != null ? a1Var.a() : null, hVar, fVar2 != null ? fVar2.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), uVar, (DefaultConstructorMarker) null), a1Var);
    }

    @k7
    @NotNull
    public final t0 n0() {
        return this.f42352b;
    }

    @k7
    @NotNull
    public final c3 o0() {
        return this.f42351a;
    }

    public final float p() {
        return this.f42351a.i();
    }

    public final long q() {
        return this.f42351a.j();
    }

    @Nullable
    public final androidx.compose.ui.text.style.a r() {
        return this.f42351a.k();
    }

    @Nullable
    public final androidx.compose.ui.graphics.i0 s() {
        return this.f42351a.l();
    }

    public final long t() {
        return this.f42351a.m();
    }

    @NotNull
    public String toString() {
        return "TextStyle(color=" + ((Object) androidx.compose.ui.graphics.q0.L(t())) + ", brush=" + s() + ", alpha=" + p() + ", fontSize=" + ((Object) androidx.compose.ui.unit.z.u(x())) + ", fontWeight=" + A() + ", fontStyle=" + y() + ", fontSynthesis=" + z() + ", fontFamily=" + v() + ", fontFeatureSettings=" + w() + ", letterSpacing=" + ((Object) androidx.compose.ui.unit.z.u(E())) + ", baselineShift=" + r() + ", textGeometricTransform=" + W() + ", localeList=" + K() + ", background=" + ((Object) androidx.compose.ui.graphics.q0.L(q())) + ", textDecoration=" + S() + ", shadow=" + N() + ", drawStyle=" + u() + ", textAlign=" + ((Object) androidx.compose.ui.text.style.j.m(R())) + ", textDirection=" + ((Object) androidx.compose.ui.text.style.l.l(V())) + ", lineHeight=" + ((Object) androidx.compose.ui.unit.z.u(I())) + ", textIndent=" + X() + ", platformStyle=" + this.f42353c + ", lineHeightStyle=" + J() + ", lineBreak=" + ((Object) androidx.compose.ui.text.style.f.p(H())) + ", hyphens=" + ((Object) androidx.compose.ui.text.style.e.i(D())) + ", textMotion=" + Y() + ')';
    }

    @Nullable
    public final androidx.compose.ui.graphics.drawscope.i u() {
        return this.f42351a.n();
    }

    @Nullable
    public final androidx.compose.ui.text.font.y v() {
        return this.f42351a.o();
    }

    @Nullable
    public final String w() {
        return this.f42351a.p();
    }

    public final long x() {
        return this.f42351a.q();
    }

    @Nullable
    public final androidx.compose.ui.text.font.q0 y() {
        return this.f42351a.r();
    }

    @Nullable
    public final androidx.compose.ui.text.font.r0 z() {
        return this.f42351a.s();
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, iVar, jVar, lVar, j14, sVar, a1Var, hVar, fVar2, eVar, uVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, jVar, lVar, j14, sVar, a1Var, hVar, fVar2, eVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, jVar, lVar, j14, sVar, a1Var, hVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, jVar, lVar, j14, sVar);
    }

    public /* synthetic */ y3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, f10, j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, iVar, i10, i11, j13, sVar, a1Var, hVar, i12, i13, uVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ y3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, f10, j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, iVar, jVar, lVar, j13, sVar, a1Var, hVar, fVar2, eVar, uVar);
    }

    public y3(@NotNull c3 c3Var, @NotNull t0 t0Var, @Nullable a1 a1Var) {
        this.f42351a = c3Var;
        this.f42352b = t0Var;
        this.f42353c = a1Var;
    }

    public /* synthetic */ y3(c3 c3Var, t0 t0Var, a1 a1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3Var, t0Var, (i10 & 4) != 0 ? null : a1Var);
    }

    public y3(@NotNull c3 c3Var, @NotNull t0 t0Var) {
        this(c3Var, t0Var, z3.b(c3Var.w(), t0Var.s()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jU = (i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jB = (i10 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.text.font.v0 v0Var2 = (i10 & 4) != 0 ? null : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i10 & 8) != 0 ? null : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i10 & 16) != 0 ? null : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 32) != 0 ? null : yVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jB2 = (i10 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j12;
        androidx.compose.ui.text.style.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 512) != 0 ? null : qVar;
        y0.f fVar2 = (i10 & 1024) != 0 ? null : fVar;
        long jU2 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        androidx.compose.ui.text.style.k kVar2 = (i10 & 4096) != 0 ? null : kVar;
        long j15 = jU;
        androidx.compose.ui.graphics.o3 o3Var2 = (i10 & 8192) != 0 ? null : o3Var;
        androidx.compose.ui.text.style.j jVar2 = (i10 & 16384) != 0 ? null : jVar;
        androidx.compose.ui.text.style.l lVar2 = (i10 & 32768) != 0 ? null : lVar;
        long jB3 = (i10 & 65536) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j14;
        long j16 = jB;
        androidx.compose.ui.text.font.v0 v0Var3 = v0Var2;
        androidx.compose.ui.text.style.k kVar3 = kVar2;
        androidx.compose.ui.text.font.q0 q0Var3 = q0Var2;
        androidx.compose.ui.text.font.r0 r0Var3 = r0Var2;
        androidx.compose.ui.text.font.y yVar3 = yVar2;
        String str3 = str2;
        long j17 = jB2;
        androidx.compose.ui.text.style.a aVar3 = aVar2;
        androidx.compose.ui.text.style.q qVar3 = qVar2;
        y0.f fVar3 = fVar2;
        long j18 = jU2;
        this(j15, j16, v0Var3, q0Var3, r0Var3, yVar3, str3, j17, aVar3, qVar3, fVar3, j18, kVar3, o3Var2, jVar2, lVar2, jB3, (i10 & 131072) != 0 ? null : sVar, null);
    }

    private y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar) {
        c3 c3Var = new c3(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, (DefaultConstructorMarker) null);
        this(c3Var, new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j14, sVar, (x0) null, (androidx.compose.ui.text.style.h) null, androidx.compose.ui.text.style.f.f42154b.g(), androidx.compose.ui.text.style.e.f42149b.c(), (androidx.compose.ui.text.style.u) null, (DefaultConstructorMarker) null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jU = (i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jB = (i10 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.text.font.v0 v0Var2 = (i10 & 4) != 0 ? null : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i10 & 8) != 0 ? null : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i10 & 16) != 0 ? null : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 32) != 0 ? null : yVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jB2 = (i10 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j12;
        androidx.compose.ui.text.style.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 512) != 0 ? null : qVar;
        y0.f fVar2 = (i10 & 1024) != 0 ? null : fVar;
        long jU2 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        androidx.compose.ui.text.style.k kVar2 = (i10 & 4096) != 0 ? null : kVar;
        long j15 = jU;
        androidx.compose.ui.graphics.o3 o3Var2 = (i10 & 8192) != 0 ? null : o3Var;
        androidx.compose.ui.text.style.j jVar2 = (i10 & 16384) != 0 ? null : jVar;
        androidx.compose.ui.text.style.l lVar2 = (i10 & 32768) != 0 ? null : lVar;
        long jB3 = (i10 & 65536) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j14;
        androidx.compose.ui.text.style.s sVar2 = (i10 & 131072) != 0 ? null : sVar;
        a1 a1Var2 = (i10 & 262144) != 0 ? null : a1Var;
        long j16 = jB;
        androidx.compose.ui.text.font.v0 v0Var3 = v0Var2;
        androidx.compose.ui.text.style.k kVar3 = kVar2;
        androidx.compose.ui.text.font.q0 q0Var3 = q0Var2;
        androidx.compose.ui.text.font.r0 r0Var3 = r0Var2;
        androidx.compose.ui.text.font.y yVar3 = yVar2;
        String str3 = str2;
        long j17 = jB2;
        androidx.compose.ui.text.style.a aVar3 = aVar2;
        androidx.compose.ui.text.style.q qVar3 = qVar2;
        y0.f fVar3 = fVar2;
        long j18 = jU2;
        this(j15, j16, v0Var3, q0Var3, r0Var3, yVar3, str3, j17, aVar3, qVar3, fVar3, j18, kVar3, o3Var2, jVar2, lVar2, jB3, sVar2, a1Var2, (i10 & 524288) != 0 ? null : hVar, null);
    }

    private y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar) {
        this(new c3(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, (androidx.compose.ui.graphics.drawscope.i) null, (DefaultConstructorMarker) null), new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j14, sVar, a1Var != null ? a1Var.a() : null, hVar, androidx.compose.ui.text.style.f.f42154b.g(), androidx.compose.ui.text.style.e.f42149b.c(), (androidx.compose.ui.text.style.u) null, (DefaultConstructorMarker) null), a1Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jU = (i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jB = (i10 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.text.font.v0 v0Var2 = (i10 & 4) != 0 ? null : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i10 & 8) != 0 ? null : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i10 & 16) != 0 ? null : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 32) != 0 ? null : yVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jB2 = (i10 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j12;
        androidx.compose.ui.text.style.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 512) != 0 ? null : qVar;
        y0.f fVar3 = (i10 & 1024) != 0 ? null : fVar;
        long jU2 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        androidx.compose.ui.text.style.k kVar2 = (i10 & 4096) != 0 ? null : kVar;
        long j15 = jU;
        androidx.compose.ui.graphics.o3 o3Var2 = (i10 & 8192) != 0 ? null : o3Var;
        androidx.compose.ui.text.style.j jVar2 = (i10 & 16384) != 0 ? null : jVar;
        androidx.compose.ui.text.style.l lVar2 = (i10 & 32768) != 0 ? null : lVar;
        long jB3 = (i10 & 65536) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j14;
        androidx.compose.ui.text.style.s sVar2 = (i10 & 131072) != 0 ? null : sVar;
        a1 a1Var2 = (i10 & 262144) != 0 ? null : a1Var;
        androidx.compose.ui.text.style.h hVar2 = (i10 & 524288) != 0 ? null : hVar;
        androidx.compose.ui.text.style.f fVar4 = (i10 & 1048576) != 0 ? null : fVar2;
        long j16 = jB;
        androidx.compose.ui.text.font.v0 v0Var3 = v0Var2;
        androidx.compose.ui.text.style.k kVar3 = kVar2;
        androidx.compose.ui.text.font.q0 q0Var3 = q0Var2;
        androidx.compose.ui.text.font.r0 r0Var3 = r0Var2;
        androidx.compose.ui.text.font.y yVar3 = yVar2;
        String str3 = str2;
        long j17 = jB2;
        androidx.compose.ui.text.style.a aVar3 = aVar2;
        androidx.compose.ui.text.style.q qVar3 = qVar2;
        y0.f fVar5 = fVar3;
        long j18 = jU2;
        this(j15, j16, v0Var3, q0Var3, r0Var3, yVar3, str3, j17, aVar3, qVar3, fVar5, j18, kVar3, o3Var2, jVar2, lVar2, jB3, sVar2, a1Var2, hVar2, fVar4, (i10 & 2097152) != 0 ? null : eVar, null);
    }

    private y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar) {
        c3 c3Var = new c3(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, (androidx.compose.ui.graphics.drawscope.i) null, 32768, (DefaultConstructorMarker) null);
        int iN = jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g();
        int iM = lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f();
        x0 x0VarA = a1Var != null ? a1Var.a() : null;
        this(c3Var, new t0(iN, iM, j14, sVar, x0VarA, hVar, fVar2 != null ? fVar2.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), (androidx.compose.ui.text.style.u) null, 256, (DefaultConstructorMarker) null), a1Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jU = (i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jB = (i10 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.text.font.v0 v0Var2 = (i10 & 4) != 0 ? null : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i10 & 8) != 0 ? null : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i10 & 16) != 0 ? null : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 32) != 0 ? null : yVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jB2 = (i10 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j12;
        androidx.compose.ui.text.style.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 512) != 0 ? null : qVar;
        y0.f fVar3 = (i10 & 1024) != 0 ? null : fVar;
        long jU2 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        androidx.compose.ui.text.style.k kVar2 = (i10 & 4096) != 0 ? null : kVar;
        long j15 = jU;
        androidx.compose.ui.graphics.o3 o3Var2 = (i10 & 8192) != 0 ? null : o3Var;
        androidx.compose.ui.graphics.drawscope.i iVar2 = (i10 & 16384) != 0 ? null : iVar;
        androidx.compose.ui.text.style.j jVar2 = (i10 & 32768) != 0 ? null : jVar;
        androidx.compose.ui.text.style.l lVar2 = (i10 & 65536) != 0 ? null : lVar;
        long jB3 = (i10 & 131072) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j14;
        androidx.compose.ui.text.style.s sVar2 = (i10 & 262144) != 0 ? null : sVar;
        a1 a1Var2 = (i10 & 524288) != 0 ? null : a1Var;
        androidx.compose.ui.text.style.h hVar2 = (i10 & 1048576) != 0 ? null : hVar;
        androidx.compose.ui.text.style.f fVar4 = (i10 & 2097152) != 0 ? null : fVar2;
        androidx.compose.ui.text.style.e eVar2 = (i10 & 4194304) != 0 ? null : eVar;
        long j16 = jB;
        androidx.compose.ui.text.font.v0 v0Var3 = v0Var2;
        androidx.compose.ui.text.style.k kVar3 = kVar2;
        androidx.compose.ui.text.font.q0 q0Var3 = q0Var2;
        androidx.compose.ui.text.font.r0 r0Var3 = r0Var2;
        androidx.compose.ui.text.font.y yVar3 = yVar2;
        String str3 = str2;
        long j17 = jB2;
        androidx.compose.ui.text.style.a aVar3 = aVar2;
        androidx.compose.ui.text.style.q qVar3 = qVar2;
        y0.f fVar5 = fVar3;
        long j18 = jU2;
        this(j15, j16, v0Var3, q0Var3, r0Var3, yVar3, str3, j17, aVar3, qVar3, fVar5, j18, kVar3, o3Var2, iVar2, jVar2, lVar2, jB3, sVar2, a1Var2, hVar2, fVar4, eVar2, (i10 & 8388608) != 0 ? null : uVar, (DefaultConstructorMarker) null);
    }

    private y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar) {
        this(new c3(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar, (DefaultConstructorMarker) null), new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j14, sVar, a1Var != null ? a1Var.a() : null, hVar, fVar2 != null ? fVar2.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), uVar, (DefaultConstructorMarker) null), a1Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        long jU = (i14 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jB = (i14 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.text.font.v0 v0Var2 = (i14 & 4) != 0 ? null : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i14 & 8) != 0 ? null : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i14 & 16) != 0 ? null : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i14 & 32) != 0 ? null : yVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        long jB2 = (i14 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j12;
        androidx.compose.ui.text.style.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i14 & 512) != 0 ? null : qVar;
        y0.f fVar2 = (i14 & 1024) != 0 ? null : fVar;
        long jU2 = (i14 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        androidx.compose.ui.text.style.k kVar2 = (i14 & 4096) != 0 ? null : kVar;
        long j15 = jU;
        androidx.compose.ui.graphics.o3 o3Var2 = (i14 & 8192) != 0 ? null : o3Var;
        androidx.compose.ui.graphics.drawscope.i iVar2 = (i14 & 16384) != 0 ? null : iVar;
        int iG = (i14 & 32768) != 0 ? androidx.compose.ui.text.style.j.f42206b.g() : i10;
        int iF = (i14 & 65536) != 0 ? androidx.compose.ui.text.style.l.f42221b.f() : i11;
        long jB3 = (i14 & 131072) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j14;
        androidx.compose.ui.text.style.s sVar2 = (i14 & 262144) != 0 ? null : sVar;
        a1 a1Var2 = (i14 & 524288) != 0 ? null : a1Var;
        androidx.compose.ui.text.style.h hVar2 = (i14 & 1048576) != 0 ? null : hVar;
        int iG2 = (i14 & 2097152) != 0 ? androidx.compose.ui.text.style.f.f42154b.g() : i12;
        int iC = (i14 & 4194304) != 0 ? androidx.compose.ui.text.style.e.f42149b.c() : i13;
        long j16 = jB;
        androidx.compose.ui.text.font.v0 v0Var3 = v0Var2;
        androidx.compose.ui.text.style.k kVar3 = kVar2;
        androidx.compose.ui.text.font.q0 q0Var3 = q0Var2;
        androidx.compose.ui.text.font.r0 r0Var3 = r0Var2;
        androidx.compose.ui.text.font.y yVar3 = yVar2;
        String str3 = str2;
        long j17 = jB2;
        androidx.compose.ui.text.style.a aVar3 = aVar2;
        androidx.compose.ui.text.style.q qVar3 = qVar2;
        y0.f fVar3 = fVar2;
        long j18 = jU2;
        this(j15, j16, v0Var3, q0Var3, r0Var3, yVar3, str3, j17, aVar3, qVar3, fVar3, j18, kVar3, o3Var2, iVar2, iG, iF, jB3, sVar2, a1Var2, hVar2, iG2, iC, (i14 & 8388608) != 0 ? null : uVar, (DefaultConstructorMarker) null);
    }

    private y3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j14, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar) {
        this(new c3(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar, (DefaultConstructorMarker) null), new t0(i10, i11, j14, sVar, a1Var != null ? a1Var.a() : null, hVar, i12, i13, uVar, (DefaultConstructorMarker) null), a1Var);
    }

    public /* synthetic */ y3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, (i14 & 2) != 0 ? Float.NaN : f10, (i14 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10, (i14 & 8) != 0 ? null : v0Var, (i14 & 16) != 0 ? null : q0Var, (i14 & 32) != 0 ? null : r0Var, (i14 & 64) != 0 ? null : yVar, (i14 & 128) != 0 ? null : str, (i14 & 256) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11, (i14 & 512) != 0 ? null : aVar, (i14 & 1024) != 0 ? null : qVar, (i14 & 2048) != 0 ? null : fVar, (i14 & 4096) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12, (i14 & 8192) != 0 ? null : kVar, (i14 & 16384) != 0 ? null : o3Var, (32768 & i14) != 0 ? null : iVar, (65536 & i14) != 0 ? androidx.compose.ui.text.style.j.f42206b.g() : i10, (131072 & i14) != 0 ? androidx.compose.ui.text.style.l.f42221b.f() : i11, (262144 & i14) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j13, (524288 & i14) != 0 ? null : sVar, (1048576 & i14) != 0 ? null : a1Var, (2097152 & i14) != 0 ? null : hVar, (4194304 & i14) != 0 ? androidx.compose.ui.text.style.f.f42154b.g() : i12, (8388608 & i14) != 0 ? androidx.compose.ui.text.style.e.f42149b.c() : i13, (i14 & 16777216) != 0 ? null : uVar, (DefaultConstructorMarker) null);
    }

    private y3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar) {
        this(new c3(i0Var, f10, j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar, (DefaultConstructorMarker) null), new t0(i10, i11, j13, sVar, a1Var != null ? a1Var.a() : null, hVar, i12, i13, uVar, (DefaultConstructorMarker) null), a1Var);
    }

    public /* synthetic */ y3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10, (i10 & 8) != 0 ? null : v0Var, (i10 & 16) != 0 ? null : q0Var, (i10 & 32) != 0 ? null : r0Var, (i10 & 64) != 0 ? null : yVar, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11, (i10 & 512) != 0 ? null : aVar, (i10 & 1024) != 0 ? null : qVar, (i10 & 2048) != 0 ? null : fVar, (i10 & 4096) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12, (i10 & 8192) != 0 ? null : kVar, (i10 & 16384) != 0 ? null : o3Var, (32768 & i10) != 0 ? null : iVar, (65536 & i10) != 0 ? null : jVar, (131072 & i10) != 0 ? null : lVar, (262144 & i10) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j13, (524288 & i10) != 0 ? null : sVar, (1048576 & i10) != 0 ? null : a1Var, (2097152 & i10) != 0 ? null : hVar, (4194304 & i10) != 0 ? null : fVar2, (8388608 & i10) != 0 ? null : eVar, (i10 & 16777216) != 0 ? null : uVar, (DefaultConstructorMarker) null);
    }

    private y3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j13, androidx.compose.ui.text.style.s sVar, a1 a1Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar2, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar) {
        this(new c3(i0Var, f10, j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, a1Var != null ? a1Var.b() : null, iVar, (DefaultConstructorMarker) null), new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j13, sVar, a1Var != null ? a1Var.a() : null, hVar, fVar2 != null ? fVar2.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), uVar, (DefaultConstructorMarker) null), a1Var);
    }
}
