package androidx.compose.material3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerStateImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2144:1\n1#2:2145\n85#3:2146\n117#3,2:2147\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerStateImpl\n*L\n696#1:2146\n696#1:2147,2\n*E\n"})
final class k80 implements h80 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f30017e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f30019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f30020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f30021d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(androidx.compose.runtime.saveable.g0 g0Var, k80 k80Var) {
            return CollectionsKt.listOf(Integer.valueOf(k80Var.a()), Integer.valueOf(k80Var.f()), Boolean.valueOf(k80Var.g()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k80 e(List list) {
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj2).intValue();
            Object obj3 = list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new k80(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<k80, ?> c() {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material3.i80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k80.a.d((androidx.compose.runtime.saveable.g0) obj, (k80) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.j80
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k80.a.e((List) obj);
                }
            });
        }

        private a() {
        }
    }

    public k80(int i10, int i11, boolean z10) {
        if (i10 < 0 || i10 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.f30018a = z10;
        this.f30019b = androidx.compose.runtime.d7.g(g80.c(g80.f27919b.a()), null, 2, null);
        this.f30020c = androidx.compose.runtime.e6.b(i10);
        this.f30021d = androidx.compose.runtime.e6.b(i11);
    }

    @Override // androidx.compose.material3.h80
    public int a() {
        return this.f30020c.m1();
    }

    @Override // androidx.compose.material3.h80
    public void b(int i10) {
        this.f30019b.setValue(g80.c(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.h80
    public int c() {
        return ((g80) this.f30019b.getValue()).j();
    }

    @Override // androidx.compose.material3.h80
    public void d(int i10) {
        this.f30020c.j(i10);
    }

    @Override // androidx.compose.material3.h80
    public void e(int i10) {
        this.f30021d.j(i10);
    }

    @Override // androidx.compose.material3.h80
    public int f() {
        return this.f30021d.m1();
    }

    @Override // androidx.compose.material3.h80
    public boolean g() {
        return this.f30018a;
    }

    @Override // androidx.compose.material3.h80
    public void h(boolean z10) {
        this.f30018a = z10;
    }

    @NotNull
    public final androidx.compose.runtime.l3 i() {
        return this.f30020c;
    }

    @NotNull
    public final androidx.compose.runtime.l3 j() {
        return this.f30021d;
    }
}
