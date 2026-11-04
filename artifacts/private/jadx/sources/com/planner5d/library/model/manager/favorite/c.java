package com.planner5d.library.model.manager.favorite;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.h;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.config.q;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.t;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.text.StringsKt;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@l(message = "Can be dropped when there are no app versions with this type of storage left installed", replaceWith = @b1(expression = "FavoriteMarkDao", imports = {}))
@SourceDebugExtension({"SMAP\nSharedPreferencesManagerLocalFavoriteStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesManagerLocalFavoriteStorage.kt\ncom/planner5d/library/model/manager/favorite/SharedPreferencesManagerLocalFavoriteStorage\n*L\n1#1,54:1\n24#1:55\n24#1:56\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesManagerLocalFavoriteStorage.kt\ncom/planner5d/library/model/manager/favorite/SharedPreferencesManagerLocalFavoriteStorage\n*L\n30#1:55\n40#1:56\n*E\n"})
public final class c implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f191418d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f191419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f191420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f191421c;

    @f(c = "com.planner5d.library.model.manager.favorite.SharedPreferencesManagerLocalFavoriteStorage$dropAllFavoriteMarks$2", f = "SharedPreferencesManagerLocalFavoriteStorage.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"transaction"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSharedPreferencesManagerLocalFavoriteStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesManagerLocalFavoriteStorage.kt\ncom/planner5d/library/model/manager/favorite/SharedPreferencesManagerLocalFavoriteStorage$dropAllFavoriteMarks$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1863#2,2:55\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesManagerLocalFavoriteStorage.kt\ncom/planner5d/library/model/manager/favorite/SharedPreferencesManagerLocalFavoriteStorage$dropAllFavoriteMarks$2\n*L\n42#1:55,2\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f191423b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191423b;
            if (i10 == 0) {
                ResultKt.m(obj);
                q qVarE = c.this.f191419a.E();
                p pVar = c.this.f191419a;
                this.f191422a = qVarE;
                this.f191423b = 1;
                Object objZ = pVar.z(this);
                if (objZ == objL) {
                    return objL;
                }
                qVar = qVarE;
                obj = objZ;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.f191422a;
                ResultKt.m(obj);
            }
            c cVar = c.this;
            for (String str : (Iterable) obj) {
                if (StringsKt.u2(str, cVar.f191421c, false, 2, null)) {
                    qVar.remove(str);
                }
            }
            qVar.b();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @f(c = "com.planner5d.library.model.manager.favorite.SharedPreferencesManagerLocalFavoriteStorage", f = "SharedPreferencesManagerLocalFavoriteStorage.kt", i = {0}, l = {27}, m = "isMarkedAsFavorite", n = {"itemId"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191426b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191428d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191426b = obj;
            this.f191428d |= Integer.MIN_VALUE;
            return c.this.b(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.favorite.c$c, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.model.manager.favorite.SharedPreferencesManagerLocalFavoriteStorage$updateAllFavorites$2", f = "SharedPreferencesManagerLocalFavoriteStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1593c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191429a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f191431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.f f191432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<String> f191433e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1593c(id.a aVar, com.planner5d.library.database.model.f fVar, Set<String> set, kotlin.coroutines.d<? super C1593c> dVar) {
            super(2, dVar);
            this.f191431c = aVar;
            this.f191432d = fVar;
            this.f191433e = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new C1593c(this.f191431c, this.f191432d, this.f191433e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191429a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c.this.f191419a.e(c.this.f(x.a(this.f191431c), this.f191432d), this.f191433e);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1593c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c(@NotNull p preferences, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f191419a = preferences;
        this.f191420b = coroutineDispatchers;
        this.f191421c = r.favorites.f224891a + "_";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(long j10, com.planner5d.library.database.model.f fVar) {
        return this.f191421c + fVar + "_" + j10;
    }

    private final n0 h() {
        return this.f191420b.h();
    }

    @Override // com.planner5d.library.database.model.h
    @Nullable
    public Object a(@Nullable id.a aVar, @NotNull com.planner5d.library.database.model.f fVar, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = i.h(this.f191420b.h(), new C1593c(aVar, fVar, set, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.planner5d.library.database.model.h
    @Nullable
    public Object b(@Nullable id.a aVar, @NotNull com.planner5d.library.database.model.f fVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f191428d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f191428d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objQ = bVar.f191426b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f191428d;
        if (i11 == 0) {
            ResultKt.m(objQ);
            p pVar = this.f191419a;
            String strF = f(x.a(aVar), fVar);
            Set<String> setEmptySet = SetsKt.emptySet();
            bVar.f191425a = str;
            bVar.f191428d = 1;
            objQ = pVar.q(strF, setEmptySet, bVar);
            if (objQ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f191425a;
            ResultKt.m(objQ);
        }
        return kotlin.coroutines.jvm.internal.b.a(((Set) objQ).contains(str));
    }

    @Nullable
    public final Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = i.h(this.f191420b.h(), new a(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
