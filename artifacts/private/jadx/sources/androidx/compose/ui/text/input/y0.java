package androidx.compose.ui.text.input;

import androidx.compose.runtime.o2;
import androidx.compose.ui.text.u2;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
@SourceDebugExtension({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n65#2,2:193\n65#2,2:196\n1#3:195\n1#3:198\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue\n*L\n162#1:193,2\n163#1:196,2\n162#1:195\n163#1:198\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41980e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f41982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final w3 f41984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f41979d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<y0, Object> f41981f = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.ui.text.input.w0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return y0.c((androidx.compose.runtime.saveable.g0) obj, (y0) obj2);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.input.x0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return y0.d(obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<y0, Object> a() {
            return y0.f41981f;
        }

        private a() {
        }
    }

    public /* synthetic */ y0(androidx.compose.ui.text.f fVar, long j10, w3 w3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, j10, w3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(androidx.compose.runtime.saveable.g0 g0Var, y0 y0Var) {
        return CollectionsKt.arrayListOf(u2.h1(y0Var.f41982a, u2.L0(), g0Var), u2.h1(w3.b(y0Var.f41983b), u2.Q0(w3.f42333b), g0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 d(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.f, Object> c0VarL0 = u2.L0();
        Boolean bool = Boolean.FALSE;
        w3 w3VarB = null;
        androidx.compose.ui.text.f fVarB = ((!Intrinsics.areEqual(obj2, bool) || (c0VarL0 instanceof androidx.compose.ui.text.m0)) && obj2 != null) ? c0VarL0.b(obj2) : null;
        Intrinsics.checkNotNull(fVarB);
        Object obj3 = list.get(1);
        androidx.compose.runtime.saveable.c0<w3, Object> c0VarQ0 = u2.Q0(w3.f42333b);
        if ((!Intrinsics.areEqual(obj3, bool) || (c0VarQ0 instanceof androidx.compose.ui.text.m0)) && obj3 != null) {
            w3VarB = c0VarQ0.b(obj3);
        }
        Intrinsics.checkNotNull(w3VarB);
        int i10 = 0 & 4;
        return new y0(fVarB, w3VarB.r(), (w3) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ y0 h(y0 y0Var, androidx.compose.ui.text.f fVar, long j10, w3 w3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = y0Var.f41982a;
        }
        if ((i10 & 2) != 0) {
            j10 = y0Var.f41983b;
        }
        if ((i10 & 4) != 0) {
            w3Var = y0Var.f41984c;
        }
        return y0Var.f(fVar, j10, w3Var);
    }

    public static /* synthetic */ y0 i(y0 y0Var, String str, long j10, w3 w3Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = y0Var.f41983b;
        }
        if ((i10 & 4) != 0) {
            w3Var = y0Var.f41984c;
        }
        return y0Var.g(str, j10, w3Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return w3.g(this.f41983b, y0Var.f41983b) && Intrinsics.areEqual(this.f41984c, y0Var.f41984c) && Intrinsics.areEqual(this.f41982a, y0Var.f41982a);
    }

    @NotNull
    public final y0 f(@NotNull androidx.compose.ui.text.f fVar, long j10, @Nullable w3 w3Var) {
        return new y0(fVar, j10, w3Var, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final y0 g(@NotNull String str, long j10, @Nullable w3 w3Var) {
        return new y0(new androidx.compose.ui.text.f(str, null, 2, 0 == true ? 1 : 0), j10, w3Var, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        int iHashCode = ((this.f41982a.hashCode() * 31) + w3.o(this.f41983b)) * 31;
        w3 w3Var = this.f41984c;
        return iHashCode + (w3Var != null ? w3.o(w3Var.r()) : 0);
    }

    @NotNull
    public final androidx.compose.ui.text.f j() {
        return this.f41982a;
    }

    @Nullable
    public final w3 k() {
        return this.f41984c;
    }

    public final long l() {
        return this.f41983b;
    }

    @NotNull
    public final String m() {
        return this.f41982a.m();
    }

    @NotNull
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f41982a) + "', selection=" + ((Object) w3.q(this.f41983b)) + ", composition=" + this.f41984c + ')';
    }

    public /* synthetic */ y0(String str, long j10, w3 w3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, w3Var);
    }

    private y0(androidx.compose.ui.text.f fVar, long j10, w3 w3Var) {
        this.f41982a = fVar;
        this.f41983b = x3.c(j10, 0, m().length());
        this.f41984c = w3Var != null ? w3.b(x3.c(w3Var.r(), 0, m().length())) : null;
    }

    public /* synthetic */ y0(androidx.compose.ui.text.f fVar, long j10, w3 w3Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? w3.f42333b.a() : j10, (i10 & 4) != 0 ? null : w3Var, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ y0(String str, long j10, w3 w3Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? w3.f42333b.a() : j10, (i10 & 4) != 0 ? null : w3Var, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y0(String str, long j10, w3 w3Var) {
        this(new androidx.compose.ui.text.f(str, null, 2, 0 == true ? 1 : 0), j10, w3Var, (DefaultConstructorMarker) null);
    }
}
