package com.planner5d.library.model.manager.config.sql;

import android.app.Application;
import androidx.annotation.m1;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.q3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
@SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n*L\n1#1,302:1\n279#1,8:303\n279#1,8:311\n279#1,8:319\n279#1,8:327\n284#1,3:335\n284#1,3:338\n296#1:341\n296#1:343\n290#1,7:345\n290#1,7:353\n284#1,3:361\n296#1:364\n234#1,17:366\n238#1,13:383\n234#1,17:396\n234#1,17:413\n234#1,17:430\n238#1,13:447\n234#1,17:460\n254#1,10:477\n254#1,10:487\n254#1,10:497\n254#1,10:507\n254#1,10:517\n238#1,13:527\n284#1,3:542\n296#1:545\n1#2:342\n1#2:344\n1#2:352\n1#2:360\n1#2:365\n1#2:541\n1#2:546\n1#2:547\n158#3:540\n*S KotlinDebug\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n58#1:303,8\n68#1:311,8\n71#1:319,8\n74#1:327,8\n77#1:335,3\n82#1:338,3\n90#1:341\n97#1:343\n101#1:345,7\n105#1:353,7\n111#1:361,3\n115#1:364\n120#1:366,17\n130#1:383,13\n134#1:396,17\n138#1:413,17\n142#1:430,17\n146#1:447,13\n150#1:460,17\n165#1:477,10\n170#1:487,10\n180#1:497,10\n190#1:507,10\n195#1:517,10\n234#1:527,13\n279#1:542,3\n290#1:545\n90#1:342\n97#1:344\n101#1:352\n105#1:360\n115#1:365\n268#1:541\n290#1:546\n268#1:540\n*E\n"})
public final class l implements com.planner5d.library.model.manager.config.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q3<SqlSharedPreferencesDatabase> f190726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q3<com.planner5d.library.model.manager.config.sql.o> f190727b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {}, l = {214, 214}, m = "clear", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f190728a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f190730c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190728a = obj;
            this.f190730c |= Integer.MIN_VALUE;
            return l.this.c(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0}, l = {307, 312, 309, androidx.constraintlayout.core.motion.utils.v.a.f43974q}, m = "set", n = {"value$iv", "name$iv$iv"}, s = {"L$0", "L$2"})
    static final class a0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f190734d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f190736f;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190734d = obj;
            this.f190736f |= Integer.MIN_VALUE;
            return l.this.L(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0}, l = {200, 200}, m = "contains", n = {"keyName"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f190738b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f190740d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190738b = obj;
            this.f190740d |= Integer.MIN_VALUE;
            return l.this.J(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0}, l = {303, 308, 305, 312}, m = "set", n = {"keyName", "value$iv"}, s = {"L$0", "L$1"})
    static final class b0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f190744d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f190746f;

        b0(kotlin.coroutines.d<? super b0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190744d = obj;
            this.f190746f |= Integer.MIN_VALUE;
            return l.this.I(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$get$$inlined$loadAndParse$1", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$loadAndParse$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,285:1\n59#2,6:286\n*E\n"})
    public static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super JSONObject>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f190748b = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f190748b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190747a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                return new JSONObject(com.planner5d.library.services.serialization.a.f224952a.d(this.f190748b.b()));
            } catch (JSONException e10) {
                timber.log.b.f381052a.e(e10);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super JSONObject> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0, 0}, l = {307, 312, 309, androidx.constraintlayout.core.motion.utils.v.a.f43974q}, m = "set", n = {"this", "value", "name$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class c0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f190752d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f190754f;

        c0(kotlin.coroutines.d<? super c0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190752d = obj;
            this.f190754f |= Integer.MIN_VALUE;
            return l.this.A(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$get$$inlined$loadAndParse$2", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$loadAndParse$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,285:1\n68#2:286\n*E\n"})
    public static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Integer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190756b = nVar;
            this.f190757c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f190756b, dVar, this.f190757c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190755a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.f(this.f190757c.b(this.f190756b.b()));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Integer> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0}, l = {307, 312, 309, androidx.constraintlayout.core.motion.utils.v.a.f43974q}, m = "set", n = {"value", "name$iv$iv"}, s = {"L$0", "L$1"})
    static final class d0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f190760c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190762e;

        d0(kotlin.coroutines.d<? super d0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190760c = obj;
            this.f190762e |= Integer.MIN_VALUE;
            return l.this.j(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$get$$inlined$loadAndParse$3", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$loadAndParse$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,285:1\n71#2:286\n*E\n"})
    public static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190765c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190764b = nVar;
            this.f190765c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f190764b, dVar, this.f190765c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190763a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.g(this.f190765c.c(this.f190764b.b()));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0}, l = {303, 308, 305, 312}, m = "set", n = {"keyName", "value"}, s = {"L$0", "L$1"})
    static final class e0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f190769d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f190771f;

        e0(kotlin.coroutines.d<? super e0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190769d = obj;
            this.f190771f |= Integer.MIN_VALUE;
            return l.this.v(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$get$$inlined$loadAndParse$4", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$loadAndParse$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,285:1\n74#2:286\n*E\n"})
    public static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190774c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190773b = nVar;
            this.f190774c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f190773b, dVar, this.f190774c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190772a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f190774c.a(this.f190773b.b()));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0}, l = {307, 312, 309, androidx.constraintlayout.core.motion.utils.v.a.f43974q}, m = "set", n = {"value$iv", "name$iv$iv"}, s = {"L$0", "L$2"})
    static final class f0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f190778d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f190780f;

        f0(kotlin.coroutines.d<? super f0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190778d = obj;
            this.f190780f |= Integer.MIN_VALUE;
            return l.this.t(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$get$$inlined$loadAndParse$5", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$loadAndParse$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,285:1\n77#2:286\n*E\n"})
    public static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190782b = nVar;
            this.f190783c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f190782b, dVar, this.f190783c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190781a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f190783c.a(this.f190782b.b()));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0}, l = {307, 312, 309, androidx.constraintlayout.core.motion.utils.v.a.f43974q}, m = "set", n = {"value$iv", "name$iv$iv"}, s = {"L$0", "L$2"})
    static final class g0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f190787d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f190789f;

        g0(kotlin.coroutines.d<? super g0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190787d = obj;
            this.f190789f |= Integer.MIN_VALUE;
            return l.this.r(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0}, l = {308, 308, 309}, m = "get", n = {"name$iv$iv"}, s = {"L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f190791b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f190793d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190791b = obj;
            this.f190793d |= Integer.MIN_VALUE;
            return l.this.Q(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {308, 308, 309}, m = "get", n = {"defaultValue$iv", "name$iv$iv", "defaultValue", "defaultValue$iv", "defaultValue", "defaultValue$iv", "defaultValue"}, s = {"L$0", "L$2", "I$0", "L$0", "I$0", "L$0", "I$0"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f190797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f190798e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f190800g;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190798e = obj;
            this.f190800g |= Integer.MIN_VALUE;
            return l.this.p(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {308, 308, 309}, m = "get", n = {"defaultValue$iv", "name$iv$iv", "defaultValue", "defaultValue$iv", "defaultValue", "defaultValue$iv", "defaultValue"}, s = {"L$0", "L$2", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f190801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f190804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f190805e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f190807g;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190805e = obj;
            this.f190807g |= Integer.MIN_VALUE;
            return l.this.o(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {308, 308, 309}, m = "get", n = {"defaultValue$iv", "name$iv$iv", "defaultValue", "defaultValue$iv", "defaultValue", "defaultValue$iv", "defaultValue"}, s = {"L$0", "L$2", "Z$0", "L$0", "Z$0", "L$0", "Z$0"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f190808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f190811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f190812e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f190814g;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190812e = obj;
            this.f190814g |= Integer.MIN_VALUE;
            return l.this.G(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.sql.l$l, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {303, 303, 304}, m = "get", n = {"keyName", "defaultValue$iv", "defaultValue", "defaultValue$iv", "defaultValue", "defaultValue$iv", "defaultValue"}, s = {"L$0", "L$1", "Z$0", "L$0", "Z$0", "L$0", "Z$0"})
    static final class C1587l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f190818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f190819e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f190821g;

        C1587l(kotlin.coroutines.d<? super C1587l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190819e = obj;
            this.f190821g |= Integer.MIN_VALUE;
            return l.this.C(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {}, l = {me.relex.circleindicator.a.f332619e, me.relex.circleindicator.a.f332619e}, m = "getAllKeys", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f190822a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f190824c;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190822a = obj;
            this.f190824c |= Integer.MIN_VALUE;
            return l.this.z(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$getString$$inlined$loadAndParse$1", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$loadAndParse$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,285:1\n82#2:286\n*E\n"})
    public static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190827c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190826b = nVar;
            this.f190827c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new n(this.f190826b, dVar, this.f190827c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190825a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190827c.d(this.f190826b.b());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0, 1, 2}, l = {303, 303, 304}, m = "getString", n = {"keyName", "defaultValue", "defaultValue", "defaultValue"}, s = {"L$0", "L$1", "L$0", "L$0"})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f190831d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f190833f;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190831d = obj;
            this.f190833f |= Integer.MIN_VALUE;
            return l.this.n(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$getStringSet$$inlined$loadAndParse$1", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$loadAndParse$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,285:1\n111#2:286\n*E\n"})
    public static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Set<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f190836c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d dVar, l lVar) {
            super(2, dVar);
            this.f190835b = nVar;
            this.f190836c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new p(this.f190835b, dVar, this.f190836c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190834a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190836c.i0(this.f190835b.b());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Set<? extends String>> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager", f = "SqlSharedPreferencesManager.kt", i = {0, 0, 0, 1, 1, 2}, l = {303, 303, 304}, m = "getStringSet", n = {"this", "keyName", "defaultValue", "this", "defaultValue", "defaultValue"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f190837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f190838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f190839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f190840d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f190842f;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f190840d = obj;
            this.f190842f |= Integer.MIN_VALUE;
            return l.this.q(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$loadAndParse$3$1", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r<T> extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<byte[], T> f190844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.sql.n f190845c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(Function1<? super byte[], ? extends T> function1, com.planner5d.library.model.manager.config.sql.n nVar, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f190844b = function1;
            this.f190845c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new r(this.f190844b, this.f190845c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190843a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190844b.invoke(this.f190845c.b());
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.f190844b.invoke(this.f190845c.b());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((r) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$serializeAndSave$3$1", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, byte[]> f190847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f190848c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(Function1<? super T, byte[]> function1, T t10, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f190847b = function1;
            this.f190848c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new s(this.f190847b, this.f190848c, dVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190846a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190847b.invoke(this.f190848c);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend$$forInline(Object obj) {
            return this.f190847b.invoke(this.f190848c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((s) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$set$$inlined$serializeAndSave$1", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$serializeAndSave$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,243:1\n121#2:244\n*E\n"})
    public static final class t extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f190850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Object obj, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f190850b = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new t(this.f190850b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190849a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            JSONObject jSONObject = (JSONObject) this.f190850b;
            com.planner5d.library.services.serialization.a aVar = com.planner5d.library.services.serialization.a.f224952a;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return aVar.h(string);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((t) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$set$$inlined$serializeAndSave$2", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$serializeAndSave$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,243:1\n130#2:244\n*E\n"})
    public static final class u extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f190852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190853c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Object obj, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190852b = obj;
            this.f190853c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new u(this.f190852b, dVar, this.f190853c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190851a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190853c.h((String) this.f190852b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((u) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$set$$inlined$serializeAndSave$3", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$serializeAndSave$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,243:1\n134#2:244\n*E\n"})
    public static final class v extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f190855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190856c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Object obj, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190855b = obj;
            this.f190856c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new v(this.f190855b, dVar, this.f190856c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190854a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190856c.f(((Number) this.f190855b).intValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((v) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$set$$inlined$serializeAndSave$4", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$serializeAndSave$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,243:1\n138#2:244\n*E\n"})
    public static final class w extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f190858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190859c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Object obj, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190858b = obj;
            this.f190859c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new w(this.f190858b, dVar, this.f190859c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190857a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190859c.g(((Number) this.f190858b).longValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((w) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$set$$inlined$serializeAndSave$5", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$serializeAndSave$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,243:1\n142#2:244\n*E\n"})
    public static final class x extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f190861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190862c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Object obj, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190861b = obj;
            this.f190862c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new x(this.f190861b, dVar, this.f190862c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190860a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190862c.i(((Boolean) this.f190861b).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((x) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$set$$inlined$serializeAndSave$6", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$serializeAndSave$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,243:1\n146#2:244\n*E\n"})
    public static final class y extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f190864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.serialization.a f190865c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Object obj, kotlin.coroutines.d dVar, com.planner5d.library.services.serialization.a aVar) {
            super(2, dVar);
            this.f190864b = obj;
            this.f190865c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new y(this.f190864b, dVar, this.f190865c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190863a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190865c.i(((Boolean) this.f190864b).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((y) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.sql.SqlSharedPreferencesManager$set$$inlined$serializeAndSave$7", f = "SqlSharedPreferencesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSqlSharedPreferencesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager$serializeAndSave$3$1\n+ 2 SqlSharedPreferencesManager.kt\ncom/planner5d/library/model/manager/config/sql/SqlSharedPreferencesManager\n*L\n1#1,243:1\n150#2:244\n*E\n"})
    public static final class z extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f190866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f190867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f190868c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Object obj, kotlin.coroutines.d dVar, l lVar) {
            super(2, dVar);
            this.f190867b = obj;
            this.f190868c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new z(this.f190867b, dVar, this.f190868c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f190866a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f190868c.k0((Set) this.f190867b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super byte[]> dVar) {
            return ((z) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public l(@NotNull Function0<? extends SqlSharedPreferencesDatabase> databaseFactory, @NotNull final Function1<? super SqlSharedPreferencesDatabase, ? extends com.planner5d.library.model.manager.config.sql.o> storageFactory) {
        Intrinsics.checkNotNullParameter(databaseFactory, "databaseFactory");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        this.f190726a = new q3<>(databaseFactory);
        this.f190727b = new q3<>(new Function0() { // from class: com.planner5d.library.model.manager.config.sql.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.o0(storageFactory, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SqlSharedPreferencesDatabase W(Application application, com.planner5d.library.model.manager.config.xml.a aVar) {
        final SqlSharedPreferencesDatabase sqlSharedPreferencesDatabaseA = new SqlSharedPreferencesDatabase.a(application).a();
        new com.planner5d.library.model.manager.config.sql.u(aVar, new l(new Function0() { // from class: com.planner5d.library.model.manager.config.sql.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.X(sqlSharedPreferencesDatabaseA);
            }
        }, new Function1() { // from class: com.planner5d.library.model.manager.config.sql.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.Y((SqlSharedPreferencesDatabase) obj);
            }
        })).b();
        return sqlSharedPreferencesDatabaseA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SqlSharedPreferencesDatabase X(SqlSharedPreferencesDatabase sqlSharedPreferencesDatabase) {
        return sqlSharedPreferencesDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.model.manager.config.sql.o Y(SqlSharedPreferencesDatabase it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.model.manager.config.sql.o Z(f1 f1Var, com.planner5d.library.model.manager.k kVar, SqlSharedPreferencesDatabase it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new com.planner5d.library.model.manager.config.sql.c(f1Var, it.d(), CollectionsKt.listOf("materials_hash_json"), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d0(kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.sql.o> dVar) {
        return this.f190727b.d(com.planner5d.library.services.utility.s.f229729a.d(), dVar);
    }

    private final <T> Object e0(com.planner5d.library.services.r rVar, T t10, Function1<? super byte[], ? extends T> function1, kotlin.coroutines.d<? super T> dVar) {
        String str = rVar.f224891a;
        h0.e(0);
        Object objD0 = d0(dVar);
        h0.e(1);
        h0.e(0);
        Object objI = ((com.planner5d.library.model.manager.config.sql.o) objD0).i(str, dVar);
        h0.e(1);
        com.planner5d.library.model.manager.config.sql.n nVar = (com.planner5d.library.model.manager.config.sql.n) objI;
        if (nVar != null) {
            z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
            r rVar2 = new r(function1, nVar, null);
            h0.e(3);
            h0.e(0);
            Object objH = kotlinx.coroutines.i.h(z1VarD, rVar2, null);
            h0.e(1);
            if (objH != null) {
                return objH;
            }
        }
        return t10;
    }

    private final <T> Object f0(String str, T t10, Function1<? super byte[], ? extends T> function1, kotlin.coroutines.d<? super T> dVar) {
        h0.e(0);
        Object objD0 = d0(dVar);
        h0.e(1);
        h0.e(0);
        Object objI = ((com.planner5d.library.model.manager.config.sql.o) objD0).i(str, dVar);
        h0.e(1);
        com.planner5d.library.model.manager.config.sql.n nVar = (com.planner5d.library.model.manager.config.sql.n) objI;
        if (nVar != null) {
            z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
            r rVar = new r(function1, nVar, null);
            h0.e(3);
            h0.e(0);
            Object objH = kotlinx.coroutines.i.h(z1VarD, rVar, null);
            h0.e(1);
            if (objH != null) {
                return objH;
            }
        }
        return t10;
    }

    @m1
    private final <T> T g0(com.planner5d.library.services.r rVar, T t10, Function1<? super byte[], ? extends T> function1) {
        T tInvoke;
        com.planner5d.library.model.manager.config.sql.n nVarA = this.f190727b.b().a(rVar.f224891a);
        return (nVarA == null || (tInvoke = function1.invoke(nVarA.b())) == null) ? t10 : tInvoke;
    }

    @m1
    private final <T> T h0(String str, T t10, Function1<? super byte[], ? extends T> function1) {
        T tInvoke;
        com.planner5d.library.model.manager.config.sql.n nVarA = this.f190727b.b().a(str);
        return (nVarA == null || (tInvoke = function1.invoke(nVarA.b())) == null) ? t10 : tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final Set<String> i0(byte[] bArr) {
        try {
            JSONArray jSONArray = new JSONArray(com.planner5d.library.services.serialization.a.f224952a.d(bArr));
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList.add(obj.toString());
            }
            return CollectionsKt.toSet(arrayList);
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final byte[] k0(Set<String> set) {
        com.planner5d.library.services.serialization.a aVar = com.planner5d.library.services.serialization.a.f224952a;
        String string = new JSONArray((Collection) set).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return aVar.h(string);
    }

    private final <T> Object l0(com.planner5d.library.services.r rVar, T t10, Function1<? super T, byte[]> function1, kotlin.coroutines.d<? super Unit> dVar) {
        String str = rVar.f224891a;
        h0.e(0);
        Object objD0 = d0(dVar);
        h0.e(1);
        com.planner5d.library.model.manager.config.sql.o oVar = (com.planner5d.library.model.manager.config.sql.o) objD0;
        if (t10 != null) {
            z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
            s sVar = new s(function1, t10, null);
            h0.e(3);
            h0.e(0);
            Object objH = kotlinx.coroutines.i.h(z1VarD, sVar, null);
            h0.e(1);
            com.planner5d.library.model.manager.config.sql.n nVar = new com.planner5d.library.model.manager.config.sql.n(str, (byte[]) objH);
            h0.e(3);
            h0.e(0);
            oVar.j(nVar, null);
            h0.e(1);
        } else {
            h0.e(3);
            h0.e(0);
            oVar.c(str, null);
            h0.e(1);
        }
        return Unit.f312394a;
    }

    private final <T> Object m0(String str, T t10, Function1<? super T, byte[]> function1, kotlin.coroutines.d<? super Unit> dVar) {
        h0.e(0);
        Object objD0 = d0(dVar);
        h0.e(1);
        com.planner5d.library.model.manager.config.sql.o oVar = (com.planner5d.library.model.manager.config.sql.o) objD0;
        if (t10 != null) {
            z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
            s sVar = new s(function1, t10, null);
            h0.e(3);
            h0.e(0);
            Object objH = kotlinx.coroutines.i.h(z1VarD, sVar, null);
            h0.e(1);
            com.planner5d.library.model.manager.config.sql.n nVar = new com.planner5d.library.model.manager.config.sql.n(str, (byte[]) objH);
            h0.e(3);
            h0.e(0);
            oVar.j(nVar, null);
            h0.e(1);
        } else {
            h0.e(3);
            h0.e(0);
            oVar.c(str, null);
            h0.e(1);
        }
        return Unit.f312394a;
    }

    @m1
    private final <T> void n0(String str, T t10, Function1<? super T, byte[]> function1) {
        com.planner5d.library.model.manager.config.sql.o oVarB = this.f190727b.b();
        if (t10 != null) {
            oVarB.d(new com.planner5d.library.model.manager.config.sql.n(str, function1.invoke(t10)));
        } else {
            oVarB.b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.model.manager.config.sql.o o0(Function1 function1, l lVar) {
        return (com.planner5d.library.model.manager.config.sql.o) function1.invoke(lVar.f190726a.b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r10.j(r12, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        if (r13.c(r11, r0) == r1) goto L35;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(@org.jetbrains.annotations.NotNull com.planner5d.library.services.r r11, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.A(com.planner5d.library.services.r, java.util.Set, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void B(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.planner5d.library.services.serialization.a aVar = com.planner5d.library.services.serialization.a.f224952a;
        com.planner5d.library.model.manager.config.sql.o oVarB = this.f190727b.b();
        if (str != null) {
            oVarB.d(new com.planner5d.library.model.manager.config.sql.n(key, aVar.h(str)));
        } else {
            oVarB.b(key);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[PHI: r9 r11
      0x00d5: PHI (r9v9 boolean) = (r9v6 boolean), (r9v10 boolean) binds: [B:29:0x00b0, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r11v4 java.lang.Object) = (r11v3 java.lang.Object), (r11v5 java.lang.Object) binds: [B:29:0x00b0, B:36:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object C(@NotNull String str, boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        C1587l c1587l;
        Object objA;
        Object obj;
        com.planner5d.library.services.serialization.a aVar;
        com.planner5d.library.services.serialization.a aVar2;
        boolean z11;
        Object obj2;
        com.planner5d.library.model.manager.config.sql.n nVar;
        Object obj3;
        Boolean bool;
        if (dVar instanceof C1587l) {
            c1587l = (C1587l) dVar;
            int i10 = c1587l.f190821g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1587l.f190821g = i10 - Integer.MIN_VALUE;
            } else {
                c1587l = new C1587l(dVar);
            }
        } else {
            c1587l = new C1587l(dVar);
        }
        Object objH = c1587l.f190819e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1587l.f190821g;
        boolean zBooleanValue = true;
        if (i11 == 0) {
            ResultKt.m(objH);
            objA = kotlin.coroutines.jvm.internal.b.a(z10);
            com.planner5d.library.services.serialization.a aVar3 = com.planner5d.library.services.serialization.a.f224952a;
            c1587l.f190815a = str;
            c1587l.f190816b = objA;
            c1587l.f190817c = aVar3;
            c1587l.f190818d = z10;
            c1587l.f190821g = 1;
            Object objD0 = d0(c1587l);
            if (objD0 != objL) {
                obj = objD0;
                aVar = aVar3;
            }
            return objL;
        }
        if (i11 == 1) {
            z10 = c1587l.f190818d;
            aVar = (com.planner5d.library.services.serialization.a) c1587l.f190817c;
            Object obj4 = (Boolean) c1587l.f190816b;
            String str2 = (String) c1587l.f190815a;
            ResultKt.m(objH);
            objA = obj4;
            str = str2;
            obj = objH;
        } else {
            if (i11 == 2) {
                z11 = c1587l.f190818d;
                aVar2 = (com.planner5d.library.services.serialization.a) c1587l.f190816b;
                obj2 = (Boolean) c1587l.f190815a;
                ResultKt.m(objH);
                nVar = (com.planner5d.library.model.manager.config.sql.n) objH;
                if (nVar != null) {
                    z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                    g gVar = new g(nVar, null, aVar2);
                    c1587l.f190815a = obj2;
                    c1587l.f190816b = null;
                    c1587l.f190818d = z11;
                    c1587l.f190821g = 3;
                    objH = kotlinx.coroutines.i.h(z1VarD, gVar, c1587l);
                    if (objH != objL) {
                        obj3 = obj2;
                    }
                    return objL;
                }
                objH = obj2;
                bool = (Boolean) objH;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else if (!z11) {
                    zBooleanValue = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = c1587l.f190818d;
            obj3 = (Boolean) c1587l.f190815a;
            ResultKt.m(objH);
        }
        if (objH == null) {
            obj2 = obj3;
            objH = obj2;
        }
        bool = (Boolean) objH;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (!z11) {
            zBooleanValue = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        c1587l.f190815a = objA;
        c1587l.f190816b = aVar;
        c1587l.f190817c = null;
        c1587l.f190818d = z10;
        c1587l.f190821g = 2;
        Object objI = ((com.planner5d.library.model.manager.config.sql.o) obj).i(str, c1587l);
        if (objI != objL) {
            aVar2 = aVar;
            z11 = z10;
            obj2 = objA;
            objH = objI;
            nVar = (com.planner5d.library.model.manager.config.sql.n) objH;
            if (nVar != null) {
                z1 z1VarD2 = com.planner5d.library.services.utility.s.f229729a.d();
                g gVar2 = new g(nVar, null, aVar2);
                c1587l.f190815a = obj2;
                c1587l.f190816b = null;
                c1587l.f190818d = z11;
                c1587l.f190821g = 3;
                objH = kotlinx.coroutines.i.h(z1VarD2, gVar2, c1587l);
                if (objH != objL) {
                    obj3 = obj2;
                    if (objH == null) {
                        obj2 = obj3;
                        objH = obj2;
                    }
                }
            } else {
                objH = obj2;
            }
            bool = (Boolean) objH;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else if (!z11) {
                zBooleanValue = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        }
        return objL;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "getString()", imports = {}))
    @Nullable
    public String D(@NotNull String key, @Nullable String str) {
        String strD;
        Intrinsics.checkNotNullParameter(key, "key");
        com.planner5d.library.services.serialization.a aVar = com.planner5d.library.services.serialization.a.f224952a;
        com.planner5d.library.model.manager.config.sql.n nVarA = this.f190727b.b().a(key);
        if (nVarA != null && (strD = aVar.d(nVarA.b())) != null) {
            return strD;
        }
        return str;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @NotNull
    public com.planner5d.library.model.manager.config.q E() {
        return new com.planner5d.library.model.manager.config.sql.s(this);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "getStringSet()", imports = {}))
    @Nullable
    public Set<String> F(@NotNull String key, @Nullable Set<String> set) {
        Set<String> setI0;
        Intrinsics.checkNotNullParameter(key, "key");
        com.planner5d.library.model.manager.config.sql.n nVarA = this.f190727b.b().a(key);
        if (nVarA == null || (setI0 = i0(nVarA.b())) == null) {
            setI0 = set;
        }
        return setI0 == null ? set : setI0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[PHI: r9 r11
      0x00cd: PHI (r9v10 boolean) = (r9v7 boolean), (r9v11 boolean) binds: [B:27:0x00a9, B:33:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r11v4 java.lang.Object) = (r11v3 java.lang.Object), (r11v5 java.lang.Object) binds: [B:27:0x00a9, B:33:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object G(@NotNull com.planner5d.library.services.r rVar, boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        k kVar;
        Object objA;
        String str;
        com.planner5d.library.services.serialization.a aVar;
        boolean z11;
        Object obj;
        com.planner5d.library.model.manager.config.sql.n nVar;
        Object obj2;
        Boolean bool;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f190814g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f190814g = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object objI = kVar.f190812e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f190814g;
        boolean zBooleanValue = true;
        if (i11 == 0) {
            ResultKt.m(objI);
            objA = kotlin.coroutines.jvm.internal.b.a(z10);
            com.planner5d.library.services.serialization.a aVar2 = com.planner5d.library.services.serialization.a.f224952a;
            String str2 = rVar.f224891a;
            kVar.f190809b = objA;
            kVar.f190810c = aVar2;
            kVar.f190811d = str2;
            kVar.f190808a = z10;
            kVar.f190814g = 1;
            Object objD0 = d0(kVar);
            if (objD0 != objL) {
                objI = objD0;
                str = str2;
                aVar = aVar2;
            }
            return objL;
        }
        if (i11 == 1) {
            z10 = kVar.f190808a;
            str = (String) kVar.f190811d;
            aVar = (com.planner5d.library.services.serialization.a) kVar.f190810c;
            objA = (Boolean) kVar.f190809b;
            ResultKt.m(objI);
        } else {
            if (i11 == 2) {
                z11 = kVar.f190808a;
                aVar = (com.planner5d.library.services.serialization.a) kVar.f190810c;
                obj = (Boolean) kVar.f190809b;
                ResultKt.m(objI);
                nVar = (com.planner5d.library.model.manager.config.sql.n) objI;
                if (nVar != null) {
                    z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                    f fVar = new f(nVar, null, aVar);
                    kVar.f190809b = obj;
                    kVar.f190810c = null;
                    kVar.f190808a = z11;
                    kVar.f190814g = 3;
                    objI = kotlinx.coroutines.i.h(z1VarD, fVar, kVar);
                    if (objI != objL) {
                        obj2 = obj;
                    }
                    return objL;
                }
                objI = obj;
                bool = (Boolean) objI;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else if (!z11) {
                    zBooleanValue = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = kVar.f190808a;
            obj2 = (Boolean) kVar.f190809b;
            ResultKt.m(objI);
        }
        if (objI == null) {
            obj = obj2;
            objI = obj;
        }
        bool = (Boolean) objI;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (!z11) {
            zBooleanValue = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        kVar.f190809b = objA;
        kVar.f190810c = aVar;
        kVar.f190811d = null;
        kVar.f190808a = z10;
        kVar.f190814g = 2;
        objI = ((com.planner5d.library.model.manager.config.sql.o) objI).i(str, kVar);
        if (objI != objL) {
            z11 = z10;
            obj = objA;
            nVar = (com.planner5d.library.model.manager.config.sql.n) objI;
            if (nVar != null) {
                z1 z1VarD2 = com.planner5d.library.services.utility.s.f229729a.d();
                f fVar2 = new f(nVar, null, aVar);
                kVar.f190809b = obj;
                kVar.f190810c = null;
                kVar.f190808a = z11;
                kVar.f190814g = 3;
                objI = kotlinx.coroutines.i.h(z1VarD2, fVar2, kVar);
                if (objI != objL) {
                    obj2 = obj;
                    if (objI == null) {
                        obj = obj2;
                        objI = obj;
                    }
                }
            } else {
                objI = obj;
            }
            bool = (Boolean) objI;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else if (!z11) {
                zBooleanValue = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        }
        return objL;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    public void H(@NotNull com.planner5d.library.services.r key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        B(key.f224891a, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        if (r10.j(r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r13.c(r12, r0) == r1) goto L37;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(@org.jetbrains.annotations.NotNull java.lang.String r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.I(java.lang.String, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object J(@NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f190740d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f190740d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objD0 = bVar.f190738b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f190740d;
        if (i11 == 0) {
            ResultKt.m(objD0);
            bVar.f190737a = str;
            bVar.f190740d = 1;
            objD0 = d0(bVar);
            if (objD0 != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objD0);
            return objD0;
        }
        str = (String) bVar.f190737a;
        ResultKt.m(objD0);
        bVar.f190737a = null;
        bVar.f190740d = 2;
        Object objE = ((com.planner5d.library.model.manager.config.sql.o) objD0).e(str, bVar);
        return objE == objL ? objL : objE;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "clear()", imports = {}))
    public void K() {
        this.f190727b.b().f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r10.j(r12, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r10.c(r11, r0) == r1) goto L33;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(@org.jetbrains.annotations.NotNull com.planner5d.library.services.r r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.L(com.planner5d.library.services.r, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void M(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f190727b.b().d(new com.planner5d.library.model.manager.config.sql.n(key, com.planner5d.library.services.serialization.a.f224952a.i(z10)));
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "get()", imports = {}))
    public boolean N(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.planner5d.library.services.serialization.a aVar = com.planner5d.library.services.serialization.a.f224952a;
        com.planner5d.library.model.manager.config.sql.n nVarA = this.f190727b.b().a(key);
        return nVarA != null ? aVar.a(nVarA.b()) : z10;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void O(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f190727b.b().d(new com.planner5d.library.model.manager.config.sql.n(key, com.planner5d.library.services.serialization.a.f224952a.f(i10)));
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void P(@NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f190727b.b().d(new com.planner5d.library.model.manager.config.sql.n(key, com.planner5d.library.services.serialization.a.f224952a.g(j10)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r10 == r1) goto L29;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q(@org.jetbrains.annotations.NotNull com.planner5d.library.services.r r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super org.json.JSONObject> r10) {
        /*
            r8 = this;
            r7 = 5
            boolean r0 = r10 instanceof com.planner5d.library.model.manager.config.sql.l.h
            if (r0 == 0) goto L1a
            r0 = r10
            r0 = r10
            com.planner5d.library.model.manager.config.sql.l$h r0 = (com.planner5d.library.model.manager.config.sql.l.h) r0
            r7 = 0
            int r1 = r0.f190793d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 7
            r3 = r1 & r2
            r7 = 3
            if (r3 == 0) goto L1a
            r7 = 5
            int r1 = r1 - r2
            r0.f190793d = r1
            r7 = 2
            goto L21
        L1a:
            r7 = 4
            com.planner5d.library.model.manager.config.sql.l$h r0 = new com.planner5d.library.model.manager.config.sql.l$h
            r7 = 4
            r0.<init>(r10)
        L21:
            java.lang.Object r10 = r0.f190791b
            r7 = 3
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f190793d
            r3 = 3
            r7 = r7 | r3
            r4 = 2
            r7 = 1
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L48
            if (r2 != r3) goto L3d
            r7 = 3
            kotlin.ResultKt.m(r10)
            goto L92
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 6
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 7
            r8.<init>(r9)
            r7 = 1
            throw r8
        L48:
            kotlin.ResultKt.m(r10)
            goto L75
        L4c:
            java.lang.Object r8 = r0.f190790a
            java.lang.String r8 = (java.lang.String) r8
            r7 = 4
            kotlin.ResultKt.m(r10)
            goto L67
        L55:
            kotlin.ResultKt.m(r10)
            java.lang.String r9 = r9.f224891a
            r0.f190790a = r9
            r7 = 3
            r0.f190793d = r5
            java.lang.Object r10 = r8.d0(r0)
            if (r10 != r1) goto L66
            goto L90
        L66:
            r8 = r9
        L67:
            com.planner5d.library.model.manager.config.sql.o r10 = (com.planner5d.library.model.manager.config.sql.o) r10
            r0.f190790a = r6
            r0.f190793d = r4
            java.lang.Object r10 = r10.i(r8, r0)
            if (r10 != r1) goto L75
            r7 = 7
            goto L90
        L75:
            com.planner5d.library.model.manager.config.sql.n r10 = (com.planner5d.library.model.manager.config.sql.n) r10
            if (r10 == 0) goto L96
            com.planner5d.library.services.utility.s r8 = com.planner5d.library.services.utility.s.f229729a
            r7 = 1
            kotlinx.coroutines.z1 r8 = r8.d()
            r7 = 1
            com.planner5d.library.model.manager.config.sql.l$c r9 = new com.planner5d.library.model.manager.config.sql.l$c
            r7 = 2
            r9.<init>(r10, r6)
            r0.f190793d = r3
            r7 = 5
            java.lang.Object r10 = kotlinx.coroutines.i.h(r8, r9, r0)
            if (r10 != r1) goto L92
        L90:
            r7 = 0
            return r1
        L92:
            if (r10 != 0) goto L95
            goto L96
        L95:
            r6 = r10
        L96:
            r7 = 2
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            if (r6 != 0) goto La1
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            return r8
        La1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.Q(com.planner5d.library.services.r, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = J("", dVar);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "remove()", imports = {}))
    public void b(@NotNull com.planner5d.library.services.r key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f190727b.b().b(key.f224891a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (((com.planner5d.library.model.manager.config.sql.o) r7).h(r0) == r1) goto L21;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.planner5d.library.model.manager.config.sql.l.a
            r5 = 2
            if (r0 == 0) goto L1a
            r0 = r7
            r0 = r7
            r5 = 0
            com.planner5d.library.model.manager.config.sql.l$a r0 = (com.planner5d.library.model.manager.config.sql.l.a) r0
            int r1 = r0.f190730c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            r3 = r1 & r2
            r5 = 1
            if (r3 == 0) goto L1a
            r5 = 3
            int r1 = r1 - r2
            r5 = 6
            r0.f190730c = r1
            goto L20
        L1a:
            com.planner5d.library.model.manager.config.sql.l$a r0 = new com.planner5d.library.model.manager.config.sql.l$a
            r5 = 5
            r0.<init>(r7)
        L20:
            r5 = 4
            java.lang.Object r7 = r0.f190728a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f190730c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L41
            if (r2 != r3) goto L36
            r5 = 1
            kotlin.ResultKt.m(r7)
            goto L5f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "  envniprmua/ o  ksetc bute/l/ooeo/elw/r/ohe/ci/tir"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 4
            throw r6
        L41:
            kotlin.ResultKt.m(r7)
            goto L53
        L45:
            kotlin.ResultKt.m(r7)
            r0.f190730c = r4
            java.lang.Object r7 = r6.d0(r0)
            r5 = 7
            if (r7 != r1) goto L53
            r5 = 2
            goto L5e
        L53:
            r5 = 0
            com.planner5d.library.model.manager.config.sql.o r7 = (com.planner5d.library.model.manager.config.sql.o) r7
            r0.f190730c = r3
            java.lang.Object r6 = r7.h(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            r5 = 2
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.c(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object d(@NotNull com.planner5d.library.services.r rVar, @Nullable String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objV = v(rVar.f224891a, str, dVar);
        return objV == kotlin.coroutines.intrinsics.b.l() ? objV : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void e(@NotNull String key, @NotNull Set<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f190727b.b().d(new com.planner5d.library.model.manager.config.sql.n(key, k0(value)));
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    public void f(@NotNull com.planner5d.library.services.r key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        M(key.f224891a, z10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    public void g(@NotNull com.planner5d.library.services.r key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        O(key.f224891a, i10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    public void h(@NotNull com.planner5d.library.services.r key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        P(key.f224891a, j10);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object i(@NotNull com.planner5d.library.services.r rVar, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Set<String>> dVar) {
        return q(rVar.f224891a, set, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r9.j(r11, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r9.c(r10, r0) == r1) goto L33;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(@org.jetbrains.annotations.NotNull com.planner5d.library.services.r r10, @org.jetbrains.annotations.NotNull org.json.JSONObject r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.j(com.planner5d.library.services.r, org.json.JSONObject, kotlin.coroutines.d):java.lang.Object");
    }

    @m1
    public final void j0(@NotNull Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f190726a.b().runInTransaction(body);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    public long k(@NotNull com.planner5d.library.services.r key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.planner5d.library.services.serialization.a aVar = com.planner5d.library.services.serialization.a.f224952a;
        com.planner5d.library.model.manager.config.sql.n nVarA = this.f190727b.b().a(key.f224891a);
        return nVarA != null ? aVar.c(nVarA.b()) : j10;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    public int l(@NotNull com.planner5d.library.services.r key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.planner5d.library.services.serialization.a aVar = com.planner5d.library.services.serialization.a.f224952a;
        com.planner5d.library.model.manager.config.sql.n nVarA = this.f190727b.b().a(key.f224891a);
        return nVarA != null ? aVar.b(nVarA.b()) : i10;
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    public boolean m(@NotNull com.planner5d.library.services.r key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return N(key.f224891a, z10);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object n(@NotNull String str, @Nullable String str2, @NotNull kotlin.coroutines.d<? super String> dVar) {
        o oVar;
        com.planner5d.library.services.serialization.a aVar;
        String str3;
        com.planner5d.library.model.manager.config.sql.n nVar;
        String str4;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f190833f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f190833f = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object objI = oVar.f190831d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f190833f;
        if (i11 == 0) {
            ResultKt.m(objI);
            com.planner5d.library.services.serialization.a aVar2 = com.planner5d.library.services.serialization.a.f224952a;
            oVar.f190828a = str;
            oVar.f190829b = str2;
            oVar.f190830c = aVar2;
            oVar.f190833f = 1;
            Object objD0 = d0(oVar);
            if (objD0 != objL) {
                objI = objD0;
                aVar = aVar2;
            }
            return objL;
        }
        if (i11 == 1) {
            aVar = (com.planner5d.library.services.serialization.a) oVar.f190830c;
            str2 = (String) oVar.f190829b;
            str = (String) oVar.f190828a;
            ResultKt.m(objI);
        } else {
            if (i11 == 2) {
                aVar = (com.planner5d.library.services.serialization.a) oVar.f190829b;
                str3 = (String) oVar.f190828a;
                ResultKt.m(objI);
                nVar = (com.planner5d.library.model.manager.config.sql.n) objI;
                if (nVar != null) {
                    return str3;
                }
                z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                n nVar2 = new n(nVar, null, aVar);
                oVar.f190828a = str3;
                oVar.f190829b = null;
                oVar.f190833f = 3;
                objI = kotlinx.coroutines.i.h(z1VarD, nVar2, oVar);
                if (objI != objL) {
                    str4 = str3;
                }
                return objL;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) oVar.f190828a;
            ResultKt.m(objI);
        }
        if (objI == null) {
            return str4;
        }
        return objI;
        oVar.f190828a = str2;
        oVar.f190829b = aVar;
        oVar.f190830c = null;
        oVar.f190833f = 2;
        objI = ((com.planner5d.library.model.manager.config.sql.o) objI).i(str, oVar);
        if (objI != objL) {
            str3 = str2;
            nVar = (com.planner5d.library.model.manager.config.sql.n) objI;
            if (nVar != null) {
                return str3;
            }
            z1 z1VarD2 = com.planner5d.library.services.utility.s.f229729a.d();
            n nVar3 = new n(nVar, null, aVar);
            oVar.f190828a = str3;
            oVar.f190829b = null;
            oVar.f190833f = 3;
            objI = kotlinx.coroutines.i.h(z1VarD2, nVar3, oVar);
            if (objI != objL) {
                str4 = str3;
                if (objI == null) {
                    return str4;
                }
                return objI;
            }
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da A[PHI: r10 r13
      0x00da: PHI (r10v11 long) = (r10v6 long), (r10v12 long) binds: [B:28:0x00b5, B:35:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r13v3 java.lang.Object) = (r13v2 java.lang.Object), (r13v4 java.lang.Object) binds: [B:28:0x00b5, B:35:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object o(@NotNull com.planner5d.library.services.r rVar, long j10, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        j jVar;
        Object objG;
        Object obj;
        String str;
        long j11;
        com.planner5d.library.services.serialization.a aVar;
        long jLongValue;
        Object obj2;
        com.planner5d.library.model.manager.config.sql.n nVar;
        Object obj3;
        Long l10;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f190807g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f190807g = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objH = jVar.f190805e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f190807g;
        int i12 = 7 & 2 & 0;
        if (i11 == 0) {
            ResultKt.m(objH);
            objG = kotlin.coroutines.jvm.internal.b.g(j10);
            com.planner5d.library.services.serialization.a aVar2 = com.planner5d.library.services.serialization.a.f224952a;
            String str2 = rVar.f224891a;
            jVar.f190802b = objG;
            jVar.f190803c = aVar2;
            jVar.f190804d = str2;
            jVar.f190801a = j10;
            jVar.f190807g = 1;
            Object objD0 = d0(jVar);
            if (objD0 != objL) {
                obj = objD0;
                str = str2;
                j11 = j10;
                aVar = aVar2;
            }
            return objL;
        }
        if (i11 == 1) {
            long j12 = jVar.f190801a;
            str = (String) jVar.f190804d;
            com.planner5d.library.services.serialization.a aVar3 = (com.planner5d.library.services.serialization.a) jVar.f190803c;
            objG = (Long) jVar.f190802b;
            ResultKt.m(objH);
            j11 = j12;
            aVar = aVar3;
            obj = objH;
        } else {
            if (i11 == 2) {
                jLongValue = jVar.f190801a;
                aVar = (com.planner5d.library.services.serialization.a) jVar.f190803c;
                obj2 = (Long) jVar.f190802b;
                ResultKt.m(objH);
                nVar = (com.planner5d.library.model.manager.config.sql.n) objH;
                if (nVar != null) {
                    z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                    e eVar = new e(nVar, null, aVar);
                    jVar.f190802b = obj2;
                    jVar.f190803c = null;
                    jVar.f190801a = jLongValue;
                    jVar.f190807g = 3;
                    objH = kotlinx.coroutines.i.h(z1VarD, eVar, jVar);
                    if (objH != objL) {
                        obj3 = obj2;
                    }
                    return objL;
                }
                objH = obj2;
                l10 = (Long) objH;
                if (l10 != null) {
                    jLongValue = l10.longValue();
                }
                return kotlin.coroutines.jvm.internal.b.g(jLongValue);
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jLongValue = jVar.f190801a;
            obj3 = (Long) jVar.f190802b;
            ResultKt.m(objH);
        }
        if (objH == null) {
            obj2 = obj3;
            objH = obj2;
        }
        l10 = (Long) objH;
        if (l10 != null) {
            jLongValue = l10.longValue();
        }
        return kotlin.coroutines.jvm.internal.b.g(jLongValue);
        long j13 = j11;
        jVar.f190802b = objG;
        jVar.f190803c = aVar;
        jVar.f190804d = null;
        jVar.f190801a = j13;
        jVar.f190807g = 2;
        Object objI = ((com.planner5d.library.model.manager.config.sql.o) obj).i(str, jVar);
        if (objI != objL) {
            objH = objI;
            jLongValue = j13;
            obj2 = objG;
            nVar = (com.planner5d.library.model.manager.config.sql.n) objH;
            if (nVar != null) {
                z1 z1VarD2 = com.planner5d.library.services.utility.s.f229729a.d();
                e eVar2 = new e(nVar, null, aVar);
                jVar.f190802b = obj2;
                jVar.f190803c = null;
                jVar.f190801a = jLongValue;
                jVar.f190807g = 3;
                objH = kotlinx.coroutines.i.h(z1VarD2, eVar2, jVar);
                if (objH != objL) {
                    obj3 = obj2;
                    if (objH == null) {
                        obj2 = obj3;
                        objH = obj2;
                    }
                }
            } else {
                objH = obj2;
            }
            l10 = (Long) objH;
            if (l10 != null) {
                jLongValue = l10.longValue();
            }
            return kotlin.coroutines.jvm.internal.b.g(jLongValue);
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3 A[PHI: r9 r11
      0x00d3: PHI (r9v10 int) = (r9v5 int), (r9v11 int) binds: [B:28:0x00ae, B:35:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r11v4 java.lang.Object) = (r11v3 java.lang.Object), (r11v6 java.lang.Object) binds: [B:28:0x00ae, B:35:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object p(@NotNull com.planner5d.library.services.r rVar, int i10, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        i iVar;
        Object objF;
        String str;
        com.planner5d.library.services.serialization.a aVar;
        int iIntValue;
        Object obj;
        com.planner5d.library.model.manager.config.sql.n nVar;
        Object obj2;
        Integer num;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i11 = iVar.f190800g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f190800g = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objI = iVar.f190798e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = iVar.f190800g;
        int i13 = 5 ^ 1;
        if (i12 == 0) {
            ResultKt.m(objI);
            objF = kotlin.coroutines.jvm.internal.b.f(i10);
            com.planner5d.library.services.serialization.a aVar2 = com.planner5d.library.services.serialization.a.f224952a;
            String str2 = rVar.f224891a;
            iVar.f190795b = objF;
            iVar.f190796c = aVar2;
            iVar.f190797d = str2;
            iVar.f190794a = i10;
            iVar.f190800g = 1;
            Object objD0 = d0(iVar);
            if (objD0 != objL) {
                objI = objD0;
                str = str2;
                aVar = aVar2;
            }
            return objL;
        }
        if (i12 == 1) {
            i10 = iVar.f190794a;
            str = (String) iVar.f190797d;
            aVar = (com.planner5d.library.services.serialization.a) iVar.f190796c;
            objF = (Integer) iVar.f190795b;
            ResultKt.m(objI);
        } else {
            if (i12 == 2) {
                iIntValue = iVar.f190794a;
                aVar = (com.planner5d.library.services.serialization.a) iVar.f190796c;
                obj = (Integer) iVar.f190795b;
                ResultKt.m(objI);
                nVar = (com.planner5d.library.model.manager.config.sql.n) objI;
                if (nVar != null) {
                    z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                    d dVar2 = new d(nVar, null, aVar);
                    iVar.f190795b = obj;
                    iVar.f190796c = null;
                    iVar.f190794a = iIntValue;
                    iVar.f190800g = 3;
                    objI = kotlinx.coroutines.i.h(z1VarD, dVar2, iVar);
                    if (objI != objL) {
                        obj2 = obj;
                    }
                    return objL;
                }
                objI = obj;
                num = (Integer) objI;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                return kotlin.coroutines.jvm.internal.b.f(iIntValue);
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iIntValue = iVar.f190794a;
            obj2 = (Integer) iVar.f190795b;
            ResultKt.m(objI);
        }
        if (objI == null) {
            obj = obj2;
            objI = obj;
        }
        num = (Integer) objI;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return kotlin.coroutines.jvm.internal.b.f(iIntValue);
        iVar.f190795b = objF;
        iVar.f190796c = aVar;
        iVar.f190797d = null;
        iVar.f190794a = i10;
        iVar.f190800g = 2;
        objI = ((com.planner5d.library.model.manager.config.sql.o) objI).i(str, iVar);
        if (objI != objL) {
            iIntValue = i10;
            obj = objF;
            nVar = (com.planner5d.library.model.manager.config.sql.n) objI;
            if (nVar != null) {
                z1 z1VarD2 = com.planner5d.library.services.utility.s.f229729a.d();
                d dVar3 = new d(nVar, null, aVar);
                iVar.f190795b = obj;
                iVar.f190796c = null;
                iVar.f190794a = iIntValue;
                iVar.f190800g = 3;
                objI = kotlinx.coroutines.i.h(z1VarD2, dVar3, iVar);
                if (objI != objL) {
                    obj2 = obj;
                    if (objI == null) {
                        obj = obj2;
                        objI = obj;
                    }
                }
            } else {
                objI = obj;
            }
            num = (Integer) objI;
            if (num != null) {
                iIntValue = num.intValue();
            }
            return kotlin.coroutines.jvm.internal.b.f(iIntValue);
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af A[PHI: r8
      0x00af: PHI (r8v6 java.util.Set<java.lang.String>) = (r8v4 java.util.Set<java.lang.String>), (r8v7 java.util.Set<java.lang.String>) binds: [B:27:0x0090, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r11 == r1) goto L30;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.Set<java.lang.String>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.planner5d.library.model.manager.config.sql.l.q
            if (r0 == 0) goto L16
            r0 = r11
            r0 = r11
            com.planner5d.library.model.manager.config.sql.l$q r0 = (com.planner5d.library.model.manager.config.sql.l.q) r0
            int r1 = r0.f190842f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r7 = 0
            r0.f190842f = r1
            r7 = 4
            goto L1b
        L16:
            com.planner5d.library.model.manager.config.sql.l$q r0 = new com.planner5d.library.model.manager.config.sql.l$q
            r0.<init>(r11)
        L1b:
            java.lang.Object r11 = r0.f190840d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f190842f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = r6
            if (r2 == 0) goto L64
            if (r2 == r5) goto L51
            r7 = 0
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.f190837a
            r7 = 1
            java.util.Set r8 = (java.util.Set) r8
            r7 = 4
            kotlin.ResultKt.m(r11)
            goto Lad
        L3b:
            r7 = 7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            java.lang.Object r8 = r0.f190838b
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r9 = r0.f190837a
            com.planner5d.library.model.manager.config.sql.l r9 = (com.planner5d.library.model.manager.config.sql.l) r9
            kotlin.ResultKt.m(r11)
            r7 = 2
            goto L8d
        L51:
            java.lang.Object r8 = r0.f190839c
            r10 = r8
            r10 = r8
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r8 = r0.f190838b
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.f190837a
            com.planner5d.library.model.manager.config.sql.l r8 = (com.planner5d.library.model.manager.config.sql.l) r8
            kotlin.ResultKt.m(r11)
            goto L79
        L64:
            r7 = 6
            kotlin.ResultKt.m(r11)
            r0.f190837a = r8
            r0.f190838b = r9
            r7 = 5
            r0.f190839c = r10
            r0.f190842f = r5
            r7 = 7
            java.lang.Object r11 = r8.d0(r0)
            if (r11 != r1) goto L79
            goto Lab
        L79:
            com.planner5d.library.model.manager.config.sql.o r11 = (com.planner5d.library.model.manager.config.sql.o) r11
            r0.f190837a = r8
            r0.f190838b = r10
            r0.f190839c = r6
            r0.f190842f = r4
            java.lang.Object r11 = r11.i(r9, r0)
            if (r11 != r1) goto L8a
            goto Lab
        L8a:
            r9 = r8
            r8 = r10
            r8 = r10
        L8d:
            r7 = 2
            com.planner5d.library.model.manager.config.sql.n r11 = (com.planner5d.library.model.manager.config.sql.n) r11
            if (r11 == 0) goto Laf
            com.planner5d.library.services.utility.s r10 = com.planner5d.library.services.utility.s.f229729a
            kotlinx.coroutines.z1 r10 = r10.d()
            r7 = 2
            com.planner5d.library.model.manager.config.sql.l$p r2 = new com.planner5d.library.model.manager.config.sql.l$p
            r2.<init>(r11, r6, r9)
            r7 = 1
            r0.f190837a = r8
            r0.f190838b = r6
            r0.f190842f = r3
            java.lang.Object r11 = kotlinx.coroutines.i.h(r10, r2, r0)
            if (r11 != r1) goto Lad
        Lab:
            r7 = 4
            return r1
        Lad:
            if (r11 != 0) goto Lb0
        Laf:
            r11 = r8
        Lb0:
            r7 = 1
            java.util.Set r11 = (java.util.Set) r11
            r7 = 4
            if (r11 != 0) goto Lb8
            r7 = 4
            return r8
        Lb8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.q(java.lang.String, java.util.Set, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (r9.c(r10, r0) == r1) goto L34;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(@org.jetbrains.annotations.NotNull com.planner5d.library.services.r r10, long r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.r(com.planner5d.library.services.r, long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "contains()", imports = {}))
    public boolean s(@NotNull com.planner5d.library.services.r key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return x(key.f224891a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        if (r10.j(r12, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r10.c(r11, r0) == r1) goto L33;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(@org.jetbrains.annotations.NotNull com.planner5d.library.services.r r11, int r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.t(com.planner5d.library.services.r, int, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object u(@NotNull com.planner5d.library.services.r rVar, @Nullable String str, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return n(rVar.f224891a, str, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r10.j(r12, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        if (r13.c(r11, r0) == r1) goto L35;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.v(java.lang.String, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "getString()", imports = {}))
    @Nullable
    public String w(@NotNull com.planner5d.library.services.r key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return D(key.f224891a, str);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "contains()", imports = {}))
    public boolean x(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f190727b.b().g(key);
    }

    @Override // com.planner5d.library.model.manager.config.p
    @Nullable
    public Object y(@NotNull com.planner5d.library.services.r rVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return J(rVar.f224891a, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r7 == r1) goto L22;
     */
    @Override // com.planner5d.library.model.manager.config.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.Set<java.lang.String>> r7) {
        /*
            r6 = this;
            r5 = 7
            boolean r0 = r7 instanceof com.planner5d.library.model.manager.config.sql.l.m
            r5 = 7
            if (r0 == 0) goto L19
            r0 = r7
            r5 = 7
            com.planner5d.library.model.manager.config.sql.l$m r0 = (com.planner5d.library.model.manager.config.sql.l.m) r0
            r5 = 1
            int r1 = r0.f190824c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r5 = 2
            if (r3 == 0) goto L19
            r5 = 5
            int r1 = r1 - r2
            r0.f190824c = r1
            goto L1f
        L19:
            r5 = 7
            com.planner5d.library.model.manager.config.sql.l$m r0 = new com.planner5d.library.model.manager.config.sql.l$m
            r0.<init>(r7)
        L1f:
            java.lang.Object r7 = r0.f190822a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f190824c
            r5 = 1
            r3 = 2
            r5 = 5
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3f
            r5 = 1
            if (r2 != r3) goto L36
            kotlin.ResultKt.m(r7)
            goto L5f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 5
            throw r6
        L3f:
            kotlin.ResultKt.m(r7)
            r5 = 7
            goto L51
        L44:
            kotlin.ResultKt.m(r7)
            r0.f190824c = r4
            java.lang.Object r7 = r6.d0(r0)
            r5 = 3
            if (r7 != r1) goto L51
            goto L5d
        L51:
            r5 = 1
            com.planner5d.library.model.manager.config.sql.o r7 = (com.planner5d.library.model.manager.config.sql.o) r7
            r0.f190824c = r3
            r5 = 4
            java.lang.Object r7 = r7.k(r0)
            if (r7 != r1) goto L5f
        L5d:
            r5 = 1
            return r1
        L5f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r6 = kotlin.collections.CollectionsKt.toSet(r7)
            r5 = 6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.sql.l.z(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ij.a
    public l(@NotNull final Application application, @NotNull final com.planner5d.library.model.manager.config.xml.a xmlSharedPreferencesManager, @NotNull final f1 coroutineScope, @NotNull final com.planner5d.library.model.manager.k crashReporter) {
        this(new Function0() { // from class: com.planner5d.library.model.manager.config.sql.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.W(application, xmlSharedPreferencesManager);
            }
        }, new Function1() { // from class: com.planner5d.library.model.manager.config.sql.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.Z(coroutineScope, crashReporter, (SqlSharedPreferencesDatabase) obj);
            }
        });
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(xmlSharedPreferencesManager, "xmlSharedPreferencesManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
    }
}
