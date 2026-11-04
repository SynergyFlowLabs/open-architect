package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.d3;
import androidx.collection.l2;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.e3;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.h2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t1;
import com.rabbitmq.client.k0;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 10 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 11 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,1010:1\n635#1,6:1101\n641#1,3:1108\n639#1,7:1111\n635#1,6:1182\n641#1,3:1189\n639#1,7:1192\n141#2:1011\n141#2:1107\n141#2:1142\n141#2:1188\n44#3,6:1012\n50#3,14:1019\n64#3,4:1058\n104#3,6:1148\n110#3,3:1179\n1#4:1018\n1#4:1066\n231#5,3:1033\n200#5,7:1036\n211#5,3:1044\n214#5,9:1048\n234#5:1057\n231#5,3:1154\n200#5,7:1157\n211#5,3:1165\n214#5,9:1169\n234#5:1178\n1399#6:1043\n1270#6:1047\n1399#6:1164\n1270#6:1168\n54#7:1062\n59#7:1064\n85#8:1063\n90#8:1065\n80#8:1100\n60#8:1119\n70#8:1126\n60#8:1133\n70#8:1138\n60#8:1200\n70#8:1203\n60#8:1206\n70#8:1209\n53#8,3:1212\n305#9,26:1067\n36#10,5:1093\n36#10,5:1143\n26#11:1098\n22#11,5:1120\n22#11,5:1127\n22#11:1134\n26#11:1136\n22#11:1139\n26#11:1141\n22#11:1201\n22#11:1204\n22#11:1207\n22#11:1210\n30#12:1099\n65#13:1118\n69#13:1125\n65#13:1132\n69#13:1137\n65#13:1199\n69#13:1202\n57#14:1135\n61#14:1140\n57#14:1205\n61#14:1208\n33#15:1211\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n615#1:1101,6\n615#1:1108,3\n615#1:1111,7\n737#1:1182,6\n737#1:1189,3\n737#1:1192,7\n148#1:1011\n615#1:1107\n640#1:1142\n737#1:1188\n435#1:1012,6\n435#1:1019,14\n435#1:1058,4\n701#1:1148,6\n701#1:1179,3\n435#1:1018\n435#1:1033,3\n435#1:1036,7\n435#1:1044,3\n435#1:1048,9\n435#1:1057\n701#1:1154,3\n701#1:1157,7\n701#1:1165,3\n701#1:1169,9\n701#1:1178\n435#1:1043\n435#1:1047\n701#1:1164\n701#1:1168\n451#1:1062\n452#1:1064\n451#1:1063\n452#1:1065\n600#1:1100\n617#1:1119\n618#1:1126\n620#1:1133\n622#1:1138\n738#1:1200\n739#1:1203\n740#1:1206\n741#1:1209\n745#1:1212,3\n553#1:1067,26\n595#1:1093,5\n658#1:1143,5\n600#1:1098\n617#1:1120,5\n618#1:1127,5\n620#1:1134\n620#1:1136\n622#1:1139\n622#1:1141\n738#1:1201\n739#1:1204\n740#1:1207\n741#1:1210\n600#1:1099\n617#1:1118\n618#1:1125\n620#1:1132\n622#1:1137\n738#1:1199\n739#1:1202\n620#1:1135\n622#1:1140\n740#1:1205\n741#1:1208\n745#1:1211\n*E\n"})
public final class c {

    @NotNull
    private static final i A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f37880y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final boolean f37881z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.layer.d f37882a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Outline f37887f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f37891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private f2 f37892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private k2 f37893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private k2 f37894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.drawscope.a f37896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private h2 f37897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f37898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.layer.a f37899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f37900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f37901t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f37902u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f37903v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f37904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private RectF f37905x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f37883b = androidx.compose.ui.graphics.drawscope.e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.w f37884c = androidx.compose.ui.unit.w.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> f37885d = C0287c.f37907a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f37886e = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37888g = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer$clipDrawBlock$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1010:1\n221#2,5:1011\n249#2,14:1016\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer$clipDrawBlock$1\n*L\n66#1:1011,5\n66#1:1016,14\n*E\n"})
    static final class b extends l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {
        b() {
            super(1);
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
            k2 k2Var = c.this.f37893l;
            if (!c.this.f37895n || !c.this.p() || k2Var == null) {
                c.this.j(fVar);
                return;
            }
            c cVar = c.this;
            int iB = p0.f38096b.b();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
            long jD = dVarZ3.d();
            dVarZ3.f().save();
            try {
                dVarZ3.i().e(k2Var, iB);
                cVar.j(fVar);
                dVarZ3.f().B();
                dVarZ3.g(jD);
            } catch (Throwable th2) {
                dVarZ3.f().B();
                dVarZ3.g(jD);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.c$c, reason: collision with other inner class name */
    static final class C0287c extends l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0287c f37907a = new C0287c();

        C0287c() {
            super(1);
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", i = {}, l = {869}, m = "toImageBitmap", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f37908a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f37910c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37908a = obj;
            this.f37910c |= Integer.MIN_VALUE;
            return c.this.v0(this);
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        boolean zAreEqual = Intrinsics.areEqual(lowerCase, "robolectric");
        f37881z = zAreEqual;
        A = zAreEqual ? j.f37991a : l.f38002a;
    }

    public c(@NotNull androidx.compose.ui.graphics.layer.d dVar) {
        this.f37882a = dVar;
        int i10 = 5 >> 1;
        n0.g.a aVar = n0.g.f332700b;
        this.f37889h = aVar.e();
        this.f37890i = n0.n.f332724b.a();
        this.f37899r = new androidx.compose.ui.graphics.layer.a();
        dVar.O(false);
        this.f37901t = androidx.compose.ui.unit.q.f42709b.b();
        this.f37902u = androidx.compose.ui.unit.u.f42720b.a();
        this.f37903v = aVar.c();
    }

    private final Outline L() {
        Outline outline = this.f37887f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f37887f = outline2;
        return outline2;
    }

    private final RectF M() {
        RectF rectF = this.f37905x;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f37905x = rectF2;
        return rectF2;
    }

    private final void N() {
        this.f37898q++;
    }

    private final void O() {
        this.f37898q--;
        f();
    }

    private final void Q() {
        this.f37882a.y(this.f37883b, this.f37884c, this, this.f37886e);
    }

    private final void R() {
        if (this.f37882a.a()) {
            return;
        }
        try {
            Q();
        } catch (Throwable unused) {
        }
    }

    private final void T() {
        this.f37892k = null;
        this.f37893l = null;
        this.f37890i = n0.n.f332724b.a();
        this.f37889h = n0.g.f332700b.e();
        this.f37891j = 0.0f;
        this.f37888g = true;
        this.f37895n = false;
    }

    private final <T> T U(Function2<? super n0.g, ? super n0.n, ? extends T> function2) {
        long jH = androidx.compose.ui.unit.v.h(this.f37902u);
        long j10 = this.f37889h;
        long j11 = this.f37890i;
        if (j11 != n0.d.f332689d) {
            jH = j11;
        }
        return function2.invoke(n0.g.d(j10), n0.n.c(jH));
    }

    private final void d(c cVar) {
        if (this.f37899r.i(cVar)) {
            cVar.N();
        }
    }

    private final void e() {
        if (this.f37888g) {
            Outline outline = null;
            if (this.f37904w || E() > 0.0f) {
                k2 k2Var = this.f37893l;
                if (k2Var != null) {
                    RectF rectFM = M();
                    if (!(k2Var instanceof androidx.compose.ui.graphics.n)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((androidx.compose.ui.graphics.n) k2Var).Z().computeBounds(rectFM, false);
                    Outline outlineX0 = x0(k2Var);
                    if (outlineX0 != null) {
                        outlineX0.setAlpha(l());
                        outline = outlineX0;
                    }
                    this.f37882a.w(outline, androidx.compose.ui.unit.u.e((k0.f265952a & ((long) Math.round(rectFM.height()))) | (((long) Math.round(rectFM.width())) << 32)));
                    if (this.f37895n && this.f37904w) {
                        this.f37882a.O(false);
                        this.f37882a.c();
                    } else {
                        this.f37882a.O(this.f37904w);
                    }
                } else {
                    this.f37882a.O(this.f37904w);
                    n0.n.f332724b.c();
                    Outline outlineL = L();
                    long jH = androidx.compose.ui.unit.v.h(this.f37902u);
                    long j10 = this.f37889h;
                    long j11 = this.f37890i;
                    long j12 = j11 == n0.d.f332689d ? jH : j11;
                    int i10 = (int) (j10 >> 32);
                    int iRound = Math.round(Float.intBitsToFloat(i10));
                    int i11 = (int) (j10 & k0.f265952a);
                    outlineL.setRoundRect(iRound, Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j12 >> 32))), Math.round(Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 & k0.f265952a))), this.f37891j);
                    outlineL.setAlpha(l());
                    this.f37882a.w(outlineL, androidx.compose.ui.unit.v.d(j12));
                }
            } else {
                this.f37882a.O(false);
                this.f37882a.w(null, androidx.compose.ui.unit.u.f42720b.a());
            }
        }
        this.f37888g = false;
    }

    private final void e0(long j10, long j11) {
        this.f37882a.H(androidx.compose.ui.unit.q.n(j10), androidx.compose.ui.unit.q.p(j10), j11);
    }

    private final void f() {
        if (this.f37900s && this.f37898q == 0) {
            g();
        }
    }

    public static /* synthetic */ void g0(c cVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = n0.g.f332700b.e();
        }
        if ((i10 & 2) != 0) {
            j11 = n0.n.f332724b.a();
        }
        cVar.f0(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[LOOP:0: B:20:0x005e->B:30:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6 A[EDGE_INSN: B:34:0x00a6->B:31:0x00a6 BREAK  A[LOOP:0: B:20:0x005e->B:30:0x00a2], SYNTHETIC] */
    public final void j(androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.layer.a aVar = this.f37899r;
        aVar.f37870b = aVar.f37869a;
        l2 l2Var = aVar.f37871c;
        if (l2Var != null && l2Var.s()) {
            l2 l2VarB = aVar.f37872d;
            if (l2VarB == null) {
                l2VarB = d3.b();
                aVar.f37872d = l2VarB;
            }
            l2VarB.F(l2Var);
            l2Var.L();
        }
        aVar.f37873e = true;
        this.f37885d.invoke(fVar);
        aVar.f37873e = false;
        c cVar = aVar.f37870b;
        if (cVar != null) {
            cVar.O();
        }
        l2 l2Var2 = aVar.f37872d;
        if (l2Var2 == null || !l2Var2.s()) {
            return;
        }
        Object[] objArr = l2Var2.f12171b;
        long[] jArr = l2Var2.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            ((c) objArr[(i10 << 3) + i12]).O();
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        l2Var2.L();
    }

    public static /* synthetic */ void m0(c cVar, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = n0.g.f332700b.e();
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = n0.n.f332724b.a();
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        cVar.l0(j12, j13, f10);
    }

    public static /* synthetic */ void q() {
    }

    private final void q0(long j10) {
        if (androidx.compose.ui.unit.u.h(this.f37902u, j10)) {
            return;
        }
        this.f37902u = j10;
        e0(this.f37901t, j10);
        if (this.f37890i == n0.d.f332689d) {
            this.f37888g = true;
            e();
        }
    }

    private final void w0(Canvas canvas) {
        Canvas canvas2;
        float fN = androidx.compose.ui.unit.q.n(this.f37901t);
        float fP = androidx.compose.ui.unit.q.p(this.f37901t);
        float fN2 = androidx.compose.ui.unit.q.n(this.f37901t) + ((int) (this.f37902u >> 32));
        float fP2 = androidx.compose.ui.unit.q.p(this.f37901t) + ((int) (this.f37902u & k0.f265952a));
        float fL = l();
        r0 r0VarR = r();
        int iN = n();
        if (fL < 1.0f || !d0.G(iN, d0.f37693b.B()) || r0VarR != null || androidx.compose.ui.graphics.layer.b.g(s(), androidx.compose.ui.graphics.layer.b.f37875b.c())) {
            h2 h2VarA = this.f37897p;
            if (h2VarA == null) {
                h2VarA = androidx.compose.ui.graphics.m.a();
                this.f37897p = h2VarA;
            }
            h2VarA.setAlpha(fL);
            h2VarA.s(iN);
            h2VarA.f(r0VarR);
            canvas2 = canvas;
            canvas2.saveLayer(fN, fP, fN2, fP2, h2VarA.D());
        } else {
            canvas.save();
            canvas2 = canvas;
        }
        canvas2.translate(fN, fP);
        canvas2.concat(this.f37882a.n());
    }

    private final Outline x0(k2 k2Var) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outlineL = L();
        if (i10 >= 30) {
            p.f38007a.a(outlineL, k2Var);
        } else {
            if (!(k2Var instanceof androidx.compose.ui.graphics.n)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outlineL.setConvexPath(((androidx.compose.ui.graphics.n) k2Var).Z());
        }
        this.f37895n = !outlineL.canClip();
        this.f37893l = k2Var;
        return outlineL;
    }

    public final float A() {
        return this.f37882a.q();
    }

    public final float B() {
        return this.f37882a.v();
    }

    public final float C() {
        return this.f37882a.B();
    }

    public final float D() {
        return this.f37882a.F();
    }

    public final float E() {
        return this.f37882a.a0();
    }

    public final long F() {
        return this.f37902u;
    }

    public final long G() {
        return this.f37882a.L();
    }

    public final long H() {
        return this.f37901t;
    }

    public final float I() {
        return this.f37882a.p();
    }

    public final float J() {
        return this.f37882a.o();
    }

    public final boolean K() {
        return this.f37900s;
    }

    public final void P(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, long j10, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        q0(j10);
        this.f37883b = dVar;
        this.f37884c = wVar;
        this.f37885d = function1;
        this.f37882a.J(true);
        Q();
    }

    public final void S() {
        if (this.f37900s) {
            return;
        }
        this.f37900s = true;
        f();
    }

    public final void V(float f10) {
        if (this.f37882a.r() == f10) {
            return;
        }
        this.f37882a.setAlpha(f10);
    }

    public final void W(long j10) {
        if (!q0.y(j10, this.f37882a.f0())) {
            this.f37882a.h0(j10);
        }
    }

    public final void X(int i10) {
        if (d0.G(this.f37882a.t(), i10)) {
            return;
        }
        this.f37882a.s(i10);
    }

    public final void Y(float f10) {
        if (this.f37882a.i() == f10) {
            return;
        }
        this.f37882a.j(f10);
    }

    public final void Z(boolean z10) {
        if (this.f37904w != z10) {
            this.f37904w = z10;
            this.f37888g = true;
            e();
        }
    }

    public final void a0(@Nullable r0 r0Var) {
        if (!Intrinsics.areEqual(this.f37882a.e(), r0Var)) {
            this.f37882a.f(r0Var);
        }
    }

    public final void b0(int i10) {
        if (androidx.compose.ui.graphics.layer.b.g(this.f37882a.G(), i10)) {
            return;
        }
        this.f37882a.N(i10);
    }

    public final void c0(@NotNull k2 k2Var) {
        T();
        this.f37893l = k2Var;
        e();
    }

    public final void d0(long j10) {
        if (n0.g.l(this.f37903v, j10)) {
            return;
        }
        this.f37903v = j10;
        this.f37882a.M(j10);
    }

    public final void f0(long j10, long j11) {
        l0(j10, j11, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c A[LOOP:0: B:10:0x0020->B:20:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[EDGE_INSN: B:25:0x005f->B:21:0x005f BREAK  A[LOOP:0: B:10:0x0020->B:20:0x005c], SYNTHETIC] */
    public final void g() {
        androidx.compose.ui.graphics.layer.a aVar = this.f37899r;
        c cVar = aVar.f37869a;
        if (cVar != null) {
            cVar.O();
            aVar.f37869a = null;
        }
        l2 l2Var = aVar.f37871c;
        if (l2Var != null) {
            Object[] objArr = l2Var.f12171b;
            long[] jArr = l2Var.f12170a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                ((c) objArr[(i10 << 3) + i12]).O();
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            l2Var.L();
        }
        this.f37882a.c();
    }

    public final void h(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable c cVar) {
        if (this.f37900s) {
            return;
        }
        e();
        R();
        boolean z10 = E() > 0.0f;
        if (z10) {
            k0Var.D();
        }
        Canvas canvasD = androidx.compose.ui.graphics.c.d(k0Var);
        boolean zIsHardwareAccelerated = canvasD.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            w0(canvasD);
        }
        boolean z11 = !zIsHardwareAccelerated && this.f37904w;
        if (z11) {
            k0Var.save();
            f2 f2VarV = v();
            if (f2VarV instanceof f2.b) {
                androidx.compose.ui.graphics.k0.p(k0Var, ((f2.b) f2VarV).a(), 0, 2, null);
            } else if (f2VarV instanceof f2.c) {
                k2 k2VarA = this.f37894m;
                if (k2VarA != null) {
                    k2VarA.P();
                } else {
                    k2VarA = androidx.compose.ui.graphics.u.a();
                    this.f37894m = k2VarA;
                }
                k2.S(k2VarA, ((f2.c) f2VarV).b(), null, 2, null);
                androidx.compose.ui.graphics.k0.C(k0Var, k2VarA, 0, 2, null);
            } else {
                if (!(f2VarV instanceof f2.a)) {
                    throw new kotlin.k0();
                }
                androidx.compose.ui.graphics.k0.C(k0Var, ((f2.a) f2VarV).b(), 0, 2, null);
            }
        }
        if (cVar != null) {
            cVar.d(this);
        }
        if (androidx.compose.ui.graphics.c.d(k0Var).isHardwareAccelerated() || this.f37882a.u()) {
            this.f37882a.x(k0Var);
        } else {
            androidx.compose.ui.graphics.drawscope.a aVar = this.f37896o;
            if (aVar == null) {
                aVar = new androidx.compose.ui.graphics.drawscope.a();
                this.f37896o = aVar;
            }
            androidx.compose.ui.unit.d dVar = this.f37883b;
            androidx.compose.ui.unit.w wVar = this.f37884c;
            long jH = androidx.compose.ui.unit.v.h(this.f37902u);
            androidx.compose.ui.unit.d density = aVar.Z3().getDensity();
            androidx.compose.ui.unit.w layoutDirection = aVar.Z3().getLayoutDirection();
            androidx.compose.ui.graphics.k0 k0VarF = aVar.Z3().f();
            long jD = aVar.Z3().d();
            c cVarH = aVar.Z3().h();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = aVar.Z3();
            dVarZ3.e(dVar);
            dVarZ3.b(wVar);
            dVarZ3.k(k0Var);
            dVarZ3.g(jH);
            dVarZ3.j(this);
            k0Var.save();
            try {
                j(aVar);
                k0Var.B();
                androidx.compose.ui.graphics.drawscope.d dVarZ4 = aVar.Z3();
                dVarZ4.e(density);
                dVarZ4.b(layoutDirection);
                dVarZ4.k(k0VarF);
                dVarZ4.g(jD);
                dVarZ4.j(cVarH);
            } catch (Throwable th2) {
                k0Var.B();
                androidx.compose.ui.graphics.drawscope.d dVarZ5 = aVar.Z3();
                dVarZ5.e(density);
                dVarZ5.b(layoutDirection);
                dVarZ5.k(k0VarF);
                dVarZ5.g(jD);
                dVarZ5.j(cVarH);
                throw th2;
            }
        }
        if (z11) {
            k0Var.B();
        }
        if (z10) {
            k0Var.q();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasD.restore();
    }

    public final void h0(@Nullable e3 e3Var) {
        if (Intrinsics.areEqual(this.f37882a.g(), e3Var)) {
            return;
        }
        this.f37882a.A(e3Var);
    }

    public final void i(@NotNull androidx.compose.ui.graphics.k0 k0Var) {
        if (androidx.compose.ui.graphics.c.d(k0Var).isHardwareAccelerated() || this.f37882a.u()) {
            R();
            this.f37882a.x(k0Var);
        }
    }

    public final void i0(float f10) {
        if (this.f37882a.D() == f10) {
            return;
        }
        this.f37882a.k(f10);
    }

    public final void j0(float f10) {
        if (this.f37882a.q() == f10) {
            return;
        }
        this.f37882a.l(f10);
    }

    @lm.n
    public final void k() {
        this.f37882a.c();
    }

    public final void k0(float f10) {
        if (this.f37882a.v() == f10) {
            return;
        }
        this.f37882a.m(f10);
    }

    public final float l() {
        return this.f37882a.r();
    }

    public final void l0(long j10, long j11, float f10) {
        if (n0.g.l(this.f37889h, j10) && n0.n.k(this.f37890i, j11) && this.f37891j == f10 && this.f37893l == null) {
            return;
        }
        T();
        this.f37889h = j10;
        this.f37890i = j11;
        this.f37891j = f10;
        e();
    }

    public final long m() {
        return this.f37882a.f0();
    }

    public final int n() {
        return this.f37882a.t();
    }

    public final void n0(float f10) {
        if (this.f37882a.B() == f10) {
            return;
        }
        this.f37882a.z(f10);
    }

    public final float o() {
        return this.f37882a.i();
    }

    public final void o0(float f10) {
        if (this.f37882a.F() == f10) {
            return;
        }
        this.f37882a.C(f10);
    }

    public final boolean p() {
        return this.f37904w;
    }

    public final void p0(float f10) {
        if (this.f37882a.a0() == f10) {
            return;
        }
        this.f37882a.Q(f10);
        this.f37888g = true;
        e();
    }

    @Nullable
    public final r0 r() {
        return this.f37882a.e();
    }

    public final void r0(long j10) {
        if (!q0.y(j10, this.f37882a.L())) {
            this.f37882a.j0(j10);
        }
    }

    public final int s() {
        return this.f37882a.G();
    }

    public final void s0(long j10) {
        if (androidx.compose.ui.unit.q.k(this.f37901t, j10)) {
            return;
        }
        this.f37901t = j10;
        e0(j10, this.f37902u);
    }

    @NotNull
    public final androidx.compose.ui.graphics.layer.d t() {
        return this.f37882a;
    }

    public final void t0(float f10) {
        if (this.f37882a.p() == f10) {
            return;
        }
        this.f37882a.E(f10);
    }

    public final long u() {
        return this.f37882a.getLayerId();
    }

    public final void u0(float f10) {
        if (this.f37882a.o() == f10) {
            return;
        }
        this.f37882a.h(f10);
    }

    @NotNull
    public final f2 v() {
        f2 bVar;
        f2 f2Var = this.f37892k;
        k2 k2Var = this.f37893l;
        if (f2Var != null) {
            return f2Var;
        }
        if (k2Var != null) {
            f2.a aVar = new f2.a(k2Var);
            this.f37892k = aVar;
            return aVar;
        }
        long jH = androidx.compose.ui.unit.v.h(this.f37902u);
        long j10 = this.f37889h;
        long j11 = this.f37890i;
        if (j11 != n0.d.f332689d) {
            jH = j11;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jH >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jH & k0.f265952a));
        float f10 = this.f37891j;
        if (f10 > 0.0f) {
            bVar = new f2.c(n0.m.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, n0.a.e((((long) Float.floatToRawIntBits(f10)) << 32) | (k0.f265952a & ((long) Float.floatToRawIntBits(f10))))));
        } else {
            bVar = new f2.b(new n0.j(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f37892k = bVar;
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final Object v0(@NotNull kotlin.coroutines.d<? super t1> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f37910c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f37910c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objA = dVar2.f37908a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f37910c;
        if (i11 == 0) {
            ResultKt.m(objA);
            i iVar = A;
            dVar2.f37910c = 1;
            objA = iVar.a(this, dVar2);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objA);
        }
        return androidx.compose.ui.graphics.j.c((Bitmap) objA);
    }

    public final long w() {
        return this.f37882a.K();
    }

    public final long x() {
        return this.f37903v;
    }

    @Nullable
    public final e3 y() {
        return this.f37882a.g();
    }

    public final float z() {
        return this.f37882a.D();
    }
}
