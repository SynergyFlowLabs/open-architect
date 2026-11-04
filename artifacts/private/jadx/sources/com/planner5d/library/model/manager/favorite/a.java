package com.planner5d.library.model.manager.favorite;

import android.security.keystore.UserNotAuthenticatedException;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.e3;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nFavoritesRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoritesRepository.kt\ncom/planner5d/library/model/manager/favorite/FavoritesRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SuspendSynchronizedMap.kt\ncom/planner5d/library/services/utility/SuspendSynchronizedMap$GetOrPutResult\n*L\n1#1,200:1\n70#1,4:206\n70#1,4:210\n70#1,4:214\n1#2:201\n27#3,4:202\n*S KotlinDebug\n*F\n+ 1 FavoritesRepository.kt\ncom/planner5d/library/model/manager/favorite/FavoritesRepository\n*L\n171#1:206,4\n175#1:210,4\n182#1:214,4\n95#1:202,4\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f191355e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f191356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.model.h f191357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f191358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final e3<C1592a, Boolean> f191359d;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.favorite.a$a, reason: collision with other inner class name */
    private static final class C1592a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final id.a f191360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.database.model.f f191361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f191362c;

        public C1592a(@Nullable id.a aVar, @NotNull com.planner5d.library.database.model.f type, @NotNull String itemId) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            this.f191360a = aVar;
            this.f191361b = type;
            this.f191362c = itemId;
        }

        public static /* synthetic */ C1592a e(C1592a c1592a, id.a aVar, com.planner5d.library.database.model.f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = c1592a.f191360a;
            }
            if ((i10 & 2) != 0) {
                fVar = c1592a.f191361b;
            }
            if ((i10 & 4) != 0) {
                str = c1592a.f191362c;
            }
            return c1592a.d(aVar, fVar, str);
        }

        @Nullable
        public final id.a a() {
            return this.f191360a;
        }

        @NotNull
        public final com.planner5d.library.database.model.f b() {
            return this.f191361b;
        }

        @NotNull
        public final String c() {
            return this.f191362c;
        }

        @NotNull
        public final C1592a d(@Nullable id.a aVar, @NotNull com.planner5d.library.database.model.f type, @NotNull String itemId) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            return new C1592a(aVar, type, itemId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1592a)) {
                return false;
            }
            C1592a c1592a = (C1592a) obj;
            return Intrinsics.areEqual(this.f191360a, c1592a.f191360a) && this.f191361b == c1592a.f191361b && Intrinsics.areEqual(this.f191362c, c1592a.f191362c);
        }

        @NotNull
        public final String f() {
            return this.f191362c;
        }

        @NotNull
        public final com.planner5d.library.database.model.f g() {
            return this.f191361b;
        }

        @Nullable
        public final id.a h() {
            return this.f191360a;
        }

        public int hashCode() {
            id.a aVar = this.f191360a;
            return ((((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f191361b.hashCode()) * 31) + this.f191362c.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActionKey(user=" + this.f191360a + ", type=" + this.f191361b + ", itemId=" + this.f191362c + ")";
        }
    }

    public enum b {
        ADDED_TO_FAVORITES,
        REMOVED_FROM_FAVORITES,
        IGNORED_BECAUSE_ONGOING_TO_FAVORITES,
        IGNORED_BECAUSE_ONGOING_FROM_FAVORITES;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f191368f = kotlin.enums.c.c(k());

        static {
            int i10 = 5 << 2;
        }

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f191368f;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191369a;

        static {
            int[] iArr = new int[com.planner5d.library.database.model.f.values().length];
            try {
                iArr[com.planner5d.library.database.model.f.GALLERY_PROJECTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.database.model.f.GALLERY_SNAPSHOTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f191369a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.favorite.FavoritesRepository", f = "FavoritesRepository.kt", i = {0, 0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160705l0, com.planner5d.library.engine.input.f.b.f160717p0}, m = "isFavorite", n = {"this", "type", "itemId", "currentUser"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f191373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f191374e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f191376g;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191374e = obj;
            this.f191376g |= Integer.MIN_VALUE;
            return a.this.g(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.favorite.FavoritesRepository", f = "FavoritesRepository.kt", i = {0}, l = {132}, m = "refreshFavoritesData", n = {"this"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191378b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191380d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191378b = obj;
            this.f191380d |= Integer.MIN_VALUE;
            return a.this.h(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.favorite.FavoritesRepository$refreshFavoritesData$2", f = "FavoritesRepository.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f191382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191383c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f191385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.f f191386f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(id.a aVar, com.planner5d.library.database.model.f fVar, kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
            this.f191385e = aVar;
            this.f191386f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191381a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f191382b;
                id.a aVar = (id.a) this.f191383c;
                if (aVar == null) {
                    throw new UserNotAuthenticatedException("Cannot refresh favorites for not authenticated user");
                }
                com.planner5d.library.database.model.h hVar = a.this.f191357b;
                id.a aVar2 = this.f191385e;
                com.planner5d.library.database.model.f fVar = this.f191386f;
                Set<String> setE = a.this.e(bVar, aVar, fVar);
                this.f191382b = null;
                this.f191381a = 1;
                if (hVar.a(aVar2, fVar, setE, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            f fVar = a.this.new f(this.f191385e, this.f191386f, dVar);
            fVar.f191382b = bVar;
            fVar.f191383c = aVar;
            return fVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.favorite.FavoritesRepository", f = "FavoritesRepository.kt", i = {0, 0, 0}, l = {118, 121}, m = "setFavorite", n = {"this", "actionKey", "favorite"}, s = {"L$0", "L$1", "Z$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f191389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191390d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191392f;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191390d = obj;
            this.f191392f |= Integer.MIN_VALUE;
            return a.this.i(null, null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.favorite.FavoritesRepository", f = "FavoritesRepository.kt", i = {0, 0}, l = {146, 160, 160}, m = "syncAndSaveFavorite", n = {"this", "actionKey"}, s = {"L$0", "L$1"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191395c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191397e;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191395c = obj;
            this.f191397e |= Integer.MIN_VALUE;
            return a.this.k(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.favorite.FavoritesRepository$syncAndSaveFavorite$2", f = "FavoritesRepository.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f191399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191400c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1592a f191402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f191403f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C1592a c1592a, boolean z10, kotlin.coroutines.d<? super i> dVar) {
            super(3, dVar);
            this.f191402e = c1592a;
            this.f191403f = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191398a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f191399b;
                id.a aVar = (id.a) this.f191400c;
                if (aVar == null) {
                    throw new UserNotAuthenticatedException("Cannot synchronize favorites for not authenticated user");
                }
                a.this.j(bVar, aVar, this.f191402e.g(), this.f191402e.f(), this.f191403f);
                Set<String> setE = a.this.e(bVar, aVar, this.f191402e.g());
                if (this.f191403f != setE.contains(this.f191402e.f())) {
                    throw new IllegalStateException();
                }
                com.planner5d.library.database.model.h hVar = a.this.f191357b;
                id.a aVarH = this.f191402e.h();
                com.planner5d.library.database.model.f fVarG = this.f191402e.g();
                this.f191399b = null;
                this.f191398a = 1;
                if (hVar.a(aVarH, fVarG, setE, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            i iVar = a.this.new i(this.f191402e, this.f191403f, dVar);
            iVar.f191399b = bVar;
            iVar.f191400c = aVar;
            return iVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.favorite.FavoritesRepository", f = "FavoritesRepository.kt", i = {0, 0, 1}, l = {com.planner5d.library.engine.input.f.b.f160703k1, 102}, m = "toggleFavorite", n = {"this", "actionKey", "targetFavoriteFlag"}, s = {"L$0", "L$1", "Z$0"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f191406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191407d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191409f;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191407d = obj;
            this.f191409f |= Integer.MIN_VALUE;
            return a.this.m(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.favorite.FavoritesRepository$toggleFavorite$targetFavoriteFlag$1", f = "FavoritesRepository.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160703k1}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends o implements Function1<kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191410a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f191412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.f f191413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f191414e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(id.a aVar, com.planner5d.library.database.model.f fVar, String str, kotlin.coroutines.d<? super k> dVar) {
            super(1, dVar);
            this.f191412c = aVar;
            this.f191413d = fVar;
            this.f191414e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return a.this.new k(this.f191412c, this.f191413d, this.f191414e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191410a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.model.h hVar = a.this.f191357b;
                id.a aVar = this.f191412c;
                com.planner5d.library.database.model.f fVar = this.f191413d;
                String str = this.f191414e;
                this.f191410a = 1;
                obj = hVar.b(aVar, fVar, str, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(!((Boolean) obj).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Boolean> dVar) {
            return ((k) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public a(@NotNull t userAuthorization, @NotNull com.planner5d.library.database.model.h localStorage, @NotNull com.planner5d.library.api.requests.c api) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(api, "api");
        this.f191356a = userAuthorization;
        this.f191357b = localStorage;
        this.f191358c = api;
        this.f191359d = new e3<>(new LinkedHashMap(), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final Set<String> e(com.planner5d.library.api.b bVar, id.a aVar, com.planner5d.library.database.model.f fVar) throws Exception {
        String str;
        int i10 = c.f191369a[fVar.ordinal()];
        if (i10 == 1) {
            str = "/gallery/floorplans/";
        } else {
            if (i10 != 2) {
                throw new k0();
            }
            str = "/gallery/ideas/";
        }
        JSONArray jSONArray = bVar.G0(aVar, str).a().getJSONArray(r.items.f224891a);
        Set setCreateSetBuilder = SetsKt.createSetBuilder(jSONArray.length());
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            String string = jSONArray.getJSONObject(i11).getString(r.cid.f224891a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            setCreateSetBuilder.add(string);
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    private final String f(com.planner5d.library.database.model.f fVar) {
        int i10 = c.f191369a[fVar.ordinal()];
        if (i10 == 1) {
            return "/gallery/floorplans/";
        }
        if (i10 == 2) {
            return "/gallery/ideas/";
        }
        throw new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final void j(com.planner5d.library.api.b bVar, id.a aVar, com.planner5d.library.database.model.f fVar, String str, boolean z10) throws Exception {
        String str2 = "/gallery/floorplans/";
        if (!z10) {
            int i10 = c.f191369a[fVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new k0();
                }
                str2 = "/gallery/ideas/";
            }
            bVar.n0(aVar, str, str2);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r.cid.f224891a, str);
        String str3 = r.path.f224891a;
        int i11 = c.f191369a[fVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new k0();
            }
            str2 = "/gallery/ideas/";
        }
        jSONObject.put(str3, str2);
        Unit unit = Unit.f312394a;
        bVar.Y(aVar, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r14.d(r1, r7) == r2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.planner5d.library.model.manager.favorite.a.C1592a r15, boolean r16, kotlin.coroutines.d<? super kotlin.Unit> r17) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r17
            boolean r2 = r0 instanceof com.planner5d.library.model.manager.favorite.a.h
            if (r2 == 0) goto L16
            r2 = r0
            com.planner5d.library.model.manager.favorite.a$h r2 = (com.planner5d.library.model.manager.favorite.a.h) r2
            int r3 = r2.f191397e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f191397e = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            com.planner5d.library.model.manager.favorite.a$h r2 = new com.planner5d.library.model.manager.favorite.a$h
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f191395c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r7.f191397e
            r10 = 3
            r11 = 2
            r4 = 1
            r12 = 0
            if (r3 == 0) goto L60
            if (r3 == r4) goto L45
            if (r3 == r11) goto L41
            if (r3 == r10) goto L38
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L38:
            java.lang.Object r14 = r7.f191393a
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            kotlin.ResultKt.m(r0)
            goto Lb9
        L41:
            kotlin.ResultKt.m(r0)
            goto L93
        L45:
            java.lang.Object r14 = r7.f191394b
            com.planner5d.library.model.manager.favorite.a$a r14 = (com.planner5d.library.model.manager.favorite.a.C1592a) r14
            java.lang.Object r1 = r7.f191393a
            com.planner5d.library.model.manager.favorite.a r1 = (com.planner5d.library.model.manager.favorite.a) r1
            kotlin.ResultKt.m(r0)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L5a
            r13 = r1
            r1 = r14
            r14 = r13
            r14 = r13
            goto L84
        L55:
            r0 = move-exception
            r13 = r0
            r0 = r14
            r14 = r13
            goto Laa
        L5a:
            r0 = move-exception
            r13 = r1
            r1 = r14
            r14 = r13
            r14 = r13
            goto L9f
        L60:
            kotlin.ResultKt.m(r0)
            com.planner5d.library.api.requests.c r3 = r14.f191358c     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9d
            id.a r0 = r15.h()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9d
            com.planner5d.library.model.manager.favorite.a$i r6 = new com.planner5d.library.model.manager.favorite.a$i     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9d
            r5 = r16
            r5 = r16
            r6.<init>(r15, r5, r12)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9d
            r7.f191393a = r14     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9d
            r7.f191394b = r15     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9d
            r7.f191397e = r4     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9d
            r5 = 0
            r8 = 2
            r9 = 0
            r4 = r0
            java.lang.Object r0 = com.planner5d.library.api.requests.c.g(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9d
            if (r0 != r2) goto L83
            goto Lb8
        L83:
            r1 = r15
        L84:
            com.planner5d.library.services.utility.e3<com.planner5d.library.model.manager.favorite.a$a, java.lang.Boolean> r14 = r14.f191359d
            r7.f191393a = r12
            r7.f191394b = r12
            r7.f191397e = r11
            java.lang.Object r14 = r14.d(r1, r7)
            if (r14 != r2) goto L93
            goto Lb8
        L93:
            kotlin.Unit r14 = kotlin.Unit.f312394a
            return r14
        L96:
            r0 = move-exception
            r1 = r14
            r1 = r14
            r14 = r0
            r0 = r15
            r0 = r15
            goto Laa
        L9d:
            r0 = move-exception
            r1 = r15
        L9f:
            com.planner5d.library.services.exceptions.ErrorMessageException r0 = r14.l(r0)     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> La4
        La4:
            r0 = move-exception
            r13 = r1
            r1 = r14
            r1 = r14
            r14 = r0
            r0 = r13
        Laa:
            com.planner5d.library.services.utility.e3<com.planner5d.library.model.manager.favorite.a$a, java.lang.Boolean> r1 = r1.f191359d
            r7.f191393a = r14
            r7.f191394b = r12
            r7.f191397e = r10
            java.lang.Object r0 = r1.d(r0, r7)
            if (r0 != r2) goto Lb9
        Lb8:
            return r2
        Lb9:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.favorite.a.k(com.planner5d.library.model.manager.favorite.a$a, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    private final ErrorMessageException l(Exception exc) {
        com.planner5d.library.api.c cVarB;
        return new ErrorMessageException((((exc instanceof com.planner5d.library.api.e) || (exc instanceof JSONException)) && ((cVarB = com.planner5d.library.api.d.f142250b.b(exc)) == null || !cVarB.h())) ? com.planner5d.library.f.s.I9 : com.planner5d.library.f.s.Ka, new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object g(@NotNull com.planner5d.library.database.model.f fVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        d dVar2;
        id.a aVarA;
        Object objA;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f191376g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f191376g = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f191374e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f191376g;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVarA = this.f191356a.a();
            e3<C1592a, Boolean> e3Var = this.f191359d;
            C1592a c1592a = new C1592a(aVarA, fVar, str);
            dVar2.f191370a = this;
            dVar2.f191371b = fVar;
            dVar2.f191372c = str;
            dVar2.f191373d = aVarA;
            dVar2.f191376g = 1;
            objA = e3Var.a(c1592a, dVar2);
            if (objA != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        id.a aVar = (id.a) dVar2.f191373d;
        str = (String) dVar2.f191372c;
        fVar = (com.planner5d.library.database.model.f) dVar2.f191371b;
        a aVar2 = (a) dVar2.f191370a;
        ResultKt.m(obj);
        aVarA = aVar;
        this = aVar2;
        objA = obj;
        Boolean bool = (Boolean) objA;
        if (bool != null) {
            return kotlin.coroutines.jvm.internal.b.a(bool.booleanValue());
        }
        com.planner5d.library.database.model.h hVar = this.f191357b;
        dVar2.f191370a = null;
        dVar2.f191371b = null;
        dVar2.f191372c = null;
        dVar2.f191373d = null;
        dVar2.f191376g = 2;
        Object objB = hVar.b(aVarA, fVar, str, dVar2);
        return objB == objL ? objL : objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Unit] */
    @Nullable
    public final Object h(@NotNull com.planner5d.library.database.model.f fVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws ErrorMessageException {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f191380d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f191380d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f191378b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar2.f191380d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                id.a aVarA = this.f191356a.a();
                com.planner5d.library.api.requests.c cVar = this.f191358c;
                f fVar2 = new f(aVarA, fVar, null);
                eVar2.f191377a = this;
                eVar2.f191380d = 1;
                int i12 = 0 | 2;
                if (com.planner5d.library.api.requests.c.g(cVar, aVarA, null, fVar2, eVar2, 2, null) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this = Unit.f312394a;
            return this;
        } catch (Exception e10) {
            throw this.l(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r7.k(r11, r10, r0) == r1) goto L25;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@org.jetbrains.annotations.NotNull com.planner5d.library.database.model.f r8, @org.jetbrains.annotations.NotNull java.lang.String r9, boolean r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r11) throws com.planner5d.library.services.exceptions.ErrorMessageException {
        /*
            r7 = this;
            r6 = 7
            boolean r0 = r11 instanceof com.planner5d.library.model.manager.favorite.a.g
            if (r0 == 0) goto L18
            r0 = r11
            r6 = 3
            com.planner5d.library.model.manager.favorite.a$g r0 = (com.planner5d.library.model.manager.favorite.a.g) r0
            r6 = 7
            int r1 = r0.f191392f
            r6 = 6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 7
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f191392f = r1
            goto L1d
        L18:
            com.planner5d.library.model.manager.favorite.a$g r0 = new com.planner5d.library.model.manager.favorite.a$g
            r0.<init>(r11)
        L1d:
            java.lang.Object r11 = r0.f191390d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 4
            int r2 = r0.f191392f
            r3 = 2
            r6 = 4
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L34
            r6 = 0
            kotlin.ResultKt.m(r11)
            goto L97
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            r6 = 3
            throw r7
        L3d:
            r6 = 1
            boolean r10 = r0.f191389c
            java.lang.Object r7 = r0.f191388b
            com.planner5d.library.model.manager.favorite.a$a r7 = (com.planner5d.library.model.manager.favorite.a.C1592a) r7
            java.lang.Object r8 = r0.f191387a
            com.planner5d.library.model.manager.favorite.a r8 = (com.planner5d.library.model.manager.favorite.a) r8
            kotlin.ResultKt.m(r11)
            r5 = r11
            r11 = r7
            r7 = r8
            r8 = r5
            goto L77
        L50:
            kotlin.ResultKt.m(r11)
            com.planner5d.library.model.manager.favorite.a$a r11 = new com.planner5d.library.model.manager.favorite.a$a
            com.planner5d.library.modules.user.user.t r2 = r7.f191356a
            id.a r2 = r2.a()
            r11.<init>(r2, r8, r9)
            com.planner5d.library.services.utility.e3<com.planner5d.library.model.manager.favorite.a$a, java.lang.Boolean> r8 = r7.f191359d
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r10)
            r0.f191387a = r7
            r0.f191388b = r11
            r6 = 2
            r0.f191389c = r10
            r6 = 3
            r0.f191392f = r4
            r6 = 4
            java.lang.Object r8 = r8.c(r11, r9, r0)
            if (r8 != r1) goto L77
            r6 = 5
            goto L96
        L77:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r6 = 0
            if (r8 != 0) goto L86
            r7 = 0
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        L86:
            r6 = 5
            r8 = 0
            r0.f191387a = r8
            r0.f191388b = r8
            r6 = 1
            r0.f191392f = r3
            java.lang.Object r7 = r7.k(r11, r10, r0)
            r6 = 1
            if (r7 != r1) goto L97
        L96:
            return r1
        L97:
            r6 = 6
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.favorite.a.i(com.planner5d.library.database.model.f, java.lang.String, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object m(@NotNull com.planner5d.library.database.model.f fVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super b> dVar) throws ErrorMessageException {
        j jVar;
        C1592a c1592a;
        Object obj;
        a aVar;
        boolean z10;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f191409f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f191409f = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj2 = jVar.f191407d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f191409f;
        if (i11 != 0) {
            if (i11 == 1) {
                C1592a c1592a2 = (C1592a) jVar.f191405b;
                a aVar2 = (a) jVar.f191404a;
                ResultKt.m(obj2);
                c1592a = c1592a2;
                aVar = aVar2;
                obj = obj2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = jVar.f191406c;
                ResultKt.m(obj2);
            }
            return z10 ? b.ADDED_TO_FAVORITES : b.REMOVED_FROM_FAVORITES;
        }
        ResultKt.m(obj2);
        id.a aVarA = this.f191356a.a();
        c1592a = new C1592a(aVarA, fVar, str);
        e3<C1592a, Boolean> e3Var = this.f191359d;
        k kVar = new k(aVarA, fVar, str, null);
        jVar.f191404a = this;
        jVar.f191405b = c1592a;
        jVar.f191409f = 1;
        Object objB = e3Var.b(c1592a, kVar, jVar);
        if (objB != objL) {
            obj = objB;
            aVar = this;
        }
        return objL;
        e3.a aVar3 = (e3.a) obj;
        if (aVar3 instanceof e3.a.C1687a) {
            return ((Boolean) ((e3.a.C1687a) aVar3).b()).booleanValue() ? b.IGNORED_BECAUSE_ONGOING_TO_FAVORITES : b.IGNORED_BECAUSE_ONGOING_FROM_FAVORITES;
        }
        if (!(aVar3 instanceof e3.a.b)) {
            throw new k0();
        }
        boolean zBooleanValue = ((Boolean) ((e3.a.b) aVar3).b()).booleanValue();
        jVar.f191404a = null;
        jVar.f191405b = null;
        jVar.f191406c = zBooleanValue;
        jVar.f191409f = 2;
        if (aVar.k(c1592a, zBooleanValue, jVar) != objL) {
            z10 = zBooleanValue;
            if (z10) {
            }
        }
        return objL;
    }
}
