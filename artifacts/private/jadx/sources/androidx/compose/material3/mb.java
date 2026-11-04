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
final class mb extends l2 implements jb {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f30596j = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.n3<androidx.compose.material3.internal.j1> f30597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.n3<androidx.compose.material3.internal.j1> f30598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.n3<ed> f30599i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(androidx.compose.runtime.saveable.g0 g0Var, mb mbVar) {
            return CollectionsKt.listOf(mbVar.k(), mbVar.h(), Long.valueOf(mbVar.f()), Integer.valueOf(mbVar.c().l()), Integer.valueOf(mbVar.c().m()), Integer.valueOf(mbVar.e()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mb e(ww wwVar, Locale locale, List list) {
            Long l10 = (Long) list.get(0);
            Long l11 = (Long) list.get(1);
            Long l12 = (Long) list.get(2);
            Object obj = list.get(3);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(4);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            IntRange intRange = new IntRange(iIntValue, ((Integer) obj2).intValue());
            Object obj3 = list.get(5);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new mb(l10, l11, l12, intRange, ed.d(((Integer) obj3).intValue()), wwVar, locale, null);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<mb, Object> c(@NotNull final ww wwVar, @NotNull final Locale locale) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.kb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return mb.a.d((androidx.compose.runtime.saveable.g0) obj, (mb) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.lb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return mb.a.e(wwVar, locale, (List) obj);
                }
            });
        }

        private a() {
        }
    }

    public /* synthetic */ mb(Long l10, Long l11, Long l12, IntRange intRange, int i10, ww wwVar, Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, l11, l12, intRange, i10, wwVar, locale);
    }

    private final androidx.compose.material3.internal.j1 n(Long l10) {
        if (l10 != null) {
            androidx.compose.material3.internal.j1 j1VarF = l().f(l10.longValue());
            if (c().t(j1VarF.w())) {
                return j1VarF;
            }
        }
        return null;
    }

    @Override // androidx.compose.material3.jb
    public void d(int i10) {
        Long lK = k();
        if (lK != null) {
            a(l().n(lK.longValue()).m());
        }
        this.f30599i.setValue(ed.c(i10));
    }

    @Override // androidx.compose.material3.jb
    public int e() {
        return this.f30599i.getValue().i();
    }

    @Override // androidx.compose.material3.jb
    @Nullable
    public Long h() {
        androidx.compose.material3.internal.j1 value = this.f30598h.getValue();
        if (value != null) {
            return Long.valueOf(value.v());
        }
        return null;
    }

    @Override // androidx.compose.material3.jb
    public void i(@Nullable Long l10, @Nullable Long l11) {
        androidx.compose.material3.internal.j1 j1VarN = n(l10);
        androidx.compose.material3.internal.j1 j1VarN2 = n(l11);
        if (j1VarN == null || (j1VarN2 != null && j1VarN.v() > j1VarN2.v())) {
            this.f30597g.setValue(null);
            this.f30598h.setValue(null);
        } else {
            this.f30597g.setValue(j1VarN);
            this.f30598h.setValue(j1VarN2);
        }
    }

    @Override // androidx.compose.material3.jb
    @Nullable
    public Long k() {
        androidx.compose.material3.internal.j1 value = this.f30597g.getValue();
        if (value != null) {
            return Long.valueOf(value.v());
        }
        return null;
    }

    private mb(Long l10, Long l11, Long l12, IntRange intRange, int i10, ww wwVar, Locale locale) {
        super(l12, intRange, wwVar, locale);
        this.f30597g = androidx.compose.runtime.d7.g(null, null, 2, null);
        this.f30598h = androidx.compose.runtime.d7.g(null, null, 2, null);
        i(l10, l11);
        this.f30599i = androidx.compose.runtime.d7.g(ed.c(i10), null, 2, null);
    }
}
