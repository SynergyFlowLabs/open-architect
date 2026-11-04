package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 9 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 11 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 12 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,322:1\n1#2:323\n65#3:324\n69#3:327\n65#3:329\n69#3:332\n65#3:335\n69#3:339\n65#3:347\n69#3:350\n65#3:353\n69#3:357\n65#3:404\n69#3:407\n65#3:410\n69#3:414\n60#4:325\n70#4:328\n60#4:330\n70#4:333\n60#4:336\n70#4:340\n53#4,3:344\n60#4:348\n70#4:351\n60#4:354\n70#4:358\n60#4:362\n70#4:365\n53#4,3:367\n53#4,3:377\n60#4:385\n53#4,3:388\n53#4,3:392\n60#4:405\n70#4:408\n60#4:411\n70#4:415\n60#4:419\n22#5:326\n22#5:331\n22#5:334\n22#5:337\n22#5:341\n22#5:349\n22#5:352\n22#5:355\n22#5:359\n22#5:363\n26#5:380\n26#5:381\n26#5:382\n26#5:383\n22#5:386\n26#5:395\n26#5:396\n26#5:397\n26#5:398\n22#5:406\n22#5:409\n22#5:412\n22#5:416\n22#5:420\n57#6:338\n61#6:342\n57#6:356\n61#6:360\n57#6:361\n61#6:364\n57#6:413\n61#6:417\n33#7:343\n30#8:366\n30#8:387\n57#9,6:370\n33#10:376\n33#10:391\n48#11:384\n48#11:418\n36#12,5:399\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n166#1:324\n166#1:327\n194#1:329\n195#1:332\n196#1:335\n197#1:339\n213#1:347\n214#1:350\n215#1:353\n216#1:357\n306#1:404\n307#1:407\n308#1:410\n309#1:414\n166#1:325\n166#1:328\n194#1:330\n195#1:333\n196#1:336\n197#1:340\n198#1:344,3\n213#1:348\n214#1:351\n215#1:354\n216#1:358\n231#1:362\n231#1:365\n249#1:367,3\n250#1:377,3\n260#1:385\n261#1:388,3\n262#1:392,3\n306#1:405\n307#1:408\n308#1:411\n309#1:415\n310#1:419\n166#1:326\n194#1:331\n195#1:334\n196#1:337\n197#1:341\n213#1:349\n214#1:352\n215#1:355\n216#1:359\n231#1:363\n252#1:380\n253#1:381\n254#1:382\n255#1:383\n260#1:386\n265#1:395\n266#1:396\n267#1:397\n268#1:398\n306#1:406\n307#1:409\n308#1:412\n309#1:416\n310#1:420\n196#1:338\n197#1:342\n215#1:356\n216#1:360\n231#1:361\n231#1:364\n308#1:413\n309#1:417\n198#1:343\n249#1:366\n261#1:387\n250#1:370,6\n250#1:376\n262#1:391\n260#1:384\n310#1:418\n286#1:399,5\n*E\n"})
public final class g3 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f40474p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40475a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Outline f40476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.f2 f40477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.k2 f40478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.k2 f40479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.k2 f40482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private n0.l f40483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f40484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f40485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f40486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.k2 f40488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.k2 f40489o;

    public g3() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f40476b = outline;
        this.f40485k = n0.g.f332700b.e();
        this.f40486l = n0.n.f332724b.c();
    }

    private final boolean g(n0.l lVar, long j10, long j11, float f10) {
        boolean z10 = false;
        if (lVar != null && n0.m.q(lVar)) {
            int i10 = (int) (j10 >> 32);
            if (lVar.q() == Float.intBitsToFloat(i10)) {
                float fS = lVar.s();
                int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
                if (fS == Float.intBitsToFloat(i11) && lVar.r() == Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)) && lVar.m() == Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)) && Float.intBitsToFloat((int) (lVar.t() >> 32)) == f10) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    private final void i() {
        if (this.f40480f) {
            this.f40485k = n0.g.f332700b.e();
            this.f40484j = 0.0f;
            this.f40479e = null;
            this.f40480f = false;
            this.f40481g = false;
            androidx.compose.ui.graphics.f2 f2Var = this.f40477c;
            if (f2Var == null || !this.f40487m || Float.intBitsToFloat((int) (this.f40486l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f40486l & com.rabbitmq.client.k0.f265952a)) <= 0.0f) {
                this.f40476b.setEmpty();
                return;
            }
            this.f40475a = true;
            if (f2Var instanceof androidx.compose.ui.graphics.f2.b) {
                k(((androidx.compose.ui.graphics.f2.b) f2Var).b());
            } else if (f2Var instanceof androidx.compose.ui.graphics.f2.c) {
                l(((androidx.compose.ui.graphics.f2.c) f2Var).b());
            } else {
                if (!(f2Var instanceof androidx.compose.ui.graphics.f2.a)) {
                    throw new kotlin.k0();
                }
                j(((androidx.compose.ui.graphics.f2.a) f2Var).b());
            }
        }
    }

    private final void j(androidx.compose.ui.graphics.k2 k2Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            h3.f40505a.a(this.f40476b, k2Var);
        } else {
            Outline outline = this.f40476b;
            if (!(k2Var instanceof androidx.compose.ui.graphics.n)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((androidx.compose.ui.graphics.n) k2Var).Z());
        }
        this.f40481g = !this.f40476b.canClip();
        this.f40479e = k2Var;
    }

    private final void k(n0.j jVar) {
        float fT = jVar.t();
        this.f40485k = n0.g.g((((long) Float.floatToRawIntBits(jVar.B())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fT) << 32));
        float fX = jVar.x() - jVar.t();
        this.f40486l = n0.n.f((((long) Float.floatToRawIntBits(jVar.j() - jVar.B())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fX) << 32));
        this.f40476b.setRect(Math.round(jVar.t()), Math.round(jVar.B()), Math.round(jVar.x()), Math.round(jVar.j()));
    }

    private final void l(n0.l lVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lVar.t() >> 32));
        float fQ = lVar.q();
        this.f40485k = n0.g.g((((long) Float.floatToRawIntBits(lVar.s())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fQ) << 32));
        float fV = lVar.v();
        this.f40486l = n0.n.f((((long) Float.floatToRawIntBits(lVar.p())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fV) << 32));
        if (n0.m.q(lVar)) {
            this.f40476b.setRoundRect(Math.round(lVar.q()), Math.round(lVar.s()), Math.round(lVar.r()), Math.round(lVar.m()), fIntBitsToFloat);
            this.f40484j = fIntBitsToFloat;
            return;
        }
        androidx.compose.ui.graphics.k2 k2VarA = this.f40478d;
        if (k2VarA == null) {
            k2VarA = androidx.compose.ui.graphics.u.a();
            this.f40478d = k2VarA;
        }
        k2VarA.reset();
        androidx.compose.ui.graphics.k2.S(k2VarA, lVar, null, 2, null);
        j(k2VarA);
    }

    public final void a(@NotNull androidx.compose.ui.graphics.k0 k0Var) {
        androidx.compose.ui.graphics.k2 k2VarD = d();
        if (k2VarD != null) {
            androidx.compose.ui.graphics.k0.C(k0Var, k2VarD, 0, 2, null);
            return;
        }
        float f10 = this.f40484j;
        if (f10 <= 0.0f) {
            androidx.compose.ui.graphics.k0.E(k0Var, Float.intBitsToFloat((int) (this.f40485k >> 32)), Float.intBitsToFloat((int) (this.f40485k & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (this.f40485k >> 32)) + Float.intBitsToFloat((int) (this.f40486l >> 32)), Float.intBitsToFloat((int) (this.f40485k & com.rabbitmq.client.k0.f265952a)) + Float.intBitsToFloat((int) (this.f40486l & com.rabbitmq.client.k0.f265952a)), 0, 16, null);
            return;
        }
        androidx.compose.ui.graphics.k2 k2VarA = this.f40482h;
        n0.l lVar = this.f40483i;
        if (k2VarA == null || !g(lVar, this.f40485k, this.f40486l, f10)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f40485k >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f40485k & com.rabbitmq.client.k0.f265952a));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f40485k >> 32)) + Float.intBitsToFloat((int) (this.f40486l >> 32));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.f40485k & com.rabbitmq.client.k0.f265952a)) + Float.intBitsToFloat((int) (this.f40486l & com.rabbitmq.client.k0.f265952a));
            float f11 = this.f40484j;
            n0.l lVarE = n0.m.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, n0.a.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a)));
            if (k2VarA == null) {
                k2VarA = androidx.compose.ui.graphics.u.a();
            } else {
                k2VarA.reset();
            }
            androidx.compose.ui.graphics.k2.S(k2VarA, lVarE, null, 2, null);
            this.f40483i = lVarE;
            this.f40482h = k2VarA;
        }
        androidx.compose.ui.graphics.k0.C(k0Var, k2VarA, 0, 2, null);
    }

    @Nullable
    public final Outline b() {
        i();
        if (this.f40487m && this.f40475a) {
            return this.f40476b;
        }
        return null;
    }

    public final boolean c() {
        return this.f40480f;
    }

    @Nullable
    public final androidx.compose.ui.graphics.k2 d() {
        i();
        return this.f40479e;
    }

    public final boolean e() {
        return !this.f40481g;
    }

    public final boolean f(long j10) {
        androidx.compose.ui.graphics.f2 f2Var;
        if (this.f40487m && (f2Var = this.f40477c) != null) {
            return y3.b(f2Var, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), this.f40488n, this.f40489o);
        }
        return true;
    }

    public final boolean h(@Nullable androidx.compose.ui.graphics.f2 f2Var, float f10, boolean z10, float f11, long j10) {
        this.f40476b.setAlpha(f10);
        boolean zAreEqual = Intrinsics.areEqual(this.f40477c, f2Var);
        boolean z11 = !zAreEqual;
        if (!zAreEqual) {
            this.f40477c = f2Var;
            this.f40480f = true;
        }
        this.f40486l = j10;
        boolean z12 = f2Var != null && (z10 || f11 > 0.0f);
        if (this.f40487m != z12) {
            this.f40487m = z12;
            this.f40480f = true;
        }
        return z11;
    }
}
