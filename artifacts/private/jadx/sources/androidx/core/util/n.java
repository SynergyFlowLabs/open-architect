package androidx.core.util;

import android.util.LruCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    public static final class a extends l0 implements Function2<Object, Object, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48405a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj, Object obj2) {
            return 1;
        }
    }

    public static final class b extends l0 implements Function1<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48406a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return null;
        }
    }

    public static final class c extends l0 implements pj.o<Boolean, Object, Object, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f48407a = new c();

        public c() {
            super(4);
        }

        public final void c(boolean z10, Object obj, Object obj2, Object obj3) {
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
            c(bool.booleanValue(), obj, obj2, obj3);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static final class d<K, V> extends LruCache<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<K, V, Integer> f48408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<K, V> f48409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.o<Boolean, K, V, V, Unit> f48410c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i10, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, pj.o<? super Boolean, ? super K, ? super V, ? super V, Unit> oVar) {
            super(i10);
            this.f48408a = function2;
            this.f48409b = function1;
            this.f48410c = oVar;
        }

        @Override // android.util.LruCache
        protected V create(K k10) {
            return this.f48409b.invoke(k10);
        }

        @Override // android.util.LruCache
        protected void entryRemoved(boolean z10, K k10, V v10, V v11) {
            this.f48410c.invoke(Boolean.valueOf(z10), k10, v10, v11);
        }

        @Override // android.util.LruCache
        protected int sizeOf(K k10, V v10) {
            return this.f48408a.invoke(k10, v10).intValue();
        }
    }

    @NotNull
    public static final <K, V> LruCache<K, V> a(int i10, @NotNull Function2<? super K, ? super V, Integer> function2, @NotNull Function1<? super K, ? extends V> function1, @NotNull pj.o<? super Boolean, ? super K, ? super V, ? super V, Unit> oVar) {
        return new d(i10, function2, function1, oVar);
    }

    public static /* synthetic */ LruCache b(int i10, Function2 function2, Function1 function1, pj.o oVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function2 = a.f48405a;
        }
        if ((i11 & 4) != 0) {
            function1 = b.f48406a;
        }
        if ((i11 & 8) != 0) {
            oVar = c.f48407a;
        }
        return new d(i10, function2, function1, oVar);
    }
}
