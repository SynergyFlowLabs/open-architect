package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.k1;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.q0;
import com.facebook.internal.x;
import com.facebook.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f98792g = "..";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f98793h = ".";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private static g f98795j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f98796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Activity> f98797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<c> f98798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private HashSet<String> f98799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final HashMap<Integer, HashSet<String>> f98800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f98791f = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f98794i = g.class.getCanonicalName();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final synchronized g a() {
            g gVarB;
            try {
                if (g.b() == null) {
                    g.d(new g(null));
                }
                gVarB = g.b();
                if (gVarB == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return gVarB;
        }

        @n
        @k1
        @NotNull
        public final Bundle b(@Nullable f5.b bVar, @NotNull View rootView, @NotNull View hostView) {
            List<f5.c> listI;
            f5.b bVar2;
            View view;
            List<b> listA;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (bVar != null && (listI = bVar.i()) != null) {
                for (f5.c cVar : listI) {
                    if (cVar.d() != null && cVar.d().length() > 0) {
                        bundle.putString(cVar.a(), cVar.d());
                    } else if (cVar.b().size() > 0) {
                        if (Intrinsics.areEqual(cVar.c(), f5.a.f274943e)) {
                            c.a aVar = c.f98803f;
                            List<f5.d> listB = cVar.b();
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            f5.b bVar3 = bVar;
                            listA = aVar.a(bVar3, hostView, listB, 0, -1, simpleName);
                            bVar2 = bVar3;
                            view = rootView;
                        } else {
                            bVar2 = bVar;
                            c.a aVar2 = c.f98803f;
                            List<f5.d> listB2 = cVar.b();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            view = rootView;
                            listA = aVar2.a(bVar2, view, listB2, 0, -1, simpleName2);
                        }
                        for (b bVar4 : listA) {
                            if (bVar4.a() != null) {
                                f5.g gVar = f5.g.f275010a;
                                String strK = f5.g.k(bVar4.a());
                                if (strK.length() > 0) {
                                    bundle.putString(cVar.a(), strK);
                                    break;
                                }
                            }
                        }
                        bVar = bVar2;
                        rootView = view;
                    }
                }
            }
            return bundle;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final WeakReference<View> f98801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f98802b;

        public b(@NotNull View view, @NotNull String viewMapKey) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.f98801a = new WeakReference<>(view);
            this.f98802b = viewMapKey;
        }

        @Nullable
        public final View a() {
            WeakReference<View> weakReference = this.f98801a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @NotNull
        public final String b() {
            return this.f98802b;
        }
    }

    @k1
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final a f98803f = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f98804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private List<f5.b> f98805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Handler f98806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final HashSet<String> f98807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f98808e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final List<View> b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View child = viewGroup.getChildAt(i10);
                        if (child.getVisibility() == 0) {
                            Intrinsics.checkNotNullExpressionValue(child, "child");
                            arrayList.add(child);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r10.getClass().getSimpleName(), (java.lang.String) r9.get(r9.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final boolean c(android.view.View r10, f5.d r11, int r12) {
                /*
                    Method dump skipped, instruction units count: 389
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.g.c.a.c(android.view.View, f5.d, int):boolean");
            }

            @n
            @NotNull
            public final List<b> a(@Nullable f5.b bVar, @Nullable View view, @NotNull List<f5.d> path, int i10, int i11, @NotNull String mapKey) {
                f5.b bVar2;
                List<f5.d> list;
                a aVar;
                List<View> listB;
                int size;
                List<View> listB2;
                int size2;
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(mapKey, "mapKey");
                String str = mapKey + '.' + i11;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (i10 >= path.size()) {
                        arrayList.add(new b(view, str));
                        bVar2 = bVar;
                        list = path;
                        aVar = this;
                    } else {
                        f5.d dVar = path.get(i10);
                        if (Intrinsics.areEqual(dVar.a(), g.f98792g)) {
                            ViewParent parent = view.getParent();
                            if ((parent instanceof ViewGroup) && (size = (listB = b((ViewGroup) parent)).size()) > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    a aVar2 = this;
                                    f5.b bVar3 = bVar;
                                    List<f5.d> list2 = path;
                                    arrayList.addAll(aVar2.a(bVar3, listB.get(i12), list2, i10 + 1, i12, str));
                                    if (i13 >= size) {
                                        break;
                                    }
                                    this = aVar2;
                                    i12 = i13;
                                    bVar = bVar3;
                                    path = list2;
                                }
                            }
                        } else {
                            bVar2 = bVar;
                            list = path;
                            aVar = this;
                            if (Intrinsics.areEqual(dVar.a(), g.f98793h)) {
                                arrayList.add(new b(view, str));
                                return arrayList;
                            }
                            if (aVar.c(view, dVar, i11)) {
                                if (i10 == list.size() - 1) {
                                    arrayList.add(new b(view, str));
                                }
                            }
                        }
                    }
                    if ((view instanceof ViewGroup) && (size2 = (listB2 = aVar.b((ViewGroup) view)).size()) > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            a aVar3 = aVar;
                            arrayList.addAll(aVar3.a(bVar2, listB2.get(i14), list, i10 + 1, i14, str));
                            if (i15 >= size2) {
                                break;
                            }
                            i14 = i15;
                            aVar = aVar3;
                        }
                    }
                }
                return arrayList;
            }

            private a() {
            }
        }

        public c(@Nullable View view, @NotNull Handler handler, @NotNull HashSet<String> listenerSet, @NotNull String activityName) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.f98804a = new WeakReference<>(view);
            this.f98806c = handler;
            this.f98807d = listenerSet;
            this.f98808e = activityName;
            handler.postDelayed(this, 200L);
        }

        private final void a(b bVar, View view, f5.b bVar2) {
            if (bVar2 == null) {
                return;
            }
            try {
                View viewA = bVar.a();
                if (viewA == null) {
                    return;
                }
                f5.g gVar = f5.g.f275010a;
                View viewA2 = f5.g.a(viewA);
                if (viewA2 != null && gVar.p(viewA, viewA2)) {
                    d(bVar, view, bVar2);
                    return;
                }
                String name = viewA.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                if (StringsKt.u2(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewA instanceof AdapterView)) {
                    b(bVar, view, bVar2);
                } else if (viewA instanceof ListView) {
                    c(bVar, view, bVar2);
                }
            } catch (Exception e10) {
                e1 e1Var = e1.f99794a;
                e1.f0(g.c(), e10);
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        private final void b(b bVar, View view, f5.b bVar2) {
            boolean z10;
            View viewA = bVar.a();
            if (viewA == null) {
                return;
            }
            String strB = bVar.b();
            f5.g gVar = f5.g.f275010a;
            View.OnClickListener onClickListenerG = f5.g.g(viewA);
            if (!(onClickListenerG instanceof com.facebook.appevents.codeless.b.a)) {
                z10 = false;
            } else {
                if (onClickListenerG == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((com.facebook.appevents.codeless.b.a) onClickListenerG).a()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (this.f98807d.contains(strB) || z10) {
                return;
            }
            com.facebook.appevents.codeless.b bVar3 = com.facebook.appevents.codeless.b.f98768a;
            viewA.setOnClickListener(com.facebook.appevents.codeless.b.b(bVar2, view, viewA));
            this.f98807d.add(strB);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x002f  */
        private final void c(b bVar, View view, f5.b bVar2) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView != null) {
                String strB = bVar.b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (!(onItemClickListener instanceof com.facebook.appevents.codeless.b.C0901b)) {
                    z10 = false;
                } else {
                    if (onItemClickListener == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    }
                    if (((com.facebook.appevents.codeless.b.C0901b) onItemClickListener).a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!this.f98807d.contains(strB) && !z10) {
                    com.facebook.appevents.codeless.b bVar3 = com.facebook.appevents.codeless.b.f98768a;
                    adapterView.setOnItemClickListener(com.facebook.appevents.codeless.b.c(bVar2, view, adapterView));
                    this.f98807d.add(strB);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        private final void d(b bVar, View view, f5.b bVar2) {
            boolean z10;
            View viewA = bVar.a();
            if (viewA == null) {
                return;
            }
            String strB = bVar.b();
            f5.g gVar = f5.g.f275010a;
            View.OnTouchListener onTouchListenerH = f5.g.h(viewA);
            if (!(onTouchListenerH instanceof h.a)) {
                z10 = false;
            } else {
                if (onTouchListenerH == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((h.a) onTouchListenerH).a()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (this.f98807d.contains(strB) || z10) {
                return;
            }
            h hVar = h.f98809a;
            viewA.setOnTouchListener(h.a(bVar2, view, viewA));
            this.f98807d.add(strB);
        }

        private final void e(f5.b bVar, View view) {
            String strA;
            if (bVar != null && view != null && ((strA = bVar.a()) == null || strA.length() == 0 || Intrinsics.areEqual(bVar.a(), this.f98808e))) {
                List<f5.d> listJ = bVar.j();
                if (listJ.size() <= 25) {
                    Iterator<b> it = f98803f.a(bVar, view, listJ, 0, -1, this.f98808e).iterator();
                    while (it.hasNext()) {
                        a(it.next(), view, bVar);
                    }
                }
            }
        }

        @n
        @NotNull
        public static final List<b> f(@Nullable f5.b bVar, @Nullable View view, @NotNull List<f5.d> list, int i10, int i11, @NotNull String str) {
            return f98803f.a(bVar, view, list, i10, i11, str);
        }

        private final void g() {
            int size;
            List<f5.b> list = this.f98805b;
            if (list == null || this.f98804a.get() == null || (size = list.size() - 1) < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                e(list.get(i10), this.f98804a.get());
                if (i11 > size) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            g();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                    return;
                }
                try {
                    g0 g0Var = g0.f99617a;
                    String strO = g0.o();
                    b0 b0Var = b0.f99725a;
                    x xVarF = b0.f(strO);
                    if (xVarF != null && xVarF.b()) {
                        List<f5.b> listB = f5.b.f274952j.b(xVarF.f());
                        this.f98805b = listB;
                        if (listB != null && (view = this.f98804a.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            g();
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ g b() {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            return f98795j;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            return f98794i;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            f98795j = gVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    @n
    @NotNull
    public static final synchronized g g() {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            return f98791f.a();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    @n
    @k1
    @NotNull
    public static final Bundle h(@Nullable f5.b bVar, @NotNull View view, @NotNull View view2) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            return f98791f.b(bVar, view, view2);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    private final void i() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            for (Activity activity : this.f98797b) {
                if (activity != null) {
                    com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
                    View viewE = com.facebook.appevents.internal.g.e(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f98796a;
                    HashSet<String> hashSet = this.f98799d;
                    Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                    this.f98798c.add(new c(viewE, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void k() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                i();
            } else {
                this.f98796a.post(new Runnable() { // from class: com.facebook.appevents.codeless.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.l(this.f98790a);
                    }
                });
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(g this$0) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.i();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    @k1
    public final void e(@NotNull Activity activity) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                q0 q0Var = q0.f100060a;
                if (!q0.b()) {
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        throw new u("Can't add activity to CodelessMatcher on non-UI thread");
                    }
                    this.f98797b.add(activity);
                    this.f98799d.clear();
                    HashSet<String> hashSet = this.f98800e.get(Integer.valueOf(activity.hashCode()));
                    if (hashSet != null) {
                        this.f98799d = hashSet;
                    }
                    k();
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @k1
    public final void f(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f98800e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @k1
    public final void j(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            q0 q0Var = q0.f100060a;
            if (q0.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new u("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f98797b.remove(activity);
            this.f98798c.clear();
            this.f98800e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f98799d.clone());
            this.f98799d.clear();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private g() {
        this.f98796a = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f98797b = setNewSetFromMap;
        this.f98798c = new LinkedHashSet();
        this.f98799d = new HashSet<>();
        this.f98800e = new HashMap<>();
    }
}
