package com.planner5d.library.model.manager;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class q0 implements x1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f197665i = 777;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.i f197666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.model.manager.favorite.a f197667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.api.requests.c f197668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ErrorMessageParser f197669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b4 f197670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t f197671h;

    class a extends com.planner5d.library.services.rx.e<Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f197672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.h[] f197673e;

        a(Subscriber subscriber, com.planner5d.library.model.h[] hVarArr) {
            this.f197672d = subscriber;
            this.f197673e = hVarArr;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            this.f197672d.onNext(this.f197673e);
            this.f197672d.onCompleted();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f197675a;

        static {
            int[] iArr = new int[c.values().length];
            f197675a = iArr;
            try {
                iArr[c.ideas.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f197675a[c.projects.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f197675a[c.favorites.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        ideas,
        projects,
        favorites
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f197680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f197681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f197682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f197683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f197684e;

        public d(c cVar) {
            this(cVar, (Long) null);
        }

        public Bundle a() {
            com.planner5d.library.services.utility.i iVarJ = new com.planner5d.library.services.utility.i().j(com.planner5d.library.services.r.type, this.f197682c.name()).j(com.planner5d.library.services.r.sortBy, this.f197681b.name()).j(com.planner5d.library.services.r.last, this.f197680a);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.tag;
            Long l10 = this.f197683d;
            return iVarJ.j(rVar, l10 == null ? null : String.valueOf(l10)).a();
        }

        public boolean equals(Object obj) {
            Long l10;
            String str;
            if (!(obj instanceof d)) {
                return super.equals(obj);
            }
            d dVar = (d) obj;
            return dVar.f197681b.equals(this.f197681b) && ((l10 = dVar.f197683d) != null || this.f197683d == null) && ((l10 == null || l10.equals(this.f197683d)) && (((str = dVar.f197680a) != null || this.f197680a == null) && (str == null || str.equals(this.f197680a))));
        }

        public d(c cVar, Long l10) {
            this(cVar, e.editorsChoice, null, l10);
        }

        public d(c cVar, e eVar, String str, Long l10) {
            this.f197682c = cVar;
            this.f197681b = eVar;
            this.f197680a = str;
            this.f197683d = l10;
            this.f197684e = 24;
        }

        public d(c cVar, e eVar, String str, Long l10, int i10) {
            this.f197682c = cVar;
            this.f197681b = eVar;
            this.f197680a = str;
            this.f197683d = l10;
            this.f197684e = i10;
        }

        public d(String str, d dVar) {
            this(dVar.f197682c, dVar.f197681b, str, dVar.f197683d);
        }

        public d(Bundle bundle) {
            this(new com.planner5d.library.services.utility.j(bundle));
        }

        public d(Bundle bundle, c cVar) {
            this(new com.planner5d.library.services.utility.j(bundle), cVar);
        }

        public d(com.planner5d.library.services.utility.j jVar, c cVar) {
            this(cVar, e.valueOf(jVar.t(com.planner5d.library.services.r.sortBy, e.newest.name())), jVar.t(com.planner5d.library.services.r.last, null), jVar.n(com.planner5d.library.services.r.tag));
        }

        public d(com.planner5d.library.services.utility.j jVar) {
            this(c.valueOf(jVar.t(com.planner5d.library.services.r.type, c.ideas.name())), e.valueOf(jVar.t(com.planner5d.library.services.r.sortBy, e.newest.name())), jVar.t(com.planner5d.library.services.r.last, null), jVar.n(com.planner5d.library.services.r.tag));
        }
    }

    public enum e {
        newest("new"),
        trendy("trendy"),
        best("best"),
        popular("popular"),
        editorsChoice("editorschoice");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f197691a;

        e(String str) {
            this.f197691a = str;
        }
    }

    @ij.a
    public q0(com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.model.manager.favorite.a aVar, com.planner5d.library.api.requests.c cVar, ErrorMessageParser errorMessageParser, b4 b4Var, com.planner5d.library.modules.user.user.t tVar) {
        this.f197666c = iVar;
        this.f197667d = aVar;
        this.f197668e = cVar;
        this.f197669f = errorMessageParser;
        this.f197670g = b4Var;
        this.f197671h = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(final c cVar, final String str, Subscriber subscriber) {
        try {
            com.planner5d.library.model.h[] hVarArrG = G(cVar, (com.planner5d.library.api.c) this.f197668e.j(this.f197671h.a(), new Function2() { // from class: com.planner5d.library.model.manager.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).R((id.a) obj2, cVar.name(), str);
                }
            }));
            subscriber.onNext(hVarArrG.length == 0 ? null : hVarArrG[0]);
            subscriber.onCompleted();
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(d dVar, Subscriber subscriber) {
        try {
            F(dVar, t(dVar), subscriber);
        } catch (com.planner5d.library.api.e | JSONException e10) {
            subscriber.onError(this.f197669f.parse(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(d dVar, Subscriber subscriber) {
        try {
            ArrayList arrayList = new ArrayList();
            if (dVar.f197680a != null) {
                loop0: while (true) {
                    com.planner5d.library.model.h[] hVarArrT = t(new d(arrayList.size() > 0 ? ((com.planner5d.library.model.h) arrayList.get(arrayList.size() - 1)).f180740b : null, dVar));
                    if (hVarArrT.length == 0) {
                        break;
                    }
                    for (com.planner5d.library.model.h hVar : hVarArrT) {
                        if (dVar.f197680a.equals(hVar.f180740b)) {
                            break loop0;
                        }
                        arrayList.add(hVar);
                    }
                }
            }
            F(dVar, (com.planner5d.library.model.h[]) arrayList.toArray(new com.planner5d.library.model.h[0]), subscriber);
        } catch (com.planner5d.library.api.e | JSONException e10) {
            subscriber.onError(this.f197669f.parse(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.model.k[] E(com.planner5d.library.model.h[] hVarArr) {
        int length = hVarArr.length;
        com.planner5d.library.model.k[] kVarArr = new com.planner5d.library.model.k[length];
        kotlinx.coroutines.s0 s0VarA = kotlinx.coroutines.t0.a(kotlinx.coroutines.s2.a(null));
        for (int i10 = 0; i10 < length; i10++) {
            com.planner5d.library.model.h hVar = hVarArr[i10];
            com.planner5d.library.database.model.f fVar = hVar.f180739a == c.projects ? com.planner5d.library.database.model.f.GALLERY_PROJECTS : com.planner5d.library.database.model.f.GALLERY_SNAPSHOTS;
            String str = hVar.f180740b;
            final com.planner5d.library.model.manager.favorite.a aVar = this.f197667d;
            Objects.requireNonNull(aVar);
            kVarArr[i10] = new com.planner5d.library.model.k(hVar, (Boolean) com.planner5d.library.services.utility.c0.v(fVar, str, new com.planner5d.library.services.utility.p3() { // from class: com.planner5d.library.model.manager.k0
                @Override // com.planner5d.library.services.utility.p3
                public final Object a(Object obj, Object obj2, Object obj3) {
                    return aVar.g((com.planner5d.library.database.model.f) obj, (String) obj2, (kotlin.coroutines.d) obj3);
                }
            }, s0VarA).toBlocking().firstOrDefault(Boolean.FALSE));
        }
        return kVarArr;
    }

    private void F(d dVar, com.planner5d.library.model.h[] hVarArr, Subscriber<? super com.planner5d.library.model.h[]> subscriber) {
        c cVar = dVar.f197682c;
        com.planner5d.library.database.model.f fVar = null;
        if (cVar != null) {
            int i10 = b.f197675a[cVar.ordinal()];
            if (i10 == 1) {
                fVar = com.planner5d.library.database.model.f.GALLERY_SNAPSHOTS;
            } else if (i10 == 2) {
                fVar = com.planner5d.library.database.model.f.GALLERY_PROJECTS;
            } else if (i10 != 3) {
                throw new IncompatibleClassChangeError();
            }
        }
        if (fVar == null) {
            subscriber.onNext(hVarArr);
            subscriber.onCompleted();
        } else {
            final com.planner5d.library.model.manager.favorite.a aVar = this.f197667d;
            Objects.requireNonNull(aVar);
            com.planner5d.library.services.utility.c0.y(fVar, new BiFunction() { // from class: com.planner5d.library.model.manager.i0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return aVar.h((com.planner5d.library.database.model.f) obj, (kotlin.coroutines.d) obj2);
                }
            }).subscribe((Subscriber) new a(subscriber, hVarArr));
        }
    }

    @androidx.annotation.m1
    private com.planner5d.library.model.h[] G(c cVar, com.planner5d.library.api.c cVar2) throws JSONException {
        JSONObject jSONObjectA = cVar2.a();
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.sizes;
        JSONArray jSONArray = jSONObjectA.has(rVar.f224891a) ? cVar2.a().getJSONArray(rVar.f224891a) : new JSONArray();
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        JSONArray jSONArray2 = cVar2.a().getJSONArray(com.planner5d.library.services.r.items.f224891a);
        ArrayList arrayList = new ArrayList(jSONArray2.length());
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            arrayList.add(i11, m(cVar, jSONArray2.getJSONObject(i11), iArr));
        }
        return (com.planner5d.library.model.h[]) arrayList.toArray(new com.planner5d.library.model.h[0]);
    }

    private Boolean H(com.planner5d.library.api.c cVar) throws JSONException {
        boolean z10 = false;
        int iM = com.planner5d.library.services.utility.k1.m(cVar.a(), com.planner5d.library.services.r.pub, 0);
        int iM2 = com.planner5d.library.services.utility.k1.m(cVar.a(), com.planner5d.library.services.r.error, 0);
        if (iM > -1 && iM2 == 0) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    private Boolean I(com.planner5d.library.api.c cVar) throws JSONException {
        String strW = com.planner5d.library.services.utility.k1.w(cVar.a(), com.planner5d.library.services.r.hash, "");
        boolean z10 = false;
        int iM = com.planner5d.library.services.utility.k1.m(cVar.a(), com.planner5d.library.services.r.saved, 0);
        if (!strW.isEmpty() && iM != 0) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public static /* synthetic */ com.planner5d.library.api.c a(d dVar, com.planner5d.library.api.b bVar, id.a aVar) {
        String strName = dVar.f197682c.name();
        String str = dVar.f197680a;
        Long l10 = dVar.f197683d;
        return bVar.F(aVar, strName, str, null, l10, (l10 == null || l10.longValue() != 777) ? dVar.f197681b.f197691a : null, Integer.valueOf(dVar.f197684e));
    }

    @androidx.annotation.m1
    private com.planner5d.library.model.h m(c cVar, JSONObject jSONObject, int[] iArr) throws JSONException {
        String str;
        String[] strArr;
        com.planner5d.library.model.x[] xVarArrG0 = this.f197666c.g0(TextUtils.split(com.planner5d.library.services.utility.k1.w(jSONObject, com.planner5d.library.services.r.tags, ""), "\\|"));
        String[] strArrSplit = TextUtils.split(com.planner5d.library.services.utility.k1.w(jSONObject, com.planner5d.library.services.r.shots, ""), "\\|");
        if (strArrSplit.length < 1) {
            str = null;
            strArr = null;
        } else {
            String str2 = strArrSplit[0];
            int length = strArrSplit.length - 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArrSplit, 1, strArr2, 0, length);
            str = str2;
            strArr = strArr2;
        }
        return c.projects.equals(cVar) ? new com.planner5d.library.model.h(cVar, jSONObject.getString(com.planner5d.library.services.r.id.f224891a), jSONObject.getString(com.planner5d.library.services.r.hash.f224891a), jSONObject.getString(com.planner5d.library.services.r.url.f224891a), jSONObject.getString(com.planner5d.library.services.r.img.f224891a), jSONObject.getString(com.planner5d.library.services.r.galleryRecordName.f224891a), jSONObject.getString(com.planner5d.library.services.r.galleryRecordUserName.f224891a), jSONObject.getString(com.planner5d.library.services.r.galleryRecordUserPic.f224891a), jSONObject.getLong(com.planner5d.library.services.r.views.f224891a), jSONObject.getLong(com.planner5d.library.services.r.rcounter.f224891a), jSONObject.getLong(com.planner5d.library.services.r.comments.f224891a), xVarArrG0, iArr, str, strArr, jSONObject.getLong(com.planner5d.library.services.r.galleryProjectId.f224891a)) : new com.planner5d.library.model.h(cVar, jSONObject.getString(com.planner5d.library.services.r.id.f224891a), jSONObject.getString(com.planner5d.library.services.r.uid.f224891a), jSONObject.getString(com.planner5d.library.services.r.url.f224891a), jSONObject.getString(com.planner5d.library.services.r.img.f224891a), jSONObject.getString(com.planner5d.library.services.r.title.f224891a), jSONObject.getString(com.planner5d.library.services.r.galleryRecordUserName.f224891a), jSONObject.getString(com.planner5d.library.services.r.galleryRecordUserPic.f224891a), jSONObject.getLong(com.planner5d.library.services.r.views.f224891a), jSONObject.getLong(com.planner5d.library.services.r.likes.f224891a), jSONObject.getLong(com.planner5d.library.services.r.comments.f224891a), xVarArrG0, iArr, str, strArr, jSONObject.getLong(com.planner5d.library.services.r.galleryProjectId.f224891a));
    }

    public static com.planner5d.library.model.manager.statistics.events.r3.l p(c cVar) {
        if (c.projects.equals(cVar)) {
            return com.planner5d.library.model.manager.statistics.events.r3.l.project;
        }
        if (c.ideas.equals(cVar)) {
            return com.planner5d.library.model.manager.statistics.events.r3.l.snapshot;
        }
        return null;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    private String v(long j10, boolean z10) {
        Snapshot snapshotF0 = this.f197670g.f0(j10);
        String str = snapshotF0 == null ? null : snapshotF0.uid;
        if (!z10 || snapshotF0 == null || str != null) {
            return str;
        }
        this.f197670g.O0(snapshotF0);
        return v(j10, false);
    }

    private e[] w() {
        return new e[]{e.editorsChoice, e.newest, e.trendy, e.popular};
    }

    @androidx.annotation.m1
    public List<com.planner5d.library.model.x> A() {
        return Arrays.asList(this.f197666c.e0());
    }

    @androidx.annotation.m1
    public Boolean J(Project project, String str, String str2, List<String> list, List<String> list2) {
        try {
            final String str3 = project.uid;
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.planner5d.library.services.r.galleryRecordName.f224891a, str);
            jSONObject.put(com.planner5d.library.services.r.description.f224891a, str2);
            String str4 = com.planner5d.library.services.r.shots.f224891a;
            com.planner5d.library.services.utility.c3 c3Var = com.planner5d.library.services.utility.c3.f225174a;
            jSONObject.put(str4, c3Var.e(list, "|"));
            jSONObject.put(com.planner5d.library.services.r.tags.f224891a, c3Var.e(list2, "|"));
            return I((com.planner5d.library.api.c) this.f197668e.j(this.f197671h.a(), new Function2() { // from class: com.planner5d.library.model.manager.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).l((id.a) obj2, str3, jSONObject);
                }
            }));
        } catch (com.planner5d.library.api.e | JSONException unused) {
            return Boolean.FALSE;
        }
    }

    @androidx.annotation.m1
    public Boolean K(Long l10, String str, String str2, List<String> list) {
        try {
            final JSONObject jSONObject = new JSONObject();
            if (l10 == null) {
                throw new IllegalStateException("Snapshot id is null");
            }
            String strV = v(l10.longValue(), true);
            if (strV == null) {
                throw new IllegalStateException("Model has failed to synchronize");
            }
            jSONObject.put(com.planner5d.library.services.r.id.f224891a, strV);
            jSONObject.put(com.planner5d.library.services.r.title.f224891a, str);
            jSONObject.put(com.planner5d.library.services.r.descr.f224891a, str2);
            jSONObject.put(com.planner5d.library.services.r.tags.f224891a, com.planner5d.library.services.utility.c3.f225174a.e(list, "|"));
            jSONObject.put(com.planner5d.library.services.r.pub.f224891a, 1);
            return H((com.planner5d.library.api.c) this.f197668e.j(this.f197671h.a(), new Function2() { // from class: com.planner5d.library.model.manager.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).S((id.a) obj2, jSONObject);
                }
            }));
        } catch (com.planner5d.library.api.e | IllegalStateException | JSONException unused) {
            return Boolean.FALSE;
        }
    }

    public Observable<com.planner5d.library.model.h> n(c cVar, String str) {
        return o(cVar, str, true);
    }

    public Observable<com.planner5d.library.model.h> o(final c cVar, final String str, boolean z10) {
        if (str == null || str.isEmpty()) {
            return Observable.just(null);
        }
        Observable<com.planner5d.library.model.h> observableCreate = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.n0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f192196a.B(cVar, str, (Subscriber) obj);
            }
        });
        if (z10) {
            observableCreate = observableCreate.subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d);
        }
        return observableCreate;
    }

    public Observable<com.planner5d.library.model.h[]> q(final d dVar) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.h0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f191482a.C(dVar, (Subscriber) obj);
            }
        });
    }

    public Observable<com.planner5d.library.model.h[]> r(final d dVar) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.m0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f191872a.D(dVar, (Subscriber) obj);
            }
        });
    }

    @androidx.annotation.m1
    public com.planner5d.library.model.h[] t(final d dVar) throws JSONException, com.planner5d.library.api.e {
        id.a aVarA = this.f197671h.a();
        c cVar = dVar.f197682c;
        if (cVar != c.favorites) {
            return G(cVar, (com.planner5d.library.api.c) this.f197668e.j(aVarA, new Function2() { // from class: com.planner5d.library.model.manager.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q0.a(dVar, (com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            }));
        }
        com.planner5d.library.model.h[] hVarArrG = G(c.ideas, (com.planner5d.library.api.c) this.f197668e.j(aVarA, new Function2() { // from class: com.planner5d.library.model.manager.p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                q0.d dVar2 = dVar;
                return ((com.planner5d.library.api.b) obj).F((id.a) obj2, q0.c.ideas.name(), dVar2.f197680a, null, dVar2.f197683d, null, Integer.valueOf(dVar2.f197684e));
            }
        }));
        com.planner5d.library.model.h[] hVarArrG2 = G(c.projects, (com.planner5d.library.api.c) this.f197668e.j(aVarA, new Function2() { // from class: com.planner5d.library.model.manager.f0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                q0.d dVar2 = dVar;
                return ((com.planner5d.library.api.b) obj).F((id.a) obj2, q0.c.projects.name(), dVar2.f197680a, null, dVar2.f197683d, null, Integer.valueOf(dVar2.f197684e));
            }
        }));
        com.planner5d.library.model.h[] hVarArr = (com.planner5d.library.model.h[]) Arrays.copyOf(hVarArrG, hVarArrG.length + hVarArrG2.length);
        System.arraycopy(hVarArrG2, 0, hVarArr, hVarArrG.length, hVarArrG2.length);
        return hVarArr;
    }

    public Observable<com.planner5d.library.model.k[]> u(d dVar) {
        return q(dVar).observeOn(com.planner5d.library.services.rx.c.f224933c).map(new Func1() { // from class: com.planner5d.library.model.manager.j0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f191769a.E((com.planner5d.library.model.h[]) obj);
            }
        }).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public e x(int i10) {
        return w()[i10];
    }

    public int y(e eVar) {
        e[] eVarArrW = w();
        for (int i10 = 0; i10 < eVarArrW.length; i10++) {
            if (eVarArrW[i10].equals(eVar)) {
                return i10;
            }
        }
        return 0;
    }

    public String[] z(Context context) {
        return new String[]{context.getString(com.planner5d.library.f.s.Yc), context.getString(com.planner5d.library.f.s.Zc), context.getString(com.planner5d.library.f.s.f169010bd), context.getString(com.planner5d.library.f.s.f168985ad)};
    }
}
