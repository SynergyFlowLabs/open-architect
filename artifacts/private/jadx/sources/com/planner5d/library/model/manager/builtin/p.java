package com.planner5d.library.model.manager.builtin;

import androidx.annotation.m1;
import com.planner5d.library.model.ManagedFile;
import com.planner5d.library.model.manager.x1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nDatafileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatafileManager.kt\ncom/planner5d/library/model/manager/builtin/DatafileManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n1#2:160\n216#3,2:161\n*S KotlinDebug\n*F\n+ 1 DatafileManager.kt\ncom/planner5d/library/model/manager/builtin/DatafileManager\n*L\n129#1:161,2\n*E\n"})
public final class p implements x1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f181175j = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i f181176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n f181177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f181178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<String, com.planner5d.library.model.d> f181179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.model.d f181180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.model.d f181181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f181182i;

    @ij.a
    public p(@NotNull i builtInDataManager, @NotNull n dataManager, @NotNull com.planner5d.library.model.manager.config.p preferences) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f181176c = builtInDataManager;
        this.f181177d = dataManager;
        this.f181178e = preferences;
        this.f181179f = new LinkedHashMap();
    }

    @m1
    private final void f() throws Throwable {
        com.planner5d.library.model.d dVar;
        if (this.f181182i) {
            return;
        }
        try {
            if (this.f181178e.s(com.planner5d.library.services.r.datafiles)) {
                h();
            } else {
                com.planner5d.library.model.d dVarI = i();
                if (dVarI != null) {
                    synchronized (this.f181179f) {
                        try {
                            this.f181179f.put(dVarI.f180677a, dVarI);
                            this.f181180g = dVarI;
                            Unit unit = Unit.f312394a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
        }
        try {
            String strQ = this.f181176c.Q(i.a.BuiltIn);
            if (strQ != null) {
                synchronized (this.f181179f) {
                    try {
                        if (this.f181179f.get(strQ) == null) {
                            this.f181179f.put(strQ, new com.planner5d.library.model.d(strQ, new String[]{com.planner5d.library.api.f.a().a(strQ)}, com.planner5d.library.services.utility.e0.d(this.f181176c.N(true))));
                        }
                        dVar = this.f181179f.get(strQ);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                dVar = null;
            }
            this.f181181h = dVar;
        } catch (Exception e11) {
            timber.log.b.f381052a.e(e11);
        }
        this.f181182i = true;
        j();
    }

    @m1
    private final void h() {
        com.planner5d.library.model.d dVar;
        com.planner5d.library.model.manager.config.p pVar = this.f181178e;
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.datafiles;
        String strW = pVar.w(rVar, null);
        JSONObject jSONObject = strW != null ? new JSONObject(strW) : new JSONObject();
        synchronized (this.f181179f) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    com.planner5d.library.model.d dVar2 = new com.planner5d.library.model.d(jSONArray.getJSONObject(i10));
                    this.f181179f.put(dVar2.f180677a, dVar2);
                }
                com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.current;
                if (jSONObject.has(rVar2.f224891a) && (dVar = this.f181179f.get(jSONObject.getString(rVar2.f224891a))) != null) {
                    this.f181180g = dVar;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    private final com.planner5d.library.model.d i() throws Throwable {
        String strW = this.f181178e.w(com.planner5d.library.services.r.databaseCurrent, null);
        if (strW != null) {
            return new com.planner5d.library.model.d(new JSONObject(strW));
        }
        return null;
    }

    @m1
    private final void j() {
        JSONObject jSONObject = new JSONObject();
        try {
            synchronized (this.f181179f) {
                try {
                    String str = com.planner5d.library.services.r.datafiles.f224891a;
                    JSONArray jSONArray = new JSONArray();
                    Iterator<Map.Entry<String, com.planner5d.library.model.d>> it = this.f181179f.entrySet().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().getValue().b());
                    }
                    Unit unit = Unit.f312394a;
                    jSONObject.put(str, jSONArray);
                    String str2 = com.planner5d.library.services.r.current.f224891a;
                    com.planner5d.library.model.d dVar = this.f181180g;
                    jSONObject.put(str2, dVar != null ? dVar.f180677a : null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f181178e.H(com.planner5d.library.services.r.datafiles, jSONObject.toString());
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
        }
    }

    @m1
    @Nullable
    public final com.planner5d.library.model.d a() {
        f();
        return this.f181181h;
    }

    @m1
    @Nullable
    public final com.planner5d.library.model.d b() {
        com.planner5d.library.model.d dVar;
        f();
        synchronized (this.f181179f) {
            try {
                dVar = this.f181180g;
                if (dVar == null) {
                    dVar = this.f181181h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @NotNull
    public final com.planner5d.library.services.download.g[] c(@NotNull com.planner5d.library.model.d datafile, @NotNull ManagedFile file) {
        Intrinsics.checkNotNullParameter(datafile, "datafile");
        Intrinsics.checkNotNullParameter(file, "file");
        String strH = this.f181177d.h(file.path);
        Intrinsics.checkNotNullExpressionValue(strH, "getAssetPath(...)");
        return d(datafile, strH);
    }

    @NotNull
    public final com.planner5d.library.services.download.g[] d(@NotNull com.planner5d.library.model.d datafile, @NotNull String path) {
        com.planner5d.library.model.d dVar;
        com.planner5d.library.services.download.g[] gVarArrC;
        Intrinsics.checkNotNullParameter(datafile, "datafile");
        Intrinsics.checkNotNullParameter(path, "path");
        synchronized (this.f181179f) {
            try {
                dVar = this.f181179f.get(datafile.f180677a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (dVar == null || (gVarArrC = com.planner5d.library.services.download.o.f224287a.c(dVar, path)) == null) ? new com.planner5d.library.services.download.g[0] : gVarArrC;
    }

    @e.a({"ApplySharedPref"})
    @m1
    public final void k(@NotNull com.planner5d.library.model.d datafile) throws Throwable {
        Intrinsics.checkNotNullParameter(datafile, "datafile");
        f();
        synchronized (this.f181179f) {
            try {
                this.f181179f.put(datafile.f180677a, datafile);
                this.f181180g = datafile;
                String str = datafile.f180677a;
                com.planner5d.library.model.d dVar = this.f181181h;
                if (Intrinsics.areEqual(str, dVar != null ? dVar.f180677a : null)) {
                    this.f181181h = datafile;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j();
        this.f181176c.A0().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    @m1
    public final void l(@NotNull com.planner5d.library.model.d datafile) {
        Intrinsics.checkNotNullParameter(datafile, "datafile");
        synchronized (this.f181179f) {
            try {
                this.f181179f.put(datafile.f180677a, datafile);
                String str = datafile.f180677a;
                com.planner5d.library.model.d dVar = this.f181180g;
                if (Intrinsics.areEqual(str, dVar != null ? dVar.f180677a : null)) {
                    this.f181180g = datafile;
                }
                String str2 = datafile.f180677a;
                com.planner5d.library.model.d dVar2 = this.f181181h;
                if (Intrinsics.areEqual(str2, dVar2 != null ? dVar2.f180677a : null)) {
                    this.f181181h = datafile;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j();
    }
}
