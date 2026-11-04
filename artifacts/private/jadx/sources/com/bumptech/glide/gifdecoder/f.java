package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.fragment.app.t0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f implements a {
    private static final String A = "f";
    private static final int B = 4096;
    private static final int C = -1;
    private static final int D = -1;
    private static final int E = 4;
    private static final int F = 255;

    @l
    private static final int G = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    private int[] f96100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    private final int[] f96101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a.InterfaceC0851a f96102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ByteBuffer f96103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f96104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f96105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f96106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f96107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f96108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f96109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l
    private int[] f96110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f96111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f96112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bitmap f96113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f96114t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f96115u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f96116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f96117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f96118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private Boolean f96119y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    private Bitmap.Config f96120z;

    public f(@NonNull a.InterfaceC0851a interfaceC0851a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC0851a, cVar, byteBuffer, 1);
    }

    @l
    private int q(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f96116v + i10; i18++) {
            byte[] bArr = this.f96109o;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f96100f[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f96116v + i20; i21++) {
            byte[] bArr2 = this.f96109o;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f96100f[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void r(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f96110p;
        int i14 = bVar.f96053d;
        int i15 = this.f96116v;
        int i16 = i14 / i15;
        int i17 = bVar.f96051b / i15;
        int i18 = bVar.f96052c / i15;
        int i19 = bVar.f96050a / i15;
        boolean z10 = this.f96111q == 0;
        int i20 = this.f96118x;
        int i21 = this.f96117w;
        byte[] bArr = this.f96109o;
        int[] iArr2 = this.f96100f;
        Boolean bool = this.f96119y;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f96054e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f96052c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & 255];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int iQ = q(i32, i36, bVar.f96052c);
                        if (iQ != 0) {
                            iArr3[i37] = iQ;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                }
                i24++;
                i15 = i13;
                iArr = iArr3;
                i16 = i10;
                i23 = i12;
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f96119y == null) {
            this.f96119y = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void s(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f96110p;
        int i10 = bVar2.f96053d;
        int i11 = bVar2.f96051b;
        int i12 = bVar2.f96052c;
        int i13 = bVar2.f96050a;
        boolean z10 = this.f96111q == 0;
        int i14 = this.f96118x;
        byte[] bArr = this.f96109o;
        int[] iArr2 = this.f96100f;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f96052c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & 255;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f96119y;
        this.f96119y = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f96119y == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16, types: [short] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void u(b bVar) {
        int i10;
        int i11;
        short s10;
        f fVar = this;
        if (bVar != null) {
            fVar.f96103i.position(bVar.f96059j);
        }
        if (bVar == null) {
            c cVar = fVar.f96112r;
            i10 = cVar.f96068f;
            i11 = cVar.f96069g;
        } else {
            i10 = bVar.f96052c;
            i11 = bVar.f96053d;
        }
        int i12 = i10 * i11;
        byte[] bArr = fVar.f96109o;
        if (bArr == null || bArr.length < i12) {
            fVar.f96109o = fVar.f96102h.a(i12);
        }
        byte[] bArr2 = fVar.f96109o;
        if (fVar.f96106l == null) {
            fVar.f96106l = new short[4096];
        }
        short[] sArr = fVar.f96106l;
        if (fVar.f96107m == null) {
            fVar.f96107m = new byte[4096];
        }
        byte[] bArr3 = fVar.f96107m;
        if (fVar.f96108n == null) {
            fVar.f96108n = new byte[t0.I];
        }
        byte[] bArr4 = fVar.f96108n;
        int iY = fVar.y();
        int i13 = 1 << iY;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iY + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr3[i18] = (byte) i18;
        }
        byte[] bArr5 = fVar.f96104j;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iX = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (i22 < i12) {
            if (iX == 0) {
                iX = fVar.x();
                if (iX <= 0) {
                    fVar.f96115u = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr5[i23] & 255) << i24;
            i23++;
            iX--;
            int i30 = i24 + 8;
            i20 = i20;
            int i31 = i29;
            int i32 = i19;
            short[] sArr2 = sArr;
            int i33 = i28;
            while (true) {
                bArr3 = bArr3;
                if (i30 < i32) {
                    i28 = i33;
                    break;
                }
                int i34 = i25 & i21;
                i25 >>= i32;
                i30 -= i32;
                if (i34 == i13) {
                    i32 = i16;
                    i20 = i15;
                    i21 = i17;
                    i31 = -1;
                } else {
                    if (i34 == i14) {
                        i28 = i33;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i31 == -1) {
                        bArr2[i26] = bArr3[i34];
                        i26++;
                        i22++;
                        i31 = i34;
                        i33 = i31;
                        bArr4 = bArr6;
                    } else {
                        if (i34 >= i20) {
                            bArr6[i27] = (byte) i33;
                            i27++;
                            s10 = i31;
                        } else {
                            s10 = i34;
                        }
                        while (s10 >= i13) {
                            bArr6[i27] = bArr3[s10];
                            i27++;
                            s10 = sArr2[s10];
                        }
                        int i35 = bArr3[s10] & 255;
                        byte b11 = (byte) i35;
                        bArr2[i26] = b11;
                        while (true) {
                            i26++;
                            i22++;
                            if (i27 <= 0) {
                                break;
                            }
                            i27--;
                            bArr2[i26] = bArr6[i27];
                        }
                        if (i20 < 4096) {
                            sArr2[i20] = (short) i31;
                            bArr3[i20] = b11;
                            i20++;
                            if ((i20 & i21) == 0 && i20 < 4096) {
                                i32++;
                                i21 += i20;
                            }
                        }
                        i31 = i34;
                        bArr4 = bArr6;
                        i33 = i35;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr3 = bArr3;
            b10 = 0;
            i29 = i31;
            i19 = i32;
            fVar = this;
        }
        Arrays.fill(bArr2, i26, i12, b10);
    }

    @NonNull
    private d v() {
        if (this.f96105k == null) {
            this.f96105k = new d();
        }
        return this.f96105k;
    }

    private Bitmap w() {
        Boolean bool = this.f96119y;
        Bitmap bitmapB = this.f96102h.b(this.f96118x, this.f96117w, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f96120z);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    private int x() {
        int iY = y();
        if (iY <= 0) {
            return iY;
        }
        ByteBuffer byteBuffer = this.f96103i;
        byteBuffer.get(this.f96104j, 0, Math.min(iY, byteBuffer.remaining()));
        return iY;
    }

    private int y() {
        return this.f96103i.get() & 255;
    }

    private Bitmap z(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f96110p;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f96113s;
            if (bitmap2 != null) {
                this.f96102h.c(bitmap2);
            }
            this.f96113s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f96056g == 3 && this.f96113s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f96056g) > 0) {
            if (i11 == 2) {
                if (!bVar.f96055f) {
                    c cVar = this.f96112r;
                    int i13 = cVar.f96074l;
                    if (bVar.f96060k == null || cVar.f96072j != bVar.f96057h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f96053d;
                int i15 = this.f96116v;
                int i16 = i14 / i15;
                int i17 = bVar2.f96051b / i15;
                int i18 = bVar2.f96052c / i15;
                int i19 = bVar2.f96050a / i15;
                int i20 = this.f96118x;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f96118x;
                }
            } else if (i11 == 3 && (bitmap = this.f96113s) != null) {
                int i25 = this.f96118x;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f96117w);
            }
        }
        u(bVar);
        if (bVar.f96054e || this.f96116v != 1) {
            r(bVar);
        } else {
            s(bVar);
        }
        if (this.f96114t && ((i10 = bVar.f96056g) == 0 || i10 == 1)) {
            if (this.f96113s == null) {
                this.f96113s = w();
            }
            Bitmap bitmap3 = this.f96113s;
            int i26 = this.f96118x;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f96117w);
        }
        Bitmap bitmapW = w();
        int i27 = this.f96118x;
        bitmapW.setPixels(iArr, 0, i27, 0, 0, i27, this.f96117w);
        return bitmapW;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int a(@p0 InputStream inputStream, int i10) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10 > 0 ? i10 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i11 = inputStream.read(bArr, 0, 16384);
                    if (i11 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.f96115u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.f96115u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int b(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f96112r;
        if (i10 < cVar.f96065c) {
            return cVar.f96067e.get(i10).f96058i;
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void c(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f96120z = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.f96112r = null;
        byte[] bArr = this.f96109o;
        if (bArr != null) {
            this.f96102h.e(bArr);
        }
        int[] iArr = this.f96110p;
        if (iArr != null) {
            this.f96102h.f(iArr);
        }
        Bitmap bitmap = this.f96113s;
        if (bitmap != null) {
            this.f96102h.c(bitmap);
        }
        this.f96113s = null;
        this.f96103i = null;
        this.f96119y = null;
        byte[] bArr2 = this.f96104j;
        if (bArr2 != null) {
            this.f96102h.e(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @Deprecated
    public int d() {
        int i10 = this.f96112r.f96075m;
        if (i10 == -1) {
            i10 = 1;
        }
        return i10;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void e(@NonNull c cVar, @NonNull byte[] bArr) {
        n(cVar, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void f() {
        this.f96111q = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int g() {
        return this.f96111q;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @NonNull
    public ByteBuffer getData() {
        return this.f96103i;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getHeight() {
        return this.f96112r.f96069g;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getWidth() {
        return this.f96112r.f96068f;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int h() {
        return this.f96103i.limit() + this.f96109o.length + (this.f96110p.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @p0
    public synchronized Bitmap i() {
        try {
            if (this.f96112r.f96065c <= 0 || this.f96111q < 0) {
                if (Log.isLoggable(A, 3)) {
                    int i10 = this.f96112r.f96065c;
                }
                this.f96115u = 1;
            }
            int i11 = this.f96115u;
            if (i11 != 1 && i11 != 2) {
                this.f96115u = 0;
                if (this.f96104j == null) {
                    this.f96104j = this.f96102h.a(255);
                }
                b bVar = this.f96112r.f96067e.get(this.f96111q);
                int i12 = this.f96111q - 1;
                b bVar2 = i12 >= 0 ? this.f96112r.f96067e.get(i12) : null;
                int[] iArr = bVar.f96060k;
                if (iArr == null) {
                    iArr = this.f96112r.f96063a;
                }
                this.f96100f = iArr;
                if (iArr == null) {
                    this.f96115u = 1;
                    return null;
                }
                if (bVar.f96055f) {
                    System.arraycopy(iArr, 0, this.f96101g, 0, iArr.length);
                    int[] iArr2 = this.f96101g;
                    this.f96100f = iArr2;
                    iArr2[bVar.f96057h] = 0;
                    if (bVar.f96056g == 2 && this.f96111q == 0) {
                        this.f96119y = Boolean.TRUE;
                    }
                }
                return z(bVar, bVar2);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void j() {
        this.f96111q = (this.f96111q + 1) % this.f96112r.f96065c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int k() {
        return this.f96112r.f96065c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int l() {
        int i10 = this.f96112r.f96075m;
        if (i10 == -1) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int m() {
        int i10;
        if (this.f96112r.f96065c > 0 && (i10 = this.f96111q) >= 0) {
            return b(i10);
        }
        return 0;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void n(@NonNull c cVar, @NonNull ByteBuffer byteBuffer) {
        o(cVar, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void o(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f96115u = 0;
            this.f96112r = cVar;
            this.f96111q = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f96103i = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f96103i.order(ByteOrder.LITTLE_ENDIAN);
            this.f96114t = false;
            Iterator<b> it = cVar.f96067e.iterator();
            while (it.hasNext()) {
                if (it.next().f96056g == 3) {
                    this.f96114t = true;
                    break;
                }
            }
            this.f96116v = iHighestOneBit;
            int i11 = cVar.f96068f;
            this.f96118x = i11 / iHighestOneBit;
            int i12 = cVar.f96069g;
            this.f96117w = i12 / iHighestOneBit;
            this.f96109o = this.f96102h.a(i11 * i12);
            this.f96110p = this.f96102h.d(this.f96118x * this.f96117w);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int p() {
        return this.f96112r.f96075m;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized int read(@p0 byte[] bArr) {
        try {
            c cVarD = v().r(bArr).d();
            this.f96112r = cVarD;
            if (bArr != null) {
                e(cVarD, bArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f96115u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int t() {
        return this.f96115u;
    }

    public f(@NonNull a.InterfaceC0851a interfaceC0851a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0851a);
        o(cVar, byteBuffer, i10);
    }

    public f(@NonNull a.InterfaceC0851a interfaceC0851a) {
        this.f96101g = new int[256];
        this.f96120z = Bitmap.Config.ARGB_8888;
        this.f96102h = interfaceC0851a;
        this.f96112r = new c();
    }
}
