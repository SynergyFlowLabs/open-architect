package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.c0;
import androidx.lifecycle.j0;
import androidx.lifecycle.o0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRecreator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recreator.android.kt\nandroidx/savedstate/Recreator\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,98:1\n90#2:99\n*S KotlinDebug\n*F\n+ 1 Recreator.android.kt\nandroidx/savedstate/Recreator\n*L\n34#1:99\n*E\n"})
public final class b implements j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f75137b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f75138c = "classes_to_restore";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f75139d = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f75140a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.savedstate.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nRecreator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recreator.android.kt\nandroidx/savedstate/Recreator$SavedStateProvider\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,98:1\n27#2:99\n46#2:100\n32#2,4:101\n31#2,7:111\n126#3:105\n153#3,3:106\n37#4,2:109\n1#5:118\n106#6:119\n*S KotlinDebug\n*F\n+ 1 Recreator.android.kt\nandroidx/savedstate/Recreator$SavedStateProvider\n*L\n84#1:99\n84#1:100\n84#1:101,4\n84#1:111,7\n84#1:105\n84#1:106,3\n84#1:109,2\n84#1:118\n84#1:119\n*E\n"})
    public static final class C0748b implements j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Set<String> f75141a;

        public C0748b(@NotNull j registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f75141a = new LinkedHashSet();
            registry.d(b.f75139d, this);
        }

        @Override // androidx.savedstate.j.b
        @NotNull
        public Bundle a() {
            Pair[] pairArr;
            Map mapEmptyMap = MapsKt.emptyMap();
            if (mapEmptyMap.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                for (Map.Entry entry : mapEmptyMap.entrySet()) {
                    arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            n.L(n.c(bundleB), b.f75138c, CollectionsKt.toList(this.f75141a));
            return bundleB;
        }

        public final void b(@NotNull String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f75141a.add(className);
        }
    }

    public b(@NotNull m owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f75140a = owner;
    }

    private final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(j.a.class);
            Intrinsics.checkNotNull(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNull(objNewInstance);
                    ((j.a) objNewInstance).a(this.f75140a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull o0 source, @NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != c0.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().g(this);
        Bundle bundleA = this.f75140a.getSavedStateRegistry().a(f75139d);
        if (bundleA != null) {
            List<String> listY0 = f.y0(f.b(bundleA), f75138c);
            if (listY0 == null) {
                throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            Iterator<String> it = listY0.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}
