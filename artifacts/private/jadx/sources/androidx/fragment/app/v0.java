package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n515#2:124\n500#2,6:125\n125#3:131\n152#3,3:132\n125#3:135\n152#3,3:136\n125#3:139\n152#3,3:140\n1855#4,2:143\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:124\n50#1:125,6\n53#1:131\n53#1:132,3\n98#1:135\n98#1:136,3\n99#1:139\n99#1:140,3\n113#1:143,2\n*E\n"})
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v0 f52016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @Nullable
    public static final x0 f52017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @Nullable
    public static final x0 f52018c;

    static {
        v0 v0Var = new v0();
        f52016a = v0Var;
        f52017b = new w0();
        f52018c = v0Var.c();
    }

    private v0() {
    }

    @oj.n
    public static final void a(@NotNull Fragment inFragment, @NotNull Fragment outFragment, boolean z10, @NotNull androidx.collection.a<String, View> sharedElements, boolean z11) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        androidx.core.app.o0 enterTransitionCallback = z10 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z11) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    @oj.n
    @Nullable
    public static final String b(@NotNull androidx.collection.a<String, String> aVar, @NotNull String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : aVar.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull((List) arrayList);
    }

    private final x0 c() {
        try {
            Intrinsics.checkNotNull(androidx.transition.n.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (x0) androidx.transition.n.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @oj.n
    public static final void d(@NotNull androidx.collection.a<String, String> aVar, @NotNull androidx.collection.a<String, View> namedViews) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        for (int size = aVar.size() - 1; -1 < size; size--) {
            if (!namedViews.containsKey(aVar.k(size))) {
                aVar.i(size);
            }
        }
    }

    @oj.n
    public static final void e(@NotNull List<? extends View> views, int i10) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }

    @oj.n
    public static final boolean f() {
        return (f52017b == null && f52018c == null) ? false : true;
    }
}
