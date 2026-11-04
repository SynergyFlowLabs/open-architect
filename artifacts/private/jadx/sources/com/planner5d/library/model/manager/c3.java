package com.planner5d.library.model.manager;

import android.content.Context;
import org.json.JSONArray;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class c3 implements x1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f181399j = 36;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f181400k = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.config.p f181401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.y0 f181402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.catalog.d f181403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.services.utility.c2 f181404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.model.manager.config.j f181405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f181406h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f181407i = null;

    @ij.a
    public c3(com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.manager.builtin.y0 y0Var, com.planner5d.library.api.requests.c cVar, com.planner5d.library.services.utility.c2 c2Var, com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.modules.user.user.t tVar) {
        this.f181401c = pVar;
        this.f181402d = y0Var;
        this.f181404f = c2Var;
        this.f181405g = jVar;
        this.f181403e = new com.planner5d.library.widget.editor.catalog.d(cVar, tVar);
    }

    @androidx.annotation.m1
    private void c(String str) {
        synchronized (this.f181406h) {
            try {
                JSONArray jSONArray = new JSONArray();
                String[] strArrD = d();
                String strTrim = str.toLowerCase().trim();
                jSONArray.put(strTrim);
                for (String str2 : strArrD) {
                    if (jSONArray.length() >= 36) {
                        break;
                    }
                    if (!strTrim.equals(str2)) {
                        jSONArray.put(str2);
                    }
                }
                this.f181401c.H(com.planner5d.library.services.r.searchRecentQueries, jSONArray.toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str, Subscriber subscriber) {
        try {
            subscriber.onNext(this.f181402d.d(str));
            subscriber.onCompleted();
        } catch (Throwable th2) {
            th = th2;
            if (!(th instanceof Exception)) {
                th = new Exception(th);
            }
            subscriber.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void f(xd.b bVar, long j10, String str) {
        if (bVar.c() > 0) {
            c(str);
            long jCurrentTimeMillis = 1000 - (System.currentTimeMillis() - j10);
            if (jCurrentTimeMillis > 0) {
                com.planner5d.library.services.utility.o3.c(jCurrentTimeMillis);
            }
        }
    }

    private Observable<xd.b> k(final String str) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.b3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f180896a.h(str, (Subscriber) obj);
            }
        });
    }

    @androidx.annotation.m1
    public String[] d() {
        String strW;
        try {
            synchronized (this.f181406h) {
                strW = this.f181401c.w(com.planner5d.library.services.r.searchRecentQueries, null);
            }
            if (strW != null && !strW.isEmpty()) {
                JSONArray jSONArray = new JSONArray(strW);
                int length = jSONArray.length();
                String[] strArr = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    strArr[i10] = jSONArray.getString(i10);
                }
                return strArr;
            }
        } catch (Throwable unused) {
        }
        return new String[0];
    }

    public Observable<xd.b> j(final String str, Context context) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f181407i == null) {
            this.f181407i = Boolean.valueOf(this.f181405g.a(com.planner5d.library.model.manager.config.f.ApiCatalogSearch));
        }
        return ((this.f181407i.booleanValue() && context != null && this.f181404f.d(context)) ? this.f181403e.e(str) : k(str)).doOnNext(new Action1() { // from class: com.planner5d.library.model.manager.a3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f180781a.f(jCurrentTimeMillis, str, (xd.b) obj);
            }
        });
    }
}
