package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l5;
import androidx.compose.runtime.r2;
import androidx.compose.runtime.z5;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,644:1\n145#1,5:645\n158#1,5:650\n255#1:659\n255#1:660\n334#1,7:668\n325#1,16:675\n357#1:691\n357#1:692\n334#1,7:693\n27#2,2:655\n27#2,2:657\n27#2,2:666\n4802#3,4:661\n1#4:665\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n123#1:645,5\n124#1:650,5\n212#1:659\n213#1:660\n325#1:668,7\n348#1:675,16\n360#1:691\n363#1:692\n578#1:693,7\n141#1:655,2\n166#1:657,2\n295#1:666,2\n211#1:661,4\n*E\n"})
public final class k extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f35532j = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public int f35534c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public int f35536e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    public int f35538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35540i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public d[] f35533b = new d[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public int[] f35535d = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f35537f = new Object[16];

    public final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35543c;

        public a() {
        }

        @Override // androidx.compose.runtime.changelist.f
        public <T> T a(int i10) {
            return (T) k.this.f35537f[this.f35543c + i10];
        }

        @NotNull
        public final String b() {
            String str = "operation[" + this.f35541a + "] = " + k.this.k(this, "");
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            return str;
        }

        @NotNull
        public final d c() {
            return k.this.f35533b[this.f35541a];
        }

        public final boolean d() {
            if (this.f35541a >= k.this.f35534c) {
                return false;
            }
            d dVarC = c();
            this.f35542b += dVarC.d();
            this.f35543c += dVarC.f();
            int i10 = this.f35541a + 1;
            this.f35541a = i10;
            return i10 < k.this.f35534c;
        }

        @Override // androidx.compose.runtime.changelist.f
        public int getInt(int i10) {
            return k.this.f35535d[this.f35542b + i10];
        }
    }

    @oj.g
    @SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n1#1,644:1\n357#2:645\n360#2:646\n357#2:647\n357#2:648\n357#2:649\n363#2:650\n357#2:651\n357#2:652\n357#2:653\n357#2:654\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n368#1:645\n379#1:646\n379#1:647\n397#1:648\n421#1:649\n437#1:650\n437#1:651\n455#1:652\n482#1:653\n514#1:654\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k f35545a;

        private /* synthetic */ b(k kVar) {
            this.f35545a = kVar;
        }

        public static final /* synthetic */ b a(k kVar) {
            return new b(kVar);
        }

        @NotNull
        public static k b(@NotNull k kVar) {
            return kVar;
        }

        public static boolean c(k kVar, Object obj) {
            return (obj instanceof b) && Intrinsics.areEqual(kVar, ((b) obj).o());
        }

        public static final boolean d(k kVar, k kVar2) {
            return Intrinsics.areEqual(kVar, kVar2);
        }

        @NotNull
        public static final d e(k kVar) {
            return kVar.f35533b[kVar.f35534c - 1];
        }

        public static int f(k kVar) {
            return kVar.hashCode();
        }

        public static final void g(k kVar, int i10, int i11) {
            kVar.f35535d[(kVar.f35536e - kVar.f35533b[kVar.f35534c - 1].d()) + i10] = i11;
        }

        public static final void h(k kVar, int i10, int i11, int i12, int i13) {
            int iD = kVar.f35536e - kVar.f35533b[kVar.f35534c - 1].d();
            int[] iArr = kVar.f35535d;
            iArr[i10 + iD] = i11;
            iArr[iD + i12] = i13;
        }

        public static final void i(k kVar, int i10, int i11, int i12, int i13, int i14, int i15) {
            int iD = kVar.f35536e - kVar.f35533b[kVar.f35534c - 1].d();
            int[] iArr = kVar.f35535d;
            iArr[i10 + iD] = i11;
            iArr[i12 + iD] = i13;
            iArr[iD + i14] = i15;
        }

        public static final <T> void j(k kVar, int i10, T t10) {
            kVar.f35537f[(kVar.f35538g - kVar.f35533b[kVar.f35534c - 1].f()) + i10] = t10;
        }

        public static final <T, U> void k(k kVar, int i10, T t10, int i11, U u10) {
            int iF = kVar.f35538g - kVar.f35533b[kVar.f35534c - 1].f();
            Object[] objArr = kVar.f35537f;
            objArr[i10 + iF] = t10;
            objArr[iF + i11] = u10;
        }

        public static final <T, U, V, W> void l(k kVar, int i10, T t10, int i11, U u10, int i12, V v10, int i13, W w10) {
            int iF = kVar.f35538g - kVar.f35533b[kVar.f35534c - 1].f();
            Object[] objArr = kVar.f35537f;
            objArr[i10 + iF] = t10;
            objArr[i11 + iF] = u10;
            objArr[i12 + iF] = v10;
            objArr[iF + i13] = w10;
        }

        public static final <T, U, V> void m(k kVar, int i10, T t10, int i11, U u10, int i12, V v10) {
            int iF = kVar.f35538g - kVar.f35533b[kVar.f35534c - 1].f();
            Object[] objArr = kVar.f35537f;
            objArr[i10 + iF] = t10;
            objArr[i11 + iF] = u10;
            objArr[iF + i12] = v10;
        }

        public static String n(k kVar) {
            return "WriteScope(stack=" + kVar + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f35545a, obj);
        }

        public int hashCode() {
            return f(this.f35545a);
        }

        public final /* synthetic */ k o() {
            return this.f35545a;
        }

        public String toString() {
            return n(this.f35545a);
        }
    }

    private final d A() {
        return this.f35533b[this.f35534c - 1];
    }

    private final void G(int i10, int i11) {
        int[] iArr = new int[l(i10, i11)];
        ArraysKt.copyInto(this.f35535d, iArr, 0, 0, i10);
        this.f35535d = iArr;
    }

    private final void H(int i10, int i11) {
        Object[] objArr = new Object[l(i10, i11)];
        System.arraycopy(this.f35537f, 0, objArr, 0, i10);
        this.f35537f = objArr;
    }

    private final void I() {
        int iB = r.B(this.f35534c, 1024);
        int i10 = this.f35534c;
        d[] dVarArr = new d[iB + i10];
        System.arraycopy(this.f35533b, 0, dVarArr, 0, i10);
        this.f35533b = dVarArr;
    }

    private final <T> String J(Iterable<? extends T> iterable, final String str) {
        return CollectionsKt.joinToString$default(iterable, ", ", "[", "]", 0, null, new Function1() { // from class: androidx.compose.runtime.changelist.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.K(this.f35530a, str, obj);
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence K(k kVar, String str, Object obj) {
        return kVar.u(obj, str);
    }

    private final int L(int i10) {
        return (this.f35536e - this.f35533b[this.f35534c - 1].d()) + i10;
    }

    private final int M(int i10) {
        return (this.f35538g - this.f35533b[this.f35534c - 1].f()) + i10;
    }

    private final int j(int i10) {
        return (i10 == 0 ? 0 : -1) >>> (32 - i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(a aVar, String str) {
        d dVarC = aVar.c();
        if (dVarC.d() == 0 && dVarC.f() == 0) {
            return dVarC.e();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVarC.e());
        sb2.append('(');
        String strX = x(str);
        int iD = dVarC.d();
        boolean z10 = true;
        for (int i10 = 0; i10 < iD; i10++) {
            String strG = dVarC.g(i10);
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(strX);
            sb2.append(strG);
            sb2.append(" = ");
            sb2.append(aVar.getInt(i10));
        }
        int iF = dVarC.f();
        for (int i11 = 0; i11 < iF; i11++) {
            int iB = d.t.b(i11);
            String strH = dVarC.h(iB);
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(strX);
            sb2.append(strH);
            sb2.append(" = ");
            sb2.append(u(aVar.a(iB), strX));
        }
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(str);
        sb2.append(")");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final int l(int i10, int i11) {
        return r.u(i10 + r.B(i10, 1024), i11);
    }

    private final void o(int i10) {
        int length = this.f35535d.length;
        if (i10 > length) {
            G(length, i10);
        }
    }

    private final void p(int i10) {
        int length = this.f35537f.length;
        if (i10 > length) {
            H(length, i10);
        }
    }

    private final String q(d dVar) {
        return "Cannot push " + dVar + " without arguments because it expects " + dVar.d() + " ints and " + dVar.f() + " objects.";
    }

    private final String r(d dVar) {
        StringBuilder sb2 = new StringBuilder();
        int iD = dVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & this.f35539h) == 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(dVar.g(i11));
                i10++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        StringBuilder sb3 = new StringBuilder();
        int iF = dVar.f();
        int i12 = 0;
        for (int i13 = 0; i13 < iF; i13++) {
            if (((1 << i13) & this.f35540i) == 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(dVar.h(d.t.b(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return "Error while pushing " + dVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").";
    }

    private final String u(Object obj, String str) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (obj instanceof Object[]) {
            return J(ArraysKt.asIterable((Object[]) obj), str);
        }
        if (obj instanceof int[]) {
            return J(ArraysKt.asIterable((int[]) obj), str);
        }
        if (obj instanceof long[]) {
            return J(ArraysKt.asIterable((long[]) obj), str);
        }
        if (obj instanceof float[]) {
            return J(ArraysKt.asIterable((float[]) obj), str);
        }
        if (obj instanceof double[]) {
            return J(ArraysKt.asIterable((double[]) obj), str);
        }
        if (obj instanceof Iterable) {
            return J((Iterable) obj, str);
        }
        return obj instanceof l ? ((l) obj).a(str) : obj.toString();
    }

    public static /* synthetic */ void v() {
    }

    private final String x(String str) {
        return str + "    ";
    }

    public final void B() {
        d[] dVarArr = this.f35533b;
        int i10 = this.f35534c - 1;
        this.f35534c = i10;
        d dVar = dVarArr[i10];
        dVarArr[i10] = null;
        int iF = dVar.f();
        for (int i11 = 0; i11 < iF; i11++) {
            Object[] objArr = this.f35537f;
            int i12 = this.f35538g - 1;
            this.f35538g = i12;
            objArr[i12] = null;
        }
        this.f35536e -= dVar.d();
    }

    public final void C(@NotNull k kVar) {
        d[] dVarArr = this.f35533b;
        int i10 = this.f35534c - 1;
        this.f35534c = i10;
        d dVar = dVarArr[i10];
        dVarArr[i10] = null;
        kVar.F(dVar);
        Object[] objArr = this.f35537f;
        Object[] objArr2 = kVar.f35537f;
        int iF = kVar.f35538g - dVar.f();
        int iF2 = this.f35538g - dVar.f();
        System.arraycopy(objArr, iF2, objArr2, iF, this.f35538g - iF2);
        ArraysKt.fill(this.f35537f, (Object) null, this.f35538g - dVar.f(), this.f35538g);
        ArraysKt.copyInto(this.f35535d, kVar.f35535d, kVar.f35536e - dVar.d(), this.f35536e - dVar.d(), this.f35536e);
        this.f35538g -= dVar.f();
        this.f35536e -= dVar.d();
    }

    public final void D(@NotNull d dVar) {
        F(dVar);
    }

    public final void E(@NotNull d dVar, @NotNull Function1<? super b, Unit> function1) {
        F(dVar);
        function1.invoke(b.a(b.b(this)));
        n(dVar);
    }

    @r2
    public final void F(@NotNull d dVar) {
        if (this.f35534c == this.f35533b.length) {
            I();
        }
        int iD = this.f35536e + dVar.d();
        int length = this.f35535d.length;
        if (iD > length) {
            G(length, iD);
        }
        int iF = this.f35538g + dVar.f();
        int length2 = this.f35537f.length;
        if (iF > length2) {
            H(length2, iF);
        }
        d[] dVarArr = this.f35533b;
        int i10 = this.f35534c;
        this.f35534c = i10 + 1;
        dVarArr[i10] = dVar;
        this.f35536e += dVar.d();
        this.f35538g += dVar.f();
    }

    @Override // androidx.compose.runtime.changelist.l
    @NotNull
    public String a(@NotNull String str) {
        StringBuilder sb2 = new StringBuilder();
        if (z()) {
            a aVar = new a();
            int i10 = 0;
            int i11 = 4 ^ 0;
            while (true) {
                sb2.append(str);
                int i12 = i10 + 1;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(k(aVar, str));
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                sb2.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                if (!aVar.d()) {
                    break;
                }
                i10 = i12;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void i() {
        this.f35534c = 0;
        this.f35536e = 0;
        ArraysKt.fill(this.f35537f, (Object) null, 0, this.f35538g);
        this.f35538g = 0;
    }

    public final void m(@NotNull Function1<? super a, Unit> function1) {
        if (z()) {
            a aVar = new a();
            do {
                function1.invoke(aVar);
            } while (aVar.d());
        }
        i();
    }

    public final void n(@NotNull d dVar) {
        int i10 = this.f35539h;
        int iD = dVar.d();
        if (i10 == ((iD == 0 ? 0 : -1) >>> (32 - iD))) {
            dVar.f();
        }
    }

    public final void s(@NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable g gVar) {
        if (z()) {
            a aVar = new a();
            while (true) {
                androidx.compose.runtime.i<?> iVar2 = iVar;
                z5 z5Var2 = z5Var;
                l5 l5Var2 = l5Var;
                g gVar2 = gVar;
                aVar.c().b(aVar, iVar2, z5Var2, l5Var2, gVar2);
                if (!aVar.d()) {
                    break;
                }
                iVar = iVar2;
                z5Var = z5Var2;
                l5Var = l5Var2;
                gVar = gVar2;
            }
        }
        i();
    }

    public final void t(@NotNull Function1<? super a, Unit> function1) {
        if (z()) {
            a aVar = new a();
            do {
                function1.invoke(aVar);
            } while (aVar.d());
        }
    }

    @kotlin.l(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @b1(expression = "toDebugString()", imports = {}))
    @NotNull
    public String toString() {
        return super.toString();
    }

    public final int w() {
        return this.f35534c;
    }

    public final boolean y() {
        return w() == 0;
    }

    public final boolean z() {
        return w() != 0;
    }
}
