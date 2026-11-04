package com.planner5d.library.model.manager.config.sql;

import android.database.sqlite.SQLiteBlobTooBigException;
import androidx.annotation.m1;
import com.planner5d.library.services.utility.q3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nCachedSqlSharedPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedSqlSharedPreferencesStorage.kt\ncom/planner5d/library/model/manager/config/sql/CachedSqlSharedPreferencesStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n1216#3,2:146\n1246#3,4:148\n*S KotlinDebug\n*F\n+ 1 CachedSqlSharedPreferencesStorage.kt\ncom/planner5d/library/model/manager/config/sql/CachedSqlSharedPreferencesStorage\n*L\n42#1:146,2\n42#1:148,4\n*E\n"})
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s0 f190641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.sql.e f190642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q3<Map<String, com.planner5d.library.model.manager.config.sql.n>> f190643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Function1<kotlin.coroutines.d<? super Unit>, Object>> f190644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f190645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f190646f;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage$cache$1$1$1", f = "CachedSqlSharedPreferencesStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.k f190648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SQLiteBlobTooBigException f190650d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.planner5d.library.model.manager.k kVar, String str, SQLiteBlobTooBigException sQLiteBlobTooBigException, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f190648b = kVar;
            this.f190649c = str;
            this.f190650d = sQLiteBlobTooBigException;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f190648b, this.f190649c, this.f190650d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190647a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f190648b.f(new IllegalStateException("SQL record doesn't fit the cursor window: " + this.f190649c, this.f190650d));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage", f = "CachedSqlSharedPreferencesStorage.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "checkRecordExists", n = {"this", "name"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190653c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190655e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190653c = obj;
            this.f190655e |= Integer.MIN_VALUE;
            return c.this.e(null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.sql.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage", f = "CachedSqlSharedPreferencesStorage.kt", i = {0}, l = {96}, m = "deleteAllRecords", n = {"this"}, s = {"L$0"})
    static final class C1585c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f190657b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f190659d;

        C1585c(kotlin.coroutines.d<? super C1585c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190657b = obj;
            this.f190659d |= Integer.MIN_VALUE;
            return c.this.h(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage$deleteAllRecords$2$1", f = "CachedSqlSharedPreferencesStorage.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190660a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190660a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.sql.e eVar = c.this.f190642b;
                this.f190660a = 1;
                if (eVar.h(this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage$deleteAllRecordsBlocking$1$1", f = "CachedSqlSharedPreferencesStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190662a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190662a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c.this.f190642b.f();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage", f = "CachedSqlSharedPreferencesStorage.kt", i = {0, 0}, l = {113}, m = "deleteRecordWithName", n = {"this", "name"}, s = {"L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190666c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190668e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190666c = obj;
            this.f190668e |= Integer.MIN_VALUE;
            return c.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage$deleteRecordWithName$2$1", f = "CachedSqlSharedPreferencesStorage.kt", i = {}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190669a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190671c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.f190671c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new g(this.f190671c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190669a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.sql.e eVar = c.this.f190642b;
                String str = this.f190671c;
                this.f190669a = 1;
                if (eVar.c(str, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage$deleteRecordWithNameBlocking$1$1", f = "CachedSqlSharedPreferencesStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190672a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f190674c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, kotlin.coroutines.d<? super h> dVar) {
            super(1, dVar);
            this.f190674c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new h(this.f190674c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190672a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c.this.f190642b.b(this.f190674c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage$executePendingSqlActions$1", f = "CachedSqlSharedPreferencesStorage.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.f.b.H1, 138}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nCachedSqlSharedPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedSqlSharedPreferencesStorage.kt\ncom/planner5d/library/model/manager/config/sql/CachedSqlSharedPreferencesStorage$executePendingSqlActions$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n116#2,7:145\n124#2,2:155\n1#3:152\n1863#4,2:153\n*S KotlinDebug\n*F\n+ 1 CachedSqlSharedPreferencesStorage.kt\ncom/planner5d/library/model/manager/config/sql/CachedSqlSharedPreferencesStorage$executePendingSqlActions$1\n*L\n134#1:145,7\n134#1:155,2\n138#1:153,2\n*E\n"})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f190677c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new i(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0084 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001c, B:24:0x007d, B:26:0x0084, B:29:0x0099, B:19:0x005a, B:20:0x005f, B:22:0x0074, B:23:0x0075, B:33:0x00a2, B:34:0x00a3, B:21:0x0060), top: B:37:0x000c, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0098 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:24:0x007d->B:43:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.sync.a] */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            List list;
            Iterator it;
            ?? r10;
            Function1 function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190677c;
            ?? r11 = 1;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.sync.a aVar = c.this.f190646f;
                    cVar = c.this;
                    this.f190675a = aVar;
                    this.f190676b = cVar;
                    this.f190677c = 1;
                    if (aVar.h(null, this) != objL) {
                        r11 = aVar;
                    }
                    return objL;
                }
                if (i10 == 1) {
                    cVar = (c) this.f190676b;
                    kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) this.f190675a;
                    ResultKt.m(obj);
                    r11 = aVar2;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f190676b;
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f190675a;
                    ResultKt.m(obj);
                    r10 = aVar3;
                }
                while (it.hasNext()) {
                    function1 = (Function1) it.next();
                    this.f190675a = r10;
                    this.f190676b = it;
                    this.f190677c = 2;
                    if (function1.invoke(this) == objL) {
                        return objL;
                    }
                }
                Unit unit = Unit.f312394a;
                r10.i(null);
                return unit;
                synchronized (cVar.f190645e) {
                    list = CollectionsKt.toList(cVar.f190644d);
                    cVar.f190644d.clear();
                }
                it = list.iterator();
                r10 = r11;
                while (it.hasNext()) {
                    function1 = (Function1) it.next();
                    this.f190675a = r10;
                    this.f190676b = it;
                    this.f190677c = 2;
                    if (function1.invoke(this) == objL) {
                        return objL;
                    }
                }
                Unit unit2 = Unit.f312394a;
                r10.i(null);
                return unit2;
            } catch (Throwable th2) {
                r11.i(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage", f = "CachedSqlSharedPreferencesStorage.kt", i = {0, 0}, l = {50}, m = "insertRecord", n = {"this", "record"}, s = {"L$0", "L$1"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190681c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190683e;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190681c = obj;
            this.f190683e |= Integer.MIN_VALUE;
            int i10 = 5 << 0;
            return c.this.j(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage$insertRecord$2$1", f = "CachedSqlSharedPreferencesStorage.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190684a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190686c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d<? super k> dVar) {
            super(1, dVar);
            this.f190686c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new k(this.f190686c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f190684a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.sql.e eVar = c.this.f190642b;
                com.planner5d.library.model.manager.config.sql.n nVar = this.f190686c;
                this.f190684a = 1;
                if (eVar.j(nVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage$insertRecordBlocking$1$1", f = "CachedSqlSharedPreferencesStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190687a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190689c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d<? super l> dVar) {
            super(1, dVar);
            this.f190689c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new l(this.f190689c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190687a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c.this.f190642b.d(this.f190689c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage", f = "CachedSqlSharedPreferencesStorage.kt", i = {0}, l = {80}, m = "loadAllNames", n = {"this"}, s = {"L$0"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f190691b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f190693d;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190691b = obj;
            this.f190693d |= Integer.MIN_VALUE;
            return c.this.k(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.CachedSqlSharedPreferencesStorage", f = "CachedSqlSharedPreferencesStorage.kt", i = {0, 0}, l = {85}, m = "loadRecordByName", n = {"this", "name"}, s = {"L$0", "L$1"})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190696c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190698e;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190696c = obj;
            this.f190698e |= Integer.MIN_VALUE;
            return c.this.i(null, this);
        }
    }

    public c(@NotNull s0 coroutineScope, @NotNull com.planner5d.library.model.manager.config.sql.e dao, @NotNull final List<String> ignoredForInitialLoadingRecords, @NotNull final com.planner5d.library.model.manager.k crashReporter) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(ignoredForInitialLoadingRecords, "ignoredForInitialLoadingRecords");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f190641a = coroutineScope;
        this.f190642b = dao;
        this.f190643c = new q3<>(new Function0() { // from class: com.planner5d.library.model.manager.config.sql.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.s(this.f190638a, ignoredForInitialLoadingRecords, crashReporter);
            }
        });
        this.f190644d = new ArrayList();
        this.f190645e = new Object();
        this.f190646f = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map s(final c cVar, List list, final com.planner5d.library.model.manager.k kVar) {
        List<com.planner5d.library.model.manager.config.sql.n> listO = cVar.f190642b.o(list, new Function2() { // from class: com.planner5d.library.model.manager.config.sql.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return c.t(this.f190636a, kVar, (String) obj, (SQLiteBlobTooBigException) obj2);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listO, 10)), 16));
        for (com.planner5d.library.model.manager.config.sql.n nVar : listO) {
            linkedHashMap.put(nVar.a(), nVar);
        }
        return MapsKt.toMutableMap(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(c cVar, com.planner5d.library.model.manager.k kVar, String name, SQLiteBlobTooBigException exception) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(exception, "exception");
        int i10 = 6 | 0;
        kotlinx.coroutines.k.f(cVar.f190641a, com.planner5d.library.services.utility.s.f229729a.h(), null, new a(kVar, name, exception, null), 2, null);
        return Unit.f312394a;
    }

    private final void u() {
        kotlinx.coroutines.k.f(this.f190641a, com.planner5d.library.services.utility.s.f229729a.d(), null, new i(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(kotlin.coroutines.d<? super Map<String, com.planner5d.library.model.manager.config.sql.n>> dVar) {
        return this.f190643c.d(com.planner5d.library.services.utility.s.f229729a.d(), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.sql.o
    @m1
    @Nullable
    public com.planner5d.library.model.manager.config.sql.n a(@NotNull String name) {
        com.planner5d.library.model.manager.config.sql.n nVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, com.planner5d.library.model.manager.config.sql.n> mapB = this.f190643c.b();
        synchronized (this.f190645e) {
            try {
                nVar = mapB.get(name);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // com.planner5d.library.model.manager.config.sql.o
    @m1
    public void b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, com.planner5d.library.model.manager.config.sql.n> mapB = this.f190643c.b();
        synchronized (this.f190645e) {
            try {
                mapB.remove(name);
                this.f190644d.add(new h(name, null));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.planner5d.library.model.manager.config.sql.o
    @Nullable
    public Object c(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f190668e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f190668e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objV = fVar.f190666c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f190668e;
        if (i11 == 0) {
            ResultKt.m(objV);
            fVar.f190664a = this;
            fVar.f190665b = str;
            fVar.f190668e = 1;
            objV = v(fVar);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) fVar.f190665b;
            this = (c) fVar.f190664a;
            ResultKt.m(objV);
        }
        Map map = (Map) objV;
        synchronized (this.f190645e) {
            try {
                map.remove(str);
                this.f190644d.add(this.new g(str, null));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.sql.o
    @m1
    public void d(@NotNull com.planner5d.library.model.manager.config.sql.n record) {
        Intrinsics.checkNotNullParameter(record, "record");
        Map<String, com.planner5d.library.model.manager.config.sql.n> mapB = this.f190643c.b();
        synchronized (this.f190645e) {
            mapB.put(record.a(), record);
            this.f190644d.add(new l(record, null));
        }
        u();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.model.manager.config.sql.o
    @Nullable
    public Object e(@NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        boolean zContainsKey;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f190655e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f190655e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objV = bVar.f190653c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f190655e;
        if (i11 == 0) {
            ResultKt.m(objV);
            bVar.f190651a = this;
            bVar.f190652b = str;
            bVar.f190655e = 1;
            objV = v(bVar);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f190652b;
            this = (c) bVar.f190651a;
            ResultKt.m(objV);
        }
        Map map = (Map) objV;
        synchronized (this.f190645e) {
            try {
                zContainsKey = map.containsKey(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kotlin.coroutines.jvm.internal.b.a(zContainsKey);
    }

    @Override // com.planner5d.library.model.manager.config.sql.o
    @m1
    public void f() {
        Map<String, com.planner5d.library.model.manager.config.sql.n> mapB = this.f190643c.b();
        synchronized (this.f190645e) {
            try {
                mapB.clear();
                this.f190644d.add(new e(null));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.o
    @m1
    public boolean g(@NotNull String name) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, com.planner5d.library.model.manager.config.sql.n> mapB = this.f190643c.b();
        synchronized (this.f190645e) {
            try {
                zContainsKey = mapB.containsKey(name);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.planner5d.library.model.manager.config.sql.o
    @Nullable
    public Object h(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C1585c c1585c;
        if (dVar instanceof C1585c) {
            c1585c = (C1585c) dVar;
            int i10 = c1585c.f190659d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1585c.f190659d = i10 - Integer.MIN_VALUE;
            } else {
                c1585c = new C1585c(dVar);
            }
        } else {
            c1585c = new C1585c(dVar);
        }
        Object objV = c1585c.f190657b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1585c.f190659d;
        if (i11 == 0) {
            ResultKt.m(objV);
            c1585c.f190656a = this;
            c1585c.f190659d = 1;
            objV = v(c1585c);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (c) c1585c.f190656a;
            ResultKt.m(objV);
        }
        Map map = (Map) objV;
        synchronized (this.f190645e) {
            map.clear();
            this.f190644d.add(this.new d(null));
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.model.manager.config.sql.o
    @Nullable
    public Object i(@NotNull String str, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.sql.n> dVar) {
        n nVar;
        com.planner5d.library.model.manager.config.sql.n nVar2;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f190698e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f190698e = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object objV = nVar.f190696c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = nVar.f190698e;
        if (i11 == 0) {
            ResultKt.m(objV);
            nVar.f190694a = this;
            nVar.f190695b = str;
            nVar.f190698e = 1;
            objV = v(nVar);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) nVar.f190695b;
            this = (c) nVar.f190694a;
            ResultKt.m(objV);
        }
        Map map = (Map) objV;
        synchronized (this.f190645e) {
            try {
                nVar2 = (com.planner5d.library.model.manager.config.sql.n) map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.model.manager.config.sql.o
    @Nullable
    public Object j(@NotNull com.planner5d.library.model.manager.config.sql.n nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        j jVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f190683e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f190683e = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objV = jVar.f190681c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f190683e;
        if (i11 == 0) {
            ResultKt.m(objV);
            jVar.f190679a = this;
            jVar.f190680b = nVar;
            jVar.f190683e = 1;
            objV = v(jVar);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (com.planner5d.library.model.manager.config.sql.n) jVar.f190680b;
            this = (c) jVar.f190679a;
            ResultKt.m(objV);
        }
        Map map = (Map) objV;
        synchronized (this.f190645e) {
            try {
                map.put(nVar.a(), nVar);
                this.f190644d.add(this.new k(nVar, null));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.u();
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.model.manager.config.sql.o
    @Nullable
    public Object k(@NotNull kotlin.coroutines.d<? super List<String>> dVar) {
        m mVar;
        List list;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f190693d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f190693d = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object objV = mVar.f190691b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar.f190693d;
        if (i11 == 0) {
            ResultKt.m(objV);
            mVar.f190690a = this;
            mVar.f190693d = 1;
            objV = v(mVar);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (c) mVar.f190690a;
            ResultKt.m(objV);
        }
        Map map = (Map) objV;
        synchronized (this.f190645e) {
            list = CollectionsKt.toList(map.keySet());
        }
        return list;
    }
}
