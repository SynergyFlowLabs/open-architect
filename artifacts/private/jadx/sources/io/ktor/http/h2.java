package io.ktor.http;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nRangesSpecifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RangesSpecifier.kt\nio/ktor/http/RangesSpecifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1#2:87\n2746#3,3:88\n2423#3,14:91\n1999#3,14:105\n*S KotlinDebug\n*F\n+ 1 RangesSpecifier.kt\nio/ktor/http/RangesSpecifier\n*L\n30#1:88,3\n76#1:91,14\n77#1:105,14\n*E\n"})
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<k> f295862b;

    /* JADX WARN: Multi-variable type inference failed */
    public h2(@NotNull String unit, @NotNull List<? extends k> ranges) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        this.f295861a = unit;
        this.f295862b = ranges;
        if (ranges.isEmpty()) {
            throw new IllegalArgumentException("It should be at least one range");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h2 e(h2 h2Var, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = h2Var.f295861a;
        }
        if ((i10 & 2) != 0) {
            list = h2Var.f295862b;
        }
        return h2Var.d(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean i(h2 h2Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: io.ktor.http.g2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(h2.j((String) obj2));
                }
            };
        }
        return h2Var.h(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it, e2.Bytes.n());
    }

    public static /* synthetic */ List m(h2 h2Var, long j10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 50;
        }
        return h2Var.l(j10, i10);
    }

    private final <T> List<T> o(T t10) {
        return t10 == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(t10);
    }

    @NotNull
    public final String b() {
        return this.f295861a;
    }

    @NotNull
    public final List<k> c() {
        return this.f295862b;
    }

    @NotNull
    public final h2 d(@NotNull String unit, @NotNull List<? extends k> ranges) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        return new h2(unit, ranges);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return Intrinsics.areEqual(this.f295861a, h2Var.f295861a) && Intrinsics.areEqual(this.f295862b, h2Var.f295862b);
    }

    @NotNull
    public final List<k> f() {
        return this.f295862b;
    }

    @NotNull
    public final String g() {
        return this.f295861a;
    }

    public final boolean h(@NotNull Function1<? super String, Boolean> rangeUnitPredicate) {
        Intrinsics.checkNotNullParameter(rangeUnitPredicate, "rangeUnitPredicate");
        if (rangeUnitPredicate.invoke(this.f295861a).booleanValue()) {
            List<k> list = this.f295862b;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            for (k kVar : list) {
                if (kVar instanceof k.a) {
                    k.a aVar = (k.a) kVar;
                    if (aVar.e() < 0 || aVar.f() < aVar.e()) {
                    }
                } else if (!(kVar instanceof k.c)) {
                    if (!(kVar instanceof k.b)) {
                        throw new kotlin.k0();
                    }
                    if (((k.b) kVar).d() < 0) {
                    }
                } else if (((k.c) kVar).d() < 0) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f295861a.hashCode() * 31) + this.f295862b.hashCode();
    }

    @NotNull
    public final List<kotlin.ranges.n> k(long j10) {
        return f2.a(f2.c(this.f295862b, j10));
    }

    @NotNull
    public final List<kotlin.ranges.n> l(long j10, int i10) {
        return this.f295862b.size() > i10 ? o(n(j10)) : k(j10);
    }

    @Nullable
    public final kotlin.ranges.n n(long j10) {
        Object next;
        List<kotlin.ranges.n> listC = f2.c(this.f295862b, j10);
        Object next2 = null;
        if (listC.isEmpty()) {
            return null;
        }
        List<kotlin.ranges.n> list = listC;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jL = ((kotlin.ranges.n) next).l();
                do {
                    Object next3 = it.next();
                    long jL2 = ((kotlin.ranges.n) next3).l();
                    if (jL > jL2) {
                        next = next3;
                        jL = jL2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Intrinsics.checkNotNull(next);
        long jL3 = ((kotlin.ranges.n) next).l();
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                long jM = ((kotlin.ranges.n) next2).m();
                do {
                    Object next4 = it2.next();
                    long jM2 = ((kotlin.ranges.n) next4).m();
                    if (jM < jM2) {
                        next2 = next4;
                        jM = jM2;
                    }
                } while (it2.hasNext());
            }
        }
        Intrinsics.checkNotNull(next2);
        return new kotlin.ranges.n(jL3, kotlin.ranges.r.C(((kotlin.ranges.n) next2).m(), j10 - 1));
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.f295862b, ",", this.f295861a + '=', null, 0, null, null, 60, null);
    }

    public /* synthetic */ h2(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? e2.Bytes.n() : str, (List<? extends k>) list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h2(@NotNull e2 unit, @NotNull List<? extends k> ranges) {
        this(unit.n(), ranges);
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
    }
}
