package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.c0;
import androidx.lifecycle.j0;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,422:1\n123#2,2:423\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n*L\n380#1:423,2\n*E\n"})
public abstract class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final b f10022h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f10023i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f10024j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f10025k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f10026l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f10027m = "ActivityResultRegistry";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f10028n = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Integer, String> f10029a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f10030b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, c> f10031c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<String> f10032d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final transient Map<String, a<?>> f10033e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f10034f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Bundle f10035g = new Bundle();

    private static final class a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.activity.result.a<O> f10036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final g.a<?, O> f10037b;

        public a(@NotNull androidx.activity.result.a<O> callback, @NotNull g.a<?, O> contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f10036a = callback;
            this.f10037b = contract;
        }

        @NotNull
        public final androidx.activity.result.a<O> a() {
            return this.f10036a;
        }

        @NotNull
        public final g.a<?, O> b() {
            return this.f10037b;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1855#2,2:423\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n*L\n402#1:423,2\n*E\n"})
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c0 f10038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<j0> f10039b;

        public c(@NotNull c0 lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f10038a = lifecycle;
            this.f10039b = new ArrayList();
        }

        public final void a(@NotNull j0 observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f10038a.c(observer);
            this.f10039b.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.f10039b.iterator();
            while (it.hasNext()) {
                this.f10038a.g((j0) it.next());
            }
            this.f10039b.clear();
        }

        @NotNull
        public final c0 c() {
            return this.f10038a;
        }
    }

    static final class d extends l0 implements Function0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f10040a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(kotlin.random.f.f312895a.m(2147418112) + 65536);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public static final class e<I> extends h<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.a<I, O> f10043c;

        e(String str, g.a<I, O> aVar) {
            this.f10042b = str;
            this.f10043c = aVar;
        }

        @Override // androidx.activity.result.h
        public g.a<I, ?> a() {
            return (g.a<I, ?>) this.f10043c;
        }

        @Override // androidx.activity.result.h
        public void c(I i10, androidx.core.app.e eVar) throws Exception {
            Object obj = k.this.f10030b.get(this.f10042b);
            Object obj2 = this.f10043c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                k.this.f10032d.add(this.f10042b);
                try {
                    k.this.i(iIntValue, this.f10043c, i10, eVar);
                    return;
                } catch (Exception e10) {
                    k.this.f10032d.remove(this.f10042b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // androidx.activity.result.h
        public void d() {
            k.this.p(this.f10042b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public static final class f<I> extends h<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.a<I, O> f10046c;

        f(String str, g.a<I, O> aVar) {
            this.f10045b = str;
            this.f10046c = aVar;
        }

        @Override // androidx.activity.result.h
        public g.a<I, ?> a() {
            return (g.a<I, ?>) this.f10046c;
        }

        @Override // androidx.activity.result.h
        public void c(I i10, androidx.core.app.e eVar) throws Exception {
            Object obj = k.this.f10030b.get(this.f10045b);
            Object obj2 = this.f10046c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                k.this.f10032d.add(this.f10045b);
                try {
                    k.this.i(iIntValue, this.f10046c, i10, eVar);
                    return;
                } catch (Exception e10) {
                    k.this.f10032d.remove(this.f10045b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // androidx.activity.result.h
        public void d() {
            k.this.p(this.f10045b);
        }
    }

    private final void d(int i10, String str) {
        this.f10029a.put(Integer.valueOf(i10), str);
        this.f10030b.put(str, Integer.valueOf(i10));
    }

    private final <O> void g(String str, int i10, Intent intent, a<O> aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f10032d.contains(str)) {
            this.f10034f.remove(str);
            this.f10035g.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            aVar.a().a(aVar.b().parseResult(i10, intent));
            this.f10032d.remove(str);
        }
    }

    private final int h() {
        for (Number number : o.m(d.f10040a)) {
            if (!this.f10029a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(k kVar, String str, androidx.activity.result.a aVar, g.a aVar2, o0 o0Var, c0.a event) {
        Intrinsics.checkNotNullParameter(o0Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (c0.a.ON_START != event) {
            if (c0.a.ON_STOP == event) {
                kVar.f10033e.remove(str);
                return;
            } else {
                if (c0.a.ON_DESTROY == event) {
                    kVar.p(str);
                    return;
                }
                return;
            }
        }
        kVar.f10033e.put(str, new a<>(aVar, aVar2));
        if (kVar.f10034f.containsKey(str)) {
            Object obj = kVar.f10034f.get(str);
            kVar.f10034f.remove(str);
            aVar.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) androidx.core.os.d.b(kVar.f10035g, str, ActivityResult.class);
        if (activityResult != null) {
            kVar.f10035g.remove(str);
            aVar.a(aVar2.parseResult(activityResult.b(), activityResult.a()));
        }
    }

    private final void o(String str) {
        if (this.f10030b.get(str) != null) {
            return;
        }
        d(h(), str);
    }

    @androidx.annotation.l0
    public final boolean e(int i10, int i11, @Nullable Intent intent) {
        String str = this.f10029a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, this.f10033e.get(str));
        return true;
    }

    @androidx.annotation.l0
    public final <O> boolean f(int i10, O o10) {
        String str = this.f10029a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.f10033e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f10035g.remove(str);
            this.f10034f.put(str, o10);
            return true;
        }
        androidx.activity.result.a<?> aVarA = aVar.a();
        Intrinsics.checkNotNull(aVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f10032d.remove(str)) {
            return true;
        }
        aVarA.a(o10);
        return true;
    }

    @androidx.annotation.l0
    public abstract <I, O> void i(int i10, @NotNull g.a<I, O> aVar, I i11, @Nullable androidx.core.app.e eVar);

    public final void j(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f10023i);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f10024j);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(f10025k);
        if (stringArrayList2 != null) {
            this.f10032d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle(f10026l);
        if (bundle2 != null) {
            this.f10035g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f10030b.containsKey(str)) {
                Integer numRemove = this.f10030b.remove(str);
                if (!this.f10035g.containsKey(str)) {
                    r1.k(this.f10029a).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList(f10023i, new ArrayList<>(this.f10030b.values()));
        outState.putStringArrayList(f10024j, new ArrayList<>(this.f10030b.keySet()));
        outState.putStringArrayList(f10025k, new ArrayList<>(this.f10032d));
        outState.putBundle(f10026l, new Bundle(this.f10035g));
    }

    @NotNull
    public final <I, O> h<I> l(@NotNull final String key, @NotNull o0 lifecycleOwner, @NotNull final g.a<I, O> contract, @NotNull final androidx.activity.result.a<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        c0 lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.d().n(c0.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.d() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = this.f10031c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new j0() { // from class: androidx.activity.result.j
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var, c0.a aVar) {
                k.n(this.f10018a, key, callback, contract, o0Var, aVar);
            }
        });
        this.f10031c.put(key, cVar);
        return new e(key, contract);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <I, O> h<I> m(@NotNull String key, @NotNull g.a<I, O> contract, @NotNull androidx.activity.result.a<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o(key);
        this.f10033e.put(key, new a<>(callback, contract));
        if (this.f10034f.containsKey(key)) {
            Object obj = this.f10034f.get(key);
            this.f10034f.remove(key);
            callback.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) androidx.core.os.d.b(this.f10035g, key, ActivityResult.class);
        if (activityResult != null) {
            this.f10035g.remove(key);
            callback.a(contract.parseResult(activityResult.b(), activityResult.a()));
        }
        return new f(key, contract);
    }

    @androidx.annotation.l0
    public final void p(@NotNull String key) {
        Integer numRemove;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f10032d.contains(key) && (numRemove = this.f10030b.remove(key)) != null) {
            this.f10029a.remove(numRemove);
        }
        this.f10033e.remove(key);
        if (this.f10034f.containsKey(key)) {
            Objects.toString(this.f10034f.get(key));
            this.f10034f.remove(key);
        }
        if (this.f10035g.containsKey(key)) {
            Objects.toString((ActivityResult) androidx.core.os.d.b(this.f10035g, key, ActivityResult.class));
            this.f10035g.remove(key);
        }
        c cVar = this.f10031c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f10031c.remove(key);
        }
    }
}
