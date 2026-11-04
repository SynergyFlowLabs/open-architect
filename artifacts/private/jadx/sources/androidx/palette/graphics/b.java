package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.graphics.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f72855f = 12544;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f72856g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final float f72857h = 3.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final float f72858i = 4.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f72859j = "Palette";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final boolean f72860k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final c f72861l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f72862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<androidx.palette.graphics.c> f72863b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f72865d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<androidx.palette.graphics.c, e> f72864c = new androidx.collection.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final e f72866e = a();

    static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final float f72867a = 0.05f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f72868b = 0.95f;

        a() {
        }

        private boolean b(float[] fArr) {
            return fArr[2] <= f72867a;
        }

        private boolean c(float[] fArr) {
            float f10 = fArr[0];
            return f10 >= 10.0f && f10 <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean d(float[] fArr) {
            return fArr[2] >= f72868b;
        }

        @Override // androidx.palette.graphics.b.c
        public boolean a(int i10, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }
    }

    public interface c {
        boolean a(@l int i10, @NonNull float[] fArr);
    }

    public interface d {
        void a(@p0 b bVar);
    }

    b(List<e> list, List<androidx.palette.graphics.c> list2) {
        this.f72862a = list;
        this.f72863b = list2;
    }

    private boolean D(e eVar, androidx.palette.graphics.c cVar) {
        float[] fArrC = eVar.c();
        return fArrC[1] >= cVar.e() && fArrC[1] <= cVar.c() && fArrC[2] >= cVar.d() && fArrC[2] <= cVar.b() && !this.f72865d.get(eVar.e());
    }

    @p0
    private e a() {
        int size = this.f72862a.size();
        int iD = Integer.MIN_VALUE;
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = this.f72862a.get(i10);
            if (eVar2.d() > iD) {
                iD = eVar2.d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    @NonNull
    public static C0691b b(@NonNull Bitmap bitmap) {
        return new C0691b(bitmap);
    }

    @NonNull
    public static b c(@NonNull List<e> list) {
        return new C0691b(list).g();
    }

    @Deprecated
    public static b d(Bitmap bitmap) {
        return b(bitmap).g();
    }

    @Deprecated
    public static b e(Bitmap bitmap, int i10) {
        return b(bitmap).i(i10).g();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, b> g(Bitmap bitmap, int i10, d dVar) {
        return b(bitmap).i(i10).f(dVar);
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, b> h(Bitmap bitmap, d dVar) {
        return b(bitmap).f(dVar);
    }

    private float i(e eVar, androidx.palette.graphics.c cVar) {
        float[] fArrC = eVar.c();
        e eVar2 = this.f72866e;
        return (cVar.g() > 0.0f ? cVar.g() * (1.0f - Math.abs(fArrC[1] - cVar.i())) : 0.0f) + (cVar.a() > 0.0f ? cVar.a() * (1.0f - Math.abs(fArrC[2] - cVar.h())) : 0.0f) + (cVar.f() > 0.0f ? cVar.f() * (eVar.d() / (eVar2 != null ? eVar2.d() : 1)) : 0.0f);
    }

    @p0
    private e j(androidx.palette.graphics.c cVar) {
        e eVarV = v(cVar);
        if (eVarV != null && cVar.j()) {
            this.f72865d.append(eVarV.e(), true);
        }
        return eVarV;
    }

    @p0
    private e v(androidx.palette.graphics.c cVar) {
        int size = this.f72862a.size();
        float f10 = 0.0f;
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = this.f72862a.get(i10);
            if (D(eVar2, cVar)) {
                float fI = i(eVar2, cVar);
                if (eVar == null || fI > f10) {
                    eVar = eVar2;
                    f10 = fI;
                }
            }
        }
        return eVar;
    }

    @NonNull
    public List<androidx.palette.graphics.c> A() {
        return Collections.unmodifiableList(this.f72863b);
    }

    @l
    public int B(@l int i10) {
        return k(androidx.palette.graphics.c.f72909z, i10);
    }

    @p0
    public e C() {
        return y(androidx.palette.graphics.c.f72909z);
    }

    void f() {
        int size = this.f72863b.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.palette.graphics.c cVar = this.f72863b.get(i10);
            cVar.k();
            this.f72864c.put(cVar, j(cVar));
        }
        this.f72865d.clear();
    }

    @l
    public int k(@NonNull androidx.palette.graphics.c cVar, @l int i10) {
        e eVarY = y(cVar);
        return eVarY != null ? eVarY.e() : i10;
    }

    @l
    public int l(@l int i10) {
        return k(androidx.palette.graphics.c.D, i10);
    }

    @p0
    public e m() {
        return y(androidx.palette.graphics.c.D);
    }

    @l
    public int n(@l int i10) {
        return k(androidx.palette.graphics.c.A, i10);
    }

    @p0
    public e o() {
        return y(androidx.palette.graphics.c.A);
    }

    @l
    public int p(@l int i10) {
        e eVar = this.f72866e;
        return eVar != null ? eVar.e() : i10;
    }

    @p0
    public e q() {
        return this.f72866e;
    }

    @l
    public int r(@l int i10) {
        return k(androidx.palette.graphics.c.B, i10);
    }

    @p0
    public e s() {
        return y(androidx.palette.graphics.c.B);
    }

    @l
    public int t(@l int i10) {
        return k(androidx.palette.graphics.c.f72908y, i10);
    }

    @p0
    public e u() {
        return y(androidx.palette.graphics.c.f72908y);
    }

    @l
    public int w(@l int i10) {
        return k(androidx.palette.graphics.c.C, i10);
    }

    @p0
    public e x() {
        return y(androidx.palette.graphics.c.C);
    }

    @p0
    public e y(@NonNull androidx.palette.graphics.c cVar) {
        return this.f72864c.get(cVar);
    }

    @NonNull
    public List<e> z() {
        return Collections.unmodifiableList(this.f72862a);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f72882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f72883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f72884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f72885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f72886h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        private float[] f72887i;

        public e(@l int i10, int i11) {
            this.f72879a = Color.red(i10);
            this.f72880b = Color.green(i10);
            this.f72881c = Color.blue(i10);
            this.f72882d = i10;
            this.f72883e = i11;
        }

        private void a() {
            if (this.f72884f) {
                return;
            }
            int iO = h.o(-1, this.f72882d, b.f72858i);
            int iO2 = h.o(-1, this.f72882d, b.f72857h);
            if (iO != -1 && iO2 != -1) {
                this.f72886h = h.D(-1, iO);
                this.f72885g = h.D(-1, iO2);
                this.f72884f = true;
                return;
            }
            int iO3 = h.o(-16777216, this.f72882d, b.f72858i);
            int iO4 = h.o(-16777216, this.f72882d, b.f72857h);
            if (iO3 == -1 || iO4 == -1) {
                this.f72886h = iO != -1 ? h.D(-1, iO) : h.D(-16777216, iO3);
                this.f72885g = iO2 != -1 ? h.D(-1, iO2) : h.D(-16777216, iO4);
                this.f72884f = true;
            } else {
                this.f72886h = h.D(-16777216, iO3);
                this.f72885g = h.D(-16777216, iO4);
                this.f72884f = true;
            }
        }

        @l
        public int b() {
            a();
            return this.f72886h;
        }

        @NonNull
        public float[] c() {
            if (this.f72887i == null) {
                this.f72887i = new float[3];
            }
            h.e(this.f72879a, this.f72880b, this.f72881c, this.f72887i);
            return this.f72887i;
        }

        public int d() {
            return this.f72883e;
        }

        @l
        public int e() {
            return this.f72882d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f72883e == eVar.f72883e && this.f72882d == eVar.f72882d) {
                    return true;
                }
            }
            return false;
        }

        @l
        public int f() {
            a();
            return this.f72885g;
        }

        public int hashCode() {
            return (this.f72882d * 31) + this.f72883e;
        }

        public String toString() {
            return e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + AbstractJsonLexerKt.END_LIST + " [HSL: " + Arrays.toString(c()) + AbstractJsonLexerKt.END_LIST + " [Population: " + this.f72883e + AbstractJsonLexerKt.END_LIST + " [Title Text: #" + Integer.toHexString(f()) + AbstractJsonLexerKt.END_LIST + " [Body Text: #" + Integer.toHexString(b()) + AbstractJsonLexerKt.END_LIST;
        }

        e(int i10, int i11, int i12, int i13) {
            this.f72879a = i10;
            this.f72880b = i11;
            this.f72881c = i12;
            this.f72882d = Color.rgb(i10, i11, i12);
            this.f72883e = i13;
        }

        e(float[] fArr, int i10) {
            this(h.a(fArr), i10);
            this.f72887i = fArr;
        }
    }

    /* JADX INFO: renamed from: androidx.palette.graphics.b$b, reason: collision with other inner class name */
    public static final class C0691b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final List<e> f72869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final Bitmap f72870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<androidx.palette.graphics.c> f72871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f72872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f72873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f72874f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<c> f72875g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private Rect f72876h;

        /* JADX INFO: renamed from: androidx.palette.graphics.b$b$a */
        class a extends AsyncTask<Bitmap, Void, b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f72877a;

            a(d dVar) {
                this.f72877a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C0691b.this.g();
                } catch (Exception unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(@p0 b bVar) {
                this.f72877a.a(bVar);
            }
        }

        public C0691b(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f72871c = arrayList;
            this.f72872d = 16;
            this.f72873e = b.f72855f;
            this.f72874f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f72875g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f72861l);
            this.f72870b = bitmap;
            this.f72869a = null;
            arrayList.add(androidx.palette.graphics.c.f72908y);
            arrayList.add(androidx.palette.graphics.c.f72909z);
            arrayList.add(androidx.palette.graphics.c.A);
            arrayList.add(androidx.palette.graphics.c.B);
            arrayList.add(androidx.palette.graphics.c.C);
            arrayList.add(androidx.palette.graphics.c.D);
        }

        private int[] h(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f72876h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f72876h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i10 = 0; i10 < iHeight; i10++) {
                Rect rect2 = this.f72876h;
                System.arraycopy(iArr, ((rect2.top + i10) * width) + rect2.left, iArr2, i10 * iWidth, iWidth);
            }
            return iArr2;
        }

        private Bitmap l(Bitmap bitmap) {
            int iMax;
            int i10;
            double dSqrt = -1.0d;
            if (this.f72873e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i11 = this.f72873e;
                if (width > i11) {
                    dSqrt = Math.sqrt(((double) i11) / ((double) width));
                }
            } else if (this.f72874f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i10 = this.f72874f)) {
                dSqrt = ((double) i10) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }

        @NonNull
        public C0691b a(c cVar) {
            if (cVar != null) {
                this.f72875g.add(cVar);
            }
            return this;
        }

        @NonNull
        public C0691b b(@NonNull androidx.palette.graphics.c cVar) {
            if (!this.f72871c.contains(cVar)) {
                this.f72871c.add(cVar);
            }
            return this;
        }

        @NonNull
        public C0691b c() {
            this.f72875g.clear();
            return this;
        }

        @NonNull
        public C0691b d() {
            this.f72876h = null;
            return this;
        }

        @NonNull
        public C0691b e() {
            List<androidx.palette.graphics.c> list = this.f72871c;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @NonNull
        public AsyncTask<Bitmap, Void, b> f(@NonNull d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f72870b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        @NonNull
        public b g() {
            List<e> listD;
            c[] cVarArr;
            Bitmap bitmap = this.f72870b;
            if (bitmap != null) {
                Bitmap bitmapL = l(bitmap);
                Rect rect = this.f72876h;
                if (bitmapL != this.f72870b && rect != null) {
                    double width = ((double) bitmapL.getWidth()) / ((double) this.f72870b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapL.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapL.getHeight());
                }
                int[] iArrH = h(bitmapL);
                int i10 = this.f72872d;
                if (this.f72875g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list = this.f72875g;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                androidx.palette.graphics.a aVar = new androidx.palette.graphics.a(iArrH, i10, cVarArr);
                if (bitmapL != this.f72870b) {
                    bitmapL.recycle();
                }
                listD = aVar.d();
            } else {
                listD = this.f72869a;
                if (listD == null) {
                    throw new AssertionError();
                }
            }
            b bVar = new b(listD, this.f72871c);
            bVar.f();
            return bVar;
        }

        @NonNull
        public C0691b i(int i10) {
            this.f72872d = i10;
            return this;
        }

        @NonNull
        public C0691b j(int i10) {
            this.f72873e = i10;
            this.f72874f = -1;
            return this;
        }

        @NonNull
        @Deprecated
        public C0691b k(int i10) {
            this.f72874f = i10;
            this.f72873e = -1;
            return this;
        }

        @NonNull
        public C0691b m(@t0 int i10, @t0 int i11, @t0 int i12, @t0 int i13) {
            if (this.f72870b != null) {
                if (this.f72876h == null) {
                    this.f72876h = new Rect();
                }
                this.f72876h.set(0, 0, this.f72870b.getWidth(), this.f72870b.getHeight());
                if (!this.f72876h.intersect(i10, i11, i12, i13)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        public C0691b(@NonNull List<e> list) {
            this.f72871c = new ArrayList();
            this.f72872d = 16;
            this.f72873e = b.f72855f;
            this.f72874f = -1;
            ArrayList arrayList = new ArrayList();
            this.f72875g = arrayList;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("List of Swatches is not valid");
            }
            arrayList.add(b.f72861l);
            this.f72869a = list;
            this.f72870b = null;
        }
    }
}
