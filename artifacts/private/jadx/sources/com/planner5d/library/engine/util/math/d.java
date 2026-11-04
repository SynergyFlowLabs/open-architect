package com.planner5d.library.engine.util.math;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.planner5d.library.math.m f165432a = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.planner5d.library.math.m f165433b = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.planner5d.library.math.m f165434c = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f165435d = new g(new com.planner5d.library.math.m(), 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.planner5d.library.math.m f165436e = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static com.planner5d.library.math.m f165437f = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static com.planner5d.library.math.m f165438g = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static com.planner5d.library.math.m f165439h = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static com.planner5d.library.math.m f165440i = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static com.planner5d.library.math.m f165441j = new com.planner5d.library.math.m();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.planner5d.library.math.k f165442a = new com.planner5d.library.math.k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f165443b = 0.0f;
    }

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        return Math.abs(((f14 - f10) * f17) - ((f15 - f11) * f16)) / ((float) Math.sqrt((f16 * f16) + (f17 * f17)));
    }

    public static float b(float f10, float f11, float f12, float f13, float f14, float f15, g gVar, com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.m mVarG0 = f165438g.y0(f13, f14, f15).G0(f10, f11, f12);
        com.planner5d.library.math.m mVarY0 = f165440i.y0(f10, f11, f12);
        float fX = mVarG0.X(gVar.c());
        if (fX != 0.0f) {
            float f16 = (-(mVarY0.X(gVar.c()) + gVar.b())) / fX;
            if (mVar != null) {
                mVar.A0(mVarY0).R(mVarG0.v0(f16));
            }
            return f16;
        }
        if (gVar.k(mVarY0) != g.a.OnPlane) {
            return -1.0f;
        }
        if (mVar != null) {
            mVar.A0(mVarY0);
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0235  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    public static boolean c(k kVar, b bVar, com.planner5d.library.math.m mVar) {
        boolean z10;
        float f10;
        boolean z11 = true;
        if (bVar.c(kVar.f165515a)) {
            if (mVar != null) {
                mVar.A0(kVar.f165515a);
            }
            return true;
        }
        float f11 = kVar.f165515a.f180482a;
        float f12 = bVar.f165422a.f180482a;
        if (f11 <= f12) {
            com.planner5d.library.math.m mVar2 = kVar.f165516b;
            float f13 = mVar2.f180482a;
            if (f13 > 0.0f) {
                f10 = (f12 - f11) / f13;
                if (f10 >= 0.0f) {
                    com.planner5d.library.math.m mVar3 = f165434c;
                    mVar3.A0(mVar2).v0(f10).R(kVar.f165515a);
                    float f14 = mVar3.f180483b;
                    com.planner5d.library.math.m mVar4 = bVar.f165422a;
                    if (f14 >= mVar4.f180483b) {
                        com.planner5d.library.math.m mVar5 = bVar.f165423b;
                        if (f14 <= mVar5.f180483b) {
                            float f15 = mVar3.f180484c;
                            if (f15 < mVar4.f180484c || f15 > mVar5.f180484c) {
                                z10 = false;
                                f10 = 0.0f;
                            } else {
                                z10 = true;
                            }
                        } else {
                            z10 = false;
                            f10 = 0.0f;
                        }
                    } else {
                        z10 = false;
                        f10 = 0.0f;
                    }
                } else {
                    z10 = false;
                    f10 = 0.0f;
                }
            } else {
                z10 = false;
                f10 = 0.0f;
            }
        } else {
            z10 = false;
            f10 = 0.0f;
        }
        float f16 = kVar.f165515a.f180482a;
        float f17 = bVar.f165423b.f180482a;
        if (f16 >= f17) {
            com.planner5d.library.math.m mVar6 = kVar.f165516b;
            float f18 = mVar6.f180482a;
            if (f18 < 0.0f) {
                float f19 = (f17 - f16) / f18;
                if (f19 >= 0.0f) {
                    com.planner5d.library.math.m mVar7 = f165434c;
                    mVar7.A0(mVar6).v0(f19).R(kVar.f165515a);
                    float f20 = mVar7.f180483b;
                    com.planner5d.library.math.m mVar8 = bVar.f165422a;
                    if (f20 >= mVar8.f180483b) {
                        com.planner5d.library.math.m mVar9 = bVar.f165423b;
                        if (f20 <= mVar9.f180483b) {
                            float f21 = mVar7.f180484c;
                            if (f21 >= mVar8.f180484c && f21 <= mVar9.f180484c && (!z10 || f19 < f10)) {
                                z10 = true;
                                f10 = f19;
                            }
                        }
                    }
                }
            }
        }
        float f22 = kVar.f165515a.f180483b;
        float f23 = bVar.f165422a.f180483b;
        if (f22 <= f23) {
            com.planner5d.library.math.m mVar10 = kVar.f165516b;
            float f24 = mVar10.f180483b;
            if (f24 > 0.0f) {
                float f25 = (f23 - f22) / f24;
                if (f25 >= 0.0f) {
                    com.planner5d.library.math.m mVar11 = f165434c;
                    mVar11.A0(mVar10).v0(f25).R(kVar.f165515a);
                    float f26 = mVar11.f180482a;
                    com.planner5d.library.math.m mVar12 = bVar.f165422a;
                    if (f26 >= mVar12.f180482a) {
                        com.planner5d.library.math.m mVar13 = bVar.f165423b;
                        if (f26 <= mVar13.f180482a) {
                            float f27 = mVar11.f180484c;
                            if (f27 >= mVar12.f180484c && f27 <= mVar13.f180484c && (!z10 || f25 < f10)) {
                                z10 = true;
                                f10 = f25;
                            }
                        }
                    }
                }
            }
        }
        float f28 = kVar.f165515a.f180483b;
        float f29 = bVar.f165423b.f180483b;
        if (f28 >= f29) {
            com.planner5d.library.math.m mVar14 = kVar.f165516b;
            float f30 = mVar14.f180483b;
            if (f30 < 0.0f) {
                float f31 = (f29 - f28) / f30;
                if (f31 >= 0.0f) {
                    com.planner5d.library.math.m mVar15 = f165434c;
                    mVar15.A0(mVar14).v0(f31).R(kVar.f165515a);
                    float f32 = mVar15.f180482a;
                    com.planner5d.library.math.m mVar16 = bVar.f165422a;
                    if (f32 >= mVar16.f180482a) {
                        com.planner5d.library.math.m mVar17 = bVar.f165423b;
                        if (f32 <= mVar17.f180482a) {
                            float f33 = mVar15.f180484c;
                            if (f33 >= mVar16.f180484c && f33 <= mVar17.f180484c && (!z10 || f31 < f10)) {
                                z10 = true;
                                f10 = f31;
                            }
                        }
                    }
                }
            }
        }
        float f34 = kVar.f165515a.f180484c;
        float f35 = bVar.f165422a.f180484c;
        if (f34 <= f35) {
            com.planner5d.library.math.m mVar18 = kVar.f165516b;
            float f36 = mVar18.f180484c;
            if (f36 > 0.0f) {
                float f37 = (f35 - f34) / f36;
                if (f37 >= 0.0f) {
                    com.planner5d.library.math.m mVar19 = f165434c;
                    mVar19.A0(mVar18).v0(f37).R(kVar.f165515a);
                    float f38 = mVar19.f180482a;
                    com.planner5d.library.math.m mVar20 = bVar.f165422a;
                    if (f38 >= mVar20.f180482a) {
                        com.planner5d.library.math.m mVar21 = bVar.f165423b;
                        if (f38 <= mVar21.f180482a) {
                            float f39 = mVar19.f180483b;
                            if (f39 >= mVar20.f180483b && f39 <= mVar21.f180483b && (!z10 || f37 < f10)) {
                                z10 = true;
                                f10 = f37;
                            }
                        }
                    }
                }
            }
        }
        float f40 = kVar.f165515a.f180484c;
        float f41 = bVar.f165423b.f180484c;
        if (f40 >= f41) {
            com.planner5d.library.math.m mVar22 = kVar.f165516b;
            float f42 = mVar22.f180484c;
            if (f42 < 0.0f) {
                float f43 = (f41 - f40) / f42;
                if (f43 >= 0.0f) {
                    com.planner5d.library.math.m mVar23 = f165434c;
                    mVar23.A0(mVar22).v0(f43).R(kVar.f165515a);
                    float f44 = mVar23.f180482a;
                    com.planner5d.library.math.m mVar24 = bVar.f165422a;
                    if (f44 >= mVar24.f180482a) {
                        com.planner5d.library.math.m mVar25 = bVar.f165423b;
                        if (f44 <= mVar25.f180482a) {
                            float f45 = mVar23.f180483b;
                            if (f45 < mVar24.f180483b || f45 > mVar25.f180483b || (z10 && f43 >= f10)) {
                                z11 = z10;
                            } else {
                                f10 = f43;
                            }
                        } else {
                            z11 = z10;
                        }
                    } else {
                        z11 = z10;
                    }
                } else {
                    z11 = z10;
                }
            } else {
                z11 = z10;
            }
        } else {
            z11 = z10;
        }
        if (z11 && mVar != null) {
            mVar.A0(kVar.f165516b).v0(f10).R(kVar.f165515a);
            float f46 = mVar.f180482a;
            com.planner5d.library.math.m mVar26 = bVar.f165422a;
            float f47 = mVar26.f180482a;
            if (f46 < f47) {
                mVar.f180482a = f47;
            } else {
                float f48 = bVar.f165423b.f180482a;
                if (f46 > f48) {
                    mVar.f180482a = f48;
                }
            }
            float f49 = mVar.f180483b;
            float f50 = mVar26.f180483b;
            if (f49 < f50) {
                mVar.f180483b = f50;
            } else {
                float f51 = bVar.f165423b.f180483b;
                if (f49 > f51) {
                    mVar.f180483b = f51;
                }
            }
            float f52 = mVar.f180484c;
            float f53 = mVar26.f180484c;
            if (f52 < f53) {
                mVar.f180484c = f53;
                return z11;
            }
            float f54 = bVar.f165423b.f180484c;
            if (f52 > f54) {
                mVar.f180484c = f54;
            }
        }
        return z11;
    }

    public static boolean d(k kVar, b bVar) {
        return e(kVar, bVar.i(f165439h), bVar.v(f165440i));
    }

    public static boolean e(k kVar, com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        com.planner5d.library.math.m mVar3 = kVar.f165516b;
        float f10 = 1.0f / mVar3.f180482a;
        float f11 = 1.0f / mVar3.f180483b;
        float f12 = 1.0f / mVar3.f180484c;
        float f13 = mVar.f180482a;
        float f14 = mVar2.f180482a;
        com.planner5d.library.math.m mVar4 = kVar.f165515a;
        float f15 = mVar4.f180482a;
        float f16 = ((f13 - (f14 * 0.5f)) - f15) * f10;
        float f17 = ((f13 + (f14 * 0.5f)) - f15) * f10;
        if (f16 > f17) {
            f16 = f17;
            f17 = f16;
        }
        float f18 = mVar.f180483b;
        float f19 = mVar2.f180483b;
        float f20 = mVar4.f180483b;
        float f21 = ((f18 - (f19 * 0.5f)) - f20) * f11;
        float f22 = ((f18 + (f19 * 0.5f)) - f20) * f11;
        if (f21 > f22) {
            f21 = f22;
            f22 = f21;
        }
        float f23 = mVar.f180484c;
        float f24 = mVar2.f180484c;
        float f25 = mVar4.f180484c;
        float f26 = ((f23 - (f24 * 0.5f)) - f25) * f12;
        float f27 = ((f23 + (f24 * 0.5f)) - f25) * f12;
        if (f26 > f27) {
            f26 = f27;
            f27 = f26;
        }
        float fMax = Math.max(Math.max(f16, f21), f26);
        float fMin = Math.min(Math.min(f17, f22), f27);
        if (fMin < 0.0f || fMin < fMax) {
            return false;
        }
        int i10 = 6 & 1;
        return true;
    }

    public static boolean f(k kVar, g gVar, com.planner5d.library.math.m mVar) {
        float fX = kVar.f165516b.X(gVar.c());
        if (fX == 0.0f) {
            if (gVar.k(kVar.f165515a) != g.a.OnPlane) {
                return false;
            }
            if (mVar != null) {
                mVar.A0(kVar.f165515a);
            }
            return true;
        }
        float f10 = (-(kVar.f165515a.X(gVar.c()) + gVar.b())) / fX;
        if (f10 < 0.0f) {
            return false;
        }
        if (mVar != null) {
            mVar.A0(kVar.f165515a).R(f165432a.A0(kVar.f165516b).v0(f10));
        }
        return true;
    }

    public static boolean g(k kVar, com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2, com.planner5d.library.math.m mVar3, com.planner5d.library.math.m mVar4) {
        if (!mVar.g0(kVar.f165515a) && !mVar2.g0(kVar.f165515a) && !mVar3.g0(kVar.f165515a)) {
            g gVar = f165435d;
            gVar.i(mVar, mVar2, mVar3);
            com.planner5d.library.math.m mVar5 = f165436e;
            if (!f(kVar, gVar, mVar5)) {
                return false;
            }
            com.planner5d.library.math.m mVar6 = f165432a;
            mVar6.A0(mVar3).H0(mVar);
            com.planner5d.library.math.m mVar7 = f165433b;
            mVar7.A0(mVar2).H0(mVar);
            com.planner5d.library.math.m mVar8 = f165434c;
            mVar8.A0(mVar5).H0(mVar);
            float fX = mVar6.X(mVar6);
            float fX2 = mVar6.X(mVar7);
            float fX3 = mVar6.X(mVar8);
            float fX4 = mVar7.X(mVar7);
            float fX5 = mVar7.X(mVar8);
            float f10 = (fX * fX4) - (fX2 * fX2);
            if (f10 == 0.0f) {
                return false;
            }
            float f11 = ((fX4 * fX3) - (fX2 * fX5)) / f10;
            float f12 = ((fX * fX5) - (fX2 * fX3)) / f10;
            if (f11 < 0.0f || f12 < 0.0f || f11 + f12 > 1.0f) {
                return false;
            }
            if (mVar4 != null) {
                mVar4.A0(mVar5);
            }
            return true;
        }
        if (mVar4 != null) {
            mVar4.A0(kVar.f165515a);
        }
        return true;
    }

    public static boolean h(k kVar, float[] fArr, com.planner5d.library.math.m mVar) {
        if ((fArr.length / 3) % 3 != 0) {
            throw new RuntimeException("triangle list size is not a multiple of 3");
        }
        float f10 = Float.MAX_VALUE;
        boolean z10 = false;
        for (int i10 = 0; i10 < fArr.length - 6; i10 += 9) {
            if (g(kVar, f165439h.y0(fArr[i10], fArr[i10 + 1], fArr[i10 + 2]), f165440i.y0(fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]), f165441j.y0(fArr[i10 + 6], fArr[i10 + 7], fArr[i10 + 8]), f165438g)) {
                float fB0 = kVar.f165515a.b0(f165438g);
                if (fB0 < f10) {
                    f165437f.A0(f165438g);
                    f10 = fB0;
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return false;
        }
        if (mVar != null) {
            mVar.A0(f165437f);
        }
        return true;
    }

    public static boolean i(h hVar, h hVar2) {
        return j(hVar, hVar2, null);
    }

    public static boolean j(h hVar, h hVar2, a aVar) {
        return l(hVar.j(), hVar2.j(), aVar);
    }

    public static boolean k(float[] fArr, int i10, int i11, float[] fArr2, int i12, int i13, a aVar) {
        int i14 = i10 + i11;
        int i15 = i12 + i13;
        float f10 = Float.MAX_VALUE;
        float f11 = 0.0f;
        int i16 = i10;
        float f12 = 0.0f;
        while (i16 < i14) {
            float f13 = fArr[i16];
            float f14 = fArr[i16 + 1];
            int i17 = i16 + 2;
            float f15 = fArr[i17 % i11];
            float f16 = fArr[(i16 + 3) % i11];
            float f17 = f14 - f16;
            float f18 = -(f13 - f15);
            float fSqrt = (float) Math.sqrt((f17 * f17) + (f18 * f18));
            float f19 = f17 / fSqrt;
            float f20 = f18 / fSqrt;
            float f21 = (fArr[0] * f19) + (fArr[1] * f20);
            float f22 = f21;
            for (int i18 = i10; i18 < i14; i18 += 2) {
                float f23 = (fArr[i18] * f19) + (fArr[i18 + 1] * f20);
                if (f23 < f21) {
                    f21 = f23;
                } else if (f23 > f22) {
                    f22 = f23;
                }
            }
            float f24 = (fArr2[0] * f19) + (fArr2[1] * f20);
            float f25 = f10;
            float f26 = f11;
            float f27 = f24;
            int iM = 0;
            int i19 = i12;
            while (i19 < i15) {
                float f28 = f22;
                int i20 = i19 + 1;
                float f29 = f24;
                int i21 = i19;
                float f30 = f12;
                iM -= m(f13, f14, f15, f16, fArr2[i19], fArr2[i20]);
                float f31 = (fArr2[i21] * f19) + (fArr2[i20] * f20);
                if (f31 < f29) {
                    f24 = f31;
                } else if (f31 > f27) {
                    f24 = f29;
                    f27 = f31;
                } else {
                    f24 = f29;
                }
                f22 = f28;
                i19 = i21 + 2;
                f12 = f30;
            }
            float f32 = f12;
            float f33 = f22;
            float f34 = f24;
            if ((f21 > f34 || f33 < f34) && (f34 > f21 || f27 < f21)) {
                return false;
            }
            float fMin = Math.min(f33, f27) - Math.max(f21, f34);
            if ((f21 < f34 && f33 > f27) || (f34 < f21 && f27 > f33)) {
                float fAbs = Math.abs(f21 - f34);
                float fAbs2 = Math.abs(f33 - f27);
                fMin = fAbs < fAbs2 ? fMin + fAbs : fMin + fAbs2;
            }
            if (fMin < f25) {
                if (iM < 0) {
                    f19 = -f19;
                }
                if (iM < 0) {
                    f20 = -f20;
                }
                f11 = f19;
                f12 = f20;
                f10 = fMin;
            } else {
                f10 = f25;
                f11 = f26;
                f12 = f32;
            }
            i16 = i17;
        }
        int i22 = i12;
        while (i22 < i15) {
            float f35 = fArr2[i22];
            float f36 = fArr2[i22 + 1];
            int i23 = i22 + 2;
            float f37 = fArr2[i23 % i13];
            float f38 = fArr2[(i22 + 3) % i13];
            float f39 = f36 - f38;
            float f40 = -(f35 - f37);
            float fSqrt2 = (float) Math.sqrt((f39 * f39) + (f40 * f40));
            float f41 = f39 / fSqrt2;
            float f42 = f40 / fSqrt2;
            float f43 = (fArr[0] * f41) + (fArr[1] * f42);
            int i24 = i10;
            float f44 = f43;
            int iM2 = 0;
            while (i24 < i14) {
                float f45 = f43;
                float f46 = fArr[i24];
                float f47 = fArr[i24 + 1];
                float f48 = (f41 * f46) + (f42 * f47);
                int i25 = i14;
                int i26 = i24;
                iM2 -= m(f35, f36, f37, f38, f46, f47);
                if (f48 < f44) {
                    f43 = f45;
                    f44 = f48;
                } else {
                    f43 = f48 > f45 ? f48 : f45;
                }
                i24 = i26 + 2;
                i14 = i25;
            }
            int i27 = i14;
            float f49 = f43;
            float f50 = (fArr2[0] * f41) + (fArr2[1] * f42);
            float f51 = f50;
            for (int i28 = i12; i28 < i15; i28 += 2) {
                float f52 = (fArr2[i28] * f41) + (fArr2[i28 + 1] * f42);
                if (f52 < f50) {
                    f50 = f52;
                } else if (f52 > f51) {
                    f51 = f52;
                }
            }
            if ((f44 > f50 || f49 < f50) && (f50 > f44 || f51 < f44)) {
                return false;
            }
            float fMin2 = Math.min(f49, f51) - Math.max(f44, f50);
            if ((f44 < f50 && f49 > f51) || (f50 < f44 && f51 > f49)) {
                float fAbs3 = Math.abs(f44 - f50);
                float fAbs4 = Math.abs(f49 - f51);
                fMin2 = fAbs3 < fAbs4 ? fMin2 + fAbs3 : fMin2 + fAbs4;
            }
            if (fMin2 < f10) {
                if (iM2 >= 0) {
                    f41 = -f41;
                }
                if (iM2 >= 0) {
                    f42 = -f42;
                }
                f11 = f41;
                f10 = fMin2;
                f12 = f42;
            }
            i22 = i23;
            i14 = i27;
        }
        if (aVar != null) {
            aVar.f165442a.U(f11, f12);
            aVar.f165443b = f10;
        }
        return true;
    }

    public static boolean l(float[] fArr, float[] fArr2, a aVar) {
        return k(fArr, 0, fArr.length, fArr2, 0, fArr2.length, aVar);
    }

    public static int m(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (int) Math.signum(((f12 - f10) * (f15 - f11)) - ((f13 - f11) * (f14 - f10)));
    }
}
