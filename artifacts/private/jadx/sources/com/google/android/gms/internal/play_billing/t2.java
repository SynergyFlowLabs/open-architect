package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class t2 extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final u1 f109335g = new t2(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.a
    private final transient Object f109336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f109337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f109338f;

    private t2(@fj.a Object obj, Object[] objArr, int i10) {
        this.f109336d = obj;
        this.f109337e = objArr;
        this.f109338f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static t2 g(int i10, Object[] objArr, t1 t1Var) {
        boolean z10;
        int i11;
        char c10;
        ?? r10;
        char c11;
        short[] sArr;
        boolean z11;
        int i12;
        ?? r16;
        boolean z12;
        ?? r11;
        Object[] objArr2;
        s1 s1Var;
        boolean z13;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (t2) f109335g;
        }
        s1 s1Var2 = null;
        ?? r12 = 0;
        s1 s1Var3 = null;
        s1 s1Var4 = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            y0.b(obj, obj2);
            return new t2(null, objArrCopyOf, 1);
        }
        g0.b(i13, objArrCopyOf.length >> 1, FirebaseAnalytics.d.f120644b0);
        int iR = y1.r(i13);
        char c12 = 2;
        if (i13 != 1) {
            int i15 = iR - 1;
            if (iR <= 128) {
                byte[] bArr = new byte[iR];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj3 = objArrCopyOf[i19];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i19 ^ i14];
                    Objects.requireNonNull(obj4);
                    y0.b(obj3, obj4);
                    int iA = j1.a(obj3.hashCode());
                    while (true) {
                        int i20 = iA & i15;
                        z11 = z14;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj3;
                                objArrCopyOf[i18 ^ 1] = obj4;
                            }
                            i17++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                            int i22 = ~i21;
                            Object obj5 = objArrCopyOf[i22 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            s1 s1Var5 = new s1(obj3, obj4, obj5);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj4;
                            s1Var3 = s1Var5;
                            break;
                        }
                        iA = i20 + 1;
                        z14 = z11;
                        i14 = i12;
                    }
                    i16++;
                    z14 = z11;
                    i14 = i12;
                }
                z10 = z14;
                i11 = i14;
                if (i17 == i13) {
                    r12 = bArr;
                    z13 = z10;
                } else {
                    sArr = new Object[3];
                    sArr[z10 ? 1 : 0] = bArr;
                    sArr[i11] = Integer.valueOf(i17);
                    sArr[2] = s1Var3;
                    r12 = sArr;
                    z13 = z10;
                }
            } else {
                z10 = false;
                i11 = 1;
                if (iR <= 32768) {
                    sArr = new short[iR];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj6 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj7);
                        y0.b(obj6, obj7);
                        int iA2 = j1.a(obj6.hashCode());
                        while (true) {
                            int i27 = iA2 & i15;
                            char c13 = (char) sArr[i27];
                            if (c13 == 65535) {
                                sArr[i27] = (short) i25;
                                if (i23 < i24) {
                                    objArrCopyOf[i25] = obj6;
                                    objArrCopyOf[i25 ^ 1] = obj7;
                                }
                                i23++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c13])) {
                                int i28 = c13 ^ 1;
                                Object obj8 = objArrCopyOf[i28 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                s1 s1Var6 = new s1(obj6, obj7, obj8);
                                objArrCopyOf[i28 == true ? 1 : 0] = obj7;
                                s1Var4 = s1Var6;
                                break;
                            }
                            iA2 = i27 + 1;
                        }
                    }
                    if (i23 == i13) {
                        r12 = sArr;
                        z13 = z10;
                    } else {
                        r12 = new Object[]{sArr, Integer.valueOf(i23), s1Var4};
                        z13 = z10;
                    }
                } else {
                    int[] iArr = new int[iR];
                    Arrays.fill(iArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i13) {
                        int i31 = i30 + i30;
                        int i32 = i29 + i29;
                        Object obj9 = objArrCopyOf[i32];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i32 ^ 1];
                        Objects.requireNonNull(obj10);
                        y0.b(obj9, obj10);
                        int iA3 = j1.a(obj9.hashCode());
                        while (true) {
                            int i33 = iA3 & i15;
                            int i34 = iArr[i33];
                            if (i34 == -1) {
                                iArr[i33] = i31;
                                if (i30 < i29) {
                                    objArrCopyOf[i31] = obj9;
                                    objArrCopyOf[i31 ^ 1] = obj10;
                                }
                                i30++;
                                c11 = c12;
                                break;
                            }
                            c11 = c12;
                            if (obj9.equals(objArrCopyOf[i34])) {
                                int i35 = i34 ^ 1;
                                Object obj11 = objArrCopyOf[i35];
                                Objects.requireNonNull(obj11);
                                s1 s1Var7 = new s1(obj9, obj10, obj11);
                                objArrCopyOf[i35] = obj10;
                                s1Var2 = s1Var7;
                                break;
                            }
                            iA3 = i33 + 1;
                            c12 = c11;
                        }
                        i29++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i30 == i13) {
                        r10 = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i30);
                        objArr3[c10] = s1Var2;
                        r10 = objArr3;
                        r16 = z10;
                    }
                }
            }
            z12 = r10 instanceof Object[];
            r11 = r10;
            if (z12) {
                objArr2 = (Object[]) r10;
                s1Var = (s1) objArr2[c10];
                if (t1Var != null) {
                    throw s1Var.a();
                }
                t1Var.f109334c = s1Var;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r11 = obj12;
                i13 = iIntValue;
            }
            return new t2(r11, objArrCopyOf, i13);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        y0.b(obj13, obj14);
        z13 = false;
        i13 = 1;
        i11 = 1;
        c10 = 2;
        r10 = r12;
        r16 = z13;
        z12 = r10 instanceof Object[];
        r11 = r10;
        if (z12) {
            objArr2 = (Object[]) r10;
            s1Var = (s1) objArr2[c10];
            if (t1Var != null) {
                throw s1Var.a();
            }
            t1Var.f109334c = s1Var;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r11 = obj15;
            i13 = iIntValue2;
        }
        return new t2(r11, objArrCopyOf, i13);
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    final m1 a() {
        return new s2(this.f109337e, 1, this.f109338f);
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    final y1 d() {
        return new q2(this, this.f109337e, 0, this.f109338f);
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    final y1 e() {
        return new r2(this, new s2(this.f109337e, 0, this.f109338f));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.u1, java.util.Map
    @fj.a
    public final Object get(@fj.a Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f109338f;
            Object[] objArr = this.f109337e;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f109336d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iA = j1.a(obj.hashCode());
                        while (true) {
                            int i11 = iA & length;
                            int i12 = bArr[i11] & 255;
                            if (i12 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                            } else {
                                iA = i11 + 1;
                            }
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iA2 = j1.a(obj.hashCode());
                        while (true) {
                            int i13 = iA2 & length2;
                            char c10 = (char) sArr[i13];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                            } else {
                                iA2 = i13 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iA3 = j1.a(obj.hashCode());
                        while (true) {
                            int i14 = iA3 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i15])) {
                                obj2 = objArr[i15 ^ 1];
                            } else {
                                iA3 = i14 + 1;
                            }
                        }
                    }
                }
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f109338f;
    }
}
