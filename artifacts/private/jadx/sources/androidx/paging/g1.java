package androidx.paging;

import com.devtodev.core.data.metrics.MetricConsts;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g1<T> {

    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Drop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
    public static final class a<T> extends g1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a1 f71928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f71929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f71930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f71931d;

        /* JADX INFO: renamed from: androidx.paging.g1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0656a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f71932a;

            static {
                int[] iArr = new int[a1.values().length];
                try {
                    iArr[a1.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a1.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f71932a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull a1 loadType, int i10, int i11, int i12) {
            super(null);
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            this.f71928a = loadType;
            this.f71929b = i10;
            this.f71930c = i11;
            this.f71931d = i12;
            if (loadType == a1.REFRESH) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if (p() <= 0) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + p()).toString());
            }
            if (i12 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i12).toString());
        }

        public static /* synthetic */ a l(a aVar, a1 a1Var, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                a1Var = aVar.f71928a;
            }
            if ((i13 & 2) != 0) {
                i10 = aVar.f71929b;
            }
            if ((i13 & 4) != 0) {
                i11 = aVar.f71930c;
            }
            if ((i13 & 8) != 0) {
                i12 = aVar.f71931d;
            }
            return aVar.k(a1Var, i10, i11, i12);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f71928a == aVar.f71928a && this.f71929b == aVar.f71929b && this.f71930c == aVar.f71930c && this.f71931d == aVar.f71931d;
        }

        @NotNull
        public final a1 g() {
            return this.f71928a;
        }

        public final int h() {
            return this.f71929b;
        }

        public int hashCode() {
            return (((((this.f71928a.hashCode() * 31) + Integer.hashCode(this.f71929b)) * 31) + Integer.hashCode(this.f71930c)) * 31) + Integer.hashCode(this.f71931d);
        }

        public final int i() {
            return this.f71930c;
        }

        public final int j() {
            return this.f71931d;
        }

        @NotNull
        public final a<T> k(@NotNull a1 loadType, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            return new a<>(loadType, i10, i11, i12);
        }

        @NotNull
        public final a1 m() {
            return this.f71928a;
        }

        public final int n() {
            return this.f71930c;
        }

        public final int o() {
            return this.f71929b;
        }

        public final int p() {
            return (this.f71930c - this.f71929b) + 1;
        }

        public final int q() {
            return this.f71931d;
        }

        @NotNull
        public String toString() {
            String str;
            int i10 = C0656a.f71932a[this.f71928a.ordinal()];
            if (i10 == 1) {
                str = "end";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            return StringsKt.r("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.f71929b + "\n                    |   maxPageOffset: " + this.f71930c + "\n                    |   placeholdersRemaining: " + this.f71931d + "\n                    |)", null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n116#1,3:319\n119#1,5:326\n112#1,7:331\n119#1,5:346\n112#1,7:351\n119#1,5:365\n112#1,7:370\n119#1,5:384\n1549#2:322\n1620#2,3:323\n1549#2:338\n1620#2,2:339\n1549#2:341\n1620#2,3:342\n1622#2:345\n1549#2:358\n1620#2,2:359\n1864#2,3:361\n1622#2:364\n1549#2:377\n1620#2,2:378\n1864#2,3:380\n1622#2:383\n1789#2,3:389\n27#3,5:392\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n*L\n112#1:319,3\n112#1:326,5\n125#1:331,7\n125#1:346,5\n136#1:351,7\n136#1:365,5\n154#1:370,7\n154#1:384,5\n112#1:322\n112#1:323,3\n125#1:338\n125#1:339,2\n128#1:341\n128#1:342,3\n125#1:345\n136#1:358\n136#1:359,2\n139#1:361,3\n136#1:364\n154#1:377\n154#1:378,2\n157#1:380,3\n154#1:383\n233#1:389,3\n236#1:392,5\n*E\n"})
    public static final class b<T> extends g1<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final a f71933g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final b<Object> f71934h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a1 f71935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<g3<T>> f71936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f71937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f71938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final z0 f71939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final z0 f71940f;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ b b(a aVar, List list, int i10, z0 z0Var, z0 z0Var2, int i11, Object obj) {
                if ((i11 & 8) != 0) {
                    z0Var2 = null;
                }
                return aVar.a(list, i10, z0Var, z0Var2);
            }

            public static /* synthetic */ b d(a aVar, List list, int i10, z0 z0Var, z0 z0Var2, int i11, Object obj) {
                if ((i11 & 8) != 0) {
                    z0Var2 = null;
                }
                return aVar.c(list, i10, z0Var, z0Var2);
            }

            public static /* synthetic */ b f(a aVar, List list, int i10, int i11, z0 z0Var, z0 z0Var2, int i12, Object obj) {
                if ((i12 & 16) != 0) {
                    z0Var2 = null;
                }
                return aVar.e(list, i10, i11, z0Var, z0Var2);
            }

            @NotNull
            public final <T> b<T> a(@NotNull List<g3<T>> pages, int i10, @NotNull z0 sourceLoadStates, @Nullable z0 z0Var) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new b<>(a1.APPEND, pages, -1, i10, sourceLoadStates, z0Var, null);
            }

            @NotNull
            public final <T> b<T> c(@NotNull List<g3<T>> pages, int i10, @NotNull z0 sourceLoadStates, @Nullable z0 z0Var) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new b<>(a1.PREPEND, pages, i10, -1, sourceLoadStates, z0Var, null);
            }

            @NotNull
            public final <T> b<T> e(@NotNull List<g3<T>> pages, int i10, int i11, @NotNull z0 sourceLoadStates, @Nullable z0 z0Var) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new b<>(a1.REFRESH, pages, i10, i11, sourceLoadStates, z0Var, null);
            }

            @NotNull
            public final b<Object> g() {
                return b.f71934h;
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: androidx.paging.g1$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {androidx.media2.widget.f.i.f59801t0}, m = "filter", n = {"predicate", "this_$iv$iv", "destination$iv$iv$iv", MetricConsts.Install, "data", "originalIndices", "t", "index$iv", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1"})
        static final class C0657b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f71941a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f71942b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f71943c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f71944d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f71945e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f71946f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f71947g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f71948h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f71949i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f71950j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f71951k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f71952l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f71953m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f71954n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b<T> f71955o;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f71956s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0657b(b<T> bVar, kotlin.coroutines.d<? super C0657b> dVar) {
                super(dVar);
                this.f71955o = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71954n = obj;
                this.f71956s |= Integer.MIN_VALUE;
                return this.f71955o.a(null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {androidx.media2.widget.f.i.f59773f0}, m = "flatMap", n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", MetricConsts.Install, "data", "originalIndices", "index$iv", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "I$0", "I$1"})
        static final class c<R> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f71957a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f71958b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f71959c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f71960d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f71961e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f71962f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f71963g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f71964h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f71965i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f71966j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f71967k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f71968l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f71969m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f71970n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b<T> f71971o;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f71972s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b<T> bVar, kotlin.coroutines.d<? super c> dVar) {
                super(dVar);
                this.f71971o = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71970n = obj;
                this.f71972s |= Integer.MIN_VALUE;
                return this.f71971o.c(null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0}, l = {128}, m = "map", n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", MetricConsts.Install, "destination$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$5", "L$7"})
        static final class d<R> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f71973a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f71974b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f71975c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f71976d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f71977e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f71978f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f71979g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f71980h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f71981i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f71982j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f71983k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            /* synthetic */ Object f71984l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ b<T> f71985m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f71986n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b<T> bVar, kotlin.coroutines.d<? super d> dVar) {
                super(dVar);
                this.f71985m = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71984l = obj;
                this.f71986n |= Integer.MIN_VALUE;
                return this.f71985m.e(null, this);
            }
        }

        static {
            a aVar = new a(null);
            f71933g = aVar;
            List listListOf = CollectionsKt.listOf(g3.f72018e.b());
            x0.c.a aVar2 = x0.c.f72693b;
            f71934h = a.f(aVar, listListOf, 0, 0, new z0(aVar2.b(), aVar2.a(), aVar2.a()), null, 16, null);
        }

        public /* synthetic */ b(a1 a1Var, List list, int i10, int i11, z0 z0Var, z0 z0Var2, DefaultConstructorMarker defaultConstructorMarker) {
            this(a1Var, list, i10, i11, z0Var, z0Var2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b o(b bVar, a1 a1Var, List list, int i10, int i11, z0 z0Var, z0 z0Var2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                a1Var = bVar.f71935a;
            }
            if ((i12 & 2) != 0) {
                list = bVar.f71936b;
            }
            if ((i12 & 4) != 0) {
                i10 = bVar.f71937c;
            }
            if ((i12 & 8) != 0) {
                i11 = bVar.f71938d;
            }
            if ((i12 & 16) != 0) {
                z0Var = bVar.f71939e;
            }
            if ((i12 & 32) != 0) {
                z0Var2 = bVar.f71940f;
            }
            z0 z0Var3 = z0Var;
            z0 z0Var4 = z0Var2;
            return bVar.n(a1Var, list, i10, i11, z0Var3, z0Var4);
        }

        private final <R> b<R> v(Function1<? super g3<T>, g3<R>> function1) {
            a1 a1VarP = p();
            List<g3<T>> listR = r();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listR, 10));
            Iterator<T> it = listR.iterator();
            while (it.hasNext()) {
                arrayList.add(function1.invoke(it.next()));
            }
            return new b<>(a1VarP, arrayList, t(), s(), u(), q(), null);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009a  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ee A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:34:0x0126  */
        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009a -> B:18:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ef -> B:27:0x00fd). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.g1
        @org.jetbrains.annotations.Nullable
        public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1<T>> r19) {
            /*
                Method dump skipped, instruction units count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g1.b.a(kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009f  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:22:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:25:0x00f8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:34:0x0138  */
        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009f -> B:18:0x00bf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f9 -> B:27:0x0108). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.g1
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.d<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1<R>> r19) {
            /*
                Method dump skipped, instruction units count: 362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g1.b.c(kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009e  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:22:0x00eb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:25:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009e -> B:18:0x00c3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ec -> B:24:0x00f1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.g1
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends java.lang.Object> r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1<R>> r19) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g1.b.e(kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f71935a == bVar.f71935a && Intrinsics.areEqual(this.f71936b, bVar.f71936b) && this.f71937c == bVar.f71937c && this.f71938d == bVar.f71938d && Intrinsics.areEqual(this.f71939e, bVar.f71939e) && Intrinsics.areEqual(this.f71940f, bVar.f71940f);
        }

        @NotNull
        public final a1 h() {
            return this.f71935a;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f71935a.hashCode() * 31) + this.f71936b.hashCode()) * 31) + Integer.hashCode(this.f71937c)) * 31) + Integer.hashCode(this.f71938d)) * 31) + this.f71939e.hashCode()) * 31;
            z0 z0Var = this.f71940f;
            return iHashCode + (z0Var == null ? 0 : z0Var.hashCode());
        }

        @NotNull
        public final List<g3<T>> i() {
            return this.f71936b;
        }

        public final int j() {
            return this.f71937c;
        }

        public final int k() {
            return this.f71938d;
        }

        @NotNull
        public final z0 l() {
            return this.f71939e;
        }

        @Nullable
        public final z0 m() {
            return this.f71940f;
        }

        @NotNull
        public final b<T> n(@NotNull a1 loadType, @NotNull List<g3<T>> pages, int i10, int i11, @NotNull z0 sourceLoadStates, @Nullable z0 z0Var) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return new b<>(loadType, pages, i10, i11, sourceLoadStates, z0Var);
        }

        @NotNull
        public final a1 p() {
            return this.f71935a;
        }

        @Nullable
        public final z0 q() {
            return this.f71940f;
        }

        @NotNull
        public final List<g3<T>> r() {
            return this.f71936b;
        }

        public final int s() {
            return this.f71938d;
        }

        public final int t() {
            return this.f71937c;
        }

        @NotNull
        public String toString() {
            List<T> listH;
            List<T> listH2;
            Iterator<T> it = this.f71936b.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((g3) it.next()).h().size();
            }
            int i10 = this.f71937c;
            String strValueOf = i10 != -1 ? String.valueOf(i10) : "none";
            int i11 = this.f71938d;
            String strValueOf2 = i11 != -1 ? String.valueOf(i11) : "none";
            z0 z0Var = this.f71940f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PageEvent.Insert for ");
            sb2.append(this.f71935a);
            sb2.append(", with ");
            sb2.append(size);
            sb2.append(" items (\n                    |   first item: ");
            g3 g3Var = (g3) CollectionsKt.firstOrNull((List) this.f71936b);
            sb2.append((g3Var == null || (listH2 = g3Var.h()) == null) ? null : CollectionsKt.firstOrNull((List) listH2));
            sb2.append("\n                    |   last item: ");
            g3 g3Var2 = (g3) CollectionsKt.lastOrNull((List) this.f71936b);
            sb2.append((g3Var2 == null || (listH = g3Var2.h()) == null) ? null : CollectionsKt.lastOrNull((List) listH));
            sb2.append("\n                    |   placeholdersBefore: ");
            sb2.append(strValueOf);
            sb2.append("\n                    |   placeholdersAfter: ");
            sb2.append(strValueOf2);
            sb2.append("\n                    |   sourceLoadStates: ");
            sb2.append(this.f71939e);
            sb2.append("\n                    ");
            String string = sb2.toString();
            if (z0Var != null) {
                string = string + "|   mediatorLoadStates: " + z0Var + '\n';
            }
            int i12 = 7 | 1;
            return StringsKt.r(string + "|)", null, 1, null);
        }

        @NotNull
        public final z0 u() {
            return this.f71939e;
        }

        @NotNull
        public final <R> b<R> w(@NotNull Function1<? super List<g3<T>>, ? extends List<g3<R>>> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return new b<>(p(), transform.invoke(r()), t(), s(), u(), q(), null);
        }

        /* synthetic */ b(a1 a1Var, List list, int i10, int i11, z0 z0Var, z0 z0Var2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(a1Var, list, i10, i11, z0Var, (i12 & 32) != 0 ? null : z0Var2);
        }

        private b(a1 a1Var, List<g3<T>> list, int i10, int i11, z0 z0Var, z0 z0Var2) {
            super(null);
            this.f71935a = a1Var;
            this.f71936b = list;
            this.f71937c = i10;
            this.f71938d = i11;
            this.f71939e = z0Var;
            this.f71940f = z0Var2;
            if (a1Var != a1.APPEND && i10 < 0) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i10).toString());
            }
            if (a1Var != a1.PREPEND && i11 < 0) {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i11).toString());
            }
            if (a1Var == a1.REFRESH && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            }
        }
    }

    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$LoadStateUpdate\n+ 2 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n27#2,5:319\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$LoadStateUpdate\n*L\n300#1:319,5\n*E\n"})
    public static final class c<T> extends g1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final z0 f71987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final z0 f71988b;

        public /* synthetic */ c(z0 z0Var, z0 z0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z0Var, (i10 & 2) != 0 ? null : z0Var2);
        }

        public static /* synthetic */ c j(c cVar, z0 z0Var, z0 z0Var2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z0Var = cVar.f71987a;
            }
            if ((i10 & 2) != 0) {
                z0Var2 = cVar.f71988b;
            }
            return cVar.i(z0Var, z0Var2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f71987a, cVar.f71987a) && Intrinsics.areEqual(this.f71988b, cVar.f71988b);
        }

        @NotNull
        public final z0 g() {
            return this.f71987a;
        }

        @Nullable
        public final z0 h() {
            return this.f71988b;
        }

        public int hashCode() {
            int iHashCode = this.f71987a.hashCode() * 31;
            z0 z0Var = this.f71988b;
            return iHashCode + (z0Var == null ? 0 : z0Var.hashCode());
        }

        @NotNull
        public final c<T> i(@NotNull z0 source, @Nullable z0 z0Var) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new c<>(source, z0Var);
        }

        @Nullable
        public final z0 k() {
            return this.f71988b;
        }

        @NotNull
        public final z0 l() {
            return this.f71987a;
        }

        @NotNull
        public String toString() {
            z0 z0Var = this.f71988b;
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f71987a + "\n                    ";
            if (z0Var != null) {
                str = str + "|   mediatorLoadStates: " + z0Var + '\n';
            }
            return StringsKt.r(str + "|)", null, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull z0 source, @Nullable z0 z0Var) {
            super(null);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f71987a = source;
            this.f71988b = z0Var;
        }
    }

    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$StaticList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n1549#2:319\n1620#2,3:320\n1360#2:323\n1446#2,5:324\n766#2:329\n857#2,2:330\n27#3,5:332\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$StaticList\n*L\n48#1:319\n48#1:320,3\n58#1:323\n58#1:324,5\n66#1:329\n66#1:330,2\n73#1:332,5\n*E\n"})
    public static final class d<T> extends g1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<T> f71989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final z0 f71990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final z0 f71991c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", i = {0, 0, 0, 0}, l = {66}, m = "filter", n = {"this", "predicate", "destination$iv$iv", "element$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$4"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f71992a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f71993b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f71994c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f71995d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f71996e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f71997f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d<T> f71998g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f71999h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d<T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.f71998g = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71997f = obj;
                this.f71999h |= Integer.MIN_VALUE;
                return this.f71998g.a(null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = "flatMap", n = {"this", "transform", "destination$iv$iv"}, s = {"L$0", "L$1", "L$2"})
        static final class b<R> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f72000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f72001b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f72002c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f72003d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f72004e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d<T> f72005f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f72006g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d<T> dVar, kotlin.coroutines.d<? super b> dVar2) {
                super(dVar2);
                this.f72005f = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f72004e = obj;
                this.f72006g |= Integer.MIN_VALUE;
                return this.f72005f.c(null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", i = {0, 0, 0}, l = {48}, m = "map", n = {"this", "transform", "destination$iv$iv"}, s = {"L$0", "L$1", "L$2"})
        static final class c<R> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f72007a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f72008b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f72009c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f72010d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f72011e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f72012f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d<T> f72013g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f72014h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d<T> dVar, kotlin.coroutines.d<? super c> dVar2) {
                super(dVar2);
                this.f72013g = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f72012f = obj;
                this.f72014h |= Integer.MIN_VALUE;
                return this.f72013g.e(null, this);
            }
        }

        public /* synthetic */ d(List list, z0 z0Var, z0 z0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? null : z0Var, (i10 & 4) != 0 ? null : z0Var2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d k(d dVar, List list, z0 z0Var, z0 z0Var2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = dVar.f71989a;
            }
            if ((i10 & 2) != 0) {
                z0Var = dVar.f71990b;
            }
            if ((i10 & 4) != 0) {
                z0Var2 = dVar.f71991c;
            }
            return dVar.j(list, z0Var, z0Var2);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x006a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0081 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0082  */
        /* JADX WARN: Code duplicated, block: B:24:0x0094  */
        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0082 -> B:22:0x0089). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.g1
        @org.jetbrains.annotations.Nullable
        public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1<T>> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof androidx.paging.g1.d.a
                if (r0 == 0) goto L16
                r0 = r10
                r0 = r10
                androidx.paging.g1$d$a r0 = (androidx.paging.g1.d.a) r0
                r7 = 1
                int r1 = r0.f71999h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f71999h = r1
                r7 = 1
                goto L1b
            L16:
                androidx.paging.g1$d$a r0 = new androidx.paging.g1$d$a
                r0.<init>(r8, r10)
            L1b:
                java.lang.Object r10 = r0.f71997f
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f71999h
                r3 = 1
                if (r2 == 0) goto L4f
                r7 = 1
                if (r2 != r3) goto L43
                java.lang.Object r8 = r0.f71996e
                java.lang.Object r9 = r0.f71995d
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r2 = r0.f71994c
                r7 = 1
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r4 = r0.f71993b
                r7 = 2
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                r7 = 0
                java.lang.Object r5 = r0.f71992a
                r7 = 2
                androidx.paging.g1$d r5 = (androidx.paging.g1.d) r5
                kotlin.ResultKt.m(r10)
                goto L89
            L43:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "r/slnocc iksi/oab/u/ree uo/hfvtmt/ te/re iooe  /len"
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 3
                r8.<init>(r9)
                r7 = 7
                throw r8
            L4f:
                kotlin.ResultKt.m(r10)
                r7 = 0
                java.util.List<T> r10 = r8.f71989a
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r10 = r10.iterator()
                r6 = r10
                r10 = r9
                r9 = r6
            L63:
                r7 = 7
                boolean r4 = r9.hasNext()
                if (r4 == 0) goto L9b
                java.lang.Object r4 = r9.next()
                r0.f71992a = r8
                r7 = 7
                r0.f71993b = r10
                r0.f71994c = r2
                r0.f71995d = r9
                r0.f71996e = r4
                r0.f71999h = r3
                java.lang.Object r5 = r10.invoke(r4, r0)
                if (r5 != r1) goto L82
                return r1
            L82:
                r6 = r5
                r5 = r8
                r8 = r4
                r4 = r10
                r4 = r10
                r10 = r6
                r10 = r6
            L89:
                r7 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                r7 = 6
                boolean r10 = r10.booleanValue()
                r7 = 0
                if (r10 == 0) goto L97
                r2.add(r8)
            L97:
                r10 = r4
                r10 = r4
                r8 = r5
                goto L63
            L9b:
                java.util.List r2 = (java.util.List) r2
                androidx.paging.z0 r9 = r8.f71990b
                androidx.paging.z0 r8 = r8.f71991c
                androidx.paging.g1$d r10 = new androidx.paging.g1$d
                r7 = 3
                r10.<init>(r2, r9, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g1.d.a(kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0080 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:21:0x0087). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.g1
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.d<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1<R>> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.g1.d.b
                if (r0 == 0) goto L15
                r0 = r9
                r6 = 3
                androidx.paging.g1$d$b r0 = (androidx.paging.g1.d.b) r0
                int r1 = r0.f72006g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L15
                int r1 = r1 - r2
                r6 = 7
                r0.f72006g = r1
                goto L1a
            L15:
                androidx.paging.g1$d$b r0 = new androidx.paging.g1$d$b
                r0.<init>(r7, r9)
            L1a:
                java.lang.Object r9 = r0.f72004e
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r6 = 0
                int r2 = r0.f72006g
                r3 = 7
                r3 = 1
                if (r2 == 0) goto L4b
                if (r2 != r3) goto L43
                java.lang.Object r7 = r0.f72003d
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f72002c
                r6 = 4
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.Object r2 = r0.f72001b
                r6 = 7
                kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
                java.lang.Object r4 = r0.f72000a
                androidx.paging.g1$d r4 = (androidx.paging.g1.d) r4
                kotlin.ResultKt.m(r9)
                r5 = r4
                r4 = r8
                r8 = r5
                r6 = 7
                goto L87
            L43:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L4b:
                kotlin.ResultKt.m(r9)
                java.util.List<T> r9 = r7.f71989a
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r6 = 6
                java.util.Iterator r9 = r9.iterator()
                r5 = r8
                r8 = r7
                r8 = r7
                r7 = r9
                r9 = r5
                r9 = r5
            L62:
                r6 = 4
                boolean r4 = r7.hasNext()
                r6 = 2
                if (r4 == 0) goto L92
                java.lang.Object r4 = r7.next()
                r0.f72000a = r8
                r6 = 6
                r0.f72001b = r9
                r0.f72002c = r2
                r6 = 6
                r0.f72003d = r7
                r0.f72006g = r3
                java.lang.Object r4 = r9.invoke(r4, r0)
                if (r4 != r1) goto L81
                return r1
            L81:
                r5 = r2
                r2 = r9
                r2 = r9
                r9 = r4
                r9 = r4
                r4 = r5
            L87:
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                kotlin.collections.CollectionsKt.addAll(r4, r9)
                r9 = r2
                r9 = r2
                r2 = r4
                r2 = r4
                r6 = 6
                goto L62
            L92:
                java.util.List r2 = (java.util.List) r2
                r6 = 4
                androidx.paging.z0 r7 = r8.f71990b
                androidx.paging.z0 r8 = r8.f71991c
                r6 = 7
                androidx.paging.g1$d r9 = new androidx.paging.g1$d
                r9.<init>(r2, r7, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g1.d.c(kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0080  */
        /* JADX WARN: Code duplicated, block: B:19:0x0099 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x009a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009a -> B:21:0x00a1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.g1
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1<R>> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof androidx.paging.g1.d.c
                if (r0 == 0) goto L16
                r0 = r10
                androidx.paging.g1$d$c r0 = (androidx.paging.g1.d.c) r0
                int r1 = r0.f72014h
                r7 = 0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                r7 = 7
                int r1 = r1 - r2
                r7 = 0
                r0.f72014h = r1
                goto L1d
            L16:
                r7 = 3
                androidx.paging.g1$d$c r0 = new androidx.paging.g1$d$c
                r7 = 0
                r0.<init>(r8, r10)
            L1d:
                java.lang.Object r10 = r0.f72012f
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f72014h
                r7 = 2
                r3 = 1
                if (r2 == 0) goto L57
                if (r2 != r3) goto L4d
                java.lang.Object r8 = r0.f72011e
                java.util.Collection r8 = (java.util.Collection) r8
                r7 = 2
                java.lang.Object r9 = r0.f72010d
                r7 = 7
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r2 = r0.f72009c
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r4 = r0.f72008b
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                r7 = 2
                java.lang.Object r5 = r0.f72007a
                r7 = 2
                androidx.paging.g1$d r5 = (androidx.paging.g1.d) r5
                r7 = 1
                kotlin.ResultKt.m(r10)
                r6 = r0
                r0 = r9
                r9 = r5
                r5 = r6
                r7 = 4
                goto La1
            L4d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "/ /mba/ irouuo///rt l lefwkeshcr/i nneo eci/ttemveo"
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L57:
                kotlin.ResultKt.m(r10)
                java.util.List<T> r10 = r8.f71989a
                r7 = 0
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                r7 = 1
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r4)
                r7 = 4
                r2.<init>(r4)
                java.util.Iterator r10 = r10.iterator()
                r6 = r9
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r0
                r2 = r0
                r0 = r6
                r0 = r6
            L78:
                r7 = 1
                boolean r4 = r10.hasNext()
                r7 = 1
                if (r4 == 0) goto Lac
                java.lang.Object r4 = r10.next()
                r2.f72007a = r9
                r7 = 4
                r2.f72008b = r0
                r2.f72009c = r8
                r2.f72010d = r10
                r7 = 7
                r2.f72011e = r8
                r2.f72014h = r3
                r7 = 2
                java.lang.Object r4 = r0.invoke(r4, r2)
                if (r4 != r1) goto L9a
                return r1
            L9a:
                r5 = r0
                r5 = r0
                r0 = r10
                r10 = r4
                r4 = r5
                r5 = r2
                r2 = r8
            La1:
                r7 = 5
                r8.add(r10)
                r10 = r0
                r10 = r0
                r8 = r2
                r0 = r4
                r0 = r4
                r2 = r5
                goto L78
            Lac:
                r7 = 6
                java.util.List r8 = (java.util.List) r8
                r7 = 4
                androidx.paging.z0 r10 = r9.f71990b
                androidx.paging.z0 r9 = r9.f71991c
                androidx.paging.g1$d r0 = new androidx.paging.g1$d
                r7 = 5
                r0.<init>(r8, r10, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.g1.d.e(kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f71989a, dVar.f71989a) && Intrinsics.areEqual(this.f71990b, dVar.f71990b) && Intrinsics.areEqual(this.f71991c, dVar.f71991c);
        }

        @NotNull
        public final List<T> g() {
            return this.f71989a;
        }

        @Nullable
        public final z0 h() {
            return this.f71990b;
        }

        public int hashCode() {
            int iHashCode = this.f71989a.hashCode() * 31;
            z0 z0Var = this.f71990b;
            int iHashCode2 = 0;
            int iHashCode3 = (iHashCode + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
            z0 z0Var2 = this.f71991c;
            if (z0Var2 != null) {
                iHashCode2 = z0Var2.hashCode();
            }
            return iHashCode3 + iHashCode2;
        }

        @Nullable
        public final z0 i() {
            return this.f71991c;
        }

        @NotNull
        public final d<T> j(@NotNull List<? extends T> data, @Nullable z0 z0Var, @Nullable z0 z0Var2) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new d<>(data, z0Var, z0Var2);
        }

        @NotNull
        public final List<T> l() {
            return this.f71989a;
        }

        @Nullable
        public final z0 m() {
            return this.f71991c;
        }

        @Nullable
        public final z0 n() {
            return this.f71990b;
        }

        @NotNull
        public String toString() {
            z0 z0Var = this.f71991c;
            String str = "PageEvent.StaticList with " + this.f71989a.size() + " items (\n                    |   first item: " + CollectionsKt.firstOrNull((List) this.f71989a) + "\n                    |   last item: " + CollectionsKt.lastOrNull((List) this.f71989a) + "\n                    |   sourceLoadStates: " + this.f71990b + "\n                    ";
            if (z0Var != null) {
                str = str + "|   mediatorLoadStates: " + z0Var + '\n';
            }
            return StringsKt.r(str + "|)", null, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull List<? extends T> data, @Nullable z0 z0Var, @Nullable z0 z0Var2) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.f71989a = data;
            this.f71990b = z0Var;
            this.f71991c = z0Var2;
        }
    }

    public /* synthetic */ g1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    static /* synthetic */ <T> Object b(g1<T> g1Var, Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, kotlin.coroutines.d<? super g1<T>> dVar) {
        return g1Var;
    }

    static /* synthetic */ <T, R> Object d(g1<T> g1Var, Function2<? super T, ? super kotlin.coroutines.d<? super Iterable<? extends R>>, ? extends Object> function2, kotlin.coroutines.d<? super g1<R>> dVar) {
        Intrinsics.checkNotNull(g1Var, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.flatMap>");
        return g1Var;
    }

    static /* synthetic */ <T, R> Object f(g1<T> g1Var, Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super g1<R>> dVar) {
        Intrinsics.checkNotNull(g1Var, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
        return g1Var;
    }

    @Nullable
    public Object a(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super g1<T>> dVar) {
        return b(this, function2, dVar);
    }

    @Nullable
    public <R> Object c(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Iterable<? extends R>>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super g1<R>> dVar) {
        return d(this, function2, dVar);
    }

    @Nullable
    public <R> Object e(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super g1<R>> dVar) {
        return f(this, function2, dVar);
    }

    private g1() {
    }
}
