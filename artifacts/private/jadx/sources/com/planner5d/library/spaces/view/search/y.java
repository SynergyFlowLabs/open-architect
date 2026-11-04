package com.planner5d.library.spaces.view.search;

import android.app.Application;
import android.location.Location;
import androidx.annotation.a1;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.navigation.c2;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.spaces.entity.AddressSearchResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class y extends f2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f230491m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f230492n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f230493o = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f230494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.c f230495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.a f230496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c4 f230497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.w f230498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.util.location.b f230499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private ArrayList<i> f230500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private ArrayList<i> f230501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<List<i>> f230502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<List<i>> f230503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f230504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private p2 f230505l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.search.SpacesSearchViewModel$searchByDeviceCoordinates$1", f = "SpacesSearchViewModel.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f230507b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            y yVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230507b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    y yVar2 = y.this;
                    com.planner5d.library.util.location.b bVar = yVar2.f230499f;
                    this.f230506a = yVar2;
                    this.f230507b = 1;
                    Object objA = bVar.a(this);
                    if (objA == objL) {
                        return objL;
                    }
                    yVar = yVar2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (y) this.f230506a;
                    ResultKt.m(obj);
                }
                yVar.z0((Location) obj);
            } catch (Throwable th2) {
                timber.log.b.f381052a.x("Could not get location: " + th2.getMessage(), new Object[0]);
                y.this.p0();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.search.SpacesSearchViewModel$searchByDeviceLocation$1", f = "SpacesSearchViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSpacesSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesSearchViewModel.kt\ncom/planner5d/library/spaces/view/search/SpacesSearchViewModel$searchByDeviceLocation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1557#2:187\n1628#2,3:188\n*S KotlinDebug\n*F\n+ 1 SpacesSearchViewModel.kt\ncom/planner5d/library/spaces/view/search/SpacesSearchViewModel$searchByDeviceLocation$1\n*L\n103#1:187\n103#1:188,3\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230509a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Location f230511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Location location, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f230511c = location;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y.this.new c(this.f230511c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            List listEmptyList;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230509a;
            int i11 = 4 << 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.spaces.data.a aVar = y.this.f230496c;
                double latitude = this.f230511c.getLatitude();
                double longitude = this.f230511c.getLongitude();
                this.f230509a = 1;
                cVar = this;
                obj = aVar.x(latitude, longitude, cVar);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                cVar = this;
            }
            List list = (List) obj;
            if (list != null) {
                List<AddressSearchResult> list2 = list;
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (AddressSearchResult addressSearchResult : list2) {
                    int iOrdinal = e.b.MyLocation.ordinal();
                    String strF = addressSearchResult.f();
                    String strF2 = addressSearchResult.f();
                    String strH = addressSearchResult.h();
                    if (strH == null) {
                        strH = "";
                    }
                    listEmptyList.add(new i(iOrdinal, strF, strF2, strH));
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (listEmptyList.isEmpty()) {
                y yVar = y.this;
                yVar.f230501h = CollectionsKt.arrayListOf(yVar.o0(), y.this.q0());
            } else {
                y yVar2 = y.this;
                yVar2.f230501h = CollectionsKt.arrayListOf(yVar2.o0());
                kotlin.coroutines.jvm.internal.b.a(y.this.f230501h.addAll(CollectionsKt.take(listEmptyList, 3)));
            }
            y.this.C0();
            y.this.i0().setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.search.SpacesSearchViewModel$searchByText$1", f = "SpacesSearchViewModel.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSpacesSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesSearchViewModel.kt\ncom/planner5d/library/spaces/view/search/SpacesSearchViewModel$searchByText$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1557#2:187\n1628#2,3:188\n*S KotlinDebug\n*F\n+ 1 SpacesSearchViewModel.kt\ncom/planner5d/library/spaces/view/search/SpacesSearchViewModel$searchByText$1\n*L\n65#1:187\n65#1:188,3\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f230513b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f230515d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f230515d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = y.this.new d(this.f230515d, dVar);
            dVar2.f230513b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            s0 s0Var;
            List listEmptyList;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230512a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var2 = (s0) this.f230513b;
                com.planner5d.library.spaces.data.a aVar = y.this.f230496c;
                String str = this.f230515d;
                this.f230513b = s0Var2;
                this.f230512a = 1;
                Object objZ = aVar.z(str, this);
                if (objZ == objL) {
                    return objL;
                }
                s0Var = s0Var2;
                obj = objZ;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s0Var = (s0) this.f230513b;
                ResultKt.m(obj);
            }
            List list = (List) obj;
            t0.j(s0Var);
            if (list != null) {
                List<AddressSearchResult> list2 = list;
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (AddressSearchResult addressSearchResult : list2) {
                    int iOrdinal = e.b.Address.ordinal();
                    String strF = addressSearchResult.f();
                    String strG = addressSearchResult.g();
                    String str2 = "";
                    if (strG == null) {
                        strG = "";
                    }
                    String strH = addressSearchResult.h();
                    if (strH != null) {
                        str2 = strH;
                    }
                    listEmptyList.add(new i(iOrdinal, strF, strG, str2));
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (listEmptyList.isEmpty()) {
                y.this.f230500g = new ArrayList();
            } else {
                y yVar = y.this;
                yVar.f230500g = CollectionsKt.arrayListOf(yVar.n0());
                kotlin.coroutines.jvm.internal.b.a(y.this.f230500g.addAll(listEmptyList));
            }
            y.this.C0();
            y.this.i0().setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public y(@NotNull Application application, @NotNull com.planner5d.library.services.utility.c appSystemSettingsLauncher, @NotNull com.planner5d.library.spaces.data.a addressRepository, @NotNull c4 statisticsEventSpaces, @NotNull com.planner5d.library.model.manager.w featureConfigManager, @NotNull com.planner5d.library.util.location.b locationManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(appSystemSettingsLauncher, "appSystemSettingsLauncher");
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f230494a = application;
        this.f230495b = appSystemSettingsLauncher;
        this.f230496c = addressRepository;
        this.f230497d = statisticsEventSpaces;
        this.f230498e = featureConfigManager;
        this.f230499f = locationManager;
        this.f230500g = new ArrayList<>();
        this.f230501h = new ArrayList<>();
        c1<List<i>> c1Var = new c1<>(this.f230501h);
        this.f230502i = c1Var;
        this.f230503j = c1Var;
        this.f230504k = b1.a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f230500g);
        arrayList.addAll(this.f230501h);
        this.f230502i.r(arrayList);
    }

    private final i m0(@f1 int i10) {
        int iOrdinal = e.b.Header.ordinal();
        String string = this.f230494a.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new i(iOrdinal, "", string, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i n0() {
        return m0(de.b.r.Us);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i o0() {
        return m0(de.b.r.Vs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        this.f230501h = CollectionsKt.arrayListOf(o0(), q0());
        C0();
        this.f230504k.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i q0() {
        return new i(e.b.NoAddress.ordinal(), "", "", "");
    }

    private final i r0() {
        return new i(e.b.NoLocationPermission.ordinal(), "", "", "");
    }

    private final i x0() {
        return new i(e.b.PickLocation.ordinal(), "", "", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(Location location) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(location, null), 3, null);
    }

    public final void A0(@Nullable String str) {
        if (str == null || str.length() == 0) {
            this.f230500g = new ArrayList<>();
            C0();
            return;
        }
        this.f230504k.setValue(Boolean.TRUE);
        p2 p2Var = this.f230505l;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f230505l = kotlinx.coroutines.k.f(g2.a(this), null, null, new d(str, null), 3, null);
    }

    public final void B0() {
        this.f230500g = new ArrayList<>();
        this.f230501h = CollectionsKt.arrayListOf(o0(), x0());
    }

    @NotNull
    public final androidx.lifecycle.w0<List<i>> h0() {
        return this.f230503j;
    }

    @NotNull
    public final k0<Boolean> i0() {
        return this.f230504k;
    }

    @NotNull
    public final c2 j0(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (this.f230498e.a(com.planner5d.library.model.manager.config.f.OnboardingNew)) {
            w.a aVarA = w.a(address);
            Intrinsics.checkNotNull(aVarA);
            return aVarA;
        }
        w.b bVarB = w.b(address);
        Intrinsics.checkNotNull(bVarB);
        return bVarB;
    }

    public final void k0() {
        if (this.f230495b.a()) {
            this.f230495b.b();
            this.f230501h = CollectionsKt.arrayListOf(o0(), x0());
            C0();
        }
    }

    public final boolean l0() {
        return androidx.core.content.d.a(this.f230494a, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.d.a(this.f230494a, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public final void s0() {
        this.f230501h = CollectionsKt.arrayListOf(o0(), r0());
        C0();
    }

    public final void t0(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        c4.b.a(this.f230497d, c4.a.select, c4.c.location_pick, address, null, 8, null);
    }

    public final void u0() {
        c4.b.a(this.f230497d, c4.a.open, c4.c.location_pick, null, null, 12, null);
    }

    public final void v0() {
        c4.b.a(this.f230497d, c4.a.back, c4.c.location_pick, null, null, 12, null);
    }

    public final void w0() {
        c4.b.a(this.f230497d, c4.a.pick_location, c4.c.location_pick, null, null, 12, null);
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final void y0() {
        this.f230504k.setValue(Boolean.TRUE);
        int i10 = 7 ^ 3;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(null), 3, null);
    }
}
