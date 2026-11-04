package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes3.dex */
@w0(19)
final class p implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f96438d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f96439a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f96440b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NavigableMap<Integer, Integer> f96441c = new n();

    @l1
    static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f96442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96443b;

        a(b bVar) {
            this.f96442a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f96442a.c(this);
        }

        public void b(int i10) {
            this.f96443b = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f96443b == ((a) obj).f96443b;
        }

        public int hashCode() {
            return this.f96443b;
        }

        public String toString() {
            return p.g(this.f96443b);
        }
    }

    @l1
    static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i10) {
            a aVar = (a) super.b();
            aVar.b(i10);
            return aVar;
        }
    }

    p() {
    }

    private void d(Integer num) {
        Integer num2 = this.f96441c.get(num);
        if (num2.intValue() == 1) {
            this.f96441c.remove(num);
        } else {
            this.f96441c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    static String g(int i10) {
        return "[" + i10 + "]";
    }

    private static String h(Bitmap bitmap) {
        return g(com.bumptech.glide.util.m.h(bitmap));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return g(com.bumptech.glide.util.m.g(i10, i11, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.m.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap) {
        a aVarE = this.f96439a.e(com.bumptech.glide.util.m.h(bitmap));
        this.f96440b.d(aVarE, bitmap);
        Integer num = this.f96441c.get(Integer.valueOf(aVarE.f96443b));
        this.f96441c.put(Integer.valueOf(aVarE.f96443b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @p0
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        int iG = com.bumptech.glide.util.m.g(i10, i11, config);
        a aVarE = this.f96439a.e(iG);
        Integer numCeilingKey = this.f96441c.ceilingKey(Integer.valueOf(iG));
        if (numCeilingKey != null && numCeilingKey.intValue() != iG && numCeilingKey.intValue() <= iG * 8) {
            this.f96439a.c(aVarE);
            aVarE = this.f96439a.e(numCeilingKey.intValue());
        }
        Bitmap bitmapA = this.f96440b.a(aVarE);
        if (bitmapA != null) {
            bitmapA.reconfigure(i10, i11, config);
            d(numCeilingKey);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @p0
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f96440b.f();
        if (bitmapF != null) {
            d(Integer.valueOf(com.bumptech.glide.util.m.h(bitmapF)));
        }
        return bitmapF;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f96440b + "\n  SortedSizes" + this.f96441c;
    }
}
