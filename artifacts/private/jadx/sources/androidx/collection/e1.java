package androidx.collection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f12192a = 2147483647L;

    public static final class a extends kotlin.jvm.internal.l0 implements Function2<Object, Object, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12193a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    public static final class b extends kotlin.jvm.internal.l0 implements Function1<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12194a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    public static final class c extends kotlin.jvm.internal.l0 implements pj.o<Boolean, Object, Object, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12195a = new c();

        public c() {
            super(4);
        }

        public final void c(boolean z10, Object obj, Object obj2, Object obj3) {
            Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 2>");
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
            c(bool.booleanValue(), obj, obj2, obj3);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static final class d<K, V> extends d1<K, V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<K, V, Integer> f12196j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<K, V> f12197k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ pj.o<Boolean, K, V, V, Unit> f12198l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i10, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, pj.o<? super Boolean, ? super K, ? super V, ? super V, Unit> oVar) {
            super(i10);
            this.f12196j = function2;
            this.f12197k = function1;
            this.f12198l = oVar;
        }

        @Override // androidx.collection.d1
        protected V a(K key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.f12197k.invoke(key);
        }

        @Override // androidx.collection.d1
        protected void c(boolean z10, K key, V oldValue, V v10) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            this.f12198l.invoke(Boolean.valueOf(z10), key, oldValue, v10);
        }

        @Override // androidx.collection.d1
        protected int p(K key, V value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this.f12196j.invoke(key, value).intValue();
        }
    }

    @NotNull
    public static final <K, V> d1<K, V> a(int i10, @NotNull Function2<? super K, ? super V, Integer> sizeOf, @NotNull Function1<? super K, ? extends V> create, @NotNull pj.o<? super Boolean, ? super K, ? super V, ? super V, Unit> onEntryRemoved) {
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new d(i10, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ d1 b(int i10, Function2 sizeOf, Function1 create, pj.o onEntryRemoved, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            sizeOf = a.f12193a;
        }
        if ((i11 & 4) != 0) {
            create = b.f12194a;
        }
        if ((i11 & 8) != 0) {
            onEntryRemoved = c.f12195a;
        }
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new d(i10, sizeOf, create, onEntryRemoved);
    }
}
