package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.bumptech.glide.util.k;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l1
    static final Bitmap.Config f96719e = Bitmap.Config.RGB_565;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f96720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f96721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f96722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f96723d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f96724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f96725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f96726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f96727d;

        public a(int i10) {
            this(i10, i10);
        }

        d a() {
            return new d(this.f96724a, this.f96725b, this.f96726c, this.f96727d);
        }

        Bitmap.Config b() {
            return this.f96726c;
        }

        public a c(@p0 Bitmap.Config config) {
            this.f96726c = config;
            return this;
        }

        public a d(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.f96727d = i10;
            return this;
        }

        public a(int i10, int i11) {
            this.f96727d = 1;
            if (i10 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i11 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.f96724a = i10;
            this.f96725b = i11;
        }
    }

    d(int i10, int i11, Bitmap.Config config, int i12) {
        this.f96722c = (Bitmap.Config) k.e(config, "Config must not be null");
        this.f96720a = i10;
        this.f96721b = i11;
        this.f96723d = i12;
    }

    Bitmap.Config a() {
        return this.f96722c;
    }

    int b() {
        return this.f96721b;
    }

    int c() {
        return this.f96723d;
    }

    int d() {
        return this.f96720a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f96721b == dVar.f96721b && this.f96720a == dVar.f96720a && this.f96723d == dVar.f96723d && this.f96722c == dVar.f96722c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f96720a * 31) + this.f96721b) * 31) + this.f96722c.hashCode()) * 31) + this.f96723d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f96720a + ", height=" + this.f96721b + ", config=" + this.f96722c + ", weight=" + this.f96723d + AbstractJsonLexerKt.END_OBJ;
    }
}
