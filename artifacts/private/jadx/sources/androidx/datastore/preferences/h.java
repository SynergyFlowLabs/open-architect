package androidx.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes2.dex */
@i(name = "SharedPreferencesMigrationKt")
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<String> f49897a = new LinkedHashSet();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/preferences/SharedPreferencesMigrationKt$getMigrationFunction$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n515#3:162\n500#3,6:163\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/preferences/SharedPreferencesMigrationKt$getMigrationFunction$1\n*L\n108#1:158\n108#1:159,3\n111#1:162\n111#1:163,6\n*E\n"})
    static final class a extends o implements n<androidx.datastore.migrations.c, androidx.datastore.preferences.core.f, kotlin.coroutines.d<? super androidx.datastore.preferences.core.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49900c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f49898a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            androidx.datastore.migrations.c cVar = (androidx.datastore.migrations.c) this.f49899b;
            androidx.datastore.preferences.core.f fVar = (androidx.datastore.preferences.core.f) this.f49900c;
            Set<androidx.datastore.preferences.core.f.a<?>> setKeySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.datastore.preferences.core.f.a) it.next()).a());
            }
            Map<String, Object> mapC = cVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapC.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            androidx.datastore.preferences.core.c cVarD = fVar.d();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    cVarD.o(androidx.datastore.preferences.core.i.a(str), value);
                } else if (value instanceof Float) {
                    cVarD.o(androidx.datastore.preferences.core.i.d(str), value);
                } else if (value instanceof Integer) {
                    cVarD.o(androidx.datastore.preferences.core.i.e(str), value);
                } else if (value instanceof Long) {
                    cVarD.o(androidx.datastore.preferences.core.i.f(str), value);
                } else if (value instanceof String) {
                    cVarD.o(androidx.datastore.preferences.core.i.g(str), value);
                } else if (value instanceof Set) {
                    androidx.datastore.preferences.core.f.a<Set<String>> aVarH = androidx.datastore.preferences.core.i.h(str);
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    cVarD.o(aVarH, (Set) value);
                }
            }
            return cVarD.e();
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull androidx.datastore.migrations.c cVar, @NotNull androidx.datastore.preferences.core.f fVar, @Nullable kotlin.coroutines.d<? super androidx.datastore.preferences.core.f> dVar) {
            a aVar = new a(dVar);
            aVar.f49899b = cVar;
            aVar.f49900c = fVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/preferences/SharedPreferencesMigrationKt$getShouldRunMigration$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n1747#2,3:162\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/preferences/SharedPreferencesMigrationKt$getShouldRunMigration$1\n*L\n147#1:158\n147#1:159,3\n152#1:162,3\n*E\n"})
    static final class b extends o implements Function2<androidx.datastore.preferences.core.f, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set<String> f49903c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f49903c = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f49903c, dVar);
            bVar.f49902b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f49901a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Set<androidx.datastore.preferences.core.f.a<?>> setKeySet = ((androidx.datastore.preferences.core.f) this.f49902b).a().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.datastore.preferences.core.f.a) it.next()).a());
            }
            boolean z10 = true;
            if (this.f49903c != h.g()) {
                Set<String> set = this.f49903c;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                        }
                    }
                    z10 = false;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull androidx.datastore.preferences.core.f fVar, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @j
    @NotNull
    public static final androidx.datastore.migrations.a<androidx.datastore.preferences.core.f> a(@NotNull Context context, @NotNull String sharedPreferencesName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        return e(context, sharedPreferencesName, null, 4, null);
    }

    @j
    @NotNull
    public static final androidx.datastore.migrations.a<androidx.datastore.preferences.core.f> b(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f49897a) {
            return new androidx.datastore.migrations.a<>(context, sharedPreferencesName, keysToMigrate, i(keysToMigrate), h());
        }
        return new androidx.datastore.migrations.a<>(context, sharedPreferencesName, null, i(keysToMigrate), h(), 4, null);
    }

    @j
    @NotNull
    public static final androidx.datastore.migrations.a<androidx.datastore.preferences.core.f> c(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences) {
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        return f(produceSharedPreferences, null, 2, null);
    }

    @j
    @NotNull
    public static final androidx.datastore.migrations.a<androidx.datastore.preferences.core.f> d(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate) {
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f49897a) {
            return new androidx.datastore.migrations.a<>(produceSharedPreferences, keysToMigrate, i(keysToMigrate), h());
        }
        return new androidx.datastore.migrations.a<>(produceSharedPreferences, (Set) null, i(keysToMigrate), h(), 2, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.datastore.migrations.a e(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f49897a;
        }
        return b(context, str, set);
    }

    public static /* synthetic */ androidx.datastore.migrations.a f(Function0 function0, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = f49897a;
        }
        return d(function0, set);
    }

    @NotNull
    public static final Set<String> g() {
        return f49897a;
    }

    private static final n<androidx.datastore.migrations.c, androidx.datastore.preferences.core.f, kotlin.coroutines.d<? super androidx.datastore.preferences.core.f>, Object> h() {
        return new a(null);
    }

    private static final Function2<androidx.datastore.preferences.core.f, kotlin.coroutines.d<? super Boolean>, Object> i(Set<String> set) {
        return new b(set, null);
    }
}
