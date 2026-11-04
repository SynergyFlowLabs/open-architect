package com.planner5d.library.database.model;

import androidx.annotation.l1;
import androidx.room.o2;
import androidx.room.x0;
import com.planner5d.library.modules.user.user.x;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@androidx.room.l
@SourceDebugExtension({"SMAP\nFavoriteMarkDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteMarkDao.kt\ncom/planner5d/library/database/model/FavoriteMarkDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1863#2,2:48\n*S KotlinDebug\n*F\n+ 1 FavoriteMarkDao.kt\ncom/planner5d/library/database/model/FavoriteMarkDao\n*L\n19#1:48,2\n*E\n"})
public abstract class c implements h {

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.model.FavoriteMarkDao", f = "FavoriteMarkDao.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {18, 20}, m = "updateAllFavorites$suspendImpl", n = {"$this", "user", "type", "itemIdsToBeFavorite", "$this", "user", "type"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f154107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f154108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f154109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f154110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f154111e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f154113g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154111e = obj;
            this.f154113g |= Integer.MIN_VALUE;
            return c.h(c.this, null, null, null, this);
        }
    }

    static /* synthetic */ Object f(c cVar, id.a aVar, f fVar, String str, kotlin.coroutines.d<? super Boolean> dVar) {
        return cVar.d(x.a(aVar), fVar.l(), str, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:0: B:23:0x00a4->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @o2
    static /* synthetic */ Object h(c cVar, id.a aVar, f fVar, Set<String> set, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar2;
        c cVar2;
        Set<String> set2;
        id.a aVar3;
        f fVar2;
        c cVar3;
        Iterator it;
        String str;
        long jA;
        int iL;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i10 = aVar2.f154113g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f154113g = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = cVar.new a(dVar);
            }
        } else {
            aVar2 = cVar.new a(dVar);
        }
        a aVar4 = aVar2;
        Object obj = aVar4.f154111e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar4.f154113g;
        if (i11 == 0) {
            ResultKt.m(obj);
            long jA2 = x.a(aVar);
            int iL2 = fVar.l();
            aVar4.f154107a = cVar;
            aVar4.f154108b = aVar;
            aVar4.f154109c = fVar;
            aVar4.f154110d = set;
            aVar4.f154113g = 1;
            if (cVar.g(jA2, iL2, set, aVar4) != objL) {
                cVar2 = cVar;
                set2 = set;
            }
            return objL;
        }
        if (i11 == 1) {
            set2 = (Set) aVar4.f154110d;
            fVar = (f) aVar4.f154109c;
            aVar = (id.a) aVar4.f154108b;
            cVar2 = (c) aVar4.f154107a;
            ResultKt.m(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aVar4.f154110d;
            fVar2 = (f) aVar4.f154109c;
            aVar3 = (id.a) aVar4.f154108b;
            c cVar4 = (c) aVar4.f154107a;
            ResultKt.m(obj);
            cVar3 = cVar4;
        }
        while (it.hasNext()) {
            str = (String) it.next();
            jA = x.a(aVar3);
            iL = fVar2.l();
            aVar4.f154107a = cVar3;
            aVar4.f154108b = aVar3;
            aVar4.f154109c = fVar2;
            aVar4.f154110d = it;
            aVar4.f154113g = 2;
            if (cVar3.e(jA, iL, str, aVar4) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
        f fVar3 = fVar;
        aVar3 = aVar;
        fVar2 = fVar3;
        cVar3 = cVar2;
        it = set2.iterator();
        while (it.hasNext()) {
            str = (String) it.next();
            jA = x.a(aVar3);
            iL = fVar2.l();
            aVar4.f154107a = cVar3;
            aVar4.f154108b = aVar3;
            aVar4.f154109c = fVar2;
            aVar4.f154110d = it;
            aVar4.f154113g = 2;
            if (cVar3.e(jA, iL, str, aVar4) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.database.model.h
    @o2
    @Nullable
    public Object a(@Nullable id.a aVar, @NotNull f fVar, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return h(this, aVar, fVar, set, dVar);
    }

    @Override // com.planner5d.library.database.model.h
    @Nullable
    public Object b(@Nullable id.a aVar, @NotNull f fVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return f(this, aVar, fVar, str, dVar);
    }

    @x0("SELECT * FROM favorite_marks")
    @l1
    @Nullable
    public abstract Object c(@NotNull kotlin.coroutines.d<? super List<b>> dVar);

    @x0("SELECT EXISTS (SELECT 1 FROM favorite_marks WHERE user_id = :userId AND favorite_type = :typeCode AND item_id = :itemId)")
    @Nullable
    protected abstract Object d(long j10, int i10, @NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @x0("INSERT OR IGNORE INTO favorite_marks (user_id, favorite_type, item_id) VALUES (:userId, :typeCode, :itemId)")
    @Nullable
    protected abstract Object e(long j10, int i10, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @x0("DELETE FROM favorite_marks WHERE user_id = :userId AND favorite_type = :typeCode AND item_id NOT IN (:itemIdsToBeFavorite)")
    @Nullable
    protected abstract Object g(long j10, int i10, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
