package com.planner5d.library.services.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nObserversContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserversContainer.kt\ncom/planner5d/library/services/observable/ObserversContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1#2:38\n774#3:39\n865#3,2:40\n1863#3,2:42\n*S KotlinDebug\n*F\n+ 1 ObserversContainer.kt\ncom/planner5d/library/services/observable/ObserversContainer\n*L\n15#1:39\n15#1:40,2\n16#1:42,2\n*E\n"})
public final class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f224486a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a<K, V>> f224487b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final K f224488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function1<V, Unit> f224489b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull K key, @NotNull Function1<? super V, Unit> observer) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f224488a = key;
            this.f224489b = observer;
        }

        @NotNull
        public final K a() {
            return this.f224488a;
        }

        @NotNull
        public final Function1<V, Unit> b() {
            return this.f224489b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Function1 function1, a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.b(), function1);
    }

    public final void b(@NotNull K key, @NotNull Function1<? super V, Unit> observer) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f224486a) {
            try {
                this.f224487b.add(new a<>(key, observer));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@NotNull K key, @NotNull V updatedValue) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        synchronized (this.f224486a) {
            List<a<K, V>> list = this.f224487b;
            arrayList = null;
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.areEqual(((a) obj).a(), key)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b().invoke(updatedValue);
            }
        }
    }

    public final void d(@NotNull final Function1<? super V, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f224486a) {
            CollectionsKt.removeAll((List) this.f224487b, new Function1() { // from class: com.planner5d.library.services.observable.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(c.e(observer, (c.a) obj));
                }
            });
        }
    }
}
