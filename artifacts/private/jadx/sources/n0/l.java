package n0;

import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
@SourceDebugExtension({"SMAP\nRoundRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRect\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,423:1\n53#2:424\n48#2:427\n53#2:430\n48#2:433\n48#2:436\n53#2:439\n48#2:446\n53#2:449\n48#2:456\n53#2:459\n48#2:466\n53#2:469\n48#2:484\n53#2:488\n48#2:492\n53#2:496\n48#2:497\n53#2:500\n48#2:506\n53#2:510\n48#2:514\n53#2:518\n48#2:519\n53#2:522\n48#2:528\n53#2:532\n48#2:536\n53#2:540\n48#2:541\n53#2:544\n48#2:550\n53#2:554\n48#2:558\n53#2:562\n48#2:563\n53#2:566\n48#2:569\n53#2:572\n48#2:574\n48#2:577\n53#2:580\n70#3:425\n60#3:428\n70#3:431\n60#3:434\n60#3:437\n70#3:440\n53#3,3:443\n60#3:447\n70#3:450\n53#3,3:453\n60#3:457\n70#3:460\n53#3,3:463\n60#3:467\n70#3:470\n53#3,3:473\n60#3:477\n70#3:480\n60#3:482\n70#3:486\n60#3:490\n70#3:494\n60#3:498\n70#3:501\n60#3:504\n70#3:508\n60#3:512\n70#3:516\n60#3:520\n70#3:523\n60#3:526\n70#3:530\n60#3:534\n70#3:538\n60#3:542\n70#3:545\n60#3:548\n70#3:552\n60#3:556\n70#3:560\n60#3:564\n70#3:567\n60#3:570\n70#3:573\n60#3:575\n60#3:578\n70#3:581\n22#4:426\n22#4:429\n22#4:432\n22#4:435\n22#4:438\n22#4:441\n22#4:448\n22#4:451\n22#4:458\n22#4:461\n22#4:468\n22#4:471\n22#4:478\n22#4:483\n22#4:487\n22#4:491\n22#4:495\n22#4:499\n22#4:502\n22#4:505\n22#4:509\n22#4:513\n22#4:517\n22#4:521\n22#4:524\n22#4:527\n22#4:531\n22#4:535\n22#4:539\n22#4:543\n22#4:546\n22#4:549\n22#4:553\n22#4:557\n22#4:561\n22#4:565\n22#4:568\n22#4:571\n22#4:576\n22#4:579\n22#4:582\n33#5:442\n33#5:452\n33#5:462\n33#5:472\n65#6:476\n69#6:479\n65#6:481\n69#6:485\n65#6:489\n69#6:493\n65#6:503\n69#6:507\n65#6:511\n69#6:515\n65#6:525\n69#6:529\n65#6:533\n69#6:537\n65#6:547\n69#6:551\n65#6:555\n69#6:559\n*S KotlinDebug\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRect\n*L\n73#1:424\n74#1:427\n76#1:430\n78#1:433\n87#1:436\n88#1:439\n92#1:446\n93#1:449\n97#1:456\n98#1:459\n102#1:466\n103#1:469\n149#1:484\n150#1:488\n152#1:492\n153#1:496\n154#1:497\n155#1:500\n157#1:506\n158#1:510\n160#1:514\n161#1:518\n162#1:519\n163#1:522\n165#1:528\n166#1:532\n168#1:536\n169#1:540\n170#1:541\n171#1:544\n173#1:550\n174#1:554\n176#1:558\n177#1:562\n178#1:563\n179#1:566\n203#1:569\n203#1:572\n204#1:574\n206#1:577\n207#1:580\n73#1:425\n74#1:428\n76#1:431\n78#1:434\n87#1:437\n88#1:440\n86#1:443,3\n92#1:447\n93#1:450\n91#1:453,3\n97#1:457\n98#1:460\n96#1:463,3\n102#1:467\n103#1:470\n101#1:473,3\n135#1:477\n135#1:480\n149#1:482\n150#1:486\n152#1:490\n153#1:494\n154#1:498\n155#1:501\n157#1:504\n158#1:508\n160#1:512\n161#1:516\n162#1:520\n163#1:523\n165#1:526\n166#1:530\n168#1:534\n169#1:538\n170#1:542\n171#1:545\n173#1:548\n174#1:552\n176#1:556\n177#1:560\n178#1:564\n179#1:567\n203#1:570\n203#1:573\n204#1:575\n206#1:578\n207#1:581\n73#1:426\n74#1:429\n76#1:432\n78#1:435\n87#1:438\n88#1:441\n92#1:448\n93#1:451\n97#1:458\n98#1:461\n102#1:468\n103#1:471\n135#1:478\n149#1:483\n150#1:487\n152#1:491\n153#1:495\n154#1:499\n155#1:502\n157#1:505\n158#1:509\n160#1:513\n161#1:517\n162#1:521\n163#1:524\n165#1:527\n166#1:531\n168#1:535\n169#1:539\n170#1:543\n171#1:546\n173#1:549\n174#1:553\n176#1:557\n177#1:561\n178#1:565\n179#1:568\n203#1:571\n204#1:576\n206#1:579\n207#1:582\n86#1:442\n91#1:452\n96#1:462\n101#1:472\n135#1:476\n135#1:479\n149#1:481\n150#1:485\n152#1:489\n153#1:493\n157#1:503\n158#1:507\n160#1:511\n161#1:515\n165#1:525\n166#1:529\n168#1:533\n169#1:537\n173#1:547\n174#1:551\n176#1:555\n177#1:559\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f332713k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f332715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f332716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f332717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f332718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f332719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f332720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f332721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f332722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private l f332723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f332712j = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final l f332714l = m.e(0.0f, 0.0f, 0.0f, 0.0f, n0.a.f332683b.a());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final l a() {
            return l.f332714l;
        }

        private a() {
        }
    }

    public /* synthetic */ l(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public static /* synthetic */ l l(l lVar, float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = lVar.f332715a;
        }
        if ((i10 & 2) != 0) {
            f11 = lVar.f332716b;
        }
        if ((i10 & 4) != 0) {
            f12 = lVar.f332717c;
        }
        if ((i10 & 8) != 0) {
            f13 = lVar.f332718d;
        }
        if ((i10 & 16) != 0) {
            j10 = lVar.f332719e;
        }
        if ((i10 & 32) != 0) {
            j11 = lVar.f332720f;
        }
        if ((i10 & 64) != 0) {
            j12 = lVar.f332721g;
        }
        if ((i10 & 128) != 0) {
            j13 = lVar.f332722h;
        }
        long j14 = j13;
        long j15 = j12;
        long j16 = j11;
        long j17 = j10;
        return lVar.k(f10, f11, f12, f13, j17, j16, j15, j14);
    }

    @NotNull
    public static final l w() {
        return f332712j.a();
    }

    private final float x(float f10, float f11, float f12, float f13) {
        float f14 = f11 + f12;
        return (f14 <= f13 || f14 == 0.0f) ? f10 : Math.min(f10, f13 / f14);
    }

    private final l y() {
        l lVar = this.f332723i;
        if (lVar != null) {
            return lVar;
        }
        float fX = x(x(x(x(1.0f, Float.intBitsToFloat((int) (this.f332722h & k0.f265952a)), Float.intBitsToFloat((int) (this.f332719e & k0.f265952a)), p()), Float.intBitsToFloat((int) (this.f332719e >> 32)), Float.intBitsToFloat((int) (this.f332720f >> 32)), v()), Float.intBitsToFloat((int) (this.f332720f & k0.f265952a)), Float.intBitsToFloat((int) (this.f332721g & k0.f265952a)), p()), Float.intBitsToFloat((int) (this.f332721g >> 32)), Float.intBitsToFloat((int) (this.f332722h >> 32)), v());
        float f10 = this.f332715a * fX;
        float f11 = this.f332716b * fX;
        float f12 = this.f332717c * fX;
        float f13 = this.f332718d * fX;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f332719e >> 32)) * fX;
        long jE = n0.a.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f332719e & k0.f265952a)) * fX)) & k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f332720f >> 32)) * fX;
        long jE2 = n0.a.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f332720f & k0.f265952a)) * fX)) & k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f332721g >> 32)) * fX;
        l lVar2 = new l(f10, f11, f12, f13, jE, jE2, n0.a.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f332721g & k0.f265952a)) * fX)) & k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), n0.a.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f332722h >> 32)) * fX)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f332722h & k0.f265952a)) * fX)) & k0.f265952a)), null);
        this.f332723i = lVar2;
        return lVar2;
    }

    public final float b() {
        return this.f332715a;
    }

    public final float c() {
        return this.f332716b;
    }

    public final float d() {
        return this.f332717c;
    }

    public final float e() {
        return this.f332718d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (Float.compare(this.f332715a, lVar.f332715a) == 0 && Float.compare(this.f332716b, lVar.f332716b) == 0 && Float.compare(this.f332717c, lVar.f332717c) == 0 && Float.compare(this.f332718d, lVar.f332718d) == 0 && n0.a.j(this.f332719e, lVar.f332719e) && n0.a.j(this.f332720f, lVar.f332720f) && n0.a.j(this.f332721g, lVar.f332721g) && n0.a.j(this.f332722h, lVar.f332722h)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f332719e;
    }

    public final long g() {
        return this.f332720f;
    }

    public final long h() {
        return this.f332721g;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f332715a) * 31) + Float.hashCode(this.f332716b)) * 31) + Float.hashCode(this.f332717c)) * 31) + Float.hashCode(this.f332718d)) * 31) + n0.a.p(this.f332719e)) * 31) + n0.a.p(this.f332720f)) * 31) + n0.a.p(this.f332721g)) * 31) + n0.a.p(this.f332722h);
    }

    public final long i() {
        return this.f332722h;
    }

    public final boolean j(long j10) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        float fIntBitsToFloat4;
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) >= this.f332715a && Float.intBitsToFloat(i10) < this.f332717c) {
            int i11 = (int) (j10 & k0.f265952a);
            if (Float.intBitsToFloat(i11) >= this.f332716b && Float.intBitsToFloat(i11) < this.f332718d) {
                l lVarY = y();
                if (Float.intBitsToFloat(i10) < this.f332715a + Float.intBitsToFloat((int) (lVarY.f332719e >> 32)) && Float.intBitsToFloat(i11) < this.f332716b + Float.intBitsToFloat((int) (lVarY.f332719e & k0.f265952a))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i10) - this.f332715a) - Float.intBitsToFloat((int) (lVarY.f332719e >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - this.f332716b) - Float.intBitsToFloat((int) (lVarY.f332719e & k0.f265952a));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (lVarY.f332719e >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (k0.f265952a & lVarY.f332719e));
                } else if (Float.intBitsToFloat(i10) > this.f332717c - Float.intBitsToFloat((int) (lVarY.f332720f >> 32)) && Float.intBitsToFloat(i11) < this.f332716b + Float.intBitsToFloat((int) (lVarY.f332720f & k0.f265952a))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i10) - this.f332717c) + Float.intBitsToFloat((int) (lVarY.f332720f >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - this.f332716b) - Float.intBitsToFloat((int) (lVarY.f332720f & k0.f265952a));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (lVarY.f332720f >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (k0.f265952a & lVarY.f332720f));
                } else if (Float.intBitsToFloat(i10) > this.f332717c - Float.intBitsToFloat((int) (lVarY.f332721g >> 32)) && Float.intBitsToFloat(i11) > this.f332718d - Float.intBitsToFloat((int) (lVarY.f332721g & k0.f265952a))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i10) - this.f332717c) + Float.intBitsToFloat((int) (lVarY.f332721g >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - this.f332718d) + Float.intBitsToFloat((int) (lVarY.f332721g & k0.f265952a));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (lVarY.f332721g >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (k0.f265952a & lVarY.f332721g));
                } else {
                    if (Float.intBitsToFloat(i10) >= this.f332715a + Float.intBitsToFloat((int) (lVarY.f332722h >> 32)) || Float.intBitsToFloat(i11) <= this.f332718d - Float.intBitsToFloat((int) (lVarY.f332722h & k0.f265952a))) {
                        return true;
                    }
                    fIntBitsToFloat = (Float.intBitsToFloat(i10) - this.f332715a) - Float.intBitsToFloat((int) (lVarY.f332722h >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - this.f332718d) + Float.intBitsToFloat((int) (lVarY.f332722h & k0.f265952a));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (lVarY.f332722h >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (k0.f265952a & lVarY.f332722h));
                }
                float f10 = fIntBitsToFloat / fIntBitsToFloat3;
                float f11 = fIntBitsToFloat2 / fIntBitsToFloat4;
                return (f10 * f10) + (f11 * f11) <= 1.0f;
            }
        }
        return false;
    }

    @NotNull
    public final l k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        return new l(f10, f11, f12, f13, j10, j11, j12, j13, null);
    }

    public final float m() {
        return this.f332718d;
    }

    public final long n() {
        return this.f332722h;
    }

    public final long o() {
        return this.f332721g;
    }

    public final float p() {
        return this.f332718d - this.f332716b;
    }

    public final float q() {
        return this.f332715a;
    }

    public final float r() {
        return this.f332717c;
    }

    public final float s() {
        return this.f332716b;
    }

    public final long t() {
        return this.f332719e;
    }

    @NotNull
    public String toString() {
        long j10 = this.f332719e;
        long j11 = this.f332720f;
        long j12 = this.f332721g;
        long j13 = this.f332722h;
        String str = c.a(this.f332715a, 1) + ", " + c.a(this.f332716b, 1) + ", " + c.a(this.f332717c, 1) + ", " + c.a(this.f332718d, 1);
        if (!n0.a.j(j10, j11) || !n0.a.j(j11, j12) || !n0.a.j(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) n0.a.v(j10)) + ", topRight=" + ((Object) n0.a.v(j11)) + ", bottomRight=" + ((Object) n0.a.v(j12)) + ", bottomLeft=" + ((Object) n0.a.v(j13)) + ')';
        }
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & k0.f265952a);
        if (fIntBitsToFloat == Float.intBitsToFloat(i11)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(Float.intBitsToFloat(i10), 1) + ", y=" + c.a(Float.intBitsToFloat(i11), 1) + ')';
    }

    public final long u() {
        return this.f332720f;
    }

    public final float v() {
        return this.f332717c - this.f332715a;
    }

    private l(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f332715a = f10;
        this.f332716b = f11;
        this.f332717c = f12;
        this.f332718d = f13;
        this.f332719e = j10;
        this.f332720f = j11;
        this.f332721g = j12;
        this.f332722h = j13;
    }

    public /* synthetic */ l(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, (i10 & 16) != 0 ? n0.a.f332683b.a() : j10, (i10 & 32) != 0 ? n0.a.f332683b.a() : j11, (i10 & 64) != 0 ? n0.a.f332683b.a() : j12, (i10 & 128) != 0 ? n0.a.f332683b.a() : j13, null);
    }
}
