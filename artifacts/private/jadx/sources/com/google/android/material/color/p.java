package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import com.google.android.material.color.utilities.o6;
import com.google.android.material.color.utilities.z5;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o.f f112045e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o.e f112046f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g1
    private final int f112047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final o.f f112048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final o.e f112049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Integer f112050d;

    class a implements o.f {
        a() {
        }

        @Override // com.google.android.material.color.o.f
        public boolean a(@NonNull Activity activity, int i10) {
            return true;
        }
    }

    class b implements o.e {
        b() {
        }

        @Override // com.google.android.material.color.o.e
        public void a(@NonNull Activity activity) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g1
        private int f112051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private o.f f112052b = p.f112045e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private o.e f112053c = p.f112046f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Bitmap f112054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private Integer f112055e;

        @NonNull
        public p f() {
            return new p(this, null);
        }

        @NonNull
        @z7.a
        public c g(@androidx.annotation.l int i10) {
            this.f112054d = null;
            this.f112055e = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        @z7.a
        public c h(@NonNull Bitmap bitmap) {
            this.f112054d = bitmap;
            this.f112055e = null;
            return this;
        }

        @NonNull
        @z7.a
        public c i(@NonNull o.e eVar) {
            this.f112053c = eVar;
            return this;
        }

        @NonNull
        @z7.a
        public c j(@NonNull o.f fVar) {
            this.f112052b = fVar;
            return this;
        }

        @NonNull
        @z7.a
        public c k(@g1 int i10) {
            this.f112051a = i10;
            return this;
        }
    }

    /* synthetic */ p(c cVar, a aVar) {
        this(cVar);
    }

    private static int c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        int i10 = 5 >> 0;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return o6.a(z5.a(iArr, 128)).get(0).intValue();
    }

    @p0
    public Integer d() {
        return this.f112050d;
    }

    @NonNull
    public o.e e() {
        return this.f112049c;
    }

    @NonNull
    public o.f f() {
        return this.f112048b;
    }

    @g1
    public int g() {
        return this.f112047a;
    }

    private p(c cVar) {
        this.f112047a = cVar.f112051a;
        this.f112048b = cVar.f112052b;
        this.f112049c = cVar.f112053c;
        if (cVar.f112055e != null) {
            this.f112050d = cVar.f112055e;
        } else if (cVar.f112054d != null) {
            this.f112050d = Integer.valueOf(c(cVar.f112054d));
        }
    }
}
