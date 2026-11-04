package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.datastore.core.j;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesMigration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1747#2,3:324\n1855#2,2:327\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesMigration\n*L\n158#1:324,3\n178#1:327,2\n*E\n"})
public final class a<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<T, kotlin.coroutines.d<? super Boolean>, Object> f49832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n<androidx.datastore.migrations.c, T, kotlin.coroutines.d<? super T>, Object> f49833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Context f49834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f49835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f49836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Set<String> f49837f;

    /* JADX INFO: renamed from: androidx.datastore.migrations.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C0439a extends o implements Function2<T, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49838a;

        C0439a(kotlin.coroutines.d<? super C0439a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new C0439a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f49838a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C0439a) create(t10, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends o implements Function2<T, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49839a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f49839a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(t10, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends o implements Function2<T, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49840a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f49840a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
            return ((c) create(t10, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class d extends l0 implements Function0<SharedPreferences> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49842b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str) {
            super(0);
            this.f49841a = context;
            this.f49842b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f49841a.getSharedPreferences(this.f49842b, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    @w0(24)
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f49843a = new e();

        private e() {
        }

        @oj.n
        @u
        public static final boolean a(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", i = {0}, l = {151}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f49846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f49847d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a<T> aVar, kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
            this.f49846c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49845b = obj;
            this.f49847d |= Integer.MIN_VALUE;
            return this.f49846c.a(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull n<? super androidx.datastore.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    private final void d(Context context, String str) {
        e.a(context, str);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.f49836e.getValue();
    }

    private final File f(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File g(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str + ".xml");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.datastore.core.j
    @Nullable
    public Object a(T t10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f49847d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f49847d = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, dVar);
            }
        } else {
            fVar = new f(this, dVar);
        }
        Object objInvoke = fVar.f49845b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f49847d;
        boolean z10 = true;
        if (i11 == 0) {
            ResultKt.m(objInvoke);
            Function2<T, kotlin.coroutines.d<? super Boolean>, Object> function2 = this.f49832a;
            fVar.f49844a = this;
            fVar.f49847d = 1;
            objInvoke = function2.invoke(t10, fVar);
            if (objInvoke == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (a) fVar.f49844a;
            ResultKt.m(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        Set<String> set = this.f49837f;
        if (set == null) {
            Map<String, ?> all = this.e().getAll();
            Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferencesE = this.e();
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesE.contains((String) it.next())) {
                    }
                }
            }
            z10 = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    @Override // androidx.datastore.core.j
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set<String> set = this.f49837f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f49834c) != null && (str = this.f49835d) != null) {
            d(context, str);
        }
        Set<String> set2 = this.f49837f;
        if (set2 != null) {
            set2.clear();
        }
        return Unit.f312394a;
    }

    @Override // androidx.datastore.core.j
    @Nullable
    public Object c(T t10, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return this.f49833b.invoke(new androidx.datastore.migrations.c(e(), this.f49837f), t10, dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull n<? super androidx.datastore.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull n<? super androidx.datastore.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (Function2) null, migrate, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull n<? super androidx.datastore.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (Function2) null, migrate, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        int i10 = 5 & 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, n<? super androidx.datastore.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar, Context context, String str) {
        this.f49832a = function2;
        this.f49833b = nVar;
        this.f49834c = context;
        this.f49835d = str;
        this.f49836e = g0.c(function0);
        this.f49837f = set == androidx.datastore.migrations.b.a() ? null : CollectionsKt.toMutableSet(set);
    }

    /* synthetic */ a(Function0 function0, Set set, Function2 function2, n nVar, Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<? extends SharedPreferences>) function0, (Set<String>) set, (i10 & 4) != 0 ? new C0439a(null) : function2, nVar, context, str);
    }

    public /* synthetic */ a(Function0 function0, Set set, Function2 function2, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<? extends SharedPreferences>) function0, (Set<String>) ((i10 & 2) != 0 ? androidx.datastore.migrations.b.a() : set), (i10 & 4) != 0 ? new b(null) : function2, nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull n<? super androidx.datastore.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    public /* synthetic */ a(Context context, String str, Set set, Function2 function2, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? androidx.datastore.migrations.b.a() : set, (i10 & 8) != 0 ? new c(null) : function2, nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull n<? super androidx.datastore.migrations.c, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> migrate) {
        this(new d(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
