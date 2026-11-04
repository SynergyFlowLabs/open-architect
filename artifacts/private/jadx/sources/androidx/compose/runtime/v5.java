package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4061:1\n3847#2:4062\n3767#2:4063\n3767#2:4064\n3833#2:4065\n3833#2:4066\n3767#2:4067\n3878#2:4068\n3827#2:4069\n3827#2:4070\n3773#2:4071\n3773#2:4072\n3827#2:4073\n3790#2:4074\n3799#2:4075\n3833#2:4076\n3847#2:4081\n3878#2:4082\n3878#2:4083\n3847#2:4088\n3878#2:4093\n3767#2:4094\n3767#2:4103\n3833#2:4104\n3847#2:4113\n3847#2:4122\n3878#2:4123\n3827#2:4124\n3767#2:4125\n3833#2:4126\n3923#2,6:4127\n3767#2:4133\n3770#2:4134\n3782#2:4135\n3773#2:4136\n34#3,4:4077\n34#3,4:4084\n34#3,4:4089\n34#3,4:4095\n4788#4,4:4099\n4788#4,4:4105\n4788#4,4:4109\n4788#4,4:4114\n4788#4,4:4118\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n879#1:4062\n883#1:4063\n886#1:4064\n893#1:4065\n896#1:4066\n899#1:4067\n923#1:4068\n938#1:4069\n942#1:4070\n952#1:4071\n955#1:4072\n976#1:4073\n979#1:4074\n985#1:4075\n989#1:4076\n999#1:4081\n1008#1:4082\n1025#1:4083\n1077#1:4088\n1095#1:4093\n1102#1:4094\n1110#1:4103\n1110#1:4104\n1127#1:4113\n1157#1:4122\n1168#1:4123\n1185#1:4124\n1188#1:4125\n1188#1:4126\n1202#1:4127,6\n1205#1:4133\n1206#1:4134\n1210#1:4135\n1215#1:4136\n998#1:4077,4\n1058#1:4084,4\n1077#1:4089,4\n1102#1:4095,4\n1109#1:4099,4\n1117#1:4105,4\n1125#1:4109,4\n1142#1:4114,4\n1154#1:4118,4\n*E\n"})
public final class v5 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f36733p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f36734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f36735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Object[] f36737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private HashMap<g, l2> f36739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final p2 f36744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36748o;

    public v5(@NotNull w5 w5Var) {
        this.f36734a = w5Var;
        this.f36735b = w5Var.D();
        int iF = w5Var.F();
        this.f36736c = iF;
        this.f36737d = w5Var.G();
        this.f36738e = w5Var.e2();
        this.f36742i = iF;
        this.f36743j = -1;
        this.f36744k = new p2();
    }

    private final Object U(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return (iArr[i11 + 1] & 1073741824) != 0 ? this.f36737d[iArr[i11 + 4]] : c0.f35327a.a();
    }

    private final Object W(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return this.f36737d[y5.c0(iArr, i10)];
        }
        return null;
    }

    public static /* synthetic */ g b(v5 v5Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = v5Var.f36741h;
        }
        return v5Var.a(i10);
    }

    private final Object c(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.f36737d[y5.y(iArr, i10)] : c0.f35327a.a();
    }

    public final int A() {
        int i10 = this.f36743j;
        if (i10 >= 0) {
            return this.f36735b[(i10 * 5) + 1] & androidx.compose.ui.spatial.e.f41245c;
        }
        return 0;
    }

    public final int B() {
        return this.f36747n - this.f36746m;
    }

    public final int C() {
        return this.f36736c;
    }

    public final int D() {
        return this.f36746m - y5.i0(this.f36735b, this.f36743j);
    }

    @NotNull
    public final w5 E() {
        return this.f36734a;
    }

    @Nullable
    public final Object F(int i10) {
        return c(this.f36735b, i10);
    }

    public final int G(int i10) {
        return i10 + y5.M(this.f36735b, i10);
    }

    @Nullable
    public final Object H(int i10) {
        return I(this.f36741h, i10);
    }

    @Nullable
    public final Object I(int i10, int i11) {
        int iI0 = y5.i0(this.f36735b, i10);
        int i12 = i10 + 1;
        int i13 = iI0 + i11;
        return i13 < (i12 < this.f36736c ? this.f36735b[(i12 * 5) + 4] : this.f36738e) ? this.f36737d[i13] : c0.f35327a.a();
    }

    public final int J(int i10) {
        return this.f36735b[i10 * 5];
    }

    public final int K(@NotNull g gVar) {
        if (gVar.b()) {
            return this.f36735b[this.f36734a.k(gVar) * 5];
        }
        return 0;
    }

    @Nullable
    public final Object L(int i10) {
        return W(this.f36735b, i10);
    }

    public final int M(int i10) {
        return y5.M(this.f36735b, i10);
    }

    public final boolean N(int i10) {
        return (this.f36735b[(i10 * 5) + 1] & androidx.media3.common.j.W0) != 0;
    }

    public final boolean O(int i10) {
        return (this.f36735b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean P() {
        return x() || this.f36741h == this.f36742i;
    }

    public final boolean Q() {
        return (this.f36735b[(this.f36741h * 5) + 1] & 1073741824) != 0;
    }

    public final boolean R(int i10) {
        return (this.f36735b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    @Nullable
    public final Object S() {
        int i10;
        if (this.f36745l > 0 || (i10 = this.f36746m) >= this.f36747n) {
            this.f36748o = false;
            return c0.f35327a.a();
        }
        this.f36748o = true;
        Object[] objArr = this.f36737d;
        this.f36746m = i10 + 1;
        return objArr[i10];
    }

    @Nullable
    public final Object T(int i10) {
        int[] iArr = this.f36735b;
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return U(iArr, i10);
        }
        return null;
    }

    public final int V(int i10) {
        return this.f36735b[(i10 * 5) + 1] & androidx.compose.ui.spatial.e.f41245c;
    }

    public final int X(int i10) {
        return this.f36735b[(i10 * 5) + 2];
    }

    public final int Y(int i10) {
        if (!(i10 >= 0 && i10 < this.f36736c)) {
            f4.d("Invalid group index " + i10);
        }
        return this.f36735b[(i10 * 5) + 2];
    }

    public final void Z(int i10) {
        if (!(this.f36745l == 0)) {
            m0.y("Cannot reposition while in an empty region");
        }
        this.f36741h = i10;
        int i11 = this.f36736c;
        int i12 = i10 < i11 ? this.f36735b[(i10 * 5) + 2] : -1;
        if (i12 != this.f36743j) {
            this.f36743j = i12;
            if (i12 < 0) {
                this.f36742i = i11;
            } else {
                this.f36742i = i12 + y5.M(this.f36735b, i12);
            }
            this.f36746m = 0;
            this.f36747n = 0;
        }
    }

    @NotNull
    public final g a(int i10) {
        ArrayList<g> arrayListB = this.f36734a.B();
        int iG0 = y5.g0(arrayListB, i10, this.f36736c);
        if (iG0 >= 0) {
            return arrayListB.get(iG0);
        }
        g gVar = new g(i10);
        arrayListB.add(-(iG0 + 1), gVar);
        return gVar;
    }

    public final void a0(int i10) {
        int iM = y5.M(this.f36735b, i10) + i10;
        int i11 = this.f36741h;
        if (!(i11 >= i10 && i11 <= iM)) {
            m0.y("Index " + i10 + " is not a parent of " + i11);
        }
        this.f36743j = i10;
        this.f36742i = iM;
        this.f36746m = 0;
        this.f36747n = 0;
    }

    public final void b0(int i10) {
        this.f36741h = i10;
    }

    public final int c0() {
        if (!(this.f36745l == 0)) {
            m0.y("Cannot skip while in an empty region");
        }
        int[] iArr = this.f36735b;
        int i10 = this.f36741h;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & androidx.compose.ui.spatial.e.f41245c : 1;
        this.f36741h = i10 + y5.M(iArr, i10);
        return i11;
    }

    public final void d() {
        this.f36745l++;
    }

    public final void d0() {
        if (!(this.f36745l == 0)) {
            m0.y("Cannot skip the enclosing group while in an empty region");
        }
        this.f36741h = this.f36742i;
        this.f36746m = 0;
        this.f36747n = 0;
    }

    public final void e() {
        this.f36740g = true;
        this.f36734a.l(this, this.f36739f);
        this.f36737d = new Object[0];
    }

    public final int e0(int i10) {
        int iI0 = y5.i0(this.f36735b, i10);
        int i11 = i10 + 1;
        return (i11 < this.f36736c ? this.f36735b[(i11 * 5) + 4] : this.f36738e) - iI0;
    }

    public final boolean f(int i10) {
        return (this.f36735b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void f0() {
        l2 l2Var;
        if (this.f36745l <= 0) {
            int i10 = this.f36743j;
            int i11 = this.f36741h;
            if (!(this.f36735b[(i11 * 5) + 2] == i10)) {
                f4.d("Invalid slot table detected");
            }
            HashMap<g, l2> map = this.f36739f;
            if (map != null && (l2Var = map.get(a(i10))) != null) {
                l2Var.n(this.f36734a, i11);
            }
            p2 p2Var = this.f36744k;
            int i12 = this.f36746m;
            int i13 = this.f36747n;
            if (i12 == 0 && i13 == 0) {
                p2Var.k(-1);
            } else {
                p2Var.k(i12);
            }
            this.f36743j = i11;
            this.f36742i = y5.M(this.f36735b, i11) + i11;
            int i14 = i11 + 1;
            this.f36741h = i14;
            this.f36746m = y5.i0(this.f36735b, i11);
            this.f36747n = i11 >= this.f36736c - 1 ? this.f36738e : this.f36735b[(i14 * 5) + 4];
        }
    }

    public final void g() {
        if (!(this.f36745l > 0)) {
            f4.d("Unbalanced begin/end empty");
        }
        this.f36745l--;
    }

    public final void g0() {
        if (this.f36745l <= 0) {
            if (!((this.f36735b[(this.f36741h * 5) + 1] & 1073741824) != 0)) {
                f4.d("Expected a node group");
            }
            f0();
        }
    }

    public final void h() {
        if (this.f36745l == 0) {
            if (!(this.f36741h == this.f36742i)) {
                m0.y("endGroup() not called at the end of a group");
            }
            int[] iArr = this.f36735b;
            int i10 = iArr[(this.f36743j * 5) + 2];
            this.f36743j = i10;
            this.f36742i = i10 < 0 ? this.f36736c : y5.M(iArr, i10) + i10;
            int iJ = this.f36744k.j();
            if (iJ < 0) {
                this.f36746m = 0;
                this.f36747n = 0;
            } else {
                this.f36746m = iJ;
                this.f36747n = i10 >= this.f36736c - 1 ? this.f36738e : this.f36735b[((i10 + 1) * 5) + 4];
            }
        }
    }

    @NotNull
    public final List<w2> i() {
        ArrayList arrayList = new ArrayList();
        if (this.f36745l <= 0) {
            int i10 = 0;
            int iM = this.f36741h;
            while (true) {
                int i11 = i10;
                if (iM >= this.f36742i) {
                    break;
                }
                int[] iArr = this.f36735b;
                int i12 = iM * 5;
                int i13 = iArr[i12];
                Object objW = W(iArr, iM);
                int i14 = 1;
                int i15 = this.f36735b[i12 + 1];
                if ((1073741824 & i15) == 0) {
                    i14 = i15 & androidx.compose.ui.spatial.e.f41245c;
                }
                i10 = i11 + 1;
                arrayList.add(new w2(i13, objW, iM, i14, i11));
                iM += y5.M(this.f36735b, iM);
            }
        }
        return arrayList;
    }

    @Nullable
    public final Object j(int i10) {
        int i11 = this.f36746m + i10;
        return i11 < this.f36747n ? this.f36737d[i11] : c0.f35327a.a();
    }

    public final boolean k() {
        return this.f36740g;
    }

    public final int l() {
        return this.f36742i;
    }

    public final int m() {
        return this.f36741h;
    }

    @Nullable
    public final Object n() {
        int i10 = this.f36741h;
        if (i10 < this.f36742i) {
            return c(this.f36735b, i10);
        }
        return 0;
    }

    public final int o() {
        return this.f36742i;
    }

    public final int p() {
        int i10 = this.f36741h;
        if (i10 < this.f36742i) {
            return this.f36735b[i10 * 5];
        }
        return 0;
    }

    @Nullable
    public final Object q() {
        int i10 = this.f36741h;
        if (i10 < this.f36742i) {
            return U(this.f36735b, i10);
        }
        return null;
    }

    @Nullable
    public final Object r() {
        int i10 = this.f36741h;
        if (i10 < this.f36742i) {
            return W(this.f36735b, i10);
        }
        return null;
    }

    public final int s() {
        return y5.M(this.f36735b, this.f36741h);
    }

    public final int t() {
        int i10 = this.f36741h;
        int iI0 = y5.i0(this.f36735b, i10);
        int i11 = i10 + 1;
        return (i11 < this.f36736c ? this.f36735b[(i11 * 5) + 4] : this.f36738e) - iI0;
    }

    @NotNull
    public String toString() {
        return "SlotReader(current=" + this.f36741h + ", key=" + p() + ", parent=" + this.f36743j + ", end=" + this.f36742i + ')';
    }

    public final int u() {
        return this.f36746m - y5.i0(this.f36735b, this.f36743j);
    }

    public final boolean v() {
        return this.f36748o;
    }

    public final boolean w() {
        int i10 = this.f36741h;
        return i10 < this.f36742i && (this.f36735b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean x() {
        return this.f36745l > 0;
    }

    public final int y() {
        return this.f36735b[(this.f36741h * 5) + 1] & androidx.compose.ui.spatial.e.f41245c;
    }

    public final int z() {
        return this.f36743j;
    }
}
