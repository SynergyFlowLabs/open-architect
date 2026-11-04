package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f38425b;

    @o2
    public static final class a extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f38429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f38430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f38431h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f38432i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f38426c = f10;
            this.f38427d = f11;
            this.f38428e = f12;
            this.f38429f = z10;
            this.f38430g = z11;
            this.f38431h = f13;
            this.f38432i = f14;
        }

        public static /* synthetic */ a k(a aVar, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f38426c;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f38427d;
            }
            if ((i10 & 4) != 0) {
                f12 = aVar.f38428e;
            }
            if ((i10 & 8) != 0) {
                z10 = aVar.f38429f;
            }
            if ((i10 & 16) != 0) {
                z11 = aVar.f38430g;
            }
            if ((i10 & 32) != 0) {
                f13 = aVar.f38431h;
            }
            if ((i10 & 64) != 0) {
                f14 = aVar.f38432i;
            }
            float f15 = f13;
            float f16 = f14;
            boolean z12 = z11;
            float f17 = f12;
            return aVar.j(f10, f11, f17, z10, z12, f15, f16);
        }

        public final float c() {
            return this.f38426c;
        }

        public final float d() {
            return this.f38427d;
        }

        public final float e() {
            return this.f38428e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.f38426c, aVar.f38426c) == 0 && Float.compare(this.f38427d, aVar.f38427d) == 0 && Float.compare(this.f38428e, aVar.f38428e) == 0 && this.f38429f == aVar.f38429f && this.f38430g == aVar.f38430g && Float.compare(this.f38431h, aVar.f38431h) == 0 && Float.compare(this.f38432i, aVar.f38432i) == 0) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f38429f;
        }

        public final boolean g() {
            return this.f38430g;
        }

        public final float h() {
            return this.f38431h;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f38426c) * 31) + Float.hashCode(this.f38427d)) * 31) + Float.hashCode(this.f38428e)) * 31) + Boolean.hashCode(this.f38429f)) * 31) + Boolean.hashCode(this.f38430g)) * 31) + Float.hashCode(this.f38431h)) * 31) + Float.hashCode(this.f38432i);
        }

        public final float i() {
            return this.f38432i;
        }

        @NotNull
        public final a j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            return new a(f10, f11, f12, z10, z11, f13, f14);
        }

        public final float l() {
            return this.f38431h;
        }

        public final float m() {
            return this.f38432i;
        }

        public final float n() {
            return this.f38426c;
        }

        public final float o() {
            return this.f38428e;
        }

        public final float p() {
            return this.f38427d;
        }

        public final boolean q() {
            return this.f38429f;
        }

        public final boolean r() {
            return this.f38430g;
        }

        @NotNull
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f38426c + ", verticalEllipseRadius=" + this.f38427d + ", theta=" + this.f38428e + ", isMoreThanHalf=" + this.f38429f + ", isPositiveArc=" + this.f38430g + ", arcStartX=" + this.f38431h + ", arcStartY=" + this.f38432i + ')';
        }
    }

    @o2
    public static final class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f38433c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    @o2
    public static final class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f38437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f38438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f38439h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f38434c = f10;
            this.f38435d = f11;
            this.f38436e = f12;
            this.f38437f = f13;
            this.f38438g = f14;
            this.f38439h = f15;
        }

        public static /* synthetic */ c j(c cVar, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = cVar.f38434c;
            }
            if ((i10 & 2) != 0) {
                f11 = cVar.f38435d;
            }
            if ((i10 & 4) != 0) {
                f12 = cVar.f38436e;
            }
            if ((i10 & 8) != 0) {
                f13 = cVar.f38437f;
            }
            if ((i10 & 16) != 0) {
                f14 = cVar.f38438g;
            }
            if ((i10 & 32) != 0) {
                f15 = cVar.f38439h;
            }
            float f16 = f14;
            float f17 = f15;
            return cVar.i(f10, f11, f12, f13, f16, f17);
        }

        public final float c() {
            return this.f38434c;
        }

        public final float d() {
            return this.f38435d;
        }

        public final float e() {
            return this.f38436e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f38434c, cVar.f38434c) == 0 && Float.compare(this.f38435d, cVar.f38435d) == 0 && Float.compare(this.f38436e, cVar.f38436e) == 0 && Float.compare(this.f38437f, cVar.f38437f) == 0 && Float.compare(this.f38438g, cVar.f38438g) == 0 && Float.compare(this.f38439h, cVar.f38439h) == 0;
        }

        public final float f() {
            return this.f38437f;
        }

        public final float g() {
            return this.f38438g;
        }

        public final float h() {
            return this.f38439h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f38434c) * 31) + Float.hashCode(this.f38435d)) * 31) + Float.hashCode(this.f38436e)) * 31) + Float.hashCode(this.f38437f)) * 31) + Float.hashCode(this.f38438g)) * 31) + Float.hashCode(this.f38439h);
        }

        @NotNull
        public final c i(float f10, float f11, float f12, float f13, float f14, float f15) {
            return new c(f10, f11, f12, f13, f14, f15);
        }

        public final float k() {
            return this.f38434c;
        }

        public final float l() {
            return this.f38436e;
        }

        public final float m() {
            return this.f38438g;
        }

        public final float n() {
            return this.f38435d;
        }

        public final float o() {
            return this.f38437f;
        }

        public final float p() {
            return this.f38439h;
        }

        @NotNull
        public String toString() {
            return "CurveTo(x1=" + this.f38434c + ", y1=" + this.f38435d + ", x2=" + this.f38436e + ", y2=" + this.f38437f + ", x3=" + this.f38438g + ", y3=" + this.f38439h + ')';
        }
    }

    @o2
    public static final class d extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38440c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f38440c = f10;
        }

        public static /* synthetic */ d e(d dVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = dVar.f38440c;
            }
            return dVar.d(f10);
        }

        public final float c() {
            return this.f38440c;
        }

        @NotNull
        public final d d(float f10) {
            return new d(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f38440c, ((d) obj).f38440c) == 0;
        }

        public final float f() {
            return this.f38440c;
        }

        public int hashCode() {
            return Float.hashCode(this.f38440c);
        }

        @NotNull
        public String toString() {
            return "HorizontalTo(x=" + this.f38440c + ')';
        }
    }

    @o2
    public static final class e extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38442d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f38441c = f10;
            this.f38442d = f11;
        }

        public static /* synthetic */ e f(e eVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = eVar.f38441c;
            }
            if ((i10 & 2) != 0) {
                f11 = eVar.f38442d;
            }
            return eVar.e(f10, f11);
        }

        public final float c() {
            return this.f38441c;
        }

        public final float d() {
            return this.f38442d;
        }

        @NotNull
        public final e e(float f10, float f11) {
            return new e(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f38441c, eVar.f38441c) == 0 && Float.compare(this.f38442d, eVar.f38442d) == 0;
        }

        public final float g() {
            return this.f38441c;
        }

        public final float h() {
            return this.f38442d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f38441c) * 31) + Float.hashCode(this.f38442d);
        }

        @NotNull
        public String toString() {
            return "LineTo(x=" + this.f38441c + ", y=" + this.f38442d + ')';
        }
    }

    @o2
    public static final class f extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38444d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f38443c = f10;
            this.f38444d = f11;
        }

        public static /* synthetic */ f f(f fVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = fVar.f38443c;
            }
            if ((i10 & 2) != 0) {
                f11 = fVar.f38444d;
            }
            return fVar.e(f10, f11);
        }

        public final float c() {
            return this.f38443c;
        }

        public final float d() {
            return this.f38444d;
        }

        @NotNull
        public final f e(float f10, float f11) {
            return new f(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f38443c, fVar.f38443c) == 0 && Float.compare(this.f38444d, fVar.f38444d) == 0;
        }

        public final float g() {
            return this.f38443c;
        }

        public final float h() {
            return this.f38444d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f38443c) * 31) + Float.hashCode(this.f38444d);
        }

        @NotNull
        public String toString() {
            return "MoveTo(x=" + this.f38443c + ", y=" + this.f38444d + ')';
        }
    }

    @o2
    public static final class g extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f38448f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f38445c = f10;
            this.f38446d = f11;
            this.f38447e = f12;
            this.f38448f = f13;
        }

        public static /* synthetic */ g h(g gVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = gVar.f38445c;
            }
            if ((i10 & 2) != 0) {
                f11 = gVar.f38446d;
            }
            if ((i10 & 4) != 0) {
                f12 = gVar.f38447e;
            }
            if ((i10 & 8) != 0) {
                f13 = gVar.f38448f;
            }
            return gVar.g(f10, f11, f12, f13);
        }

        public final float c() {
            return this.f38445c;
        }

        public final float d() {
            return this.f38446d;
        }

        public final float e() {
            return this.f38447e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f38445c, gVar.f38445c) == 0 && Float.compare(this.f38446d, gVar.f38446d) == 0 && Float.compare(this.f38447e, gVar.f38447e) == 0 && Float.compare(this.f38448f, gVar.f38448f) == 0;
        }

        public final float f() {
            return this.f38448f;
        }

        @NotNull
        public final g g(float f10, float f11, float f12, float f13) {
            return new g(f10, f11, f12, f13);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f38445c) * 31) + Float.hashCode(this.f38446d)) * 31) + Float.hashCode(this.f38447e)) * 31) + Float.hashCode(this.f38448f);
        }

        public final float i() {
            return this.f38445c;
        }

        public final float j() {
            return this.f38447e;
        }

        public final float k() {
            return this.f38446d;
        }

        public final float l() {
            return this.f38448f;
        }

        @NotNull
        public String toString() {
            return "QuadTo(x1=" + this.f38445c + ", y1=" + this.f38446d + ", x2=" + this.f38447e + ", y2=" + this.f38448f + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.h$h, reason: collision with other inner class name */
    @o2
    public static final class C0293h extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f38452f;

        public C0293h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f38449c = f10;
            this.f38450d = f11;
            this.f38451e = f12;
            this.f38452f = f13;
        }

        public static /* synthetic */ C0293h h(C0293h c0293h, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = c0293h.f38449c;
            }
            if ((i10 & 2) != 0) {
                f11 = c0293h.f38450d;
            }
            if ((i10 & 4) != 0) {
                f12 = c0293h.f38451e;
            }
            if ((i10 & 8) != 0) {
                f13 = c0293h.f38452f;
            }
            return c0293h.g(f10, f11, f12, f13);
        }

        public final float c() {
            return this.f38449c;
        }

        public final float d() {
            return this.f38450d;
        }

        public final float e() {
            return this.f38451e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0293h)) {
                return false;
            }
            C0293h c0293h = (C0293h) obj;
            return Float.compare(this.f38449c, c0293h.f38449c) == 0 && Float.compare(this.f38450d, c0293h.f38450d) == 0 && Float.compare(this.f38451e, c0293h.f38451e) == 0 && Float.compare(this.f38452f, c0293h.f38452f) == 0;
        }

        public final float f() {
            return this.f38452f;
        }

        @NotNull
        public final C0293h g(float f10, float f11, float f12, float f13) {
            return new C0293h(f10, f11, f12, f13);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f38449c) * 31) + Float.hashCode(this.f38450d)) * 31) + Float.hashCode(this.f38451e)) * 31) + Float.hashCode(this.f38452f);
        }

        public final float i() {
            return this.f38449c;
        }

        public final float j() {
            return this.f38451e;
        }

        public final float k() {
            return this.f38450d;
        }

        public final float l() {
            return this.f38452f;
        }

        @NotNull
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f38449c + ", y1=" + this.f38450d + ", x2=" + this.f38451e + ", y2=" + this.f38452f + ')';
        }
    }

    @o2
    public static final class i extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38454d;

        public i(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f38453c = f10;
            this.f38454d = f11;
        }

        public static /* synthetic */ i f(i iVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = iVar.f38453c;
            }
            if ((i10 & 2) != 0) {
                f11 = iVar.f38454d;
            }
            return iVar.e(f10, f11);
        }

        public final float c() {
            return this.f38453c;
        }

        public final float d() {
            return this.f38454d;
        }

        @NotNull
        public final i e(float f10, float f11) {
            return new i(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f38453c, iVar.f38453c) == 0 && Float.compare(this.f38454d, iVar.f38454d) == 0;
        }

        public final float g() {
            return this.f38453c;
        }

        public final float h() {
            return this.f38454d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f38453c) * 31) + Float.hashCode(this.f38454d);
        }

        @NotNull
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f38453c + ", y=" + this.f38454d + ')';
        }
    }

    @o2
    public static final class j extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f38458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f38459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f38460h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f38461i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f38455c = f10;
            this.f38456d = f11;
            this.f38457e = f12;
            this.f38458f = z10;
            this.f38459g = z11;
            this.f38460h = f13;
            this.f38461i = f14;
        }

        public static /* synthetic */ j k(j jVar, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = jVar.f38455c;
            }
            if ((i10 & 2) != 0) {
                f11 = jVar.f38456d;
            }
            if ((i10 & 4) != 0) {
                f12 = jVar.f38457e;
            }
            if ((i10 & 8) != 0) {
                z10 = jVar.f38458f;
            }
            if ((i10 & 16) != 0) {
                z11 = jVar.f38459g;
            }
            if ((i10 & 32) != 0) {
                f13 = jVar.f38460h;
            }
            if ((i10 & 64) != 0) {
                f14 = jVar.f38461i;
            }
            float f15 = f13;
            float f16 = f14;
            boolean z12 = z11;
            float f17 = f12;
            return jVar.j(f10, f11, f17, z10, z12, f15, f16);
        }

        public final float c() {
            return this.f38455c;
        }

        public final float d() {
            return this.f38456d;
        }

        public final float e() {
            return this.f38457e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f38455c, jVar.f38455c) == 0 && Float.compare(this.f38456d, jVar.f38456d) == 0 && Float.compare(this.f38457e, jVar.f38457e) == 0 && this.f38458f == jVar.f38458f && this.f38459g == jVar.f38459g && Float.compare(this.f38460h, jVar.f38460h) == 0 && Float.compare(this.f38461i, jVar.f38461i) == 0;
        }

        public final boolean f() {
            return this.f38458f;
        }

        public final boolean g() {
            return this.f38459g;
        }

        public final float h() {
            return this.f38460h;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f38455c) * 31) + Float.hashCode(this.f38456d)) * 31) + Float.hashCode(this.f38457e)) * 31) + Boolean.hashCode(this.f38458f)) * 31) + Boolean.hashCode(this.f38459g)) * 31) + Float.hashCode(this.f38460h)) * 31) + Float.hashCode(this.f38461i);
        }

        public final float i() {
            return this.f38461i;
        }

        @NotNull
        public final j j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            return new j(f10, f11, f12, z10, z11, f13, f14);
        }

        public final float l() {
            return this.f38460h;
        }

        public final float m() {
            return this.f38461i;
        }

        public final float n() {
            return this.f38455c;
        }

        public final float o() {
            return this.f38457e;
        }

        public final float p() {
            return this.f38456d;
        }

        public final boolean q() {
            return this.f38458f;
        }

        public final boolean r() {
            return this.f38459g;
        }

        @NotNull
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f38455c + ", verticalEllipseRadius=" + this.f38456d + ", theta=" + this.f38457e + ", isMoreThanHalf=" + this.f38458f + ", isPositiveArc=" + this.f38459g + ", arcStartDx=" + this.f38460h + ", arcStartDy=" + this.f38461i + ')';
        }
    }

    @o2
    public static final class k extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f38465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f38466g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f38467h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f38462c = f10;
            this.f38463d = f11;
            this.f38464e = f12;
            this.f38465f = f13;
            this.f38466g = f14;
            this.f38467h = f15;
        }

        public static /* synthetic */ k j(k kVar, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = kVar.f38462c;
            }
            if ((i10 & 2) != 0) {
                f11 = kVar.f38463d;
            }
            if ((i10 & 4) != 0) {
                f12 = kVar.f38464e;
            }
            if ((i10 & 8) != 0) {
                f13 = kVar.f38465f;
            }
            if ((i10 & 16) != 0) {
                f14 = kVar.f38466g;
            }
            if ((i10 & 32) != 0) {
                f15 = kVar.f38467h;
            }
            float f16 = f14;
            float f17 = f15;
            return kVar.i(f10, f11, f12, f13, f16, f17);
        }

        public final float c() {
            return this.f38462c;
        }

        public final float d() {
            return this.f38463d;
        }

        public final float e() {
            return this.f38464e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f38462c, kVar.f38462c) == 0 && Float.compare(this.f38463d, kVar.f38463d) == 0 && Float.compare(this.f38464e, kVar.f38464e) == 0 && Float.compare(this.f38465f, kVar.f38465f) == 0 && Float.compare(this.f38466g, kVar.f38466g) == 0 && Float.compare(this.f38467h, kVar.f38467h) == 0;
        }

        public final float f() {
            return this.f38465f;
        }

        public final float g() {
            return this.f38466g;
        }

        public final float h() {
            return this.f38467h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f38462c) * 31) + Float.hashCode(this.f38463d)) * 31) + Float.hashCode(this.f38464e)) * 31) + Float.hashCode(this.f38465f)) * 31) + Float.hashCode(this.f38466g)) * 31) + Float.hashCode(this.f38467h);
        }

        @NotNull
        public final k i(float f10, float f11, float f12, float f13, float f14, float f15) {
            return new k(f10, f11, f12, f13, f14, f15);
        }

        public final float k() {
            return this.f38462c;
        }

        public final float l() {
            return this.f38464e;
        }

        public final float m() {
            return this.f38466g;
        }

        public final float n() {
            return this.f38463d;
        }

        public final float o() {
            return this.f38465f;
        }

        public final float p() {
            return this.f38467h;
        }

        @NotNull
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f38462c + ", dy1=" + this.f38463d + ", dx2=" + this.f38464e + ", dy2=" + this.f38465f + ", dx3=" + this.f38466g + ", dy3=" + this.f38467h + ')';
        }
    }

    @o2
    public static final class l extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38468c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f38468c = f10;
        }

        public static /* synthetic */ l e(l lVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = lVar.f38468c;
            }
            return lVar.d(f10);
        }

        public final float c() {
            return this.f38468c;
        }

        @NotNull
        public final l d(float f10) {
            return new l(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f38468c, ((l) obj).f38468c) == 0;
        }

        public final float f() {
            return this.f38468c;
        }

        public int hashCode() {
            return Float.hashCode(this.f38468c);
        }

        @NotNull
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f38468c + ')';
        }
    }

    @o2
    public static final class m extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38470d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f38469c = f10;
            this.f38470d = f11;
        }

        public static /* synthetic */ m f(m mVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = mVar.f38469c;
            }
            if ((i10 & 2) != 0) {
                f11 = mVar.f38470d;
            }
            return mVar.e(f10, f11);
        }

        public final float c() {
            return this.f38469c;
        }

        public final float d() {
            return this.f38470d;
        }

        @NotNull
        public final m e(float f10, float f11) {
            return new m(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f38469c, mVar.f38469c) == 0 && Float.compare(this.f38470d, mVar.f38470d) == 0;
        }

        public final float g() {
            return this.f38469c;
        }

        public final float h() {
            return this.f38470d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f38469c) * 31) + Float.hashCode(this.f38470d);
        }

        @NotNull
        public String toString() {
            return "RelativeLineTo(dx=" + this.f38469c + ", dy=" + this.f38470d + ')';
        }
    }

    @o2
    public static final class n extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38472d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f38471c = f10;
            this.f38472d = f11;
        }

        public static /* synthetic */ n f(n nVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = nVar.f38471c;
            }
            if ((i10 & 2) != 0) {
                f11 = nVar.f38472d;
            }
            return nVar.e(f10, f11);
        }

        public final float c() {
            return this.f38471c;
        }

        public final float d() {
            return this.f38472d;
        }

        @NotNull
        public final n e(float f10, float f11) {
            return new n(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f38471c, nVar.f38471c) == 0 && Float.compare(this.f38472d, nVar.f38472d) == 0;
        }

        public final float g() {
            return this.f38471c;
        }

        public final float h() {
            return this.f38472d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f38471c) * 31) + Float.hashCode(this.f38472d);
        }

        @NotNull
        public String toString() {
            return "RelativeMoveTo(dx=" + this.f38471c + ", dy=" + this.f38472d + ')';
        }
    }

    @o2
    public static final class o extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f38476f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f38473c = f10;
            this.f38474d = f11;
            this.f38475e = f12;
            this.f38476f = f13;
        }

        public static /* synthetic */ o h(o oVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = oVar.f38473c;
            }
            if ((i10 & 2) != 0) {
                f11 = oVar.f38474d;
            }
            if ((i10 & 4) != 0) {
                f12 = oVar.f38475e;
            }
            if ((i10 & 8) != 0) {
                f13 = oVar.f38476f;
            }
            return oVar.g(f10, f11, f12, f13);
        }

        public final float c() {
            return this.f38473c;
        }

        public final float d() {
            return this.f38474d;
        }

        public final float e() {
            return this.f38475e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f38473c, oVar.f38473c) == 0 && Float.compare(this.f38474d, oVar.f38474d) == 0 && Float.compare(this.f38475e, oVar.f38475e) == 0 && Float.compare(this.f38476f, oVar.f38476f) == 0;
        }

        public final float f() {
            return this.f38476f;
        }

        @NotNull
        public final o g(float f10, float f11, float f12, float f13) {
            return new o(f10, f11, f12, f13);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f38473c) * 31) + Float.hashCode(this.f38474d)) * 31) + Float.hashCode(this.f38475e)) * 31) + Float.hashCode(this.f38476f);
        }

        public final float i() {
            return this.f38473c;
        }

        public final float j() {
            return this.f38475e;
        }

        public final float k() {
            return this.f38474d;
        }

        public final float l() {
            return this.f38476f;
        }

        @NotNull
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f38473c + ", dy1=" + this.f38474d + ", dx2=" + this.f38475e + ", dy2=" + this.f38476f + ')';
        }
    }

    @o2
    public static final class p extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f38480f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f38477c = f10;
            this.f38478d = f11;
            this.f38479e = f12;
            this.f38480f = f13;
        }

        public static /* synthetic */ p h(p pVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = pVar.f38477c;
            }
            if ((i10 & 2) != 0) {
                f11 = pVar.f38478d;
            }
            if ((i10 & 4) != 0) {
                f12 = pVar.f38479e;
            }
            if ((i10 & 8) != 0) {
                f13 = pVar.f38480f;
            }
            return pVar.g(f10, f11, f12, f13);
        }

        public final float c() {
            return this.f38477c;
        }

        public final float d() {
            return this.f38478d;
        }

        public final float e() {
            return this.f38479e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f38477c, pVar.f38477c) == 0 && Float.compare(this.f38478d, pVar.f38478d) == 0 && Float.compare(this.f38479e, pVar.f38479e) == 0 && Float.compare(this.f38480f, pVar.f38480f) == 0;
        }

        public final float f() {
            return this.f38480f;
        }

        @NotNull
        public final p g(float f10, float f11, float f12, float f13) {
            return new p(f10, f11, f12, f13);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f38477c) * 31) + Float.hashCode(this.f38478d)) * 31) + Float.hashCode(this.f38479e)) * 31) + Float.hashCode(this.f38480f);
        }

        public final float i() {
            return this.f38477c;
        }

        public final float j() {
            return this.f38479e;
        }

        public final float k() {
            return this.f38478d;
        }

        public final float l() {
            return this.f38480f;
        }

        @NotNull
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f38477c + ", dy1=" + this.f38478d + ", dx2=" + this.f38479e + ", dy2=" + this.f38480f + ')';
        }
    }

    @o2
    public static final class q extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38482d;

        public q(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f38481c = f10;
            this.f38482d = f11;
        }

        public static /* synthetic */ q f(q qVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = qVar.f38481c;
            }
            if ((i10 & 2) != 0) {
                f11 = qVar.f38482d;
            }
            return qVar.e(f10, f11);
        }

        public final float c() {
            return this.f38481c;
        }

        public final float d() {
            return this.f38482d;
        }

        @NotNull
        public final q e(float f10, float f11) {
            return new q(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (Float.compare(this.f38481c, qVar.f38481c) == 0 && Float.compare(this.f38482d, qVar.f38482d) == 0) {
                return true;
            }
            return false;
        }

        public final float g() {
            return this.f38481c;
        }

        public final float h() {
            return this.f38482d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f38481c) * 31) + Float.hashCode(this.f38482d);
        }

        @NotNull
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f38481c + ", dy=" + this.f38482d + ')';
        }
    }

    @o2
    public static final class r extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38483c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f38483c = f10;
        }

        public static /* synthetic */ r e(r rVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = rVar.f38483c;
            }
            return rVar.d(f10);
        }

        public final float c() {
            return this.f38483c;
        }

        @NotNull
        public final r d(float f10) {
            return new r(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f38483c, ((r) obj).f38483c) == 0;
        }

        public final float f() {
            return this.f38483c;
        }

        public int hashCode() {
            return Float.hashCode(this.f38483c);
        }

        @NotNull
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f38483c + ')';
        }
    }

    @o2
    public static final class s extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f38484c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f38484c = f10;
        }

        public static /* synthetic */ s e(s sVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = sVar.f38484c;
            }
            return sVar.d(f10);
        }

        public final float c() {
            return this.f38484c;
        }

        @NotNull
        public final s d(float f10) {
            return new s(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f38484c, ((s) obj).f38484c) == 0;
        }

        public final float f() {
            return this.f38484c;
        }

        public int hashCode() {
            return Float.hashCode(this.f38484c);
        }

        @NotNull
        public String toString() {
            return "VerticalTo(y=" + this.f38484c + ')';
        }
    }

    public /* synthetic */ h(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    public final boolean a() {
        return this.f38424a;
    }

    public final boolean b() {
        return this.f38425b;
    }

    private h(boolean z10, boolean z11) {
        this.f38424a = z10;
        this.f38425b = z11;
    }

    public /* synthetic */ h(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
