package androidx.paging;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPagingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingSource.kt\nandroidx/paging/PagingSource\n+ 2 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n*L\n1#1,425:1\n32#2,10:426\n*S KotlinDebug\n*F\n+ 1 PagingSource.kt\nandroidx/paging/PagingSource\n*L\n359#1:426,10\n*E\n"})
public abstract class h2<Key, Value> {

    @NotNull
    private final k0<Function0<Unit>> invalidateCallbackTracker = new k0<>(c.f72108a, null, 2, 0 == true ? 1 : 0);

    public static abstract class a<Key> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f72092c = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f72094b;

        /* JADX INFO: renamed from: androidx.paging.h2$a$a, reason: collision with other inner class name */
        public static final class C0661a<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private final Key f72095d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0661a(@NotNull Key key, int i10, boolean z10) {
                super(i10, z10, null);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f72095d = key;
            }

            @Override // androidx.paging.h2.a
            @NotNull
            public Key a() {
                return this.f72095d;
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: androidx.paging.h2$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0662a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f72096a;

                static {
                    int[] iArr = new int[a1.values().length];
                    try {
                        iArr[a1.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a1.PREPEND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a1.APPEND.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f72096a = iArr;
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final <Key> a<Key> a(@NotNull a1 loadType, @Nullable Key key, int i10, boolean z10) {
                Intrinsics.checkNotNullParameter(loadType, "loadType");
                int i11 = C0662a.f72096a[loadType.ordinal()];
                if (i11 == 1) {
                    return new d(key, i10, z10);
                }
                if (i11 == 2) {
                    if (key != null) {
                        return new c(key, i10, z10);
                    }
                    throw new IllegalArgumentException("key cannot be null for prepend");
                }
                int i12 = 1 & 3;
                if (i11 != 3) {
                    throw new kotlin.k0();
                }
                if (key != null) {
                    return new C0661a(key, i10, z10);
                }
                throw new IllegalArgumentException("key cannot be null for append");
            }

            private b() {
            }
        }

        public static final class c<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private final Key f72097d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull Key key, int i10, boolean z10) {
                super(i10, z10, null);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f72097d = key;
            }

            @Override // androidx.paging.h2.a
            @NotNull
            public Key a() {
                return this.f72097d;
            }
        }

        public static final class d<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            private final Key f72098d;

            public d(@Nullable Key key, int i10, boolean z10) {
                super(i10, z10, null);
                this.f72098d = key;
            }

            @Override // androidx.paging.h2.a
            @Nullable
            public Key a() {
                return this.f72098d;
            }
        }

        public /* synthetic */ a(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, z10);
        }

        @Nullable
        public abstract Key a();

        public final int b() {
            return this.f72093a;
        }

        public final boolean c() {
            return this.f72094b;
        }

        private a(int i10, boolean z10) {
            this.f72093a = i10;
            this.f72094b = z10;
        }
    }

    public static abstract class b<Key, Value> {

        public static final class a<Key, Value> extends b<Key, Value> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Throwable f72099a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f72099a = throwable;
            }

            public static /* synthetic */ a i(a aVar, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    th2 = aVar.f72099a;
                }
                return aVar.d(th2);
            }

            @NotNull
            public final Throwable c() {
                return this.f72099a;
            }

            @NotNull
            public final a<Key, Value> d(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new a<>(throwable);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f72099a, ((a) obj).f72099a);
            }

            public int hashCode() {
                return this.f72099a.hashCode();
            }

            @NotNull
            public final Throwable k() {
                return this.f72099a;
            }

            @NotNull
            public String toString() {
                return StringsKt.r("LoadResult.Error(\n                    |   throwable: " + this.f72099a + "\n                    |) ", null, 1, null);
            }
        }

        /* JADX INFO: renamed from: androidx.paging.h2$b$b, reason: collision with other inner class name */
        public static final class C0663b<Key, Value> extends b<Key, Value> {
            public C0663b() {
                super(null);
            }

            @NotNull
            public String toString() {
                return "LoadResult.Invalid";
            }
        }

        public static final class c<Key, Value> extends b<Key, Value> implements Iterable<Value>, qj.a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f72101g = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final List<Value> f72103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private final Key f72104b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private final Key f72105c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f72106d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final int f72107e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            public static final a f72100f = new a(null);

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            @NotNull
            private static final c f72102h = new c(CollectionsKt.emptyList(), null, null, 0, 0);

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public static /* synthetic */ void c() {
                }

                @NotNull
                public final <Key, Value> c<Key, Value> a() {
                    c<Key, Value> cVarB = b();
                    Intrinsics.checkNotNull(cVarB, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
                    return cVarB;
                }

                @NotNull
                public final c b() {
                    return c.f72102h;
                }

                private a() {
                }
            }

            public /* synthetic */ c(List list, Object obj, Object obj2, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, obj, obj2, (i12 & 8) != 0 ? Integer.MIN_VALUE : i10, (i12 & 16) != 0 ? Integer.MIN_VALUE : i11);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ c s(c cVar, List list, Object obj, Object obj2, int i10, int i11, int i12, Object obj3) {
                if ((i12 & 1) != 0) {
                    list = cVar.f72103a;
                }
                if ((i12 & 2) != 0) {
                    obj = cVar.f72104b;
                }
                if ((i12 & 4) != 0) {
                    obj2 = cVar.f72105c;
                }
                if ((i12 & 8) != 0) {
                    i10 = cVar.f72106d;
                }
                if ((i12 & 16) != 0) {
                    i11 = cVar.f72107e;
                }
                int i13 = i11;
                Object obj4 = obj2;
                return cVar.p(list, obj, obj4, i10, i13);
            }

            @Nullable
            public final Key A() {
                return this.f72104b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f72103a, cVar.f72103a) && Intrinsics.areEqual(this.f72104b, cVar.f72104b) && Intrinsics.areEqual(this.f72105c, cVar.f72105c) && this.f72106d == cVar.f72106d && this.f72107e == cVar.f72107e;
            }

            public int hashCode() {
                int iHashCode = this.f72103a.hashCode() * 31;
                Key key = this.f72104b;
                int i10 = 0 >> 0;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f72105c;
                return ((((iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + Integer.hashCode(this.f72106d)) * 31) + Integer.hashCode(this.f72107e);
            }

            @NotNull
            public final List<Value> i() {
                return this.f72103a;
            }

            @Override // java.lang.Iterable
            @NotNull
            public Iterator<Value> iterator() {
                return this.f72103a.listIterator();
            }

            @Nullable
            public final Key k() {
                return this.f72104b;
            }

            @Nullable
            public final Key l() {
                return this.f72105c;
            }

            public final int m() {
                return this.f72106d;
            }

            public final int n() {
                return this.f72107e;
            }

            @NotNull
            public final c<Key, Value> p(@NotNull List<? extends Value> data, @Nullable Key key, @Nullable Key key2, @androidx.annotation.g0(from = androidx.collection.g3.f12261h) int i10, @androidx.annotation.g0(from = androidx.collection.g3.f12261h) int i11) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new c<>(data, key, key2, i10, i11);
            }

            @NotNull
            public final List<Value> t() {
                return this.f72103a;
            }

            @NotNull
            public String toString() {
                int i10 = 2 | 1;
                return StringsKt.r("LoadResult.Page(\n                    |   data size: " + this.f72103a.size() + "\n                    |   first Item: " + CollectionsKt.firstOrNull((List) this.f72103a) + "\n                    |   last Item: " + CollectionsKt.lastOrNull((List) this.f72103a) + "\n                    |   nextKey: " + this.f72105c + "\n                    |   prevKey: " + this.f72104b + "\n                    |   itemsBefore: " + this.f72106d + "\n                    |   itemsAfter: " + this.f72107e + "\n                    |) ", null, 1, null);
            }

            public final int u() {
                return this.f72107e;
            }

            public final int v() {
                return this.f72106d;
            }

            @Nullable
            public final Key w() {
                return this.f72105c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(@NotNull List<? extends Value> data, @Nullable Key key, @Nullable Key key2, @androidx.annotation.g0(from = androidx.collection.g3.f12261h) int i10, @androidx.annotation.g0(from = androidx.collection.g3.f12261h) int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.f72103a = data;
                this.f72104b = key;
                this.f72105c = key2;
                this.f72106d = i10;
                this.f72107e = i11;
                if (i10 != Integer.MIN_VALUE && i10 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i11 != Integer.MIN_VALUE && i11 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public c(@NotNull List<? extends Value> data, @Nullable Key key, @Nullable Key key2) {
                this(data, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                Intrinsics.checkNotNullParameter(data, "data");
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<Function0<? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f72108a = new c();

        c() {
            super(1);
        }

        public final void c(@NotNull Function0<Unit> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            c(function0);
            return Unit.f312394a;
        }
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.b();
    }

    @androidx.annotation.l1
    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.invalidateCallbackTracker.a();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    @Nullable
    public abstract Key getRefreshKey(@NotNull j2<Key, Value> j2Var);

    public final void invalidate() {
        if (this.invalidateCallbackTracker.c()) {
            f2 f2Var = f2.f71875a;
            if (f2Var.a(3)) {
                f2Var.b(3, "Invalidated PagingSource " + this, null);
            }
        }
    }

    @Nullable
    public abstract Object load(@NotNull a<Key> aVar, @NotNull kotlin.coroutines.d<? super b<Key, Value>> dVar);

    public final void registerInvalidatedCallback(@NotNull Function0<Unit> onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.d(onInvalidatedCallback);
    }

    public final void unregisterInvalidatedCallback(@NotNull Function0<Unit> onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.e(onInvalidatedCallback);
    }
}
