package androidx.savedstate.internal;

import android.os.Bundle;
import androidx.annotation.l0;
import androidx.lifecycle.c0;
import androidx.lifecycle.j0;
import androidx.lifecycle.o0;
import androidx.savedstate.j;
import androidx.savedstate.m;
import androidx.savedstate.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedStateRegistryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistryImpl.kt\nandroidx/savedstate/internal/SavedStateRegistryImpl\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SynchronizedObject.kt\nandroidx/savedstate/internal/SynchronizedObjectKt\n+ 4 SynchronizedObject.jvm.kt\nandroidx/savedstate/internal/SynchronizedObject_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,154:1\n90#2:155\n106#2:156\n90#2:157\n90#2:165\n106#2:186\n90#2:189\n106#2:190\n41#3:158\n41#3:160\n41#3:162\n41#3:187\n23#4:159\n23#4:161\n23#4:163\n23#4:188\n1#5:164\n1#5:185\n27#6:166\n46#6:167\n32#6,4:168\n31#6,7:178\n126#7:172\n153#7,3:173\n37#8,2:176\n*S KotlinDebug\n*F\n+ 1 SavedStateRegistryImpl.kt\nandroidx/savedstate/internal/SavedStateRegistryImpl\n*L\n55#1:155\n56#1:156\n57#1:157\n121#1:165\n135#1:186\n144#1:189\n145#1:190\n66#1:158\n75#1:160\n84#1:162\n137#1:187\n66#1:159\n75#1:161\n84#1:163\n137#1:188\n135#1:185\n135#1:166\n135#1:167\n135#1:168,4\n135#1:178,7\n135#1:172\n135#1:173,3\n135#1:176,2\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f75146i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f75147j = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f75148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f75149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f75150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, j.b> f75151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f75152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Bundle f75153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f75154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f75155h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(@NotNull m owner, @NotNull Function0<Unit> onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.f75148a = owner;
        this.f75149b = onAttach;
        this.f75150c = new e();
        this.f75151d = new LinkedHashMap();
        this.f75155h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(d dVar, o0 o0Var, c0.a event) {
        Intrinsics.checkNotNullParameter(o0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == c0.a.ON_START) {
            dVar.f75155h = true;
        } else if (event == c0.a.ON_STOP) {
            dVar.f75155h = false;
        }
    }

    @l0
    @Nullable
    public final Bundle e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f75154g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f75153f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        Bundle bundleG0 = androidx.savedstate.f.c(bundleB, key) ? androidx.savedstate.f.g0(bundleB, key) : null;
        n.M(n.c(bundle), key);
        if (androidx.savedstate.f.B0(androidx.savedstate.f.b(bundle))) {
            this.f75153f = null;
        }
        return bundleG0;
    }

    @NotNull
    public final Function0<Unit> f() {
        return this.f75149b;
    }

    @Nullable
    public final j.b g(@NotNull String key) {
        j.b bVar;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f75150c) {
            try {
                Iterator it = this.f75151d.entrySet().iterator();
                do {
                    bVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    j.b bVar2 = (j.b) entry.getValue();
                    if (Intrinsics.areEqual(str, key)) {
                        bVar = bVar2;
                    }
                } while (bVar == null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final boolean h() {
        return this.f75155h;
    }

    @l0
    public final boolean i() {
        return this.f75154g;
    }

    @l0
    public final void j() {
        if (this.f75148a.getLifecycle().d() != c0.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f75152e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f75149b.invoke();
        this.f75148a.getLifecycle().c(new j0() { // from class: androidx.savedstate.internal.b
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var, c0.a aVar) {
                d.k(this.f75145a, o0Var, aVar);
            }
        });
        this.f75152e = true;
    }

    @l0
    public final void l(@Nullable Bundle bundle) {
        if (!this.f75152e) {
            j();
        }
        if (this.f75148a.getLifecycle().d().n(c0.b.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f75148a.getLifecycle().d()).toString());
        }
        if (this.f75154g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleG0 = null;
        if (bundle != null) {
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (androidx.savedstate.f.c(bundleB, f75147j)) {
                bundleG0 = androidx.savedstate.f.g0(bundleB, f75147j);
            }
        }
        this.f75153f = bundleG0;
        this.f75154g = true;
    }

    @l0
    public final void m(@NotNull Bundle outBundle) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
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
        Bundle bundleC = n.c(bundleB);
        Bundle bundle = this.f75153f;
        if (bundle != null) {
            n.g(bundleC, bundle);
        }
        synchronized (this.f75150c) {
            try {
                for (Map.Entry entry2 : this.f75151d.entrySet()) {
                    n.D(bundleC, (String) entry2.getKey(), ((j.b) entry2.getValue()).a());
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!androidx.savedstate.f.B0(androidx.savedstate.f.b(bundleB))) {
            n.D(n.c(outBundle), f75147j, bundleB);
        }
    }

    @l0
    public final void n(@NotNull String key, @NotNull j.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this.f75150c) {
            try {
                if (this.f75151d.containsKey(key)) {
                    throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                }
                this.f75151d.put(key, provider);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(boolean z10) {
        this.f75155h = z10;
    }

    @l0
    public final void p(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f75150c) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ d(m mVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, (i10 & 2) != 0 ? new Function0() { // from class: androidx.savedstate.internal.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.c();
            }
        } : function0);
    }
}
