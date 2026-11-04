package androidx.compose.ui.text;

import androidx.compose.runtime.k7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1616:1\n35#2,5:1617\n251#2,2:1634\n35#2,5:1636\n253#2:1641\n103#2:1642\n35#2,5:1643\n104#2:1648\n251#2,2:1649\n35#2,5:1651\n253#2:1656\n231#2,2:1657\n35#2,5:1659\n233#2:1664\n231#2,2:1665\n35#2,5:1667\n233#2:1672\n231#2,2:1673\n35#2,5:1675\n233#2:1680\n103#2:1681\n35#2,5:1682\n104#2:1687\n1053#3:1622\n366#4:1623\n70#4:1624\n118#5,4:1625\n118#5,4:1630\n1#6:1629\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n121#1:1617,5\n221#1:1634,2\n221#1:1636,5\n221#1:1641\n231#1:1642\n231#1:1643,5\n231#1:1648\n246#1:1649,2\n246#1:1651,5\n246#1:1656\n263#1:1657,2\n263#1:1659,5\n263#1:1664\n281#1:1665,2\n281#1:1667,5\n281#1:1672\n297#1:1673,2\n297#1:1675,5\n297#1:1680\n306#1:1681\n306#1:1682,5\n306#1:1687\n137#1:1622\n148#1:1623\n151#1:1624\n153#1:1625,4\n177#1:1630,4\n*E\n"})
public final class f implements CharSequence {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41514f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final List<e<? extends a>> f41516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f41517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final List<e<c3>> f41518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final List<e<t0>> f41519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final c f41513e = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<f, ?> f41515g = u2.L0();

    public interface a {
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1616:1\n35#2,5:1617\n35#2,5:1622\n151#2,2:1639\n35#2,5:1641\n153#2:1646\n530#2,2:1647\n35#2,3:1649\n532#2:1652\n151#2,2:1653\n35#2,5:1655\n153#2:1660\n533#2,2:1661\n39#2:1663\n535#2:1664\n81#3,4:1627\n81#3,4:1631\n81#3,4:1635\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n541#1:1617,5\n559#1:1622,5\n999#1:1639,2\n999#1:1641,5\n999#1:1646\n1016#1:1647,2\n1016#1:1649,3\n1016#1:1652\n1017#1:1653,2\n1017#1:1655,5\n1017#1:1660\n1016#1:1661,2\n1016#1:1663\n1016#1:1664\n829#1:1627,4\n970#1:1631,4\n987#1:1635,4\n*E\n"})
    public static final class b implements Appendable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41520e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final StringBuilder f41521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<C0333b<? extends Object>> f41522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<C0333b<? extends a>> f41523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final a f41524d;

        @androidx.compose.runtime.internal.w0(parameters = 0)
        public static final class a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f41525c = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final b f41526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final List<Pair<androidx.compose.ui.unit.z, p>> f41527b = new ArrayList();

            public a(@NotNull b bVar) {
                this.f41526a = bVar;
            }

            @NotNull
            public final b a() {
                return this.f41526a;
            }

            @NotNull
            public final List<Pair<androidx.compose.ui.unit.z, p>> b() {
                return this.f41527b;
            }
        }

        public b() {
            this(0, 1, null);
        }

        public static /* synthetic */ Object E(b bVar, long j10, p pVar, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = p.f42031h.b();
            }
            if ((i10 & 2) != 0) {
                pVar = p.f42031h.a();
            }
            return bVar.D(j10, pVar, function1);
        }

        public static /* synthetic */ Object G(b bVar, a aVar, p pVar, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                pVar = null;
            }
            return bVar.F(aVar, pVar, function1);
        }

        public final int A(@NotNull a4 a4Var) {
            C0333b<? extends a> c0333b = new C0333b<>(a4Var, this.f41521a.length(), 0, null, 12, null);
            this.f41522b.add(c0333b);
            this.f41523c.add(c0333b);
            return this.f41522b.size() - 1;
        }

        @v
        @kotlin.l(message = "Use LinkAnnotation API for links instead", replaceWith = @kotlin.b1(expression = "pushLink(, start, end)", imports = {}))
        public final int B(@NotNull b4 b4Var) {
            C0333b<? extends a> c0333b = new C0333b<>(b4Var, this.f41521a.length(), 0, null, 12, null);
            this.f41522b.add(c0333b);
            this.f41523c.add(c0333b);
            return this.f41522b.size() - 1;
        }

        @NotNull
        public final f C() {
            String string = this.f41521a.toString();
            List<C0333b<? extends a>> list = this.f41523c;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).l(this.f41521a.length()));
            }
            return new f(string, arrayList);
        }

        @NotNull
        public final <R> R D(long j10, @NotNull p pVar, @NotNull Function1<? super a, ? extends R> function1) {
            long j11;
            long jF;
            Pair pair = (Pair) CollectionsKt.lastOrNull((List) this.f41524d.b());
            if (pair != null) {
                long jW = ((androidx.compose.ui.unit.z) pair.getFirst()).w();
                if (!androidx.compose.ui.unit.b0.g(androidx.compose.ui.unit.z.m(jW), androidx.compose.ui.unit.z.m(j10))) {
                    x0.a.g("Indentation unit types of nested bullet lists must match. Current " + ((Object) androidx.compose.ui.unit.z.u(jW)) + " and previous is " + ((Object) androidx.compose.ui.unit.z.u(j10)));
                }
                long jM = androidx.compose.ui.unit.z.m(j10);
                androidx.compose.ui.unit.b0.a aVar = androidx.compose.ui.unit.b0.f42661b;
                if (androidx.compose.ui.unit.b0.g(jM, aVar.b())) {
                    jF = androidx.compose.ui.unit.a0.l(androidx.compose.ui.unit.z.n(j10) + androidx.compose.ui.unit.z.n(jW));
                } else {
                    jF = androidx.compose.ui.unit.b0.g(jM, aVar.a()) ? androidx.compose.ui.unit.a0.f(androidx.compose.ui.unit.z.n(j10) + androidx.compose.ui.unit.z.n(jW)) : j10;
                }
                j11 = jF;
            } else {
                j11 = j10;
            }
            int iY = y(new t0(0, 0, 0L, new androidx.compose.ui.text.style.s(j11, j11, null), (x0) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 503, (DefaultConstructorMarker) null));
            this.f41524d.b().add(new Pair<>(androidx.compose.ui.unit.z.c(j11), pVar));
            try {
                return function1.invoke(this.f41524d);
            } finally {
                if (!this.f41524d.b().isEmpty()) {
                    this.f41524d.b().remove(CollectionsKt.getLastIndex(this.f41524d.b()));
                }
                u(iY);
            }
        }

        @NotNull
        public final <R> R F(@NotNull a aVar, @Nullable p pVar, @NotNull Function1<? super b, ? extends R> function1) {
            p pVarA;
            Pair pair = (Pair) CollectionsKt.lastOrNull((List) aVar.b());
            long jW = pair != null ? ((androidx.compose.ui.unit.z) pair.getFirst()).w() : p.f42031h.b();
            if (pVar != null) {
                pVarA = pVar;
            } else if (pair == null || (pVarA = (p) pair.getSecond()) == null) {
                pVarA = p.f42031h.a();
            }
            int iY = aVar.a().y(new t0(0, 0, 0L, new androidx.compose.ui.text.style.s(jW, jW, null), (x0) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 503, (DefaultConstructorMarker) null));
            int iV = aVar.a().v(pVarA);
            try {
                return function1.invoke(aVar.a());
            } finally {
                aVar.a().u(iV);
                aVar.a().u(iY);
            }
        }

        public final void a(@NotNull p pVar, int i10, int i11) {
            this.f41523c.add(new C0333b<>(pVar, i10, i11, null, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(@NotNull p pVar, long j10, int i10, int i11) {
            Object[] objArr = 0 == true ? 1 : 0;
            this.f41523c.add(new C0333b<>(new t0(0, 0, 0L, new androidx.compose.ui.text.style.s(j10, j10, null), (x0) objArr, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 503, (DefaultConstructorMarker) null), i10, i11, null, 8, 0 == true ? 1 : 0));
            this.f41523c.add(new C0333b<>(pVar, i10, i11, 0 == true ? 1 : 0, 8, null));
        }

        public final void c(@NotNull b0.a aVar, int i10, int i11) {
            this.f41523c.add(new C0333b<>(aVar, i10, i11, null, 8, null));
        }

        public final void d(@NotNull b0.b bVar, int i10, int i11) {
            this.f41523c.add(new C0333b<>(bVar, i10, i11, null, 8, null));
        }

        public final void e(@NotNull String str, @NotNull String str2, int i10, int i11) {
            this.f41523c.add(new C0333b<>(f3.a(f3.b(str2)), i10, i11, str));
        }

        public final void f(@NotNull t0 t0Var, int i10, int i11) {
            this.f41523c.add(new C0333b<>(t0Var, i10, i11, null, 8, null));
        }

        public final void g(@NotNull c3 c3Var, int i10, int i11) {
            this.f41523c.add(new C0333b<>(c3Var, i10, i11, null, 8, null));
        }

        public final void h(@NotNull a4 a4Var, int i10, int i11) {
            this.f41523c.add(new C0333b<>(a4Var, i10, i11, null, 8, null));
        }

        @v
        @kotlin.l(message = "Use LinkAnnotation API for links instead", replaceWith = @kotlin.b1(expression = "addLink(, start, end)", imports = {}))
        public final void i(@NotNull b4 b4Var, int i10, int i11) {
            this.f41523c.add(new C0333b<>(b4Var, i10, i11, null, 8, null));
        }

        @Override // java.lang.Appendable
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b m(char c10) {
            this.f41521a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b append(@Nullable CharSequence charSequence) {
            if (charSequence instanceof f) {
                n((f) charSequence);
                return this;
            }
            this.f41521a.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b append(@Nullable CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof f) {
                o((f) charSequence, i10, i11);
                return this;
            }
            this.f41521a.append(charSequence, i10, i11);
            return this;
        }

        public final void n(@NotNull f fVar) {
            int length = this.f41521a.length();
            this.f41521a.append(fVar.m());
            List<e<? extends a>> listD = fVar.d();
            if (listD != null) {
                int size = listD.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e<? extends a> eVar = listD.get(i10);
                    this.f41523c.add(new C0333b<>(eVar.h(), eVar.i() + length, eVar.g() + length, eVar.j()));
                }
            }
        }

        public final void o(@NotNull f fVar, int i10, int i11) {
            int length = this.f41521a.length();
            this.f41521a.append((CharSequence) fVar.m(), i10, i11);
            List listX = l.x(fVar, i10, i11, null, 4, null);
            if (listX != null) {
                int size = listX.size();
                for (int i12 = 0; i12 < size; i12++) {
                    e eVar = (e) listX.get(i12);
                    this.f41523c.add(new C0333b<>(eVar.h(), eVar.i() + length, eVar.g() + length, eVar.j()));
                }
            }
        }

        public final void p(@NotNull String str) {
            this.f41521a.append(str);
        }

        public final void q(@NotNull Function1<? super e<? extends a>, ? extends List<? extends e<? extends a>>> function1) {
            List<C0333b<? extends a>> list = this.f41523c;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<? extends e<? extends a>> listInvoke = function1.invoke(C0333b.n(list.get(i10), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(listInvoke.size());
                int size2 = listInvoke.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(C0333b.f41528e.a(listInvoke.get(i11)));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            this.f41523c.clear();
            this.f41523c.addAll(arrayList);
        }

        public final int r() {
            return this.f41521a.length();
        }

        public final void s(@NotNull Function1<? super e<? extends a>, ? extends e<? extends a>> function1) {
            int size = this.f41523c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f41523c.set(i10, C0333b.f41528e.a(function1.invoke(C0333b.n(this.f41523c.get(i10), 0, 1, null))));
            }
        }

        public final void t() {
            if (this.f41522b.isEmpty()) {
                x0.a.g("Nothing to pop.");
            }
            List<C0333b<? extends Object>> list = this.f41522b;
            list.remove(list.size() - 1).k(this.f41521a.length());
        }

        public final void u(int i10) {
            if (!(i10 < this.f41522b.size())) {
                x0.a.g(i10 + " should be less than " + this.f41522b.size());
            }
            while (this.f41522b.size() - 1 >= i10) {
                t();
            }
        }

        public final int v(@NotNull p pVar) {
            C0333b<? extends a> c0333b = new C0333b<>(pVar, this.f41521a.length(), 0, null, 12, null);
            this.f41522b.add(c0333b);
            this.f41523c.add(c0333b);
            return this.f41522b.size() - 1;
        }

        public final int w(@NotNull b0 b0Var) {
            C0333b<? extends a> c0333b = new C0333b<>(b0Var, this.f41521a.length(), 0, null, 12, null);
            this.f41522b.add(c0333b);
            this.f41523c.add(c0333b);
            return this.f41522b.size() - 1;
        }

        public final int x(@NotNull String str, @NotNull String str2) {
            int i10 = 7 >> 0;
            C0333b<? extends a> c0333b = new C0333b<>(f3.a(f3.b(str2)), this.f41521a.length(), 0, str, 4, null);
            this.f41522b.add(c0333b);
            this.f41523c.add(c0333b);
            return this.f41522b.size() - 1;
        }

        public final int y(@NotNull t0 t0Var) {
            C0333b<? extends a> c0333b = new C0333b<>(t0Var, this.f41521a.length(), 0, null, 12, null);
            this.f41522b.add(c0333b);
            this.f41523c.add(c0333b);
            return this.f41522b.size() - 1;
        }

        public final int z(@NotNull c3 c3Var) {
            C0333b<? extends a> c0333b = new C0333b<>(c3Var, this.f41521a.length(), 0, null, 12, null);
            this.f41522b.add(c0333b);
            this.f41523c.add(c0333b);
            return this.f41522b.size() - 1;
        }

        public b(int i10) {
            this.f41521a = new StringBuilder(i10);
            this.f41522b = new ArrayList();
            this.f41523c = new ArrayList();
            this.f41524d = new a(this);
        }

        /* JADX INFO: renamed from: androidx.compose.ui.text.f$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1616:1\n81#2,4:1617\n81#2,4:1621\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n*L\n418#1:1617,4\n429#1:1621,4\n*E\n"})
        private static final class C0333b<T> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public static final a f41528e = new a(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final T f41529a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f41530b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f41531c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private final String f41532d;

            /* JADX INFO: renamed from: androidx.compose.ui.text.f$b$b$a */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final <T> C0333b<T> a(@NotNull e<T> eVar) {
                    return new C0333b<>(eVar.h(), eVar.i(), eVar.g(), eVar.j());
                }

                private a() {
                }
            }

            public C0333b(T t10, int i10, int i11, @NotNull String str) {
                this.f41529a = t10;
                this.f41530b = i10;
                this.f41531c = i11;
                this.f41532d = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0333b f(C0333b c0333b, Object obj, int i10, int i11, String str, int i12, Object obj2) {
                if ((i12 & 1) != 0) {
                    obj = c0333b.f41529a;
                }
                if ((i12 & 2) != 0) {
                    i10 = c0333b.f41530b;
                }
                if ((i12 & 4) != 0) {
                    i11 = c0333b.f41531c;
                }
                if ((i12 & 8) != 0) {
                    str = c0333b.f41532d;
                }
                return c0333b.e(obj, i10, i11, str);
            }

            public static /* synthetic */ e n(C0333b c0333b, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return c0333b.l(i10);
            }

            public static /* synthetic */ e o(C0333b c0333b, Function1 function1, int i10, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return c0333b.m(function1, i10);
            }

            public final T a() {
                return this.f41529a;
            }

            public final int b() {
                return this.f41530b;
            }

            public final int c() {
                return this.f41531c;
            }

            @NotNull
            public final String d() {
                return this.f41532d;
            }

            @NotNull
            public final C0333b<T> e(T t10, int i10, int i11, @NotNull String str) {
                return new C0333b<>(t10, i10, i11, str);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0333b)) {
                    return false;
                }
                C0333b c0333b = (C0333b) obj;
                return Intrinsics.areEqual(this.f41529a, c0333b.f41529a) && this.f41530b == c0333b.f41530b && this.f41531c == c0333b.f41531c && Intrinsics.areEqual(this.f41532d, c0333b.f41532d);
            }

            public final int g() {
                return this.f41531c;
            }

            public final T h() {
                return this.f41529a;
            }

            public int hashCode() {
                T t10 = this.f41529a;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.f41530b)) * 31) + Integer.hashCode(this.f41531c)) * 31) + this.f41532d.hashCode();
            }

            public final int i() {
                return this.f41530b;
            }

            @NotNull
            public final String j() {
                return this.f41532d;
            }

            public final void k(int i10) {
                this.f41531c = i10;
            }

            @NotNull
            public final e<T> l(int i10) {
                int i11 = this.f41531c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (!(i10 != Integer.MIN_VALUE)) {
                    x0.a.g("Item.end should be set first");
                }
                return new e<>(this.f41529a, this.f41530b, i10, this.f41532d);
            }

            @NotNull
            public final <R> e<R> m(@NotNull Function1<? super T, ? extends R> function1, int i10) {
                int i11 = this.f41531c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (!(i10 != Integer.MIN_VALUE)) {
                    x0.a.g("Item.end should be set first");
                }
                return new e<>(function1.invoke(this.f41529a), this.f41530b, i10, this.f41532d);
            }

            @NotNull
            public String toString() {
                return "MutableRange(item=" + this.f41529a + ", start=" + this.f41530b + ", end=" + this.f41531c + ", tag=" + this.f41532d + ')';
            }

            public /* synthetic */ C0333b(Object obj, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public b(@NotNull String str) {
            this(0, 1, null);
            p(str);
        }

        public b(@NotNull f fVar) {
            this(0, 1, null);
            n(fVar);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<f, ?> a() {
            return f.f41515g;
        }

        private c() {
        }
    }

    private static final class d implements a {
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.f$f, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,102:1\n137#2:103\n*E\n"})
    public static final class C0334f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Integer.valueOf(((e) t10).i()), Integer.valueOf(((e) t11).i()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Nullable List<? extends e<? extends a>> list, @NotNull String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f41516a = list;
        this.f41517b = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                e<c3> eVar = (e) list.get(i10);
                if (eVar.h() instanceof c3) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(eVar);
                } else if (eVar.h() instanceof t0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(eVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f41518c = arrayList;
        this.f41519d = arrayList2;
        List listSortedWith = arrayList2 != null ? CollectionsKt.sortedWith(arrayList2, new C0334f()) : null;
        List list2 = listSortedWith;
        if (list2 != null && !list2.isEmpty()) {
            androidx.collection.r1 r1VarJ = androidx.collection.g0.j(((e) CollectionsKt.first(listSortedWith)).g());
            int size2 = listSortedWith.size();
            for (int i11 = 1; i11 < size2; i11++) {
                e eVar2 = (e) listSortedWith.get(i11);
                while (r1VarJ.f12216b != 0) {
                    int iV = r1VarJ.V();
                    if (eVar2.i() < iV) {
                        if (!(eVar2.g() <= iV)) {
                            x0.a.e("Paragraph overlap not allowed, end " + eVar2.g() + " should be less than or equal to " + iV);
                            break;
                        }
                        break;
                    }
                    r1VarJ.s0(r1VarJ.f12216b - 1);
                }
                r1VarJ.b0(eVar2.g());
            }
        }
    }

    @NotNull
    public final f b(@NotNull Function1<? super e<? extends a>, ? extends List<? extends e<? extends a>>> function1) {
        b bVar = new b(this);
        bVar.q(function1);
        return bVar.C();
    }

    public char c(int i10) {
        return this.f41517b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return c(i10);
    }

    @Nullable
    public final List<e<? extends a>> d() {
        return this.f41516a;
    }

    public int e() {
        return this.f41517b.length();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f41517b, fVar.f41517b) && Intrinsics.areEqual(this.f41516a, fVar.f41516a);
    }

    @NotNull
    public final List<e<b0>> f(int i10, int i11) {
        List listEmptyList;
        List<e<? extends a>> list = this.f41516a;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                e<? extends a> eVar = list.get(i12);
                e<? extends a> eVar2 = eVar;
                if ((eVar2.h() instanceof b0) && l.z(i10, i11, eVar2.i(), eVar2.g())) {
                    listEmptyList.add(eVar);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listEmptyList;
    }

    @NotNull
    public final List<e<t0>> g() {
        List<e<t0>> list = this.f41519d;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Nullable
    public final List<e<t0>> h() {
        return this.f41519d;
    }

    public int hashCode() {
        int iHashCode = this.f41517b.hashCode() * 31;
        List<e<? extends a>> list = this.f41516a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final List<e<c3>> i() {
        List<e<c3>> list = this.f41518c;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Nullable
    public final List<e<c3>> j() {
        return this.f41518c;
    }

    @NotNull
    public final List<e<String>> k(int i10, int i11) {
        List<e<? extends a>> list = this.f41516a;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            e<? extends a> eVar = list.get(i12);
            if ((eVar.h() instanceof f3) && l.z(i10, i11, eVar.i(), eVar.g())) {
                arrayList.add(g3.a(eVar));
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<e<String>> l(@NotNull String str, int i10, int i11) {
        List<e<? extends a>> list = this.f41516a;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            e<? extends a> eVar = list.get(i12);
            if ((eVar.h() instanceof f3) && Intrinsics.areEqual(str, eVar.j()) && l.z(i10, i11, eVar.i(), eVar.g())) {
                arrayList.add(g3.a(eVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return e();
    }

    @NotNull
    public final String m() {
        return this.f41517b;
    }

    @NotNull
    public final List<e<a4>> n(int i10, int i11) {
        List listEmptyList;
        List<e<? extends a>> list = this.f41516a;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                e<? extends a> eVar = list.get(i12);
                e<? extends a> eVar2 = eVar;
                if ((eVar2.h() instanceof a4) && l.z(i10, i11, eVar2.i(), eVar2.g())) {
                    listEmptyList.add(eVar);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listEmptyList;
    }

    @v
    @kotlin.l(message = "Use LinkAnnotation API instead", replaceWith = @kotlin.b1(expression = "getLinkAnnotations(start, end)", imports = {}))
    @NotNull
    public final List<e<b4>> o(int i10, int i11) {
        List listEmptyList;
        List<e<? extends a>> list = this.f41516a;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                e<? extends a> eVar = list.get(i12);
                e<? extends a> eVar2 = eVar;
                if ((eVar2.h() instanceof b4) && l.z(i10, i11, eVar2.i(), eVar2.g())) {
                    listEmptyList.add(eVar);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listEmptyList;
    }

    public final boolean p(@NotNull f fVar) {
        return Intrinsics.areEqual(this.f41516a, fVar.f41516a);
    }

    public final boolean q(int i10, int i11) {
        List<e<? extends a>> list = this.f41516a;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                e<? extends a> eVar = list.get(i12);
                if ((eVar.h() instanceof b0) && l.z(i10, i11, eVar.i(), eVar.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(@NotNull String str, int i10, int i11) {
        List<e<? extends a>> list = this.f41516a;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                e<? extends a> eVar = list.get(i12);
                if ((eVar.h() instanceof f3) && Intrinsics.areEqual(str, eVar.j()) && l.z(i10, i11, eVar.i(), eVar.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final f s(@NotNull Function1<? super e<? extends a>, ? extends e<? extends a>> function1) {
        b bVar = new b(this);
        bVar.s(function1);
        return bVar.C();
    }

    @k7
    @NotNull
    public final f t(@NotNull f fVar) {
        b bVar = new b(this);
        bVar.n(fVar);
        return bVar.C();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.f41517b;
    }

    @Override // java.lang.CharSequence
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public f subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            x0.a.e("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        if (i10 == 0 && i11 == this.f41517b.length()) {
            return this;
        }
        String strSubstring = this.f41517b.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new f((List<? extends e<? extends a>>) l.v(this.f41516a, i10, i11), strSubstring);
    }

    @NotNull
    public final f v(long j10) {
        return subSequence(w3.l(j10), w3.k(j10));
    }

    @androidx.compose.runtime.o2
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1616:1\n118#2,4:1617\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n*L\n387#1:1617,4\n*E\n"})
    public static final class e<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41533e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f41534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f41535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f41536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f41537d;

        public e(T t10, int i10, int i11, @NotNull String str) {
            this.f41534a = t10;
            this.f41535b = i10;
            this.f41536c = i11;
            this.f41537d = str;
            if (i10 <= i11) {
                return;
            }
            x0.a.e("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ e f(e eVar, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = eVar.f41534a;
            }
            if ((i12 & 2) != 0) {
                i10 = eVar.f41535b;
            }
            if ((i12 & 4) != 0) {
                i11 = eVar.f41536c;
            }
            if ((i12 & 8) != 0) {
                str = eVar.f41537d;
            }
            return eVar.e(obj, i10, i11, str);
        }

        public final T a() {
            return this.f41534a;
        }

        public final int b() {
            return this.f41535b;
        }

        public final int c() {
            return this.f41536c;
        }

        @NotNull
        public final String d() {
            return this.f41537d;
        }

        @NotNull
        public final e<T> e(T t10, int i10, int i11, @NotNull String str) {
            return new e<>(t10, i10, i11, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f41534a, eVar.f41534a) && this.f41535b == eVar.f41535b && this.f41536c == eVar.f41536c && Intrinsics.areEqual(this.f41537d, eVar.f41537d);
        }

        public final int g() {
            return this.f41536c;
        }

        public final T h() {
            return this.f41534a;
        }

        public int hashCode() {
            T t10 = this.f41534a;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.f41535b)) * 31) + Integer.hashCode(this.f41536c)) * 31) + this.f41537d.hashCode();
        }

        public final int i() {
            return this.f41535b;
        }

        @NotNull
        public final String j() {
            return this.f41537d;
        }

        @NotNull
        public String toString() {
            return "Range(item=" + this.f41534a + ", start=" + this.f41535b + ", end=" + this.f41536c + ", tag=" + this.f41537d + ')';
        }

        public e(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    public /* synthetic */ f(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public f(@NotNull String str, @NotNull List<e<c3>> list, @NotNull List<e<t0>> list2) {
        this((List<? extends e<? extends a>>) l.p(list, list2), str);
    }

    public /* synthetic */ f(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends e<? extends a>>) ((i10 & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(@NotNull String str, @NotNull List<? extends e<? extends a>> list) {
        List<? extends e<? extends a>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
