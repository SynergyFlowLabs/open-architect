package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.l1;

/* JADX INFO: loaded from: classes3.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f96384a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f96385b = new h<>();

    @l1
    static class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f96386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f96387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f96388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap.Config f96389d;

        public a(b bVar) {
            this.f96386a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f96386a.c(this);
        }

        public void b(int i10, int i11, Bitmap.Config config) {
            this.f96387b = i10;
            this.f96388c = i11;
            this.f96389d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f96387b == aVar.f96387b && this.f96388c == aVar.f96388c && this.f96389d == aVar.f96389d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f96387b * 31) + this.f96388c) * 31;
            Bitmap.Config config = this.f96389d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.d(this.f96387b, this.f96388c, this.f96389d);
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

        a e(int i10, int i11, Bitmap.Config config) {
            a aVarB = b();
            aVarB.b(i10, i11, config);
            return aVarB;
        }
    }

    c() {
    }

    static String d(int i10, int i11, Bitmap.Config config) {
        return "[" + i10 + "x" + i11 + "], " + config;
    }

    private static String g(Bitmap bitmap) {
        return d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.m.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap) {
        this.f96385b.d(this.f96384a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        return this.f96385b.a(this.f96384a.e(i10, i11, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap removeLast() {
        return this.f96385b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f96385b;
    }
}
