package com.planner5d.library.widget.editor.popup.itemproperties.pages.size;

import android.util.Pair;
import android.util.Range;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.a1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.canhub.cropper.core.CropImageOptions;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEditability;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemMaterialSets;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.walls.Wall;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.helper.a3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSizeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SizeViewModel.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/SizeViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1#2:482\n*E\n"})
public final class k0 extends f2 implements ze.a.InterfaceC2545a {
    public static final int Z = 8;

    @NotNull
    private final com.planner5d.library.math.m X;

    @NotNull
    private final ItemLayout Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.f2 f257443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f257444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.userimporteddata.n f257445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.projectresources.e f257446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t1 f257447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<androidx.lifecycle.w0<Function0<Unit>>> f257448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f257449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ze.a f257450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f257451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.l.c f257452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private b f257453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private a f257454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final a3 f257455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.e f257456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.a0 f257457o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.f0 f257458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.e f257459t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.e f257460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.m f257461w;

    public enum a {
        X,
        Y,
        Z;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f257466e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f257466e;
        }
    }

    private enum b {
        WIDTH,
        HEIGHT,
        DEPTH;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f257471e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f257471e;
        }
    }

    @w0(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f257472w = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.metricunit.a f257473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f257474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f257475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f257476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f257477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f257478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f257479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final Range<BigDecimal> f257480h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final Range<BigDecimal> f257481i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final Range<BigDecimal> f257482j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private final Range<BigDecimal> f257483k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        private final BigDecimal f257484l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private final BigDecimal f257485m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257486n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257487o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257488p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257489q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257490r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257491s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257492t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257493u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f257494v;

        public c(@NotNull com.planner5d.library.model.metricunit.a metricUnit, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull Range<BigDecimal> wallThicknessRange, @NotNull Range<BigDecimal> lengthRange, @NotNull Range<BigDecimal> positiveRange, @NotNull Range<BigDecimal> aboveRange, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull BigDecimal wallThickness, @NotNull BigDecimal length, @NotNull BigDecimal width, @NotNull BigDecimal height, @NotNull BigDecimal depth, @NotNull BigDecimal zPosition, @NotNull BigDecimal xPosition, @NotNull BigDecimal yPosition) {
            Intrinsics.checkNotNullParameter(metricUnit, "metricUnit");
            Intrinsics.checkNotNullParameter(wallThicknessRange, "wallThicknessRange");
            Intrinsics.checkNotNullParameter(lengthRange, "lengthRange");
            Intrinsics.checkNotNullParameter(positiveRange, "positiveRange");
            Intrinsics.checkNotNullParameter(aboveRange, "aboveRange");
            Intrinsics.checkNotNullParameter(wallThickness, "wallThickness");
            Intrinsics.checkNotNullParameter(length, "length");
            Intrinsics.checkNotNullParameter(width, "width");
            Intrinsics.checkNotNullParameter(height, "height");
            Intrinsics.checkNotNullParameter(depth, "depth");
            Intrinsics.checkNotNullParameter(zPosition, "zPosition");
            Intrinsics.checkNotNullParameter(xPosition, "xPosition");
            Intrinsics.checkNotNullParameter(yPosition, "yPosition");
            this.f257473a = metricUnit;
            this.f257474b = z10;
            this.f257475c = z11;
            this.f257476d = z12;
            this.f257477e = z13;
            this.f257478f = z14;
            this.f257479g = z15;
            this.f257480h = wallThicknessRange;
            this.f257481i = lengthRange;
            this.f257482j = positiveRange;
            this.f257483k = aboveRange;
            this.f257484l = bigDecimal;
            this.f257485m = bigDecimal2;
            this.f257486n = wallThickness;
            this.f257487o = length;
            this.f257488p = width;
            this.f257489q = height;
            this.f257490r = depth;
            this.f257491s = zPosition;
            this.f257492t = xPosition;
            this.f257493u = yPosition;
            this.f257494v = z10 || z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c w(c cVar, com.planner5d.library.model.metricunit.a aVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, Range range2, Range range3, Range range4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, int i10, Object obj) {
            BigDecimal bigDecimal11;
            BigDecimal bigDecimal12;
            com.planner5d.library.model.metricunit.a aVar2 = (i10 & 1) != 0 ? cVar.f257473a : aVar;
            boolean z16 = (i10 & 2) != 0 ? cVar.f257474b : z10;
            boolean z17 = (i10 & 4) != 0 ? cVar.f257475c : z11;
            boolean z18 = (i10 & 8) != 0 ? cVar.f257476d : z12;
            boolean z19 = (i10 & 16) != 0 ? cVar.f257477e : z13;
            boolean z20 = (i10 & 32) != 0 ? cVar.f257478f : z14;
            boolean z21 = (i10 & 64) != 0 ? cVar.f257479g : z15;
            Range range5 = (i10 & 128) != 0 ? cVar.f257480h : range;
            Range range6 = (i10 & 256) != 0 ? cVar.f257481i : range2;
            Range range7 = (i10 & 512) != 0 ? cVar.f257482j : range3;
            Range range8 = (i10 & 1024) != 0 ? cVar.f257483k : range4;
            BigDecimal bigDecimal13 = (i10 & 2048) != 0 ? cVar.f257484l : bigDecimal;
            BigDecimal bigDecimal14 = (i10 & 4096) != 0 ? cVar.f257485m : bigDecimal2;
            BigDecimal bigDecimal15 = (i10 & 8192) != 0 ? cVar.f257486n : bigDecimal3;
            com.planner5d.library.model.metricunit.a aVar3 = aVar2;
            BigDecimal bigDecimal16 = (i10 & 16384) != 0 ? cVar.f257487o : bigDecimal4;
            BigDecimal bigDecimal17 = (i10 & 32768) != 0 ? cVar.f257488p : bigDecimal5;
            BigDecimal bigDecimal18 = (i10 & 65536) != 0 ? cVar.f257489q : bigDecimal6;
            BigDecimal bigDecimal19 = (i10 & 131072) != 0 ? cVar.f257490r : bigDecimal7;
            BigDecimal bigDecimal20 = (i10 & 262144) != 0 ? cVar.f257491s : bigDecimal8;
            BigDecimal bigDecimal21 = (i10 & 524288) != 0 ? cVar.f257492t : bigDecimal9;
            if ((i10 & 1048576) != 0) {
                bigDecimal12 = bigDecimal21;
                bigDecimal11 = cVar.f257493u;
            } else {
                bigDecimal11 = bigDecimal10;
                bigDecimal12 = bigDecimal21;
            }
            return cVar.v(aVar3, z16, z17, z18, z19, z20, z21, range5, range6, range7, range8, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal12, bigDecimal11);
        }

        @NotNull
        public final BigDecimal A() {
            return this.f257490r;
        }

        @NotNull
        public final BigDecimal B() {
            return this.f257489q;
        }

        @NotNull
        public final BigDecimal C() {
            return this.f257487o;
        }

        @NotNull
        public final Range<BigDecimal> D() {
            return this.f257481i;
        }

        public final boolean E() {
            return this.f257475c;
        }

        @NotNull
        public final com.planner5d.library.model.metricunit.a F() {
            return this.f257473a;
        }

        public final boolean G() {
            return this.f257477e;
        }

        @NotNull
        public final Range<BigDecimal> H() {
            return this.f257482j;
        }

        public final boolean I() {
            return this.f257476d;
        }

        public final boolean J() {
            return this.f257494v;
        }

        public final boolean K() {
            return this.f257474b;
        }

        @Nullable
        public final BigDecimal L() {
            return this.f257485m;
        }

        @NotNull
        public final BigDecimal M() {
            return this.f257486n;
        }

        @NotNull
        public final Range<BigDecimal> N() {
            return this.f257480h;
        }

        @Nullable
        public final BigDecimal O() {
            return this.f257484l;
        }

        @NotNull
        public final BigDecimal P() {
            return this.f257488p;
        }

        @NotNull
        public final BigDecimal Q() {
            return this.f257492t;
        }

        @NotNull
        public final BigDecimal R() {
            return this.f257493u;
        }

        @NotNull
        public final BigDecimal S() {
            return this.f257491s;
        }

        @NotNull
        public final com.planner5d.library.model.metricunit.a a() {
            return this.f257473a;
        }

        @NotNull
        public final Range<BigDecimal> b() {
            return this.f257482j;
        }

        @NotNull
        public final Range<BigDecimal> c() {
            return this.f257483k;
        }

        @Nullable
        public final BigDecimal d() {
            return this.f257484l;
        }

        @Nullable
        public final BigDecimal e() {
            return this.f257485m;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f257473a, cVar.f257473a) && this.f257474b == cVar.f257474b && this.f257475c == cVar.f257475c && this.f257476d == cVar.f257476d && this.f257477e == cVar.f257477e && this.f257478f == cVar.f257478f && this.f257479g == cVar.f257479g && Intrinsics.areEqual(this.f257480h, cVar.f257480h) && Intrinsics.areEqual(this.f257481i, cVar.f257481i) && Intrinsics.areEqual(this.f257482j, cVar.f257482j) && Intrinsics.areEqual(this.f257483k, cVar.f257483k) && Intrinsics.areEqual(this.f257484l, cVar.f257484l) && Intrinsics.areEqual(this.f257485m, cVar.f257485m) && Intrinsics.areEqual(this.f257486n, cVar.f257486n) && Intrinsics.areEqual(this.f257487o, cVar.f257487o) && Intrinsics.areEqual(this.f257488p, cVar.f257488p) && Intrinsics.areEqual(this.f257489q, cVar.f257489q) && Intrinsics.areEqual(this.f257490r, cVar.f257490r) && Intrinsics.areEqual(this.f257491s, cVar.f257491s) && Intrinsics.areEqual(this.f257492t, cVar.f257492t) && Intrinsics.areEqual(this.f257493u, cVar.f257493u);
        }

        @NotNull
        public final BigDecimal f() {
            return this.f257486n;
        }

        @NotNull
        public final BigDecimal g() {
            return this.f257487o;
        }

        @NotNull
        public final BigDecimal h() {
            return this.f257488p;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.f257473a.hashCode() * 31) + Boolean.hashCode(this.f257474b)) * 31) + Boolean.hashCode(this.f257475c)) * 31) + Boolean.hashCode(this.f257476d)) * 31) + Boolean.hashCode(this.f257477e)) * 31) + Boolean.hashCode(this.f257478f)) * 31) + Boolean.hashCode(this.f257479g)) * 31) + this.f257480h.hashCode()) * 31) + this.f257481i.hashCode()) * 31) + this.f257482j.hashCode()) * 31) + this.f257483k.hashCode()) * 31;
            BigDecimal bigDecimal = this.f257484l;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.f257485m;
            return ((((((((((((((((iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31) + this.f257486n.hashCode()) * 31) + this.f257487o.hashCode()) * 31) + this.f257488p.hashCode()) * 31) + this.f257489q.hashCode()) * 31) + this.f257490r.hashCode()) * 31) + this.f257491s.hashCode()) * 31) + this.f257492t.hashCode()) * 31) + this.f257493u.hashCode();
        }

        @NotNull
        public final BigDecimal i() {
            return this.f257489q;
        }

        @NotNull
        public final BigDecimal j() {
            return this.f257490r;
        }

        @NotNull
        public final BigDecimal k() {
            return this.f257491s;
        }

        public final boolean l() {
            return this.f257474b;
        }

        @NotNull
        public final BigDecimal m() {
            return this.f257492t;
        }

        @NotNull
        public final BigDecimal n() {
            return this.f257493u;
        }

        public final boolean o() {
            return this.f257475c;
        }

        public final boolean p() {
            return this.f257476d;
        }

        public final boolean q() {
            return this.f257477e;
        }

        public final boolean r() {
            return this.f257478f;
        }

        public final boolean s() {
            return this.f257479g;
        }

        @NotNull
        public final Range<BigDecimal> t() {
            return this.f257480h;
        }

        @NotNull
        public String toString() {
            return "SizeAndPositionConfig(metricUnit=" + this.f257473a + ", thicknessVisible=" + this.f257474b + ", lengthVisible=" + this.f257475c + ", sizeEditable=" + this.f257476d + ", positionEditable=" + this.f257477e + ", canRotateZ=" + this.f257478f + ", canRotateX=" + this.f257479g + ", wallThicknessRange=" + this.f257480h + ", lengthRange=" + this.f257481i + ", positiveRange=" + this.f257482j + ", aboveRange=" + this.f257483k + ", wallTop=" + this.f257484l + ", wallBottom=" + this.f257485m + ", wallThickness=" + this.f257486n + ", length=" + this.f257487o + ", width=" + this.f257488p + ", height=" + this.f257489q + ", depth=" + this.f257490r + ", zPosition=" + this.f257491s + ", xPosition=" + this.f257492t + ", yPosition=" + this.f257493u + ")";
        }

        @NotNull
        public final Range<BigDecimal> u() {
            return this.f257481i;
        }

        @NotNull
        public final c v(@NotNull com.planner5d.library.model.metricunit.a metricUnit, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull Range<BigDecimal> wallThicknessRange, @NotNull Range<BigDecimal> lengthRange, @NotNull Range<BigDecimal> positiveRange, @NotNull Range<BigDecimal> aboveRange, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull BigDecimal wallThickness, @NotNull BigDecimal length, @NotNull BigDecimal width, @NotNull BigDecimal height, @NotNull BigDecimal depth, @NotNull BigDecimal zPosition, @NotNull BigDecimal xPosition, @NotNull BigDecimal yPosition) {
            Intrinsics.checkNotNullParameter(metricUnit, "metricUnit");
            Intrinsics.checkNotNullParameter(wallThicknessRange, "wallThicknessRange");
            Intrinsics.checkNotNullParameter(lengthRange, "lengthRange");
            Intrinsics.checkNotNullParameter(positiveRange, "positiveRange");
            Intrinsics.checkNotNullParameter(aboveRange, "aboveRange");
            Intrinsics.checkNotNullParameter(wallThickness, "wallThickness");
            Intrinsics.checkNotNullParameter(length, "length");
            Intrinsics.checkNotNullParameter(width, "width");
            Intrinsics.checkNotNullParameter(height, "height");
            Intrinsics.checkNotNullParameter(depth, "depth");
            Intrinsics.checkNotNullParameter(zPosition, "zPosition");
            Intrinsics.checkNotNullParameter(xPosition, "xPosition");
            Intrinsics.checkNotNullParameter(yPosition, "yPosition");
            return new c(metricUnit, z10, z11, z12, z13, z14, z15, wallThicknessRange, lengthRange, positiveRange, aboveRange, bigDecimal, bigDecimal2, wallThickness, length, width, height, depth, zPosition, xPosition, yPosition);
        }

        @NotNull
        public final Range<BigDecimal> x() {
            return this.f257483k;
        }

        public final boolean y() {
            return this.f257479g;
        }

        public final boolean z() {
            return this.f257478f;
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f257495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f257496b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.DEPTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f257495a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f257496b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$canRotateX$2", f = "SizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257497a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257497a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ItemEditability itemEditability = new ItemEditability(k0.this.f257444b, k0.this.q1());
            Item itemA1 = k0.this.a1();
            return kotlin.coroutines.jvm.internal.b.a(itemA1 == null ? false : itemEditability.canRotateX(itemA1));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$canRotateZ$2", f = "SizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257499a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257499a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ItemEditability itemEditability = new ItemEditability(k0.this.f257444b, k0.this.q1());
            Item itemA1 = k0.this.a1();
            return kotlin.coroutines.jvm.internal.b.a(itemA1 == null ? false : itemEditability.canRotateZ(itemA1));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel", f = "SizeViewModel.kt", i = {}, l = {479}, m = "fromCm", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f257502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f257503c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f257505e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257503c = obj;
            this.f257505e |= Integer.MIN_VALUE;
            return k0.this.Q0(0.0d, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel", f = "SizeViewModel.kt", i = {0}, l = {414, 414}, m = "getAboveRange", n = {"this"}, s = {"L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f257507b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f257509d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257507b = obj;
            this.f257509d |= Integer.MIN_VALUE;
            return k0.this.V0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel", f = "SizeViewModel.kt", i = {0}, l = {410, 410}, m = "getLengthRange", n = {"this"}, s = {"L$0"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f257511b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f257513d;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257511b = obj;
            this.f257513d |= Integer.MIN_VALUE;
            return k0.this.e1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel", f = "SizeViewModel.kt", i = {0}, l = {412, 412}, m = "getPositiveRange", n = {"this"}, s = {"L$0"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f257515b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f257517d;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257515b = obj;
            this.f257517d |= Integer.MIN_VALUE;
            return k0.this.l1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel", f = "SizeViewModel.kt", i = {0}, l = {408, 408}, m = "getWallThicknessRange", n = {"this"}, s = {"L$0"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f257519b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f257521d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257519b = obj;
            this.f257521d |= Integer.MIN_VALUE;
            return k0.this.s1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$isPositionEditable$2", f = "SizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Item f257524c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Item item, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f257524c = item;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new l(this.f257524c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257522a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            CatalogItem catalogItemW0 = k0.this.W0(((ItemNs) this.f257524c).getModelId());
            return kotlin.coroutines.jvm.internal.b.a(catalogItemW0 != null ? catalogItemW0.isEditablePosition() : k0.this.f257445c.b(((ItemNs) this.f257524c).getModelId()));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$isSizeEditable$2", f = "SizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257525a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Item f257527c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Item item, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f257527c = item;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new m(this.f257527c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257525a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            CatalogItem catalogItemW0 = k0.this.W0(((ItemNs) this.f257527c).getModelId());
            return kotlin.coroutines.jvm.internal.b.a(catalogItemW0 != null ? catalogItemW0.isEditableSize() : k0.this.f257445c.b(((ItemNs) this.f257527c).getModelId()));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel", f = "SizeViewModel.kt", i = {0, 0, 1, 2}, l = {195, 196, 197, 198}, m = "refreshWallParameters", n = {"this", "wallsInfo", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$0"})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f257531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f257532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f257533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f257534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f257535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f257536i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f257537j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f257538k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f257539l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f257541n;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257539l = obj;
            this.f257541n |= Integer.MIN_VALUE;
            return k0.this.H1(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$setDepth$1", f = "SizeViewModel.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257542a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(BigDecimal bigDecimal, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.f257544c = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new o(this.f257544c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257542a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = k0.this;
                BigDecimal bigDecimal = this.f257544c;
                b bVar = b.DEPTH;
                this.f257542a = 1;
                if (k0Var.N1(bigDecimal, bVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$setHeight$1", f = "SizeViewModel.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257545a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257547c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(BigDecimal bigDecimal, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f257547c = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new p(this.f257547c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257545a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = k0.this;
                BigDecimal bigDecimal = this.f257547c;
                b bVar = b.HEIGHT;
                this.f257545a = 1;
                if (k0Var.N1(bigDecimal, bVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel", f = "SizeViewModel.kt", i = {0, 0, 0, 0}, l = {283}, m = "setItemPosition", n = {"this", "axis", "item", "value"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f257551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f257552e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f257554g;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257552e = obj;
            this.f257554g |= Integer.MIN_VALUE;
            return k0.this.M1(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel", f = "SizeViewModel.kt", i = {0, 0, 0, 0}, l = {228}, m = "setItemSize", n = {"this", "field", "item", "sizeValue"}, s = {"L$0", "L$1", "L$2", "F$0"})
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f257558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f257559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f257560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double f257561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f257562h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f257564j;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257562h = obj;
            this.f257564j |= Integer.MIN_VALUE;
            return k0.this.N1(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$setLength$1", f = "SizeViewModel.kt", i = {0}, l = {164, 185}, m = "invokeSuspend", n = {"side"}, s = {"L$0"})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f257567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f257568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f257569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0 f257570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Item f257572h;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a<a3.a> f257573a = kotlin.enums.c.c(a3.a.values());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Integer num, k0 k0Var, BigDecimal bigDecimal, Item item, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f257569e = num;
            this.f257570f = k0Var;
            this.f257571g = bigDecimal;
            this.f257572h = item;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new s(this.f257569e, this.f257570f, this.f257571g, this.f257572h, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0117, code lost:
        
            if (r9.H1(r8) == r0) goto L39;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.k0.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((s) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$setPositionX$1", f = "SizeViewModel.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257574a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257576c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(BigDecimal bigDecimal, kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
            this.f257576c = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new t(this.f257576c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257574a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = k0.this;
                BigDecimal bigDecimal = this.f257576c;
                a aVar = a.X;
                this.f257574a = 1;
                if (k0Var.M1(bigDecimal, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((t) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$setPositionY$1", f = "SizeViewModel.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
    static final class u extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257577a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257579c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(BigDecimal bigDecimal, kotlin.coroutines.d<? super u> dVar) {
            super(2, dVar);
            this.f257579c = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new u(this.f257579c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257577a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = k0.this;
                BigDecimal bigDecimal = this.f257579c;
                a aVar = a.Y;
                this.f257577a = 1;
                if (k0Var.M1(bigDecimal, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((u) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$setPositionZ$1", f = "SizeViewModel.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
    static final class v extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257580a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257582c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(BigDecimal bigDecimal, kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
            this.f257582c = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new v(this.f257582c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257580a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = k0.this;
                BigDecimal bigDecimal = this.f257582c;
                a aVar = a.Z;
                this.f257580a = 1;
                if (k0Var.M1(bigDecimal, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((v) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$setWallThickness$1", f = "SizeViewModel.kt", i = {0, 0, 1}, l = {androidx.media2.widget.f.i.f59777h0, com.planner5d.library.engine.input.f.b.G1, 152}, m = "invokeSuspend", n = {"itemRoom", "initialRoomWallsWidth", "itemRoom"}, s = {"L$0", "L$1", "L$0"})
    static final class w extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f257586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f257587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f257588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Item f257589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k0 f257590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257591i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Item item, k0 k0Var, BigDecimal bigDecimal, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f257589g = item;
            this.f257590h = k0Var;
            this.f257591i = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new w(this.f257589g, this.f257590h, this.f257591i, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00ef  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0128, code lost:
        
            if (r14.H1(r13) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.k0.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$setWidth$1", f = "SizeViewModel.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    static final class x extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257592a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(BigDecimal bigDecimal, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.f257594c = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new x(this.f257594c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257592a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = k0.this;
                BigDecimal bigDecimal = this.f257594c;
                b bVar = b.WIDTH;
                this.f257592a = 1;
                if (k0Var.N1(bigDecimal, bVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((x) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.SizeViewModel$sizeAndPositionConfig$2$1", f = "SizeViewModel.kt", i = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, l = {com.planner5d.library.engine.input.f.b.B0, com.planner5d.library.engine.input.f.b.f160702k0, com.planner5d.library.engine.input.f.b.f160702k0, com.planner5d.library.engine.input.f.b.f160690g0, com.planner5d.library.engine.input.f.b.f160690g0, com.planner5d.library.engine.input.f.b.f160696i0, com.planner5d.library.engine.input.f.b.f160696i0, 89, 89, 90, 90, com.planner5d.library.engine.input.f.b.f160711n0, com.planner5d.library.engine.input.f.b.f160711n0, com.planner5d.library.engine.input.f.b.f160697i1, com.planner5d.library.engine.input.f.b.f160697i1, com.planner5d.library.engine.input.f.b.f160697i1, com.planner5d.library.engine.input.f.b.f160700j1, com.planner5d.library.engine.input.f.b.f160700j1, com.planner5d.library.engine.input.f.b.f160700j1}, m = "invokeSuspend", n = {"wallsInfo", "wallsInfo", "wallsInfo", "wallsInfo", "wallsInfo", "wallsInfo", "wallsInfo", "wallsInfo", "wallsInfo", "wallsInfo"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nSizeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SizeViewModel.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/SizeViewModel$sizeAndPositionConfig$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1#2:482\n*E\n"})
    static final class y extends kotlin.coroutines.jvm.internal.o implements Function2<ze.b, kotlin.coroutines.d<? super c>, Object> {
        boolean X;
        int Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f257598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f257599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f257600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f257601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f257602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f257603i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f257604j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f257605k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f257606l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f257607m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f257608n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f257609o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f257610s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f257611t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f257612v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f257613w;

        y(kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new y(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x07e9  */
        /* JADX WARN: Code duplicated, block: B:101:0x07ec  */
        /* JADX WARN: Code duplicated, block: B:104:0x0847  */
        /* JADX WARN: Code duplicated, block: B:105:0x084a  */
        /* JADX WARN: Code duplicated, block: B:108:0x08ac  */
        /* JADX WARN: Code duplicated, block: B:109:0x08af  */
        /* JADX WARN: Code duplicated, block: B:113:0x091d  */
        /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:40:0x0505  */
        /* JADX WARN: Code duplicated, block: B:44:0x052c  */
        /* JADX WARN: Code duplicated, block: B:48:0x055d  */
        /* JADX WARN: Code duplicated, block: B:52:0x0583  */
        /* JADX WARN: Code duplicated, block: B:56:0x05ad  */
        /* JADX WARN: Code duplicated, block: B:60:0x05d9  */
        /* JADX WARN: Code duplicated, block: B:63:0x05e6  */
        /* JADX WARN: Code duplicated, block: B:73:0x0639  */
        /* JADX WARN: Code duplicated, block: B:85:0x06b0  */
        /* JADX WARN: Code duplicated, block: B:88:0x06eb  */
        /* JADX WARN: Code duplicated, block: B:89:0x06ee  */
        /* JADX WARN: Code duplicated, block: B:92:0x073b  */
        /* JADX WARN: Code duplicated, block: B:93:0x073e  */
        /* JADX WARN: Code duplicated, block: B:96:0x0791  */
        /* JADX WARN: Code duplicated, block: B:97:0x0794  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            WallsInfoWall wallsInfoWallT1;
            Object objK;
            WallsInfoWall wallsInfoWall;
            com.planner5d.library.model.metricunit.a aVar;
            boolean zE1;
            boolean zW1;
            Object objC1;
            boolean zBooleanValue;
            Object objY1;
            boolean z10;
            WallsInfoWall wallsInfoWall2;
            boolean z11;
            boolean z12;
            com.planner5d.library.model.metricunit.a aVar2;
            boolean zBooleanValue2;
            Object objP0;
            WallsInfoWall wallsInfoWall3;
            boolean z13;
            boolean zBooleanValue3;
            Object objO0;
            boolean z14;
            WallsInfoWall wallsInfoWall4;
            boolean z15;
            boolean z16;
            boolean z17;
            com.planner5d.library.model.metricunit.a aVar3;
            boolean z18;
            boolean zBooleanValue4;
            Object objS1;
            WallsInfoWall wallsInfoWall5;
            boolean z19;
            Range range;
            Object objE1;
            com.planner5d.library.model.metricunit.a aVar4;
            WallsInfoWall wallsInfoWall6;
            Range range2;
            Range range3;
            Object objL1;
            WallsInfoWall wallsInfoWall7;
            Range range4;
            Range range5;
            Object objV0;
            Range range6;
            WallsInfoWall wallsInfoWall8;
            Range range7;
            Range range8;
            com.planner5d.library.model.metricunit.a aVar5;
            Range range9;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            boolean z24;
            boolean z25;
            BigDecimal bigDecimal;
            com.planner5d.library.math.c top;
            Object objU0;
            WallsInfoWall wallsInfoWall9;
            Range range10;
            boolean z26;
            boolean z27;
            BigDecimal bigDecimal2;
            boolean z28;
            boolean z29;
            boolean z30;
            boolean z31;
            boolean z32;
            BigDecimal bigDecimal3;
            com.planner5d.library.math.c bottom;
            Object objU1;
            Range range11;
            boolean z33;
            Object objR1;
            com.planner5d.library.model.metricunit.a aVar6;
            Range range12;
            Range range13;
            Range range14;
            Range range15;
            BigDecimal bigDecimal4;
            BigDecimal bigDecimal5;
            boolean z34;
            BigDecimal bigDecimal6;
            Object objD1;
            BigDecimal bigDecimal7;
            com.planner5d.library.model.metricunit.a aVar7;
            Range range16;
            Range range17;
            Range range18;
            Range range19;
            BigDecimal bigDecimal8;
            BigDecimal bigDecimal9;
            Object obj2;
            BigDecimal bigDecimal10;
            boolean z35;
            com.planner5d.library.model.metricunit.a aVar8;
            Object objU2;
            Object obj3;
            Object obj4;
            Range range20;
            Range range21;
            BigDecimal bigDecimal11;
            Range range22;
            BigDecimal bigDecimal12;
            BigDecimal bigDecimal13;
            BigDecimal bigDecimal14;
            boolean z36;
            com.planner5d.library.model.metricunit.a aVar9;
            boolean z37;
            boolean z38;
            boolean z39;
            boolean z40;
            BigDecimal bigDecimal15;
            boolean z41;
            Range range23;
            Object objY0;
            Object obj5;
            Object obj6;
            Range range24;
            Range range25;
            BigDecimal bigDecimal16;
            BigDecimal bigDecimal17;
            BigDecimal bigDecimal18;
            BigDecimal bigDecimal19;
            BigDecimal bigDecimal20;
            BigDecimal bigDecimal21;
            boolean z42;
            Range range26;
            Object objX0;
            Object obj7;
            Object obj8;
            BigDecimal bigDecimal22;
            BigDecimal bigDecimal23;
            BigDecimal bigDecimal24;
            BigDecimal bigDecimal25;
            Range range27;
            boolean z43;
            BigDecimal bigDecimal26;
            BigDecimal bigDecimal27;
            boolean z44;
            boolean z45;
            Range range28;
            BigDecimal bigDecimal28;
            boolean z46;
            BigDecimal bigDecimal29;
            Object objK1;
            Object obj9;
            BigDecimal bigDecimal30;
            BigDecimal bigDecimal31;
            Object obj10;
            BigDecimal bigDecimal32;
            BigDecimal bigDecimal33;
            BigDecimal bigDecimal34;
            BigDecimal bigDecimal35;
            BigDecimal bigDecimal36;
            BigDecimal bigDecimal37;
            boolean z47;
            BigDecimal bigDecimal38;
            Object objH1;
            Object obj11;
            boolean z48;
            BigDecimal bigDecimal39;
            BigDecimal bigDecimal40;
            BigDecimal bigDecimal41;
            BigDecimal bigDecimal42;
            BigDecimal bigDecimal43;
            BigDecimal bigDecimal44;
            Object obj12;
            BigDecimal bigDecimal45;
            BigDecimal bigDecimal46;
            boolean z49;
            BigDecimal bigDecimal47;
            boolean z50;
            BigDecimal bigDecimal48;
            Object objJ1;
            Object obj13;
            Range range29;
            boolean z51;
            BigDecimal bigDecimal49;
            Range range30;
            boolean z52;
            BigDecimal bigDecimal50;
            BigDecimal bigDecimal51;
            Range range31;
            BigDecimal bigDecimal52;
            boolean z53;
            BigDecimal bigDecimal53;
            BigDecimal bigDecimal54;
            boolean z54;
            BigDecimal bigDecimal55;
            BigDecimal bigDecimal56;
            Range range32;
            boolean z55;
            BigDecimal bigDecimal57;
            boolean z56;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            switch (this.Y) {
                case 0:
                    ResultKt.m(obj);
                    wallsInfoWallT1 = k0.this.t1();
                    com.planner5d.library.model.manager.f2 f2Var = k0.this.f257443a;
                    this.f257595a = wallsInfoWallT1;
                    this.Y = 1;
                    objK = f2Var.k(this);
                    if (objK == objL) {
                        return objL;
                    }
                    wallsInfoWall = wallsInfoWallT1;
                    aVar = (com.planner5d.library.model.metricunit.a) objK;
                    zE1 = k0.this.E1();
                    zW1 = k0.this.w1();
                    k0 k0Var = k0.this;
                    this.f257595a = wallsInfoWall;
                    this.f257596b = aVar;
                    this.f257609o = zE1;
                    this.f257610s = zW1;
                    this.Y = 2;
                    objC1 = k0Var.C1(this);
                    if (objC1 == objL) {
                        return objL;
                    }
                    zBooleanValue = ((Boolean) objC1).booleanValue();
                    k0 k0Var2 = k0.this;
                    this.f257595a = wallsInfoWall;
                    this.f257596b = aVar;
                    this.f257609o = zE1;
                    this.f257610s = zW1;
                    this.f257611t = zBooleanValue;
                    this.Y = 3;
                    objY1 = k0Var2.y1(this);
                    if (objY1 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar10 = aVar;
                    z10 = zW1;
                    wallsInfoWall2 = wallsInfoWall;
                    z11 = zE1;
                    z12 = zBooleanValue;
                    aVar2 = aVar10;
                    zBooleanValue2 = ((Boolean) objY1).booleanValue();
                    k0 k0Var3 = k0.this;
                    this.f257595a = wallsInfoWall2;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = zBooleanValue2;
                    this.Y = 4;
                    objP0 = k0Var3.P0(this);
                    if (objP0 == objL) {
                        return objL;
                    }
                    wallsInfoWall3 = wallsInfoWall2;
                    z13 = zBooleanValue2;
                    zBooleanValue3 = ((Boolean) objP0).booleanValue();
                    k0 k0Var4 = k0.this;
                    this.f257595a = wallsInfoWall3;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = z13;
                    this.f257613w = zBooleanValue3;
                    this.Y = 5;
                    objO0 = k0Var4.O0(this);
                    if (objO0 == objL) {
                        return objL;
                    }
                    boolean z57 = z10;
                    z14 = z13;
                    wallsInfoWall4 = wallsInfoWall3;
                    z15 = z11;
                    z16 = z12;
                    z17 = zBooleanValue3;
                    aVar3 = aVar2;
                    z18 = z57;
                    zBooleanValue4 = ((Boolean) objO0).booleanValue();
                    k0 k0Var5 = k0.this;
                    this.f257595a = wallsInfoWall4;
                    this.f257596b = aVar3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = zBooleanValue4;
                    this.Y = 6;
                    objS1 = k0Var5.s1(this);
                    if (objS1 == objL) {
                        return objL;
                    }
                    wallsInfoWall5 = wallsInfoWall4;
                    z19 = zBooleanValue4;
                    range = (Range) objS1;
                    k0 k0Var6 = k0.this;
                    this.f257595a = wallsInfoWall5;
                    this.f257596b = aVar3;
                    this.f257597c = range;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 7;
                    objE1 = k0Var6.e1(this);
                    if (objE1 == objL) {
                        return objL;
                    }
                    aVar4 = aVar3;
                    wallsInfoWall6 = wallsInfoWall5;
                    range2 = range;
                    range3 = (Range) objE1;
                    k0 k0Var7 = k0.this;
                    this.f257595a = wallsInfoWall6;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 8;
                    objL1 = k0Var7.l1(this);
                    if (objL1 == objL) {
                        return objL;
                    }
                    wallsInfoWall7 = wallsInfoWall6;
                    range4 = range3;
                    range5 = (Range) objL1;
                    k0 k0Var8 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var8.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar11 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar11;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null || (top = wallsInfoWall8.getTop()) == null) {
                        z20 = z19;
                        z21 = z17;
                        z22 = z14;
                        z23 = z16;
                        z24 = z18;
                        z25 = z15;
                        bigDecimal = null;
                    } else {
                        k0 k0Var9 = k0.this;
                        this.f257595a = wallsInfoWall8;
                        this.f257596b = aVar5;
                        this.f257597c = range7;
                        this.f257598d = range6;
                        this.f257599e = range8;
                        this.f257600f = range9;
                        this.f257609o = z15;
                        this.f257610s = z18;
                        this.f257611t = z16;
                        this.f257612v = z14;
                        this.f257613w = z17;
                        this.X = z19;
                        z20 = z19;
                        this.Y = 10;
                        objU0 = k0Var9.U0(top, this);
                        if (objU0 == objL) {
                            return objL;
                        }
                        wallsInfoWall9 = wallsInfoWall8;
                        range10 = range9;
                        WallsInfoWall wallsInfoWall10 = wallsInfoWall9;
                        range9 = range10;
                        wallsInfoWall8 = wallsInfoWall10;
                        z21 = z17;
                        z22 = z14;
                        z23 = z16;
                        z24 = z18;
                        z25 = z15;
                        bigDecimal = (BigDecimal) objU0;
                    }
                    z26 = z20;
                    if (wallsInfoWall8 != null || (bottom = wallsInfoWall8.getBottom()) == null) {
                        z27 = z26;
                        bigDecimal2 = bigDecimal;
                        z28 = z25;
                        z29 = z24;
                        z30 = z23;
                        z31 = z22;
                        z32 = z21;
                        bigDecimal3 = null;
                    } else {
                        k0 k0Var10 = k0.this;
                        this.f257595a = aVar5;
                        this.f257596b = range7;
                        this.f257597c = range6;
                        this.f257598d = range8;
                        this.f257599e = range9;
                        this.f257600f = bigDecimal;
                        this.f257609o = z25;
                        this.f257610s = z24;
                        this.f257611t = z23;
                        this.f257612v = z22;
                        this.f257613w = z21;
                        this.X = z26;
                        z27 = z26;
                        this.Y = 11;
                        objU1 = k0Var10.U0(bottom, this);
                        if (objU1 == objL) {
                            return objL;
                        }
                        range11 = range9;
                        range9 = range11;
                        bigDecimal2 = bigDecimal;
                        z28 = z25;
                        z29 = z24;
                        z30 = z23;
                        z31 = z22;
                        z32 = z21;
                        bigDecimal3 = (BigDecimal) objU1;
                    }
                    z33 = z27;
                    k0 k0Var11 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var11.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var12 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var12.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal58 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal58;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var13 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var13.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var14 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var14.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var15 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var15.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var16 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var16.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal59 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal59;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var17 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var17.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal60 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal60;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var18 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var18.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal61 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal61;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 1:
                    wallsInfoWallT1 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    objK = obj;
                    wallsInfoWall = wallsInfoWallT1;
                    aVar = (com.planner5d.library.model.metricunit.a) objK;
                    zE1 = k0.this.E1();
                    zW1 = k0.this.w1();
                    k0 k0Var19 = k0.this;
                    this.f257595a = wallsInfoWall;
                    this.f257596b = aVar;
                    this.f257609o = zE1;
                    this.f257610s = zW1;
                    this.Y = 2;
                    objC1 = k0Var19.C1(this);
                    if (objC1 == objL) {
                        return objL;
                    }
                    zBooleanValue = ((Boolean) objC1).booleanValue();
                    k0 k0Var20 = k0.this;
                    this.f257595a = wallsInfoWall;
                    this.f257596b = aVar;
                    this.f257609o = zE1;
                    this.f257610s = zW1;
                    this.f257611t = zBooleanValue;
                    this.Y = 3;
                    objY1 = k0Var20.y1(this);
                    if (objY1 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar12 = aVar;
                    z10 = zW1;
                    wallsInfoWall2 = wallsInfoWall;
                    z11 = zE1;
                    z12 = zBooleanValue;
                    aVar2 = aVar12;
                    zBooleanValue2 = ((Boolean) objY1).booleanValue();
                    k0 k0Var21 = k0.this;
                    this.f257595a = wallsInfoWall2;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = zBooleanValue2;
                    this.Y = 4;
                    objP0 = k0Var21.P0(this);
                    if (objP0 == objL) {
                        return objL;
                    }
                    wallsInfoWall3 = wallsInfoWall2;
                    z13 = zBooleanValue2;
                    zBooleanValue3 = ((Boolean) objP0).booleanValue();
                    k0 k0Var22 = k0.this;
                    this.f257595a = wallsInfoWall3;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = z13;
                    this.f257613w = zBooleanValue3;
                    this.Y = 5;
                    objO0 = k0Var22.O0(this);
                    if (objO0 == objL) {
                        return objL;
                    }
                    boolean z58 = z10;
                    z14 = z13;
                    wallsInfoWall4 = wallsInfoWall3;
                    z15 = z11;
                    z16 = z12;
                    z17 = zBooleanValue3;
                    aVar3 = aVar2;
                    z18 = z58;
                    zBooleanValue4 = ((Boolean) objO0).booleanValue();
                    k0 k0Var23 = k0.this;
                    this.f257595a = wallsInfoWall4;
                    this.f257596b = aVar3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = zBooleanValue4;
                    this.Y = 6;
                    objS1 = k0Var23.s1(this);
                    if (objS1 == objL) {
                        return objL;
                    }
                    wallsInfoWall5 = wallsInfoWall4;
                    z19 = zBooleanValue4;
                    range = (Range) objS1;
                    k0 k0Var24 = k0.this;
                    this.f257595a = wallsInfoWall5;
                    this.f257596b = aVar3;
                    this.f257597c = range;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 7;
                    objE1 = k0Var24.e1(this);
                    if (objE1 == objL) {
                        return objL;
                    }
                    aVar4 = aVar3;
                    wallsInfoWall6 = wallsInfoWall5;
                    range2 = range;
                    range3 = (Range) objE1;
                    k0 k0Var25 = k0.this;
                    this.f257595a = wallsInfoWall6;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 8;
                    objL1 = k0Var25.l1(this);
                    if (objL1 == objL) {
                        return objL;
                    }
                    wallsInfoWall7 = wallsInfoWall6;
                    range4 = range3;
                    range5 = (Range) objL1;
                    k0 k0Var26 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var26.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar13 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar13;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var110 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var110.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var111 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var111.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal510 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal510;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var112 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var112.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var113.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var114 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var114.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var115.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal511 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal511;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var116 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var116.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal62 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal62;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var117.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal63 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal63;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 2:
                    zW1 = this.f257610s;
                    zE1 = this.f257609o;
                    aVar = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    wallsInfoWall = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    objC1 = obj;
                    zBooleanValue = ((Boolean) objC1).booleanValue();
                    k0 k0Var27 = k0.this;
                    this.f257595a = wallsInfoWall;
                    this.f257596b = aVar;
                    this.f257609o = zE1;
                    this.f257610s = zW1;
                    this.f257611t = zBooleanValue;
                    this.Y = 3;
                    objY1 = k0Var27.y1(this);
                    if (objY1 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar14 = aVar;
                    z10 = zW1;
                    wallsInfoWall2 = wallsInfoWall;
                    z11 = zE1;
                    z12 = zBooleanValue;
                    aVar2 = aVar14;
                    zBooleanValue2 = ((Boolean) objY1).booleanValue();
                    k0 k0Var28 = k0.this;
                    this.f257595a = wallsInfoWall2;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = zBooleanValue2;
                    this.Y = 4;
                    objP0 = k0Var28.P0(this);
                    if (objP0 == objL) {
                        return objL;
                    }
                    wallsInfoWall3 = wallsInfoWall2;
                    z13 = zBooleanValue2;
                    zBooleanValue3 = ((Boolean) objP0).booleanValue();
                    k0 k0Var29 = k0.this;
                    this.f257595a = wallsInfoWall3;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = z13;
                    this.f257613w = zBooleanValue3;
                    this.Y = 5;
                    objO0 = k0Var29.O0(this);
                    if (objO0 == objL) {
                        return objL;
                    }
                    boolean z59 = z10;
                    z14 = z13;
                    wallsInfoWall4 = wallsInfoWall3;
                    z15 = z11;
                    z16 = z12;
                    z17 = zBooleanValue3;
                    aVar3 = aVar2;
                    z18 = z59;
                    zBooleanValue4 = ((Boolean) objO0).booleanValue();
                    k0 k0Var210 = k0.this;
                    this.f257595a = wallsInfoWall4;
                    this.f257596b = aVar3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = zBooleanValue4;
                    this.Y = 6;
                    objS1 = k0Var210.s1(this);
                    if (objS1 == objL) {
                        return objL;
                    }
                    wallsInfoWall5 = wallsInfoWall4;
                    z19 = zBooleanValue4;
                    range = (Range) objS1;
                    k0 k0Var211 = k0.this;
                    this.f257595a = wallsInfoWall5;
                    this.f257596b = aVar3;
                    this.f257597c = range;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 7;
                    objE1 = k0Var211.e1(this);
                    if (objE1 == objL) {
                        return objL;
                    }
                    aVar4 = aVar3;
                    wallsInfoWall6 = wallsInfoWall5;
                    range2 = range;
                    range3 = (Range) objE1;
                    k0 k0Var212 = k0.this;
                    this.f257595a = wallsInfoWall6;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 8;
                    objL1 = k0Var212.l1(this);
                    if (objL1 == objL) {
                        return objL;
                    }
                    wallsInfoWall7 = wallsInfoWall6;
                    range4 = range3;
                    range5 = (Range) objL1;
                    k0 k0Var213 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var213.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar15 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar15;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var118 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var118.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var119 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var119.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal512 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal512;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var1110 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var1110.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var1111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var1111.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var1112 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var1112.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var1113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var1113.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal513 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal513;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var1114 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var1114.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal64 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal64;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var1115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var1115.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal65 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal65;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 3:
                    boolean z60 = this.f257611t;
                    boolean z61 = this.f257610s;
                    boolean z62 = this.f257609o;
                    com.planner5d.library.model.metricunit.a aVar16 = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    WallsInfoWall wallsInfoWall11 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    z12 = z60;
                    wallsInfoWall2 = wallsInfoWall11;
                    aVar2 = aVar16;
                    z11 = z62;
                    z10 = z61;
                    objY1 = obj;
                    zBooleanValue2 = ((Boolean) objY1).booleanValue();
                    k0 k0Var214 = k0.this;
                    this.f257595a = wallsInfoWall2;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = zBooleanValue2;
                    this.Y = 4;
                    objP0 = k0Var214.P0(this);
                    if (objP0 == objL) {
                        return objL;
                    }
                    wallsInfoWall3 = wallsInfoWall2;
                    z13 = zBooleanValue2;
                    zBooleanValue3 = ((Boolean) objP0).booleanValue();
                    k0 k0Var215 = k0.this;
                    this.f257595a = wallsInfoWall3;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = z13;
                    this.f257613w = zBooleanValue3;
                    this.Y = 5;
                    objO0 = k0Var215.O0(this);
                    if (objO0 == objL) {
                        return objL;
                    }
                    boolean z510 = z10;
                    z14 = z13;
                    wallsInfoWall4 = wallsInfoWall3;
                    z15 = z11;
                    z16 = z12;
                    z17 = zBooleanValue3;
                    aVar3 = aVar2;
                    z18 = z510;
                    zBooleanValue4 = ((Boolean) objO0).booleanValue();
                    k0 k0Var216 = k0.this;
                    this.f257595a = wallsInfoWall4;
                    this.f257596b = aVar3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = zBooleanValue4;
                    this.Y = 6;
                    objS1 = k0Var216.s1(this);
                    if (objS1 == objL) {
                        return objL;
                    }
                    wallsInfoWall5 = wallsInfoWall4;
                    z19 = zBooleanValue4;
                    range = (Range) objS1;
                    k0 k0Var217 = k0.this;
                    this.f257595a = wallsInfoWall5;
                    this.f257596b = aVar3;
                    this.f257597c = range;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 7;
                    objE1 = k0Var217.e1(this);
                    if (objE1 == objL) {
                        return objL;
                    }
                    aVar4 = aVar3;
                    wallsInfoWall6 = wallsInfoWall5;
                    range2 = range;
                    range3 = (Range) objE1;
                    k0 k0Var218 = k0.this;
                    this.f257595a = wallsInfoWall6;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 8;
                    objL1 = k0Var218.l1(this);
                    if (objL1 == objL) {
                        return objL;
                    }
                    wallsInfoWall7 = wallsInfoWall6;
                    range4 = range3;
                    range5 = (Range) objL1;
                    k0 k0Var219 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var219.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar17 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar17;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var1116 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var1116.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var1117 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var1117.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal514 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal514;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var1118 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var1118.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var1119 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var1119.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var11110 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var11110.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var11111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var11111.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal515 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal515;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var11112 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var11112.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal66 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal66;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var11113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var11113.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal67 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal67;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 4:
                    z13 = this.f257612v;
                    z12 = this.f257611t;
                    z10 = this.f257610s;
                    z11 = this.f257609o;
                    aVar2 = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    wallsInfoWall3 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    objP0 = obj;
                    zBooleanValue3 = ((Boolean) objP0).booleanValue();
                    k0 k0Var2110 = k0.this;
                    this.f257595a = wallsInfoWall3;
                    this.f257596b = aVar2;
                    this.f257609o = z11;
                    this.f257610s = z10;
                    this.f257611t = z12;
                    this.f257612v = z13;
                    this.f257613w = zBooleanValue3;
                    this.Y = 5;
                    objO0 = k0Var2110.O0(this);
                    if (objO0 == objL) {
                        return objL;
                    }
                    boolean z511 = z10;
                    z14 = z13;
                    wallsInfoWall4 = wallsInfoWall3;
                    z15 = z11;
                    z16 = z12;
                    z17 = zBooleanValue3;
                    aVar3 = aVar2;
                    z18 = z511;
                    zBooleanValue4 = ((Boolean) objO0).booleanValue();
                    k0 k0Var2111 = k0.this;
                    this.f257595a = wallsInfoWall4;
                    this.f257596b = aVar3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = zBooleanValue4;
                    this.Y = 6;
                    objS1 = k0Var2111.s1(this);
                    if (objS1 == objL) {
                        return objL;
                    }
                    wallsInfoWall5 = wallsInfoWall4;
                    z19 = zBooleanValue4;
                    range = (Range) objS1;
                    k0 k0Var2112 = k0.this;
                    this.f257595a = wallsInfoWall5;
                    this.f257596b = aVar3;
                    this.f257597c = range;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 7;
                    objE1 = k0Var2112.e1(this);
                    if (objE1 == objL) {
                        return objL;
                    }
                    aVar4 = aVar3;
                    wallsInfoWall6 = wallsInfoWall5;
                    range2 = range;
                    range3 = (Range) objE1;
                    k0 k0Var2113 = k0.this;
                    this.f257595a = wallsInfoWall6;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 8;
                    objL1 = k0Var2113.l1(this);
                    if (objL1 == objL) {
                        return objL;
                    }
                    wallsInfoWall7 = wallsInfoWall6;
                    range4 = range3;
                    range5 = (Range) objL1;
                    k0 k0Var2114 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var2114.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar18 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar18;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var11114 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var11114.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var11115 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var11115.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal516 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal516;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var11116 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var11116.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var11117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var11117.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var11118 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var11118.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var11119 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var11119.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal517 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal517;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var111110 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var111110.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal68 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal68;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var111111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var111111.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal69 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal69;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 5:
                    boolean z63 = this.f257613w;
                    boolean z64 = this.f257612v;
                    boolean z65 = this.f257611t;
                    boolean z66 = this.f257610s;
                    boolean z67 = this.f257609o;
                    com.planner5d.library.model.metricunit.a aVar19 = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    WallsInfoWall wallsInfoWall12 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    z17 = z63;
                    wallsInfoWall4 = wallsInfoWall12;
                    aVar3 = aVar19;
                    z15 = z67;
                    z18 = z66;
                    z16 = z65;
                    z14 = z64;
                    objO0 = obj;
                    zBooleanValue4 = ((Boolean) objO0).booleanValue();
                    k0 k0Var2115 = k0.this;
                    this.f257595a = wallsInfoWall4;
                    this.f257596b = aVar3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = zBooleanValue4;
                    this.Y = 6;
                    objS1 = k0Var2115.s1(this);
                    if (objS1 == objL) {
                        return objL;
                    }
                    wallsInfoWall5 = wallsInfoWall4;
                    z19 = zBooleanValue4;
                    range = (Range) objS1;
                    k0 k0Var2116 = k0.this;
                    this.f257595a = wallsInfoWall5;
                    this.f257596b = aVar3;
                    this.f257597c = range;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 7;
                    objE1 = k0Var2116.e1(this);
                    if (objE1 == objL) {
                        return objL;
                    }
                    aVar4 = aVar3;
                    wallsInfoWall6 = wallsInfoWall5;
                    range2 = range;
                    range3 = (Range) objE1;
                    k0 k0Var2117 = k0.this;
                    this.f257595a = wallsInfoWall6;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 8;
                    objL1 = k0Var2117.l1(this);
                    if (objL1 == objL) {
                        return objL;
                    }
                    wallsInfoWall7 = wallsInfoWall6;
                    range4 = range3;
                    range5 = (Range) objL1;
                    k0 k0Var2118 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var2118.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar110 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar110;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var111112 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var111112.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var111113 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var111113.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal518 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal518;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var111114 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var111114.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var111115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var111115.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var111116 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var111116.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var111117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var111117.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal519 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal519;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var111118 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var111118.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal610 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal610;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var111119 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var111119.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal611 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal611;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 6:
                    z19 = this.X;
                    z17 = this.f257613w;
                    z14 = this.f257612v;
                    z16 = this.f257611t;
                    z18 = this.f257610s;
                    z15 = this.f257609o;
                    aVar3 = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    wallsInfoWall5 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    objS1 = obj;
                    range = (Range) objS1;
                    k0 k0Var2119 = k0.this;
                    this.f257595a = wallsInfoWall5;
                    this.f257596b = aVar3;
                    this.f257597c = range;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 7;
                    objE1 = k0Var2119.e1(this);
                    if (objE1 == objL) {
                        return objL;
                    }
                    aVar4 = aVar3;
                    wallsInfoWall6 = wallsInfoWall5;
                    range2 = range;
                    range3 = (Range) objE1;
                    k0 k0Var21110 = k0.this;
                    this.f257595a = wallsInfoWall6;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 8;
                    objL1 = k0Var21110.l1(this);
                    if (objL1 == objL) {
                        return objL;
                    }
                    wallsInfoWall7 = wallsInfoWall6;
                    range4 = range3;
                    range5 = (Range) objL1;
                    k0 k0Var21111 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var21111.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar111 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar111;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var1111110 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var1111110.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var1111111 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var1111111.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal5110 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal5110;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var1111112 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var1111112.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var1111113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var1111113.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var1111114 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var1111114.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var1111115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var1111115.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal5111 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal5111;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var1111116 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var1111116.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal612 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal612;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var1111117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var1111117.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal613 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal613;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 7:
                    z19 = this.X;
                    z17 = this.f257613w;
                    z14 = this.f257612v;
                    z16 = this.f257611t;
                    z18 = this.f257610s;
                    z15 = this.f257609o;
                    Range range33 = (Range) this.f257597c;
                    com.planner5d.library.model.metricunit.a aVar20 = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    WallsInfoWall wallsInfoWall13 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    range2 = range33;
                    wallsInfoWall6 = wallsInfoWall13;
                    aVar4 = aVar20;
                    objE1 = obj;
                    range3 = (Range) objE1;
                    k0 k0Var21112 = k0.this;
                    this.f257595a = wallsInfoWall6;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range3;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 8;
                    objL1 = k0Var21112.l1(this);
                    if (objL1 == objL) {
                        return objL;
                    }
                    wallsInfoWall7 = wallsInfoWall6;
                    range4 = range3;
                    range5 = (Range) objL1;
                    k0 k0Var21113 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var21113.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar112 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar112;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var1111118 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var1111118.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var1111119 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var1111119.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal5112 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal5112;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var11111110 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var11111110.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var11111111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var11111111.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var11111112 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var11111112.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var11111113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var11111113.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal5113 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal5113;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var11111114 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var11111114.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal614 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal614;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var11111115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var11111115.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal615 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal615;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 8:
                    z19 = this.X;
                    z17 = this.f257613w;
                    z14 = this.f257612v;
                    z16 = this.f257611t;
                    z18 = this.f257610s;
                    z15 = this.f257609o;
                    range4 = (Range) this.f257598d;
                    range2 = (Range) this.f257597c;
                    aVar4 = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    wallsInfoWall7 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    objL1 = obj;
                    range5 = (Range) objL1;
                    k0 k0Var21114 = k0.this;
                    this.f257595a = wallsInfoWall7;
                    this.f257596b = aVar4;
                    this.f257597c = range2;
                    this.f257598d = range4;
                    this.f257599e = range5;
                    this.f257609o = z15;
                    this.f257610s = z18;
                    this.f257611t = z16;
                    this.f257612v = z14;
                    this.f257613w = z17;
                    this.X = z19;
                    this.Y = 9;
                    objV0 = k0Var21114.V0(this);
                    if (objV0 == objL) {
                        return objL;
                    }
                    com.planner5d.library.model.metricunit.a aVar113 = aVar4;
                    range6 = range4;
                    wallsInfoWall8 = wallsInfoWall7;
                    range7 = range2;
                    range8 = range5;
                    aVar5 = aVar113;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var11111116 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var11111116.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var11111117 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var11111117.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal5114 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal5114;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var11111118 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var11111118.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var11111119 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var11111119.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var111111110 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var111111110.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var111111111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var111111111.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal5115 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal5115;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var111111112 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var111111112.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal616 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal616;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var111111113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var111111113.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal617 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal617;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 9:
                    z19 = this.X;
                    z17 = this.f257613w;
                    z14 = this.f257612v;
                    z16 = this.f257611t;
                    z18 = this.f257610s;
                    z15 = this.f257609o;
                    Range range34 = (Range) this.f257599e;
                    Range range35 = (Range) this.f257598d;
                    Range range36 = (Range) this.f257597c;
                    com.planner5d.library.model.metricunit.a aVar21 = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    WallsInfoWall wallsInfoWall14 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    range8 = range34;
                    wallsInfoWall8 = wallsInfoWall14;
                    aVar5 = aVar21;
                    range7 = range36;
                    range6 = range35;
                    objV0 = obj;
                    range9 = (Range) objV0;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z20 = z19;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = null;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var111111114 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var111111114.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var111111115 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var111111115.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal5116 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal5116;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var111111116 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var111111116.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var111111117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var111111117.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var111111118 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var111111118.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var111111119 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var111111119.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal5117 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal5117;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var1111111110 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var1111111110.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal618 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal618;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var1111111111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var1111111111.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal619 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal619;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 10:
                    boolean z68 = this.X;
                    z17 = this.f257613w;
                    z14 = this.f257612v;
                    z16 = this.f257611t;
                    z18 = this.f257610s;
                    z15 = this.f257609o;
                    range10 = (Range) this.f257600f;
                    range8 = (Range) this.f257599e;
                    range6 = (Range) this.f257598d;
                    range7 = (Range) this.f257597c;
                    aVar5 = (com.planner5d.library.model.metricunit.a) this.f257596b;
                    wallsInfoWall9 = (WallsInfoWall) this.f257595a;
                    ResultKt.m(obj);
                    z20 = z68;
                    objU0 = obj;
                    WallsInfoWall wallsInfoWall15 = wallsInfoWall9;
                    range9 = range10;
                    wallsInfoWall8 = wallsInfoWall15;
                    z21 = z17;
                    z22 = z14;
                    z23 = z16;
                    z24 = z18;
                    z25 = z15;
                    bigDecimal = (BigDecimal) objU0;
                    z26 = z20;
                    if (wallsInfoWall8 != null) {
                        break;
                    }
                    z27 = z26;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = null;
                    z33 = z27;
                    k0 k0Var1111111112 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var1111111112.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var1111111113 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var1111111113.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal5118 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal5118;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var1111111114 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var1111111114.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var1111111115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var1111111115.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var1111111116 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var1111111116.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var1111111117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var1111111117.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal5119 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal5119;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var1111111118 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var1111111118.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal6110 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal6110;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var1111111119 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var1111111119.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal6111 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal6111;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 11:
                    boolean z69 = this.X;
                    z21 = this.f257613w;
                    z22 = this.f257612v;
                    z23 = this.f257611t;
                    z24 = this.f257610s;
                    z25 = this.f257609o;
                    bigDecimal = (BigDecimal) this.f257600f;
                    range11 = (Range) this.f257599e;
                    range8 = (Range) this.f257598d;
                    range6 = (Range) this.f257597c;
                    range7 = (Range) this.f257596b;
                    aVar5 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    z27 = z69;
                    objU1 = obj;
                    range9 = range11;
                    bigDecimal2 = bigDecimal;
                    z28 = z25;
                    z29 = z24;
                    z30 = z23;
                    z31 = z22;
                    z32 = z21;
                    bigDecimal3 = (BigDecimal) objU1;
                    z33 = z27;
                    k0 k0Var11111111110 = k0.this;
                    this.f257595a = aVar5;
                    this.f257596b = range7;
                    this.f257597c = range6;
                    this.f257598d = range8;
                    this.f257599e = range9;
                    this.f257600f = bigDecimal2;
                    this.f257601g = bigDecimal3;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z33;
                    this.Y = 12;
                    objR1 = k0Var11111111110.r1(this);
                    if (objR1 == objL) {
                        return objL;
                    }
                    aVar6 = aVar5;
                    range12 = range6;
                    range13 = range9;
                    range14 = range7;
                    range15 = range8;
                    bigDecimal4 = bigDecimal2;
                    bigDecimal5 = bigDecimal3;
                    z34 = z33;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var11111111111 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var11111111111.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal51110 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal51110;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var11111111112 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var11111111112.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var11111111113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var11111111113.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var11111111114 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var11111111114.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var11111111115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var11111111115.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal51111 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal51111;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var11111111116 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var11111111116.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal6112 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal6112;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var11111111117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var11111111117.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal6113 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal6113;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 12:
                    boolean z70 = this.X;
                    boolean z71 = this.f257613w;
                    boolean z72 = this.f257612v;
                    boolean z73 = this.f257611t;
                    boolean z74 = this.f257610s;
                    boolean z75 = this.f257609o;
                    BigDecimal bigDecimal70 = (BigDecimal) this.f257601g;
                    BigDecimal bigDecimal71 = (BigDecimal) this.f257600f;
                    Range range37 = (Range) this.f257599e;
                    Range range38 = (Range) this.f257598d;
                    Range range39 = (Range) this.f257597c;
                    Range range40 = (Range) this.f257596b;
                    com.planner5d.library.model.metricunit.a aVar22 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    aVar6 = aVar22;
                    range14 = range40;
                    range12 = range39;
                    range15 = range38;
                    range13 = range37;
                    bigDecimal4 = bigDecimal71;
                    bigDecimal5 = bigDecimal70;
                    z28 = z75;
                    z29 = z74;
                    z30 = z73;
                    z31 = z72;
                    z32 = z71;
                    z34 = z70;
                    objR1 = obj;
                    bigDecimal6 = (BigDecimal) objR1;
                    k0 k0Var11111111118 = k0.this;
                    this.f257595a = aVar6;
                    this.f257596b = range14;
                    this.f257597c = range12;
                    this.f257598d = range15;
                    this.f257599e = range13;
                    this.f257600f = bigDecimal4;
                    this.f257601g = bigDecimal5;
                    this.f257602h = bigDecimal6;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    this.X = z34;
                    this.Y = 13;
                    objD1 = k0Var11111111118.d1(this);
                    if (objD1 == objL) {
                        return objL;
                    }
                    BigDecimal bigDecimal51112 = bigDecimal5;
                    bigDecimal7 = bigDecimal6;
                    obj = objD1;
                    aVar7 = aVar6;
                    range16 = range14;
                    range17 = range12;
                    range18 = range15;
                    range19 = range13;
                    bigDecimal8 = bigDecimal4;
                    bigDecimal9 = bigDecimal51112;
                    obj2 = objL;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var11111111119 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var11111111119.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var111111111110 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var111111111110.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var111111111111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var111111111111.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var111111111112 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var111111111112.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal51113 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal51113;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var111111111113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var111111111113.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal6114 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal6114;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var111111111114 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var111111111114.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal6115 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal6115;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 13:
                    boolean z76 = this.X;
                    boolean z77 = this.f257613w;
                    boolean z78 = this.f257612v;
                    boolean z79 = this.f257611t;
                    boolean z80 = this.f257610s;
                    boolean z81 = this.f257609o;
                    BigDecimal bigDecimal72 = (BigDecimal) this.f257602h;
                    BigDecimal bigDecimal73 = (BigDecimal) this.f257601g;
                    BigDecimal bigDecimal74 = (BigDecimal) this.f257600f;
                    Range range41 = (Range) this.f257599e;
                    Range range42 = (Range) this.f257598d;
                    Range range43 = (Range) this.f257597c;
                    Range range44 = (Range) this.f257596b;
                    com.planner5d.library.model.metricunit.a aVar23 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    obj2 = objL;
                    aVar7 = aVar23;
                    range16 = range44;
                    range17 = range43;
                    range18 = range42;
                    range19 = range41;
                    bigDecimal8 = bigDecimal74;
                    bigDecimal9 = bigDecimal73;
                    bigDecimal7 = bigDecimal72;
                    z28 = z81;
                    z29 = z80;
                    z30 = z79;
                    z31 = z78;
                    z32 = z77;
                    z34 = z76;
                    bigDecimal10 = (BigDecimal) obj;
                    z35 = z34;
                    k0 k0Var111111111115 = k0.this;
                    this.f257595a = aVar7;
                    this.f257596b = range16;
                    this.f257597c = range17;
                    this.f257598d = range18;
                    this.f257599e = range19;
                    this.f257600f = bigDecimal8;
                    this.f257601g = bigDecimal9;
                    this.f257602h = bigDecimal7;
                    this.f257603i = bigDecimal10;
                    this.f257609o = z28;
                    this.f257610s = z29;
                    this.f257611t = z30;
                    this.f257612v = z31;
                    this.f257613w = z32;
                    aVar8 = aVar7;
                    this.X = z35;
                    this.Y = 14;
                    objU2 = k0Var111111111115.u1(this);
                    obj3 = obj2;
                    if (objU2 == obj3) {
                        return obj3;
                    }
                    obj = objU2;
                    obj4 = obj3;
                    range20 = range18;
                    range21 = range17;
                    bigDecimal11 = bigDecimal8;
                    range22 = range19;
                    bigDecimal12 = bigDecimal7;
                    bigDecimal13 = bigDecimal9;
                    bigDecimal14 = bigDecimal10;
                    z36 = z28;
                    aVar9 = aVar8;
                    z37 = z29;
                    z38 = z30;
                    z39 = z31;
                    z40 = z32;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var111111111116 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var111111111116.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var111111111117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var111111111117.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var111111111118 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var111111111118.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal51114 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal51114;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var111111111119 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var111111111119.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal6116 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal6116;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var1111111111110 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var1111111111110.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal6117 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal6117;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 14:
                    boolean z82 = this.X;
                    boolean z83 = this.f257613w;
                    boolean z84 = this.f257612v;
                    boolean z85 = this.f257611t;
                    boolean z86 = this.f257610s;
                    boolean z87 = this.f257609o;
                    BigDecimal bigDecimal75 = (BigDecimal) this.f257603i;
                    BigDecimal bigDecimal76 = (BigDecimal) this.f257602h;
                    BigDecimal bigDecimal77 = (BigDecimal) this.f257601g;
                    BigDecimal bigDecimal78 = (BigDecimal) this.f257600f;
                    Range range45 = (Range) this.f257599e;
                    Range range46 = (Range) this.f257598d;
                    Range range47 = (Range) this.f257597c;
                    range16 = (Range) this.f257596b;
                    aVar9 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    z35 = z82;
                    obj4 = objL;
                    range20 = range46;
                    bigDecimal11 = bigDecimal78;
                    bigDecimal12 = bigDecimal76;
                    z36 = z87;
                    z38 = z85;
                    z40 = z83;
                    range21 = range47;
                    range22 = range45;
                    bigDecimal13 = bigDecimal77;
                    bigDecimal14 = bigDecimal75;
                    z37 = z86;
                    z39 = z84;
                    bigDecimal15 = (BigDecimal) obj;
                    z41 = z40;
                    k0 k0Var1111111111111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range20;
                    this.f257599e = range22;
                    this.f257600f = bigDecimal11;
                    this.f257601g = bigDecimal13;
                    this.f257602h = bigDecimal12;
                    this.f257603i = bigDecimal14;
                    this.f257604j = bigDecimal15;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    this.f257612v = z39;
                    range23 = range20;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 15;
                    objY0 = k0Var1111111111111.Y0(this);
                    obj5 = obj4;
                    if (objY0 == obj5) {
                        return obj5;
                    }
                    obj = objY0;
                    obj6 = obj5;
                    range24 = range22;
                    range25 = range23;
                    bigDecimal16 = bigDecimal11;
                    bigDecimal17 = bigDecimal13;
                    bigDecimal18 = bigDecimal12;
                    bigDecimal19 = bigDecimal14;
                    bigDecimal20 = bigDecimal15;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var1111111111112 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var1111111111112.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var1111111111113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var1111111111113.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal51115 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal51115;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var1111111111114 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var1111111111114.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal6118 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal6118;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var1111111111115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var1111111111115.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal6119 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal6119;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 15:
                    boolean z88 = this.X;
                    boolean z89 = this.f257613w;
                    boolean z90 = this.f257612v;
                    boolean z91 = this.f257611t;
                    boolean z92 = this.f257610s;
                    boolean z93 = this.f257609o;
                    BigDecimal bigDecimal79 = (BigDecimal) this.f257604j;
                    BigDecimal bigDecimal80 = (BigDecimal) this.f257603i;
                    BigDecimal bigDecimal81 = (BigDecimal) this.f257602h;
                    BigDecimal bigDecimal82 = (BigDecimal) this.f257601g;
                    BigDecimal bigDecimal83 = (BigDecimal) this.f257600f;
                    Range range48 = (Range) this.f257599e;
                    Range range49 = (Range) this.f257598d;
                    Range range50 = (Range) this.f257597c;
                    Range range51 = (Range) this.f257596b;
                    aVar9 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    z41 = z89;
                    range21 = range50;
                    range16 = range51;
                    z35 = z88;
                    obj6 = objL;
                    range24 = range48;
                    bigDecimal17 = bigDecimal82;
                    bigDecimal19 = bigDecimal80;
                    z36 = z93;
                    z38 = z91;
                    range25 = range49;
                    bigDecimal16 = bigDecimal83;
                    bigDecimal18 = bigDecimal81;
                    bigDecimal20 = bigDecimal79;
                    z37 = z92;
                    z39 = z90;
                    bigDecimal21 = (BigDecimal) obj;
                    z42 = z39;
                    k0 k0Var1111111111116 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range21;
                    this.f257598d = range25;
                    this.f257599e = range24;
                    this.f257600f = bigDecimal16;
                    this.f257601g = bigDecimal17;
                    this.f257602h = bigDecimal18;
                    this.f257603i = bigDecimal19;
                    this.f257604j = bigDecimal20;
                    this.f257605k = bigDecimal21;
                    this.f257609o = z36;
                    this.f257610s = z37;
                    this.f257611t = z38;
                    range26 = range24;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 16;
                    objX0 = k0Var1111111111116.X0(this);
                    obj7 = obj6;
                    if (objX0 == obj7) {
                        return obj7;
                    }
                    obj = objX0;
                    obj8 = obj7;
                    bigDecimal22 = bigDecimal18;
                    bigDecimal23 = bigDecimal17;
                    bigDecimal24 = bigDecimal21;
                    bigDecimal25 = bigDecimal20;
                    range27 = range21;
                    z43 = z37;
                    bigDecimal26 = bigDecimal16;
                    bigDecimal27 = bigDecimal19;
                    z44 = z36;
                    z45 = z38;
                    range28 = range26;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var1111111111117 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var1111111111117.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal51116 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal51116;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var1111111111118 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var1111111111118.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal61110 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal61110;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var1111111111119 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var1111111111119.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal61111 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal61111;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 16:
                    boolean z94 = this.X;
                    boolean z95 = this.f257613w;
                    boolean z96 = this.f257612v;
                    boolean z97 = this.f257611t;
                    boolean z98 = this.f257610s;
                    boolean z99 = this.f257609o;
                    BigDecimal bigDecimal84 = (BigDecimal) this.f257605k;
                    BigDecimal bigDecimal85 = (BigDecimal) this.f257604j;
                    BigDecimal bigDecimal86 = (BigDecimal) this.f257603i;
                    BigDecimal bigDecimal87 = (BigDecimal) this.f257602h;
                    BigDecimal bigDecimal88 = (BigDecimal) this.f257601g;
                    BigDecimal bigDecimal89 = (BigDecimal) this.f257600f;
                    Range range52 = (Range) this.f257599e;
                    Range range53 = (Range) this.f257598d;
                    Range range54 = (Range) this.f257597c;
                    Range range55 = (Range) this.f257596b;
                    aVar9 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    z41 = z95;
                    bigDecimal26 = bigDecimal89;
                    bigDecimal25 = bigDecimal85;
                    z45 = z97;
                    range25 = range53;
                    range16 = range55;
                    z42 = z96;
                    range27 = range54;
                    z35 = z94;
                    obj8 = objL;
                    bigDecimal22 = bigDecimal87;
                    z44 = z99;
                    range28 = range52;
                    bigDecimal27 = bigDecimal86;
                    z43 = z98;
                    bigDecimal23 = bigDecimal88;
                    bigDecimal24 = bigDecimal84;
                    bigDecimal28 = (BigDecimal) obj;
                    z46 = z45;
                    k0 k0Var11111111111110 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal26;
                    this.f257601g = bigDecimal23;
                    this.f257602h = bigDecimal22;
                    this.f257603i = bigDecimal27;
                    this.f257604j = bigDecimal25;
                    this.f257605k = bigDecimal24;
                    this.f257606l = bigDecimal28;
                    this.f257609o = z44;
                    this.f257610s = z43;
                    bigDecimal29 = bigDecimal22;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 17;
                    objK1 = k0Var11111111111110.k1(this);
                    obj9 = obj8;
                    if (objK1 == obj9) {
                        return obj9;
                    }
                    BigDecimal bigDecimal51117 = bigDecimal23;
                    bigDecimal30 = bigDecimal26;
                    bigDecimal31 = bigDecimal51117;
                    obj10 = obj9;
                    bigDecimal32 = bigDecimal29;
                    obj = objK1;
                    bigDecimal33 = bigDecimal27;
                    bigDecimal34 = bigDecimal25;
                    bigDecimal35 = bigDecimal24;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var11111111111111 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var11111111111111.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal61112 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal61112;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var11111111111112 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var11111111111112.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal61113 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal61113;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 17:
                    boolean z100 = this.X;
                    boolean z101 = this.f257613w;
                    boolean z102 = this.f257612v;
                    boolean z103 = this.f257611t;
                    boolean z104 = this.f257610s;
                    boolean z105 = this.f257609o;
                    bigDecimal28 = (BigDecimal) this.f257606l;
                    BigDecimal bigDecimal90 = (BigDecimal) this.f257605k;
                    BigDecimal bigDecimal91 = (BigDecimal) this.f257604j;
                    BigDecimal bigDecimal92 = (BigDecimal) this.f257603i;
                    BigDecimal bigDecimal93 = (BigDecimal) this.f257602h;
                    BigDecimal bigDecimal94 = (BigDecimal) this.f257601g;
                    BigDecimal bigDecimal95 = (BigDecimal) this.f257600f;
                    Range range56 = (Range) this.f257599e;
                    Range range57 = (Range) this.f257598d;
                    Range range58 = (Range) this.f257597c;
                    Range range59 = (Range) this.f257596b;
                    aVar9 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    z43 = z104;
                    bigDecimal30 = bigDecimal95;
                    bigDecimal34 = bigDecimal91;
                    z46 = z103;
                    range25 = range57;
                    z35 = z100;
                    obj10 = objL;
                    bigDecimal33 = bigDecimal92;
                    z44 = z105;
                    range28 = range56;
                    range16 = range59;
                    z42 = z102;
                    range27 = range58;
                    z41 = z101;
                    bigDecimal31 = bigDecimal94;
                    bigDecimal35 = bigDecimal90;
                    bigDecimal32 = bigDecimal93;
                    bigDecimal36 = bigDecimal28;
                    bigDecimal37 = (BigDecimal) obj;
                    z47 = z43;
                    k0 k0Var11111111111113 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal30;
                    this.f257601g = bigDecimal31;
                    this.f257602h = bigDecimal32;
                    this.f257603i = bigDecimal33;
                    this.f257604j = bigDecimal34;
                    this.f257605k = bigDecimal35;
                    this.f257606l = bigDecimal36;
                    this.f257607m = bigDecimal37;
                    this.f257609o = z44;
                    bigDecimal38 = bigDecimal33;
                    this.f257610s = z47;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 18;
                    objH1 = k0Var11111111111113.h1(this);
                    obj11 = obj10;
                    if (objH1 == obj11) {
                        return obj11;
                    }
                    z48 = z47;
                    obj = objH1;
                    bigDecimal39 = bigDecimal35;
                    bigDecimal40 = bigDecimal37;
                    bigDecimal41 = bigDecimal31;
                    bigDecimal42 = bigDecimal38;
                    BigDecimal bigDecimal61114 = bigDecimal32;
                    bigDecimal43 = bigDecimal30;
                    bigDecimal44 = bigDecimal61114;
                    obj12 = obj11;
                    bigDecimal45 = bigDecimal34;
                    bigDecimal46 = bigDecimal36;
                    z49 = z44;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var11111111111114 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var11111111111114.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal61115 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal61115;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 18:
                    boolean z106 = this.X;
                    boolean z107 = this.f257613w;
                    boolean z108 = this.f257612v;
                    boolean z109 = this.f257611t;
                    boolean z110 = this.f257610s;
                    boolean z111 = this.f257609o;
                    BigDecimal bigDecimal96 = (BigDecimal) this.f257607m;
                    BigDecimal bigDecimal97 = (BigDecimal) this.f257606l;
                    BigDecimal bigDecimal98 = (BigDecimal) this.f257605k;
                    BigDecimal bigDecimal99 = (BigDecimal) this.f257604j;
                    BigDecimal bigDecimal100 = (BigDecimal) this.f257603i;
                    BigDecimal bigDecimal101 = (BigDecimal) this.f257602h;
                    BigDecimal bigDecimal102 = (BigDecimal) this.f257601g;
                    BigDecimal bigDecimal103 = (BigDecimal) this.f257600f;
                    Range range60 = (Range) this.f257599e;
                    Range range61 = (Range) this.f257598d;
                    Range range62 = (Range) this.f257597c;
                    Range range63 = (Range) this.f257596b;
                    aVar9 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    z42 = z108;
                    range27 = range62;
                    z48 = z110;
                    bigDecimal44 = bigDecimal101;
                    bigDecimal40 = bigDecimal96;
                    bigDecimal41 = bigDecimal102;
                    bigDecimal46 = bigDecimal97;
                    bigDecimal43 = bigDecimal103;
                    range16 = range63;
                    z46 = z109;
                    range25 = range61;
                    z41 = z107;
                    bigDecimal42 = bigDecimal100;
                    z49 = z111;
                    range28 = range60;
                    z35 = z106;
                    obj12 = objL;
                    bigDecimal39 = bigDecimal98;
                    bigDecimal45 = bigDecimal99;
                    bigDecimal47 = (BigDecimal) obj;
                    z50 = z49;
                    k0 k0Var11111111111115 = k0.this;
                    this.f257595a = aVar9;
                    this.f257596b = range16;
                    this.f257597c = range27;
                    this.f257598d = range25;
                    this.f257599e = range28;
                    this.f257600f = bigDecimal43;
                    this.f257601g = bigDecimal41;
                    this.f257602h = bigDecimal44;
                    this.f257603i = bigDecimal42;
                    this.f257604j = bigDecimal45;
                    this.f257605k = bigDecimal39;
                    this.f257606l = bigDecimal46;
                    this.f257607m = bigDecimal40;
                    this.f257608n = bigDecimal47;
                    bigDecimal48 = bigDecimal39;
                    this.f257609o = z50;
                    this.f257610s = z48;
                    this.f257611t = z46;
                    this.f257612v = z42;
                    this.f257613w = z41;
                    this.X = z35;
                    this.Y = 19;
                    objJ1 = k0Var11111111111115.j1(this);
                    obj13 = obj12;
                    if (objJ1 == obj13) {
                        return obj13;
                    }
                    BigDecimal bigDecimal61116 = bigDecimal45;
                    range29 = range27;
                    z51 = z48;
                    bigDecimal49 = bigDecimal47;
                    range30 = range25;
                    z52 = z46;
                    bigDecimal50 = bigDecimal40;
                    bigDecimal51 = bigDecimal43;
                    range31 = range16;
                    bigDecimal52 = bigDecimal44;
                    z53 = z42;
                    bigDecimal53 = bigDecimal46;
                    bigDecimal54 = bigDecimal41;
                    z54 = z35;
                    bigDecimal55 = bigDecimal61116;
                    bigDecimal56 = bigDecimal42;
                    range32 = range28;
                    z55 = z41;
                    bigDecimal57 = bigDecimal48;
                    z56 = z50;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                case 19:
                    boolean z112 = this.X;
                    boolean z113 = this.f257613w;
                    boolean z114 = this.f257612v;
                    boolean z115 = this.f257611t;
                    boolean z116 = this.f257610s;
                    boolean z117 = this.f257609o;
                    BigDecimal bigDecimal104 = (BigDecimal) this.f257608n;
                    BigDecimal bigDecimal105 = (BigDecimal) this.f257607m;
                    BigDecimal bigDecimal106 = (BigDecimal) this.f257606l;
                    BigDecimal bigDecimal107 = (BigDecimal) this.f257605k;
                    BigDecimal bigDecimal108 = (BigDecimal) this.f257604j;
                    BigDecimal bigDecimal109 = (BigDecimal) this.f257603i;
                    BigDecimal bigDecimal110 = (BigDecimal) this.f257602h;
                    bigDecimal54 = (BigDecimal) this.f257601g;
                    BigDecimal bigDecimal111 = (BigDecimal) this.f257600f;
                    Range range64 = (Range) this.f257599e;
                    Range range65 = (Range) this.f257598d;
                    Range range66 = (Range) this.f257597c;
                    Range range67 = (Range) this.f257596b;
                    com.planner5d.library.model.metricunit.a aVar24 = (com.planner5d.library.model.metricunit.a) this.f257595a;
                    ResultKt.m(obj);
                    z53 = z114;
                    z56 = z117;
                    z52 = z115;
                    z51 = z116;
                    bigDecimal52 = bigDecimal110;
                    bigDecimal51 = bigDecimal111;
                    bigDecimal49 = bigDecimal104;
                    bigDecimal50 = bigDecimal105;
                    z54 = z112;
                    z55 = z113;
                    bigDecimal56 = bigDecimal109;
                    range32 = range64;
                    aVar9 = aVar24;
                    bigDecimal55 = bigDecimal108;
                    range30 = range65;
                    objJ1 = obj;
                    bigDecimal57 = bigDecimal107;
                    range29 = range66;
                    bigDecimal53 = bigDecimal106;
                    range31 = range67;
                    return new c(aVar9, z56, z51, z52, z53, z55, z54, range31, range29, range30, range32, bigDecimal51, bigDecimal54, bigDecimal52, bigDecimal56, bigDecimal55, bigDecimal57, bigDecimal53, bigDecimal50, bigDecimal49, (BigDecimal) objJ1);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ze.b bVar, kotlin.coroutines.d<? super c> dVar) {
            return ((y) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public k0(@NotNull com.planner5d.library.model.manager.f2 metricUnitManager, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.userimporteddata.n userImportedModelNameProcessor, @NotNull com.planner5d.library.widget.editor.projectresources.e projectResourcesProvider, @NotNull t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(metricUnitManager, "metricUnitManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(userImportedModelNameProcessor, "userImportedModelNameProcessor");
        Intrinsics.checkNotNullParameter(projectResourcesProvider, "projectResourcesProvider");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f257443a = metricUnitManager;
        this.f257444b = builtInDataManager;
        this.f257445c = userImportedModelNameProcessor;
        this.f257446d = projectResourcesProvider;
        this.f257447e = logRecordManager;
        this.f257448f = new ArrayList();
        this.f257449g = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.X1(this.f257438a);
            }
        });
        this.f257451i = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.J1(this.f257441a);
            }
        });
        this.f257455m = new a3();
        this.f257461w = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        int i10 = (4 & 0) | 7;
        this.X = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        this.Y = new ItemLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C1(kotlin.coroutines.d<? super Boolean> dVar) {
        Item itemA1 = a1();
        if (itemA1 == null) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        return itemA1 instanceof ItemNs ? kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new m(itemA1, null), dVar) : kotlin.coroutines.jvm.internal.b.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E1() {
        if ((a1() instanceof ItemWall) && !(a1() instanceof ItemRuler)) {
            Item itemA1 = a1();
            Intrinsics.checkNotNull(itemA1, "null cannot be cast to non-null type com.planner5d.library.model.item.ItemWall");
            if (((ItemWall) itemA1).getParentWalls() instanceof ItemRoom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(com.planner5d.library.widget.editor.editaction.e eVar, com.planner5d.library.widget.editor.editaction.e eVar2) {
        v1.a<com.planner5d.library.services.l.c> aVar = com.planner5d.library.services.l.f224378d;
        com.planner5d.library.services.l.c cVar = new com.planner5d.library.services.l.c(eVar, eVar2, this.f257452j);
        this.f257452j = cVar;
        aVar.o(cVar);
    }

    private final void G1(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        Item itemA1 = a1();
        if (itemA1 == null) {
            return;
        }
        if (this.f257457o == null) {
            this.f257457o = new com.planner5d.library.widget.editor.editaction.a0(itemA1.getUid(), mVar2, null);
        }
        F1(new com.planner5d.library.widget.editor.editaction.a0(itemA1.getUid(), mVar, null), this.f257457o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x0205  */
    /* JADX WARN: Code duplicated, block: B:59:0x0208  */
    /* JADX WARN: Code duplicated, block: B:61:0x020c  */
    /* JADX WARN: Code duplicated, block: B:62:0x020f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0213  */
    /* JADX WARN: Code duplicated, block: B:65:0x0216  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object H1(kotlin.coroutines.d<? super Unit> dVar) {
        n nVar;
        WallsInfoWall wallsInfoWallT1;
        a1<c> a1VarP1;
        c cVarF;
        c cVarW;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BigDecimal bigDecimal;
        com.planner5d.library.math.c top;
        Object obj;
        int i16;
        int i17;
        k0 k0Var;
        a1<c> a1Var;
        BigDecimal bigDecimal2;
        com.planner5d.library.math.c bottom;
        int i18;
        int i19;
        int i20;
        c cVar;
        a1<c> a1Var2;
        int i21;
        BigDecimal bigDecimal3;
        Object objR1;
        a1<c> a1Var3;
        int i22;
        int i23;
        int i24;
        BigDecimal bigDecimal4;
        k0 k0Var2;
        BigDecimal bigDecimal5;
        int i25;
        BigDecimal bigDecimal6;
        Object objD1;
        BigDecimal bigDecimal7;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        BigDecimal bigDecimal8;
        BigDecimal bigDecimal9;
        c cVar2;
        a1<c> a1Var4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        k0 k0Var3 = this;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i31 = nVar.f257541n;
            if ((i31 & Integer.MIN_VALUE) != 0) {
                nVar.f257541n = i31 - Integer.MIN_VALUE;
            } else {
                nVar = k0Var3.new n(dVar);
            }
        } else {
            nVar = k0Var3.new n(dVar);
        }
        Object obj2 = nVar.f257539l;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i32 = nVar.f257541n;
        if (i32 != 0) {
            if (i32 == 1) {
                int i33 = nVar.f257538k;
                int i34 = nVar.f257537j;
                int i35 = nVar.f257536i;
                i13 = nVar.f257535h;
                i14 = nVar.f257534g;
                i15 = nVar.f257533f;
                cVarF = (c) nVar.f257531d;
                a1VarP1 = (a1) nVar.f257530c;
                wallsInfoWallT1 = (WallsInfoWall) nVar.f257529b;
                k0 k0Var4 = (k0) nVar.f257528a;
                ResultKt.m(obj2);
                i10 = i33;
                k0Var3 = k0Var4;
                i17 = i35;
                i16 = i34;
                obj = obj2;
            } else {
                if (i32 == 2) {
                    i18 = nVar.f257538k;
                    i11 = nVar.f257537j;
                    i12 = nVar.f257536i;
                    i19 = nVar.f257535h;
                    i21 = nVar.f257534g;
                    i20 = nVar.f257533f;
                    bigDecimal3 = (BigDecimal) nVar.f257531d;
                    cVar = (c) nVar.f257530c;
                    a1Var2 = (a1) nVar.f257529b;
                    k0Var = (k0) nVar.f257528a;
                    ResultKt.m(obj2);
                    bigDecimal = bigDecimal3;
                    i14 = i21;
                    bigDecimal2 = (BigDecimal) obj2;
                    i10 = i18;
                    a1Var = a1Var2;
                    cVarF = cVar;
                    i15 = i20;
                    i13 = i19;
                    nVar.f257528a = k0Var;
                    nVar.f257529b = a1Var;
                    nVar.f257530c = cVarF;
                    nVar.f257531d = bigDecimal;
                    nVar.f257532e = bigDecimal2;
                    nVar.f257533f = i15;
                    nVar.f257534g = i14;
                    nVar.f257535h = i13;
                    nVar.f257536i = i12;
                    nVar.f257537j = i11;
                    nVar.f257538k = i10;
                    nVar.f257541n = 3;
                    objR1 = k0Var.r1(nVar);
                    if (objR1 != objL) {
                        k0 k0Var5 = k0Var;
                        a1Var3 = a1Var;
                        i22 = i10;
                        obj2 = objR1;
                        i23 = i13;
                        i24 = i15;
                        bigDecimal4 = bigDecimal;
                        k0Var2 = k0Var5;
                        int i36 = i14;
                        bigDecimal5 = bigDecimal2;
                        i25 = i36;
                        bigDecimal6 = (BigDecimal) obj2;
                        nVar.f257528a = a1Var3;
                        nVar.f257529b = cVarF;
                        nVar.f257530c = bigDecimal4;
                        nVar.f257531d = bigDecimal5;
                        nVar.f257532e = bigDecimal6;
                        nVar.f257533f = i24;
                        nVar.f257534g = i25;
                        nVar.f257535h = i23;
                        nVar.f257536i = i12;
                        nVar.f257537j = i11;
                        nVar.f257538k = i22;
                        nVar.f257541n = 4;
                        objD1 = k0Var2.d1(nVar);
                        if (objD1 != objL) {
                            bigDecimal7 = bigDecimal6;
                            obj2 = objD1;
                            i26 = i11;
                            i27 = i12;
                            i28 = i23;
                            i29 = i25;
                            i30 = i24;
                            bigDecimal8 = bigDecimal5;
                            bigDecimal9 = bigDecimal4;
                            cVar2 = cVarF;
                            a1Var4 = a1Var3;
                        }
                    }
                    return objL;
                }
                if (i32 == 3) {
                    i22 = nVar.f257538k;
                    i11 = nVar.f257537j;
                    int i37 = nVar.f257536i;
                    i23 = nVar.f257535h;
                    i25 = nVar.f257534g;
                    i24 = nVar.f257533f;
                    bigDecimal5 = (BigDecimal) nVar.f257532e;
                    bigDecimal4 = (BigDecimal) nVar.f257531d;
                    cVarF = (c) nVar.f257530c;
                    a1Var3 = (a1) nVar.f257529b;
                    k0 k0Var6 = (k0) nVar.f257528a;
                    ResultKt.m(obj2);
                    k0Var2 = k0Var6;
                    i12 = i37;
                    bigDecimal6 = (BigDecimal) obj2;
                    nVar.f257528a = a1Var3;
                    nVar.f257529b = cVarF;
                    nVar.f257530c = bigDecimal4;
                    nVar.f257531d = bigDecimal5;
                    nVar.f257532e = bigDecimal6;
                    nVar.f257533f = i24;
                    nVar.f257534g = i25;
                    nVar.f257535h = i23;
                    nVar.f257536i = i12;
                    nVar.f257537j = i11;
                    nVar.f257538k = i22;
                    nVar.f257541n = 4;
                    objD1 = k0Var2.d1(nVar);
                    if (objD1 != objL) {
                        bigDecimal7 = bigDecimal6;
                        obj2 = objD1;
                        i26 = i11;
                        i27 = i12;
                        i28 = i23;
                        i29 = i25;
                        i30 = i24;
                        bigDecimal8 = bigDecimal5;
                        bigDecimal9 = bigDecimal4;
                        cVar2 = cVarF;
                        a1Var4 = a1Var3;
                    }
                    return objL;
                }
                if (i32 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i22 = nVar.f257538k;
                i26 = nVar.f257537j;
                i27 = nVar.f257536i;
                i28 = nVar.f257535h;
                i29 = nVar.f257534g;
                i30 = nVar.f257533f;
                BigDecimal bigDecimal10 = (BigDecimal) nVar.f257532e;
                BigDecimal bigDecimal11 = (BigDecimal) nVar.f257531d;
                BigDecimal bigDecimal12 = (BigDecimal) nVar.f257530c;
                c cVar3 = (c) nVar.f257529b;
                a1Var4 = (a1) nVar.f257528a;
                ResultKt.m(obj2);
                bigDecimal7 = bigDecimal10;
                bigDecimal8 = bigDecimal11;
                bigDecimal9 = bigDecimal12;
                cVar2 = cVar3;
            }
            if (i30 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i29 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i28 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i27 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i26 != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (i22 != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            cVarW = c.w(cVar2, null, z10, z11, z12, z13, z14, z15, null, null, null, null, bigDecimal9, bigDecimal8, bigDecimal7, (BigDecimal) obj2, null, null, null, null, null, null, 2066431, null);
            a1VarP1 = a1Var4;
            a1VarP1.r(cVarW);
            return Unit.f312394a;
        }
        ResultKt.m(obj2);
        wallsInfoWallT1 = k0Var3.t1();
        a1VarP1 = k0Var3.p1();
        cVarF = k0Var3.p1().f();
        if (cVarF != null) {
            if (wallsInfoWallT1 == null || (top = wallsInfoWallT1.getTop()) == null) {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                bigDecimal = null;
                if (wallsInfoWallT1 != null || (bottom = wallsInfoWallT1.getBottom()) == null) {
                    a1<c> a1Var5 = a1VarP1;
                    k0Var = k0Var3;
                    a1Var = a1Var5;
                    bigDecimal2 = null;
                    nVar.f257528a = k0Var;
                    nVar.f257529b = a1Var;
                    nVar.f257530c = cVarF;
                    nVar.f257531d = bigDecimal;
                    nVar.f257532e = bigDecimal2;
                    nVar.f257533f = i15;
                    nVar.f257534g = i14;
                    nVar.f257535h = i13;
                    nVar.f257536i = i12;
                    nVar.f257537j = i11;
                    nVar.f257538k = i10;
                    nVar.f257541n = 3;
                    objR1 = k0Var.r1(nVar);
                    if (objR1 != objL) {
                        k0 k0Var7 = k0Var;
                        a1Var3 = a1Var;
                        i22 = i10;
                        obj2 = objR1;
                        i23 = i13;
                        i24 = i15;
                        bigDecimal4 = bigDecimal;
                        k0Var2 = k0Var7;
                        int i38 = i14;
                        bigDecimal5 = bigDecimal2;
                        i25 = i38;
                        bigDecimal6 = (BigDecimal) obj2;
                        nVar.f257528a = a1Var3;
                        nVar.f257529b = cVarF;
                        nVar.f257530c = bigDecimal4;
                        nVar.f257531d = bigDecimal5;
                        nVar.f257532e = bigDecimal6;
                        nVar.f257533f = i24;
                        nVar.f257534g = i25;
                        nVar.f257535h = i23;
                        nVar.f257536i = i12;
                        nVar.f257537j = i11;
                        nVar.f257538k = i22;
                        nVar.f257541n = 4;
                        objD1 = k0Var2.d1(nVar);
                        if (objD1 != objL) {
                            bigDecimal7 = bigDecimal6;
                            obj2 = objD1;
                            i26 = i11;
                            i27 = i12;
                            i28 = i23;
                            i29 = i25;
                            i30 = i24;
                            bigDecimal8 = bigDecimal5;
                            bigDecimal9 = bigDecimal4;
                            cVar2 = cVarF;
                            a1Var4 = a1Var3;
                            if (i30 != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i29 != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (i28 != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (i27 != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (i26 != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i22 != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            cVarW = c.w(cVar2, null, z10, z11, z12, z13, z14, z15, null, null, null, null, bigDecimal9, bigDecimal8, bigDecimal7, (BigDecimal) obj2, null, null, null, null, null, null, 2066431, null);
                            a1VarP1 = a1Var4;
                        }
                    }
                } else {
                    nVar.f257528a = k0Var3;
                    nVar.f257529b = a1VarP1;
                    nVar.f257530c = cVarF;
                    nVar.f257531d = bigDecimal;
                    nVar.f257533f = i15;
                    nVar.f257534g = i14;
                    nVar.f257535h = i13;
                    nVar.f257536i = i12;
                    nVar.f257537j = i11;
                    nVar.f257538k = i10;
                    nVar.f257541n = 2;
                    Object objU0 = k0Var3.U0(bottom, nVar);
                    if (objU0 != objL) {
                        a1<c> a1Var6 = a1VarP1;
                        k0Var = k0Var3;
                        i18 = i10;
                        obj2 = objU0;
                        i19 = i13;
                        i20 = i15;
                        cVar = cVarF;
                        a1Var2 = a1Var6;
                        i21 = i14;
                        bigDecimal3 = bigDecimal;
                        bigDecimal = bigDecimal3;
                        i14 = i21;
                        bigDecimal2 = (BigDecimal) obj2;
                        i10 = i18;
                        a1Var = a1Var2;
                        cVarF = cVar;
                        i15 = i20;
                        i13 = i19;
                        nVar.f257528a = k0Var;
                        nVar.f257529b = a1Var;
                        nVar.f257530c = cVarF;
                        nVar.f257531d = bigDecimal;
                        nVar.f257532e = bigDecimal2;
                        nVar.f257533f = i15;
                        nVar.f257534g = i14;
                        nVar.f257535h = i13;
                        nVar.f257536i = i12;
                        nVar.f257537j = i11;
                        nVar.f257538k = i10;
                        nVar.f257541n = 3;
                        objR1 = k0Var.r1(nVar);
                        if (objR1 != objL) {
                            k0 k0Var8 = k0Var;
                            a1Var3 = a1Var;
                            i22 = i10;
                            obj2 = objR1;
                            i23 = i13;
                            i24 = i15;
                            bigDecimal4 = bigDecimal;
                            k0Var2 = k0Var8;
                            int i39 = i14;
                            bigDecimal5 = bigDecimal2;
                            i25 = i39;
                            bigDecimal6 = (BigDecimal) obj2;
                            nVar.f257528a = a1Var3;
                            nVar.f257529b = cVarF;
                            nVar.f257530c = bigDecimal4;
                            nVar.f257531d = bigDecimal5;
                            nVar.f257532e = bigDecimal6;
                            nVar.f257533f = i24;
                            nVar.f257534g = i25;
                            nVar.f257535h = i23;
                            nVar.f257536i = i12;
                            nVar.f257537j = i11;
                            nVar.f257538k = i22;
                            nVar.f257541n = 4;
                            objD1 = k0Var2.d1(nVar);
                            if (objD1 != objL) {
                                bigDecimal7 = bigDecimal6;
                                obj2 = objD1;
                                i26 = i11;
                                i27 = i12;
                                i28 = i23;
                                i29 = i25;
                                i30 = i24;
                                bigDecimal8 = bigDecimal5;
                                bigDecimal9 = bigDecimal4;
                                cVar2 = cVarF;
                                a1Var4 = a1Var3;
                                if (i30 != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (i29 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (i28 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (i27 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (i26 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i22 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                cVarW = c.w(cVar2, null, z10, z11, z12, z13, z14, z15, null, null, null, null, bigDecimal9, bigDecimal8, bigDecimal7, (BigDecimal) obj2, null, null, null, null, null, null, 2066431, null);
                                a1VarP1 = a1Var4;
                            }
                        }
                    }
                }
            } else {
                nVar.f257528a = k0Var3;
                nVar.f257529b = wallsInfoWallT1;
                nVar.f257530c = a1VarP1;
                nVar.f257531d = cVarF;
                nVar.f257533f = 0;
                nVar.f257534g = 0;
                nVar.f257535h = 0;
                nVar.f257536i = 0;
                nVar.f257537j = 0;
                nVar.f257538k = 0;
                nVar.f257541n = 1;
                Object objU1 = k0Var3.U0(top, nVar);
                if (objU1 != objL) {
                    obj = objU1;
                    i10 = 0;
                    i16 = 0;
                    i17 = 0;
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                }
            }
            return objL;
        }
        cVarW = null;
        a1VarP1.r(cVarW);
        return Unit.f312394a;
        int i40 = i17;
        bigDecimal = (BigDecimal) obj;
        i11 = i16;
        i12 = i40;
        if (wallsInfoWallT1 != null) {
        }
        a1<c> a1Var7 = a1VarP1;
        k0Var = k0Var3;
        a1Var = a1Var7;
        bigDecimal2 = null;
        nVar.f257528a = k0Var;
        nVar.f257529b = a1Var;
        nVar.f257530c = cVarF;
        nVar.f257531d = bigDecimal;
        nVar.f257532e = bigDecimal2;
        nVar.f257533f = i15;
        nVar.f257534g = i14;
        nVar.f257535h = i13;
        nVar.f257536i = i12;
        nVar.f257537j = i11;
        nVar.f257538k = i10;
        nVar.f257541n = 3;
        objR1 = k0Var.r1(nVar);
        if (objR1 != objL) {
            k0 k0Var9 = k0Var;
            a1Var3 = a1Var;
            i22 = i10;
            obj2 = objR1;
            i23 = i13;
            i24 = i15;
            bigDecimal4 = bigDecimal;
            k0Var2 = k0Var9;
            int i310 = i14;
            bigDecimal5 = bigDecimal2;
            i25 = i310;
            bigDecimal6 = (BigDecimal) obj2;
            nVar.f257528a = a1Var3;
            nVar.f257529b = cVarF;
            nVar.f257530c = bigDecimal4;
            nVar.f257531d = bigDecimal5;
            nVar.f257532e = bigDecimal6;
            nVar.f257533f = i24;
            nVar.f257534g = i25;
            nVar.f257535h = i23;
            nVar.f257536i = i12;
            nVar.f257537j = i11;
            nVar.f257538k = i22;
            nVar.f257541n = 4;
            objD1 = k0Var2.d1(nVar);
            if (objD1 != objL) {
                bigDecimal7 = bigDecimal6;
                obj2 = objD1;
                i26 = i11;
                i27 = i12;
                i28 = i23;
                i29 = i25;
                i30 = i24;
                bigDecimal8 = bigDecimal5;
                bigDecimal9 = bigDecimal4;
                cVar2 = cVarF;
                a1Var4 = a1Var3;
                if (i30 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i29 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i28 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i27 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i26 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i22 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                cVarW = c.w(cVar2, null, z10, z11, z12, z13, z14, z15, null, null, null, null, bigDecimal9, bigDecimal8, bigDecimal7, (BigDecimal) obj2, null, null, null, null, null, null, 2066431, null);
                a1VarP1 = a1Var4;
                a1VarP1.r(cVarW);
                return Unit.f312394a;
            }
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.w0 J1(k0 k0Var) {
        return k0Var.d().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object M1(BigDecimal bigDecimal, a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        q qVar;
        k0 k0Var;
        Item item;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i10 = qVar.f257554g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f257554g = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object obj = qVar.f257552e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = qVar.f257554g;
        if (i11 == 0) {
            ResultKt.m(obj);
            Item itemA1 = a1();
            if (itemA1 == null) {
                return Unit.f312394a;
            }
            com.planner5d.library.model.manager.f2 f2Var = this.f257443a;
            qVar.f257548a = this;
            qVar.f257549b = aVar;
            qVar.f257550c = itemA1;
            qVar.f257551d = bigDecimal;
            qVar.f257554g = 1;
            Object objK = f2Var.k(qVar);
            if (objK == objL) {
                return objL;
            }
            k0Var = this;
            item = itemA1;
            obj = objK;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bigDecimal = (BigDecimal) qVar.f257551d;
            item = (Item) qVar.f257550c;
            aVar = (a) qVar.f257549b;
            k0Var = (k0) qVar.f257548a;
            ResultKt.m(obj);
        }
        com.planner5d.library.model.metricunit.a aVar2 = (com.planner5d.library.model.metricunit.a) obj;
        if (!(item instanceof ItemPoint)) {
            int i12 = 6 & 0;
            com.planner5d.library.math.m position = item.getLayout(new ItemLayout()).getPosition(new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null));
            Intrinsics.checkNotNull(position);
            com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(position);
            float fW = k0Var.f257443a.w(bigDecimal.doubleValue(), aVar2);
            int i13 = d.f257496b[aVar.ordinal()];
            if (i13 == 1) {
                mVar.f180482a = fW;
            } else if (i13 != 2) {
                mVar.f180484c = fW;
            } else {
                mVar.f180483b = fW;
            }
            if (k0Var.f257456n == null) {
                k0Var.f257456n = new com.planner5d.library.widget.editor.editaction.t(item.getUid(), position, item.getLayout(k0Var.Y).getRotationY());
            }
            if (aVar != k0Var.f257454l) {
                k0Var.f257454l = aVar;
                k0Var.f257452j = null;
            }
            k0Var.F1(new com.planner5d.library.widget.editor.editaction.t(item.getUid(), mVar, item.getLayout(k0Var.Y).getRotationY()), k0Var.f257456n);
            return Unit.f312394a;
        }
        ItemPoint itemPoint = (ItemPoint) item;
        com.planner5d.library.math.k point = itemPoint.getPoint(new com.planner5d.library.math.k(), true);
        BigDecimal bigDecimalX = k0Var.f257443a.x(bigDecimal.doubleValue(), aVar2);
        if (d.f257496b[aVar.ordinal()] == 1) {
            point.f180480a = bigDecimalX.floatValue();
        } else {
            point.f180481b = bigDecimalX.floatValue();
        }
        if (item.getParentItem() instanceof ItemRuler) {
            k0Var.f257455m.b(itemPoint, point);
            Item parentItem = item.getParentItem();
            Intrinsics.checkNotNull(parentItem, "null cannot be cast to non-null type com.planner5d.library.model.item.ItemRuler");
            k0Var.F1(new com.planner5d.library.widget.editor.editaction.z((ItemRuler) parentItem), null);
        } else {
            Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> pairB = k0Var.f257455m.b(itemPoint, point);
            if (pairB != null) {
                if (k0Var.f257456n == null) {
                    k0Var.f257456n = (com.planner5d.library.widget.editor.editaction.e) pairB.second;
                }
                Object first = pairB.first;
                Intrinsics.checkNotNullExpressionValue(first, "first");
                k0Var.F1((com.planner5d.library.widget.editor.editaction.e) first, k0Var.f257456n);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object N1(BigDecimal bigDecimal, b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        r rVar;
        k0 k0Var;
        Item item;
        float f10;
        com.planner5d.library.model.manager.f2 f2Var;
        b bVar2;
        double d10;
        float f11;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f257564j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f257564j = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(dVar);
            }
        } else {
            rVar = new r(dVar);
        }
        Object obj = rVar.f257562h;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = rVar.f257564j;
        if (i11 == 0) {
            ResultKt.m(obj);
            Item itemA1 = a1();
            if (itemA1 == null) {
                return Unit.f312394a;
            }
            com.planner5d.library.math.m size = itemA1 instanceof ItemNs ? ((ItemNs) itemA1).getSize(new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null)) : new com.planner5d.library.math.m(100.0f, 100.0f, 100.0f);
            Intrinsics.checkNotNull(size);
            float fC1 = c1(size, bVar);
            com.planner5d.library.model.manager.f2 f2Var2 = this.f257443a;
            double dDoubleValue = bigDecimal.doubleValue();
            com.planner5d.library.model.manager.f2 f2Var3 = this.f257443a;
            rVar.f257555a = this;
            rVar.f257556b = bVar;
            rVar.f257557c = itemA1;
            rVar.f257558d = f2Var2;
            rVar.f257559e = fC1;
            rVar.f257560f = 1.0f;
            rVar.f257561g = dDoubleValue;
            rVar.f257564j = 1;
            Object objK = f2Var3.k(rVar);
            if (objK == objL) {
                return objL;
            }
            k0Var = this;
            item = itemA1;
            f10 = fC1;
            f2Var = f2Var2;
            obj = objK;
            bVar2 = bVar;
            d10 = dDoubleValue;
            f11 = 1.0f;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d10 = rVar.f257561g;
            f11 = rVar.f257560f;
            f10 = rVar.f257559e;
            f2Var = (com.planner5d.library.model.manager.f2) rVar.f257558d;
            item = (Item) rVar.f257557c;
            bVar2 = (b) rVar.f257556b;
            k0Var = (k0) rVar.f257555a;
            ResultKt.m(obj);
        }
        float fMax = Math.max(f11, f2Var.w(d10, (com.planner5d.library.model.metricunit.a) obj)) / f10;
        com.planner5d.library.math.m scale = item.getLayout(k0Var.Y).getScale(k0Var.f257461w);
        Intrinsics.checkNotNullExpressionValue(scale, "getScale(...)");
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(scale);
        if (bVar2 == b.WIDTH) {
            com.planner5d.library.math.m mVar2 = k0Var.f257461w;
            mVar2.f180482a = fMax;
            if (item instanceof ItemWindow) {
                mVar2.f180483b *= fMax / k0Var.c1(mVar, bVar2);
            }
        } else if (bVar2 == b.HEIGHT) {
            k0Var.f257461w.f180484c = fMax;
        } else if (bVar2 == b.DEPTH) {
            k0Var.f257461w.f180483b = fMax;
        }
        if (bVar2 != k0Var.f257453k) {
            k0Var.f257453k = bVar2;
            k0Var.f257452j = null;
        }
        k0Var.G1(k0Var.f257461w, mVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O0(kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new e(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P0(kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new f(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object Q0(double d10, kotlin.coroutines.d<? super BigDecimal> dVar) {
        g gVar;
        com.planner5d.library.model.manager.f2 f2Var;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f257505e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f257505e = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objK = gVar.f257503c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f257505e;
        if (i11 == 0) {
            ResultKt.m(objK);
            f2Var = this.f257443a;
            gVar.f257501a = f2Var;
            gVar.f257502b = d10;
            gVar.f257505e = 1;
            objK = f2Var.k(gVar);
            if (objK == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d10 = gVar.f257502b;
            f2Var = (com.planner5d.library.model.manager.f2) gVar.f257501a;
            ResultKt.m(objK);
        }
        return f2Var.d(d10, (com.planner5d.library.model.metricunit.a) objK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R0(float f10, kotlin.coroutines.d<? super BigDecimal> dVar) {
        return Q0(f10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S0(int i10, kotlin.coroutines.d<? super BigDecimal> dVar) {
        return Q0(i10, dVar);
    }

    private final void S1(int i10, boolean z10) {
        Item itemA1 = a1();
        if (itemA1 == null) {
            return;
        }
        if (this.f257458s == null) {
            this.f257458s = new com.planner5d.library.widget.editor.editaction.f0(itemA1.getUid(), itemA1.getLayout(this.Y).getRotation(this.X));
        }
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(this.X);
        if (z10) {
            mVar.f180483b = CropImageOptions.S3 - i10;
        } else {
            mVar.f180482a = i10;
        }
        F1(new com.planner5d.library.widget.editor.editaction.f0(itemA1.getUid(), mVar), this.f257458s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U0(com.planner5d.library.math.c cVar, kotlin.coroutines.d<? super BigDecimal> dVar) {
        return R0(cVar.d(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object V0(kotlin.coroutines.d<? super Range<BigDecimal>> dVar) {
        h hVar;
        Comparable comparable;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f257509d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f257509d = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objS0 = hVar.f257507b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f257509d;
        if (i11 == 0) {
            ResultKt.m(objS0);
            hVar.f257506a = this;
            hVar.f257509d = 1;
            objS0 = S0(-9999, hVar);
            if (objS0 != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (k0) hVar.f257506a;
            ResultKt.m(objS0);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            comparable = (Comparable) hVar.f257506a;
            ResultKt.m(objS0);
        }
        Range rangeCreate = Range.create(comparable, (Comparable) objS0);
        Intrinsics.checkNotNullExpressionValue(rangeCreate, "create(...)");
        return rangeCreate;
        Comparable comparable2 = (Comparable) objS0;
        hVar.f257506a = comparable2;
        hVar.f257509d = 2;
        Object objS1 = this.S0(org.threeten.bp.chrono.m.f339905m, hVar);
        if (objS1 != objL) {
            objS0 = objS1;
            comparable = comparable2;
            Range rangeCreate2 = Range.create(comparable, (Comparable) objS0);
            Intrinsics.checkNotNullExpressionValue(rangeCreate2, "create(...)");
            return rangeCreate2;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final CatalogItem W0(String str) {
        if (this.f257444b.r0(str)) {
            return this.f257444b.w(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X0(kotlin.coroutines.d<? super BigDecimal> dVar) {
        return b1(a1(), b.DEPTH, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a1 X1(k0 k0Var) {
        return v1.f229769a.p(g2.a(k0Var), k0Var.o1(), k0Var.new y(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y0(kotlin.coroutines.d<? super BigDecimal> dVar) {
        return b1(a1(), b.HEIGHT, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Item a1() {
        ze.b bVarF = o1().f();
        if (bVarF != null) {
            return bVarF.h();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b1(Item item, b bVar, kotlin.coroutines.d<? super BigDecimal> dVar) {
        float fC1;
        Float fE = null;
        ItemLayout layout = item != null ? item.getLayout(this.Y) : null;
        int i10 = d.f257495a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                if (layout != null) {
                    fE = kotlin.coroutines.jvm.internal.b.e(layout.getScaleY());
                }
            } else if (layout != null) {
                fE = kotlin.coroutines.jvm.internal.b.e(layout.getScaleZ());
            }
        } else if (layout != null) {
            fE = kotlin.coroutines.jvm.internal.b.e(layout.getScaleX());
        }
        if (item instanceof ItemNs) {
            com.planner5d.library.math.m size = ((ItemNs) item).getSize(new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null));
            Intrinsics.checkNotNullExpressionValue(size, "getSize(...)");
            fC1 = c1(size, bVar);
        } else {
            fC1 = item instanceof ItemPr ? 100.0f : 0.0f;
        }
        return Q0(((double) fC1) * ((double) (fE != null ? fE.floatValue() : 1.0f)), dVar);
    }

    private final float c1(com.planner5d.library.math.m mVar, b bVar) {
        int i10 = d.f257495a[bVar.ordinal()];
        int i11 = 3 | 1;
        if (i10 != 1) {
            return i10 != 2 ? mVar.f180483b : mVar.f180484c;
        }
        return mVar.f180482a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d1(kotlin.coroutines.d<? super BigDecimal> dVar) {
        com.planner5d.library.math.c top;
        Item itemA1 = a1();
        if (itemA1 instanceof ItemWall) {
            WallsInfoWall wallsInfoWallT1 = t1();
            return R0((wallsInfoWallT1 == null || (top = wallsInfoWallT1.getTop()) == null) ? ((ItemWall) itemA1).getLength() : top.d(), dVar);
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object e1(kotlin.coroutines.d<? super Range<BigDecimal>> dVar) {
        i iVar;
        Comparable comparable;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f257513d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f257513d = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objS0 = iVar.f257511b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f257513d;
        if (i11 == 0) {
            ResultKt.m(objS0);
            iVar.f257510a = this;
            iVar.f257513d = 1;
            objS0 = S0(1, iVar);
            if (objS0 == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (k0) iVar.f257510a;
            ResultKt.m(objS0);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            comparable = (Comparable) iVar.f257510a;
            ResultKt.m(objS0);
        }
        Range rangeCreate = Range.create(comparable, (Comparable) objS0);
        Intrinsics.checkNotNullExpressionValue(rangeCreate, "create(...)");
        return rangeCreate;
        Comparable comparable2 = (Comparable) objS0;
        iVar.f257510a = comparable2;
        iVar.f257513d = 2;
        Object objS1 = this.S0(org.threeten.bp.chrono.m.f339905m, iVar);
        if (objS1 != objL) {
            objS0 = objS1;
            comparable = comparable2;
            Range rangeCreate2 = Range.create(comparable, (Comparable) objS0);
            Intrinsics.checkNotNullExpressionValue(rangeCreate2, "create(...)");
            return rangeCreate2;
        }
        return objL;
    }

    private final double f1(a aVar) {
        ItemLayout layout;
        float positionX;
        Item itemA1 = a1();
        float f10 = 0.0f;
        if (itemA1 instanceof ItemPoint) {
            com.planner5d.library.math.k point = ((ItemPoint) itemA1).getPoint(new com.planner5d.library.math.k(), true);
            if (point != null) {
                positionX = d.f257496b[aVar.ordinal()] == 1 ? point.f180480a : point.f180481b;
                f10 = positionX;
            }
        } else if (itemA1 != null && (layout = itemA1.getLayout(this.Y)) != null) {
            int i10 = d.f257496b[aVar.ordinal()];
            if (i10 != 1) {
                positionX = i10 != 2 ? layout.getPositionZ() : layout.getPositionY();
            } else {
                positionX = layout.getPositionX();
            }
            f10 = positionX;
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g1(a aVar, kotlin.coroutines.d<? super BigDecimal> dVar) {
        return Q0(f1(aVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h1(kotlin.coroutines.d<? super BigDecimal> dVar) {
        return g1(a.X, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j1(kotlin.coroutines.d<? super BigDecimal> dVar) {
        return g1(a.Y, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k1(kotlin.coroutines.d<? super BigDecimal> dVar) {
        return g1(a.Z, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l1(kotlin.coroutines.d<? super Range<BigDecimal>> dVar) {
        j jVar;
        Comparable comparable;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f257517d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f257517d = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objS0 = jVar.f257515b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f257517d;
        if (i11 == 0) {
            ResultKt.m(objS0);
            jVar.f257514a = this;
            jVar.f257517d = 1;
            objS0 = S0(0, jVar);
            if (objS0 == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (k0) jVar.f257514a;
            ResultKt.m(objS0);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            comparable = (Comparable) jVar.f257514a;
            ResultKt.m(objS0);
        }
        Range rangeCreate = Range.create(comparable, (Comparable) objS0);
        Intrinsics.checkNotNullExpressionValue(rangeCreate, "create(...)");
        return rangeCreate;
        Comparable comparable2 = (Comparable) objS0;
        jVar.f257514a = comparable2;
        jVar.f257517d = 2;
        Object objS1 = this.S0(org.threeten.bp.chrono.m.f339905m, jVar);
        if (objS1 != objL) {
            objS0 = objS1;
            comparable = comparable2;
            Range rangeCreate2 = Range.create(comparable, (Comparable) objS0);
            Intrinsics.checkNotNullExpressionValue(rangeCreate2, "create(...)");
            return rangeCreate2;
        }
        return objL;
    }

    private final androidx.lifecycle.w0<ze.b> o1() {
        return (androidx.lifecycle.w0) this.f257451i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.widget.editor.projectresources.viewoptions.b q1() {
        com.planner5d.library.widget.editor.projectresources.e eVar = this.f257446d;
        ze.b bVarF = o1().f();
        com.planner5d.library.widget.editor.projectresources.viewoptions.b viewOptions = eVar.f(bVarF != null ? bVarF.j() : null).f258069a;
        Intrinsics.checkNotNullExpressionValue(viewOptions, "viewOptions");
        return viewOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r1(kotlin.coroutines.d<? super BigDecimal> dVar) {
        Item itemA1 = a1();
        if (itemA1 instanceof ItemWall) {
            return R0(((ItemWall) itemA1).thickness, dVar);
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object s1(kotlin.coroutines.d<? super Range<BigDecimal>> dVar) {
        k kVar;
        Comparable comparable;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f257521d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f257521d = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object objS0 = kVar.f257519b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f257521d;
        if (i11 == 0) {
            ResultKt.m(objS0);
            kVar.f257518a = this;
            kVar.f257521d = 1;
            objS0 = S0(5, kVar);
            if (objS0 != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (k0) kVar.f257518a;
            ResultKt.m(objS0);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            comparable = (Comparable) kVar.f257518a;
            ResultKt.m(objS0);
        }
        Range rangeCreate = Range.create(comparable, (Comparable) objS0);
        Intrinsics.checkNotNullExpressionValue(rangeCreate, "create(...)");
        return rangeCreate;
        Comparable comparable2 = (Comparable) objS0;
        kVar.f257518a = comparable2;
        kVar.f257521d = 2;
        Object objS1 = this.S0(1000, kVar);
        if (objS1 != objL) {
            objS0 = objS1;
            comparable = comparable2;
            Range rangeCreate2 = Range.create(comparable, (Comparable) objS0);
            Intrinsics.checkNotNullExpressionValue(rangeCreate2, "create(...)");
            return rangeCreate2;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WallsInfoWall t1() {
        Object objA1 = a1();
        if (objA1 instanceof ItemRuler) {
            return new WallsInfoWall((Wall) objA1);
        }
        if (objA1 instanceof ItemWall) {
            ItemWall itemWall = (ItemWall) objA1;
            return itemWall.getParentWalls().getWallInfo(itemWall);
        }
        timber.log.b.f381052a.d("Attempted to get walls info from not an ItemWall", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u1(kotlin.coroutines.d<? super BigDecimal> dVar) {
        return b1(a1(), b.WIDTH, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w1() {
        return a1() instanceof ItemWall;
    }

    private final boolean x1() {
        ItemMaterialSets materialSets;
        ItemMaterialSet itemMaterialSet;
        Item itemA1 = a1();
        ItemMaterial[] itemMaterialArr = null;
        ItemNs itemNs = itemA1 instanceof ItemNs ? (ItemNs) itemA1 : null;
        if (itemNs != null && (materialSets = itemNs.getMaterialSets()) != null && (itemMaterialSet = materialSets.getDefault()) != null) {
            itemMaterialArr = itemMaterialSet.materials;
        }
        return itemMaterialArr != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y1(kotlin.coroutines.d<? super Boolean> dVar) {
        Item itemA1 = a1();
        if (itemA1 == null) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        if (!(itemA1 instanceof ItemNs)) {
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
        int i10 = 3 | 0;
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new l(itemA1, null), dVar);
    }

    public final boolean A1() {
        return ((a1() instanceof ItemWall) || (a1() instanceof ItemWalls)) ? false : true;
    }

    public final boolean B1() {
        return ((a1() instanceof ItemPoint) || (a1() instanceof ItemWall) || (a1() instanceof ItemWalls)) ? false : true;
    }

    public final boolean D1() {
        return ((a1() instanceof ItemPoint) || x1() || (a1() instanceof ItemWall) || (a1() instanceof ItemWalls)) ? false : true;
    }

    public final void I1() {
        this.f257458s = null;
        this.f257452j = null;
    }

    @Override // ze.a.InterfaceC2545a
    public void K(@NotNull ze.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f257450h = aVar;
    }

    public final void K1(@NotNull BigDecimal width) {
        Intrinsics.checkNotNullParameter(width, "width");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new o(width, null), 3, null);
    }

    public final void L1(@NotNull BigDecimal width) {
        Intrinsics.checkNotNullParameter(width, "width");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new p(width, null), 3, null);
    }

    public final void O1(@NotNull BigDecimal length, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(length, "length");
        Item itemA1 = a1();
        if (itemA1 instanceof ItemWall) {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new s(num, this, length, itemA1, null), 3, null);
        } else {
            timber.log.b.f381052a.d("Attempted to set 'length' to not on 'ItemWall'", new Object[0]);
        }
    }

    public final void P1(@NotNull BigDecimal x10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new t(x10, null), 3, null);
    }

    public final void Q1(@NotNull BigDecimal y10) {
        Intrinsics.checkNotNullParameter(y10, "y");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new u(y10, null), 3, null);
    }

    public final void R1(@NotNull BigDecimal z10) {
        Intrinsics.checkNotNullParameter(z10, "z");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new v(z10, null), 3, null);
    }

    public final void T1(int i10) {
        S1(i10, false);
    }

    public final void U1(int i10) {
        S1(i10, true);
    }

    public final void V1(@NotNull BigDecimal thickness) {
        Intrinsics.checkNotNullParameter(thickness, "thickness");
        Item itemA1 = a1();
        if (itemA1 instanceof ItemWall) {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new w(itemA1, this, thickness, null), 3, null);
        } else {
            int i10 = 2 << 0;
            timber.log.b.f381052a.d("Attempted to set 'thickness' to not on 'ItemWall'", new Object[0]);
        }
    }

    public final void W1(@NotNull BigDecimal width) {
        Intrinsics.checkNotNullParameter(width, "width");
        int i10 = 1 << 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new x(width, null), 3, null);
    }

    @NotNull
    public final List<androidx.lifecycle.w0<Function0<Unit>>> Z0() {
        return this.f257448f;
    }

    @Override // ze.a.InterfaceC2545a
    @NotNull
    public ze.a d() {
        ze.a aVar = this.f257450h;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemPropertiesSelection");
        return null;
    }

    public final int m1() {
        ItemLayout layout;
        Item itemA1 = a1();
        return ItemLayout.toRotationAngleForUser((itemA1 == null || (layout = itemA1.getLayout(this.Y)) == null) ? 0.0f : layout.getRotationX());
    }

    public final int n1() {
        ItemLayout layout;
        Item itemA1 = a1();
        return ItemLayout.toRotationAngleForUser((itemA1 == null || (layout = itemA1.getLayout(this.Y)) == null) ? 0.0f : layout.getRotationY());
    }

    @NotNull
    public final a1<c> p1() {
        return (a1) this.f257449g.getValue();
    }

    public final boolean v1() {
        return (((a1() instanceof ItemNs) && !(a1() instanceof ItemWindow)) || (a1() instanceof ItemPr)) && !x1();
    }

    public final boolean z1() {
        return ((a1() instanceof ItemWall) || (a1() instanceof ItemWalls)) ? false : true;
    }
}
