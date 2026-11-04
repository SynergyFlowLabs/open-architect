package com.planner5d.library.model.manager.config.sql;

import android.database.sqlite.SQLiteBlobTooBigException;
import androidx.annotation.l1;
import androidx.annotation.m1;
import androidx.room.i0;
import androidx.room.x0;
import com.planner5d.library.services.utility.x2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.room.l
@SourceDebugExtension({"SMAP\nSqlSharedPreferencesDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesDao.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1611#2,9:110\n1863#2:119\n1864#2:121\n1620#2:122\n1#3:120\n*S KotlinDebug\n*F\n+ 1 SqlSharedPreferencesDao.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesDao\n*L\n62#1:110,9\n62#1:119\n62#1:121\n62#1:122\n62#1:120\n*E\n"})
public abstract class e implements o {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List p(e eVar, List list, Function2 function2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAllRecordsBlockingSafely");
        }
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return eVar.o(list, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function2 function2, String str, SQLiteBlobTooBigException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function2 != null) {
            function2.invoke(str, it);
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n s(e eVar, String str, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRecordByNameBlockingSafely");
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return eVar.r(str, function1);
    }

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("SELECT * FROM shared_preferences_records WHERE name = :name")
    @m1
    @Nullable
    public abstract n a(@NotNull String str);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("DELETE FROM shared_preferences_records WHERE name = :name")
    @m1
    public abstract void b(@NotNull String str);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("DELETE FROM shared_preferences_records WHERE name = :name")
    @Nullable
    public abstract Object c(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @m1
    @i0(onConflict = 1)
    public abstract void d(@NotNull n nVar);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("SELECT EXISTS(SELECT * FROM shared_preferences_records WHERE name = :name)")
    @Nullable
    public abstract Object e(@NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("DELETE FROM shared_preferences_records")
    @m1
    public abstract void f();

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("SELECT EXISTS(SELECT * FROM shared_preferences_records WHERE name = :name)")
    @m1
    public abstract boolean g(@NotNull String str);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("DELETE FROM shared_preferences_records")
    @Nullable
    public abstract Object h(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("SELECT * FROM shared_preferences_records WHERE name = :name")
    @Nullable
    public abstract Object i(@NotNull String str, @NotNull kotlin.coroutines.d<? super n> dVar);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @i0(onConflict = 1)
    @Nullable
    public abstract Object j(@NotNull n nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Override // com.planner5d.library.model.manager.config.sql.o
    @x0("SELECT name FROM shared_preferences_records")
    @Nullable
    public abstract Object k(@NotNull kotlin.coroutines.d<? super List<String>> dVar);

    @x0("SELECT name FROM shared_preferences_records WHERE name NOT IN (:ignoredNames)")
    @m1
    @NotNull
    protected abstract List<String> m(@NotNull List<String> list);

    @x0("SELECT * FROM shared_preferences_records WHERE name NOT IN (:ignoredRecords)")
    @m1
    @NotNull
    protected abstract List<n> n(@NotNull List<String> list);

    @m1
    @NotNull
    public final List<n> o(@NotNull List<String> ignoredRecords, @Nullable final Function2<? super String, ? super SQLiteBlobTooBigException, Unit> function2) {
        Intrinsics.checkNotNullParameter(ignoredRecords, "ignoredRecords");
        try {
            return n(ignoredRecords);
        } catch (SQLiteBlobTooBigException e10) {
            timber.log.b.f381052a.f(e10, "Could not load all records by standard means - trying extended methods", new Object[0]);
            List<String> listM = m(ignoredRecords);
            ArrayList arrayList = new ArrayList();
            for (final String str : listM) {
                n nVarR = r(str, new Function1() { // from class: com.planner5d.library.model.manager.config.sql.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e.q(function2, str, (SQLiteBlobTooBigException) obj);
                    }
                });
                if (nVarR != null) {
                    arrayList.add(nVarR);
                }
            }
            return arrayList;
        }
    }

    @l1
    @m1
    @Nullable
    public final n r(@NotNull String name, @Nullable Function1<? super SQLiteBlobTooBigException, Unit> function1) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return a(name);
        } catch (SQLiteBlobTooBigException e10) {
            timber.log.b.f381052a.f(e10, "Could not load a record at once - trying to read it sequentially: " + name, new Object[0]);
            if (function1 != null) {
                function1.invoke(e10);
            }
            Integer numT = t(name);
            if (numT == null) {
                return null;
            }
            int iIntValue = numT.intValue();
            byte[] bArr = new byte[iIntValue];
            int iA = x2.a.f229838a.a(1);
            for (int i10 = 0; i10 < iIntValue; i10 += iA) {
                byte[] bArrU = u(name, i10 + 1, iA);
                if (bArrU == null) {
                    return null;
                }
                ArraysKt.copyInto$default(bArrU, bArr, i10, 0, 0, 12, (Object) null);
            }
            return new n(name, bArr);
        }
    }

    @x0("SELECT length(value) FROM shared_preferences_records WHERE name = :name")
    @m1
    @Nullable
    protected abstract Integer t(@NotNull String str);

    @x0("SELECT substr(value, :start, :length) FROM shared_preferences_records WHERE name = :name")
    @m1
    @Nullable
    protected abstract byte[] u(@NotNull String str, int i10, int i11);
}
