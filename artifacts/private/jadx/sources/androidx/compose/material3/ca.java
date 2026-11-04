package androidx.compose.material3;

import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class ca extends l2 implements z9 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f26520i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.n3<androidx.compose.material3.internal.j1> f26521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.n3<ed> f26522h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(androidx.compose.runtime.saveable.g0 g0Var, ca caVar) {
            return CollectionsKt.listOf(caVar.j(), Long.valueOf(caVar.f()), Integer.valueOf(caVar.c().l()), Integer.valueOf(caVar.c().m()), Integer.valueOf(caVar.e()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ca e(ww wwVar, Locale locale, List list) {
            Long l10 = (Long) list.get(0);
            Long l11 = (Long) list.get(1);
            Object obj = list.get(2);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(3);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            IntRange intRange = new IntRange(iIntValue, ((Integer) obj2).intValue());
            Object obj3 = list.get(4);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new ca(l10, l11, intRange, ed.d(((Integer) obj3).intValue()), wwVar, locale, null);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<ca, Object> c(@NotNull final ww wwVar, @NotNull final Locale locale) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.aa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ca.a.d((androidx.compose.runtime.saveable.g0) obj, (ca) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.ba
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ca.a.e(wwVar, locale, (List) obj);
                }
            });
        }

        private a() {
        }
    }

    public /* synthetic */ ca(Long l10, Long l11, IntRange intRange, int i10, ww wwVar, Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, l11, intRange, i10, wwVar, locale);
    }

    @Override // androidx.compose.material3.z9
    public void d(int i10) {
        Long lJ = j();
        if (lJ != null) {
            a(l().n(lJ.longValue()).m());
        }
        this.f26522h.setValue(ed.c(i10));
    }

    @Override // androidx.compose.material3.z9
    public int e() {
        return this.f26522h.getValue().i();
    }

    @Override // androidx.compose.material3.z9
    public void g(@Nullable Long l10) {
        if (l10 == null) {
            this.f26521g.setValue(null);
        } else {
            androidx.compose.material3.internal.j1 j1VarF = l().f(l10.longValue());
            this.f26521g.setValue(c().t(j1VarF.w()) ? j1VarF : null);
        }
    }

    @Override // androidx.compose.material3.z9
    @Nullable
    public Long j() {
        androidx.compose.material3.internal.j1 value = this.f26521g.getValue();
        if (value != null) {
            return Long.valueOf(value.v());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    private ca(Long l10, Long l11, IntRange intRange, int i10, ww wwVar, Locale locale) {
        androidx.compose.material3.internal.j1 j1VarF;
        super(l11, intRange, wwVar, locale);
        if (l10 != null) {
            j1VarF = l().f(l10.longValue());
            j1VarF = intRange.t(j1VarF.w()) ? j1VarF : null;
        }
        this.f26521g = androidx.compose.runtime.d7.g(j1VarF, null, 2, null);
        this.f26522h = androidx.compose.runtime.d7.g(ed.c(i10), null, 2, null);
    }
}
