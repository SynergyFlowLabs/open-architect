package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewModelProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.android.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 CreationExtras.kt\nandroidx/lifecycle/viewmodel/CreationExtras$Companion\n*L\n1#1,356:1\n68#2:357\n*S KotlinDebug\n*F\n+ 1 ViewModelProvider.android.kt\nandroidx/lifecycle/ViewModelProvider\n*L\n353#1:357\n*E\n"})
public class j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f52401b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v2.a.c<String> f52402c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v2.j f52403a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ j2 c(b bVar, l2 l2Var, c cVar, v2.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = w2.d.f385876b;
            }
            if ((i10 & 4) != 0) {
                aVar = v2.a.b.f381327c;
            }
            return bVar.a(l2Var, cVar, aVar);
        }

        public static /* synthetic */ j2 d(b bVar, m2 m2Var, c cVar, v2.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = w2.j.f385882a.e(m2Var);
            }
            if ((i10 & 4) != 0) {
                aVar = w2.j.f385882a.d(m2Var);
            }
            return bVar.b(m2Var, cVar, aVar);
        }

        @oj.n
        @NotNull
        public final j2 a(@NotNull l2 store, @NotNull c factory, @NotNull v2.a extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new j2(store, factory, extras);
        }

        @oj.n
        @NotNull
        public final j2 b(@NotNull m2 owner, @NotNull c factory, @NotNull v2.a extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new j2(owner.getViewModelStore(), factory, extras);
        }

        private b() {
        }
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f52408a = a.f52409a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f52409a = new a();

            private a() {
            }

            @oj.n
            @NotNull
            public final c a(@NotNull v2.i<?>... initializers) {
                Intrinsics.checkNotNullParameter(initializers, "initializers");
                return w2.j.f385882a.b((v2.i[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @oj.n
        @NotNull
        static c c(@NotNull v2.i<?>... iVarArr) {
            return f52408a.a(iVarArr);
        }

        @NotNull
        default <T extends f2> T a(@NotNull kotlin.reflect.d<T> modelClass, @NotNull v2.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) b(oj.b.e(modelClass), extras);
        }

        @NotNull
        default <T extends f2> T b(@NotNull Class<T> modelClass, @NotNull v2.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        @NotNull
        default <T extends f2> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) w2.j.f385882a.g();
        }
    }

    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private static d f52411c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f52410b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final v2.a.c<String> f52412d = j2.f52402c;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            public static /* synthetic */ void b() {
            }

            @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
            @NotNull
            public final d a() {
                if (d.f52411c == null) {
                    d.f52411c = new d();
                }
                d dVar = d.f52411c;
                Intrinsics.checkNotNull(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public static final d f() {
            return f52410b.a();
        }

        @Override // androidx.lifecycle.j2.c
        @NotNull
        public <T extends f2> T a(@NotNull kotlin.reflect.d<T> modelClass, @NotNull v2.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) b(oj.b.e(modelClass), extras);
        }

        @Override // androidx.lifecycle.j2.c
        @NotNull
        public <T extends f2> T b(@NotNull Class<T> modelClass, @NotNull v2.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.j2.c
        @NotNull
        public <T extends f2> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) w2.e.f385877a.a(modelClass);
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static class e {
        public void d(@NotNull f2 viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    public static final class f implements v2.a.c<String> {
    }

    static {
        v2.a.C2518a c2518a = v2.a.f381325b;
        f52402c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public j2(@NotNull l2 store, @NotNull c factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    @oj.n
    @NotNull
    public static final j2 a(@NotNull l2 l2Var, @NotNull c cVar, @NotNull v2.a aVar) {
        return f52401b.a(l2Var, cVar, aVar);
    }

    @oj.n
    @NotNull
    public static final j2 b(@NotNull m2 m2Var, @NotNull c cVar, @NotNull v2.a aVar) {
        return f52401b.b(m2Var, cVar, aVar);
    }

    @NotNull
    public <T extends f2> T c(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) f(oj.b.i(modelClass));
    }

    @NotNull
    public <T extends f2> T d(@NotNull String key, @NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.f52403a.d(oj.b.i(modelClass), key);
    }

    @androidx.annotation.l0
    @NotNull
    public final <T extends f2> T e(@NotNull String key, @NotNull kotlin.reflect.d<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.f52403a.d(modelClass, key);
    }

    @androidx.annotation.l0
    @NotNull
    public final <T extends f2> T f(@NotNull kotlin.reflect.d<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) v2.j.e(this.f52403a, modelClass, null, 2, null);
    }

    @SourceDebugExtension({"SMAP\nViewModelProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.android.kt\nandroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory\n+ 2 CreationExtras.kt\nandroidx/lifecycle/viewmodel/CreationExtras$Companion\n*L\n1#1,356:1\n68#2:357\n*S KotlinDebug\n*F\n+ 1 ViewModelProvider.android.kt\nandroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory\n*L\n332#1:357\n*E\n"})
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final C0480a f52404f = new C0480a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private static a f52405g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final v2.a.c<Application> f52406h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Application f52407e;

        /* JADX INFO: renamed from: androidx.lifecycle.j2$a$a, reason: collision with other inner class name */
        public static final class C0480a {
            public /* synthetic */ C0480a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            @NotNull
            public final a a(@NotNull Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f52405g == null) {
                    a.f52405g = new a(application);
                }
                a aVar = a.f52405g;
                Intrinsics.checkNotNull(aVar);
                return aVar;
            }

            private C0480a() {
            }
        }

        public static final class b implements v2.a.c<Application> {
        }

        static {
            v2.a.C2518a c2518a = v2.a.f381325b;
            f52406h = new b();
        }

        private a(Application application, int i10) {
            this.f52407e = application;
        }

        private final <T extends f2> T i(Class<T> cls, Application application) {
            if (!androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNull(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @oj.n
        @NotNull
        public static final a j(@NotNull Application application) {
            return f52404f.a(application);
        }

        @Override // androidx.lifecycle.j2.d, androidx.lifecycle.j2.c
        @NotNull
        public <T extends f2> T b(@NotNull Class<T> modelClass, @NotNull v2.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f52407e != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.a(f52406h);
            if (application != null) {
                return (T) i(modelClass, application);
            }
            if (androidx.lifecycle.b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        @Override // androidx.lifecycle.j2.d, androidx.lifecycle.j2.c
        @NotNull
        public <T extends f2> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f52407e;
            if (application != null) {
                return (T) i(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    private j2(v2.j jVar) {
        this.f52403a = jVar;
    }

    public /* synthetic */ j2(l2 l2Var, c cVar, v2.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l2Var, cVar, (i10 & 4) != 0 ? v2.a.b.f381327c : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public j2(@NotNull l2 store, @NotNull c factory, @NotNull v2.a defaultCreationExtras) {
        this(new v2.j(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j2(@NotNull m2 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        l2 viewModelStore = owner.getViewModelStore();
        w2.j jVar = w2.j.f385882a;
        this(viewModelStore, jVar.e(owner), jVar.d(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j2(@NotNull m2 owner, @NotNull c factory) {
        this(owner.getViewModelStore(), factory, w2.j.f385882a.d(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
