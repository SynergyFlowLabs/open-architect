package com.google.firebase.datastorage;

import android.content.Context;
import androidx.compose.runtime.m0;
import androidx.datastore.core.l;
import androidx.datastore.preferences.core.f;
import androidx.datastore.preferences.core.j;
import androidx.datastore.preferences.h;
import com.rabbitmq.client.impl.k;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.j1;
import kotlin.reflect.o;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f121974f = {j1.v(new g1(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f121975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f121976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ThreadLocal<Boolean> f121977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.e f121978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final l<f> f121979e;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", f = "JavaDataStorage.kt", i = {}, l = {k.b.p.f265340a}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f121980a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a<T> f121982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f.a<T> aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f121982c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(this.f121982c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f121980a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i data = b.this.f121979e.getData();
                this.f121980a = 1;
                obj = kotlinx.coroutines.flow.k.y0(data, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            f fVar = (f) obj;
            return kotlin.coroutines.jvm.internal.b.a(fVar != null ? fVar.b(this.f121982c) : false);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", i = {}, l = {m0.f36245r}, m = "invokeSuspend", n = {}, s = {})
    static final class C1147b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f121983a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.datastore.preferences.core.c, Unit> f121985c;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.b$b$a */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.datastore.preferences.core.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f121986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f121987b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<androidx.datastore.preferences.core.c, Unit> f121988c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super androidx.datastore.preferences.core.c, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f121988c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f121988c, dVar);
                aVar.f121987b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f121986a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f121988c.invoke((androidx.datastore.preferences.core.c) this.f121987b);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.datastore.preferences.core.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1147b(Function1<? super androidx.datastore.preferences.core.c, Unit> function1, kotlin.coroutines.d<? super C1147b> dVar) {
            super(2, dVar);
            this.f121985c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C1147b(this.f121985c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f121983a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (Intrinsics.areEqual(b.this.f121977c.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    b.this.f121977c.set(kotlin.coroutines.jvm.internal.b.a(true));
                    l lVar = b.this.f121979e;
                    a aVar = new a(this.f121985c, null);
                    this.f121983a = 1;
                    obj = j.a(lVar, aVar, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                f fVar = (f) obj;
                b.this.f121977c.set(kotlin.coroutines.jvm.internal.b.a(false));
                return fVar;
            } catch (Throwable th2) {
                b.this.f121977c.set(kotlin.coroutines.jvm.internal.b.a(false));
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super f> dVar) {
            return ((C1147b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", i = {}, l = {androidx.media2.widget.f.i.f59799s0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Map<f.a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f121989a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map<f.a<?>, Object> mapA;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f121989a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i data = b.this.f121979e.getData();
                this.f121989a = 1;
                obj = kotlinx.coroutines.flow.k.y0(data, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            f fVar = (f) obj;
            if (fVar != null && (mapA = fVar.a()) != null) {
                return mapA;
            }
            return MapsKt.emptyMap();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Map<f.a<?>, ? extends Object>> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
    static final class d<T> extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f121991a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a<T> f121993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f121994d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.a<T> aVar, T t10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f121993c = aVar;
            this.f121994d = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new d(this.f121993c, this.f121994d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f121991a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i<T> data = b.this.f121979e.getData();
                this.f121991a = 1;
                obj = kotlinx.coroutines.flow.k.y0(data, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (objC = fVar.c(this.f121993c)) == null) ? this.f121994d : objC;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f121995a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a<T> f121997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f121998d;

        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.datastore.preferences.core.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f121999a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f122000b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a<T> f122001c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f122002d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a<T> aVar, T t10, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f122001c = aVar;
                this.f122002d = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f122001c, this.f122002d, dVar);
                aVar.f122000b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f121999a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((androidx.datastore.preferences.core.c) this.f122000b).o(this.f122001c, this.f122002d);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.datastore.preferences.core.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f.a<T> aVar, T t10, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f121997c = aVar;
            this.f121998d = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new e(this.f121997c, this.f121998d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f121995a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            l lVar = b.this.f121979e;
            a aVar = new a(this.f121997c, this.f121998d, null);
            this.f121995a = 1;
            Object objA = j.a(lVar, aVar, this);
            return objA == objL ? objL : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super f> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public b(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f121975a = context;
        this.f121976b = name;
        this.f121977c = new ThreadLocal<>();
        this.f121978d = androidx.datastore.preferences.a.b(name, null, new Function1() { // from class: com.google.firebase.datastorage.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.e(this.f121973a, (Context) obj);
            }
        }, null, 10, null);
        this.f121979e = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(b bVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf(h.e(it, bVar.f121976b, null, 4, null));
    }

    private final l<f> i(Context context) {
        return (l) this.f121978d.getValue(context, f121974f[0]);
    }

    public final <T> boolean d(@NotNull f.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Boolean) kotlinx.coroutines.j.b(null, new a(key, null), 1, null)).booleanValue();
    }

    @NotNull
    public final f f(@NotNull Function1<? super androidx.datastore.preferences.core.c, Unit> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return (f) kotlinx.coroutines.j.b(null, new C1147b(transform, null), 1, null);
    }

    @NotNull
    public final Map<f.a<?>, Object> g() {
        return (Map) kotlinx.coroutines.j.b(null, new c(null), 1, null);
    }

    @NotNull
    public final Context h() {
        return this.f121975a;
    }

    @NotNull
    public final String j() {
        return this.f121976b;
    }

    public final <T> T k(@NotNull f.a<T> key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) kotlinx.coroutines.j.b(null, new d(key, t10, null), 1, null);
    }

    @NotNull
    public final <T> f l(@NotNull f.a<T> key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (f) kotlinx.coroutines.j.b(null, new e(key, t10, null), 1, null);
    }
}
