package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.p0;
import com.airbnb.lottie.w0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s implements com.airbnb.lottie.model.content.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f88501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f88502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.a f88503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f88504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f88505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f88506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f88507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f88508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f88509j;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88511b;

        static {
            int[] iArr = new int[c.values().length];
            f88511b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88511b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88511b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f88510a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88510a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88510a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap l() {
            int i10 = a.f88510a[ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join l() {
            int i10 = a.f88511b[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, @p0 com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f88500a = str;
        this.f88501b = bVar;
        this.f88502c = list;
        this.f88503d = aVar;
        this.f88504e = dVar;
        this.f88505f = bVar2;
        this.f88506g = bVar3;
        this.f88507h = cVar;
        this.f88508i = f10;
        this.f88509j = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.u(w0Var, bVar, this);
    }

    public b b() {
        return this.f88506g;
    }

    public com.airbnb.lottie.model.animatable.a c() {
        return this.f88503d;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f88501b;
    }

    public c e() {
        return this.f88507h;
    }

    public List<com.airbnb.lottie.model.animatable.b> f() {
        return this.f88502c;
    }

    public float g() {
        return this.f88508i;
    }

    public String h() {
        return this.f88500a;
    }

    public com.airbnb.lottie.model.animatable.d i() {
        return this.f88504e;
    }

    public com.airbnb.lottie.model.animatable.b j() {
        return this.f88505f;
    }

    public boolean k() {
        return this.f88509j;
    }
}
