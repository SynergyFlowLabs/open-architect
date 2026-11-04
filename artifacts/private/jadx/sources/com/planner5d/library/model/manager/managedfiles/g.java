package com.planner5d.library.model.manager.managedfiles;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.h3;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDatafileInitializationRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatafileInitializationRegistry.kt\ncom/planner5d/library/model/manager/managedfiles/DatafileInitializationRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f191985d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f191986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f191987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f191988c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileInitializationRegistry$setInitialized$1$1", f = "DatafileInitializationRegistry.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191989a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191989a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = g.this.f191986a;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.datafilesInitialized;
                String string = g.this.e().toString();
                this.f191989a = 1;
                if (pVar.d(rVar, string, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileInitializationRegistry$state$2$1", f = "DatafileInitializationRegistry.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191991a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191991a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVar = g.this.f191986a;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.datafilesInitialized;
            this.f191991a = 1;
            Object objU = pVar.u(rVar, "{}", this);
            return objU == objL ? objL : objU;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public g(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.config.p preferences) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f191986a = preferences;
        this.f191987b = h3.k(application);
        this.f191988c = g0.c(new Function0() { // from class: com.planner5d.library.model.manager.managedfiles.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.i(this.f191984a);
            }
        });
    }

    private final String d(com.planner5d.library.model.d dVar) {
        return this.f191987b + ":" + dVar.f180677a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final JSONObject e() {
        return (JSONObject) this.f191988c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject i(g gVar) {
        String str = (String) c0.t(c0.f225068a, null, true, gVar.new b(null), 1, null);
        if (str == null) {
            str = "{}";
        }
        return new JSONObject(str);
    }

    @m1
    public final boolean f(@NotNull com.planner5d.library.model.d datafile) {
        boolean zHas;
        Intrinsics.checkNotNullParameter(datafile, "datafile");
        synchronized (e()) {
            try {
                zHas = e().has(d(datafile));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zHas;
    }

    @m1
    public final boolean g(@NotNull com.planner5d.library.model.d datafile, @Nullable id.a aVar, boolean z10) {
        String string;
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(datafile, "datafile");
        synchronized (e()) {
            try {
                string = e().getString(d(datafile));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (string != null && string.length() != 0) {
            List listSplit$default = StringsKt.split$default(string, new String[]{";"}, false, 0, 6, null);
            Long lValueOf = ((CharSequence) listSplit$default.get(0)).length() == 0 ? null : Long.valueOf(Long.parseLong((String) listSplit$default.get(0)));
            if (listSplit$default.size() == 2) {
                boolValueOf = Boolean.valueOf(Integer.parseInt((String) listSplit$default.get(1)) == 1);
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.areEqual(lValueOf, aVar != null ? Long.valueOf(aVar.f287075a) : null) && boolValueOf != null && Intrinsics.areEqual(boolValueOf, Boolean.valueOf(z10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    public final void h(@NotNull com.planner5d.library.model.d datafile, @Nullable id.a aVar, boolean z10) {
        String string;
        Intrinsics.checkNotNullParameter(datafile, "datafile");
        synchronized (e()) {
            try {
                JSONObject jSONObjectE = e();
                String strD = d(datafile);
                if (aVar == null || (string = Long.valueOf(aVar.f287075a).toString()) == null) {
                    string = "";
                }
                jSONObjectE.put(strD, string + ";" + (z10 ? 1 : 0));
                boolean z11 = 4 ^ 0;
                c0.t(c0.f225068a, null, true, new a(null), 1, null);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
