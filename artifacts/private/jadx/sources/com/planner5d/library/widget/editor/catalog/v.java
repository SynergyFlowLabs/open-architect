package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.model.manager.c3;
import com.planner5d.library.services.utility.p3;
import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.editor.helper.s2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes12.dex */
public class v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f254678q = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c3 f254679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f254680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f254681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f254682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f254683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f254684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f254685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s2 f254686h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f254690l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Subscription f254692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final le.h f254693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f254694p;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f254687i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f254688j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f254689k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Pair<String, Integer> f254691m = null;

    class a extends com.planner5d.library.services.rx.e<List<? extends String>> {
        a() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(List<? extends String> list) {
            v.this.f254694p = (list == null || list.isEmpty()) ? false : true;
            if (v.this.f254694p) {
                CatalogSearchSuggestionsView suggestionsView = v.this.f254681c.getSuggestionsView();
                suggestionsView.setList(new ArrayList(list));
                y yVar = v.this.f254680b;
                Objects.requireNonNull(yVar);
                suggestionsView.setOnSearchListener(new s(yVar));
                suggestionsView.setVisibility(0);
            }
        }
    }

    class b extends com.planner5d.library.services.rx.e<f> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f254696d;

        b(String str) {
            this.f254696d = str;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(@p0 Throwable th2) throws Throwable {
            v.this.E();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(f fVar) {
            if (fVar.f254704b != null) {
                v vVar = v.this;
                vVar.N(vVar.f254682d);
                v.this.f254682d.setSearchResultsData(fVar.f254704b);
            } else {
                v vVar2 = v.this;
                vVar2.N(vVar2.f254685g);
            }
            if (fVar.f254703a != null) {
                v.this.f254691m = new Pair(this.f254696d, fVar.f254703a);
            }
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            v.this.E();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c3 f254698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f254699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final le.h f254700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.planner5d.library.model.manager.config.d f254701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.planner5d.library.model.manager.config.j f254702e;

        @ij.a
        public c(c3 c3Var, g gVar, le.h hVar, com.planner5d.library.model.manager.config.d dVar, com.planner5d.library.model.manager.config.j jVar) {
            this.f254698a = c3Var;
            this.f254699b = gVar;
            this.f254700c = hVar;
            this.f254701d = dVar;
            this.f254702e = jVar;
        }

        @NonNull
        public v a(@NonNull FrameLayout frameLayout, @NonNull com.planner5d.library.services.bitmaploader.target.h hVar, @NonNull com.planner5d.library.widget.editor.catalog.adapter.a.b bVar, @NonNull s2 s2Var, @NonNull a2 a2Var, @NonNull d dVar) {
            return new v(this.f254698a, this.f254701d, this.f254702e, frameLayout, hVar, this.f254699b, this.f254700c, bVar, s2Var, a2Var, dVar);
        }
    }

    public interface d {
        void a();
    }

    interface e {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Integer f254703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final wc.a f254704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final String[] f254705c;

        private f(@p0 Integer num, @p0 wc.a aVar, @p0 String[] strArr) {
            this.f254703a = num;
            this.f254704b = aVar;
            this.f254705c = strArr;
        }
    }

    public v(c3 c3Var, com.planner5d.library.model.manager.config.d dVar, com.planner5d.library.model.manager.config.j jVar, FrameLayout frameLayout, com.planner5d.library.services.bitmaploader.target.h hVar, g gVar, le.h hVar2, com.planner5d.library.widget.editor.catalog.adapter.a.b bVar, s2 s2Var, a2 a2Var, final d dVar2) {
        Context context = frameLayout.getContext();
        this.f254690l = gVar;
        this.f254693o = hVar2;
        this.f254679a = c3Var;
        this.f254686h = s2Var;
        y yVar = new y(context);
        this.f254680b = yVar;
        FrameLayout frameLayoutK = K(context, frameLayout, context.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh));
        this.f254682d = (z) q(frameLayoutK, new z(context, hVar, bVar));
        this.f254684f = q(frameLayoutK, s(context));
        this.f254685g = q(frameLayoutK, t(context));
        b0 b0Var = (b0) q(frameLayoutK, new b0(context));
        this.f254681c = b0Var;
        if (jVar.a(com.planner5d.library.model.manager.config.f.CatalogSearchSuggestions)) {
            L(dVar);
        } else {
            this.f254694p = false;
        }
        CatalogSearchRecentsView recentsView = b0Var.getRecentsView();
        Objects.requireNonNull(yVar);
        recentsView.setOnSearchListener(new s(yVar));
        this.f254683e = u(context, frameLayoutK);
        J(false);
        a2Var.b(yVar.getSearchInput());
        yVar.getSearchInput().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.widget.editor.catalog.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                v.e(dVar2, view, z10);
            }
        });
        yVar.getSearchInput().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dVar2.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Observable A(xd.b bVar) {
        final int iC = bVar != null ? bVar.c() : 0;
        if (iC <= 0) {
            return Observable.just(new f(Integer.valueOf(iC), null, this.f254679a.d()));
        }
        final g gVar = this.f254690l;
        Objects.requireNonNull(gVar);
        return com.planner5d.library.services.utility.c0.y(bVar, new BiFunction() { // from class: com.planner5d.library.widget.editor.catalog.i
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return gVar.t((xd.b) obj, (kotlin.coroutines.d) obj2);
            }
        }).flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.catalog.m
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f254668a.z(iC, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f B(Throwable th2) {
        return new f(null, 0 == true ? 1 : 0, this.f254679a.d());
    }

    private void D() {
        final c3 c3Var = this.f254679a;
        Objects.requireNonNull(c3Var);
        F(com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.editor.catalog.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c3Var.d();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d).map(new Func1() { // from class: com.planner5d.library.widget.editor.catalog.k
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f254666a.y((String[]) obj);
            }
        }), new com.planner5d.library.services.rx.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        synchronized (this.f254687i) {
            this.f254689k = false;
        }
        this.f254683e.setVisibility(8);
        G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void F(@NonNull Observable<T> observable, @NonNull Subscriber<T> subscriber) {
        synchronized (this.f254687i) {
            try {
                Subscription subscription = this.f254692n;
                if (subscription != null && !subscription.isUnsubscribed()) {
                    this.f254692n.unsubscribe();
                }
                this.f254692n = observable.subscribe((Subscriber) subscriber);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void G() {
        String str;
        synchronized (this.f254687i) {
            try {
                String str2 = this.f254688j;
                if (str2 != null && !this.f254689k && str2.length() >= 2) {
                    String str3 = this.f254688j;
                    this.f254688j = null;
                    this.f254689k = true;
                    N(this.f254683e);
                    F(I(str3), new b(str3));
                    return;
                }
                if (!this.f254689k && (str = this.f254688j) != null && str.isEmpty()) {
                    D();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(String str) {
        synchronized (this.f254687i) {
            try {
                this.f254688j = str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        G();
    }

    @NonNull
    private Observable<f> I(@NonNull String str) {
        return this.f254679a.j(str, this.f254684f.getContext()).observeOn(com.planner5d.library.services.rx.c.f224933c).flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.catalog.n
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f254670a.A((xd.b) obj);
            }
        }).onErrorReturn(new Func1() { // from class: com.planner5d.library.widget.editor.catalog.o
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f254671a.B((Throwable) obj);
            }
        }).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    private FrameLayout K(Context context, FrameLayout frameLayout, int i10) {
        ScrollView scrollView = new ScrollView(context);
        q(frameLayout, scrollView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, i10, 0, 0);
        q(scrollView, linearLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(i10);
        layoutParams.bottomMargin = i10;
        this.f254680b.setLayoutParams(layoutParams);
        linearLayout.addView(this.f254680b);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout2);
        return frameLayout2;
    }

    private void L(final com.planner5d.library.model.manager.config.d dVar) {
        Objects.requireNonNull(dVar);
        com.planner5d.library.services.utility.c0.A(new Function() { // from class: com.planner5d.library.widget.editor.catalog.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dVar.r((kotlin.coroutines.d) obj);
            }
        }).onErrorReturn(null).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new a());
    }

    private void M(@p0 String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            this.f254681c.getRecentsView().setList(Arrays.asList(strArr));
            this.f254681c.getRecentsView().setVisibility(0);
            N(this.f254681c);
        } else {
            this.f254681c.getRecentsView().setVisibility(8);
            if (this.f254694p) {
                N(this.f254681c);
            } else {
                N(this.f254684f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(View view) {
        this.f254681c.setVisibility(8);
        this.f254682d.setVisibility(8);
        this.f254684f.setVisibility(8);
        this.f254685g.setVisibility(8);
        this.f254683e.setVisibility(8);
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f b(int i10, wc.a aVar) {
        return new f(Integer.valueOf(i10), aVar, null);
    }

    public static /* synthetic */ void e(d dVar, View view, boolean z10) {
        if (z10) {
            dVar.a();
        }
    }

    private <T extends View> T q(FrameLayout frameLayout, T t10) {
        t10.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(t10);
        return t10;
    }

    private View s(Context context) {
        return LayoutInflater.from(context).inflate(com.planner5d.library.f.m.f168688f6, (ViewGroup) null);
    }

    private View t(Context context) {
        return LayoutInflater.from(context).inflate(com.planner5d.library.f.m.f168710h6, (ViewGroup) null);
    }

    private z u(Context context, FrameLayout frameLayout) {
        z zVar = new z(context, null, null);
        zVar.setVisibility(8);
        q(frameLayout, zVar);
        zVar.setSearchResultsData(this.f254693o.b());
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void y(String[] strArr) {
        M(strArr);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable z(final int i10, List list) {
        Boolean bool = Boolean.TRUE;
        final le.h hVar = this.f254693o;
        Objects.requireNonNull(hVar);
        return com.planner5d.library.services.utility.c0.u(list, bool, new p3() { // from class: com.planner5d.library.widget.editor.catalog.p
            @Override // com.planner5d.library.services.utility.p3
            public final Object a(Object obj, Object obj2, Object obj3) {
                return hVar.a((List) obj, ((Boolean) obj2).booleanValue(), (kotlin.coroutines.d) obj3);
            }
        }).map(new Func1() { // from class: com.planner5d.library.widget.editor.catalog.q
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return v.b(i10, (wc.a) obj);
            }
        });
    }

    public void C() {
        Pair<String, Integer> pair = this.f254691m;
        this.f254691m = null;
        if (pair == null || !x()) {
            return;
        }
        this.f254686h.e((String) pair.first, ((Integer) pair.second).intValue());
    }

    public void J(boolean z10) {
        this.f254680b.setVisibility(z10 ? 0 : 8);
        if (z10) {
            D();
        } else {
            N(null);
        }
        this.f254680b.setOnSearchListener(z10 ? new e() { // from class: com.planner5d.library.widget.editor.catalog.r
            @Override // com.planner5d.library.widget.editor.catalog.v.e
            public final void a(String str) {
                this.f254674a.H(str);
            }
        } : null);
    }

    public void r() {
        this.f254680b.setQuery("");
        D();
    }

    public void v() {
        this.f254682d.f2();
    }

    public boolean w() {
        return this.f254680b.d();
    }

    public boolean x() {
        return this.f254680b.getVisibility() == 0;
    }
}
